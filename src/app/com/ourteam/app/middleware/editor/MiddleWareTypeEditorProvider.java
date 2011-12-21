package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractTreeNodeMultiPageEditorAgentProvider;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.model.tree.NodeBean;

import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class MiddleWareTypeEditorProvider extends
		AbstractTreeNodeMultiPageEditorAgentProvider<MiddleWareTypeEnum> {

	private MiddleWareTypeEnum middleWareTypeEnum;

	public MiddleWareTypeEditorProvider(MiddleWareTypeEnum middleWareTypeEnum) {
		super();
		this.middleWareTypeEnum = middleWareTypeEnum;
	}

	@Override
	protected String getTreeNodeType() {
		return middleWareTypeEnum.getName();
	}

	@Override
	protected IDataModelEditorInput<MiddleWareTypeEnum> getModelObjectEditorInput(
			MiddleWareTypeEnum editObject, NodeBean nodeBean) {
		return new MiddleWareTypeEditorInput(editObject);
	}

}
