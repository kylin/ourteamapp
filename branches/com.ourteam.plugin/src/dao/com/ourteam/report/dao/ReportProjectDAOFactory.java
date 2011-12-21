/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportProjectDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:37:58
 *
 * @author kylin
 */
public class ReportProjectDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportProjectDAO getReportProjectDAO() {
        return (IReportProjectDAO) SpringContextAgent.getBean(IReportProjectDAO.class.getName());
    } // end getReportProjectDAO()
} // end ReportProjectDAOFactory
