package net.ui.eclipse.tree;

import net.ui.eclipse.ImageChache;
import net.ui.model.tree.NodeBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeItem;

public abstract class AbstractNodeBuilder {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		this.id = aId;
	}

	protected TreeItem newTreeItemInstance(TreeItem aParaneNode) {
		return new TreeItem(aParaneNode, SWT.NONE);
	}

	protected TreeItem getNewTreeItem(TreeItem aParaneNode, NodeBean aNodeConfig) {
		if (aNodeConfig.isHidden() == true) {
			return null;
		}

		TreeItem node = newTreeItemInstance(aParaneNode);

		if (StringUtils.isNotEmpty(aNodeConfig.getLabel())) {
			node.setText(aNodeConfig.getLabel());
		}

		if (StringUtils.isNotEmpty(aNodeConfig.getImage())) {
			StringBuffer iconPath = new StringBuffer(((TreeBean) aParaneNode
					.getData(SubNodeBuilder.TREE_CONFIG)).getImageBase());
			iconPath.append(aNodeConfig.getImage());

			node.setImage(ImageChache.getImage(iconPath.toString()));

		}

		node.setData(SubNodeBuilder.NODE_CONFIG, aNodeConfig);

		node.setData(SubNodeBuilder.TREE_CONFIG, aParaneNode
				.getData(SubNodeBuilder.TREE_CONFIG));

		if (aNodeConfig.getLeaf().booleanValue() == false) {
			TreeItem treeItem = new TreeItem(node, SWT.NONE);

			treeItem.setImage(ImageChache.getImage("/loading.gif"));

		}
		return node;
	}

}
