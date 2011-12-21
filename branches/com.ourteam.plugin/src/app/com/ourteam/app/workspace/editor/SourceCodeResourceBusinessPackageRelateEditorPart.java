package com.ourteam.app.workspace.editor;

import java.util.List;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractObjectRelationDataListEditorPart;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;

import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.WorkspaceResourceEditorInput;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class SourceCodeResourceBusinessPackageRelateEditorPart
		extends
		AbstractObjectRelationDataListEditorPart<WorkspaceResourceBean, WorkspaceResourceEditorInput, WorkspaceResourceBusinessPackageRelateBean> {

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	@Override
	protected String getTableConfigId() {
		return "workspaceSourceCodeResourceBusinessPackageRelate";
	}

	@Override
	protected WorkspaceResourceBusinessPackageRelateBean[] getDataList(
			WorkspaceResourceBean dataModel) throws Exception {
		return WORKSPACE_SERVICE
				.getWorkspaceResourceBusinessPackageRelates(dataModel.getId());

	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "relationActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	class ActionHandler extends ObjectRelationActionHandler {

		@Override
		protected void doRemoveRelations(
				List<WorkspaceResourceBusinessPackageRelateBean> items)
				throws Exception {

			long[] relatedIds = new long[items.size()];

			for (int i = 0; i < relatedIds.length; i++) {
				relatedIds[i] = items.get(i).getId();

			}

			WorkspaceServiceFactory.getWorkspaceService()
					.removeWorkspaceResourceBusinessPackageRelates(relatedIds);

		}

		@Override
		protected IWizardProvider getAddRelationWizardProvider(ActionBean actionBean)
				throws Exception {
			return new AddWorkspaceResourceBusinessPackageWizardProvider(
					getDataModel().getId());
		}

		@Override
		protected IDialogProvider getEditDialogProvider(
				List<WorkspaceResourceBusinessPackageRelateBean> items)
				throws Exception {
			return null;
		}

	}

}
