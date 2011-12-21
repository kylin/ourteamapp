/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * ²úÆ·Ä¿Â¼ Generate date 2011-09-22 10:22:04
 *
 * @model auto gen
 */
public class ProductCatalogBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.ProductCatalog objProductCatalog;

    static {
        mappedDaoFields.put("id", com.ourteam.product.dao.IProductCatalogDAO.Id);

        mappedDaoFields.put("parentId",
            com.ourteam.product.dao.IProductCatalogDAO.ParentId);

        mappedDaoFields.put("name",
            com.ourteam.product.dao.IProductCatalogDAO.CatalogName);

        mappedDaoFields.put("sort",
            com.ourteam.product.dao.IProductCatalogDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.product.dao.IProductCatalogDAO.Status);

        mappedDaoFields.put("remarks",
            com.ourteam.product.dao.IProductCatalogDAO.Remarks);
    } 

    /**
     * Creates a new ProductCatalogBean object.
     */
    public ProductCatalogBean() {
        super();

        objProductCatalog = new com.ourteam.product.dao.ProductCatalog();
    } // end ProductCatalogBean()

    /**
     * Creates a new ProductCatalogBean object.
     *
     * @param aProductCatalog DOCUMENT ME!
     */
    public ProductCatalogBean(
        com.ourteam.product.dao.ProductCatalog aProductCatalog) {
        super();

        objProductCatalog = aProductCatalog;
    } // end ProductCatalogBean()

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
    public com.ourteam.product.dao.ProductCatalog convertToProductCatalog() {
        return objProductCatalog;
    } // end convertToProductCatalog()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProductCatalog.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProductCatalog.setId(aId);
    } // end setId()

    /**
     * Get ParentId
     *
     * @return parentId
     */
    public long getParentId() {
        return objProductCatalog.getParentId();
    } // end getParentId()

    /**
     * Set ParentId
     *
     * @param aParentId
     */
    public void setParentId(long aParentId) {
        this.objProductCatalog.setParentId(aParentId);
    } // end setParentId()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objProductCatalog.getCatalogName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objProductCatalog.setCatalogName(aName);
    } // end setName()

    /**
     * Get Sort
     *
     * @return sort
     */
    public int getSort() {
        return (int) objProductCatalog.getSortIndex();
    } // end getSort()

    /**
     * Set Sort
     *
     * @param aSort
     */
    public void setSort(int aSort) {
        this.objProductCatalog.setSortIndex((long) aSort);
    } // end setSort()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProductCatalog.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProductCatalog.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objProductCatalog.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objProductCatalog.setRemarks(aRemarks);
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

        if ((obj instanceof ProductCatalogBean) == false) {
            return false;
        } // end if

        ProductCatalogBean other = (ProductCatalogBean) obj;

        boolean isEqual = false;

        com.ourteam.product.dao.ProductCatalog tempProductCatalog = other.convertToProductCatalog();

        if ((tempProductCatalog == null) || (this.objProductCatalog == null)) {
            isEqual = false;
        } // end if
        else if ((tempProductCatalog == this.objProductCatalog) ||
                tempProductCatalog.equals(this.objProductCatalog)) {
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
     * @param aProductCatalogs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductCatalogBean[] toArray(
        com.ourteam.product.dao.ProductCatalog[] aProductCatalogs) {
        return toArray(aProductCatalogs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProductCatalogs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductCatalogBean[] toArray(
        com.ourteam.product.dao.ProductCatalog[] aProductCatalogs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aProductCatalogs)) {
            return new ProductCatalogBean[0];
        } // end if

        int length = aProductCatalogs.length;

        ProductCatalogBean[] beans = new ProductCatalogBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductCatalogBean(aProductCatalogs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductCatalogBean(aProductCatalogs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aProductCatalogs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProductCatalogBean
