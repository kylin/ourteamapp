/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import com.ourteam.calendar.dao.ICalendarDateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:06
 *
 * @author kylin
 */
public class CalendarDateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ICalendarDateDAO getCalendarDateDAO() {
        return (ICalendarDateDAO) SpringContextAgent.getBean(ICalendarDateDAO.class.getName());
    } // end getCalendarDateDAO()
} // end CalendarDateDAOFactory
