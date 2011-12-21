/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import com.ourteam.system.service.ISysRoleService;

import net.service.SpringContextAgent;


/**
 * 系统角色服务 GenDate 2011-10-27 10:02:44
 *
 * @author Auto Gen
 */
public class SysRoleServiceFactory {
    /**
     * Get ISysRoleService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ISysRoleService getSysRoleService() {
        return (ISysRoleService) SpringContextAgent.getBean(ISysRoleService.class.getName());
    } // end getSysRoleService()
} // end SysRoleServiceFactory
