/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysModuleDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-30 13:32:34
 *
 * @author kylin
 */
public class SysModuleDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysModuleDAO getSysModuleDAO() {
        return (ISysModuleDAO) SpringContextAgent.getBean(ISysModuleDAO.class.getName());
    } // end getSysModuleDAO()
} // end SysModuleDAOFactory
