package net.ui.eclipse.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.ui.model.tree.NodeBean;
import net.ui.model.tree.PropertyBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.graphics.Image;

public class TreeNodeItem implements Serializable {

	private NodeBean nodeConfig;

	private TreeNodeItem parentNodeItem;

	private Object userObject;

	private Image image;

	private String[] actionGroupIds;

	private boolean dirty = true;

	private List<TreeNodeItem> childTreeNodeItems = new ArrayList<TreeNodeItem>();

	private List<TreeNodeItem> staticChildTreeNodeItems = new ArrayList<TreeNodeItem>();

	public TreeNodeItem(TreeNodeItem parentNodeItem, NodeBean nodeConfig) {
		super();
		this.parentNodeItem = parentNodeItem;
		this.nodeConfig = nodeConfig;
		if (this.parentNodeItem != null) {
			this.parentNodeItem.addChildTreeNodeItem(this);
		}
		if (this.nodeConfig != null) {
			PropertyBean propertyBean = this.nodeConfig
					.getProperty("actionGroupId");

			if (propertyBean != null) {
				actionGroupIds = StringUtils
						.split(propertyBean.getValue(), ",");
			}

		}

	}

	public void addChildTreeNodeItem(TreeNodeItem treeNodeItem) {
		this.childTreeNodeItems.add(treeNodeItem);
	}

	public void removeChildTreeNodeItem(TreeNodeItem treeNodeItem) {
		this.childTreeNodeItems.remove(treeNodeItem);
	}

	public List<TreeNodeItem> getChildTreeNodeItems() {
		return childTreeNodeItems;
	}

	public NodeBean getNodeConfig() {
		return nodeConfig;
	}

	public TreeNodeItem getParentNodeItem() {
		return parentNodeItem;
	}

	public Object getUserObject() {
		return userObject;
	}

	public void setUserObject(Object userObject) {
		this.userObject = userObject;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String[] getActionGroupIds() {
		return actionGroupIds;
	}

	public void setActionGroupIds(String[] actionGroupIds) {
		if (ArrayUtils.isNotEmpty(this.actionGroupIds)) {
			this.actionGroupIds = (String[]) ArrayUtils.addAll(
					this.actionGroupIds, actionGroupIds);
		} else {
			this.actionGroupIds = actionGroupIds;
		}

	}

	public void removeAllChilds() {
		this.childTreeNodeItems.clear();
	}

	public List<TreeNodeItem> getStaticChildTreeNodeItems() {
		return staticChildTreeNodeItems;
	}

	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
		if(dirty){
			removeAllChilds();
		}
		
	}

}
