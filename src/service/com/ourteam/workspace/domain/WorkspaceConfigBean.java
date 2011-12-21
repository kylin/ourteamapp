/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:44
 *
 * @model auto gen
 */
public class WorkspaceConfigBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.workspace.dao.WorkspaceConfig objWorkspaceConfig;

    static {
        mappedDaoFields.put("id",
            com.ourteam.workspace.dao.IWorkspaceConfigDAO.Id);

        mappedDaoFields.put("configItem",
            com.ourteam.workspace.dao.IWorkspaceConfigDAO.ConfigItem);

        mappedDaoFields.put("description",
            com.ourteam.workspace.dao.IWorkspaceConfigDAO.Description);

        mappedDaoFields.put("parentConfigId",
            com.ourteam.workspace.dao.IWorkspaceConfigDAO.ParentConfigId);

        mappedDaoFields.put("status",
            com.ourteam.workspace.dao.IWorkspaceConfigDAO.Status);

        mappedDaoFields.put("configName",
            com.ourteam.workspace.dao.IWorkspaceConfigDAO.ConfigName);

        mappedDaoFields.put("configForm",
            com.ourteam.workspace.dao.IWorkspaceConfigDAO.ConfigForm);
    } 

    /**
     * Creates a new WorkspaceConfigBean object.
     */
    public WorkspaceConfigBean() {
        super();

        objWorkspaceConfig = new com.ourteam.workspace.dao.WorkspaceConfig();
    } // end WorkspaceConfigBean()

    /**
     * Creates a new WorkspaceConfigBean object.
     *
     * @param aWorkspaceConfig DOCUMENT ME!
     */
    public WorkspaceConfigBean(
        com.ourteam.workspace.dao.WorkspaceConfig aWorkspaceConfig) {
        super();

        objWorkspaceConfig = aWorkspaceConfig;
    } // end WorkspaceConfigBean()

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
    public com.ourteam.workspace.dao.WorkspaceConfig convertToWorkspaceConfig() {
        return objWorkspaceConfig;
    } // end convertToWorkspaceConfig()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objWorkspaceConfig.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objWorkspaceConfig.setId(aId);
    } // end setId()

    /**
     * Get ConfigItem
     *
     * @return configItem
     */
    public String getConfigItem() {
        return objWorkspaceConfig.getConfigItem();
    } // end getConfigItem()

    /**
     * Set ConfigItem
     *
     * @param aConfigItem
     */
    public void setConfigItem(String aConfigItem) {
        this.objWorkspaceConfig.setConfigItem(aConfigItem);
    } // end setConfigItem()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objWorkspaceConfig.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objWorkspaceConfig.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get ParentConfigId
     *
     * @return parentConfigId
     */
    public long getParentConfigId() {
        return objWorkspaceConfig.getParentConfigId();
    } // end getParentConfigId()

    /**
     * Set ParentConfigId
     *
     * @param aParentConfigId
     */
    public void setParentConfigId(long aParentConfigId) {
        this.objWorkspaceConfig.setParentConfigId(aParentConfigId);
    } // end setParentConfigId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objWorkspaceConfig.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objWorkspaceConfig.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ConfigName
     *
     * @return configName
     */
    public String getConfigName() {
        return objWorkspaceConfig.getConfigName();
    } // end getConfigName()

    /**
     * Set ConfigName
     *
     * @param aConfigName
     */
    public void setConfigName(String aConfigName) {
        this.objWorkspaceConfig.setConfigName(aConfigName);
    } // end setConfigName()

    /**
     * Get ConfigForm
     *
     * @return configForm
     */
    public String getConfigForm() {
        return objWorkspaceConfig.getConfigForm();
    } // end getConfigForm()

    /**
     * Set ConfigForm
     *
     * @param aConfigForm
     */
    public void setConfigForm(String aConfigForm) {
        this.objWorkspaceConfig.setConfigForm(aConfigForm);
    } // end setConfigForm()

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

        if ((obj instanceof WorkspaceConfigBean) == false) {
            return false;
        } // end if

        WorkspaceConfigBean other = (WorkspaceConfigBean) obj;

        boolean isEqual = false;

        com.ourteam.workspace.dao.WorkspaceConfig tempWorkspaceConfig = other.convertToWorkspaceConfig();

        if ((tempWorkspaceConfig == null) || (this.objWorkspaceConfig == null)) {
            isEqual = false;
        } // end if
        else if ((tempWorkspaceConfig == this.objWorkspaceConfig) ||
                tempWorkspaceConfig.equals(this.objWorkspaceConfig)) {
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
     * @param aWorkspaceConfigs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceConfigBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceConfig[] aWorkspaceConfigs) {
        return toArray(aWorkspaceConfigs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfigs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceConfigBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceConfig[] aWorkspaceConfigs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aWorkspaceConfigs)) {
            return new WorkspaceConfigBean[0];
        } // end if

        int length = aWorkspaceConfigs.length;

        WorkspaceConfigBean[] beans = new WorkspaceConfigBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceConfigBean(aWorkspaceConfigs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceConfigBean(aWorkspaceConfigs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aWorkspaceConfigs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end WorkspaceConfigBean
