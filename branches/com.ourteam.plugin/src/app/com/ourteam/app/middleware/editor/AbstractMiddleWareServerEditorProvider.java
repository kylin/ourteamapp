package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractTreeNodeMultiPageEditorAgentProvider;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.model.tree.NodeBean;

import com.ourteam.middleware.domain.MiddleWareBean;

public abstract class AbstractMiddleWareServerEditorProvider extends
		AbstractTreeNodeMultiPageEditorAgentProvider<MiddleWareBean> {

	abstract protected String getEditorTabId();

	@Override
	protected IDataModelEditorInput<MiddleWareBean> getModelObjectEditorInput(
			MiddleWareBean editObject, NodeBean nodeBean) {
		return new MiddleWareServerEditorInput(editObject, getEditorTabId());
	}

}
