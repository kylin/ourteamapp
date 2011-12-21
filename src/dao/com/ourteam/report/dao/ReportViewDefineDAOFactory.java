/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportViewDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:59
 *
 * @author kylin
 */
public class ReportViewDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportViewDefineDAO getReportViewDefineDAO() {
        return (IReportViewDefineDAO) SpringContextAgent.getBean(IReportViewDefineDAO.class.getName());
    } // end getReportViewDefineDAO()
} // end ReportViewDefineDAOFactory
