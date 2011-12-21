/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-12 13:50:45
 *
 * @model auto gen
 */
public class ProductGlossaryChangLogBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.ProductGlossaryChangLog objProductGlossaryChangLog;

    static {
        mappedDaoFields.put("id",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.Id);

        mappedDaoFields.put("afterChangeContent",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.AfterChangeContent);

        mappedDaoFields.put("approverId",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.ApproverId);

        mappedDaoFields.put("beforChangeContent",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.BeforChangeContent);

        mappedDaoFields.put("changeReason",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.ChangeReason);

        mappedDaoFields.put("editorId",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.EditorId);

        mappedDaoFields.put("editDate",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.EditDate);

        mappedDaoFields.put("productGlossaryId",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.ProductGlossaryId);

        mappedDaoFields.put("remarks",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.product.dao.IProductGlossaryChangLogDAO.Status);
    } 

    /**
     * Creates a new ProductGlossaryChangLogBean object.
     */
    public ProductGlossaryChangLogBean() {
        super();

        objProductGlossaryChangLog = new com.ourteam.product.dao.ProductGlossaryChangLog();
    } // end ProductGlossaryChangLogBean()

    /**
     * Creates a new ProductGlossaryChangLogBean object.
     *
     * @param aProductGlossaryChangLog DOCUMENT ME!
     */
    public ProductGlossaryChangLogBean(
        com.ourteam.product.dao.ProductGlossaryChangLog aProductGlossaryChangLog) {
        super();

        objProductGlossaryChangLog = aProductGlossaryChangLog;
    } // end ProductGlossaryChangLogBean()

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
    public com.ourteam.product.dao.ProductGlossaryChangLog convertToProductGlossaryChangLog() {
        return objProductGlossaryChangLog;
    } // end convertToProductGlossaryChangLog()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProductGlossaryChangLog.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProductGlossaryChangLog.setId(aId);
    } // end setId()

    /**
     * Get AfterChangeContent
     *
     * @return afterChangeContent
     */
    public String getAfterChangeContent() {
        return objProductGlossaryChangLog.getAfterChangeContent();
    } // end getAfterChangeContent()

    /**
     * Set AfterChangeContent
     *
     * @param aAfterChangeContent
     */
    public void setAfterChangeContent(String aAfterChangeContent) {
        this.objProductGlossaryChangLog.setAfterChangeContent(aAfterChangeContent);
    } // end setAfterChangeContent()

    /**
     * Get ApproverId
     *
     * @return approverId
     */
    public long getApproverId() {
        return objProductGlossaryChangLog.getApproverId();
    } // end getApproverId()

    /**
     * Set ApproverId
     *
     * @param aApproverId
     */
    public void setApproverId(long aApproverId) {
        this.objProductGlossaryChangLog.setApproverId(aApproverId);
    } // end setApproverId()

    /**
     * Get BeforChangeContent
     *
     * @return beforChangeContent
     */
    public String getBeforChangeContent() {
        return objProductGlossaryChangLog.getBeforChangeContent();
    } // end getBeforChangeContent()

    /**
     * Set BeforChangeContent
     *
     * @param aBeforChangeContent
     */
    public void setBeforChangeContent(String aBeforChangeContent) {
        this.objProductGlossaryChangLog.setBeforChangeContent(aBeforChangeContent);
    } // end setBeforChangeContent()

    /**
     * Get ChangeReason
     *
     * @return changeReason
     */
    public String getChangeReason() {
        return objProductGlossaryChangLog.getChangeReason();
    } // end getChangeReason()

    /**
     * Set ChangeReason
     *
     * @param aChangeReason
     */
    public void setChangeReason(String aChangeReason) {
        this.objProductGlossaryChangLog.setChangeReason(aChangeReason);
    } // end setChangeReason()

    /**
     * Get EditorId
     *
     * @return editorId
     */
    public long getEditorId() {
        return objProductGlossaryChangLog.getEditorId();
    } // end getEditorId()

    /**
     * Set EditorId
     *
     * @param aEditorId
     */
    public void setEditorId(long aEditorId) {
        this.objProductGlossaryChangLog.setEditorId(aEditorId);
    } // end setEditorId()

    /**
     * Get EditDate
     *
     * @return editDate
     */
    public java.util.Date getEditDate() {
        return objProductGlossaryChangLog.getEditDate();
    } // end getEditDate()

    /**
     * Set EditDate
     *
     * @param aEditDate
     */
    public void setEditDate(java.util.Date aEditDate) {
        this.objProductGlossaryChangLog.setEditDate(aEditDate);
    } // end setEditDate()

    /**
     * Get ProductGlossaryId
     *
     * @return productGlossaryId
     */
    public long getProductGlossaryId() {
        return objProductGlossaryChangLog.getProductGlossaryId();
    } // end getProductGlossaryId()

    /**
     * Set ProductGlossaryId
     *
     * @param aProductGlossaryId
     */
    public void setProductGlossaryId(long aProductGlossaryId) {
        this.objProductGlossaryChangLog.setProductGlossaryId(aProductGlossaryId);
    } // end setProductGlossaryId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objProductGlossaryChangLog.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objProductGlossaryChangLog.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProductGlossaryChangLog.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProductGlossaryChangLog.setStatus(aStatus);
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

        if ((obj instanceof ProductGlossaryChangLogBean) == false) {
            return false;
        } // end if

        ProductGlossaryChangLogBean other = (ProductGlossaryChangLogBean) obj;

        boolean isEqual = false;

        com.ourteam.product.dao.ProductGlossaryChangLog tempProductGlossaryChangLog =
            other.convertToProductGlossaryChangLog();

        if ((tempProductGlossaryChangLog == null) ||
                (this.objProductGlossaryChangLog == null)) {
            isEqual = false;
        } // end if
        else if ((tempProductGlossaryChangLog == this.objProductGlossaryChangLog) ||
                tempProductGlossaryChangLog.equals(
                    this.objProductGlossaryChangLog)) {
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
     * @param aProductGlossaryChangLogs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductGlossaryChangLogBean[] toArray(
        com.ourteam.product.dao.ProductGlossaryChangLog[] aProductGlossaryChangLogs) {
        return toArray(aProductGlossaryChangLogs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossaryChangLogs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductGlossaryChangLogBean[] toArray(
        com.ourteam.product.dao.ProductGlossaryChangLog[] aProductGlossaryChangLogs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aProductGlossaryChangLogs)) {
            return new ProductGlossaryChangLogBean[0];
        } // end if

        int length = aProductGlossaryChangLogs.length;

        ProductGlossaryChangLogBean[] beans = new ProductGlossaryChangLogBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductGlossaryChangLogBean(aProductGlossaryChangLogs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductGlossaryChangLogBean(aProductGlossaryChangLogs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aProductGlossaryChangLogs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProductGlossaryChangLogBean
