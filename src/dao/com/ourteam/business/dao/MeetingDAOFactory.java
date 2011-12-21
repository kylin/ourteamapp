/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import com.ourteam.business.dao.IMeetingDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:39
 *
 * @author kylin
 */
public class MeetingDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMeetingDAO getMeetingDAO() {
        return (IMeetingDAO) SpringContextAgent.getBean(IMeetingDAO.class.getName());
    } // end getMeetingDAO()
} // end MeetingDAOFactory
