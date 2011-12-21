package net.ui.model.constlist;

import java.util.ArrayList;

import org.apache.commons.lang.StringEscapeUtils;

public class ListDataContainer extends ArrayList<ListData> {

	private String name;

	private String type;

	private String datatype;

	private String script;

	private String datasource;

	private String labelProperty;

	private String dataProperty;
	
	private String desc;

	public ListDataContainer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getScript() {
		return StringEscapeUtils.unescapeXml(script);
	}

	public void setScript(String script) {
		this.script = StringEscapeUtils.escapeXml(script);
	}

	public String getDatasource() {
		return datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getLabelProperty() {
		return labelProperty;
	}

	public void setLabelProperty(String labelProperty) {
		this.labelProperty = labelProperty;
	}

	public String getDataProperty() {
		return dataProperty;
	}

	public void setDataProperty(String dataProperty) {
		this.dataProperty = dataProperty;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}