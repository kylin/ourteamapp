/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessDomainDAO;

import net.service.SpringContextAgent;


/**
 * 业务领域 DAO Factory GenDate 2011-09-22 10:16:35
 *
 * @author kylin
 */
public class BusinessDomainDAOFactory {
    /**
     * Get 业务领域 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessDomainDAO getBusinessDomainDAO() {
        return (IBusinessDomainDAO) SpringContextAgent.getBean(IBusinessDomainDAO.class.getName());
    } // end getBusinessDomainDAO()
} // end BusinessDomainDAOFactory
