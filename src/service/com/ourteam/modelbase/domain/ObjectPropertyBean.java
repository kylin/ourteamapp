/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * ∂‘œÛ Ù–‘ Generate date 2011-09-22 10:22:34
 *
 * @model auto gen
 */
public class ObjectPropertyBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.ObjectProperty objObjectProperty;

    static {
        mappedDaoFields.put("objectPropertyId",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.ObjectPropertyId);

        mappedDaoFields.put("dataSize",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.DataSize);

        mappedDaoFields.put("dataType",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.DataType);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.Description);

        mappedDaoFields.put("isEnum",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsEnum);

        mappedDaoFields.put("isGenerate",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsGenerate);

        mappedDaoFields.put("isPrimaryProperty",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsPrimaryProperty);

        mappedDaoFields.put("name",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.Name);

        mappedDaoFields.put("objectId",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.ObjectId);

        mappedDaoFields.put("orderIndex",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.OrderIndex);

        mappedDaoFields.put("propertyKind",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.PropertyKind);

        mappedDaoFields.put("state",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.State);

        mappedDaoFields.put("type",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.Type);

        mappedDaoFields.put("value",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.Value);

        mappedDaoFields.put("writable",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsWritable);

        mappedDaoFields.put("readable",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsReadable);

        mappedDaoFields.put("isUnique",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsUnique);

        mappedDaoFields.put("objectName",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.ObjectName);

        mappedDaoFields.put("isAllowNull",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsAllowNull);

        mappedDaoFields.put("precisionSize",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.PrecisionSize);

        mappedDaoFields.put("isArray",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.IsArray);

        mappedDaoFields.put("referenceObjectId",
            com.ourteam.modelbase.dao.IObjectPropertyDAO.ReferenceObjectId);
    } 

    /**
     * Creates a new ObjectPropertyBean object.
     */
    public ObjectPropertyBean() {
        super();

        objObjectProperty = new com.ourteam.modelbase.dao.ObjectProperty();
    } // end ObjectPropertyBean()

    /**
     * Creates a new ObjectPropertyBean object.
     *
     * @param aObjectProperty DOCUMENT ME!
     */
    public ObjectPropertyBean(
        com.ourteam.modelbase.dao.ObjectProperty aObjectProperty) {
        super();

        objObjectProperty = aObjectProperty;
    } // end ObjectPropertyBean()

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
    public com.ourteam.modelbase.dao.ObjectProperty convertToObjectProperty() {
        return objObjectProperty;
    } // end convertToObjectProperty()

    /**
     * Get ObjectPropertyId
     *
     * @return objectPropertyId
     */
    public long getObjectPropertyId() {
        return objObjectProperty.getObjectPropertyId();
    } // end getObjectPropertyId()

    /**
     * Set ObjectPropertyId
     *
     * @param aObjectPropertyId
     */
    public void setObjectPropertyId(long aObjectPropertyId) {
        this.objObjectProperty.setObjectPropertyId(aObjectPropertyId);
    } // end setObjectPropertyId()

    /**
     * Get DataSize
     *
     * @return dataSize
     */
    public int getDataSize() {
        if (objObjectProperty.getDataSize() != null) {
            return ((Number) objObjectProperty.getDataSize()).intValue();
        } // end if
        else {
            return 0;
        } // end else
    } // end getDataSize()

    /**
     * Set DataSize
     *
     * @param aDataSize
     */
    public void setDataSize(int aDataSize) {
        this.objObjectProperty.setDataSize(Integer.valueOf(aDataSize));
    } // end setDataSize()

    /**
     * Get DataType
     *
     * @return dataType
     */
    public String getDataType() {
        return objObjectProperty.getDataType();
    } // end getDataType()

    /**
     * Set DataType
     *
     * @param aDataType
     */
    public void setDataType(String aDataType) {
        this.objObjectProperty.setDataType(aDataType);
    } // end setDataType()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objObjectProperty.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objObjectProperty.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get IsEnum
     *
     * @return isEnum
     */
    public String getIsEnum() {
        return objObjectProperty.getIsEnum();
    } // end getIsEnum()

    /**
     * Set IsEnum
     *
     * @param aIsEnum
     */
    public void setIsEnum(String aIsEnum) {
        this.objObjectProperty.setIsEnum(aIsEnum);
    } // end setIsEnum()

    /**
     * Get IsGenerate
     *
     * @return isGenerate
     */
    public String getIsGenerate() {
        return objObjectProperty.getIsGenerate();
    } // end getIsGenerate()

    /**
     * Set IsGenerate
     *
     * @param aIsGenerate
     */
    public void setIsGenerate(String aIsGenerate) {
        this.objObjectProperty.setIsGenerate(aIsGenerate);
    } // end setIsGenerate()

    /**
     * Get IsPrimaryProperty
     *
     * @return isPrimaryProperty
     */
    public String getIsPrimaryProperty() {
        return objObjectProperty.getIsPrimaryProperty();
    } // end getIsPrimaryProperty()

    /**
     * Set IsPrimaryProperty
     *
     * @param aIsPrimaryProperty
     */
    public void setIsPrimaryProperty(String aIsPrimaryProperty) {
        this.objObjectProperty.setIsPrimaryProperty(aIsPrimaryProperty);
    } // end setIsPrimaryProperty()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objObjectProperty.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objObjectProperty.setName(aName);
    } // end setName()

    /**
     * Get ObjectId
     *
     * @return objectId
     */
    public long getObjectId() {
        return objObjectProperty.getObjectId();
    } // end getObjectId()

    /**
     * Set ObjectId
     *
     * @param aObjectId
     */
    public void setObjectId(long aObjectId) {
        this.objObjectProperty.setObjectId(aObjectId);
    } // end setObjectId()

    /**
     * Get OrderIndex
     *
     * @return orderIndex
     */
    public int getOrderIndex() {
        if (objObjectProperty.getOrderIndex() != null) {
            return ((Number) objObjectProperty.getOrderIndex()).intValue();
        } // end if
        else {
            return 0;
        } // end else
    } // end getOrderIndex()

    /**
     * Set OrderIndex
     *
     * @param aOrderIndex
     */
    public void setOrderIndex(int aOrderIndex) {
        this.objObjectProperty.setOrderIndex(Integer.valueOf(aOrderIndex));
    } // end setOrderIndex()

    /**
     * Get PropertyKind
     *
     * @return propertyKind
     */
    public String getPropertyKind() {
        return objObjectProperty.getPropertyKind();
    } // end getPropertyKind()

    /**
     * Set PropertyKind
     *
     * @param aPropertyKind
     */
    public void setPropertyKind(String aPropertyKind) {
        this.objObjectProperty.setPropertyKind(aPropertyKind);
    } // end setPropertyKind()

    /**
     * Get State
     *
     * @return state
     */
    public String getState() {
        return objObjectProperty.getState();
    } // end getState()

    /**
     * Set State
     *
     * @param aState
     */
    public void setState(String aState) {
        this.objObjectProperty.setState(aState);
    } // end setState()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objObjectProperty.getType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objObjectProperty.setType(aType);
    } // end setType()

    /**
     * Get Value
     *
     * @return value
     */
    public String getValue() {
        return objObjectProperty.getValue();
    } // end getValue()

    /**
     * Set Value
     *
     * @param aValue
     */
    public void setValue(String aValue) {
        this.objObjectProperty.setValue(aValue);
    } // end setValue()

    /**
     * Get Writable
     *
     * @return writable
     */
    public String getWritable() {
        return objObjectProperty.getIsWritable();
    } // end getWritable()

    /**
     * Set Writable
     *
     * @param aWritable
     */
    public void setWritable(String aWritable) {
        this.objObjectProperty.setIsWritable(aWritable);
    } // end setWritable()

    /**
     * Get Readable
     *
     * @return readable
     */
    public String getReadable() {
        return objObjectProperty.getIsReadable();
    } // end getReadable()

    /**
     * Set Readable
     *
     * @param aReadable
     */
    public void setReadable(String aReadable) {
        this.objObjectProperty.setIsReadable(aReadable);
    } // end setReadable()

    /**
     * Get IsUnique
     *
     * @return isUnique
     */
    public String getIsUnique() {
        return objObjectProperty.getIsUnique();
    } // end getIsUnique()

    /**
     * Set IsUnique
     *
     * @param aIsUnique
     */
    public void setIsUnique(String aIsUnique) {
        this.objObjectProperty.setIsUnique(aIsUnique);
    } // end setIsUnique()

    /**
     * Get ObjectName
     *
     * @return objectName
     */
    public String getObjectName() {
        return objObjectProperty.getObjectName();
    } // end getObjectName()

    /**
     * Get IsAllowNull
     *
     * @return isAllowNull
     */
    public String getIsAllowNull() {
        return objObjectProperty.getIsAllowNull();
    } // end getIsAllowNull()

    /**
     * Set IsAllowNull
     *
     * @param aIsAllowNull
     */
    public void setIsAllowNull(String aIsAllowNull) {
        this.objObjectProperty.setIsAllowNull(aIsAllowNull);
    } // end setIsAllowNull()

    /**
     * Get PrecisionSize
     *
     * @return precisionSize
     */
    public int getPrecisionSize() {
        if (objObjectProperty.getPrecisionSize() != null) {
            return ((Number) objObjectProperty.getPrecisionSize()).intValue();
        } // end if
        else {
            return 0;
        } // end else
    } // end getPrecisionSize()

    /**
     * Set PrecisionSize
     *
     * @param aPrecisionSize
     */
    public void setPrecisionSize(int aPrecisionSize) {
        this.objObjectProperty.setPrecisionSize(Integer.valueOf(aPrecisionSize));
    } // end setPrecisionSize()

    /**
     * Get IsArray
     *
     * @return isArray
     */
    public String getIsArray() {
        return objObjectProperty.getIsArray();
    } // end getIsArray()

    /**
     * Set IsArray
     *
     * @param aIsArray
     */
    public void setIsArray(String aIsArray) {
        this.objObjectProperty.setIsArray(aIsArray);
    } // end setIsArray()

    /**
     * Get ReferenceObjectId
     *
     * @return referenceObjectId
     */
    public Long getReferenceObjectId() {
        return objObjectProperty.getReferenceObjectId();
    } // end getReferenceObjectId()

    /**
     * Set ReferenceObjectId
     *
     * @param aReferenceObjectId
     */
    public void setReferenceObjectId(Long aReferenceObjectId) {
        this.objObjectProperty.setReferenceObjectId(aReferenceObjectId);
    } // end setReferenceObjectId()

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

        if ((obj instanceof ObjectPropertyBean) == false) {
            return false;
        } // end if

        ObjectPropertyBean other = (ObjectPropertyBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.ObjectProperty tempObjectProperty = other.convertToObjectProperty();

        if ((tempObjectProperty == null) || (this.objObjectProperty == null)) {
            isEqual = false;
        } // end if
        else if ((tempObjectProperty == this.objObjectProperty) ||
                tempObjectProperty.equals(this.objObjectProperty)) {
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
     * @param aObjectPropertys DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectPropertyBean[] toArray(
        com.ourteam.modelbase.dao.ObjectProperty[] aObjectPropertys) {
        return toArray(aObjectPropertys, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectPropertys DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectPropertyBean[] toArray(
        com.ourteam.modelbase.dao.ObjectProperty[] aObjectPropertys,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aObjectPropertys)) {
            return new ObjectPropertyBean[0];
        } // end if

        int length = aObjectPropertys.length;

        ObjectPropertyBean[] beans = new ObjectPropertyBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectPropertyBean(aObjectPropertys[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectPropertyBean(aObjectPropertys[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aObjectPropertys[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ObjectPropertyBean
