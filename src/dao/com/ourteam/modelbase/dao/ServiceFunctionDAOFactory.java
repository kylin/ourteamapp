/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IServiceFunctionDAO;

import net.service.SpringContextAgent;


/**
 * 服务功能定义 DAO Factory GenDate 2011-09-22 10:16:51
 *
 * @author kylin
 */
public class ServiceFunctionDAOFactory {
    /**
     * Get 服务功能定义 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IServiceFunctionDAO getServiceFunctionDAO() {
        return (IServiceFunctionDAO) SpringContextAgent.getBean(IServiceFunctionDAO.class.getName());
    } // end getServiceFunctionDAO()
} // end ServiceFunctionDAOFactory
