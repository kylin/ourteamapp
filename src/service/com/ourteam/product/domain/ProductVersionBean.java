/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * ²úÆ·°æ±¾ Generate date 2011-10-12 15:03:02
 *
 * @model auto gen
 */
public class ProductVersionBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.ProductVersion objProductVersion;

    static {
        mappedDaoFields.put("id", com.ourteam.product.dao.IProductVersionDAO.Id);

        mappedDaoFields.put("productDefineId",
            com.ourteam.product.dao.IProductVersionDAO.ProductDefineId);

        mappedDaoFields.put("productVersion",
            com.ourteam.product.dao.IProductVersionDAO.ProductVersion);

        mappedDaoFields.put("remarks",
            com.ourteam.product.dao.IProductVersionDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.product.dao.IProductVersionDAO.Status);

        mappedDaoFields.put("versionType",
            com.ourteam.product.dao.IProductVersionDAO.ProductVersionType);

        mappedDaoFields.put("parentVersionId",
            com.ourteam.product.dao.IProductVersionDAO.ParentVersionId);
    } 

    /**
     * Creates a new ProductVersionBean object.
     */
    public ProductVersionBean() {
        super();

        objProductVersion = new com.ourteam.product.dao.ProductVersion();
    } // end ProductVersionBean()

    /**
     * Creates a new ProductVersionBean object.
     *
     * @param aProductVersion DOCUMENT ME!
     */
    public ProductVersionBean(
        com.ourteam.product.dao.ProductVersion aProductVersion) {
        super();

        objProductVersion = aProductVersion;
    } // end ProductVersionBean()

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
    public com.ourteam.product.dao.ProductVersion convertToProductVersion() {
        return objProductVersion;
    } // end convertToProductVersion()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProductVersion.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProductVersion.setId(aId);
    } // end setId()

    /**
     * Get ProductDefineId
     *
     * @return productDefineId
     */
    public long getProductDefineId() {
        return objProductVersion.getProductDefineId();
    } // end getProductDefineId()

    /**
     * Set ProductDefineId
     *
     * @param aProductDefineId
     */
    public void setProductDefineId(long aProductDefineId) {
        this.objProductVersion.setProductDefineId(aProductDefineId);
    } // end setProductDefineId()

    /**
     * Get ProductVersion
     *
     * @return productVersion
     */
    public String getProductVersion() {
        return objProductVersion.getProductVersion();
    } // end getProductVersion()

    /**
     * Set ProductVersion
     *
     * @param aProductVersion
     */
    public void setProductVersion(String aProductVersion) {
        this.objProductVersion.setProductVersion(aProductVersion);
    } // end setProductVersion()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objProductVersion.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objProductVersion.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProductVersion.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProductVersion.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get VersionType
     *
     * @return versionType
     */
    public String getVersionType() {
        return objProductVersion.getProductVersionType();
    } // end getVersionType()

    /**
     * Set VersionType
     *
     * @param aVersionType
     */
    public void setVersionType(String aVersionType) {
        this.objProductVersion.setProductVersionType(aVersionType);
    } // end setVersionType()

    /**
     * Get ParentVersionId
     *
     * @return parentVersionId
     */
    public long getParentVersionId() {
        return objProductVersion.getParentVersionId();
    } // end getParentVersionId()

    /**
     * Set ParentVersionId
     *
     * @param aParentVersionId
     */
    public void setParentVersionId(long aParentVersionId) {
        this.objProductVersion.setParentVersionId(aParentVersionId);
    } // end setParentVersionId()

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

        if ((obj instanceof ProductVersionBean) == false) {
            return false;
        } // end if

        ProductVersionBean other = (ProductVersionBean) obj;

        boolean isEqual = false;

        com.ourteam.product.dao.ProductVersion tempProductVersion = other.convertToProductVersion();

        if ((tempProductVersion == null) || (this.objProductVersion == null)) {
            isEqual = false;
        } // end if
        else if ((tempProductVersion == this.objProductVersion) ||
                tempProductVersion.equals(this.objProductVersion)) {
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
     * @param aProductVersions DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductVersionBean[] toArray(
        com.ourteam.product.dao.ProductVersion[] aProductVersions) {
        return toArray(aProductVersions, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProductVersions DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductVersionBean[] toArray(
        com.ourteam.product.dao.ProductVersion[] aProductVersions,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aProductVersions)) {
            return new ProductVersionBean[0];
        } // end if

        int length = aProductVersions.length;

        ProductVersionBean[] beans = new ProductVersionBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductVersionBean(aProductVersions[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductVersionBean(aProductVersions[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aProductVersions[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProductVersionBean
