/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-11 16:20:00
 *
 * @author Auto Gen
 */
public class BpmPublicUiConfig implements java.io.Serializable {
    /**
     * Creates a new BpmPublicUiConfig object.
     */
    public BpmPublicUiConfig() {
        super();
    } // end BpmPublicUiConfig()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String configXml;

    /** Attribute  Be Seted Falg */
    private boolean configXmlSetted = false;

    /** Attribute  is Null Falg */
    private boolean configXmlNull = false;

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
    private String uiConfigType;

    /** Attribute  Be Seted Falg */
    private boolean uiConfigTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean uiConfigTypeNull = false;

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
     * Get ConfigXml
     *
     * @return configXml
     */
    final public String getConfigXml() {
        if (isConfigXmlNull()) {
            return null;
        } // end if
        else {
            return configXml;
        } // end else
    } // end getConfigXml()

    /**
     * Set ConfigXml
     *
     * @param aConfigXml
     */
    final public void setConfigXml(String aConfigXml) {
        this.configXml = aConfigXml;

        this.configXmlSetted = true;

        this.setConfigXmlNull(this.configXml == null);
    } // end setConfigXml()

    /**
     * Get ConfigXml Has Been Setted
     *
     * @return configXml
     */
    final public boolean isConfigXmlSetted() {
        return this.configXmlSetted;
    } // end isConfigXmlSetted()

    /**
     * Set ConfigXml Null
     */
    final public void setConfigXmlNull() {
        this.configXmlNull = true;
    } // end setConfigXmlNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigXmlNull(boolean aNullFlag) {
        this.configXmlNull = aNullFlag;
    } // end setConfigXmlNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigXmlNull() {
        return this.configXmlNull;
    } // end isConfigXmlNull()

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
     * Get UiConfigType
     *
     * @return uiConfigType
     */
    final public String getUiConfigType() {
        return uiConfigType;
    } // end getUiConfigType()

    /**
     * Set UiConfigType
     *
     * @param aUiConfigType
     */
    final public void setUiConfigType(String aUiConfigType) {
        this.uiConfigType = aUiConfigType;

        this.uiConfigTypeSetted = true;

        this.setUiConfigTypeNull(this.uiConfigType == null);
    } // end setUiConfigType()

    /**
     * Get UiConfigType Has Been Setted
     *
     * @return uiConfigType
     */
    final public boolean isUiConfigTypeSetted() {
        return this.uiConfigTypeSetted;
    } // end isUiConfigTypeSetted()

    /**
     * Set UiConfigType Null
     */
    final public void setUiConfigTypeNull() {
        this.uiConfigTypeNull = true;
    } // end setUiConfigTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUiConfigTypeNull(boolean aNullFlag) {
        this.uiConfigTypeNull = aNullFlag;
    } // end setUiConfigTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUiConfigTypeNull() {
        return this.uiConfigTypeNull;
    } // end isUiConfigTypeNull()

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

        if ((obj instanceof BpmPublicUiConfig) == false) {
            return false;
        } // end if

        BpmPublicUiConfig other = (BpmPublicUiConfig) obj;

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

        buffer.append("configXml=");
        buffer.append(this.configXml);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("uiConfigType=");
        buffer.append(this.uiConfigType);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmPublicUiConfig
