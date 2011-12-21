/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统角色关系组 Generate Date 2011-09-22 10:11:21
 *
 * @author Auto Gen
 */
public class SysRoleRelate implements java.io.Serializable {
    /**
     * Creates a new SysRoleRelate object.
     */
    public SysRoleRelate() {
        super();
    } // end SysRoleRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long relatedSysRoleId;

    /** Attribute  Be Seted Falg */
    private boolean relatedSysRoleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean relatedSysRoleIdNull = false;

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
    private long sysRoleGroupId;

    /** Attribute  Be Seted Falg */
    private boolean sysRoleGroupIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysRoleGroupIdNull = false;

    /** Attribute */
    private String relatedSysRoleCode;

    /** Attribute  Be Seted Falg */
    private boolean relatedSysRoleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean relatedSysRoleCodeNull = false;

    /** Attribute */
    private String sysRoleName;

    /** Attribute  Be Seted Falg */
    private boolean sysRoleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysRoleNameNull = false;

    /** Attribute */
    private String sysRoleCode;

    /** Attribute  Be Seted Falg */
    private boolean sysRoleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysRoleCodeNull = false;

    /** Attribute */
    private String sysRoleType;

    /** Attribute  Be Seted Falg */
    private boolean sysRoleTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysRoleTypeNull = false;

    /** Attribute */
    private long sysRoleDomainId;

    /** Attribute  Be Seted Falg */
    private boolean sysRoleDomainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysRoleDomainIdNull = false;

    /** Attribute */
    private String sysDomainName;

    /** Attribute  Be Seted Falg */
    private boolean sysDomainNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysDomainNameNull = false;

    /** Attribute */
    private String sysDomainCode;

    /** Attribute  Be Seted Falg */
    private boolean sysDomainCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysDomainCodeNull = false;

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
     * Get RelatedSysRoleId
     *
     * @return relatedSysRoleId
     */
    final public long getRelatedSysRoleId() {
        return relatedSysRoleId;
    } // end getRelatedSysRoleId()

    /**
     * Set RelatedSysRoleId
     *
     * @param aRelatedSysRoleId
     */
    final public void setRelatedSysRoleId(long aRelatedSysRoleId) {
        this.relatedSysRoleId = aRelatedSysRoleId;

        this.relatedSysRoleIdSetted = true;

        this.setRelatedSysRoleIdNull(false);
    } // end setRelatedSysRoleId()

    /**
     * Get RelatedSysRoleId Has Been Setted
     *
     * @return relatedSysRoleId
     */
    final public boolean isRelatedSysRoleIdSetted() {
        return this.relatedSysRoleIdSetted;
    } // end isRelatedSysRoleIdSetted()

