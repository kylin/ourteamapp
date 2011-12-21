/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessPackageDAO;

import net.service.SpringContextAgent;


/**
 * ҵ������ DAO Factory GenDate 2011-09-22 10:16:39
 *
 * @author kylin
 */
public class BusinessPackageDAOFactory {
    /**
     * Get ҵ������ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessPackageDAO getBusinessPackageDAO() {
        return (IBusinessPackageDAO) SpringContextAgent.getBean(IBusinessPackageDAO.class.getName());
    } // end getBusinessPackageDAO()
} // end BusinessPackageDAOFactory
