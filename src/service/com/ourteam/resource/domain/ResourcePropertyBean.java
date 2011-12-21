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
public class ResourcePropertyBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.resource.dao.ResourceProperty objResourceProperty;

    static {
        mappedDaoFields.put("id",
            com.ourteam.resource.dao.IResourcePropertyDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.resource.dao.IResourcePropertyDAO.Code);

        mappedDaoFields.put("dataType",
            com.ourteam.resource.dao.IResourcePropertyDAO.DataType);

        mappedDaoFields.put("name",
            com.ourteam.resource.dao.IResourcePropertyDAO.Name);

        mappedDaoFields.put("remarks",
            com.ourteam.resource.dao.IResourcePropertyDAO.Remarks);

        mappedDaoFields.put("resourceTypeId",
            com.ourteam.resource.dao.IResourcePropertyDAO.ResourceTypeId);

        mappedDaoFields.put("sortIndex",
            com.ourteam.resource.dao.IResourcePropertyDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.resource.dao.IResourcePropertyDAO.Status);

        mappedDaoFields.put("resourceTypeCode",
            com.ourteam.resource.dao.IResourcePropertyDAO.ResourceTypeCode);

        mappedDaoFields.put("resourceTypeName",
            com.ourteam.resource.dao.IResourcePropertyDAO.ResourceTypeName);

        mappedDaoFields.put("resourceTypeStatus",
            com.ourteam.resource.dao.IResourcePropertyDAO.ResourceTypeStatus);
    } 

    /**
     * Creates a new ResourcePropertyBean object.
     */
    public ResourcePropertyBean() {
        super();

        objResourceProperty = new com.ourteam.resource.dao.ResourceProperty();
    } // end ResourcePropertyBean()

    /**
     * Creates a new ResourcePropertyBean object.
     *
     * @param aResourceProperty DOCUMENT ME!
     */
    public ResourcePropertyBean(
        com.ourteam.resource.dao.ResourceProperty aResourceProperty) {
        super();

        objResourceProperty = aResourceProperty;
    } // end ResourcePropertyBean()

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
    public com.ourteam.resource.dao.ResourceProperty convertToResourceProperty() {
        return objResourceProperty;
    } // end convertToResourceProperty()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objResourceProperty.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objResourceProperty.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objResourceProperty.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objResourceProperty.setCode(aCode);
    } // end setCode()

    /**
     * Get DataType
     *
     * @return dataType
     */
    public String getDataType() {
        return objResourceProperty.getDataType();
    } // end getDataType()

    /**
     * Set DataType
     *
     * @param aDataType
     */
    public void setDataType(String aDataType) {
        this.objResourceProperty.setDataType(aDataType);
    } // end setDataType()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objResourceProperty.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objResourceProperty.setName(aName);
    } // end setName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objResourceProperty.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objResourceProperty.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ResourceTypeId
     *
     * @return resourceTypeId
     */
    public long getResourceTypeId() {
        return objResourceProperty.getResourceTypeId();
    } // end getResourceTypeId()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public long getSortIndex() {
        return objResourceProperty.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(long aSortIndex) {
        this.objResourceProperty.setSortIndex(aSortIndex);
    } // end setSortIndex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objResourceProperty.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objResourceProperty.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ResourceTypeCode
     *
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return objResourceProperty.getResourceTypeCode();
    } // end getResourceTypeCode()

    /**
     * Get ResourceTypeName
     *
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return objResourceProperty.getResourceTypeName();
    } // end getResourceTypeName()

    /**
     * Get ResourceTypeStatus
     *
     * @return resourceTypeStatus
     */
    public String getResourceTypeStatus() {
        return objResourceProperty.getResourceTypeStatus();
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

        if ((obj instanceof ResourcePropertyBean) == false) {
            return false;
        } // end if

        ResourcePropertyBean other = (ResourcePropertyBean) obj;

        boolean isEqual = false;

        com.ourteam.resource.dao.ResourceProperty tempResourceProperty = other.convertToResourceProperty();

        if ((tempResourceProperty == null) ||
                (this.objResourceProperty == null)) {
            isEqual = false;
        } // end if
        else if ((tempResourceProperty == this.objResourceProperty) ||
                tempResourceProperty.equals(this.objResourceProperty)) {
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
     * @param aResourcePropertys DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourcePropertyBean[] toArray(
        com.ourteam.resource.dao.ResourceProperty[] aResourcePropertys) {
        return toArray(aResourcePropertys, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aResourcePropertys DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourcePropertyBean[] toArray(
        com.ourteam.resource.dao.ResourceProperty[] aResourcePropertys,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aResourcePropertys)) {
            return new ResourcePropertyBean[0];
        } // end if

        int length = aResourcePropertys.length;

        ResourcePropertyBean[] beans = new ResourcePropertyBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourcePropertyBean(aResourcePropertys[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourcePropertyBean(aResourcePropertys[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aResourcePropertys[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ResourcePropertyBean
