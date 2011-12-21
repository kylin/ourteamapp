/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import com.ourteam.system.service.ISysMessageResourceService;

import net.service.SpringContextAgent;


/**
 * 系统国际化资源服务 GenDate 2010-07-23 19:38:19
 *
 * @author Auto Gen
 */
public class SysMessageResourceServiceFactory {
    /**
     * Get ISysMessageResourceService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ISysMessageResourceService getSysMessageResourceService() {
        return (ISysMessageResourceService) SpringContextAgent.getBean(ISysMessageResourceService.class.getName());
    } // end getSysMessageResourceService()
} // end SysMessageResourceServiceFactory
