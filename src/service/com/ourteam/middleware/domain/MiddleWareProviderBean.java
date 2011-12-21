/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-06 11:45:51
 *
 * @model auto gen
 */
public class MiddleWareProviderBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWareProvider objMiddleWareProvider;

    static {
        mappedDaoFields.put("id",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.Id);

        mappedDaoFields.put("driverType",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.DriverType);

        mappedDaoFields.put("middleWareName",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.MiddleWareName);

        mappedDaoFields.put("middleWareType",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.MiddleWareType);

        mappedDaoFields.put("middleWareVersion",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.MiddleWareVersion);

        mappedDaoFields.put("providerName",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.ProviderName);

        mappedDaoFields.put("remarks",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareProviderDAO.Status);
    } 

    /**
     * Creates a new MiddleWareProviderBean object.
     */
    public MiddleWareProviderBean() {
        super();

        objMiddleWareProvider = new com.ourteam.middleware.dao.MiddleWareProvider();
    } // end MiddleWareProviderBean()

    /**
     * Creates a new MiddleWareProviderBean object.
     *
     * @param aMiddleWareProvider DOCUMENT ME!
     */
    public MiddleWareProviderBean(
        com.ourteam.middleware.dao.MiddleWareProvider aMiddleWareProvider) {
        super();

        objMiddleWareProvider = aMiddleWareProvider;
    } // end MiddleWareProviderBean()

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
    public com.ourteam.middleware.dao.MiddleWareProvider convertToMiddleWareProvider() {
        return objMiddleWareProvider;
    } // end convertToMiddleWareProvider()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWareProvider.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWareProvider.setId(aId);
    } // end setId()

    /**
     * Get DriverType
     *
     * @return driverType
     */
    public String getDriverType() {
        return objMiddleWareProvider.getDriverType();
    } // end getDriverType()

    /**
     * Set DriverType
     *
     * @param aDriverType
     */
    public void setDriverType(String aDriverType) {
        this.objMiddleWareProvider.setDriverType(aDriverType);
    } // end setDriverType()

    /**
     * Get MiddleWareName
     *
     * @return middleWareName
     */
    public String getMiddleWareName() {
        return objMiddleWareProvider.getMiddleWareName();
    } // end getMiddleWareName()

    /**
     * Set MiddleWareName
     *
     * @param aMiddleWareName
     */
    public void setMiddleWareName(String aMiddleWareName) {
        this.objMiddleWareProvider.setMiddleWareName(aMiddleWareName);
    } // end setMiddleWareName()

    /**
     * Get MiddleWareType
     *
     * @return middleWareType
     */
    public String getMiddleWareType() {
        return objMiddleWareProvider.getMiddleWareType();
    } // end getMiddleWareType()

    /**
     * Set MiddleWareType
     *
     * @param aMiddleWareType
     */
    public void setMiddleWareType(String aMiddleWareType) {
        this.objMiddleWareProvider.setMiddleWareType(aMiddleWareType);
    } // end setMiddleWareType()

    /**
     * Get MiddleWareVersion
     *
     * @return middleWareVersion
     */
    public String getMiddleWareVersion() {
        return objMiddleWareProvider.getMiddleWareVersion();
    } // end getMiddleWareVersion()

    /**
     * Set MiddleWareVersion
     *
     * @param aMiddleWareVersion
     */
    public void setMiddleWareVersion(String aMiddleWareVersion) {
        this.objMiddleWareProvider.setMiddleWareVersion(aMiddleWareVersion);
    } // end setMiddleWareVersion()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    public String getProviderName() {
        return objMiddleWareProvider.getProviderName();
    } // end getProviderName()

    /**
     * Set ProviderName
     *
     * @param aProviderName
     */
    public void setProviderName(String aProviderName) {
        this.objMiddleWareProvider.setProviderName(aProviderName);
    } // end setProviderName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMiddleWareProvider.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMiddleWareProvider.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWareProvider.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWareProvider.setStatus(aStatus);
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

        if ((obj instanceof MiddleWareProviderBean) == false) {
            return false;
        } // end if

        MiddleWareProviderBean other = (MiddleWareProviderBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWareProvider tempMiddleWareProvider = other.convertToMiddleWareProvider();

        if ((tempMiddleWareProvider == null) ||
                (this.objMiddleWareProvider == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWareProvider == this.objMiddleWareProvider) ||
                tempMiddleWareProvider.equals(this.objMiddleWareProvider)) {
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
     * @param aMiddleWareProviders DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareProviderBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareProvider[] aMiddleWareProviders) {
        return toArray(aMiddleWareProviders, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareProviders DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareProviderBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareProvider[] aMiddleWareProviders,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMiddleWareProviders)) {
            return new MiddleWareProviderBean[0];
        } // end if

        int length = aMiddleWareProviders.length;

        MiddleWareProviderBean[] beans = new MiddleWareProviderBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareProviderBean(aMiddleWareProviders[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareProviderBean(aMiddleWareProviders[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aMiddleWareProviders[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareProviderBean
