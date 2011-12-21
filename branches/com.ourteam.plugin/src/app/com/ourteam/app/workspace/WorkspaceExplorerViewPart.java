package com.ourteam.app.workspace;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.viewpart.AbstractTreeViewPart;
import net.ui.model.action.ActionBean;
import net.ui.model.action.CustomActionBean;
import net.ui.model.table.TableBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.internal.dialogs.DialogUtil;
import org.eclipse.ui.part.ViewPart;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.modelbase.utils.BusinessCodeGenerateContext;
import com.ourteam.app.modelbase.utils.BusinessCodeGenerateUtils;
import com.ourteam.app.modelbase.utils.IBusinessCodeGenerateListener;
import com.ourteam.app.utils.ResourceUpdateInfo;
import com.ourteam.app.utils.SCMUtils;
import com.ourteam.app.workspace.editor.AddLibaryResourceWizardProvider;
import com.ourteam.app.workspace.editor.AddSourceCodeResourceWizardProvider;
import com.ourteam.app.workspace.editor.AddWorkspaceWizardProvider;
import com.ourteam.app.workspace.editor.CheckoutWorkspaceWizardProvider;
import com.ourteam.app.workspace.editor.CreateUIActionConfigFileDialogProvider;
import com.ourteam.app.workspace.editor.CreateUIFormListConfigFileDialogProvider;
import com.ourteam.app.workspace.editor.CreateUISelectListConfigFileDialogProvider;
import com.ourteam.app.workspace.editor.CreateUITabConfigFileDialogProvider;
import com.ourteam.app.workspace.editor.CreateUITableConfigFileDialogProvider;
import com.ourteam.app.workspace.editor.CreateUITreeConfigFileDialogProvider;
import com.ourteam.app.workspace.editor.SelectUpdateVersionDialogProvider;
import com.ourteam.app.workspace.editor.WorkspaceConfigDialogProvider;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper;
import com.ourteam.app.workspace.ui.WorkspaceSubNodeBuilder;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.project.domain.ProjectBean;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceConfigPropertyBean;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean;

