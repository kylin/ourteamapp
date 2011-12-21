/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:38
 *
 * @model auto gen
 */
public class ReportViewTableBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportViewTable objReportViewTable;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportViewTableDAO.Id);

        mappedDaoFields.put("joinCond",
            com.ourteam.report.dao.IReportViewTableDAO.JoinCond);

        mappedDaoFields.put("joinType",
            com.ourteam.report.dao.IReportViewTableDAO.JoinType);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportViewTableDAO.Remarks);

        mappedDaoFields.put("reportViewId",
            com.ourteam.report.dao.IReportViewTableDAO.ReportViewId);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportViewTableDAO.Status);

        mappedDaoFields.put("tableAlias",
            com.ourteam.report.dao.IReportViewTableDAO.TableAlias);

        mappedDaoFields.put("tableName",
            com.ourteam.report.dao.IReportViewTableDAO.TableName);
    } 

    /**
     * Creates a new ReportViewTableBean object.
     */
    public ReportViewTableBean() {
        super();

        objReportViewTable = new com.ourteam.report.dao.ReportViewTable();
    } // end ReportViewTableBean()

    /**
     * Creates a new ReportViewTableBean object.
     *
     * @param aReportViewTable DOCUMENT ME!
     */
    public ReportViewTableBean(
        com.ourteam.report.dao.ReportViewTable aReportViewTable) {
        super();

        objReportViewTable = aReportViewTable;
    } // end ReportViewTableBean()

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
    public com.ourteam.report.dao.ReportViewTable convertToReportViewTable() {
        return objReportViewTable;
    } // end convertToReportViewTable()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportViewTable.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportViewTable.setId(aId);
    } // end setId()

    /**
     * Get JoinCond
     *
     * @return joinCond
     */
    public String getJoinCond() {
        return objReportViewTable.getJoinCond();
    } // end getJoinCond()

    /**
     * Set JoinCond
     *
     * @param aJoinCond
     */
    public void setJoinCond(String aJoinCond) {
        this.objReportViewTable.setJoinCond(aJoinCond);
    } // end setJoinCond()

    /**
     * Get JoinType
     *
     * @return joinType
     */
    public String getJoinType() {
        return objReportViewTable.getJoinType();
    } // end getJoinType()

    /**
     * Set JoinType
     *
     * @param aJoinType
     */
    public void setJoinType(String aJoinType) {
        this.objReportViewTable.setJoinType(aJoinType);
    } // end setJoinType()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportViewTable.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportViewTable.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportViewId
     *
     * @return reportViewId
     */
    public long getReportViewId() {
        return objReportViewTable.getReportViewId();
    } // end getReportViewId()

    /**
     * Set ReportViewId
     *
     * @param aReportViewId
     */
    public void setReportViewId(long aReportViewId) {
        this.objReportViewTable.setReportViewId(aReportViewId);
    } // end setReportViewId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportViewTable.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportViewTable.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TableAlias
     *
     * @return tableAlias
     */
    public String getTableAlias() {
        return objReportViewTable.getTableAlias();
    } // end getTableAlias()

    /**
     * Set TableAlias
     *
     * @param aTableAlias
     */
    public void setTableAlias(String aTableAlias) {
        this.objReportViewTable.setTableAlias(aTableAlias);
    } // end setTableAlias()

    /**
     * Get TableName
     *
     * @return tableName
     */
    public String getTableName() {
        return objReportViewTable.getTableName();
    } // end getTableName()

    /**
     * Set TableName
     *
     * @param aTableName
     */
    public void setTableName(String aTableName) {
        this.objReportViewTable.setTableName(aTableName);
    } // end setTableName()

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

        if ((obj instanceof ReportViewTableBean) == false) {
            return false;
        } // end if

        ReportViewTableBean other = (ReportViewTableBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportViewTable tempReportViewTable = other.convertToReportViewTable();

        if ((tempReportViewTable == null) || (this.objReportViewTable == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportViewTable == this.objReportViewTable) ||
                tempReportViewTable.equals(this.objReportViewTable)) {
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
     * @param aReportViewTables DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewTableBean[] toArray(
        com.ourteam.report.dao.ReportViewTable[] aReportViewTables) {
        return toArray(aReportViewTables, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewTables DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewTableBean[] toArray(
        com.ourteam.report.dao.ReportViewTable[] aReportViewTables,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportViewTables)) {
            return new ReportViewTableBean[0];
        } // end if

        int length = aReportViewTables.length;

        ReportViewTableBean[] beans = new ReportViewTableBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewTableBean(aReportViewTables[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewTableBean(aReportViewTables[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportViewTables[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportViewTableBean
