/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-29 15:15:10
 *
 * @model auto gen
 */
public class BpmTaskBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmTask objBpmTask;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmTaskDAO.Id);

        mappedDaoFields.put("assignerId",
            com.ourteam.bpm.dao.IBpmTaskDAO.AssignerId);

        mappedDaoFields.put("endDateTime",
            com.ourteam.bpm.dao.IBpmTaskDAO.EndDateTime);

        mappedDaoFields.put("priority", com.ourteam.bpm.dao.IBpmTaskDAO.Priority);

        mappedDaoFields.put("processInstanceId",
            com.ourteam.bpm.dao.IBpmTaskDAO.ProcessInstanceId);

        mappedDaoFields.put("remarks", com.ourteam.bpm.dao.IBpmTaskDAO.Remarks);

        mappedDaoFields.put("startDateTime",
            com.ourteam.bpm.dao.IBpmTaskDAO.StartDateTime);

        mappedDaoFields.put("status", com.ourteam.bpm.dao.IBpmTaskDAO.Status);

        mappedDaoFields.put("taskKey", com.ourteam.bpm.dao.IBpmTaskDAO.TaskKey);

        mappedDaoFields.put("taskName", com.ourteam.bpm.dao.IBpmTaskDAO.TaskName);

        mappedDaoFields.put("processDefineId",
            com.ourteam.bpm.dao.IBpmTaskDAO.ProcessDefineId);

        mappedDaoFields.put("processName",
            com.ourteam.bpm.dao.IBpmTaskDAO.ProcessName);

        mappedDaoFields.put("assignerName",
            com.ourteam.bpm.dao.IBpmTaskDAO.AssignerName);

        mappedDaoFields.put("starterId",
            com.ourteam.bpm.dao.IBpmTaskDAO.StarterId);

        mappedDaoFields.put("serialNumber",
            com.ourteam.bpm.dao.IBpmTaskDAO.SerialNumber);

        mappedDaoFields.put("commentCount",
            com.ourteam.bpm.dao.IBpmTaskDAO.CommentCount);

        mappedDaoFields.put("attachmentCount",
            com.ourteam.bpm.dao.IBpmTaskDAO.AttachmentCount);

        mappedDaoFields.put("taskFormKey",
            com.ourteam.bpm.dao.IBpmTaskDAO.TaskFormKey);

        mappedDaoFields.put("processFormKey",
            com.ourteam.bpm.dao.IBpmTaskDAO.ProcessFormKey);

        mappedDaoFields.put("preTaskId",
            com.ourteam.bpm.dao.IBpmTaskDAO.PreTaskId);
    } 

    /**
     * Creates a new BpmTaskBean object.
     */
    public BpmTaskBean() {
        super();

        objBpmTask = new com.ourteam.bpm.dao.BpmTask();
    } // end BpmTaskBean()

    /**
     * Creates a new BpmTaskBean object.
     *
     * @param aBpmTask DOCUMENT ME!
     */
    public BpmTaskBean(com.ourteam.bpm.dao.BpmTask aBpmTask) {
        super();

        objBpmTask = aBpmTask;
    } // end BpmTaskBean()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.BpmTask convertToBpmTask() {
        return objBpmTask;
    } // end convertToBpmTask()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmTask.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmTask.setId(aId);
    } // end setId()

    /**
     * Get AssignerId
     *
     * @return assignerId
     */
    public Long getAssignerId() {
        return objBpmTask.getAssignerId();
    } // end getAssignerId()

    /**
     * Set AssignerId
     *
     * @param aAssignerId
     */
    public void setAssignerId(Long aAssignerId) {
        this.objBpmTask.setAssignerId(aAssignerId);
    } // end setAssignerId()

    /**
     * Get EndDateTime
     *
     * @return endDateTime
     */
    public java.util.Date getEndDateTime() {
        return objBpmTask.getEndDateTime();
    } // end getEndDateTime()

    /**
     * Set EndDateTime
     *
     * @param aEndDateTime
     */
    public void setEndDateTime(java.util.Date aEndDateTime) {
        this.objBpmTask.setEndDateTime(aEndDateTime);
    } // end setEndDateTime()

    /**
     * Get Priority
     *
     * @return priority
     */
    public int getPriority() {
        return objBpmTask.getPriority();
    } // end getPriority()

    /**
     * Set Priority
     *
     * @param aPriority
     */
    public void setPriority(int aPriority) {
        this.objBpmTask.setPriority(aPriority);
    } // end setPriority()

    /**
     * Get ProcessInstanceId
     *
     * @return processInstanceId
     */
    public long getProcessInstanceId() {
        return objBpmTask.getProcessInstanceId();
    } // end getProcessInstanceId()

    /**
     * Set ProcessInstanceId
     *
     * @param aProcessInstanceId
     */
    public void setProcessInstanceId(long aProcessInstanceId) {
        this.objBpmTask.setProcessInstanceId(aProcessInstanceId);
    } // end setProcessInstanceId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmTask.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmTask.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get StartDateTime
     *
     * @return startDateTime
     */
    public java.util.Date getStartDateTime() {
        return objBpmTask.getStartDateTime();
    } // end getStartDateTime()

    /**
     * Set StartDateTime
     *
     * @param aStartDateTime
     */
    public void setStartDateTime(java.util.Date aStartDateTime) {
        this.objBpmTask.setStartDateTime(aStartDateTime);
    } // end setStartDateTime()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmTask.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmTask.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TaskKey
     *
     * @return taskKey
     */
    public String getTaskKey() {
        return objBpmTask.getTaskKey();
    } // end getTaskKey()

    /**
     * Set TaskKey
     *
     * @param aTaskKey
     */
    public void setTaskKey(String aTaskKey) {
        this.objBpmTask.setTaskKey(aTaskKey);
    } // end setTaskKey()

    /**
     * Get TaskName
     *
     * @return taskName
     */
    public String getTaskName() {
        return objBpmTask.getTaskName();
    } // end getTaskName()

    /**
     * Set TaskName
     *
     * @param aTaskName
     */
    public void setTaskName(String aTaskName) {
        this.objBpmTask.setTaskName(aTaskName);
    } // end setTaskName()

    /**
     * Get ProcessDefineId
     *
     * @return processDefineId
     */
    public long getProcessDefineId() {
        return objBpmTask.getProcessDefineId();
    } // end getProcessDefineId()

    /**
     * Set ProcessDefineId
     *
     * @param aProcessDefineId
     */
    public void setProcessDefineId(long aProcessDefineId) {
        this.objBpmTask.setProcessDefineId(aProcessDefineId);
    } // end setProcessDefineId()

    /**
     * Get ProcessName
     *
     * @return processName
     */
    public String getProcessName() {
        return objBpmTask.getProcessName();
    } // end getProcessName()

    /**
     * Set ProcessName
     *
     * @param aProcessName
     */
    public void setProcessName(String aProcessName) {
        this.objBpmTask.setProcessName(aProcessName);
    } // end setProcessName()

    /**
     * Get AssignerName
     *
     * @return assignerName
     */
    public String getAssignerName() {
        return objBpmTask.getAssignerName();
    } // end getAssignerName()

    /**
     * Get StarterId
     *
     * @return starterId
     */
    public long getStarterId() {
        return objBpmTask.getStarterId();
    } // end getStarterId()

    /**
     * Set StarterId
     *
     * @param aStarterId
     */
    public void setStarterId(long aStarterId) {
        this.objBpmTask.setStarterId(aStarterId);
    } // end setStarterId()

    /**
     * Get SerialNumber
     *
     * @return serialNumber
     */
    public String getSerialNumber() {
        return objBpmTask.getSerialNumber();
    } // end getSerialNumber()

    /**
     * Set SerialNumber
     *
     * @param aSerialNumber
     */
    public void setSerialNumber(String aSerialNumber) {
        this.objBpmTask.setSerialNumber(aSerialNumber);
    } // end setSerialNumber()

    /**
     * Get CommentCount
     *
     * @return commentCount
     */
    public int getCommentCount() {
        return objBpmTask.getCommentCount();
    } // end getCommentCount()

    /**
     * Set CommentCount
     *
     * @param aCommentCount
     */
    public void setCommentCount(int aCommentCount) {
        this.objBpmTask.setCommentCount(aCommentCount);
    } // end setCommentCount()

    /**
     * Get AttachmentCount
     *
     * @return attachmentCount
     */
    public int getAttachmentCount() {
        return objBpmTask.getAttachmentCount();
    } // end getAttachmentCount()

    /**
     * Set AttachmentCount
     *
     * @param aAttachmentCount
     */
    public void setAttachmentCount(int aAttachmentCount) {
        this.objBpmTask.setAttachmentCount(aAttachmentCount);
    } // end setAttachmentCount()

    /**
     * Get TaskFormKey
     *
     * @return taskFormKey
     */
    public String getTaskFormKey() {
        return objBpmTask.getTaskFormKey();
    } // end getTaskFormKey()

    /**
     * Set TaskFormKey
     *
     * @param aTaskFormKey
     */
    public void setTaskFormKey(String aTaskFormKey) {
        this.objBpmTask.setTaskFormKey(aTaskFormKey);
    } // end setTaskFormKey()

    /**
     * Get ProcessFormKey
     *
     * @return processFormKey
     */
    public String getProcessFormKey() {
        return objBpmTask.getProcessFormKey();
    } // end getProcessFormKey()

    /**
     * Get PreTaskId
     *
     * @return preTaskId
     */
    public long getPreTaskId() {
        return objBpmTask.getPreTaskId();
    } // end getPreTaskId()

    /**
     * Set PreTaskId
     *
     * @param aPreTaskId
     */
    public void setPreTaskId(long aPreTaskId) {
        this.objBpmTask.setPreTaskId(aPreTaskId);
    } // end setPreTaskId()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
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

        if ((obj instanceof BpmTaskBean) == false) {
            return false;
        } // end if

        BpmTaskBean other = (BpmTaskBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmTask tempBpmTask = other.convertToBpmTask();

        if ((tempBpmTask == null) || (this.objBpmTask == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmTask == this.objBpmTask) ||
                tempBpmTask.equals(this.objBpmTask)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTasks DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmTaskBean[] toArray(com.ourteam.bpm.dao.BpmTask[] aBpmTasks) {
        return toArray(aBpmTasks, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTasks DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmTaskBean[] toArray(
        com.ourteam.bpm.dao.BpmTask[] aBpmTasks, IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmTasks)) {
            return new BpmTaskBean[0];
        } // end if

        int length = aBpmTasks.length;

        BpmTaskBean[] beans = new BpmTaskBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmTaskBean(aBpmTasks[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmTaskBean(aBpmTasks[i]);

                aCallBack.populate(beans[i], new Object[] { aBpmTasks[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmTaskBean
