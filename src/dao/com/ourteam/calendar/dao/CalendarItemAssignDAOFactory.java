/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import com.ourteam.calendar.dao.ICalendarItemAssignDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:09
 *
 * @author kylin
 */
public class CalendarItemAssignDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ICalendarItemAssignDAO getCalendarItemAssignDAO() {
        return (ICalendarItemAssignDAO) SpringContextAgent.getBean(ICalendarItemAssignDAO.class.getName());
    } // end getCalendarItemAssignDAO()
} // end CalendarItemAssignDAOFactory
