/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessDomainDAO;

import net.service.SpringContextAgent;


/**
 * ҵ������ DAO Factory GenDate 2011-09-22 10:16:35
 *
 * @author kylin
 */
public class BusinessDomainDAOFactory {
    /**
     * Get ҵ������ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessDomainDAO getBusinessDomainDAO() {
        return (IBusinessDomainDAO) SpringContextAgent.getBean(IBusinessDomainDAO.class.getName());
    } // end getBusinessDomainDAO()
} // end BusinessDomainDAOFactory
