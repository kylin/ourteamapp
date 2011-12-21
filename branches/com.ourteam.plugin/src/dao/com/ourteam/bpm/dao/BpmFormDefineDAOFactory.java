/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmFormDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-11 14:51:16
 *
 * @author kylin
 */
public class BpmFormDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmFormDefineDAO getBpmFormDefineDAO() {
        return (IBpmFormDefineDAO) SpringContextAgent.getBean(IBpmFormDefineDAO.class.getName());
    } // end getBpmFormDefineDAO()
} // end BpmFormDefineDAOFactory
