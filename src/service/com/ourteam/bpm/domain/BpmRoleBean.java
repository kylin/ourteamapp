/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-04 13:15:17
 *
 * @model auto gen
 */
public class BpmRoleBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmRole objBpmRole;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmRoleDAO.Id);

        mappedDaoFields.put("remarks", com.ourteam.bpm.dao.IBpmRoleDAO.Remarks);

        mappedDaoFields.put("roleKey", com.ourteam.bpm.dao.IBpmRoleDAO.RoleKey);

        mappedDaoFields.put("roleName", com.ourteam.bpm.dao.IBpmRoleDAO.RoleName);

        mappedDaoFields.put("status", com.ourteam.bpm.dao.IBpmRoleDAO.Status);

        mappedDaoFields.put("sysModuleId",
            com.ourteam.bpm.dao.IBpmRoleDAO.SysModuleId);

        mappedDaoFields.put("sysModuleCode",
            com.ourteam.bpm.dao.IBpmRoleDAO.SysModuleCode);

        mappedDaoFields.put("sysModuleName",
            com.ourteam.bpm.dao.IBpmRoleDAO.SysModuleName);

        mappedDaoFields.put("bpmDomainId",
            com.ourteam.bpm.dao.IBpmRoleDAO.BpmDomainId);

        mappedDaoFields.put("bpmDomainCode",
            com.ourteam.bpm.dao.IBpmRoleDAO.BpmDomainCode);

        mappedDaoFields.put("bpmDomainName",
            com.ourteam.bpm.dao.IBpmRoleDAO.BpmDomainName);
    } 

    /**
     * Creates a new BpmRoleBean object.
     */
    public BpmRoleBean() {
        super();

        objBpmRole = new com.ourteam.bpm.dao.BpmRole();
    } // end BpmRoleBean()

    /**
     * Creates a new BpmRoleBean object.
     *
     * @param aBpmRole DOCUMENT ME!
     */
    public BpmRoleBean(com.ourteam.bpm.dao.BpmRole aBpmRole) {
        super();

        objBpmRole = aBpmRole;
    } // end BpmRoleBean()

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
    public com.ourteam.bpm.dao.BpmRole convertToBpmRole() {
        return objBpmRole;
    } // end convertToBpmRole()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmRole.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmRole.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmRole.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmRole.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get RoleKey
     *
     * @return roleKey
     */
    public String getRoleKey() {
        return objBpmRole.getRoleKey();
    } // end getRoleKey()

    /**
     * Set RoleKey
     *
     * @param aRoleKey
     */
    public void setRoleKey(String aRoleKey) {
        this.objBpmRole.setRoleKey(aRoleKey);
    } // end setRoleKey()

    /**
     * Get RoleName
     *
     * @return roleName
     */
    public String getRoleName() {
        return objBpmRole.getRoleName();
    } // end getRoleName()

    /**
     * Set RoleName
     *
     * @param aRoleName
     */
    public void setRoleName(String aRoleName) {
        this.objBpmRole.setRoleName(aRoleName);
    } // end setRoleName()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmRole.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmRole.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get SysModuleId
     *
     * @return sysModuleId
     */
    public long getSysModuleId() {
        return objBpmRole.getSysModuleId();
    } // end getSysModuleId()

    /**
     * Set SysModuleId
     *
     * @param aSysModuleId
     */
    public void setSysModuleId(long aSysModuleId) {
        this.objBpmRole.setSysModuleId(aSysModuleId);
    } // end setSysModuleId()

    /**
     * Get SysModuleCode
     *
     * @return sysModuleCode
     */
    public String getSysModuleCode() {
        return objBpmRole.getSysModuleCode();
    } // end getSysModuleCode()

    /**
     * Get SysModuleName
     *
     * @return sysModuleName
     */
    public String getSysModuleName() {
        return objBpmRole.getSysModuleName();
    } // end getSysModuleName()

    /**
     * Get BpmDomainId
     *
     * @return bpmDomainId
     */
    public long getBpmDomainId() {
        return objBpmRole.getBpmDomainId();
    } // end getBpmDomainId()

    /**
     * Set BpmDomainId
     *
     * @param aBpmDomainId
     */
    public void setBpmDomainId(long aBpmDomainId) {
        this.objBpmRole.setBpmDomainId(aBpmDomainId);
    } // end setBpmDomainId()

    /**
     * Get BpmDomainCode
     *
     * @return bpmDomainCode
     */
    public String getBpmDomainCode() {
        return objBpmRole.getBpmDomainCode();
    } // end getBpmDomainCode()

    /**
     * Get BpmDomainName
     *
     * @return bpmDomainName
     */
    public String getBpmDomainName() {
        return objBpmRole.getBpmDomainName();
    } // end getBpmDomainName()

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

        if ((obj instanceof BpmRoleBean) == false) {
            return false;
        } // end if

        BpmRoleBean other = (BpmRoleBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmRole tempBpmRole = other.convertToBpmRole();

        if ((tempBpmRole == null) || (this.objBpmRole == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmRole == this.objBpmRole) ||
                tempBpmRole.equals(this.objBpmRole)) {
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
     * @param aBpmRoles DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmRoleBean[] toArray(com.ourteam.bpm.dao.BpmRole[] aBpmRoles) {
        return toArray(aBpmRoles, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmRoles DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmRoleBean[] toArray(
        com.ourteam.bpm.dao.BpmRole[] aBpmRoles, IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmRoles)) {
            return new BpmRoleBean[0];
        } // end if

        int length = aBpmRoles.length;

        BpmRoleBean[] beans = new BpmRoleBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmRoleBean(aBpmRoles[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmRoleBean(aBpmRoles[i]);

                aCallBack.populate(beans[i], new Object[] { aBpmRoles[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmRoleBean
