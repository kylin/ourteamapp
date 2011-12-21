/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.project.dao;

import com.ourteam.project.dao.IProjectDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:46
 *
 * @author kylin
 */
public class ProjectDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProjectDAO getProjectDAO() {
        return (IProjectDAO) SpringContextAgent.getBean(IProjectDAO.class.getName());
    } // end getProjectDAO()
} // end ProjectDAOFactory
