/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import com.ourteam.system.service.ISysUserService;

import net.service.SpringContextAgent;


/**
 * 系统用户服务 GenDate 2011-11-07 10:13:23
 *
 * @author Auto Gen
 */
public class SysUserServiceFactory {
    /**
     * Get ISysUserService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ISysUserService getSysUserService() {
        return (ISysUserService) SpringContextAgent.getBean(ISysUserService.class.getName());
    } // end getSysUserService()
} // end SysUserServiceFactory
