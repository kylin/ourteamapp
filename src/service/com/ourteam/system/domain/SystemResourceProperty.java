/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 系统资源属性 Generate date 2011-09-22 10:21:17
 *
 * @model auto gen
 */
public class SystemResourceProperty implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysResourceProperty objSysResourceProperty;

    static {
        mappedDaoFields.put("id",
            com.ourteam.system.dao.ISysResourcePropertyDAO.Id);

        mappedDaoFields.put("systemResourceId",
            com.ourteam.system.dao.ISysResourcePropertyDAO.SysResourceId);

        mappedDaoFields.put("propertyName",
            com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyName);

        mappedDaoFields.put("propertyCode",
            com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyCode);

        mappedDaoFields.put("propertyValue",
            com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyValue);

        mappedDaoFields.put("propertySort",
            com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyOrder);

        mappedDaoFields.put("propertyType",
            com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyType);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysResourcePropertyDAO.Status);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysResourcePropertyDAO.Remarks);
    } 

    /**
     * Creates a new SystemResourceProperty object.
     */
    public SystemResourceProperty() {
        super();

        objSysResourceProperty = new com.ourteam.system.dao.SysResourceProperty();
    } // end SystemResourceProperty()

    /**
     * Creates a new SystemResourceProperty object.
     *
     * @param aSysResourceProperty DOCUMENT ME!
     */
    public SystemResourceProperty(
        com.ourteam.system.dao.SysResourceProperty aSysResourceProperty) {
        super();

        objSysResourceProperty = aSysResourceProperty;
    } // end SystemResourceProperty()

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
    public com.ourteam.system.dao.SysResourceProperty convertToSysResourceProperty() {
        return objSysResourceProperty;
    } // end convertToSysResourceProperty()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysResourceProperty.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysResourceProperty.setId(aId);
    } // end setId()

    /**
     * Get SystemResourceId
     *
     * @return systemResourceId
     */
    public long getSystemResourceId() {
        if (objSysResourceProperty.getSysResourceId() != null) {
            return ((Number) objSysResourceProperty.getSysResourceId()).longValue();
        } // end if
        else {
            return 0;
        } // end else
    } // end getSystemResourceId()

    /**
     * Set SystemResourceId
     *
     * @param aSystemResourceId
     */
    public void setSystemResourceId(long aSystemResourceId) {
        this.objSysResourceProperty.setSysResourceId(Long.valueOf(
                aSystemResourceId));
    } // end setSystemResourceId()

    /**
     * Get PropertyName
     *
     * @return propertyName
     */
    public String getPropertyName() {
        return objSysResourceProperty.getResourcePropertyName();
    } // end getPropertyName()

    /**
     * Set PropertyName
     *
     * @param aPropertyName
     */
    public void setPropertyName(String aPropertyName) {
        this.objSysResourceProperty.setResourcePropertyName(aPropertyName);
    } // end setPropertyName()

    /**
     * Get PropertyCode
     *
     * @return propertyCode
     */
    public String getPropertyCode() {
        return objSysResourceProperty.getResourcePropertyCode();
    } // end getPropertyCode()

    /**
     * Set PropertyCode
     *
     * @param aPropertyCode
     */
    public void setPropertyCode(String aPropertyCode) {
        this.objSysResourceProperty.setResourcePropertyCode(aPropertyCode);
    } // end setPropertyCode()

    /**
     * Get PropertyValue
     *
     * @return propertyValue
     */
    public String getPropertyValue() {
        return objSysResourceProperty.getResourcePropertyValue();
    } // end getPropertyValue()

    /**
     * Set PropertyValue
     *
     * @param aPropertyValue
     */
    public void setPropertyValue(String aPropertyValue) {
        this.objSysResourceProperty.setResourcePropertyValue(aPropertyValue);
    } // end setPropertyValue()

    /**
     * Get PropertySort
     *
     * @return propertySort
     */
    public Integer getPropertySort() {
        return objSysResourceProperty.getResourcePropertyOrder();
    } // end getPropertySort()

    /**
     * Set PropertySort
     *
     * @param aPropertySort
     */
    public void setPropertySort(Integer aPropertySort) {
        this.objSysResourceProperty.setResourcePropertyOrder(aPropertySort);
    } // end setPropertySort()

    /**
     * Get PropertyType
     *
     * @return propertyType
     */
    public String getPropertyType() {
        return objSysResourceProperty.getResourcePropertyType();
    } // end getPropertyType()

    /**
     * Set PropertyType
     *
     * @param aPropertyType
     */
    public void setPropertyType(String aPropertyType) {
        this.objSysResourceProperty.setResourcePropertyType(aPropertyType);
    } // end setPropertyType()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysResourceProperty.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysResourceProperty.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysResourceProperty.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysResourceProperty.setRemarks(aRemarks);
    } // end setRemarks()

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

        if ((obj instanceof SystemResourceProperty) == false) {
            return false;
        } // end if

        SystemResourceProperty other = (SystemResourceProperty) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysResourceProperty tempSysResourceProperty = other.convertToSysResourceProperty();

        if ((tempSysResourceProperty == null) ||
                (this.objSysResourceProperty == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysResourceProperty == this.objSysResourceProperty) ||
                tempSysResourceProperty.equals(this.objSysResourceProperty)) {
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
     * @param aSysResourcePropertys DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemResourceProperty[] toArray(
        com.ourteam.system.dao.SysResourceProperty[] aSysResourcePropertys) {
        return toArray(aSysResourcePropertys, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourcePropertys DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemResourceProperty[] toArray(
        com.ourteam.system.dao.SysResourceProperty[] aSysResourcePropertys,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysResourcePropertys)) {
            return new SystemResourceProperty[0];
        } // end if

        int length = aSysResourcePropertys.length;

        SystemResourceProperty[] beans = new SystemResourceProperty[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemResourceProperty(aSysResourcePropertys[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemResourceProperty(aSysResourcePropertys[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aSysResourcePropertys[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemResourceProperty
