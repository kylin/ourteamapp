/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-04 10:00:54
 *
 * @author kylin
 */
public class BpmDomainSysModuleRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmDomainSysModuleRelateDAO getBpmDomainSysModuleRelateDAO() {
        return (IBpmDomainSysModuleRelateDAO) SpringContextAgent.getBean(IBpmDomainSysModuleRelateDAO.class.getName());
    } // end getBpmDomainSysModuleRelateDAO()
} // end BpmDomainSysModuleRelateDAOFactory
