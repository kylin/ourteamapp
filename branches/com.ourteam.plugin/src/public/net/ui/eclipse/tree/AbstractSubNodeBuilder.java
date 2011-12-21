package net.ui.eclipse.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ui.model.tree.NodeBean;
import net.ui.model.tree.TreeBean;
import net.ui.model.tree.TreeNodeBean;

import org.eclipse.swt.widgets.TreeItem;

public abstract class AbstractSubNodeBuilder extends AbstractNodeBuilder
		implements SubNodeBuilder {

	public void buildSubNode(TreeItem aParaneNode) throws Exception {

		List subNodeDataList = getSubNodeData(aParaneNode);

		for (Iterator iter = subNodeDataList.iterator(); iter.hasNext();) {
			Object element = iter.next();
			TreeItem item = this.getNewNode(aParaneNode, element);

			if (item != null) {
				item.setData(SubNodeBuilder.NODE_CREATOR, this);
				updateNodeData(item, element);
			}
		}

	}

	public void updateNodeData(TreeItem aNode, Object aData) {
		aNode.setData(SubNodeBuilder.USER_OBJECT, aData);
		doUpdateNodeData(aNode, aData);
	}

	abstract protected void doUpdateNodeData(TreeItem aNode, Object aData);

	public TreeItem getNewNode(TreeItem aParaneNode, Object aData)
			throws Exception {

		if (aData instanceof NodeBean) {
			return getNewTreeItem(aParaneNode, (NodeBean) aData);
		} else {
			return null;
		}
	}

	protected List getSubNodeData(TreeItem aParaneNode) throws Exception {
		TreeBean treeConfig = ((TreeBean) aParaneNode
				.getData(SubNodeBuilder.TREE_CONFIG));

		TreeItem rootNode = getRootTreeItem(aParaneNode);

		TreeNodeBean[] subNodes = treeConfig.getSubTreeNode(
				((NodeBean) rootNode.getData(SubNodeBuilder.NODE_CONFIG))
						.getId(), ((NodeBean) aParaneNode
						.getData(SubNodeBuilder.NODE_CONFIG)).getId());
		List subNodeDataList = new ArrayList();
		for (int i = 0; i < subNodes.length; i++) {
			TreeNodeBean nodeId = subNodes[i];
			NodeBean nodeConfig = treeConfig.getNodeDefine(nodeId.getId());
			subNodeDataList.add(nodeConfig);
		}

		return subNodeDataList;
	}

	protected TreeItem getRootTreeItem(TreeItem aTreeNode) {
		TreeItem rootNode = aTreeNode;
		TreeItem tempNode = null;
		do {

			tempNode = rootNode.getParentItem();

			if (tempNode != null) {
				rootNode = tempNode;
			}

		} while (tempNode != null);

		return rootNode;
	}

}
