/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import com.ourteam.resource.dao.IResourceBookingDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:18:26
 *
 * @author kylin
 */
public class ResourceBookingDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IResourceBookingDAO getResourceBookingDAO() {
        return (IResourceBookingDAO) SpringContextAgent.getBean(IResourceBookingDAO.class.getName());
    } // end getResourceBookingDAO()
} // end ResourceBookingDAOFactory
