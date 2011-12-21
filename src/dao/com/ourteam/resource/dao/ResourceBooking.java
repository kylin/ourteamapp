/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

/**
 * Generate Date 2011-09-22 10:18:25
 *
 * @author Auto Gen
 */
public class ResourceBooking implements java.io.Serializable {
    /**
     * Creates a new ResourceBooking object.
     */
    public ResourceBooking() {
        super();
    } // end ResourceBooking()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date endTime;

    /** Attribute  Be Seted Falg */
    private boolean endTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean endTimeNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long resourceInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean resourceInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceInstanceIdNull = false;

    /** Attribute */
    private long resourceTypeId;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeIdNull = false;

    /** Attribute */
    private java.util.Date startTime;

    /** Attribute  Be Seted Falg */
    private boolean startTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean startTimeNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String resourceInstanceCode;

    /** Attribute  Be Seted Falg */
    private boolean resourceInstanceCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceInstanceCodeNull = false;

    /** Attribute */
    private String resourceInstanceName;

    /** Attribute  Be Seted Falg */
    private boolean resourceInstanceNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceInstanceNameNull = false;

    /** Attribute */
    private String resourceInstanceStatus;

    /** Attribute  Be Seted Falg */
    private boolean resourceInstanceStatusSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceInstanceStatusNull = false;

    /** Attribute */
    private String resourceTypeCode;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeCodeNull = false;

    /** Attribute */
    private String resourceTypeName;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeNameNull = false;

    /** Attribute */
    private long userId;

    /** Attribute  Be Seted Falg */
    private boolean userIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean userIdNull = false;

    /** Attribute */
    private String userName;

    /** Attribute  Be Seted Falg */
    private boolean userNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean userNameNull = false;

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
     * Get EndTime
     *
     * @return endTime
     */
    final public java.util.Date getEndTime() {
        return endTime;
    } // end getEndTime()

    /**
     * Set EndTime
     *
     * @param aEndTime
     */
    final public void setEndTime(java.util.Date aEndTime) {
        this.endTime = aEndTime;

        this.endTimeSetted = true;

        this.setEndTimeNull(this.endTime == null);
    } // end setEndTime()

    /**
     * Get EndTime Has Been Setted
     *
     * @return endTime
     */
    final public boolean isEndTimeSetted() {
        return this.endTimeSetted;
    } // end isEndTimeSetted()

