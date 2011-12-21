/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.service;

/**
*  ��������
*  Generated Date 2011-09-09 13:54:33   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ICalendarService {
    /**
     * ȡ��������
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
     * ���������
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
     * ����IDȡ��������Ŀ
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
     * �༭������Ŀ
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
     * ɾ��������Ŀ
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
     * ����IDȡ����������
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
     * ȡ��ϵͳ��������
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
     * ȡ����������
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
     * ������������
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
     * ����������IDȡ������
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
     * �½���������
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
     * ɾ����������
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
