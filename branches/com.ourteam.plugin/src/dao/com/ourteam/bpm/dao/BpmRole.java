/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-04 13:12:55
 *
 * @author Auto Gen
 */
public class BpmRole implements java.io.Serializable {
    /**
     * Creates a new BpmRole object.
     */
    public BpmRole() {
        super();
    } // end BpmRole()

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
    private String roleKey;

    /** Attribute  Be Seted Falg */
    private boolean roleKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean roleKeyNull = false;

    /** Attribute */
    private String roleName;

    /** Attribute  Be Seted Falg */
    private boolean roleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean roleNameNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long sysModuleId;

    /** Attribute  Be Seted Falg */
    private boolean sysModuleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysModuleIdNull = false;

    /** Attribute */
    private String sysModuleName;

    /** Attribute  Be Seted Falg */
    private boolean sysModuleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysModuleNameNull = false;

    /** Attribute */
    private String sysModuleCode;

    /** Attribute  Be Seted Falg */
    private boolean sysModuleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysModuleCodeNull = false;

    /** Attribute */
    private long bpmDomainId;

    /** Attribute  Be Seted Falg */
    private boolean bpmDomainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmDomainIdNull = false;

    /** Attribute */
    private String bpmDomainCode;

    /** Attribute  Be Seted Falg */
    private boolean bpmDomainCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmDomainCodeNull = false;

    /** Attribute */
    private String bpmDomainName;

    /** Attribute  Be Seted Falg */
    private boolean bpmDomainNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmDomainNameNull = false;

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
     * Get RoleKey
     *
     * @return roleKey
     */
    final public String getRoleKey() {
        return roleKey;
    } // end getRoleKey()

    /**
     * Set RoleKey
     *
     * @param aRoleKey
     */
    final public void setRoleKey(String aRoleKey) {
        this.roleKey = aRoleKey;

        this.roleKeySetted = true;

        this.setRoleKeyNull(this.roleKey == null);
    } // end setRoleKey()

    /**
     * Get RoleKey Has Been Setted
     *
     * @return roleKey
     */
    final public boolean isRoleKeySetted() {
        return this.roleKeySetted;
    } // end isRoleKeySetted()

    /**
     * Set RoleKey Null
     */
    final public void setRoleKeyNull() {
        this.roleKeyNull = true;
    } // end setRoleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRoleKeyNull(boolean aNullFlag) {
        this.roleKeyNull = aNullFlag;
    } // end setRoleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRoleKeyNull() {
        return this.roleKeyNull;
    } // end isRoleKeyNull()

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
     * Get SysModuleId
     *
     * @return sysModuleId
     */
    final public long getSysModuleId() {
        return sysModuleId;
    } // end getSysModuleId()

    /**
     * Set SysModuleId
     *
     * @param aSysModuleId
     */
    final public void setSysModuleId(long aSysModuleId) {
        this.sysModuleId = aSysModuleId;

        this.sysModuleIdSetted = true;

        this.setSysModuleIdNull(false);
    } // end setSysModuleId()

    /**
     * Get SysModuleId Has Been Setted
     *
     * @return sysModuleId
     */
    final public boolean isSysModuleIdSetted() {
        return this.sysModuleIdSetted;
    } // end isSysModuleIdSetted()

    /**
     * Set SysModuleId Null
     */
    final public void setSysModuleIdNull() {
        this.sysModuleIdNull = true;
    } // end setSysModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysModuleIdNull(boolean aNullFlag) {
        this.sysModuleIdNull = aNullFlag;
    } // end setSysModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysModuleIdNull() {
        return this.sysModuleIdNull;
    } // end isSysModuleIdNull()

    /**
     * Get SysModuleName
     *
     * @return sysModuleName
     */
    final public String getSysModuleName() {
        return sysModuleName;
    } // end getSysModuleName()

    /**
     * Set SysModuleName
     *
     * @param aSysModuleName
     */
    final public void setSysModuleName(String aSysModuleName) {
        this.sysModuleName = aSysModuleName;

        this.sysModuleNameSetted = true;

        this.setSysModuleNameNull(this.sysModuleName == null);
    } // end setSysModuleName()

    /**
     * Get SysModuleName Has Been Setted
     *
     * @return sysModuleName
     */
    final public boolean isSysModuleNameSetted() {
        return this.sysModuleNameSetted;
    } // end isSysModuleNameSetted()

    /**
     * Set SysModuleName Null
     */
    final public void setSysModuleNameNull() {
        this.sysModuleNameNull = true;
    } // end setSysModuleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysModuleNameNull(boolean aNullFlag) {
        this.sysModuleNameNull = aNullFlag;
    } // end setSysModuleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysModuleNameNull() {
        return this.sysModuleNameNull;
    } // end isSysModuleNameNull()

    /**
     * Get SysModuleCode
     *
     * @return sysModuleCode
     */
    final public String getSysModuleCode() {
        return sysModuleCode;
    } // end getSysModuleCode()

    /**
     * Set SysModuleCode
     *
     * @param aSysModuleCode
     */
    final public void setSysModuleCode(String aSysModuleCode) {
        this.sysModuleCode = aSysModuleCode;

        this.sysModuleCodeSetted = true;

        this.setSysModuleCodeNull(this.sysModuleCode == null);
    } // end setSysModuleCode()

    /**
     * Get SysModuleCode Has Been Setted
     *
     * @return sysModuleCode
     */
    final public boolean isSysModuleCodeSetted() {
        return this.sysModuleCodeSetted;
    } // end isSysModuleCodeSetted()

    /**
     * Set SysModuleCode Null
     */
    final public void setSysModuleCodeNull() {
        this.sysModuleCodeNull = true;
    } // end setSysModuleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysModuleCodeNull(boolean aNullFlag) {
        this.sysModuleCodeNull = aNullFlag;
    } // end setSysModuleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysModuleCodeNull() {
        return this.sysModuleCodeNull;
    } // end isSysModuleCodeNull()

    /**
     * Get BpmDomainId
     *
     * @return bpmDomainId
     */
    final public long getBpmDomainId() {
        return bpmDomainId;
    } // end getBpmDomainId()

    /**
     * Set BpmDomainId
     *
     * @param aBpmDomainId
     */
    final public void setBpmDomainId(long aBpmDomainId) {
        this.bpmDomainId = aBpmDomainId;

        this.bpmDomainIdSetted = true;

        this.setBpmDomainIdNull(false);
    } // end setBpmDomainId()

    /**
     * Get BpmDomainId Has Been Setted
     *
     * @return bpmDomainId
     */
    final public boolean isBpmDomainIdSetted() {
        return this.bpmDomainIdSetted;
    } // end isBpmDomainIdSetted()

    /**
     * Set BpmDomainId Null
     */
    final public void setBpmDomainIdNull() {
        this.bpmDomainIdNull = true;
    } // end setBpmDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBpmDomainIdNull(boolean aNullFlag) {
        this.bpmDomainIdNull = aNullFlag;
    } // end setBpmDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBpmDomainIdNull() {
        return this.bpmDomainIdNull;
    } // end isBpmDomainIdNull()

    /**
     * Get BpmDomainCode
     *
     * @return bpmDomainCode
     */
    final public String getBpmDomainCode() {
        return bpmDomainCode;
    } // end getBpmDomainCode()

    /**
     * Set BpmDomainCode
     *
     * @param aBpmDomainCode
     */
    final public void setBpmDomainCode(String aBpmDomainCode) {
        this.bpmDomainCode = aBpmDomainCode;

        this.bpmDomainCodeSetted = true;

        this.setBpmDomainCodeNull(this.bpmDomainCode == null);
    } // end setBpmDomainCode()

    /**
     * Get BpmDomainCode Has Been Setted
     *
     * @return bpmDomainCode
     */
    final public boolean isBpmDomainCodeSetted() {
        return this.bpmDomainCodeSetted;
    } // end isBpmDomainCodeSetted()

    /**
     * Set BpmDomainCode Null
     */
    final public void setBpmDomainCodeNull() {
        this.bpmDomainCodeNull = true;
    } // end setBpmDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBpmDomainCodeNull(boolean aNullFlag) {
        this.bpmDomainCodeNull = aNullFlag;
    } // end setBpmDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBpmDomainCodeNull() {
        return this.bpmDomainCodeNull;
    } // end isBpmDomainCodeNull()

    /**
     * Get BpmDomainName
     *
     * @return bpmDomainName
     */
    final public String getBpmDomainName() {
        return bpmDomainName;
    } // end getBpmDomainName()

    /**
     * Set BpmDomainName
     *
     * @param aBpmDomainName
     */
    final public void setBpmDomainName(String aBpmDomainName) {
        this.bpmDomainName = aBpmDomainName;

        this.bpmDomainNameSetted = true;

        this.setBpmDomainNameNull(this.bpmDomainName == null);
    } // end setBpmDomainName()

    /**
     * Get BpmDomainName Has Been Setted
     *
     * @return bpmDomainName
     */
    final public boolean isBpmDomainNameSetted() {
        return this.bpmDomainNameSetted;
    } // end isBpmDomainNameSetted()

    /**
     * Set BpmDomainName Null
     */
    final public void setBpmDomainNameNull() {
        this.bpmDomainNameNull = true;
    } // end setBpmDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBpmDomainNameNull(boolean aNullFlag) {
        this.bpmDomainNameNull = aNullFlag;
    } // end setBpmDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBpmDomainNameNull() {
        return this.bpmDomainNameNull;
    } // end isBpmDomainNameNull()

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

        if ((obj instanceof BpmRole) == false) {
            return false;
        } // end if

        BpmRole other = (BpmRole) obj;

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

        buffer.append("roleKey=");
        buffer.append(this.roleKey);
        buffer.append("\r\n");

        buffer.append("roleName=");
        buffer.append(this.roleName);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sysModuleId=");
        buffer.append(this.sysModuleId);
        buffer.append("\r\n");

        buffer.append("sysModuleName=");
        buffer.append(this.sysModuleName);
        buffer.append("\r\n");

        buffer.append("sysModuleCode=");
        buffer.append(this.sysModuleCode);
        buffer.append("\r\n");

        buffer.append("bpmDomainId=");
        buffer.append(this.bpmDomainId);
        buffer.append("\r\n");

        buffer.append("bpmDomainCode=");
        buffer.append(this.bpmDomainCode);
        buffer.append("\r\n");

        buffer.append("bpmDomainName=");
        buffer.append(this.bpmDomainName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmRole
