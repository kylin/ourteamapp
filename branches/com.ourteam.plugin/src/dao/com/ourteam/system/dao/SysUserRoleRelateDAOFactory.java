/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysUserRoleRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-07 10:15:09
 *
 * @author kylin
 */
public class SysUserRoleRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysUserRoleRelateDAO getSysUserRoleRelateDAO() {
        return (ISysUserRoleRelateDAO) SpringContextAgent.getBean(ISysUserRoleRelateDAO.class.getName());
    } // end getSysUserRoleRelateDAO()
} // end SysUserRoleRelateDAOFactory