public class WorkspaceExplorerViewPart extends
		AbstractProjectFilterOpenEditorTreeViewPart {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(WorkspaceExplorerViewPart.class);

	public static final String VIEW_ID = "com.ourteam.app.workspace.WorkspaceExplorerViewPart";

	

	public WorkspaceExplorerViewPart() {

	}

	@Override
	protected String[] getToolbarActionGrous() {
		return new String[] { "workspaceExplorerViewActionGroup" };
	}

	@Override
	protected String[] getMenuActionGrous() {
		return null;
	}

	@Override
	protected ITreeViewProvider getTreeViewProvider() {

		return new WorkspaceTreeProvider();
	}

	@Override
	protected List<IEditorProvider<TreeNodeItem>> getEditorProviderList(
			TreeNodeItem item) {
		return WorkspaceEditorHelper.getWorkspaceEditorProviderList();
	}

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return new WorkspaceExplorerActionHandler(this);
	}

	protected boolean isWorkspaceCheckouted(final WorkspaceBean workspaceBean) {
		try {
			File workspaceDir = IOurTeamServiceConst.WORKSPACE_SERVICE
					.getWorkspaceFileObject(workspaceBean);

			String[] names = workspaceDir.list();

			if (ArrayUtils.contains(names, "CVS")
					|| ArrayUtils.contains(names, ".svn")) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			logger.error(e);
			return false;
		}
	}

	class WorkspaceTreeProvider extends AbstractTreeTableViewProvider {

		@Override
		public TableBean getTableConfig() {

			return UIConfigFactory.getInstance().getTableConfig(
					"workspaceFileListTable");
		}

		@Override
		public TreeBean getTreeConfig() {

			return UIConfigFactory.getInstance().getTreeConfig(
					"/ui/work/workspace_explorer.tree");
		}

		@Override
		public void initSubNodeBuilder(String id, ISubNodeBuilder builder) {
			if (builder instanceof WorkspaceSubNodeBuilder) {
				((WorkspaceSubNodeBuilder) builder)
						.setProjectBeans(getSelectedProjects());
			}
		}

	}

	class WorkspaceExplorerActionHandler extends ProjectFilterExplorerActionHandler {

		public WorkspaceExplorerActionHandler(AbstractTreeViewPart treeViewPart) {
			super(treeViewPart);
		}

		@Override
		public boolean isActionSelected(ActionBean aAction) {
			if ("selectProjectAction".equals(aAction.getId())) {
				return getSelectedProjects().contains(
						((CustomActionBean<ProjectBean>) aAction)
								.getUserObject());
			} else {
				return false;
			}
		}

		public void selectProject(ActionEvent actionEvent) throws Exception {

			ProjectBean projectBean = ((CustomActionBean<ProjectBean>) actionEvent
					.getActionBean()).getUserObject();

			if (actionEvent.isChecked()) {
				getSelectedProjects().add(projectBean);
			} else {
				getSelectedProjects().remove(projectBean);
			}

			getTreeComposite().getTreeViewer().getTree().deselectAll();

			getTreeComposite().refresh();
		}

		public boolean isActionEnable(ActionBean aAction) {

			boolean flag = super.isActionEnable(aAction);

			if (flag == true) {
				if ("scmActions".equalsIgnoreCase(aAction.getId())) {
					try {
						final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

						WorkspaceConfigPropertyBean[] configPropertyBeans = IOurTeamServiceConst.WORKSPACE_SERVICE
								.getWorkspaceConfigPropertiesByConfigItem(
										workspaceBean.getId(), "scm.config");

						String scmServer = null;

						String module = null;

						for (int i = 0; i < configPropertyBeans.length; i++) {
							WorkspaceConfigPropertyBean workspaceConfigPropertyBean = configPropertyBeans[i];
							if (workspaceConfigPropertyBean.getConfigProperty()
									.equalsIgnoreCase("scmServiceId")) {
								scmServer = workspaceConfigPropertyBean
										.getConfigValue();
							} else if (workspaceConfigPropertyBean
									.getConfigProperty().equalsIgnoreCase(
											"module")) {
								module = workspaceConfigPropertyBean
										.getConfigValue();
							}
						}

						if (StringUtils.isBlank(scmServer)
								|| StringUtils.isBlank(module)) {
							flag = false;
						}

					} catch (Exception e) {
						logger.error(e);
					}

				} else if ("checkoutResource".equals(aAction.getId())) {
					final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

					flag = isWorkspaceCheckouted(workspaceBean) == false;

				} else if ("checkinResource".equals(aAction.getId())) {
					final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

					flag = isWorkspaceCheckouted(workspaceBean) == false;

				} else if ("updateResource".equals(aAction.getId())) {
					final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

					flag = isWorkspaceCheckouted(workspaceBean) == true;

				} else if ("commitResource".equals(aAction.getId())) {
					final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

					flag = isWorkspaceCheckouted(workspaceBean) == true;

				} else if ("updateResourceToVersion".equals(aAction.getId())) {
					WorkspaceResourceFileObject resourceFileObject = (WorkspaceResourceFileObject) getSelectedUserObject();

					flag = resourceFileObject.getResourceFile().isFile();

				} else if ("cleanVersionInfo".equals(aAction.getId())) {
					final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

					flag = isWorkspaceCheckouted(workspaceBean) == true;

				}
			}

			return flag;
		}

		public void deleteWorkspace(ActionEvent actionEvent) throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			IOurTeamServiceConst.WORKSPACE_SERVICE.deleteWorkspace(workspaceBean.getId());

			refreshSelectedParentTreeNode();
		}

		public void deleteWorkspaceResource(ActionEvent actionEvent)
				throws Exception {

			final WorkspaceResourceBean workspaceResourceBean = (WorkspaceResourceBean) getSelectedUserObject();

			IOurTeamServiceConst.WORKSPACE_SERVICE.deleteWorkspaceResource(workspaceResourceBean
					.getId());

			refreshSelectedParentTreeNode();
		}

		public void removeWorkspaceResource(ActionEvent actionEvent)
				throws Exception {

			final WorkspaceResourceBean workspaceResourceBean = (WorkspaceResourceBean) getSelectedUserObject();

			IOurTeamServiceConst.WORKSPACE_SERVICE.removeWorkspaceResource(workspaceResourceBean
					.getId());

			refreshSelectedParentTreeNode();
		}

		public void checkoutResource(ActionEvent actionEvent) throws Exception {

			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			doSCMCommand(actionEvent, workspaceBean);
		}

		public void checkinResource(ActionEvent actionEvent) throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			doSCMCommand(actionEvent, workspaceBean);
		}

		protected void doSCMCommand(final ActionEvent actionEvent,
				final WorkspaceBean workspaceBean) {
			doSCMCommand(actionEvent, workspaceBean, null, null);
		}

		protected void doSCMCommand(final ActionEvent actionEvent,
				final WorkspaceBean workspaceBean,
				final WorkspaceResourceFileObject[] resourceFileObjects,
				final Object[] params) {

			final ActionBean actionBean = actionEvent.getActionBean();

			Job job = new Job(actionBean.getLabel()) {
				protected IStatus run(final IProgressMonitor monitor) {

					try {

						ICMSJobListener jobListener = null;

						WorkspaceConfigPropertyBean[] configPropertyBeans = SCMUtils
								.getWorkspaceSCMConfig(workspaceBean.getId());

						MiddleWareBean scmServer = SCMUtils
								.getSCMServer(configPropertyBeans);

						if (MiddleWareTypeEnum.CVS_SERVER.getName().equals(
								scmServer.getType())) {
							jobListener = new CVSJobListener(monitor);
						} else if (MiddleWareTypeEnum.SVN_SERVER.getName()
								.equals(scmServer.getType())) {
							jobListener = new SVNJobListener(monitor);
						}

						if ("checkoutResource".equals(actionBean.getId())
								|| "checkoutWorkspace".equals(actionBean
										.getId())) {
							SCMUtils.checkoutResource(IOurTeamServiceConst.WORKSPACE_SERVICE
									.getWorkspaceFileObject(workspaceBean),
									configPropertyBeans, jobListener);

						} else if ("checkinResource".equals(actionBean.getId())) {
							SCMUtils.importResource(IOurTeamServiceConst.WORKSPACE_SERVICE
									.getWorkspaceFileObject(workspaceBean),
									configPropertyBeans, jobListener);
						} else if ("updateResource".equals(actionBean.getId())) {
							SCMUtils.updateResource(IOurTeamServiceConst.WORKSPACE_SERVICE
									.getWorkspaceFileObject(workspaceBean),
									configPropertyBeans, jobListener);
						} else if ("commitResource".equals(actionBean.getId())) {
							SCMUtils.commitResource(IOurTeamServiceConst.WORKSPACE_SERVICE
									.getWorkspaceFileObject(workspaceBean),
									configPropertyBeans, jobListener);
						} else if ("delete".equals(actionBean.getId())) {

							File[] files = new File[resourceFileObjects.length];

							for (int i = 0; i < resourceFileObjects.length; i++) {
								files[i] = resourceFileObjects[i]
										.getResourceFile();
							}

							SCMUtils.removeResource(IOurTeamServiceConst.WORKSPACE_SERVICE
									.getWorkspaceFileObject(workspaceBean),
									files, configPropertyBeans, jobListener);
						} else if ("updateResourceToVersion".equals(actionBean
								.getId())) {
							File[] files = new File[resourceFileObjects.length];

							for (int i = 0; i < resourceFileObjects.length; i++) {
								files[i] = resourceFileObjects[i]
										.getResourceFile();
							}

							SCMUtils.updateResourceToVersion(IOurTeamServiceConst.WORKSPACE_SERVICE
									.getWorkspaceFileObject(workspaceBean),
									files[0], (ResourceUpdateInfo) params[0],
									configPropertyBeans, jobListener);

						}

						return Status.OK_STATUS;
					} catch (final Exception e) {
						logger.error("do scm command error", e);
						getSite().getShell().getDisplay()
								.asyncExec(new Runnable() {
									public void run() {
										MessageDialog.openError(getSite()
												.getShell(), "异常", e
												.getLocalizedMessage());
									}
								});

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
							if ("delete".equals(actionBean.getId())
									|| "updateResourceToVersion"
											.equals(actionBean.getId())) {
								refreshSelectedParentTreeNode();
							} else {
								refreshSelectedTreeNode();
							}

						}
					});
				}
			});

			job.schedule();
		}

		public void checkoutWorkspace(ActionEvent actionEvent) throws Exception {

			final WorkspaceBean workspaceBean = new WorkspaceBean();

			if (SWTUtils.openWizardDialog(getSite().getShell(),
					new CheckoutWorkspaceWizardProvider(workspaceBean))) {

				getTreeComposite().refreshTree();

				doSCMCommand(actionEvent, workspaceBean);
			}
		}

		public void updateResource(ActionEvent actionEvent) throws Exception {

			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			doSCMCommand(actionEvent, workspaceBean);
		}

		public void updateResourceToVersion(ActionEvent actionEvent)
				throws Exception {

			final WorkspaceResourceFileObject fileObject = (WorkspaceResourceFileObject) getSelectedUserObject();

			WorkspaceBean workspaceBean = IOurTeamServiceConst.WORKSPACE_SERVICE
					.getWorkspaceById(fileObject.getWorkspaceId());

			final ResourceUpdateInfo resourceUpdateInfo = new ResourceUpdateInfo();

			SelectUpdateVersionDialogProvider dialogProvider = new SelectUpdateVersionDialogProvider(
					resourceUpdateInfo, fileObject);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

				doSCMCommand(actionEvent, workspaceBean,
						new WorkspaceResourceFileObject[] { fileObject },
						new Object[] { resourceUpdateInfo });

			}

		}

		public void commitResource(ActionEvent actionEvent) throws Exception {

			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			doSCMCommand(actionEvent, workspaceBean);
		}

		public void cleanVersionInfo(ActionEvent actionEvent) throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			final ActionBean actionBean = actionEvent.getActionBean();

			Job job = new Job(actionBean.getLabel()) {
				protected IStatus run(final IProgressMonitor monitor) {
					try {
						deleteCMSInfoFile(
								IOurTeamServiceConst.WORKSPACE_SERVICE
										.getWorkspaceFileObject(workspaceBean),
								monitor);
						return Status.OK_STATUS;
					} catch (Exception e) {
						return Status.CANCEL_STATUS;
					}

				}
			};

			job.setUser(true);

			job.addJobChangeListener(new JobChangeAdapter() {
				public void done(final IJobChangeEvent event) {

					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							refreshTree();

						}
					});
				}
			});

			job.schedule();

		}

		protected void deleteCMSInfoFile(File file, IProgressMonitor monitor)
				throws Exception {
			File[] files = file.listFiles(new FileFilter() {

				@Override
				public boolean accept(File pathname) {
					if (pathname.isDirectory()) {
						return true;
					} else {
						return false;
					}
				}
			});

			for (int i = 0; i < files.length; i++) {
				File temFile = files[i];
				if (temFile.getName().equalsIgnoreCase("CVS")
						|| temFile.getName().equalsIgnoreCase(".svn")) {

					monitor.subTask("清除 " + temFile.getAbsolutePath());

					FileUtils.deleteQuietly(temFile);
				} else {
					deleteCMSInfoFile(temFile, monitor);
				}
			}
		}

		public void deleteResource(ActionEvent actionEvent) throws Exception {

			WorkspaceResourceFileObject fileObject = (WorkspaceResourceFileObject) getSelectedUserObject();

			WorkspaceBean workspaceBean = IOurTeamServiceConst.WORKSPACE_SERVICE
					.getWorkspaceById(fileObject.getWorkspaceId());

			if (isWorkspaceCheckouted(workspaceBean)) {

				doSCMCommand(actionEvent, workspaceBean,
						new WorkspaceResourceFileObject[] { fileObject }, null);
			} else {
				fileObject.getResourceFile().delete();

				refreshSelectedParentTreeNode();
			}
		}

		public void addNewWorkspace(ActionEvent actionEvent) throws Exception {
			if (SWTUtils.openWizardDialog(getSite().getShell(),
					new AddWorkspaceWizardProvider())) {
				getTreeComposite().refreshTree();
			}
		}

		public void addSourceCodeResource(ActionEvent actionEvent)
				throws Exception {

			WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			if (SWTUtils.openWizardDialog(
					getSite().getShell(),
					new AddSourceCodeResourceWizardProvider(workspaceBean
							.getId()))) {
				refreshSelectedTreeNode();
			}

		}

		public void addLibaryResource(ActionEvent actionEvent) throws Exception {
			WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();
			if (SWTUtils.openWizardDialog(getSite().getShell(),
					new AddLibaryResourceWizardProvider(workspaceBean.getId()))) {
				refreshSelectedTreeNode();
			}
		}

		public void uploadLibary(ActionEvent actionEvent) throws Exception {

//			final WorkspaceResourceBean workspaceResourceBean = (WorkspaceResourceBean) getSelectedUserObject();
//
//			final FileDialog fileDialog = new FileDialog(getShell(),
//					SWT.SHELL_TRIM | SWT.APPLICATION_MODAL | SWT.MULTI);
//			//fileDialog.setAutoUpload(false);
//			fileDialog.setText("上传库文件");
//			fileDialog.setFilterExtensions(new String[] { "*.jar", "*.zip" });
//			fileDialog.setFilterNames(new String[] { "jar 文件", "zip 文件" });
//			
//			fileDialog.open()
//
//			DialogUtil.(fileDialog, new DialogCallback() {
//				public void dialogClosed(int returnCode) {
//
//					try {
//						File libDir = IOurTeamServiceConst.WORKSPACE_SERVICE
//								.getWorkspaceResourceFileObject(workspaceResourceBean);
//
//						String[] selectedFiles = fileDialog.getFileNames();
//
//						for (String fileName : selectedFiles) {
//
//							FileUtils.moveFileToDirectory(new File(fileName),
//									libDir, true);
//
//						}
//
//					} catch (Exception e) {
//						MessageDialog.openError(getSite().getShell(), "上传失败",
//								e.getLocalizedMessage());
//						e.printStackTrace();
//					}
//
//					refreshSelectedTreeNode();
//				}
//			});

		}

		public void configWorkspace(ActionEvent actionEvent) throws Exception {

			WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			if (SWTUtils.openDialog(getSite().getShell(),
					new WorkspaceConfigDialogProvider(getSelectedProjects(),
							workspaceBean.getId()))) {

			}
		}

		public void generateResource(final ActionEvent actionEvent)
				throws Exception {
			final WorkspaceResourceBean workspaceResourceBean = (WorkspaceResourceBean) getSelectedUserObject();

			final ActionBean actionBean = actionEvent.getActionBean();

			Job job = new Job(actionBean.getLabel()) {
				protected IStatus run(final IProgressMonitor monitor) {
					try {

						final BusinessCodeGenerateContext generateContext = BusinessCodeGenerateUtils
								.startGeneration();

						generateContext
								.setBaseDirectory(IOurTeamServiceConst.WORKSPACE_SERVICE
										.getWorkspaceResourceFileObject(workspaceResourceBean));

						WorkspaceResourceBusinessPackageRelateBean[] packageRelateBeans = IOurTeamServiceConst.WORKSPACE_SERVICE
								.getWorkspaceResourceBusinessPackageRelates(workspaceResourceBean
										.getId());

						WorkspaceConfigPropertyBean[] daoConfigPropertyBeans = IOurTeamServiceConst.WORKSPACE_SERVICE
								.getWorkspaceConfigPropertiesByConfigItem(
										workspaceResourceBean.getWorkspaceId(),
										"generator.DAO");

						for (int i = 0; i < daoConfigPropertyBeans.length; i++) {
							WorkspaceConfigPropertyBean workspaceConfigPropertyBean = daoConfigPropertyBeans[i];
							generateContext
									.getDaoGenerateConfig()
									.put(workspaceConfigPropertyBean
											.getConfigProperty(),
											workspaceConfigPropertyBean
													.getConfigValue());
						}

						WorkspaceConfigPropertyBean[] serviceConfigPropertyBeans = IOurTeamServiceConst.WORKSPACE_SERVICE
								.getWorkspaceConfigPropertiesByConfigItem(
										workspaceResourceBean.getWorkspaceId(),
										"generator.Service");

						for (int i = 0; i < serviceConfigPropertyBeans.length; i++) {
							WorkspaceConfigPropertyBean workspaceConfigPropertyBean = serviceConfigPropertyBeans[i];
							generateContext
									.getServiceGenerateConfig()
									.put(workspaceConfigPropertyBean
											.getConfigProperty(),
											workspaceConfigPropertyBean
													.getConfigValue());
						}

						final long[] packageIds = new long[packageRelateBeans.length];

						for (int i = 0; i < packageIds.length; i++) {
							packageIds[i] = packageRelateBeans[i]
									.getBusinessPcakageId();
						}

						generateContext
								.addGenerateListener(new IBusinessCodeGenerateListener() {

									@Override
									public void fireBeginGeneration(
											int totalCount) {
										monitor.beginTask(
												actionBean.getLabel(),
												totalCount);
									}

									@Override
									public void fireBusinessCodeGenerated(
											int index, Object businessObjectBean) {

										monitor.subTask("完成量 ("
												+ index
												+ "/"
												+ generateContext
														.getTotalBusinessObjectCount()
												+ ")");

										monitor.worked(1);

									}

									@Override
									public void fireBusinessCodeGenerateError(
											int index,
											Object businessObjectBean,
											final Exception e) {

										getSite().getShell().getDisplay()
												.asyncExec(new Runnable() {
													public void run() {
														MessageDialog
																.openError(
																		getSite()
																				.getShell(),
																		"Error",
																		e.getLocalizedMessage());
													}
												});
										logger.error(
												"BusinessObjectGenerateError",
												e);

									}
								});

						BusinessCodeGenerateUtils.generateBusinessFileObjects(
								generateContext, packageIds);

						monitor.done();

						return Status.OK_STATUS;

					} catch (Exception e) {
						logger.error("gen code error", e);
						return Status.CANCEL_STATUS;
					}

				}
			};

			job.setPriority(Job.SHORT);

			job.setUser(true);

			job.addJobChangeListener(new JobChangeAdapter() {
				public void done(final IJobChangeEvent event) {

					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							refreshSelectedTreeNode();

						}
					});
				}
			});

			job.schedule();

		}

		public void addUIAcctionConfig(ActionEvent actionEvent)
				throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			File rootDir = IOurTeamServiceConst.WORKSPACE_SERVICE.getWorkspaceRootFileObject();

			CreateUIActionConfigFileDialogProvider dialogProvider = new CreateUIActionConfigFileDialogProvider(
					new File(rootDir, workspaceBean.getWorkspacePath()));

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}
		}

		public void addUISelectListConfig(ActionEvent actionEvent)
				throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			File rootDir = IOurTeamServiceConst.WORKSPACE_SERVICE.getWorkspaceRootFileObject();

			CreateUISelectListConfigFileDialogProvider dialogProvider = new CreateUISelectListConfigFileDialogProvider(
					new File(rootDir, workspaceBean.getWorkspacePath()));

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}
		}

		public void addUIFormConfig(ActionEvent actionEvent) throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			File rootDir = IOurTeamServiceConst.WORKSPACE_SERVICE.getWorkspaceRootFileObject();

			CreateUIFormListConfigFileDialogProvider dialogProvider = new CreateUIFormListConfigFileDialogProvider(
					new File(rootDir, workspaceBean.getWorkspacePath()));

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}
		}

		public void addUITableConfig(ActionEvent actionEvent) throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			File rootDir = IOurTeamServiceConst.WORKSPACE_SERVICE.getWorkspaceRootFileObject();

			CreateUITableConfigFileDialogProvider dialogProvider = new CreateUITableConfigFileDialogProvider(
					new File(rootDir, workspaceBean.getWorkspacePath()));

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}
		}

		public void addUITreeConfig(ActionEvent actionEvent) throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			File rootDir = IOurTeamServiceConst.WORKSPACE_SERVICE.getWorkspaceRootFileObject();

			CreateUITreeConfigFileDialogProvider dialogProvider = new CreateUITreeConfigFileDialogProvider(
					new File(rootDir, workspaceBean.getWorkspacePath()));

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}
		}

		public void addUITabConfig(ActionEvent actionEvent) throws Exception {
			final WorkspaceBean workspaceBean = (WorkspaceBean) getSelectedUserObject();

			File rootDir = IOurTeamServiceConst.WORKSPACE_SERVICE.getWorkspaceRootFileObject();

			CreateUITabConfigFileDialogProvider dialogProvider = new CreateUITabConfigFileDialogProvider(
					new File(rootDir, workspaceBean.getWorkspacePath()));

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}
		}

	}

}
