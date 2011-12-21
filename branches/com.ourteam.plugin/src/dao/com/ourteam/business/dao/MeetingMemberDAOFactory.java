/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import com.ourteam.business.dao.IMeetingMemberDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:40
 *
 * @author kylin
 */
public class MeetingMemberDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMeetingMemberDAO getMeetingMemberDAO() {
        return (IMeetingMemberDAO) SpringContextAgent.getBean(IMeetingMemberDAO.class.getName());
    } // end getMeetingMemberDAO()
} // end MeetingMemberDAOFactory
