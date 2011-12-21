/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysRoleGroupDAO;

import net.service.SpringContextAgent;


/**
 * 系统角色群组 DAO Factory GenDate 2011-09-22 10:11:21
 *
 * @author kylin
 */
public class SysRoleGroupDAOFactory {
    /**
     * Get 系统角色群组 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysRoleGroupDAO getSysRoleGroupDAO() {
        return (ISysRoleGroupDAO) SpringContextAgent.getBean(ISysRoleGroupDAO.class.getName());
    } // end getSysRoleGroupDAO()
} // end SysRoleGroupDAOFactory
