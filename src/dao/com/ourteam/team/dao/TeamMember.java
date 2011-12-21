/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

/**
 * Generate Date 2011-11-02 14:32:43
 *
 * @author Auto Gen
 */
public class TeamMember implements java.io.Serializable {
    /**
     * Creates a new TeamMember object.
     */
    public TeamMember() {
        super();
    } // end TeamMember()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

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
    private long employeeId;

    /** Attribute  Be Seted Falg */
    private boolean employeeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeIdNull = false;

    /** Attribute */
    private long teamId;

    /** Attribute  Be Seted Falg */
    private boolean teamIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamIdNull = false;

    /** Attribute */
    private long teamRoleId;

    /** Attribute  Be Seted Falg */
    private boolean teamRoleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamRoleIdNull = false;

    /** Attribute */
    private String teamRoleCode;

    /** Attribute  Be Seted Falg */
    private boolean teamRoleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamRoleCodeNull = false;

    /** Attribute */
    private String teamRoleName;

    /** Attribute  Be Seted Falg */
    private boolean teamRoleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamRoleNameNull = false;

    /** Attribute */
    private String teamCode;

    /** Attribute  Be Seted Falg */
    private boolean teamCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamCodeNull = false;

    /** Attribute */
    private String teamName;

    /** Attribute  Be Seted Falg */
    private boolean teamNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamNameNull = false;

    /** Attribute */
    private String employeeName;

    /** Attribute  Be Seted Falg */
    private boolean employeeNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeNameNull = false;

    /** Attribute */
    private String employeeCode;

    /** Attribute  Be Seted Falg */
    private boolean employeeCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeCodeNull = false;

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
     * Get EmployeeId
     *
     * @return employeeId
     */
    final public long getEmployeeId() {
        return employeeId;
    } // end getEmployeeId()

    /**
     * Set EmployeeId
     *
     * @param aEmployeeId
     */
    final public void setEmployeeId(long aEmployeeId) {
        this.employeeId = aEmployeeId;

        this.employeeIdSetted = true;

        this.setEmployeeIdNull(false);
    } // end setEmployeeId()

    /**
     * Get EmployeeId Has Been Setted
     *
     * @return employeeId
     */
    final public boolean isEmployeeIdSetted() {
        return this.employeeIdSetted;
    } // end isEmployeeIdSetted()

    /**
     * Set EmployeeId Null
     */
    final public void setEmployeeIdNull() {
        this.employeeIdNull = true;
    } // end setEmployeeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeIdNull(boolean aNullFlag) {
        this.employeeIdNull = aNullFlag;
    } // end setEmployeeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeIdNull() {
        return this.employeeIdNull;
    } // end isEmployeeIdNull()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    final public long getTeamId() {
        return teamId;
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    final public void setTeamId(long aTeamId) {
        this.teamId = aTeamId;

        this.teamIdSetted = true;

        this.setTeamIdNull(false);
    } // end setTeamId()

    /**
     * Get TeamId Has Been Setted
     *
     * @return teamId
     */
    final public boolean isTeamIdSetted() {
        return this.teamIdSetted;
    } // end isTeamIdSetted()

    /**
     * Set TeamId Null
     */
    final public void setTeamIdNull() {
        this.teamIdNull = true;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamIdNull(boolean aNullFlag) {
        this.teamIdNull = aNullFlag;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamIdNull() {
        return this.teamIdNull;
    } // end isTeamIdNull()

    /**
     * Get TeamRoleId
     *
     * @return teamRoleId
     */
    final public long getTeamRoleId() {
        return teamRoleId;
    } // end getTeamRoleId()

    /**
     * Set TeamRoleId
     *
     * @param aTeamRoleId
     */
    final public void setTeamRoleId(long aTeamRoleId) {
        this.teamRoleId = aTeamRoleId;

        this.teamRoleIdSetted = true;

        this.setTeamRoleIdNull(false);
    } // end setTeamRoleId()

    /**
     * Get TeamRoleId Has Been Setted
     *
     * @return teamRoleId
     */
    final public boolean isTeamRoleIdSetted() {
        return this.teamRoleIdSetted;
    } // end isTeamRoleIdSetted()

    /**
     * Set TeamRoleId Null
     */
    final public void setTeamRoleIdNull() {
        this.teamRoleIdNull = true;
    } // end setTeamRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamRoleIdNull(boolean aNullFlag) {
        this.teamRoleIdNull = aNullFlag;
    } // end setTeamRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamRoleIdNull() {
        return this.teamRoleIdNull;
    } // end isTeamRoleIdNull()

    /**
     * Get TeamRoleCode
     *
     * @return teamRoleCode
     */
    final public String getTeamRoleCode() {
        return teamRoleCode;
    } // end getTeamRoleCode()

    /**
     * Set TeamRoleCode
     *
     * @param aTeamRoleCode
     */
    final public void setTeamRoleCode(String aTeamRoleCode) {
        this.teamRoleCode = aTeamRoleCode;

        this.teamRoleCodeSetted = true;

        this.setTeamRoleCodeNull(this.teamRoleCode == null);
    } // end setTeamRoleCode()

    /**
     * Get TeamRoleCode Has Been Setted
     *
     * @return teamRoleCode
     */
    final public boolean isTeamRoleCodeSetted() {
        return this.teamRoleCodeSetted;
    } // end isTeamRoleCodeSetted()

    /**
     * Set TeamRoleCode Null
     */
    final public void setTeamRoleCodeNull() {
        this.teamRoleCodeNull = true;
    } // end setTeamRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamRoleCodeNull(boolean aNullFlag) {
        this.teamRoleCodeNull = aNullFlag;
    } // end setTeamRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamRoleCodeNull() {
        return this.teamRoleCodeNull;
    } // end isTeamRoleCodeNull()

    /**
     * Get TeamRoleName
     *
     * @return teamRoleName
     */
    final public String getTeamRoleName() {
        return teamRoleName;
    } // end getTeamRoleName()

    /**
     * Set TeamRoleName
     *
     * @param aTeamRoleName
     */
    final public void setTeamRoleName(String aTeamRoleName) {
        this.teamRoleName = aTeamRoleName;

        this.teamRoleNameSetted = true;

        this.setTeamRoleNameNull(this.teamRoleName == null);
    } // end setTeamRoleName()

    /**
     * Get TeamRoleName Has Been Setted
     *
     * @return teamRoleName
     */
    final public boolean isTeamRoleNameSetted() {
        return this.teamRoleNameSetted;
    } // end isTeamRoleNameSetted()

    /**
     * Set TeamRoleName Null
     */
    final public void setTeamRoleNameNull() {
        this.teamRoleNameNull = true;
    } // end setTeamRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamRoleNameNull(boolean aNullFlag) {
        this.teamRoleNameNull = aNullFlag;
    } // end setTeamRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamRoleNameNull() {
        return this.teamRoleNameNull;
    } // end isTeamRoleNameNull()

    /**
     * Get TeamCode
     *
     * @return teamCode
     */
    final public String getTeamCode() {
        return teamCode;
    } // end getTeamCode()

    /**
     * Set TeamCode
     *
     * @param aTeamCode
     */
    final public void setTeamCode(String aTeamCode) {
        this.teamCode = aTeamCode;

        this.teamCodeSetted = true;

        this.setTeamCodeNull(this.teamCode == null);
    } // end setTeamCode()

    /**
     * Get TeamCode Has Been Setted
     *
     * @return teamCode
     */
    final public boolean isTeamCodeSetted() {
        return this.teamCodeSetted;
    } // end isTeamCodeSetted()

    /**
     * Set TeamCode Null
     */
    final public void setTeamCodeNull() {
        this.teamCodeNull = true;
    } // end setTeamCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamCodeNull(boolean aNullFlag) {
        this.teamCodeNull = aNullFlag;
    } // end setTeamCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamCodeNull() {
        return this.teamCodeNull;
    } // end isTeamCodeNull()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    final public String getTeamName() {
        return teamName;
    } // end getTeamName()

    /**
     * Set TeamName
     *
     * @param aTeamName
     */
    final public void setTeamName(String aTeamName) {
        this.teamName = aTeamName;

        this.teamNameSetted = true;

        this.setTeamNameNull(this.teamName == null);
    } // end setTeamName()

    /**
     * Get TeamName Has Been Setted
     *
     * @return teamName
     */
    final public boolean isTeamNameSetted() {
        return this.teamNameSetted;
    } // end isTeamNameSetted()

    /**
     * Set TeamName Null
     */
    final public void setTeamNameNull() {
        this.teamNameNull = true;
    } // end setTeamNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamNameNull(boolean aNullFlag) {
        this.teamNameNull = aNullFlag;
    } // end setTeamNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamNameNull() {
        return this.teamNameNull;
    } // end isTeamNameNull()

    /**
     * Get EmployeeName
     *
     * @return employeeName
     */
    final public String getEmployeeName() {
        return employeeName;
    } // end getEmployeeName()

    /**
     * Set EmployeeName
     *
     * @param aEmployeeName
     */
    final public void setEmployeeName(String aEmployeeName) {
        this.employeeName = aEmployeeName;

        this.employeeNameSetted = true;

        this.setEmployeeNameNull(this.employeeName == null);
    } // end setEmployeeName()

    /**
     * Get EmployeeName Has Been Setted
     *
     * @return employeeName
     */
    final public boolean isEmployeeNameSetted() {
        return this.employeeNameSetted;
    } // end isEmployeeNameSetted()

    /**
     * Set EmployeeName Null
     */
    final public void setEmployeeNameNull() {
        this.employeeNameNull = true;
    } // end setEmployeeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeNameNull(boolean aNullFlag) {
        this.employeeNameNull = aNullFlag;
    } // end setEmployeeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeNameNull() {
        return this.employeeNameNull;
    } // end isEmployeeNameNull()

    /**
     * Get EmployeeCode
     *
     * @return employeeCode
     */
    final public String getEmployeeCode() {
        return employeeCode;
    } // end getEmployeeCode()

    /**
     * Set EmployeeCode
     *
     * @param aEmployeeCode
     */
    final public void setEmployeeCode(String aEmployeeCode) {
        this.employeeCode = aEmployeeCode;

        this.employeeCodeSetted = true;

        this.setEmployeeCodeNull(this.employeeCode == null);
    } // end setEmployeeCode()

    /**
     * Get EmployeeCode Has Been Setted
     *
     * @return employeeCode
     */
    final public boolean isEmployeeCodeSetted() {
        return this.employeeCodeSetted;
    } // end isEmployeeCodeSetted()

    /**
     * Set EmployeeCode Null
     */
    final public void setEmployeeCodeNull() {
        this.employeeCodeNull = true;
    } // end setEmployeeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeCodeNull(boolean aNullFlag) {
        this.employeeCodeNull = aNullFlag;
    } // end setEmployeeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeCodeNull() {
        return this.employeeCodeNull;
    } // end isEmployeeCodeNull()

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

        if ((obj instanceof TeamMember) == false) {
            return false;
        } // end if

        TeamMember other = (TeamMember) obj;

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

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("employeeId=");
        buffer.append(this.employeeId);
        buffer.append("\r\n");

        buffer.append("teamId=");
        buffer.append(this.teamId);
        buffer.append("\r\n");

        buffer.append("teamRoleId=");
        buffer.append(this.teamRoleId);
        buffer.append("\r\n");

        buffer.append("teamRoleCode=");
        buffer.append(this.teamRoleCode);
        buffer.append("\r\n");

        buffer.append("teamRoleName=");
        buffer.append(this.teamRoleName);
        buffer.append("\r\n");

        buffer.append("teamCode=");
        buffer.append(this.teamCode);
        buffer.append("\r\n");

        buffer.append("teamName=");
        buffer.append(this.teamName);
        buffer.append("\r\n");

        buffer.append("employeeName=");
        buffer.append(this.employeeName);
        buffer.append("\r\n");

        buffer.append("employeeCode=");
        buffer.append(this.employeeCode);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end TeamMember
