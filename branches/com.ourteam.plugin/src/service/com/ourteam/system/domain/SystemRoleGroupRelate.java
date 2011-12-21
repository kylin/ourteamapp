/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 角色组角色关联关系 Generate date 2011-09-22 10:21:18
 *
 * @model auto gen
 */
public class SystemRoleGroupRelate implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysRoleRelate objSysRoleRelate;

    static {
        mappedDaoFields.put("id", com.ourteam.system.dao.ISysRoleRelateDAO.Id);

        mappedDaoFields.put("relatedSysRoleId",
            com.ourteam.system.dao.ISysRoleRelateDAO.RelatedSysRoleId);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysRoleRelateDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysRoleRelateDAO.Status);

        mappedDaoFields.put("sysRoleGroupId",
            com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleGroupId);

        mappedDaoFields.put("relatedSysRoleCode",
            com.ourteam.system.dao.ISysRoleRelateDAO.RelatedSysRoleCode);

        mappedDaoFields.put("sysRoleName",
            com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleName);

        mappedDaoFields.put("sysRoleCode",
            com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleCode);

        mappedDaoFields.put("sysRoleType",
            com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleType);

        mappedDaoFields.put("sysDomainName",
            com.ourteam.system.dao.ISysRoleRelateDAO.SysDomainName);

        mappedDaoFields.put("sysDomainCode",
            com.ourteam.system.dao.ISysRoleRelateDAO.SysDomainCode);
    } 

    /**
     * Creates a new SystemRoleGroupRelate object.
     */
    public SystemRoleGroupRelate() {
        super();

        objSysRoleRelate = new com.ourteam.system.dao.SysRoleRelate();
    } // end SystemRoleGroupRelate()

    /**
     * Creates a new SystemRoleGroupRelate object.
     *
     * @param aSysRoleRelate DOCUMENT ME!
     */
    public SystemRoleGroupRelate(
        com.ourteam.system.dao.SysRoleRelate aSysRoleRelate) {
        super();

        objSysRoleRelate = aSysRoleRelate;
    } // end SystemRoleGroupRelate()

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
    public com.ourteam.system.dao.SysRoleRelate convertToSysRoleRelate() {
        return objSysRoleRelate;
    } // end convertToSysRoleRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysRoleRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysRoleRelate.setId(aId);
    } // end setId()

    /**
     * Get RelatedSysRoleId
     *
     * @return relatedSysRoleId
     */
    public long getRelatedSysRoleId() {
        return objSysRoleRelate.getRelatedSysRoleId();
    } // end getRelatedSysRoleId()

    /**
     * Set RelatedSysRoleId
     *
     * @param aRelatedSysRoleId
     */
    public void setRelatedSysRoleId(long aRelatedSysRoleId) {
        this.objSysRoleRelate.setRelatedSysRoleId(aRelatedSysRoleId);
    } // end setRelatedSysRoleId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysRoleRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysRoleRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysRoleRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysRoleRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get SysRoleGroupId
     *
     * @return sysRoleGroupId
     */
    public long getSysRoleGroupId() {
        return objSysRoleRelate.getSysRoleGroupId();
    } // end getSysRoleGroupId()

    /**
     * Set SysRoleGroupId
     *
     * @param aSysRoleGroupId
     */
    public void setSysRoleGroupId(long aSysRoleGroupId) {
        this.objSysRoleRelate.setSysRoleGroupId(aSysRoleGroupId);
    } // end setSysRoleGroupId()

    /**
     * Get RelatedSysRoleCode
     *
     * @return relatedSysRoleCode
     */
    public String getRelatedSysRoleCode() {
        return objSysRoleRelate.getRelatedSysRoleCode();
    } // end getRelatedSysRoleCode()

    /**
     * Set RelatedSysRoleCode
     *
     * @param aRelatedSysRoleCode
     */
    public void setRelatedSysRoleCode(String aRelatedSysRoleCode) {
        this.objSysRoleRelate.setRelatedSysRoleCode(aRelatedSysRoleCode);
    } // end setRelatedSysRoleCode()

    /**
     * Get SysRoleName
     *
     * @return sysRoleName
     */
    public String getSysRoleName() {
        return objSysRoleRelate.getSysRoleName();
    } // end getSysRoleName()

    /**
     * Get SysRoleCode
     *
     * @return sysRoleCode
     */
    public String getSysRoleCode() {
        return objSysRoleRelate.getSysRoleCode();
    } // end getSysRoleCode()

    /**
     * Get SysRoleType
     *
     * @return sysRoleType
     */
    public String getSysRoleType() {
        return objSysRoleRelate.getSysRoleType();
    } // end getSysRoleType()

    /**
     * Get SysDomainName
     *
     * @return sysDomainName
     */
    public String getSysDomainName() {
        return objSysRoleRelate.getSysDomainName();
    } // end getSysDomainName()

    /**
     * Get SysDomainCode
     *
     * @return sysDomainCode
     */
    public String getSysDomainCode() {
        return objSysRoleRelate.getSysDomainCode();
    } // end getSysDomainCode()

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

        if ((obj instanceof SystemRoleGroupRelate) == false) {
            return false;
        } // end if

        SystemRoleGroupRelate other = (SystemRoleGroupRelate) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysRoleRelate tempSysRoleRelate = other.convertToSysRoleRelate();

        if ((tempSysRoleRelate == null) || (this.objSysRoleRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysRoleRelate == this.objSysRoleRelate) ||
                tempSysRoleRelate.equals(this.objSysRoleRelate)) {
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
     * @param aSysRoleRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleGroupRelate[] toArray(
        com.ourteam.system.dao.SysRoleRelate[] aSysRoleRelates) {
        return toArray(aSysRoleRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleGroupRelate[] toArray(
        com.ourteam.system.dao.SysRoleRelate[] aSysRoleRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysRoleRelates)) {
            return new SystemRoleGroupRelate[0];
        } // end if

        int length = aSysRoleRelates.length;

        SystemRoleGroupRelate[] beans = new SystemRoleGroupRelate[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleGroupRelate(aSysRoleRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleGroupRelate(aSysRoleRelates[i]);

                aCallBack.populate(beans[i], new Object[] { aSysRoleRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemRoleGroupRelate
