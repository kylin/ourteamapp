/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.service;

import com.ourteam.resource.service.IResourceService;

import net.service.SpringContextAgent;


/**
 * 资源服务 GenDate 2011-09-13 16:04:09
 *
 * @author Auto Gen
 */
public class ResourceServiceFactory {
    /**
     * Get IResourceService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IResourceService getResourceService() {
        return (IResourceService) SpringContextAgent.getBean(IResourceService.class.getName());
    } // end getResourceService()
} // end ResourceServiceFactory
