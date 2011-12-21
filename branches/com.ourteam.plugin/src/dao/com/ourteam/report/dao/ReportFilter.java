/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:54
 *
 * @author Auto Gen
 */
public class ReportFilter implements java.io.Serializable {
    /**
     * Creates a new ReportFilter object.
     */
    public ReportFilter() {
        super();
    } // end ReportFilter()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String connection;

    /** Attribute  Be Seted Falg */
    private boolean connectionSetted = false;

    /** Attribute  is Null Falg */
    private boolean connectionNull = false;

    /** Attribute */
    private long fieldId;

    /** Attribute  Be Seted Falg */
    private boolean fieldIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldIdNull = false;

    /** Attribute */
    private String leftSymbol;

    /** Attribute  Be Seted Falg */
    private boolean leftSymbolSetted = false;

    /** Attribute  is Null Falg */
    private boolean leftSymbolNull = false;

    /** Attribute */
    private String operation;

    /** Attribute  Be Seted Falg */
    private boolean operationSetted = false;

    /** Attribute  is Null Falg */
    private boolean operationNull = false;

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
    private String rightSymbol;

    /** Attribute  Be Seted Falg */
    private boolean rightSymbolSetted = false;

    /** Attribute  is Null Falg */
    private boolean rightSymbolNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String value;

    /** Attribute  Be Seted Falg */
    private boolean valueSetted = false;

    /** Attribute  is Null Falg */
    private boolean valueNull = false;

    /** Attribute */
    private String fieldDataType;

    /** Attribute  Be Seted Falg */
    private boolean fieldDataTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldDataTypeNull = false;

    /** Attribute */
    private String fieldName;

    /** Attribute  Be Seted Falg */
    private boolean fieldNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldNameNull = false;

    /** Attribute */
    private String fieldAlias;

    /** Attribute  Be Seted Falg */
    private boolean fieldAliasSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldAliasNull = false;

    /** Attribute */
    private String fieldTitle;

    /** Attribute  Be Seted Falg */
    private boolean fieldTitleSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldTitleNull = false;

    /** Attribute */
    private long fieldListSourceId;

    /** Attribute  Be Seted Falg */
    private boolean fieldListSourceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldListSourceIdNull = false;

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
     * Get Connection
     *
     * @return connection
     */
    final public String getConnection() {
        return connection;
    } // end getConnection()

    /**
     * Set Connection
     *
     * @param aConnection
     */
    final public void setConnection(String aConnection) {
        this.connection = aConnection;

        this.connectionSetted = true;

        this.setConnectionNull(this.connection == null);
    } // end setConnection()

    /**
     * Get Connection Has Been Setted
     *
     * @return connection
     */
    final public boolean isConnectionSetted() {
        return this.connectionSetted;
    } // end isConnectionSetted()

    /**
     * Set Connection Null
     */
    final public void setConnectionNull() {
        this.connectionNull = true;
    } // end setConnectionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConnectionNull(boolean aNullFlag) {
        this.connectionNull = aNullFlag;
    } // end setConnectionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConnectionNull() {
        return this.connectionNull;
    } // end isConnectionNull()

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
     * Get LeftSymbol
     *
     * @return leftSymbol
     */
    final public String getLeftSymbol() {
        return leftSymbol;
    } // end getLeftSymbol()

    /**
     * Set LeftSymbol
     *
     * @param aLeftSymbol
     */
    final public void setLeftSymbol(String aLeftSymbol) {
        this.leftSymbol = aLeftSymbol;

        this.leftSymbolSetted = true;

        this.setLeftSymbolNull(this.leftSymbol == null);
    } // end setLeftSymbol()

    /**
     * Get LeftSymbol Has Been Setted
     *
     * @return leftSymbol
     */
    final public boolean isLeftSymbolSetted() {
        return this.leftSymbolSetted;
    } // end isLeftSymbolSetted()

    /**
     * Set LeftSymbol Null
     */
    final public void setLeftSymbolNull() {
        this.leftSymbolNull = true;
    } // end setLeftSymbolNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLeftSymbolNull(boolean aNullFlag) {
        this.leftSymbolNull = aNullFlag;
    } // end setLeftSymbolNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLeftSymbolNull() {
        return this.leftSymbolNull;
    } // end isLeftSymbolNull()

    /**
     * Get Operation
     *
     * @return operation
     */
    final public String getOperation() {
        return operation;
    } // end getOperation()

    /**
     * Set Operation
     *
     * @param aOperation
     */
    final public void setOperation(String aOperation) {
        this.operation = aOperation;

        this.operationSetted = true;

        this.setOperationNull(this.operation == null);
    } // end setOperation()

    /**
     * Get Operation Has Been Setted
     *
     * @return operation
     */
    final public boolean isOperationSetted() {
        return this.operationSetted;
    } // end isOperationSetted()

    /**
     * Set Operation Null
     */
    final public void setOperationNull() {
        this.operationNull = true;
    } // end setOperationNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOperationNull(boolean aNullFlag) {
        this.operationNull = aNullFlag;
    } // end setOperationNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOperationNull() {
        return this.operationNull;
    } // end isOperationNull()

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
     * Get RightSymbol
     *
     * @return rightSymbol
     */
    final public String getRightSymbol() {
        return rightSymbol;
    } // end getRightSymbol()

    /**
     * Set RightSymbol
     *
     * @param aRightSymbol
     */
    final public void setRightSymbol(String aRightSymbol) {
        this.rightSymbol = aRightSymbol;

        this.rightSymbolSetted = true;

        this.setRightSymbolNull(this.rightSymbol == null);
    } // end setRightSymbol()

    /**
     * Get RightSymbol Has Been Setted
     *
     * @return rightSymbol
     */
    final public boolean isRightSymbolSetted() {
        return this.rightSymbolSetted;
    } // end isRightSymbolSetted()

    /**
     * Set RightSymbol Null
     */
    final public void setRightSymbolNull() {
        this.rightSymbolNull = true;
    } // end setRightSymbolNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRightSymbolNull(boolean aNullFlag) {
        this.rightSymbolNull = aNullFlag;
    } // end setRightSymbolNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRightSymbolNull() {
        return this.rightSymbolNull;
    } // end isRightSymbolNull()

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
     * Get Value
     *
     * @return value
     */
    final public String getValue() {
        return value;
    } // end getValue()

    /**
     * Set Value
     *
     * @param aValue
     */
    final public void setValue(String aValue) {
        this.value = aValue;

        this.valueSetted = true;

        this.setValueNull(this.value == null);
    } // end setValue()

    /**
     * Get Value Has Been Setted
     *
     * @return value
     */
    final public boolean isValueSetted() {
        return this.valueSetted;
    } // end isValueSetted()

    /**
     * Set Value Null
     */
    final public void setValueNull() {
        this.valueNull = true;
    } // end setValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setValueNull(boolean aNullFlag) {
        this.valueNull = aNullFlag;
    } // end setValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isValueNull() {
        return this.valueNull;
    } // end isValueNull()

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
     * Get FieldListSourceId
     *
     * @return fieldListSourceId
     */
    final public long getFieldListSourceId() {
        return fieldListSourceId;
    } // end getFieldListSourceId()

    /**
     * Set FieldListSourceId
     *
     * @param aFieldListSourceId
     */
    final public void setFieldListSourceId(long aFieldListSourceId) {
        this.fieldListSourceId = aFieldListSourceId;

        this.fieldListSourceIdSetted = true;

        this.setFieldListSourceIdNull(false);
    } // end setFieldListSourceId()

    /**
     * Get FieldListSourceId Has Been Setted
     *
     * @return fieldListSourceId
     */
    final public boolean isFieldListSourceIdSetted() {
        return this.fieldListSourceIdSetted;
    } // end isFieldListSourceIdSetted()

    /**
     * Set FieldListSourceId Null
     */
    final public void setFieldListSourceIdNull() {
        this.fieldListSourceIdNull = true;
    } // end setFieldListSourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldListSourceIdNull(boolean aNullFlag) {
        this.fieldListSourceIdNull = aNullFlag;
    } // end setFieldListSourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldListSourceIdNull() {
        return this.fieldListSourceIdNull;
    } // end isFieldListSourceIdNull()

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

        if ((obj instanceof ReportFilter) == false) {
            return false;
        } // end if

        ReportFilter other = (ReportFilter) obj;

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

        buffer.append("connection=");
        buffer.append(this.connection);
        buffer.append("\r\n");

        buffer.append("fieldId=");
        buffer.append(this.fieldId);
        buffer.append("\r\n");

        buffer.append("leftSymbol=");
        buffer.append(this.leftSymbol);
        buffer.append("\r\n");

        buffer.append("operation=");
        buffer.append(this.operation);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportInstanceId=");
        buffer.append(this.reportInstanceId);
        buffer.append("\r\n");

        buffer.append("rightSymbol=");
        buffer.append(this.rightSymbol);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("value=");
        buffer.append(this.value);
        buffer.append("\r\n");

        buffer.append("fieldDataType=");
        buffer.append(this.fieldDataType);
        buffer.append("\r\n");

        buffer.append("fieldName=");
        buffer.append(this.fieldName);
        buffer.append("\r\n");

        buffer.append("fieldAlias=");
        buffer.append(this.fieldAlias);
        buffer.append("\r\n");

        buffer.append("fieldTitle=");
        buffer.append(this.fieldTitle);
        buffer.append("\r\n");

        buffer.append("fieldListSourceId=");
        buffer.append(this.fieldListSourceId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportFilter
