/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportInstanceDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:57
 *
 * @author kylin
 */
public class ReportInstanceDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportInstanceDAO getReportInstanceDAO() {
        return (IReportInstanceDAO) SpringContextAgent.getBean(IReportInstanceDAO.class.getName());
    } // end getReportInstanceDAO()
} // end ReportInstanceDAOFactory
