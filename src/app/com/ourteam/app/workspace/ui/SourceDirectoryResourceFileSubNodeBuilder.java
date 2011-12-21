package com.ourteam.app.workspace.ui;

import java.io.File;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;

public class SourceDirectoryResourceFileSubNodeBuilder extends
		DirectoryResourceFileSubNodeBuilder {

	@Override
	protected String getFileType(WorkspaceResourceFileObject parentObject,
			File file) {
		return WorkspaceResourceTypeEnum.SOURCE_CODE.getName();
	}

}
