/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-11 16:22:55
 *
 * @model auto gen
 */
public class BpmPublicUiConfigBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmPublicUiConfig objBpmPublicUiConfig;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmPublicUiConfigDAO.Id);

        mappedDaoFields.put("configXml",
            com.ourteam.bpm.dao.IBpmPublicUiConfigDAO.ConfigXml);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmPublicUiConfigDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmPublicUiConfigDAO.Status);

        mappedDaoFields.put("uiConfigType",
            com.ourteam.bpm.dao.IBpmPublicUiConfigDAO.UiConfigType);
    } 

    /**
     * Creates a new BpmPublicUiConfigBean object.
     */
    public BpmPublicUiConfigBean() {
        super();

        objBpmPublicUiConfig = new com.ourteam.bpm.dao.BpmPublicUiConfig();
    } // end BpmPublicUiConfigBean()

    /**
     * Creates a new BpmPublicUiConfigBean object.
     *
     * @param aBpmPublicUiConfig DOCUMENT ME!
     */
    public BpmPublicUiConfigBean(
        com.ourteam.bpm.dao.BpmPublicUiConfig aBpmPublicUiConfig) {
        super();

        objBpmPublicUiConfig = aBpmPublicUiConfig;
    } // end BpmPublicUiConfigBean()

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
    public com.ourteam.bpm.dao.BpmPublicUiConfig convertToBpmPublicUiConfig() {
        return objBpmPublicUiConfig;
    } // end convertToBpmPublicUiConfig()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmPublicUiConfig.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmPublicUiConfig.setId(aId);
    } // end setId()

    /**
     * Get ConfigXml
     *
     * @return configXml
     */
    public String getConfigXml() {
        return objBpmPublicUiConfig.getConfigXml();
    } // end getConfigXml()

    /**
     * Set ConfigXml
     *
     * @param aConfigXml
     */
    public void setConfigXml(String aConfigXml) {
        this.objBpmPublicUiConfig.setConfigXml(aConfigXml);
    } // end setConfigXml()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmPublicUiConfig.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmPublicUiConfig.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmPublicUiConfig.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmPublicUiConfig.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get UiConfigType
     *
     * @return uiConfigType
     */
    public String getUiConfigType() {
        return objBpmPublicUiConfig.getUiConfigType();
    } // end getUiConfigType()

    /**
     * Set UiConfigType
     *
     * @param aUiConfigType
     */
    public void setUiConfigType(String aUiConfigType) {
        this.objBpmPublicUiConfig.setUiConfigType(aUiConfigType);
    } // end setUiConfigType()

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

        if ((obj instanceof BpmPublicUiConfigBean) == false) {
            return false;
        } // end if

        BpmPublicUiConfigBean other = (BpmPublicUiConfigBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmPublicUiConfig tempBpmPublicUiConfig = other.convertToBpmPublicUiConfig();

        if ((tempBpmPublicUiConfig == null) ||
                (this.objBpmPublicUiConfig == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmPublicUiConfig == this.objBpmPublicUiConfig) ||
                tempBpmPublicUiConfig.equals(this.objBpmPublicUiConfig)) {
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
     * @param aBpmPublicUiConfigs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmPublicUiConfigBean[] toArray(
        com.ourteam.bpm.dao.BpmPublicUiConfig[] aBpmPublicUiConfigs) {
        return toArray(aBpmPublicUiConfigs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmPublicUiConfigs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmPublicUiConfigBean[] toArray(
        com.ourteam.bpm.dao.BpmPublicUiConfig[] aBpmPublicUiConfigs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmPublicUiConfigs)) {
            return new BpmPublicUiConfigBean[0];
        } // end if

        int length = aBpmPublicUiConfigs.length;

        BpmPublicUiConfigBean[] beans = new BpmPublicUiConfigBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmPublicUiConfigBean(aBpmPublicUiConfigs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmPublicUiConfigBean(aBpmPublicUiConfigs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmPublicUiConfigs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmPublicUiConfigBean
