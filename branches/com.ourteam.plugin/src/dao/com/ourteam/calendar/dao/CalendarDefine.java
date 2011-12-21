/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

/**
 * Generate Date 2011-09-22 10:18:06
 *
 * @author Auto Gen
 */
public class CalendarDefine implements java.io.Serializable {
    /**
     * Creates a new CalendarDefine object.
     */
    public CalendarDefine() {
        super();
    } // end CalendarDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String calendarName;

    /** Attribute  Be Seted Falg */
    private boolean calendarNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarNameNull = false;

    /** Attribute */
    private String calendarType;

    /** Attribute  Be Seted Falg */
    private boolean calendarTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarTypeNull = false;

    /** Attribute */
    private long ownerId;

    /** Attribute  Be Seted Falg */
    private boolean ownerIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean ownerIdNull = false;

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
    private String calendarStyle;

    /** Attribute  Be Seted Falg */
    private boolean calendarStyleSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarStyleNull = false;

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
     * Get CalendarName
     *
     * @return calendarName
     */
    final public String getCalendarName() {
        return calendarName;
    } // end getCalendarName()

    /**
     * Set CalendarName
     *
     * @param aCalendarName
     */
    final public void setCalendarName(String aCalendarName) {
        this.calendarName = aCalendarName;

        this.calendarNameSetted = true;

        this.setCalendarNameNull(this.calendarName == null);
    } // end setCalendarName()

    /**
     * Get CalendarName Has Been Setted
     *
     * @return calendarName
     */
    final public boolean isCalendarNameSetted() {
        return this.calendarNameSetted;
    } // end isCalendarNameSetted()

    /**
     * Set CalendarName Null
     */
    final public void setCalendarNameNull() {
        this.calendarNameNull = true;
    } // end setCalendarNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarNameNull(boolean aNullFlag) {
        this.calendarNameNull = aNullFlag;
    } // end setCalendarNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarNameNull() {
        return this.calendarNameNull;
    } // end isCalendarNameNull()

    /**
     * Get CalendarType
     *
     * @return calendarType
     */
    final public String getCalendarType() {
        return calendarType;
    } // end getCalendarType()

    /**
     * Set CalendarType
     *
     * @param aCalendarType
     */
    final public void setCalendarType(String aCalendarType) {
        this.calendarType = aCalendarType;

        this.calendarTypeSetted = true;

        this.setCalendarTypeNull(this.calendarType == null);
    } // end setCalendarType()

    /**
     * Get CalendarType Has Been Setted
     *
     * @return calendarType
     */
    final public boolean isCalendarTypeSetted() {
        return this.calendarTypeSetted;
    } // end isCalendarTypeSetted()

    /**
     * Set CalendarType Null
     */
    final public void setCalendarTypeNull() {
        this.calendarTypeNull = true;
    } // end setCalendarTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarTypeNull(boolean aNullFlag) {
        this.calendarTypeNull = aNullFlag;
    } // end setCalendarTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarTypeNull() {
        return this.calendarTypeNull;
    } // end isCalendarTypeNull()

    /**
     * Get OwnerId
     *
     * @return ownerId
     */
    final public long getOwnerId() {
        return ownerId;
    } // end getOwnerId()

    /**
     * Set OwnerId
     *
     * @param aOwnerId
     */
    final public void setOwnerId(long aOwnerId) {
        this.ownerId = aOwnerId;

        this.ownerIdSetted = true;

        this.setOwnerIdNull(false);
    } // end setOwnerId()

    /**
     * Get OwnerId Has Been Setted
     *
     * @return ownerId
     */
    final public boolean isOwnerIdSetted() {
        return this.ownerIdSetted;
    } // end isOwnerIdSetted()

    /**
     * Set OwnerId Null
     */
    final public void setOwnerIdNull() {
        this.ownerIdNull = true;
    } // end setOwnerIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOwnerIdNull(boolean aNullFlag) {
        this.ownerIdNull = aNullFlag;
    } // end setOwnerIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOwnerIdNull() {
        return this.ownerIdNull;
    } // end isOwnerIdNull()

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
     * Get CalendarStyle
     *
     * @return calendarStyle
     */
    final public String getCalendarStyle() {
        if (isCalendarStyleNull()) {
            return null;
        } // end if
        else {
            return calendarStyle;
        } // end else
    } // end getCalendarStyle()

    /**
     * Set CalendarStyle
     *
     * @param aCalendarStyle
     */
    final public void setCalendarStyle(String aCalendarStyle) {
        this.calendarStyle = aCalendarStyle;

        this.calendarStyleSetted = true;

        this.setCalendarStyleNull(this.calendarStyle == null);
    } // end setCalendarStyle()

    /**
     * Get CalendarStyle Has Been Setted
     *
     * @return calendarStyle
     */
    final public boolean isCalendarStyleSetted() {
        return this.calendarStyleSetted;
    } // end isCalendarStyleSetted()

    /**
     * Set CalendarStyle Null
     */
    final public void setCalendarStyleNull() {
        this.calendarStyleNull = true;
    } // end setCalendarStyleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarStyleNull(boolean aNullFlag) {
        this.calendarStyleNull = aNullFlag;
    } // end setCalendarStyleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarStyleNull() {
        return this.calendarStyleNull;
    } // end isCalendarStyleNull()

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

        if ((obj instanceof CalendarDefine) == false) {
            return false;
        } // end if

        CalendarDefine other = (CalendarDefine) obj;

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

        buffer.append("calendarName=");
        buffer.append(this.calendarName);
        buffer.append("\r\n");

        buffer.append("calendarType=");
        buffer.append(this.calendarType);
        buffer.append("\r\n");

        buffer.append("ownerId=");
        buffer.append(this.ownerId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("calendarStyle=");
        buffer.append(this.calendarStyle);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end CalendarDefine
