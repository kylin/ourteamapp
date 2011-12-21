/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-12 16:28:06
 *
 * @model auto gen
 */
public class ProductGlossaryBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.ProductGlossary objProductGlossary;

    static {
        mappedDaoFields.put("id", com.ourteam.product.dao.IProductGlossaryDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.product.dao.IProductGlossaryDAO.Code);

        mappedDaoFields.put("content",
            com.ourteam.product.dao.IProductGlossaryDAO.Content);

        mappedDaoFields.put("createDate",
            com.ourteam.product.dao.IProductGlossaryDAO.CreateDate);

        mappedDaoFields.put("creatorId",
            com.ourteam.product.dao.IProductGlossaryDAO.CreatorId);

        mappedDaoFields.put("lastEditorId",
            com.ourteam.product.dao.IProductGlossaryDAO.LastEditorId);

        mappedDaoFields.put("lastEditDate",
            com.ourteam.product.dao.IProductGlossaryDAO.LastEditDate);

        mappedDaoFields.put("name",
            com.ourteam.product.dao.IProductGlossaryDAO.Name);

        mappedDaoFields.put("productId",
            com.ourteam.product.dao.IProductGlossaryDAO.ProductId);

        mappedDaoFields.put("remarks",
            com.ourteam.product.dao.IProductGlossaryDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.product.dao.IProductGlossaryDAO.Status);

        mappedDaoFields.put("lastEditorName",
            com.ourteam.product.dao.IProductGlossaryDAO.LastEditorName);

        mappedDaoFields.put("sinceVersionId",
            com.ourteam.product.dao.IProductGlossaryDAO.SinceVersionId);

        mappedDaoFields.put("sinceVersion",
            com.ourteam.product.dao.IProductGlossaryDAO.SinceVersion);
    } 

    /**
     * Creates a new ProductGlossaryBean object.
     */
    public ProductGlossaryBean() {
        super();

        objProductGlossary = new com.ourteam.product.dao.ProductGlossary();
    } // end ProductGlossaryBean()

    /**
     * Creates a new ProductGlossaryBean object.
     *
     * @param aProductGlossary DOCUMENT ME!
     */
    public ProductGlossaryBean(
        com.ourteam.product.dao.ProductGlossary aProductGlossary) {
        super();

        objProductGlossary = aProductGlossary;
    } // end ProductGlossaryBean()

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
    public com.ourteam.product.dao.ProductGlossary convertToProductGlossary() {
        return objProductGlossary;
    } // end convertToProductGlossary()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProductGlossary.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProductGlossary.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objProductGlossary.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objProductGlossary.setCode(aCode);
    } // end setCode()

    /**
     * Get Content
     *
     * @return content
     */
    public String getContent() {
        return objProductGlossary.getContent();
    } // end getContent()

    /**
     * Set Content
     *
     * @param aContent
     */
    public void setContent(String aContent) {
        this.objProductGlossary.setContent(aContent);
    } // end setContent()

    /**
     * Get CreateDate
     *
     * @return createDate
     */
    public java.util.Date getCreateDate() {
        return objProductGlossary.getCreateDate();
    } // end getCreateDate()

    /**
     * Set CreateDate
     *
     * @param aCreateDate
     */
    public void setCreateDate(java.util.Date aCreateDate) {
        this.objProductGlossary.setCreateDate(aCreateDate);
    } // end setCreateDate()

    /**
     * Get CreatorId
     *
     * @return creatorId
     */
    public long getCreatorId() {
        return objProductGlossary.getCreatorId();
    } // end getCreatorId()

    /**
     * Set CreatorId
     *
     * @param aCreatorId
     */
    public void setCreatorId(long aCreatorId) {
        this.objProductGlossary.setCreatorId(aCreatorId);
    } // end setCreatorId()

    /**
     * Get LastEditorId
     *
     * @return lastEditorId
     */
    public long getLastEditorId() {
        return objProductGlossary.getLastEditorId();
    } // end getLastEditorId()

    /**
     * Set LastEditorId
     *
     * @param aLastEditorId
     */
    public void setLastEditorId(long aLastEditorId) {
        this.objProductGlossary.setLastEditorId(aLastEditorId);
    } // end setLastEditorId()

    /**
     * Get LastEditDate
     *
     * @return lastEditDate
     */
    public java.util.Date getLastEditDate() {
        return objProductGlossary.getLastEditDate();
    } // end getLastEditDate()

    /**
     * Set LastEditDate
     *
     * @param aLastEditDate
     */
    public void setLastEditDate(java.util.Date aLastEditDate) {
        this.objProductGlossary.setLastEditDate(aLastEditDate);
    } // end setLastEditDate()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objProductGlossary.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objProductGlossary.setName(aName);
    } // end setName()

    /**
     * Get ProductId
     *
     * @return productId
     */
    public long getProductId() {
        return objProductGlossary.getProductId();
    } // end getProductId()

    /**
     * Set ProductId
     *
     * @param aProductId
     */
    public void setProductId(long aProductId) {
        this.objProductGlossary.setProductId(aProductId);
    } // end setProductId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objProductGlossary.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objProductGlossary.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProductGlossary.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProductGlossary.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get LastEditorName
     *
     * @return lastEditorName
     */
    public String getLastEditorName() {
        return objProductGlossary.getLastEditorName();
    } // end getLastEditorName()

    /**
     * Get SinceVersionId
     *
     * @return sinceVersionId
     */
    public long getSinceVersionId() {
        return objProductGlossary.getSinceVersionId();
    } // end getSinceVersionId()

    /**
     * Set SinceVersionId
     *
     * @param aSinceVersionId
     */
    public void setSinceVersionId(long aSinceVersionId) {
        this.objProductGlossary.setSinceVersionId(aSinceVersionId);
    } // end setSinceVersionId()

    /**
     * Get SinceVersion
     *
     * @return sinceVersion
     */
    public String getSinceVersion() {
        return objProductGlossary.getSinceVersion();
    } // end getSinceVersion()

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

        if ((obj instanceof ProductGlossaryBean) == false) {
            return false;
        } // end if

        ProductGlossaryBean other = (ProductGlossaryBean) obj;

        boolean isEqual = false;

        com.ourteam.product.dao.ProductGlossary tempProductGlossary = other.convertToProductGlossary();

        if ((tempProductGlossary == null) || (this.objProductGlossary == null)) {
            isEqual = false;
        } // end if
        else if ((tempProductGlossary == this.objProductGlossary) ||
                tempProductGlossary.equals(this.objProductGlossary)) {
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
     * @param aProductGlossarys DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductGlossaryBean[] toArray(
        com.ourteam.product.dao.ProductGlossary[] aProductGlossarys) {
        return toArray(aProductGlossarys, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossarys DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductGlossaryBean[] toArray(
        com.ourteam.product.dao.ProductGlossary[] aProductGlossarys,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aProductGlossarys)) {
            return new ProductGlossaryBean[0];
        } // end if

        int length = aProductGlossarys.length;

        ProductGlossaryBean[] beans = new ProductGlossaryBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductGlossaryBean(aProductGlossarys[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductGlossaryBean(aProductGlossarys[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aProductGlossarys[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProductGlossaryBean
