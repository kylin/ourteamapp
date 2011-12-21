/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareToolDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-17 17:30:56
 *
 * @author Kylin
 */
public class MiddleWareToolDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareToolDAO getMiddleWareToolDAO() {
        return (IMiddleWareToolDAO) SpringContextAgent.getBean(IMiddleWareToolDAO.class.getName());
    } // end getMiddleWareToolDAO()
} // end MiddleWareToolDAOFactory
