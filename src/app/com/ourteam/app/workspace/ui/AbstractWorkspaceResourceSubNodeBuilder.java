package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public abstract class AbstractWorkspaceResourceSubNodeBuilder implements
		ISubNodeBuilder<WorkspaceBean, WorkspaceResourceBean> {

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	abstract protected WorkspaceResourceTypeEnum getWorkspaceResourceTypeEnum();

	@Override
	public WorkspaceResourceBean[] getSubNodes(WorkspaceBean aParentObject)
			throws Exception {

		return WORKSPACE_SERVICE
				.getWorkspaceResources(
						aParentObject.getId(),
						new WorkspaceResourceTypeEnum[] { getWorkspaceResourceTypeEnum() });

	}

	@Override
	public String getSubNodeDefineId(WorkspaceResourceBean nodeObject) {
		return getWorkspaceResourceTypeEnum().getName();
	}


}
