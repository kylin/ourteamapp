/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportListSourceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:57
 *
 * @author kylin
 */
public class ReportListSourceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportListSourceDAO getReportListSourceDAO() {
        return (IReportListSourceDAO) SpringContextAgent.getBean(IReportListSourceDAO.class.getName());
    } // end getReportListSourceDAO()
} // end ReportListSourceDAOFactory
