package com.ourteam.app.middleware.editor;

public class SVNServerInfoEditorPart extends
		AbstractMiddleWareServerInfoEditorPart {

	public static final String EDITOR_ID = "com.ourteam.app.middleware.editor.SVNServerInfoEditorPart";

	@Override
	protected String getFormId() {
		return "svnServerInfoForm";
	}

}
