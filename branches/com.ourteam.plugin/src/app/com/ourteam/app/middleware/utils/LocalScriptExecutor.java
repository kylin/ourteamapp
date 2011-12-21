package com.ourteam.app.middleware.utils;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;

public class LocalScriptExecutor extends AbstractMiddleWareToolExecutor {

	private Process process;

	private StringBuffer outputBuffer = new StringBuffer();

	private StringBuffer errorBuffer = new StringBuffer();

	private StreamReader outputReader;

	private StreamReader errorReader;

	private PrintWriter userWriter;

	@Override
	void doExecute(String program, String script,
			List<IMiddleWareExecuteListener> executeListeners) throws Exception {

		File scriptFile = null;

		StringBuffer commad = new StringBuffer();

		if (StringUtils.isNotBlank(program)) {
			commad.append(program).append(" ");
		} else if (SystemUtils.IS_OS_WINDOWS) {
			commad.append("cmd.exe /c ");
		}

		String[] scripts = StringUtils
				.split(script, SystemUtils.LINE_SEPARATOR);

		if (scripts.length > 1) {
			if (SystemUtils.IS_OS_WINDOWS) {
				scriptFile = new File(FileUtils.getTempDirectory(),
						System.currentTimeMillis() + ".bat");
			} else {
				scriptFile = new File(FileUtils.getTempDirectory(),
						System.currentTimeMillis() + ".sh");
			}

			scriptFile.createNewFile();

			FileUtils.writeLines(scriptFile, SystemUtils.FILE_ENCODING,
					Arrays.asList(scripts), false);

			commad.append(scriptFile.getPath());

		} else {
			commad.append(scripts[0]);
		}

		process = Runtime.getRuntime().exec(commad.toString());

		outputBuffer = new StringBuffer();

		errorBuffer = new StringBuffer();

		if (getOutputFile() != null) {
			outputReader = new StreamReader(
					FileUtils.openInputStream(getOutputFile()), outputBuffer);
		} else {
			outputReader = new StreamReader(process.getInputStream(),
					outputBuffer);
		}

		errorReader = new StreamReader(process.getErrorStream(), errorBuffer);

		userWriter = new PrintWriter(process.getOutputStream());

		outputReader.start();

		errorReader.start();

		process.waitFor();

		if (scriptFile != null) {
			FileUtils.deleteQuietly(scriptFile);
		}

	}

	@Override
	public String readOutput() throws Exception {

		if (getOutputFile() != null) {
			return FileUtils.readFileToString(getOutputFile());
		} else {
			return outputBuffer.toString();
		}

	}

	@Override
	public String readError() throws Exception {
		return errorBuffer.toString();
	}

	public void writeInput(String input) throws Exception {

		userWriter.println(input);

		userWriter.flush();

	}

	@Override
	public boolean isFinished() {
		try {
			return this.process.exitValue() == 0
					&& this.outputReader.isFinished()
					&& this.errorReader.isFinished();
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public void clear() {
		this.outputBuffer.delete(0, this.outputBuffer.length());
		this.errorBuffer.delete(0, this.errorBuffer.length());

	}

	@Override
	public void destroy() {
		if (this.process != null) {
			this.process.destroy();
		}

		if (this.outputReader != null) {
			this.outputReader = null;
		}

		if (this.errorReader != null) {
			this.errorReader = null;
		}

		if (this.userWriter != null) {
			userWriter.close();
			userWriter = null;
		}

	}
}
