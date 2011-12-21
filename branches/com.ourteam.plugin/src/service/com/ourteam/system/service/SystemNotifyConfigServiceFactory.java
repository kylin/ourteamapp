/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import com.ourteam.system.service.ISystemNotifyConfigService;

import net.service.SpringContextAgent;


/**
 * ϵͳ֪ͨ���÷��� GenDate 2011-11-24 15:08:27
 *
 * @author Auto Gen
 */
public class SystemNotifyConfigServiceFactory {
    /**
     * Get ISystemNotifyConfigService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ISystemNotifyConfigService getSystemNotifyConfigService() {
        return (ISystemNotifyConfigService) SpringContextAgent.getBean(ISystemNotifyConfigService.class.getName());
    } // end getSystemNotifyConfigService()
} // end SystemNotifyConfigServiceFactory
