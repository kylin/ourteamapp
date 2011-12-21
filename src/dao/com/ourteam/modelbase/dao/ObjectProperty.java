/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * ¶ÔÏóÊôÐÔ Generate Date 2011-09-22 10:16:41
 *
 * @author Auto Gen
 */
public class ObjectProperty implements java.io.Serializable {
    /**
     * Creates a new ObjectProperty object.
     */
    public ObjectProperty() {
        super();
    } // end ObjectProperty()

    /** Attribute */
    private long objectPropertyId;

    /** Attribute  Be Seted Falg */
    private boolean objectPropertyIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectPropertyIdNull = false;

    /** Attribute */
    private Integer dataSize;

    /** Attribute  Be Seted Falg */
    private boolean dataSizeSetted = false;

    /** Attribute  is Null Falg */
    private boolean dataSizeNull = false;

    /** Attribute */
    private String dataType;

    /** Attribute  Be Seted Falg */
    private boolean dataTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean dataTypeNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private String isEnum;

    /** Attribute  Be Seted Falg */
    private boolean isEnumSetted = false;

    /** Attribute  is Null Falg */
    private boolean isEnumNull = false;

    /** Attribute */
    private String isGenerate;

    /** Attribute  Be Seted Falg */
    private boolean isGenerateSetted = false;

    /** Attribute  is Null Falg */
    private boolean isGenerateNull = false;

    /** Attribute */
    private String isPrimaryProperty;

    /** Attribute  Be Seted Falg */
    private boolean isPrimaryPropertySetted = false;

    /** Attribute  is Null Falg */
    private boolean isPrimaryPropertyNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private long objectId;

    /** Attribute  Be Seted Falg */
    private boolean objectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectIdNull = false;

    /** Attribute */
    private Integer orderIndex;

    /** Attribute  Be Seted Falg */
    private boolean orderIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean orderIndexNull = false;

    /** Attribute */
    private String propertyKind;

    /** Attribute  Be Seted Falg */
    private boolean propertyKindSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyKindNull = false;

    /** Attribute */
    private String state;

    /** Attribute  Be Seted Falg */
    private boolean stateSetted = false;

    /** Attribute  is Null Falg */
    private boolean stateNull = false;

    /** Attribute */
    private String type;

    /** Attribute  Be Seted Falg */
    private boolean typeSetted = false;

    /** Attribute  is Null Falg */
    private boolean typeNull = false;

    /** Attribute */
    private String value;

    /** Attribute  Be Seted Falg */
    private boolean valueSetted = false;

    /** Attribute  is Null Falg */
    private boolean valueNull = false;

    /** Attribute */
    private String isUnique;

    /** Attribute  Be Seted Falg */
    private boolean isUniqueSetted = false;

    /** Attribute  is Null Falg */
    private boolean isUniqueNull = false;

    /** Attribute */
    private String objectName;

    /** Attribute  Be Seted Falg */
    private boolean objectNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectNameNull = false;

    /** Attribute */
    private String isAllowNull;

    /** Attribute  Be Seted Falg */
    private boolean isAllowNullSetted = false;

    /** Attribute  is Null Falg */
    private boolean isAllowNullNull = false;

    /** Attribute */
    private Integer precisionSize;

    /** Attribute  Be Seted Falg */
    private boolean precisionSizeSetted = false;

    /** Attribute  is Null Falg */
    private boolean precisionSizeNull = false;

    /** Attribute */
    private String isReadable;

    /** Attribute  Be Seted Falg */
    private boolean isReadableSetted = false;

    /** Attribute  is Null Falg */
    private boolean isReadableNull = false;

    /** Attribute */
    private String isWritable;

    /** Attribute  Be Seted Falg */
    private boolean isWritableSetted = false;

    /** Attribute  is Null Falg */
    private boolean isWritableNull = false;

    /** Attribute */
    private String isArray;

    /** Attribute  Be Seted Falg */
    private boolean isArraySetted = false;

    /** Attribute  is Null Falg */
    private boolean isArrayNull = false;

