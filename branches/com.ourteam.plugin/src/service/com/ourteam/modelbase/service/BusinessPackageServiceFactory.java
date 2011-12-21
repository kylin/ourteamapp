/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import com.ourteam.modelbase.service.IBusinessPackageService;

import net.service.SpringContextAgent;


/**
 * 业务包服务对象 GenDate 2010-10-12 11:48:53
 *
 * @author Auto Gen
 */
public class BusinessPackageServiceFactory {
    /**
     * Get IBusinessPackageService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessPackageService getBusinessPackageService() {
        return (IBusinessPackageService) SpringContextAgent.getBean(IBusinessPackageService.class.getName());
    } // end getBusinessPackageService()
} // end BusinessPackageServiceFactory
