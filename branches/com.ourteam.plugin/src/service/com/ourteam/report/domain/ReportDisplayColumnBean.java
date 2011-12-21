/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-26 09:33:36
 *
 * @model auto gen
 */
public class ReportDisplayColumnBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportDisplayColumn objReportDisplayColumn;

    static {
        mappedDaoFields.put("id",
            com.ourteam.report.dao.IReportDisplayColumnDAO.Id);

        mappedDaoFields.put("columnTitle",
            com.ourteam.report.dao.IReportDisplayColumnDAO.ColumnTitle);

        mappedDaoFields.put("columnWidth",
            com.ourteam.report.dao.IReportDisplayColumnDAO.ColumnWidth);

        mappedDaoFields.put("fieldId",
            com.ourteam.report.dao.IReportDisplayColumnDAO.FieldId);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportDisplayColumnDAO.Remarks);

        mappedDaoFields.put("reportInstanceId",
            com.ourteam.report.dao.IReportDisplayColumnDAO.ReportInstanceId);

        mappedDaoFields.put("sortIndex",
            com.ourteam.report.dao.IReportDisplayColumnDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportDisplayColumnDAO.Status);

        mappedDaoFields.put("fieldDataType",
            com.ourteam.report.dao.IReportDisplayColumnDAO.FieldDataType);

        mappedDaoFields.put("fieldAlias",
            com.ourteam.report.dao.IReportDisplayColumnDAO.FieldAlias);

        mappedDaoFields.put("fieldName",
            com.ourteam.report.dao.IReportDisplayColumnDAO.FieldName);

        mappedDaoFields.put("fieldWidth",
            com.ourteam.report.dao.IReportDisplayColumnDAO.FieldWidth);

        mappedDaoFields.put("fieldTitle",
            com.ourteam.report.dao.IReportDisplayColumnDAO.FieldTitle);
    } 

    /**
     * Creates a new ReportDisplayColumnBean object.
     */
    public ReportDisplayColumnBean() {
        super();

        objReportDisplayColumn = new com.ourteam.report.dao.ReportDisplayColumn();
    } // end ReportDisplayColumnBean()

    /**
     * Creates a new ReportDisplayColumnBean object.
     *
     * @param aReportDisplayColumn DOCUMENT ME!
     */
    public ReportDisplayColumnBean(
        com.ourteam.report.dao.ReportDisplayColumn aReportDisplayColumn) {
        super();

        objReportDisplayColumn = aReportDisplayColumn;
    } // end ReportDisplayColumnBean()

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
    public com.ourteam.report.dao.ReportDisplayColumn convertToReportDisplayColumn() {
        return objReportDisplayColumn;
    } // end convertToReportDisplayColumn()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportDisplayColumn.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportDisplayColumn.setId(aId);
    } // end setId()

    /**
     * Get ColumnTitle
     *
     * @return columnTitle
     */
    public String getColumnTitle() {
        return objReportDisplayColumn.getColumnTitle();
    } // end getColumnTitle()

    /**
     * Set ColumnTitle
     *
     * @param aColumnTitle
     */
    public void setColumnTitle(String aColumnTitle) {
        this.objReportDisplayColumn.setColumnTitle(aColumnTitle);
    } // end setColumnTitle()

    /**
     * Get ColumnWidth
     *
     * @return columnWidth
     */
    public int getColumnWidth() {
        return objReportDisplayColumn.getColumnWidth();
    } // end getColumnWidth()

    /**
     * Set ColumnWidth
     *
     * @param aColumnWidth
     */
    public void setColumnWidth(int aColumnWidth) {
        this.objReportDisplayColumn.setColumnWidth(aColumnWidth);
    } // end setColumnWidth()

    /**
     * Get FieldId
     *
     * @return fieldId
     */
    public long getFieldId() {
        return objReportDisplayColumn.getFieldId();
    } // end getFieldId()

    /**
     * Set FieldId
     *
     * @param aFieldId
     */
    public void setFieldId(long aFieldId) {
        this.objReportDisplayColumn.setFieldId(aFieldId);
    } // end setFieldId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportDisplayColumn.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportDisplayColumn.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportInstanceId
     *
     * @return reportInstanceId
     */
    public long getReportInstanceId() {
        return objReportDisplayColumn.getReportInstanceId();
    } // end getReportInstanceId()

    /**
     * Set ReportInstanceId
     *
     * @param aReportInstanceId
     */
    public void setReportInstanceId(long aReportInstanceId) {
        this.objReportDisplayColumn.setReportInstanceId(aReportInstanceId);
    } // end setReportInstanceId()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public int getSortIndex() {
        return objReportDisplayColumn.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(int aSortIndex) {
        this.objReportDisplayColumn.setSortIndex(aSortIndex);
    } // end setSortIndex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportDisplayColumn.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportDisplayColumn.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get FieldDataType
     *
     * @return fieldDataType
     */
    public String getFieldDataType() {
        return objReportDisplayColumn.getFieldDataType();
    } // end getFieldDataType()

    /**
     * Set FieldDataType
     *
     * @param aFieldDataType
     */
    public void setFieldDataType(String aFieldDataType) {
        this.objReportDisplayColumn.setFieldDataType(aFieldDataType);
    } // end setFieldDataType()

    /**
     * Get FieldAlias
     *
     * @return fieldAlias
     */
    public String getFieldAlias() {
        return objReportDisplayColumn.getFieldAlias();
    } // end getFieldAlias()

    /**
     * Set FieldAlias
     *
     * @param aFieldAlias
     */
    public void setFieldAlias(String aFieldAlias) {
        this.objReportDisplayColumn.setFieldAlias(aFieldAlias);
    } // end setFieldAlias()

    /**
     * Get FieldName
     *
     * @return fieldName
     */
    public String getFieldName() {
        return objReportDisplayColumn.getFieldName();
    } // end getFieldName()

    /**
     * Set FieldName
     *
     * @param aFieldName
     */
    public void setFieldName(String aFieldName) {
        this.objReportDisplayColumn.setFieldName(aFieldName);
    } // end setFieldName()

    /**
     * Get FieldWidth
     *
     * @return fieldWidth
     */
    public int getFieldWidth() {
        return objReportDisplayColumn.getFieldWidth();
    } // end getFieldWidth()

    /**
     * Set FieldWidth
     *
     * @param aFieldWidth
     */
    public void setFieldWidth(int aFieldWidth) {
        this.objReportDisplayColumn.setFieldWidth(aFieldWidth);
    } // end setFieldWidth()

    /**
     * Get FieldTitle
     *
     * @return fieldTitle
     */
    public String getFieldTitle() {
        return objReportDisplayColumn.getFieldTitle();
    } // end getFieldTitle()

    /**
     * Set FieldTitle
     *
     * @param aFieldTitle
     */
    public void setFieldTitle(String aFieldTitle) {
        this.objReportDisplayColumn.setFieldTitle(aFieldTitle);
    } // end setFieldTitle()

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

        if ((obj instanceof ReportDisplayColumnBean) == false) {
            return false;
        } // end if

        ReportDisplayColumnBean other = (ReportDisplayColumnBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportDisplayColumn tempReportDisplayColumn = other.convertToReportDisplayColumn();

        if ((tempReportDisplayColumn == null) ||
                (this.objReportDisplayColumn == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportDisplayColumn == this.objReportDisplayColumn) ||
                tempReportDisplayColumn.equals(this.objReportDisplayColumn)) {
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
     * @param aReportDisplayColumns DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportDisplayColumnBean[] toArray(
        com.ourteam.report.dao.ReportDisplayColumn[] aReportDisplayColumns) {
        return toArray(aReportDisplayColumns, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDisplayColumns DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportDisplayColumnBean[] toArray(
        com.ourteam.report.dao.ReportDisplayColumn[] aReportDisplayColumns,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportDisplayColumns)) {
            return new ReportDisplayColumnBean[0];
        } // end if

        int length = aReportDisplayColumns.length;

        ReportDisplayColumnBean[] beans = new ReportDisplayColumnBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportDisplayColumnBean(aReportDisplayColumns[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportDisplayColumnBean(aReportDisplayColumns[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportDisplayColumns[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportDisplayColumnBean
