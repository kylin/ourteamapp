/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

/**
 * Generate Date 2011-09-22 10:18:07
 *
 * @author Auto Gen
 */
public class CalendarItem implements java.io.Serializable {
    /**
     * Creates a new CalendarItem object.
     */
    public CalendarItem() {
        super();
    } // end CalendarItem()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String alermConfig;

    /** Attribute  Be Seted Falg */
    private boolean alermConfigSetted = false;

    /** Attribute  is Null Falg */
    private boolean alermConfigNull = false;

    /** Attribute */
    private long calendarId;

    /** Attribute  Be Seted Falg */
    private boolean calendarIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarIdNull = false;

    /** Attribute */
    private java.util.Date endDateTime;

    /** Attribute  Be Seted Falg */
    private boolean endDateTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean endDateTimeNull = false;

    /** Attribute */
    private String fullDateItem;

    /** Attribute  Be Seted Falg */
    private boolean fullDateItemSetted = false;

    /** Attribute  is Null Falg */
    private boolean fullDateItemNull = false;

    /** Attribute */
    private String itemAttchment;

    /** Attribute  Be Seted Falg */
    private boolean itemAttchmentSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemAttchmentNull = false;

    /** Attribute */
    private String itemContent;

    /** Attribute  Be Seted Falg */
    private boolean itemContentSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemContentNull = false;

    /** Attribute */
    private String itemLocaltion;

    /** Attribute  Be Seted Falg */
    private boolean itemLocaltionSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemLocaltionNull = false;

    /** Attribute */
    private String itemTitle;

    /** Attribute  Be Seted Falg */
    private boolean itemTitleSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemTitleNull = false;

    /** Attribute */
    private String protectedType;

    /** Attribute  Be Seted Falg */
    private boolean protectedTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean protectedTypeNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String repeateConfig;

    /** Attribute  Be Seted Falg */
    private boolean repeateConfigSetted = false;

    /** Attribute  is Null Falg */
    private boolean repeateConfigNull = false;

    /** Attribute */
    private java.util.Date startDateTime;

    /** Attribute  Be Seted Falg */
    private boolean startDateTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean startDateTimeNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String calendarName;

    /** Attribute  Be Seted Falg */
    private boolean calendarNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarNameNull = false;

    /** Attribute */
    private String calendarType;

    /** Attribute  Be Seted Falg */
    private boolean calendarTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarTypeNull = false;

    /** Attribute */
    private String calendarStyle;

    /** Attribute  Be Seted Falg */
    private boolean calendarStyleSetted = false;

    /** Attribute  is Null Falg */
    private boolean calendarStyleNull = false;

    /** Attribute */
    private long ownerId;

    /** Attribute  Be Seted Falg */
    private boolean ownerIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean ownerIdNull = false;

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
     * Get AlermConfig
     *
     * @return alermConfig
     */
    final public String getAlermConfig() {
        return alermConfig;
    } // end getAlermConfig()

    /**
     * Set AlermConfig
     *
     * @param aAlermConfig
     */
    final public void setAlermConfig(String aAlermConfig) {
        this.alermConfig = aAlermConfig;

        this.alermConfigSetted = true;

        this.setAlermConfigNull(this.alermConfig == null);
    } // end setAlermConfig()

    /**
     * Get AlermConfig Has Been Setted
     *
     * @return alermConfig
     */
    final public boolean isAlermConfigSetted() {
        return this.alermConfigSetted;
    } // end isAlermConfigSetted()

