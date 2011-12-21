/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-23 15:19:01
 *
 * @model auto gen
 */
public class ReportCatalogBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportCatalog objReportCatalog;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportCatalogDAO.Id);

        mappedDaoFields.put("catalogTitle",
            com.ourteam.report.dao.IReportCatalogDAO.CatalogTitle);

        mappedDaoFields.put("parentCatalogId",
            com.ourteam.report.dao.IReportCatalogDAO.ParentCatalogId);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportCatalogDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportCatalogDAO.Status);
    } 

    /**
     * Creates a new ReportCatalogBean object.
     */
    public ReportCatalogBean() {
        super();

        objReportCatalog = new com.ourteam.report.dao.ReportCatalog();
    } // end ReportCatalogBean()

    /**
     * Creates a new ReportCatalogBean object.
     *
     * @param aReportCatalog DOCUMENT ME!
     */
    public ReportCatalogBean(
        com.ourteam.report.dao.ReportCatalog aReportCatalog) {
        super();

        objReportCatalog = aReportCatalog;
    } // end ReportCatalogBean()

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
    public com.ourteam.report.dao.ReportCatalog convertToReportCatalog() {
        return objReportCatalog;
    } // end convertToReportCatalog()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportCatalog.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportCatalog.setId(aId);
    } // end setId()

    /**
     * Get CatalogTitle
     *
     * @return catalogTitle
     */
    public String getCatalogTitle() {
        return objReportCatalog.getCatalogTitle();
    } // end getCatalogTitle()

    /**
     * Set CatalogTitle
     *
     * @param aCatalogTitle
     */
    public void setCatalogTitle(String aCatalogTitle) {
        this.objReportCatalog.setCatalogTitle(aCatalogTitle);
    } // end setCatalogTitle()

    /**
     * Get ParentCatalogId
     *
     * @return parentCatalogId
     */
    public long getParentCatalogId() {
        return objReportCatalog.getParentCatalogId();
    } // end getParentCatalogId()

    /**
     * Set ParentCatalogId
     *
     * @param aParentCatalogId
     */
    public void setParentCatalogId(long aParentCatalogId) {
        this.objReportCatalog.setParentCatalogId(aParentCatalogId);
    } // end setParentCatalogId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportCatalog.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportCatalog.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportCatalog.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportCatalog.setStatus(aStatus);
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

        if ((obj instanceof ReportCatalogBean) == false) {
            return false;
        } // end if

        ReportCatalogBean other = (ReportCatalogBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportCatalog tempReportCatalog = other.convertToReportCatalog();

        if ((tempReportCatalog == null) || (this.objReportCatalog == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportCatalog == this.objReportCatalog) ||
                tempReportCatalog.equals(this.objReportCatalog)) {
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
     * @param aReportCatalogs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportCatalogBean[] toArray(
        com.ourteam.report.dao.ReportCatalog[] aReportCatalogs) {
        return toArray(aReportCatalogs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportCatalogs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportCatalogBean[] toArray(
        com.ourteam.report.dao.ReportCatalog[] aReportCatalogs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportCatalogs)) {
            return new ReportCatalogBean[0];
        } // end if

        int length = aReportCatalogs.length;

        ReportCatalogBean[] beans = new ReportCatalogBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportCatalogBean(aReportCatalogs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportCatalogBean(aReportCatalogs[i]);

                aCallBack.populate(beans[i], new Object[] { aReportCatalogs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportCatalogBean
