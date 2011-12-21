package com.ourteam.app.workspace.editor;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.editorpart.EditorPartAgent;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.table.TableBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.utils.ResourceDiffentInfomation;
import com.ourteam.app.utils.SCMUtils;
import com.ourteam.app.utils.VersionInfo;
import com.ourteam.app.utils.VersionLogInformation;
import com.ourteam.app.workspace.CVSJobListener;
import com.ourteam.app.workspace.ICMSJobListener;
import com.ourteam.app.workspace.SVNJobListener;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.ResourceDiffentInfoEditorInput;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceConfigPropertyBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class FileResourceVersionLogEditor
		extends
		AbstractEditorPart<WorkspaceResourceFileObject, FileResourceEditorInput> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(FileResourceVersionLogEditor.class);

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	private TableViewComposite<VersionLogInformation> versionLogViewComposite;

	public FileResourceVersionLogEditor() {
		super();
		setAutoReload(false);
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

	}

	@Override
	protected void reloadDataModel() throws Exception {

		VersionInfo versionInfo = getDataModel().getVersionInfo();

		final List<VersionLogInformation> versionLogInformations = new ArrayList<VersionLogInformation>();

		if (versionInfo != null) {

			Job job = new Job("取得版本历史信息") {
				protected IStatus run(final IProgressMonitor monitor) {

					try {

						long workspaceId = getDataModel().getWorkspaceId();

						ICMSJobListener jobListener = null;

						WorkspaceConfigPropertyBean[] configPropertyBeans = SCMUtils
								.getWorkspaceSCMConfig(getDataModel()
										.getWorkspaceId());

						MiddleWareBean scmServer = SCMUtils
								.getSCMServer(configPropertyBeans);

						if (MiddleWareTypeEnum.CVS_SERVER.getName().equals(
								scmServer.getType())) {
							jobListener = new CVSJobListener(monitor);
						} else if (MiddleWareTypeEnum.SVN_SERVER.getName()
								.equals(scmServer.getType())) {
							jobListener = new SVNJobListener(monitor);
						}

						WorkspaceBean workspaceBean = WORKSPACE_SERVICE
								.getWorkspaceById(workspaceId);

						VersionLogInformation[] logInformations = SCMUtils
								.showResourceLog(
										WORKSPACE_SERVICE
												.getWorkspaceFileObject(workspaceBean),
										new File[] { getDataModel()
												.getResourceFile() },
										SCMUtils.getWorkspaceSCMConfig(workspaceId),
										jobListener);

						versionLogInformations.addAll(Arrays
								.asList(logInformations));

						return Status.OK_STATUS;
					} catch (Exception e) {
						logger.error(e);
						return Status.CANCEL_STATUS;
					}

				}
			};

			job.setPriority(Job.LONG);

			job.setUser(true);

			job.addJobChangeListener(new JobChangeAdapter() {
				public void done(final IJobChangeEvent event) {

					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							versionLogViewComposite
									.setDataList(versionLogInformations);

						}
					});
				}
			});

			job.schedule();

		}
	}

	@Override
	public void doCreatePartControl(Composite parent) {

		TableBean tableBean = UIConfigFactory.getInstance().getTableConfig(
				"fileResopurceVersionLogTable");

		versionLogViewComposite = new TableViewComposite<VersionLogInformation>(
				parent, tableBean, SWT.BORDER | SWT.MULTI) {

			@Override
			public String[] getSelectedItemActionGroupIds() {
				return new String[] { "resourceVersionLogListActionGroup" };
			}

		};

		versionLogViewComposite.setActionHandler(new ActionHandler());

	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return versionLogViewComposite.getSelectedDataList().size() >= 2 ? true
					: false;
		}

		@Override
		public boolean isActionVisible(ActionBean aAction) {
			return true;
		}

		public void compareResources(ActionEvent actionEvent) throws Exception {

			ResourceDiffentInfomation diffentInfoBean = new ResourceDiffentInfomation();

			diffentInfoBean.setResourceFileObject(getDataModel());

			List<VersionLogInformation> logInformations = versionLogViewComposite
					.getSelectedDataList();

			Iterator<VersionLogInformation> iterator = logInformations
					.iterator();

			diffentInfoBean.setLeftVersion(iterator.next().getRevision());

			diffentInfoBean.setRightVersion(iterator.next().getRevision());

			ResourceDiffentInfoEditorInput editorInput = new ResourceDiffentInfoEditorInput(
					diffentInfoBean);

			getSite().getPage().openEditor(editorInput,
					EditorPartAgent.EDITOR_ID, true);
		}

	}

	@Override
	public String[] getActionGroupIds() {
		return null;
	}

	@Override
	public IActionHandler createActionHandler() {
		return null;
	}

}
