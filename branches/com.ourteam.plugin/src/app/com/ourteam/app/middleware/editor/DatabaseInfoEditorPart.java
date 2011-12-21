package com.ourteam.app.middleware.editor;

public class DatabaseInfoEditorPart extends
		AbstractMiddleWareServerInfoEditorPart {

	public static final String EDITOR_ID = "com.ourteam.app.middleware.editor.DatabaseInfoEditorPart";

	@Override
	protected String getFormId() {
		return "databaseInfoForm";
	}

}
