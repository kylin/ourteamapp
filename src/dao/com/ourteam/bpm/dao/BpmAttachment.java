/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-12-02 14:46:13
 *
 * @author Auto Gen
 */
public class BpmAttachment implements java.io.Serializable {
    /**
     * Creates a new BpmAttachment object.
     */
    public BpmAttachment() {
        super();
    } // end BpmAttachment()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date createDate;

    /** Attribute  Be Seted Falg */
    private boolean createDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean createDateNull = false;

    /** Attribute */
    private long creatorId;

    /** Attribute  Be Seted Falg */
    private boolean creatorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean creatorIdNull = false;

    /** Attribute */
    private String fileName;

    /** Attribute  Be Seted Falg */
    private boolean fileNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean fileNameNull = false;

    /** Attribute */
    private long fileSize;

    /** Attribute  Be Seted Falg */
    private boolean fileSizeSetted = false;

    /** Attribute  is Null Falg */
    private boolean fileSizeNull = false;

    /** Attribute */
    private String fileType;

    /** Attribute  Be Seted Falg */
    private boolean fileTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean fileTypeNull = false;

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
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long taskId;

    /** Attribute  Be Seted Falg */
    private boolean taskIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean taskIdNull = false;

    /** Attribute */
    private String attachementUrl;

    /** Attribute  Be Seted Falg */
    private boolean attachementUrlSetted = false;

    /** Attribute  is Null Falg */
    private boolean attachementUrlNull = false;

    /** Attribute */
    private String attachementType;

    /** Attribute  Be Seted Falg */
    private boolean attachementTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean attachementTypeNull = false;

    /** Attribute */
    private String attachmentKey;

    /** Attribute  Be Seted Falg */
    private boolean attachmentKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean attachmentKeyNull = false;

    /** Attribute */
    private String fileDisplaySize;

    /** Attribute  Be Seted Falg */
    private boolean fileDisplaySizeSetted = false;

    /** Attribute  is Null Falg */
    private boolean fileDisplaySizeNull = false;

    /** Attribute */
    private String creratorName;

    /** Attribute  Be Seted Falg */
    private boolean creratorNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean creratorNameNull = false;

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
     * Get CreateDate
     *
     * @return createDate
     */
    final public java.util.Date getCreateDate() {
        return createDate;
    } // end getCreateDate()

    /**
     * Set CreateDate
     *
     * @param aCreateDate
     */
    final public void setCreateDate(java.util.Date aCreateDate) {
        this.createDate = aCreateDate;

        this.createDateSetted = true;

        this.setCreateDateNull(this.createDate == null);
    } // end setCreateDate()

    /**
     * Get CreateDate Has Been Setted
     *
     * @return createDate
     */
    final public boolean isCreateDateSetted() {
        return this.createDateSetted;
    } // end isCreateDateSetted()

    /**
     * Set CreateDate Null
     */
    final public void setCreateDateNull() {
        this.createDateNull = true;
    } // end setCreateDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCreateDateNull(boolean aNullFlag) {
        this.createDateNull = aNullFlag;
    } // end setCreateDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCreateDateNull() {
        return this.createDateNull;
    } // end isCreateDateNull()

    /**
     * Get CreatorId
     *
     * @return creatorId
     */
    final public long getCreatorId() {
        return creatorId;
    } // end getCreatorId()

    /**
     * Set CreatorId
     *
     * @param aCreatorId
     */
    final public void setCreatorId(long aCreatorId) {
        this.creatorId = aCreatorId;

        this.creatorIdSetted = true;

        this.setCreatorIdNull(false);
    } // end setCreatorId()

    /**
     * Get CreatorId Has Been Setted
     *
     * @return creatorId
     */
    final public boolean isCreatorIdSetted() {
        return this.creatorIdSetted;
    } // end isCreatorIdSetted()

    /**
     * Set CreatorId Null
     */
    final public void setCreatorIdNull() {
        this.creatorIdNull = true;
    } // end setCreatorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCreatorIdNull(boolean aNullFlag) {
        this.creatorIdNull = aNullFlag;
    } // end setCreatorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCreatorIdNull() {
        return this.creatorIdNull;
    } // end isCreatorIdNull()

    /**
     * Get FileName
     *
     * @return fileName
     */
    final public String getFileName() {
        if (isFileNameNull()) {
            return null;
        } // end if
        else {
            return fileName;
        } // end else
    } // end getFileName()

    /**
     * Set FileName
     *
     * @param aFileName
     */
    final public void setFileName(String aFileName) {
        this.fileName = aFileName;

        this.fileNameSetted = true;

        this.setFileNameNull(this.fileName == null);
    } // end setFileName()

    /**
     * Get FileName Has Been Setted
     *
     * @return fileName
     */
    final public boolean isFileNameSetted() {
        return this.fileNameSetted;
    } // end isFileNameSetted()

    /**
     * Set FileName Null
     */
    final public void setFileNameNull() {
        this.fileNameNull = true;
    } // end setFileNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFileNameNull(boolean aNullFlag) {
        this.fileNameNull = aNullFlag;
    } // end setFileNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFileNameNull() {
        return this.fileNameNull;
    } // end isFileNameNull()

    /**
     * Get FileSize
     *
     * @return fileSize
     */
    final public long getFileSize() {
        return fileSize;
    } // end getFileSize()

    /**
     * Set FileSize
     *
     * @param aFileSize
     */
    final public void setFileSize(long aFileSize) {
        this.fileSize = aFileSize;

        this.fileSizeSetted = true;

        this.setFileSizeNull(false);
    } // end setFileSize()

    /**
     * Get FileSize Has Been Setted
     *
     * @return fileSize
     */
    final public boolean isFileSizeSetted() {
        return this.fileSizeSetted;
    } // end isFileSizeSetted()

    /**
     * Set FileSize Null
     */
    final public void setFileSizeNull() {
        this.fileSizeNull = true;
    } // end setFileSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFileSizeNull(boolean aNullFlag) {
        this.fileSizeNull = aNullFlag;
    } // end setFileSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFileSizeNull() {
        return this.fileSizeNull;
    } // end isFileSizeNull()

    /**
     * Get FileType
     *
     * @return fileType
     */
    final public String getFileType() {
        return fileType;
    } // end getFileType()

    /**
     * Set FileType
     *
     * @param aFileType
     */
    final public void setFileType(String aFileType) {
        this.fileType = aFileType;

        this.fileTypeSetted = true;

        this.setFileTypeNull(this.fileType == null);
    } // end setFileType()

    /**
     * Get FileType Has Been Setted
     *
     * @return fileType
     */
    final public boolean isFileTypeSetted() {
        return this.fileTypeSetted;
    } // end isFileTypeSetted()

    /**
     * Set FileType Null
     */
    final public void setFileTypeNull() {
        this.fileTypeNull = true;
    } // end setFileTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFileTypeNull(boolean aNullFlag) {
        this.fileTypeNull = aNullFlag;
    } // end setFileTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFileTypeNull() {
        return this.fileTypeNull;
    } // end isFileTypeNull()

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
     * Get TaskId
     *
     * @return taskId
     */
    final public long getTaskId() {
        return taskId;
    } // end getTaskId()

    /**
     * Set TaskId
     *
     * @param aTaskId
     */
    final public void setTaskId(long aTaskId) {
        this.taskId = aTaskId;

        this.taskIdSetted = true;

        this.setTaskIdNull(false);
    } // end setTaskId()

    /**
     * Get TaskId Has Been Setted
     *
     * @return taskId
     */
    final public boolean isTaskIdSetted() {
        return this.taskIdSetted;
    } // end isTaskIdSetted()

    /**
     * Set TaskId Null
     */
    final public void setTaskIdNull() {
        this.taskIdNull = true;
    } // end setTaskIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTaskIdNull(boolean aNullFlag) {
        this.taskIdNull = aNullFlag;
    } // end setTaskIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTaskIdNull() {
        return this.taskIdNull;
    } // end isTaskIdNull()

    /**
     * Get AttachementUrl
     *
     * @return attachementUrl
     */
    final public String getAttachementUrl() {
        if (isAttachementUrlNull()) {
            return null;
        } // end if
        else {
            return attachementUrl;
        } // end else
    } // end getAttachementUrl()

    /**
     * Set AttachementUrl
     *
     * @param aAttachementUrl
     */
    final public void setAttachementUrl(String aAttachementUrl) {
        this.attachementUrl = aAttachementUrl;

        this.attachementUrlSetted = true;

        this.setAttachementUrlNull(this.attachementUrl == null);
    } // end setAttachementUrl()

    /**
     * Get AttachementUrl Has Been Setted
     *
     * @return attachementUrl
     */
    final public boolean isAttachementUrlSetted() {
        return this.attachementUrlSetted;
    } // end isAttachementUrlSetted()

    /**
     * Set AttachementUrl Null
     */
    final public void setAttachementUrlNull() {
        this.attachementUrlNull = true;
    } // end setAttachementUrlNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAttachementUrlNull(boolean aNullFlag) {
        this.attachementUrlNull = aNullFlag;
    } // end setAttachementUrlNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAttachementUrlNull() {
        return this.attachementUrlNull;
    } // end isAttachementUrlNull()

    /**
     * Get AttachementType
     *
     * @return attachementType
     */
    final public String getAttachementType() {
        return attachementType;
    } // end getAttachementType()

    /**
     * Set AttachementType
     *
     * @param aAttachementType
     */
    final public void setAttachementType(String aAttachementType) {
        this.attachementType = aAttachementType;

        this.attachementTypeSetted = true;

        this.setAttachementTypeNull(this.attachementType == null);
    } // end setAttachementType()

    /**
     * Get AttachementType Has Been Setted
     *
     * @return attachementType
     */
    final public boolean isAttachementTypeSetted() {
        return this.attachementTypeSetted;
    } // end isAttachementTypeSetted()

    /**
     * Set AttachementType Null
     */
    final public void setAttachementTypeNull() {
        this.attachementTypeNull = true;
    } // end setAttachementTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAttachementTypeNull(boolean aNullFlag) {
        this.attachementTypeNull = aNullFlag;
    } // end setAttachementTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAttachementTypeNull() {
        return this.attachementTypeNull;
    } // end isAttachementTypeNull()

    /**
     * Get AttachmentKey
     *
     * @return attachmentKey
     */
    final public String getAttachmentKey() {
        return attachmentKey;
    } // end getAttachmentKey()

    /**
     * Set AttachmentKey
     *
     * @param aAttachmentKey
     */
    final public void setAttachmentKey(String aAttachmentKey) {
        this.attachmentKey = aAttachmentKey;

        this.attachmentKeySetted = true;

        this.setAttachmentKeyNull(this.attachmentKey == null);
    } // end setAttachmentKey()

    /**
     * Get AttachmentKey Has Been Setted
     *
     * @return attachmentKey
     */
    final public boolean isAttachmentKeySetted() {
        return this.attachmentKeySetted;
    } // end isAttachmentKeySetted()

    /**
     * Set AttachmentKey Null
     */
    final public void setAttachmentKeyNull() {
        this.attachmentKeyNull = true;
    } // end setAttachmentKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAttachmentKeyNull(boolean aNullFlag) {
        this.attachmentKeyNull = aNullFlag;
    } // end setAttachmentKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAttachmentKeyNull() {
        return this.attachmentKeyNull;
    } // end isAttachmentKeyNull()

    /**
     * Get FileDisplaySize
     *
     * @return fileDisplaySize
     */
    final public String getFileDisplaySize() {
        return fileDisplaySize;
    } // end getFileDisplaySize()

    /**
     * Set FileDisplaySize
     *
     * @param aFileDisplaySize
     */
    final public void setFileDisplaySize(String aFileDisplaySize) {
        this.fileDisplaySize = aFileDisplaySize;

        this.fileDisplaySizeSetted = true;

        this.setFileDisplaySizeNull(this.fileDisplaySize == null);
    } // end setFileDisplaySize()

    /**
     * Get FileDisplaySize Has Been Setted
     *
     * @return fileDisplaySize
     */
    final public boolean isFileDisplaySizeSetted() {
        return this.fileDisplaySizeSetted;
    } // end isFileDisplaySizeSetted()

    /**
     * Set FileDisplaySize Null
     */
    final public void setFileDisplaySizeNull() {
        this.fileDisplaySizeNull = true;
    } // end setFileDisplaySizeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFileDisplaySizeNull(boolean aNullFlag) {
        this.fileDisplaySizeNull = aNullFlag;
    } // end setFileDisplaySizeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFileDisplaySizeNull() {
        return this.fileDisplaySizeNull;
    } // end isFileDisplaySizeNull()

    /**
     * Get CreratorName
     *
     * @return creratorName
     */
    final public String getCreratorName() {
        return creratorName;
    } // end getCreratorName()

    /**
     * Set CreratorName
     *
     * @param aCreratorName
     */
    final public void setCreratorName(String aCreratorName) {
        this.creratorName = aCreratorName;

        this.creratorNameSetted = true;

        this.setCreratorNameNull(this.creratorName == null);
    } // end setCreratorName()

    /**
     * Get CreratorName Has Been Setted
     *
     * @return creratorName
     */
    final public boolean isCreratorNameSetted() {
        return this.creratorNameSetted;
    } // end isCreratorNameSetted()

    /**
     * Set CreratorName Null
     */
    final public void setCreratorNameNull() {
        this.creratorNameNull = true;
    } // end setCreratorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCreratorNameNull(boolean aNullFlag) {
        this.creratorNameNull = aNullFlag;
    } // end setCreratorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCreratorNameNull() {
        return this.creratorNameNull;
    } // end isCreratorNameNull()

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

        if ((obj instanceof BpmAttachment) == false) {
            return false;
        } // end if

        BpmAttachment other = (BpmAttachment) obj;

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

        buffer.append("createDate=");
        buffer.append(this.createDate);
        buffer.append("\r\n");

        buffer.append("creatorId=");
        buffer.append(this.creatorId);
        buffer.append("\r\n");

        buffer.append("fileName=");
        buffer.append(this.fileName);
        buffer.append("\r\n");

        buffer.append("fileSize=");
        buffer.append(this.fileSize);
        buffer.append("\r\n");

        buffer.append("fileType=");
        buffer.append(this.fileType);
        buffer.append("\r\n");

        buffer.append("processInstanceId=");
        buffer.append(this.processInstanceId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("taskId=");
        buffer.append(this.taskId);
        buffer.append("\r\n");

        buffer.append("attachementUrl=");
        buffer.append(this.attachementUrl);
        buffer.append("\r\n");

        buffer.append("attachementType=");
        buffer.append(this.attachementType);
        buffer.append("\r\n");

        buffer.append("attachmentKey=");
        buffer.append(this.attachmentKey);
        buffer.append("\r\n");

        buffer.append("fileDisplaySize=");
        buffer.append(this.fileDisplaySize);
        buffer.append("\r\n");

        buffer.append("creratorName=");
        buffer.append(this.creratorName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmAttachment
