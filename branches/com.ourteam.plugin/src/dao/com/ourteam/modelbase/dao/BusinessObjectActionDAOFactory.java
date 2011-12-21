/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessObjectActionDAO;

import net.service.SpringContextAgent;


/**
 * 业务对象动作 DAO Factory GenDate 2011-09-22 10:16:38
 *
 * @author kylin
 */
public class BusinessObjectActionDAOFactory {
    /**
     * Get 业务对象动作 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessObjectActionDAO getBusinessObjectActionDAO() {
        return (IBusinessObjectActionDAO) SpringContextAgent.getBean(IBusinessObjectActionDAO.class.getName());
    } // end getBusinessObjectActionDAO()
} // end BusinessObjectActionDAOFactory
