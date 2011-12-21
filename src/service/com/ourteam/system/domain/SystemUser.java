/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 系统用户 Generate date 2011-11-07 09:32:28
 *
 * @model auto gen
 */
public class SystemUser implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysUser objSysUser;

    static {
        mappedDaoFields.put("id", com.ourteam.system.dao.ISysUserDAO.Id);

        mappedDaoFields.put("name", com.ourteam.system.dao.ISysUserDAO.UserName);

        mappedDaoFields.put("account",
            com.ourteam.system.dao.ISysUserDAO.UserAccount);

        mappedDaoFields.put("type", com.ourteam.system.dao.ISysUserDAO.UserType);

        mappedDaoFields.put("status", com.ourteam.system.dao.ISysUserDAO.Status);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysUserDAO.Remarks);

        mappedDaoFields.put("password",
            com.ourteam.system.dao.ISysUserDAO.Password);
    } 

    /**
     * Creates a new SystemUser object.
     */
    public SystemUser() {
        super();

        objSysUser = new com.ourteam.system.dao.SysUser();
    } // end SystemUser()

    /**
     * Creates a new SystemUser object.
     *
     * @param aSysUser DOCUMENT ME!
     */
    public SystemUser(com.ourteam.system.dao.SysUser aSysUser) {
        super();

        objSysUser = aSysUser;
    } // end SystemUser()

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
    public com.ourteam.system.dao.SysUser convertToSysUser() {
        return objSysUser;
    } // end convertToSysUser()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysUser.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysUser.setId(aId);
    } // end setId()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objSysUser.getUserName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objSysUser.setUserName(aName);
    } // end setName()

    /**
     * Get Account
     *
     * @return account
     */
    public String getAccount() {
        return objSysUser.getUserAccount();
    } // end getAccount()

    /**
     * Set Account
     *
     * @param aAccount
     */
    public void setAccount(String aAccount) {
        this.objSysUser.setUserAccount(aAccount);
    } // end setAccount()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objSysUser.getUserType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objSysUser.setUserType(aType);
    } // end setType()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysUser.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysUser.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Remarks 备注说明
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysUser.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks 备注说明
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysUser.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Password
     *
     * @return password
     */
    public String getPassword() {
        return objSysUser.getPassword();
    } // end getPassword()

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

        if ((obj instanceof SystemUser) == false) {
            return false;
        } // end if

        SystemUser other = (SystemUser) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysUser tempSysUser = other.convertToSysUser();

        if ((tempSysUser == null) || (this.objSysUser == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysUser == this.objSysUser) ||
                tempSysUser.equals(this.objSysUser)) {
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
     * @param aSysUsers DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemUser[] toArray(
        com.ourteam.system.dao.SysUser[] aSysUsers) {
        return toArray(aSysUsers, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUsers DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemUser[] toArray(
        com.ourteam.system.dao.SysUser[] aSysUsers,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysUsers)) {
            return new SystemUser[0];
        } // end if

        int length = aSysUsers.length;

        SystemUser[] beans = new SystemUser[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemUser(aSysUsers[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemUser(aSysUsers[i]);

                aCallBack.populate(beans[i], new Object[] { aSysUsers[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemUser
