/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-10 11:40:08
 *
 * @model auto gen
 */
public class ProductTeamRelateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.ProductTeamRelate objProductTeamRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.product.dao.IProductTeamRelateDAO.Id);

        mappedDaoFields.put("productId",
            com.ourteam.product.dao.IProductTeamRelateDAO.ProductId);

        mappedDaoFields.put("remarks",
            com.ourteam.product.dao.IProductTeamRelateDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.product.dao.IProductTeamRelateDAO.Status);

        mappedDaoFields.put("teamId",
            com.ourteam.product.dao.IProductTeamRelateDAO.TeamId);

        mappedDaoFields.put("teamName",
            com.ourteam.product.dao.IProductTeamRelateDAO.TeamName);

        mappedDaoFields.put("teamCode",
            com.ourteam.product.dao.IProductTeamRelateDAO.TeamCode);

        mappedDaoFields.put("teamMail",
            com.ourteam.product.dao.IProductTeamRelateDAO.TeamMail);

        mappedDaoFields.put("teamStatus",
            com.ourteam.product.dao.IProductTeamRelateDAO.TeamStatus);

        mappedDaoFields.put("productCode",
            com.ourteam.product.dao.IProductTeamRelateDAO.ProductCode);

        mappedDaoFields.put("productName",
            com.ourteam.product.dao.IProductTeamRelateDAO.ProductName);
    } 

    /**
     * Creates a new ProductTeamRelateBean object.
     */
    public ProductTeamRelateBean() {
        super();

        objProductTeamRelate = new com.ourteam.product.dao.ProductTeamRelate();
    } // end ProductTeamRelateBean()

    /**
     * Creates a new ProductTeamRelateBean object.
     *
     * @param aProductTeamRelate DOCUMENT ME!
     */
    public ProductTeamRelateBean(
        com.ourteam.product.dao.ProductTeamRelate aProductTeamRelate) {
        super();

        objProductTeamRelate = aProductTeamRelate;
    } // end ProductTeamRelateBean()

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
    public com.ourteam.product.dao.ProductTeamRelate convertToProductTeamRelate() {
        return objProductTeamRelate;
    } // end convertToProductTeamRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProductTeamRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProductTeamRelate.setId(aId);
    } // end setId()

    /**
     * Get ProductId
     *
     * @return productId
     */
    public long getProductId() {
        return objProductTeamRelate.getProductId();
    } // end getProductId()

    /**
     * Set ProductId
     *
     * @param aProductId
     */
    public void setProductId(long aProductId) {
        this.objProductTeamRelate.setProductId(aProductId);
    } // end setProductId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objProductTeamRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objProductTeamRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProductTeamRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProductTeamRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    public long getTeamId() {
        return objProductTeamRelate.getTeamId();
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    public void setTeamId(long aTeamId) {
        this.objProductTeamRelate.setTeamId(aTeamId);
    } // end setTeamId()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    public String getTeamName() {
        return objProductTeamRelate.getTeamName();
    } // end getTeamName()

    /**
     * Set TeamName
     *
     * @param aTeamName
     */
    public void setTeamName(String aTeamName) {
        this.objProductTeamRelate.setTeamName(aTeamName);
    } // end setTeamName()

    /**
     * Get TeamCode
     *
     * @return teamCode
     */
    public String getTeamCode() {
        return objProductTeamRelate.getTeamCode();
    } // end getTeamCode()

    /**
     * Set TeamCode
     *
     * @param aTeamCode
     */
    public void setTeamCode(String aTeamCode) {
        this.objProductTeamRelate.setTeamCode(aTeamCode);
    } // end setTeamCode()

    /**
     * Get TeamMail
     *
     * @return teamMail
     */
    public String getTeamMail() {
        return objProductTeamRelate.getTeamMail();
    } // end getTeamMail()

    /**
     * Set TeamMail
     *
     * @param aTeamMail
     */
    public void setTeamMail(String aTeamMail) {
        this.objProductTeamRelate.setTeamMail(aTeamMail);
    } // end setTeamMail()

    /**
     * Get TeamStatus
     *
     * @return teamStatus
     */
    public String getTeamStatus() {
        return objProductTeamRelate.getTeamStatus();
    } // end getTeamStatus()

    /**
     * Set TeamStatus
     *
     * @param aTeamStatus
     */
    public void setTeamStatus(String aTeamStatus) {
        this.objProductTeamRelate.setTeamStatus(aTeamStatus);
    } // end setTeamStatus()

    /**
     * Get ProductCode
     *
     * @return productCode
     */
    public String getProductCode() {
        return objProductTeamRelate.getProductCode();
    } // end getProductCode()

    /**
     * Set ProductCode
     *
     * @param aProductCode
     */
    public void setProductCode(String aProductCode) {
        this.objProductTeamRelate.setProductCode(aProductCode);
    } // end setProductCode()

    /**
     * Get ProductName
     *
     * @return productName
     */
    public String getProductName() {
        return objProductTeamRelate.getProductName();
    } // end getProductName()

    /**
     * Set ProductName
     *
     * @param aProductName
     */
    public void setProductName(String aProductName) {
        this.objProductTeamRelate.setProductName(aProductName);
    } // end setProductName()

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

        if ((obj instanceof ProductTeamRelateBean) == false) {
            return false;
        } // end if

        ProductTeamRelateBean other = (ProductTeamRelateBean) obj;

        boolean isEqual = false;

        com.ourteam.product.dao.ProductTeamRelate tempProductTeamRelate = other.convertToProductTeamRelate();

        if ((tempProductTeamRelate == null) ||
                (this.objProductTeamRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempProductTeamRelate == this.objProductTeamRelate) ||
                tempProductTeamRelate.equals(this.objProductTeamRelate)) {
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
     * @param aProductTeamRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductTeamRelateBean[] toArray(
        com.ourteam.product.dao.ProductTeamRelate[] aProductTeamRelates) {
        return toArray(aProductTeamRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProductTeamRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductTeamRelateBean[] toArray(
        com.ourteam.product.dao.ProductTeamRelate[] aProductTeamRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aProductTeamRelates)) {
            return new ProductTeamRelateBean[0];
        } // end if

        int length = aProductTeamRelates.length;

        ProductTeamRelateBean[] beans = new ProductTeamRelateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductTeamRelateBean(aProductTeamRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductTeamRelateBean(aProductTeamRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aProductTeamRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProductTeamRelateBean
