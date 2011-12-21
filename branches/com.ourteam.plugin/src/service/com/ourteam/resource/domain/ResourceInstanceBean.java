/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:20
 *
 * @model auto gen
 */
public class ResourceInstanceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.resource.dao.ResourceInstance objResourceInstance;

    static {
        mappedDaoFields.put("id",
            com.ourteam.resource.dao.IResourceInstanceDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.resource.dao.IResourceInstanceDAO.Code);

        mappedDaoFields.put("name",
            com.ourteam.resource.dao.IResourceInstanceDAO.Name);

        mappedDaoFields.put("remarks",
            com.ourteam.resource.dao.IResourceInstanceDAO.Remarks);

        mappedDaoFields.put("resourceTypeId",
            com.ourteam.resource.dao.IResourceInstanceDAO.ResourceTypeId);

        mappedDaoFields.put("status",
            com.ourteam.resource.dao.IResourceInstanceDAO.Status);

        mappedDaoFields.put("resourceTypeCode",
            com.ourteam.resource.dao.IResourceInstanceDAO.ResourceTypeCode);

        mappedDaoFields.put("resourceTypeName",
            com.ourteam.resource.dao.IResourceInstanceDAO.ResourceTypeName);

        mappedDaoFields.put("resourceTypeStatus",
            com.ourteam.resource.dao.IResourceInstanceDAO.ResourceTypeStatus);
    } 

    /**
     * Creates a new ResourceInstanceBean object.
     */
    public ResourceInstanceBean() {
        super();

        objResourceInstance = new com.ourteam.resource.dao.ResourceInstance();
    } // end ResourceInstanceBean()

    /**
     * Creates a new ResourceInstanceBean object.
     *
     * @param aResourceInstance DOCUMENT ME!
     */
    public ResourceInstanceBean(
        com.ourteam.resource.dao.ResourceInstance aResourceInstance) {
        super();

        objResourceInstance = aResourceInstance;
    } // end ResourceInstanceBean()

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
    public com.ourteam.resource.dao.ResourceInstance convertToResourceInstance() {
        return objResourceInstance;
    } // end convertToResourceInstance()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objResourceInstance.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objResourceInstance.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objResourceInstance.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objResourceInstance.setCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objResourceInstance.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objResourceInstance.setName(aName);
    } // end setName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objResourceInstance.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objResourceInstance.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ResourceTypeId
     *
     * @return resourceTypeId
     */
    public long getResourceTypeId() {
        return objResourceInstance.getResourceTypeId();
    } // end getResourceTypeId()

    /**
     * Set ResourceTypeId
     *
     * @param aResourceTypeId
     */
    public void setResourceTypeId(long aResourceTypeId) {
        this.objResourceInstance.setResourceTypeId(aResourceTypeId);
    } // end setResourceTypeId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objResourceInstance.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objResourceInstance.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ResourceTypeCode
     *
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return objResourceInstance.getResourceTypeCode();
    } // end getResourceTypeCode()

    /**
     * Get ResourceTypeName
     *
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return objResourceInstance.getResourceTypeName();
    } // end getResourceTypeName()

    /**
     * Get ResourceTypeStatus
     *
     * @return resourceTypeStatus
     */
    public String getResourceTypeStatus() {
        return objResourceInstance.getResourceTypeStatus();
    } // end getResourceTypeStatus()

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

        if ((obj instanceof ResourceInstanceBean) == false) {
            return false;
        } // end if

        ResourceInstanceBean other = (ResourceInstanceBean) obj;

        boolean isEqual = false;

        com.ourteam.resource.dao.ResourceInstance tempResourceInstance = other.convertToResourceInstance();

        if ((tempResourceInstance == null) ||
                (this.objResourceInstance == null)) {
            isEqual = false;
        } // end if
        else if ((tempResourceInstance == this.objResourceInstance) ||
                tempResourceInstance.equals(this.objResourceInstance)) {
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
     * @param aResourceInstances DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourceInstanceBean[] toArray(
        com.ourteam.resource.dao.ResourceInstance[] aResourceInstances) {
        return toArray(aResourceInstances, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceInstances DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourceInstanceBean[] toArray(
        com.ourteam.resource.dao.ResourceInstance[] aResourceInstances,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aResourceInstances)) {
            return new ResourceInstanceBean[0];
        } // end if

        int length = aResourceInstances.length;

        ResourceInstanceBean[] beans = new ResourceInstanceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourceInstanceBean(aResourceInstances[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourceInstanceBean(aResourceInstances[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aResourceInstances[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ResourceInstanceBean
