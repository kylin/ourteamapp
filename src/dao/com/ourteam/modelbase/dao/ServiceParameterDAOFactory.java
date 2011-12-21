/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IServiceParameterDAO;

import net.service.SpringContextAgent;


/**
 * ������� DAO Factory GenDate 2011-09-22 10:16:51
 *
 * @author kylin
 */
public class ServiceParameterDAOFactory {
    /**
     * Get ������� DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IServiceParameterDAO getServiceParameterDAO() {
        return (IServiceParameterDAO) SpringContextAgent.getBean(IServiceParameterDAO.class.getName());
    } // end getServiceParameterDAO()
} // end ServiceParameterDAOFactory
