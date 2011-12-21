/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysResourceTypeDAO;

import net.service.SpringContextAgent;


/**
 * 系统资源类型 DAO Factory GenDate 2011-09-22 10:11:18
 *
 * @author kylin
 */
public class SysResourceTypeDAOFactory {
    /**
     * Get 系统资源类型 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysResourceTypeDAO getSysResourceTypeDAO() {
        return (ISysResourceTypeDAO) SpringContextAgent.getBean(ISysResourceTypeDAO.class.getName());
    } // end getSysResourceTypeDAO()
} // end SysResourceTypeDAOFactory
