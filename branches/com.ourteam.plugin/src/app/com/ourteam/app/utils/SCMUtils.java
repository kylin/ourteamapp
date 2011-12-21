package com.ourteam.app.utils;

import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.netbeans.lib.cvsclient.admin.DateComparator;
import org.netbeans.lib.cvsclient.admin.Entry;
import org.netbeans.lib.cvsclient.command.Command;
import org.netbeans.lib.cvsclient.command.add.AddCommand;
import org.netbeans.lib.cvsclient.command.checkout.CheckoutCommand;
import org.netbeans.lib.cvsclient.command.commit.CommitCommand;
import org.netbeans.lib.cvsclient.command.diff.DiffCommand;
import org.netbeans.lib.cvsclient.command.diff.DiffInformation;
import org.netbeans.lib.cvsclient.command.importcmd.ImportCommand;
import org.netbeans.lib.cvsclient.command.log.LogCommand;
import org.netbeans.lib.cvsclient.command.log.LogInformation;
import org.netbeans.lib.cvsclient.command.remove.RemoveCommand;
import org.netbeans.lib.cvsclient.command.update.UpdateCommand;
import org.netbeans.lib.cvsclient.commandLine.BasicListener;
import org.netbeans.lib.cvsclient.event.CVSListener;
import org.netbeans.lib.cvsclient.event.FileInfoEvent;
import org.tigris.subversion.svnclientadapter.ISVNClientAdapter;
import org.tigris.subversion.svnclientadapter.ISVNLogMessage;
import org.tigris.subversion.svnclientadapter.ISVNStatus;
import org.tigris.subversion.svnclientadapter.SVNClientException;
import org.tigris.subversion.svnclientadapter.SVNRevision;
import org.tigris.subversion.svnclientadapter.SVNUrl;
import org.tigris.subversion.svnclientadapter.utils.SVNStatusUtils;

