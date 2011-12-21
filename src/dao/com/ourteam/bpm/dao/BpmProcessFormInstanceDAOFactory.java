/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-28 15:45:02
 *
 * @author kylin
 */
public class BpmProcessFormInstanceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmProcessFormInstanceDAO getBpmProcessFormInstanceDAO() {
        return (IBpmProcessFormInstanceDAO) SpringContextAgent.getBean(IBpmProcessFormInstanceDAO.class.getName());
    } // end getBpmProcessFormInstanceDAO()
} // end BpmProcessFormInstanceDAOFactory
