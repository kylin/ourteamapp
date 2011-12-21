package com.ourteam.app.middleware.utils;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;

import net.sf.commons.ssh.AuthenticationOptions;
import net.sf.commons.ssh.Connection;
import net.sf.commons.ssh.ConnectionFactory;
import net.sf.commons.ssh.PasswordAuthenticationOptions;
import net.sf.commons.ssh.ShellSession;
import net.sf.commons.ssh.ShellSessionOptions;
import net.sf.commons.ssh.j2ssh.J2sshConnectionFactory;

public class SSHExecutor extends AbstractMiddleWareToolExecutor {

	private static ConnectionFactory sshConnectionFactory = J2sshConnectionFactory
			.newInstance(new HashSet());

	private Connection conn;

	private ShellSession session;

	private StringBuffer outputBuffer = new StringBuffer();

	private StreamReader outputReader;

	private PrintWriter userWriter;

	private boolean isStarted = false;

	@Override
	public boolean isFinished() {
		try {
			if (isStarted) {
				return session != null && session.isClosed();
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
	}

	@Override
	public String readOutput() throws Exception {
		return this.outputBuffer.toString();
	}

	@Override
	public String readError() throws Exception {
		return null;
	}

	@Override
	public void clear() {
		this.outputBuffer.delete(0, this.outputBuffer.length());
	}

	@Override
	public void writeInput(String input) throws Exception {
		userWriter.println(input);

		userWriter.flush();
	}

	@Override
	public void destroy() {

		try {

			if (this.session != null) {
				this.session.close();
			}

			if (this.conn != null) {
				this.conn.close();
			}

			isStarted = false;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	void doExecute(String program, String script,
			List<IMiddleWareExecuteListener> executeListeners) throws Exception {

		AuthenticationOptions auth = new PasswordAuthenticationOptions(
				getLoginId(), getLoginPassword());

		try {
			if (getPort() == 0) {
				this.conn = sshConnectionFactory
						.openConnection(getHost(), auth);
			} else {
				this.conn = sshConnectionFactory.openConnection(getHost(),
						getPort(), auth);
			}

			ShellSessionOptions options = new ShellSessionOptions();

			options.terminalWidth = 10000;
			options.terminalCols = 10000;
			options.terminalRows = 10000;

			session = this.conn.openShellSession(options);

			OutputStream out = session.getOutputStream();

			out.write(script.getBytes());

			out.flush();

			userWriter = new PrintWriter(session.getOutputStream());

			outputReader = new StreamReader(session.getInputStream(),
					outputBuffer);

			outputReader.start();

			isStarted = true;

		} catch (Exception e) {
			this.outputBuffer.append(e.getLocalizedMessage());
			destroy();
			throw e;
		}

	}

}
