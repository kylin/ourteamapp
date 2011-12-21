/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysRoleModuleRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-27 09:54:15
 *
 * @author kylin
 */
public class SysRoleModuleRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysRoleModuleRelateDAO getSysRoleModuleRelateDAO() {
        return (ISysRoleModuleRelateDAO) SpringContextAgent.getBean(ISysRoleModuleRelateDAO.class.getName());
    } // end getSysRoleModuleRelateDAO()
} // end SysRoleModuleRelateDAOFactory
