/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * Generate Date 2011-11-24 15:00:28
 *
 * @author Auto Gen
 */
public class SysNotifyConfig implements java.io.Serializable {
    /**
     * Creates a new SysNotifyConfig object.
     */
    public SysNotifyConfig() {
        super();
    } // end SysNotifyConfig()

    /** Attribute */
    private int checkInterval;

    /** Attribute  Be Seted Falg */
    private boolean checkIntervalSetted = false;

    /** Attribute  is Null Falg */
    private boolean checkIntervalNull = false;

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String notifyIcon;

    /** Attribute  Be Seted Falg */
    private boolean notifyIconSetted = false;

    /** Attribute  is Null Falg */
    private boolean notifyIconNull = false;

    /** Attribute */
    private String notifyListener;

    /** Attribute  Be Seted Falg */
    private boolean notifyListenerSetted = false;

    /** Attribute  is Null Falg */
    private boolean notifyListenerNull = false;

    /** Attribute */
    private String notifyMessage;

    /** Attribute  Be Seted Falg */
    private boolean notifyMessageSetted = false;

    /** Attribute  is Null Falg */
    private boolean notifyMessageNull = false;

    /** Attribute */
    private String notifyName;

    /** Attribute  Be Seted Falg */
    private boolean notifyNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean notifyNameNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /**
     * Get CheckInterval
     *
     * @return checkInterval
     */
    final public int getCheckInterval() {
        return checkInterval;
    } // end getCheckInterval()

    /**
     * Set CheckInterval
     *
     * @param aCheckInterval
     */
    final public void setCheckInterval(int aCheckInterval) {
        this.checkInterval = aCheckInterval;

        this.checkIntervalSetted = true;

        this.setCheckIntervalNull(false);
    } // end setCheckInterval()

    /**
     * Get CheckInterval Has Been Setted
     *
     * @return checkInterval
     */
    final public boolean isCheckIntervalSetted() {
        return this.checkIntervalSetted;
    } // end isCheckIntervalSetted()

    /**
     * Set CheckInterval Null
     */
    final public void setCheckIntervalNull() {
        this.checkIntervalNull = true;
    } // end setCheckIntervalNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCheckIntervalNull(boolean aNullFlag) {
        this.checkIntervalNull = aNullFlag;
    } // end setCheckIntervalNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCheckIntervalNull() {
        return this.checkIntervalNull;
    } // end isCheckIntervalNull()

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
     * Get NotifyIcon
     *
     * @return notifyIcon
     */
    final public String getNotifyIcon() {
        return notifyIcon;
    } // end getNotifyIcon()

    /**
     * Set NotifyIcon
     *
     * @param aNotifyIcon
     */
    final public void setNotifyIcon(String aNotifyIcon) {
        this.notifyIcon = aNotifyIcon;

        this.notifyIconSetted = true;

        this.setNotifyIconNull(this.notifyIcon == null);
    } // end setNotifyIcon()

    /**
     * Get NotifyIcon Has Been Setted
     *
     * @return notifyIcon
     */
    final public boolean isNotifyIconSetted() {
        return this.notifyIconSetted;
    } // end isNotifyIconSetted()

    /**
     * Set NotifyIcon Null
     */
    final public void setNotifyIconNull() {
        this.notifyIconNull = true;
    } // end setNotifyIconNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNotifyIconNull(boolean aNullFlag) {
        this.notifyIconNull = aNullFlag;
    } // end setNotifyIconNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNotifyIconNull() {
        return this.notifyIconNull;
    } // end isNotifyIconNull()

    /**
     * Get NotifyListener
     *
     * @return notifyListener
     */
    final public String getNotifyListener() {
        if (isNotifyListenerNull()) {
            return null;
        } // end if
        else {
            return notifyListener;
        } // end else
    } // end getNotifyListener()

    /**
     * Set NotifyListener
     *
     * @param aNotifyListener
     */
    final public void setNotifyListener(String aNotifyListener) {
        this.notifyListener = aNotifyListener;

        this.notifyListenerSetted = true;

        this.setNotifyListenerNull(this.notifyListener == null);
    } // end setNotifyListener()

    /**
     * Get NotifyListener Has Been Setted
     *
     * @return notifyListener
     */
    final public boolean isNotifyListenerSetted() {
        return this.notifyListenerSetted;
    } // end isNotifyListenerSetted()

    /**
     * Set NotifyListener Null
     */
    final public void setNotifyListenerNull() {
        this.notifyListenerNull = true;
    } // end setNotifyListenerNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNotifyListenerNull(boolean aNullFlag) {
        this.notifyListenerNull = aNullFlag;
    } // end setNotifyListenerNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNotifyListenerNull() {
        return this.notifyListenerNull;
    } // end isNotifyListenerNull()

    /**
     * Get NotifyMessage
     *
     * @return notifyMessage
     */
    final public String getNotifyMessage() {
        if (isNotifyMessageNull()) {
            return null;
        } // end if
        else {
            return notifyMessage;
        } // end else
    } // end getNotifyMessage()

    /**
     * Set NotifyMessage
     *
     * @param aNotifyMessage
     */
    final public void setNotifyMessage(String aNotifyMessage) {
        this.notifyMessage = aNotifyMessage;

        this.notifyMessageSetted = true;

        this.setNotifyMessageNull(this.notifyMessage == null);
    } // end setNotifyMessage()

    /**
     * Get NotifyMessage Has Been Setted
     *
     * @return notifyMessage
     */
    final public boolean isNotifyMessageSetted() {
        return this.notifyMessageSetted;
    } // end isNotifyMessageSetted()

    /**
     * Set NotifyMessage Null
     */
    final public void setNotifyMessageNull() {
        this.notifyMessageNull = true;
    } // end setNotifyMessageNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNotifyMessageNull(boolean aNullFlag) {
        this.notifyMessageNull = aNullFlag;
    } // end setNotifyMessageNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNotifyMessageNull() {
        return this.notifyMessageNull;
    } // end isNotifyMessageNull()

    /**
     * Get NotifyName
     *
     * @return notifyName
     */
    final public String getNotifyName() {
        return notifyName;
    } // end getNotifyName()

    /**
     * Set NotifyName
     *
     * @param aNotifyName
     */
    final public void setNotifyName(String aNotifyName) {
        this.notifyName = aNotifyName;

        this.notifyNameSetted = true;

        this.setNotifyNameNull(this.notifyName == null);
    } // end setNotifyName()

    /**
     * Get NotifyName Has Been Setted
     *
     * @return notifyName
     */
    final public boolean isNotifyNameSetted() {
        return this.notifyNameSetted;
    } // end isNotifyNameSetted()

    /**
     * Set NotifyName Null
     */
    final public void setNotifyNameNull() {
        this.notifyNameNull = true;
    } // end setNotifyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNotifyNameNull(boolean aNullFlag) {
        this.notifyNameNull = aNullFlag;
    } // end setNotifyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNotifyNameNull() {
        return this.notifyNameNull;
    } // end isNotifyNameNull()

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

        if ((obj instanceof SysNotifyConfig) == false) {
            return false;
        } // end if

        SysNotifyConfig other = (SysNotifyConfig) obj;

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

        buffer.append("checkInterval=");
        buffer.append(this.checkInterval);
        buffer.append("\r\n");

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("notifyIcon=");
        buffer.append(this.notifyIcon);
        buffer.append("\r\n");

        buffer.append("notifyListener=");
        buffer.append(this.notifyListener);
        buffer.append("\r\n");

        buffer.append("notifyMessage=");
        buffer.append(this.notifyMessage);
        buffer.append("\r\n");

        buffer.append("notifyName=");
        buffer.append(this.notifyName);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysNotifyConfig
