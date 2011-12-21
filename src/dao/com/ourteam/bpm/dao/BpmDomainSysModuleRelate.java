/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-04 10:00:53
 *
 * @author Auto Gen
 */
public class BpmDomainSysModuleRelate implements java.io.Serializable {
    /**
     * Creates a new BpmDomainSysModuleRelate object.
     */
    public BpmDomainSysModuleRelate() {
        super();
    } // end BpmDomainSysModuleRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long bpmDomainId;

    /** Attribute  Be Seted Falg */
    private boolean bpmDomainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmDomainIdNull = false;

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
    private long sysModuleId;

    /** Attribute  Be Seted Falg */
    private boolean sysModuleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysModuleIdNull = false;

    /** Attribute */
    private String moduleName;

    /** Attribute  Be Seted Falg */
    private boolean moduleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean moduleNameNull = false;

    /** Attribute */
    private String moduleCode;

    /** Attribute  Be Seted Falg */
    private boolean moduleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean moduleCodeNull = false;

    /** Attribute */
    private String moduleIcon;

    /** Attribute  Be Seted Falg */
    private boolean moduleIconSetted = false;

    /** Attribute  is Null Falg */
    private boolean moduleIconNull = false;

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
     * Get ModuleName
     *
     * @return moduleName
     */
    final public String getModuleName() {
        return moduleName;
    } // end getModuleName()

    /**
     * Set ModuleName
     *
     * @param aModuleName
     */
    final public void setModuleName(String aModuleName) {
        this.moduleName = aModuleName;

        this.moduleNameSetted = true;

        this.setModuleNameNull(this.moduleName == null);
    } // end setModuleName()

    /**
     * Get ModuleName Has Been Setted
     *
     * @return moduleName
     */
    final public boolean isModuleNameSetted() {
        return this.moduleNameSetted;
    } // end isModuleNameSetted()

    /**
     * Set ModuleName Null
     */
    final public void setModuleNameNull() {
        this.moduleNameNull = true;
    } // end setModuleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setModuleNameNull(boolean aNullFlag) {
        this.moduleNameNull = aNullFlag;
    } // end setModuleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isModuleNameNull() {
        return this.moduleNameNull;
    } // end isModuleNameNull()

    /**
     * Get ModuleCode
     *
     * @return moduleCode
     */
    final public String getModuleCode() {
        return moduleCode;
    } // end getModuleCode()

    /**
     * Set ModuleCode
     *
     * @param aModuleCode
     */
    final public void setModuleCode(String aModuleCode) {
        this.moduleCode = aModuleCode;

        this.moduleCodeSetted = true;

        this.setModuleCodeNull(this.moduleCode == null);
    } // end setModuleCode()

    /**
     * Get ModuleCode Has Been Setted
     *
     * @return moduleCode
     */
    final public boolean isModuleCodeSetted() {
        return this.moduleCodeSetted;
    } // end isModuleCodeSetted()

    /**
     * Set ModuleCode Null
     */
    final public void setModuleCodeNull() {
        this.moduleCodeNull = true;
    } // end setModuleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setModuleCodeNull(boolean aNullFlag) {
        this.moduleCodeNull = aNullFlag;
    } // end setModuleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isModuleCodeNull() {
        return this.moduleCodeNull;
    } // end isModuleCodeNull()

    /**
     * Get ModuleIcon
     *
     * @return moduleIcon
     */
    final public String getModuleIcon() {
        return moduleIcon;
    } // end getModuleIcon()

    /**
     * Set ModuleIcon
     *
     * @param aModuleIcon
     */
    final public void setModuleIcon(String aModuleIcon) {
        this.moduleIcon = aModuleIcon;

        this.moduleIconSetted = true;

        this.setModuleIconNull(this.moduleIcon == null);
    } // end setModuleIcon()

    /**
     * Get ModuleIcon Has Been Setted
     *
     * @return moduleIcon
     */
    final public boolean isModuleIconSetted() {
        return this.moduleIconSetted;
    } // end isModuleIconSetted()

    /**
     * Set ModuleIcon Null
     */
    final public void setModuleIconNull() {
        this.moduleIconNull = true;
    } // end setModuleIconNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setModuleIconNull(boolean aNullFlag) {
        this.moduleIconNull = aNullFlag;
    } // end setModuleIconNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isModuleIconNull() {
        return this.moduleIconNull;
    } // end isModuleIconNull()

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

        if ((obj instanceof BpmDomainSysModuleRelate) == false) {
            return false;
        } // end if

        BpmDomainSysModuleRelate other = (BpmDomainSysModuleRelate) obj;

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

        buffer.append("bpmDomainId=");
        buffer.append(this.bpmDomainId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sysModuleId=");
        buffer.append(this.sysModuleId);
        buffer.append("\r\n");

        buffer.append("moduleName=");
        buffer.append(this.moduleName);
        buffer.append("\r\n");

        buffer.append("moduleCode=");
        buffer.append(this.moduleCode);
        buffer.append("\r\n");

        buffer.append("moduleIcon=");
        buffer.append(this.moduleIcon);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmDomainSysModuleRelate
