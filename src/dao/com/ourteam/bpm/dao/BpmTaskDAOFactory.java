/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmTaskDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-30 15:28:44
 *
 * @author kylin
 */
public class BpmTaskDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmTaskDAO getBpmTaskDAO() {
        return (IBpmTaskDAO) SpringContextAgent.getBean(IBpmTaskDAO.class.getName());
    } // end getBpmTaskDAO()
} // end BpmTaskDAOFactory
