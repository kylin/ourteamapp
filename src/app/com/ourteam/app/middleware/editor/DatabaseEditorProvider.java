package com.ourteam.app.middleware.editor;


public class DatabaseEditorProvider extends
		AbstractMiddleWareServerEditorProvider {

	@Override
	protected String getTreeNodeType() {
		return "DATABASE";

	}

	@Override
	protected String getEditorTabId() {
		return "databaseEditorTab";
	}

}
