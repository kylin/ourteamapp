/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-02 14:34:55
 *
 * @model auto gen
 */
public class TeamMemberBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.team.dao.TeamMember objTeamMember;

    static {
        mappedDaoFields.put("id", com.ourteam.team.dao.ITeamMemberDAO.Id);

        mappedDaoFields.put("remarks",
            com.ourteam.team.dao.ITeamMemberDAO.Remarks);

        mappedDaoFields.put("status", com.ourteam.team.dao.ITeamMemberDAO.Status);

        mappedDaoFields.put("employeeId",
            com.ourteam.team.dao.ITeamMemberDAO.EmployeeId);

        mappedDaoFields.put("teamId", com.ourteam.team.dao.ITeamMemberDAO.TeamId);

        mappedDaoFields.put("teamRoleId",
            com.ourteam.team.dao.ITeamMemberDAO.TeamRoleId);

        mappedDaoFields.put("teamRoleCode",
            com.ourteam.team.dao.ITeamMemberDAO.TeamRoleCode);

        mappedDaoFields.put("teamRoleName",
            com.ourteam.team.dao.ITeamMemberDAO.TeamRoleName);

        mappedDaoFields.put("teamCode",
            com.ourteam.team.dao.ITeamMemberDAO.TeamCode);

        mappedDaoFields.put("teamName",
            com.ourteam.team.dao.ITeamMemberDAO.TeamName);

        mappedDaoFields.put("employeeName",
            com.ourteam.team.dao.ITeamMemberDAO.EmployeeName);

        mappedDaoFields.put("employeeCode",
            com.ourteam.team.dao.ITeamMemberDAO.EmployeeCode);
    } 

    /**
     * Creates a new TeamMemberBean object.
     */
    public TeamMemberBean() {
        super();

        objTeamMember = new com.ourteam.team.dao.TeamMember();
    } // end TeamMemberBean()

    /**
     * Creates a new TeamMemberBean object.
     *
     * @param aTeamMember DOCUMENT ME!
     */
    public TeamMemberBean(com.ourteam.team.dao.TeamMember aTeamMember) {
        super();

        objTeamMember = aTeamMember;
    } // end TeamMemberBean()

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
    public com.ourteam.team.dao.TeamMember convertToTeamMember() {
        return objTeamMember;
    } // end convertToTeamMember()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objTeamMember.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objTeamMember.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objTeamMember.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objTeamMember.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objTeamMember.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objTeamMember.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get EmployeeId
     *
     * @return employeeId
     */
    public long getEmployeeId() {
        return objTeamMember.getEmployeeId();
    } // end getEmployeeId()

    /**
     * Set EmployeeId
     *
     * @param aEmployeeId
     */
    public void setEmployeeId(long aEmployeeId) {
        this.objTeamMember.setEmployeeId(aEmployeeId);
    } // end setEmployeeId()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    public long getTeamId() {
        return objTeamMember.getTeamId();
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    public void setTeamId(long aTeamId) {
        this.objTeamMember.setTeamId(aTeamId);
    } // end setTeamId()

    /**
     * Get TeamRoleId
     *
     * @return teamRoleId
     */
    public long getTeamRoleId() {
        return objTeamMember.getTeamRoleId();
    } // end getTeamRoleId()

    /**
     * Set TeamRoleId
     *
     * @param aTeamRoleId
     */
    public void setTeamRoleId(long aTeamRoleId) {
        this.objTeamMember.setTeamRoleId(aTeamRoleId);
    } // end setTeamRoleId()

    /**
     * Get TeamRoleCode
     *
     * @return teamRoleCode
     */
    public String getTeamRoleCode() {
        return objTeamMember.getTeamRoleCode();
    } // end getTeamRoleCode()

    /**
     * Set TeamRoleCode
     *
     * @param aTeamRoleCode
     */
    public void setTeamRoleCode(String aTeamRoleCode) {
        this.objTeamMember.setTeamRoleCode(aTeamRoleCode);
    } // end setTeamRoleCode()

    /**
     * Get TeamRoleName
     *
     * @return teamRoleName
     */
    public String getTeamRoleName() {
        return objTeamMember.getTeamRoleName();
    } // end getTeamRoleName()

    /**
     * Set TeamRoleName
     *
     * @param aTeamRoleName
     */
    public void setTeamRoleName(String aTeamRoleName) {
        this.objTeamMember.setTeamRoleName(aTeamRoleName);
    } // end setTeamRoleName()

    /**
     * Get TeamCode
     *
     * @return teamCode
     */
    public String getTeamCode() {
        return objTeamMember.getTeamCode();
    } // end getTeamCode()

    /**
     * Set TeamCode
     *
     * @param aTeamCode
     */
    public void setTeamCode(String aTeamCode) {
        this.objTeamMember.setTeamCode(aTeamCode);
    } // end setTeamCode()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    public String getTeamName() {
        return objTeamMember.getTeamName();
    } // end getTeamName()

    /**
     * Set TeamName
     *
     * @param aTeamName
     */
    public void setTeamName(String aTeamName) {
        this.objTeamMember.setTeamName(aTeamName);
    } // end setTeamName()

    /**
     * Get EmployeeName
     *
     * @return employeeName
     */
    public String getEmployeeName() {
        return objTeamMember.getEmployeeName();
    } // end getEmployeeName()

    /**
     * Set EmployeeName
     *
     * @param aEmployeeName
     */
    public void setEmployeeName(String aEmployeeName) {
        this.objTeamMember.setEmployeeName(aEmployeeName);
    } // end setEmployeeName()

    /**
     * Get EmployeeCode
     *
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return objTeamMember.getEmployeeCode();
    } // end getEmployeeCode()

    /**
     * Set EmployeeCode
     *
     * @param aEmployeeCode
     */
    public void setEmployeeCode(String aEmployeeCode) {
        this.objTeamMember.setEmployeeCode(aEmployeeCode);
    } // end setEmployeeCode()

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

        if ((obj instanceof TeamMemberBean) == false) {
            return false;
        } // end if

        TeamMemberBean other = (TeamMemberBean) obj;

        boolean isEqual = false;

        com.ourteam.team.dao.TeamMember tempTeamMember = other.convertToTeamMember();

        if ((tempTeamMember == null) || (this.objTeamMember == null)) {
            isEqual = false;
        } // end if
        else if ((tempTeamMember == this.objTeamMember) ||
                tempTeamMember.equals(this.objTeamMember)) {
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
     * @param aTeamMembers DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamMemberBean[] toArray(
        com.ourteam.team.dao.TeamMember[] aTeamMembers) {
        return toArray(aTeamMembers, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamMembers DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamMemberBean[] toArray(
        com.ourteam.team.dao.TeamMember[] aTeamMembers,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aTeamMembers)) {
            return new TeamMemberBean[0];
        } // end if

        int length = aTeamMembers.length;

        TeamMemberBean[] beans = new TeamMemberBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamMemberBean(aTeamMembers[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamMemberBean(aTeamMembers[i]);

                aCallBack.populate(beans[i], new Object[] { aTeamMembers[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end TeamMemberBean
