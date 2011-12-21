/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import com.ourteam.calendar.dao.ICalendarDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:07
 *
 * @author kylin
 */
public class CalendarDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ICalendarDefineDAO getCalendarDefineDAO() {
        return (ICalendarDefineDAO) SpringContextAgent.getBean(ICalendarDefineDAO.class.getName());
    } // end getCalendarDefineDAO()
} // end CalendarDefineDAOFactory
