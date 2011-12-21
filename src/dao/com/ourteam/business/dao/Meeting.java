/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

/**
 * Generate Date 2011-09-22 10:18:38
 *
 * @author Auto Gen
 */
public class Meeting implements java.io.Serializable {
    /**
     * Creates a new Meeting object.
     */
    public Meeting() {
        super();
    } // end Meeting()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date endDate;

    /** Attribute  Be Seted Falg */
    private boolean endDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean endDateNull = false;

    /** Attribute */
    private long ownerId;

    /** Attribute  Be Seted Falg */
    private boolean ownerIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean ownerIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

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
    private String tags;

    /** Attribute  Be Seted Falg */
    private boolean tagsSetted = false;

    /** Attribute  is Null Falg */
    private boolean tagsNull = false;

    /** Attribute */
    private String topic;

    /** Attribute  Be Seted Falg */
    private boolean topicSetted = false;

    /** Attribute  is Null Falg */
    private boolean topicNull = false;

    /** Attribute */
    private String type;

    /** Attribute  Be Seted Falg */
    private boolean typeSetted = false;

    /** Attribute  is Null Falg */
    private boolean typeNull = false;

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
     * Get EndDate
     *
     * @return endDate
     */
    final public java.util.Date getEndDate() {
        return endDate;
    } // end getEndDate()

    /**
     * Set EndDate
     *
     * @param aEndDate
     */
    final public void setEndDate(java.util.Date aEndDate) {
        this.endDate = aEndDate;

        this.endDateSetted = true;

        this.setEndDateNull(this.endDate == null);
    } // end setEndDate()

    /**
     * Get EndDate Has Been Setted
     *
     * @return endDate
     */
    final public boolean isEndDateSetted() {
        return this.endDateSetted;
    } // end isEndDateSetted()

    /**
     * Set EndDate Null
     */
    final public void setEndDateNull() {
        this.endDateNull = true;
    } // end setEndDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEndDateNull(boolean aNullFlag) {
        this.endDateNull = aNullFlag;
    } // end setEndDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEndDateNull() {
        return this.endDateNull;
    } // end isEndDateNull()

    /**
     * Get OwnerId
     *
     * @return ownerId
     */
    final public long getOwnerId() {
        return ownerId;
    } // end getOwnerId()

    /**
     * Set OwnerId
     *
     * @param aOwnerId
     */
    final public void setOwnerId(long aOwnerId) {
        this.ownerId = aOwnerId;

        this.ownerIdSetted = true;

        this.setOwnerIdNull(false);
    } // end setOwnerId()

    /**
     * Get OwnerId Has Been Setted
     *
     * @return ownerId
     */
    final public boolean isOwnerIdSetted() {
        return this.ownerIdSetted;
    } // end isOwnerIdSetted()

    /**
     * Set OwnerId Null
     */
    final public void setOwnerIdNull() {
        this.ownerIdNull = true;
    } // end setOwnerIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOwnerIdNull(boolean aNullFlag) {
        this.ownerIdNull = aNullFlag;
    } // end setOwnerIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOwnerIdNull() {
        return this.ownerIdNull;
    } // end isOwnerIdNull()

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
     * Get Tags
     *
     * @return tags
     */
    final public String getTags() {
        if (isTagsNull()) {
            return null;
        } // end if
        else {
            return tags;
        } // end else
    } // end getTags()

    /**
     * Set Tags
     *
     * @param aTags
     */
    final public void setTags(String aTags) {
        this.tags = aTags;

        this.tagsSetted = true;

        this.setTagsNull(this.tags == null);
    } // end setTags()

    /**
     * Get Tags Has Been Setted
     *
     * @return tags
     */
    final public boolean isTagsSetted() {
        return this.tagsSetted;
    } // end isTagsSetted()

    /**
     * Set Tags Null
     */
    final public void setTagsNull() {
        this.tagsNull = true;
    } // end setTagsNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTagsNull(boolean aNullFlag) {
        this.tagsNull = aNullFlag;
    } // end setTagsNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTagsNull() {
        return this.tagsNull;
    } // end isTagsNull()

    /**
     * Get Topic
     *
     * @return topic
     */
    final public String getTopic() {
        if (isTopicNull()) {
            return null;
        } // end if
        else {
            return topic;
        } // end else
    } // end getTopic()

    /**
     * Set Topic
     *
     * @param aTopic
     */
    final public void setTopic(String aTopic) {
        this.topic = aTopic;

        this.topicSetted = true;

        this.setTopicNull(this.topic == null);
    } // end setTopic()

    /**
     * Get Topic Has Been Setted
     *
     * @return topic
     */
    final public boolean isTopicSetted() {
        return this.topicSetted;
    } // end isTopicSetted()

    /**
     * Set Topic Null
     */
    final public void setTopicNull() {
        this.topicNull = true;
    } // end setTopicNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTopicNull(boolean aNullFlag) {
        this.topicNull = aNullFlag;
    } // end setTopicNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTopicNull() {
        return this.topicNull;
    } // end isTopicNull()

    /**
     * Get Type
     *
     * @return type
     */
    final public String getType() {
        return type;
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    final public void setType(String aType) {
        this.type = aType;

        this.typeSetted = true;

        this.setTypeNull(this.type == null);
    } // end setType()

    /**
     * Get Type Has Been Setted
     *
     * @return type
     */
    final public boolean isTypeSetted() {
        return this.typeSetted;
    } // end isTypeSetted()

    /**
     * Set Type Null
     */
    final public void setTypeNull() {
        this.typeNull = true;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTypeNull(boolean aNullFlag) {
        this.typeNull = aNullFlag;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTypeNull() {
        return this.typeNull;
    } // end isTypeNull()

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

        if ((obj instanceof Meeting) == false) {
            return false;
        } // end if

        Meeting other = (Meeting) obj;

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

        buffer.append("endDate=");
        buffer.append(this.endDate);
        buffer.append("\r\n");

        buffer.append("ownerId=");
        buffer.append(this.ownerId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("startDate=");
        buffer.append(this.startDate);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("tags=");
        buffer.append(this.tags);
        buffer.append("\r\n");

        buffer.append("topic=");
        buffer.append(this.topic);
        buffer.append("\r\n");

        buffer.append("type=");
        buffer.append(this.type);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end Meeting
