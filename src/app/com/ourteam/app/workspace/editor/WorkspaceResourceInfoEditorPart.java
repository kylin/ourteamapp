package com.ourteam.app.workspace.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.WorkspaceResourceEditorInput;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class WorkspaceResourceInfoEditorPart
		extends
		AbstractFormEditorPart<WorkspaceResourceBean, WorkspaceResourceEditorInput> {

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	@Override
	protected String getFormId() {
		return "workspaceResourceForm";
	}

	@Override
	protected void saveDataModel(WorkspaceResourceBean aDataModel)
			throws Exception {
		WORKSPACE_SERVICE.modifyWorkspaceResource(aDataModel);

	}

}
