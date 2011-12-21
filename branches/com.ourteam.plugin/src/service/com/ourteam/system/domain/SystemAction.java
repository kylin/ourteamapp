/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:21:16
 *
 * @model auto gen
 */
public class SystemAction implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysAction objSysAction;

    static {
        mappedDaoFields.put("id", com.ourteam.system.dao.ISysActionDAO.Id);

        mappedDaoFields.put("moduleId",
            com.ourteam.system.dao.ISysActionDAO.ModuleId);

        mappedDaoFields.put("actionCode",
            com.ourteam.system.dao.ISysActionDAO.ActionCode);

        mappedDaoFields.put("actionName",
            com.ourteam.system.dao.ISysActionDAO.ActionName);

        mappedDaoFields.put("domainId",
            com.ourteam.system.dao.ISysActionDAO.DomainId);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysActionDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysActionDAO.Status);

        mappedDaoFields.put("domainCode",
            com.ourteam.system.dao.ISysActionDAO.DomainCode);

        mappedDaoFields.put("domainName",
            com.ourteam.system.dao.ISysActionDAO.DomainName);

        mappedDaoFields.put("moduleCode",
            com.ourteam.system.dao.ISysActionDAO.ModuleCode);

        mappedDaoFields.put("moduleName",
            com.ourteam.system.dao.ISysActionDAO.ModuleName);
    } 

    /**
     * Creates a new SystemAction object.
     */
    public SystemAction() {
        super();

        objSysAction = new com.ourteam.system.dao.SysAction();
    } // end SystemAction()

    /**
     * Creates a new SystemAction object.
     *
     * @param aSysAction DOCUMENT ME!
     */
    public SystemAction(com.ourteam.system.dao.SysAction aSysAction) {
        super();

        objSysAction = aSysAction;
    } // end SystemAction()

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
    public com.ourteam.system.dao.SysAction convertToSysAction() {
        return objSysAction;
    } // end convertToSysAction()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysAction.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysAction.setId(aId);
    } // end setId()

    /**
     * Get ModuleId
     *
     * @return moduleId
     */
    public long getModuleId() {
        return objSysAction.getModuleId();
    } // end getModuleId()

    /**
     * Set ModuleId
     *
     * @param aModuleId
     */
    public void setModuleId(long aModuleId) {
        this.objSysAction.setModuleId(aModuleId);
    } // end setModuleId()

    /**
     * Get ActionCode
     *
     * @return actionCode
     */
    public String getActionCode() {
        return objSysAction.getActionCode();
    } // end getActionCode()

    /**
     * Set ActionCode
     *
     * @param aActionCode
     */
    public void setActionCode(String aActionCode) {
        this.objSysAction.setActionCode(aActionCode);
    } // end setActionCode()

    /**
     * Get ActionName
     *
     * @return actionName
     */
    public String getActionName() {
        return objSysAction.getActionName();
    } // end getActionName()

    /**
     * Set ActionName
     *
     * @param aActionName
     */
    public void setActionName(String aActionName) {
        this.objSysAction.setActionName(aActionName);
    } // end setActionName()

    /**
     * Get DomainId
     *
     * @return domainId
     */
    public long getDomainId() {
        return objSysAction.getDomainId();
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    public void setDomainId(long aDomainId) {
        this.objSysAction.setDomainId(aDomainId);
    } // end setDomainId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysAction.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysAction.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysAction.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysAction.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get DomainCode
     *
     * @return domainCode
     */
    public String getDomainCode() {
        return objSysAction.getDomainCode();
    } // end getDomainCode()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    public String getDomainName() {
        return objSysAction.getDomainName();
    } // end getDomainName()

    /**
     * Get ModuleCode
     *
     * @return moduleCode
     */
    public String getModuleCode() {
        return objSysAction.getModuleCode();
    } // end getModuleCode()

    /**
     * Get ModuleName
     *
     * @return moduleName
     */
    public String getModuleName() {
        return objSysAction.getModuleName();
    } // end getModuleName()

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

        if ((obj instanceof SystemAction) == false) {
            return false;
        } // end if

        SystemAction other = (SystemAction) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysAction tempSysAction = other.convertToSysAction();

        if ((tempSysAction == null) || (this.objSysAction == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysAction == this.objSysAction) ||
                tempSysAction.equals(this.objSysAction)) {
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
     * @param aSysActions DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemAction[] toArray(
        com.ourteam.system.dao.SysAction[] aSysActions) {
        return toArray(aSysActions, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysActions DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemAction[] toArray(
        com.ourteam.system.dao.SysAction[] aSysActions,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysActions)) {
            return new SystemAction[0];
        } // end if

        int length = aSysActions.length;

        SystemAction[] beans = new SystemAction[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemAction(aSysActions[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemAction(aSysActions[i]);

                aCallBack.populate(beans[i], new Object[] { aSysActions[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemAction
