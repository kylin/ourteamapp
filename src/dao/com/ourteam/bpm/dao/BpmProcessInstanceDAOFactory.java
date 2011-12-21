/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmProcessInstanceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-25 15:17:23
 *
 * @author kylin
 */
public class BpmProcessInstanceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmProcessInstanceDAO getBpmProcessInstanceDAO() {
        return (IBpmProcessInstanceDAO) SpringContextAgent.getBean(IBpmProcessInstanceDAO.class.getName());
    } // end getBpmProcessInstanceDAO()
} // end BpmProcessInstanceDAOFactory
