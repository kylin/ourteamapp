/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-01 13:19:51
 *
 * @author Auto Gen
 */
public class BpmFormFieldListDefine implements java.io.Serializable {
    /**
     * Creates a new BpmFormFieldListDefine object.
     */
    public BpmFormFieldListDefine() {
        super();
    } // end BpmFormFieldListDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long fieldId;

    /** Attribute  Be Seted Falg */
    private boolean fieldIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldIdNull = false;

    /** Attribute */
    private String listKey;

    /** Attribute  Be Seted Falg */
    private boolean listKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean listKeyNull = false;

    /** Attribute */
    private String listName;

    /** Attribute  Be Seted Falg */
    private boolean listNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean listNameNull = false;

    /** Attribute */
    private String listType;

    /** Attribute  Be Seted Falg */
    private boolean listTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean listTypeNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

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
     * Get ListKey
     *
     * @return listKey
     */
    final public String getListKey() {
        return listKey;
    } // end getListKey()

    /**
     * Set ListKey
     *
     * @param aListKey
     */
    final public void setListKey(String aListKey) {
        this.listKey = aListKey;

        this.listKeySetted = true;

        this.setListKeyNull(this.listKey == null);
    } // end setListKey()

    /**
     * Get ListKey Has Been Setted
     *
     * @return listKey
     */
    final public boolean isListKeySetted() {
        return this.listKeySetted;
    } // end isListKeySetted()

    /**
     * Set ListKey Null
     */
    final public void setListKeyNull() {
        this.listKeyNull = true;
    } // end setListKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setListKeyNull(boolean aNullFlag) {
        this.listKeyNull = aNullFlag;
    } // end setListKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isListKeyNull() {
        return this.listKeyNull;
    } // end isListKeyNull()

    /**
     * Get ListName
     *
     * @return listName
     */
    final public String getListName() {
        return listName;
    } // end getListName()

    /**
     * Set ListName
     *
     * @param aListName
     */
    final public void setListName(String aListName) {
        this.listName = aListName;

        this.listNameSetted = true;

        this.setListNameNull(this.listName == null);
    } // end setListName()

    /**
     * Get ListName Has Been Setted
     *
     * @return listName
     */
    final public boolean isListNameSetted() {
        return this.listNameSetted;
    } // end isListNameSetted()

    /**
     * Set ListName Null
     */
    final public void setListNameNull() {
        this.listNameNull = true;
    } // end setListNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setListNameNull(boolean aNullFlag) {
        this.listNameNull = aNullFlag;
    } // end setListNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isListNameNull() {
        return this.listNameNull;
    } // end isListNameNull()

    /**
     * Get ListType
     *
     * @return listType
     */
    final public String getListType() {
        return listType;
    } // end getListType()

    /**
     * Set ListType
     *
     * @param aListType
     */
    final public void setListType(String aListType) {
        this.listType = aListType;

        this.listTypeSetted = true;

        this.setListTypeNull(this.listType == null);
    } // end setListType()

    /**
     * Get ListType Has Been Setted
     *
     * @return listType
     */
    final public boolean isListTypeSetted() {
        return this.listTypeSetted;
    } // end isListTypeSetted()

    /**
     * Set ListType Null
     */
    final public void setListTypeNull() {
        this.listTypeNull = true;
    } // end setListTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setListTypeNull(boolean aNullFlag) {
        this.listTypeNull = aNullFlag;
    } // end setListTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isListTypeNull() {
        return this.listTypeNull;
    } // end isListTypeNull()

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

        if ((obj instanceof BpmFormFieldListDefine) == false) {
            return false;
        } // end if

        BpmFormFieldListDefine other = (BpmFormFieldListDefine) obj;

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

        buffer.append("fieldId=");
        buffer.append(this.fieldId);
        buffer.append("\r\n");

        buffer.append("listKey=");
        buffer.append(this.listKey);
        buffer.append("\r\n");

        buffer.append("listName=");
        buffer.append(this.listName);
        buffer.append("\r\n");

        buffer.append("listType=");
        buffer.append(this.listType);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmFormFieldListDefine
