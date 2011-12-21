/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

/**
 * Generate Date 2011-09-22 10:18:08
 *
 * @author Auto Gen
 */
public class CalendarItemAssign implements java.io.Serializable {
    /**
     * Creates a new CalendarItemAssign object.
     */
    public CalendarItemAssign() {
        super();
    } // end CalendarItemAssign()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private Double assignPercent;

    /** Attribute  Be Seted Falg */
    private boolean assignPercentSetted = false;

    /** Attribute  is Null Falg */
    private boolean assignPercentNull = false;

    /** Attribute */
    private long calendarItemId;

    /** Attribute  Be Seted Falg */
    private boolean calendarItemIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarItemIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long sysUserId;

    /** Attribute  Be Seted Falg */
    private boolean sysUserIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysUserIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String isLeader;

    /** Attribute  Be Seted Falg */
    private boolean isLeaderSetted = false;

    /** Attribute  is Null Falg */
    private boolean isLeaderNull = false;

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
     * Get AssignPercent
     *
     * @return assignPercent
     */
    final public Double getAssignPercent() {
        return assignPercent;
    } // end getAssignPercent()

    /**
     * Set AssignPercent
     *
     * @param aAssignPercent
     */
    final public void setAssignPercent(Double aAssignPercent) {
        this.assignPercent = aAssignPercent;

        this.assignPercentSetted = true;

        this.setAssignPercentNull(this.assignPercent == null);
    } // end setAssignPercent()

    /**
     * Get AssignPercent Has Been Setted
     *
     * @return assignPercent
     */
    final public boolean isAssignPercentSetted() {
        return this.assignPercentSetted;
    } // end isAssignPercentSetted()

    /**
     * Set AssignPercent Null
     */
    final public void setAssignPercentNull() {
        this.assignPercentNull = true;
    } // end setAssignPercentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAssignPercentNull(boolean aNullFlag) {
        this.assignPercentNull = aNullFlag;
    } // end setAssignPercentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAssignPercentNull() {
        return this.assignPercentNull;
    } // end isAssignPercentNull()

    /**
     * Get CalendarItemId
     *
     * @return calendarItemId
     */
    final public long getCalendarItemId() {
        return calendarItemId;
    } // end getCalendarItemId()

    /**
     * Set CalendarItemId
     *
     * @param aCalendarItemId
     */
    final public void setCalendarItemId(long aCalendarItemId) {
        this.calendarItemId = aCalendarItemId;

        this.calendarItemIdSetted = true;

        this.setCalendarItemIdNull(false);
    } // end setCalendarItemId()

    /**
     * Get CalendarItemId Has Been Setted
     *
     * @return calendarItemId
     */
    final public boolean isCalendarItemIdSetted() {
        return this.calendarItemIdSetted;
    } // end isCalendarItemIdSetted()

    /**
     * Set CalendarItemId Null
     */
    final public void setCalendarItemIdNull() {
        this.calendarItemIdNull = true;
    } // end setCalendarItemIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarItemIdNull(boolean aNullFlag) {
        this.calendarItemIdNull = aNullFlag;
    } // end setCalendarItemIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarItemIdNull() {
        return this.calendarItemIdNull;
    } // end isCalendarItemIdNull()

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
     * Get SysUserId
     *
     * @return sysUserId
     */
    final public long getSysUserId() {
        return sysUserId;
    } // end getSysUserId()

    /**
     * Set SysUserId
     *
     * @param aSysUserId
     */
    final public void setSysUserId(long aSysUserId) {
        this.sysUserId = aSysUserId;

        this.sysUserIdSetted = true;

        this.setSysUserIdNull(false);
    } // end setSysUserId()

    /**
     * Get SysUserId Has Been Setted
     *
     * @return sysUserId
     */
    final public boolean isSysUserIdSetted() {
        return this.sysUserIdSetted;
    } // end isSysUserIdSetted()

    /**
     * Set SysUserId Null
     */
    final public void setSysUserIdNull() {
        this.sysUserIdNull = true;
    } // end setSysUserIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysUserIdNull(boolean aNullFlag) {
        this.sysUserIdNull = aNullFlag;
    } // end setSysUserIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysUserIdNull() {
        return this.sysUserIdNull;
    } // end isSysUserIdNull()

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
     * Get IsLeader
     *
     * @return isLeader
     */
    final public String getIsLeader() {
        return isLeader;
    } // end getIsLeader()

    /**
     * Set IsLeader
     *
     * @param aIsLeader
     */
    final public void setIsLeader(String aIsLeader) {
        this.isLeader = aIsLeader;

        this.isLeaderSetted = true;

        this.setIsLeaderNull(this.isLeader == null);
    } // end setIsLeader()

    /**
     * Get IsLeader Has Been Setted
     *
     * @return isLeader
     */
    final public boolean isIsLeaderSetted() {
        return this.isLeaderSetted;
    } // end isIsLeaderSetted()

    /**
     * Set IsLeader Null
     */
    final public void setIsLeaderNull() {
        this.isLeaderNull = true;
    } // end setIsLeaderNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsLeaderNull(boolean aNullFlag) {
        this.isLeaderNull = aNullFlag;
    } // end setIsLeaderNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsLeaderNull() {
        return this.isLeaderNull;
    } // end isIsLeaderNull()

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

        if ((obj instanceof CalendarItemAssign) == false) {
            return false;
        } // end if

        CalendarItemAssign other = (CalendarItemAssign) obj;

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

        buffer.append("assignPercent=");
        buffer.append(this.assignPercent);
        buffer.append("\r\n");

        buffer.append("calendarItemId=");
        buffer.append(this.calendarItemId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("sysUserId=");
        buffer.append(this.sysUserId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("isLeader=");
        buffer.append(this.isLeader);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end CalendarItemAssign
