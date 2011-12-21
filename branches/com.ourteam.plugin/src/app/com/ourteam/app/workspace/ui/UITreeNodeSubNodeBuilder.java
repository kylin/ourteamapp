package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.tree.TreeNodeBean;

public class UITreeNodeSubNodeBuilder implements
		ISubNodeBuilder<TreeNodeBean, TreeNodeBean> {

	@Override
	public TreeNodeBean[] getSubNodes(TreeNodeBean aParentObject) throws Exception {
		return aParentObject.getSubNodes();
	}

	@Override
	public String getSubNodeDefineId(TreeNodeBean nodeObject) {
		return "UI_ROOT_NODE";
	}

	@Override
	public String[] getSubNodeActionGroupIds(TreeNodeBean nodeObject) {
		return null;
	}

}
