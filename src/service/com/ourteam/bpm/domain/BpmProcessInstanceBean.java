/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-25 14:54:54
 *
 * @model auto gen
 */
public class BpmProcessInstanceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmProcessInstance objBpmProcessInstance;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmProcessInstanceDAO.Id);

        mappedDaoFields.put("completeDate",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.CompleteDate);

        mappedDaoFields.put("processDefineId",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.ProcessDefineId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.Remarks);

        mappedDaoFields.put("starterId",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.StarterId);

        mappedDaoFields.put("startDate",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.StartDate);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.Status);

        mappedDaoFields.put("processName",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.ProcessName);

        mappedDaoFields.put("processKey",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.ProcessKey);

        mappedDaoFields.put("starterName",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.StarterName);

        mappedDaoFields.put("starterCode",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.StarterCode);

        mappedDaoFields.put("instanceId",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.InstanceId);

        mappedDaoFields.put("serialNumber",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.SerialNumber);

        mappedDaoFields.put("lastOperatorId",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.LastOperatorId);

        mappedDaoFields.put("commentCount",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.CommentCount);

        mappedDaoFields.put("attachmentCount",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.AttachmentCount);

        mappedDaoFields.put("startFormKey",
            com.ourteam.bpm.dao.IBpmProcessInstanceDAO.StartFormKey);
    } 

    /**
     * Creates a new BpmProcessInstanceBean object.
     */
    public BpmProcessInstanceBean() {
        super();

        objBpmProcessInstance = new com.ourteam.bpm.dao.BpmProcessInstance();
    } // end BpmProcessInstanceBean()

    /**
     * Creates a new BpmProcessInstanceBean object.
     *
     * @param aBpmProcessInstance DOCUMENT ME!
     */
    public BpmProcessInstanceBean(
        com.ourteam.bpm.dao.BpmProcessInstance aBpmProcessInstance) {
        super();

        objBpmProcessInstance = aBpmProcessInstance;
    } // end BpmProcessInstanceBean()

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
    public com.ourteam.bpm.dao.BpmProcessInstance convertToBpmProcessInstance() {
        return objBpmProcessInstance;
    } // end convertToBpmProcessInstance()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmProcessInstance.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmProcessInstance.setId(aId);
    } // end setId()

    /**
     * Get CompleteDate
     *
     * @return completeDate
     */
    public java.util.Date getCompleteDate() {
        return objBpmProcessInstance.getCompleteDate();
    } // end getCompleteDate()

    /**
     * Set CompleteDate
     *
     * @param aCompleteDate
     */
    public void setCompleteDate(java.util.Date aCompleteDate) {
        this.objBpmProcessInstance.setCompleteDate(aCompleteDate);
    } // end setCompleteDate()

    /**
     * Get ProcessDefineId
     *
     * @return processDefineId
     */
    public long getProcessDefineId() {
        return objBpmProcessInstance.getProcessDefineId();
    } // end getProcessDefineId()

    /**
     * Set ProcessDefineId
     *
     * @param aProcessDefineId
     */
    public void setProcessDefineId(long aProcessDefineId) {
        this.objBpmProcessInstance.setProcessDefineId(aProcessDefineId);
    } // end setProcessDefineId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmProcessInstance.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmProcessInstance.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get StarterId
     *
     * @return starterId
     */
    public long getStarterId() {
        return objBpmProcessInstance.getStarterId();
    } // end getStarterId()

    /**
     * Set StarterId
     *
     * @param aStarterId
     */
    public void setStarterId(long aStarterId) {
        this.objBpmProcessInstance.setStarterId(aStarterId);
    } // end setStarterId()

    /**
     * Get StartDate
     *
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return objBpmProcessInstance.getStartDate();
    } // end getStartDate()

    /**
     * Set StartDate
     *
     * @param aStartDate
     */
    public void setStartDate(java.util.Date aStartDate) {
        this.objBpmProcessInstance.setStartDate(aStartDate);
    } // end setStartDate()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmProcessInstance.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmProcessInstance.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ProcessName
     *
     * @return processName
     */
    public String getProcessName() {
        return objBpmProcessInstance.getProcessName();
    } // end getProcessName()

    /**
     * Set ProcessName
     *
     * @param aProcessName
     */
    public void setProcessName(String aProcessName) {
        this.objBpmProcessInstance.setProcessName(aProcessName);
    } // end setProcessName()

    /**
     * Get ProcessKey
     *
     * @return processKey
     */
    public String getProcessKey() {
        return objBpmProcessInstance.getProcessKey();
    } // end getProcessKey()

    /**
     * Set ProcessKey
     *
     * @param aProcessKey
     */
    public void setProcessKey(String aProcessKey) {
        this.objBpmProcessInstance.setProcessKey(aProcessKey);
    } // end setProcessKey()

    /**
     * Get StarterName
     *
     * @return starterName
     */
    public String getStarterName() {
        return objBpmProcessInstance.getStarterName();
    } // end getStarterName()

    /**
     * Get StarterCode
     *
     * @return starterCode
     */
    public String getStarterCode() {
        return objBpmProcessInstance.getStarterCode();
    } // end getStarterCode()

    /**
     * Get InstanceId
     *
     * @return instanceId
     */
    public String getInstanceId() {
        return objBpmProcessInstance.getInstanceId();
    } // end getInstanceId()

    /**
     * Set InstanceId
     *
     * @param aInstanceId
     */
    public void setInstanceId(String aInstanceId) {
        this.objBpmProcessInstance.setInstanceId(aInstanceId);
    } // end setInstanceId()

    /**
     * Get SerialNumber
     *
     * @return serialNumber
     */
    public String getSerialNumber() {
        return objBpmProcessInstance.getSerialNumber();
    } // end getSerialNumber()

    /**
     * Set SerialNumber
     *
     * @param aSerialNumber
     */
    public void setSerialNumber(String aSerialNumber) {
        this.objBpmProcessInstance.setSerialNumber(aSerialNumber);
    } // end setSerialNumber()

    /**
     * Get LastOperatorId
     *
     * @return lastOperatorId
     */
    public long getLastOperatorId() {
        return objBpmProcessInstance.getLastOperatorId();
    } // end getLastOperatorId()

    /**
     * Set LastOperatorId
     *
     * @param aLastOperatorId
     */
    public void setLastOperatorId(long aLastOperatorId) {
        this.objBpmProcessInstance.setLastOperatorId(aLastOperatorId);
    } // end setLastOperatorId()

    /**
     * Get CommentCount
     *
     * @return commentCount
     */
    public int getCommentCount() {
        return objBpmProcessInstance.getCommentCount();
    } // end getCommentCount()

    /**
     * Set CommentCount
     *
     * @param aCommentCount
     */
    public void setCommentCount(int aCommentCount) {
        this.objBpmProcessInstance.setCommentCount(aCommentCount);
    } // end setCommentCount()

    /**
     * Get AttachmentCount
     *
     * @return attachmentCount
     */
    public int getAttachmentCount() {
        return objBpmProcessInstance.getAttachmentCount();
    } // end getAttachmentCount()

    /**
     * Set AttachmentCount
     *
     * @param aAttachmentCount
     */
    public void setAttachmentCount(int aAttachmentCount) {
        this.objBpmProcessInstance.setAttachmentCount(aAttachmentCount);
    } // end setAttachmentCount()

    /**
     * Get StartFormKey
     *
     * @return startFormKey
     */
    public String getStartFormKey() {
        return objBpmProcessInstance.getStartFormKey();
    } // end getStartFormKey()

    /**
     * Set StartFormKey
     *
     * @param aStartFormKey
     */
    public void setStartFormKey(String aStartFormKey) {
        this.objBpmProcessInstance.setStartFormKey(aStartFormKey);
    } // end setStartFormKey()

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

        if ((obj instanceof BpmProcessInstanceBean) == false) {
            return false;
        } // end if

        BpmProcessInstanceBean other = (BpmProcessInstanceBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmProcessInstance tempBpmProcessInstance = other.convertToBpmProcessInstance();

        if ((tempBpmProcessInstance == null) ||
                (this.objBpmProcessInstance == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmProcessInstance == this.objBpmProcessInstance) ||
                tempBpmProcessInstance.equals(this.objBpmProcessInstance)) {
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
     * @param aBpmProcessInstances DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessInstanceBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessInstance[] aBpmProcessInstances) {
        return toArray(aBpmProcessInstances, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessInstances DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessInstanceBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessInstance[] aBpmProcessInstances,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmProcessInstances)) {
            return new BpmProcessInstanceBean[0];
        } // end if

        int length = aBpmProcessInstances.length;

        BpmProcessInstanceBean[] beans = new BpmProcessInstanceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessInstanceBean(aBpmProcessInstances[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessInstanceBean(aBpmProcessInstances[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmProcessInstances[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmProcessInstanceBean
