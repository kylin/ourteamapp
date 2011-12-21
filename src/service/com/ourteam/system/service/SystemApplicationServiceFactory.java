/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import com.ourteam.system.service.ISystemApplicationService;

import net.service.SpringContextAgent;


/**
 * ϵͳӦ�÷��� GenDate 2011-11-01 14:43:00
 *
 * @author Auto Gen
 */
public class SystemApplicationServiceFactory {
    /**
     * Get ISystemApplicationService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ISystemApplicationService getSystemApplicationService() {
        return (ISystemApplicationService) SpringContextAgent.getBean(ISystemApplicationService.class.getName());
    } // end getSystemApplicationService()
} // end SystemApplicationServiceFactory
