/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * Generate Date 2011-11-07 10:18:29
 *
 * @author Auto Gen
 */
public class SysAction implements java.io.Serializable {
    /**
     * Creates a new SysAction object.
     */
    public SysAction() {
        super();
    } // end SysAction()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long moduleId;

    /** Attribute  Be Seted Falg */
    private boolean moduleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean moduleIdNull = false;

    /** Attribute */
    private String actionCode;

    /** Attribute  Be Seted Falg */
    private boolean actionCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean actionCodeNull = false;

    /** Attribute */
    private String actionName;

    /** Attribute  Be Seted Falg */
    private boolean actionNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean actionNameNull = false;

    /** Attribute */
    private long domainId;

    /** Attribute  Be Seted Falg */
    private boolean domainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainIdNull = false;

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
    private String domainCode;

    /** Attribute  Be Seted Falg */
    private boolean domainCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainCodeNull = false;

    /** Attribute */
    private String domainName;

    /** Attribute  Be Seted Falg */
    private boolean domainNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainNameNull = false;

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
     * Get ModuleId
     *
     * @return moduleId
     */
    final public long getModuleId() {
        return moduleId;
    } // end getModuleId()

    /**
     * Set ModuleId
     *
     * @param aModuleId
     */
    final public void setModuleId(long aModuleId) {
        this.moduleId = aModuleId;

        this.moduleIdSetted = true;

        this.setModuleIdNull(false);
    } // end setModuleId()

    /**
     * Get ModuleId Has Been Setted
     *
     * @return moduleId
     */
    final public boolean isModuleIdSetted() {
        return this.moduleIdSetted;
    } // end isModuleIdSetted()

    /**
     * Set ModuleId Null
     */
    final public void setModuleIdNull() {
        this.moduleIdNull = true;
    } // end setModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setModuleIdNull(boolean aNullFlag) {
        this.moduleIdNull = aNullFlag;
    } // end setModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isModuleIdNull() {
        return this.moduleIdNull;
    } // end isModuleIdNull()

    /**
     * Get ActionCode
     *
     * @return actionCode
     */
    final public String getActionCode() {
        return actionCode;
    } // end getActionCode()

    /**
     * Set ActionCode
     *
     * @param aActionCode
     */
    final public void setActionCode(String aActionCode) {
        this.actionCode = aActionCode;

        this.actionCodeSetted = true;

        this.setActionCodeNull(this.actionCode == null);
    } // end setActionCode()

    /**
     * Get ActionCode Has Been Setted
     *
     * @return actionCode
     */
    final public boolean isActionCodeSetted() {
        return this.actionCodeSetted;
    } // end isActionCodeSetted()

    /**
     * Set ActionCode Null
     */
    final public void setActionCodeNull() {
        this.actionCodeNull = true;
    } // end setActionCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setActionCodeNull(boolean aNullFlag) {
        this.actionCodeNull = aNullFlag;
    } // end setActionCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isActionCodeNull() {
        return this.actionCodeNull;
    } // end isActionCodeNull()

    /**
     * Get ActionName
     *
     * @return actionName
     */
    final public String getActionName() {
        return actionName;
    } // end getActionName()

    /**
     * Set ActionName
     *
     * @param aActionName
     */
    final public void setActionName(String aActionName) {
        this.actionName = aActionName;

        this.actionNameSetted = true;

        this.setActionNameNull(this.actionName == null);
    } // end setActionName()

    /**
     * Get ActionName Has Been Setted
     *
     * @return actionName
     */
    final public boolean isActionNameSetted() {
        return this.actionNameSetted;
    } // end isActionNameSetted()

    /**
     * Set ActionName Null
     */
    final public void setActionNameNull() {
        this.actionNameNull = true;
    } // end setActionNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setActionNameNull(boolean aNullFlag) {
        this.actionNameNull = aNullFlag;
    } // end setActionNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isActionNameNull() {
        return this.actionNameNull;
    } // end isActionNameNull()

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
     * Get DomainCode
     *
     * @return domainCode
     */
    final public String getDomainCode() {
        return domainCode;
    } // end getDomainCode()

    /**
     * Set DomainCode
     *
     * @param aDomainCode
     */
    final public void setDomainCode(String aDomainCode) {
        this.domainCode = aDomainCode;

        this.domainCodeSetted = true;

        this.setDomainCodeNull(this.domainCode == null);
    } // end setDomainCode()

    /**
     * Get DomainCode Has Been Setted
     *
     * @return domainCode
     */
    final public boolean isDomainCodeSetted() {
        return this.domainCodeSetted;
    } // end isDomainCodeSetted()

    /**
     * Set DomainCode Null
     */
    final public void setDomainCodeNull() {
        this.domainCodeNull = true;
    } // end setDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainCodeNull(boolean aNullFlag) {
        this.domainCodeNull = aNullFlag;
    } // end setDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainCodeNull() {
        return this.domainCodeNull;
    } // end isDomainCodeNull()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    final public String getDomainName() {
        return domainName;
    } // end getDomainName()

    /**
     * Set DomainName
     *
     * @param aDomainName
     */
    final public void setDomainName(String aDomainName) {
        this.domainName = aDomainName;

        this.domainNameSetted = true;

        this.setDomainNameNull(this.domainName == null);
    } // end setDomainName()

    /**
     * Get DomainName Has Been Setted
     *
     * @return domainName
     */
    final public boolean isDomainNameSetted() {
        return this.domainNameSetted;
    } // end isDomainNameSetted()

    /**
     * Set DomainName Null
     */
    final public void setDomainNameNull() {
        this.domainNameNull = true;
    } // end setDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainNameNull(boolean aNullFlag) {
        this.domainNameNull = aNullFlag;
    } // end setDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainNameNull() {
        return this.domainNameNull;
    } // end isDomainNameNull()

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

        if ((obj instanceof SysAction) == false) {
            return false;
        } // end if

        SysAction other = (SysAction) obj;

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

        buffer.append("moduleId=");
        buffer.append(this.moduleId);
        buffer.append("\r\n");

        buffer.append("actionCode=");
        buffer.append(this.actionCode);
        buffer.append("\r\n");

        buffer.append("actionName=");
        buffer.append(this.actionName);
        buffer.append("\r\n");

        buffer.append("domainId=");
        buffer.append(this.domainId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("domainCode=");
        buffer.append(this.domainCode);
        buffer.append("\r\n");

        buffer.append("domainName=");
        buffer.append(this.domainName);
        buffer.append("\r\n");

        buffer.append("moduleCode=");
        buffer.append(this.moduleCode);
        buffer.append("\r\n");

        buffer.append("moduleName=");
        buffer.append(this.moduleName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysAction
