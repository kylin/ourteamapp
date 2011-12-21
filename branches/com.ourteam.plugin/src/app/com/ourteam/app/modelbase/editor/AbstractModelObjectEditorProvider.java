package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractTreeNodeEditorProvider;

public abstract class AbstractModelObjectEditorProvider<T> extends
		AbstractTreeNodeEditorProvider<T> {

	abstract protected String getModelObjectType();

	@Override
	protected String getTreeNodeType() {
		return getModelObjectType();
	}

}
