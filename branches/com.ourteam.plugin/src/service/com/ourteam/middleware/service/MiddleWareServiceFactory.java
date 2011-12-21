/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.service;

import com.ourteam.middleware.service.IMiddleWareService;

import net.service.SpringContextAgent;


/**
 * 中间件管理服务 GenDate 2011-12-09 11:21:19
 *
 * @author Auto Gen
 */
public class MiddleWareServiceFactory {
    /**
     * Get IMiddleWareService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IMiddleWareService getMiddleWareService() {
        return (IMiddleWareService) SpringContextAgent.getBean(IMiddleWareService.class.getName());
    } // end getMiddleWareService()
} // end MiddleWareServiceFactory
