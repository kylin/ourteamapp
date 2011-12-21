package com.ourteam.app.workspace.ui;

import java.io.File;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class WorkspaceResourceFileSubNodeBuilder extends
		AbstractResourceFileSubNodeBuilder<WorkspaceResourceBean> {

	private static final IWorkspaceService workspaceService = WorkspaceServiceFactory
			.getWorkspaceService();

	@Override
	public WorkspaceResourceFileObject[] getSubNodes(
			WorkspaceResourceBean aParentObject) throws Exception {

		File resourceFile = workspaceService
				.getWorkspaceResourceFileObject(aParentObject);

		return getFileList(aParentObject, resourceFile, null);

	}

	@Override
	protected String getFileType(WorkspaceResourceBean parentObject, File file) {
		return WorkspaceResourceTypeEnum.SOURCE_CODE.getName();
	}

}
