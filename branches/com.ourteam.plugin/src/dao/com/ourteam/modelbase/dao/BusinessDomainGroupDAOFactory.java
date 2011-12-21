/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessDomainGroupDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:16:35
 *
 * @author kylin
 */
public class BusinessDomainGroupDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessDomainGroupDAO getBusinessDomainGroupDAO() {
        return (IBusinessDomainGroupDAO) SpringContextAgent.getBean(IBusinessDomainGroupDAO.class.getName());
    } // end getBusinessDomainGroupDAO()
} // end BusinessDomainGroupDAOFactory
