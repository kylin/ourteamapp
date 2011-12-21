/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

/**
 * Generate Date 2011-12-08 15:06:50
 *
 * @author Auto Gen
 */
public class MiddleWareToolInputOption implements java.io.Serializable {
    /**
     * Creates a new MiddleWareToolInputOption object.
     */
    public MiddleWareToolInputOption() {
        super();
    } // end MiddleWareToolInputOption()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String displayLabel;

    /** Attribute  Be Seted Falg */
    private boolean displayLabelSetted = false;

    /** Attribute  is Null Falg */
    private boolean displayLabelNull = false;

    /** Attribute */
    private String realValue;

    /** Attribute  Be Seted Falg */
    private boolean realValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean realValueNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

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
    private long toolInputId;

    /** Attribute  Be Seted Falg */
    private boolean toolInputIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolInputIdNull = false;

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
     * Get DisplayLabel
     *
     * @return displayLabel
     */
    final public String getDisplayLabel() {
        if (isDisplayLabelNull()) {
            return null;
        } // end if
        else {
            return displayLabel;
        } // end else
    } // end getDisplayLabel()

    /**
     * Set DisplayLabel
     *
     * @param aDisplayLabel
     */
    final public void setDisplayLabel(String aDisplayLabel) {
        this.displayLabel = aDisplayLabel;

        this.displayLabelSetted = true;

        this.setDisplayLabelNull(this.displayLabel == null);
    } // end setDisplayLabel()

    /**
     * Get DisplayLabel Has Been Setted
     *
     * @return displayLabel
     */
    final public boolean isDisplayLabelSetted() {
        return this.displayLabelSetted;
    } // end isDisplayLabelSetted()

    /**
     * Set DisplayLabel Null
     */
    final public void setDisplayLabelNull() {
        this.displayLabelNull = true;
    } // end setDisplayLabelNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDisplayLabelNull(boolean aNullFlag) {
        this.displayLabelNull = aNullFlag;
    } // end setDisplayLabelNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDisplayLabelNull() {
        return this.displayLabelNull;
    } // end isDisplayLabelNull()

    /**
     * Get RealValue
     *
     * @return realValue
     */
    final public String getRealValue() {
        if (isRealValueNull()) {
            return null;
        } // end if
        else {
            return realValue;
        } // end else
    } // end getRealValue()

    /**
     * Set RealValue
     *
     * @param aRealValue
     */
    final public void setRealValue(String aRealValue) {
        this.realValue = aRealValue;

        this.realValueSetted = true;

        this.setRealValueNull(this.realValue == null);
    } // end setRealValue()

    /**
     * Get RealValue Has Been Setted
     *
     * @return realValue
     */
    final public boolean isRealValueSetted() {
        return this.realValueSetted;
    } // end isRealValueSetted()

    /**
     * Set RealValue Null
     */
    final public void setRealValueNull() {
        this.realValueNull = true;
    } // end setRealValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRealValueNull(boolean aNullFlag) {
        this.realValueNull = aNullFlag;
    } // end setRealValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRealValueNull() {
        return this.realValueNull;
    } // end isRealValueNull()

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
     * Get ToolInputId
     *
     * @return toolInputId
     */
    final public long getToolInputId() {
        return toolInputId;
    } // end getToolInputId()

    /**
     * Set ToolInputId
     *
     * @param aToolInputId
     */
    final public void setToolInputId(long aToolInputId) {
        this.toolInputId = aToolInputId;

        this.toolInputIdSetted = true;

        this.setToolInputIdNull(false);
    } // end setToolInputId()

    /**
     * Get ToolInputId Has Been Setted
     *
     * @return toolInputId
     */
    final public boolean isToolInputIdSetted() {
        return this.toolInputIdSetted;
    } // end isToolInputIdSetted()

    /**
     * Set ToolInputId Null
     */
    final public void setToolInputIdNull() {
        this.toolInputIdNull = true;
    } // end setToolInputIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolInputIdNull(boolean aNullFlag) {
        this.toolInputIdNull = aNullFlag;
    } // end setToolInputIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolInputIdNull() {
        return this.toolInputIdNull;
    } // end isToolInputIdNull()

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

        if ((obj instanceof MiddleWareToolInputOption) == false) {
            return false;
        } // end if

        MiddleWareToolInputOption other = (MiddleWareToolInputOption) obj;

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

        buffer.append("displayLabel=");
        buffer.append(this.displayLabel);
        buffer.append("\r\n");

        buffer.append("realValue=");
        buffer.append(this.realValue);
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

        buffer.append("toolInputId=");
        buffer.append(this.toolInputId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MiddleWareToolInputOption
