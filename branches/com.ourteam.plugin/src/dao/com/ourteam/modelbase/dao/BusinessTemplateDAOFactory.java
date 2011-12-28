/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessTemplateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-28 11:21:30
 *
 * @author kylin
 */
public class BusinessTemplateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessTemplateDAO getBusinessTemplateDAO() {
        return (IBusinessTemplateDAO) SpringContextAgent.getBean(IBusinessTemplateDAO.class.getName());
    } // end getBusinessTemplateDAO()
} // end BusinessTemplateDAOFactory
