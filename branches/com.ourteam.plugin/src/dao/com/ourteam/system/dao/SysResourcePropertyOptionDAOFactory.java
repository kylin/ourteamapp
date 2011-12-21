/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysResourcePropertyOptionDAO;

import net.service.SpringContextAgent;


/**
 * ��Դ���Կ�ѡֵ DAO Factory GenDate 2011-09-22 10:11:17
 *
 * @author kylin
 */
public class SysResourcePropertyOptionDAOFactory {
    /**
     * Get ��Դ���Կ�ѡֵ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysResourcePropertyOptionDAO getSysResourcePropertyOptionDAO() {
        return (ISysResourcePropertyOptionDAO) SpringContextAgent.getBean(ISysResourcePropertyOptionDAO.class.getName());
    } // end getSysResourcePropertyOptionDAO()
} // end SysResourcePropertyOptionDAOFactory