    /**
     * Set RelatedSysRoleId Null
     */
    final public void setRelatedSysRoleIdNull() {
        this.relatedSysRoleIdNull = true;
    } // end setRelatedSysRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelatedSysRoleIdNull(boolean aNullFlag) {
        this.relatedSysRoleIdNull = aNullFlag;
    } // end setRelatedSysRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelatedSysRoleIdNull() {
        return this.relatedSysRoleIdNull;
    } // end isRelatedSysRoleIdNull()

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
     * Get SysRoleGroupId
     *
     * @return sysRoleGroupId
     */
    final public long getSysRoleGroupId() {
        return sysRoleGroupId;
    } // end getSysRoleGroupId()

    /**
     * Set SysRoleGroupId
     *
     * @param aSysRoleGroupId
     */
    final public void setSysRoleGroupId(long aSysRoleGroupId) {
        this.sysRoleGroupId = aSysRoleGroupId;

        this.sysRoleGroupIdSetted = true;

        this.setSysRoleGroupIdNull(false);
    } // end setSysRoleGroupId()

    /**
     * Get SysRoleGroupId Has Been Setted
     *
     * @return sysRoleGroupId
     */
    final public boolean isSysRoleGroupIdSetted() {
        return this.sysRoleGroupIdSetted;
    } // end isSysRoleGroupIdSetted()

    /**
     * Set SysRoleGroupId Null
     */
    final public void setSysRoleGroupIdNull() {
        this.sysRoleGroupIdNull = true;
    } // end setSysRoleGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysRoleGroupIdNull(boolean aNullFlag) {
        this.sysRoleGroupIdNull = aNullFlag;
    } // end setSysRoleGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysRoleGroupIdNull() {
        return this.sysRoleGroupIdNull;
    } // end isSysRoleGroupIdNull()

    /**
     * Get RelatedSysRoleCode
     *
     * @return relatedSysRoleCode
     */
    final public String getRelatedSysRoleCode() {
        return relatedSysRoleCode;
    } // end getRelatedSysRoleCode()

    /**
     * Set RelatedSysRoleCode
     *
     * @param aRelatedSysRoleCode
     */
    final public void setRelatedSysRoleCode(String aRelatedSysRoleCode) {
        this.relatedSysRoleCode = aRelatedSysRoleCode;

        this.relatedSysRoleCodeSetted = true;

        this.setRelatedSysRoleCodeNull(this.relatedSysRoleCode == null);
    } // end setRelatedSysRoleCode()

    /**
     * Get RelatedSysRoleCode Has Been Setted
     *
     * @return relatedSysRoleCode
     */
    final public boolean isRelatedSysRoleCodeSetted() {
        return this.relatedSysRoleCodeSetted;
    } // end isRelatedSysRoleCodeSetted()

    /**
     * Set RelatedSysRoleCode Null
     */
    final public void setRelatedSysRoleCodeNull() {
        this.relatedSysRoleCodeNull = true;
    } // end setRelatedSysRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelatedSysRoleCodeNull(boolean aNullFlag) {
        this.relatedSysRoleCodeNull = aNullFlag;
    } // end setRelatedSysRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelatedSysRoleCodeNull() {
        return this.relatedSysRoleCodeNull;
    } // end isRelatedSysRoleCodeNull()

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
     * Get SysRoleCode
     *
     * @return sysRoleCode
     */
    final public String getSysRoleCode() {
        return sysRoleCode;
    } // end getSysRoleCode()

    /**
     * Set SysRoleCode
     *
     * @param aSysRoleCode
     */
    final public void setSysRoleCode(String aSysRoleCode) {
        this.sysRoleCode = aSysRoleCode;

        this.sysRoleCodeSetted = true;

        this.setSysRoleCodeNull(this.sysRoleCode == null);
    } // end setSysRoleCode()

    /**
     * Get SysRoleCode Has Been Setted
     *
     * @return sysRoleCode
     */
    final public boolean isSysRoleCodeSetted() {
        return this.sysRoleCodeSetted;
    } // end isSysRoleCodeSetted()

    /**
     * Set SysRoleCode Null
     */
    final public void setSysRoleCodeNull() {
        this.sysRoleCodeNull = true;
    } // end setSysRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysRoleCodeNull(boolean aNullFlag) {
        this.sysRoleCodeNull = aNullFlag;
    } // end setSysRoleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysRoleCodeNull() {
        return this.sysRoleCodeNull;
    } // end isSysRoleCodeNull()

    /**
     * Get SysRoleType
     *
     * @return sysRoleType
     */
    final public String getSysRoleType() {
        return sysRoleType;
    } // end getSysRoleType()

    /**
     * Set SysRoleType
     *
     * @param aSysRoleType
     */
    final public void setSysRoleType(String aSysRoleType) {
        this.sysRoleType = aSysRoleType;

        this.sysRoleTypeSetted = true;

        this.setSysRoleTypeNull(this.sysRoleType == null);
    } // end setSysRoleType()

    /**
     * Get SysRoleType Has Been Setted
     *
     * @return sysRoleType
     */
    final public boolean isSysRoleTypeSetted() {
        return this.sysRoleTypeSetted;
    } // end isSysRoleTypeSetted()

    /**
     * Set SysRoleType Null
     */
    final public void setSysRoleTypeNull() {
        this.sysRoleTypeNull = true;
    } // end setSysRoleTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysRoleTypeNull(boolean aNullFlag) {
        this.sysRoleTypeNull = aNullFlag;
    } // end setSysRoleTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysRoleTypeNull() {
        return this.sysRoleTypeNull;
    } // end isSysRoleTypeNull()

    /**
     * Get SysRoleDomainId
     *
     * @return sysRoleDomainId
     */
    final public long getSysRoleDomainId() {
        return sysRoleDomainId;
    } // end getSysRoleDomainId()

    /**
     * Set SysRoleDomainId
     *
     * @param aSysRoleDomainId
     */
    final public void setSysRoleDomainId(long aSysRoleDomainId) {
        this.sysRoleDomainId = aSysRoleDomainId;

        this.sysRoleDomainIdSetted = true;

        this.setSysRoleDomainIdNull(false);
    } // end setSysRoleDomainId()

    /**
     * Get SysRoleDomainId Has Been Setted
     *
     * @return sysRoleDomainId
     */
    final public boolean isSysRoleDomainIdSetted() {
        return this.sysRoleDomainIdSetted;
    } // end isSysRoleDomainIdSetted()

    /**
     * Set SysRoleDomainId Null
     */
    final public void setSysRoleDomainIdNull() {
        this.sysRoleDomainIdNull = true;
    } // end setSysRoleDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysRoleDomainIdNull(boolean aNullFlag) {
        this.sysRoleDomainIdNull = aNullFlag;
    } // end setSysRoleDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysRoleDomainIdNull() {
        return this.sysRoleDomainIdNull;
    } // end isSysRoleDomainIdNull()

    /**
     * Get SysDomainName
     *
     * @return sysDomainName
     */
    final public String getSysDomainName() {
        return sysDomainName;
    } // end getSysDomainName()

    /**
     * Set SysDomainName
     *
     * @param aSysDomainName
     */
    final public void setSysDomainName(String aSysDomainName) {
        this.sysDomainName = aSysDomainName;

        this.sysDomainNameSetted = true;

        this.setSysDomainNameNull(this.sysDomainName == null);
    } // end setSysDomainName()

    /**
     * Get SysDomainName Has Been Setted
     *
     * @return sysDomainName
     */
    final public boolean isSysDomainNameSetted() {
        return this.sysDomainNameSetted;
    } // end isSysDomainNameSetted()

    /**
     * Set SysDomainName Null
     */
    final public void setSysDomainNameNull() {
        this.sysDomainNameNull = true;
    } // end setSysDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysDomainNameNull(boolean aNullFlag) {
        this.sysDomainNameNull = aNullFlag;
    } // end setSysDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysDomainNameNull() {
        return this.sysDomainNameNull;
    } // end isSysDomainNameNull()

    /**
     * Get SysDomainCode
     *
     * @return sysDomainCode
     */
    final public String getSysDomainCode() {
        return sysDomainCode;
    } // end getSysDomainCode()

    /**
     * Set SysDomainCode
     *
     * @param aSysDomainCode
     */
    final public void setSysDomainCode(String aSysDomainCode) {
        this.sysDomainCode = aSysDomainCode;

        this.sysDomainCodeSetted = true;

        this.setSysDomainCodeNull(this.sysDomainCode == null);
    } // end setSysDomainCode()

    /**
     * Get SysDomainCode Has Been Setted
     *
     * @return sysDomainCode
     */
    final public boolean isSysDomainCodeSetted() {
        return this.sysDomainCodeSetted;
    } // end isSysDomainCodeSetted()

    /**
     * Set SysDomainCode Null
     */
    final public void setSysDomainCodeNull() {
        this.sysDomainCodeNull = true;
    } // end setSysDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysDomainCodeNull(boolean aNullFlag) {
        this.sysDomainCodeNull = aNullFlag;
    } // end setSysDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysDomainCodeNull() {
        return this.sysDomainCodeNull;
    } // end isSysDomainCodeNull()

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

        if ((obj instanceof SysRoleRelate) == false) {
            return false;
        } // end if

        SysRoleRelate other = (SysRoleRelate) obj;

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

        buffer.append("relatedSysRoleId=");
        buffer.append(this.relatedSysRoleId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sysRoleGroupId=");
        buffer.append(this.sysRoleGroupId);
        buffer.append("\r\n");

        buffer.append("relatedSysRoleCode=");
        buffer.append(this.relatedSysRoleCode);
        buffer.append("\r\n");

        buffer.append("sysRoleName=");
        buffer.append(this.sysRoleName);
        buffer.append("\r\n");

        buffer.append("sysRoleCode=");
        buffer.append(this.sysRoleCode);
        buffer.append("\r\n");

        buffer.append("sysRoleType=");
        buffer.append(this.sysRoleType);
        buffer.append("\r\n");

        buffer.append("sysRoleDomainId=");
        buffer.append(this.sysRoleDomainId);
        buffer.append("\r\n");

        buffer.append("sysDomainName=");
        buffer.append(this.sysDomainName);
        buffer.append("\r\n");

        buffer.append("sysDomainCode=");
        buffer.append(this.sysDomainCode);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysRoleRelate
