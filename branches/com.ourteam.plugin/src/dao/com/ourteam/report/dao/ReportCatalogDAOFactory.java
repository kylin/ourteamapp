/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportCatalogDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:52
 *
 * @author kylin
 */
public class ReportCatalogDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportCatalogDAO getReportCatalogDAO() {
        return (IReportCatalogDAO) SpringContextAgent.getBean(IReportCatalogDAO.class.getName());
    } // end getReportCatalogDAO()
} // end ReportCatalogDAOFactory
