/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import com.ourteam.product.service.IProductVersionService;

import net.service.SpringContextAgent;


/**
 * 产品版本服务对象 GenDate 2011-10-12 16:34:08
 *
 * @author Auto Gen
 */
public class ProductVersionServiceFactory {
    /**
     * Get IProductVersionService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IProductVersionService getProductVersionService() {
        return (IProductVersionService) SpringContextAgent.getBean(IProductVersionService.class.getName());
    } // end getProductVersionService()
} // end ProductVersionServiceFactory
