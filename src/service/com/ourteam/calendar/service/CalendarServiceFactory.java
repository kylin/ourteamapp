/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.service;

import com.ourteam.calendar.service.ICalendarService;

import net.service.SpringContextAgent;


/**
 * 日历服务 GenDate 2011-09-09 13:54:33
 *
 * @author Auto Gen
 */
public class CalendarServiceFactory {
    /**
     * Get ICalendarService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ICalendarService getCalendarService() {
        return (ICalendarService) SpringContextAgent.getBean(ICalendarService.class.getName());
    } // end getCalendarService()
} // end CalendarServiceFactory
