package net.ui.model.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class TreeBean implements Serializable {

	private String imageBase = "";

	private TreeNodeBean rootNode;

	private List<TreeNodeBean> rootNodeList = new ArrayList<TreeNodeBean>();

	private List<NodeBean> nodeIndex = new ArrayList<NodeBean>();

	private Map<String, NodeBean> nodeDefineMap = new HashMap<String, NodeBean>();

	public String getImageBase() {
		return imageBase;
	}

	public void setImageBase(String imageBase) {
		this.imageBase = imageBase;
	}

	public TreeNodeBean getRootNode() {
		if (this.rootNodeList.size() > 0) {
			return (TreeNodeBean) this.rootNodeList.get(0);
		} else {
			return null;
		}

	}

	public void addRootNode(TreeNodeBean rootNode) {
		this.rootNodeList.add(rootNode);
	}

	public void removeRootNode(TreeNodeBean rootNode) {
		this.rootNodeList.remove(rootNode);
	}

	public List<TreeNodeBean> getRootNodeList() {
		return this.rootNodeList;
	}

	public TreeNodeBean getRootNode(String aId) {
		TreeNodeBean node = null;
		for (Iterator<TreeNodeBean> iter = this.rootNodeList.iterator(); iter
				.hasNext();) {
			TreeNodeBean element = (TreeNodeBean) iter.next();
			if (element.getId().equals(aId)) {
				node = element;
			}

		}

		return node;
	}

	public void addNodeDefine(NodeBean aNode) {
		nodeIndex.add(aNode);
		nodeDefineMap.put(aNode.getId(), aNode);
	}

	public void removeNodeDefine(NodeBean aNode) {
		nodeIndex.remove(aNode);
		nodeDefineMap.remove(aNode.getId());

		TreeNodeBean treeNodeBean = getRootNode(aNode.getId());

		if (treeNodeBean != null) {
			this.rootNodeList.remove(treeNodeBean);
		}

	}

	public Map<String, NodeBean> getNodeDefineMap() {
		return nodeDefineMap;
	}

	public List<NodeBean> getNodeIdIndex() {
		return nodeIndex;
	}

	public NodeBean getNodeDefine(String aId) {
		return (NodeBean) nodeDefineMap.get(aId);
	}

	public TreeNodeBean[] getSubTreeNode(String aRootNodeId, String aNodeId) {

		TreeNodeBean rootNodeConfig = this.getRootNode(aRootNodeId);

		if (rootNodeConfig != null) {
			TreeNodeBean bean = getSubBean(rootNodeConfig, aNodeId);
			return bean.getSubNodes();
		}

		return new TreeNodeBean[0];

	}

	protected TreeNodeBean getSubBean(TreeNodeBean aBean, String aNodeId) {

		if (aBean.getId().equals(aNodeId)) {
			return aBean;
		}

		TreeNodeBean[] subBean = aBean.getSubNodes();

		for (int i = 0; i < subBean.length; i++) {
			TreeNodeBean bean = subBean[i];
			TreeNodeBean childBean = getSubBean(bean, aNodeId);
			if (childBean != null) {
				return childBean;
			}
		}
		return new TreeNodeBean();
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("imageBase", imageBase).append("rootNode", rootNode)
				.append("nodeDefineMap", nodeDefineMap).toString();
	}

}
