package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.ObjectPropertyBean;

public class BusinessPropertyMappingDataModel {

	private String propertyName;
	
	private String mappedPropertyName;
	
	private String primaryKey;
	
	private String dataType;
	
	private String description;
	
	private String writable;
	
	private String readable;
	
	private ObjectPropertyBean mappedProperty;
	
	private ObjectPropertyBean property;

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String daoPropertyName) {
		this.propertyName = daoPropertyName;
	}

	public String getMappedPropertyName() {
		return mappedPropertyName;
	}

	public void setMappedPropertyName(String persistentPropertyName) {
		this.mappedPropertyName = persistentPropertyName;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ObjectPropertyBean getMappedProperty() {
		return mappedProperty;
	}

	public void setMappedProperty(ObjectPropertyBean mappedProperty) {
		this.mappedProperty = mappedProperty;
	}

	public ObjectPropertyBean getProperty() {
		return property;
	}

	public void setProperty(ObjectPropertyBean property) {
		this.property = property;
	}

	public String getWritable() {
		return writable;
	}

	public void setWritable(String writable) {
		this.writable = writable;
	}

	public String getReadable() {
		return readable;
	}

	public void setReadable(String readable) {
		this.readable = readable;
	}
	
}
