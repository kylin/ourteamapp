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
public class WorkspaceConfigPropertyBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.workspace.dao.WorkspaceConfigProperty objWorkspaceConfigProperty;

    static {
        mappedDaoFields.put("id",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.Id);

        mappedDaoFields.put("configProperty",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.ConfigProperty);

        mappedDaoFields.put("configValue",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.ConfigValue);

        mappedDaoFields.put("description",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.Description);

        mappedDaoFields.put("status",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.Status);

        mappedDaoFields.put("workspaceConfigId",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.WorkspaceConfigId);

        mappedDaoFields.put("workspaceId",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.WorkspaceId);

        mappedDaoFields.put("workspaceConfigItem",
            com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO.WorkspaceConfigItem);
    } 

    /**
     * Creates a new WorkspaceConfigPropertyBean object.
     */
    public WorkspaceConfigPropertyBean() {
        super();

        objWorkspaceConfigProperty = new com.ourteam.workspace.dao.WorkspaceConfigProperty();
    } // end WorkspaceConfigPropertyBean()

    /**
     * Creates a new WorkspaceConfigPropertyBean object.
     *
     * @param aWorkspaceConfigProperty DOCUMENT ME!
     */
    public WorkspaceConfigPropertyBean(
        com.ourteam.workspace.dao.WorkspaceConfigProperty aWorkspaceConfigProperty) {
        super();

        objWorkspaceConfigProperty = aWorkspaceConfigProperty;
    } // end WorkspaceConfigPropertyBean()

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
    public com.ourteam.workspace.dao.WorkspaceConfigProperty convertToWorkspaceConfigProperty() {
        return objWorkspaceConfigProperty;
    } // end convertToWorkspaceConfigProperty()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objWorkspaceConfigProperty.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objWorkspaceConfigProperty.setId(aId);
    } // end setId()

    /**
     * Get ConfigProperty
     *
     * @return configProperty
     */
    public String getConfigProperty() {
        return objWorkspaceConfigProperty.getConfigProperty();
    } // end getConfigProperty()

    /**
     * Set ConfigProperty
     *
     * @param aConfigProperty
     */
    public void setConfigProperty(String aConfigProperty) {
        this.objWorkspaceConfigProperty.setConfigProperty(aConfigProperty);
    } // end setConfigProperty()

    /**
     * Get ConfigValue
     *
     * @return configValue
     */
    public String getConfigValue() {
        return objWorkspaceConfigProperty.getConfigValue();
    } // end getConfigValue()

    /**
     * Set ConfigValue
     *
     * @param aConfigValue
     */
    public void setConfigValue(String aConfigValue) {
        this.objWorkspaceConfigProperty.setConfigValue(aConfigValue);
    } // end setConfigValue()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objWorkspaceConfigProperty.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objWorkspaceConfigProperty.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objWorkspaceConfigProperty.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objWorkspaceConfigProperty.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get WorkspaceConfigId
     *
     * @return workspaceConfigId
     */
    public long getWorkspaceConfigId() {
        return objWorkspaceConfigProperty.getWorkspaceConfigId();
    } // end getWorkspaceConfigId()

    /**
     * Set WorkspaceConfigId
     *
     * @param aWorkspaceConfigId
     */
    public void setWorkspaceConfigId(long aWorkspaceConfigId) {
        this.objWorkspaceConfigProperty.setWorkspaceConfigId(aWorkspaceConfigId);
    } // end setWorkspaceConfigId()

    /**
     * Get WorkspaceId
     *
     * @return workspaceId
     */
    public long getWorkspaceId() {
        return objWorkspaceConfigProperty.getWorkspaceId();
    } // end getWorkspaceId()

    /**
     * Set WorkspaceId
     *
     * @param aWorkspaceId
     */
    public void setWorkspaceId(long aWorkspaceId) {
        this.objWorkspaceConfigProperty.setWorkspaceId(aWorkspaceId);
    } // end setWorkspaceId()

    /**
     * Get WorkspaceConfigItem
     *
     * @return workspaceConfigItem
     */
    public String getWorkspaceConfigItem() {
        return objWorkspaceConfigProperty.getWorkspaceConfigItem();
    } // end getWorkspaceConfigItem()

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

        if ((obj instanceof WorkspaceConfigPropertyBean) == false) {
            return false;
        } // end if

        WorkspaceConfigPropertyBean other = (WorkspaceConfigPropertyBean) obj;

        boolean isEqual = false;

        com.ourteam.workspace.dao.WorkspaceConfigProperty tempWorkspaceConfigProperty =
            other.convertToWorkspaceConfigProperty();

        if ((tempWorkspaceConfigProperty == null) ||
                (this.objWorkspaceConfigProperty == null)) {
            isEqual = false;
        } // end if
        else if ((tempWorkspaceConfigProperty == this.objWorkspaceConfigProperty) ||
                tempWorkspaceConfigProperty.equals(
                    this.objWorkspaceConfigProperty)) {
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
     * @param aWorkspaceConfigPropertys DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceConfigPropertyBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceConfigProperty[] aWorkspaceConfigPropertys) {
        return toArray(aWorkspaceConfigPropertys, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfigPropertys DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceConfigPropertyBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceConfigProperty[] aWorkspaceConfigPropertys,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aWorkspaceConfigPropertys)) {
            return new WorkspaceConfigPropertyBean[0];
        } // end if

        int length = aWorkspaceConfigPropertys.length;

        WorkspaceConfigPropertyBean[] beans = new WorkspaceConfigPropertyBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceConfigPropertyBean(aWorkspaceConfigPropertys[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceConfigPropertyBean(aWorkspaceConfigPropertys[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aWorkspaceConfigPropertys[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end WorkspaceConfigPropertyBean
