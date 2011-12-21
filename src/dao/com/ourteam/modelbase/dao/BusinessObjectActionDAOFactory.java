/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessObjectActionDAO;

import net.service.SpringContextAgent;


/**
 * ҵ������� DAO Factory GenDate 2011-09-22 10:16:38
 *
 * @author kylin
 */
public class BusinessObjectActionDAOFactory {
    /**
     * Get ҵ������� DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessObjectActionDAO getBusinessObjectActionDAO() {
        return (IBusinessObjectActionDAO) SpringContextAgent.getBean(IBusinessObjectActionDAO.class.getName());
    } // end getBusinessObjectActionDAO()
} // end BusinessObjectActionDAOFactory
