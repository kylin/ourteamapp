/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统国际化资源Key Generate Date 2011-09-22 10:11:10
 *
 * @author Auto Gen
 */
public class SysMessageKey implements java.io.Serializable {
    /**
     * Creates a new SysMessageKey object.
     */
    public SysMessageKey() {
        super();
    } // end SysMessageKey()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String messageCatalog;

    /** Attribute  Be Seted Falg */
    private boolean messageCatalogSetted = false;

    /** Attribute  is Null Falg */
    private boolean messageCatalogNull = false;

    /** Attribute */
    private String messageKey;

    /** Attribute  Be Seted Falg */
    private boolean messageKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean messageKeyNull = false;

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
     * Get MessageCatalog
     *
     * @return messageCatalog
     */
    final public String getMessageCatalog() {
        if (isMessageCatalogNull()) {
            return null;
        } // end if
        else {
            return messageCatalog;
        } // end else
    } // end getMessageCatalog()

    /**
     * Set MessageCatalog
     *
     * @param aMessageCatalog
     */
    final public void setMessageCatalog(String aMessageCatalog) {
        this.messageCatalog = aMessageCatalog;

        this.messageCatalogSetted = true;

        this.setMessageCatalogNull(this.messageCatalog == null);
    } // end setMessageCatalog()

    /**
     * Get MessageCatalog Has Been Setted
     *
     * @return messageCatalog
     */
    final public boolean isMessageCatalogSetted() {
        return this.messageCatalogSetted;
    } // end isMessageCatalogSetted()

    /**
     * Set MessageCatalog Null
     */
    final public void setMessageCatalogNull() {
        this.messageCatalogNull = true;
    } // end setMessageCatalogNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMessageCatalogNull(boolean aNullFlag) {
        this.messageCatalogNull = aNullFlag;
    } // end setMessageCatalogNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMessageCatalogNull() {
        return this.messageCatalogNull;
    } // end isMessageCatalogNull()

    /**
     * Get MessageKey
     *
     * @return messageKey
     */
    final public String getMessageKey() {
        if (isMessageKeyNull()) {
            return null;
        } // end if
        else {
            return messageKey;
        } // end else
    } // end getMessageKey()

    /**
     * Set MessageKey
     *
     * @param aMessageKey
     */
    final public void setMessageKey(String aMessageKey) {
        this.messageKey = aMessageKey;

        this.messageKeySetted = true;

        this.setMessageKeyNull(this.messageKey == null);
    } // end setMessageKey()

    /**
     * Get MessageKey Has Been Setted
     *
     * @return messageKey
     */
    final public boolean isMessageKeySetted() {
        return this.messageKeySetted;
    } // end isMessageKeySetted()

    /**
     * Set MessageKey Null
     */
    final public void setMessageKeyNull() {
        this.messageKeyNull = true;
    } // end setMessageKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMessageKeyNull(boolean aNullFlag) {
        this.messageKeyNull = aNullFlag;
    } // end setMessageKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMessageKeyNull() {
        return this.messageKeyNull;
    } // end isMessageKeyNull()

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

        if ((obj instanceof SysMessageKey) == false) {
            return false;
        } // end if

        SysMessageKey other = (SysMessageKey) obj;

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

        buffer.append("messageCatalog=");
        buffer.append(this.messageCatalog);
        buffer.append("\r\n");

        buffer.append("messageKey=");
        buffer.append(this.messageKey);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysMessageKey
