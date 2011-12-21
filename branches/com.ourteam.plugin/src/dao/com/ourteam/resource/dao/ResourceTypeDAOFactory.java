/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import com.ourteam.resource.dao.IResourceTypeDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:29
 *
 * @author kylin
 */
public class ResourceTypeDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IResourceTypeDAO getResourceTypeDAO() {
        return (IResourceTypeDAO) SpringContextAgent.getBean(IResourceTypeDAO.class.getName());
    } // end getResourceTypeDAO()
} // end ResourceTypeDAOFactory
