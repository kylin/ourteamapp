/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IBusinessPackageDAO;

import net.service.SpringContextAgent;


/**
 * 业务对象包 DAO Factory GenDate 2011-09-22 10:16:39
 *
 * @author kylin
 */
public class BusinessPackageDAOFactory {
    /**
     * Get 业务对象包 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessPackageDAO getBusinessPackageDAO() {
        return (IBusinessPackageDAO) SpringContextAgent.getBean(IBusinessPackageDAO.class.getName());
    } // end getBusinessPackageDAO()
} // end BusinessPackageDAOFactory
