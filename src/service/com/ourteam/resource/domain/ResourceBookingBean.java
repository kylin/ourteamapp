/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:20
 *
 * @model auto gen
 */
public class ResourceBookingBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.resource.dao.ResourceBooking objResourceBooking;

    static {
        mappedDaoFields.put("id",
            com.ourteam.resource.dao.IResourceBookingDAO.Id);

        mappedDaoFields.put("endTime",
            com.ourteam.resource.dao.IResourceBookingDAO.EndTime);

        mappedDaoFields.put("remarks",
            com.ourteam.resource.dao.IResourceBookingDAO.Remarks);

        mappedDaoFields.put("resourceInstanceId",
            com.ourteam.resource.dao.IResourceBookingDAO.ResourceInstanceId);

        mappedDaoFields.put("resourceTypeId",
            com.ourteam.resource.dao.IResourceBookingDAO.ResourceTypeId);

        mappedDaoFields.put("startTime",
            com.ourteam.resource.dao.IResourceBookingDAO.StartTime);

        mappedDaoFields.put("status",
            com.ourteam.resource.dao.IResourceBookingDAO.Status);

        mappedDaoFields.put("resourceInstanceCode",
            com.ourteam.resource.dao.IResourceBookingDAO.ResourceInstanceCode);

        mappedDaoFields.put("resourceInstanceName",
            com.ourteam.resource.dao.IResourceBookingDAO.ResourceInstanceName);

        mappedDaoFields.put("resourceInstanceStatus",
            com.ourteam.resource.dao.IResourceBookingDAO.ResourceInstanceStatus);

        mappedDaoFields.put("resourceTypeCode",
            com.ourteam.resource.dao.IResourceBookingDAO.ResourceTypeCode);

        mappedDaoFields.put("resourceTypeName",
            com.ourteam.resource.dao.IResourceBookingDAO.ResourceTypeName);

        mappedDaoFields.put("userId",
            com.ourteam.resource.dao.IResourceBookingDAO.UserId);

        mappedDaoFields.put("userName",
            com.ourteam.resource.dao.IResourceBookingDAO.UserName);
    } 

    /**
     * Creates a new ResourceBookingBean object.
     */
    public ResourceBookingBean() {
        super();

        objResourceBooking = new com.ourteam.resource.dao.ResourceBooking();
    } // end ResourceBookingBean()

    /**
     * Creates a new ResourceBookingBean object.
     *
     * @param aResourceBooking DOCUMENT ME!
     */
    public ResourceBookingBean(
        com.ourteam.resource.dao.ResourceBooking aResourceBooking) {
        super();

        objResourceBooking = aResourceBooking;
    } // end ResourceBookingBean()

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
    public com.ourteam.resource.dao.ResourceBooking convertToResourceBooking() {
        return objResourceBooking;
    } // end convertToResourceBooking()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objResourceBooking.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objResourceBooking.setId(aId);
    } // end setId()

    /**
     * Get EndTime
     *
     * @return endTime
     */
    public java.util.Date getEndTime() {
        return objResourceBooking.getEndTime();
    } // end getEndTime()

    /**
     * Set EndTime
     *
     * @param aEndTime
     */
    public void setEndTime(java.util.Date aEndTime) {
        this.objResourceBooking.setEndTime(aEndTime);
    } // end setEndTime()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objResourceBooking.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objResourceBooking.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ResourceInstanceId
     *
     * @return resourceInstanceId
     */
    public long getResourceInstanceId() {
        return objResourceBooking.getResourceInstanceId();
    } // end getResourceInstanceId()

    /**
     * Set ResourceInstanceId
     *
     * @param aResourceInstanceId
     */
    public void setResourceInstanceId(long aResourceInstanceId) {
        this.objResourceBooking.setResourceInstanceId(aResourceInstanceId);
    } // end setResourceInstanceId()

    /**
     * Get ResourceTypeId
     *
     * @return resourceTypeId
     */
    public long getResourceTypeId() {
        return objResourceBooking.getResourceTypeId();
    } // end getResourceTypeId()

    /**
     * Set ResourceTypeId
     *
     * @param aResourceTypeId
     */
    public void setResourceTypeId(long aResourceTypeId) {
        this.objResourceBooking.setResourceTypeId(aResourceTypeId);
    } // end setResourceTypeId()

    /**
     * Get StartTime
     *
     * @return startTime
     */
    public java.util.Date getStartTime() {
        return objResourceBooking.getStartTime();
    } // end getStartTime()

    /**
     * Set StartTime
     *
     * @param aStartTime
     */
    public void setStartTime(java.util.Date aStartTime) {
        this.objResourceBooking.setStartTime(aStartTime);
    } // end setStartTime()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objResourceBooking.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objResourceBooking.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ResourceInstanceCode
     *
     * @return resourceInstanceCode
     */
    public String getResourceInstanceCode() {
        return objResourceBooking.getResourceInstanceCode();
    } // end getResourceInstanceCode()

    /**
     * Set ResourceInstanceCode
     *
     * @param aResourceInstanceCode
     */
    public void setResourceInstanceCode(String aResourceInstanceCode) {
        this.objResourceBooking.setResourceInstanceCode(aResourceInstanceCode);
    } // end setResourceInstanceCode()

    /**
     * Get ResourceInstanceName
     *
     * @return resourceInstanceName
     */
    public String getResourceInstanceName() {
        return objResourceBooking.getResourceInstanceName();
    } // end getResourceInstanceName()

    /**
     * Set ResourceInstanceName
     *
     * @param aResourceInstanceName
     */
    public void setResourceInstanceName(String aResourceInstanceName) {
        this.objResourceBooking.setResourceInstanceName(aResourceInstanceName);
    } // end setResourceInstanceName()

    /**
     * Get ResourceInstanceStatus
     *
     * @return resourceInstanceStatus
     */
    public String getResourceInstanceStatus() {
        return objResourceBooking.getResourceInstanceStatus();
    } // end getResourceInstanceStatus()

    /**
     * Set ResourceInstanceStatus
     *
     * @param aResourceInstanceStatus
     */
    public void setResourceInstanceStatus(String aResourceInstanceStatus) {
        this.objResourceBooking.setResourceInstanceStatus(aResourceInstanceStatus);
    } // end setResourceInstanceStatus()

    /**
     * Get ResourceTypeCode
     *
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return objResourceBooking.getResourceTypeCode();
    } // end getResourceTypeCode()

    /**
     * Set ResourceTypeCode
     *
     * @param aResourceTypeCode
     */
    public void setResourceTypeCode(String aResourceTypeCode) {
        this.objResourceBooking.setResourceTypeCode(aResourceTypeCode);
    } // end setResourceTypeCode()

    /**
     * Get ResourceTypeName
     *
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return objResourceBooking.getResourceTypeName();
    } // end getResourceTypeName()

    /**
     * Set ResourceTypeName
     *
     * @param aResourceTypeName
     */
    public void setResourceTypeName(String aResourceTypeName) {
        this.objResourceBooking.setResourceTypeName(aResourceTypeName);
    } // end setResourceTypeName()

    /**
     * Get UserId
     *
     * @return userId
     */
    public long getUserId() {
        return objResourceBooking.getUserId();
    } // end getUserId()

    /**
     * Get UserName
     *
     * @return userName
     */
    public String getUserName() {
        return objResourceBooking.getUserName();
    } // end getUserName()

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

        if ((obj instanceof ResourceBookingBean) == false) {
            return false;
        } // end if

        ResourceBookingBean other = (ResourceBookingBean) obj;

        boolean isEqual = false;

        com.ourteam.resource.dao.ResourceBooking tempResourceBooking = other.convertToResourceBooking();

        if ((tempResourceBooking == null) || (this.objResourceBooking == null)) {
            isEqual = false;
        } // end if
        else if ((tempResourceBooking == this.objResourceBooking) ||
                tempResourceBooking.equals(this.objResourceBooking)) {
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
     * @param aResourceBookings DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourceBookingBean[] toArray(
        com.ourteam.resource.dao.ResourceBooking[] aResourceBookings) {
        return toArray(aResourceBookings, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceBookings DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ResourceBookingBean[] toArray(
        com.ourteam.resource.dao.ResourceBooking[] aResourceBookings,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aResourceBookings)) {
            return new ResourceBookingBean[0];
        } // end if

        int length = aResourceBookings.length;

        ResourceBookingBean[] beans = new ResourceBookingBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourceBookingBean(aResourceBookings[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ResourceBookingBean(aResourceBookings[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aResourceBookings[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ResourceBookingBean
