/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmPublicUiConfigDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-11 16:20:01
 *
 * @author kylin
 */
public class BpmPublicUiConfigDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmPublicUiConfigDAO getBpmPublicUiConfigDAO() {
        return (IBpmPublicUiConfigDAO) SpringContextAgent.getBean(IBpmPublicUiConfigDAO.class.getName());
    } // end getBpmPublicUiConfigDAO()
} // end BpmPublicUiConfigDAOFactory
