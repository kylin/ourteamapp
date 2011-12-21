package com.ourteam.app.middleware.editor;


public class CVSServerEditorProvider extends
		AbstractMiddleWareServerEditorProvider {

	@Override
	protected String getTreeNodeType() {
		return "CVS";
	}

	@Override
	protected String getEditorTabId() {
		return "cvsEditorTab";
	}

}
