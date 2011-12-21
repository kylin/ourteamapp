/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:16:35
 *
 * @author kylin
 */
public class BusinessDomainGroupRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessDomainGroupRelateDAO getBusinessDomainGroupRelateDAO() {
        return (IBusinessDomainGroupRelateDAO) SpringContextAgent.getBean(IBusinessDomainGroupRelateDAO.class.getName());
    } // end getBusinessDomainGroupRelateDAO()
} // end BusinessDomainGroupRelateDAOFactory
