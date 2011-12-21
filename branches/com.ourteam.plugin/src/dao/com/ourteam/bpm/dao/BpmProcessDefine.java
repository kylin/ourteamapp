/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-23 16:27:11
 *
 * @author Auto Gen
 */
public class BpmProcessDefine implements java.io.Serializable {
    /**
     * Creates a new BpmProcessDefine object.
     */
    public BpmProcessDefine() {
        super();
    } // end BpmProcessDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long lastEditorId;

    /** Attribute  Be Seted Falg */
    private boolean lastEditorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditorIdNull = false;

    /** Attribute */
    private java.util.Date lastEditDate;

    /** Attribute  Be Seted Falg */
    private boolean lastEditDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditDateNull = false;

    /** Attribute */
    private String processKey;

    /** Attribute  Be Seted Falg */
    private boolean processKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean processKeyNull = false;

    /** Attribute */
    private String processName;

    /** Attribute  Be Seted Falg */
    private boolean processNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean processNameNull = false;

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
    private long catalogId;

    /** Attribute  Be Seted Falg */
    private boolean catalogIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean catalogIdNull = false;

    /** Attribute */
    private String processVersion;

    /** Attribute  Be Seted Falg */
    private boolean processVersionSetted = false;

    /** Attribute  is Null Falg */
    private boolean processVersionNull = false;

    /** Attribute */
    private String lastEditorName;

    /** Attribute  Be Seted Falg */
    private boolean lastEditorNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditorNameNull = false;

    /** Attribute */
    private String startFormKey;

    /** Attribute  Be Seted Falg */
    private boolean startFormKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean startFormKeyNull = false;

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
     * Get LastEditorId
     *
     * @return lastEditorId
     */
    final public long getLastEditorId() {
        return lastEditorId;
    } // end getLastEditorId()

    /**
     * Set LastEditorId
     *
     * @param aLastEditorId
     */
    final public void setLastEditorId(long aLastEditorId) {
        this.lastEditorId = aLastEditorId;

        this.lastEditorIdSetted = true;

        this.setLastEditorIdNull(false);
    } // end setLastEditorId()

    /**
     * Get LastEditorId Has Been Setted
     *
     * @return lastEditorId
     */
    final public boolean isLastEditorIdSetted() {
        return this.lastEditorIdSetted;
    } // end isLastEditorIdSetted()

