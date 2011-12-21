/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

/**
 * Generate Date 2011-12-08 15:07:38
 *
 * @author Auto Gen
 */
public class MiddleWareToolInput implements java.io.Serializable {
    /**
     * Creates a new MiddleWareToolInput object.
     */
    public MiddleWareToolInput() {
        super();
    } // end MiddleWareToolInput()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String isRequired;

    /** Attribute  Be Seted Falg */
    private boolean isRequiredSetted = false;

    /** Attribute  is Null Falg */
    private boolean isRequiredNull = false;

    /** Attribute */
    private String parameterCode;

    /** Attribute  Be Seted Falg */
    private boolean parameterCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean parameterCodeNull = false;

    /** Attribute */
    private String parameterName;

    /** Attribute  Be Seted Falg */
    private boolean parameterNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean parameterNameNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private int sortIndex;

    /** Attribute  Be Seted Falg */
    private boolean sortIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortIndexNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long toolId;

    /** Attribute  Be Seted Falg */
    private boolean toolIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolIdNull = false;

    /** Attribute */
    private String parameterType;

    /** Attribute  Be Seted Falg */
    private boolean parameterTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean parameterTypeNull = false;

    /** Attribute */
    private String defaultValue;

    /** Attribute  Be Seted Falg */
    private boolean defaultValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean defaultValueNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get IsRequired
     *
     * @return isRequired
     */
    final public String getIsRequired() {
        return isRequired;
    } // end getIsRequired()

    /**
     * Set IsRequired
     *
     * @param aIsRequired
     */
    final public void setIsRequired(String aIsRequired) {
        this.isRequired = aIsRequired;

        this.isRequiredSetted = true;

        this.setIsRequiredNull(this.isRequired == null);
    } // end setIsRequired()

    /**
     * Get IsRequired Has Been Setted
     *
     * @return isRequired
     */
    final public boolean isIsRequiredSetted() {
        return this.isRequiredSetted;
    } // end isIsRequiredSetted()

    /**
     * Set IsRequired Null
     */
    final public void setIsRequiredNull() {
        this.isRequiredNull = true;
    } // end setIsRequiredNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsRequiredNull(boolean aNullFlag) {
        this.isRequiredNull = aNullFlag;
    } // end setIsRequiredNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsRequiredNull() {
        return this.isRequiredNull;
    } // end isIsRequiredNull()

    /**
     * Get ParameterCode
     *
     * @return parameterCode
     */
    final public String getParameterCode() {
        return parameterCode;
    } // end getParameterCode()

    /**
     * Set ParameterCode
     *
     * @param aParameterCode
     */
    final public void setParameterCode(String aParameterCode) {
        this.parameterCode = aParameterCode;

        this.parameterCodeSetted = true;

        this.setParameterCodeNull(this.parameterCode == null);
    } // end setParameterCode()

    /**
     * Get ParameterCode Has Been Setted
     *
     * @return parameterCode
     */
    final public boolean isParameterCodeSetted() {
        return this.parameterCodeSetted;
    } // end isParameterCodeSetted()

    /**
     * Set ParameterCode Null
     */
    final public void setParameterCodeNull() {
        this.parameterCodeNull = true;
    } // end setParameterCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParameterCodeNull(boolean aNullFlag) {
        this.parameterCodeNull = aNullFlag;
    } // end setParameterCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParameterCodeNull() {
        return this.parameterCodeNull;
    } // end isParameterCodeNull()

    /**
     * Get ParameterName
     *
     * @return parameterName
     */
    final public String getParameterName() {
        return parameterName;
    } // end getParameterName()

    /**
     * Set ParameterName
     *
     * @param aParameterName
     */
    final public void setParameterName(String aParameterName) {
        this.parameterName = aParameterName;

        this.parameterNameSetted = true;

        this.setParameterNameNull(this.parameterName == null);
    } // end setParameterName()

    /**
     * Get ParameterName Has Been Setted
     *
     * @return parameterName
     */
    final public boolean isParameterNameSetted() {
        return this.parameterNameSetted;
    } // end isParameterNameSetted()

    /**
     * Set ParameterName Null
     */
    final public void setParameterNameNull() {
        this.parameterNameNull = true;
    } // end setParameterNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParameterNameNull(boolean aNullFlag) {
        this.parameterNameNull = aNullFlag;
    } // end setParameterNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParameterNameNull() {
        return this.parameterNameNull;
    } // end isParameterNameNull()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    final public String getRemarks() {
        if (isRemarksNull()) {
            return null;
        } // end if
        else {
            return remarks;
        } // end else
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    final public void setRemarks(String aRemarks) {
        this.remarks = aRemarks;

        this.remarksSetted = true;

        this.setRemarksNull(this.remarks == null);
    } // end setRemarks()

    /**
     * Get Remarks Has Been Setted
     *
     * @return remarks
     */
    final public boolean isRemarksSetted() {
        return this.remarksSetted;
    } // end isRemarksSetted()

    /**
     * Set Remarks Null
     */
    final public void setRemarksNull() {
        this.remarksNull = true;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRemarksNull(boolean aNullFlag) {
        this.remarksNull = aNullFlag;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRemarksNull() {
        return this.remarksNull;
    } // end isRemarksNull()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    final public int getSortIndex() {
        return sortIndex;
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    final public void setSortIndex(int aSortIndex) {
        this.sortIndex = aSortIndex;

        this.sortIndexSetted = true;

        this.setSortIndexNull(false);
    } // end setSortIndex()

    /**
     * Get SortIndex Has Been Setted
     *
     * @return sortIndex
     */
    final public boolean isSortIndexSetted() {
        return this.sortIndexSetted;
    } // end isSortIndexSetted()

    /**
     * Set SortIndex Null
     */
    final public void setSortIndexNull() {
        this.sortIndexNull = true;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortIndexNull(boolean aNullFlag) {
        this.sortIndexNull = aNullFlag;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortIndexNull() {
        return this.sortIndexNull;
    } // end isSortIndexNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * Get ToolId
     *
     * @return toolId
     */
    final public long getToolId() {
        return toolId;
    } // end getToolId()

    /**
     * Set ToolId
     *
     * @param aToolId
     */
    final public void setToolId(long aToolId) {
        this.toolId = aToolId;

        this.toolIdSetted = true;

        this.setToolIdNull(false);
    } // end setToolId()

    /**
     * Get ToolId Has Been Setted
     *
     * @return toolId
     */
    final public boolean isToolIdSetted() {
        return this.toolIdSetted;
    } // end isToolIdSetted()

    /**
     * Set ToolId Null
     */
    final public void setToolIdNull() {
        this.toolIdNull = true;
    } // end setToolIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolIdNull(boolean aNullFlag) {
        this.toolIdNull = aNullFlag;
    } // end setToolIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolIdNull() {
        return this.toolIdNull;
    } // end isToolIdNull()

    /**
     * Get ParameterType
     *
     * @return parameterType
     */
    final public String getParameterType() {
        return parameterType;
    } // end getParameterType()

    /**
     * Set ParameterType
     *
     * @param aParameterType
     */
    final public void setParameterType(String aParameterType) {
        this.parameterType = aParameterType;

        this.parameterTypeSetted = true;

        this.setParameterTypeNull(this.parameterType == null);
    } // end setParameterType()

    /**
     * Get ParameterType Has Been Setted
     *
     * @return parameterType
     */
    final public boolean isParameterTypeSetted() {
        return this.parameterTypeSetted;
    } // end isParameterTypeSetted()

    /**
     * Set ParameterType Null
     */
    final public void setParameterTypeNull() {
        this.parameterTypeNull = true;
    } // end setParameterTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParameterTypeNull(boolean aNullFlag) {
        this.parameterTypeNull = aNullFlag;
    } // end setParameterTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParameterTypeNull() {
        return this.parameterTypeNull;
    } // end isParameterTypeNull()

    /**
     * Get DefaultValue
     *
     * @return defaultValue
     */
    final public String getDefaultValue() {
        if (isDefaultValueNull()) {
            return null;
        } // end if
        else {
            return defaultValue;
        } // end else
    } // end getDefaultValue()

    /**
     * Set DefaultValue
     *
     * @param aDefaultValue
     */
    final public void setDefaultValue(String aDefaultValue) {
        this.defaultValue = aDefaultValue;

        this.defaultValueSetted = true;

        this.setDefaultValueNull(this.defaultValue == null);
    } // end setDefaultValue()

    /**
     * Get DefaultValue Has Been Setted
     *
     * @return defaultValue
     */
    final public boolean isDefaultValueSetted() {
        return this.defaultValueSetted;
    } // end isDefaultValueSetted()

    /**
     * Set DefaultValue Null
     */
    final public void setDefaultValueNull() {
        this.defaultValueNull = true;
    } // end setDefaultValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDefaultValueNull(boolean aNullFlag) {
        this.defaultValueNull = aNullFlag;
    } // end setDefaultValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDefaultValueNull() {
        return this.defaultValueNull;
    } // end isDefaultValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

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

        if ((obj instanceof MiddleWareToolInput) == false) {
            return false;
        } // end if

        MiddleWareToolInput other = (MiddleWareToolInput) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
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

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("isRequired=");
        buffer.append(this.isRequired);
        buffer.append("\r\n");

        buffer.append("parameterCode=");
        buffer.append(this.parameterCode);
        buffer.append("\r\n");

        buffer.append("parameterName=");
        buffer.append(this.parameterName);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("sortIndex=");
        buffer.append(this.sortIndex);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("toolId=");
        buffer.append(this.toolId);
        buffer.append("\r\n");

        buffer.append("parameterType=");
        buffer.append(this.parameterType);
        buffer.append("\r\n");

        buffer.append("defaultValue=");
        buffer.append(this.defaultValue);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MiddleWareToolInput
