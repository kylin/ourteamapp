/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import com.ourteam.resource.dao.IResourcePropertyInstanceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:28
 *
 * @author kylin
 */
public class ResourcePropertyInstanceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IResourcePropertyInstanceDAO getResourcePropertyInstanceDAO() {
        return (IResourcePropertyInstanceDAO) SpringContextAgent.getBean(IResourcePropertyInstanceDAO.class.getName());
    } // end getResourcePropertyInstanceDAO()
} // end ResourcePropertyInstanceDAOFactory
