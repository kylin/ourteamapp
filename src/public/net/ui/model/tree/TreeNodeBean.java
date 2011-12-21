package net.ui.model.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class TreeNodeBean implements Serializable {

	private String id;

	private List<TreeNodeBean> subNodeIdList = new ArrayList<TreeNodeBean>();

	public void addSubNode(TreeNodeBean aSubNode) {
		this.subNodeIdList.add(aSubNode);
	}

	public void removeSubNode(TreeNodeBean aSubNode) {
		this.subNodeIdList.remove(aSubNode);
	}

	public TreeNodeBean[] getSubNodes() {
		return (TreeNodeBean[]) this.subNodeIdList.toArray(new TreeNodeBean[0]);
	}

	public List<TreeNodeBean> getSubNodeList() {
		return this.subNodeIdList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("id", id).append("subNodeIdList", subNodeIdList)
				.toString();
	}

}
