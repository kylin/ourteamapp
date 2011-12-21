/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * Generate Date 2011-09-22 10:16:40
 *
 * @author Auto Gen
 */
public class BusinessTemplateProviderType implements java.io.Serializable {
    /**
     * Creates a new BusinessTemplateProviderType object.
     */
    public BusinessTemplateProviderType() {
        super();
    } // end BusinessTemplateProviderType()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String businessObjectType;

    /** Attribute  Be Seted Falg */
    private boolean businessObjectTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessObjectTypeNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private String filePath;

    /** Attribute  Be Seted Falg */
    private boolean filePathSetted = false;

    /** Attribute  is Null Falg */
    private boolean filePathNull = false;

    /** Attribute */
    private String providerName;

    /** Attribute  Be Seted Falg */
    private boolean providerNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerNameNull = false;

    /** Attribute */
    private String providerType;

    /** Attribute  Be Seted Falg */
    private boolean providerTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerTypeNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

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
     * Get BusinessObjectType
     *
     * @return businessObjectType
     */
    final public String getBusinessObjectType() {
        return businessObjectType;
    } // end getBusinessObjectType()

    /**
     * Set BusinessObjectType
     *
     * @param aBusinessObjectType
     */
    final public void setBusinessObjectType(String aBusinessObjectType) {
        this.businessObjectType = aBusinessObjectType;

        this.businessObjectTypeSetted = true;

        this.setBusinessObjectTypeNull(this.businessObjectType == null);
    } // end setBusinessObjectType()

    /**
     * Get BusinessObjectType Has Been Setted
     *
     * @return businessObjectType
     */
    final public boolean isBusinessObjectTypeSetted() {
        return this.businessObjectTypeSetted;
    } // end isBusinessObjectTypeSetted()

    /**
     * Set BusinessObjectType Null
     */
    final public void setBusinessObjectTypeNull() {
        this.businessObjectTypeNull = true;
    } // end setBusinessObjectTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessObjectTypeNull(boolean aNullFlag) {
        this.businessObjectTypeNull = aNullFlag;
    } // end setBusinessObjectTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessObjectTypeNull() {
        return this.businessObjectTypeNull;
    } // end isBusinessObjectTypeNull()

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
     * Get FilePath
     *
     * @return filePath
     */
    final public String getFilePath() {
        if (isFilePathNull()) {
            return null;
        } // end if
        else {
            return filePath;
        } // end else
    } // end getFilePath()

    /**
     * Set FilePath
     *
     * @param aFilePath
     */
    final public void setFilePath(String aFilePath) {
        this.filePath = aFilePath;

        this.filePathSetted = true;

        this.setFilePathNull(this.filePath == null);
    } // end setFilePath()

    /**
     * Get FilePath Has Been Setted
     *
     * @return filePath
     */
    final public boolean isFilePathSetted() {
        return this.filePathSetted;
    } // end isFilePathSetted()

    /**
     * Set FilePath Null
     */
    final public void setFilePathNull() {
        this.filePathNull = true;
    } // end setFilePathNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFilePathNull(boolean aNullFlag) {
        this.filePathNull = aNullFlag;
    } // end setFilePathNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFilePathNull() {
        return this.filePathNull;
    } // end isFilePathNull()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    final public String getProviderName() {
        return providerName;
    } // end getProviderName()

    /**
     * Set ProviderName
     *
     * @param aProviderName
     */
    final public void setProviderName(String aProviderName) {
        this.providerName = aProviderName;

        this.providerNameSetted = true;

        this.setProviderNameNull(this.providerName == null);
    } // end setProviderName()

    /**
     * Get ProviderName Has Been Setted
     *
     * @return providerName
     */
    final public boolean isProviderNameSetted() {
        return this.providerNameSetted;
    } // end isProviderNameSetted()

    /**
     * Set ProviderName Null
     */
    final public void setProviderNameNull() {
        this.providerNameNull = true;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderNameNull(boolean aNullFlag) {
        this.providerNameNull = aNullFlag;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderNameNull() {
        return this.providerNameNull;
    } // end isProviderNameNull()

    /**
     * Get ProviderType
     *
     * @return providerType
     */
    final public String getProviderType() {
        return providerType;
    } // end getProviderType()

    /**
     * Set ProviderType
     *
     * @param aProviderType
     */
    final public void setProviderType(String aProviderType) {
        this.providerType = aProviderType;

        this.providerTypeSetted = true;

        this.setProviderTypeNull(this.providerType == null);
    } // end setProviderType()

    /**
     * Get ProviderType Has Been Setted
     *
     * @return providerType
     */
    final public boolean isProviderTypeSetted() {
        return this.providerTypeSetted;
    } // end isProviderTypeSetted()

    /**
     * Set ProviderType Null
     */
    final public void setProviderTypeNull() {
        this.providerTypeNull = true;
    } // end setProviderTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderTypeNull(boolean aNullFlag) {
        this.providerTypeNull = aNullFlag;
    } // end setProviderTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderTypeNull() {
        return this.providerTypeNull;
    } // end isProviderTypeNull()

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

        if ((obj instanceof BusinessTemplateProviderType) == false) {
            return false;
        } // end if

        BusinessTemplateProviderType other = (BusinessTemplateProviderType) obj;

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

        buffer.append("businessObjectType=");
        buffer.append(this.businessObjectType);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("filePath=");
        buffer.append(this.filePath);
        buffer.append("\r\n");

        buffer.append("providerName=");
        buffer.append(this.providerName);
        buffer.append("\r\n");

        buffer.append("providerType=");
        buffer.append(this.providerType);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BusinessTemplateProviderType
