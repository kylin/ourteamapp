package com.ourteam.app.middleware.utils;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.widgets.Shell;

import com.ourteam.hr.domain.EmployeeBean;

public interface IMiddleWareToolExecutor {

	void addMiddleWareExecuteListener(IMiddleWareExecuteListener executeListener);

	void removeMiddleWareExecuteListener(
			IMiddleWareExecuteListener executeListener);

	List<IMiddleWareExecuteListener> getMiddleWareExecuteListeners();

	void setExecuteInput(Map<String, Object> inputMap);

	void execute(long middleWareId, long middleWareToolId, EmployeeBean executor)
			throws Exception;

	boolean isFinished();

	String readOutput() throws Exception;

	String readError() throws Exception;

	void clear();

	void writeInput(String input) throws Exception;

	void destroy();

	String getLoginId();

	void setLoginId(String loginId);
	
	String getHost();
	
	void setHost(String host);
	
	int getPort();
	
	void setPort(int port);

	String getLoginPassword();

	void setLoginPassword(String password);
	
	Shell getShell();

	void setShell(Shell shell);
	
	File getOutputFile();
}
