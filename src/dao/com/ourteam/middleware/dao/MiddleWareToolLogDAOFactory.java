/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareToolLogDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-09 11:52:53
 *
 * @author kylin
 */
public class MiddleWareToolLogDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareToolLogDAO getMiddleWareToolLogDAO() {
        return (IMiddleWareToolLogDAO) SpringContextAgent.getBean(IMiddleWareToolLogDAO.class.getName());
    } // end getMiddleWareToolLogDAO()
} // end MiddleWareToolLogDAOFactory
