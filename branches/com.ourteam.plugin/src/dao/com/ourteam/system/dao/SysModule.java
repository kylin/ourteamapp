/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * Generate Date 2011-09-30 13:32:33
 *
 * @author Auto Gen
 */
public class SysModule implements java.io.Serializable {
    /**
     * Creates a new SysModule object.
     */
    public SysModule() {
        super();
    } // end SysModule()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String moduleCode;

    /** Attribute  Be Seted Falg */
    private boolean moduleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean moduleCodeNull = false;

    /** Attribute */
    private String moduleName;

    /** Attribute  Be Seted Falg */
    private boolean moduleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean moduleNameNull = false;

    /** Attribute */
    private long parentModuleId;

    /** Attribute  Be Seted Falg */
    private boolean parentModuleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentModuleIdNull = false;

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
    private long domainId;

    /** Attribute  Be Seted Falg */
    private boolean domainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainIdNull = false;

    /** Attribute */
    private String moduleIcon;

    /** Attribute  Be Seted Falg */
    private boolean moduleIconSetted = false;

    /** Attribute  is Null Falg */
    private boolean moduleIconNull = false;

    /** Attribute */
    private int sortIndex;

    /** Attribute  Be Seted Falg */
    private boolean sortIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortIndexNull = false;

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
     * Get ParentModuleId
     *
     * @return parentModuleId
     */
    final public long getParentModuleId() {
        return parentModuleId;
    } // end getParentModuleId()

    /**
     * Set ParentModuleId
     *
     * @param aParentModuleId
     */
    final public void setParentModuleId(long aParentModuleId) {
        this.parentModuleId = aParentModuleId;

        this.parentModuleIdSetted = true;

        this.setParentModuleIdNull(false);
    } // end setParentModuleId()

    /**
     * Get ParentModuleId Has Been Setted
     *
     * @return parentModuleId
     */
    final public boolean isParentModuleIdSetted() {
        return this.parentModuleIdSetted;
    } // end isParentModuleIdSetted()

    /**
     * Set ParentModuleId Null
     */
    final public void setParentModuleIdNull() {
        this.parentModuleIdNull = true;
    } // end setParentModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentModuleIdNull(boolean aNullFlag) {
        this.parentModuleIdNull = aNullFlag;
    } // end setParentModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentModuleIdNull() {
        return this.parentModuleIdNull;
    } // end isParentModuleIdNull()

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
     * Get DomainId
     *
     * @return domainId
     */
    final public long getDomainId() {
        return domainId;
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    final public void setDomainId(long aDomainId) {
        this.domainId = aDomainId;

        this.domainIdSetted = true;

        this.setDomainIdNull(false);
    } // end setDomainId()

    /**
     * Get DomainId Has Been Setted
     *
     * @return domainId
     */
    final public boolean isDomainIdSetted() {
        return this.domainIdSetted;
    } // end isDomainIdSetted()

    /**
     * Set DomainId Null
     */
    final public void setDomainIdNull() {
        this.domainIdNull = true;
    } // end setDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainIdNull(boolean aNullFlag) {
        this.domainIdNull = aNullFlag;
    } // end setDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainIdNull() {
        return this.domainIdNull;
    } // end isDomainIdNull()

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
     * Get SortIndex
     *
     * @return sortIndex
     */
    final public int getSortIndex() {
        return sortIndex;
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    final public void setSortIndex(int aSortIndex) {
        this.sortIndex = aSortIndex;

        this.sortIndexSetted = true;

        this.setSortIndexNull(false);
    } // end setSortIndex()

    /**
     * Get SortIndex Has Been Setted
     *
     * @return sortIndex
     */
    final public boolean isSortIndexSetted() {
        return this.sortIndexSetted;
    } // end isSortIndexSetted()

    /**
     * Set SortIndex Null
     */
    final public void setSortIndexNull() {
        this.sortIndexNull = true;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortIndexNull(boolean aNullFlag) {
        this.sortIndexNull = aNullFlag;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortIndexNull() {
        return this.sortIndexNull;
    } // end isSortIndexNull()

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

        if ((obj instanceof SysModule) == false) {
            return false;
        } // end if

        SysModule other = (SysModule) obj;

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

        buffer.append("moduleCode=");
        buffer.append(this.moduleCode);
        buffer.append("\r\n");

        buffer.append("moduleName=");
        buffer.append(this.moduleName);
        buffer.append("\r\n");

        buffer.append("parentModuleId=");
        buffer.append(this.parentModuleId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("domainId=");
        buffer.append(this.domainId);
        buffer.append("\r\n");

        buffer.append("moduleIcon=");
        buffer.append(this.moduleIcon);
        buffer.append("\r\n");

        buffer.append("sortIndex=");
        buffer.append(this.sortIndex);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysModule
