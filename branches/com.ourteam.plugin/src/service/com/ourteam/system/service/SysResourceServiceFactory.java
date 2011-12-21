/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import com.ourteam.system.service.ISysResourceService;

import net.service.SpringContextAgent;


/**
 * 系统资源服务 GenDate 2010-07-23 19:38:19
 *
 * @author Auto Gen
 */
public class SysResourceServiceFactory {
    /**
     * Get ISysResourceService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ISysResourceService getSysResourceService() {
        return (ISysResourceService) SpringContextAgent.getBean(ISysResourceService.class.getName());
    } // end getSysResourceService()
} // end SysResourceServiceFactory
