package com.ourteam.app.workspace.editor;

import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;

public class AddSourceCodeResourceWizardProvider extends
		AbstractAddWorkspaceResourceWizardProvider {

	public AddSourceCodeResourceWizardProvider(long workspaceId) {
		super(workspaceId);
	}

	@Override
	protected WorkspaceResourceTypeEnum getWorkspaceResourceTypeEnum() {
		return WorkspaceResourceTypeEnum.SOURCE_CODE;
	}

}
