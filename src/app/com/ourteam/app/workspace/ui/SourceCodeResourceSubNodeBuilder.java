package com.ourteam.app.workspace.ui;

import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceResourceBean;

public class SourceCodeResourceSubNodeBuilder extends
		AbstractWorkspaceResourceSubNodeBuilder {

	@Override
	public String[] getSubNodeActionGroupIds(WorkspaceResourceBean nodeObject) {
		return new String[] { "codeResourceActionGroup" };
	}

	@Override
	protected WorkspaceResourceTypeEnum getWorkspaceResourceTypeEnum() {
		return WorkspaceResourceTypeEnum.SOURCE_CODE;
	}

}
