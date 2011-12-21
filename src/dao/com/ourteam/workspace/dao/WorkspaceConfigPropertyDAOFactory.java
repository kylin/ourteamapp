/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:24
 *
 * @author kylin
 */
public class WorkspaceConfigPropertyDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IWorkspaceConfigPropertyDAO getWorkspaceConfigPropertyDAO() {
        return (IWorkspaceConfigPropertyDAO) SpringContextAgent.getBean(IWorkspaceConfigPropertyDAO.class.getName());
    } // end getWorkspaceConfigPropertyDAO()
} // end WorkspaceConfigPropertyDAOFactory