import com.ourteam.app.utils.ResourceDiffentInfomation.DiffDetail;
import com.ourteam.app.utils.cvs.CVSClient;
import com.ourteam.app.utils.svn.ISVNListener;
import com.ourteam.app.utils.svn.SVNClient;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.middleware.service.IMiddleWareService;
import com.ourteam.middleware.service.MiddleWareServiceFactory;
import com.ourteam.workspace.domain.WorkspaceConfigPropertyBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class SCMUtils {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(SCMUtils.class);

	private static final IMiddleWareService MIDDLE_WARE_SERVICE = MiddleWareServiceFactory
			.getMiddleWareService();

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss Z");

	public static final String BRANCH = "branch";

	public static final String MODULE = "module";

	public static final String LABEL = "label";

	public static Map<String, String> getSCMModuleInfo(
			WorkspaceConfigPropertyBean[] configs) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < configs.length; i++) {
			WorkspaceConfigPropertyBean workspaceConfigPropertyBean = configs[i];
			if (workspaceConfigPropertyBean.getConfigProperty()
					.equalsIgnoreCase(BRANCH)) {
				map.put(BRANCH, workspaceConfigPropertyBean.getConfigValue());
			} else if (workspaceConfigPropertyBean.getConfigProperty()
					.equalsIgnoreCase(MODULE)) {
				map.put(MODULE, workspaceConfigPropertyBean.getConfigValue());
			} else if (workspaceConfigPropertyBean.getConfigProperty()
					.equalsIgnoreCase(LABEL)) {
				map.put(LABEL, workspaceConfigPropertyBean.getConfigValue());
			}
		}

		return map;
	}

	public static String getSVNUrl(MiddleWareBean middleWareBean,
			Map<String, String> scmModuleInfo) throws Exception {
		StringBuffer url = new StringBuffer();

		url.append(middleWareBean.getDriveType()).append("://");
		url.append(middleWareBean.getHostName());
		if (StringUtils.isNotBlank(middleWareBean.getHostPort())) {
			url.append(":").append(middleWareBean.getHostPort());
		}
		url.append(middleWareBean.getServiceName());

		String module = scmModuleInfo.get(MODULE);

		if (StringUtils.isNotBlank(module)) {

			if (module.startsWith("/") == false) {
				url.append("/");
			}

			url.append(scmModuleInfo.get(MODULE));
		}

		return url.toString();
	}

	public static WorkspaceConfigPropertyBean[] getWorkspaceSCMConfig(
			long workspaceId) throws Exception {
		WorkspaceConfigPropertyBean[] configPropertyBeans = WORKSPACE_SERVICE
				.getWorkspaceConfigPropertiesByConfigItem(workspaceId,
						"scm.config");

		return configPropertyBeans;
	}

	public static MiddleWareBean getSCMServer(
			WorkspaceConfigPropertyBean[] configs) throws Exception {
		long scmServerId = 0;

		for (int i = 0; i < configs.length; i++) {
			WorkspaceConfigPropertyBean workspaceConfigPropertyBean = configs[i];
			if (workspaceConfigPropertyBean.getConfigProperty()
					.equalsIgnoreCase("scmServiceId")) {
				scmServerId = Long.parseLong(workspaceConfigPropertyBean
						.getConfigValue());
				break;
			}
		}

		MiddleWareBean scmServer = MIDDLE_WARE_SERVICE
				.getMiddleWareById(scmServerId);

		return scmServer;
	}

	public static File[] getNotInSCMFiles(File rootDir) throws Exception {
		File cvsEntries = new File(rootDir, "CVS/Entries");

		final File svnEntries = new File(rootDir, ".svn/entries");

		final ISVNClientAdapter clientAdapter = SVNClient.getSvnClientAdapter();

		final List<String> entrieNames = new ArrayList<String>();

		if (cvsEntries.exists()) {

			List<String> entries = FileUtils.readLines(cvsEntries);

			for (Iterator<String> iterator = entries.iterator(); iterator
					.hasNext();) {
				String entryStr = (String) iterator.next();
				Entry entry = new Entry(entryStr);
				if (entry.isDirectory()) {
//					if (StringUtils.isNotBlank(entry.getName())) {
//						entrieNames.add(entry.getName());
//					}
					continue;
				} else {
					entrieNames.add(entry.getName());
				}

			}
		}

		File[] files = rootDir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				if ("CVS".equals(pathname.getName())
						|| ".svn".equals(pathname.getName())) {
					return false;
				} else if (entrieNames.contains(pathname.getName())) {
					return false;
				} else if (svnEntries.exists() == true && pathname.isFile()) {
					try {
						ISVNStatus status = clientAdapter
								.getStatus(new File[] { pathname })[0];

						if ((SVNStatusUtils.hasRemote(status) || SVNStatusUtils
								.isIgnored(status))) {
							return false;
						} else {
							return true;
						}

					} catch (SVNClientException e) {
						logger.error("", e);
						return true;
					}
				} else {
					return true;
				}
			}
		});

		List<File> fileList = new ArrayList<File>();

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (file.isDirectory()) {
				if (svnEntries.exists() == false
						&& entrieNames.contains(file.getName()) == false) {
					fileList.add(file);
				} else if (svnEntries.exists() == true) {
					ISVNStatus status = clientAdapter
							.getStatus(new File[] { file })[0];

					if (SVNStatusUtils.hasRemote(status) == false
							&& SVNStatusUtils.isIgnored(status) == false
							&& SVNStatusUtils.isReadyForCommit(status) == true) {
						fileList.add(file);
					}
				}

				File[] subFiles = getNotInSCMFiles(file);
				fileList.addAll(Arrays.asList(subFiles));
			} else {
				fileList.add(file);
			}
		}

		return fileList.toArray(new File[fileList.size()]);
	}

	public static VersionInfo getResourceVersionInfo(File file)
			throws Exception {
		File cvsEntries = new File(file.getParent(), "CVS/Entries");

		if (file.isDirectory() || cvsEntries.exists() == false) {
			return null;
		}

		List<String> entries = FileUtils.readLines(cvsEntries);

		for (Iterator<String> iterator = entries.iterator(); iterator.hasNext();) {
			String entryStr = (String) iterator.next();
			Entry entry = new Entry(entryStr);
			if (entry.isDirectory()) {
				continue;
			}
			if (entry.getName().equals(file.getName())) {
				VersionInfo versionInfo = new VersionInfo();

				versionInfo.setFileName(entry.getName());
				versionInfo.setRevision(entry.getRevision());
				versionInfo.setOptions(entry.getOptions());
				versionInfo.setTagdate(entry.getTag());
				versionInfo.setTimestamp(entry.getLastModified());

				return versionInfo;
			}

		}

		return null;

	}

	public static Map<String, VersionInfo> getResourceVersionInfos(File rootDir)
			throws Exception {

		File cvsEntries = new File(rootDir, "CVS/Entries");

		File svnEntries = new File(rootDir, ".svn/entries");

		if (cvsEntries.exists() == true) {
			return getResourceCVSVersionInfos(rootDir);
		} else if (svnEntries.exists() == true) {
			return getResourceSVNVersionInfos(rootDir);
		} else {
			return new HashMap<String, VersionInfo>(0);
		}

	}

	protected static Map<String, VersionInfo> getResourceSVNVersionInfos(
			File rootDir) throws Exception {

		ISVNClientAdapter svnClient = SVNClient.getSvnClientAdapter();

		Map<String, VersionInfo> map = new HashMap<String, VersionInfo>();

		File[] files = rootDir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				if (".svn".equals(pathname.getName())) {
					return false;
				} else {
					return true;
				}

			}
		});

		ISVNStatus[] status = svnClient.getStatus(files);

		for (int i = 0; i < status.length; i++) {
			ISVNStatus svnInfo = status[i];

			if (SVNStatusUtils.hasRemote(svnInfo) == false
					|| SVNStatusUtils.isIgnored(svnInfo)) {
				continue;
			}

			VersionInfo versionInfo = new VersionInfo();

			versionInfo.setServerType(MiddleWareTypeEnum.SVN_SERVER.getName());

			versionInfo.setFileName(svnInfo.getFile().getName());
			versionInfo
					.setRevision(svnInfo.getLastChangedRevision().toString());
			// versionInfo.setOptions(svnInfo.get);
			// versionInfo.setTagdate(svnInfo.get);
			versionInfo.setTimestamp(svnInfo.getLastChangedDate());
			
			versionInfo.setLastCommitAuthor(svnInfo.getLastCommitAuthor());
			
			
			versionInfo.setLocalModified(SVNStatusUtils
					.isReadyForCommit(svnInfo));

			map.put(versionInfo.getFileName(), versionInfo);
		}

		return map;

	}

	protected static Map<String, VersionInfo> getResourceCVSVersionInfos(
			File rootDir) throws Exception {

		File cvsEntries = new File(rootDir, "CVS/Entries");

		if (cvsEntries.exists() == false) {
			return new HashMap<String, VersionInfo>(0);
		}

		Map<String, VersionInfo> map = new HashMap<String, VersionInfo>();

		List<String> entries = FileUtils.readLines(cvsEntries);

		for (Iterator<String> iterator = entries.iterator(); iterator.hasNext();) {
			String entryStr = (String) iterator.next();
			Entry entry = new Entry(entryStr);
			if (entry.isDirectory() || entry.getName() == null) {
				continue;
			}

			File localFile = new File(rootDir, entry.getName());

			VersionInfo versionInfo = new VersionInfo();

			versionInfo.setServerType(MiddleWareTypeEnum.CVS_SERVER.getName());
			versionInfo.setFileName(entry.getName());
			versionInfo.setRevision(entry.getRevision());
			versionInfo.setOptions(entry.getOptions());
			versionInfo.setTagdate(entry.getTag());
			versionInfo.setTimestamp(entry.getLastModified());
			
			//versionInfo.setLastCommitAuthor(entry.);

			versionInfo.setLocalModified(DateComparator.getInstance()
					.equals(entry.getLastModified().getTime(),
							localFile.lastModified()) == false);

			map.put(versionInfo.getFileName(), versionInfo);

		}

		return map;
	}

	public static void checkoutResource(File rootDir,
			WorkspaceConfigPropertyBean[] configs, Object listener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {
			cvsCheckoutResource(rootDir, scmServer, configs,
					(CVSListener) listener);
		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			svnCheckoutResource(rootDir, scmServer, configs,
					(ISVNListener) listener);
		}
	}

	public static ResourceDiffentInfomation showResourceDiffent(File rootDir,
			File file, String leftVersion, String rightVersion,
			WorkspaceConfigPropertyBean[] configs, Object listener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {
			return cvsShowDiffent(rootDir, file, leftVersion, rightVersion,
					scmServer, configs, (CVSListener) listener);
		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			return svnShowDiffent(rootDir, file, leftVersion, rightVersion,
					scmServer, configs, (ISVNListener) listener);
		} else {
			throw new NotImplementedException(scmServer.getType());
		}
	}

	private static ResourceDiffentInfomation svnShowDiffent(File rootDir,
			File file, String leftVersion, String rightVersion,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			ISVNListener listener) throws Exception {

		final ResourceDiffentInfomation infomation = new ResourceDiffentInfomation();

		ISVNClientAdapter clientAdapter = getSVNClient(scmServer, configs,
				listener);

		InputStream leftContent = clientAdapter.getContent(file,
				SVNRevision.getRevision(leftVersion));

		InputStream rightContent = clientAdapter.getContent(file,
				SVNRevision.getRevision(rightVersion));

		infomation.setLeftVersion(leftVersion);

		infomation.setRightVersion(rightVersion);

		infomation.setLeftContent(IOUtils.toString(leftContent));

		infomation.setRightContent(IOUtils.toString(rightContent));

		// infomation.setLeftDiffDetails(leftDiffDetails)

		return infomation;
	}

	private static ResourceDiffentInfomation cvsShowDiffent(File rootDir,
			File file, String leftVersion, String rightVersion,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener listener) throws Exception {

		final ResourceDiffentInfomation infomation = new ResourceDiffentInfomation();

		Map<String, String> moduleInfo = getSCMModuleInfo(configs);

		String module = moduleInfo.get(MODULE);

		String rootDirName = rootDir.getAbsolutePath();

		String fileName = file.getAbsolutePath();

		module = module + StringUtils.remove(fileName, rootDirName);

		module = StringUtils.replace(module, "\\", "/");

		CheckoutCommand checkoutCommand = new CheckoutCommand();

		checkoutCommand.setModules(new String[] { module });

		checkoutCommand.setBuilder(null);

		checkoutCommand.setCheckoutByRevision(leftVersion);

		File tempFile = new File(SystemUtils.getJavaIoTmpDir(),
				System.currentTimeMillis() + SystemUtils.FILE_SEPARATOR
						+ rootDir.getName());

		File leftExportDir = new File(tempFile, leftVersion);

		if (leftExportDir.exists() == false) {
			leftExportDir.mkdirs();
		} else {
			FileUtils.cleanDirectory(leftExportDir);
		}

		checkoutCommand.setCheckoutDirectory(leftVersion);

		cvsCommand(checkoutCommand, tempFile, scmServer, configs, listener);

		final File leftFile = new File(leftExportDir, file.getName());

		infomation.setLeftContent(FileUtils.readFileToString(leftFile));

		checkoutCommand.setCheckoutByRevision(rightVersion);

		File rightExportDir = new File(tempFile, rightVersion);

		if (rightExportDir.exists() == false) {
			rightExportDir.mkdirs();
		} else {
			FileUtils.cleanDirectory(rightExportDir);
		}

		checkoutCommand.setCheckoutDirectory(rightVersion);

		cvsCommand(checkoutCommand, tempFile, scmServer, configs, listener);

		final File rightFile = new File(rightExportDir, file.getName());

		infomation.setRightContent(FileUtils.readFileToString(rightFile));

		DiffCommand diffCommand = new DiffCommand();

		diffCommand.setFiles(new File[] { file });

		diffCommand.setRevision1(leftVersion);

		diffCommand.setRevision2(rightVersion);

		List<CVSListener> cvsListeners = new ArrayList<CVSListener>();

		if (listener != null) {
			cvsListeners.add(listener);
		}

		cvsListeners.add(new BasicListener() {

			@Override
			public void fileInfoGenerated(FileInfoEvent e) {
				DiffInformation diffInformation = (DiffInformation) e
						.getInfoContainer();

				infomation.setLeftVersion(diffInformation.getLeftRevision());

				infomation.setRightVersion(diffInformation.getRightRevision());

				List<DiffInformation.DiffChange> diffChanges = new ArrayList<DiffInformation.DiffChange>();

				DiffInformation.DiffChange diffChange = diffInformation
						.getFirstChange();

				while (diffChange != null) {
					diffChanges.add(diffChange);
					diffChange = diffInformation.getNextChange();
				}

				infomation.setLeftDiffDetails(getDiffentChangContent(
						diffChanges, true));

				infomation.setRightDiffDetails(getDiffentChangContent(
						diffChanges, false));

			}

		});

		cvsCommand(diffCommand, rootDir, scmServer, configs,
				cvsListeners.toArray(new CVSListener[cvsListeners.size()]));

		FileUtils.forceDelete(tempFile);

		return infomation;
	}

	protected static DiffDetail[] getDiffentChangContent(
			List<DiffInformation.DiffChange> diffChanges, boolean left) {

		List<DiffDetail> details = new ArrayList<DiffDetail>();

		for (Iterator<DiffInformation.DiffChange> iterator = diffChanges
				.iterator(); iterator.hasNext();) {
			DiffInformation.DiffChange diffChange = iterator.next();

			int start = 0;

			int end = 0;

			if (left) {
				start = diffChange.getLeftMin();
				end = diffChange.getLeftMax();
			} else {
				start = diffChange.getRightMin();
				end = diffChange.getRightMax();
			}

			for (int i = start; i <= end; i++) {
				String diffLine = diffChange.getLine(i, left);
				if (diffLine != null) {
					DiffDetail detail = new DiffDetail();
					detail.setType(diffChange.getType());
					detail.setLineNumber(i);
					detail.setContent(diffLine);
					details.add(detail);
				}
			}

		}

		return details.toArray(new DiffDetail[details.size()]);

	}

	public static VersionLogInformation[] showResourceLog(File rootDir,
			File[] files, WorkspaceConfigPropertyBean[] configs, Object listener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {
			return cvsShowResourceLog(rootDir, files, scmServer, configs,
					(CVSListener) listener);
		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			return svnShowResourceLog(rootDir, files, scmServer, configs,
					(ISVNListener) listener);
		} else {
			throw new NotImplementedException(scmServer.getType());
		}
	}

	private static VersionLogInformation[] svnShowResourceLog(File rootDir,
			File[] files, MiddleWareBean scmServer,
			WorkspaceConfigPropertyBean[] configs, ISVNListener buildListener)
			throws Exception {

		ISVNClientAdapter clientAdapter = getSVNClient(scmServer, configs,
				buildListener);

		ISVNLogMessage[] logMessages = clientAdapter.getLogMessages(files[0],
				SVNRevision.START, SVNRevision.HEAD);

		VersionLogInformation[] logInformations = new VersionLogInformation[logMessages.length];

		for (int i = 0; i < logMessages.length; i++) {
			ISVNLogMessage isvnLogMessage = logMessages[i];

			VersionLogInformation versionLogInformation = new VersionLogInformation();

			versionLogInformation.setAuthor(isvnLogMessage.getAuthor());

			versionLogInformation.setComment(isvnLogMessage.getMessage());

			versionLogInformation.setRevision(isvnLogMessage.getRevision()
					.toString());

			versionLogInformation.setRevisionTime(isvnLogMessage.getDate());

			logInformations[i] = versionLogInformation;

		}

		return logInformations;
	}

	private static VersionLogInformation[] cvsShowResourceLog(File rootDir,
			File[] files, MiddleWareBean scmServer,
			WorkspaceConfigPropertyBean[] configs, CVSListener listener)
			throws Exception {

		final List<VersionLogInformation> versionLogInformations = new ArrayList<VersionLogInformation>();

		LogCommand logCommand = new LogCommand();

		logCommand.setFiles(files);

		List<CVSListener> cvsListeners = new ArrayList<CVSListener>();

		if (listener != null) {
			cvsListeners.add(listener);
		}

		cvsListeners.add(new BasicListener() {

			@Override
			public void fileInfoGenerated(FileInfoEvent e) {
				super.fileInfoGenerated(e);

				LogInformation logInformation = (LogInformation) e
						.getInfoContainer();

				List<LogInformation.Revision> revisions = logInformation
						.getRevisionList();

				for (Iterator<LogInformation.Revision> iterator = revisions
						.iterator(); iterator.hasNext();) {

					LogInformation.Revision revision = iterator.next();

					VersionLogInformation versionLogInformation = new VersionLogInformation();

					versionLogInformation.setRevision(revision.getNumber());

					versionLogInformation.setAuthor(revision.getAuthor());

					versionLogInformation.setComment(revision.getMessage());

					versionLogInformation.setRevisionTime(revision.getDate());

					versionLogInformation.setTag(revision.getBranches());

					versionLogInformation.setModifiedLines(revision.getLines());

					versionLogInformation.setAddedLines(revision
							.getAddedLines());

					versionLogInformation.setRemovedLines(revision
							.getRemovedLines());

					versionLogInformations.add(versionLogInformation);

				}

			}

		});

		cvsCommand(logCommand, rootDir, scmServer, configs,
				cvsListeners.toArray(new CVSListener[cvsListeners.size()]));

		return versionLogInformations
				.toArray(new VersionLogInformation[versionLogInformations
						.size()]);
	}

	public static void updateResource(File rootDir,
			WorkspaceConfigPropertyBean[] configs, Object buildListener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {
			cvsUpdateResource(rootDir, scmServer, configs,
					(CVSListener) buildListener);
		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			svnUpdateResource(rootDir, scmServer, configs,
					(ISVNListener) buildListener);
		}
	}

	public static void updateResourceToVersion(File rootDir, File file,
			ResourceUpdateInfo versionInfo,
			WorkspaceConfigPropertyBean[] configs, Object buildListener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {
			cvsUpdateResourceToVersion(rootDir, file, versionInfo, scmServer,
					configs, (CVSListener) buildListener);
		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			svnUpdateResourceToVersion(rootDir, file, versionInfo, scmServer,
					configs, (ISVNListener) buildListener);
		}

	}

	private static void svnUpdateResourceToVersion(File rootDir, File file,
			ResourceUpdateInfo versionInfo, MiddleWareBean scmServer,
			WorkspaceConfigPropertyBean[] configs, ISVNListener buildListener)
			throws Exception {

		ISVNClientAdapter clientAdapter = getSVNClient(scmServer, configs,
				buildListener);

		String reversion = versionInfo.getRevision();

		Date date = versionInfo.getDate();

		Calendar dateCalendar = Calendar.getInstance();

		dateCalendar.setTime(date);

		Date time = versionInfo.getTime();

		Calendar timeCalendar = Calendar.getInstance();

		timeCalendar.setTime(time);

		Calendar calendar = Calendar.getInstance();

		calendar.set(dateCalendar.get(Calendar.YEAR),
				dateCalendar.get(Calendar.MONTH),
				dateCalendar.get(Calendar.DATE),
				timeCalendar.get(Calendar.HOUR_OF_DAY),
				timeCalendar.get(Calendar.MINUTE),
				timeCalendar.get(Calendar.SECOND));

		SVNRevision svnRevision = SVNRevision.HEAD;

		if (StringUtils.isNotBlank(versionInfo.getRevision())) {
			svnRevision = SVNRevision.getRevision(versionInfo.getRevision());
		}

		if (versionInfo.isUpdateToLastVersion()) {
			svnRevision = SVNRevision.HEAD;
		} else if (StringUtils.isNotBlank(reversion)) {
			svnRevision = SVNRevision.getRevision(versionInfo.getRevision());
		} else if (date != null) {
			svnRevision = SVNRevision.getRevision(
					DATE_FORMAT.format(calendar.getTime()), DATE_FORMAT);
		}

		clientAdapter.update(file, svnRevision, true);

	}

	private static void cvsUpdateResourceToVersion(File rootDir, File file,
			ResourceUpdateInfo versionInfo, MiddleWareBean scmServer,
			WorkspaceConfigPropertyBean[] configs, CVSListener buildListener)
			throws Exception {

		UpdateCommand updateCommand = new UpdateCommand();

		updateCommand.setBuilder(null);
		updateCommand.setRecursive(false);
		updateCommand.setBuildDirectories(true);
		updateCommand.setPruneDirectories(true);
		updateCommand.setFiles(new File[] { file });

		String reversion = versionInfo.getRevision();

		Date date = versionInfo.getDate();

		Calendar dateCalendar = Calendar.getInstance();

		dateCalendar.setTime(date);

		Date time = versionInfo.getTime();

		Calendar timeCalendar = Calendar.getInstance();

		timeCalendar.setTime(time);

		Calendar calendar = Calendar.getInstance();

		calendar.set(dateCalendar.get(Calendar.YEAR),
				dateCalendar.get(Calendar.MONTH),
				dateCalendar.get(Calendar.DATE),
				timeCalendar.get(Calendar.HOUR_OF_DAY),
				timeCalendar.get(Calendar.MINUTE),
				timeCalendar.get(Calendar.SECOND));

		if (versionInfo.isUpdateToLastVersion()) {
			updateCommand.setUpdateByRevision("HEAD");
		} else if (StringUtils.isNotBlank(reversion)) {
			updateCommand.setUpdateByRevision(reversion);
		} else if (date != null) {
			updateCommand
					.setUpdateByDate(DATE_FORMAT.format(calendar.getTime()));
		} else {
			updateCommand.setUseHeadIfNotFound(true);
		}

		cvsCommand(updateCommand, rootDir, scmServer, configs, buildListener);

	}

	public static void importResource(File rootDir,
			WorkspaceConfigPropertyBean[] configs, Object buildListener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {
			cvsImportResource(rootDir, scmServer, configs,
					(CVSListener) buildListener);
		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			svnImportResource(rootDir, scmServer, configs,
					(ISVNListener) buildListener);
		}
	}

	private static void svnImportResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			ISVNListener buildListener) throws Exception {

		ISVNClientAdapter clientAdapter = getSVNClient(scmServer, configs,
				buildListener);

		Map<String, String> map = getSCMModuleInfo(configs);

		SVNUrl svnUrl = new SVNUrl(getSVNUrl(scmServer, map));

		clientAdapter.doImport(rootDir, svnUrl, "", true);

		svnCheckoutResource(rootDir, scmServer, configs, buildListener);

	}

	public static void commitResource(File rootDir,
			WorkspaceConfigPropertyBean[] configs, Object buildListener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {
			cvsCommitResource(rootDir, scmServer, configs,
					(CVSListener) buildListener);
		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			svnCommitResource(rootDir, scmServer, configs,
					(ISVNListener) buildListener);
		}
	}

	public static void removeResource(File rootDir, File[] files,
			WorkspaceConfigPropertyBean[] configs, Object buildListener)
			throws Exception {

		MiddleWareBean scmServer = getSCMServer(configs);

		if ("CVS_SERVER".equalsIgnoreCase(scmServer.getType())) {

			List<File> fileList = new ArrayList<File>();

			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				if (file.isDirectory()) {
					removeResource(rootDir, file.listFiles(new FileFilter() {

						@Override
						public boolean accept(File pathname) {
							return pathname.getName().equals("CVS") == false;
						}
					}), configs, buildListener);
					file.delete();
				} else {
					fileList.add(file);
				}
			}

			cvsRemoveResource(rootDir,
					fileList.toArray(new File[fileList.size()]), scmServer,
					configs, (CVSListener) buildListener);

		} else if ("SVN_SERVER".equalsIgnoreCase(scmServer.getType())) {
			svnRemoveResource(rootDir, files, scmServer, configs,
					(ISVNListener) buildListener);
		}
	}

	private static void svnRemoveResource(File rootDir, File[] files,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			ISVNListener buildListener) throws Exception {

		ISVNClientAdapter clientAdapter = getSVNClient(scmServer, configs,
				buildListener);

		clientAdapter.remove(files, true);

		clientAdapter.commit(new File[] { rootDir }, "commit", true);

	}

	private static void svnCommitResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			ISVNListener buildListener) throws Exception {

		ISVNClientAdapter clientAdapter = getSVNClient(scmServer, configs,
				buildListener);

		File[] willAddFiles = getNotInSCMFiles(rootDir);

		if (ArrayUtils.isNotEmpty(willAddFiles)) {
			for (int i = 0; i < willAddFiles.length; i++) {
				File file = willAddFiles[i];
				if (file.isDirectory()) {
					if (SVNStatusUtils.isAdded(clientAdapter
							.getStatus(new File[] { file })[0]) == false) {
						clientAdapter.addDirectory(file, false);
					}

				} else {
					clientAdapter.addFile(file);
				}
			}

		}

		clientAdapter = getSVNClient(scmServer, configs, buildListener);

		clientAdapter.commit(new File[] { rootDir }, "commit", true);

	}

	private static void cvsCommand(Command cvsCommand, File localDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener cvsListener) throws Exception {
		cvsCommand(cvsCommand, localDir, scmServer, configs,
				new CVSListener[] { cvsListener });
	}

	private static void cvsCommand(Command cvsCommand, File localDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener[] cvsListeners) throws Exception {

		StringBuffer cvsRoot = new StringBuffer();

		cvsRoot.append(":").append(scmServer.getDriveType());
		cvsRoot.append(":").append(scmServer.getUser());
		if (StringUtils.isNotBlank(scmServer.getPassword())) {
			cvsRoot.append(":").append(scmServer.getPassword());
		}
		cvsRoot.append("@").append(scmServer.getHostName());
		cvsRoot.append(":").append(scmServer.getServiceName());

		CVSClient cvsClient = new CVSClient(cvsRoot.toString());

		cvsClient.openConnection();

		cvsClient.setLocalPath(localDir.getAbsolutePath());

		cvsClient.excute(cvsCommand, cvsListeners);

		cvsClient.closeConnection();

	}

	private static void cvsUpdateResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener cvsListener) throws Exception {

		UpdateCommand updateCommand = new UpdateCommand();

		updateCommand.setBuilder(null);
		updateCommand.setRecursive(true);
		updateCommand.setBuildDirectories(true);
		updateCommand.setPruneDirectories(true);
		updateCommand.setFiles(new File[] { rootDir });

		cvsCommand(updateCommand, rootDir, scmServer, configs, cvsListener);

	}

	private static void cvsRemoveResource(File rootDir, File[] files,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener cvsListener) throws Exception {

		if (ArrayUtils.isEmpty(files)) {
			return;
		}

		RemoveCommand removeCommand = new RemoveCommand();

		removeCommand.setBuilder(null);
		removeCommand.setRecursive(true);
		removeCommand.setDeleteBeforeRemove(true);
		removeCommand.setFiles(files);

		cvsCommand(removeCommand, rootDir, scmServer, configs, cvsListener);
		CommitCommand commitCommand = new CommitCommand();

		commitCommand.setBuilder(null);
		commitCommand.setRecursive(true);
		commitCommand.setFiles(files);

		cvsCommand(commitCommand, rootDir, scmServer, configs, cvsListener);

	}

	private static void cvsCommitResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener cvsListener) throws Exception {

		File[] willAddFiles = getNotInSCMFiles(rootDir);

		if (ArrayUtils.isNotEmpty(willAddFiles)) {
			AddCommand addCommand = new AddCommand();

			addCommand.setBuilder(null);

			addCommand.setFiles(willAddFiles);

			cvsCommand(addCommand, rootDir, scmServer, configs, cvsListener);
		}

		CommitCommand commitCommand = new CommitCommand();

		commitCommand.setBuilder(null);
		commitCommand.setRecursive(true);
		commitCommand.setFiles(new File[] { rootDir });

		cvsCommand(commitCommand, rootDir, scmServer, configs, cvsListener);

	}

	private static void cvsImportResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener buildListener) throws Exception {

		Map<String, String> moduleInfo = getSCMModuleInfo(configs);

		String module = moduleInfo.get(MODULE);

		ImportCommand importCommand = new ImportCommand();

		importCommand.setImportDirectory(rootDir.getAbsolutePath());

		importCommand.setModule(module);
		importCommand.setLogMessage("import module '" + module + "'");
		importCommand.setReleaseTag(module + "_v_1_1");
		importCommand.setVendorTag(module + "_init");

		cvsCommand(importCommand, rootDir, scmServer, configs, buildListener);

		cvsCheckoutResource(rootDir, scmServer, configs, buildListener);
	}

	private static void cvsCheckoutResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			CVSListener cvsListener) throws Exception {

		CheckoutCommand checkoutCommand = new CheckoutCommand();

		Map<String, String> moduleInfo = getSCMModuleInfo(configs);

		checkoutCommand.setModule(moduleInfo.get(MODULE));

		checkoutCommand.setRecursive(true);

		if (StringUtils.isNotBlank(moduleInfo.get(LABEL))) {
			checkoutCommand.setCheckoutByRevision(moduleInfo.get(LABEL));
		}

		if (StringUtils.isNotBlank(moduleInfo.get(BRANCH))) {

		}

		File tempFile = new File(SystemUtils.getJavaIoTmpDir(),
				System.currentTimeMillis() + SystemUtils.FILE_SEPARATOR
						+ rootDir.getName());

		cvsCommand(checkoutCommand, tempFile, scmServer, configs, cvsListener);

		File resourcePathFile = new File(tempFile, moduleInfo.get(MODULE));

		FileOperationUtils.moveFiles(resourcePathFile, rootDir);

		FileUtils.forceDelete(resourcePathFile);

	}

	private static void svnUpdateResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			ISVNListener buildListener) throws Exception {

		ISVNClientAdapter clientAdapter = getSVNClient(scmServer, configs,
				buildListener);

		SVNRevision svnRevision = getSVNRevision(configs);

		clientAdapter.update(rootDir, svnRevision, true);
	}

	protected static ISVNClientAdapter getSVNClient(MiddleWareBean scmServer,
			WorkspaceConfigPropertyBean[] configs, ISVNListener listener)
			throws Exception {

		ISVNClientAdapter svnClient = SVNClient.getSvnClientAdapter(
				scmServer.getUser(), scmServer.getPassword());

		if (listener != null) {
			svnClient.setProgressListener(listener);
			svnClient.addNotifyListener(listener);
		}

		return svnClient;
	}

	private static void svnCheckoutResource(File rootDir,
			MiddleWareBean scmServer, WorkspaceConfigPropertyBean[] configs,
			ISVNListener listener) throws Exception {

		Map<String, String> map = getSCMModuleInfo(configs);

		SVNUrl svnUrl = new SVNUrl(getSVNUrl(scmServer, map));

		SVNRevision svnRevision = getSVNRevision(configs);

		ISVNClientAdapter svnClient = getSVNClient(scmServer, configs, listener);

		svnClient.checkout(svnUrl, rootDir, svnRevision, true);

	}

	protected static SVNRevision getSVNRevision(
			WorkspaceConfigPropertyBean[] configs) throws Exception {
		Map<String, String> map = getSCMModuleInfo(configs);

		SVNRevision svnRevision = SVNRevision.HEAD;

		if (StringUtils.isNotBlank(map.get(BRANCH))) {
			svnRevision = SVNRevision.getRevision(map.get(BRANCH));
		}

		return svnRevision;
	}
}
