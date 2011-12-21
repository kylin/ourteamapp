/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareDAO;

import net.service.SpringContextAgent;


/**
 * 中间件对象 DAO Factory GenDate 2011-12-06 16:03:02
 *
 * @author kylin
 */
public class MiddleWareDAOFactory {
    /**
     * Get 中间件对象 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareDAO getMiddleWareDAO() {
        return (IMiddleWareDAO) SpringContextAgent.getBean(IMiddleWareDAO.class.getName());
    } // end getMiddleWareDAO()
} // end MiddleWareDAOFactory
