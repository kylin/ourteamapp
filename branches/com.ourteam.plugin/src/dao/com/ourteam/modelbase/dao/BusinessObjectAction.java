/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * 业务对象动作 Generate Date 2011-09-22 10:16:36
 *
 * @author Auto Gen
 */
public class BusinessObjectAction implements java.io.Serializable {
    /**
     * Creates a new BusinessObjectAction object.
     */
    public BusinessObjectAction() {
        super();
    } // end BusinessObjectAction()

    /** Attribute */
    private long objectActionId;

    /** Attribute  Be Seted Falg */
    private boolean objectActionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectActionIdNull = false;

    /** Attribute */
    private String action;

    /** Attribute  Be Seted Falg */
    private boolean actionSetted = false;

    /** Attribute  is Null Falg */
    private boolean actionNull = false;

    /** Attribute */
    private long objectId;

    /** Attribute  Be Seted Falg */
    private boolean objectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectIdNull = false;

    /** Attribute */
    private long propertyId;

    /** Attribute  Be Seted Falg */
    private boolean propertyIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyIdNull = false;

    /** Attribute */
    private String propertyValue;

    /** Attribute  Be Seted Falg */
    private boolean propertyValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyValueNull = false;

    /** Attribute */
    private Integer propertyDataSize;

    /** Attribute  Be Seted Falg */
    private boolean propertyDataSizeSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyDataSizeNull = false;

    /** Attribute */
    private String propertyDataType;

    /** Attribute  Be Seted Falg */
    private boolean propertyDataTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyDataTypeNull = false;

    /** Attribute */
    private String propertyDefaultValue;

    /** Attribute  Be Seted Falg */
    private boolean propertyDefaultValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyDefaultValueNull = false;

    /** Attribute */
    private String propertyDescription;

    /** Attribute  Be Seted Falg */
    private boolean propertyDescriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyDescriptionNull = false;

    /** Attribute */
    private String propertyIsEnum;

    /** Attribute  Be Seted Falg */
    private boolean propertyIsEnumSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyIsEnumNull = false;

    /** Attribute */
    private String propertyIsGenerate;

    /** Attribute  Be Seted Falg */
    private boolean propertyIsGenerateSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyIsGenerateNull = false;

    /** Attribute */
    private String propertyIsPrimaryProperty;

    /** Attribute  Be Seted Falg */
    private boolean propertyIsPrimaryPropertySetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyIsPrimaryPropertyNull = false;

    /** Attribute */
    private String propertyKind;

    /** Attribute  Be Seted Falg */
    private boolean propertyKindSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyKindNull = false;

    /** Attribute */
    private String propertyName;

    /** Attribute  Be Seted Falg */
    private boolean propertyNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyNameNull = false;

    /** Attribute */
    private Integer propertyOrderIndex;

    /** Attribute  Be Seted Falg */
    private boolean propertyOrderIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyOrderIndexNull = false;

    /** Attribute */
    private String propertyState;

    /** Attribute  Be Seted Falg */
    private boolean propertyStateSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyStateNull = false;

    /** Attribute */
    private String propertyType;

    /** Attribute  Be Seted Falg */
    private boolean propertyTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyTypeNull = false;

    /** Attribute */
    private String operation;

    /** Attribute  Be Seted Falg */
    private boolean operationSetted = false;

    /** Attribute  is Null Falg */
    private boolean operationNull = false;

    /**
     * Get ObjectActionId
     *
     * @return objectActionId
     */
    final public long getObjectActionId() {
        return objectActionId;
    } // end getObjectActionId()

    /**
     * Set ObjectActionId
     *
     * @param aObjectActionId
     */
    final public void setObjectActionId(long aObjectActionId) {
        this.objectActionId = aObjectActionId;

        this.objectActionIdSetted = true;

        this.setObjectActionIdNull(false);
    } // end setObjectActionId()

    /**
     * Get ObjectActionId Has Been Setted
     *
     * @return objectActionId
     */
    final public boolean isObjectActionIdSetted() {
        return this.objectActionIdSetted;
    } // end isObjectActionIdSetted()

