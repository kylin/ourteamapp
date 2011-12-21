/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportViewTableDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:38:01
 *
 * @author kylin
 */
public class ReportViewTableDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportViewTableDAO getReportViewTableDAO() {
        return (IReportViewTableDAO) SpringContextAgent.getBean(IReportViewTableDAO.class.getName());
    } // end getReportViewTableDAO()
} // end ReportViewTableDAOFactory
