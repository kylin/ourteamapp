/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import com.ourteam.resource.dao.IResourceInstanceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:26
 *
 * @author kylin
 */
public class ResourceInstanceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IResourceInstanceDAO getResourceInstanceDAO() {
        return (IResourceInstanceDAO) SpringContextAgent.getBean(IResourceInstanceDAO.class.getName());
    } // end getResourceInstanceDAO()
} // end ResourceInstanceDAOFactory
