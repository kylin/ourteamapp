/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessObjectDAO;

import net.service.SpringContextAgent;


/**
 * ҵ����� DAO Factory GenDate 2011-09-22 10:16:36
 *
 * @author kylin
 */
public class BusinessObjectDAOFactory {
    /**
     * Get ҵ����� DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessObjectDAO getBusinessObjectDAO() {
        return (IBusinessObjectDAO) SpringContextAgent.getBean(IBusinessObjectDAO.class.getName());
    } // end getBusinessObjectDAO()
} // end BusinessObjectDAOFactory
