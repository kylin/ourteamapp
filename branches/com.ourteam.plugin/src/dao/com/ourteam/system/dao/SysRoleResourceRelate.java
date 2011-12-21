/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统角色与资源关联 Generate Date 2011-09-22 10:11:22
 *
 * @author Auto Gen
 */
public class SysRoleResourceRelate implements java.io.Serializable {
    /**
     * Creates a new SysRoleResourceRelate object.
     */
    public SysRoleResourceRelate() {
        super();
    } // end SysRoleResourceRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String relateCode;

    /** Attribute  Be Seted Falg */
    private boolean relateCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean relateCodeNull = false;

    /** Attribute */
    private String relateName;

    /** Attribute  Be Seted Falg */
    private boolean relateNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean relateNameNull = false;

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
    private long sysResourceId;

    /** Attribute  Be Seted Falg */
    private boolean sysResourceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysResourceIdNull = false;

    /** Attribute */
    private long sysRoleId;

    /** Attribute  Be Seted Falg */
    private boolean sysRoleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysRoleIdNull = false;

    /** Attribute */
    private String sysResourceTitleKey;

    /** Attribute  Be Seted Falg */
    private boolean sysResourceTitleKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean sysResourceTitleKeyNull = false;

    /** Attribute */
    private String sysRoleName;

    /** Attribute  Be Seted Falg */
    private boolean sysRoleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysRoleNameNull = false;

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
     * Get RelateCode
     *
     * @return relateCode
     */
    final public String getRelateCode() {
        return relateCode;
    } // end getRelateCode()

    /**
     * Set RelateCode
     *
     * @param aRelateCode
     */
    final public void setRelateCode(String aRelateCode) {
        this.relateCode = aRelateCode;

        this.relateCodeSetted = true;

        this.setRelateCodeNull(this.relateCode == null);
    } // end setRelateCode()

    /**
     * Get RelateCode Has Been Setted
     *
     * @return relateCode
     */
    final public boolean isRelateCodeSetted() {
        return this.relateCodeSetted;
    } // end isRelateCodeSetted()

