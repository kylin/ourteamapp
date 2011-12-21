/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.project.service;

import com.ourteam.project.service.IProjectService;

import net.service.SpringContextAgent;


/**
 * GenDate 2010-11-05 15:42:06
 *
 * @author Auto Gen
 */
public class ProjectServiceFactory {
    /**
     * Get IProjectService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IProjectService getProjectService() {
        return (IProjectService) SpringContextAgent.getBean(IProjectService.class.getName());
    } // end getProjectService()
} // end ProjectServiceFactory
