/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-07 10:26:50
 *
 * @model auto gen
 */
public class SystemUserRoleRelate implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysUserRoleRelate objSysUserRoleRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.Id);

        mappedDaoFields.put("expiredDate",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.ExpiredDate);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.Remarks);

        mappedDaoFields.put("roleId",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.RoleId);

        mappedDaoFields.put("roleType",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.RoleType);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.Status);

        mappedDaoFields.put("userId",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.UserId);

        mappedDaoFields.put("roleCode",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.RoleCode);

        mappedDaoFields.put("roleName",
            com.ourteam.system.dao.ISysUserRoleRelateDAO.RoleName);
    } 

    /**
     * Creates a new SystemUserRoleRelate object.
     */
    public SystemUserRoleRelate() {
        super();

        objSysUserRoleRelate = new com.ourteam.system.dao.SysUserRoleRelate();
    } // end SystemUserRoleRelate()

    /**
     * Creates a new SystemUserRoleRelate object.
     *
     * @param aSysUserRoleRelate DOCUMENT ME!
     */
    public SystemUserRoleRelate(
        com.ourteam.system.dao.SysUserRoleRelate aSysUserRoleRelate) {
        super();

        objSysUserRoleRelate = aSysUserRoleRelate;
    } // end SystemUserRoleRelate()

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
    public com.ourteam.system.dao.SysUserRoleRelate convertToSysUserRoleRelate() {
        return objSysUserRoleRelate;
    } // end convertToSysUserRoleRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysUserRoleRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysUserRoleRelate.setId(aId);
    } // end setId()

    /**
     * Get ExpiredDate
     *
     * @return expiredDate
     */
    public java.util.Date getExpiredDate() {
        return objSysUserRoleRelate.getExpiredDate();
    } // end getExpiredDate()

    /**
     * Set ExpiredDate
     *
     * @param aExpiredDate
     */
    public void setExpiredDate(java.util.Date aExpiredDate) {
        this.objSysUserRoleRelate.setExpiredDate(aExpiredDate);
    } // end setExpiredDate()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysUserRoleRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysUserRoleRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get RoleId
     *
     * @return roleId
     */
    public long getRoleId() {
        return objSysUserRoleRelate.getRoleId();
    } // end getRoleId()

    /**
     * Set RoleId
     *
     * @param aRoleId
     */
    public void setRoleId(long aRoleId) {
        this.objSysUserRoleRelate.setRoleId(aRoleId);
    } // end setRoleId()

    /**
     * Get RoleType
     *
     * @return roleType
     */
    public String getRoleType() {
        return objSysUserRoleRelate.getRoleType();
    } // end getRoleType()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysUserRoleRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysUserRoleRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get UserId
     *
     * @return userId
     */
    public long getUserId() {
        return objSysUserRoleRelate.getUserId();
    } // end getUserId()

    /**
     * Set UserId
     *
     * @param aUserId
     */
    public void setUserId(long aUserId) {
        this.objSysUserRoleRelate.setUserId(aUserId);
    } // end setUserId()

    /**
     * Get RoleCode
     *
     * @return roleCode
     */
    public String getRoleCode() {
        return objSysUserRoleRelate.getRoleCode();
    } // end getRoleCode()

    /**
     * Get RoleName
     *
     * @return roleName
     */
    public String getRoleName() {
        return objSysUserRoleRelate.getRoleName();
    } // end getRoleName()

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

        if ((obj instanceof SystemUserRoleRelate) == false) {
            return false;
        } // end if

        SystemUserRoleRelate other = (SystemUserRoleRelate) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysUserRoleRelate tempSysUserRoleRelate = other.convertToSysUserRoleRelate();

        if ((tempSysUserRoleRelate == null) ||
                (this.objSysUserRoleRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysUserRoleRelate == this.objSysUserRoleRelate) ||
                tempSysUserRoleRelate.equals(this.objSysUserRoleRelate)) {
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
     * @param aSysUserRoleRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemUserRoleRelate[] toArray(
        com.ourteam.system.dao.SysUserRoleRelate[] aSysUserRoleRelates) {
        return toArray(aSysUserRoleRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUserRoleRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemUserRoleRelate[] toArray(
        com.ourteam.system.dao.SysUserRoleRelate[] aSysUserRoleRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysUserRoleRelates)) {
            return new SystemUserRoleRelate[0];
        } // end if

        int length = aSysUserRoleRelates.length;

        SystemUserRoleRelate[] beans = new SystemUserRoleRelate[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemUserRoleRelate(aSysUserRoleRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemUserRoleRelate(aSysUserRoleRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aSysUserRoleRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemUserRoleRelate
