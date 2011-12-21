package net.ui.model.form;

import java.util.List;

public class FormPropertyBean extends AbstractFormBean {

	private String type;

	private String styleDesc;

	private String value;

	private String command;

	private Boolean readOnly = Boolean.FALSE;

	private Boolean allowNull = Boolean.TRUE;

	private String dataSrc;

	private String dataType;

	private String tipInfo;
	
	private String icon;

	public FormPropertyBean() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStyleDesc() {
		return styleDesc;
	}

	public void setStyleDesc(String style) {
		this.styleDesc = style;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	public String getDataSrc() {
		return dataSrc;
	}

	public void setDataSrc(String dataSrc) {
		this.dataSrc = dataSrc;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public List<FormPropertyBean> getSubProperties() {
		return super.getFormProperties();
	}

	public void addSubProperty(FormPropertyBean aData) {
		super.addFormProperty(aData);
	}

	public void removeSubProperty(FormPropertyBean aData) {
		super.removeFormProperty(aData);
	}

	public Boolean getAllowNull() {
		return allowNull;
	}

	public void setAllowNull(Boolean allowNull) {
		this.allowNull = allowNull;
	}

	public String getTipInfo() {
		return tipInfo;
	}

	public void setTipInfo(String tipInfo) {
		this.tipInfo = tipInfo;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
