/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysRoleDAO;

import net.service.SpringContextAgent;


/**
 * ϵͳ��ɫ DAO Factory GenDate 2011-09-22 10:11:19
 *
 * @author kylin
 */
public class SysRoleDAOFactory {
    /**
     * Get ϵͳ��ɫ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysRoleDAO getSysRoleDAO() {
        return (ISysRoleDAO) SpringContextAgent.getBean(ISysRoleDAO.class.getName());
    } // end getSysRoleDAO()
} // end SysRoleDAOFactory
