package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractTreeNodeMultiPageEditorAgentProvider;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.model.tree.NodeBean;

import com.ourteam.middleware.domain.MiddleWareToolBean;

public class MiddleWareToolEditorProvider extends
		AbstractTreeNodeMultiPageEditorAgentProvider<MiddleWareToolBean> {

	@Override
	protected String getTreeNodeType() {
		return "middleWareTool";
	}

	@Override
	protected IDataModelEditorInput<MiddleWareToolBean> getModelObjectEditorInput(
			MiddleWareToolBean editObject, NodeBean nodeBean) {
		return new MiddleWareToolEditorInput(editObject);
	}

}