    /** Attribute */
    private Long referenceObjectId;

    /** Attribute  Be Seted Falg */
    private boolean referenceObjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean referenceObjectIdNull = false;

    /**
     * Get ObjectPropertyId
     *
     * @return objectPropertyId
     */
    final public long getObjectPropertyId() {
        return objectPropertyId;
    } // end getObjectPropertyId()

    /**
     * Set ObjectPropertyId
     *
     * @param aObjectPropertyId
     */
    final public void setObjectPropertyId(long aObjectPropertyId) {
        this.objectPropertyId = aObjectPropertyId;

        this.objectPropertyIdSetted = true;

        this.setObjectPropertyIdNull(false);
    } // end setObjectPropertyId()

    /**
     * Get ObjectPropertyId Has Been Setted
     *
     * @return objectPropertyId
     */
    final public boolean isObjectPropertyIdSetted() {
        return this.objectPropertyIdSetted;
    } // end isObjectPropertyIdSetted()

    /**
     * Set ObjectPropertyId Null
     */
    final public void setObjectPropertyIdNull() {
        this.objectPropertyIdNull = true;
    } // end setObjectPropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectPropertyIdNull(boolean aNullFlag) {
        this.objectPropertyIdNull = aNullFlag;
    } // end setObjectPropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectPropertyIdNull() {
        return this.objectPropertyIdNull;
    } // end isObjectPropertyIdNull()

    /**
     * Get DataSize
     *
     * @return dataSize
     */
    final public Integer getDataSize() {
        return dataSize;
    } // end getDataSize()

    /**
     * Set DataSize
     *
     * @param aDataSize
     */
    final public void setDataSize(Integer aDataSize) {
        this.dataSize = aDataSize;

        this.dataSizeSetted = true;

        this.setDataSizeNull(this.dataSize == null);
    } // end setDataSize()

    /**
     * Get DataSize Has Been Setted
     *
     * @return dataSize
     */
    final public boolean isDataSizeSetted() {
        return this.dataSizeSetted;
    } // end isDataSizeSetted()

    /**
     * Set DataSize Null
     */
    final public void setDataSizeNull() {
        this.dataSizeNull = true;
    } // end setDataSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDataSizeNull(boolean aNullFlag) {
        this.dataSizeNull = aNullFlag;
    } // end setDataSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDataSizeNull() {
        return this.dataSizeNull;
    } // end isDataSizeNull()

    /**
     * Get DataType
     *
     * @return dataType
     */
    final public String getDataType() {
        return dataType;
    } // end getDataType()

    /**
     * Set DataType
     *
     * @param aDataType
     */
    final public void setDataType(String aDataType) {
        this.dataType = aDataType;

        this.dataTypeSetted = true;

        this.setDataTypeNull(this.dataType == null);
    } // end setDataType()

    /**
     * Get DataType Has Been Setted
     *
     * @return dataType
     */
    final public boolean isDataTypeSetted() {
        return this.dataTypeSetted;
    } // end isDataTypeSetted()

    /**
     * Set DataType Null
     */
    final public void setDataTypeNull() {
        this.dataTypeNull = true;
    } // end setDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDataTypeNull(boolean aNullFlag) {
        this.dataTypeNull = aNullFlag;
    } // end setDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDataTypeNull() {
        return this.dataTypeNull;
    } // end isDataTypeNull()

    /**
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        return description;
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    final public void setDescription(String aDescription) {
        this.description = aDescription;

        this.descriptionSetted = true;

        this.setDescriptionNull(this.description == null);
    } // end setDescription()

    /**
     * Get Description Has Been Setted
     *
     * @return description
     */
    final public boolean isDescriptionSetted() {
        return this.descriptionSetted;
    } // end isDescriptionSetted()

    /**
     * Set Description Null
     */
    final public void setDescriptionNull() {
        this.descriptionNull = true;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDescriptionNull(boolean aNullFlag) {
        this.descriptionNull = aNullFlag;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDescriptionNull() {
        return this.descriptionNull;
    } // end isDescriptionNull()

    /**
     * Get IsEnum
     *
     * @return isEnum
     */
    final public String getIsEnum() {
        return isEnum;
    } // end getIsEnum()

    /**
     * Set IsEnum
     *
     * @param aIsEnum
     */
    final public void setIsEnum(String aIsEnum) {
        this.isEnum = aIsEnum;

        this.isEnumSetted = true;

        this.setIsEnumNull(this.isEnum == null);
    } // end setIsEnum()

    /**
     * Get IsEnum Has Been Setted
     *
     * @return isEnum
     */
    final public boolean isIsEnumSetted() {
        return this.isEnumSetted;
    } // end isIsEnumSetted()

    /**
     * Set IsEnum Null
     */
    final public void setIsEnumNull() {
        this.isEnumNull = true;
    } // end setIsEnumNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsEnumNull(boolean aNullFlag) {
        this.isEnumNull = aNullFlag;
    } // end setIsEnumNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsEnumNull() {
        return this.isEnumNull;
    } // end isIsEnumNull()

    /**
     * Get IsGenerate
     *
     * @return isGenerate
     */
    final public String getIsGenerate() {
        return isGenerate;
    } // end getIsGenerate()

    /**
     * Set IsGenerate
     *
     * @param aIsGenerate
     */
    final public void setIsGenerate(String aIsGenerate) {
        this.isGenerate = aIsGenerate;

        this.isGenerateSetted = true;

        this.setIsGenerateNull(this.isGenerate == null);
    } // end setIsGenerate()

    /**
     * Get IsGenerate Has Been Setted
     *
     * @return isGenerate
     */
    final public boolean isIsGenerateSetted() {
        return this.isGenerateSetted;
    } // end isIsGenerateSetted()

    /**
     * Set IsGenerate Null
     */
    final public void setIsGenerateNull() {
        this.isGenerateNull = true;
    } // end setIsGenerateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsGenerateNull(boolean aNullFlag) {
        this.isGenerateNull = aNullFlag;
    } // end setIsGenerateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsGenerateNull() {
        return this.isGenerateNull;
    } // end isIsGenerateNull()

    /**
     * Get IsPrimaryProperty
     *
     * @return isPrimaryProperty
     */
    final public String getIsPrimaryProperty() {
        return isPrimaryProperty;
    } // end getIsPrimaryProperty()

    /**
     * Set IsPrimaryProperty
     *
     * @param aIsPrimaryProperty
     */
    final public void setIsPrimaryProperty(String aIsPrimaryProperty) {
        this.isPrimaryProperty = aIsPrimaryProperty;

        this.isPrimaryPropertySetted = true;

        this.setIsPrimaryPropertyNull(this.isPrimaryProperty == null);
    } // end setIsPrimaryProperty()

    /**
     * Get IsPrimaryProperty Has Been Setted
     *
     * @return isPrimaryProperty
     */
    final public boolean isIsPrimaryPropertySetted() {
        return this.isPrimaryPropertySetted;
    } // end isIsPrimaryPropertySetted()

    /**
     * Set IsPrimaryProperty Null
     */
    final public void setIsPrimaryPropertyNull() {
        this.isPrimaryPropertyNull = true;
    } // end setIsPrimaryPropertyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsPrimaryPropertyNull(boolean aNullFlag) {
        this.isPrimaryPropertyNull = aNullFlag;
    } // end setIsPrimaryPropertyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsPrimaryPropertyNull() {
        return this.isPrimaryPropertyNull;
    } // end isIsPrimaryPropertyNull()

    /**
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

    /**
     * Get ObjectId
     *
     * @return objectId
     */
    final public long getObjectId() {
        return objectId;
    } // end getObjectId()

    /**
     * Set ObjectId
     *
     * @param aObjectId
     */
    final public void setObjectId(long aObjectId) {
        this.objectId = aObjectId;

        this.objectIdSetted = true;

        this.setObjectIdNull(false);
    } // end setObjectId()

    /**
     * Get ObjectId Has Been Setted
     *
     * @return objectId
     */
    final public boolean isObjectIdSetted() {
        return this.objectIdSetted;
    } // end isObjectIdSetted()

    /**
     * Set ObjectId Null
     */
    final public void setObjectIdNull() {
        this.objectIdNull = true;
    } // end setObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectIdNull(boolean aNullFlag) {
        this.objectIdNull = aNullFlag;
    } // end setObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectIdNull() {
        return this.objectIdNull;
    } // end isObjectIdNull()

    /**
     * Get OrderIndex
     *
     * @return orderIndex
     */
    final public Integer getOrderIndex() {
        return orderIndex;
    } // end getOrderIndex()

    /**
     * Set OrderIndex
     *
     * @param aOrderIndex
     */
    final public void setOrderIndex(Integer aOrderIndex) {
        this.orderIndex = aOrderIndex;

        this.orderIndexSetted = true;

        this.setOrderIndexNull(this.orderIndex == null);
    } // end setOrderIndex()

    /**
     * Get OrderIndex Has Been Setted
     *
     * @return orderIndex
     */
    final public boolean isOrderIndexSetted() {
        return this.orderIndexSetted;
    } // end isOrderIndexSetted()

    /**
     * Set OrderIndex Null
     */
    final public void setOrderIndexNull() {
        this.orderIndexNull = true;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOrderIndexNull(boolean aNullFlag) {
        this.orderIndexNull = aNullFlag;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOrderIndexNull() {
        return this.orderIndexNull;
    } // end isOrderIndexNull()

    /**
     * Get PropertyKind
     *
     * @return propertyKind
     */
    final public String getPropertyKind() {
        return propertyKind;
    } // end getPropertyKind()

    /**
     * Set PropertyKind
     *
     * @param aPropertyKind
     */
    final public void setPropertyKind(String aPropertyKind) {
        this.propertyKind = aPropertyKind;

        this.propertyKindSetted = true;

        this.setPropertyKindNull(this.propertyKind == null);
    } // end setPropertyKind()

    /**
     * Get PropertyKind Has Been Setted
     *
     * @return propertyKind
     */
    final public boolean isPropertyKindSetted() {
        return this.propertyKindSetted;
    } // end isPropertyKindSetted()

    /**
     * Set PropertyKind Null
     */
    final public void setPropertyKindNull() {
        this.propertyKindNull = true;
    } // end setPropertyKindNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyKindNull(boolean aNullFlag) {
        this.propertyKindNull = aNullFlag;
    } // end setPropertyKindNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyKindNull() {
        return this.propertyKindNull;
    } // end isPropertyKindNull()

    /**
     * Get State
     *
     * @return state
     */
    final public String getState() {
        return state;
    } // end getState()

    /**
     * Set State
     *
     * @param aState
     */
    final public void setState(String aState) {
        this.state = aState;

        this.stateSetted = true;

        this.setStateNull(this.state == null);
    } // end setState()

    /**
     * Get State Has Been Setted
     *
     * @return state
     */
    final public boolean isStateSetted() {
        return this.stateSetted;
    } // end isStateSetted()

    /**
     * Set State Null
     */
    final public void setStateNull() {
        this.stateNull = true;
    } // end setStateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStateNull(boolean aNullFlag) {
        this.stateNull = aNullFlag;
    } // end setStateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStateNull() {
        return this.stateNull;
    } // end isStateNull()

    /**
     * Get Type
     *
     * @return type
     */
    final public String getType() {
        return type;
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    final public void setType(String aType) {
        this.type = aType;

        this.typeSetted = true;

        this.setTypeNull(this.type == null);
    } // end setType()

    /**
     * Get Type Has Been Setted
     *
     * @return type
     */
    final public boolean isTypeSetted() {
        return this.typeSetted;
    } // end isTypeSetted()

    /**
     * Set Type Null
     */
    final public void setTypeNull() {
        this.typeNull = true;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTypeNull(boolean aNullFlag) {
        this.typeNull = aNullFlag;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTypeNull() {
        return this.typeNull;
    } // end isTypeNull()

    /**
     * Get Value
     *
     * @return value
     */
    final public String getValue() {
        return value;
    } // end getValue()

    /**
     * Set Value
     *
     * @param aValue
     */
    final public void setValue(String aValue) {
        this.value = aValue;

        this.valueSetted = true;

        this.setValueNull(this.value == null);
    } // end setValue()

    /**
     * Get Value Has Been Setted
     *
     * @return value
     */
    final public boolean isValueSetted() {
        return this.valueSetted;
    } // end isValueSetted()

    /**
     * Set Value Null
     */
    final public void setValueNull() {
        this.valueNull = true;
    } // end setValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setValueNull(boolean aNullFlag) {
        this.valueNull = aNullFlag;
    } // end setValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isValueNull() {
        return this.valueNull;
    } // end isValueNull()

    /**
     * Get IsUnique
     *
     * @return isUnique
     */
    final public String getIsUnique() {
        return isUnique;
    } // end getIsUnique()

    /**
     * Set IsUnique
     *
     * @param aIsUnique
     */
    final public void setIsUnique(String aIsUnique) {
        this.isUnique = aIsUnique;

        this.isUniqueSetted = true;

        this.setIsUniqueNull(this.isUnique == null);
    } // end setIsUnique()

    /**
     * Get IsUnique Has Been Setted
     *
     * @return isUnique
     */
    final public boolean isIsUniqueSetted() {
        return this.isUniqueSetted;
    } // end isIsUniqueSetted()

    /**
     * Set IsUnique Null
     */
    final public void setIsUniqueNull() {
        this.isUniqueNull = true;
    } // end setIsUniqueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsUniqueNull(boolean aNullFlag) {
        this.isUniqueNull = aNullFlag;
    } // end setIsUniqueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsUniqueNull() {
        return this.isUniqueNull;
    } // end isIsUniqueNull()

    /**
     * Get ObjectName
     *
     * @return objectName
     */
    final public String getObjectName() {
        return objectName;
    } // end getObjectName()

    /**
     * Set ObjectName
     *
     * @param aObjectName
     */
    final public void setObjectName(String aObjectName) {
        this.objectName = aObjectName;

        this.objectNameSetted = true;

        this.setObjectNameNull(this.objectName == null);
    } // end setObjectName()

    /**
     * Get ObjectName Has Been Setted
     *
     * @return objectName
     */
    final public boolean isObjectNameSetted() {
        return this.objectNameSetted;
    } // end isObjectNameSetted()

    /**
     * Set ObjectName Null
     */
    final public void setObjectNameNull() {
        this.objectNameNull = true;
    } // end setObjectNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectNameNull(boolean aNullFlag) {
        this.objectNameNull = aNullFlag;
    } // end setObjectNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectNameNull() {
        return this.objectNameNull;
    } // end isObjectNameNull()

    /**
     * Get IsAllowNull
     *
     * @return isAllowNull
     */
    final public String getIsAllowNull() {
        return isAllowNull;
    } // end getIsAllowNull()

    /**
     * Set IsAllowNull
     *
     * @param aIsAllowNull
     */
    final public void setIsAllowNull(String aIsAllowNull) {
        this.isAllowNull = aIsAllowNull;

        this.isAllowNullSetted = true;

        this.setIsAllowNullNull(this.isAllowNull == null);
    } // end setIsAllowNull()

    /**
     * Get IsAllowNull Has Been Setted
     *
     * @return isAllowNull
     */
    final public boolean isIsAllowNullSetted() {
        return this.isAllowNullSetted;
    } // end isIsAllowNullSetted()

    /**
     * Set IsAllowNull Null
     */
    final public void setIsAllowNullNull() {
        this.isAllowNullNull = true;
    } // end setIsAllowNullNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsAllowNullNull(boolean aNullFlag) {
        this.isAllowNullNull = aNullFlag;
    } // end setIsAllowNullNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsAllowNullNull() {
        return this.isAllowNullNull;
    } // end isIsAllowNullNull()

    /**
     * Get PrecisionSize
     *
     * @return precisionSize
     */
    final public Integer getPrecisionSize() {
        return precisionSize;
    } // end getPrecisionSize()

    /**
     * Set PrecisionSize
     *
     * @param aPrecisionSize
     */
    final public void setPrecisionSize(Integer aPrecisionSize) {
        this.precisionSize = aPrecisionSize;

        this.precisionSizeSetted = true;

        this.setPrecisionSizeNull(this.precisionSize == null);
    } // end setPrecisionSize()

    /**
     * Get PrecisionSize Has Been Setted
     *
     * @return precisionSize
     */
    final public boolean isPrecisionSizeSetted() {
        return this.precisionSizeSetted;
    } // end isPrecisionSizeSetted()

    /**
     * Set PrecisionSize Null
     */
    final public void setPrecisionSizeNull() {
        this.precisionSizeNull = true;
    } // end setPrecisionSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPrecisionSizeNull(boolean aNullFlag) {
        this.precisionSizeNull = aNullFlag;
    } // end setPrecisionSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPrecisionSizeNull() {
        return this.precisionSizeNull;
    } // end isPrecisionSizeNull()

    /**
     * Get IsReadable
     *
     * @return isReadable
     */
    final public String getIsReadable() {
        return isReadable;
    } // end getIsReadable()

    /**
     * Set IsReadable
     *
     * @param aIsReadable
     */
    final public void setIsReadable(String aIsReadable) {
        this.isReadable = aIsReadable;

        this.isReadableSetted = true;

        this.setIsReadableNull(this.isReadable == null);
    } // end setIsReadable()

    /**
     * Get IsReadable Has Been Setted
     *
     * @return isReadable
     */
    final public boolean isIsReadableSetted() {
        return this.isReadableSetted;
    } // end isIsReadableSetted()

    /**
     * Set IsReadable Null
     */
    final public void setIsReadableNull() {
        this.isReadableNull = true;
    } // end setIsReadableNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsReadableNull(boolean aNullFlag) {
        this.isReadableNull = aNullFlag;
    } // end setIsReadableNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsReadableNull() {
        return this.isReadableNull;
    } // end isIsReadableNull()

    /**
     * Get IsWritable
     *
     * @return isWritable
     */
    final public String getIsWritable() {
        return isWritable;
    } // end getIsWritable()

    /**
     * Set IsWritable
     *
     * @param aIsWritable
     */
    final public void setIsWritable(String aIsWritable) {
        this.isWritable = aIsWritable;

        this.isWritableSetted = true;

        this.setIsWritableNull(this.isWritable == null);
    } // end setIsWritable()

    /**
     * Get IsWritable Has Been Setted
     *
     * @return isWritable
     */
    final public boolean isIsWritableSetted() {
        return this.isWritableSetted;
    } // end isIsWritableSetted()

    /**
     * Set IsWritable Null
     */
    final public void setIsWritableNull() {
        this.isWritableNull = true;
    } // end setIsWritableNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsWritableNull(boolean aNullFlag) {
        this.isWritableNull = aNullFlag;
    } // end setIsWritableNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsWritableNull() {
        return this.isWritableNull;
    } // end isIsWritableNull()

    /**
     * Get IsArray
     *
     * @return isArray
     */
    final public String getIsArray() {
        return isArray;
    } // end getIsArray()

    /**
     * Set IsArray
     *
     * @param aIsArray
     */
    final public void setIsArray(String aIsArray) {
        this.isArray = aIsArray;

        this.isArraySetted = true;

        this.setIsArrayNull(this.isArray == null);
    } // end setIsArray()

    /**
     * Get IsArray Has Been Setted
     *
     * @return isArray
     */
    final public boolean isIsArraySetted() {
        return this.isArraySetted;
    } // end isIsArraySetted()

    /**
     * Set IsArray Null
     */
    final public void setIsArrayNull() {
        this.isArrayNull = true;
    } // end setIsArrayNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsArrayNull(boolean aNullFlag) {
        this.isArrayNull = aNullFlag;
    } // end setIsArrayNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsArrayNull() {
        return this.isArrayNull;
    } // end isIsArrayNull()

    /**
     * Get ReferenceObjectId
     *
     * @return referenceObjectId
     */
    final public Long getReferenceObjectId() {
        return referenceObjectId;
    } // end getReferenceObjectId()

    /**
     * Set ReferenceObjectId
     *
     * @param aReferenceObjectId
     */
    final public void setReferenceObjectId(Long aReferenceObjectId) {
        this.referenceObjectId = aReferenceObjectId;

        this.referenceObjectIdSetted = true;

        this.setReferenceObjectIdNull(this.referenceObjectId == null);
    } // end setReferenceObjectId()

    /**
     * Get ReferenceObjectId Has Been Setted
     *
     * @return referenceObjectId
     */
    final public boolean isReferenceObjectIdSetted() {
        return this.referenceObjectIdSetted;
    } // end isReferenceObjectIdSetted()

    /**
     * Set ReferenceObjectId Null
     */
    final public void setReferenceObjectIdNull() {
        this.referenceObjectIdNull = true;
    } // end setReferenceObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReferenceObjectIdNull(boolean aNullFlag) {
        this.referenceObjectIdNull = aNullFlag;
    } // end setReferenceObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReferenceObjectIdNull() {
        return this.referenceObjectIdNull;
    } // end isReferenceObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) +
            (int) (getObjectPropertyId() ^ (getObjectPropertyId() >>> 32));

        return result;
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

        if ((obj instanceof ObjectProperty) == false) {
            return false;
        } // end if

        ObjectProperty other = (ObjectProperty) obj;

        if (other == this) {
            return true;
        } // end if

        if (getObjectPropertyId() != other.getObjectPropertyId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("objectPropertyId=");
        buffer.append(this.objectPropertyId);
        buffer.append("\r\n");

        buffer.append("dataSize=");
        buffer.append(this.dataSize);
        buffer.append("\r\n");

        buffer.append("dataType=");
        buffer.append(this.dataType);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("isEnum=");
        buffer.append(this.isEnum);
        buffer.append("\r\n");

        buffer.append("isGenerate=");
        buffer.append(this.isGenerate);
        buffer.append("\r\n");

        buffer.append("isPrimaryProperty=");
        buffer.append(this.isPrimaryProperty);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("objectId=");
        buffer.append(this.objectId);
        buffer.append("\r\n");

        buffer.append("orderIndex=");
        buffer.append(this.orderIndex);
        buffer.append("\r\n");

        buffer.append("propertyKind=");
        buffer.append(this.propertyKind);
        buffer.append("\r\n");

        buffer.append("state=");
        buffer.append(this.state);
        buffer.append("\r\n");

        buffer.append("type=");
        buffer.append(this.type);
        buffer.append("\r\n");

        buffer.append("value=");
        buffer.append(this.value);
        buffer.append("\r\n");

        buffer.append("isUnique=");
        buffer.append(this.isUnique);
        buffer.append("\r\n");

        buffer.append("objectName=");
        buffer.append(this.objectName);
        buffer.append("\r\n");

        buffer.append("isAllowNull=");
        buffer.append(this.isAllowNull);
        buffer.append("\r\n");

        buffer.append("precisionSize=");
        buffer.append(this.precisionSize);
        buffer.append("\r\n");

        buffer.append("isReadable=");
        buffer.append(this.isReadable);
        buffer.append("\r\n");

        buffer.append("isWritable=");
        buffer.append(this.isWritable);
        buffer.append("\r\n");

        buffer.append("isArray=");
        buffer.append(this.isArray);
        buffer.append("\r\n");

        buffer.append("referenceObjectId=");
        buffer.append(this.referenceObjectId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ObjectProperty
