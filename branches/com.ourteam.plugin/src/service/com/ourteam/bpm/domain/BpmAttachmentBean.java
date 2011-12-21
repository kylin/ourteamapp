/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-02 14:40:00
 *
 * @model auto gen
 */
public class BpmAttachmentBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmAttachment objBpmAttachment;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmAttachmentDAO.Id);

        mappedDaoFields.put("name",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.FileName);

        mappedDaoFields.put("processInstanceId",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.ProcessInstanceId);

        mappedDaoFields.put("taskId",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.TaskId);

        mappedDaoFields.put("type",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.AttachementType);

        mappedDaoFields.put("url",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.AttachementUrl);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.Remarks);

        mappedDaoFields.put("attachmentSize",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.FileSize);

        mappedDaoFields.put("attachmentKey",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.AttachmentKey);

        mappedDaoFields.put("createDate",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.CreateDate);

        mappedDaoFields.put("creatorId",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.CreatorId);

        mappedDaoFields.put("fileType",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.FileType);

        mappedDaoFields.put("attachmentDisplaySize",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.FileDisplaySize);

        mappedDaoFields.put("creratorName",
            com.ourteam.bpm.dao.IBpmAttachmentDAO.CreratorName);
    } 

    /**
     * Creates a new BpmAttachmentBean object.
     */
    public BpmAttachmentBean() {
        super();

        objBpmAttachment = new com.ourteam.bpm.dao.BpmAttachment();
    } // end BpmAttachmentBean()

    /**
     * Creates a new BpmAttachmentBean object.
     *
     * @param aBpmAttachment DOCUMENT ME!
     */
    public BpmAttachmentBean(com.ourteam.bpm.dao.BpmAttachment aBpmAttachment) {
        super();

        objBpmAttachment = aBpmAttachment;
    } // end BpmAttachmentBean()

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
    public com.ourteam.bpm.dao.BpmAttachment convertToBpmAttachment() {
        return objBpmAttachment;
    } // end convertToBpmAttachment()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmAttachment.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmAttachment.setId(aId);
    } // end setId()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objBpmAttachment.getFileName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objBpmAttachment.setFileName(aName);
    } // end setName()

    /**
     * Get ProcessInstanceId
     *
     * @return processInstanceId
     */
    public long getProcessInstanceId() {
        return objBpmAttachment.getProcessInstanceId();
    } // end getProcessInstanceId()

    /**
     * Set ProcessInstanceId
     *
     * @param aProcessInstanceId
     */
    public void setProcessInstanceId(long aProcessInstanceId) {
        this.objBpmAttachment.setProcessInstanceId(aProcessInstanceId);
    } // end setProcessInstanceId()

    /**
     * Get TaskId
     *
     * @return taskId
     */
    public long getTaskId() {
        return objBpmAttachment.getTaskId();
    } // end getTaskId()

    /**
     * Set TaskId
     *
     * @param aTaskId
     */
    public void setTaskId(long aTaskId) {
        this.objBpmAttachment.setTaskId(aTaskId);
    } // end setTaskId()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objBpmAttachment.getAttachementType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objBpmAttachment.setAttachementType(aType);
    } // end setType()

    /**
     * Get Url
     *
     * @return url
     */
    public String getUrl() {
        return objBpmAttachment.getAttachementUrl();
    } // end getUrl()

    /**
     * Set Url
     *
     * @param aUrl
     */
    public void setUrl(String aUrl) {
        this.objBpmAttachment.setAttachementUrl(aUrl);
    } // end setUrl()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmAttachment.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmAttachment.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get AttachmentSize
     *
     * @return attachmentSize
     */
    public long getAttachmentSize() {
        return objBpmAttachment.getFileSize();
    } // end getAttachmentSize()

    /**
     * Set AttachmentSize
     *
     * @param aAttachmentSize
     */
    public void setAttachmentSize(long aAttachmentSize) {
        this.objBpmAttachment.setFileSize(aAttachmentSize);
    } // end setAttachmentSize()

    /**
     * Get AttachmentKey
     *
     * @return attachmentKey
     */
    public String getAttachmentKey() {
        return objBpmAttachment.getAttachmentKey();
    } // end getAttachmentKey()

    /**
     * Set AttachmentKey
     *
     * @param aAttachmentKey
     */
    public void setAttachmentKey(String aAttachmentKey) {
        this.objBpmAttachment.setAttachmentKey(aAttachmentKey);
    } // end setAttachmentKey()

    /**
     * Get CreateDate
     *
     * @return createDate
     */
    public java.util.Date getCreateDate() {
        return objBpmAttachment.getCreateDate();
    } // end getCreateDate()

    /**
     * Set CreateDate
     *
     * @param aCreateDate
     */
    public void setCreateDate(java.util.Date aCreateDate) {
        this.objBpmAttachment.setCreateDate(aCreateDate);
    } // end setCreateDate()

    /**
     * Get CreatorId
     *
     * @return creatorId
     */
    public long getCreatorId() {
        return objBpmAttachment.getCreatorId();
    } // end getCreatorId()

    /**
     * Set CreatorId
     *
     * @param aCreatorId
     */
    public void setCreatorId(long aCreatorId) {
        this.objBpmAttachment.setCreatorId(aCreatorId);
    } // end setCreatorId()

    /**
     * Get FileType
     *
     * @return fileType
     */
    public String getFileType() {
        return objBpmAttachment.getFileType();
    } // end getFileType()

    /**
     * Set FileType
     *
     * @param aFileType
     */
    public void setFileType(String aFileType) {
        this.objBpmAttachment.setFileType(aFileType);
    } // end setFileType()

    /**
     * Get AttachmentDisplaySize
     *
     * @return attachmentDisplaySize
     */
    public String getAttachmentDisplaySize() {
        return objBpmAttachment.getFileDisplaySize();
    } // end getAttachmentDisplaySize()

    /**
     * Set AttachmentDisplaySize
     *
     * @param aAttachmentDisplaySize
     */
    public void setAttachmentDisplaySize(String aAttachmentDisplaySize) {
        this.objBpmAttachment.setFileDisplaySize(aAttachmentDisplaySize);
    } // end setAttachmentDisplaySize()

    /**
     * Get CreratorName
     *
     * @return creratorName
     */
    public String getCreratorName() {
        return objBpmAttachment.getCreratorName();
    } // end getCreratorName()

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

        if ((obj instanceof BpmAttachmentBean) == false) {
            return false;
        } // end if

        BpmAttachmentBean other = (BpmAttachmentBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmAttachment tempBpmAttachment = other.convertToBpmAttachment();

        if ((tempBpmAttachment == null) || (this.objBpmAttachment == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmAttachment == this.objBpmAttachment) ||
                tempBpmAttachment.equals(this.objBpmAttachment)) {
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
     * @param aBpmAttachments DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmAttachmentBean[] toArray(
        com.ourteam.bpm.dao.BpmAttachment[] aBpmAttachments) {
        return toArray(aBpmAttachments, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmAttachments DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmAttachmentBean[] toArray(
        com.ourteam.bpm.dao.BpmAttachment[] aBpmAttachments,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmAttachments)) {
            return new BpmAttachmentBean[0];
        } // end if

        int length = aBpmAttachments.length;

        BpmAttachmentBean[] beans = new BpmAttachmentBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmAttachmentBean(aBpmAttachments[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmAttachmentBean(aBpmAttachments[i]);

                aCallBack.populate(beans[i], new Object[] { aBpmAttachments[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmAttachmentBean
