/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-01 13:19:55
 *
 * @author Auto Gen
 */
public class BpmProcessRolePurview implements java.io.Serializable {
    /**
     * Creates a new BpmProcessRolePurview object.
     */
    public BpmProcessRolePurview() {
        super();
    } // end BpmProcessRolePurview()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String canBreak;

    /** Attribute  Be Seted Falg */
    private boolean canBreakSetted = false;

    /** Attribute  is Null Falg */
    private boolean canBreakNull = false;

    /** Attribute */
    private String canStart;

    /** Attribute  Be Seted Falg */
    private boolean canStartSetted = false;

    /** Attribute  is Null Falg */
    private boolean canStartNull = false;

    /** Attribute */
    private long processDefineId;

    /** Attribute  Be Seted Falg */
    private boolean processDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processDefineIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long roleId;

    /** Attribute  Be Seted Falg */
    private boolean roleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean roleIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String roleName;

    /** Attribute  Be Seted Falg */
    private boolean roleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean roleNameNull = false;

    /** Attribute */
    private String roleCode;

    /** Attribute  Be Seted Falg */
    private boolean roleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean roleCodeNull = false;

    /** Attribute */
    private String canReAssign;

    /** Attribute  Be Seted Falg */
    private boolean canReAssignSetted = false;

    /** Attribute  is Null Falg */
    private boolean canReAssignNull = false;

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
     * Get CanBreak
     *
     * @return canBreak
     */
    final public String getCanBreak() {
        return canBreak;
    } // end getCanBreak()

    /**
     * Set CanBreak
     *
     * @param aCanBreak
     */
    final public void setCanBreak(String aCanBreak) {
        this.canBreak = aCanBreak;

        this.canBreakSetted = true;

        this.setCanBreakNull(this.canBreak == null);
    } // end setCanBreak()

    /**
     * Get CanBreak Has Been Setted
     *
     * @return canBreak
     */
    final public boolean isCanBreakSetted() {
        return this.canBreakSetted;
    } // end isCanBreakSetted()

    /**
     * Set CanBreak Null
     */
    final public void setCanBreakNull() {
        this.canBreakNull = true;
    } // end setCanBreakNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCanBreakNull(boolean aNullFlag) {
        this.canBreakNull = aNullFlag;
    } // end setCanBreakNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCanBreakNull() {
        return this.canBreakNull;
    } // end isCanBreakNull()

    /**
     * Get CanStart
     *
     * @return canStart
     */
    final public String getCanStart() {
        return canStart;
    } // end getCanStart()

    /**
     * Set CanStart
     *
     * @param aCanStart
     */
    final public void setCanStart(String aCanStart) {
        this.canStart = aCanStart;

        this.canStartSetted = true;

        this.setCanStartNull(this.canStart == null);
    } // end setCanStart()

    /**
     * Get CanStart Has Been Setted
     *
     * @return canStart
     */
    final public boolean isCanStartSetted() {
        return this.canStartSetted;
    } // end isCanStartSetted()

    /**
     * Set CanStart Null
     */
    final public void setCanStartNull() {
        this.canStartNull = true;
    } // end setCanStartNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCanStartNull(boolean aNullFlag) {
        this.canStartNull = aNullFlag;
    } // end setCanStartNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCanStartNull() {
        return this.canStartNull;
    } // end isCanStartNull()

    /**
     * Get ProcessDefineId
     *
     * @return processDefineId
     */
    final public long getProcessDefineId() {
        return processDefineId;
    } // end getProcessDefineId()

    /**
     * Set ProcessDefineId
     *
     * @param aProcessDefineId
     */
    final public void setProcessDefineId(long aProcessDefineId) {
        this.processDefineId = aProcessDefineId;

        this.processDefineIdSetted = true;

        this.setProcessDefineIdNull(false);
    } // end setProcessDefineId()

    /**
     * Get ProcessDefineId Has Been Setted
     *
     * @return processDefineId
     */
    final public boolean isProcessDefineIdSetted() {
        return this.processDefineIdSetted;
    } // end isProcessDefineIdSetted()

    /**
     * Set ProcessDefineId Null
     */
    final public void setProcessDefineIdNull() {
        this.processDefineIdNull = true;
    } // end setProcessDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessDefineIdNull(boolean aNullFlag) {
        this.processDefineIdNull = aNullFlag;
    } // end setProcessDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessDefineIdNull() {
        return this.processDefineIdNull;
    } // end isProcessDefineIdNull()

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
     * Get RoleId
     *
     * @return roleId
     */
    final public long getRoleId() {
        return roleId;
    } // end getRoleId()

    /**
     * Set RoleId
     *
     * @param aRoleId
     */
    final public void setRoleId(long aRoleId) {
        this.roleId = aRoleId;

        this.roleIdSetted = true;

        this.setRoleIdNull(false);
    } // end setRoleId()

    /**
     * Get RoleId Has Been Setted
     *
     * @return roleId
     */
    final public boolean isRoleIdSetted() {
        return this.roleIdSetted;
    } // end isRoleIdSetted()

    /**
     * Set RoleId Null
     */
    final public void setRoleIdNull() {
        this.roleIdNull = true;
    } // end setRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRoleIdNull(boolean aNullFlag) {
        this.roleIdNull = aNullFlag;
    } // end setRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRoleIdNull() {
        return this.roleIdNull;
    } // end isRoleIdNull()

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
     * Get CanReAssign
     *
     * @return canReAssign
     */
    final public String getCanReAssign() {
        return canReAssign;
    } // end getCanReAssign()

    /**
     * Set CanReAssign
     *
     * @param aCanReAssign
     */
    final public void setCanReAssign(String aCanReAssign) {
        this.canReAssign = aCanReAssign;

        this.canReAssignSetted = true;

        this.setCanReAssignNull(this.canReAssign == null);
    } // end setCanReAssign()

    /**
     * Get CanReAssign Has Been Setted
     *
     * @return canReAssign
     */
    final public boolean isCanReAssignSetted() {
        return this.canReAssignSetted;
    } // end isCanReAssignSetted()

    /**
     * Set CanReAssign Null
     */
    final public void setCanReAssignNull() {
        this.canReAssignNull = true;
    } // end setCanReAssignNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCanReAssignNull(boolean aNullFlag) {
        this.canReAssignNull = aNullFlag;
    } // end setCanReAssignNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCanReAssignNull() {
        return this.canReAssignNull;
    } // end isCanReAssignNull()

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

        if ((obj instanceof BpmProcessRolePurview) == false) {
            return false;
        } // end if

        BpmProcessRolePurview other = (BpmProcessRolePurview) obj;

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

        buffer.append("canBreak=");
        buffer.append(this.canBreak);
        buffer.append("\r\n");

        buffer.append("canStart=");
        buffer.append(this.canStart);
        buffer.append("\r\n");

        buffer.append("processDefineId=");
        buffer.append(this.processDefineId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("roleId=");
        buffer.append(this.roleId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("roleName=");
        buffer.append(this.roleName);
        buffer.append("\r\n");

        buffer.append("roleCode=");
        buffer.append(this.roleCode);
        buffer.append("\r\n");

        buffer.append("canReAssign=");
        buffer.append(this.canReAssign);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmProcessRolePurview
