/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmProcessDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-23 16:27:12
 *
 * @author kylin
 */
public class BpmProcessDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmProcessDefineDAO getBpmProcessDefineDAO() {
        return (IBpmProcessDefineDAO) SpringContextAgent.getBean(IBpmProcessDefineDAO.class.getName());
    } // end getBpmProcessDefineDAO()
} // end BpmProcessDefineDAOFactory
