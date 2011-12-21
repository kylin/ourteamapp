package com.ourteam.app.workspace.editor;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class JavaFileResourceContentEditor extends
		AbstractFileResourceContentEditor {

	@Override
	protected boolean canEdit(WorkspaceResourceFileObject resourceFileObject) {
		return false;
	}

}
