/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-27 09:46:07
 *
 * @model auto gen
 */
public class SystemRoleModuleRelate implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysRoleModuleRelate objSysRoleModuleRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.system.dao.ISysRoleModuleRelateDAO.Id);

        mappedDaoFields.put("moduleId",
            com.ourteam.system.dao.ISysRoleModuleRelateDAO.ModuleId);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysRoleModuleRelateDAO.Remarks);

        mappedDaoFields.put("roleId",
            com.ourteam.system.dao.ISysRoleModuleRelateDAO.RoleId);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysRoleModuleRelateDAO.Status);
    } 

    /**
     * Creates a new SystemRoleModuleRelate object.
     */
    public SystemRoleModuleRelate() {
        super();

        objSysRoleModuleRelate = new com.ourteam.system.dao.SysRoleModuleRelate();
    } // end SystemRoleModuleRelate()

    /**
     * Creates a new SystemRoleModuleRelate object.
     *
     * @param aSysRoleModuleRelate DOCUMENT ME!
     */
    public SystemRoleModuleRelate(
        com.ourteam.system.dao.SysRoleModuleRelate aSysRoleModuleRelate) {
        super();

        objSysRoleModuleRelate = aSysRoleModuleRelate;
    } // end SystemRoleModuleRelate()

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
    public com.ourteam.system.dao.SysRoleModuleRelate convertToSysRoleModuleRelate() {
        return objSysRoleModuleRelate;
    } // end convertToSysRoleModuleRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysRoleModuleRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysRoleModuleRelate.setId(aId);
    } // end setId()

    /**
     * Get ModuleId
     *
     * @return moduleId
     */
    public long getModuleId() {
        return objSysRoleModuleRelate.getModuleId();
    } // end getModuleId()

    /**
     * Set ModuleId
     *
     * @param aModuleId
     */
    public void setModuleId(long aModuleId) {
        this.objSysRoleModuleRelate.setModuleId(aModuleId);
    } // end setModuleId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysRoleModuleRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysRoleModuleRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get RoleId
     *
     * @return roleId
     */
    public long getRoleId() {
        return objSysRoleModuleRelate.getRoleId();
    } // end getRoleId()

    /**
     * Set RoleId
     *
     * @param aRoleId
     */
    public void setRoleId(long aRoleId) {
        this.objSysRoleModuleRelate.setRoleId(aRoleId);
    } // end setRoleId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysRoleModuleRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysRoleModuleRelate.setStatus(aStatus);
    } // end setStatus()

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

        if ((obj instanceof SystemRoleModuleRelate) == false) {
            return false;
        } // end if

        SystemRoleModuleRelate other = (SystemRoleModuleRelate) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysRoleModuleRelate tempSysRoleModuleRelate = other.convertToSysRoleModuleRelate();

        if ((tempSysRoleModuleRelate == null) ||
                (this.objSysRoleModuleRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysRoleModuleRelate == this.objSysRoleModuleRelate) ||
                tempSysRoleModuleRelate.equals(this.objSysRoleModuleRelate)) {
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
     * @param aSysRoleModuleRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleModuleRelate[] toArray(
        com.ourteam.system.dao.SysRoleModuleRelate[] aSysRoleModuleRelates) {
        return toArray(aSysRoleModuleRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleModuleRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleModuleRelate[] toArray(
        com.ourteam.system.dao.SysRoleModuleRelate[] aSysRoleModuleRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysRoleModuleRelates)) {
            return new SystemRoleModuleRelate[0];
        } // end if

        int length = aSysRoleModuleRelates.length;

        SystemRoleModuleRelate[] beans = new SystemRoleModuleRelate[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleModuleRelate(aSysRoleModuleRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleModuleRelate(aSysRoleModuleRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aSysRoleModuleRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemRoleModuleRelate
