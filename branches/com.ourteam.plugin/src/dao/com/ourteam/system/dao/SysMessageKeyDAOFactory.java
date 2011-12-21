/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysMessageKeyDAO;

import net.service.SpringContextAgent;


/**
 * ϵͳ���ʻ���ԴKey DAO Factory GenDate 2011-09-22 10:11:10
 *
 * @author kylin
 */
public class SysMessageKeyDAOFactory {
    /**
     * Get ϵͳ���ʻ���ԴKey DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysMessageKeyDAO getSysMessageKeyDAO() {
        return (ISysMessageKeyDAO) SpringContextAgent.getBean(ISysMessageKeyDAO.class.getName());
    } // end getSysMessageKeyDAO()
} // end SysMessageKeyDAOFactory
