/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysMessageResourceDAO;

import net.service.SpringContextAgent;


/**
 * ϵͳ���ʻ���Դ DAO Factory GenDate 2011-09-22 10:11:12
 *
 * @author kylin
 */
public class SysMessageResourceDAOFactory {
    /**
     * Get ϵͳ���ʻ���Դ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysMessageResourceDAO getSysMessageResourceDAO() {
        return (ISysMessageResourceDAO) SpringContextAgent.getBean(ISysMessageResourceDAO.class.getName());
    } // end getSysMessageResourceDAO()
} // end SysMessageResourceDAOFactory
