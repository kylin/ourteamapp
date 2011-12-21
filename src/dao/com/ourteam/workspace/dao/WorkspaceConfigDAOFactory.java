/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import com.ourteam.workspace.dao.IWorkspaceConfigDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:23
 *
 * @author kylin
 */
public class WorkspaceConfigDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IWorkspaceConfigDAO getWorkspaceConfigDAO() {
        return (IWorkspaceConfigDAO) SpringContextAgent.getBean(IWorkspaceConfigDAO.class.getName());
    } // end getWorkspaceConfigDAO()
} // end WorkspaceConfigDAOFactory
