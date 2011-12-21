/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-06 16:06:24
 *
 * @model auto gen
 */
public class MiddleWareBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWare objMiddleWare;

    static {
        mappedDaoFields.put("id", com.ourteam.middleware.dao.IMiddleWareDAO.Id);

        mappedDaoFields.put("driveType",
            com.ourteam.middleware.dao.IMiddleWareDAO.DriveType);

        mappedDaoFields.put("hostName",
            com.ourteam.middleware.dao.IMiddleWareDAO.HostName);

        mappedDaoFields.put("hostPort",
            com.ourteam.middleware.dao.IMiddleWareDAO.HostPort);

        mappedDaoFields.put("name",
            com.ourteam.middleware.dao.IMiddleWareDAO.Name);

        mappedDaoFields.put("needSSL",
            com.ourteam.middleware.dao.IMiddleWareDAO.NeedSSL);

        mappedDaoFields.put("password",
            com.ourteam.middleware.dao.IMiddleWareDAO.Password);

        mappedDaoFields.put("serviceName",
            com.ourteam.middleware.dao.IMiddleWareDAO.ServiceName);

        mappedDaoFields.put("serviceStatus",
            com.ourteam.middleware.dao.IMiddleWareDAO.ServiceStatus);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareDAO.Status);

        mappedDaoFields.put("type",
            com.ourteam.middleware.dao.IMiddleWareDAO.Type);

        mappedDaoFields.put("user",
            com.ourteam.middleware.dao.IMiddleWareDAO.User);

        mappedDaoFields.put("provider",
            com.ourteam.middleware.dao.IMiddleWareDAO.Provider);

        mappedDaoFields.put("desc",
            com.ourteam.middleware.dao.IMiddleWareDAO.Desc);

        mappedDaoFields.put("groupId",
            com.ourteam.middleware.dao.IMiddleWareDAO.GroupId);

        mappedDaoFields.put("providerName",
            com.ourteam.middleware.dao.IMiddleWareDAO.ProviderName);

        mappedDaoFields.put("middleWareName",
            com.ourteam.middleware.dao.IMiddleWareDAO.MiddleWareName);

        mappedDaoFields.put("middleWareVersion",
            com.ourteam.middleware.dao.IMiddleWareDAO.MiddleWareVersion);

        mappedDaoFields.put("providerId",
            com.ourteam.middleware.dao.IMiddleWareDAO.ProviderId);
    } 

    /**
     * Creates a new MiddleWareBean object.
     */
    public MiddleWareBean() {
        super();

        objMiddleWare = new com.ourteam.middleware.dao.MiddleWare();
    } // end MiddleWareBean()

    /**
     * Creates a new MiddleWareBean object.
     *
     * @param aMiddleWare DOCUMENT ME!
     */
    public MiddleWareBean(com.ourteam.middleware.dao.MiddleWare aMiddleWare) {
        super();

        objMiddleWare = aMiddleWare;
    } // end MiddleWareBean()

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
    public com.ourteam.middleware.dao.MiddleWare convertToMiddleWare() {
        return objMiddleWare;
    } // end convertToMiddleWare()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWare.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWare.setId(aId);
    } // end setId()

    /**
     * Get DriveType
     *
     * @return driveType
     */
    public String getDriveType() {
        return objMiddleWare.getDriveType();
    } // end getDriveType()

    /**
     * Set DriveType
     *
     * @param aDriveType
     */
    public void setDriveType(String aDriveType) {
        this.objMiddleWare.setDriveType(aDriveType);
    } // end setDriveType()

    /**
     * Get HostName
     *
     * @return hostName
     */
    public String getHostName() {
        return objMiddleWare.getHostName();
    } // end getHostName()

    /**
     * Set HostName
     *
     * @param aHostName
     */
    public void setHostName(String aHostName) {
        this.objMiddleWare.setHostName(aHostName);
    } // end setHostName()

    /**
     * Get HostPort
     *
     * @return hostPort
     */
    public String getHostPort() {
        return objMiddleWare.getHostPort();
    } // end getHostPort()

    /**
     * Set HostPort
     *
     * @param aHostPort
     */
    public void setHostPort(String aHostPort) {
        this.objMiddleWare.setHostPort(aHostPort);
    } // end setHostPort()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objMiddleWare.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objMiddleWare.setName(aName);
    } // end setName()

    /**
     * Get NeedSSL
     *
     * @return needSSL
     */
    public String getNeedSSL() {
        return objMiddleWare.getNeedSSL();
    } // end getNeedSSL()

    /**
     * Set NeedSSL
     *
     * @param aNeedSSL
     */
    public void setNeedSSL(String aNeedSSL) {
        this.objMiddleWare.setNeedSSL(aNeedSSL);
    } // end setNeedSSL()

    /**
     * Get Password
     *
     * @return password
     */
    public String getPassword() {
        return objMiddleWare.getPassword();
    } // end getPassword()

    /**
     * Set Password
     *
     * @param aPassword
     */
    public void setPassword(String aPassword) {
        this.objMiddleWare.setPassword(aPassword);
    } // end setPassword()

    /**
     * Get ServiceName
     *
     * @return serviceName
     */
    public String getServiceName() {
        return objMiddleWare.getServiceName();
    } // end getServiceName()

    /**
     * Set ServiceName
     *
     * @param aServiceName
     */
    public void setServiceName(String aServiceName) {
        this.objMiddleWare.setServiceName(aServiceName);
    } // end setServiceName()

    /**
     * Get ServiceStatus
     *
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return objMiddleWare.getServiceStatus();
    } // end getServiceStatus()

    /**
     * Set ServiceStatus
     *
     * @param aServiceStatus
     */
    public void setServiceStatus(String aServiceStatus) {
        this.objMiddleWare.setServiceStatus(aServiceStatus);
    } // end setServiceStatus()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWare.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWare.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objMiddleWare.getType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objMiddleWare.setType(aType);
    } // end setType()

    /**
     * Get User
     *
     * @return user
     */
    public String getUser() {
        return objMiddleWare.getUser();
    } // end getUser()

    /**
     * Set User
     *
     * @param aUser
     */
    public void setUser(String aUser) {
        this.objMiddleWare.setUser(aUser);
    } // end setUser()

    /**
     * Get Provider
     *
     * @return provider
     */
    public String getProvider() {
        return objMiddleWare.getProvider();
    } // end getProvider()

    /**
     * Set Provider
     *
     * @param aProvider
     */
    public void setProvider(String aProvider) {
        this.objMiddleWare.setProvider(aProvider);
    } // end setProvider()

    /**
     * Get Desc
     *
     * @return desc
     */
    public String getDesc() {
        return objMiddleWare.getDesc();
    } // end getDesc()

    /**
     * Set Desc
     *
     * @param aDesc
     */
    public void setDesc(String aDesc) {
        this.objMiddleWare.setDesc(aDesc);
    } // end setDesc()

    /**
     * Get GroupId
     *
     * @return groupId
     */
    public long getGroupId() {
        return objMiddleWare.getGroupId();
    } // end getGroupId()

    /**
     * Set GroupId
     *
     * @param aGroupId
     */
    public void setGroupId(long aGroupId) {
        this.objMiddleWare.setGroupId(aGroupId);
    } // end setGroupId()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    public String getProviderName() {
        return objMiddleWare.getProviderName();
    } // end getProviderName()

    /**
     * Get MiddleWareName
     *
     * @return middleWareName
     */
    public String getMiddleWareName() {
        return objMiddleWare.getMiddleWareName();
    } // end getMiddleWareName()

    /**
     * Get MiddleWareVersion
     *
     * @return middleWareVersion
     */
    public String getMiddleWareVersion() {
        return objMiddleWare.getMiddleWareVersion();
    } // end getMiddleWareVersion()

    /**
     * Get ProviderId
     *
     * @return providerId
     */
    public long getProviderId() {
        return objMiddleWare.getProviderId();
    } // end getProviderId()

    /**
     * Set ProviderId
     *
     * @param aProviderId
     */
    public void setProviderId(long aProviderId) {
        this.objMiddleWare.setProviderId(aProviderId);
    } // end setProviderId()

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

        if ((obj instanceof MiddleWareBean) == false) {
            return false;
        } // end if

        MiddleWareBean other = (MiddleWareBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWare tempMiddleWare = other.convertToMiddleWare();

        if ((tempMiddleWare == null) || (this.objMiddleWare == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWare == this.objMiddleWare) ||
                tempMiddleWare.equals(this.objMiddleWare)) {
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
     * @param aMiddleWares DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareBean[] toArray(
        com.ourteam.middleware.dao.MiddleWare[] aMiddleWares) {
        return toArray(aMiddleWares, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWares DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareBean[] toArray(
        com.ourteam.middleware.dao.MiddleWare[] aMiddleWares,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMiddleWares)) {
            return new MiddleWareBean[0];
        } // end if

        int length = aMiddleWares.length;

        MiddleWareBean[] beans = new MiddleWareBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareBean(aMiddleWares[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareBean(aMiddleWares[i]);

                aCallBack.populate(beans[i], new Object[] { aMiddleWares[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareBean
