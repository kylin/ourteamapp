/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:21
 *
 * @model auto gen
 */
public class ResourceTypeBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.resource.dao.ResourceType objResourceType;

    static {
        mappedDaoFields.put("id", com.ourteam.resource.dao.IResourceTypeDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.resource.dao.IResourceTypeDAO.Code);

        mappedDaoFields.put("name",
            com.ourteam.resource.dao.IResourceTypeDAO.Name);

        mappedDaoFields.put("remarks",
            com.ourteam.resource.dao.IResourceTypeDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.resource.dao.IResourceTypeDAO.Status);
    } 

    /**
     * Creates a new ResourceTypeBean object.
     */
    public ResourceTypeBean() {
        super();

        objResourceType = new com.ourteam.resource.dao.ResourceType();
    } // end ResourceTypeBean()

    /**
     * Creates a new ResourceTypeBean object.
     *
     * @param aResourceType DOCUMENT ME!
     */
    public ResourceTypeBean(com.ourteam.resource.dao.ResourceType aResourceType) {
        super();

        objResourceType = aResourceType;
    } // end ResourceTypeBean()

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
    public com.ourteam.resource.dao.ResourceType convertToResourceType() {
        return objResourceType;
    } // end convertToResourceType()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objResourceType.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objResourceType.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objResourceType.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objResourceType.setCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objResourceType.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objResourceType.setName(aName);
    } // end setName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objResourceType.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objResourceType.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objResourceType.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objResourceType.setStatus(aStatus);
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

        if ((obj instanceof ResourceTypeBean) == false) {
            return false;
        } // end if

        ResourceTypeBean other = (ResourceTypeBean) obj;

        boolean isEqual = false;

        com.ourteam.resource.dao.ResourceType tempResourceType = other.convertToResourceType();

        if ((tempResourceType == null) || (this.objResourceType == null)) {
            isEqual = false;
        } // end if
        else if ((tempResourceType == this.objResourceType) ||
                tempResourceType.equals(this.objResourceType)) {
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
     * @param aResourceTypes DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourceTypeBean[] toArray(
        com.ourteam.resource.dao.ResourceType[] aResourceTypes) {
        return toArray(aResourceTypes, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceTypes DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourceTypeBean[] toArray(
        com.ourteam.resource.dao.ResourceType[] aResourceTypes,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aResourceTypes)) {
            return new ResourceTypeBean[0];
        } // end if

        int length = aResourceTypes.length;

        ResourceTypeBean[] beans = new ResourceTypeBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourceTypeBean(aResourceTypes[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourceTypeBean(aResourceTypes[i]);

                aCallBack.populate(beans[i], new Object[] { aResourceTypes[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ResourceTypeBean
