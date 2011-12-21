/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-28 15:45:28
 *
 * @author Auto Gen
 */
public class BpmProcessFormValue implements java.io.Serializable {
    /**
     * Creates a new BpmProcessFormValue object.
     */
    public BpmProcessFormValue() {
        super();
    } // end BpmProcessFormValue()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.lang.Double doubleValue;

    /** Attribute  Be Seted Falg */
    private boolean doubleValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean doubleValueNull = false;

    /** Attribute */
    private long formInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean formInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean formInstanceIdNull = false;

    /** Attribute */
    private java.lang.Long longValue;

    /** Attribute  Be Seted Falg */
    private boolean longValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean longValueNull = false;

    /** Attribute */
    private String propertyDataType;

    /** Attribute  Be Seted Falg */
    private boolean propertyDataTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyDataTypeNull = false;

    /** Attribute */
    private String propertyName;

    /** Attribute  Be Seted Falg */
    private boolean propertyNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyNameNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String stringValue;

    /** Attribute  Be Seted Falg */
    private boolean stringValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean stringValueNull = false;

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
     * Get DoubleValue
     *
     * @return doubleValue
     */
    final public java.lang.Double getDoubleValue() {
        return doubleValue;
    } // end getDoubleValue()

    /**
     * Set DoubleValue
     *
     * @param aDoubleValue
     */
    final public void setDoubleValue(java.lang.Double aDoubleValue) {
        this.doubleValue = aDoubleValue;

        this.doubleValueSetted = true;

        this.setDoubleValueNull(this.doubleValue == null);
    } // end setDoubleValue()

    /**
     * Get DoubleValue Has Been Setted
     *
     * @return doubleValue
     */
    final public boolean isDoubleValueSetted() {
        return this.doubleValueSetted;
    } // end isDoubleValueSetted()

    /**
     * Set DoubleValue Null
     */
    final public void setDoubleValueNull() {
        this.doubleValueNull = true;
    } // end setDoubleValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDoubleValueNull(boolean aNullFlag) {
        this.doubleValueNull = aNullFlag;
    } // end setDoubleValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDoubleValueNull() {
        return this.doubleValueNull;
    } // end isDoubleValueNull()

    /**
     * Get FormInstanceId
     *
     * @return formInstanceId
     */
    final public long getFormInstanceId() {
        return formInstanceId;
    } // end getFormInstanceId()

    /**
     * Set FormInstanceId
     *
     * @param aFormInstanceId
     */
    final public void setFormInstanceId(long aFormInstanceId) {
        this.formInstanceId = aFormInstanceId;

        this.formInstanceIdSetted = true;

        this.setFormInstanceIdNull(false);
    } // end setFormInstanceId()

    /**
     * Get FormInstanceId Has Been Setted
     *
     * @return formInstanceId
     */
    final public boolean isFormInstanceIdSetted() {
        return this.formInstanceIdSetted;
    } // end isFormInstanceIdSetted()

    /**
     * Set FormInstanceId Null
     */
    final public void setFormInstanceIdNull() {
        this.formInstanceIdNull = true;
    } // end setFormInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFormInstanceIdNull(boolean aNullFlag) {
        this.formInstanceIdNull = aNullFlag;
    } // end setFormInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFormInstanceIdNull() {
        return this.formInstanceIdNull;
    } // end isFormInstanceIdNull()

    /**
     * Get LongValue
     *
     * @return longValue
     */
    final public java.lang.Long getLongValue() {
        return longValue;
    } // end getLongValue()

    /**
     * Set LongValue
     *
     * @param aLongValue
     */
    final public void setLongValue(java.lang.Long aLongValue) {
        this.longValue = aLongValue;

        this.longValueSetted = true;

        this.setLongValueNull(this.longValue == null);
    } // end setLongValue()

    /**
     * Get LongValue Has Been Setted
     *
     * @return longValue
     */
    final public boolean isLongValueSetted() {
        return this.longValueSetted;
    } // end isLongValueSetted()

    /**
     * Set LongValue Null
     */
    final public void setLongValueNull() {
        this.longValueNull = true;
    } // end setLongValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLongValueNull(boolean aNullFlag) {
        this.longValueNull = aNullFlag;
    } // end setLongValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLongValueNull() {
        return this.longValueNull;
    } // end isLongValueNull()

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
     * Get StringValue
     *
     * @return stringValue
     */
    final public String getStringValue() {
        if (isStringValueNull()) {
            return null;
        } // end if
        else {
            return stringValue;
        } // end else
    } // end getStringValue()

    /**
     * Set StringValue
     *
     * @param aStringValue
     */
    final public void setStringValue(String aStringValue) {
        this.stringValue = aStringValue;

        this.stringValueSetted = true;

        this.setStringValueNull(this.stringValue == null);
    } // end setStringValue()

    /**
     * Get StringValue Has Been Setted
     *
     * @return stringValue
     */
    final public boolean isStringValueSetted() {
        return this.stringValueSetted;
    } // end isStringValueSetted()

    /**
     * Set StringValue Null
     */
    final public void setStringValueNull() {
        this.stringValueNull = true;
    } // end setStringValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStringValueNull(boolean aNullFlag) {
        this.stringValueNull = aNullFlag;
    } // end setStringValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStringValueNull() {
        return this.stringValueNull;
    } // end isStringValueNull()

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

        if ((obj instanceof BpmProcessFormValue) == false) {
            return false;
        } // end if

        BpmProcessFormValue other = (BpmProcessFormValue) obj;

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

        buffer.append("doubleValue=");
        buffer.append(this.doubleValue);
        buffer.append("\r\n");

        buffer.append("formInstanceId=");
        buffer.append(this.formInstanceId);
        buffer.append("\r\n");

        buffer.append("longValue=");
        buffer.append(this.longValue);
        buffer.append("\r\n");

        buffer.append("propertyDataType=");
        buffer.append(this.propertyDataType);
        buffer.append("\r\n");

        buffer.append("propertyName=");
        buffer.append(this.propertyName);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("stringValue=");
        buffer.append(this.stringValue);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmProcessFormValue
