/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.service;

/**
*  日历服务
*  Generated Date 2011-09-09 13:54:33   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ICalendarService {
    /**
     * 取得日历项
     *
     * @param calendarIds
     * @param startDate
     * @param endDate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.CalendarItemBean[] getCalendarItems(
        final long[] calendarIds, final java.util.Date startDate,
        final java.util.Date endDate) throws Exception;

    /**
     * 添加日历项
     *
     * @param calendarId
     * @param calendarItemBean
     *
     * @throws Exception
     *
     * @model
     */
    void addCalendarItem(final long calendarId,
        final com.ourteam.calendar.domain.CalendarItemBean calendarItemBean)
        throws Exception;

    /**
     * 根据ID取得日历项目
     *
     * @param calendarItemId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.CalendarItemBean getCalendarItemById(
        final long calendarItemId) throws Exception;

    /**
     * 编辑日历项目
     *
     * @param calendarItemBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyCalendarItem(
        final com.ourteam.calendar.domain.CalendarItemBean calendarItemBean)
        throws Exception;

    /**
     * 删除日历项目
     *
     * @param calendarItemIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarItems(final long[] calendarItemIds)
        throws Exception;

    /**
     * 根据ID取得日历定义
     *
     * @param calendarDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.CalendarDefineBean getCalendarDefineById(
        final long calendarDefineId) throws Exception;

    /**
     * 取得系统日历定义
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.CalendarDefineBean getSystemCalendarDefine()
        throws Exception;

    /**
     * 取得日历定义
     *
     * @param calendarIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.CalendarDefineBean[] getCalendarDefines(
        final long[] calendarIds) throws Exception;

    /**
     * 更新日历定义
     *
     * @param calendarDefineBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyCalendarDefine(
        final com.ourteam.calendar.domain.CalendarDefineBean calendarDefineBean)
        throws Exception;

    /**
     * 根据所有者ID取得日历
     *
     * @param ownerIds
     * @param calendarTypeEnum
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.CalendarDefineBean[] getCalendarDefinesByOwnerId(
        final long[] ownerIds,
        final com.ourteam.calendar.domain.CalendarTypeEnum calendarTypeEnum)
        throws Exception;

    /**
     * 新建日历定义
     *
     * @param ownerId
     * @param calendarTypeEnum
     * @param calendarDefineBean
     *
     * @throws Exception
     *
     * @model
     */
    void addCalendarDefine(final long ownerId,
        final com.ourteam.calendar.domain.CalendarTypeEnum calendarTypeEnum,
        final com.ourteam.calendar.domain.CalendarDefineBean calendarDefineBean)
        throws Exception;

    /**
     * 删除日历定义
     *
     * @param calendarIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarDefines(final long[] calendarIds)
        throws Exception;
} // end ICalendarService
