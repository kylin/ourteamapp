/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-01 13:19:56
 *
 * @author kylin
 */
public class BpmProcessRolePurviewDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmProcessRolePurviewDAO getBpmProcessRolePurviewDAO() {
        return (IBpmProcessRolePurviewDAO) SpringContextAgent.getBean(IBpmProcessRolePurviewDAO.class.getName());
    } // end getBpmProcessRolePurviewDAO()
} // end BpmProcessRolePurviewDAOFactory
