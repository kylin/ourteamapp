package com.ourteam.app.workspace.editor;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.tree.NodeBean;
import net.ui.model.tree.SubNodeBuilderBean;

public class UITreeSubNodeBuilderSubNodeBuilder implements
		ISubNodeBuilder<NodeBean, SubNodeBuilderBean> {

	@Override
	public SubNodeBuilderBean[] getSubNodes(NodeBean aParentObject)
			throws Exception {
		return aParentObject.getSubNodBuilders();
	}

	@Override
	public String getSubNodeDefineId(SubNodeBuilderBean nodeObject) {
		return "UI_NODE_BUILDER";
	}

	@Override
	public String[] getSubNodeActionGroupIds(SubNodeBuilderBean nodeObject) {
		return null;
	}

}
