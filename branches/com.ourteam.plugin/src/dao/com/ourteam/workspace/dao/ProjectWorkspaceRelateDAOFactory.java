/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import com.ourteam.workspace.dao.IProjectWorkspaceRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:22
 *
 * @author kylin
 */
public class ProjectWorkspaceRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProjectWorkspaceRelateDAO getProjectWorkspaceRelateDAO() {
        return (IProjectWorkspaceRelateDAO) SpringContextAgent.getBean(IProjectWorkspaceRelateDAO.class.getName());
    } // end getProjectWorkspaceRelateDAO()
} // end ProjectWorkspaceRelateDAOFactory
