/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:11
 *
 * @model auto gen
 */
public class TeamCalendarDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.calendar.dao.TeamCalendarDefine objTeamCalendarDefine;

    static {
        mappedDaoFields.put("teamName",
            com.ourteam.calendar.dao.ITeamCalendarDefineDAO.TeamName);

        mappedDaoFields.put("teamRemarks",
            com.ourteam.calendar.dao.ITeamCalendarDefineDAO.TeamRemarks);

        mappedDaoFields.put("id",
            com.ourteam.calendar.dao.ITeamCalendarDefineDAO.Id);

        mappedDaoFields.put("calendarName",
            com.ourteam.calendar.dao.ITeamCalendarDefineDAO.CalendarName);

        mappedDaoFields.put("calendarType",
            com.ourteam.calendar.dao.ITeamCalendarDefineDAO.CalendarType);

        mappedDaoFields.put("teamId",
            com.ourteam.calendar.dao.ITeamCalendarDefineDAO.OwnerId);

        mappedDaoFields.put("remarks",
            com.ourteam.calendar.dao.ITeamCalendarDefineDAO.Remarks);
    } 

    /**
     * Creates a new TeamCalendarDefineBean object.
     */
    public TeamCalendarDefineBean() {
        super();

        objTeamCalendarDefine = new com.ourteam.calendar.dao.TeamCalendarDefine();
    } // end TeamCalendarDefineBean()

    /**
     * Creates a new TeamCalendarDefineBean object.
     *
     * @param aTeamCalendarDefine DOCUMENT ME!
     */
    public TeamCalendarDefineBean(
        com.ourteam.calendar.dao.TeamCalendarDefine aTeamCalendarDefine) {
        super();

        objTeamCalendarDefine = aTeamCalendarDefine;
    } // end TeamCalendarDefineBean()

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
    public com.ourteam.calendar.dao.TeamCalendarDefine convertToTeamCalendarDefine() {
        return objTeamCalendarDefine;
    } // end convertToTeamCalendarDefine()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    public String getTeamName() {
        return objTeamCalendarDefine.getTeamName();
    } // end getTeamName()

    /**
     * Get TeamRemarks
     *
     * @return teamRemarks
     */
    public String getTeamRemarks() {
        return objTeamCalendarDefine.getTeamRemarks();
    } // end getTeamRemarks()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objTeamCalendarDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objTeamCalendarDefine.setId(aId);
    } // end setId()

    /**
     * Get CalendarName
     *
     * @return calendarName
     */
    public String getCalendarName() {
        return objTeamCalendarDefine.getCalendarName();
    } // end getCalendarName()

    /**
     * Set CalendarName
     *
     * @param aCalendarName
     */
    public void setCalendarName(String aCalendarName) {
        this.objTeamCalendarDefine.setCalendarName(aCalendarName);
    } // end setCalendarName()

    /**
     * Get CalendarType
     *
     * @return calendarType
     */
    public String getCalendarType() {
        return objTeamCalendarDefine.getCalendarType();
    } // end getCalendarType()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    public long getTeamId() {
        return objTeamCalendarDefine.getOwnerId();
    } // end getTeamId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objTeamCalendarDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objTeamCalendarDefine.setRemarks(aRemarks);
    } // end setRemarks()

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

        if ((obj instanceof TeamCalendarDefineBean) == false) {
            return false;
        } // end if

        TeamCalendarDefineBean other = (TeamCalendarDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.calendar.dao.TeamCalendarDefine tempTeamCalendarDefine = other.convertToTeamCalendarDefine();

        if ((tempTeamCalendarDefine == null) ||
                (this.objTeamCalendarDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempTeamCalendarDefine == this.objTeamCalendarDefine) ||
                tempTeamCalendarDefine.equals(this.objTeamCalendarDefine)) {
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
     * @param aTeamCalendarDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamCalendarDefineBean[] toArray(
        com.ourteam.calendar.dao.TeamCalendarDefine[] aTeamCalendarDefines) {
        return toArray(aTeamCalendarDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamCalendarDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamCalendarDefineBean[] toArray(
        com.ourteam.calendar.dao.TeamCalendarDefine[] aTeamCalendarDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aTeamCalendarDefines)) {
            return new TeamCalendarDefineBean[0];
        } // end if

        int length = aTeamCalendarDefines.length;

        TeamCalendarDefineBean[] beans = new TeamCalendarDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamCalendarDefineBean(aTeamCalendarDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamCalendarDefineBean(aTeamCalendarDefines[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aTeamCalendarDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end TeamCalendarDefineBean
