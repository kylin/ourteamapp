package com.ourteam.app.workspace.ui;

import java.io.File;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class WorkspaceFileSubNodeBuilder extends
		AbstractResourceFileSubNodeBuilder<WorkspaceBean> {
	
	private static final IWorkspaceService workspaceService = WorkspaceServiceFactory
			.getWorkspaceService();

	@Override
	public WorkspaceResourceFileObject[] getSubNodes(WorkspaceBean aParentObject)
			throws Exception {

		File file = workspaceService.getWorkspaceFileObject(aParentObject);

		return getFileList(aParentObject, file, null);
	}


	@Override
	protected String getFileType(WorkspaceBean parentObject, File file) {
		return null;
	}
}
