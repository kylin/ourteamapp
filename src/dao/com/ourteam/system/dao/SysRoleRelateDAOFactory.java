/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysRoleRelateDAO;

import net.service.SpringContextAgent;


/**
 * 系统角色关系组 DAO Factory GenDate 2011-09-22 10:11:22
 *
 * @author kylin
 */
public class SysRoleRelateDAOFactory {
    /**
     * Get 系统角色关系组 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysRoleRelateDAO getSysRoleRelateDAO() {
        return (ISysRoleRelateDAO) SpringContextAgent.getBean(ISysRoleRelateDAO.class.getName());
    } // end getSysRoleRelateDAO()
} // end SysRoleRelateDAOFactory
