/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import com.ourteam.workspace.dao.IProjectServerRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:22
 *
 * @author kylin
 */
public class ProjectServerRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProjectServerRelateDAO getProjectServerRelateDAO() {
        return (IProjectServerRelateDAO) SpringContextAgent.getBean(IProjectServerRelateDAO.class.getName());
    } // end getProjectServerRelateDAO()
} // end ProjectServerRelateDAOFactory