    /**
     * Set LastEditorId Null
     */
    final public void setLastEditorIdNull() {
        this.lastEditorIdNull = true;
    } // end setLastEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditorIdNull(boolean aNullFlag) {
        this.lastEditorIdNull = aNullFlag;
    } // end setLastEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditorIdNull() {
        return this.lastEditorIdNull;
    } // end isLastEditorIdNull()

    /**
     * Get LastEditDate
     *
     * @return lastEditDate
     */
    final public java.util.Date getLastEditDate() {
        return lastEditDate;
    } // end getLastEditDate()

    /**
     * Set LastEditDate
     *
     * @param aLastEditDate
     */
    final public void setLastEditDate(java.util.Date aLastEditDate) {
        this.lastEditDate = aLastEditDate;

        this.lastEditDateSetted = true;

        this.setLastEditDateNull(this.lastEditDate == null);
    } // end setLastEditDate()

    /**
     * Get LastEditDate Has Been Setted
     *
     * @return lastEditDate
     */
    final public boolean isLastEditDateSetted() {
        return this.lastEditDateSetted;
    } // end isLastEditDateSetted()

    /**
     * Set LastEditDate Null
     */
    final public void setLastEditDateNull() {
        this.lastEditDateNull = true;
    } // end setLastEditDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditDateNull(boolean aNullFlag) {
        this.lastEditDateNull = aNullFlag;
    } // end setLastEditDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditDateNull() {
        return this.lastEditDateNull;
    } // end isLastEditDateNull()

    /**
     * Get ProcessKey
     *
     * @return processKey
     */
    final public String getProcessKey() {
        if (isProcessKeyNull()) {
            return null;
        } // end if
        else {
            return processKey;
        } // end else
    } // end getProcessKey()

    /**
     * Set ProcessKey
     *
     * @param aProcessKey
     */
    final public void setProcessKey(String aProcessKey) {
        this.processKey = aProcessKey;

        this.processKeySetted = true;

        this.setProcessKeyNull(this.processKey == null);
    } // end setProcessKey()

    /**
     * Get ProcessKey Has Been Setted
     *
     * @return processKey
     */
    final public boolean isProcessKeySetted() {
        return this.processKeySetted;
    } // end isProcessKeySetted()

    /**
     * Set ProcessKey Null
     */
    final public void setProcessKeyNull() {
        this.processKeyNull = true;
    } // end setProcessKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessKeyNull(boolean aNullFlag) {
        this.processKeyNull = aNullFlag;
    } // end setProcessKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessKeyNull() {
        return this.processKeyNull;
    } // end isProcessKeyNull()

    /**
     * Get ProcessName
     *
     * @return processName
     */
    final public String getProcessName() {
        return processName;
    } // end getProcessName()

    /**
     * Set ProcessName
     *
     * @param aProcessName
     */
    final public void setProcessName(String aProcessName) {
        this.processName = aProcessName;

        this.processNameSetted = true;

        this.setProcessNameNull(this.processName == null);
    } // end setProcessName()

    /**
     * Get ProcessName Has Been Setted
     *
     * @return processName
     */
    final public boolean isProcessNameSetted() {
        return this.processNameSetted;
    } // end isProcessNameSetted()

    /**
     * Set ProcessName Null
     */
    final public void setProcessNameNull() {
        this.processNameNull = true;
    } // end setProcessNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessNameNull(boolean aNullFlag) {
        this.processNameNull = aNullFlag;
    } // end setProcessNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessNameNull() {
        return this.processNameNull;
    } // end isProcessNameNull()

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
     * Get CatalogId
     *
     * @return catalogId
     */
    final public long getCatalogId() {
        return catalogId;
    } // end getCatalogId()

    /**
     * Set CatalogId
     *
     * @param aCatalogId
     */
    final public void setCatalogId(long aCatalogId) {
        this.catalogId = aCatalogId;

        this.catalogIdSetted = true;

        this.setCatalogIdNull(false);
    } // end setCatalogId()

    /**
     * Get CatalogId Has Been Setted
     *
     * @return catalogId
     */
    final public boolean isCatalogIdSetted() {
        return this.catalogIdSetted;
    } // end isCatalogIdSetted()

    /**
     * Set CatalogId Null
     */
    final public void setCatalogIdNull() {
        this.catalogIdNull = true;
    } // end setCatalogIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCatalogIdNull(boolean aNullFlag) {
        this.catalogIdNull = aNullFlag;
    } // end setCatalogIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCatalogIdNull() {
        return this.catalogIdNull;
    } // end isCatalogIdNull()

    /**
     * Get ProcessVersion
     *
     * @return processVersion
     */
    final public String getProcessVersion() {
        return processVersion;
    } // end getProcessVersion()

    /**
     * Set ProcessVersion
     *
     * @param aProcessVersion
     */
    final public void setProcessVersion(String aProcessVersion) {
        this.processVersion = aProcessVersion;

        this.processVersionSetted = true;

        this.setProcessVersionNull(this.processVersion == null);
    } // end setProcessVersion()

    /**
     * Get ProcessVersion Has Been Setted
     *
     * @return processVersion
     */
    final public boolean isProcessVersionSetted() {
        return this.processVersionSetted;
    } // end isProcessVersionSetted()

    /**
     * Set ProcessVersion Null
     */
    final public void setProcessVersionNull() {
        this.processVersionNull = true;
    } // end setProcessVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessVersionNull(boolean aNullFlag) {
        this.processVersionNull = aNullFlag;
    } // end setProcessVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessVersionNull() {
        return this.processVersionNull;
    } // end isProcessVersionNull()

    /**
     * Get LastEditorName
     *
     * @return lastEditorName
     */
    final public String getLastEditorName() {
        return lastEditorName;
    } // end getLastEditorName()

    /**
     * Set LastEditorName
     *
     * @param aLastEditorName
     */
    final public void setLastEditorName(String aLastEditorName) {
        this.lastEditorName = aLastEditorName;

        this.lastEditorNameSetted = true;

        this.setLastEditorNameNull(this.lastEditorName == null);
    } // end setLastEditorName()

    /**
     * Get LastEditorName Has Been Setted
     *
     * @return lastEditorName
     */
    final public boolean isLastEditorNameSetted() {
        return this.lastEditorNameSetted;
    } // end isLastEditorNameSetted()

    /**
     * Set LastEditorName Null
     */
    final public void setLastEditorNameNull() {
        this.lastEditorNameNull = true;
    } // end setLastEditorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditorNameNull(boolean aNullFlag) {
        this.lastEditorNameNull = aNullFlag;
    } // end setLastEditorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditorNameNull() {
        return this.lastEditorNameNull;
    } // end isLastEditorNameNull()

    /**
     * Get StartFormKey
     *
     * @return startFormKey
     */
    final public String getStartFormKey() {
        return startFormKey;
    } // end getStartFormKey()

    /**
     * Set StartFormKey
     *
     * @param aStartFormKey
     */
    final public void setStartFormKey(String aStartFormKey) {
        this.startFormKey = aStartFormKey;

        this.startFormKeySetted = true;

        this.setStartFormKeyNull(this.startFormKey == null);
    } // end setStartFormKey()

    /**
     * Get StartFormKey Has Been Setted
     *
     * @return startFormKey
     */
    final public boolean isStartFormKeySetted() {
        return this.startFormKeySetted;
    } // end isStartFormKeySetted()

    /**
     * Set StartFormKey Null
     */
    final public void setStartFormKeyNull() {
        this.startFormKeyNull = true;
    } // end setStartFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStartFormKeyNull(boolean aNullFlag) {
        this.startFormKeyNull = aNullFlag;
    } // end setStartFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStartFormKeyNull() {
        return this.startFormKeyNull;
    } // end isStartFormKeyNull()

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

        if ((obj instanceof BpmProcessDefine) == false) {
            return false;
        } // end if

        BpmProcessDefine other = (BpmProcessDefine) obj;

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

        buffer.append("lastEditorId=");
        buffer.append(this.lastEditorId);
        buffer.append("\r\n");

        buffer.append("lastEditDate=");
        buffer.append(this.lastEditDate);
        buffer.append("\r\n");

        buffer.append("processKey=");
        buffer.append(this.processKey);
        buffer.append("\r\n");

        buffer.append("processName=");
        buffer.append(this.processName);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("catalogId=");
        buffer.append(this.catalogId);
        buffer.append("\r\n");

        buffer.append("processVersion=");
        buffer.append(this.processVersion);
        buffer.append("\r\n");

        buffer.append("lastEditorName=");
        buffer.append(this.lastEditorName);
        buffer.append("\r\n");

        buffer.append("startFormKey=");
        buffer.append(this.startFormKey);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmProcessDefine
