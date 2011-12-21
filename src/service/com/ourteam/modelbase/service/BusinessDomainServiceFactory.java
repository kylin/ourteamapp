/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import com.ourteam.modelbase.service.IBusinessDomainService;

import net.service.SpringContextAgent;


/**
 * 业务域服务对象 GenDate 2011-05-31 15:23:24
 *
 * @author Auto Gen
 */
public class BusinessDomainServiceFactory {
    /**
     * Get IBusinessDomainService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessDomainService getBusinessDomainService() {
        return (IBusinessDomainService) SpringContextAgent.getBean(IBusinessDomainService.class.getName());
    } // end getBusinessDomainService()
} // end BusinessDomainServiceFactory
