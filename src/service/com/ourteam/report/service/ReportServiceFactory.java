/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.service;

import com.ourteam.report.service.IReportService;

import net.service.SpringContextAgent;


/**
 * 报表管理服务 GenDate 2011-09-27 10:52:53
 *
 * @author Auto Gen
 */
public class ReportServiceFactory {
    /**
     * Get IReportService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IReportService getReportService() {
        return (IReportService) SpringContextAgent.getBean(IReportService.class.getName());
    } // end getReportService()
} // end ReportServiceFactory
