/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysResourceDAO;

import net.service.SpringContextAgent;


/**
 * ϵͳ��Դ DAO Factory GenDate 2011-09-22 10:11:15
 *
 * @author kylin
 */
public class SysResourceDAOFactory {
    /**
     * Get ϵͳ��Դ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysResourceDAO getSysResourceDAO() {
        return (ISysResourceDAO) SpringContextAgent.getBean(ISysResourceDAO.class.getName());
    } // end getSysResourceDAO()
} // end SysResourceDAOFactory
