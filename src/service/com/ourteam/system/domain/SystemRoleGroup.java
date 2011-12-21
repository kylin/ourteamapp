/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * ½ÇÉ«Èº×é Generate date 2011-09-22 10:21:18
 *
 * @model auto gen
 */
public class SystemRoleGroup implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysRoleGroup objSysRoleGroup;

    static {
        mappedDaoFields.put("id", com.ourteam.system.dao.ISysRoleGroupDAO.Id);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysRoleGroupDAO.Remarks);

        mappedDaoFields.put("code",
            com.ourteam.system.dao.ISysRoleGroupDAO.RoleCode);

        mappedDaoFields.put("name",
            com.ourteam.system.dao.ISysRoleGroupDAO.RoleName);

        mappedDaoFields.put("type",
            com.ourteam.system.dao.ISysRoleGroupDAO.RoleType);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysRoleGroupDAO.Status);
    } 

    /**
     * Creates a new SystemRoleGroup object.
     */
    public SystemRoleGroup() {
        super();

        objSysRoleGroup = new com.ourteam.system.dao.SysRoleGroup();
    } // end SystemRoleGroup()

    /**
     * Creates a new SystemRoleGroup object.
     *
     * @param aSysRoleGroup DOCUMENT ME!
     */
    public SystemRoleGroup(com.ourteam.system.dao.SysRoleGroup aSysRoleGroup) {
        super();

        objSysRoleGroup = aSysRoleGroup;
    } // end SystemRoleGroup()

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
    public com.ourteam.system.dao.SysRoleGroup convertToSysRoleGroup() {
        return objSysRoleGroup;
    } // end convertToSysRoleGroup()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysRoleGroup.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysRoleGroup.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysRoleGroup.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysRoleGroup.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objSysRoleGroup.getRoleCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objSysRoleGroup.setRoleCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objSysRoleGroup.getRoleName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objSysRoleGroup.setRoleName(aName);
    } // end setName()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objSysRoleGroup.getRoleType();
    } // end getType()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysRoleGroup.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysRoleGroup.setStatus(aStatus);
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

        if ((obj instanceof SystemRoleGroup) == false) {
            return false;
        } // end if

        SystemRoleGroup other = (SystemRoleGroup) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysRoleGroup tempSysRoleGroup = other.convertToSysRoleGroup();

        if ((tempSysRoleGroup == null) || (this.objSysRoleGroup == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysRoleGroup == this.objSysRoleGroup) ||
                tempSysRoleGroup.equals(this.objSysRoleGroup)) {
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
     * @param aSysRoleGroups DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleGroup[] toArray(
        com.ourteam.system.dao.SysRoleGroup[] aSysRoleGroups) {
        return toArray(aSysRoleGroups, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleGroups DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemRoleGroup[] toArray(
        com.ourteam.system.dao.SysRoleGroup[] aSysRoleGroups,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysRoleGroups)) {
            return new SystemRoleGroup[0];
        } // end if

        int length = aSysRoleGroups.length;

        SystemRoleGroup[] beans = new SystemRoleGroup[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleGroup(aSysRoleGroups[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemRoleGroup(aSysRoleGroups[i]);

                aCallBack.populate(beans[i], new Object[] { aSysRoleGroups[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemRoleGroup
