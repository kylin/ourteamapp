/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:10
 *
 * @model auto gen
 */
public class CalendarDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.calendar.dao.CalendarDefine objCalendarDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.calendar.dao.ICalendarDefineDAO.Id);

        mappedDaoFields.put("calendarName",
            com.ourteam.calendar.dao.ICalendarDefineDAO.CalendarName);

        mappedDaoFields.put("calendarType",
            com.ourteam.calendar.dao.ICalendarDefineDAO.CalendarType);

        mappedDaoFields.put("ownerId",
            com.ourteam.calendar.dao.ICalendarDefineDAO.OwnerId);

        mappedDaoFields.put("remarks",
            com.ourteam.calendar.dao.ICalendarDefineDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.calendar.dao.ICalendarDefineDAO.Status);

        mappedDaoFields.put("calendarStyle",
            com.ourteam.calendar.dao.ICalendarDefineDAO.CalendarStyle);
    } 

    /**
     * Creates a new CalendarDefineBean object.
     */
    public CalendarDefineBean() {
        super();

        objCalendarDefine = new com.ourteam.calendar.dao.CalendarDefine();
    } // end CalendarDefineBean()

    /**
     * Creates a new CalendarDefineBean object.
     *
     * @param aCalendarDefine DOCUMENT ME!
     */
    public CalendarDefineBean(
        com.ourteam.calendar.dao.CalendarDefine aCalendarDefine) {
        super();

        objCalendarDefine = aCalendarDefine;
    } // end CalendarDefineBean()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.calendar.dao.CalendarDefine convertToCalendarDefine() {
        return objCalendarDefine;
    } // end convertToCalendarDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objCalendarDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objCalendarDefine.setId(aId);
    } // end setId()

    /**
     * Get CalendarName
     *
     * @return calendarName
     */
    public String getCalendarName() {
        return objCalendarDefine.getCalendarName();
    } // end getCalendarName()

    /**
     * Set CalendarName
     *
     * @param aCalendarName
     */
    public void setCalendarName(String aCalendarName) {
        this.objCalendarDefine.setCalendarName(aCalendarName);
    } // end setCalendarName()

    /**
     * Get CalendarType
     *
     * @return calendarType
     */
    public String getCalendarType() {
        return objCalendarDefine.getCalendarType();
    } // end getCalendarType()

    /**
     * Set CalendarType
     *
     * @param aCalendarType
     */
    public void setCalendarType(String aCalendarType) {
        this.objCalendarDefine.setCalendarType(aCalendarType);
    } // end setCalendarType()

    /**
     * Get OwnerId
     *
     * @return ownerId
     */
    public long getOwnerId() {
        return objCalendarDefine.getOwnerId();
    } // end getOwnerId()

    /**
     * Set OwnerId
     *
     * @param aOwnerId
     */
    public void setOwnerId(long aOwnerId) {
        this.objCalendarDefine.setOwnerId(aOwnerId);
    } // end setOwnerId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objCalendarDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objCalendarDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objCalendarDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objCalendarDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get CalendarStyle
     *
     * @return calendarStyle
     */
    public String getCalendarStyle() {
        return objCalendarDefine.getCalendarStyle();
    } // end getCalendarStyle()

    /**
     * Set CalendarStyle
     *
     * @param aCalendarStyle
     */
    public void setCalendarStyle(String aCalendarStyle) {
        this.objCalendarDefine.setCalendarStyle(aCalendarStyle);
    } // end setCalendarStyle()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
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

        if ((obj instanceof CalendarDefineBean) == false) {
            return false;
        } // end if

        CalendarDefineBean other = (CalendarDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.calendar.dao.CalendarDefine tempCalendarDefine = other.convertToCalendarDefine();

        if ((tempCalendarDefine == null) || (this.objCalendarDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempCalendarDefine == this.objCalendarDefine) ||
                tempCalendarDefine.equals(this.objCalendarDefine)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static CalendarDefineBean[] toArray(
        com.ourteam.calendar.dao.CalendarDefine[] aCalendarDefines) {
        return toArray(aCalendarDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static CalendarDefineBean[] toArray(
        com.ourteam.calendar.dao.CalendarDefine[] aCalendarDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aCalendarDefines)) {
            return new CalendarDefineBean[0];
        } // end if

        int length = aCalendarDefines.length;

        CalendarDefineBean[] beans = new CalendarDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new CalendarDefineBean(aCalendarDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new CalendarDefineBean(aCalendarDefines[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aCalendarDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end CalendarDefineBean
