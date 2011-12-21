/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import com.ourteam.middleware.dao.IMiddleWareProviderDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-06 11:42:56
 *
 * @author kylin
 */
public class MiddleWareProviderDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareProviderDAO getMiddleWareProviderDAO() {
        return (IMiddleWareProviderDAO) SpringContextAgent.getBean(IMiddleWareProviderDAO.class.getName());
    } // end getMiddleWareProviderDAO()
} // end MiddleWareProviderDAOFactory
