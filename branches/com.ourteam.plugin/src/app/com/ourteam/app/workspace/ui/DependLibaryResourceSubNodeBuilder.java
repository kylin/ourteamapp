package com.ourteam.app.workspace.ui;

import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceResourceBean;

public class DependLibaryResourceSubNodeBuilder extends
		AbstractWorkspaceResourceSubNodeBuilder {

	@Override
	public String[] getSubNodeActionGroupIds(WorkspaceResourceBean nodeObject) {
		return new String[] { "libaryResourceActionGroup" };
	}

	@Override
	protected WorkspaceResourceTypeEnum getWorkspaceResourceTypeEnum() {
		return WorkspaceResourceTypeEnum.DEPEND_LIBARY;
	}

}
