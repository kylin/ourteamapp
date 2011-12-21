package com.ourteam.app.workspace.editor;

import java.util.List;

import net.ui.model.tree.NodeBean;
import net.ui.model.tree.TreeBean;
import net.ui.model.tree.TreeConfigAgent;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class UITreeNodeListConfigEditorPart extends
		AbstractUIItemListConfigEditorPart<NodeBean> {

	private TreeBean treeBean;

	@Override
	protected boolean editUIItem(NodeBean uiItemBean) throws Exception {
		return false;
	}

	@Override
	protected NodeBean addUIItem() throws Exception {
		return null;
	}

	@Override
	protected String getTableConfigId() {
		return "uiTreeNodeListTable";
	}

	@Override
	protected NodeBean[] getDataList(WorkspaceResourceFileObject dataModel)
			throws Exception {
		treeBean = TreeConfigAgent.getTreeConfig(FileUtils
				.openInputStream(dataModel.getResourceFile()));
		List<NodeBean> nodeBeans = treeBean.getNodeIdIndex();
		return nodeBeans.toArray(new NodeBean[nodeBeans.size()]);
	}

}
