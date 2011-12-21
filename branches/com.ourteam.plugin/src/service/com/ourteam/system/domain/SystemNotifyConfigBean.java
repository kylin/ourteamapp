/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-24 15:02:05
 *
 * @model auto gen
 */
public class SystemNotifyConfigBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysNotifyConfig objSysNotifyConfig;

    static {
        mappedDaoFields.put("checkInterval",
            com.ourteam.system.dao.ISysNotifyConfigDAO.CheckInterval);

        mappedDaoFields.put("id", com.ourteam.system.dao.ISysNotifyConfigDAO.Id);

        mappedDaoFields.put("notifyIcon",
            com.ourteam.system.dao.ISysNotifyConfigDAO.NotifyIcon);

        mappedDaoFields.put("notifyListener",
            com.ourteam.system.dao.ISysNotifyConfigDAO.NotifyListener);

        mappedDaoFields.put("notifyMessage",
            com.ourteam.system.dao.ISysNotifyConfigDAO.NotifyMessage);

        mappedDaoFields.put("notifyName",
            com.ourteam.system.dao.ISysNotifyConfigDAO.NotifyName);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysNotifyConfigDAO.Status);
    } 

    /**
     * Creates a new SystemNotifyConfigBean object.
     */
    public SystemNotifyConfigBean() {
        super();

        objSysNotifyConfig = new com.ourteam.system.dao.SysNotifyConfig();
    } // end SystemNotifyConfigBean()

    /**
     * Creates a new SystemNotifyConfigBean object.
     *
     * @param aSysNotifyConfig DOCUMENT ME!
     */
    public SystemNotifyConfigBean(
        com.ourteam.system.dao.SysNotifyConfig aSysNotifyConfig) {
        super();

        objSysNotifyConfig = aSysNotifyConfig;
    } // end SystemNotifyConfigBean()

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
    public com.ourteam.system.dao.SysNotifyConfig convertToSysNotifyConfig() {
        return objSysNotifyConfig;
    } // end convertToSysNotifyConfig()

    /**
     * Get CheckInterval
     *
     * @return checkInterval
     */
    public int getCheckInterval() {
        return objSysNotifyConfig.getCheckInterval();
    } // end getCheckInterval()

    /**
     * Set CheckInterval
     *
     * @param aCheckInterval
     */
    public void setCheckInterval(int aCheckInterval) {
        this.objSysNotifyConfig.setCheckInterval(aCheckInterval);
    } // end setCheckInterval()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysNotifyConfig.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysNotifyConfig.setId(aId);
    } // end setId()

    /**
     * Get NotifyIcon
     *
     * @return notifyIcon
     */
    public String getNotifyIcon() {
        return objSysNotifyConfig.getNotifyIcon();
    } // end getNotifyIcon()

    /**
     * Set NotifyIcon
     *
     * @param aNotifyIcon
     */
    public void setNotifyIcon(String aNotifyIcon) {
        this.objSysNotifyConfig.setNotifyIcon(aNotifyIcon);
    } // end setNotifyIcon()

    /**
     * Get NotifyListener
     *
     * @return notifyListener
     */
    public String getNotifyListener() {
        return objSysNotifyConfig.getNotifyListener();
    } // end getNotifyListener()

    /**
     * Set NotifyListener
     *
     * @param aNotifyListener
     */
    public void setNotifyListener(String aNotifyListener) {
        this.objSysNotifyConfig.setNotifyListener(aNotifyListener);
    } // end setNotifyListener()

    /**
     * Get NotifyMessage
     *
     * @return notifyMessage
     */
    public String getNotifyMessage() {
        return objSysNotifyConfig.getNotifyMessage();
    } // end getNotifyMessage()

    /**
     * Set NotifyMessage
     *
     * @param aNotifyMessage
     */
    public void setNotifyMessage(String aNotifyMessage) {
        this.objSysNotifyConfig.setNotifyMessage(aNotifyMessage);
    } // end setNotifyMessage()

    /**
     * Get NotifyName
     *
     * @return notifyName
     */
    public String getNotifyName() {
        return objSysNotifyConfig.getNotifyName();
    } // end getNotifyName()

    /**
     * Set NotifyName
     *
     * @param aNotifyName
     */
    public void setNotifyName(String aNotifyName) {
        this.objSysNotifyConfig.setNotifyName(aNotifyName);
    } // end setNotifyName()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysNotifyConfig.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysNotifyConfig.setStatus(aStatus);
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

        if ((obj instanceof SystemNotifyConfigBean) == false) {
            return false;
        } // end if

        SystemNotifyConfigBean other = (SystemNotifyConfigBean) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysNotifyConfig tempSysNotifyConfig = other.convertToSysNotifyConfig();

        if ((tempSysNotifyConfig == null) || (this.objSysNotifyConfig == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysNotifyConfig == this.objSysNotifyConfig) ||
                tempSysNotifyConfig.equals(this.objSysNotifyConfig)) {
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
     * @param aSysNotifyConfigs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemNotifyConfigBean[] toArray(
        com.ourteam.system.dao.SysNotifyConfig[] aSysNotifyConfigs) {
        return toArray(aSysNotifyConfigs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysNotifyConfigs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemNotifyConfigBean[] toArray(
        com.ourteam.system.dao.SysNotifyConfig[] aSysNotifyConfigs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysNotifyConfigs)) {
            return new SystemNotifyConfigBean[0];
        } // end if

        int length = aSysNotifyConfigs.length;

        SystemNotifyConfigBean[] beans = new SystemNotifyConfigBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemNotifyConfigBean(aSysNotifyConfigs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemNotifyConfigBean(aSysNotifyConfigs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aSysNotifyConfigs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemNotifyConfigBean
