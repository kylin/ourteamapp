/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

/**
 * Generate Date 2011-09-22 10:18:39
 *
 * @author Auto Gen
 */
public class MeetingContent implements java.io.Serializable {
    /**
     * Creates a new MeetingContent object.
     */
    public MeetingContent() {
        super();
    } // end MeetingContent()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String content;

    /** Attribute  Be Seted Falg */
    private boolean contentSetted = false;

    /** Attribute  is Null Falg */
    private boolean contentNull = false;

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
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String meetingTopic;

    /** Attribute  Be Seted Falg */
    private boolean meetingTopicSetted = false;

    /** Attribute  is Null Falg */
    private boolean meetingTopicNull = false;

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
     * Get Content
     *
     * @return content
     */
    final public String getContent() {
        if (isContentNull()) {
            return null;
        } // end if
        else {
            return content;
        } // end else
    } // end getContent()

    /**
     * Set Content
     *
     * @param aContent
     */
    final public void setContent(String aContent) {
        this.content = aContent;

        this.contentSetted = true;

        this.setContentNull(this.content == null);
    } // end setContent()

    /**
     * Get Content Has Been Setted
     *
     * @return content
     */
    final public boolean isContentSetted() {
        return this.contentSetted;
    } // end isContentSetted()

    /**
     * Set Content Null
     */
    final public void setContentNull() {
        this.contentNull = true;
    } // end setContentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setContentNull(boolean aNullFlag) {
        this.contentNull = aNullFlag;
    } // end setContentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isContentNull() {
        return this.contentNull;
    } // end isContentNull()

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
     * Get MeetingTopic
     *
     * @return meetingTopic
     */
    final public String getMeetingTopic() {
        if (isMeetingTopicNull()) {
            return null;
        } // end if
        else {
            return meetingTopic;
        } // end else
    } // end getMeetingTopic()

    /**
     * Set MeetingTopic
     *
     * @param aMeetingTopic
     */
    final public void setMeetingTopic(String aMeetingTopic) {
        this.meetingTopic = aMeetingTopic;

        this.meetingTopicSetted = true;

        this.setMeetingTopicNull(this.meetingTopic == null);
    } // end setMeetingTopic()

    /**
     * Get MeetingTopic Has Been Setted
     *
     * @return meetingTopic
     */
    final public boolean isMeetingTopicSetted() {
        return this.meetingTopicSetted;
    } // end isMeetingTopicSetted()

    /**
     * Set MeetingTopic Null
     */
    final public void setMeetingTopicNull() {
        this.meetingTopicNull = true;
    } // end setMeetingTopicNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMeetingTopicNull(boolean aNullFlag) {
        this.meetingTopicNull = aNullFlag;
    } // end setMeetingTopicNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMeetingTopicNull() {
        return this.meetingTopicNull;
    } // end isMeetingTopicNull()

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

        if ((obj instanceof MeetingContent) == false) {
            return false;
        } // end if

        MeetingContent other = (MeetingContent) obj;

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

        buffer.append("content=");
        buffer.append(this.content);
        buffer.append("\r\n");

        buffer.append("meetingId=");
        buffer.append(this.meetingId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("meetingTopic=");
        buffer.append(this.meetingTopic);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MeetingContent
