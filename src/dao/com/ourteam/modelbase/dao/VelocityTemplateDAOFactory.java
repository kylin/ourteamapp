/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IVelocityTemplateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:16:52
 *
 * @author kylin
 */
public class VelocityTemplateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IVelocityTemplateDAO getVelocityTemplateDAO() {
        return (IVelocityTemplateDAO) SpringContextAgent.getBean(IVelocityTemplateDAO.class.getName());
    } // end getVelocityTemplateDAO()
} // end VelocityTemplateDAOFactory
