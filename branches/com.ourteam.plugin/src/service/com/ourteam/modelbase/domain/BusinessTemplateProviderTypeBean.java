/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:33
 *
 * @model auto gen
 */
public class BusinessTemplateProviderTypeBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessTemplateProviderType objBusinessTemplateProviderType;

    static {
        mappedDaoFields.put("id",
            com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO.Id);

        mappedDaoFields.put("businessObjectType",
            com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO.BusinessObjectType);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO.Description);

        mappedDaoFields.put("filePath",
            com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO.FilePath);

        mappedDaoFields.put("providerName",
            com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO.ProviderName);

        mappedDaoFields.put("providerType",
            com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO.ProviderType);

        mappedDaoFields.put("status",
            com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO.Status);
    } 

    /**
     * Creates a new BusinessTemplateProviderTypeBean object.
     */
    public BusinessTemplateProviderTypeBean() {
        super();

        objBusinessTemplateProviderType = new com.ourteam.modelbase.dao.BusinessTemplateProviderType();
    } // end BusinessTemplateProviderTypeBean()

    /**
     * Creates a new BusinessTemplateProviderTypeBean object.
     *
     * @param aBusinessTemplateProviderType DOCUMENT ME!
     */
    public BusinessTemplateProviderTypeBean(
        com.ourteam.modelbase.dao.BusinessTemplateProviderType aBusinessTemplateProviderType) {
        super();

        objBusinessTemplateProviderType = aBusinessTemplateProviderType;
    } // end BusinessTemplateProviderTypeBean()

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
    public com.ourteam.modelbase.dao.BusinessTemplateProviderType convertToBusinessTemplateProviderType() {
        return objBusinessTemplateProviderType;
    } // end convertToBusinessTemplateProviderType()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBusinessTemplateProviderType.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBusinessTemplateProviderType.setId(aId);
    } // end setId()

    /**
     * Get BusinessObjectType
     *
     * @return businessObjectType
     */
    public String getBusinessObjectType() {
        return objBusinessTemplateProviderType.getBusinessObjectType();
    } // end getBusinessObjectType()

    /**
     * Set BusinessObjectType
     *
     * @param aBusinessObjectType
     */
    public void setBusinessObjectType(String aBusinessObjectType) {
        this.objBusinessTemplateProviderType.setBusinessObjectType(aBusinessObjectType);
    } // end setBusinessObjectType()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objBusinessTemplateProviderType.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objBusinessTemplateProviderType.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get FilePath
     *
     * @return filePath
     */
    public String getFilePath() {
        return objBusinessTemplateProviderType.getFilePath();
    } // end getFilePath()

    /**
     * Set FilePath
     *
     * @param aFilePath
     */
    public void setFilePath(String aFilePath) {
        this.objBusinessTemplateProviderType.setFilePath(aFilePath);
    } // end setFilePath()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    public String getProviderName() {
        return objBusinessTemplateProviderType.getProviderName();
    } // end getProviderName()

    /**
     * Set ProviderName
     *
     * @param aProviderName
     */
    public void setProviderName(String aProviderName) {
        this.objBusinessTemplateProviderType.setProviderName(aProviderName);
    } // end setProviderName()

    /**
     * Get ProviderType
     *
     * @return providerType
     */
    public String getProviderType() {
        return objBusinessTemplateProviderType.getProviderType();
    } // end getProviderType()

    /**
     * Set ProviderType
     *
     * @param aProviderType
     */
    public void setProviderType(String aProviderType) {
        this.objBusinessTemplateProviderType.setProviderType(aProviderType);
    } // end setProviderType()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBusinessTemplateProviderType.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBusinessTemplateProviderType.setStatus(aStatus);
    } // end setStatus()

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

        if ((obj instanceof BusinessTemplateProviderTypeBean) == false) {
            return false;
        } // end if

        BusinessTemplateProviderTypeBean other = (BusinessTemplateProviderTypeBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessTemplateProviderType tempBusinessTemplateProviderType =
            other.convertToBusinessTemplateProviderType();

        if ((tempBusinessTemplateProviderType == null) ||
                (this.objBusinessTemplateProviderType == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessTemplateProviderType == this.objBusinessTemplateProviderType) ||
                tempBusinessTemplateProviderType.equals(
                    this.objBusinessTemplateProviderType)) {
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
     * @param aBusinessTemplateProviderTypes DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessTemplateProviderTypeBean[] toArray(
        com.ourteam.modelbase.dao.BusinessTemplateProviderType[] aBusinessTemplateProviderTypes) {
        return toArray(aBusinessTemplateProviderTypes, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplateProviderTypes DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessTemplateProviderTypeBean[] toArray(
        com.ourteam.modelbase.dao.BusinessTemplateProviderType[] aBusinessTemplateProviderTypes,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aBusinessTemplateProviderTypes)) {
            return new BusinessTemplateProviderTypeBean[0];
        } // end if

        int length = aBusinessTemplateProviderTypes.length;

        BusinessTemplateProviderTypeBean[] beans = new BusinessTemplateProviderTypeBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessTemplateProviderTypeBean(aBusinessTemplateProviderTypes[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessTemplateProviderTypeBean(aBusinessTemplateProviderTypes[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessTemplateProviderTypes[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessTemplateProviderTypeBean
