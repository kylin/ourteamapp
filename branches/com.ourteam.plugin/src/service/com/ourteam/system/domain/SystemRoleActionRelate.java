/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:21:18
 *
 * @model auto gen
 */
public class SystemRoleActionRelate implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysRoleActionRelate objSysRoleActionRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.Id);

        mappedDaoFields.put("actionId",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.ActionId);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.Remarks);

        mappedDaoFields.put("roleId",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.RoleId);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.Status);

        mappedDaoFields.put("actionCode",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.ActionCode);

        mappedDaoFields.put("actionName",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.ActionName);

        mappedDaoFields.put("domainCode",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.DomainCode);

        mappedDaoFields.put("domainName",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.DomainName);

        mappedDaoFields.put("domainId",
            com.ourteam.system.dao.ISysRoleActionRelateDAO.DomainId);
    } 

    /**
     * Creates a new SystemRoleActionRelate object.
     */
    public SystemRoleActionRelate() {
        super();

        objSysRoleActionRelate = new com.ourteam.system.dao.SysRoleActionRelate();
    } // end SystemRoleActionRelate()

    /**
     * Creates a new SystemRoleActionRelate object.
     *
     * @param aSysRoleActionRelate DOCUMENT ME!
     */
    public SystemRoleActionRelate(
        com.ourteam.system.dao.SysRoleActionRelate aSysRoleActionRelate) {
        super();

        objSysRoleActionRelate = aSysRoleActionRelate;
    } // end SystemRoleActionRelate()

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
    public com.ourteam.system.dao.SysRoleActionRelate convertToSysRoleActionRelate() {
        return objSysRoleActionRelate;
    } // end convertToSysRoleActionRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysRoleActionRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysRoleActionRelate.setId(aId);
    } // end setId()

    /**
     * Get ActionId
     *
     * @return actionId
     */
    public long getActionId() {
        return objSysRoleActionRelate.getActionId();
    } // end getActionId()

    /**
     * Set ActionId
     *
     * @param aActionId
     */
    public void setActionId(long aActionId) {
        this.objSysRoleActionRelate.setActionId(aActionId);
    } // end setActionId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysRoleActionRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysRoleActionRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get RoleId
     *
     * @return roleId
     */
    public long getRoleId() {
        return objSysRoleActionRelate.getRoleId();
    } // end getRoleId()

    /**
     * Set RoleId
     *
     * @param aRoleId
     */
    public void setRoleId(long aRoleId) {
        this.objSysRoleActionRelate.setRoleId(aRoleId);
    } // end setRoleId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysRoleActionRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysRoleActionRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ActionCode
     *
     * @return actionCode
     */
    public String getActionCode() {
        return objSysRoleActionRelate.getActionCode();
    } // end getActionCode()

    /**
     * Get ActionName
     *
     * @return actionName
     */
    public String getActionName() {
        return objSysRoleActionRelate.getActionName();
    } // end getActionName()

    /**
     * Get DomainCode
     *
     * @return domainCode
     */
    public String getDomainCode() {
        return objSysRoleActionRelate.getDomainCode();
    } // end getDomainCode()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    public String getDomainName() {
        return objSysRoleActionRelate.getDomainName();
    } // end getDomainName()

    /**
     * Get DomainId
     *
     * @return domainId
     */
    public long getDomainId() {
        return objSysRoleActionRelate.getDomainId();
    } // end getDomainId()

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

        if ((obj instanceof SystemRoleActionRelate) == false) {
            return false;
        } // end if

        SystemRoleActionRelate other = (SystemRoleActionRelate) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysRoleActionRelate tempSysRoleActionRelate = other.convertToSysRoleActionRelate();

        if ((tempSysRoleActionRelate == null) ||
                (this.objSysRoleActionRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysRoleActionRelate == this.objSysRoleActionRelate) ||
                tempSysRoleActionRelate.equals(this.objSysRoleActionRelate)) {
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
     * @param aSysRoleActionRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleActionRelate[] toArray(
        com.ourteam.system.dao.SysRoleActionRelate[] aSysRoleActionRelates) {
        return toArray(aSysRoleActionRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleActionRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleActionRelate[] toArray(
        com.ourteam.system.dao.SysRoleActionRelate[] aSysRoleActionRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysRoleActionRelates)) {
            return new SystemRoleActionRelate[0];
        } // end if

        int length = aSysRoleActionRelates.length;

        SystemRoleActionRelate[] beans = new SystemRoleActionRelate[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleActionRelate(aSysRoleActionRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleActionRelate(aSysRoleActionRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aSysRoleActionRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemRoleActionRelate
