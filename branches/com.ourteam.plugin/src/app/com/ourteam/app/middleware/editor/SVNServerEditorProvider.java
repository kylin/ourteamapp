package com.ourteam.app.middleware.editor;


public class SVNServerEditorProvider extends
		AbstractMiddleWareServerEditorProvider {

	@Override
	protected String getTreeNodeType() {
		return "SVN";
	}

	@Override
	protected String getEditorTabId() {
		return "svnEditorTab";
	}

}
