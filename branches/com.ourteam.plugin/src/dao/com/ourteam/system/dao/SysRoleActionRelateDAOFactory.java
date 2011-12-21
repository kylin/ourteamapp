/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysRoleActionRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-12 21:19:59
 *
 * @author Kylin
 */
public class SysRoleActionRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysRoleActionRelateDAO getSysRoleActionRelateDAO() {
        return (ISysRoleActionRelateDAO) SpringContextAgent.getBean(ISysRoleActionRelateDAO.class.getName());
    } // end getSysRoleActionRelateDAO()
} // end SysRoleActionRelateDAOFactory
