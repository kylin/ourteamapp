/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysActionDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-07 10:18:30
 *
 * @author kylin
 */
public class SysActionDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysActionDAO getSysActionDAO() {
        return (ISysActionDAO) SpringContextAgent.getBean(ISysActionDAO.class.getName());
    } // end getSysActionDAO()
} // end SysActionDAOFactory
