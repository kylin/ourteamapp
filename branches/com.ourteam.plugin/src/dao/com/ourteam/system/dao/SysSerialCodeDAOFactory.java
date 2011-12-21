/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysSerialCodeDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-28 13:34:27
 *
 * @author kylin
 */
public class SysSerialCodeDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysSerialCodeDAO getSysSerialCodeDAO() {
        return (ISysSerialCodeDAO) SpringContextAgent.getBean(ISysSerialCodeDAO.class.getName());
    } // end getSysSerialCodeDAO()
} // end SysSerialCodeDAOFactory
