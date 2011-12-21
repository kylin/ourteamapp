/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 系统角色与资源关联关系 Generate date 2011-09-22 10:21:18
 *
 * @model auto gen
 */
public class SystemRoleResourceRelate implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysRoleResourceRelate objSysRoleResourceRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.Id);

        mappedDaoFields.put("relateCode",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.RelateCode);

        mappedDaoFields.put("relateName",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.RelateName);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.Status);

        mappedDaoFields.put("sysResourceId",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysResourceId);

        mappedDaoFields.put("sysRoleId",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysRoleId);

        mappedDaoFields.put("sysRoleName",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysRoleName);

        mappedDaoFields.put("sysResourceTitleKey",
            com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysResourceTitleKey);
    } 

    /**
     * Creates a new SystemRoleResourceRelate object.
     */
    public SystemRoleResourceRelate() {
        super();

        objSysRoleResourceRelate = new com.ourteam.system.dao.SysRoleResourceRelate();
    } // end SystemRoleResourceRelate()

    /**
     * Creates a new SystemRoleResourceRelate object.
     *
     * @param aSysRoleResourceRelate DOCUMENT ME!
     */
    public SystemRoleResourceRelate(
        com.ourteam.system.dao.SysRoleResourceRelate aSysRoleResourceRelate) {
        super();

        objSysRoleResourceRelate = aSysRoleResourceRelate;
    } // end SystemRoleResourceRelate()

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
    public com.ourteam.system.dao.SysRoleResourceRelate convertToSysRoleResourceRelate() {
        return objSysRoleResourceRelate;
    } // end convertToSysRoleResourceRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysRoleResourceRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysRoleResourceRelate.setId(aId);
    } // end setId()

    /**
     * Get RelateCode
     *
     * @return relateCode
     */
    public String getRelateCode() {
        return objSysRoleResourceRelate.getRelateCode();
    } // end getRelateCode()

    /**
     * Set RelateCode
     *
     * @param aRelateCode
     */
    public void setRelateCode(String aRelateCode) {
        this.objSysRoleResourceRelate.setRelateCode(aRelateCode);
    } // end setRelateCode()

    /**
     * Get RelateName
     *
     * @return relateName
     */
    public String getRelateName() {
        return objSysRoleResourceRelate.getRelateName();
    } // end getRelateName()

    /**
     * Set RelateName
     *
     * @param aRelateName
     */
    public void setRelateName(String aRelateName) {
        this.objSysRoleResourceRelate.setRelateName(aRelateName);
    } // end setRelateName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysRoleResourceRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysRoleResourceRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysRoleResourceRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysRoleResourceRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get SysResourceId
     *
     * @return sysResourceId
     */
    public long getSysResourceId() {
        return objSysRoleResourceRelate.getSysResourceId();
    } // end getSysResourceId()

    /**
     * Set SysResourceId
     *
     * @param aSysResourceId
     */
    public void setSysResourceId(long aSysResourceId) {
        this.objSysRoleResourceRelate.setSysResourceId(aSysResourceId);
    } // end setSysResourceId()

    /**
     * Get SysRoleId
     *
     * @return sysRoleId
     */
    public long getSysRoleId() {
        return objSysRoleResourceRelate.getSysRoleId();
    } // end getSysRoleId()

    /**
     * Set SysRoleId
     *
     * @param aSysRoleId
     */
    public void setSysRoleId(long aSysRoleId) {
        this.objSysRoleResourceRelate.setSysRoleId(aSysRoleId);
    } // end setSysRoleId()

    /**
     * Get SysRoleName
     *
     * @return sysRoleName
     */
    public String getSysRoleName() {
        return objSysRoleResourceRelate.getSysRoleName();
    } // end getSysRoleName()

    /**
     * Get SysResourceTitleKey
     *
     * @return sysResourceTitleKey
     */
    public String getSysResourceTitleKey() {
        return objSysRoleResourceRelate.getSysResourceTitleKey();
    } // end getSysResourceTitleKey()

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

        if ((obj instanceof SystemRoleResourceRelate) == false) {
            return false;
        } // end if

        SystemRoleResourceRelate other = (SystemRoleResourceRelate) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysRoleResourceRelate tempSysRoleResourceRelate = other.convertToSysRoleResourceRelate();

        if ((tempSysRoleResourceRelate == null) ||
                (this.objSysRoleResourceRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysRoleResourceRelate == this.objSysRoleResourceRelate) ||
                tempSysRoleResourceRelate.equals(this.objSysRoleResourceRelate)) {
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
     * @param aSysRoleResourceRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleResourceRelate[] toArray(
        com.ourteam.system.dao.SysRoleResourceRelate[] aSysRoleResourceRelates) {
        return toArray(aSysRoleResourceRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleResourceRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleResourceRelate[] toArray(
        com.ourteam.system.dao.SysRoleResourceRelate[] aSysRoleResourceRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysRoleResourceRelates)) {
            return new SystemRoleResourceRelate[0];
        } // end if

        int length = aSysRoleResourceRelates.length;

        SystemRoleResourceRelate[] beans = new SystemRoleResourceRelate[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleResourceRelate(aSysRoleResourceRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleResourceRelate(aSysRoleResourceRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aSysRoleResourceRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemRoleResourceRelate
