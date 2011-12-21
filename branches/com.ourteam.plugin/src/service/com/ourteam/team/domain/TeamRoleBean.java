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
public class TeamRoleBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.team.dao.TeamRole objTeamRole;

    static {
        mappedDaoFields.put("id", com.ourteam.team.dao.ITeamRoleDAO.Id);

        mappedDaoFields.put("remarks", com.ourteam.team.dao.ITeamRoleDAO.Remarks);

        mappedDaoFields.put("status", com.ourteam.team.dao.ITeamRoleDAO.Status);

        mappedDaoFields.put("teamRoleCode",
            com.ourteam.team.dao.ITeamRoleDAO.TeamRoleCode);

        mappedDaoFields.put("teamRoleName",
            com.ourteam.team.dao.ITeamRoleDAO.TeamRoleName);

        mappedDaoFields.put("teamId", com.ourteam.team.dao.ITeamRoleDAO.TeamId);
    } 

    /**
     * Creates a new TeamRoleBean object.
     */
    public TeamRoleBean() {
        super();

        objTeamRole = new com.ourteam.team.dao.TeamRole();
    } // end TeamRoleBean()

    /**
     * Creates a new TeamRoleBean object.
     *
     * @param aTeamRole DOCUMENT ME!
     */
    public TeamRoleBean(com.ourteam.team.dao.TeamRole aTeamRole) {
        super();

        objTeamRole = aTeamRole;
    } // end TeamRoleBean()

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
    public com.ourteam.team.dao.TeamRole convertToTeamRole() {
        return objTeamRole;
    } // end convertToTeamRole()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objTeamRole.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objTeamRole.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objTeamRole.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objTeamRole.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objTeamRole.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objTeamRole.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TeamRoleCode
     *
     * @return teamRoleCode
     */
    public String getTeamRoleCode() {
        return objTeamRole.getTeamRoleCode();
    } // end getTeamRoleCode()

    /**
     * Set TeamRoleCode
     *
     * @param aTeamRoleCode
     */
    public void setTeamRoleCode(String aTeamRoleCode) {
        this.objTeamRole.setTeamRoleCode(aTeamRoleCode);
    } // end setTeamRoleCode()

    /**
     * Get TeamRoleName
     *
     * @return teamRoleName
     */
    public String getTeamRoleName() {
        return objTeamRole.getTeamRoleName();
    } // end getTeamRoleName()

    /**
     * Set TeamRoleName
     *
     * @param aTeamRoleName
     */
    public void setTeamRoleName(String aTeamRoleName) {
        this.objTeamRole.setTeamRoleName(aTeamRoleName);
    } // end setTeamRoleName()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    public long getTeamId() {
        return objTeamRole.getTeamId();
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    public void setTeamId(long aTeamId) {
        this.objTeamRole.setTeamId(aTeamId);
    } // end setTeamId()

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

        if ((obj instanceof TeamRoleBean) == false) {
            return false;
        } // end if

        TeamRoleBean other = (TeamRoleBean) obj;

        boolean isEqual = false;

        com.ourteam.team.dao.TeamRole tempTeamRole = other.convertToTeamRole();

        if ((tempTeamRole == null) || (this.objTeamRole == null)) {
            isEqual = false;
        } // end if
        else if ((tempTeamRole == this.objTeamRole) ||
                tempTeamRole.equals(this.objTeamRole)) {
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
     * @param aTeamRoles DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamRoleBean[] toArray(
        com.ourteam.team.dao.TeamRole[] aTeamRoles) {
        return toArray(aTeamRoles, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamRoles DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamRoleBean[] toArray(
        com.ourteam.team.dao.TeamRole[] aTeamRoles,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aTeamRoles)) {
            return new TeamRoleBean[0];
        } // end if

        int length = aTeamRoles.length;

        TeamRoleBean[] beans = new TeamRoleBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamRoleBean(aTeamRoles[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamRoleBean(aTeamRoles[i]);

                aCallBack.populate(beans[i], new Object[] { aTeamRoles[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end TeamRoleBean
