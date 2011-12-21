/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * Generate Date 2011-10-28 13:34:26
 *
 * @author Auto Gen
 */
public class SysSerialCode implements java.io.Serializable {
    /**
     * Creates a new SysSerialCode object.
     */
    public SysSerialCode() {
        super();
    } // end SysSerialCode()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String codeTemplate;

    /** Attribute  Be Seted Falg */
    private boolean codeTemplateSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeTemplateNull = false;

    /** Attribute */
    private String codeType;

    /** Attribute  Be Seted Falg */
    private boolean codeTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeTypeNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long serialNumber;

    /** Attribute  Be Seted Falg */
    private boolean serialNumberSetted = false;

    /** Attribute  is Null Falg */
    private boolean serialNumberNull = false;

    /** Attribute */
    private int serialNumberIncrement;

    /** Attribute  Be Seted Falg */
    private boolean serialNumberIncrementSetted = false;

    /** Attribute  is Null Falg */
    private boolean serialNumberIncrementNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String serialNumberFormat;

    /** Attribute  Be Seted Falg */
    private boolean serialNumberFormatSetted = false;

    /** Attribute  is Null Falg */
    private boolean serialNumberFormatNull = false;

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
     * Get CodeTemplate
     *
     * @return codeTemplate
     */
    final public String getCodeTemplate() {
        return codeTemplate;
    } // end getCodeTemplate()

    /**
     * Set CodeTemplate
     *
     * @param aCodeTemplate
     */
    final public void setCodeTemplate(String aCodeTemplate) {
        this.codeTemplate = aCodeTemplate;

        this.codeTemplateSetted = true;

        this.setCodeTemplateNull(this.codeTemplate == null);
    } // end setCodeTemplate()

    /**
     * Get CodeTemplate Has Been Setted
     *
     * @return codeTemplate
     */
    final public boolean isCodeTemplateSetted() {
        return this.codeTemplateSetted;
    } // end isCodeTemplateSetted()

