package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.tree.TreeBean;
import net.ui.model.tree.TreeNodeBean;

public class UITreeRootNodeSubNodeBuilder implements
		ISubNodeBuilder<TreeBean, TreeNodeBean> {
	
	@Override
	public TreeNodeBean[] getSubNodes(TreeBean aParentObject) throws Exception {
		List<TreeNodeBean> treeNodeBeans = aParentObject.getRootNodeList();
		return treeNodeBeans.toArray(new TreeNodeBean[treeNodeBeans.size()]);
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
