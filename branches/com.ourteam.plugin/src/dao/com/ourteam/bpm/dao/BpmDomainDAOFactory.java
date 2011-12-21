/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmDomainDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-01 13:19:49
 *
 * @author kylin
 */
public class BpmDomainDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmDomainDAO getBpmDomainDAO() {
        return (IBpmDomainDAO) SpringContextAgent.getBean(IBpmDomainDAO.class.getName());
    } // end getBpmDomainDAO()
} // end BpmDomainDAOFactory
