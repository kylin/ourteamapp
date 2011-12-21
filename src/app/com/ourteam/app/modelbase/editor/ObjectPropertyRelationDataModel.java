package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;

public class ObjectPropertyRelationDataModel {

	private ObjectPropertyBean objectPropertyBean;
	
	private ObjectPropertyBean relatedObjectPropertyBean;
	
	private ObjectRelationAttrTypeEnum relationAttrTypeEnum;
	
	public ObjectPropertyRelationDataModel(
			ObjectPropertyBean objectPropertyBean,
			ObjectPropertyBean relatedObjectPropertyBean) {
		super();
		this.objectPropertyBean = objectPropertyBean;
		this.relatedObjectPropertyBean = relatedObjectPropertyBean;
	}

	public ObjectPropertyBean getObjectPropertyBean() {
		return objectPropertyBean;
	}

	public void setObjectPropertyBean(ObjectPropertyBean objectPropertyBean) {
		this.objectPropertyBean = objectPropertyBean;
	}

	public ObjectPropertyBean getRelatedObjectPropertyBean() {
		return relatedObjectPropertyBean;
	}

	public void setRelatedObjectPropertyBean(
			ObjectPropertyBean relatedObjectPropertyBean) {
		this.relatedObjectPropertyBean = relatedObjectPropertyBean;
	}

	public ObjectRelationAttrTypeEnum getRelationAttrTypeEnum() {
		return relationAttrTypeEnum;
	}

	public void setRelationAttrTypeEnum(
			ObjectRelationAttrTypeEnum relationAttrTypeEnum) {
		this.relationAttrTypeEnum = relationAttrTypeEnum;
	}
	
	
}
