package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.tree.NodeBean;
import net.ui.model.tree.TreeBean;

public class UITreeNodeDefineSubNodeBuilder implements
		ISubNodeBuilder<TreeBean, NodeBean> {

	@Override
	public NodeBean[] getSubNodes(TreeBean aParentObject) throws Exception {
		List<NodeBean> nodeBeans = aParentObject.getNodeIdIndex();
		return nodeBeans.toArray(new NodeBean[nodeBeans.size()]);
	}

	@Override
	public String getSubNodeDefineId(NodeBean nodeObject) {
		return "UI_NODE";
	}

	@Override
	public String[] getSubNodeActionGroupIds(NodeBean nodeObject) {
		return null;
	}
}
