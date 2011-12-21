/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import com.ourteam.business.dao.IMeetingContentDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:40
 *
 * @author kylin
 */
public class MeetingContentDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMeetingContentDAO getMeetingContentDAO() {
        return (IMeetingContentDAO) SpringContextAgent.getBean(IMeetingContentDAO.class.getName());
    } // end getMeetingContentDAO()
} // end MeetingContentDAOFactory
