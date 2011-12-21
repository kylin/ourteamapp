/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportFilterDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:55
 *
 * @author kylin
 */
public class ReportFilterDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportFilterDAO getReportFilterDAO() {
        return (IReportFilterDAO) SpringContextAgent.getBean(IReportFilterDAO.class.getName());
    } // end getReportFilterDAO()
} // end ReportFilterDAOFactory
