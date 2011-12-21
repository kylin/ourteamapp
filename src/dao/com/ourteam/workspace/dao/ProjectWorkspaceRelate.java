/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

/**
 * Generate Date 2011-09-22 10:17:22
 *
 * @author Auto Gen
 */
public class ProjectWorkspaceRelate implements java.io.Serializable {
    /**
     * Creates a new ProjectWorkspaceRelate object.
     */
    public ProjectWorkspaceRelate() {
        super();
    } // end ProjectWorkspaceRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long projectId;

    /** Attribute  Be Seted Falg */
    private boolean projectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean projectIdNull = false;

    /** Attribute */
    private long workspaceId;

    /** Attribute  Be Seted Falg */
    private boolean workspaceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceIdNull = false;

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
     * Get ProjectId
     *
     * @return projectId
     */
    final public long getProjectId() {
        return projectId;
    } // end getProjectId()

    /**
     * Set ProjectId
     *
     * @param aProjectId
     */
    final public void setProjectId(long aProjectId) {
        this.projectId = aProjectId;

        this.projectIdSetted = true;

        this.setProjectIdNull(false);
    } // end setProjectId()

    /**
     * Get ProjectId Has Been Setted
     *
     * @return projectId
     */
    final public boolean isProjectIdSetted() {
        return this.projectIdSetted;
    } // end isProjectIdSetted()

    /**
     * Set ProjectId Null
     */
    final public void setProjectIdNull() {
        this.projectIdNull = true;
    } // end setProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProjectIdNull(boolean aNullFlag) {
        this.projectIdNull = aNullFlag;
    } // end setProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProjectIdNull() {
        return this.projectIdNull;
    } // end isProjectIdNull()

    /**
     * Get WorkspaceId
     *
     * @return workspaceId
     */
    final public long getWorkspaceId() {
        return workspaceId;
    } // end getWorkspaceId()

    /**
     * Set WorkspaceId
     *
     * @param aWorkspaceId
     */
    final public void setWorkspaceId(long aWorkspaceId) {
        this.workspaceId = aWorkspaceId;

        this.workspaceIdSetted = true;

        this.setWorkspaceIdNull(false);
    } // end setWorkspaceId()

    /**
     * Get WorkspaceId Has Been Setted
     *
     * @return workspaceId
     */
    final public boolean isWorkspaceIdSetted() {
        return this.workspaceIdSetted;
    } // end isWorkspaceIdSetted()

    /**
     * Set WorkspaceId Null
     */
    final public void setWorkspaceIdNull() {
        this.workspaceIdNull = true;
    } // end setWorkspaceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWorkspaceIdNull(boolean aNullFlag) {
        this.workspaceIdNull = aNullFlag;
    } // end setWorkspaceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWorkspaceIdNull() {
        return this.workspaceIdNull;
    } // end isWorkspaceIdNull()

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

        if ((obj instanceof ProjectWorkspaceRelate) == false) {
            return false;
        } // end if

        ProjectWorkspaceRelate other = (ProjectWorkspaceRelate) obj;

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

        buffer.append("projectId=");
        buffer.append(this.projectId);
        buffer.append("\r\n");

        buffer.append("workspaceId=");
        buffer.append(this.workspaceId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ProjectWorkspaceRelate
