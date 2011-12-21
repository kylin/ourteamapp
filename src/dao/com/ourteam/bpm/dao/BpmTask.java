/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-30 15:28:42
 *
 * @author Auto Gen
 */
public class BpmTask implements java.io.Serializable {
    /**
     * Creates a new BpmTask object.
     */
    public BpmTask() {
        super();
    } // end BpmTask()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private Long assignerId;

    /** Attribute  Be Seted Falg */
    private boolean assignerIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean assignerIdNull = false;

    /** Attribute */
    private java.util.Date endDateTime;

    /** Attribute  Be Seted Falg */
    private boolean endDateTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean endDateTimeNull = false;

    /** Attribute */
    private int priority;

    /** Attribute  Be Seted Falg */
    private boolean prioritySetted = false;

    /** Attribute  is Null Falg */
    private boolean priorityNull = false;

    /** Attribute */
    private long processInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean processInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processInstanceIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private java.util.Date startDateTime;

    /** Attribute  Be Seted Falg */
    private boolean startDateTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean startDateTimeNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String taskKey;

    /** Attribute  Be Seted Falg */
    private boolean taskKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean taskKeyNull = false;

    /** Attribute */
    private String taskName;

    /** Attribute  Be Seted Falg */
    private boolean taskNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean taskNameNull = false;

    /** Attribute */
    private long processDefineId;

    /** Attribute  Be Seted Falg */
    private boolean processDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processDefineIdNull = false;

    /** Attribute */
    private String processName;

    /** Attribute  Be Seted Falg */
    private boolean processNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean processNameNull = false;

    /** Attribute */
    private String assignerName;

    /** Attribute  Be Seted Falg */
    private boolean assignerNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean assignerNameNull = false;

    /** Attribute */
    private long starterId;

    /** Attribute  Be Seted Falg */
    private boolean starterIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean starterIdNull = false;

    /** Attribute */
    private String serialNumber;

    /** Attribute  Be Seted Falg */
    private boolean serialNumberSetted = false;

    /** Attribute  is Null Falg */
    private boolean serialNumberNull = false;

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
    private String taskFormKey;

    /** Attribute  Be Seted Falg */
    private boolean taskFormKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean taskFormKeyNull = false;

    /** Attribute */
    private String processFormKey;

    /** Attribute  Be Seted Falg */
    private boolean processFormKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean processFormKeyNull = false;

    /** Attribute */
    private long preTaskId;

    /** Attribute  Be Seted Falg */
    private boolean preTaskIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean preTaskIdNull = false;

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
     * Get AssignerId
     *
     * @return assignerId
     */
    final public Long getAssignerId() {
        return assignerId;
    } // end getAssignerId()

    /**
     * Set AssignerId
     *
     * @param aAssignerId
     */
    final public void setAssignerId(Long aAssignerId) {
        this.assignerId = aAssignerId;

        this.assignerIdSetted = true;

        this.setAssignerIdNull(this.assignerId == null);
    } // end setAssignerId()

    /**
     * Get AssignerId Has Been Setted
     *
     * @return assignerId
     */
    final public boolean isAssignerIdSetted() {
        return this.assignerIdSetted;
    } // end isAssignerIdSetted()

