/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysNotifyConfigDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-24 15:00:28
 *
 * @author kylin
 */
public class SysNotifyConfigDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysNotifyConfigDAO getSysNotifyConfigDAO() {
        return (ISysNotifyConfigDAO) SpringContextAgent.getBean(ISysNotifyConfigDAO.class.getName());
    } // end getSysNotifyConfigDAO()
} // end SysNotifyConfigDAOFactory
