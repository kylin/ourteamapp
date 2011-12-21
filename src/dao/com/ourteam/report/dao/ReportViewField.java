/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:59
 *
 * @author Auto Gen
 */
public class ReportViewField implements java.io.Serializable {
    /**
     * Creates a new ReportViewField object.
     */
    public ReportViewField() {
        super();
    } // end ReportViewField()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String dataType;

    /** Attribute  Be Seted Falg */
    private boolean dataTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean dataTypeNull = false;

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
    private long listSourceId;

    /** Attribute  Be Seted Falg */
    private boolean listSourceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean listSourceIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long reportViewId;

    /** Attribute  Be Seted Falg */
    private boolean reportViewIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String title;

    /** Attribute  Be Seted Falg */
    private boolean titleSetted = false;

    /** Attribute  is Null Falg */
    private boolean titleNull = false;

    /** Attribute */
    private int width;

    /** Attribute  Be Seted Falg */
    private boolean widthSetted = false;

    /** Attribute  is Null Falg */
    private boolean widthNull = false;

    /** Attribute */
    private String listSourceCode;

    /** Attribute  Be Seted Falg */
    private boolean listSourceCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean listSourceCodeNull = false;

    /** Attribute */
    private String listSourceName;

    /** Attribute  Be Seted Falg */
    private boolean listSourceNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean listSourceNameNull = false;

    /** Attribute */
    private long tableId;

    /** Attribute  Be Seted Falg */
    private boolean tableIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean tableIdNull = false;

    /** Attribute */
    private String tableName;

    /** Attribute  Be Seted Falg */
    private boolean tableNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean tableNameNull = false;

    /** Attribute */
    private String tableAlias;

    /** Attribute  Be Seted Falg */
    private boolean tableAliasSetted = false;

    /** Attribute  is Null Falg */
    private boolean tableAliasNull = false;

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
     * Get DataType
     *
     * @return dataType
     */
    final public String getDataType() {
        return dataType;
    } // end getDataType()

    /**
     * Set DataType
     *
     * @param aDataType
     */
    final public void setDataType(String aDataType) {
        this.dataType = aDataType;

        this.dataTypeSetted = true;

        this.setDataTypeNull(this.dataType == null);
    } // end setDataType()

    /**
     * Get DataType Has Been Setted
     *
     * @return dataType
     */
    final public boolean isDataTypeSetted() {
        return this.dataTypeSetted;
    } // end isDataTypeSetted()

    /**
     * Set DataType Null
     */
    final public void setDataTypeNull() {
        this.dataTypeNull = true;
    } // end setDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDataTypeNull(boolean aNullFlag) {
        this.dataTypeNull = aNullFlag;
    } // end setDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDataTypeNull() {
        return this.dataTypeNull;
    } // end isDataTypeNull()

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
     * Get ListSourceId
     *
     * @return listSourceId
     */
    final public long getListSourceId() {
        return listSourceId;
    } // end getListSourceId()

    /**
     * Set ListSourceId
     *
     * @param aListSourceId
     */
    final public void setListSourceId(long aListSourceId) {
        this.listSourceId = aListSourceId;

        this.listSourceIdSetted = true;

        this.setListSourceIdNull(false);
    } // end setListSourceId()

    /**
     * Get ListSourceId Has Been Setted
     *
     * @return listSourceId
     */
    final public boolean isListSourceIdSetted() {
        return this.listSourceIdSetted;
    } // end isListSourceIdSetted()

    /**
     * Set ListSourceId Null
     */
    final public void setListSourceIdNull() {
        this.listSourceIdNull = true;
    } // end setListSourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setListSourceIdNull(boolean aNullFlag) {
        this.listSourceIdNull = aNullFlag;
    } // end setListSourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isListSourceIdNull() {
        return this.listSourceIdNull;
    } // end isListSourceIdNull()

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
     * Get ReportViewId
     *
     * @return reportViewId
     */
    final public long getReportViewId() {
        return reportViewId;
    } // end getReportViewId()

    /**
     * Set ReportViewId
     *
     * @param aReportViewId
     */
    final public void setReportViewId(long aReportViewId) {
        this.reportViewId = aReportViewId;

        this.reportViewIdSetted = true;

        this.setReportViewIdNull(false);
    } // end setReportViewId()

    /**
     * Get ReportViewId Has Been Setted
     *
     * @return reportViewId
     */
    final public boolean isReportViewIdSetted() {
        return this.reportViewIdSetted;
    } // end isReportViewIdSetted()

    /**
     * Set ReportViewId Null
     */
    final public void setReportViewIdNull() {
        this.reportViewIdNull = true;
    } // end setReportViewIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewIdNull(boolean aNullFlag) {
        this.reportViewIdNull = aNullFlag;
    } // end setReportViewIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewIdNull() {
        return this.reportViewIdNull;
    } // end isReportViewIdNull()

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
     * Get Title
     *
     * @return title
     */
    final public String getTitle() {
        return title;
    } // end getTitle()

    /**
     * Set Title
     *
     * @param aTitle
     */
    final public void setTitle(String aTitle) {
        this.title = aTitle;

        this.titleSetted = true;

        this.setTitleNull(this.title == null);
    } // end setTitle()

    /**
     * Get Title Has Been Setted
     *
     * @return title
     */
    final public boolean isTitleSetted() {
        return this.titleSetted;
    } // end isTitleSetted()

    /**
     * Set Title Null
     */
    final public void setTitleNull() {
        this.titleNull = true;
    } // end setTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTitleNull(boolean aNullFlag) {
        this.titleNull = aNullFlag;
    } // end setTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTitleNull() {
        return this.titleNull;
    } // end isTitleNull()

    /**
     * Get Width
     *
     * @return width
     */
    final public int getWidth() {
        return width;
    } // end getWidth()

    /**
     * Set Width
     *
     * @param aWidth
     */
    final public void setWidth(int aWidth) {
        this.width = aWidth;

        this.widthSetted = true;

        this.setWidthNull(false);
    } // end setWidth()

    /**
     * Get Width Has Been Setted
     *
     * @return width
     */
    final public boolean isWidthSetted() {
        return this.widthSetted;
    } // end isWidthSetted()

    /**
     * Set Width Null
     */
    final public void setWidthNull() {
        this.widthNull = true;
    } // end setWidthNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWidthNull(boolean aNullFlag) {
        this.widthNull = aNullFlag;
    } // end setWidthNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWidthNull() {
        return this.widthNull;
    } // end isWidthNull()

    /**
     * Get ListSourceCode
     *
     * @return listSourceCode
     */
    final public String getListSourceCode() {
        return listSourceCode;
    } // end getListSourceCode()

    /**
     * Set ListSourceCode
     *
     * @param aListSourceCode
     */
    final public void setListSourceCode(String aListSourceCode) {
        this.listSourceCode = aListSourceCode;

        this.listSourceCodeSetted = true;

        this.setListSourceCodeNull(this.listSourceCode == null);
    } // end setListSourceCode()

    /**
     * Get ListSourceCode Has Been Setted
     *
     * @return listSourceCode
     */
    final public boolean isListSourceCodeSetted() {
        return this.listSourceCodeSetted;
    } // end isListSourceCodeSetted()

    /**
     * Set ListSourceCode Null
     */
    final public void setListSourceCodeNull() {
        this.listSourceCodeNull = true;
    } // end setListSourceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setListSourceCodeNull(boolean aNullFlag) {
        this.listSourceCodeNull = aNullFlag;
    } // end setListSourceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isListSourceCodeNull() {
        return this.listSourceCodeNull;
    } // end isListSourceCodeNull()

    /**
     * Get ListSourceName
     *
     * @return listSourceName
     */
    final public String getListSourceName() {
        return listSourceName;
    } // end getListSourceName()

    /**
     * Set ListSourceName
     *
     * @param aListSourceName
     */
    final public void setListSourceName(String aListSourceName) {
        this.listSourceName = aListSourceName;

        this.listSourceNameSetted = true;

        this.setListSourceNameNull(this.listSourceName == null);
    } // end setListSourceName()

    /**
     * Get ListSourceName Has Been Setted
     *
     * @return listSourceName
     */
    final public boolean isListSourceNameSetted() {
        return this.listSourceNameSetted;
    } // end isListSourceNameSetted()

    /**
     * Set ListSourceName Null
     */
    final public void setListSourceNameNull() {
        this.listSourceNameNull = true;
    } // end setListSourceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setListSourceNameNull(boolean aNullFlag) {
        this.listSourceNameNull = aNullFlag;
    } // end setListSourceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isListSourceNameNull() {
        return this.listSourceNameNull;
    } // end isListSourceNameNull()

    /**
     * Get TableId
     *
     * @return tableId
     */
    final public long getTableId() {
        return tableId;
    } // end getTableId()

    /**
     * Set TableId
     *
     * @param aTableId
     */
    final public void setTableId(long aTableId) {
        this.tableId = aTableId;

        this.tableIdSetted = true;

        this.setTableIdNull(false);
    } // end setTableId()

    /**
     * Get TableId Has Been Setted
     *
     * @return tableId
     */
    final public boolean isTableIdSetted() {
        return this.tableIdSetted;
    } // end isTableIdSetted()

    /**
     * Set TableId Null
     */
    final public void setTableIdNull() {
        this.tableIdNull = true;
    } // end setTableIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTableIdNull(boolean aNullFlag) {
        this.tableIdNull = aNullFlag;
    } // end setTableIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTableIdNull() {
        return this.tableIdNull;
    } // end isTableIdNull()

    /**
     * Get TableName
     *
     * @return tableName
     */
    final public String getTableName() {
        return tableName;
    } // end getTableName()

    /**
     * Set TableName
     *
     * @param aTableName
     */
    final public void setTableName(String aTableName) {
        this.tableName = aTableName;

        this.tableNameSetted = true;

        this.setTableNameNull(this.tableName == null);
    } // end setTableName()

    /**
     * Get TableName Has Been Setted
     *
     * @return tableName
     */
    final public boolean isTableNameSetted() {
        return this.tableNameSetted;
    } // end isTableNameSetted()

    /**
     * Set TableName Null
     */
    final public void setTableNameNull() {
        this.tableNameNull = true;
    } // end setTableNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTableNameNull(boolean aNullFlag) {
        this.tableNameNull = aNullFlag;
    } // end setTableNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTableNameNull() {
        return this.tableNameNull;
    } // end isTableNameNull()

    /**
     * Get TableAlias
     *
     * @return tableAlias
     */
    final public String getTableAlias() {
        return tableAlias;
    } // end getTableAlias()

    /**
     * Set TableAlias
     *
     * @param aTableAlias
     */
    final public void setTableAlias(String aTableAlias) {
        this.tableAlias = aTableAlias;

        this.tableAliasSetted = true;

        this.setTableAliasNull(this.tableAlias == null);
    } // end setTableAlias()

    /**
     * Get TableAlias Has Been Setted
     *
     * @return tableAlias
     */
    final public boolean isTableAliasSetted() {
        return this.tableAliasSetted;
    } // end isTableAliasSetted()

    /**
     * Set TableAlias Null
     */
    final public void setTableAliasNull() {
        this.tableAliasNull = true;
    } // end setTableAliasNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTableAliasNull(boolean aNullFlag) {
        this.tableAliasNull = aNullFlag;
    } // end setTableAliasNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTableAliasNull() {
        return this.tableAliasNull;
    } // end isTableAliasNull()

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

        if ((obj instanceof ReportViewField) == false) {
            return false;
        } // end if

        ReportViewField other = (ReportViewField) obj;

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

        buffer.append("dataType=");
        buffer.append(this.dataType);
        buffer.append("\r\n");

        buffer.append("fieldAlias=");
        buffer.append(this.fieldAlias);
        buffer.append("\r\n");

        buffer.append("fieldName=");
        buffer.append(this.fieldName);
        buffer.append("\r\n");

        buffer.append("listSourceId=");
        buffer.append(this.listSourceId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportViewId=");
        buffer.append(this.reportViewId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("title=");
        buffer.append(this.title);
        buffer.append("\r\n");

        buffer.append("width=");
        buffer.append(this.width);
        buffer.append("\r\n");

        buffer.append("listSourceCode=");
        buffer.append(this.listSourceCode);
        buffer.append("\r\n");

        buffer.append("listSourceName=");
        buffer.append(this.listSourceName);
        buffer.append("\r\n");

        buffer.append("tableId=");
        buffer.append(this.tableId);
        buffer.append("\r\n");

        buffer.append("tableName=");
        buffer.append(this.tableName);
        buffer.append("\r\n");

        buffer.append("tableAlias=");
        buffer.append(this.tableAlias);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportViewField
