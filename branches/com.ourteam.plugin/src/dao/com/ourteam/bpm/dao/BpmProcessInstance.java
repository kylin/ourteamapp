/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-25 15:17:21
 *
 * @author Auto Gen
 */
public class BpmProcessInstance implements java.io.Serializable {
    /**
     * Creates a new BpmProcessInstance object.
     */
    public BpmProcessInstance() {
        super();
    } // end BpmProcessInstance()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date completeDate;

    /** Attribute  Be Seted Falg */
    private boolean completeDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean completeDateNull = false;

    /** Attribute */
    private long processDefineId;

    /** Attribute  Be Seted Falg */
    private boolean processDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processDefineIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long starterId;

    /** Attribute  Be Seted Falg */
    private boolean starterIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean starterIdNull = false;

    /** Attribute */
    private java.util.Date startDate;

    /** Attribute  Be Seted Falg */
    private boolean startDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean startDateNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String processName;

    /** Attribute  Be Seted Falg */
    private boolean processNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean processNameNull = false;

    /** Attribute */
    private String processKey;

    /** Attribute  Be Seted Falg */
    private boolean processKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean processKeyNull = false;

    /** Attribute */
    private String starterName;

    /** Attribute  Be Seted Falg */
    private boolean starterNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean starterNameNull = false;

    /** Attribute */
    private String starterCode;

    /** Attribute  Be Seted Falg */
    private boolean starterCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean starterCodeNull = false;

    /** Attribute */
    private String instanceId;

    /** Attribute  Be Seted Falg */
    private boolean instanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean instanceIdNull = false;

    /** Attribute */
    private String serialNumber;

    /** Attribute  Be Seted Falg */
    private boolean serialNumberSetted = false;

    /** Attribute  is Null Falg */
    private boolean serialNumberNull = false;

    /** Attribute */
    private long lastOperatorId;

    /** Attribute  Be Seted Falg */
    private boolean lastOperatorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastOperatorIdNull = false;

    /** Attribute */
    private int commentCount;

    /** Attribute  Be Seted Falg */
    private boolean commentCountSetted = false;

    /** Attribute  is Null Falg */
    private boolean commentCountNull = false;

    /** Attribute */
    private int attachmentCount;

    /** Attribute  Be Seted Falg */
    private boolean attachmentCountSetted = false;

    /** Attribute  is Null Falg */
    private boolean attachmentCountNull = false;

    /** Attribute */
    private String startFormKey;

    /** Attribute  Be Seted Falg */
    private boolean startFormKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean startFormKeyNull = false;

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
     * Get CompleteDate
     *
     * @return completeDate
     */
    final public java.util.Date getCompleteDate() {
        return completeDate;
    } // end getCompleteDate()

    /**
     * Set CompleteDate
     *
     * @param aCompleteDate
     */
    final public void setCompleteDate(java.util.Date aCompleteDate) {
        this.completeDate = aCompleteDate;

        this.completeDateSetted = true;

        this.setCompleteDateNull(this.completeDate == null);
    } // end setCompleteDate()

    /**
     * Get CompleteDate Has Been Setted
     *
     * @return completeDate
     */
    final public boolean isCompleteDateSetted() {
        return this.completeDateSetted;
    } // end isCompleteDateSetted()

