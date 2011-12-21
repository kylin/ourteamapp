/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-08 15:06:51
 *
 * @author kylin
 */
public class MiddleWareToolInputOptionDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareToolInputOptionDAO getMiddleWareToolInputOptionDAO() {
        return (IMiddleWareToolInputOptionDAO) SpringContextAgent.getBean(IMiddleWareToolInputOptionDAO.class.getName());
    } // end getMiddleWareToolInputOptionDAO()
} // end MiddleWareToolInputOptionDAOFactory