    /**
     * Set CodeTemplate Null
     */
    final public void setCodeTemplateNull() {
        this.codeTemplateNull = true;
    } // end setCodeTemplateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCodeTemplateNull(boolean aNullFlag) {
        this.codeTemplateNull = aNullFlag;
    } // end setCodeTemplateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCodeTemplateNull() {
        return this.codeTemplateNull;
    } // end isCodeTemplateNull()

    /**
     * Get CodeType
     *
     * @return codeType
     */
    final public String getCodeType() {
        return codeType;
    } // end getCodeType()

    /**
     * Set CodeType
     *
     * @param aCodeType
     */
    final public void setCodeType(String aCodeType) {
        this.codeType = aCodeType;

        this.codeTypeSetted = true;

        this.setCodeTypeNull(this.codeType == null);
    } // end setCodeType()

    /**
     * Get CodeType Has Been Setted
     *
     * @return codeType
     */
    final public boolean isCodeTypeSetted() {
        return this.codeTypeSetted;
    } // end isCodeTypeSetted()

    /**
     * Set CodeType Null
     */
    final public void setCodeTypeNull() {
        this.codeTypeNull = true;
    } // end setCodeTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCodeTypeNull(boolean aNullFlag) {
        this.codeTypeNull = aNullFlag;
    } // end setCodeTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCodeTypeNull() {
        return this.codeTypeNull;
    } // end isCodeTypeNull()

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
     * Get SerialNumber
     *
     * @return serialNumber
     */
    final public long getSerialNumber() {
        return serialNumber;
    } // end getSerialNumber()

    /**
     * Set SerialNumber
     *
     * @param aSerialNumber
     */
    final public void setSerialNumber(long aSerialNumber) {
        this.serialNumber = aSerialNumber;

        this.serialNumberSetted = true;

        this.setSerialNumberNull(false);
    } // end setSerialNumber()

    /**
     * Get SerialNumber Has Been Setted
     *
     * @return serialNumber
     */
    final public boolean isSerialNumberSetted() {
        return this.serialNumberSetted;
    } // end isSerialNumberSetted()

    /**
     * Set SerialNumber Null
     */
    final public void setSerialNumberNull() {
        this.serialNumberNull = true;
    } // end setSerialNumberNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSerialNumberNull(boolean aNullFlag) {
        this.serialNumberNull = aNullFlag;
    } // end setSerialNumberNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSerialNumberNull() {
        return this.serialNumberNull;
    } // end isSerialNumberNull()

    /**
     * Get SerialNumberIncrement
     *
     * @return serialNumberIncrement
     */
    final public int getSerialNumberIncrement() {
        return serialNumberIncrement;
    } // end getSerialNumberIncrement()

    /**
     * Set SerialNumberIncrement
     *
     * @param aSerialNumberIncrement
     */
    final public void setSerialNumberIncrement(int aSerialNumberIncrement) {
        this.serialNumberIncrement = aSerialNumberIncrement;

        this.serialNumberIncrementSetted = true;

        this.setSerialNumberIncrementNull(false);
    } // end setSerialNumberIncrement()

    /**
     * Get SerialNumberIncrement Has Been Setted
     *
     * @return serialNumberIncrement
     */
    final public boolean isSerialNumberIncrementSetted() {
        return this.serialNumberIncrementSetted;
    } // end isSerialNumberIncrementSetted()

    /**
     * Set SerialNumberIncrement Null
     */
    final public void setSerialNumberIncrementNull() {
        this.serialNumberIncrementNull = true;
    } // end setSerialNumberIncrementNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSerialNumberIncrementNull(boolean aNullFlag) {
        this.serialNumberIncrementNull = aNullFlag;
    } // end setSerialNumberIncrementNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSerialNumberIncrementNull() {
        return this.serialNumberIncrementNull;
    } // end isSerialNumberIncrementNull()

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
     * Get SerialNumberFormat
     *
     * @return serialNumberFormat
     */
    final public String getSerialNumberFormat() {
        return serialNumberFormat;
    } // end getSerialNumberFormat()

    /**
     * Set SerialNumberFormat
     *
     * @param aSerialNumberFormat
     */
    final public void setSerialNumberFormat(String aSerialNumberFormat) {
        this.serialNumberFormat = aSerialNumberFormat;

        this.serialNumberFormatSetted = true;

        this.setSerialNumberFormatNull(this.serialNumberFormat == null);
    } // end setSerialNumberFormat()

    /**
     * Get SerialNumberFormat Has Been Setted
     *
     * @return serialNumberFormat
     */
    final public boolean isSerialNumberFormatSetted() {
        return this.serialNumberFormatSetted;
    } // end isSerialNumberFormatSetted()

    /**
     * Set SerialNumberFormat Null
     */
    final public void setSerialNumberFormatNull() {
        this.serialNumberFormatNull = true;
    } // end setSerialNumberFormatNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSerialNumberFormatNull(boolean aNullFlag) {
        this.serialNumberFormatNull = aNullFlag;
    } // end setSerialNumberFormatNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSerialNumberFormatNull() {
        return this.serialNumberFormatNull;
    } // end isSerialNumberFormatNull()

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

        if ((obj instanceof SysSerialCode) == false) {
            return false;
        } // end if

        SysSerialCode other = (SysSerialCode) obj;

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

        buffer.append("codeTemplate=");
        buffer.append(this.codeTemplate);
        buffer.append("\r\n");

        buffer.append("codeType=");
        buffer.append(this.codeType);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("serialNumber=");
        buffer.append(this.serialNumber);
        buffer.append("\r\n");

        buffer.append("serialNumberIncrement=");
        buffer.append(this.serialNumberIncrement);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("serialNumberFormat=");
        buffer.append(this.serialNumberFormat);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysSerialCode
