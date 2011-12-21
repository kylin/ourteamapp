/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * 服务参数 Generate Date 2011-09-22 10:16:51
 *
 * @author Auto Gen
 */
public class ServiceParameter implements java.io.Serializable {
    /**
     * Creates a new ServiceParameter object.
     */
    public ServiceParameter() {
        super();
    } // end ServiceParameter()

    /** Attribute */
    private long serviceParameterId;

    /** Attribute  Be Seted Falg */
    private boolean serviceParameterIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean serviceParameterIdNull = false;

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
    private String isArray;

    /** Attribute  Be Seted Falg */
    private boolean isArraySetted = false;

    /** Attribute  is Null Falg */
    private boolean isArrayNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String preProcess;

    /** Attribute  Be Seted Falg */
    private boolean preProcessSetted = false;

    /** Attribute  is Null Falg */
    private boolean preProcessNull = false;

    /** Attribute */
    private Integer sort;

    /** Attribute  Be Seted Falg */
    private boolean sortSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortNull = false;

    /** Attribute */
    private String type;

    /** Attribute  Be Seted Falg */
    private boolean typeSetted = false;

    /** Attribute  is Null Falg */
    private boolean typeNull = false;

    /** Attribute */
    private String validateInfo;

    /** Attribute  Be Seted Falg */
    private boolean validateInfoSetted = false;

    /** Attribute  is Null Falg */
    private boolean validateInfoNull = false;

    /** Attribute */
    private long serviceFunctionId;

    /** Attribute  Be Seted Falg */
    private boolean serviceFunctionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean serviceFunctionIdNull = false;

    /** Attribute */
    private Long referenceObjectId;

    /** Attribute  Be Seted Falg */
    private boolean referenceObjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean referenceObjectIdNull = false;

    /**
     * Get ServiceParameterId
     *
     * @return serviceParameterId
     */
    final public long getServiceParameterId() {
        return serviceParameterId;
    } // end getServiceParameterId()

    /**
     * Set ServiceParameterId
     *
     * @param aServiceParameterId
     */
    final public void setServiceParameterId(long aServiceParameterId) {
        this.serviceParameterId = aServiceParameterId;

        this.serviceParameterIdSetted = true;

        this.setServiceParameterIdNull(false);
    } // end setServiceParameterId()

    /**
     * Get ServiceParameterId Has Been Setted
     *
     * @return serviceParameterId
     */
    final public boolean isServiceParameterIdSetted() {
        return this.serviceParameterIdSetted;
    } // end isServiceParameterIdSetted()

    /**
     * Set ServiceParameterId Null
     */
    final public void setServiceParameterIdNull() {
        this.serviceParameterIdNull = true;
    } // end setServiceParameterIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setServiceParameterIdNull(boolean aNullFlag) {
        this.serviceParameterIdNull = aNullFlag;
    } // end setServiceParameterIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isServiceParameterIdNull() {
        return this.serviceParameterIdNull;
    } // end isServiceParameterIdNull()

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
     * Get PreProcess
     *
     * @return preProcess
     */
    final public String getPreProcess() {
        return preProcess;
    } // end getPreProcess()

    /**
     * Set PreProcess
     *
     * @param aPreProcess
     */
    final public void setPreProcess(String aPreProcess) {
        this.preProcess = aPreProcess;

        this.preProcessSetted = true;

        this.setPreProcessNull(this.preProcess == null);
    } // end setPreProcess()

    /**
     * Get PreProcess Has Been Setted
     *
     * @return preProcess
     */
    final public boolean isPreProcessSetted() {
        return this.preProcessSetted;
    } // end isPreProcessSetted()

    /**
     * Set PreProcess Null
     */
    final public void setPreProcessNull() {
        this.preProcessNull = true;
    } // end setPreProcessNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPreProcessNull(boolean aNullFlag) {
        this.preProcessNull = aNullFlag;
    } // end setPreProcessNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPreProcessNull() {
        return this.preProcessNull;
    } // end isPreProcessNull()

    /**
     * Get Sort
     *
     * @return sort
     */
    final public Integer getSort() {
        return sort;
    } // end getSort()

    /**
     * Set Sort
     *
     * @param aSort
     */
    final public void setSort(Integer aSort) {
        this.sort = aSort;

        this.sortSetted = true;

        this.setSortNull(this.sort == null);
    } // end setSort()

    /**
     * Get Sort Has Been Setted
     *
     * @return sort
     */
    final public boolean isSortSetted() {
        return this.sortSetted;
    } // end isSortSetted()

    /**
     * Set Sort Null
     */
    final public void setSortNull() {
        this.sortNull = true;
    } // end setSortNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortNull(boolean aNullFlag) {
        this.sortNull = aNullFlag;
    } // end setSortNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortNull() {
        return this.sortNull;
    } // end isSortNull()

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
     * Get ValidateInfo
     *
     * @return validateInfo
     */
    final public String getValidateInfo() {
        return validateInfo;
    } // end getValidateInfo()

    /**
     * Set ValidateInfo
     *
     * @param aValidateInfo
     */
    final public void setValidateInfo(String aValidateInfo) {
        this.validateInfo = aValidateInfo;

        this.validateInfoSetted = true;

        this.setValidateInfoNull(this.validateInfo == null);
    } // end setValidateInfo()

    /**
     * Get ValidateInfo Has Been Setted
     *
     * @return validateInfo
     */
    final public boolean isValidateInfoSetted() {
        return this.validateInfoSetted;
    } // end isValidateInfoSetted()

    /**
     * Set ValidateInfo Null
     */
    final public void setValidateInfoNull() {
        this.validateInfoNull = true;
    } // end setValidateInfoNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setValidateInfoNull(boolean aNullFlag) {
        this.validateInfoNull = aNullFlag;
    } // end setValidateInfoNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isValidateInfoNull() {
        return this.validateInfoNull;
    } // end isValidateInfoNull()

    /**
     * Get ServiceFunctionId
     *
     * @return serviceFunctionId
     */
    final public long getServiceFunctionId() {
        return serviceFunctionId;
    } // end getServiceFunctionId()

    /**
     * Set ServiceFunctionId
     *
     * @param aServiceFunctionId
     */
    final public void setServiceFunctionId(long aServiceFunctionId) {
        this.serviceFunctionId = aServiceFunctionId;

        this.serviceFunctionIdSetted = true;

        this.setServiceFunctionIdNull(false);
    } // end setServiceFunctionId()

    /**
     * Get ServiceFunctionId Has Been Setted
     *
     * @return serviceFunctionId
     */
    final public boolean isServiceFunctionIdSetted() {
        return this.serviceFunctionIdSetted;
    } // end isServiceFunctionIdSetted()

    /**
     * Set ServiceFunctionId Null
     */
    final public void setServiceFunctionIdNull() {
        this.serviceFunctionIdNull = true;
    } // end setServiceFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setServiceFunctionIdNull(boolean aNullFlag) {
        this.serviceFunctionIdNull = aNullFlag;
    } // end setServiceFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isServiceFunctionIdNull() {
        return this.serviceFunctionIdNull;
    } // end isServiceFunctionIdNull()

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
            (int) (getServiceParameterId() ^ (getServiceParameterId() >>> 32));

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

        if ((obj instanceof ServiceParameter) == false) {
            return false;
        } // end if

        ServiceParameter other = (ServiceParameter) obj;

        if (other == this) {
            return true;
        } // end if

        if (getServiceParameterId() != other.getServiceParameterId()) {
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

        buffer.append("serviceParameterId=");
        buffer.append(this.serviceParameterId);
        buffer.append("\r\n");

        buffer.append("dataType=");
        buffer.append(this.dataType);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("isArray=");
        buffer.append(this.isArray);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("preProcess=");
        buffer.append(this.preProcess);
        buffer.append("\r\n");

        buffer.append("sort=");
        buffer.append(this.sort);
        buffer.append("\r\n");

        buffer.append("type=");
        buffer.append(this.type);
        buffer.append("\r\n");

        buffer.append("validateInfo=");
        buffer.append(this.validateInfo);
        buffer.append("\r\n");

        buffer.append("serviceFunctionId=");
        buffer.append(this.serviceFunctionId);
        buffer.append("\r\n");

        buffer.append("referenceObjectId=");
        buffer.append(this.referenceObjectId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ServiceParameter
