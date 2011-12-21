/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统角色群组 Generate Date 2011-09-22 10:11:20
 *
 * @author Auto Gen
 */
public class SysRoleGroup implements java.io.Serializable {
    /**
     * Creates a new SysRoleGroup object.
     */
    public SysRoleGroup() {
        super();
    } // end SysRoleGroup()

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
    private String roleCode;

    /** Attribute  Be Seted Falg */
    private boolean roleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean roleCodeNull = false;

    /** Attribute */
    private String roleName;

    /** Attribute  Be Seted Falg */
    private boolean roleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean roleNameNull = false;

    /** Attribute com.ourteam.system.dao.SysRoleTypeEnum */
    private String roleType;

    /** Attribute com.ourteam.system.dao.SysRoleTypeEnum Be Seted Falg */
    private boolean roleTypeSetted = false;

    /** Attribute com.ourteam.system.dao.SysRoleTypeEnum is Null Falg */
    private boolean roleTypeNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

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
     * Get RoleCode
     *
     * @return roleCode
     */
    final public String getRoleCode() {
        return roleCode;
    } // end getRoleCode()

    /**
     * Set RoleCode
     *
     * @param aRoleCode
     */
    final public void setRoleCode(String aRoleCode) {
        this.roleCode = aRoleCode;

        this.roleCodeSetted = true;

        this.setRoleCodeNull(this.roleCode == null);
    } // end setRoleCode()

    /**
     * Get RoleCode Has Been Setted
     *
     * @return roleCode
     */
    final public boolean isRoleCodeSetted() {
        return this.roleCodeSetted;
    } // end isRoleCodeSetted()

    /**
     * Set RoleCode Null
     */
    final public void setRoleCodeNull() {
        this.roleCodeNull = true;
    } // end setRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRoleCodeNull(boolean aNullFlag) {
        this.roleCodeNull = aNullFlag;
    } // end setRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRoleCodeNull() {
        return this.roleCodeNull;
    } // end isRoleCodeNull()

    /**
     * Get RoleName
     *
     * @return roleName
     */
    final public String getRoleName() {
        return roleName;
    } // end getRoleName()

    /**
     * Set RoleName
     *
     * @param aRoleName
     */
    final public void setRoleName(String aRoleName) {
        this.roleName = aRoleName;

        this.roleNameSetted = true;

        this.setRoleNameNull(this.roleName == null);
    } // end setRoleName()

    /**
     * Get RoleName Has Been Setted
     *
     * @return roleName
     */
    final public boolean isRoleNameSetted() {
        return this.roleNameSetted;
    } // end isRoleNameSetted()

    /**
     * Set RoleName Null
     */
    final public void setRoleNameNull() {
        this.roleNameNull = true;
    } // end setRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRoleNameNull(boolean aNullFlag) {
        this.roleNameNull = aNullFlag;
    } // end setRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRoleNameNull() {
        return this.roleNameNull;
    } // end isRoleNameNull()

    /**
     * Get RoleType com.ourteam.system.dao.SysRoleTypeEnum
     *
     * @return roleType
     */
    final public String getRoleType() {
        return roleType;
    } // end getRoleType()

    /**
     * Set RoleType com.ourteam.system.dao.SysRoleTypeEnum
     *
     * @param aRoleType
     */
    final public void setRoleType(String aRoleType) {
        this.roleType = aRoleType;

        this.roleTypeSetted = true;

        this.setRoleTypeNull(this.roleType == null);
    } // end setRoleType()

    /**
     * Get RoleType Has Been Setted
     * com.ourteam.system.dao.SysRoleTypeEnum
     *
     * @return roleType
     */
    final public boolean isRoleTypeSetted() {
        return this.roleTypeSetted;
    } // end isRoleTypeSetted()

    /**
     * Set RoleType Null com.ourteam.system.dao.SysRoleTypeEnum
     */
    final public void setRoleTypeNull() {
        this.roleTypeNull = true;
    } // end setRoleTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRoleTypeNull(boolean aNullFlag) {
        this.roleTypeNull = aNullFlag;
    } // end setRoleTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRoleTypeNull() {
        return this.roleTypeNull;
    } // end isRoleTypeNull()

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

        if ((obj instanceof SysRoleGroup) == false) {
            return false;
        } // end if

        SysRoleGroup other = (SysRoleGroup) obj;

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

        buffer.append("roleCode=");
        buffer.append(this.roleCode);
        buffer.append("\r\n");

        buffer.append("roleName=");
        buffer.append(this.roleName);
        buffer.append("\r\n");

        buffer.append("roleType=");
        buffer.append(this.roleType);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysRoleGroup
