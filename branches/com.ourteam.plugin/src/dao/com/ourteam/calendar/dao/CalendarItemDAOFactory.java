/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import com.ourteam.calendar.dao.ICalendarItemDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:08
 *
 * @author kylin
 */
public class CalendarItemDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ICalendarItemDAO getCalendarItemDAO() {
        return (ICalendarItemDAO) SpringContextAgent.getBean(ICalendarItemDAO.class.getName());
    } // end getCalendarItemDAO()
} // end CalendarItemDAOFactory