    /**
     * Set ObjectActionId Null
     */
    final public void setObjectActionIdNull() {
        this.objectActionIdNull = true;
    } // end setObjectActionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectActionIdNull(boolean aNullFlag) {
        this.objectActionIdNull = aNullFlag;
    } // end setObjectActionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectActionIdNull() {
        return this.objectActionIdNull;
    } // end isObjectActionIdNull()

    /**
     * Get Action
     *
     * @return action
     */
    final public String getAction() {
        return action;
    } // end getAction()

    /**
     * Set Action
     *
     * @param aAction
     */
    final public void setAction(String aAction) {
        this.action = aAction;

        this.actionSetted = true;

        this.setActionNull(this.action == null);
    } // end setAction()

    /**
     * Get Action Has Been Setted
     *
     * @return action
     */
    final public boolean isActionSetted() {
        return this.actionSetted;
    } // end isActionSetted()

    /**
     * Set Action Null
     */
    final public void setActionNull() {
        this.actionNull = true;
    } // end setActionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setActionNull(boolean aNullFlag) {
        this.actionNull = aNullFlag;
    } // end setActionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isActionNull() {
        return this.actionNull;
    } // end isActionNull()

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
     * Get PropertyId
     *
     * @return propertyId
     */
    final public long getPropertyId() {
        return propertyId;
    } // end getPropertyId()

    /**
     * Set PropertyId
     *
     * @param aPropertyId
     */
    final public void setPropertyId(long aPropertyId) {
        this.propertyId = aPropertyId;

        this.propertyIdSetted = true;

        this.setPropertyIdNull(false);
    } // end setPropertyId()

    /**
     * Get PropertyId Has Been Setted
     *
     * @return propertyId
     */
    final public boolean isPropertyIdSetted() {
        return this.propertyIdSetted;
    } // end isPropertyIdSetted()

    /**
     * Set PropertyId Null
     */
    final public void setPropertyIdNull() {
        this.propertyIdNull = true;
    } // end setPropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyIdNull(boolean aNullFlag) {
        this.propertyIdNull = aNullFlag;
    } // end setPropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyIdNull() {
        return this.propertyIdNull;
    } // end isPropertyIdNull()

    /**
     * Get PropertyValue
     *
     * @return propertyValue
     */
    final public String getPropertyValue() {
        return propertyValue;
    } // end getPropertyValue()

    /**
     * Set PropertyValue
     *
     * @param aPropertyValue
     */
    final public void setPropertyValue(String aPropertyValue) {
        this.propertyValue = aPropertyValue;

        this.propertyValueSetted = true;

        this.setPropertyValueNull(this.propertyValue == null);
    } // end setPropertyValue()

    /**
     * Get PropertyValue Has Been Setted
     *
     * @return propertyValue
     */
    final public boolean isPropertyValueSetted() {
        return this.propertyValueSetted;
    } // end isPropertyValueSetted()

    /**
     * Set PropertyValue Null
     */
    final public void setPropertyValueNull() {
        this.propertyValueNull = true;
    } // end setPropertyValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyValueNull(boolean aNullFlag) {
        this.propertyValueNull = aNullFlag;
    } // end setPropertyValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyValueNull() {
        return this.propertyValueNull;
    } // end isPropertyValueNull()

    /**
     * Get PropertyDataSize
     *
     * @return propertyDataSize
     */
    final public Integer getPropertyDataSize() {
        return propertyDataSize;
    } // end getPropertyDataSize()

    /**
     * Set PropertyDataSize
     *
     * @param aPropertyDataSize
     */
    final public void setPropertyDataSize(Integer aPropertyDataSize) {
        this.propertyDataSize = aPropertyDataSize;

        this.propertyDataSizeSetted = true;

        this.setPropertyDataSizeNull(this.propertyDataSize == null);
    } // end setPropertyDataSize()

    /**
     * Get PropertyDataSize Has Been Setted
     *
     * @return propertyDataSize
     */
    final public boolean isPropertyDataSizeSetted() {
        return this.propertyDataSizeSetted;
    } // end isPropertyDataSizeSetted()

    /**
     * Set PropertyDataSize Null
     */
    final public void setPropertyDataSizeNull() {
        this.propertyDataSizeNull = true;
    } // end setPropertyDataSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyDataSizeNull(boolean aNullFlag) {
        this.propertyDataSizeNull = aNullFlag;
    } // end setPropertyDataSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyDataSizeNull() {
        return this.propertyDataSizeNull;
    } // end isPropertyDataSizeNull()

    /**
     * Get PropertyDataType
     *
     * @return propertyDataType
     */
    final public String getPropertyDataType() {
        return propertyDataType;
    } // end getPropertyDataType()

    /**
     * Set PropertyDataType
     *
     * @param aPropertyDataType
     */
    final public void setPropertyDataType(String aPropertyDataType) {
        this.propertyDataType = aPropertyDataType;

        this.propertyDataTypeSetted = true;

        this.setPropertyDataTypeNull(this.propertyDataType == null);
    } // end setPropertyDataType()

    /**
     * Get PropertyDataType Has Been Setted
     *
     * @return propertyDataType
     */
    final public boolean isPropertyDataTypeSetted() {
        return this.propertyDataTypeSetted;
    } // end isPropertyDataTypeSetted()

    /**
     * Set PropertyDataType Null
     */
    final public void setPropertyDataTypeNull() {
        this.propertyDataTypeNull = true;
    } // end setPropertyDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyDataTypeNull(boolean aNullFlag) {
        this.propertyDataTypeNull = aNullFlag;
    } // end setPropertyDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyDataTypeNull() {
        return this.propertyDataTypeNull;
    } // end isPropertyDataTypeNull()

    /**
     * Get PropertyDefaultValue
     *
     * @return propertyDefaultValue
     */
    final public String getPropertyDefaultValue() {
        return propertyDefaultValue;
    } // end getPropertyDefaultValue()

    /**
     * Set PropertyDefaultValue
     *
     * @param aPropertyDefaultValue
     */
    final public void setPropertyDefaultValue(String aPropertyDefaultValue) {
        this.propertyDefaultValue = aPropertyDefaultValue;

        this.propertyDefaultValueSetted = true;

        this.setPropertyDefaultValueNull(this.propertyDefaultValue == null);
    } // end setPropertyDefaultValue()

    /**
     * Get PropertyDefaultValue Has Been Setted
     *
     * @return propertyDefaultValue
     */
    final public boolean isPropertyDefaultValueSetted() {
        return this.propertyDefaultValueSetted;
    } // end isPropertyDefaultValueSetted()

    /**
     * Set PropertyDefaultValue Null
     */
    final public void setPropertyDefaultValueNull() {
        this.propertyDefaultValueNull = true;
    } // end setPropertyDefaultValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyDefaultValueNull(boolean aNullFlag) {
        this.propertyDefaultValueNull = aNullFlag;
    } // end setPropertyDefaultValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyDefaultValueNull() {
        return this.propertyDefaultValueNull;
    } // end isPropertyDefaultValueNull()

    /**
     * Get PropertyDescription
     *
     * @return propertyDescription
     */
    final public String getPropertyDescription() {
        return propertyDescription;
    } // end getPropertyDescription()

    /**
     * Set PropertyDescription
     *
     * @param aPropertyDescription
     */
    final public void setPropertyDescription(String aPropertyDescription) {
        this.propertyDescription = aPropertyDescription;

        this.propertyDescriptionSetted = true;

        this.setPropertyDescriptionNull(this.propertyDescription == null);
    } // end setPropertyDescription()

    /**
     * Get PropertyDescription Has Been Setted
     *
     * @return propertyDescription
     */
    final public boolean isPropertyDescriptionSetted() {
        return this.propertyDescriptionSetted;
    } // end isPropertyDescriptionSetted()

    /**
     * Set PropertyDescription Null
     */
    final public void setPropertyDescriptionNull() {
        this.propertyDescriptionNull = true;
    } // end setPropertyDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyDescriptionNull(boolean aNullFlag) {
        this.propertyDescriptionNull = aNullFlag;
    } // end setPropertyDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyDescriptionNull() {
        return this.propertyDescriptionNull;
    } // end isPropertyDescriptionNull()

    /**
     * Get PropertyIsEnum
     *
     * @return propertyIsEnum
     */
    final public String getPropertyIsEnum() {
        return propertyIsEnum;
    } // end getPropertyIsEnum()

    /**
     * Set PropertyIsEnum
     *
     * @param aPropertyIsEnum
     */
    final public void setPropertyIsEnum(String aPropertyIsEnum) {
        this.propertyIsEnum = aPropertyIsEnum;

        this.propertyIsEnumSetted = true;

        this.setPropertyIsEnumNull(this.propertyIsEnum == null);
    } // end setPropertyIsEnum()

    /**
     * Get PropertyIsEnum Has Been Setted
     *
     * @return propertyIsEnum
     */
    final public boolean isPropertyIsEnumSetted() {
        return this.propertyIsEnumSetted;
    } // end isPropertyIsEnumSetted()

    /**
     * Set PropertyIsEnum Null
     */
    final public void setPropertyIsEnumNull() {
        this.propertyIsEnumNull = true;
    } // end setPropertyIsEnumNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyIsEnumNull(boolean aNullFlag) {
        this.propertyIsEnumNull = aNullFlag;
    } // end setPropertyIsEnumNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyIsEnumNull() {
        return this.propertyIsEnumNull;
    } // end isPropertyIsEnumNull()

    /**
     * Get PropertyIsGenerate
     *
     * @return propertyIsGenerate
     */
    final public String getPropertyIsGenerate() {
        return propertyIsGenerate;
    } // end getPropertyIsGenerate()

    /**
     * Set PropertyIsGenerate
     *
     * @param aPropertyIsGenerate
     */
    final public void setPropertyIsGenerate(String aPropertyIsGenerate) {
        this.propertyIsGenerate = aPropertyIsGenerate;

        this.propertyIsGenerateSetted = true;

        this.setPropertyIsGenerateNull(this.propertyIsGenerate == null);
    } // end setPropertyIsGenerate()

    /**
     * Get PropertyIsGenerate Has Been Setted
     *
     * @return propertyIsGenerate
     */
    final public boolean isPropertyIsGenerateSetted() {
        return this.propertyIsGenerateSetted;
    } // end isPropertyIsGenerateSetted()

    /**
     * Set PropertyIsGenerate Null
     */
    final public void setPropertyIsGenerateNull() {
        this.propertyIsGenerateNull = true;
    } // end setPropertyIsGenerateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyIsGenerateNull(boolean aNullFlag) {
        this.propertyIsGenerateNull = aNullFlag;
    } // end setPropertyIsGenerateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyIsGenerateNull() {
        return this.propertyIsGenerateNull;
    } // end isPropertyIsGenerateNull()

    /**
     * Get PropertyIsPrimaryProperty
     *
     * @return propertyIsPrimaryProperty
     */
    final public String getPropertyIsPrimaryProperty() {
        return propertyIsPrimaryProperty;
    } // end getPropertyIsPrimaryProperty()

    /**
     * Set PropertyIsPrimaryProperty
     *
     * @param aPropertyIsPrimaryProperty
     */
    final public void setPropertyIsPrimaryProperty(
        String aPropertyIsPrimaryProperty) {
        this.propertyIsPrimaryProperty = aPropertyIsPrimaryProperty;

        this.propertyIsPrimaryPropertySetted = true;

        this.setPropertyIsPrimaryPropertyNull(this.propertyIsPrimaryProperty == null);
    } // end setPropertyIsPrimaryProperty()

    /**
     * Get PropertyIsPrimaryProperty Has Been Setted
     *
     * @return propertyIsPrimaryProperty
     */
    final public boolean isPropertyIsPrimaryPropertySetted() {
        return this.propertyIsPrimaryPropertySetted;
    } // end isPropertyIsPrimaryPropertySetted()

    /**
     * Set PropertyIsPrimaryProperty Null
     */
    final public void setPropertyIsPrimaryPropertyNull() {
        this.propertyIsPrimaryPropertyNull = true;
    } // end setPropertyIsPrimaryPropertyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyIsPrimaryPropertyNull(boolean aNullFlag) {
        this.propertyIsPrimaryPropertyNull = aNullFlag;
    } // end setPropertyIsPrimaryPropertyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyIsPrimaryPropertyNull() {
        return this.propertyIsPrimaryPropertyNull;
    } // end isPropertyIsPrimaryPropertyNull()

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
     * Get PropertyName
     *
     * @return propertyName
     */
    final public String getPropertyName() {
        return propertyName;
    } // end getPropertyName()

    /**
     * Set PropertyName
     *
     * @param aPropertyName
     */
    final public void setPropertyName(String aPropertyName) {
        this.propertyName = aPropertyName;

        this.propertyNameSetted = true;

        this.setPropertyNameNull(this.propertyName == null);
    } // end setPropertyName()

    /**
     * Get PropertyName Has Been Setted
     *
     * @return propertyName
     */
    final public boolean isPropertyNameSetted() {
        return this.propertyNameSetted;
    } // end isPropertyNameSetted()

    /**
     * Set PropertyName Null
     */
    final public void setPropertyNameNull() {
        this.propertyNameNull = true;
    } // end setPropertyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyNameNull(boolean aNullFlag) {
        this.propertyNameNull = aNullFlag;
    } // end setPropertyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyNameNull() {
        return this.propertyNameNull;
    } // end isPropertyNameNull()

    /**
     * Get PropertyOrderIndex
     *
     * @return propertyOrderIndex
     */
    final public Integer getPropertyOrderIndex() {
        return propertyOrderIndex;
    } // end getPropertyOrderIndex()

    /**
     * Set PropertyOrderIndex
     *
     * @param aPropertyOrderIndex
     */
    final public void setPropertyOrderIndex(Integer aPropertyOrderIndex) {
        this.propertyOrderIndex = aPropertyOrderIndex;

        this.propertyOrderIndexSetted = true;

        this.setPropertyOrderIndexNull(this.propertyOrderIndex == null);
    } // end setPropertyOrderIndex()

    /**
     * Get PropertyOrderIndex Has Been Setted
     *
     * @return propertyOrderIndex
     */
    final public boolean isPropertyOrderIndexSetted() {
        return this.propertyOrderIndexSetted;
    } // end isPropertyOrderIndexSetted()

    /**
     * Set PropertyOrderIndex Null
     */
    final public void setPropertyOrderIndexNull() {
        this.propertyOrderIndexNull = true;
    } // end setPropertyOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyOrderIndexNull(boolean aNullFlag) {
        this.propertyOrderIndexNull = aNullFlag;
    } // end setPropertyOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyOrderIndexNull() {
        return this.propertyOrderIndexNull;
    } // end isPropertyOrderIndexNull()

    /**
     * Get PropertyState
     *
     * @return propertyState
     */
    final public String getPropertyState() {
        return propertyState;
    } // end getPropertyState()

    /**
     * Set PropertyState
     *
     * @param aPropertyState
     */
    final public void setPropertyState(String aPropertyState) {
        this.propertyState = aPropertyState;

        this.propertyStateSetted = true;

        this.setPropertyStateNull(this.propertyState == null);
    } // end setPropertyState()

    /**
     * Get PropertyState Has Been Setted
     *
     * @return propertyState
     */
    final public boolean isPropertyStateSetted() {
        return this.propertyStateSetted;
    } // end isPropertyStateSetted()

    /**
     * Set PropertyState Null
     */
    final public void setPropertyStateNull() {
        this.propertyStateNull = true;
    } // end setPropertyStateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyStateNull(boolean aNullFlag) {
        this.propertyStateNull = aNullFlag;
    } // end setPropertyStateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyStateNull() {
        return this.propertyStateNull;
    } // end isPropertyStateNull()

    /**
     * Get PropertyType
     *
     * @return propertyType
     */
    final public String getPropertyType() {
        return propertyType;
    } // end getPropertyType()

    /**
     * Set PropertyType
     *
     * @param aPropertyType
     */
    final public void setPropertyType(String aPropertyType) {
        this.propertyType = aPropertyType;

        this.propertyTypeSetted = true;

        this.setPropertyTypeNull(this.propertyType == null);
    } // end setPropertyType()

    /**
     * Get PropertyType Has Been Setted
     *
     * @return propertyType
     */
    final public boolean isPropertyTypeSetted() {
        return this.propertyTypeSetted;
    } // end isPropertyTypeSetted()

    /**
     * Set PropertyType Null
     */
    final public void setPropertyTypeNull() {
        this.propertyTypeNull = true;
    } // end setPropertyTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyTypeNull(boolean aNullFlag) {
        this.propertyTypeNull = aNullFlag;
    } // end setPropertyTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyTypeNull() {
        return this.propertyTypeNull;
    } // end isPropertyTypeNull()

    /**
     * Get Operation
     *
     * @return operation
     */
    final public String getOperation() {
        return operation;
    } // end getOperation()

    /**
     * Set Operation
     *
     * @param aOperation
     */
    final public void setOperation(String aOperation) {
        this.operation = aOperation;

        this.operationSetted = true;

        this.setOperationNull(this.operation == null);
    } // end setOperation()

    /**
     * Get Operation Has Been Setted
     *
     * @return operation
     */
    final public boolean isOperationSetted() {
        return this.operationSetted;
    } // end isOperationSetted()

    /**
     * Set Operation Null
     */
    final public void setOperationNull() {
        this.operationNull = true;
    } // end setOperationNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOperationNull(boolean aNullFlag) {
        this.operationNull = aNullFlag;
    } // end setOperationNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOperationNull() {
        return this.operationNull;
    } // end isOperationNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) +
            (int) (getObjectActionId() ^ (getObjectActionId() >>> 32));

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

        if ((obj instanceof BusinessObjectAction) == false) {
            return false;
        } // end if

        BusinessObjectAction other = (BusinessObjectAction) obj;

        if (other == this) {
            return true;
        } // end if

        if (getObjectActionId() != other.getObjectActionId()) {
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

        buffer.append("objectActionId=");
        buffer.append(this.objectActionId);
        buffer.append("\r\n");

        buffer.append("action=");
        buffer.append(this.action);
        buffer.append("\r\n");

        buffer.append("objectId=");
        buffer.append(this.objectId);
        buffer.append("\r\n");

        buffer.append("propertyId=");
        buffer.append(this.propertyId);
        buffer.append("\r\n");

        buffer.append("propertyValue=");
        buffer.append(this.propertyValue);
        buffer.append("\r\n");

        buffer.append("propertyDataSize=");
        buffer.append(this.propertyDataSize);
        buffer.append("\r\n");

        buffer.append("propertyDataType=");
        buffer.append(this.propertyDataType);
        buffer.append("\r\n");

        buffer.append("propertyDefaultValue=");
        buffer.append(this.propertyDefaultValue);
        buffer.append("\r\n");

        buffer.append("propertyDescription=");
        buffer.append(this.propertyDescription);
        buffer.append("\r\n");

        buffer.append("propertyIsEnum=");
        buffer.append(this.propertyIsEnum);
        buffer.append("\r\n");

        buffer.append("propertyIsGenerate=");
        buffer.append(this.propertyIsGenerate);
        buffer.append("\r\n");

        buffer.append("propertyIsPrimaryProperty=");
        buffer.append(this.propertyIsPrimaryProperty);
        buffer.append("\r\n");

        buffer.append("propertyKind=");
        buffer.append(this.propertyKind);
        buffer.append("\r\n");

        buffer.append("propertyName=");
        buffer.append(this.propertyName);
        buffer.append("\r\n");

        buffer.append("propertyOrderIndex=");
        buffer.append(this.propertyOrderIndex);
        buffer.append("\r\n");

        buffer.append("propertyState=");
        buffer.append(this.propertyState);
        buffer.append("\r\n");

        buffer.append("propertyType=");
        buffer.append(this.propertyType);
        buffer.append("\r\n");

        buffer.append("operation=");
        buffer.append(this.operation);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BusinessObjectAction
