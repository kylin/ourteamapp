package com.ourteam.app.workspace.editor;

import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;

public class AddLibaryResourceWizardProvider extends
		AbstractAddWorkspaceResourceWizardProvider {

	public AddLibaryResourceWizardProvider(long workspaceId) {
		super(workspaceId);
	}

	@Override
	protected WorkspaceResourceTypeEnum getWorkspaceResourceTypeEnum() {
		return WorkspaceResourceTypeEnum.DEPEND_LIBARY;
	}

}
