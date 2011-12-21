/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

/**
 * Generate Date 2011-09-22 10:17:21
 *
 * @author Auto Gen
 */
public class ProjectServerRelate implements java.io.Serializable {
    /**
     * Creates a new ProjectServerRelate object.
     */
    public ProjectServerRelate() {
        super();
    } // end ProjectServerRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long middleWareId;

    /** Attribute  Be Seted Falg */
    private boolean middleWareIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareIdNull = false;

    /** Attribute */
    private long projectId;

    /** Attribute  Be Seted Falg */
    private boolean projectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean projectIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String serverType;

    /** Attribute  Be Seted Falg */
    private boolean serverTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean serverTypeNull = false;

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
     * Get MiddleWareId
     *
     * @return middleWareId
     */
    final public long getMiddleWareId() {
        return middleWareId;
    } // end getMiddleWareId()

    /**
     * Set MiddleWareId
     *
     * @param aMiddleWareId
     */
    final public void setMiddleWareId(long aMiddleWareId) {
        this.middleWareId = aMiddleWareId;

        this.middleWareIdSetted = true;

        this.setMiddleWareIdNull(false);
    } // end setMiddleWareId()

    /**
     * Get MiddleWareId Has Been Setted
     *
     * @return middleWareId
     */
    final public boolean isMiddleWareIdSetted() {
        return this.middleWareIdSetted;
    } // end isMiddleWareIdSetted()

    /**
     * Set MiddleWareId Null
     */
    final public void setMiddleWareIdNull() {
        this.middleWareIdNull = true;
    } // end setMiddleWareIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareIdNull(boolean aNullFlag) {
        this.middleWareIdNull = aNullFlag;
    } // end setMiddleWareIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareIdNull() {
        return this.middleWareIdNull;
    } // end isMiddleWareIdNull()

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
     * Get ServerType
     *
     * @return serverType
     */
    final public String getServerType() {
        return serverType;
    } // end getServerType()

    /**
     * Set ServerType
     *
     * @param aServerType
     */
    final public void setServerType(String aServerType) {
        this.serverType = aServerType;

        this.serverTypeSetted = true;

        this.setServerTypeNull(this.serverType == null);
    } // end setServerType()

    /**
     * Get ServerType Has Been Setted
     *
     * @return serverType
     */
    final public boolean isServerTypeSetted() {
        return this.serverTypeSetted;
    } // end isServerTypeSetted()

    /**
     * Set ServerType Null
     */
    final public void setServerTypeNull() {
        this.serverTypeNull = true;
    } // end setServerTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setServerTypeNull(boolean aNullFlag) {
        this.serverTypeNull = aNullFlag;
    } // end setServerTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isServerTypeNull() {
        return this.serverTypeNull;
    } // end isServerTypeNull()

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

        if ((obj instanceof ProjectServerRelate) == false) {
            return false;
        } // end if

        ProjectServerRelate other = (ProjectServerRelate) obj;

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

        buffer.append("middleWareId=");
        buffer.append(this.middleWareId);
        buffer.append("\r\n");

        buffer.append("projectId=");
        buffer.append(this.projectId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("serverType=");
        buffer.append(this.serverType);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ProjectServerRelate
