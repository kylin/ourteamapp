/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-26 15:19:55
 *
 * @model auto gen
 */
public class ReportFilterBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportFilter objReportFilter;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportFilterDAO.Id);

        mappedDaoFields.put("connection",
            com.ourteam.report.dao.IReportFilterDAO.Connection);

        mappedDaoFields.put("fieldId",
            com.ourteam.report.dao.IReportFilterDAO.FieldId);

        mappedDaoFields.put("leftSymbol",
            com.ourteam.report.dao.IReportFilterDAO.LeftSymbol);

        mappedDaoFields.put("operation",
            com.ourteam.report.dao.IReportFilterDAO.Operation);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportFilterDAO.Remarks);

        mappedDaoFields.put("reportInstanceId",
            com.ourteam.report.dao.IReportFilterDAO.ReportInstanceId);

        mappedDaoFields.put("rightSymbol",
            com.ourteam.report.dao.IReportFilterDAO.RightSymbol);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportFilterDAO.Status);

        mappedDaoFields.put("value",
            com.ourteam.report.dao.IReportFilterDAO.Value);

        mappedDaoFields.put("fieldDataType",
            com.ourteam.report.dao.IReportFilterDAO.FieldDataType);

        mappedDaoFields.put("fieldName",
            com.ourteam.report.dao.IReportFilterDAO.FieldName);

        mappedDaoFields.put("fieldAlias",
            com.ourteam.report.dao.IReportFilterDAO.FieldAlias);

        mappedDaoFields.put("fieldTitle",
            com.ourteam.report.dao.IReportFilterDAO.FieldTitle);

        mappedDaoFields.put("fieldListSourceId",
            com.ourteam.report.dao.IReportFilterDAO.FieldListSourceId);
    } 

    /**
     * Creates a new ReportFilterBean object.
     */
    public ReportFilterBean() {
        super();

        objReportFilter = new com.ourteam.report.dao.ReportFilter();
    } // end ReportFilterBean()

    /**
     * Creates a new ReportFilterBean object.
     *
     * @param aReportFilter DOCUMENT ME!
     */
    public ReportFilterBean(com.ourteam.report.dao.ReportFilter aReportFilter) {
        super();

        objReportFilter = aReportFilter;
    } // end ReportFilterBean()

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
    public com.ourteam.report.dao.ReportFilter convertToReportFilter() {
        return objReportFilter;
    } // end convertToReportFilter()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportFilter.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportFilter.setId(aId);
    } // end setId()

    /**
     * Get Connection
     *
     * @return connection
     */
    public String getConnection() {
        return objReportFilter.getConnection();
    } // end getConnection()

    /**
     * Set Connection
     *
     * @param aConnection
     */
    public void setConnection(String aConnection) {
        this.objReportFilter.setConnection(aConnection);
    } // end setConnection()

    /**
     * Get FieldId
     *
     * @return fieldId
     */
    public long getFieldId() {
        return objReportFilter.getFieldId();
    } // end getFieldId()

    /**
     * Set FieldId
     *
     * @param aFieldId
     */
    public void setFieldId(long aFieldId) {
        this.objReportFilter.setFieldId(aFieldId);
    } // end setFieldId()

    /**
     * Get LeftSymbol
     *
     * @return leftSymbol
     */
    public String getLeftSymbol() {
        return objReportFilter.getLeftSymbol();
    } // end getLeftSymbol()

    /**
     * Set LeftSymbol
     *
     * @param aLeftSymbol
     */
    public void setLeftSymbol(String aLeftSymbol) {
        this.objReportFilter.setLeftSymbol(aLeftSymbol);
    } // end setLeftSymbol()

    /**
     * Get Operation
     *
     * @return operation
     */
    public String getOperation() {
        return objReportFilter.getOperation();
    } // end getOperation()

    /**
     * Set Operation
     *
     * @param aOperation
     */
    public void setOperation(String aOperation) {
        this.objReportFilter.setOperation(aOperation);
    } // end setOperation()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportFilter.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportFilter.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportInstanceId
     *
     * @return reportInstanceId
     */
    public long getReportInstanceId() {
        return objReportFilter.getReportInstanceId();
    } // end getReportInstanceId()

    /**
     * Set ReportInstanceId
     *
     * @param aReportInstanceId
     */
    public void setReportInstanceId(long aReportInstanceId) {
        this.objReportFilter.setReportInstanceId(aReportInstanceId);
    } // end setReportInstanceId()

    /**
     * Get RightSymbol
     *
     * @return rightSymbol
     */
    public String getRightSymbol() {
        return objReportFilter.getRightSymbol();
    } // end getRightSymbol()

    /**
     * Set RightSymbol
     *
     * @param aRightSymbol
     */
    public void setRightSymbol(String aRightSymbol) {
        this.objReportFilter.setRightSymbol(aRightSymbol);
    } // end setRightSymbol()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportFilter.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportFilter.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Value
     *
     * @return value
     */
    public String getValue() {
        return objReportFilter.getValue();
    } // end getValue()

    /**
     * Set Value
     *
     * @param aValue
     */
    public void setValue(String aValue) {
        this.objReportFilter.setValue(aValue);
    } // end setValue()

    /**
     * Get FieldDataType
     *
     * @return fieldDataType
     */
    public String getFieldDataType() {
        return objReportFilter.getFieldDataType();
    } // end getFieldDataType()

    /**
     * Set FieldDataType
     *
     * @param aFieldDataType
     */
    public void setFieldDataType(String aFieldDataType) {
        this.objReportFilter.setFieldDataType(aFieldDataType);
    } // end setFieldDataType()

    /**
     * Get FieldName
     *
     * @return fieldName
     */
    public String getFieldName() {
        return objReportFilter.getFieldName();
    } // end getFieldName()

    /**
     * Set FieldName
     *
     * @param aFieldName
     */
    public void setFieldName(String aFieldName) {
        this.objReportFilter.setFieldName(aFieldName);
    } // end setFieldName()

    /**
     * Get FieldAlias
     *
     * @return fieldAlias
     */
    public String getFieldAlias() {
        return objReportFilter.getFieldAlias();
    } // end getFieldAlias()

    /**
     * Set FieldAlias
     *
     * @param aFieldAlias
     */
    public void setFieldAlias(String aFieldAlias) {
        this.objReportFilter.setFieldAlias(aFieldAlias);
    } // end setFieldAlias()

    /**
     * Get FieldTitle
     *
     * @return fieldTitle
     */
    public String getFieldTitle() {
        return objReportFilter.getFieldTitle();
    } // end getFieldTitle()

    /**
     * Set FieldTitle
     *
     * @param aFieldTitle
     */
    public void setFieldTitle(String aFieldTitle) {
        this.objReportFilter.setFieldTitle(aFieldTitle);
    } // end setFieldTitle()

    /**
     * Get FieldListSourceId
     *
     * @return fieldListSourceId
     */
    public long getFieldListSourceId() {
        return objReportFilter.getFieldListSourceId();
    } // end getFieldListSourceId()

    /**
     * Set FieldListSourceId
     *
     * @param aFieldListSourceId
     */
    public void setFieldListSourceId(long aFieldListSourceId) {
        this.objReportFilter.setFieldListSourceId(aFieldListSourceId);
    } // end setFieldListSourceId()

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

        if ((obj instanceof ReportFilterBean) == false) {
            return false;
        } // end if

        ReportFilterBean other = (ReportFilterBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportFilter tempReportFilter = other.convertToReportFilter();

        if ((tempReportFilter == null) || (this.objReportFilter == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportFilter == this.objReportFilter) ||
                tempReportFilter.equals(this.objReportFilter)) {
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
     * @param aReportFilters DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportFilterBean[] toArray(
        com.ourteam.report.dao.ReportFilter[] aReportFilters) {
        return toArray(aReportFilters, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportFilters DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportFilterBean[] toArray(
        com.ourteam.report.dao.ReportFilter[] aReportFilters,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportFilters)) {
            return new ReportFilterBean[0];
        } // end if

        int length = aReportFilters.length;

        ReportFilterBean[] beans = new ReportFilterBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportFilterBean(aReportFilters[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportFilterBean(aReportFilters[i]);

                aCallBack.populate(beans[i], new Object[] { aReportFilters[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportFilterBean
