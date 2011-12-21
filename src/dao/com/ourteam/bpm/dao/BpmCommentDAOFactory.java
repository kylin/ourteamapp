/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmCommentDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-02 13:52:03
 *
 * @author kylin
 */
public class BpmCommentDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmCommentDAO getBpmCommentDAO() {
        return (IBpmCommentDAO) SpringContextAgent.getBean(IBpmCommentDAO.class.getName());
    } // end getBpmCommentDAO()
} // end BpmCommentDAOFactory
