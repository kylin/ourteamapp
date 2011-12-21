/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import com.ourteam.modelbase.service.IBusinessObjectService;

import net.service.SpringContextAgent;


/**
 * 业务对象服务 GenDate 2011-06-29 10:03:55
 *
 * @author Auto Gen
 */
public class BusinessObjectServiceFactory {
    /**
     * Get IBusinessObjectService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IBusinessObjectService getBusinessObjectService() {
        return (IBusinessObjectService) SpringContextAgent.getBean(IBusinessObjectService.class.getName());
    } // end getBusinessObjectService()
} // end BusinessObjectServiceFactory
