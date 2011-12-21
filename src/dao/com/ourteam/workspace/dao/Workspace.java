/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

/**
 * Generate Date 2011-09-22 10:17:22
 *
 * @author Auto Gen
 */
public class Workspace implements java.io.Serializable {
    /**
     * Creates a new Workspace object.
     */
    public Workspace() {
        super();
    } // end Workspace()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date createDate;

    /** Attribute  Be Seted Falg */
    private boolean createDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean createDateNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String workspacePath;

    /** Attribute  Be Seted Falg */
    private boolean workspacePathSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspacePathNull = false;

    /** Attribute */
    private String workspaceType;

    /** Attribute  Be Seted Falg */
    private boolean workspaceTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceTypeNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

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
     * Get CreateDate
     *
     * @return createDate
     */
    final public java.util.Date getCreateDate() {
        return createDate;
    } // end getCreateDate()

    /**
     * Set CreateDate
     *
     * @param aCreateDate
     */
    final public void setCreateDate(java.util.Date aCreateDate) {
        this.createDate = aCreateDate;

        this.createDateSetted = true;

        this.setCreateDateNull(this.createDate == null);
    } // end setCreateDate()

    /**
     * Get CreateDate Has Been Setted
     *
     * @return createDate
     */
    final public boolean isCreateDateSetted() {
        return this.createDateSetted;
    } // end isCreateDateSetted()

    /**
     * Set CreateDate Null
     */
    final public void setCreateDateNull() {
        this.createDateNull = true;
    } // end setCreateDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCreateDateNull(boolean aNullFlag) {
        this.createDateNull = aNullFlag;
    } // end setCreateDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCreateDateNull() {
        return this.createDateNull;
    } // end isCreateDateNull()

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
     * Get WorkspacePath
     *
     * @return workspacePath
     */
    final public String getWorkspacePath() {
        if (isWorkspacePathNull()) {
            return null;
        } // end if
        else {
            return workspacePath;
        } // end else
    } // end getWorkspacePath()

    /**
     * Set WorkspacePath
     *
     * @param aWorkspacePath
     */
    final public void setWorkspacePath(String aWorkspacePath) {
        this.workspacePath = aWorkspacePath;

        this.workspacePathSetted = true;

        this.setWorkspacePathNull(this.workspacePath == null);
    } // end setWorkspacePath()

    /**
     * Get WorkspacePath Has Been Setted
     *
     * @return workspacePath
     */
    final public boolean isWorkspacePathSetted() {
        return this.workspacePathSetted;
    } // end isWorkspacePathSetted()

    /**
     * Set WorkspacePath Null
     */
    final public void setWorkspacePathNull() {
        this.workspacePathNull = true;
    } // end setWorkspacePathNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWorkspacePathNull(boolean aNullFlag) {
        this.workspacePathNull = aNullFlag;
    } // end setWorkspacePathNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWorkspacePathNull() {
        return this.workspacePathNull;
    } // end isWorkspacePathNull()

    /**
     * Get WorkspaceType
     *
     * @return workspaceType
     */
    final public String getWorkspaceType() {
        return workspaceType;
    } // end getWorkspaceType()

    /**
     * Set WorkspaceType
     *
     * @param aWorkspaceType
     */
    final public void setWorkspaceType(String aWorkspaceType) {
        this.workspaceType = aWorkspaceType;

        this.workspaceTypeSetted = true;

        this.setWorkspaceTypeNull(this.workspaceType == null);
    } // end setWorkspaceType()

    /**
     * Get WorkspaceType Has Been Setted
     *
     * @return workspaceType
     */
    final public boolean isWorkspaceTypeSetted() {
        return this.workspaceTypeSetted;
    } // end isWorkspaceTypeSetted()

    /**
     * Set WorkspaceType Null
     */
    final public void setWorkspaceTypeNull() {
        this.workspaceTypeNull = true;
    } // end setWorkspaceTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWorkspaceTypeNull(boolean aNullFlag) {
        this.workspaceTypeNull = aNullFlag;
    } // end setWorkspaceTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWorkspaceTypeNull() {
        return this.workspaceTypeNull;
    } // end isWorkspaceTypeNull()

    /**
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        return description;
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    final public void setDescription(String aDescription) {
        this.description = aDescription;

        this.descriptionSetted = true;

        this.setDescriptionNull(this.description == null);
    } // end setDescription()

    /**
     * Get Description Has Been Setted
     *
     * @return description
     */
    final public boolean isDescriptionSetted() {
        return this.descriptionSetted;
    } // end isDescriptionSetted()

    /**
     * Set Description Null
     */
    final public void setDescriptionNull() {
        this.descriptionNull = true;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDescriptionNull(boolean aNullFlag) {
        this.descriptionNull = aNullFlag;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDescriptionNull() {
        return this.descriptionNull;
    } // end isDescriptionNull()

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

        if ((obj instanceof Workspace) == false) {
            return false;
        } // end if

        Workspace other = (Workspace) obj;

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

        buffer.append("createDate=");
        buffer.append(this.createDate);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("workspacePath=");
        buffer.append(this.workspacePath);
        buffer.append("\r\n");

        buffer.append("workspaceType=");
        buffer.append(this.workspaceType);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end Workspace
