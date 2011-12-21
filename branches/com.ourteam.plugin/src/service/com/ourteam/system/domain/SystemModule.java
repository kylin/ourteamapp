/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-30 13:35:29
 *
 * @model auto gen
 */
public class SystemModule implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysModule objSysModule;

    static {
        mappedDaoFields.put("id", com.ourteam.system.dao.ISysModuleDAO.Id);

        mappedDaoFields.put("moduleCode",
            com.ourteam.system.dao.ISysModuleDAO.ModuleCode);

        mappedDaoFields.put("moduleName",
            com.ourteam.system.dao.ISysModuleDAO.ModuleName);

        mappedDaoFields.put("parentModuleId",
            com.ourteam.system.dao.ISysModuleDAO.ParentModuleId);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysModuleDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysModuleDAO.Status);

        mappedDaoFields.put("domainId",
            com.ourteam.system.dao.ISysModuleDAO.DomainId);

        mappedDaoFields.put("moduleIcon",
            com.ourteam.system.dao.ISysModuleDAO.ModuleIcon);

        mappedDaoFields.put("sortIndex",
            com.ourteam.system.dao.ISysModuleDAO.SortIndex);
    } 

    /**
     * Creates a new SystemModule object.
     */
    public SystemModule() {
        super();

        objSysModule = new com.ourteam.system.dao.SysModule();
    } // end SystemModule()

    /**
     * Creates a new SystemModule object.
     *
     * @param aSysModule DOCUMENT ME!
     */
    public SystemModule(com.ourteam.system.dao.SysModule aSysModule) {
        super();

        objSysModule = aSysModule;
    } // end SystemModule()

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
    public com.ourteam.system.dao.SysModule convertToSysModule() {
        return objSysModule;
    } // end convertToSysModule()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysModule.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysModule.setId(aId);
    } // end setId()

    /**
     * Get ModuleCode
     *
     * @return moduleCode
     */
    public String getModuleCode() {
        return objSysModule.getModuleCode();
    } // end getModuleCode()

    /**
     * Set ModuleCode
     *
     * @param aModuleCode
     */
    public void setModuleCode(String aModuleCode) {
        this.objSysModule.setModuleCode(aModuleCode);
    } // end setModuleCode()

    /**
     * Get ModuleName
     *
     * @return moduleName
     */
    public String getModuleName() {
        return objSysModule.getModuleName();
    } // end getModuleName()

    /**
     * Set ModuleName
     *
     * @param aModuleName
     */
    public void setModuleName(String aModuleName) {
        this.objSysModule.setModuleName(aModuleName);
    } // end setModuleName()

    /**
     * Get ParentModuleId
     *
     * @return parentModuleId
     */
    public long getParentModuleId() {
        return objSysModule.getParentModuleId();
    } // end getParentModuleId()

    /**
     * Set ParentModuleId
     *
     * @param aParentModuleId
     */
    public void setParentModuleId(long aParentModuleId) {
        this.objSysModule.setParentModuleId(aParentModuleId);
    } // end setParentModuleId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysModule.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysModule.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysModule.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysModule.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get DomainId
     *
     * @return domainId
     */
    public long getDomainId() {
        return objSysModule.getDomainId();
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    public void setDomainId(long aDomainId) {
        this.objSysModule.setDomainId(aDomainId);
    } // end setDomainId()

    /**
     * Get ModuleIcon
     *
     * @return moduleIcon
     */
    public String getModuleIcon() {
        return objSysModule.getModuleIcon();
    } // end getModuleIcon()

    /**
     * Set ModuleIcon
     *
     * @param aModuleIcon
     */
    public void setModuleIcon(String aModuleIcon) {
        this.objSysModule.setModuleIcon(aModuleIcon);
    } // end setModuleIcon()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public int getSortIndex() {
        return objSysModule.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(int aSortIndex) {
        this.objSysModule.setSortIndex(aSortIndex);
    } // end setSortIndex()

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

        if ((obj instanceof SystemModule) == false) {
            return false;
        } // end if

        SystemModule other = (SystemModule) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysModule tempSysModule = other.convertToSysModule();

        if ((tempSysModule == null) || (this.objSysModule == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysModule == this.objSysModule) ||
                tempSysModule.equals(this.objSysModule)) {
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
     * @param aSysModules DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemModule[] toArray(
        com.ourteam.system.dao.SysModule[] aSysModules) {
        return toArray(aSysModules, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysModules DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemModule[] toArray(
        com.ourteam.system.dao.SysModule[] aSysModules,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysModules)) {
            return new SystemModule[0];
        } // end if

        int length = aSysModules.length;

        SystemModule[] beans = new SystemModule[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemModule(aSysModules[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemModule(aSysModules[i]);

                aCallBack.populate(beans[i], new Object[] { aSysModules[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemModule
