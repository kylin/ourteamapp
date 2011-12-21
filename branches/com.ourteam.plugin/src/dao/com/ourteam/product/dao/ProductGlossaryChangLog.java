/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

/**
 * Generate Date 2011-10-12 13:50:02
 *
 * @author Auto Gen
 */
public class ProductGlossaryChangLog implements java.io.Serializable {
    /**
     * Creates a new ProductGlossaryChangLog object.
     */
    public ProductGlossaryChangLog() {
        super();
    } // end ProductGlossaryChangLog()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String afterChangeContent;

    /** Attribute  Be Seted Falg */
    private boolean afterChangeContentSetted = false;

    /** Attribute  is Null Falg */
    private boolean afterChangeContentNull = false;

    /** Attribute */
    private long approverId;

    /** Attribute  Be Seted Falg */
    private boolean approverIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean approverIdNull = false;

    /** Attribute */
    private String beforChangeContent;

    /** Attribute  Be Seted Falg */
    private boolean beforChangeContentSetted = false;

    /** Attribute  is Null Falg */
    private boolean beforChangeContentNull = false;

    /** Attribute */
    private String changeReason;

    /** Attribute  Be Seted Falg */
    private boolean changeReasonSetted = false;

    /** Attribute  is Null Falg */
    private boolean changeReasonNull = false;

    /** Attribute */
    private long editorId;

    /** Attribute  Be Seted Falg */
    private boolean editorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean editorIdNull = false;

    /** Attribute */
    private java.util.Date editDate;

    /** Attribute  Be Seted Falg */
    private boolean editDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean editDateNull = false;

    /** Attribute */
    private long productGlossaryId;

    /** Attribute  Be Seted Falg */
    private boolean productGlossaryIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productGlossaryIdNull = false;

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
     * Get AfterChangeContent
     *
     * @return afterChangeContent
     */
    final public String getAfterChangeContent() {
        if (isAfterChangeContentNull()) {
            return null;
        } // end if
        else {
            return afterChangeContent;
        } // end else
    } // end getAfterChangeContent()

    /**
     * Set AfterChangeContent
     *
     * @param aAfterChangeContent
     */
    final public void setAfterChangeContent(String aAfterChangeContent) {
        this.afterChangeContent = aAfterChangeContent;

        this.afterChangeContentSetted = true;

        this.setAfterChangeContentNull(this.afterChangeContent == null);
    } // end setAfterChangeContent()

    /**
     * Get AfterChangeContent Has Been Setted
     *
     * @return afterChangeContent
     */
    final public boolean isAfterChangeContentSetted() {
        return this.afterChangeContentSetted;
    } // end isAfterChangeContentSetted()

    /**
     * Set AfterChangeContent Null
     */
    final public void setAfterChangeContentNull() {
        this.afterChangeContentNull = true;
    } // end setAfterChangeContentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAfterChangeContentNull(boolean aNullFlag) {
        this.afterChangeContentNull = aNullFlag;
    } // end setAfterChangeContentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAfterChangeContentNull() {
        return this.afterChangeContentNull;
    } // end isAfterChangeContentNull()

    /**
     * Get ApproverId
     *
     * @return approverId
     */
    final public long getApproverId() {
        return approverId;
    } // end getApproverId()

    /**
     * Set ApproverId
     *
     * @param aApproverId
     */
    final public void setApproverId(long aApproverId) {
        this.approverId = aApproverId;

        this.approverIdSetted = true;

        this.setApproverIdNull(false);
    } // end setApproverId()

    /**
     * Get ApproverId Has Been Setted
     *
     * @return approverId
     */
    final public boolean isApproverIdSetted() {
        return this.approverIdSetted;
    } // end isApproverIdSetted()

    /**
     * Set ApproverId Null
     */
    final public void setApproverIdNull() {
        this.approverIdNull = true;
    } // end setApproverIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setApproverIdNull(boolean aNullFlag) {
        this.approverIdNull = aNullFlag;
    } // end setApproverIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isApproverIdNull() {
        return this.approverIdNull;
    } // end isApproverIdNull()

    /**
     * Get BeforChangeContent
     *
     * @return beforChangeContent
     */
    final public String getBeforChangeContent() {
        if (isBeforChangeContentNull()) {
            return null;
        } // end if
        else {
            return beforChangeContent;
        } // end else
    } // end getBeforChangeContent()

    /**
     * Set BeforChangeContent
     *
     * @param aBeforChangeContent
     */
    final public void setBeforChangeContent(String aBeforChangeContent) {
        this.beforChangeContent = aBeforChangeContent;

        this.beforChangeContentSetted = true;

        this.setBeforChangeContentNull(this.beforChangeContent == null);
    } // end setBeforChangeContent()

    /**
     * Get BeforChangeContent Has Been Setted
     *
     * @return beforChangeContent
     */
    final public boolean isBeforChangeContentSetted() {
        return this.beforChangeContentSetted;
    } // end isBeforChangeContentSetted()

    /**
     * Set BeforChangeContent Null
     */
    final public void setBeforChangeContentNull() {
        this.beforChangeContentNull = true;
    } // end setBeforChangeContentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBeforChangeContentNull(boolean aNullFlag) {
        this.beforChangeContentNull = aNullFlag;
    } // end setBeforChangeContentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBeforChangeContentNull() {
        return this.beforChangeContentNull;
    } // end isBeforChangeContentNull()

    /**
     * Get ChangeReason
     *
     * @return changeReason
     */
    final public String getChangeReason() {
        if (isChangeReasonNull()) {
            return null;
        } // end if
        else {
            return changeReason;
        } // end else
    } // end getChangeReason()

    /**
     * Set ChangeReason
     *
     * @param aChangeReason
     */
    final public void setChangeReason(String aChangeReason) {
        this.changeReason = aChangeReason;

        this.changeReasonSetted = true;

        this.setChangeReasonNull(this.changeReason == null);
    } // end setChangeReason()

    /**
     * Get ChangeReason Has Been Setted
     *
     * @return changeReason
     */
    final public boolean isChangeReasonSetted() {
        return this.changeReasonSetted;
    } // end isChangeReasonSetted()

    /**
     * Set ChangeReason Null
     */
    final public void setChangeReasonNull() {
        this.changeReasonNull = true;
    } // end setChangeReasonNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setChangeReasonNull(boolean aNullFlag) {
        this.changeReasonNull = aNullFlag;
    } // end setChangeReasonNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isChangeReasonNull() {
        return this.changeReasonNull;
    } // end isChangeReasonNull()

    /**
     * Get EditorId
     *
     * @return editorId
     */
    final public long getEditorId() {
        return editorId;
    } // end getEditorId()

    /**
     * Set EditorId
     *
     * @param aEditorId
     */
    final public void setEditorId(long aEditorId) {
        this.editorId = aEditorId;

        this.editorIdSetted = true;

        this.setEditorIdNull(false);
    } // end setEditorId()

    /**
     * Get EditorId Has Been Setted
     *
     * @return editorId
     */
    final public boolean isEditorIdSetted() {
        return this.editorIdSetted;
    } // end isEditorIdSetted()

    /**
     * Set EditorId Null
     */
    final public void setEditorIdNull() {
        this.editorIdNull = true;
    } // end setEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEditorIdNull(boolean aNullFlag) {
        this.editorIdNull = aNullFlag;
    } // end setEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEditorIdNull() {
        return this.editorIdNull;
    } // end isEditorIdNull()

    /**
     * Get EditDate
     *
     * @return editDate
     */
    final public java.util.Date getEditDate() {
        return editDate;
    } // end getEditDate()

    /**
     * Set EditDate
     *
     * @param aEditDate
     */
    final public void setEditDate(java.util.Date aEditDate) {
        this.editDate = aEditDate;

        this.editDateSetted = true;

        this.setEditDateNull(this.editDate == null);
    } // end setEditDate()

    /**
     * Get EditDate Has Been Setted
     *
     * @return editDate
     */
    final public boolean isEditDateSetted() {
        return this.editDateSetted;
    } // end isEditDateSetted()

    /**
     * Set EditDate Null
     */
    final public void setEditDateNull() {
        this.editDateNull = true;
    } // end setEditDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEditDateNull(boolean aNullFlag) {
        this.editDateNull = aNullFlag;
    } // end setEditDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEditDateNull() {
        return this.editDateNull;
    } // end isEditDateNull()

    /**
     * Get ProductGlossaryId
     *
     * @return productGlossaryId
     */
    final public long getProductGlossaryId() {
        return productGlossaryId;
    } // end getProductGlossaryId()

    /**
     * Set ProductGlossaryId
     *
     * @param aProductGlossaryId
     */
    final public void setProductGlossaryId(long aProductGlossaryId) {
        this.productGlossaryId = aProductGlossaryId;

        this.productGlossaryIdSetted = true;

        this.setProductGlossaryIdNull(false);
    } // end setProductGlossaryId()

    /**
     * Get ProductGlossaryId Has Been Setted
     *
     * @return productGlossaryId
     */
    final public boolean isProductGlossaryIdSetted() {
        return this.productGlossaryIdSetted;
    } // end isProductGlossaryIdSetted()

    /**
     * Set ProductGlossaryId Null
     */
    final public void setProductGlossaryIdNull() {
        this.productGlossaryIdNull = true;
    } // end setProductGlossaryIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductGlossaryIdNull(boolean aNullFlag) {
        this.productGlossaryIdNull = aNullFlag;
    } // end setProductGlossaryIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductGlossaryIdNull() {
        return this.productGlossaryIdNull;
    } // end isProductGlossaryIdNull()

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

        if ((obj instanceof ProductGlossaryChangLog) == false) {
            return false;
        } // end if

        ProductGlossaryChangLog other = (ProductGlossaryChangLog) obj;

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

        buffer.append("afterChangeContent=");
        buffer.append(this.afterChangeContent);
        buffer.append("\r\n");

        buffer.append("approverId=");
        buffer.append(this.approverId);
        buffer.append("\r\n");

        buffer.append("beforChangeContent=");
        buffer.append(this.beforChangeContent);
        buffer.append("\r\n");

        buffer.append("changeReason=");
        buffer.append(this.changeReason);
        buffer.append("\r\n");

        buffer.append("editorId=");
        buffer.append(this.editorId);
        buffer.append("\r\n");

        buffer.append("editDate=");
        buffer.append(this.editDate);
        buffer.append("\r\n");

        buffer.append("productGlossaryId=");
        buffer.append(this.productGlossaryId);
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
} // end ProductGlossaryChangLog
