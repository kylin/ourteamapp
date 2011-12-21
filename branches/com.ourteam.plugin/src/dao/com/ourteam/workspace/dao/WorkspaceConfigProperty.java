/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

/**
 * Generate Date 2011-09-22 10:17:23
 *
 * @author Auto Gen
 */
public class WorkspaceConfigProperty implements java.io.Serializable {
    /**
     * Creates a new WorkspaceConfigProperty object.
     */
    public WorkspaceConfigProperty() {
        super();
    } // end WorkspaceConfigProperty()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String configProperty;

    /** Attribute  Be Seted Falg */
    private boolean configPropertySetted = false;

    /** Attribute  is Null Falg */
    private boolean configPropertyNull = false;

    /** Attribute */
    private String configValue;

    /** Attribute  Be Seted Falg */
    private boolean configValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean configValueNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long workspaceConfigId;

    /** Attribute  Be Seted Falg */
    private boolean workspaceConfigIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceConfigIdNull = false;

    /** Attribute */
    private long workspaceId;

    /** Attribute  Be Seted Falg */
    private boolean workspaceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceIdNull = false;

    /** Attribute */
    private String workspaceConfigItem;

    /** Attribute  Be Seted Falg */
    private boolean workspaceConfigItemSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceConfigItemNull = false;

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
     * Get ConfigProperty
     *
     * @return configProperty
     */
    final public String getConfigProperty() {
        return configProperty;
    } // end getConfigProperty()

    /**
     * Set ConfigProperty
     *
     * @param aConfigProperty
     */
    final public void setConfigProperty(String aConfigProperty) {
        this.configProperty = aConfigProperty;

        this.configPropertySetted = true;

        this.setConfigPropertyNull(this.configProperty == null);
    } // end setConfigProperty()

    /**
     * Get ConfigProperty Has Been Setted
     *
     * @return configProperty
     */
    final public boolean isConfigPropertySetted() {
        return this.configPropertySetted;
    } // end isConfigPropertySetted()

    /**
     * Set ConfigProperty Null
     */
    final public void setConfigPropertyNull() {
        this.configPropertyNull = true;
    } // end setConfigPropertyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigPropertyNull(boolean aNullFlag) {
        this.configPropertyNull = aNullFlag;
    } // end setConfigPropertyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigPropertyNull() {
        return this.configPropertyNull;
    } // end isConfigPropertyNull()

    /**
     * Get ConfigValue
     *
     * @return configValue
     */
    final public String getConfigValue() {
        if (isConfigValueNull()) {
            return null;
        } // end if
        else {
            return configValue;
        } // end else
    } // end getConfigValue()

    /**
     * Set ConfigValue
     *
     * @param aConfigValue
     */
    final public void setConfigValue(String aConfigValue) {
        this.configValue = aConfigValue;

        this.configValueSetted = true;

        this.setConfigValueNull(this.configValue == null);
    } // end setConfigValue()

    /**
     * Get ConfigValue Has Been Setted
     *
     * @return configValue
     */
    final public boolean isConfigValueSetted() {
        return this.configValueSetted;
    } // end isConfigValueSetted()

    /**
     * Set ConfigValue Null
     */
    final public void setConfigValueNull() {
        this.configValueNull = true;
    } // end setConfigValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigValueNull(boolean aNullFlag) {
        this.configValueNull = aNullFlag;
    } // end setConfigValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigValueNull() {
        return this.configValueNull;
    } // end isConfigValueNull()

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
     * Get WorkspaceConfigId
     *
     * @return workspaceConfigId
     */
    final public long getWorkspaceConfigId() {
        return workspaceConfigId;
    } // end getWorkspaceConfigId()

    /**
     * Set WorkspaceConfigId
     *
     * @param aWorkspaceConfigId
     */
    final public void setWorkspaceConfigId(long aWorkspaceConfigId) {
        this.workspaceConfigId = aWorkspaceConfigId;

        this.workspaceConfigIdSetted = true;

        this.setWorkspaceConfigIdNull(false);
    } // end setWorkspaceConfigId()

    /**
     * Get WorkspaceConfigId Has Been Setted
     *
     * @return workspaceConfigId
     */
    final public boolean isWorkspaceConfigIdSetted() {
        return this.workspaceConfigIdSetted;
    } // end isWorkspaceConfigIdSetted()

    /**
     * Set WorkspaceConfigId Null
     */
    final public void setWorkspaceConfigIdNull() {
        this.workspaceConfigIdNull = true;
    } // end setWorkspaceConfigIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWorkspaceConfigIdNull(boolean aNullFlag) {
        this.workspaceConfigIdNull = aNullFlag;
    } // end setWorkspaceConfigIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWorkspaceConfigIdNull() {
        return this.workspaceConfigIdNull;
    } // end isWorkspaceConfigIdNull()

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
     * Get WorkspaceConfigItem
     *
     * @return workspaceConfigItem
     */
    final public String getWorkspaceConfigItem() {
        if (isWorkspaceConfigItemNull()) {
            return null;
        } // end if
        else {
            return workspaceConfigItem;
        } // end else
    } // end getWorkspaceConfigItem()

    /**
     * Set WorkspaceConfigItem
     *
     * @param aWorkspaceConfigItem
     */
    final public void setWorkspaceConfigItem(String aWorkspaceConfigItem) {
        this.workspaceConfigItem = aWorkspaceConfigItem;

        this.workspaceConfigItemSetted = true;

        this.setWorkspaceConfigItemNull(this.workspaceConfigItem == null);
    } // end setWorkspaceConfigItem()

    /**
     * Get WorkspaceConfigItem Has Been Setted
     *
     * @return workspaceConfigItem
     */
    final public boolean isWorkspaceConfigItemSetted() {
        return this.workspaceConfigItemSetted;
    } // end isWorkspaceConfigItemSetted()

    /**
     * Set WorkspaceConfigItem Null
     */
    final public void setWorkspaceConfigItemNull() {
        this.workspaceConfigItemNull = true;
    } // end setWorkspaceConfigItemNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWorkspaceConfigItemNull(boolean aNullFlag) {
        this.workspaceConfigItemNull = aNullFlag;
    } // end setWorkspaceConfigItemNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWorkspaceConfigItemNull() {
        return this.workspaceConfigItemNull;
    } // end isWorkspaceConfigItemNull()

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

        if ((obj instanceof WorkspaceConfigProperty) == false) {
            return false;
        } // end if

        WorkspaceConfigProperty other = (WorkspaceConfigProperty) obj;

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

        buffer.append("configProperty=");
        buffer.append(this.configProperty);
        buffer.append("\r\n");

        buffer.append("configValue=");
        buffer.append(this.configValue);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("workspaceConfigId=");
        buffer.append(this.workspaceConfigId);
        buffer.append("\r\n");

        buffer.append("workspaceId=");
        buffer.append(this.workspaceId);
        buffer.append("\r\n");

        buffer.append("workspaceConfigItem=");
        buffer.append(this.workspaceConfigItem);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end WorkspaceConfigProperty
