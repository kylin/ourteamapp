/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import com.ourteam.business.dao.IMeetingResourceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:41
 *
 * @author kylin
 */
public class MeetingResourceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMeetingResourceDAO getMeetingResourceDAO() {
        return (IMeetingResourceDAO) SpringContextAgent.getBean(IMeetingResourceDAO.class.getName());
    } // end getMeetingResourceDAO()
} // end MeetingResourceDAOFactory
