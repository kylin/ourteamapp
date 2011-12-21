/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:25
 *
 * @author kylin
 */
public class WorkspaceResourceBusinessPackageRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IWorkspaceResourceBusinessPackageRelateDAO getWorkspaceResourceBusinessPackageRelateDAO() {
        return (IWorkspaceResourceBusinessPackageRelateDAO) SpringContextAgent.getBean(IWorkspaceResourceBusinessPackageRelateDAO.class.getName());
    } // end getWorkspaceResourceBusinessPackageRelateDAO()
} // end WorkspaceResourceBusinessPackageRelateDAOFactory