    /**
     * Set AlermConfig Null
     */
    final public void setAlermConfigNull() {
        this.alermConfigNull = true;
    } // end setAlermConfigNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAlermConfigNull(boolean aNullFlag) {
        this.alermConfigNull = aNullFlag;
    } // end setAlermConfigNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAlermConfigNull() {
        return this.alermConfigNull;
    } // end isAlermConfigNull()

    /**
     * Get CalendarId
     *
     * @return calendarId
     */
    final public long getCalendarId() {
        return calendarId;
    } // end getCalendarId()

    /**
     * Set CalendarId
     *
     * @param aCalendarId
     */
    final public void setCalendarId(long aCalendarId) {
        this.calendarId = aCalendarId;

        this.calendarIdSetted = true;

        this.setCalendarIdNull(false);
    } // end setCalendarId()

    /**
     * Get CalendarId Has Been Setted
     *
     * @return calendarId
     */
    final public boolean isCalendarIdSetted() {
        return this.calendarIdSetted;
    } // end isCalendarIdSetted()

    /**
     * Set CalendarId Null
     */
    final public void setCalendarIdNull() {
        this.calendarIdNull = true;
    } // end setCalendarIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarIdNull(boolean aNullFlag) {
        this.calendarIdNull = aNullFlag;
    } // end setCalendarIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarIdNull() {
        return this.calendarIdNull;
    } // end isCalendarIdNull()

    /**
     * Get EndDateTime
     *
     * @return endDateTime
     */
    final public java.util.Date getEndDateTime() {
        return endDateTime;
    } // end getEndDateTime()

    /**
     * Set EndDateTime
     *
     * @param aEndDateTime
     */
    final public void setEndDateTime(java.util.Date aEndDateTime) {
        this.endDateTime = aEndDateTime;

        this.endDateTimeSetted = true;

        this.setEndDateTimeNull(this.endDateTime == null);
    } // end setEndDateTime()

    /**
     * Get EndDateTime Has Been Setted
     *
     * @return endDateTime
     */
    final public boolean isEndDateTimeSetted() {
        return this.endDateTimeSetted;
    } // end isEndDateTimeSetted()

    /**
     * Set EndDateTime Null
     */
    final public void setEndDateTimeNull() {
        this.endDateTimeNull = true;
    } // end setEndDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEndDateTimeNull(boolean aNullFlag) {
        this.endDateTimeNull = aNullFlag;
    } // end setEndDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEndDateTimeNull() {
        return this.endDateTimeNull;
    } // end isEndDateTimeNull()

    /**
     * Get FullDateItem
     *
     * @return fullDateItem
     */
    final public String getFullDateItem() {
        return fullDateItem;
    } // end getFullDateItem()

    /**
     * Set FullDateItem
     *
     * @param aFullDateItem
     */
    final public void setFullDateItem(String aFullDateItem) {
        this.fullDateItem = aFullDateItem;

        this.fullDateItemSetted = true;

        this.setFullDateItemNull(this.fullDateItem == null);
    } // end setFullDateItem()

    /**
     * Get FullDateItem Has Been Setted
     *
     * @return fullDateItem
     */
    final public boolean isFullDateItemSetted() {
        return this.fullDateItemSetted;
    } // end isFullDateItemSetted()

    /**
     * Set FullDateItem Null
     */
    final public void setFullDateItemNull() {
        this.fullDateItemNull = true;
    } // end setFullDateItemNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFullDateItemNull(boolean aNullFlag) {
        this.fullDateItemNull = aNullFlag;
    } // end setFullDateItemNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFullDateItemNull() {
        return this.fullDateItemNull;
    } // end isFullDateItemNull()

    /**
     * Get ItemAttchment
     *
     * @return itemAttchment
     */
    final public String getItemAttchment() {
        if (isItemAttchmentNull()) {
            return null;
        } // end if
        else {
            return itemAttchment;
        } // end else
    } // end getItemAttchment()

    /**
     * Set ItemAttchment
     *
     * @param aItemAttchment
     */
    final public void setItemAttchment(String aItemAttchment) {
        this.itemAttchment = aItemAttchment;

        this.itemAttchmentSetted = true;

        this.setItemAttchmentNull(this.itemAttchment == null);
    } // end setItemAttchment()

    /**
     * Get ItemAttchment Has Been Setted
     *
     * @return itemAttchment
     */
    final public boolean isItemAttchmentSetted() {
        return this.itemAttchmentSetted;
    } // end isItemAttchmentSetted()

    /**
     * Set ItemAttchment Null
     */
    final public void setItemAttchmentNull() {
        this.itemAttchmentNull = true;
    } // end setItemAttchmentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemAttchmentNull(boolean aNullFlag) {
        this.itemAttchmentNull = aNullFlag;
    } // end setItemAttchmentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemAttchmentNull() {
        return this.itemAttchmentNull;
    } // end isItemAttchmentNull()

    /**
     * Get ItemContent
     *
     * @return itemContent
     */
    final public String getItemContent() {
        if (isItemContentNull()) {
            return null;
        } // end if
        else {
            return itemContent;
        } // end else
    } // end getItemContent()

    /**
     * Set ItemContent
     *
     * @param aItemContent
     */
    final public void setItemContent(String aItemContent) {
        this.itemContent = aItemContent;

        this.itemContentSetted = true;

        this.setItemContentNull(this.itemContent == null);
    } // end setItemContent()

    /**
     * Get ItemContent Has Been Setted
     *
     * @return itemContent
     */
    final public boolean isItemContentSetted() {
        return this.itemContentSetted;
    } // end isItemContentSetted()

    /**
     * Set ItemContent Null
     */
    final public void setItemContentNull() {
        this.itemContentNull = true;
    } // end setItemContentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemContentNull(boolean aNullFlag) {
        this.itemContentNull = aNullFlag;
    } // end setItemContentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemContentNull() {
        return this.itemContentNull;
    } // end isItemContentNull()

    /**
     * Get ItemLocaltion
     *
     * @return itemLocaltion
     */
    final public String getItemLocaltion() {
        return itemLocaltion;
    } // end getItemLocaltion()

    /**
     * Set ItemLocaltion
     *
     * @param aItemLocaltion
     */
    final public void setItemLocaltion(String aItemLocaltion) {
        this.itemLocaltion = aItemLocaltion;

        this.itemLocaltionSetted = true;

        this.setItemLocaltionNull(this.itemLocaltion == null);
    } // end setItemLocaltion()

    /**
     * Get ItemLocaltion Has Been Setted
     *
     * @return itemLocaltion
     */
    final public boolean isItemLocaltionSetted() {
        return this.itemLocaltionSetted;
    } // end isItemLocaltionSetted()

    /**
     * Set ItemLocaltion Null
     */
    final public void setItemLocaltionNull() {
        this.itemLocaltionNull = true;
    } // end setItemLocaltionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemLocaltionNull(boolean aNullFlag) {
        this.itemLocaltionNull = aNullFlag;
    } // end setItemLocaltionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemLocaltionNull() {
        return this.itemLocaltionNull;
    } // end isItemLocaltionNull()

    /**
     * Get ItemTitle
     *
     * @return itemTitle
     */
    final public String getItemTitle() {
        return itemTitle;
    } // end getItemTitle()

    /**
     * Set ItemTitle
     *
     * @param aItemTitle
     */
    final public void setItemTitle(String aItemTitle) {
        this.itemTitle = aItemTitle;

        this.itemTitleSetted = true;

        this.setItemTitleNull(this.itemTitle == null);
    } // end setItemTitle()

    /**
     * Get ItemTitle Has Been Setted
     *
     * @return itemTitle
     */
    final public boolean isItemTitleSetted() {
        return this.itemTitleSetted;
    } // end isItemTitleSetted()

    /**
     * Set ItemTitle Null
     */
    final public void setItemTitleNull() {
        this.itemTitleNull = true;
    } // end setItemTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemTitleNull(boolean aNullFlag) {
        this.itemTitleNull = aNullFlag;
    } // end setItemTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemTitleNull() {
        return this.itemTitleNull;
    } // end isItemTitleNull()

    /**
     * Get ProtectedType
     *
     * @return protectedType
     */
    final public String getProtectedType() {
        return protectedType;
    } // end getProtectedType()

    /**
     * Set ProtectedType
     *
     * @param aProtectedType
     */
    final public void setProtectedType(String aProtectedType) {
        this.protectedType = aProtectedType;

        this.protectedTypeSetted = true;

        this.setProtectedTypeNull(this.protectedType == null);
    } // end setProtectedType()

    /**
     * Get ProtectedType Has Been Setted
     *
     * @return protectedType
     */
    final public boolean isProtectedTypeSetted() {
        return this.protectedTypeSetted;
    } // end isProtectedTypeSetted()

    /**
     * Set ProtectedType Null
     */
    final public void setProtectedTypeNull() {
        this.protectedTypeNull = true;
    } // end setProtectedTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProtectedTypeNull(boolean aNullFlag) {
        this.protectedTypeNull = aNullFlag;
    } // end setProtectedTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProtectedTypeNull() {
        return this.protectedTypeNull;
    } // end isProtectedTypeNull()

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
     * Get RepeateConfig
     *
     * @return repeateConfig
     */
    final public String getRepeateConfig() {
        return repeateConfig;
    } // end getRepeateConfig()

    /**
     * Set RepeateConfig
     *
     * @param aRepeateConfig
     */
    final public void setRepeateConfig(String aRepeateConfig) {
        this.repeateConfig = aRepeateConfig;

        this.repeateConfigSetted = true;

        this.setRepeateConfigNull(this.repeateConfig == null);
    } // end setRepeateConfig()

    /**
     * Get RepeateConfig Has Been Setted
     *
     * @return repeateConfig
     */
    final public boolean isRepeateConfigSetted() {
        return this.repeateConfigSetted;
    } // end isRepeateConfigSetted()

    /**
     * Set RepeateConfig Null
     */
    final public void setRepeateConfigNull() {
        this.repeateConfigNull = true;
    } // end setRepeateConfigNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRepeateConfigNull(boolean aNullFlag) {
        this.repeateConfigNull = aNullFlag;
    } // end setRepeateConfigNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRepeateConfigNull() {
        return this.repeateConfigNull;
    } // end isRepeateConfigNull()

    /**
     * Get StartDateTime
     *
     * @return startDateTime
     */
    final public java.util.Date getStartDateTime() {
        return startDateTime;
    } // end getStartDateTime()

    /**
     * Set StartDateTime
     *
     * @param aStartDateTime
     */
    final public void setStartDateTime(java.util.Date aStartDateTime) {
        this.startDateTime = aStartDateTime;

        this.startDateTimeSetted = true;

        this.setStartDateTimeNull(this.startDateTime == null);
    } // end setStartDateTime()

    /**
     * Get StartDateTime Has Been Setted
     *
     * @return startDateTime
     */
    final public boolean isStartDateTimeSetted() {
        return this.startDateTimeSetted;
    } // end isStartDateTimeSetted()

    /**
     * Set StartDateTime Null
     */
    final public void setStartDateTimeNull() {
        this.startDateTimeNull = true;
    } // end setStartDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStartDateTimeNull(boolean aNullFlag) {
        this.startDateTimeNull = aNullFlag;
    } // end setStartDateTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStartDateTimeNull() {
        return this.startDateTimeNull;
    } // end isStartDateTimeNull()

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
     * Get CalendarName
     *
     * @return calendarName
     */
    final public String getCalendarName() {
        return calendarName;
    } // end getCalendarName()

    /**
     * Set CalendarName
     *
     * @param aCalendarName
     */
    final public void setCalendarName(String aCalendarName) {
        this.calendarName = aCalendarName;

        this.calendarNameSetted = true;

        this.setCalendarNameNull(this.calendarName == null);
    } // end setCalendarName()

    /**
     * Get CalendarName Has Been Setted
     *
     * @return calendarName
     */
    final public boolean isCalendarNameSetted() {
        return this.calendarNameSetted;
    } // end isCalendarNameSetted()

    /**
     * Set CalendarName Null
     */
    final public void setCalendarNameNull() {
        this.calendarNameNull = true;
    } // end setCalendarNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarNameNull(boolean aNullFlag) {
        this.calendarNameNull = aNullFlag;
    } // end setCalendarNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarNameNull() {
        return this.calendarNameNull;
    } // end isCalendarNameNull()

    /**
     * Get CalendarType
     *
     * @return calendarType
     */
    final public String getCalendarType() {
        return calendarType;
    } // end getCalendarType()

    /**
     * Set CalendarType
     *
     * @param aCalendarType
     */
    final public void setCalendarType(String aCalendarType) {
        this.calendarType = aCalendarType;

        this.calendarTypeSetted = true;

        this.setCalendarTypeNull(this.calendarType == null);
    } // end setCalendarType()

    /**
     * Get CalendarType Has Been Setted
     *
     * @return calendarType
     */
    final public boolean isCalendarTypeSetted() {
        return this.calendarTypeSetted;
    } // end isCalendarTypeSetted()

    /**
     * Set CalendarType Null
     */
    final public void setCalendarTypeNull() {
        this.calendarTypeNull = true;
    } // end setCalendarTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarTypeNull(boolean aNullFlag) {
        this.calendarTypeNull = aNullFlag;
    } // end setCalendarTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarTypeNull() {
        return this.calendarTypeNull;
    } // end isCalendarTypeNull()

    /**
     * Get CalendarStyle
     *
     * @return calendarStyle
     */
    final public String getCalendarStyle() {
        if (isCalendarStyleNull()) {
            return null;
        } // end if
        else {
            return calendarStyle;
        } // end else
    } // end getCalendarStyle()

    /**
     * Set CalendarStyle
     *
     * @param aCalendarStyle
     */
    final public void setCalendarStyle(String aCalendarStyle) {
        this.calendarStyle = aCalendarStyle;

        this.calendarStyleSetted = true;

        this.setCalendarStyleNull(this.calendarStyle == null);
    } // end setCalendarStyle()

    /**
     * Get CalendarStyle Has Been Setted
     *
     * @return calendarStyle
     */
    final public boolean isCalendarStyleSetted() {
        return this.calendarStyleSetted;
    } // end isCalendarStyleSetted()

    /**
     * Set CalendarStyle Null
     */
    final public void setCalendarStyleNull() {
        this.calendarStyleNull = true;
    } // end setCalendarStyleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCalendarStyleNull(boolean aNullFlag) {
        this.calendarStyleNull = aNullFlag;
    } // end setCalendarStyleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCalendarStyleNull() {
        return this.calendarStyleNull;
    } // end isCalendarStyleNull()

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

        if ((obj instanceof CalendarItem) == false) {
            return false;
        } // end if

        CalendarItem other = (CalendarItem) obj;

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

        buffer.append("alermConfig=");
        buffer.append(this.alermConfig);
        buffer.append("\r\n");

        buffer.append("calendarId=");
        buffer.append(this.calendarId);
        buffer.append("\r\n");

        buffer.append("endDateTime=");
        buffer.append(this.endDateTime);
        buffer.append("\r\n");

        buffer.append("fullDateItem=");
        buffer.append(this.fullDateItem);
        buffer.append("\r\n");

        buffer.append("itemAttchment=");
        buffer.append(this.itemAttchment);
        buffer.append("\r\n");

        buffer.append("itemContent=");
        buffer.append(this.itemContent);
        buffer.append("\r\n");

        buffer.append("itemLocaltion=");
        buffer.append(this.itemLocaltion);
        buffer.append("\r\n");

        buffer.append("itemTitle=");
        buffer.append(this.itemTitle);
        buffer.append("\r\n");

        buffer.append("protectedType=");
        buffer.append(this.protectedType);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("repeateConfig=");
        buffer.append(this.repeateConfig);
        buffer.append("\r\n");

        buffer.append("startDateTime=");
        buffer.append(this.startDateTime);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("calendarName=");
        buffer.append(this.calendarName);
        buffer.append("\r\n");

        buffer.append("calendarType=");
        buffer.append(this.calendarType);
        buffer.append("\r\n");

        buffer.append("calendarStyle=");
        buffer.append(this.calendarStyle);
        buffer.append("\r\n");

        buffer.append("ownerId=");
        buffer.append(this.ownerId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end CalendarItem
