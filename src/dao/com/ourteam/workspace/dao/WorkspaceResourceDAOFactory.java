/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import com.ourteam.workspace.dao.IWorkspaceResourceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:25
 *
 * @author kylin
 */
public class WorkspaceResourceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IWorkspaceResourceDAO getWorkspaceResourceDAO() {
        return (IWorkspaceResourceDAO) SpringContextAgent.getBean(IWorkspaceResourceDAO.class.getName());
    } // end getWorkspaceResourceDAO()
} // end WorkspaceResourceDAOFactory
