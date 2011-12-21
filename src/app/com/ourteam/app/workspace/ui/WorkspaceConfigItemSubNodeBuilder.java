package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.workspace.domain.WorkspaceConfigBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class WorkspaceConfigItemSubNodeBuilder implements
		ISubNodeBuilder<WorkspaceConfigBean, WorkspaceConfigBean> {

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();
	
	private long workspaceId;

	@Override
	public WorkspaceConfigBean[] getSubNodes(WorkspaceConfigBean aParentObject)
			throws Exception {
		
		long parentConfigId = 0;
		
		if(aParentObject != null){
			parentConfigId = aParentObject.getId();
		}
		
		return WORKSPACE_SERVICE.getWorkspaceConfigs(workspaceId, parentConfigId);
	}

	@Override
	public String getSubNodeDefineId(WorkspaceConfigBean nodeObject) {
		return "CONFIG_ITEM";
	}

	@Override
	public String[] getSubNodeActionGroupIds(WorkspaceConfigBean nodeObject) {
		return null;
	}

	public long getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(long workspaceId) {
		this.workspaceId = workspaceId;
	}

}
