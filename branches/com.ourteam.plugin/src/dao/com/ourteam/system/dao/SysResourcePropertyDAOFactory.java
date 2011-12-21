/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysResourcePropertyDAO;

import net.service.SpringContextAgent;


/**
 * ϵͳ��Դ���� DAO Factory GenDate 2011-09-22 10:11:17
 *
 * @author kylin
 */
public class SysResourcePropertyDAOFactory {
    /**
     * Get ϵͳ��Դ���� DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysResourcePropertyDAO getSysResourcePropertyDAO() {
        return (ISysResourcePropertyDAO) SpringContextAgent.getBean(ISysResourcePropertyDAO.class.getName());
    } // end getSysResourcePropertyDAO()
} // end SysResourcePropertyDAOFactory
