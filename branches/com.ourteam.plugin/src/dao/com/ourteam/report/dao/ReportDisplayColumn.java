/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:53
 *
 * @author Auto Gen
 */
public class ReportDisplayColumn implements java.io.Serializable {
    /**
     * Creates a new ReportDisplayColumn object.
     */
    public ReportDisplayColumn() {
        super();
    } // end ReportDisplayColumn()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String columnTitle;

    /** Attribute  Be Seted Falg */
    private boolean columnTitleSetted = false;

    /** Attribute  is Null Falg */
    private boolean columnTitleNull = false;

    /** Attribute */
    private int columnWidth;

    /** Attribute  Be Seted Falg */
    private boolean columnWidthSetted = false;

    /** Attribute  is Null Falg */
    private boolean columnWidthNull = false;

    /** Attribute */
    private long fieldId;

    /** Attribute  Be Seted Falg */
    private boolean fieldIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long reportInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean reportInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportInstanceIdNull = false;

    /** Attribute */
    private int sortIndex;

    /** Attribute  Be Seted Falg */
    private boolean sortIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortIndexNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String fieldDataType;

    /** Attribute  Be Seted Falg */
    private boolean fieldDataTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldDataTypeNull = false;

    /** Attribute */
    private String fieldAlias;

    /** Attribute  Be Seted Falg */
    private boolean fieldAliasSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldAliasNull = false;

    /** Attribute */
    private String fieldName;

    /** Attribute  Be Seted Falg */
    private boolean fieldNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldNameNull = false;

    /** Attribute */
    private int fieldWidth;

    /** Attribute  Be Seted Falg */
    private boolean fieldWidthSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldWidthNull = false;

    /** Attribute */
    private String fieldTitle;

    /** Attribute  Be Seted Falg */
    private boolean fieldTitleSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldTitleNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get ColumnTitle
     *
     * @return columnTitle
     */
    final public String getColumnTitle() {
        return columnTitle;
    } // end getColumnTitle()

    /**
     * Set ColumnTitle
     *
     * @param aColumnTitle
     */
    final public void setColumnTitle(String aColumnTitle) {
        this.columnTitle = aColumnTitle;

        this.columnTitleSetted = true;

        this.setColumnTitleNull(this.columnTitle == null);
    } // end setColumnTitle()

    /**
     * Get ColumnTitle Has Been Setted
     *
     * @return columnTitle
     */
    final public boolean isColumnTitleSetted() {
        return this.columnTitleSetted;
    } // end isColumnTitleSetted()

    /**
     * Set ColumnTitle Null
     */
    final public void setColumnTitleNull() {
        this.columnTitleNull = true;
    } // end setColumnTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setColumnTitleNull(boolean aNullFlag) {
        this.columnTitleNull = aNullFlag;
    } // end setColumnTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isColumnTitleNull() {
        return this.columnTitleNull;
    } // end isColumnTitleNull()

    /**
     * Get ColumnWidth
     *
     * @return columnWidth
     */
    final public int getColumnWidth() {
        return columnWidth;
    } // end getColumnWidth()

    /**
     * Set ColumnWidth
     *
     * @param aColumnWidth
     */
    final public void setColumnWidth(int aColumnWidth) {
        this.columnWidth = aColumnWidth;

        this.columnWidthSetted = true;

        this.setColumnWidthNull(false);
    } // end setColumnWidth()

    /**
     * Get ColumnWidth Has Been Setted
     *
     * @return columnWidth
     */
    final public boolean isColumnWidthSetted() {
        return this.columnWidthSetted;
    } // end isColumnWidthSetted()

    /**
     * Set ColumnWidth Null
     */
    final public void setColumnWidthNull() {
        this.columnWidthNull = true;
    } // end setColumnWidthNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setColumnWidthNull(boolean aNullFlag) {
        this.columnWidthNull = aNullFlag;
    } // end setColumnWidthNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isColumnWidthNull() {
        return this.columnWidthNull;
    } // end isColumnWidthNull()

    /**
     * Get FieldId
     *
     * @return fieldId
     */
    final public long getFieldId() {
        return fieldId;
    } // end getFieldId()

    /**
     * Set FieldId
     *
     * @param aFieldId
     */
    final public void setFieldId(long aFieldId) {
        this.fieldId = aFieldId;

        this.fieldIdSetted = true;

        this.setFieldIdNull(false);
    } // end setFieldId()

    /**
     * Get FieldId Has Been Setted
     *
     * @return fieldId
     */
    final public boolean isFieldIdSetted() {
        return this.fieldIdSetted;
    } // end isFieldIdSetted()

    /**
     * Set FieldId Null
     */
    final public void setFieldIdNull() {
        this.fieldIdNull = true;
    } // end setFieldIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldIdNull(boolean aNullFlag) {
        this.fieldIdNull = aNullFlag;
    } // end setFieldIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldIdNull() {
        return this.fieldIdNull;
    } // end isFieldIdNull()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    final public String getRemarks() {
        if (isRemarksNull()) {
            return null;
        } // end if
        else {
            return remarks;
        } // end else
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    final public void setRemarks(String aRemarks) {
        this.remarks = aRemarks;

        this.remarksSetted = true;

        this.setRemarksNull(this.remarks == null);
    } // end setRemarks()

    /**
     * Get Remarks Has Been Setted
     *
     * @return remarks
     */
    final public boolean isRemarksSetted() {
        return this.remarksSetted;
    } // end isRemarksSetted()

    /**
     * Set Remarks Null
     */
    final public void setRemarksNull() {
        this.remarksNull = true;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRemarksNull(boolean aNullFlag) {
        this.remarksNull = aNullFlag;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRemarksNull() {
        return this.remarksNull;
    } // end isRemarksNull()

    /**
     * Get ReportInstanceId
     *
     * @return reportInstanceId
     */
    final public long getReportInstanceId() {
        return reportInstanceId;
    } // end getReportInstanceId()

    /**
     * Set ReportInstanceId
     *
     * @param aReportInstanceId
     */
    final public void setReportInstanceId(long aReportInstanceId) {
        this.reportInstanceId = aReportInstanceId;

        this.reportInstanceIdSetted = true;

        this.setReportInstanceIdNull(false);
    } // end setReportInstanceId()

    /**
     * Get ReportInstanceId Has Been Setted
     *
     * @return reportInstanceId
     */
    final public boolean isReportInstanceIdSetted() {
        return this.reportInstanceIdSetted;
    } // end isReportInstanceIdSetted()

    /**
     * Set ReportInstanceId Null
     */
    final public void setReportInstanceIdNull() {
        this.reportInstanceIdNull = true;
    } // end setReportInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportInstanceIdNull(boolean aNullFlag) {
        this.reportInstanceIdNull = aNullFlag;
    } // end setReportInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportInstanceIdNull() {
        return this.reportInstanceIdNull;
    } // end isReportInstanceIdNull()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    final public int getSortIndex() {
        return sortIndex;
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    final public void setSortIndex(int aSortIndex) {
        this.sortIndex = aSortIndex;

        this.sortIndexSetted = true;

        this.setSortIndexNull(false);
    } // end setSortIndex()

    /**
     * Get SortIndex Has Been Setted
     *
     * @return sortIndex
     */
    final public boolean isSortIndexSetted() {
        return this.sortIndexSetted;
    } // end isSortIndexSetted()

    /**
     * Set SortIndex Null
     */
    final public void setSortIndexNull() {
        this.sortIndexNull = true;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortIndexNull(boolean aNullFlag) {
        this.sortIndexNull = aNullFlag;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortIndexNull() {
        return this.sortIndexNull;
    } // end isSortIndexNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * Get FieldDataType
     *
     * @return fieldDataType
     */
    final public String getFieldDataType() {
        return fieldDataType;
    } // end getFieldDataType()

    /**
     * Set FieldDataType
     *
     * @param aFieldDataType
     */
    final public void setFieldDataType(String aFieldDataType) {
        this.fieldDataType = aFieldDataType;

        this.fieldDataTypeSetted = true;

        this.setFieldDataTypeNull(this.fieldDataType == null);
    } // end setFieldDataType()

    /**
     * Get FieldDataType Has Been Setted
     *
     * @return fieldDataType
     */
    final public boolean isFieldDataTypeSetted() {
        return this.fieldDataTypeSetted;
    } // end isFieldDataTypeSetted()

    /**
     * Set FieldDataType Null
     */
    final public void setFieldDataTypeNull() {
        this.fieldDataTypeNull = true;
    } // end setFieldDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldDataTypeNull(boolean aNullFlag) {
        this.fieldDataTypeNull = aNullFlag;
    } // end setFieldDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldDataTypeNull() {
        return this.fieldDataTypeNull;
    } // end isFieldDataTypeNull()

    /**
     * Get FieldAlias
     *
     * @return fieldAlias
     */
    final public String getFieldAlias() {
        return fieldAlias;
    } // end getFieldAlias()

    /**
     * Set FieldAlias
     *
     * @param aFieldAlias
     */
    final public void setFieldAlias(String aFieldAlias) {
        this.fieldAlias = aFieldAlias;

        this.fieldAliasSetted = true;

        this.setFieldAliasNull(this.fieldAlias == null);
    } // end setFieldAlias()

    /**
     * Get FieldAlias Has Been Setted
     *
     * @return fieldAlias
     */
    final public boolean isFieldAliasSetted() {
        return this.fieldAliasSetted;
    } // end isFieldAliasSetted()

    /**
     * Set FieldAlias Null
     */
    final public void setFieldAliasNull() {
        this.fieldAliasNull = true;
    } // end setFieldAliasNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldAliasNull(boolean aNullFlag) {
        this.fieldAliasNull = aNullFlag;
    } // end setFieldAliasNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldAliasNull() {
        return this.fieldAliasNull;
    } // end isFieldAliasNull()

    /**
     * Get FieldName
     *
     * @return fieldName
     */
    final public String getFieldName() {
        return fieldName;
    } // end getFieldName()

    /**
     * Set FieldName
     *
     * @param aFieldName
     */
    final public void setFieldName(String aFieldName) {
        this.fieldName = aFieldName;

        this.fieldNameSetted = true;

        this.setFieldNameNull(this.fieldName == null);
    } // end setFieldName()

    /**
     * Get FieldName Has Been Setted
     *
     * @return fieldName
     */
    final public boolean isFieldNameSetted() {
        return this.fieldNameSetted;
    } // end isFieldNameSetted()

    /**
     * Set FieldName Null
     */
    final public void setFieldNameNull() {
        this.fieldNameNull = true;
    } // end setFieldNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldNameNull(boolean aNullFlag) {
        this.fieldNameNull = aNullFlag;
    } // end setFieldNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldNameNull() {
        return this.fieldNameNull;
    } // end isFieldNameNull()

    /**
     * Get FieldWidth
     *
     * @return fieldWidth
     */
    final public int getFieldWidth() {
        return fieldWidth;
    } // end getFieldWidth()

    /**
     * Set FieldWidth
     *
     * @param aFieldWidth
     */
    final public void setFieldWidth(int aFieldWidth) {
        this.fieldWidth = aFieldWidth;

        this.fieldWidthSetted = true;

        this.setFieldWidthNull(false);
    } // end setFieldWidth()

    /**
     * Get FieldWidth Has Been Setted
     *
     * @return fieldWidth
     */
    final public boolean isFieldWidthSetted() {
        return this.fieldWidthSetted;
    } // end isFieldWidthSetted()

    /**
     * Set FieldWidth Null
     */
    final public void setFieldWidthNull() {
        this.fieldWidthNull = true;
    } // end setFieldWidthNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldWidthNull(boolean aNullFlag) {
        this.fieldWidthNull = aNullFlag;
    } // end setFieldWidthNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldWidthNull() {
        return this.fieldWidthNull;
    } // end isFieldWidthNull()

    /**
     * Get FieldTitle
     *
     * @return fieldTitle
     */
    final public String getFieldTitle() {
        return fieldTitle;
    } // end getFieldTitle()

    /**
     * Set FieldTitle
     *
     * @param aFieldTitle
     */
    final public void setFieldTitle(String aFieldTitle) {
        this.fieldTitle = aFieldTitle;

        this.fieldTitleSetted = true;

        this.setFieldTitleNull(this.fieldTitle == null);
    } // end setFieldTitle()

    /**
     * Get FieldTitle Has Been Setted
     *
     * @return fieldTitle
     */
    final public boolean isFieldTitleSetted() {
        return this.fieldTitleSetted;
    } // end isFieldTitleSetted()

    /**
     * Set FieldTitle Null
     */
    final public void setFieldTitleNull() {
        this.fieldTitleNull = true;
    } // end setFieldTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldTitleNull(boolean aNullFlag) {
        this.fieldTitleNull = aNullFlag;
    } // end setFieldTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldTitleNull() {
        return this.fieldTitleNull;
    } // end isFieldTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

        return result;
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

        if ((obj instanceof ReportDisplayColumn) == false) {
            return false;
        } // end if

        ReportDisplayColumn other = (ReportDisplayColumn) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("columnTitle=");
        buffer.append(this.columnTitle);
        buffer.append("\r\n");

        buffer.append("columnWidth=");
        buffer.append(this.columnWidth);
        buffer.append("\r\n");

        buffer.append("fieldId=");
        buffer.append(this.fieldId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportInstanceId=");
        buffer.append(this.reportInstanceId);
        buffer.append("\r\n");

        buffer.append("sortIndex=");
        buffer.append(this.sortIndex);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("fieldDataType=");
        buffer.append(this.fieldDataType);
        buffer.append("\r\n");

        buffer.append("fieldAlias=");
        buffer.append(this.fieldAlias);
        buffer.append("\r\n");

        buffer.append("fieldName=");
        buffer.append(this.fieldName);
        buffer.append("\r\n");

        buffer.append("fieldWidth=");
        buffer.append(this.fieldWidth);
        buffer.append("\r\n");

        buffer.append("fieldTitle=");
        buffer.append(this.fieldTitle);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportDisplayColumn
