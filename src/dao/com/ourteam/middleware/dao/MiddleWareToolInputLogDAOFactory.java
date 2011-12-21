/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-09 08:49:13
 *
 * @author kylin
 */
public class MiddleWareToolInputLogDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareToolInputLogDAO getMiddleWareToolInputLogDAO() {
        return (IMiddleWareToolInputLogDAO) SpringContextAgent.getBean(IMiddleWareToolInputLogDAO.class.getName());
    } // end getMiddleWareToolInputLogDAO()
} // end MiddleWareToolInputLogDAOFactory
