/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 对象关联属性Bean Generate date 2011-09-22 10:22:34
 *
 * @model auto gen
 */
public class ObjectRelationAttrBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.ObjectRelationAttr objObjectRelationAttr;

    static {
        mappedDaoFields.put("objectRelationAttrId",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.ObjectRelationAttrId);

        mappedDaoFields.put("objectRelationId",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.ObjectRelationId);

        mappedDaoFields.put("propertyId",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyId);

        mappedDaoFields.put("relatedPropertyId",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyId);

        mappedDaoFields.put("objectRelationDescription",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.ObjectRelationDescription);

        mappedDaoFields.put("propertyDataSize",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyDataSize);

        mappedDaoFields.put("propertyDataType",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyDataType);

        mappedDaoFields.put("propertyDescription",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyDescription);

        mappedDaoFields.put("propertyIsEnum",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsEnum);

        mappedDaoFields.put("propertyIsGenerate",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsGenerate);

        mappedDaoFields.put("propertyIsPrimaryProperty",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsPrimaryProperty);

        mappedDaoFields.put("propertyName",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyName);

        mappedDaoFields.put("propertyObjectId",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyObjectId);

        mappedDaoFields.put("propertyOrderIndex",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyOrderIndex);

        mappedDaoFields.put("propertyKind",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyKind);

        mappedDaoFields.put("propertyState",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyState);

        mappedDaoFields.put("propertyType",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyType);

        mappedDaoFields.put("propertyValue",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyValue);

        mappedDaoFields.put("relatedPropertyDataSize",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyDataSize);

        mappedDaoFields.put("relatedPropertyDataType",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyDataType);

        mappedDaoFields.put("relatedPropertyDescription",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyDescription);

        mappedDaoFields.put("relatedPropertyIsEnum",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsEnum);

        mappedDaoFields.put("relatedPropertyIsGenerate",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsGenerate);

        mappedDaoFields.put("relatedPropertyIsPrimaryProperty",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsPrimaryProperty);

        mappedDaoFields.put("relatedPropertyName",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyName);

        mappedDaoFields.put("relatedPropertyObjectId",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyObjectId);

        mappedDaoFields.put("relatedPropertyOrderIndex",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyOrderIndex);

        mappedDaoFields.put("relatedPropertyKind",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyKind);

        mappedDaoFields.put("relatedPropertyState",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyState);

        mappedDaoFields.put("relatedPropertyType",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyType);

        mappedDaoFields.put("relatedPropertyValue",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyValue);

        mappedDaoFields.put("relateAttrType",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelateAttrType);

        mappedDaoFields.put("propertyIsUnique",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsUnique);

        mappedDaoFields.put("relatedPropertyIsUnique",
            com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsUnique);
    } 

    /**
     * Creates a new ObjectRelationAttrBean object.
     */
    public ObjectRelationAttrBean() {
        super();

        objObjectRelationAttr = new com.ourteam.modelbase.dao.ObjectRelationAttr();
    } // end ObjectRelationAttrBean()

    /**
     * Creates a new ObjectRelationAttrBean object.
     *
     * @param aObjectRelationAttr DOCUMENT ME!
     */
    public ObjectRelationAttrBean(
        com.ourteam.modelbase.dao.ObjectRelationAttr aObjectRelationAttr) {
        super();

        objObjectRelationAttr = aObjectRelationAttr;
    } // end ObjectRelationAttrBean()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.ObjectRelationAttr convertToObjectRelationAttr() {
        return objObjectRelationAttr;
    } // end convertToObjectRelationAttr()

    /**
     * Get ObjectRelationAttrId
     *
     * @return objectRelationAttrId
     */
    public long getObjectRelationAttrId() {
        return objObjectRelationAttr.getObjectRelationAttrId();
    } // end getObjectRelationAttrId()

    /**
     * Set ObjectRelationAttrId
     *
     * @param aObjectRelationAttrId
     */
    public void setObjectRelationAttrId(long aObjectRelationAttrId) {
        this.objObjectRelationAttr.setObjectRelationAttrId(aObjectRelationAttrId);
    } // end setObjectRelationAttrId()

    /**
     * Get ObjectRelationId
     *
     * @return objectRelationId
     */
    public long getObjectRelationId() {
        return objObjectRelationAttr.getObjectRelationId();
    } // end getObjectRelationId()

    /**
     * Set ObjectRelationId
     *
     * @param aObjectRelationId
     */
    public void setObjectRelationId(long aObjectRelationId) {
        this.objObjectRelationAttr.setObjectRelationId(aObjectRelationId);
    } // end setObjectRelationId()

    /**
     * Get PropertyId
     *
     * @return propertyId
     */
    public long getPropertyId() {
        return objObjectRelationAttr.getPropertyId();
    } // end getPropertyId()

    /**
     * Set PropertyId
     *
     * @param aPropertyId
     */
    public void setPropertyId(long aPropertyId) {
        this.objObjectRelationAttr.setPropertyId(aPropertyId);
    } // end setPropertyId()

    /**
     * Get RelatedPropertyId
     *
     * @return relatedPropertyId
     */
    public long getRelatedPropertyId() {
        return objObjectRelationAttr.getRelatedPropertyId();
    } // end getRelatedPropertyId()

    /**
     * Set RelatedPropertyId
     *
     * @param aRelatedPropertyId
     */
    public void setRelatedPropertyId(long aRelatedPropertyId) {
        this.objObjectRelationAttr.setRelatedPropertyId(aRelatedPropertyId);
    } // end setRelatedPropertyId()

    /**
     * Get ObjectRelationDescription
     *
     * @return objectRelationDescription
     */
    public String getObjectRelationDescription() {
        return objObjectRelationAttr.getObjectRelationDescription();
    } // end getObjectRelationDescription()

    /**
     * Get PropertyDataSize
     *
     * @return propertyDataSize
     */
    public Integer getPropertyDataSize() {
        return objObjectRelationAttr.getPropertyDataSize();
    } // end getPropertyDataSize()

    /**
     * Set PropertyDataSize
     *
     * @param aPropertyDataSize
     */
    public void setPropertyDataSize(Integer aPropertyDataSize) {
        this.objObjectRelationAttr.setPropertyDataSize(aPropertyDataSize);
    } // end setPropertyDataSize()

    /**
     * Get PropertyDataType
     *
     * @return propertyDataType
     */
    public String getPropertyDataType() {
        return objObjectRelationAttr.getPropertyDataType();
    } // end getPropertyDataType()

    /**
     * Set PropertyDataType
     *
     * @param aPropertyDataType
     */
    public void setPropertyDataType(String aPropertyDataType) {
        this.objObjectRelationAttr.setPropertyDataType(aPropertyDataType);
    } // end setPropertyDataType()

    /**
     * Get PropertyDescription
     *
     * @return propertyDescription
     */
    public String getPropertyDescription() {
        return objObjectRelationAttr.getPropertyDescription();
    } // end getPropertyDescription()

    /**
     * Set PropertyDescription
     *
     * @param aPropertyDescription
     */
    public void setPropertyDescription(String aPropertyDescription) {
        this.objObjectRelationAttr.setPropertyDescription(aPropertyDescription);
    } // end setPropertyDescription()

    /**
     * Get PropertyIsEnum
     *
     * @return propertyIsEnum
     */
    public String getPropertyIsEnum() {
        return objObjectRelationAttr.getPropertyIsEnum();
    } // end getPropertyIsEnum()

    /**
     * Set PropertyIsEnum
     *
     * @param aPropertyIsEnum
     */
    public void setPropertyIsEnum(String aPropertyIsEnum) {
        this.objObjectRelationAttr.setPropertyIsEnum(aPropertyIsEnum);
    } // end setPropertyIsEnum()

    /**
     * Get PropertyIsGenerate
     *
     * @return propertyIsGenerate
     */
    public String getPropertyIsGenerate() {
        return objObjectRelationAttr.getPropertyIsGenerate();
    } // end getPropertyIsGenerate()

    /**
     * Set PropertyIsGenerate
     *
     * @param aPropertyIsGenerate
     */
    public void setPropertyIsGenerate(String aPropertyIsGenerate) {
        this.objObjectRelationAttr.setPropertyIsGenerate(aPropertyIsGenerate);
    } // end setPropertyIsGenerate()

    /**
     * Get PropertyIsPrimaryProperty
     *
     * @return propertyIsPrimaryProperty
     */
    public String getPropertyIsPrimaryProperty() {
        return objObjectRelationAttr.getPropertyIsPrimaryProperty();
    } // end getPropertyIsPrimaryProperty()

    /**
     * Set PropertyIsPrimaryProperty
     *
     * @param aPropertyIsPrimaryProperty
     */
    public void setPropertyIsPrimaryProperty(String aPropertyIsPrimaryProperty) {
        this.objObjectRelationAttr.setPropertyIsPrimaryProperty(aPropertyIsPrimaryProperty);
    } // end setPropertyIsPrimaryProperty()

    /**
     * Get PropertyName
     *
     * @return propertyName
     */
    public String getPropertyName() {
        return objObjectRelationAttr.getPropertyName();
    } // end getPropertyName()

    /**
     * Set PropertyName
     *
     * @param aPropertyName
     */
    public void setPropertyName(String aPropertyName) {
        this.objObjectRelationAttr.setPropertyName(aPropertyName);
    } // end setPropertyName()

    /**
     * Get PropertyObjectId
     *
     * @return propertyObjectId
     */
    public long getPropertyObjectId() {
        return objObjectRelationAttr.getPropertyObjectId();
    } // end getPropertyObjectId()

    /**
     * Set PropertyObjectId
     *
     * @param aPropertyObjectId
     */
    public void setPropertyObjectId(long aPropertyObjectId) {
        this.objObjectRelationAttr.setPropertyObjectId(aPropertyObjectId);
    } // end setPropertyObjectId()

    /**
     * Get PropertyOrderIndex
     *
     * @return propertyOrderIndex
     */
    public Integer getPropertyOrderIndex() {
        return objObjectRelationAttr.getPropertyOrderIndex();
    } // end getPropertyOrderIndex()

    /**
     * Set PropertyOrderIndex
     *
     * @param aPropertyOrderIndex
     */
    public void setPropertyOrderIndex(Integer aPropertyOrderIndex) {
        this.objObjectRelationAttr.setPropertyOrderIndex(aPropertyOrderIndex);
    } // end setPropertyOrderIndex()

    /**
     * Get PropertyKind
     *
     * @return propertyKind
     */
    public String getPropertyKind() {
        return objObjectRelationAttr.getPropertyKind();
    } // end getPropertyKind()

    /**
     * Set PropertyKind
     *
     * @param aPropertyKind
     */
    public void setPropertyKind(String aPropertyKind) {
        this.objObjectRelationAttr.setPropertyKind(aPropertyKind);
    } // end setPropertyKind()

    /**
     * Get PropertyState
     *
     * @return propertyState
     */
    public String getPropertyState() {
        return objObjectRelationAttr.getPropertyState();
    } // end getPropertyState()

    /**
     * Set PropertyState
     *
     * @param aPropertyState
     */
    public void setPropertyState(String aPropertyState) {
        this.objObjectRelationAttr.setPropertyState(aPropertyState);
    } // end setPropertyState()

    /**
     * Get PropertyType
     *
     * @return propertyType
     */
    public String getPropertyType() {
        return objObjectRelationAttr.getPropertyType();
    } // end getPropertyType()

    /**
     * Set PropertyType
     *
     * @param aPropertyType
     */
    public void setPropertyType(String aPropertyType) {
        this.objObjectRelationAttr.setPropertyType(aPropertyType);
    } // end setPropertyType()

    /**
     * Get PropertyValue
     *
     * @return propertyValue
     */
    public String getPropertyValue() {
        return objObjectRelationAttr.getPropertyValue();
    } // end getPropertyValue()

    /**
     * Set PropertyValue
     *
     * @param aPropertyValue
     */
    public void setPropertyValue(String aPropertyValue) {
        this.objObjectRelationAttr.setPropertyValue(aPropertyValue);
    } // end setPropertyValue()

    /**
     * Get RelatedPropertyDataSize
     *
     * @return relatedPropertyDataSize
     */
    public Integer getRelatedPropertyDataSize() {
        return objObjectRelationAttr.getRelatedPropertyDataSize();
    } // end getRelatedPropertyDataSize()

    /**
     * Set RelatedPropertyDataSize
     *
     * @param aRelatedPropertyDataSize
     */
    public void setRelatedPropertyDataSize(Integer aRelatedPropertyDataSize) {
        this.objObjectRelationAttr.setRelatedPropertyDataSize(aRelatedPropertyDataSize);
    } // end setRelatedPropertyDataSize()

    /**
     * Get RelatedPropertyDataType
     *
     * @return relatedPropertyDataType
     */
    public String getRelatedPropertyDataType() {
        return objObjectRelationAttr.getRelatedPropertyDataType();
    } // end getRelatedPropertyDataType()

    /**
     * Set RelatedPropertyDataType
     *
     * @param aRelatedPropertyDataType
     */
    public void setRelatedPropertyDataType(String aRelatedPropertyDataType) {
        this.objObjectRelationAttr.setRelatedPropertyDataType(aRelatedPropertyDataType);
    } // end setRelatedPropertyDataType()

    /**
     * Get RelatedPropertyDescription
     *
     * @return relatedPropertyDescription
     */
    public String getRelatedPropertyDescription() {
        return objObjectRelationAttr.getRelatedPropertyDescription();
    } // end getRelatedPropertyDescription()

    /**
     * Set RelatedPropertyDescription
     *
     * @param aRelatedPropertyDescription
     */
    public void setRelatedPropertyDescription(
        String aRelatedPropertyDescription) {
        this.objObjectRelationAttr.setRelatedPropertyDescription(aRelatedPropertyDescription);
    } // end setRelatedPropertyDescription()

    /**
     * Get RelatedPropertyIsEnum
     *
     * @return relatedPropertyIsEnum
     */
    public String getRelatedPropertyIsEnum() {
        return objObjectRelationAttr.getRelatedPropertyIsEnum();
    } // end getRelatedPropertyIsEnum()

    /**
     * Set RelatedPropertyIsEnum
     *
     * @param aRelatedPropertyIsEnum
     */
    public void setRelatedPropertyIsEnum(String aRelatedPropertyIsEnum) {
        this.objObjectRelationAttr.setRelatedPropertyIsEnum(aRelatedPropertyIsEnum);
    } // end setRelatedPropertyIsEnum()

    /**
     * Get RelatedPropertyIsGenerate
     *
     * @return relatedPropertyIsGenerate
     */
    public String getRelatedPropertyIsGenerate() {
        return objObjectRelationAttr.getRelatedPropertyIsGenerate();
    } // end getRelatedPropertyIsGenerate()

    /**
     * Set RelatedPropertyIsGenerate
     *
     * @param aRelatedPropertyIsGenerate
     */
    public void setRelatedPropertyIsGenerate(String aRelatedPropertyIsGenerate) {
        this.objObjectRelationAttr.setRelatedPropertyIsGenerate(aRelatedPropertyIsGenerate);
    } // end setRelatedPropertyIsGenerate()

    /**
     * Get RelatedPropertyIsPrimaryProperty
     *
     * @return relatedPropertyIsPrimaryProperty
     */
    public String getRelatedPropertyIsPrimaryProperty() {
        return objObjectRelationAttr.getRelatedPropertyIsPrimaryProperty();
    } // end getRelatedPropertyIsPrimaryProperty()

    /**
     * Set RelatedPropertyIsPrimaryProperty
     *
     * @param aRelatedPropertyIsPrimaryProperty
     */
    public void setRelatedPropertyIsPrimaryProperty(
        String aRelatedPropertyIsPrimaryProperty) {
        this.objObjectRelationAttr.setRelatedPropertyIsPrimaryProperty(aRelatedPropertyIsPrimaryProperty);
    } // end setRelatedPropertyIsPrimaryProperty()

    /**
     * Get RelatedPropertyName
     *
     * @return relatedPropertyName
     */
    public String getRelatedPropertyName() {
        return objObjectRelationAttr.getRelatedPropertyName();
    } // end getRelatedPropertyName()

    /**
     * Set RelatedPropertyName
     *
     * @param aRelatedPropertyName
     */
    public void setRelatedPropertyName(String aRelatedPropertyName) {
        this.objObjectRelationAttr.setRelatedPropertyName(aRelatedPropertyName);
    } // end setRelatedPropertyName()

    /**
     * Get RelatedPropertyObjectId
     *
     * @return relatedPropertyObjectId
     */
    public long getRelatedPropertyObjectId() {
        return objObjectRelationAttr.getRelatedPropertyObjectId();
    } // end getRelatedPropertyObjectId()

    /**
     * Set RelatedPropertyObjectId
     *
     * @param aRelatedPropertyObjectId
     */
    public void setRelatedPropertyObjectId(long aRelatedPropertyObjectId) {
        this.objObjectRelationAttr.setRelatedPropertyObjectId(aRelatedPropertyObjectId);
    } // end setRelatedPropertyObjectId()

    /**
     * Get RelatedPropertyOrderIndex
     *
     * @return relatedPropertyOrderIndex
     */
    public Integer getRelatedPropertyOrderIndex() {
        return objObjectRelationAttr.getRelatedPropertyOrderIndex();
    } // end getRelatedPropertyOrderIndex()

    /**
     * Set RelatedPropertyOrderIndex
     *
     * @param aRelatedPropertyOrderIndex
     */
    public void setRelatedPropertyOrderIndex(Integer aRelatedPropertyOrderIndex) {
        this.objObjectRelationAttr.setRelatedPropertyOrderIndex(aRelatedPropertyOrderIndex);
    } // end setRelatedPropertyOrderIndex()

    /**
     * Get RelatedPropertyKind
     *
     * @return relatedPropertyKind
     */
    public String getRelatedPropertyKind() {
        return objObjectRelationAttr.getRelatedPropertyKind();
    } // end getRelatedPropertyKind()

    /**
     * Set RelatedPropertyKind
     *
     * @param aRelatedPropertyKind
     */
    public void setRelatedPropertyKind(String aRelatedPropertyKind) {
        this.objObjectRelationAttr.setRelatedPropertyKind(aRelatedPropertyKind);
    } // end setRelatedPropertyKind()

    /**
     * Get RelatedPropertyState
     *
     * @return relatedPropertyState
     */
    public String getRelatedPropertyState() {
        return objObjectRelationAttr.getRelatedPropertyState();
    } // end getRelatedPropertyState()

    /**
     * Set RelatedPropertyState
     *
     * @param aRelatedPropertyState
     */
    public void setRelatedPropertyState(String aRelatedPropertyState) {
        this.objObjectRelationAttr.setRelatedPropertyState(aRelatedPropertyState);
    } // end setRelatedPropertyState()

    /**
     * Get RelatedPropertyType
     *
     * @return relatedPropertyType
     */
    public String getRelatedPropertyType() {
        return objObjectRelationAttr.getRelatedPropertyType();
    } // end getRelatedPropertyType()

    /**
     * Set RelatedPropertyType
     *
     * @param aRelatedPropertyType
     */
    public void setRelatedPropertyType(String aRelatedPropertyType) {
        this.objObjectRelationAttr.setRelatedPropertyType(aRelatedPropertyType);
    } // end setRelatedPropertyType()

    /**
     * Get RelatedPropertyValue
     *
     * @return relatedPropertyValue
     */
    public String getRelatedPropertyValue() {
        return objObjectRelationAttr.getRelatedPropertyValue();
    } // end getRelatedPropertyValue()

    /**
     * Set RelatedPropertyValue
     *
     * @param aRelatedPropertyValue
     */
    public void setRelatedPropertyValue(String aRelatedPropertyValue) {
        this.objObjectRelationAttr.setRelatedPropertyValue(aRelatedPropertyValue);
    } // end setRelatedPropertyValue()

    /**
     * Get RelateAttrType
     *
     * @return relateAttrType
     */
    public String getRelateAttrType() {
        return objObjectRelationAttr.getRelateAttrType();
    } // end getRelateAttrType()

    /**
     * Set RelateAttrType
     *
     * @param aRelateAttrType
     */
    public void setRelateAttrType(String aRelateAttrType) {
        this.objObjectRelationAttr.setRelateAttrType(aRelateAttrType);
    } // end setRelateAttrType()

    /**
     * Get PropertyIsUnique
     *
     * @return propertyIsUnique
     */
    public String getPropertyIsUnique() {
        return objObjectRelationAttr.getPropertyIsUnique();
    } // end getPropertyIsUnique()

    /**
     * Get RelatedPropertyIsUnique
     *
     * @return relatedPropertyIsUnique
     */
    public String getRelatedPropertyIsUnique() {
        return objObjectRelationAttr.getRelatedPropertyIsUnique();
    } // end getRelatedPropertyIsUnique()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
    } // end hashCode()

    /**
     * DOCUMENT ME!
     *
     * @param obj DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } // end if

        if ((obj instanceof ObjectRelationAttrBean) == false) {
            return false;
        } // end if

        ObjectRelationAttrBean other = (ObjectRelationAttrBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.ObjectRelationAttr tempObjectRelationAttr = other.convertToObjectRelationAttr();

        if ((tempObjectRelationAttr == null) ||
                (this.objObjectRelationAttr == null)) {
            isEqual = false;
        } // end if
        else if ((tempObjectRelationAttr == this.objObjectRelationAttr) ||
                tempObjectRelationAttr.equals(this.objObjectRelationAttr)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelationAttrs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectRelationAttrBean[] toArray(
        com.ourteam.modelbase.dao.ObjectRelationAttr[] aObjectRelationAttrs) {
        return toArray(aObjectRelationAttrs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelationAttrs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectRelationAttrBean[] toArray(
        com.ourteam.modelbase.dao.ObjectRelationAttr[] aObjectRelationAttrs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aObjectRelationAttrs)) {
            return new ObjectRelationAttrBean[0];
        } // end if

        int length = aObjectRelationAttrs.length;

        ObjectRelationAttrBean[] beans = new ObjectRelationAttrBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectRelationAttrBean(aObjectRelationAttrs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectRelationAttrBean(aObjectRelationAttrs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aObjectRelationAttrs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ObjectRelationAttrBean
