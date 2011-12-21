/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportDisplayColumnDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:54
 *
 * @author kylin
 */
public class ReportDisplayColumnDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportDisplayColumnDAO getReportDisplayColumnDAO() {
        return (IReportDisplayColumnDAO) SpringContextAgent.getBean(IReportDisplayColumnDAO.class.getName());
    } // end getReportDisplayColumnDAO()
} // end ReportDisplayColumnDAOFactory
