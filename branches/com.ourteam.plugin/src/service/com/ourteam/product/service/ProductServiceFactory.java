/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import com.ourteam.product.service.IProductService;

import net.service.SpringContextAgent;


/**
 * 产品服务 GenDate 2011-10-12 11:42:46
 *
 * @author Auto Gen
 */
public class ProductServiceFactory {
    /**
     * Get IProductService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IProductService getProductService() {
        return (IProductService) SpringContextAgent.getBean(IProductService.class.getName());
    } // end getProductService()
} // end ProductServiceFactory
