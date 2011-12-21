/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmProcessCatalogDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-03 11:41:14
 *
 * @author kylin
 */
public class BpmProcessCatalogDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmProcessCatalogDAO getBpmProcessCatalogDAO() {
        return (IBpmProcessCatalogDAO) SpringContextAgent.getBean(IBpmProcessCatalogDAO.class.getName());
    } // end getBpmProcessCatalogDAO()
} // end BpmProcessCatalogDAOFactory
