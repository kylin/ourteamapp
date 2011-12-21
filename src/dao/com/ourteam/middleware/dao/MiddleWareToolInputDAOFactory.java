/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareToolInputDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-08 15:07:38
 *
 * @author kylin
 */
public class MiddleWareToolInputDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareToolInputDAO getMiddleWareToolInputDAO() {
        return (IMiddleWareToolInputDAO) SpringContextAgent.getBean(IMiddleWareToolInputDAO.class.getName());
    } // end getMiddleWareToolInputDAO()
} // end MiddleWareToolInputDAOFactory