    /**
     * Set CompleteDate Null
     */
    final public void setCompleteDateNull() {
        this.completeDateNull = true;
    } // end setCompleteDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCompleteDateNull(boolean aNullFlag) {
        this.completeDateNull = aNullFlag;
    } // end setCompleteDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCompleteDateNull() {
        return this.completeDateNull;
    } // end isCompleteDateNull()

    /**
     * Get ProcessDefineId
     *
     * @return processDefineId
     */
    final public long getProcessDefineId() {
        return processDefineId;
    } // end getProcessDefineId()

    /**
     * Set ProcessDefineId
     *
     * @param aProcessDefineId
     */
    final public void setProcessDefineId(long aProcessDefineId) {
        this.processDefineId = aProcessDefineId;

        this.processDefineIdSetted = true;

        this.setProcessDefineIdNull(false);
    } // end setProcessDefineId()

    /**
     * Get ProcessDefineId Has Been Setted
     *
     * @return processDefineId
     */
    final public boolean isProcessDefineIdSetted() {
        return this.processDefineIdSetted;
    } // end isProcessDefineIdSetted()

    /**
     * Set ProcessDefineId Null
     */
    final public void setProcessDefineIdNull() {
        this.processDefineIdNull = true;
    } // end setProcessDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessDefineIdNull(boolean aNullFlag) {
        this.processDefineIdNull = aNullFlag;
    } // end setProcessDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessDefineIdNull() {
        return this.processDefineIdNull;
    } // end isProcessDefineIdNull()

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
     * Get StarterId
     *
     * @return starterId
     */
    final public long getStarterId() {
        return starterId;
    } // end getStarterId()

    /**
     * Set StarterId
     *
     * @param aStarterId
     */
    final public void setStarterId(long aStarterId) {
        this.starterId = aStarterId;

        this.starterIdSetted = true;

        this.setStarterIdNull(false);
    } // end setStarterId()

    /**
     * Get StarterId Has Been Setted
     *
     * @return starterId
     */
    final public boolean isStarterIdSetted() {
        return this.starterIdSetted;
    } // end isStarterIdSetted()

    /**
     * Set StarterId Null
     */
    final public void setStarterIdNull() {
        this.starterIdNull = true;
    } // end setStarterIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStarterIdNull(boolean aNullFlag) {
        this.starterIdNull = aNullFlag;
    } // end setStarterIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStarterIdNull() {
        return this.starterIdNull;
    } // end isStarterIdNull()

    /**
     * Get StartDate
     *
     * @return startDate
     */
    final public java.util.Date getStartDate() {
        return startDate;
    } // end getStartDate()

    /**
     * Set StartDate
     *
     * @param aStartDate
     */
    final public void setStartDate(java.util.Date aStartDate) {
        this.startDate = aStartDate;

        this.startDateSetted = true;

        this.setStartDateNull(this.startDate == null);
    } // end setStartDate()

    /**
     * Get StartDate Has Been Setted
     *
     * @return startDate
     */
    final public boolean isStartDateSetted() {
        return this.startDateSetted;
    } // end isStartDateSetted()

    /**
     * Set StartDate Null
     */
    final public void setStartDateNull() {
        this.startDateNull = true;
    } // end setStartDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStartDateNull(boolean aNullFlag) {
        this.startDateNull = aNullFlag;
    } // end setStartDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStartDateNull() {
        return this.startDateNull;
    } // end isStartDateNull()

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
     * Get ProcessName
     *
     * @return processName
     */
    final public String getProcessName() {
        return processName;
    } // end getProcessName()

    /**
     * Set ProcessName
     *
     * @param aProcessName
     */
    final public void setProcessName(String aProcessName) {
        this.processName = aProcessName;

        this.processNameSetted = true;

        this.setProcessNameNull(this.processName == null);
    } // end setProcessName()

    /**
     * Get ProcessName Has Been Setted
     *
     * @return processName
     */
    final public boolean isProcessNameSetted() {
        return this.processNameSetted;
    } // end isProcessNameSetted()

    /**
     * Set ProcessName Null
     */
    final public void setProcessNameNull() {
        this.processNameNull = true;
    } // end setProcessNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessNameNull(boolean aNullFlag) {
        this.processNameNull = aNullFlag;
    } // end setProcessNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessNameNull() {
        return this.processNameNull;
    } // end isProcessNameNull()

    /**
     * Get ProcessKey
     *
     * @return processKey
     */
    final public String getProcessKey() {
        if (isProcessKeyNull()) {
            return null;
        } // end if
        else {
            return processKey;
        } // end else
    } // end getProcessKey()

    /**
     * Set ProcessKey
     *
     * @param aProcessKey
     */
    final public void setProcessKey(String aProcessKey) {
        this.processKey = aProcessKey;

        this.processKeySetted = true;

        this.setProcessKeyNull(this.processKey == null);
    } // end setProcessKey()

    /**
     * Get ProcessKey Has Been Setted
     *
     * @return processKey
     */
    final public boolean isProcessKeySetted() {
        return this.processKeySetted;
    } // end isProcessKeySetted()

    /**
     * Set ProcessKey Null
     */
    final public void setProcessKeyNull() {
        this.processKeyNull = true;
    } // end setProcessKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessKeyNull(boolean aNullFlag) {
        this.processKeyNull = aNullFlag;
    } // end setProcessKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessKeyNull() {
        return this.processKeyNull;
    } // end isProcessKeyNull()

    /**
     * Get StarterName
     *
     * @return starterName
     */
    final public String getStarterName() {
        return starterName;
    } // end getStarterName()

    /**
     * Set StarterName
     *
     * @param aStarterName
     */
    final public void setStarterName(String aStarterName) {
        this.starterName = aStarterName;

        this.starterNameSetted = true;

        this.setStarterNameNull(this.starterName == null);
    } // end setStarterName()

    /**
     * Get StarterName Has Been Setted
     *
     * @return starterName
     */
    final public boolean isStarterNameSetted() {
        return this.starterNameSetted;
    } // end isStarterNameSetted()

    /**
     * Set StarterName Null
     */
    final public void setStarterNameNull() {
        this.starterNameNull = true;
    } // end setStarterNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStarterNameNull(boolean aNullFlag) {
        this.starterNameNull = aNullFlag;
    } // end setStarterNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStarterNameNull() {
        return this.starterNameNull;
    } // end isStarterNameNull()

    /**
     * Get StarterCode
     *
     * @return starterCode
     */
    final public String getStarterCode() {
        return starterCode;
    } // end getStarterCode()

    /**
     * Set StarterCode
     *
     * @param aStarterCode
     */
    final public void setStarterCode(String aStarterCode) {
        this.starterCode = aStarterCode;

        this.starterCodeSetted = true;

        this.setStarterCodeNull(this.starterCode == null);
    } // end setStarterCode()

    /**
     * Get StarterCode Has Been Setted
     *
     * @return starterCode
     */
    final public boolean isStarterCodeSetted() {
        return this.starterCodeSetted;
    } // end isStarterCodeSetted()

    /**
     * Set StarterCode Null
     */
    final public void setStarterCodeNull() {
        this.starterCodeNull = true;
    } // end setStarterCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStarterCodeNull(boolean aNullFlag) {
        this.starterCodeNull = aNullFlag;
    } // end setStarterCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStarterCodeNull() {
        return this.starterCodeNull;
    } // end isStarterCodeNull()

    /**
     * Get InstanceId
     *
     * @return instanceId
     */
    final public String getInstanceId() {
        return instanceId;
    } // end getInstanceId()

    /**
     * Set InstanceId
     *
     * @param aInstanceId
     */
    final public void setInstanceId(String aInstanceId) {
        this.instanceId = aInstanceId;

        this.instanceIdSetted = true;

        this.setInstanceIdNull(this.instanceId == null);
    } // end setInstanceId()

    /**
     * Get InstanceId Has Been Setted
     *
     * @return instanceId
     */
    final public boolean isInstanceIdSetted() {
        return this.instanceIdSetted;
    } // end isInstanceIdSetted()

    /**
     * Set InstanceId Null
     */
    final public void setInstanceIdNull() {
        this.instanceIdNull = true;
    } // end setInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setInstanceIdNull(boolean aNullFlag) {
        this.instanceIdNull = aNullFlag;
    } // end setInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isInstanceIdNull() {
        return this.instanceIdNull;
    } // end isInstanceIdNull()

    /**
     * Get SerialNumber
     *
     * @return serialNumber
     */
    final public String getSerialNumber() {
        return serialNumber;
    } // end getSerialNumber()

    /**
     * Set SerialNumber
     *
     * @param aSerialNumber
     */
    final public void setSerialNumber(String aSerialNumber) {
        this.serialNumber = aSerialNumber;

        this.serialNumberSetted = true;

        this.setSerialNumberNull(this.serialNumber == null);
    } // end setSerialNumber()

    /**
     * Get SerialNumber Has Been Setted
     *
     * @return serialNumber
     */
    final public boolean isSerialNumberSetted() {
        return this.serialNumberSetted;
    } // end isSerialNumberSetted()

    /**
     * Set SerialNumber Null
     */
    final public void setSerialNumberNull() {
        this.serialNumberNull = true;
    } // end setSerialNumberNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSerialNumberNull(boolean aNullFlag) {
        this.serialNumberNull = aNullFlag;
    } // end setSerialNumberNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSerialNumberNull() {
        return this.serialNumberNull;
    } // end isSerialNumberNull()

    /**
     * Get LastOperatorId
     *
     * @return lastOperatorId
     */
    final public long getLastOperatorId() {
        return lastOperatorId;
    } // end getLastOperatorId()

    /**
     * Set LastOperatorId
     *
     * @param aLastOperatorId
     */
    final public void setLastOperatorId(long aLastOperatorId) {
        this.lastOperatorId = aLastOperatorId;

        this.lastOperatorIdSetted = true;

        this.setLastOperatorIdNull(false);
    } // end setLastOperatorId()

    /**
     * Get LastOperatorId Has Been Setted
     *
     * @return lastOperatorId
     */
    final public boolean isLastOperatorIdSetted() {
        return this.lastOperatorIdSetted;
    } // end isLastOperatorIdSetted()

    /**
     * Set LastOperatorId Null
     */
    final public void setLastOperatorIdNull() {
        this.lastOperatorIdNull = true;
    } // end setLastOperatorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastOperatorIdNull(boolean aNullFlag) {
        this.lastOperatorIdNull = aNullFlag;
    } // end setLastOperatorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastOperatorIdNull() {
        return this.lastOperatorIdNull;
    } // end isLastOperatorIdNull()

    /**
     * Get CommentCount
     *
     * @return commentCount
     */
    final public int getCommentCount() {
        return commentCount;
    } // end getCommentCount()

    /**
     * Set CommentCount
     *
     * @param aCommentCount
     */
    final public void setCommentCount(int aCommentCount) {
        this.commentCount = aCommentCount;

        this.commentCountSetted = true;

        this.setCommentCountNull(false);
    } // end setCommentCount()

    /**
     * Get CommentCount Has Been Setted
     *
     * @return commentCount
     */
    final public boolean isCommentCountSetted() {
        return this.commentCountSetted;
    } // end isCommentCountSetted()

    /**
     * Set CommentCount Null
     */
    final public void setCommentCountNull() {
        this.commentCountNull = true;
    } // end setCommentCountNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCommentCountNull(boolean aNullFlag) {
        this.commentCountNull = aNullFlag;
    } // end setCommentCountNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCommentCountNull() {
        return this.commentCountNull;
    } // end isCommentCountNull()

    /**
     * Get AttachmentCount
     *
     * @return attachmentCount
     */
    final public int getAttachmentCount() {
        return attachmentCount;
    } // end getAttachmentCount()

    /**
     * Set AttachmentCount
     *
     * @param aAttachmentCount
     */
    final public void setAttachmentCount(int aAttachmentCount) {
        this.attachmentCount = aAttachmentCount;

        this.attachmentCountSetted = true;

        this.setAttachmentCountNull(false);
    } // end setAttachmentCount()

    /**
     * Get AttachmentCount Has Been Setted
     *
     * @return attachmentCount
     */
    final public boolean isAttachmentCountSetted() {
        return this.attachmentCountSetted;
    } // end isAttachmentCountSetted()

    /**
     * Set AttachmentCount Null
     */
    final public void setAttachmentCountNull() {
        this.attachmentCountNull = true;
    } // end setAttachmentCountNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAttachmentCountNull(boolean aNullFlag) {
        this.attachmentCountNull = aNullFlag;
    } // end setAttachmentCountNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAttachmentCountNull() {
        return this.attachmentCountNull;
    } // end isAttachmentCountNull()

    /**
     * Get StartFormKey
     *
     * @return startFormKey
     */
    final public String getStartFormKey() {
        return startFormKey;
    } // end getStartFormKey()

    /**
     * Set StartFormKey
     *
     * @param aStartFormKey
     */
    final public void setStartFormKey(String aStartFormKey) {
        this.startFormKey = aStartFormKey;

        this.startFormKeySetted = true;

        this.setStartFormKeyNull(this.startFormKey == null);
    } // end setStartFormKey()

    /**
     * Get StartFormKey Has Been Setted
     *
     * @return startFormKey
     */
    final public boolean isStartFormKeySetted() {
        return this.startFormKeySetted;
    } // end isStartFormKeySetted()

    /**
     * Set StartFormKey Null
     */
    final public void setStartFormKeyNull() {
        this.startFormKeyNull = true;
    } // end setStartFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStartFormKeyNull(boolean aNullFlag) {
        this.startFormKeyNull = aNullFlag;
    } // end setStartFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStartFormKeyNull() {
        return this.startFormKeyNull;
    } // end isStartFormKeyNull()

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

        if ((obj instanceof BpmProcessInstance) == false) {
            return false;
        } // end if

        BpmProcessInstance other = (BpmProcessInstance) obj;

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

        buffer.append("completeDate=");
        buffer.append(this.completeDate);
        buffer.append("\r\n");

        buffer.append("processDefineId=");
        buffer.append(this.processDefineId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("starterId=");
        buffer.append(this.starterId);
        buffer.append("\r\n");

        buffer.append("startDate=");
        buffer.append(this.startDate);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("processName=");
        buffer.append(this.processName);
        buffer.append("\r\n");

        buffer.append("processKey=");
        buffer.append(this.processKey);
        buffer.append("\r\n");

        buffer.append("starterName=");
        buffer.append(this.starterName);
        buffer.append("\r\n");

        buffer.append("starterCode=");
        buffer.append(this.starterCode);
        buffer.append("\r\n");

        buffer.append("instanceId=");
        buffer.append(this.instanceId);
        buffer.append("\r\n");

        buffer.append("serialNumber=");
        buffer.append(this.serialNumber);
        buffer.append("\r\n");

        buffer.append("lastOperatorId=");
        buffer.append(this.lastOperatorId);
        buffer.append("\r\n");

        buffer.append("commentCount=");
        buffer.append(this.commentCount);
        buffer.append("\r\n");

        buffer.append("attachmentCount=");
        buffer.append(this.attachmentCount);
        buffer.append("\r\n");

        buffer.append("startFormKey=");
        buffer.append(this.startFormKey);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmProcessInstance
