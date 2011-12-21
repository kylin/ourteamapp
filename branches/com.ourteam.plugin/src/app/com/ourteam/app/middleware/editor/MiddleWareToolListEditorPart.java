package com.ourteam.app.middleware.editor;

import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractTreeViewerEditorPart;
import net.ui.eclipse.utils.AbstractFormDialogProvider;
import net.ui.eclipse.utils.SWTUtils;

import org.eclipse.jface.viewers.TreeViewer;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.hr.domain.EmployeeBean;
import com.ourteam.middleware.domain.MiddleWareProviderBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;
import com.ourteam.middleware.domain.MiddleWareToolGroupBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class MiddleWareToolListEditorPart
		extends
		AbstractTreeViewerEditorPart<MiddleWareTypeEnum, MiddleWareTypeEditorInput> {

	@Override
	protected String getTableConfigId() {
		return "middleWareToolsTreeTable";
	}

	@Override
	protected String getTreeConfigId() {
		return "ui/middleware/middle_ware_tools.tree";
	}


	@Override
	protected String getEditActionId() {
		return null;
	}

	@Override
	protected void saveDataModel(MiddleWareTypeEnum aDataModel)
			throws Exception {

	}

	@Override
	protected void reloadDataModel() throws Exception {

	}

	@Override
	protected Object getTreeRootNodeUserObject() throws Exception {
		return getDataModel();
	}

	@Override
	protected int getDefaultExpandToLevel() {
		return TreeViewer.ALL_LEVELS;
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	public class ActionHandler extends TreeEditorActionHandler {

		public void addMiddleWareTool(ActionEvent actionEvent) throws Exception {

			final MiddleWareToolGroupBean middleWareToolGroupBean = (MiddleWareToolGroupBean) getSelectedUserObjects()[0];

			AbstractFormDialogProvider<MiddleWareToolBean> dialogProvider = new AbstractFormDialogProvider<MiddleWareToolBean>(
					new MiddleWareToolBean()) {

				@Override
				public String getTitle() {
					return "添加管理工具";
				}

				@Override
				protected String getFormConfigId() {
					return "middleWareToolInfoForm";
				}

				@Override
				public boolean doOkPressed() throws Exception {
					if (super.doOkPressed()) {

						MiddleWareToolBean middleWareToolBean = getFormDataModel();

						EmployeeBean employeeBean = null;

						middleWareToolBean
								.setLastEditorId(employeeBean.getId());

						IOurTeamServiceConst.MIDDLE_WARE_SERVICE
								.addMiddleWareTool(
										middleWareToolGroupBean.getId(),
										middleWareToolBean);

						return true;
					} else {
						return false;
					}
				}
			};

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}

		}

		public void addMiddleWareToolGroup(ActionEvent actionEvent)
				throws Exception {

			final Object selectedObject = getSelectedUserObjects()[0];

			AbstractFormDialogProvider<MiddleWareToolGroupBean> dialogProvider = new AbstractFormDialogProvider<MiddleWareToolGroupBean>(
					new MiddleWareToolGroupBean()) {

				@Override
				public String getTitle() {
					return "添加分组";
				}

				@Override
				protected String getFormConfigId() {
					return "middleWareToolGroupForm";
				}

				@Override
				public boolean doOkPressed() throws Exception {
					if (super.doOkPressed()) {

						MiddleWareToolGroupBean middleWareToolGroup = getFormDataModel();

						long providerId = 0;

						long parentGroupId = 0;

						if (selectedObject instanceof MiddleWareProviderBean) {
							providerId = ((MiddleWareProviderBean) selectedObject)
									.getId();
						} else if (selectedObject instanceof MiddleWareToolGroupBean) {
							providerId = ((MiddleWareToolGroupBean) selectedObject)
									.getProviderId();
							parentGroupId = ((MiddleWareToolGroupBean) selectedObject)
									.getId();
						}

						middleWareToolGroup.setParentGroupId(parentGroupId);

						IOurTeamServiceConst.MIDDLE_WARE_SERVICE
								.addMiddleWareToolGroup(providerId,
										middleWareToolGroup);

						return true;
					} else {
						return false;
					}
				}

			};

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}

		}

		public void deleteMiddleWareToolGroup(ActionEvent actionEvent)
				throws Exception {

			final MiddleWareToolGroupBean middleWareToolGroupBean = (MiddleWareToolGroupBean) getSelectedUserObjects()[0];

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.deleteMiddleWareToolGroups(new long[] { middleWareToolGroupBean
							.getId() });

			refreshSelectedParentTreeNode();
		}

		public void deleteMiddleWareTool(ActionEvent actionEvent)
				throws Exception {

			final MiddleWareToolBean middleWareToolBean = (MiddleWareToolBean) getSelectedUserObjects()[0];

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.deleteMiddleWareTools(new long[] { middleWareToolBean
							.getId() });

			refreshSelectedParentTreeNode();
		}

		public void editMiddleWareTool(ActionEvent actionEvent)
				throws Exception {

			MiddleWareToolEditorProvider editorProvider = new MiddleWareToolEditorProvider();

			openEditor(editorProvider);

		}

		public void editMiddleWareToolGroup(ActionEvent actionEvent)
				throws Exception {

			final MiddleWareToolGroupBean middleWareToolGroup = (MiddleWareToolGroupBean) getSelectedUserObjects()[0];

			AbstractFormDialogProvider<MiddleWareToolGroupBean> dialogProvider = new AbstractFormDialogProvider<MiddleWareToolGroupBean>(
					middleWareToolGroup) {

				@Override
				public String getTitle() {
					return "编辑分组'" + middleWareToolGroup.getGroupName() + "'";
				}

				@Override
				protected String getFormConfigId() {
					return "middleWareToolGroupForm";
				}

				@Override
				public boolean doOkPressed() throws Exception {
					if (super.doOkPressed()) {

						MiddleWareToolGroupBean middleWareToolGroup = getFormDataModel();

						IOurTeamServiceConst.MIDDLE_WARE_SERVICE
								.modifyMiddleWareToolGroup(middleWareToolGroup);

						return true;
					} else {
						return false;
					}
				}

			};

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				refreshSelectedTreeNode();
			}

		}
	}

}
