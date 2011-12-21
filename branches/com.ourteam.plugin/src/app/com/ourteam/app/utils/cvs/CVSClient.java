package com.ourteam.app.utils.cvs;

import java.io.File;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.netbeans.lib.cvsclient.CVSRoot;
import org.netbeans.lib.cvsclient.Client;
import org.netbeans.lib.cvsclient.admin.StandardAdminHandler;
import org.netbeans.lib.cvsclient.command.Command;
import org.netbeans.lib.cvsclient.command.GlobalOptions;
import org.netbeans.lib.cvsclient.command.diff.DiffCommand;
import org.netbeans.lib.cvsclient.commandLine.BasicListener;
import org.netbeans.lib.cvsclient.connection.Connection;
import org.netbeans.lib.cvsclient.connection.ConnectionFactory;
import org.netbeans.lib.cvsclient.event.CVSListener;

public class CVSClient {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(CVSClient.class);

	private Client cvsClient;

	private CVSRoot cvsRoot;

	private String cvsRootStr;

	private Connection connection;

	private String localPath;

	public CVSClient(String connectionString) {
		cvsRootStr = connectionString;
		cvsRoot = CVSRoot.parse(connectionString);
	}

	public Client getCvsClient() {
		return cvsClient;
	}

	public void setCvsClient(Client cvsClient) {
		this.cvsClient = cvsClient;
	}

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}

	public CVSRoot getCvsRoot() {
		return cvsRoot;
	}

	public Connection getConnection() {
		return connection;
	}

	public void openConnection() throws Exception {
		connection = ConnectionFactory.getConnection(cvsRoot);
		connection.open();
	}

	public void closeConnection() throws Exception {
		if (connection != null && connection.isOpen()) {
			connection.close();
		}

	}

	public boolean excute(Command command, CVSListener cvsListener)
			throws Exception {
		return excute(command, new CVSListener[] { cvsListener });
	}

	public boolean excute(Command command, CVSListener[] cvsListeners)
			throws Exception {
		if (this.connection == null || connection.isOpen() == false) {
			openConnection();
		}
		cvsClient = new Client(connection, new StandardAdminHandler());
		cvsClient.setLocalPath(localPath);
		if (ArrayUtils.isNotEmpty(cvsListeners)) {
			for (int i = 0; i < cvsListeners.length; i++) {
				if (cvsListeners[i] != null) {
					cvsClient.getEventManager().addCVSListener(cvsListeners[i]);
				}
			}

		}
		logger.debug("CVS Command:" + command.getCVSCommand());
		GlobalOptions globalOptions = new GlobalOptions();
		globalOptions.setCVSRoot(cvsRootStr);
		return cvsClient.executeCommand(command, globalOptions);
	}

	public static void main(String[] args) {
		try {
			CVSClient cvsclient = new CVSClient(
					":ext:qilin:password@portal.spif.fnst.cn.fujitsu.com:/var/cvs");
			// CVSClient cvsclient = new
			// CVSClient(":pserver:qilin:user@10.167.227.41:/workstation_telecom");
			cvsclient.setLocalPath("D:/Works/CVSBase/TestPrj/projects/TestPrj");
			cvsclient.openConnection();
			// LogCommand logCommand = new LogCommand();
			// //checkoutCommand.setCheckoutDirectory("D:/temp");
			// logCommand.setBuilder(null);
			// logCommand.setFiles(new File[]{new
			// File("D:/Works/CVSBase/TestPrj/projects/TestPrj/src/test/TestClass.java")});
			// cvsclient.excute(logCommand,new BasicListener());
			System.out.println("----status-----");
			DiffCommand diffCommand = new DiffCommand();
			// checkoutCommand.setCheckoutDirectory("D:/temp");
			diffCommand.setBuilder(null);
			diffCommand.setRevision1("1.1");
			diffCommand.setRevision2("1.5");
			diffCommand
					.setFiles(new File[] { new File(
							"D:/Works/CVSBase/TestPrj/projects/TestPrj/src/test/TestClass.java") });
			cvsclient.excute(diffCommand, new BasicListener());

			System.out.println(cvsclient.getCvsClient().getCounter());

			cvsclient.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
