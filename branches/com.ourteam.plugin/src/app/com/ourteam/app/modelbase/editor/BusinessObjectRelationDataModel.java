package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessObjectBean;

public class BusinessObjectRelationDataModel {
	
	private long businessObjectRelationId;

	private BusinessObjectBean businessObjectBean;

	private BusinessObjectBean relatedBusinessObjectBean;
	
	private BusinessObjectBean[] relatedBusinessObjectBeans;

	private ObjectPropertyRelationDataModel[] propertyRelationDataModels;
	
	private String description;
	
	private String aliasName;

	public BusinessObjectBean getBusinessObjectBean() {
		return businessObjectBean;
	}

	public void setBusinessObjectBean(BusinessObjectBean businessObjectBean) {
		this.businessObjectBean = businessObjectBean;
	}

	public BusinessObjectBean getRelatedBusinessObjectBean() {
		return relatedBusinessObjectBean;
	}

	public void setRelatedBusinessObjectBean(
			BusinessObjectBean relatedBusinessObjectBean) {
		this.relatedBusinessObjectBean = relatedBusinessObjectBean;
	}

	public ObjectPropertyRelationDataModel[] getPropertyRelationDataModels() {
		return propertyRelationDataModels;
	}

	public void setPropertyRelationDataModels(
			ObjectPropertyRelationDataModel[] propertyRelationDataModels) {
		this.propertyRelationDataModels = propertyRelationDataModels;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public long getBusinessObjectRelationId() {
		return businessObjectRelationId;
	}

	public void setBusinessObjectRelationId(long businessObjectRelationId) {
		this.businessObjectRelationId = businessObjectRelationId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BusinessObjectBean[] getRelatedBusinessObjectBeans() {
		return relatedBusinessObjectBeans;
	}

	public void setRelatedBusinessObjectBeans(
			BusinessObjectBean[] relatedBusinessObjectBeans) {
		this.relatedBusinessObjectBeans = relatedBusinessObjectBeans;
	}

}
