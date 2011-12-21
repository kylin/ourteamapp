package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractTreeViewerEditorPart;
import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.IFormFieldStatusChangeListener;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.utils.AbstractComboListProvider;
import net.ui.eclipse.utils.AbstractFormDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.action.ActionSetBean;
import net.ui.model.action.ActionSetConfigBean;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;

import com.ourteam.app.utils.UIConfigUtils;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;
import com.ourteam.app.workspace.ui.AbstractUIActionSubNodeBuilder;
import com.ourteam.app.workspace.ui.UIActionDomainBean;

public class UIActionConfigEditorPart
		extends
		AbstractTreeViewerEditorPart<WorkspaceResourceFileObject, FileResourceEditorInput> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(UIActionConfigEditorPart.class);

	private ActionSetBean actionSetBean;

	@Override
	public boolean showCheckBox() {
		return true;
	}

	@Override
	public boolean allowMultiSelection() {
		return false;
	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "uiActionConfigEditorActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHndler();
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUIActionConfig(actionSetBean, outputWriter);

		FileUtils.writeStringToFile(aDataModel.getResourceFile(),
				outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

	@Override
	protected void reloadDataModel() throws Exception {

	}

	@Override
	protected String getTableConfigId() {
		return "uiActionDefineTable";
	}

	@Override
	protected String getTreeConfigId() {
		return "ui/work/ui_action.tree";
	}

	@Override
	protected Object getTreeRootNodeUserObject() throws Exception {
		File file = getDataModel().getResourceFile();
		ActionSetConfigBean actionSetConfig = new ActionSetConfigBean();

		actionSetConfig.init(FileUtils.openInputStream(file), true);

		return actionSetBean = actionSetConfig.getActionSet();

	}

	@Override
	protected void initTreeSubNodeBuilder(String id,
			ISubNodeBuilder<?, ?> builder) {
		if (builder instanceof AbstractUIActionSubNodeBuilder) {
			((AbstractUIActionSubNodeBuilder) builder)
					.setActionSetBean(actionSetBean);
		} else {
			super.initTreeSubNodeBuilder(id, builder);
		}

	}

	

	class ActionHndler extends TreeEditorActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if ("delete".equalsIgnoreCase(aAction.getId())) {
				return ArrayUtils.isEmpty(getCheckedTreeNodeItems()) == false;
			} else if ("edit".equalsIgnoreCase(aAction.getId())) {
				return ArrayUtils.isEmpty(getSlectedTreeNodeItems()) == false;
			} else if ("moveUp".equalsIgnoreCase(aAction.getId())) {
				TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

				return treeNodeItem.getParentNodeItem().getChildTreeNodeItems()
						.indexOf(treeNodeItem) > 0;
			} else if ("moveDown".equalsIgnoreCase(aAction.getId())) {
				TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

				return treeNodeItem.getParentNodeItem().getChildTreeNodeItems()
						.indexOf(treeNodeItem) < treeNodeItem
						.getParentNodeItem().getChildTreeNodeItems().size() - 1;
			} else {
				return true;
			}

		}

		public void moveUp(ActionEvent actionEvent) throws Exception {
			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			ActionBean actionBean = (ActionBean) treeNodeItem.getUserObject();

			ActionBean[] actionBeans = null;

			if (treeNodeItem.getParentNodeItem().getNodeConfig().getId()
					.equals("UI_ACTION_GROUP")) {

				ActionGroupBean actionGroupBean = (ActionGroupBean) treeNodeItem
						.getParentNodeItem().getUserObject();

				actionBeans = actionGroupBean.getActionBeans();

			} else if (treeNodeItem.getParentNodeItem().getNodeConfig().getId()
					.equals("UI_ACTION")) {

				ActionBean parentActionBean = (ActionBean) treeNodeItem
						.getParentNodeItem().getUserObject();

				actionBeans = parentActionBean.getSubActionBeans();

			}

			int index = ArrayUtils.indexOf(actionBeans, actionBean);

			ActionBean willMoveDown = actionBeans[index - 1];

			actionBeans[index - 1] = actionBean;

			actionBeans[index] = willMoveDown;
			
			refreshNode(treeNodeItem.getParentNodeItem());
			
			setDirty(true);
			
		}

		public void moveDown(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			ActionBean actionBean = (ActionBean) treeNodeItem.getUserObject();

			ActionBean[] actionBeans = null;

			if (treeNodeItem.getParentNodeItem().getNodeConfig().getId()
					.equals("UI_ACTION_GROUP")) {

				ActionGroupBean actionGroupBean = (ActionGroupBean) treeNodeItem
						.getParentNodeItem().getUserObject();

				actionBeans = actionGroupBean.getActionBeans();

			} else if (treeNodeItem.getParentNodeItem().getNodeConfig().getId()
					.equals("UI_ACTION")) {

				ActionBean parentActionBean = (ActionBean) treeNodeItem
						.getParentNodeItem().getUserObject();

				actionBeans = parentActionBean.getSubActionBeans();
			}

			int index = ArrayUtils.indexOf(actionBeans, actionBean);

			ActionBean willMoveUp = actionBeans[index + 1];

			actionBeans[index + 1] = actionBean;

			actionBeans[index] = willMoveUp;
			
			refreshNode(treeNodeItem.getParentNodeItem());
			
			setSelection(new StructuredSelection(treeNodeItem));
			
			setDirty(true);
		}

		public void delete(ActionEvent actionEvent) throws Exception {

			TreeNodeItem[] treeNodeItems = getCheckedTreeNodeItems();

			for (int i = 0; i < treeNodeItems.length; i++) {
				TreeNodeItem treeNodeItem = treeNodeItems[i];

				Object object = treeNodeItem.getUserObject();

				if (object instanceof ActionBean) {

					ActionBean selectedActionBean = (ActionBean) object;

					if (treeNodeItem.getParentNodeItem().getNodeConfig()
							.getId().equals("UI_ACTION_GROUP")) {

						ActionGroupBean actionGroupBean = (ActionGroupBean) treeNodeItem
								.getParentNodeItem().getUserObject();

						List<ActionBean> beans = new ArrayList<ActionBean>();

						ActionBean[] actionBeans = actionGroupBean
								.getActionBeans();

						for (int j = 0; j < actionBeans.length; j++) {
							ActionBean actionBean = actionBeans[j];
							if (actionBean.getRef().equals(
									selectedActionBean.getRef()) == false) {
								beans.add(actionBean);
							}
						}

						actionGroupBean.setActionBeans(beans
								.toArray(new ActionBean[beans.size()]));

					} else if (treeNodeItem.getParentNodeItem().getNodeConfig()
							.getId().equals("UI_ACTION")) {

						ActionBean parentActionBean = (ActionBean) treeNodeItem
								.getParentNodeItem().getUserObject();

						ActionBean[] subActionBeans = parentActionBean
								.getSubActionBeans();

						List<ActionBean> beans = new ArrayList<ActionBean>();

						for (int j = 0; j < subActionBeans.length; j++) {
							ActionBean actionBean = subActionBeans[j];
							if (actionBean.getId().equals(
									selectedActionBean.getId()) == false) {
								beans.add(actionBean);
							}
						}

						parentActionBean.setSubActionBeans(beans
								.toArray(new ActionBean[beans.size()]));

					} else if (treeNodeItem.getParentNodeItem().getNodeConfig()
							.getId().equals("UI_ACTION_DOMAIN")) {

						ActionBean[] actionBeans = actionSetBean.getActions();

						List<ActionBean> beans = new ArrayList<ActionBean>();

						for (int j = 0; j < actionBeans.length; j++) {
							ActionBean actionBean = actionBeans[j];
							if (actionBean.getId().equals(
									selectedActionBean.getId()) == false) {
								beans.add(actionBean);
							}
						}

						ActionGroupBean[] actionGroupBeans = actionSetBean
								.getActionGroups();

						for (int j = 0; j < actionGroupBeans.length; j++) {
							ActionGroupBean actionGroupBean = actionGroupBeans[j];
							List<ActionBean> beanRefs = new ArrayList<ActionBean>();
							ActionBean[] actionRef = actionGroupBean
									.getActionBeans();

							for (int k = 0; k < actionRef.length; k++) {
								ActionBean actionBean = actionRef[k];
								if (actionBean.getRef().equals(
										selectedActionBean.getId()) == false
										&& actionBean.getRef().equals(
												selectedActionBean.getDomain()
														+ "."
														+ selectedActionBean
																.getId()) == false) {
									beanRefs.add(actionBean);
								} else {

								}
							}

							actionGroupBean.setActionBeans(beanRefs
									.toArray(new ActionBean[beanRefs.size()]));

						}

						actionSetBean.setActions(beans
								.toArray(new ActionBean[beans.size()]));

					}

					refreshNode(treeNodeItem.getParentNodeItem());

				} else if (object instanceof ActionGroupBean) {
					ActionGroupBean selectedActionGroupBean = (ActionGroupBean) object;

					List<ActionGroupBean> groupBeans = new ArrayList<ActionGroupBean>();

					ActionGroupBean[] actionGroupBeans = actionSetBean
							.getActionGroups();

					for (int j = 0; j < actionGroupBeans.length; j++) {
						ActionGroupBean actionGroupBean = actionGroupBeans[j];

						if (actionGroupBean.getId().equals(
								selectedActionGroupBean.getId()) == false) {
							groupBeans.add(actionGroupBean);
						}

					}

					actionSetBean.setActionGroups(groupBeans
							.toArray(new ActionGroupBean[groupBeans.size()]));

					refreshNode(treeNodeItem.getParentNodeItem());

				} else if (object instanceof UIActionDomainBean) {

					UIActionDomainBean domainBean = (UIActionDomainBean) object;

					ActionBean[] actionBeans = actionSetBean.getActions();

					for (int j = 0; j < actionBeans.length; j++) {
						ActionBean action = actionBeans[j];
						if (domainBean.getId().equals(action.getDomain())) {
							action.setDomain("");
						}
					}

					actionSetBean.setActions(actionBeans);

					ActionGroupBean[] actionGroupBeans = actionSetBean
							.getActionGroups();

					for (int j = 0; j < actionGroupBeans.length; j++) {
						ActionGroupBean actionGroupBean = actionGroupBeans[j];

						ActionBean[] refActionBeans = actionGroupBean
								.getActionBeans();

						for (int k = 0; k < refActionBeans.length; k++) {
							ActionBean actionBean = refActionBeans[k];
							if (StringUtils.startsWith(actionBean.getRef(),
									domainBean.getId() + ".")) {
								actionBean.setRef(StringUtils.remove(
										actionBean.getRef(), domainBean.getId()
												+ "."));
							}

							if (domainBean.getId().equals(
									actionBean.getDomain())) {
								actionBean.setDomain("");
							}
						}

						actionGroupBean.setActionBeans(refActionBeans);

					}

					refreshNode(treeNodeItem.getParentNodeItem());

				}

			}

			clearCheckedItems();

			setDirty(true);
		}

		public void edit(ActionEvent actionEvent) throws Exception {

			TreeNodeItem treeNodeItem = getSlectedTreeNodeItems()[0];

			Object object = treeNodeItem.getUserObject();

			if (object instanceof ActionBean) {

				ActionBean selectedActionBean = (ActionBean) object;

				if (treeNodeItem.getParentNodeItem().getNodeConfig().getId()
						.equals("UI_ACTION_GROUP")) {

					ActionGroupBean actionGroupBean = (ActionGroupBean) treeNodeItem
							.getParentNodeItem().getUserObject();

					ActionBean[] actionBeans = actionGroupBean.getActionBeans();

					ActionBean editActionBean = null;

					for (int i = 0; i < actionBeans.length; i++) {
						ActionBean actionBean = actionBeans[i];
						if (actionBean.getRef().equals(
								selectedActionBean.getRef())) {
							editActionBean = actionBean;
							break;
						}
					}

					AbstractFormDialogProvider<ActionBean> dialogProvider = new AbstractFormDialogProvider<ActionBean>(
							editActionBean) {

						@Override
						public String getTitle() {
							return "编辑动作引用信息";
						}

						@Override
						protected String getFormConfigId() {
							return "uiActionRefConfigForm";
						}

						@Override
						protected void initFormOptionListDataProviders(
								Map<String, IFormOptionListDataProvider> listDataProiverMap) {

							UIActionDomainComboListProvider listProvider = new UIActionDomainComboListProvider(
									actionSetBean);

							listDataProiverMap.put("getUIActionDomains",
									new FormOptionListDataProviderAdapter(
											listProvider));
						}
					};

					if (SWTUtils.openDialog(getSite().getShell(),
							dialogProvider)) {

						dialogProvider.getFormDataModel();

					}

				} else if (treeNodeItem.getParentNodeItem().getNodeConfig()
						.getId().equals("UI_ACTION")
						|| treeNodeItem.getParentNodeItem().getNodeConfig()
								.getId().equals("UI_ACTION_DOMAIN")) {

					String domain = selectedActionBean.getDomain();

					UIActionConfigDialogProvider dialogProvider = new UIActionConfigDialogProvider(
							actionSetBean, selectedActionBean);

					if (SWTUtils.openDialog(getSite().getShell(),
							dialogProvider)) {

						treeNodeItem.setUserObject(dialogProvider
								.getFormDataModel());

						if (domain.equals(selectedActionBean.getDomain())) {

							update(treeNodeItem);
						} else {
							changeActionDomain(
									new ActionBean[] { selectedActionBean },
									domain, selectedActionBean.getDomain());

							refreshTree();
						}

						setDirty(true);
					}

				}

			} else if (object instanceof ActionGroupBean) {

				final ActionGroupBean selectedActionGroupBean = (ActionGroupBean) object;

				UIActionGroupConfigDialogProvider dialogProvider = new UIActionGroupConfigDialogProvider(
						actionSetBean, selectedActionGroupBean);

				if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

					update(treeNodeItem);

					setDirty(true);
				}
			} else if (object instanceof UIActionDomainBean) {
				final UIActionDomainBean selecteddomain = (UIActionDomainBean) object;

				UIActionDomainBean actionDomainBean = new UIActionDomainBean();

				actionDomainBean.setId(selecteddomain.getId());

				AbstractFormDialogProvider<UIActionDomainBean> dialogProvider = new AbstractFormDialogProvider<UIActionDomainBean>(
						actionDomainBean) {

					@Override
					public String getTitle() {
						return "编辑域";
					}

					@Override
					protected String getFormConfigId() {
						return "uiActionDomainConfigForm";
					}

					@Override
					public int getInitialHeight() {
						return 300;
					}

					@Override
					public int getInitialWidth() {
						return 400;
					}

					@Override
					public IFormFieldStatusChangeListener getFormFieldStatusChangeListener() {
						return new IFormFieldStatusChangeListener() {

							@Override
							public void fieldStatusChanged(String widgetId,
									Map<String, Widget> formWidgetMap) {
								if (ActionSetBean.GLOBAL_DOMAIN_KEY
										.equals(selecteddomain.getId())) {
									((Control) formWidgetMap.get("id"))
											.setEnabled(false);
								}

							}

						};
					}

				};

				if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

					actionDomainBean = dialogProvider.getFormDataModel();

					if (actionDomainBean.getId().equals(selecteddomain.getId())) {
						return;
					}

					ActionBean[] actionBeans = actionSetBean
							.getActions(selecteddomain.getId());

					changeActionDomain(actionBeans, selecteddomain.getId(),
							actionDomainBean.getId());

					refreshTree();

					setDirty(true);
				}

			}

		}

		public void addUIAction(ActionEvent actionEvent) throws Exception {

			ActionBean actionBean = new ActionBean();

			UIActionConfigDialogProvider dialogProvider = new UIActionConfigDialogProvider(
					actionSetBean, actionBean);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

				actionSetBean.addAction(actionBean);

				refreshTree();

				setDirty(true);
			}
		}

		public void addChildUIAction(ActionEvent actionEvent) throws Exception {

			ActionBean parentActionBean = (ActionBean) getSelectedUserObjects()[0];

			ActionBean actionBean = new ActionBean();

			UIActionConfigDialogProvider dialogProvider = new UIActionConfigDialogProvider(
					actionSetBean, actionBean);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

				parentActionBean.addSubActionBean(actionBean);

				refreshNode(getSlectedTreeNodeItems()[0]);

				setDirty(true);
			}
		}

		public void addUIActionGroup(ActionEvent actionEvent) throws Exception {

			ActionGroupBean actionGroupBean = new ActionGroupBean();

			UIActionGroupConfigDialogProvider dialogProvider = new UIActionGroupConfigDialogProvider(
					actionSetBean, actionGroupBean);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

				actionSetBean.addActionGroup(actionGroupBean);

				refreshTree();

				setDirty(true);
			}
		}
	}

	public static class UIActionDomainComboListProvider extends
			AbstractComboListProvider<UIActionDomainBean> {

		private ActionSetBean actionSetBean;

		public UIActionDomainComboListProvider(ActionSetBean actionSetBean) {
			super();
			this.actionSetBean = actionSetBean;
		}

		@Override
		public UIActionDomainBean[] getDataList() {
			String[] domainIds = actionSetBean.getActionDomains();

			UIActionDomainBean[] domainBeans = new UIActionDomainBean[domainIds.length];

			for (int i = 0; i < domainBeans.length; i++) {
				domainBeans[i] = new UIActionDomainBean();
				domainBeans[i].setId(domainIds[i]);
			}

			return domainBeans;

		}

		@Override
		public String getDataLabel(UIActionDomainBean dataItem) {
			return dataItem.getId();
		}

	}

	public void changeActionDomain(ActionBean[] actionBeans,
			String oldDomainId, String newDomainId) {

		for (int i = 0; i < actionBeans.length; i++) {
			ActionBean actionBean = actionBeans[i];
			actionBean.setDomain(newDomainId);
		}

		actionSetBean.setActions(actionSetBean.getActions());

		ActionGroupBean[] actionGroupBeans = actionSetBean.getActionGroups();

		for (int i = 0; i < actionGroupBeans.length; i++) {
			ActionGroupBean actionGroupBean = actionGroupBeans[i];
			ActionBean[] refActionBeans = actionGroupBean.getActionBeans();

			for (int j = 0; j < refActionBeans.length; j++) {
				ActionBean actionBean = refActionBeans[j];
				if (StringUtils.startsWith(actionBean.getRef(), oldDomainId
						+ ".")) {
					if (StringUtils.isBlank(newDomainId)
							|| newDomainId
									.equals(ActionSetBean.GLOBAL_DOMAIN_KEY)) {
						actionBean.setRef(StringUtils.remove(
								actionBean.getRef(), oldDomainId + "."));

					} else {
						actionBean.setRef(StringUtils.replace(
								actionBean.getRef(), oldDomainId + ".",
								newDomainId + "."));
					}

				}
			}

		}
	}

	@Override
	protected String getEditActionId() {
		return "edit";
	}

}
