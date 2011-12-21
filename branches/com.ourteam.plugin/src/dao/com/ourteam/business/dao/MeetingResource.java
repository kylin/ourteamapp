/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

/**
 * Generate Date 2011-09-22 10:18:40
 *
 * @author Auto Gen
 */
public class MeetingResource implements java.io.Serializable {
    /**
     * Creates a new MeetingResource object.
     */
    public MeetingResource() {
        super();
    } // end MeetingResource()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long meetingId;

    /** Attribute  Be Seted Falg */
    private boolean meetingIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean meetingIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long resourceId;

    /** Attribute  Be Seted Falg */
    private boolean resourceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String resourceCode;

    /** Attribute  Be Seted Falg */
    private boolean resourceCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceCodeNull = false;

    /** Attribute */
    private String resourceName;

    /** Attribute  Be Seted Falg */
    private boolean resourceNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceNameNull = false;

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
     * Get MeetingId
     *
     * @return meetingId
     */
    final public long getMeetingId() {
        return meetingId;
    } // end getMeetingId()

    /**
     * Set MeetingId
     *
     * @param aMeetingId
     */
    final public void setMeetingId(long aMeetingId) {
        this.meetingId = aMeetingId;

        this.meetingIdSetted = true;

        this.setMeetingIdNull(false);
    } // end setMeetingId()

    /**
     * Get MeetingId Has Been Setted
     *
     * @return meetingId
     */
    final public boolean isMeetingIdSetted() {
        return this.meetingIdSetted;
    } // end isMeetingIdSetted()

    /**
     * Set MeetingId Null
     */
    final public void setMeetingIdNull() {
        this.meetingIdNull = true;
    } // end setMeetingIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMeetingIdNull(boolean aNullFlag) {
        this.meetingIdNull = aNullFlag;
    } // end setMeetingIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMeetingIdNull() {
        return this.meetingIdNull;
    } // end isMeetingIdNull()

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
     * Get ResourceId
     *
     * @return resourceId
     */
    final public long getResourceId() {
        return resourceId;
    } // end getResourceId()

    /**
     * Set ResourceId
     *
     * @param aResourceId
     */
    final public void setResourceId(long aResourceId) {
        this.resourceId = aResourceId;

        this.resourceIdSetted = true;

        this.setResourceIdNull(false);
    } // end setResourceId()

    /**
     * Get ResourceId Has Been Setted
     *
     * @return resourceId
     */
    final public boolean isResourceIdSetted() {
        return this.resourceIdSetted;
    } // end isResourceIdSetted()

    /**
     * Set ResourceId Null
     */
    final public void setResourceIdNull() {
        this.resourceIdNull = true;
    } // end setResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceIdNull(boolean aNullFlag) {
        this.resourceIdNull = aNullFlag;
    } // end setResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceIdNull() {
        return this.resourceIdNull;
    } // end isResourceIdNull()

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
     * Get ResourceCode
     *
     * @return resourceCode
     */
    final public String getResourceCode() {
        return resourceCode;
    } // end getResourceCode()

    /**
     * Set ResourceCode
     *
     * @param aResourceCode
     */
    final public void setResourceCode(String aResourceCode) {
        this.resourceCode = aResourceCode;

        this.resourceCodeSetted = true;

        this.setResourceCodeNull(this.resourceCode == null);
    } // end setResourceCode()

    /**
     * Get ResourceCode Has Been Setted
     *
     * @return resourceCode
     */
    final public boolean isResourceCodeSetted() {
        return this.resourceCodeSetted;
    } // end isResourceCodeSetted()

    /**
     * Set ResourceCode Null
     */
    final public void setResourceCodeNull() {
        this.resourceCodeNull = true;
    } // end setResourceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceCodeNull(boolean aNullFlag) {
        this.resourceCodeNull = aNullFlag;
    } // end setResourceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceCodeNull() {
        return this.resourceCodeNull;
    } // end isResourceCodeNull()

    /**
     * Get ResourceName
     *
     * @return resourceName
     */
    final public String getResourceName() {
        return resourceName;
    } // end getResourceName()

    /**
     * Set ResourceName
     *
     * @param aResourceName
     */
    final public void setResourceName(String aResourceName) {
        this.resourceName = aResourceName;

        this.resourceNameSetted = true;

        this.setResourceNameNull(this.resourceName == null);
    } // end setResourceName()

    /**
     * Get ResourceName Has Been Setted
     *
     * @return resourceName
     */
    final public boolean isResourceNameSetted() {
        return this.resourceNameSetted;
    } // end isResourceNameSetted()

    /**
     * Set ResourceName Null
     */
    final public void setResourceNameNull() {
        this.resourceNameNull = true;
    } // end setResourceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceNameNull(boolean aNullFlag) {
        this.resourceNameNull = aNullFlag;
    } // end setResourceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceNameNull() {
        return this.resourceNameNull;
    } // end isResourceNameNull()

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

        if ((obj instanceof MeetingResource) == false) {
            return false;
        } // end if

        MeetingResource other = (MeetingResource) obj;

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

        buffer.append("meetingId=");
        buffer.append(this.meetingId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("resourceId=");
        buffer.append(this.resourceId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("resourceCode=");
        buffer.append(this.resourceCode);
        buffer.append("\r\n");

        buffer.append("resourceName=");
        buffer.append(this.resourceName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MeetingResource
