/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-27 11:33:00
 *
 * @model auto gen
 */
public class ReportInstanceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportInstance objReportInstance;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportInstanceDAO.Id);

        mappedDaoFields.put("catalogId",
            com.ourteam.report.dao.IReportInstanceDAO.CatalogId);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportInstanceDAO.Remarks);

        mappedDaoFields.put("reportProjectId",
            com.ourteam.report.dao.IReportInstanceDAO.ReportProjectId);

        mappedDaoFields.put("reportTitle",
            com.ourteam.report.dao.IReportInstanceDAO.ReportTitle);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportInstanceDAO.Status);

        mappedDaoFields.put("reportViewId",
            com.ourteam.report.dao.IReportInstanceDAO.ReportViewId);

        mappedDaoFields.put("reportViewCode",
            com.ourteam.report.dao.IReportInstanceDAO.ReportViewCode);

        mappedDaoFields.put("reportViewFilters",
            com.ourteam.report.dao.IReportInstanceDAO.ReportViewFilters);

        mappedDaoFields.put("reportViewGroupBy",
            com.ourteam.report.dao.IReportInstanceDAO.ReportViewGroupBy);

        mappedDaoFields.put("reportViewIsDistinct",
            com.ourteam.report.dao.IReportInstanceDAO.ReportViewIsDistinct);

        mappedDaoFields.put("reportViewName",
            com.ourteam.report.dao.IReportInstanceDAO.ReportViewName);

        mappedDaoFields.put("reportViewOrderBy",
            com.ourteam.report.dao.IReportInstanceDAO.ReportViewOrderBy);

        mappedDaoFields.put("reportProjectName",
            com.ourteam.report.dao.IReportInstanceDAO.ReportProjectName);

        mappedDaoFields.put("reportProjectCode",
            com.ourteam.report.dao.IReportInstanceDAO.ReportProjectCode);
    } 

    /**
     * Creates a new ReportInstanceBean object.
     */
    public ReportInstanceBean() {
        super();

        objReportInstance = new com.ourteam.report.dao.ReportInstance();
    } // end ReportInstanceBean()

    /**
     * Creates a new ReportInstanceBean object.
     *
     * @param aReportInstance DOCUMENT ME!
     */
    public ReportInstanceBean(
        com.ourteam.report.dao.ReportInstance aReportInstance) {
        super();

        objReportInstance = aReportInstance;
    } // end ReportInstanceBean()

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
    public com.ourteam.report.dao.ReportInstance convertToReportInstance() {
        return objReportInstance;
    } // end convertToReportInstance()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportInstance.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportInstance.setId(aId);
    } // end setId()

    /**
     * Get CatalogId
     *
     * @return catalogId
     */
    public long getCatalogId() {
        return objReportInstance.getCatalogId();
    } // end getCatalogId()

    /**
     * Set CatalogId
     *
     * @param aCatalogId
     */
    public void setCatalogId(long aCatalogId) {
        this.objReportInstance.setCatalogId(aCatalogId);
    } // end setCatalogId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportInstance.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportInstance.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportProjectId
     *
     * @return reportProjectId
     */
    public long getReportProjectId() {
        return objReportInstance.getReportProjectId();
    } // end getReportProjectId()

    /**
     * Set ReportProjectId
     *
     * @param aReportProjectId
     */
    public void setReportProjectId(long aReportProjectId) {
        this.objReportInstance.setReportProjectId(aReportProjectId);
    } // end setReportProjectId()

    /**
     * Get ReportTitle
     *
     * @return reportTitle
     */
    public String getReportTitle() {
        return objReportInstance.getReportTitle();
    } // end getReportTitle()

    /**
     * Set ReportTitle
     *
     * @param aReportTitle
     */
    public void setReportTitle(String aReportTitle) {
        this.objReportInstance.setReportTitle(aReportTitle);
    } // end setReportTitle()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportInstance.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportInstance.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ReportViewId
     *
     * @return reportViewId
     */
    public long getReportViewId() {
        return objReportInstance.getReportViewId();
    } // end getReportViewId()

    /**
     * Set ReportViewId
     *
     * @param aReportViewId
     */
    public void setReportViewId(long aReportViewId) {
        this.objReportInstance.setReportViewId(aReportViewId);
    } // end setReportViewId()

    /**
     * Get ReportViewCode
     *
     * @return reportViewCode
     */
    public String getReportViewCode() {
        return objReportInstance.getReportViewCode();
    } // end getReportViewCode()

    /**
     * Get ReportViewFilters
     *
     * @return reportViewFilters
     */
    public String getReportViewFilters() {
        return objReportInstance.getReportViewFilters();
    } // end getReportViewFilters()

    /**
     * Get ReportViewGroupBy
     *
     * @return reportViewGroupBy
     */
    public String getReportViewGroupBy() {
        return objReportInstance.getReportViewGroupBy();
    } // end getReportViewGroupBy()

    /**
     * Get ReportViewIsDistinct
     *
     * @return reportViewIsDistinct
     */
    public String getReportViewIsDistinct() {
        return objReportInstance.getReportViewIsDistinct();
    } // end getReportViewIsDistinct()

    /**
     * Get ReportViewName
     *
     * @return reportViewName
     */
    public String getReportViewName() {
        return objReportInstance.getReportViewName();
    } // end getReportViewName()

    /**
     * Get ReportViewOrderBy
     *
     * @return reportViewOrderBy
     */
    public String getReportViewOrderBy() {
        return objReportInstance.getReportViewOrderBy();
    } // end getReportViewOrderBy()

    /**
     * Get ReportProjectName
     *
     * @return reportProjectName
     */
    public String getReportProjectName() {
        return objReportInstance.getReportProjectName();
    } // end getReportProjectName()

    /**
     * Get ReportProjectCode
     *
     * @return reportProjectCode
     */
    public String getReportProjectCode() {
        return objReportInstance.getReportProjectCode();
    } // end getReportProjectCode()

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

        if ((obj instanceof ReportInstanceBean) == false) {
            return false;
        } // end if

        ReportInstanceBean other = (ReportInstanceBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportInstance tempReportInstance = other.convertToReportInstance();

        if ((tempReportInstance == null) || (this.objReportInstance == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportInstance == this.objReportInstance) ||
                tempReportInstance.equals(this.objReportInstance)) {
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
     * @param aReportInstances DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportInstanceBean[] toArray(
        com.ourteam.report.dao.ReportInstance[] aReportInstances) {
        return toArray(aReportInstances, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportInstances DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportInstanceBean[] toArray(
        com.ourteam.report.dao.ReportInstance[] aReportInstances,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportInstances)) {
            return new ReportInstanceBean[0];
        } // end if

        int length = aReportInstances.length;

        ReportInstanceBean[] beans = new ReportInstanceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportInstanceBean(aReportInstances[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportInstanceBean(aReportInstances[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportInstances[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportInstanceBean
