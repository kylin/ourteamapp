/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import com.ourteam.calendar.dao.ITeamCalendarDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:09
 *
 * @author kylin
 */
public class TeamCalendarDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ITeamCalendarDefineDAO getTeamCalendarDefineDAO() {
        return (ITeamCalendarDefineDAO) SpringContextAgent.getBean(ITeamCalendarDefineDAO.class.getName());
    } // end getTeamCalendarDefineDAO()
} // end TeamCalendarDefineDAOFactory
