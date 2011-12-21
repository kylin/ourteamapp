/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

/**
 * Generate Date 2011-09-22 10:17:24
 *
 * @author Auto Gen
 */
public class WorkspaceResource implements java.io.Serializable {
    /**
     * Creates a new WorkspaceResource object.
     */
    public WorkspaceResource() {
        super();
    } // end WorkspaceResource()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private int orderIndex;

    /** Attribute  Be Seted Falg */
    private boolean orderIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean orderIndexNull = false;

    /** Attribute */
    private String resourcePath;

    /** Attribute  Be Seted Falg */
    private boolean resourcePathSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePathNull = false;

    /** Attribute */
    private String resourceType;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long workspaceId;

    /** Attribute  Be Seted Falg */
    private boolean workspaceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceIdNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String workspacePath;

    /** Attribute  Be Seted Falg */
    private boolean workspacePathSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspacePathNull = false;

    /** Attribute */
    private String workspaceName;

    /** Attribute  Be Seted Falg */
    private boolean workspaceNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceNameNull = false;

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
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        if (isDescriptionNull()) {
            return null;
        } // end if
        else {
            return description;
        } // end else
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
     * Get OrderIndex
     *
     * @return orderIndex
     */
    final public int getOrderIndex() {
        return orderIndex;
    } // end getOrderIndex()

    /**
     * Set OrderIndex
     *
     * @param aOrderIndex
     */
    final public void setOrderIndex(int aOrderIndex) {
        this.orderIndex = aOrderIndex;

        this.orderIndexSetted = true;

        this.setOrderIndexNull(false);
    } // end setOrderIndex()

    /**
     * Get OrderIndex Has Been Setted
     *
     * @return orderIndex
     */
    final public boolean isOrderIndexSetted() {
        return this.orderIndexSetted;
    } // end isOrderIndexSetted()

    /**
     * Set OrderIndex Null
     */
    final public void setOrderIndexNull() {
        this.orderIndexNull = true;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOrderIndexNull(boolean aNullFlag) {
        this.orderIndexNull = aNullFlag;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOrderIndexNull() {
        return this.orderIndexNull;
    } // end isOrderIndexNull()

    /**
     * Get ResourcePath
     *
     * @return resourcePath
     */
    final public String getResourcePath() {
        if (isResourcePathNull()) {
            return null;
        } // end if
        else {
            return resourcePath;
        } // end else
    } // end getResourcePath()

    /**
     * Set ResourcePath
     *
     * @param aResourcePath
     */
    final public void setResourcePath(String aResourcePath) {
        this.resourcePath = aResourcePath;

        this.resourcePathSetted = true;

        this.setResourcePathNull(this.resourcePath == null);
    } // end setResourcePath()

    /**
     * Get ResourcePath Has Been Setted
     *
     * @return resourcePath
     */
    final public boolean isResourcePathSetted() {
        return this.resourcePathSetted;
    } // end isResourcePathSetted()

    /**
     * Set ResourcePath Null
     */
    final public void setResourcePathNull() {
        this.resourcePathNull = true;
    } // end setResourcePathNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePathNull(boolean aNullFlag) {
        this.resourcePathNull = aNullFlag;
    } // end setResourcePathNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePathNull() {
        return this.resourcePathNull;
    } // end isResourcePathNull()

    /**
     * Get ResourceType
     *
     * @return resourceType
     */
    final public String getResourceType() {
        return resourceType;
    } // end getResourceType()

    /**
     * Set ResourceType
     *
     * @param aResourceType
     */
    final public void setResourceType(String aResourceType) {
        this.resourceType = aResourceType;

        this.resourceTypeSetted = true;

        this.setResourceTypeNull(this.resourceType == null);
    } // end setResourceType()

    /**
     * Get ResourceType Has Been Setted
     *
     * @return resourceType
     */
    final public boolean isResourceTypeSetted() {
        return this.resourceTypeSetted;
    } // end isResourceTypeSetted()

    /**
     * Set ResourceType Null
     */
    final public void setResourceTypeNull() {
        this.resourceTypeNull = true;
    } // end setResourceTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeNull(boolean aNullFlag) {
        this.resourceTypeNull = aNullFlag;
    } // end setResourceTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeNull() {
        return this.resourceTypeNull;
    } // end isResourceTypeNull()

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
     * Get WorkspaceName
     *
     * @return workspaceName
     */
    final public String getWorkspaceName() {
        return workspaceName;
    } // end getWorkspaceName()

    /**
     * Set WorkspaceName
     *
     * @param aWorkspaceName
     */
    final public void setWorkspaceName(String aWorkspaceName) {
        this.workspaceName = aWorkspaceName;

        this.workspaceNameSetted = true;

        this.setWorkspaceNameNull(this.workspaceName == null);
    } // end setWorkspaceName()

    /**
     * Get WorkspaceName Has Been Setted
     *
     * @return workspaceName
     */
    final public boolean isWorkspaceNameSetted() {
        return this.workspaceNameSetted;
    } // end isWorkspaceNameSetted()

    /**
     * Set WorkspaceName Null
     */
    final public void setWorkspaceNameNull() {
        this.workspaceNameNull = true;
    } // end setWorkspaceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWorkspaceNameNull(boolean aNullFlag) {
        this.workspaceNameNull = aNullFlag;
    } // end setWorkspaceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWorkspaceNameNull() {
        return this.workspaceNameNull;
    } // end isWorkspaceNameNull()

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

        if ((obj instanceof WorkspaceResource) == false) {
            return false;
        } // end if

        WorkspaceResource other = (WorkspaceResource) obj;

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

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("orderIndex=");
        buffer.append(this.orderIndex);
        buffer.append("\r\n");

        buffer.append("resourcePath=");
        buffer.append(this.resourcePath);
        buffer.append("\r\n");

        buffer.append("resourceType=");
        buffer.append(this.resourceType);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("workspaceId=");
        buffer.append(this.workspaceId);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("workspacePath=");
        buffer.append(this.workspacePath);
        buffer.append("\r\n");

        buffer.append("workspaceName=");
        buffer.append(this.workspaceName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end WorkspaceResource
