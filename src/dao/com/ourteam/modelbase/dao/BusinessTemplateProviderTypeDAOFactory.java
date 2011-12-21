/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:16:40
 *
 * @author kylin
 */
public class BusinessTemplateProviderTypeDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessTemplateProviderTypeDAO getBusinessTemplateProviderTypeDAO() {
        return (IBusinessTemplateProviderTypeDAO) SpringContextAgent.getBean(IBusinessTemplateProviderTypeDAO.class.getName());
    } // end getBusinessTemplateProviderTypeDAO()
} // end BusinessTemplateProviderTypeDAOFactory
