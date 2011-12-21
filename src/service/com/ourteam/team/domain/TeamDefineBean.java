/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:02
 *
 * @model auto gen
 */
public class TeamDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.team.dao.TeamDefine objTeamDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.team.dao.ITeamDefineDAO.Id);

        mappedDaoFields.put("remarks",
            com.ourteam.team.dao.ITeamDefineDAO.Remarks);

        mappedDaoFields.put("status", com.ourteam.team.dao.ITeamDefineDAO.Status);

        mappedDaoFields.put("teamCode",
            com.ourteam.team.dao.ITeamDefineDAO.TeamCode);

        mappedDaoFields.put("teamMail",
            com.ourteam.team.dao.ITeamDefineDAO.TeamMaill);

        mappedDaoFields.put("teamName",
            com.ourteam.team.dao.ITeamDefineDAO.TeamName);
    } 

    /**
     * Creates a new TeamDefineBean object.
     */
    public TeamDefineBean() {
        super();

        objTeamDefine = new com.ourteam.team.dao.TeamDefine();
    } // end TeamDefineBean()

    /**
     * Creates a new TeamDefineBean object.
     *
     * @param aTeamDefine DOCUMENT ME!
     */
    public TeamDefineBean(com.ourteam.team.dao.TeamDefine aTeamDefine) {
        super();

        objTeamDefine = aTeamDefine;
    } // end TeamDefineBean()

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
    public com.ourteam.team.dao.TeamDefine convertToTeamDefine() {
        return objTeamDefine;
    } // end convertToTeamDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objTeamDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objTeamDefine.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objTeamDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objTeamDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objTeamDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objTeamDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TeamCode
     *
     * @return teamCode
     */
    public String getTeamCode() {
        return objTeamDefine.getTeamCode();
    } // end getTeamCode()

    /**
     * Set TeamCode
     *
     * @param aTeamCode
     */
    public void setTeamCode(String aTeamCode) {
        this.objTeamDefine.setTeamCode(aTeamCode);
    } // end setTeamCode()

    /**
     * Get TeamMail
     *
     * @return teamMail
     */
    public String getTeamMail() {
        return objTeamDefine.getTeamMaill();
    } // end getTeamMail()

    /**
     * Set TeamMail
     *
     * @param aTeamMail
     */
    public void setTeamMail(String aTeamMail) {
        this.objTeamDefine.setTeamMaill(aTeamMail);
    } // end setTeamMail()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    public String getTeamName() {
        return objTeamDefine.getTeamName();
    } // end getTeamName()

    /**
     * Set TeamName
     *
     * @param aTeamName
     */
    public void setTeamName(String aTeamName) {
        this.objTeamDefine.setTeamName(aTeamName);
    } // end setTeamName()

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

        if ((obj instanceof TeamDefineBean) == false) {
            return false;
        } // end if

        TeamDefineBean other = (TeamDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.team.dao.TeamDefine tempTeamDefine = other.convertToTeamDefine();

        if ((tempTeamDefine == null) || (this.objTeamDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempTeamDefine == this.objTeamDefine) ||
                tempTeamDefine.equals(this.objTeamDefine)) {
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
     * @param aTeamDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamDefineBean[] toArray(
        com.ourteam.team.dao.TeamDefine[] aTeamDefines) {
        return toArray(aTeamDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamDefineBean[] toArray(
        com.ourteam.team.dao.TeamDefine[] aTeamDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aTeamDefines)) {
            return new TeamDefineBean[0];
        } // end if

        int length = aTeamDefines.length;

        TeamDefineBean[] beans = new TeamDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamDefineBean(aTeamDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamDefineBean(aTeamDefines[i]);

                aCallBack.populate(beans[i], new Object[] { aTeamDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end TeamDefineBean
