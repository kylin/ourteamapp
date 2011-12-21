/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * Generate Date 2011-09-22 10:16:39
 *
 * @author Auto Gen
 */
public class BusinessTemplate implements java.io.Serializable {
    /**
     * Creates a new BusinessTemplate object.
     */
    public BusinessTemplate() {
        super();
    } // end BusinessTemplate()

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
    private long providerTypeId;

    /** Attribute  Be Seted Falg */
    private boolean providerTypeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerTypeIdNull = false;

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
    private long templateId;

    /** Attribute  Be Seted Falg */
    private boolean templateIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean templateIdNull = false;

    /** Attribute */
    private String templateName;

    /** Attribute  Be Seted Falg */
    private boolean templateNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean templateNameNull = false;

    /** Attribute */
    private String templateDescription;

    /** Attribute  Be Seted Falg */
    private boolean templateDescriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean templateDescriptionNull = false;

    /** Attribute */
    private String fileName;

    /** Attribute  Be Seted Falg */
    private boolean fileNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean fileNameNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String canOverWrite;

    /** Attribute  Be Seted Falg */
    private boolean canOverWriteSetted = false;

    /** Attribute  is Null Falg */
    private boolean canOverWriteNull = false;

    /** Attribute */
    private String fileType;

    /** Attribute  Be Seted Falg */
    private boolean fileTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean fileTypeNull = false;

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
     * Get ProviderTypeId
     *
     * @return providerTypeId
     */
    final public long getProviderTypeId() {
        return providerTypeId;
    } // end getProviderTypeId()

    /**
     * Set ProviderTypeId
     *
     * @param aProviderTypeId
     */
    final public void setProviderTypeId(long aProviderTypeId) {
        this.providerTypeId = aProviderTypeId;

        this.providerTypeIdSetted = true;

        this.setProviderTypeIdNull(false);
    } // end setProviderTypeId()

    /**
     * Get ProviderTypeId Has Been Setted
     *
     * @return providerTypeId
     */
    final public boolean isProviderTypeIdSetted() {
        return this.providerTypeIdSetted;
    } // end isProviderTypeIdSetted()

    /**
     * Set ProviderTypeId Null
     */
    final public void setProviderTypeIdNull() {
        this.providerTypeIdNull = true;
    } // end setProviderTypeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderTypeIdNull(boolean aNullFlag) {
        this.providerTypeIdNull = aNullFlag;
    } // end setProviderTypeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderTypeIdNull() {
        return this.providerTypeIdNull;
    } // end isProviderTypeIdNull()

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
     * Get TemplateId
     *
     * @return templateId
     */
    final public long getTemplateId() {
        return templateId;
    } // end getTemplateId()

    /**
     * Set TemplateId
     *
     * @param aTemplateId
     */
    final public void setTemplateId(long aTemplateId) {
        this.templateId = aTemplateId;

        this.templateIdSetted = true;

        this.setTemplateIdNull(false);
    } // end setTemplateId()

    /**
     * Get TemplateId Has Been Setted
     *
     * @return templateId
     */
    final public boolean isTemplateIdSetted() {
        return this.templateIdSetted;
    } // end isTemplateIdSetted()

    /**
     * Set TemplateId Null
     */
    final public void setTemplateIdNull() {
        this.templateIdNull = true;
    } // end setTemplateIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTemplateIdNull(boolean aNullFlag) {
        this.templateIdNull = aNullFlag;
    } // end setTemplateIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTemplateIdNull() {
        return this.templateIdNull;
    } // end isTemplateIdNull()

    /**
     * Get TemplateName
     *
     * @return templateName
     */
    final public String getTemplateName() {
        return templateName;
    } // end getTemplateName()

    /**
     * Set TemplateName
     *
     * @param aTemplateName
     */
    final public void setTemplateName(String aTemplateName) {
        this.templateName = aTemplateName;

        this.templateNameSetted = true;

        this.setTemplateNameNull(this.templateName == null);
    } // end setTemplateName()

    /**
     * Get TemplateName Has Been Setted
     *
     * @return templateName
     */
    final public boolean isTemplateNameSetted() {
        return this.templateNameSetted;
    } // end isTemplateNameSetted()

    /**
     * Set TemplateName Null
     */
    final public void setTemplateNameNull() {
        this.templateNameNull = true;
    } // end setTemplateNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTemplateNameNull(boolean aNullFlag) {
        this.templateNameNull = aNullFlag;
    } // end setTemplateNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTemplateNameNull() {
        return this.templateNameNull;
    } // end isTemplateNameNull()

    /**
     * Get TemplateDescription
     *
     * @return templateDescription
     */
    final public String getTemplateDescription() {
        if (isTemplateDescriptionNull()) {
            return null;
        } // end if
        else {
            return templateDescription;
        } // end else
    } // end getTemplateDescription()

    /**
     * Set TemplateDescription
     *
     * @param aTemplateDescription
     */
    final public void setTemplateDescription(String aTemplateDescription) {
        this.templateDescription = aTemplateDescription;

        this.templateDescriptionSetted = true;

        this.setTemplateDescriptionNull(this.templateDescription == null);
    } // end setTemplateDescription()

    /**
     * Get TemplateDescription Has Been Setted
     *
     * @return templateDescription
     */
    final public boolean isTemplateDescriptionSetted() {
        return this.templateDescriptionSetted;
    } // end isTemplateDescriptionSetted()

    /**
     * Set TemplateDescription Null
     */
    final public void setTemplateDescriptionNull() {
        this.templateDescriptionNull = true;
    } // end setTemplateDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTemplateDescriptionNull(boolean aNullFlag) {
        this.templateDescriptionNull = aNullFlag;
    } // end setTemplateDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTemplateDescriptionNull() {
        return this.templateDescriptionNull;
    } // end isTemplateDescriptionNull()

    /**
     * Get FileName
     *
     * @return fileName
     */
    final public String getFileName() {
        return fileName;
    } // end getFileName()

    /**
     * Set FileName
     *
     * @param aFileName
     */
    final public void setFileName(String aFileName) {
        this.fileName = aFileName;

        this.fileNameSetted = true;

        this.setFileNameNull(this.fileName == null);
    } // end setFileName()

    /**
     * Get FileName Has Been Setted
     *
     * @return fileName
     */
    final public boolean isFileNameSetted() {
        return this.fileNameSetted;
    } // end isFileNameSetted()

    /**
     * Set FileName Null
     */
    final public void setFileNameNull() {
        this.fileNameNull = true;
    } // end setFileNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFileNameNull(boolean aNullFlag) {
        this.fileNameNull = aNullFlag;
    } // end setFileNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFileNameNull() {
        return this.fileNameNull;
    } // end isFileNameNull()

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
     * Get CanOverWrite
     *
     * @return canOverWrite
     */
    final public String getCanOverWrite() {
        return canOverWrite;
    } // end getCanOverWrite()

    /**
     * Set CanOverWrite
     *
     * @param aCanOverWrite
     */
    final public void setCanOverWrite(String aCanOverWrite) {
        this.canOverWrite = aCanOverWrite;

        this.canOverWriteSetted = true;

        this.setCanOverWriteNull(this.canOverWrite == null);
    } // end setCanOverWrite()

    /**
     * Get CanOverWrite Has Been Setted
     *
     * @return canOverWrite
     */
    final public boolean isCanOverWriteSetted() {
        return this.canOverWriteSetted;
    } // end isCanOverWriteSetted()

    /**
     * Set CanOverWrite Null
     */
    final public void setCanOverWriteNull() {
        this.canOverWriteNull = true;
    } // end setCanOverWriteNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCanOverWriteNull(boolean aNullFlag) {
        this.canOverWriteNull = aNullFlag;
    } // end setCanOverWriteNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCanOverWriteNull() {
        return this.canOverWriteNull;
    } // end isCanOverWriteNull()

    /**
     * Get FileType
     *
     * @return fileType
     */
    final public String getFileType() {
        return fileType;
    } // end getFileType()

    /**
     * Set FileType
     *
     * @param aFileType
     */
    final public void setFileType(String aFileType) {
        this.fileType = aFileType;

        this.fileTypeSetted = true;

        this.setFileTypeNull(this.fileType == null);
    } // end setFileType()

    /**
     * Get FileType Has Been Setted
     *
     * @return fileType
     */
    final public boolean isFileTypeSetted() {
        return this.fileTypeSetted;
    } // end isFileTypeSetted()

    /**
     * Set FileType Null
     */
    final public void setFileTypeNull() {
        this.fileTypeNull = true;
    } // end setFileTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFileTypeNull(boolean aNullFlag) {
        this.fileTypeNull = aNullFlag;
    } // end setFileTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFileTypeNull() {
        return this.fileTypeNull;
    } // end isFileTypeNull()

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

        if ((obj instanceof BusinessTemplate) == false) {
            return false;
        } // end if

        BusinessTemplate other = (BusinessTemplate) obj;

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

        buffer.append("providerTypeId=");
        buffer.append(this.providerTypeId);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("templateId=");
        buffer.append(this.templateId);
        buffer.append("\r\n");

        buffer.append("templateName=");
        buffer.append(this.templateName);
        buffer.append("\r\n");

        buffer.append("templateDescription=");
        buffer.append(this.templateDescription);
        buffer.append("\r\n");

        buffer.append("fileName=");
        buffer.append(this.fileName);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("canOverWrite=");
        buffer.append(this.canOverWrite);
        buffer.append("\r\n");

        buffer.append("fileType=");
        buffer.append(this.fileType);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BusinessTemplate
