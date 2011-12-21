/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 日历服务 Generated Date 2011-09-09 13:55:09
 *
 * @author Auto Gen
 */
abstract class AbstractCalendarService extends net.service.DefaultServiceImpl
    implements ICalendarService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractCalendarService.class);

    /** CalendarDefine DAO Instance */
    protected com.ourteam.calendar.dao.ICalendarDefineDAO calendarDefineDao;

    /** CalendarItem DAO Instance */
    protected com.ourteam.calendar.dao.ICalendarItemDAO calendarItemDao;

    /** CalendarDate DAO Instance */
    protected com.ourteam.calendar.dao.ICalendarDateDAO calendarDateDao;

    /** CalendarItemAssign DAO Instance */
    protected com.ourteam.calendar.dao.ICalendarItemAssignDAO calendarItemAssignDao;

    /**
     * Get CalendarDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.calendar.dao.ICalendarDefineDAO getCalendarDefineDao() {
        return calendarDefineDao;
    } // end getCalendarDefineDao()

    /**
     * Set CalendarDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setCalendarDefineDao(
        com.ourteam.calendar.dao.ICalendarDefineDAO aDao) {
        calendarDefineDao = aDao;
    } // end setCalendarDefineDao()

    /**
     * Get CalendarItem DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.calendar.dao.ICalendarItemDAO getCalendarItemDao() {
        return calendarItemDao;
    } // end getCalendarItemDao()

    /**
     * Set CalendarItem DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setCalendarItemDao(
        com.ourteam.calendar.dao.ICalendarItemDAO aDao) {
        calendarItemDao = aDao;
    } // end setCalendarItemDao()

    /**
     * Get CalendarDate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.calendar.dao.ICalendarDateDAO getCalendarDateDao() {
        return calendarDateDao;
    } // end getCalendarDateDao()

    /**
     * Set CalendarDate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setCalendarDateDao(
        com.ourteam.calendar.dao.ICalendarDateDAO aDao) {
        calendarDateDao = aDao;
    } // end setCalendarDateDao()

    /**
     * Get CalendarItemAssign DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.calendar.dao.ICalendarItemAssignDAO getCalendarItemAssignDao() {
        return calendarItemAssignDao;
    } // end getCalendarItemAssignDao()

    /**
     * Set CalendarItemAssign DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setCalendarItemAssignDao(
        com.ourteam.calendar.dao.ICalendarItemAssignDAO aDao) {
        calendarItemAssignDao = aDao;
    } // end setCalendarItemAssignDao()

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
     */
    protected abstract com.ourteam.calendar.domain.CalendarItemBean[] doGetCalendarItems(
        final long[] calendarIds, final java.util.Date startDate,
        final java.util.Date endDate) throws Exception;

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
     */
    public com.ourteam.calendar.domain.CalendarItemBean[] getCalendarItems(
        final long[] calendarIds, final java.util.Date startDate,
        final java.util.Date endDate) throws Exception {
        try {
            if (startDate == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [startDate] Value is NULL");
            } // end if

            if (endDate == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [endDate] Value is NULL");
            } // end if

            com.ourteam.calendar.domain.CalendarItemBean[] result = doGetCalendarItems(calendarIds,
                    startDate, endDate);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getCalendarItems error", e);
            throw e;
        } // end catch
    } // end getCalendarItems()

    /**
     * 添加日历项
     *
     * @param calendarId
     * @param calendarItemBean
     *
     * @throws Exception
     */
    protected abstract void doAddCalendarItem(final long calendarId,
        final com.ourteam.calendar.domain.CalendarItemBean calendarItemBean)
        throws Exception;

    /**
     * 添加日历项
     *
     * @param calendarId
     * @param calendarItemBean
     *
     * @throws Exception
     */
    public void addCalendarItem(final long calendarId,
        final com.ourteam.calendar.domain.CalendarItemBean calendarItemBean)
        throws Exception {
        try {
            if (calendarItemBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [calendarItemBean] Value is NULL");
            } // end if

            doAddCalendarItem(calendarId, calendarItemBean);
        } // end try
        catch (Exception e) {
            logger.error("do addCalendarItem error", e);
            throw e;
        } // end catch
    } // end addCalendarItem()

    /**
     * 根据ID取得日历项目
     *
     * @param calendarItemId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.calendar.domain.CalendarItemBean doGetCalendarItemById(
        final long calendarItemId) throws Exception;

    /**
     * 根据ID取得日历项目
     *
     * @param calendarItemId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.calendar.domain.CalendarItemBean getCalendarItemById(
        final long calendarItemId) throws Exception {
        try {
            com.ourteam.calendar.domain.CalendarItemBean result = doGetCalendarItemById(calendarItemId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getCalendarItemById error", e);
            throw e;
        } // end catch
    } // end getCalendarItemById()

    /**
     * 编辑日历项目
     *
     * @param calendarItemBean
     *
     * @throws Exception
     */
    protected abstract void doModifyCalendarItem(
        final com.ourteam.calendar.domain.CalendarItemBean calendarItemBean)
        throws Exception;

    /**
     * 编辑日历项目
     *
     * @param calendarItemBean
     *
     * @throws Exception
     */
    public void modifyCalendarItem(
        final com.ourteam.calendar.domain.CalendarItemBean calendarItemBean)
        throws Exception {
        try {
            if (calendarItemBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [calendarItemBean] Value is NULL");
            } // end if

            doModifyCalendarItem(calendarItemBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyCalendarItem error", e);
            throw e;
        } // end catch
    } // end modifyCalendarItem()

    /**
     * 删除日历项目
     *
     * @param calendarItemIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteCalendarItems(final long[] calendarItemIds)
        throws Exception;

    /**
     * 删除日历项目
     *
     * @param calendarItemIds
     *
     * @throws Exception
     */
    public void deleteCalendarItems(final long[] calendarItemIds)
        throws Exception {
        try {
            doDeleteCalendarItems(calendarItemIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteCalendarItems error", e);
            throw e;
        } // end catch
    } // end deleteCalendarItems()

    /**
     * 根据ID取得日历定义
     *
     * @param calendarDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.calendar.domain.CalendarDefineBean doGetCalendarDefineById(
        final long calendarDefineId) throws Exception;

    /**
     * 根据ID取得日历定义
     *
     * @param calendarDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.calendar.domain.CalendarDefineBean getCalendarDefineById(
        final long calendarDefineId) throws Exception {
        try {
            com.ourteam.calendar.domain.CalendarDefineBean result = doGetCalendarDefineById(calendarDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getCalendarDefineById error", e);
            throw e;
        } // end catch
    } // end getCalendarDefineById()

    /**
     * 取得系统日历定义
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.calendar.domain.CalendarDefineBean doGetSystemCalendarDefine()
        throws Exception;

    /**
     * 取得系统日历定义
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.calendar.domain.CalendarDefineBean getSystemCalendarDefine()
        throws Exception {
        try {
            com.ourteam.calendar.domain.CalendarDefineBean result = doGetSystemCalendarDefine();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemCalendarDefine error", e);
            throw e;
        } // end catch
    } // end getSystemCalendarDefine()

    /**
     * 取得日历定义
     *
     * @param calendarIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.calendar.domain.CalendarDefineBean[] doGetCalendarDefines(
        final long[] calendarIds) throws Exception;

    /**
     * 取得日历定义
     *
     * @param calendarIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.calendar.domain.CalendarDefineBean[] getCalendarDefines(
        final long[] calendarIds) throws Exception {
        try {
            com.ourteam.calendar.domain.CalendarDefineBean[] result = doGetCalendarDefines(calendarIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getCalendarDefines error", e);
            throw e;
        } // end catch
    } // end getCalendarDefines()

    /**
     * 更新日历定义
     *
     * @param calendarDefineBean
     *
     * @throws Exception
     */
    protected abstract void doModifyCalendarDefine(
        final com.ourteam.calendar.domain.CalendarDefineBean calendarDefineBean)
        throws Exception;

    /**
     * 更新日历定义
     *
     * @param calendarDefineBean
     *
     * @throws Exception
     */
    public void modifyCalendarDefine(
        final com.ourteam.calendar.domain.CalendarDefineBean calendarDefineBean)
        throws Exception {
        try {
            if (calendarDefineBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [calendarDefineBean] Value is NULL");
            } // end if

            doModifyCalendarDefine(calendarDefineBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyCalendarDefine error", e);
            throw e;
        } // end catch
    } // end modifyCalendarDefine()

    /**
     * 根据所有者ID取得日历
     *
     * @param ownerIds
     * @param calendarTypeEnum
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.calendar.domain.CalendarDefineBean[] doGetCalendarDefinesByOwnerId(
        final long[] ownerIds,
        final com.ourteam.calendar.domain.CalendarTypeEnum calendarTypeEnum)
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
     */
    public com.ourteam.calendar.domain.CalendarDefineBean[] getCalendarDefinesByOwnerId(
        final long[] ownerIds,
        final com.ourteam.calendar.domain.CalendarTypeEnum calendarTypeEnum)
        throws Exception {
        try {
            if (calendarTypeEnum == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [calendarTypeEnum] Value is NULL");
            } // end if

            com.ourteam.calendar.domain.CalendarDefineBean[] result = doGetCalendarDefinesByOwnerId(ownerIds,
                    calendarTypeEnum);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getCalendarDefinesByOwnerId error", e);
            throw e;
        } // end catch
    } // end getCalendarDefinesByOwnerId()

    /**
     * 新建日历定义
     *
     * @param ownerId
     * @param calendarTypeEnum
     * @param calendarDefineBean
     *
     * @throws Exception
     */
    protected abstract void doAddCalendarDefine(final long ownerId,
        final com.ourteam.calendar.domain.CalendarTypeEnum calendarTypeEnum,
        final com.ourteam.calendar.domain.CalendarDefineBean calendarDefineBean)
        throws Exception;

    /**
     * 新建日历定义
     *
     * @param ownerId
     * @param calendarTypeEnum
     * @param calendarDefineBean
     *
     * @throws Exception
     */
    public void addCalendarDefine(final long ownerId,
        final com.ourteam.calendar.domain.CalendarTypeEnum calendarTypeEnum,
        final com.ourteam.calendar.domain.CalendarDefineBean calendarDefineBean)
        throws Exception {
        try {
            if (calendarTypeEnum == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [calendarTypeEnum] Value is NULL");
            } // end if

            if (calendarDefineBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [calendarDefineBean] Value is NULL");
            } // end if

            doAddCalendarDefine(ownerId, calendarTypeEnum, calendarDefineBean);
        } // end try
        catch (Exception e) {
            logger.error("do addCalendarDefine error", e);
            throw e;
        } // end catch
    } // end addCalendarDefine()

    /**
     * 删除日历定义
     *
     * @param calendarIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteCalendarDefines(final long[] calendarIds)
        throws Exception;

    /**
     * 删除日历定义
     *
     * @param calendarIds
     *
     * @throws Exception
     */
    public void deleteCalendarDefines(final long[] calendarIds)
        throws Exception {
        try {
            doDeleteCalendarDefines(calendarIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteCalendarDefines error", e);
            throw e;
        } // end catch
    } // end deleteCalendarDefines()
} // end AbstractCalendarService
