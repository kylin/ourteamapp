/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmProcessFormValueDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-28 15:45:29
 *
 * @author kylin
 */
public class BpmProcessFormValueDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmProcessFormValueDAO getBpmProcessFormValueDAO() {
        return (IBpmProcessFormValueDAO) SpringContextAgent.getBean(IBpmProcessFormValueDAO.class.getName());
    } // end getBpmProcessFormValueDAO()
} // end BpmProcessFormValueDAOFactory
