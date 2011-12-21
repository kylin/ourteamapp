/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysUserDAO;

import net.service.SpringContextAgent;


/**
 * 系统用户 DAO Factory GenDate 2011-11-07 09:51:15
 *
 * @author kylin
 */
public class SysUserDAOFactory {
    /**
     * Get 系统用户 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysUserDAO getSysUserDAO() {
        return (ISysUserDAO) SpringContextAgent.getBean(ISysUserDAO.class.getName());
    } // end getSysUserDAO()
} // end SysUserDAOFactory
