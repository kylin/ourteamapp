package com.ourteam.app.workspace.ui;

import java.io.File;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class DirectoryResourceFileSubNodeBuilder extends
		AbstractResourceFileSubNodeBuilder<WorkspaceResourceFileObject> {

	@Override
	public WorkspaceResourceFileObject[] getSubNodes(
			WorkspaceResourceFileObject aParentObject) throws Exception {

		File resourceFile = aParentObject.getResourceFile();

		return getFileList(aParentObject, resourceFile, null);
	}	

	@Override
	protected String getFileType(WorkspaceResourceFileObject parentObject,
			File file) {
		return null;
	}

}