    /**
     * Set AssignerId Null
     */
    final public void setAssignerIdNull() {
        this.assignerIdNull = true;
    } // end setAssignerIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAssignerIdNull(boolean aNullFlag) {
        this.assignerIdNull = aNullFlag;
    } // end setAssignerIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAssignerIdNull() {
        return this.assignerIdNull;
    } // end isAssignerIdNull()

    /**
     * Get EndDateTime
     *
     * @return endDateTime
     */
    final public java.util.Date getEndDateTime() {
        return endDateTime;
    } // end getEndDateTime()

    /**
     * Set EndDateTime
     *
     * @param aEndDateTime
     */
    final public void setEndDateTime(java.util.Date aEndDateTime) {
        this.endDateTime = aEndDateTime;

        this.endDateTimeSetted = true;

        this.setEndDateTimeNull(this.endDateTime == null);
    } // end setEndDateTime()

    /**
     * Get EndDateTime Has Been Setted
     *
     * @return endDateTime
     */
    final public boolean isEndDateTimeSetted() {
        return this.endDateTimeSetted;
    } // end isEndDateTimeSetted()

    /**
     * Set EndDateTime Null
     */
    final public void setEndDateTimeNull() {
        this.endDateTimeNull = true;
    } // end setEndDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEndDateTimeNull(boolean aNullFlag) {
        this.endDateTimeNull = aNullFlag;
    } // end setEndDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEndDateTimeNull() {
        return this.endDateTimeNull;
    } // end isEndDateTimeNull()

    /**
     * Get Priority
     *
     * @return priority
     */
    final public int getPriority() {
        return priority;
    } // end getPriority()

    /**
     * Set Priority
     *
     * @param aPriority
     */
    final public void setPriority(int aPriority) {
        this.priority = aPriority;

        this.prioritySetted = true;

        this.setPriorityNull(false);
    } // end setPriority()

    /**
     * Get Priority Has Been Setted
     *
     * @return priority
     */
    final public boolean isPrioritySetted() {
        return this.prioritySetted;
    } // end isPrioritySetted()

    /**
     * Set Priority Null
     */
    final public void setPriorityNull() {
        this.priorityNull = true;
    } // end setPriorityNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPriorityNull(boolean aNullFlag) {
        this.priorityNull = aNullFlag;
    } // end setPriorityNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPriorityNull() {
        return this.priorityNull;
    } // end isPriorityNull()

    /**
     * Get ProcessInstanceId
     *
     * @return processInstanceId
     */
    final public long getProcessInstanceId() {
        return processInstanceId;
    } // end getProcessInstanceId()

    /**
     * Set ProcessInstanceId
     *
     * @param aProcessInstanceId
     */
    final public void setProcessInstanceId(long aProcessInstanceId) {
        this.processInstanceId = aProcessInstanceId;

        this.processInstanceIdSetted = true;

        this.setProcessInstanceIdNull(false);
    } // end setProcessInstanceId()

    /**
     * Get ProcessInstanceId Has Been Setted
     *
     * @return processInstanceId
     */
    final public boolean isProcessInstanceIdSetted() {
        return this.processInstanceIdSetted;
    } // end isProcessInstanceIdSetted()

    /**
     * Set ProcessInstanceId Null
     */
    final public void setProcessInstanceIdNull() {
        this.processInstanceIdNull = true;
    } // end setProcessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessInstanceIdNull(boolean aNullFlag) {
        this.processInstanceIdNull = aNullFlag;
    } // end setProcessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessInstanceIdNull() {
        return this.processInstanceIdNull;
    } // end isProcessInstanceIdNull()

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
     * Get StartDateTime
     *
     * @return startDateTime
     */
    final public java.util.Date getStartDateTime() {
        return startDateTime;
    } // end getStartDateTime()

    /**
     * Set StartDateTime
     *
     * @param aStartDateTime
     */
    final public void setStartDateTime(java.util.Date aStartDateTime) {
        this.startDateTime = aStartDateTime;

        this.startDateTimeSetted = true;

        this.setStartDateTimeNull(this.startDateTime == null);
    } // end setStartDateTime()

    /**
     * Get StartDateTime Has Been Setted
     *
     * @return startDateTime
     */
    final public boolean isStartDateTimeSetted() {
        return this.startDateTimeSetted;
    } // end isStartDateTimeSetted()

    /**
     * Set StartDateTime Null
     */
    final public void setStartDateTimeNull() {
        this.startDateTimeNull = true;
    } // end setStartDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStartDateTimeNull(boolean aNullFlag) {
        this.startDateTimeNull = aNullFlag;
    } // end setStartDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStartDateTimeNull() {
        return this.startDateTimeNull;
    } // end isStartDateTimeNull()

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
     * Get TaskKey
     *
     * @return taskKey
     */
    final public String getTaskKey() {
        return taskKey;
    } // end getTaskKey()

    /**
     * Set TaskKey
     *
     * @param aTaskKey
     */
    final public void setTaskKey(String aTaskKey) {
        this.taskKey = aTaskKey;

        this.taskKeySetted = true;

        this.setTaskKeyNull(this.taskKey == null);
    } // end setTaskKey()

    /**
     * Get TaskKey Has Been Setted
     *
     * @return taskKey
     */
    final public boolean isTaskKeySetted() {
        return this.taskKeySetted;
    } // end isTaskKeySetted()

    /**
     * Set TaskKey Null
     */
    final public void setTaskKeyNull() {
        this.taskKeyNull = true;
    } // end setTaskKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTaskKeyNull(boolean aNullFlag) {
        this.taskKeyNull = aNullFlag;
    } // end setTaskKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTaskKeyNull() {
        return this.taskKeyNull;
    } // end isTaskKeyNull()

    /**
     * Get TaskName
     *
     * @return taskName
     */
    final public String getTaskName() {
        return taskName;
    } // end getTaskName()

    /**
     * Set TaskName
     *
     * @param aTaskName
     */
    final public void setTaskName(String aTaskName) {
        this.taskName = aTaskName;

        this.taskNameSetted = true;

        this.setTaskNameNull(this.taskName == null);
    } // end setTaskName()

    /**
     * Get TaskName Has Been Setted
     *
     * @return taskName
     */
    final public boolean isTaskNameSetted() {
        return this.taskNameSetted;
    } // end isTaskNameSetted()

    /**
     * Set TaskName Null
     */
    final public void setTaskNameNull() {
        this.taskNameNull = true;
    } // end setTaskNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTaskNameNull(boolean aNullFlag) {
        this.taskNameNull = aNullFlag;
    } // end setTaskNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTaskNameNull() {
        return this.taskNameNull;
    } // end isTaskNameNull()

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
     * Get AssignerName
     *
     * @return assignerName
     */
    final public String getAssignerName() {
        return assignerName;
    } // end getAssignerName()

    /**
     * Set AssignerName
     *
     * @param aAssignerName
     */
    final public void setAssignerName(String aAssignerName) {
        this.assignerName = aAssignerName;

        this.assignerNameSetted = true;

        this.setAssignerNameNull(this.assignerName == null);
    } // end setAssignerName()

    /**
     * Get AssignerName Has Been Setted
     *
     * @return assignerName
     */
    final public boolean isAssignerNameSetted() {
        return this.assignerNameSetted;
    } // end isAssignerNameSetted()

    /**
     * Set AssignerName Null
     */
    final public void setAssignerNameNull() {
        this.assignerNameNull = true;
    } // end setAssignerNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAssignerNameNull(boolean aNullFlag) {
        this.assignerNameNull = aNullFlag;
    } // end setAssignerNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAssignerNameNull() {
        return this.assignerNameNull;
    } // end isAssignerNameNull()

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
     * Get TaskFormKey
     *
     * @return taskFormKey
     */
    final public String getTaskFormKey() {
        return taskFormKey;
    } // end getTaskFormKey()

    /**
     * Set TaskFormKey
     *
     * @param aTaskFormKey
     */
    final public void setTaskFormKey(String aTaskFormKey) {
        this.taskFormKey = aTaskFormKey;

        this.taskFormKeySetted = true;

        this.setTaskFormKeyNull(this.taskFormKey == null);
    } // end setTaskFormKey()

    /**
     * Get TaskFormKey Has Been Setted
     *
     * @return taskFormKey
     */
    final public boolean isTaskFormKeySetted() {
        return this.taskFormKeySetted;
    } // end isTaskFormKeySetted()

    /**
     * Set TaskFormKey Null
     */
    final public void setTaskFormKeyNull() {
        this.taskFormKeyNull = true;
    } // end setTaskFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTaskFormKeyNull(boolean aNullFlag) {
        this.taskFormKeyNull = aNullFlag;
    } // end setTaskFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTaskFormKeyNull() {
        return this.taskFormKeyNull;
    } // end isTaskFormKeyNull()

    /**
     * Get ProcessFormKey
     *
     * @return processFormKey
     */
    final public String getProcessFormKey() {
        return processFormKey;
    } // end getProcessFormKey()

    /**
     * Set ProcessFormKey
     *
     * @param aProcessFormKey
     */
    final public void setProcessFormKey(String aProcessFormKey) {
        this.processFormKey = aProcessFormKey;

        this.processFormKeySetted = true;

        this.setProcessFormKeyNull(this.processFormKey == null);
    } // end setProcessFormKey()

    /**
     * Get ProcessFormKey Has Been Setted
     *
     * @return processFormKey
     */
    final public boolean isProcessFormKeySetted() {
        return this.processFormKeySetted;
    } // end isProcessFormKeySetted()

    /**
     * Set ProcessFormKey Null
     */
    final public void setProcessFormKeyNull() {
        this.processFormKeyNull = true;
    } // end setProcessFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessFormKeyNull(boolean aNullFlag) {
        this.processFormKeyNull = aNullFlag;
    } // end setProcessFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessFormKeyNull() {
        return this.processFormKeyNull;
    } // end isProcessFormKeyNull()

    /**
     * Get PreTaskId
     *
     * @return preTaskId
     */
    final public long getPreTaskId() {
        return preTaskId;
    } // end getPreTaskId()

    /**
     * Set PreTaskId
     *
     * @param aPreTaskId
     */
    final public void setPreTaskId(long aPreTaskId) {
        this.preTaskId = aPreTaskId;

        this.preTaskIdSetted = true;

        this.setPreTaskIdNull(false);
    } // end setPreTaskId()

    /**
     * Get PreTaskId Has Been Setted
     *
     * @return preTaskId
     */
    final public boolean isPreTaskIdSetted() {
        return this.preTaskIdSetted;
    } // end isPreTaskIdSetted()

    /**
     * Set PreTaskId Null
     */
    final public void setPreTaskIdNull() {
        this.preTaskIdNull = true;
    } // end setPreTaskIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPreTaskIdNull(boolean aNullFlag) {
        this.preTaskIdNull = aNullFlag;
    } // end setPreTaskIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPreTaskIdNull() {
        return this.preTaskIdNull;
    } // end isPreTaskIdNull()

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

        if ((obj instanceof BpmTask) == false) {
            return false;
        } // end if

        BpmTask other = (BpmTask) obj;

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

        buffer.append("assignerId=");
        buffer.append(this.assignerId);
        buffer.append("\r\n");

        buffer.append("endDateTime=");
        buffer.append(this.endDateTime);
        buffer.append("\r\n");

        buffer.append("priority=");
        buffer.append(this.priority);
        buffer.append("\r\n");

        buffer.append("processInstanceId=");
        buffer.append(this.processInstanceId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("startDateTime=");
        buffer.append(this.startDateTime);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("taskKey=");
        buffer.append(this.taskKey);
        buffer.append("\r\n");

        buffer.append("taskName=");
        buffer.append(this.taskName);
        buffer.append("\r\n");

        buffer.append("processDefineId=");
        buffer.append(this.processDefineId);
        buffer.append("\r\n");

        buffer.append("processName=");
        buffer.append(this.processName);
        buffer.append("\r\n");

        buffer.append("assignerName=");
        buffer.append(this.assignerName);
        buffer.append("\r\n");

        buffer.append("starterId=");
        buffer.append(this.starterId);
        buffer.append("\r\n");

        buffer.append("serialNumber=");
        buffer.append(this.serialNumber);
        buffer.append("\r\n");

        buffer.append("commentCount=");
        buffer.append(this.commentCount);
        buffer.append("\r\n");

        buffer.append("attachmentCount=");
        buffer.append(this.attachmentCount);
        buffer.append("\r\n");

        buffer.append("taskFormKey=");
        buffer.append(this.taskFormKey);
        buffer.append("\r\n");

        buffer.append("processFormKey=");
        buffer.append(this.processFormKey);
        buffer.append("\r\n");

        buffer.append("preTaskId=");
        buffer.append(this.preTaskId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmTask
