/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

/**
 * Generate Date 2011-09-22 10:17:23
 *
 * @author Auto Gen
 */
public class WorkspaceConfig implements java.io.Serializable {
    /**
     * Creates a new WorkspaceConfig object.
     */
    public WorkspaceConfig() {
        super();
    } // end WorkspaceConfig()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String configItem;

    /** Attribute  Be Seted Falg */
    private boolean configItemSetted = false;

    /** Attribute  is Null Falg */
    private boolean configItemNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private long parentConfigId;

    /** Attribute  Be Seted Falg */
    private boolean parentConfigIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentConfigIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String configName;

    /** Attribute  Be Seted Falg */
    private boolean configNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean configNameNull = false;

    /** Attribute */
    private String configForm;

    /** Attribute  Be Seted Falg */
    private boolean configFormSetted = false;

    /** Attribute  is Null Falg */
    private boolean configFormNull = false;

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
     * Get ConfigItem
     *
     * @return configItem
     */
    final public String getConfigItem() {
        if (isConfigItemNull()) {
            return null;
        } // end if
        else {
            return configItem;
        } // end else
    } // end getConfigItem()

    /**
     * Set ConfigItem
     *
     * @param aConfigItem
     */
    final public void setConfigItem(String aConfigItem) {
        this.configItem = aConfigItem;

        this.configItemSetted = true;

        this.setConfigItemNull(this.configItem == null);
    } // end setConfigItem()

    /**
     * Get ConfigItem Has Been Setted
     *
     * @return configItem
     */
    final public boolean isConfigItemSetted() {
        return this.configItemSetted;
    } // end isConfigItemSetted()

    /**
     * Set ConfigItem Null
     */
    final public void setConfigItemNull() {
        this.configItemNull = true;
    } // end setConfigItemNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigItemNull(boolean aNullFlag) {
        this.configItemNull = aNullFlag;
    } // end setConfigItemNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigItemNull() {
        return this.configItemNull;
    } // end isConfigItemNull()

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
     * Get ParentConfigId
     *
     * @return parentConfigId
     */
    final public long getParentConfigId() {
        return parentConfigId;
    } // end getParentConfigId()

    /**
     * Set ParentConfigId
     *
     * @param aParentConfigId
     */
    final public void setParentConfigId(long aParentConfigId) {
        this.parentConfigId = aParentConfigId;

        this.parentConfigIdSetted = true;

        this.setParentConfigIdNull(false);
    } // end setParentConfigId()

    /**
     * Get ParentConfigId Has Been Setted
     *
     * @return parentConfigId
     */
    final public boolean isParentConfigIdSetted() {
        return this.parentConfigIdSetted;
    } // end isParentConfigIdSetted()

    /**
     * Set ParentConfigId Null
     */
    final public void setParentConfigIdNull() {
        this.parentConfigIdNull = true;
    } // end setParentConfigIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentConfigIdNull(boolean aNullFlag) {
        this.parentConfigIdNull = aNullFlag;
    } // end setParentConfigIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentConfigIdNull() {
        return this.parentConfigIdNull;
    } // end isParentConfigIdNull()

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
     * Get ConfigName
     *
     * @return configName
     */
    final public String getConfigName() {
        return configName;
    } // end getConfigName()

    /**
     * Set ConfigName
     *
     * @param aConfigName
     */
    final public void setConfigName(String aConfigName) {
        this.configName = aConfigName;

        this.configNameSetted = true;

        this.setConfigNameNull(this.configName == null);
    } // end setConfigName()

    /**
     * Get ConfigName Has Been Setted
     *
     * @return configName
     */
    final public boolean isConfigNameSetted() {
        return this.configNameSetted;
    } // end isConfigNameSetted()

    /**
     * Set ConfigName Null
     */
    final public void setConfigNameNull() {
        this.configNameNull = true;
    } // end setConfigNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigNameNull(boolean aNullFlag) {
        this.configNameNull = aNullFlag;
    } // end setConfigNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigNameNull() {
        return this.configNameNull;
    } // end isConfigNameNull()

    /**
     * Get ConfigForm
     *
     * @return configForm
     */
    final public String getConfigForm() {
        return configForm;
    } // end getConfigForm()

    /**
     * Set ConfigForm
     *
     * @param aConfigForm
     */
    final public void setConfigForm(String aConfigForm) {
        this.configForm = aConfigForm;

        this.configFormSetted = true;

        this.setConfigFormNull(this.configForm == null);
    } // end setConfigForm()

    /**
     * Get ConfigForm Has Been Setted
     *
     * @return configForm
     */
    final public boolean isConfigFormSetted() {
        return this.configFormSetted;
    } // end isConfigFormSetted()

    /**
     * Set ConfigForm Null
     */
    final public void setConfigFormNull() {
        this.configFormNull = true;
    } // end setConfigFormNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigFormNull(boolean aNullFlag) {
        this.configFormNull = aNullFlag;
    } // end setConfigFormNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigFormNull() {
        return this.configFormNull;
    } // end isConfigFormNull()

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

        if ((obj instanceof WorkspaceConfig) == false) {
            return false;
        } // end if

        WorkspaceConfig other = (WorkspaceConfig) obj;

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

        buffer.append("configItem=");
        buffer.append(this.configItem);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("parentConfigId=");
        buffer.append(this.parentConfigId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("configName=");
        buffer.append(this.configName);
        buffer.append("\r\n");

        buffer.append("configForm=");
        buffer.append(this.configForm);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end WorkspaceConfig
