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
public class WorkspaceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.workspace.dao.Workspace objWorkspace;

    static {
        mappedDaoFields.put("id", com.ourteam.workspace.dao.IWorkspaceDAO.Id);

        mappedDaoFields.put("createDate",
            com.ourteam.workspace.dao.IWorkspaceDAO.CreateDate);

        mappedDaoFields.put("name", com.ourteam.workspace.dao.IWorkspaceDAO.Name);

        mappedDaoFields.put("status",
            com.ourteam.workspace.dao.IWorkspaceDAO.Status);

        mappedDaoFields.put("workspacePath",
            com.ourteam.workspace.dao.IWorkspaceDAO.WorkspacePath);

        mappedDaoFields.put("workspaceType",
            com.ourteam.workspace.dao.IWorkspaceDAO.WorkspaceType);

        mappedDaoFields.put("description",
            com.ourteam.workspace.dao.IWorkspaceDAO.Description);
    } 

    /**
     * Creates a new WorkspaceBean object.
     */
    public WorkspaceBean() {
        super();

        objWorkspace = new com.ourteam.workspace.dao.Workspace();
    } // end WorkspaceBean()

    /**
     * Creates a new WorkspaceBean object.
     *
     * @param aWorkspace DOCUMENT ME!
     */
    public WorkspaceBean(com.ourteam.workspace.dao.Workspace aWorkspace) {
        super();

        objWorkspace = aWorkspace;
    } // end WorkspaceBean()

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
    public com.ourteam.workspace.dao.Workspace convertToWorkspace() {
        return objWorkspace;
    } // end convertToWorkspace()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objWorkspace.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objWorkspace.setId(aId);
    } // end setId()

    /**
     * Get CreateDate
     *
     * @return createDate
     */
    public java.util.Date getCreateDate() {
        return objWorkspace.getCreateDate();
    } // end getCreateDate()

    /**
     * Set CreateDate
     *
     * @param aCreateDate
     */
    public void setCreateDate(java.util.Date aCreateDate) {
        this.objWorkspace.setCreateDate(aCreateDate);
    } // end setCreateDate()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objWorkspace.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objWorkspace.setName(aName);
    } // end setName()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objWorkspace.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objWorkspace.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get WorkspacePath
     *
     * @return workspacePath
     */
    public String getWorkspacePath() {
        return objWorkspace.getWorkspacePath();
    } // end getWorkspacePath()

    /**
     * Set WorkspacePath
     *
     * @param aWorkspacePath
     */
    public void setWorkspacePath(String aWorkspacePath) {
        this.objWorkspace.setWorkspacePath(aWorkspacePath);
    } // end setWorkspacePath()

    /**
     * Get WorkspaceType
     *
     * @return workspaceType
     */
    public String getWorkspaceType() {
        return objWorkspace.getWorkspaceType();
    } // end getWorkspaceType()

    /**
     * Set WorkspaceType
     *
     * @param aWorkspaceType
     */
    public void setWorkspaceType(String aWorkspaceType) {
        this.objWorkspace.setWorkspaceType(aWorkspaceType);
    } // end setWorkspaceType()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objWorkspace.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objWorkspace.setDescription(aDescription);
    } // end setDescription()

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

        if ((obj instanceof WorkspaceBean) == false) {
            return false;
        } // end if

        WorkspaceBean other = (WorkspaceBean) obj;

        boolean isEqual = false;

        com.ourteam.workspace.dao.Workspace tempWorkspace = other.convertToWorkspace();

        if ((tempWorkspace == null) || (this.objWorkspace == null)) {
            isEqual = false;
        } // end if
        else if ((tempWorkspace == this.objWorkspace) ||
                tempWorkspace.equals(this.objWorkspace)) {
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
     * @param aWorkspaces DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceBean[] toArray(
        com.ourteam.workspace.dao.Workspace[] aWorkspaces) {
        return toArray(aWorkspaces, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaces DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceBean[] toArray(
        com.ourteam.workspace.dao.Workspace[] aWorkspaces,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aWorkspaces)) {
            return new WorkspaceBean[0];
        } // end if

        int length = aWorkspaces.length;

        WorkspaceBean[] beans = new WorkspaceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceBean(aWorkspaces[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceBean(aWorkspaces[i]);

                aCallBack.populate(beans[i], new Object[] { aWorkspaces[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end WorkspaceBean
