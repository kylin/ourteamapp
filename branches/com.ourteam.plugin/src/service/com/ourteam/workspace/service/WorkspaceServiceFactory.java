/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.service;

import com.ourteam.workspace.service.IWorkspaceService;

import net.service.SpringContextAgent;


/**
 * GenDate 2010-12-23 16:25:57
 *
 * @author Auto Gen
 */
public class WorkspaceServiceFactory {
    /**
     * Get IWorkspaceService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IWorkspaceService getWorkspaceService() {
        return (IWorkspaceService) SpringContextAgent.getBean(IWorkspaceService.class.getName());
    } // end getWorkspaceService()
} // end WorkspaceServiceFactory
