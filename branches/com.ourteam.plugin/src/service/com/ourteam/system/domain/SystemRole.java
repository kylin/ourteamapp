/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * ÏµÍ³½ÇÉ« Generate date 2011-09-22 10:21:17
 *
 * @model auto gen
 */
public class SystemRole implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysRole objSysRole;

    static {
        mappedDaoFields.put("id", com.ourteam.system.dao.ISysRoleDAO.Id);

        mappedDaoFields.put("domainId",
            com.ourteam.system.dao.ISysRoleDAO.DomainId);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysRoleDAO.Remarks);

        mappedDaoFields.put("code", com.ourteam.system.dao.ISysRoleDAO.RoleCode);

        mappedDaoFields.put("name", com.ourteam.system.dao.ISysRoleDAO.RoleName);

        mappedDaoFields.put("type", com.ourteam.system.dao.ISysRoleDAO.RoleType);

        mappedDaoFields.put("status", com.ourteam.system.dao.ISysRoleDAO.Status);

        mappedDaoFields.put("domainTitleKey",
            com.ourteam.system.dao.ISysRoleDAO.DomainTitleKey);

        mappedDaoFields.put("domainName",
            com.ourteam.system.dao.ISysRoleDAO.DomainName);

        mappedDaoFields.put("domainCode",
            com.ourteam.system.dao.ISysRoleDAO.DomainCode);
    } 

    /**
     * Creates a new SystemRole object.
     */
    public SystemRole() {
        super();

        objSysRole = new com.ourteam.system.dao.SysRole();
    } // end SystemRole()

    /**
     * Creates a new SystemRole object.
     *
     * @param aSysRole DOCUMENT ME!
     */
    public SystemRole(com.ourteam.system.dao.SysRole aSysRole) {
        super();

        objSysRole = aSysRole;
    } // end SystemRole()

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
    public com.ourteam.system.dao.SysRole convertToSysRole() {
        return objSysRole;
    } // end convertToSysRole()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysRole.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysRole.setId(aId);
    } // end setId()

    /**
     * Get DomainId
     *
     * @return domainId
     */
    public long getDomainId() {
        return objSysRole.getDomainId();
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    public void setDomainId(long aDomainId) {
        this.objSysRole.setDomainId(aDomainId);
    } // end setDomainId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysRole.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysRole.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objSysRole.getRoleCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objSysRole.setRoleCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objSysRole.getRoleName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objSysRole.setRoleName(aName);
    } // end setName()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objSysRole.getRoleType();
    } // end getType()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysRole.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysRole.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get DomainTitleKey
     *
     * @return domainTitleKey
     */
    public String getDomainTitleKey() {
        return objSysRole.getDomainTitleKey();
    } // end getDomainTitleKey()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    public String getDomainName() {
        return objSysRole.getDomainName();
    } // end getDomainName()

    /**
     * Get DomainCode
     *
     * @return domainCode
     */
    public String getDomainCode() {
        return objSysRole.getDomainCode();
    } // end getDomainCode()

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

        if ((obj instanceof SystemRole) == false) {
            return false;
        } // end if

        SystemRole other = (SystemRole) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysRole tempSysRole = other.convertToSysRole();

        if ((tempSysRole == null) || (this.objSysRole == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysRole == this.objSysRole) ||
                tempSysRole.equals(this.objSysRole)) {
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
     * @param aSysRoles DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRole[] toArray(
        com.ourteam.system.dao.SysRole[] aSysRoles) {
        return toArray(aSysRoles, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoles DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRole[] toArray(
        com.ourteam.system.dao.SysRole[] aSysRoles,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysRoles)) {
            return new SystemRole[0];
        } // end if

        int length = aSysRoles.length;

        SystemRole[] beans = new SystemRole[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRole(aSysRoles[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRole(aSysRoles[i]);

                aCallBack.populate(beans[i], new Object[] { aSysRoles[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemRole
