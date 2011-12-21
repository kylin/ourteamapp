package net.ui.eclipse.tree;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.ImageChache;
import net.ui.model.tree.NodeBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public abstract class AbstractRootNodeBuilder extends AbstractNodeBuilder
		implements RootNodeBuilder {

	public void buildSubNode(Tree aParaneTree) throws Exception {

		for (Iterator iter = getSubNodeData(aParaneTree).iterator(); iter
				.hasNext();) {
			Object element = iter.next();

			TreeItem item = this.getNewNode(aParaneTree, element);

			if (item != null) {
				item.setData(SubNodeBuilder.NODE_CREATOR, this);
			}
		}

	}

	abstract protected List getSubNodeData(Tree aParaneTree) throws Exception;

	protected TreeItem getNewTreeItem(Tree aParaneTree, NodeBean aNodeConfig) {
		if (aNodeConfig.isHidden() == true) {
			return null;
		}

		TreeItem node = new TreeItem(aParaneTree, SWT.NONE);

		if (StringUtils.isNotEmpty(aNodeConfig.getLabel())) {
			node.setText(aNodeConfig.getLabel());
		}

		if (StringUtils.isNotEmpty(aNodeConfig.getImage())) {

			StringBuffer iconPath = new StringBuffer(((TreeBean) aParaneTree
					.getData(SubNodeBuilder.TREE_CONFIG)).getImageBase());
			iconPath.append(aNodeConfig.getImage());

		}

		node.setData(SubNodeBuilder.NODE_CONFIG, aNodeConfig);

		node.setData(SubNodeBuilder.TREE_CONFIG, aParaneTree
				.getData(SubNodeBuilder.TREE_CONFIG));

		if (aNodeConfig.getLeaf().booleanValue() == false) {
			TreeItem treeItem = new TreeItem(node, SWT.NONE);

			treeItem.setImage(ImageChache.getImage("/loading.gif"));
		}
		return node;
	}

}
