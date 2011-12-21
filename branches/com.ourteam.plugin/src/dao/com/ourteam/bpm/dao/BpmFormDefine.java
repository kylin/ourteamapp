/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-11 14:51:15
 *
 * @author Auto Gen
 */
public class BpmFormDefine implements java.io.Serializable {
    /**
     * Creates a new BpmFormDefine object.
     */
    public BpmFormDefine() {
        super();
    } // end BpmFormDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String formKey;

    /** Attribute  Be Seted Falg */
    private boolean formKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean formKeyNull = false;

    /** Attribute */
    private String formName;

    /** Attribute  Be Seted Falg */
    private boolean formNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean formNameNull = false;

    /** Attribute */
    private long processDefineId;

    /** Attribute  Be Seted Falg */
    private boolean processDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processDefineIdNull = false;

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
    private String formXml;

    /** Attribute  Be Seted Falg */
    private boolean formXmlSetted = false;

    /** Attribute  is Null Falg */
    private boolean formXmlNull = false;

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
     * Get FormKey
     *
     * @return formKey
     */
    final public String getFormKey() {
        return formKey;
    } // end getFormKey()

    /**
     * Set FormKey
     *
     * @param aFormKey
     */
    final public void setFormKey(String aFormKey) {
        this.formKey = aFormKey;

        this.formKeySetted = true;

        this.setFormKeyNull(this.formKey == null);
    } // end setFormKey()

    /**
     * Get FormKey Has Been Setted
     *
     * @return formKey
     */
    final public boolean isFormKeySetted() {
        return this.formKeySetted;
    } // end isFormKeySetted()

    /**
     * Set FormKey Null
     */
    final public void setFormKeyNull() {
        this.formKeyNull = true;
    } // end setFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFormKeyNull(boolean aNullFlag) {
        this.formKeyNull = aNullFlag;
    } // end setFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFormKeyNull() {
        return this.formKeyNull;
    } // end isFormKeyNull()

    /**
     * Get FormName
     *
     * @return formName
     */
    final public String getFormName() {
        return formName;
    } // end getFormName()

    /**
     * Set FormName
     *
     * @param aFormName
     */
    final public void setFormName(String aFormName) {
        this.formName = aFormName;

        this.formNameSetted = true;

        this.setFormNameNull(this.formName == null);
    } // end setFormName()

    /**
     * Get FormName Has Been Setted
     *
     * @return formName
     */
    final public boolean isFormNameSetted() {
        return this.formNameSetted;
    } // end isFormNameSetted()

    /**
     * Set FormName Null
     */
    final public void setFormNameNull() {
        this.formNameNull = true;
    } // end setFormNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFormNameNull(boolean aNullFlag) {
        this.formNameNull = aNullFlag;
    } // end setFormNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFormNameNull() {
        return this.formNameNull;
    } // end isFormNameNull()

    /**
     * Get ProcessDefineId
     *
     * @return processDefineId
     */
    final public long getProcessDefineId() {
        return processDefineId;
    } // end getProcessDefineId()

    /**
     * Set ProcessDefineId
     *
     * @param aProcessDefineId
     */
    final public void setProcessDefineId(long aProcessDefineId) {
        this.processDefineId = aProcessDefineId;

        this.processDefineIdSetted = true;

        this.setProcessDefineIdNull(false);
    } // end setProcessDefineId()

    /**
     * Get ProcessDefineId Has Been Setted
     *
     * @return processDefineId
     */
    final public boolean isProcessDefineIdSetted() {
        return this.processDefineIdSetted;
    } // end isProcessDefineIdSetted()

    /**
     * Set ProcessDefineId Null
     */
    final public void setProcessDefineIdNull() {
        this.processDefineIdNull = true;
    } // end setProcessDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessDefineIdNull(boolean aNullFlag) {
        this.processDefineIdNull = aNullFlag;
    } // end setProcessDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessDefineIdNull() {
        return this.processDefineIdNull;
    } // end isProcessDefineIdNull()

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
     * Get FormXml
     *
     * @return formXml
     */
    final public String getFormXml() {
        return formXml;
    } // end getFormXml()

    /**
     * Set FormXml
     *
     * @param aFormXml
     */
    final public void setFormXml(String aFormXml) {
        this.formXml = aFormXml;

        this.formXmlSetted = true;

        this.setFormXmlNull(this.formXml == null);
    } // end setFormXml()

    /**
     * Get FormXml Has Been Setted
     *
     * @return formXml
     */
    final public boolean isFormXmlSetted() {
        return this.formXmlSetted;
    } // end isFormXmlSetted()

    /**
     * Set FormXml Null
     */
    final public void setFormXmlNull() {
        this.formXmlNull = true;
    } // end setFormXmlNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFormXmlNull(boolean aNullFlag) {
        this.formXmlNull = aNullFlag;
    } // end setFormXmlNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFormXmlNull() {
        return this.formXmlNull;
    } // end isFormXmlNull()

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

        if ((obj instanceof BpmFormDefine) == false) {
            return false;
        } // end if

        BpmFormDefine other = (BpmFormDefine) obj;

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

        buffer.append("formKey=");
        buffer.append(this.formKey);
        buffer.append("\r\n");

        buffer.append("formName=");
        buffer.append(this.formName);
        buffer.append("\r\n");

        buffer.append("processDefineId=");
        buffer.append(this.processDefineId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("formXml=");
        buffer.append(this.formXml);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmFormDefine
