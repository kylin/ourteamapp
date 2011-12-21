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
public class ResourcePropertyInstanceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.resource.dao.ResourcePropertyInstance objResourcePropertyInstance;

    static {
        mappedDaoFields.put("id",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.Id);

        mappedDaoFields.put("remarks",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.Remarks);

        mappedDaoFields.put("resourceInstanceId",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.ResourceInstanceId);

        mappedDaoFields.put("resourcePropertyId",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.ResourcePropertyId);

        mappedDaoFields.put("status",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.Status);

        mappedDaoFields.put("value",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.Value);

        mappedDaoFields.put("propertyCode",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.PropertyCode);

        mappedDaoFields.put("propertyName",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.PropertyName);

        mappedDaoFields.put("propertyDataType",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.PropertyDataType);

        mappedDaoFields.put("propertySortIndex",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.PropertySortIndex);

        mappedDaoFields.put("propertyStatus",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.PropertyStatus);

        mappedDaoFields.put("resourceTypeId",
            com.ourteam.resource.dao.IResourcePropertyInstanceDAO.ResourceTypeId);
    } 

    /**
     * Creates a new ResourcePropertyInstanceBean object.
     */
    public ResourcePropertyInstanceBean() {
        super();

        objResourcePropertyInstance = new com.ourteam.resource.dao.ResourcePropertyInstance();
    } // end ResourcePropertyInstanceBean()

    /**
     * Creates a new ResourcePropertyInstanceBean object.
     *
     * @param aResourcePropertyInstance DOCUMENT ME!
     */
    public ResourcePropertyInstanceBean(
        com.ourteam.resource.dao.ResourcePropertyInstance aResourcePropertyInstance) {
        super();

        objResourcePropertyInstance = aResourcePropertyInstance;
    } // end ResourcePropertyInstanceBean()

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
    public com.ourteam.resource.dao.ResourcePropertyInstance convertToResourcePropertyInstance() {
        return objResourcePropertyInstance;
    } // end convertToResourcePropertyInstance()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objResourcePropertyInstance.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objResourcePropertyInstance.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objResourcePropertyInstance.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objResourcePropertyInstance.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ResourceInstanceId
     *
     * @return resourceInstanceId
     */
    public long getResourceInstanceId() {
        return objResourcePropertyInstance.getResourceInstanceId();
    } // end getResourceInstanceId()

    /**
     * Get ResourcePropertyId
     *
     * @return resourcePropertyId
     */
    public long getResourcePropertyId() {
        return objResourcePropertyInstance.getResourcePropertyId();
    } // end getResourcePropertyId()

    /**
     * Set ResourcePropertyId
     *
     * @param aResourcePropertyId
     */
    public void setResourcePropertyId(long aResourcePropertyId) {
        this.objResourcePropertyInstance.setResourcePropertyId(aResourcePropertyId);
    } // end setResourcePropertyId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objResourcePropertyInstance.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objResourcePropertyInstance.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Value
     *
     * @return value
     */
    public String getValue() {
        return objResourcePropertyInstance.getValue();
    } // end getValue()

    /**
     * Set Value
     *
     * @param aValue
     */
    public void setValue(String aValue) {
        this.objResourcePropertyInstance.setValue(aValue);
    } // end setValue()

    /**
     * Get PropertyCode
     *
     * @return propertyCode
     */
    public String getPropertyCode() {
        return objResourcePropertyInstance.getPropertyCode();
    } // end getPropertyCode()

    /**
     * Set PropertyCode
     *
     * @param aPropertyCode
     */
    public void setPropertyCode(String aPropertyCode) {
        this.objResourcePropertyInstance.setPropertyCode(aPropertyCode);
    } // end setPropertyCode()

    /**
     * Get PropertyName
     *
     * @return propertyName
     */
    public String getPropertyName() {
        return objResourcePropertyInstance.getPropertyName();
    } // end getPropertyName()

    /**
     * Set PropertyName
     *
     * @param aPropertyName
     */
    public void setPropertyName(String aPropertyName) {
        this.objResourcePropertyInstance.setPropertyName(aPropertyName);
    } // end setPropertyName()

    /**
     * Get PropertyDataType
     *
     * @return propertyDataType
     */
    public String getPropertyDataType() {
        return objResourcePropertyInstance.getPropertyDataType();
    } // end getPropertyDataType()

    /**
     * Set PropertyDataType
     *
     * @param aPropertyDataType
     */
    public void setPropertyDataType(String aPropertyDataType) {
        this.objResourcePropertyInstance.setPropertyDataType(aPropertyDataType);
    } // end setPropertyDataType()

    /**
     * Get PropertySortIndex
     *
     * @return propertySortIndex
     */
    public int getPropertySortIndex() {
        return objResourcePropertyInstance.getPropertySortIndex();
    } // end getPropertySortIndex()

    /**
     * Set PropertySortIndex
     *
     * @param aPropertySortIndex
     */
    public void setPropertySortIndex(int aPropertySortIndex) {
        this.objResourcePropertyInstance.setPropertySortIndex(aPropertySortIndex);
    } // end setPropertySortIndex()

    /**
     * Get PropertyStatus
     *
     * @return propertyStatus
     */
    public String getPropertyStatus() {
        return objResourcePropertyInstance.getPropertyStatus();
    } // end getPropertyStatus()

    /**
     * Set PropertyStatus
     *
     * @param aPropertyStatus
     */
    public void setPropertyStatus(String aPropertyStatus) {
        this.objResourcePropertyInstance.setPropertyStatus(aPropertyStatus);
    } // end setPropertyStatus()

    /**
     * Get ResourceTypeId
     *
     * @return resourceTypeId
     */
    public long getResourceTypeId() {
        return objResourcePropertyInstance.getResourceTypeId();
    } // end getResourceTypeId()

    /**
     * Set ResourceTypeId
     *
     * @param aResourceTypeId
     */
    public void setResourceTypeId(long aResourceTypeId) {
        this.objResourcePropertyInstance.setResourceTypeId(aResourceTypeId);
    } // end setResourceTypeId()

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

        if ((obj instanceof ResourcePropertyInstanceBean) == false) {
            return false;
        } // end if

        ResourcePropertyInstanceBean other = (ResourcePropertyInstanceBean) obj;

        boolean isEqual = false;

        com.ourteam.resource.dao.ResourcePropertyInstance tempResourcePropertyInstance =
            other.convertToResourcePropertyInstance();

        if ((tempResourcePropertyInstance == null) ||
                (this.objResourcePropertyInstance == null)) {
            isEqual = false;
        } // end if
        else if ((tempResourcePropertyInstance == this.objResourcePropertyInstance) ||
                tempResourcePropertyInstance.equals(
                    this.objResourcePropertyInstance)) {
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
     * @param aResourcePropertyInstances DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourcePropertyInstanceBean[] toArray(
        com.ourteam.resource.dao.ResourcePropertyInstance[] aResourcePropertyInstances) {
        return toArray(aResourcePropertyInstances, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aResourcePropertyInstances DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourcePropertyInstanceBean[] toArray(
        com.ourteam.resource.dao.ResourcePropertyInstance[] aResourcePropertyInstances,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aResourcePropertyInstances)) {
            return new ResourcePropertyInstanceBean[0];
        } // end if

        int length = aResourcePropertyInstances.length;

        ResourcePropertyInstanceBean[] beans = new ResourcePropertyInstanceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourcePropertyInstanceBean(aResourcePropertyInstances[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourcePropertyInstanceBean(aResourcePropertyInstances[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aResourcePropertyInstances[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ResourcePropertyInstanceBean
