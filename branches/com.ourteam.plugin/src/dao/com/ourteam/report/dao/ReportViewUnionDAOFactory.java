/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import com.ourteam.report.dao.IReportViewUnionDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-27 11:38:01
 *
 * @author kylin
 */
public class ReportViewUnionDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IReportViewUnionDAO getReportViewUnionDAO() {
        return (IReportViewUnionDAO) SpringContextAgent.getBean(IReportViewUnionDAO.class.getName());
    } // end getReportViewUnionDAO()
} // end ReportViewUnionDAOFactory
