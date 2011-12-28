/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-28 11:24:40
 *
 * @model auto gen
 */
public class BusinessTemplateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessTemplate objBusinessTemplate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.Id);

        mappedDaoFields.put("businessObjectType",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.BusinessObjectType);

        mappedDaoFields.put("providerTypeId",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.ProviderTypeId);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.Description);

        mappedDaoFields.put("status",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.Status);

        mappedDaoFields.put("templateId",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.TemplateId);

        mappedDaoFields.put("templateName",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.TemplateName);

        mappedDaoFields.put("templateDescription",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.TemplateDescription);

        mappedDaoFields.put("fileName",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.FileName);

        mappedDaoFields.put("name",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.Name);

        mappedDaoFields.put("canOverWrite",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.CanOverWrite);

        mappedDaoFields.put("fileType",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.FileType);

        mappedDaoFields.put("fileNamePrefix",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.FileNamePrefix);

        mappedDaoFields.put("fileNamePostfix",
            com.ourteam.modelbase.dao.IBusinessTemplateDAO.FileNamePostfix);
    } 

    /**
     * Creates a new BusinessTemplateBean object.
     */
    public BusinessTemplateBean() {
        super();

        objBusinessTemplate = new com.ourteam.modelbase.dao.BusinessTemplate();
    } // end BusinessTemplateBean()

    /**
     * Creates a new BusinessTemplateBean object.
     *
     * @param aBusinessTemplate DOCUMENT ME!
     */
    public BusinessTemplateBean(
        com.ourteam.modelbase.dao.BusinessTemplate aBusinessTemplate) {
        super();

        objBusinessTemplate = aBusinessTemplate;
    } // end BusinessTemplateBean()

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
    public com.ourteam.modelbase.dao.BusinessTemplate convertToBusinessTemplate() {
        return objBusinessTemplate;
    } // end convertToBusinessTemplate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBusinessTemplate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBusinessTemplate.setId(aId);
    } // end setId()

    /**
     * Get BusinessObjectType
     *
     * @return businessObjectType
     */
    public String getBusinessObjectType() {
        return objBusinessTemplate.getBusinessObjectType();
    } // end getBusinessObjectType()

    /**
     * Set BusinessObjectType
     *
     * @param aBusinessObjectType
     */
    public void setBusinessObjectType(String aBusinessObjectType) {
        this.objBusinessTemplate.setBusinessObjectType(aBusinessObjectType);
    } // end setBusinessObjectType()

    /**
     * Get ProviderTypeId
     *
     * @return providerTypeId
     */
    public long getProviderTypeId() {
        return objBusinessTemplate.getProviderTypeId();
    } // end getProviderTypeId()

    /**
     * Set ProviderTypeId
     *
     * @param aProviderTypeId
     */
    public void setProviderTypeId(long aProviderTypeId) {
        this.objBusinessTemplate.setProviderTypeId(aProviderTypeId);
    } // end setProviderTypeId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objBusinessTemplate.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objBusinessTemplate.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBusinessTemplate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBusinessTemplate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TemplateId
     *
     * @return templateId
     */
    public long getTemplateId() {
        return objBusinessTemplate.getTemplateId();
    } // end getTemplateId()

    /**
     * Set TemplateId
     *
     * @param aTemplateId
     */
    public void setTemplateId(long aTemplateId) {
        this.objBusinessTemplate.setTemplateId(aTemplateId);
    } // end setTemplateId()

    /**
     * Get TemplateName
     *
     * @return templateName
     */
    public String getTemplateName() {
        return objBusinessTemplate.getTemplateName();
    } // end getTemplateName()

    /**
     * Set TemplateName
     *
     * @param aTemplateName
     */
    public void setTemplateName(String aTemplateName) {
        this.objBusinessTemplate.setTemplateName(aTemplateName);
    } // end setTemplateName()

    /**
     * Get TemplateDescription
     *
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return objBusinessTemplate.getTemplateDescription();
    } // end getTemplateDescription()

    /**
     * Set TemplateDescription
     *
     * @param aTemplateDescription
     */
    public void setTemplateDescription(String aTemplateDescription) {
        this.objBusinessTemplate.setTemplateDescription(aTemplateDescription);
    } // end setTemplateDescription()

    /**
     * Get FileName
     *
     * @return fileName
     */
    public String getFileName() {
        return objBusinessTemplate.getFileName();
    } // end getFileName()

    /**
     * Set FileName
     *
     * @param aFileName
     */
    public void setFileName(String aFileName) {
        this.objBusinessTemplate.setFileName(aFileName);
    } // end setFileName()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objBusinessTemplate.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objBusinessTemplate.setName(aName);
    } // end setName()

    /**
     * Get CanOverWrite
     *
     * @return canOverWrite
     */
    public String getCanOverWrite() {
        return objBusinessTemplate.getCanOverWrite();
    } // end getCanOverWrite()

    /**
     * Set CanOverWrite
     *
     * @param aCanOverWrite
     */
    public void setCanOverWrite(String aCanOverWrite) {
        this.objBusinessTemplate.setCanOverWrite(aCanOverWrite);
    } // end setCanOverWrite()

    /**
     * Get FileType
     *
     * @return fileType
     */
    public String getFileType() {
        return objBusinessTemplate.getFileType();
    } // end getFileType()

    /**
     * Set FileType
     *
     * @param aFileType
     */
    public void setFileType(String aFileType) {
        this.objBusinessTemplate.setFileType(aFileType);
    } // end setFileType()

    /**
     * Get FileNamePrefix
     *
     * @return fileNamePrefix
     */
    public String getFileNamePrefix() {
        return objBusinessTemplate.getFileNamePrefix();
    } // end getFileNamePrefix()

    /**
     * Set FileNamePrefix
     *
     * @param aFileNamePrefix
     */
    public void setFileNamePrefix(String aFileNamePrefix) {
        this.objBusinessTemplate.setFileNamePrefix(aFileNamePrefix);
    } // end setFileNamePrefix()

    /**
     * Get FileNamePostfix
     *
     * @return fileNamePostfix
     */
    public String getFileNamePostfix() {
        return objBusinessTemplate.getFileNamePostfix();
    } // end getFileNamePostfix()

    /**
     * Set FileNamePostfix
     *
     * @param aFileNamePostfix
     */
    public void setFileNamePostfix(String aFileNamePostfix) {
        this.objBusinessTemplate.setFileNamePostfix(aFileNamePostfix);
    } // end setFileNamePostfix()

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

        if ((obj instanceof BusinessTemplateBean) == false) {
            return false;
        } // end if

        BusinessTemplateBean other = (BusinessTemplateBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessTemplate tempBusinessTemplate = other.convertToBusinessTemplate();

        if ((tempBusinessTemplate == null) ||
                (this.objBusinessTemplate == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessTemplate == this.objBusinessTemplate) ||
                tempBusinessTemplate.equals(this.objBusinessTemplate)) {
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
     * @param aBusinessTemplates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessTemplateBean[] toArray(
        com.ourteam.modelbase.dao.BusinessTemplate[] aBusinessTemplates) {
        return toArray(aBusinessTemplates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessTemplateBean[] toArray(
        com.ourteam.modelbase.dao.BusinessTemplate[] aBusinessTemplates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBusinessTemplates)) {
            return new BusinessTemplateBean[0];
        } // end if

        int length = aBusinessTemplates.length;

        BusinessTemplateBean[] beans = new BusinessTemplateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessTemplateBean(aBusinessTemplates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessTemplateBean(aBusinessTemplates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessTemplates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessTemplateBean
