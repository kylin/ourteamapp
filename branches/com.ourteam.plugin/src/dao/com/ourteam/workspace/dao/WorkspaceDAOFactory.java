/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import com.ourteam.workspace.dao.IWorkspaceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:23
 *
 * @author kylin
 */
public class WorkspaceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IWorkspaceDAO getWorkspaceDAO() {
        return (IWorkspaceDAO) SpringContextAgent.getBean(IWorkspaceDAO.class.getName());
    } // end getWorkspaceDAO()
} // end WorkspaceDAOFactory
