/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:29
 *
 * @model auto gen
 */
public class MeetingBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.business.dao.Meeting objMeeting;

    static {
        mappedDaoFields.put("id", com.ourteam.business.dao.IMeetingDAO.Id);

        mappedDaoFields.put("endDate",
            com.ourteam.business.dao.IMeetingDAO.EndDate);

        mappedDaoFields.put("ownerId",
            com.ourteam.business.dao.IMeetingDAO.OwnerId);

        mappedDaoFields.put("remarks",
            com.ourteam.business.dao.IMeetingDAO.Remarks);

        mappedDaoFields.put("startDate",
            com.ourteam.business.dao.IMeetingDAO.StartDate);

        mappedDaoFields.put("status",
            com.ourteam.business.dao.IMeetingDAO.Status);

        mappedDaoFields.put("tags", com.ourteam.business.dao.IMeetingDAO.Tags);

        mappedDaoFields.put("topic", com.ourteam.business.dao.IMeetingDAO.Topic);

        mappedDaoFields.put("type", com.ourteam.business.dao.IMeetingDAO.Type);
    } 

    /**
     * Creates a new MeetingBean object.
     */
    public MeetingBean() {
        super();

        objMeeting = new com.ourteam.business.dao.Meeting();
    } // end MeetingBean()

    /**
     * Creates a new MeetingBean object.
     *
     * @param aMeeting DOCUMENT ME!
     */
    public MeetingBean(com.ourteam.business.dao.Meeting aMeeting) {
        super();

        objMeeting = aMeeting;
    } // end MeetingBean()

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
    public com.ourteam.business.dao.Meeting convertToMeeting() {
        return objMeeting;
    } // end convertToMeeting()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMeeting.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMeeting.setId(aId);
    } // end setId()

    /**
     * Get EndDate
     *
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return objMeeting.getEndDate();
    } // end getEndDate()

    /**
     * Set EndDate
     *
     * @param aEndDate
     */
    public void setEndDate(java.util.Date aEndDate) {
        this.objMeeting.setEndDate(aEndDate);
    } // end setEndDate()

    /**
     * Get OwnerId
     *
     * @return ownerId
     */
    public long getOwnerId() {
        return objMeeting.getOwnerId();
    } // end getOwnerId()

    /**
     * Set OwnerId
     *
     * @param aOwnerId
     */
    public void setOwnerId(long aOwnerId) {
        this.objMeeting.setOwnerId(aOwnerId);
    } // end setOwnerId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMeeting.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMeeting.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get StartDate
     *
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return objMeeting.getStartDate();
    } // end getStartDate()

    /**
     * Set StartDate
     *
     * @param aStartDate
     */
    public void setStartDate(java.util.Date aStartDate) {
        this.objMeeting.setStartDate(aStartDate);
    } // end setStartDate()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMeeting.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMeeting.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Tags
     *
     * @return tags
     */
    public String getTags() {
        return objMeeting.getTags();
    } // end getTags()

    /**
     * Set Tags
     *
     * @param aTags
     */
    public void setTags(String aTags) {
        this.objMeeting.setTags(aTags);
    } // end setTags()

    /**
     * Get Topic
     *
     * @return topic
     */
    public String getTopic() {
        return objMeeting.getTopic();
    } // end getTopic()

    /**
     * Set Topic
     *
     * @param aTopic
     */
    public void setTopic(String aTopic) {
        this.objMeeting.setTopic(aTopic);
    } // end setTopic()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objMeeting.getType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objMeeting.setType(aType);
    } // end setType()

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

        if ((obj instanceof MeetingBean) == false) {
            return false;
        } // end if

        MeetingBean other = (MeetingBean) obj;

        boolean isEqual = false;

        com.ourteam.business.dao.Meeting tempMeeting = other.convertToMeeting();

        if ((tempMeeting == null) || (this.objMeeting == null)) {
            isEqual = false;
        } // end if
        else if ((tempMeeting == this.objMeeting) ||
                tempMeeting.equals(this.objMeeting)) {
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
     * @param aMeetings DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MeetingBean[] toArray(
        com.ourteam.business.dao.Meeting[] aMeetings) {
        return toArray(aMeetings, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetings DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MeetingBean[] toArray(
        com.ourteam.business.dao.Meeting[] aMeetings,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMeetings)) {
            return new MeetingBean[0];
        } // end if

        int length = aMeetings.length;

        MeetingBean[] beans = new MeetingBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MeetingBean(aMeetings[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MeetingBean(aMeetings[i]);

                aCallBack.populate(beans[i], new Object[] { aMeetings[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MeetingBean
