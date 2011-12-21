/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

/**
 * Generate Date 2011-09-22 10:18:06
 *
 * @author Auto Gen
 */
public class CalendarDate implements java.io.Serializable {
    /**
     * Creates a new CalendarDate object.
     */
    public CalendarDate() {
        super();
    } // end CalendarDate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long calendarItemId;

    /** Attribute  Be Seted Falg */
    private boolean calendarItemIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarItemIdNull = false;

    /** Attribute */
    private java.util.Date itemDate;

    /** Attribute  Be Seted Falg */
    private boolean itemDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemDateNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long calendarId;

    /** Attribute  Be Seted Falg */
    private boolean calendarIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarIdNull = false;

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
     * Get ItemDate
     *
     * @return itemDate
     */
    final public java.util.Date getItemDate() {
        return itemDate;
    } // end getItemDate()

    /**
     * Set ItemDate
     *
     * @param aItemDate
     */
    final public void setItemDate(java.util.Date aItemDate) {
        this.itemDate = aItemDate;

        this.itemDateSetted = true;

        this.setItemDateNull(this.itemDate == null);
    } // end setItemDate()

    /**
     * Get ItemDate Has Been Setted
     *
     * @return itemDate
     */
    final public boolean isItemDateSetted() {
        return this.itemDateSetted;
    } // end isItemDateSetted()

    /**
     * Set ItemDate Null
     */
    final public void setItemDateNull() {
        this.itemDateNull = true;
    } // end setItemDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemDateNull(boolean aNullFlag) {
        this.itemDateNull = aNullFlag;
    } // end setItemDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemDateNull() {
        return this.itemDateNull;
    } // end isItemDateNull()

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
     * Get CalendarId
     *
     * @return calendarId
     */
    final public long getCalendarId() {
        return calendarId;
    } // end getCalendarId()

    /**
     * Set CalendarId
     *
     * @param aCalendarId
     */
    final public void setCalendarId(long aCalendarId) {
        this.calendarId = aCalendarId;

        this.calendarIdSetted = true;

        this.setCalendarIdNull(false);
    } // end setCalendarId()

    /**
     * Get CalendarId Has Been Setted
     *
     * @return calendarId
     */
    final public boolean isCalendarIdSetted() {
        return this.calendarIdSetted;
    } // end isCalendarIdSetted()

    /**
     * Set CalendarId Null
     */
    final public void setCalendarIdNull() {
        this.calendarIdNull = true;
    } // end setCalendarIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarIdNull(boolean aNullFlag) {
        this.calendarIdNull = aNullFlag;
    } // end setCalendarIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarIdNull() {
        return this.calendarIdNull;
    } // end isCalendarIdNull()

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

        if ((obj instanceof CalendarDate) == false) {
            return false;
        } // end if

        CalendarDate other = (CalendarDate) obj;

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

        buffer.append("calendarItemId=");
        buffer.append(this.calendarItemId);
        buffer.append("\r\n");

        buffer.append("itemDate=");
        buffer.append(this.itemDate);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("calendarId=");
        buffer.append(this.calendarId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end CalendarDate
