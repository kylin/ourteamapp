/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import com.ourteam.product.service.IProductFunctionService;

import net.service.SpringContextAgent;


/**
 * 产品功能服务 GenDate 2011-03-19 09:20:47
 *
 * @author Auto Gen
 */
public class ProductFunctionServiceFactory {
    /**
     * Get IProductFunctionService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IProductFunctionService getProductFunctionService() {
        return (IProductFunctionService) SpringContextAgent.getBean(IProductFunctionService.class.getName());
    } // end getProductFunctionService()
} // end ProductFunctionServiceFactory
