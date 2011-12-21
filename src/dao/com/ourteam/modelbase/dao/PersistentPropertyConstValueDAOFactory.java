/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO;

import net.service.SpringContextAgent;


/**
 * �־ö�������ֵ DAO Factory GenDate 2011-09-22 10:16:50
 *
 * @author kylin
 */
public class PersistentPropertyConstValueDAOFactory {
    /**
     * Get �־ö�������ֵ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IPersistentPropertyConstValueDAO getPersistentPropertyConstValueDAO() {
        return (IPersistentPropertyConstValueDAO) SpringContextAgent.getBean(IPersistentPropertyConstValueDAO.class.getName());
    } // end getPersistentPropertyConstValueDAO()
} // end PersistentPropertyConstValueDAOFactory
