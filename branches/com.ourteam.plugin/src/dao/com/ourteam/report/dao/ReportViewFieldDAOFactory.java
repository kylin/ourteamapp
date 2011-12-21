/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportViewFieldDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:38:00
 *
 * @author kylin
 */
public class ReportViewFieldDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportViewFieldDAO getReportViewFieldDAO() {
        return (IReportViewFieldDAO) SpringContextAgent.getBean(IReportViewFieldDAO.class.getName());
    } // end getReportViewFieldDAO()
} // end ReportViewFieldDAOFactory
