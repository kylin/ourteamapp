/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import com.ourteam.modelbase.service.IBusinessTemplateService;

import net.service.SpringContextAgent;


/**
 * 业务模板服务 GenDate 2010-12-07 21:47:46
 *
 * @author Auto Gen
 */
public class BusinessTemplateServiceFactory {
    /**
     * Get IBusinessTemplateService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessTemplateService getBusinessTemplateService() {
        return (IBusinessTemplateService) SpringContextAgent.getBean(IBusinessTemplateService.class.getName());
    } // end getBusinessTemplateService()
} // end BusinessTemplateServiceFactory