    /**
     * Set EndTime Null
     */
    final public void setEndTimeNull() {
        this.endTimeNull = true;
    } // end setEndTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEndTimeNull(boolean aNullFlag) {
        this.endTimeNull = aNullFlag;
    } // end setEndTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEndTimeNull() {
        return this.endTimeNull;
    } // end isEndTimeNull()

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
     * Get ResourceInstanceId
     *
     * @return resourceInstanceId
     */
    final public long getResourceInstanceId() {
        return resourceInstanceId;
    } // end getResourceInstanceId()

    /**
     * Set ResourceInstanceId
     *
     * @param aResourceInstanceId
     */
    final public void setResourceInstanceId(long aResourceInstanceId) {
        this.resourceInstanceId = aResourceInstanceId;

        this.resourceInstanceIdSetted = true;

        this.setResourceInstanceIdNull(false);
    } // end setResourceInstanceId()

    /**
     * Get ResourceInstanceId Has Been Setted
     *
     * @return resourceInstanceId
     */
    final public boolean isResourceInstanceIdSetted() {
        return this.resourceInstanceIdSetted;
    } // end isResourceInstanceIdSetted()

    /**
     * Set ResourceInstanceId Null
     */
    final public void setResourceInstanceIdNull() {
        this.resourceInstanceIdNull = true;
    } // end setResourceInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceInstanceIdNull(boolean aNullFlag) {
        this.resourceInstanceIdNull = aNullFlag;
    } // end setResourceInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceInstanceIdNull() {
        return this.resourceInstanceIdNull;
    } // end isResourceInstanceIdNull()

    /**
     * Get ResourceTypeId
     *
     * @return resourceTypeId
     */
    final public long getResourceTypeId() {
        return resourceTypeId;
    } // end getResourceTypeId()

    /**
     * Set ResourceTypeId
     *
     * @param aResourceTypeId
     */
    final public void setResourceTypeId(long aResourceTypeId) {
        this.resourceTypeId = aResourceTypeId;

        this.resourceTypeIdSetted = true;

        this.setResourceTypeIdNull(false);
    } // end setResourceTypeId()

    /**
     * Get ResourceTypeId Has Been Setted
     *
     * @return resourceTypeId
     */
    final public boolean isResourceTypeIdSetted() {
        return this.resourceTypeIdSetted;
    } // end isResourceTypeIdSetted()

    /**
     * Set ResourceTypeId Null
     */
    final public void setResourceTypeIdNull() {
        this.resourceTypeIdNull = true;
    } // end setResourceTypeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeIdNull(boolean aNullFlag) {
        this.resourceTypeIdNull = aNullFlag;
    } // end setResourceTypeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeIdNull() {
        return this.resourceTypeIdNull;
    } // end isResourceTypeIdNull()

    /**
     * Get StartTime
     *
     * @return startTime
     */
    final public java.util.Date getStartTime() {
        return startTime;
    } // end getStartTime()

    /**
     * Set StartTime
     *
     * @param aStartTime
     */
    final public void setStartTime(java.util.Date aStartTime) {
        this.startTime = aStartTime;

        this.startTimeSetted = true;

        this.setStartTimeNull(this.startTime == null);
    } // end setStartTime()

    /**
     * Get StartTime Has Been Setted
     *
     * @return startTime
     */
    final public boolean isStartTimeSetted() {
        return this.startTimeSetted;
    } // end isStartTimeSetted()

    /**
     * Set StartTime Null
     */
    final public void setStartTimeNull() {
        this.startTimeNull = true;
    } // end setStartTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStartTimeNull(boolean aNullFlag) {
        this.startTimeNull = aNullFlag;
    } // end setStartTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStartTimeNull() {
        return this.startTimeNull;
    } // end isStartTimeNull()

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
     * Get ResourceInstanceCode
     *
     * @return resourceInstanceCode
     */
    final public String getResourceInstanceCode() {
        return resourceInstanceCode;
    } // end getResourceInstanceCode()

    /**
     * Set ResourceInstanceCode
     *
     * @param aResourceInstanceCode
     */
    final public void setResourceInstanceCode(String aResourceInstanceCode) {
        this.resourceInstanceCode = aResourceInstanceCode;

        this.resourceInstanceCodeSetted = true;

        this.setResourceInstanceCodeNull(this.resourceInstanceCode == null);
    } // end setResourceInstanceCode()

    /**
     * Get ResourceInstanceCode Has Been Setted
     *
     * @return resourceInstanceCode
     */
    final public boolean isResourceInstanceCodeSetted() {
        return this.resourceInstanceCodeSetted;
    } // end isResourceInstanceCodeSetted()

    /**
     * Set ResourceInstanceCode Null
     */
    final public void setResourceInstanceCodeNull() {
        this.resourceInstanceCodeNull = true;
    } // end setResourceInstanceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceInstanceCodeNull(boolean aNullFlag) {
        this.resourceInstanceCodeNull = aNullFlag;
    } // end setResourceInstanceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceInstanceCodeNull() {
        return this.resourceInstanceCodeNull;
    } // end isResourceInstanceCodeNull()

    /**
     * Get ResourceInstanceName
     *
     * @return resourceInstanceName
     */
    final public String getResourceInstanceName() {
        return resourceInstanceName;
    } // end getResourceInstanceName()

    /**
     * Set ResourceInstanceName
     *
     * @param aResourceInstanceName
     */
    final public void setResourceInstanceName(String aResourceInstanceName) {
        this.resourceInstanceName = aResourceInstanceName;

        this.resourceInstanceNameSetted = true;

        this.setResourceInstanceNameNull(this.resourceInstanceName == null);
    } // end setResourceInstanceName()

    /**
     * Get ResourceInstanceName Has Been Setted
     *
     * @return resourceInstanceName
     */
    final public boolean isResourceInstanceNameSetted() {
        return this.resourceInstanceNameSetted;
    } // end isResourceInstanceNameSetted()

    /**
     * Set ResourceInstanceName Null
     */
    final public void setResourceInstanceNameNull() {
        this.resourceInstanceNameNull = true;
    } // end setResourceInstanceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceInstanceNameNull(boolean aNullFlag) {
        this.resourceInstanceNameNull = aNullFlag;
    } // end setResourceInstanceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceInstanceNameNull() {
        return this.resourceInstanceNameNull;
    } // end isResourceInstanceNameNull()

    /**
     * Get ResourceInstanceStatus
     *
     * @return resourceInstanceStatus
     */
    final public String getResourceInstanceStatus() {
        return resourceInstanceStatus;
    } // end getResourceInstanceStatus()

    /**
     * Set ResourceInstanceStatus
     *
     * @param aResourceInstanceStatus
     */
    final public void setResourceInstanceStatus(String aResourceInstanceStatus) {
        this.resourceInstanceStatus = aResourceInstanceStatus;

        this.resourceInstanceStatusSetted = true;

        this.setResourceInstanceStatusNull(this.resourceInstanceStatus == null);
    } // end setResourceInstanceStatus()

    /**
     * Get ResourceInstanceStatus Has Been Setted
     *
     * @return resourceInstanceStatus
     */
    final public boolean isResourceInstanceStatusSetted() {
        return this.resourceInstanceStatusSetted;
    } // end isResourceInstanceStatusSetted()

    /**
     * Set ResourceInstanceStatus Null
     */
    final public void setResourceInstanceStatusNull() {
        this.resourceInstanceStatusNull = true;
    } // end setResourceInstanceStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceInstanceStatusNull(boolean aNullFlag) {
        this.resourceInstanceStatusNull = aNullFlag;
    } // end setResourceInstanceStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceInstanceStatusNull() {
        return this.resourceInstanceStatusNull;
    } // end isResourceInstanceStatusNull()

    /**
     * Get ResourceTypeCode
     *
     * @return resourceTypeCode
     */
    final public String getResourceTypeCode() {
        return resourceTypeCode;
    } // end getResourceTypeCode()

    /**
     * Set ResourceTypeCode
     *
     * @param aResourceTypeCode
     */
    final public void setResourceTypeCode(String aResourceTypeCode) {
        this.resourceTypeCode = aResourceTypeCode;

        this.resourceTypeCodeSetted = true;

        this.setResourceTypeCodeNull(this.resourceTypeCode == null);
    } // end setResourceTypeCode()

    /**
     * Get ResourceTypeCode Has Been Setted
     *
     * @return resourceTypeCode
     */
    final public boolean isResourceTypeCodeSetted() {
        return this.resourceTypeCodeSetted;
    } // end isResourceTypeCodeSetted()

    /**
     * Set ResourceTypeCode Null
     */
    final public void setResourceTypeCodeNull() {
        this.resourceTypeCodeNull = true;
    } // end setResourceTypeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeCodeNull(boolean aNullFlag) {
        this.resourceTypeCodeNull = aNullFlag;
    } // end setResourceTypeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeCodeNull() {
        return this.resourceTypeCodeNull;
    } // end isResourceTypeCodeNull()

    /**
     * Get ResourceTypeName
     *
     * @return resourceTypeName
     */
    final public String getResourceTypeName() {
        return resourceTypeName;
    } // end getResourceTypeName()

    /**
     * Set ResourceTypeName
     *
     * @param aResourceTypeName
     */
    final public void setResourceTypeName(String aResourceTypeName) {
        this.resourceTypeName = aResourceTypeName;

        this.resourceTypeNameSetted = true;

        this.setResourceTypeNameNull(this.resourceTypeName == null);
    } // end setResourceTypeName()

    /**
     * Get ResourceTypeName Has Been Setted
     *
     * @return resourceTypeName
     */
    final public boolean isResourceTypeNameSetted() {
        return this.resourceTypeNameSetted;
    } // end isResourceTypeNameSetted()

    /**
     * Set ResourceTypeName Null
     */
    final public void setResourceTypeNameNull() {
        this.resourceTypeNameNull = true;
    } // end setResourceTypeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeNameNull(boolean aNullFlag) {
        this.resourceTypeNameNull = aNullFlag;
    } // end setResourceTypeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeNameNull() {
        return this.resourceTypeNameNull;
    } // end isResourceTypeNameNull()

    /**
     * Get UserId
     *
     * @return userId
     */
    final public long getUserId() {
        return userId;
    } // end getUserId()

    /**
     * Set UserId
     *
     * @param aUserId
     */
    final public void setUserId(long aUserId) {
        this.userId = aUserId;

        this.userIdSetted = true;

        this.setUserIdNull(false);
    } // end setUserId()

    /**
     * Get UserId Has Been Setted
     *
     * @return userId
     */
    final public boolean isUserIdSetted() {
        return this.userIdSetted;
    } // end isUserIdSetted()

    /**
     * Set UserId Null
     */
    final public void setUserIdNull() {
        this.userIdNull = true;
    } // end setUserIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUserIdNull(boolean aNullFlag) {
        this.userIdNull = aNullFlag;
    } // end setUserIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUserIdNull() {
        return this.userIdNull;
    } // end isUserIdNull()

    /**
     * Get UserName
     *
     * @return userName
     */
    final public String getUserName() {
        return userName;
    } // end getUserName()

    /**
     * Set UserName
     *
     * @param aUserName
     */
    final public void setUserName(String aUserName) {
        this.userName = aUserName;

        this.userNameSetted = true;

        this.setUserNameNull(this.userName == null);
    } // end setUserName()

    /**
     * Get UserName Has Been Setted
     *
     * @return userName
     */
    final public boolean isUserNameSetted() {
        return this.userNameSetted;
    } // end isUserNameSetted()

    /**
     * Set UserName Null
     */
    final public void setUserNameNull() {
        this.userNameNull = true;
    } // end setUserNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUserNameNull(boolean aNullFlag) {
        this.userNameNull = aNullFlag;
    } // end setUserNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUserNameNull() {
        return this.userNameNull;
    } // end isUserNameNull()

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

        if ((obj instanceof ResourceBooking) == false) {
            return false;
        } // end if

        ResourceBooking other = (ResourceBooking) obj;

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

        buffer.append("endTime=");
        buffer.append(this.endTime);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("resourceInstanceId=");
        buffer.append(this.resourceInstanceId);
        buffer.append("\r\n");

        buffer.append("resourceTypeId=");
        buffer.append(this.resourceTypeId);
        buffer.append("\r\n");

        buffer.append("startTime=");
        buffer.append(this.startTime);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("resourceInstanceCode=");
        buffer.append(this.resourceInstanceCode);
        buffer.append("\r\n");

        buffer.append("resourceInstanceName=");
        buffer.append(this.resourceInstanceName);
        buffer.append("\r\n");

        buffer.append("resourceInstanceStatus=");
        buffer.append(this.resourceInstanceStatus);
        buffer.append("\r\n");

        buffer.append("resourceTypeCode=");
        buffer.append(this.resourceTypeCode);
        buffer.append("\r\n");

        buffer.append("resourceTypeName=");
        buffer.append(this.resourceTypeName);
        buffer.append("\r\n");

        buffer.append("userId=");
        buffer.append(this.userId);
        buffer.append("\r\n");

        buffer.append("userName=");
        buffer.append(this.userName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ResourceBooking
