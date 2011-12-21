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
public class WorkspaceResourceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.workspace.dao.WorkspaceResource objWorkspaceResource;

    static {
        mappedDaoFields.put("id",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.Id);

        mappedDaoFields.put("description",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.Description);

        mappedDaoFields.put("orderIndex",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.OrderIndex);

        mappedDaoFields.put("resourcePath",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.ResourcePath);

        mappedDaoFields.put("resourceType",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.ResourceType);

        mappedDaoFields.put("status",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.Status);

        mappedDaoFields.put("workspaceId",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.WorkspaceId);

        mappedDaoFields.put("name",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.Name);

        mappedDaoFields.put("workspaceName",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.WorkspaceName);

        mappedDaoFields.put("workspacePath",
            com.ourteam.workspace.dao.IWorkspaceResourceDAO.WorkspacePath);
    } 

    /**
     * Creates a new WorkspaceResourceBean object.
     */
    public WorkspaceResourceBean() {
        super();

        objWorkspaceResource = new com.ourteam.workspace.dao.WorkspaceResource();
    } // end WorkspaceResourceBean()

    /**
     * Creates a new WorkspaceResourceBean object.
     *
     * @param aWorkspaceResource DOCUMENT ME!
     */
    public WorkspaceResourceBean(
        com.ourteam.workspace.dao.WorkspaceResource aWorkspaceResource) {
        super();

        objWorkspaceResource = aWorkspaceResource;
    } // end WorkspaceResourceBean()

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
    public com.ourteam.workspace.dao.WorkspaceResource convertToWorkspaceResource() {
        return objWorkspaceResource;
    } // end convertToWorkspaceResource()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objWorkspaceResource.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objWorkspaceResource.setId(aId);
    } // end setId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objWorkspaceResource.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objWorkspaceResource.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get OrderIndex
     *
     * @return orderIndex
     */
    public int getOrderIndex() {
        return objWorkspaceResource.getOrderIndex();
    } // end getOrderIndex()

    /**
     * Set OrderIndex
     *
     * @param aOrderIndex
     */
    public void setOrderIndex(int aOrderIndex) {
        this.objWorkspaceResource.setOrderIndex(aOrderIndex);
    } // end setOrderIndex()

    /**
     * Get ResourcePath
     *
     * @return resourcePath
     */
    public String getResourcePath() {
        return objWorkspaceResource.getResourcePath();
    } // end getResourcePath()

    /**
     * Set ResourcePath
     *
     * @param aResourcePath
     */
    public void setResourcePath(String aResourcePath) {
        this.objWorkspaceResource.setResourcePath(aResourcePath);
    } // end setResourcePath()

    /**
     * Get ResourceType
     *
     * @return resourceType
     */
    public String getResourceType() {
        return objWorkspaceResource.getResourceType();
    } // end getResourceType()

    /**
     * Set ResourceType
     *
     * @param aResourceType
     */
    public void setResourceType(String aResourceType) {
        this.objWorkspaceResource.setResourceType(aResourceType);
    } // end setResourceType()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objWorkspaceResource.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objWorkspaceResource.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get WorkspaceId
     *
     * @return workspaceId
     */
    public long getWorkspaceId() {
        return objWorkspaceResource.getWorkspaceId();
    } // end getWorkspaceId()

    /**
     * Set WorkspaceId
     *
     * @param aWorkspaceId
     */
    public void setWorkspaceId(long aWorkspaceId) {
        this.objWorkspaceResource.setWorkspaceId(aWorkspaceId);
    } // end setWorkspaceId()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objWorkspaceResource.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objWorkspaceResource.setName(aName);
    } // end setName()

    /**
     * Get WorkspaceName
     *
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return objWorkspaceResource.getWorkspaceName();
    } // end getWorkspaceName()

    /**
     * Get WorkspacePath
     *
     * @return workspacePath
     */
    public String getWorkspacePath() {
        return objWorkspaceResource.getWorkspacePath();
    } // end getWorkspacePath()

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

        if ((obj instanceof WorkspaceResourceBean) == false) {
            return false;
        } // end if

        WorkspaceResourceBean other = (WorkspaceResourceBean) obj;

        boolean isEqual = false;

        com.ourteam.workspace.dao.WorkspaceResource tempWorkspaceResource = other.convertToWorkspaceResource();

        if ((tempWorkspaceResource == null) ||
                (this.objWorkspaceResource == null)) {
            isEqual = false;
        } // end if
        else if ((tempWorkspaceResource == this.objWorkspaceResource) ||
                tempWorkspaceResource.equals(this.objWorkspaceResource)) {
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
     * @param aWorkspaceResources DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceResourceBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceResource[] aWorkspaceResources) {
        return toArray(aWorkspaceResources, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResources DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceResourceBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceResource[] aWorkspaceResources,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aWorkspaceResources)) {
            return new WorkspaceResourceBean[0];
        } // end if

        int length = aWorkspaceResources.length;

        WorkspaceResourceBean[] beans = new WorkspaceResourceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceResourceBean(aWorkspaceResources[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceResourceBean(aWorkspaceResources[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aWorkspaceResources[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end WorkspaceResourceBean
