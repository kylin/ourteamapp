/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import com.ourteam.resource.dao.IResourcePropertyDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:27
 *
 * @author kylin
 */
public class ResourcePropertyDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IResourcePropertyDAO getResourcePropertyDAO() {
        return (IResourcePropertyDAO) SpringContextAgent.getBean(IResourcePropertyDAO.class.getName());
    } // end getResourcePropertyDAO()
} // end ResourcePropertyDAOFactory
