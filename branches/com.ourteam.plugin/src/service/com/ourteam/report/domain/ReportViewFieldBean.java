/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-23 10:01:58
 *
 * @model auto gen
 */
public class ReportViewFieldBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportViewField objReportViewField;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportViewFieldDAO.Id);

        mappedDaoFields.put("dataType",
            com.ourteam.report.dao.IReportViewFieldDAO.DataType);

        mappedDaoFields.put("fieldAlias",
            com.ourteam.report.dao.IReportViewFieldDAO.FieldAlias);

        mappedDaoFields.put("fieldName",
            com.ourteam.report.dao.IReportViewFieldDAO.FieldName);

        mappedDaoFields.put("listSourceId",
            com.ourteam.report.dao.IReportViewFieldDAO.ListSourceId);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportViewFieldDAO.Remarks);

        mappedDaoFields.put("reportViewId",
            com.ourteam.report.dao.IReportViewFieldDAO.ReportViewId);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportViewFieldDAO.Status);

        mappedDaoFields.put("title",
            com.ourteam.report.dao.IReportViewFieldDAO.Title);

        mappedDaoFields.put("width",
            com.ourteam.report.dao.IReportViewFieldDAO.Width);

        mappedDaoFields.put("listSourceCode",
            com.ourteam.report.dao.IReportViewFieldDAO.ListSourceCode);

        mappedDaoFields.put("listSourceName",
            com.ourteam.report.dao.IReportViewFieldDAO.ListSourceName);

        mappedDaoFields.put("tableId",
            com.ourteam.report.dao.IReportViewFieldDAO.TableId);

        mappedDaoFields.put("tableName",
            com.ourteam.report.dao.IReportViewFieldDAO.TableName);

        mappedDaoFields.put("tableAlias",
            com.ourteam.report.dao.IReportViewFieldDAO.TableAlias);
    } 

    /**
     * Creates a new ReportViewFieldBean object.
     */
    public ReportViewFieldBean() {
        super();

        objReportViewField = new com.ourteam.report.dao.ReportViewField();
    } // end ReportViewFieldBean()

    /**
     * Creates a new ReportViewFieldBean object.
     *
     * @param aReportViewField DOCUMENT ME!
     */
    public ReportViewFieldBean(
        com.ourteam.report.dao.ReportViewField aReportViewField) {
        super();

        objReportViewField = aReportViewField;
    } // end ReportViewFieldBean()

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
    public com.ourteam.report.dao.ReportViewField convertToReportViewField() {
        return objReportViewField;
    } // end convertToReportViewField()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportViewField.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportViewField.setId(aId);
    } // end setId()

    /**
     * Get DataType
     *
     * @return dataType
     */
    public String getDataType() {
        return objReportViewField.getDataType();
    } // end getDataType()

    /**
     * Set DataType
     *
     * @param aDataType
     */
    public void setDataType(String aDataType) {
        this.objReportViewField.setDataType(aDataType);
    } // end setDataType()

    /**
     * Get FieldAlias
     *
     * @return fieldAlias
     */
    public String getFieldAlias() {
        return objReportViewField.getFieldAlias();
    } // end getFieldAlias()

    /**
     * Set FieldAlias
     *
     * @param aFieldAlias
     */
    public void setFieldAlias(String aFieldAlias) {
        this.objReportViewField.setFieldAlias(aFieldAlias);
    } // end setFieldAlias()

    /**
     * Get FieldName
     *
     * @return fieldName
     */
    public String getFieldName() {
        return objReportViewField.getFieldName();
    } // end getFieldName()

    /**
     * Set FieldName
     *
     * @param aFieldName
     */
    public void setFieldName(String aFieldName) {
        this.objReportViewField.setFieldName(aFieldName);
    } // end setFieldName()

    /**
     * Get ListSourceId
     *
     * @return listSourceId
     */
    public long getListSourceId() {
        return objReportViewField.getListSourceId();
    } // end getListSourceId()

    /**
     * Set ListSourceId
     *
     * @param aListSourceId
     */
    public void setListSourceId(long aListSourceId) {
        this.objReportViewField.setListSourceId(aListSourceId);
    } // end setListSourceId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportViewField.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportViewField.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportViewId
     *
     * @return reportViewId
     */
    public long getReportViewId() {
        return objReportViewField.getReportViewId();
    } // end getReportViewId()

    /**
     * Set ReportViewId
     *
     * @param aReportViewId
     */
    public void setReportViewId(long aReportViewId) {
        this.objReportViewField.setReportViewId(aReportViewId);
    } // end setReportViewId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportViewField.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportViewField.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Title
     *
     * @return title
     */
    public String getTitle() {
        return objReportViewField.getTitle();
    } // end getTitle()

    /**
     * Set Title
     *
     * @param aTitle
     */
    public void setTitle(String aTitle) {
        this.objReportViewField.setTitle(aTitle);
    } // end setTitle()

    /**
     * Get Width
     *
     * @return width
     */
    public int getWidth() {
        return objReportViewField.getWidth();
    } // end getWidth()

    /**
     * Set Width
     *
     * @param aWidth
     */
    public void setWidth(int aWidth) {
        this.objReportViewField.setWidth(aWidth);
    } // end setWidth()

    /**
     * Get ListSourceCode
     *
     * @return listSourceCode
     */
    public String getListSourceCode() {
        return objReportViewField.getListSourceCode();
    } // end getListSourceCode()

    /**
     * Get ListSourceName
     *
     * @return listSourceName
     */
    public String getListSourceName() {
        return objReportViewField.getListSourceName();
    } // end getListSourceName()

    /**
     * Get TableId
     *
     * @return tableId
     */
    public long getTableId() {
        return objReportViewField.getTableId();
    } // end getTableId()

    /**
     * Set TableId
     *
     * @param aTableId
     */
    public void setTableId(long aTableId) {
        this.objReportViewField.setTableId(aTableId);
    } // end setTableId()

    /**
     * Get TableName
     *
     * @return tableName
     */
    public String getTableName() {
        return objReportViewField.getTableName();
    } // end getTableName()

    /**
     * Set TableName
     *
     * @param aTableName
     */
    public void setTableName(String aTableName) {
        this.objReportViewField.setTableName(aTableName);
    } // end setTableName()

    /**
     * Get TableAlias
     *
     * @return tableAlias
     */
    public String getTableAlias() {
        return objReportViewField.getTableAlias();
    } // end getTableAlias()

    /**
     * Set TableAlias
     *
     * @param aTableAlias
     */
    public void setTableAlias(String aTableAlias) {
        this.objReportViewField.setTableAlias(aTableAlias);
    } // end setTableAlias()

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

        if ((obj instanceof ReportViewFieldBean) == false) {
            return false;
        } // end if

        ReportViewFieldBean other = (ReportViewFieldBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportViewField tempReportViewField = other.convertToReportViewField();

        if ((tempReportViewField == null) || (this.objReportViewField == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportViewField == this.objReportViewField) ||
                tempReportViewField.equals(this.objReportViewField)) {
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
     * @param aReportViewFields DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewFieldBean[] toArray(
        com.ourteam.report.dao.ReportViewField[] aReportViewFields) {
        return toArray(aReportViewFields, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewFields DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewFieldBean[] toArray(
        com.ourteam.report.dao.ReportViewField[] aReportViewFields,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportViewFields)) {
            return new ReportViewFieldBean[0];
        } // end if

        int length = aReportViewFields.length;

        ReportViewFieldBean[] beans = new ReportViewFieldBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewFieldBean(aReportViewFields[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewFieldBean(aReportViewFields[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportViewFields[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportViewFieldBean
