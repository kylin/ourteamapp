package net.ui.model.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class SubNodeBuilderBean implements Serializable{

	private String id;

	private String className;
	
	private String desc;

	private String catalogNodeId;

	private List<PropertyBean> properties = new ArrayList<PropertyBean>();

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void addProperty(PropertyBean aProperty) {
		this.properties.add(aProperty);
	}

	public void removeProperty(PropertyBean aProperty) {
		this.properties.remove(aProperty);
	}

	public List<PropertyBean> getProperties() {
		return this.properties;
	}

	public PropertyBean getProperty(String aName) {

		PropertyBean property = null;
		for (Iterator<PropertyBean> iter = properties.iterator(); iter.hasNext();) {
			PropertyBean element = (PropertyBean) iter.next();
			if (element.getName().equals(aName)) {
				property = element;
				break;
			}
		}

		return property;
	}

	public String getCatalogNodeId() {
		return catalogNodeId;
	}

	public void setCatalogNodeId(String catalogNodeId) {
		this.catalogNodeId = catalogNodeId;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("id", id).append("className", className).toString();
	}

}
