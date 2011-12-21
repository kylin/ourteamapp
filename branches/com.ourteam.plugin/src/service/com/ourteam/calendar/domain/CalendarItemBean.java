/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:10
 *
 * @model auto gen
 */
public class CalendarItemBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.calendar.dao.CalendarItem objCalendarItem;

    static {
        mappedDaoFields.put("id", com.ourteam.calendar.dao.ICalendarItemDAO.Id);

        mappedDaoFields.put("alermConfig",
            com.ourteam.calendar.dao.ICalendarItemDAO.AlermConfig);

        mappedDaoFields.put("calendarId",
            com.ourteam.calendar.dao.ICalendarItemDAO.CalendarId);

        mappedDaoFields.put("endDateTime",
            com.ourteam.calendar.dao.ICalendarItemDAO.EndDateTime);

        mappedDaoFields.put("fullDateItem",
            com.ourteam.calendar.dao.ICalendarItemDAO.FullDateItem);

        mappedDaoFields.put("itemAttchment",
            com.ourteam.calendar.dao.ICalendarItemDAO.ItemAttchment);

        mappedDaoFields.put("itemContent",
            com.ourteam.calendar.dao.ICalendarItemDAO.ItemContent);

        mappedDaoFields.put("itemLocaltion",
            com.ourteam.calendar.dao.ICalendarItemDAO.ItemLocaltion);

        mappedDaoFields.put("itemTitle",
            com.ourteam.calendar.dao.ICalendarItemDAO.ItemTitle);

        mappedDaoFields.put("protectedType",
            com.ourteam.calendar.dao.ICalendarItemDAO.ProtectedType);

        mappedDaoFields.put("remarks",
            com.ourteam.calendar.dao.ICalendarItemDAO.Remarks);

        mappedDaoFields.put("repeateConfig",
            com.ourteam.calendar.dao.ICalendarItemDAO.RepeateConfig);

        mappedDaoFields.put("startDateTime",
            com.ourteam.calendar.dao.ICalendarItemDAO.StartDateTime);

        mappedDaoFields.put("status",
            com.ourteam.calendar.dao.ICalendarItemDAO.Status);

        mappedDaoFields.put("calendarName",
            com.ourteam.calendar.dao.ICalendarItemDAO.CalendarName);

        mappedDaoFields.put("calendarType",
            com.ourteam.calendar.dao.ICalendarItemDAO.CalendarType);

        mappedDaoFields.put("calendarStyle",
            com.ourteam.calendar.dao.ICalendarItemDAO.CalendarStyle);

        mappedDaoFields.put("ownerId",
            com.ourteam.calendar.dao.ICalendarItemDAO.OwnerId);
    } 

    /**
     * Creates a new CalendarItemBean object.
     */
    public CalendarItemBean() {
        super();

        objCalendarItem = new com.ourteam.calendar.dao.CalendarItem();
    } // end CalendarItemBean()

    /**
     * Creates a new CalendarItemBean object.
     *
     * @param aCalendarItem DOCUMENT ME!
     */
    public CalendarItemBean(com.ourteam.calendar.dao.CalendarItem aCalendarItem) {
        super();

        objCalendarItem = aCalendarItem;
    } // end CalendarItemBean()

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
    public com.ourteam.calendar.dao.CalendarItem convertToCalendarItem() {
        return objCalendarItem;
    } // end convertToCalendarItem()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objCalendarItem.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objCalendarItem.setId(aId);
    } // end setId()

    /**
     * Get AlermConfig
     *
     * @return alermConfig
     */
    public String getAlermConfig() {
        return objCalendarItem.getAlermConfig();
    } // end getAlermConfig()

    /**
     * Set AlermConfig
     *
     * @param aAlermConfig
     */
    public void setAlermConfig(String aAlermConfig) {
        this.objCalendarItem.setAlermConfig(aAlermConfig);
    } // end setAlermConfig()

    /**
     * Get CalendarId
     *
     * @return calendarId
     */
    public long getCalendarId() {
        return objCalendarItem.getCalendarId();
    } // end getCalendarId()

    /**
     * Set CalendarId
     *
     * @param aCalendarId
     */
    public void setCalendarId(long aCalendarId) {
        this.objCalendarItem.setCalendarId(aCalendarId);
    } // end setCalendarId()

    /**
     * Get EndDateTime
     *
     * @return endDateTime
     */
    public java.util.Date getEndDateTime() {
        return objCalendarItem.getEndDateTime();
    } // end getEndDateTime()

    /**
     * Set EndDateTime
     *
     * @param aEndDateTime
     */
    public void setEndDateTime(java.util.Date aEndDateTime) {
        this.objCalendarItem.setEndDateTime(aEndDateTime);
    } // end setEndDateTime()

    /**
     * Get FullDateItem
     *
     * @return fullDateItem
     */
    public String getFullDateItem() {
        return objCalendarItem.getFullDateItem();
    } // end getFullDateItem()

    /**
     * Set FullDateItem
     *
     * @param aFullDateItem
     */
    public void setFullDateItem(String aFullDateItem) {
        this.objCalendarItem.setFullDateItem(aFullDateItem);
    } // end setFullDateItem()

    /**
     * Get ItemAttchment
     *
     * @return itemAttchment
     */
    public String getItemAttchment() {
        return objCalendarItem.getItemAttchment();
    } // end getItemAttchment()

    /**
     * Set ItemAttchment
     *
     * @param aItemAttchment
     */
    public void setItemAttchment(String aItemAttchment) {
        this.objCalendarItem.setItemAttchment(aItemAttchment);
    } // end setItemAttchment()

    /**
     * Get ItemContent
     *
     * @return itemContent
     */
    public String getItemContent() {
        return objCalendarItem.getItemContent();
    } // end getItemContent()

    /**
     * Set ItemContent
     *
     * @param aItemContent
     */
    public void setItemContent(String aItemContent) {
        this.objCalendarItem.setItemContent(aItemContent);
    } // end setItemContent()

    /**
     * Get ItemLocaltion
     *
     * @return itemLocaltion
     */
    public String getItemLocaltion() {
        return objCalendarItem.getItemLocaltion();
    } // end getItemLocaltion()

    /**
     * Set ItemLocaltion
     *
     * @param aItemLocaltion
     */
    public void setItemLocaltion(String aItemLocaltion) {
        this.objCalendarItem.setItemLocaltion(aItemLocaltion);
    } // end setItemLocaltion()

    /**
     * Get ItemTitle
     *
     * @return itemTitle
     */
    public String getItemTitle() {
        return objCalendarItem.getItemTitle();
    } // end getItemTitle()

    /**
     * Set ItemTitle
     *
     * @param aItemTitle
     */
    public void setItemTitle(String aItemTitle) {
        this.objCalendarItem.setItemTitle(aItemTitle);
    } // end setItemTitle()

    /**
     * Get ProtectedType
     *
     * @return protectedType
     */
    public String getProtectedType() {
        return objCalendarItem.getProtectedType();
    } // end getProtectedType()

    /**
     * Set ProtectedType
     *
     * @param aProtectedType
     */
    public void setProtectedType(String aProtectedType) {
        this.objCalendarItem.setProtectedType(aProtectedType);
    } // end setProtectedType()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objCalendarItem.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objCalendarItem.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get RepeateConfig
     *
     * @return repeateConfig
     */
    public String getRepeateConfig() {
        return objCalendarItem.getRepeateConfig();
    } // end getRepeateConfig()

    /**
     * Set RepeateConfig
     *
     * @param aRepeateConfig
     */
    public void setRepeateConfig(String aRepeateConfig) {
        this.objCalendarItem.setRepeateConfig(aRepeateConfig);
    } // end setRepeateConfig()

    /**
     * Get StartDateTime
     *
     * @return startDateTime
     */
    public java.util.Date getStartDateTime() {
        return objCalendarItem.getStartDateTime();
    } // end getStartDateTime()

    /**
     * Set StartDateTime
     *
     * @param aStartDateTime
     */
    public void setStartDateTime(java.util.Date aStartDateTime) {
        this.objCalendarItem.setStartDateTime(aStartDateTime);
    } // end setStartDateTime()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objCalendarItem.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objCalendarItem.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get CalendarName
     *
     * @return calendarName
     */
    public String getCalendarName() {
        return objCalendarItem.getCalendarName();
    } // end getCalendarName()

    /**
     * Get CalendarType
     *
     * @return calendarType
     */
    public String getCalendarType() {
        return objCalendarItem.getCalendarType();
    } // end getCalendarType()

    /**
     * Get CalendarStyle
     *
     * @return calendarStyle
     */
    public String getCalendarStyle() {
        return objCalendarItem.getCalendarStyle();
    } // end getCalendarStyle()

    /**
     * Get OwnerId
     *
     * @return ownerId
     */
    public long getOwnerId() {
        return objCalendarItem.getOwnerId();
    } // end getOwnerId()

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

        if ((obj instanceof CalendarItemBean) == false) {
            return false;
        } // end if

        CalendarItemBean other = (CalendarItemBean) obj;

        boolean isEqual = false;

        com.ourteam.calendar.dao.CalendarItem tempCalendarItem = other.convertToCalendarItem();

        if ((tempCalendarItem == null) || (this.objCalendarItem == null)) {
            isEqual = false;
        } // end if
        else if ((tempCalendarItem == this.objCalendarItem) ||
                tempCalendarItem.equals(this.objCalendarItem)) {
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
     * @param aCalendarItems DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static CalendarItemBean[] toArray(
        com.ourteam.calendar.dao.CalendarItem[] aCalendarItems) {
        return toArray(aCalendarItems, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarItems DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static CalendarItemBean[] toArray(
        com.ourteam.calendar.dao.CalendarItem[] aCalendarItems,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aCalendarItems)) {
            return new CalendarItemBean[0];
        } // end if

        int length = aCalendarItems.length;

        CalendarItemBean[] beans = new CalendarItemBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new CalendarItemBean(aCalendarItems[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new CalendarItemBean(aCalendarItems[i]);

                aCallBack.populate(beans[i], new Object[] { aCalendarItems[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end CalendarItemBean
