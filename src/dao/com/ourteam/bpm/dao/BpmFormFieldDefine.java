/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-11 13:31:04
 *
 * @author Auto Gen
 */
public class BpmFormFieldDefine implements java.io.Serializable {
    /**
     * Creates a new BpmFormFieldDefine object.
     */
    public BpmFormFieldDefine() {
        super();
    } // end BpmFormFieldDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String fieldKey;

    /** Attribute  Be Seted Falg */
    private boolean fieldKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldKeyNull = false;

    /** Attribute */
    private String fieldName;

    /** Attribute  Be Seted Falg */
    private boolean fieldNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldNameNull = false;

    /** Attribute */
    private String fieldType;

    /** Attribute  Be Seted Falg */
    private boolean fieldTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldTypeNull = false;

    /** Attribute */
    private long formDefineId;

    /** Attribute  Be Seted Falg */
    private boolean formDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean formDefineIdNull = false;

    /** Attribute */
    private long parentFieldId;

    /** Attribute  Be Seted Falg */
    private boolean parentFieldIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentFieldIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long sortIndex;

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
     * Get FieldKey
     *
     * @return fieldKey
     */
    final public String getFieldKey() {
        return fieldKey;
    } // end getFieldKey()

    /**
     * Set FieldKey
     *
     * @param aFieldKey
     */
    final public void setFieldKey(String aFieldKey) {
        this.fieldKey = aFieldKey;

        this.fieldKeySetted = true;

        this.setFieldKeyNull(this.fieldKey == null);
    } // end setFieldKey()

    /**
     * Get FieldKey Has Been Setted
     *
     * @return fieldKey
     */
    final public boolean isFieldKeySetted() {
        return this.fieldKeySetted;
    } // end isFieldKeySetted()

    /**
     * Set FieldKey Null
     */
    final public void setFieldKeyNull() {
        this.fieldKeyNull = true;
    } // end setFieldKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldKeyNull(boolean aNullFlag) {
        this.fieldKeyNull = aNullFlag;
    } // end setFieldKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldKeyNull() {
        return this.fieldKeyNull;
    } // end isFieldKeyNull()

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
     * Get FieldType
     *
     * @return fieldType
     */
    final public String getFieldType() {
        return fieldType;
    } // end getFieldType()

    /**
     * Set FieldType
     *
     * @param aFieldType
     */
    final public void setFieldType(String aFieldType) {
        this.fieldType = aFieldType;

        this.fieldTypeSetted = true;

        this.setFieldTypeNull(this.fieldType == null);
    } // end setFieldType()

    /**
     * Get FieldType Has Been Setted
     *
     * @return fieldType
     */
    final public boolean isFieldTypeSetted() {
        return this.fieldTypeSetted;
    } // end isFieldTypeSetted()

    /**
     * Set FieldType Null
     */
    final public void setFieldTypeNull() {
        this.fieldTypeNull = true;
    } // end setFieldTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldTypeNull(boolean aNullFlag) {
        this.fieldTypeNull = aNullFlag;
    } // end setFieldTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldTypeNull() {
        return this.fieldTypeNull;
    } // end isFieldTypeNull()

    /**
     * Get FormDefineId
     *
     * @return formDefineId
     */
    final public long getFormDefineId() {
        return formDefineId;
    } // end getFormDefineId()

    /**
     * Set FormDefineId
     *
     * @param aFormDefineId
     */
    final public void setFormDefineId(long aFormDefineId) {
        this.formDefineId = aFormDefineId;

        this.formDefineIdSetted = true;

        this.setFormDefineIdNull(false);
    } // end setFormDefineId()

    /**
     * Get FormDefineId Has Been Setted
     *
     * @return formDefineId
     */
    final public boolean isFormDefineIdSetted() {
        return this.formDefineIdSetted;
    } // end isFormDefineIdSetted()

    /**
     * Set FormDefineId Null
     */
    final public void setFormDefineIdNull() {
        this.formDefineIdNull = true;
    } // end setFormDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFormDefineIdNull(boolean aNullFlag) {
        this.formDefineIdNull = aNullFlag;
    } // end setFormDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFormDefineIdNull() {
        return this.formDefineIdNull;
    } // end isFormDefineIdNull()

    /**
     * Get ParentFieldId
     *
     * @return parentFieldId
     */
    final public long getParentFieldId() {
        return parentFieldId;
    } // end getParentFieldId()

    /**
     * Set ParentFieldId
     *
     * @param aParentFieldId
     */
    final public void setParentFieldId(long aParentFieldId) {
        this.parentFieldId = aParentFieldId;

        this.parentFieldIdSetted = true;

        this.setParentFieldIdNull(false);
    } // end setParentFieldId()

    /**
     * Get ParentFieldId Has Been Setted
     *
     * @return parentFieldId
     */
    final public boolean isParentFieldIdSetted() {
        return this.parentFieldIdSetted;
    } // end isParentFieldIdSetted()

    /**
     * Set ParentFieldId Null
     */
    final public void setParentFieldIdNull() {
        this.parentFieldIdNull = true;
    } // end setParentFieldIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentFieldIdNull(boolean aNullFlag) {
        this.parentFieldIdNull = aNullFlag;
    } // end setParentFieldIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentFieldIdNull() {
        return this.parentFieldIdNull;
    } // end isParentFieldIdNull()

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
     * Get SortIndex
     *
     * @return sortIndex
     */
    final public long getSortIndex() {
        return sortIndex;
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    final public void setSortIndex(long aSortIndex) {
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

        if ((obj instanceof BpmFormFieldDefine) == false) {
            return false;
        } // end if

        BpmFormFieldDefine other = (BpmFormFieldDefine) obj;

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

        buffer.append("fieldKey=");
        buffer.append(this.fieldKey);
        buffer.append("\r\n");

        buffer.append("fieldName=");
        buffer.append(this.fieldName);
        buffer.append("\r\n");

        buffer.append("fieldType=");
        buffer.append(this.fieldType);
        buffer.append("\r\n");

        buffer.append("formDefineId=");
        buffer.append(this.formDefineId);
        buffer.append("\r\n");

        buffer.append("parentFieldId=");
        buffer.append(this.parentFieldId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("sortIndex=");
        buffer.append(this.sortIndex);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmFormFieldDefine
