package net.ui.model.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class NodeBean implements Serializable {

	private String id;

	private String label;

	private String labelKey;

	private String image;

	private Boolean leaf;

	private String nodeArg;

	private String nodePanel;

	private String desc;

	private boolean hidden = false;

	private List<SubNodeBuilderBean> subNodeBuilderList = new ArrayList<SubNodeBuilderBean>();

	private List<PropertyBean> properties = new ArrayList<PropertyBean>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	public String getNodePanel() {
		return nodePanel;
	}

	public void setNodePanel(String nodePanel) {
		this.nodePanel = nodePanel;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void addSubNodeBuilder(SubNodeBuilderBean aSubNodeBuilder) {
		this.subNodeBuilderList.add(aSubNodeBuilder);
	}

	public void removeSubNodeBuilder(SubNodeBuilderBean aSubNodeBuilder) {
		this.subNodeBuilderList.remove(aSubNodeBuilder);
	}

	public SubNodeBuilderBean[] getSubNodBuilders() {
		return (SubNodeBuilderBean[]) this.subNodeBuilderList
				.toArray(new SubNodeBuilderBean[subNodeBuilderList.size()]);
	}

	public List<SubNodeBuilderBean> getSubNodBuilderList() {
		return this.subNodeBuilderList;
	}

	public void addProperty(PropertyBean aProperty) {
		this.properties.add(aProperty);
	}

	public List<PropertyBean> getProperties() {
		return this.properties;
	}

	public PropertyBean getProperty(String aName) {

		PropertyBean property = null;
		for (Iterator<PropertyBean> iter = properties.iterator(); iter
				.hasNext();) {
			PropertyBean element = (PropertyBean) iter.next();
			if (element.getName().equals(aName)) {
				property = element;
				break;
			}
		}

		return property;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("id", id).append("label", label).append("image", image)
				.append("leaf", leaf).append("nodePanel", nodePanel)
				.append("subNodeBuilderList", subNodeBuilderList)
				.append("properties", properties).toString();
	}

	public String getNodeArg() {
		return nodeArg;
	}

	public void setNodeArg(String nodeArg) {
		this.nodeArg = nodeArg;
	}

	public String getLabelKey() {
		return labelKey;
	}

	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}

}
