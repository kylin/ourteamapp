/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportDatabaseDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:53
 *
 * @author kylin
 */
public class ReportDatabaseDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportDatabaseDAO getReportDatabaseDAO() {
        return (IReportDatabaseDAO) SpringContextAgent.getBean(IReportDatabaseDAO.class.getName());
    } // end getReportDatabaseDAO()
} // end ReportDatabaseDAOFactory
