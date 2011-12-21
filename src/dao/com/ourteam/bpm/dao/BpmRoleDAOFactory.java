/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmRoleDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-04 13:12:56
 *
 * @author kylin
 */
public class BpmRoleDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmRoleDAO getBpmRoleDAO() {
        return (IBpmRoleDAO) SpringContextAgent.getBean(IBpmRoleDAO.class.getName());
    } // end getBpmRoleDAO()
} // end BpmRoleDAOFactory
