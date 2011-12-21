/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysUserPasswordDAO;

import net.service.SpringContextAgent;


/**
 * ϵͳ�û����� DAO Factory GenDate 2011-09-22 10:11:26
 *
 * @author kylin
 */
public class SysUserPasswordDAOFactory {
    /**
     * Get ϵͳ�û����� DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysUserPasswordDAO getSysUserPasswordDAO() {
        return (ISysUserPasswordDAO) SpringContextAgent.getBean(ISysUserPasswordDAO.class.getName());
    } // end getSysUserPasswordDAO()
} // end SysUserPasswordDAOFactory
