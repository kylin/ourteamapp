/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareToolGroupDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-07 08:45:30
 *
 * @author kylin
 */
public class MiddleWareToolGroupDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareToolGroupDAO getMiddleWareToolGroupDAO() {
        return (IMiddleWareToolGroupDAO) SpringContextAgent.getBean(IMiddleWareToolGroupDAO.class.getName());
    } // end getMiddleWareToolGroupDAO()
} // end MiddleWareToolGroupDAOFactory
