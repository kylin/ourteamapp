/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:37
 *
 * @model auto gen
 */
public class ReportViewDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportViewDefine objReportViewDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportViewDefineDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.report.dao.IReportViewDefineDAO.Code);

        mappedDaoFields.put("groupBy",
            com.ourteam.report.dao.IReportViewDefineDAO.GroupBy);

        mappedDaoFields.put("isDistinct",
            com.ourteam.report.dao.IReportViewDefineDAO.IsDistinct);

        mappedDaoFields.put("name",
            com.ourteam.report.dao.IReportViewDefineDAO.Name);

        mappedDaoFields.put("orderBy",
            com.ourteam.report.dao.IReportViewDefineDAO.OrderBy);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportViewDefineDAO.Remarks);

        mappedDaoFields.put("reportProjectId",
            com.ourteam.report.dao.IReportViewDefineDAO.ReportProjectId);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportViewDefineDAO.Status);

        mappedDaoFields.put("unionViews",
            com.ourteam.report.dao.IReportViewDefineDAO.UnionViews);

        mappedDaoFields.put("viewFilters",
            com.ourteam.report.dao.IReportViewDefineDAO.ViewFilters);

        mappedDaoFields.put("reportProjectCode",
            com.ourteam.report.dao.IReportViewDefineDAO.ReportProjectCode);

        mappedDaoFields.put("reportProjectName",
            com.ourteam.report.dao.IReportViewDefineDAO.ReportProjectName);
    } 

    /**
     * Creates a new ReportViewDefineBean object.
     */
    public ReportViewDefineBean() {
        super();

        objReportViewDefine = new com.ourteam.report.dao.ReportViewDefine();
    } // end ReportViewDefineBean()

    /**
     * Creates a new ReportViewDefineBean object.
     *
     * @param aReportViewDefine DOCUMENT ME!
     */
    public ReportViewDefineBean(
        com.ourteam.report.dao.ReportViewDefine aReportViewDefine) {
        super();

        objReportViewDefine = aReportViewDefine;
    } // end ReportViewDefineBean()

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
    public com.ourteam.report.dao.ReportViewDefine convertToReportViewDefine() {
        return objReportViewDefine;
    } // end convertToReportViewDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportViewDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportViewDefine.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objReportViewDefine.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objReportViewDefine.setCode(aCode);
    } // end setCode()

    /**
     * Get GroupBy
     *
     * @return groupBy
     */
    public String getGroupBy() {
        return objReportViewDefine.getGroupBy();
    } // end getGroupBy()

    /**
     * Set GroupBy
     *
     * @param aGroupBy
     */
    public void setGroupBy(String aGroupBy) {
        this.objReportViewDefine.setGroupBy(aGroupBy);
    } // end setGroupBy()

    /**
     * Get IsDistinct
     *
     * @return isDistinct
     */
    public String getIsDistinct() {
        return objReportViewDefine.getIsDistinct();
    } // end getIsDistinct()

    /**
     * Set IsDistinct
     *
     * @param aIsDistinct
     */
    public void setIsDistinct(String aIsDistinct) {
        this.objReportViewDefine.setIsDistinct(aIsDistinct);
    } // end setIsDistinct()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objReportViewDefine.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objReportViewDefine.setName(aName);
    } // end setName()

    /**
     * Get OrderBy
     *
     * @return orderBy
     */
    public String getOrderBy() {
        return objReportViewDefine.getOrderBy();
    } // end getOrderBy()

    /**
     * Set OrderBy
     *
     * @param aOrderBy
     */
    public void setOrderBy(String aOrderBy) {
        this.objReportViewDefine.setOrderBy(aOrderBy);
    } // end setOrderBy()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportViewDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportViewDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportProjectId
     *
     * @return reportProjectId
     */
    public long getReportProjectId() {
        return objReportViewDefine.getReportProjectId();
    } // end getReportProjectId()

    /**
     * Set ReportProjectId
     *
     * @param aReportProjectId
     */
    public void setReportProjectId(long aReportProjectId) {
        this.objReportViewDefine.setReportProjectId(aReportProjectId);
    } // end setReportProjectId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportViewDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportViewDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get UnionViews
     *
     * @return unionViews
     */
    public String getUnionViews() {
        return objReportViewDefine.getUnionViews();
    } // end getUnionViews()

    /**
     * Set UnionViews
     *
     * @param aUnionViews
     */
    public void setUnionViews(String aUnionViews) {
        this.objReportViewDefine.setUnionViews(aUnionViews);
    } // end setUnionViews()

    /**
     * Get ViewFilters
     *
     * @return viewFilters
     */
    public String getViewFilters() {
        return objReportViewDefine.getViewFilters();
    } // end getViewFilters()

    /**
     * Set ViewFilters
     *
     * @param aViewFilters
     */
    public void setViewFilters(String aViewFilters) {
        this.objReportViewDefine.setViewFilters(aViewFilters);
    } // end setViewFilters()

    /**
     * Get ReportProjectCode
     *
     * @return reportProjectCode
     */
    public String getReportProjectCode() {
        return objReportViewDefine.getReportProjectCode();
    } // end getReportProjectCode()

    /**
     * Get ReportProjectName
     *
     * @return reportProjectName
     */
    public String getReportProjectName() {
        return objReportViewDefine.getReportProjectName();
    } // end getReportProjectName()

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

        if ((obj instanceof ReportViewDefineBean) == false) {
            return false;
        } // end if

        ReportViewDefineBean other = (ReportViewDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportViewDefine tempReportViewDefine = other.convertToReportViewDefine();

        if ((tempReportViewDefine == null) ||
                (this.objReportViewDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportViewDefine == this.objReportViewDefine) ||
                tempReportViewDefine.equals(this.objReportViewDefine)) {
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
     * @param aReportViewDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewDefineBean[] toArray(
        com.ourteam.report.dao.ReportViewDefine[] aReportViewDefines) {
        return toArray(aReportViewDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewDefineBean[] toArray(
        com.ourteam.report.dao.ReportViewDefine[] aReportViewDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportViewDefines)) {
            return new ReportViewDefineBean[0];
        } // end if

        int length = aReportViewDefines.length;

        ReportViewDefineBean[] beans = new ReportViewDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewDefineBean(aReportViewDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewDefineBean(aReportViewDefines[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportViewDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportViewDefineBean
