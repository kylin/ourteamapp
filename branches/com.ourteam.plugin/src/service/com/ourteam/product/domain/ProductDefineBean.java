/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 产品定义 Generate date 2011-09-22 10:22:04
 *
 * @model auto gen
 */
public class ProductDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.ProductDefine objProductDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.product.dao.IProductDefineDAO.Id);

        mappedDaoFields.put("catalogId",
            com.ourteam.product.dao.IProductDefineDAO.CatalogId);

        mappedDaoFields.put("name",
            com.ourteam.product.dao.IProductDefineDAO.ProductName);

        mappedDaoFields.put("code",
            com.ourteam.product.dao.IProductDefineDAO.ProductCode);

        mappedDaoFields.put("status",
            com.ourteam.product.dao.IProductDefineDAO.Status);

        mappedDaoFields.put("remarks",
            com.ourteam.product.dao.IProductDefineDAO.Remarks);
    } 

    /**
     * Creates a new ProductDefineBean object.
     */
    public ProductDefineBean() {
        super();

        objProductDefine = new com.ourteam.product.dao.ProductDefine();
    } // end ProductDefineBean()

    /**
     * Creates a new ProductDefineBean object.
     *
     * @param aProductDefine DOCUMENT ME!
     */
    public ProductDefineBean(
        com.ourteam.product.dao.ProductDefine aProductDefine) {
        super();

        objProductDefine = aProductDefine;
    } // end ProductDefineBean()

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
    public com.ourteam.product.dao.ProductDefine convertToProductDefine() {
        return objProductDefine;
    } // end convertToProductDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProductDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProductDefine.setId(aId);
    } // end setId()

    /**
     * Get CatalogId
     *
     * @return catalogId
     */
    public long getCatalogId() {
        return objProductDefine.getCatalogId();
    } // end getCatalogId()

    /**
     * Set CatalogId
     *
     * @param aCatalogId
     */
    public void setCatalogId(long aCatalogId) {
        this.objProductDefine.setCatalogId(aCatalogId);
    } // end setCatalogId()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objProductDefine.getProductName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objProductDefine.setProductName(aName);
    } // end setName()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objProductDefine.getProductCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objProductDefine.setProductCode(aCode);
    } // end setCode()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProductDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProductDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objProductDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objProductDefine.setRemarks(aRemarks);
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

        if ((obj instanceof ProductDefineBean) == false) {
            return false;
        } // end if

        ProductDefineBean other = (ProductDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.product.dao.ProductDefine tempProductDefine = other.convertToProductDefine();

        if ((tempProductDefine == null) || (this.objProductDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempProductDefine == this.objProductDefine) ||
                tempProductDefine.equals(this.objProductDefine)) {
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
     * @param aProductDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductDefineBean[] toArray(
        com.ourteam.product.dao.ProductDefine[] aProductDefines) {
        return toArray(aProductDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProductDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductDefineBean[] toArray(
        com.ourteam.product.dao.ProductDefine[] aProductDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aProductDefines)) {
            return new ProductDefineBean[0];
        } // end if

        int length = aProductDefines.length;

        ProductDefineBean[] beans = new ProductDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductDefineBean(aProductDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductDefineBean(aProductDefines[i]);

                aCallBack.populate(beans[i], new Object[] { aProductDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProductDefineBean
