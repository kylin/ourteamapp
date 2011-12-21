/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

/**
 * 中间件对象 Generate Date 2011-12-06 16:03:00
 *
 * @author Auto Gen
 */
public class MiddleWare implements java.io.Serializable {
    /**
     * Creates a new MiddleWare object.
     */
    public MiddleWare() {
        super();
    } // end MiddleWare()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String driveType;

    /** Attribute  Be Seted Falg */
    private boolean driveTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean driveTypeNull = false;

    /** Attribute */
    private String hostName;

    /** Attribute  Be Seted Falg */
    private boolean hostNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean hostNameNull = false;

    /** Attribute */
    private String hostPort;

    /** Attribute  Be Seted Falg */
    private boolean hostPortSetted = false;

    /** Attribute  is Null Falg */
    private boolean hostPortNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String needSSL;

    /** Attribute  Be Seted Falg */
    private boolean needSSLSetted = false;

    /** Attribute  is Null Falg */
    private boolean needSSLNull = false;

    /** Attribute */
    private String password;

    /** Attribute  Be Seted Falg */
    private boolean passwordSetted = false;

    /** Attribute  is Null Falg */
    private boolean passwordNull = false;

    /** Attribute */
    private String serviceName;

    /** Attribute  Be Seted Falg */
    private boolean serviceNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean serviceNameNull = false;

    /** Attribute */
    private String serviceStatus;

    /** Attribute  Be Seted Falg */
    private boolean serviceStatusSetted = false;

    /** Attribute  is Null Falg */
    private boolean serviceStatusNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String type;

    /** Attribute  Be Seted Falg */
    private boolean typeSetted = false;

    /** Attribute  is Null Falg */
    private boolean typeNull = false;

    /** Attribute */
    private String user;

    /** Attribute  Be Seted Falg */
    private boolean userSetted = false;

    /** Attribute  is Null Falg */
    private boolean userNull = false;

    /** Attribute */
    private String provider;

    /** Attribute  Be Seted Falg */
    private boolean providerSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerNull = false;

    /** Attribute */
    private String desc;

    /** Attribute  Be Seted Falg */
    private boolean descSetted = false;

    /** Attribute  is Null Falg */
    private boolean descNull = false;

    /** Attribute */
    private long groupId;

    /** Attribute  Be Seted Falg */
    private boolean groupIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean groupIdNull = false;

    /** Attribute */
    private long providerId;

    /** Attribute  Be Seted Falg */
    private boolean providerIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerIdNull = false;

    /** Attribute */
    private String providerName;

    /** Attribute  Be Seted Falg */
    private boolean providerNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerNameNull = false;

    /** Attribute */
    private String middleWareName;

    /** Attribute  Be Seted Falg */
    private boolean middleWareNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareNameNull = false;

    /** Attribute */
    private String middleWareVersion;

    /** Attribute  Be Seted Falg */
    private boolean middleWareVersionSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareVersionNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get DriveType
     *
     * @return driveType
     */
    final public String getDriveType() {
        return driveType;
    } // end getDriveType()

    /**
     * Set DriveType
     *
     * @param aDriveType
     */
    final public void setDriveType(String aDriveType) {
        this.driveType = aDriveType;

        this.driveTypeSetted = true;

        this.setDriveTypeNull(this.driveType == null);
    } // end setDriveType()

    /**
     * Get DriveType Has Been Setted
     *
     * @return driveType
     */
    final public boolean isDriveTypeSetted() {
        return this.driveTypeSetted;
    } // end isDriveTypeSetted()

    /**
     * Set DriveType Null
     */
    final public void setDriveTypeNull() {
        this.driveTypeNull = true;
    } // end setDriveTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDriveTypeNull(boolean aNullFlag) {
        this.driveTypeNull = aNullFlag;
    } // end setDriveTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDriveTypeNull() {
        return this.driveTypeNull;
    } // end isDriveTypeNull()

    /**
     * Get HostName
     *
     * @return hostName
     */
    final public String getHostName() {
        return hostName;
    } // end getHostName()

    /**
     * Set HostName
     *
     * @param aHostName
     */
    final public void setHostName(String aHostName) {
        this.hostName = aHostName;

        this.hostNameSetted = true;

        this.setHostNameNull(this.hostName == null);
    } // end setHostName()

    /**
     * Get HostName Has Been Setted
     *
     * @return hostName
     */
    final public boolean isHostNameSetted() {
        return this.hostNameSetted;
    } // end isHostNameSetted()

    /**
     * Set HostName Null
     */
    final public void setHostNameNull() {
        this.hostNameNull = true;
    } // end setHostNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setHostNameNull(boolean aNullFlag) {
        this.hostNameNull = aNullFlag;
    } // end setHostNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isHostNameNull() {
        return this.hostNameNull;
    } // end isHostNameNull()

    /**
     * Get HostPort
     *
     * @return hostPort
     */
    final public String getHostPort() {
        return hostPort;
    } // end getHostPort()

    /**
     * Set HostPort
     *
     * @param aHostPort
     */
    final public void setHostPort(String aHostPort) {
        this.hostPort = aHostPort;

        this.hostPortSetted = true;

        this.setHostPortNull(this.hostPort == null);
    } // end setHostPort()

    /**
     * Get HostPort Has Been Setted
     *
     * @return hostPort
     */
    final public boolean isHostPortSetted() {
        return this.hostPortSetted;
    } // end isHostPortSetted()

    /**
     * Set HostPort Null
     */
    final public void setHostPortNull() {
        this.hostPortNull = true;
    } // end setHostPortNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setHostPortNull(boolean aNullFlag) {
        this.hostPortNull = aNullFlag;
    } // end setHostPortNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isHostPortNull() {
        return this.hostPortNull;
    } // end isHostPortNull()

    /**
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

    /**
     * Get NeedSSL
     *
     * @return needSSL
     */
    final public String getNeedSSL() {
        return needSSL;
    } // end getNeedSSL()

    /**
     * Set NeedSSL
     *
     * @param aNeedSSL
     */
    final public void setNeedSSL(String aNeedSSL) {
        this.needSSL = aNeedSSL;

        this.needSSLSetted = true;

        this.setNeedSSLNull(this.needSSL == null);
    } // end setNeedSSL()

    /**
     * Get NeedSSL Has Been Setted
     *
     * @return needSSL
     */
    final public boolean isNeedSSLSetted() {
        return this.needSSLSetted;
    } // end isNeedSSLSetted()

    /**
     * Set NeedSSL Null
     */
    final public void setNeedSSLNull() {
        this.needSSLNull = true;
    } // end setNeedSSLNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNeedSSLNull(boolean aNullFlag) {
        this.needSSLNull = aNullFlag;
    } // end setNeedSSLNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNeedSSLNull() {
        return this.needSSLNull;
    } // end isNeedSSLNull()

    /**
     * Get Password
     *
     * @return password
     */
    final public String getPassword() {
        return password;
    } // end getPassword()

    /**
     * Set Password
     *
     * @param aPassword
     */
    final public void setPassword(String aPassword) {
        this.password = aPassword;

        this.passwordSetted = true;

        this.setPasswordNull(this.password == null);
    } // end setPassword()

    /**
     * Get Password Has Been Setted
     *
     * @return password
     */
    final public boolean isPasswordSetted() {
        return this.passwordSetted;
    } // end isPasswordSetted()

    /**
     * Set Password Null
     */
    final public void setPasswordNull() {
        this.passwordNull = true;
    } // end setPasswordNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPasswordNull(boolean aNullFlag) {
        this.passwordNull = aNullFlag;
    } // end setPasswordNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPasswordNull() {
        return this.passwordNull;
    } // end isPasswordNull()

    /**
     * Get ServiceName
     *
     * @return serviceName
     */
    final public String getServiceName() {
        return serviceName;
    } // end getServiceName()

    /**
     * Set ServiceName
     *
     * @param aServiceName
     */
    final public void setServiceName(String aServiceName) {
        this.serviceName = aServiceName;

        this.serviceNameSetted = true;

        this.setServiceNameNull(this.serviceName == null);
    } // end setServiceName()

    /**
     * Get ServiceName Has Been Setted
     *
     * @return serviceName
     */
    final public boolean isServiceNameSetted() {
        return this.serviceNameSetted;
    } // end isServiceNameSetted()

    /**
     * Set ServiceName Null
     */
    final public void setServiceNameNull() {
        this.serviceNameNull = true;
    } // end setServiceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setServiceNameNull(boolean aNullFlag) {
        this.serviceNameNull = aNullFlag;
    } // end setServiceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isServiceNameNull() {
        return this.serviceNameNull;
    } // end isServiceNameNull()

    /**
     * Get ServiceStatus
     *
     * @return serviceStatus
     */
    final public String getServiceStatus() {
        return serviceStatus;
    } // end getServiceStatus()

    /**
     * Set ServiceStatus
     *
     * @param aServiceStatus
     */
    final public void setServiceStatus(String aServiceStatus) {
        this.serviceStatus = aServiceStatus;

        this.serviceStatusSetted = true;

        this.setServiceStatusNull(this.serviceStatus == null);
    } // end setServiceStatus()

    /**
     * Get ServiceStatus Has Been Setted
     *
     * @return serviceStatus
     */
    final public boolean isServiceStatusSetted() {
        return this.serviceStatusSetted;
    } // end isServiceStatusSetted()

    /**
     * Set ServiceStatus Null
     */
    final public void setServiceStatusNull() {
        this.serviceStatusNull = true;
    } // end setServiceStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setServiceStatusNull(boolean aNullFlag) {
        this.serviceStatusNull = aNullFlag;
    } // end setServiceStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isServiceStatusNull() {
        return this.serviceStatusNull;
    } // end isServiceStatusNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * Get Type
     *
     * @return type
     */
    final public String getType() {
        return type;
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    final public void setType(String aType) {
        this.type = aType;

        this.typeSetted = true;

        this.setTypeNull(this.type == null);
    } // end setType()

    /**
     * Get Type Has Been Setted
     *
     * @return type
     */
    final public boolean isTypeSetted() {
        return this.typeSetted;
    } // end isTypeSetted()

    /**
     * Set Type Null
     */
    final public void setTypeNull() {
        this.typeNull = true;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTypeNull(boolean aNullFlag) {
        this.typeNull = aNullFlag;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTypeNull() {
        return this.typeNull;
    } // end isTypeNull()

    /**
     * Get User
     *
     * @return user
     */
    final public String getUser() {
        return user;
    } // end getUser()

    /**
     * Set User
     *
     * @param aUser
     */
    final public void setUser(String aUser) {
        this.user = aUser;

        this.userSetted = true;

        this.setUserNull(this.user == null);
    } // end setUser()

    /**
     * Get User Has Been Setted
     *
     * @return user
     */
    final public boolean isUserSetted() {
        return this.userSetted;
    } // end isUserSetted()

    /**
     * Set User Null
     */
    final public void setUserNull() {
        this.userNull = true;
    } // end setUserNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUserNull(boolean aNullFlag) {
        this.userNull = aNullFlag;
    } // end setUserNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUserNull() {
        return this.userNull;
    } // end isUserNull()

    /**
     * Get Provider
     *
     * @return provider
     */
    final public String getProvider() {
        return provider;
    } // end getProvider()

    /**
     * Set Provider
     *
     * @param aProvider
     */
    final public void setProvider(String aProvider) {
        this.provider = aProvider;

        this.providerSetted = true;

        this.setProviderNull(this.provider == null);
    } // end setProvider()

    /**
     * Get Provider Has Been Setted
     *
     * @return provider
     */
    final public boolean isProviderSetted() {
        return this.providerSetted;
    } // end isProviderSetted()

    /**
     * Set Provider Null
     */
    final public void setProviderNull() {
        this.providerNull = true;
    } // end setProviderNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderNull(boolean aNullFlag) {
        this.providerNull = aNullFlag;
    } // end setProviderNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderNull() {
        return this.providerNull;
    } // end isProviderNull()

    /**
     * Get Desc
     *
     * @return desc
     */
    final public String getDesc() {
        return desc;
    } // end getDesc()

    /**
     * Set Desc
     *
     * @param aDesc
     */
    final public void setDesc(String aDesc) {
        this.desc = aDesc;

        this.descSetted = true;

        this.setDescNull(this.desc == null);
    } // end setDesc()

    /**
     * Get Desc Has Been Setted
     *
     * @return desc
     */
    final public boolean isDescSetted() {
        return this.descSetted;
    } // end isDescSetted()

    /**
     * Set Desc Null
     */
    final public void setDescNull() {
        this.descNull = true;
    } // end setDescNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDescNull(boolean aNullFlag) {
        this.descNull = aNullFlag;
    } // end setDescNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDescNull() {
        return this.descNull;
    } // end isDescNull()

    /**
     * Get GroupId
     *
     * @return groupId
     */
    final public long getGroupId() {
        return groupId;
    } // end getGroupId()

    /**
     * Set GroupId
     *
     * @param aGroupId
     */
    final public void setGroupId(long aGroupId) {
        this.groupId = aGroupId;

        this.groupIdSetted = true;

        this.setGroupIdNull(false);
    } // end setGroupId()

    /**
     * Get GroupId Has Been Setted
     *
     * @return groupId
     */
    final public boolean isGroupIdSetted() {
        return this.groupIdSetted;
    } // end isGroupIdSetted()

    /**
     * Set GroupId Null
     */
    final public void setGroupIdNull() {
        this.groupIdNull = true;
    } // end setGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setGroupIdNull(boolean aNullFlag) {
        this.groupIdNull = aNullFlag;
    } // end setGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isGroupIdNull() {
        return this.groupIdNull;
    } // end isGroupIdNull()

    /**
     * Get ProviderId
     *
     * @return providerId
     */
    final public long getProviderId() {
        return providerId;
    } // end getProviderId()

    /**
     * Set ProviderId
     *
     * @param aProviderId
     */
    final public void setProviderId(long aProviderId) {
        this.providerId = aProviderId;

        this.providerIdSetted = true;

        this.setProviderIdNull(false);
    } // end setProviderId()

    /**
     * Get ProviderId Has Been Setted
     *
     * @return providerId
     */
    final public boolean isProviderIdSetted() {
        return this.providerIdSetted;
    } // end isProviderIdSetted()

    /**
     * Set ProviderId Null
     */
    final public void setProviderIdNull() {
        this.providerIdNull = true;
    } // end setProviderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderIdNull(boolean aNullFlag) {
        this.providerIdNull = aNullFlag;
    } // end setProviderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderIdNull() {
        return this.providerIdNull;
    } // end isProviderIdNull()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    final public String getProviderName() {
        if (isProviderNameNull()) {
            return null;
        } // end if
        else {
            return providerName;
        } // end else
    } // end getProviderName()

    /**
     * Set ProviderName
     *
     * @param aProviderName
     */
    final public void setProviderName(String aProviderName) {
        this.providerName = aProviderName;

        this.providerNameSetted = true;

        this.setProviderNameNull(this.providerName == null);
    } // end setProviderName()

    /**
     * Get ProviderName Has Been Setted
     *
     * @return providerName
     */
    final public boolean isProviderNameSetted() {
        return this.providerNameSetted;
    } // end isProviderNameSetted()

    /**
     * Set ProviderName Null
     */
    final public void setProviderNameNull() {
        this.providerNameNull = true;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderNameNull(boolean aNullFlag) {
        this.providerNameNull = aNullFlag;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderNameNull() {
        return this.providerNameNull;
    } // end isProviderNameNull()

    /**
     * Get MiddleWareName
     *
     * @return middleWareName
     */
    final public String getMiddleWareName() {
        if (isMiddleWareNameNull()) {
            return null;
        } // end if
        else {
            return middleWareName;
        } // end else
    } // end getMiddleWareName()

    /**
     * Set MiddleWareName
     *
     * @param aMiddleWareName
     */
    final public void setMiddleWareName(String aMiddleWareName) {
        this.middleWareName = aMiddleWareName;

        this.middleWareNameSetted = true;

        this.setMiddleWareNameNull(this.middleWareName == null);
    } // end setMiddleWareName()

    /**
     * Get MiddleWareName Has Been Setted
     *
     * @return middleWareName
     */
    final public boolean isMiddleWareNameSetted() {
        return this.middleWareNameSetted;
    } // end isMiddleWareNameSetted()

    /**
     * Set MiddleWareName Null
     */
    final public void setMiddleWareNameNull() {
        this.middleWareNameNull = true;
    } // end setMiddleWareNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareNameNull(boolean aNullFlag) {
        this.middleWareNameNull = aNullFlag;
    } // end setMiddleWareNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareNameNull() {
        return this.middleWareNameNull;
    } // end isMiddleWareNameNull()

    /**
     * Get MiddleWareVersion
     *
     * @return middleWareVersion
     */
    final public String getMiddleWareVersion() {
        if (isMiddleWareVersionNull()) {
            return null;
        } // end if
        else {
            return middleWareVersion;
        } // end else
    } // end getMiddleWareVersion()

    /**
     * Set MiddleWareVersion
     *
     * @param aMiddleWareVersion
     */
    final public void setMiddleWareVersion(String aMiddleWareVersion) {
        this.middleWareVersion = aMiddleWareVersion;

        this.middleWareVersionSetted = true;

        this.setMiddleWareVersionNull(this.middleWareVersion == null);
    } // end setMiddleWareVersion()

    /**
     * Get MiddleWareVersion Has Been Setted
     *
     * @return middleWareVersion
     */
    final public boolean isMiddleWareVersionSetted() {
        return this.middleWareVersionSetted;
    } // end isMiddleWareVersionSetted()

    /**
     * Set MiddleWareVersion Null
     */
    final public void setMiddleWareVersionNull() {
        this.middleWareVersionNull = true;
    } // end setMiddleWareVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareVersionNull(boolean aNullFlag) {
        this.middleWareVersionNull = aNullFlag;
    } // end setMiddleWareVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareVersionNull() {
        return this.middleWareVersionNull;
    } // end isMiddleWareVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

        return result;
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

        if ((obj instanceof MiddleWare) == false) {
            return false;
        } // end if

        MiddleWare other = (MiddleWare) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("driveType=");
        buffer.append(this.driveType);
        buffer.append("\r\n");

        buffer.append("hostName=");
        buffer.append(this.hostName);
        buffer.append("\r\n");

        buffer.append("hostPort=");
        buffer.append(this.hostPort);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("needSSL=");
        buffer.append(this.needSSL);
        buffer.append("\r\n");

        buffer.append("password=");
        buffer.append(this.password);
        buffer.append("\r\n");

        buffer.append("serviceName=");
        buffer.append(this.serviceName);
        buffer.append("\r\n");

        buffer.append("serviceStatus=");
        buffer.append(this.serviceStatus);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("type=");
        buffer.append(this.type);
        buffer.append("\r\n");

        buffer.append("user=");
        buffer.append(this.user);
        buffer.append("\r\n");

        buffer.append("provider=");
        buffer.append(this.provider);
        buffer.append("\r\n");

        buffer.append("desc=");
        buffer.append(this.desc);
        buffer.append("\r\n");

        buffer.append("groupId=");
        buffer.append(this.groupId);
        buffer.append("\r\n");

        buffer.append("providerId=");
        buffer.append(this.providerId);
        buffer.append("\r\n");

        buffer.append("providerName=");
        buffer.append(this.providerName);
        buffer.append("\r\n");

        buffer.append("middleWareName=");
        buffer.append(this.middleWareName);
        buffer.append("\r\n");

        buffer.append("middleWareVersion=");
        buffer.append(this.middleWareVersion);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MiddleWare
