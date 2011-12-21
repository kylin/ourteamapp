/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * 持久对象属性值 Generate Date 2011-09-22 10:16:49
 *
 * @author Auto Gen
 */
public class PersistentPropertyConstValue implements java.io.Serializable {
    /**
     * Creates a new PersistentPropertyConstValue object.
     */
    public PersistentPropertyConstValue() {
        super();
    } // end PersistentPropertyConstValue()

    /** Attribute */
    private Long columnId;

    /** Attribute  Be Seted Falg */
    private boolean columnIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean columnIdNull = false;

    /** Attribute */
    private String columnName;

    /** Attribute  Be Seted Falg */
    private boolean columnNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean columnNameNull = false;

    /** Attribute */
    private int delFlag;

    /** Attribute  Be Seted Falg */
    private boolean delFlagSetted = false;

    /** Attribute  is Null Falg */
    private boolean delFlagNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private int fieldOrder;

    /** Attribute  Be Seted Falg */
    private boolean fieldOrderSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldOrderNull = false;

    /** Attribute */
    private long rowId;

    /** Attribute  Be Seted Falg */
    private boolean rowIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean rowIdNull = false;

    /** Attribute */
    private String tableName;

    /** Attribute  Be Seted Falg */
    private boolean tableNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean tableNameNull = false;

    /** Attribute */
    private String value;

    /** Attribute  Be Seted Falg */
    private boolean valueSetted = false;

    /** Attribute  is Null Falg */
    private boolean valueNull = false;

    /**
     * Get ColumnId
     *
     * @return columnId
     */
    final public Long getColumnId() {
        return columnId;
    } // end getColumnId()

    /**
     * Set ColumnId
     *
     * @param aColumnId
     */
    final public void setColumnId(Long aColumnId) {
        this.columnId = aColumnId;

        this.columnIdSetted = true;

        this.setColumnIdNull(this.columnId == null);
    } // end setColumnId()

    /**
     * Get ColumnId Has Been Setted
     *
     * @return columnId
     */
    final public boolean isColumnIdSetted() {
        return this.columnIdSetted;
    } // end isColumnIdSetted()

    /**
     * Set ColumnId Null
     */
    final public void setColumnIdNull() {
        this.columnIdNull = true;
    } // end setColumnIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setColumnIdNull(boolean aNullFlag) {
        this.columnIdNull = aNullFlag;
    } // end setColumnIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isColumnIdNull() {
        return this.columnIdNull;
    } // end isColumnIdNull()

    /**
     * Get ColumnName
     *
     * @return columnName
     */
    final public String getColumnName() {
        return columnName;
    } // end getColumnName()

    /**
     * Set ColumnName
     *
     * @param aColumnName
     */
    final public void setColumnName(String aColumnName) {
        this.columnName = aColumnName;

        this.columnNameSetted = true;

        this.setColumnNameNull(this.columnName == null);
    } // end setColumnName()

    /**
     * Get ColumnName Has Been Setted
     *
     * @return columnName
     */
    final public boolean isColumnNameSetted() {
        return this.columnNameSetted;
    } // end isColumnNameSetted()

    /**
     * Set ColumnName Null
     */
    final public void setColumnNameNull() {
        this.columnNameNull = true;
    } // end setColumnNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setColumnNameNull(boolean aNullFlag) {
        this.columnNameNull = aNullFlag;
    } // end setColumnNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isColumnNameNull() {
        return this.columnNameNull;
    } // end isColumnNameNull()

    /**
     * Get DelFlag
     *
     * @return delFlag
     */
    final public int getDelFlag() {
        return delFlag;
    } // end getDelFlag()

    /**
     * Set DelFlag
     *
     * @param aDelFlag
     */
    final public void setDelFlag(int aDelFlag) {
        this.delFlag = aDelFlag;

        this.delFlagSetted = true;

        this.setDelFlagNull(false);
    } // end setDelFlag()

    /**
     * Get DelFlag Has Been Setted
     *
     * @return delFlag
     */
    final public boolean isDelFlagSetted() {
        return this.delFlagSetted;
    } // end isDelFlagSetted()

    /**
     * Set DelFlag Null
     */
    final public void setDelFlagNull() {
        this.delFlagNull = true;
    } // end setDelFlagNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDelFlagNull(boolean aNullFlag) {
        this.delFlagNull = aNullFlag;
    } // end setDelFlagNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDelFlagNull() {
        return this.delFlagNull;
    } // end isDelFlagNull()

    /**
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        return description;
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    final public void setDescription(String aDescription) {
        this.description = aDescription;

        this.descriptionSetted = true;

        this.setDescriptionNull(this.description == null);
    } // end setDescription()

    /**
     * Get Description Has Been Setted
     *
     * @return description
     */
    final public boolean isDescriptionSetted() {
        return this.descriptionSetted;
    } // end isDescriptionSetted()

    /**
     * Set Description Null
     */
    final public void setDescriptionNull() {
        this.descriptionNull = true;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDescriptionNull(boolean aNullFlag) {
        this.descriptionNull = aNullFlag;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDescriptionNull() {
        return this.descriptionNull;
    } // end isDescriptionNull()

    /**
     * Get FieldOrder
     *
     * @return fieldOrder
     */
    final public int getFieldOrder() {
        return fieldOrder;
    } // end getFieldOrder()

    /**
     * Set FieldOrder
     *
     * @param aFieldOrder
     */
    final public void setFieldOrder(int aFieldOrder) {
        this.fieldOrder = aFieldOrder;

        this.fieldOrderSetted = true;

        this.setFieldOrderNull(false);
    } // end setFieldOrder()

    /**
     * Get FieldOrder Has Been Setted
     *
     * @return fieldOrder
     */
    final public boolean isFieldOrderSetted() {
        return this.fieldOrderSetted;
    } // end isFieldOrderSetted()

    /**
     * Set FieldOrder Null
     */
    final public void setFieldOrderNull() {
        this.fieldOrderNull = true;
    } // end setFieldOrderNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldOrderNull(boolean aNullFlag) {
        this.fieldOrderNull = aNullFlag;
    } // end setFieldOrderNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldOrderNull() {
        return this.fieldOrderNull;
    } // end isFieldOrderNull()

    /**
     * Get RowId
     *
     * @return rowId
     */
    final public long getRowId() {
        return rowId;
    } // end getRowId()

    /**
     * Set RowId
     *
     * @param aRowId
     */
    final public void setRowId(long aRowId) {
        this.rowId = aRowId;

        this.rowIdSetted = true;

        this.setRowIdNull(false);
    } // end setRowId()

    /**
     * Get RowId Has Been Setted
     *
     * @return rowId
     */
    final public boolean isRowIdSetted() {
        return this.rowIdSetted;
    } // end isRowIdSetted()

    /**
     * Set RowId Null
     */
    final public void setRowIdNull() {
        this.rowIdNull = true;
    } // end setRowIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRowIdNull(boolean aNullFlag) {
        this.rowIdNull = aNullFlag;
    } // end setRowIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRowIdNull() {
        return this.rowIdNull;
    } // end isRowIdNull()

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
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getRowId() ^ (getRowId() >>> 32));

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

        if ((obj instanceof PersistentPropertyConstValue) == false) {
            return false;
        } // end if

        PersistentPropertyConstValue other = (PersistentPropertyConstValue) obj;

        if (other == this) {
            return true;
        } // end if

        if (getRowId() != other.getRowId()) {
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

        buffer.append("columnId=");
        buffer.append(this.columnId);
        buffer.append("\r\n");

        buffer.append("columnName=");
        buffer.append(this.columnName);
        buffer.append("\r\n");

        buffer.append("delFlag=");
        buffer.append(this.delFlag);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("fieldOrder=");
        buffer.append(this.fieldOrder);
        buffer.append("\r\n");

        buffer.append("rowId=");
        buffer.append(this.rowId);
        buffer.append("\r\n");

        buffer.append("tableName=");
        buffer.append(this.tableName);
        buffer.append("\r\n");

        buffer.append("value=");
        buffer.append(this.value);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end PersistentPropertyConstValue