    /**
     * Set RelateCode Null
     */
    final public void setRelateCodeNull() {
        this.relateCodeNull = true;
    } // end setRelateCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelateCodeNull(boolean aNullFlag) {
        this.relateCodeNull = aNullFlag;
    } // end setRelateCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelateCodeNull() {
        return this.relateCodeNull;
    } // end isRelateCodeNull()

    /**
     * Get RelateName
     *
     * @return relateName
     */
    final public String getRelateName() {
        return relateName;
    } // end getRelateName()

    /**
     * Set RelateName
     *
     * @param aRelateName
     */
    final public void setRelateName(String aRelateName) {
        this.relateName = aRelateName;

        this.relateNameSetted = true;

        this.setRelateNameNull(this.relateName == null);
    } // end setRelateName()

    /**
     * Get RelateName Has Been Setted
     *
     * @return relateName
     */
    final public boolean isRelateNameSetted() {
        return this.relateNameSetted;
    } // end isRelateNameSetted()

    /**
     * Set RelateName Null
     */
    final public void setRelateNameNull() {
        this.relateNameNull = true;
    } // end setRelateNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelateNameNull(boolean aNullFlag) {
        this.relateNameNull = aNullFlag;
    } // end setRelateNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelateNameNull() {
        return this.relateNameNull;
    } // end isRelateNameNull()

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
     * Get SysResourceId
     *
     * @return sysResourceId
     */
    final public long getSysResourceId() {
        return sysResourceId;
    } // end getSysResourceId()

    /**
     * Set SysResourceId
     *
     * @param aSysResourceId
     */
    final public void setSysResourceId(long aSysResourceId) {
        this.sysResourceId = aSysResourceId;

        this.sysResourceIdSetted = true;

        this.setSysResourceIdNull(false);
    } // end setSysResourceId()

    /**
     * Get SysResourceId Has Been Setted
     *
     * @return sysResourceId
     */
    final public boolean isSysResourceIdSetted() {
        return this.sysResourceIdSetted;
    } // end isSysResourceIdSetted()

    /**
     * Set SysResourceId Null
     */
    final public void setSysResourceIdNull() {
        this.sysResourceIdNull = true;
    } // end setSysResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysResourceIdNull(boolean aNullFlag) {
        this.sysResourceIdNull = aNullFlag;
    } // end setSysResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysResourceIdNull() {
        return this.sysResourceIdNull;
    } // end isSysResourceIdNull()

    /**
     * Get SysRoleId
     *
     * @return sysRoleId
     */
    final public long getSysRoleId() {
        return sysRoleId;
    } // end getSysRoleId()

    /**
     * Set SysRoleId
     *
     * @param aSysRoleId
     */
    final public void setSysRoleId(long aSysRoleId) {
        this.sysRoleId = aSysRoleId;

        this.sysRoleIdSetted = true;

        this.setSysRoleIdNull(false);
    } // end setSysRoleId()

    /**
     * Get SysRoleId Has Been Setted
     *
     * @return sysRoleId
     */
    final public boolean isSysRoleIdSetted() {
        return this.sysRoleIdSetted;
    } // end isSysRoleIdSetted()

    /**
     * Set SysRoleId Null
     */
    final public void setSysRoleIdNull() {
        this.sysRoleIdNull = true;
    } // end setSysRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysRoleIdNull(boolean aNullFlag) {
        this.sysRoleIdNull = aNullFlag;
    } // end setSysRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysRoleIdNull() {
        return this.sysRoleIdNull;
    } // end isSysRoleIdNull()

    /**
     * Get SysResourceTitleKey
     *
     * @return sysResourceTitleKey
     */
    final public String getSysResourceTitleKey() {
        return sysResourceTitleKey;
    } // end getSysResourceTitleKey()

    /**
     * Set SysResourceTitleKey
     *
     * @param aSysResourceTitleKey
     */
    final public void setSysResourceTitleKey(String aSysResourceTitleKey) {
        this.sysResourceTitleKey = aSysResourceTitleKey;

        this.sysResourceTitleKeySetted = true;

        this.setSysResourceTitleKeyNull(this.sysResourceTitleKey == null);
    } // end setSysResourceTitleKey()

    /**
     * Get SysResourceTitleKey Has Been Setted
     *
     * @return sysResourceTitleKey
     */
    final public boolean isSysResourceTitleKeySetted() {
        return this.sysResourceTitleKeySetted;
    } // end isSysResourceTitleKeySetted()

    /**
     * Set SysResourceTitleKey Null
     */
    final public void setSysResourceTitleKeyNull() {
        this.sysResourceTitleKeyNull = true;
    } // end setSysResourceTitleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysResourceTitleKeyNull(boolean aNullFlag) {
        this.sysResourceTitleKeyNull = aNullFlag;
    } // end setSysResourceTitleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysResourceTitleKeyNull() {
        return this.sysResourceTitleKeyNull;
    } // end isSysResourceTitleKeyNull()

    /**
     * Get SysRoleName
     *
     * @return sysRoleName
     */
    final public String getSysRoleName() {
        return sysRoleName;
    } // end getSysRoleName()

    /**
     * Set SysRoleName
     *
     * @param aSysRoleName
     */
    final public void setSysRoleName(String aSysRoleName) {
        this.sysRoleName = aSysRoleName;

        this.sysRoleNameSetted = true;

        this.setSysRoleNameNull(this.sysRoleName == null);
    } // end setSysRoleName()

    /**
     * Get SysRoleName Has Been Setted
     *
     * @return sysRoleName
     */
    final public boolean isSysRoleNameSetted() {
        return this.sysRoleNameSetted;
    } // end isSysRoleNameSetted()

    /**
     * Set SysRoleName Null
     */
    final public void setSysRoleNameNull() {
        this.sysRoleNameNull = true;
    } // end setSysRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysRoleNameNull(boolean aNullFlag) {
        this.sysRoleNameNull = aNullFlag;
    } // end setSysRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysRoleNameNull() {
        return this.sysRoleNameNull;
    } // end isSysRoleNameNull()

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

        if ((obj instanceof SysRoleResourceRelate) == false) {
            return false;
        } // end if

        SysRoleResourceRelate other = (SysRoleResourceRelate) obj;

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

        buffer.append("relateCode=");
        buffer.append(this.relateCode);
        buffer.append("\r\n");

        buffer.append("relateName=");
        buffer.append(this.relateName);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sysResourceId=");
        buffer.append(this.sysResourceId);
        buffer.append("\r\n");

        buffer.append("sysRoleId=");
        buffer.append(this.sysRoleId);
        buffer.append("\r\n");

        buffer.append("sysResourceTitleKey=");
        buffer.append(this.sysResourceTitleKey);
        buffer.append("\r\n");

        buffer.append("sysRoleName=");
        buffer.append(this.sysRoleName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysRoleResourceRelate
