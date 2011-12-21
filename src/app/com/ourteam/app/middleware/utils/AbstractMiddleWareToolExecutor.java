package com.ourteam.app.middleware.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.service.SpringContextAgent;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.eclipse.swt.widgets.Shell;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.hr.domain.EmployeeBean;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;
import com.ourteam.middleware.domain.MiddleWareToolInputBean;
import com.ourteam.middleware.domain.MiddleWareToolInputLogBean;
import com.ourteam.middleware.domain.MiddleWareToolLogBean;

public abstract class AbstractMiddleWareToolExecutor implements
		IMiddleWareToolExecutor {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractMiddleWareToolExecutor.class);

	private static final VelocityEngine VELOCITY_ENGINE = SpringContextAgent
			.getBean(VelocityEngine.class);

	private List<IMiddleWareExecuteListener> executeListeners = new ArrayList<IMiddleWareExecuteListener>();

	private Map<String, Object> inputMap = new HashMap<String, Object>();

	private String loginId;

	private String loginPassword;

	private String host;

	private int port;

	private Shell shell;

	private File outputFile;

	@Override
	public void addMiddleWareExecuteListener(
			IMiddleWareExecuteListener executeListener) {
		if (executeListeners.contains(executeListener) == false) {
			executeListeners.add(executeListener);
		}

	}

	@Override
	public void removeMiddleWareExecuteListener(
			IMiddleWareExecuteListener executeListener) {
		executeListeners.remove(executeListener);

	}

	@Override
	public List<IMiddleWareExecuteListener> getMiddleWareExecuteListeners() {
		return executeListeners;
	}

	@Override
	public void setExecuteInput(Map<String, Object> inputMap) {
		this.inputMap.putAll(inputMap);
	}

	@Override
	public void execute(long middleWareId, long middleWareToolId,
			EmployeeBean executor) throws Exception {

		MiddleWareBean middleWareBean = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareById(middleWareId);

		MiddleWareToolBean toolBean = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolById(middleWareToolId);

		MiddleWareToolInputBean[] toolInputBeans = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolInputs(middleWareToolId);

		final MiddleWareToolInputLogBean[] inputLogBeans = new MiddleWareToolInputLogBean[toolInputBeans.length];

		for (int i = 0; i < inputLogBeans.length; i++) {
			inputLogBeans[i] = new MiddleWareToolInputLogBean();
			inputLogBeans[i].setToolInputId(toolInputBeans[i].getId());
			if (inputMap.containsKey(toolInputBeans[i].getParameterCode())) {
				inputLogBeans[i].setToolInputValue(MapUtils.getString(inputMap,
						toolInputBeans[i].getParameterCode()));
			}
		}

		inputMap.put("serverInfo", middleWareBean);

		inputMap.put("timestamp",
				DateFormatUtils.format(new Date(), "yyyyMMddHHmmss"));

		inputMap.put("executor", executor);

		if (StringUtils.isNotBlank(toolBean.getOutputFile())) {
			String fileName = toolBean.getOutputFile()
					+ System.currentTimeMillis();
			outputFile = new File(FileUtils.getTempDirectory(), fileName);

			if (outputFile.exists() == false) {
				outputFile.createNewFile();
			}

			inputMap.put("outputFilePath", outputFile.getPath());
		}

		final StringWriter writer = new StringWriter();

		VELOCITY_ENGINE.evaluate(new VelocityContext(inputMap), writer,
				toolBean.getToolName(), toolBean.getToolScript());

		final MiddleWareToolLogBean toolLogBean = new MiddleWareToolLogBean();

		toolLogBean.setToolId(middleWareToolId);

		toolLogBean.setMiddleWareId(middleWareId);

		toolLogBean.setExecuteScript(writer.toString());

		toolLogBean.setExecuteStartTime(new Date());

		toolLogBean.setExecutorId(executor.getId());

		final StringBuffer executeLog = new StringBuffer();

		final IMiddleWareExecuteListener executeListener = new IMiddleWareExecuteListener() {

			@Override
			public void readOutputLine(String outputLine) {
				executeLog.append(outputLine).append("\r\n");
			}

		};

		executeListeners.add(executeListener);

		try {
			doExecute(toolBean.getToolProgram(), writer.toString(),
					executeListeners);
			toolLogBean.setExecuteResult("succeed");
			logger.debug("execute succeed");
		} catch (Exception e) {
			toolLogBean.setExecuteResult("fail");
			logger.error("execute tool error", e);
			throw e;
		} finally {
			toolLogBean.setExecuteFinishTime(new Date());
			// toolLogBean.setExecuteLog(executeLog.toString());
			executeListeners.remove(executeListener);

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.addMiddleWareToolExecuteLog(toolLogBean, inputLogBeans);

		}

	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public File getOutputFile() {
		return outputFile;
	}

	abstract void doExecute(String program, String script,
			List<IMiddleWareExecuteListener> executeListeners) throws Exception;

	public class StreamReader extends Thread {
		private InputStream is;
		private StringBuffer buffer;

		private boolean finished = false;

		public StreamReader(InputStream is, StringBuffer buffer) {
			this.is = is;
			this.buffer = buffer;
		}

		public void run() {
			try {
				InputStreamReader isr = new InputStreamReader(is);

				BufferedReader br = new BufferedReader(isr);

				String line = null;
				while ((line = br.readLine()) != null) {
					this.buffer.append(line).append(SystemUtils.LINE_SEPARATOR);
				}

				br.close();

				isr.close();

				finished = true;

			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		public boolean isFinished() {
			return finished;
		}

	}
}
