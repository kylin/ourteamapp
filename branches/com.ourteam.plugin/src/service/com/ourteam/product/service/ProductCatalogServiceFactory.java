/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import com.ourteam.product.service.IProductCatalogService;

import net.service.SpringContextAgent;


/**
 * 产品目录服务 GenDate 2010-11-28 11:18:57
 *
 * @author Auto Gen
 */
public class ProductCatalogServiceFactory {
    /**
     * Get IProductCatalogService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IProductCatalogService getProductCatalogService() {
        return (IProductCatalogService) SpringContextAgent.getBean(IProductCatalogService.class.getName());
    } // end getProductCatalogService()
} // end ProductCatalogServiceFactory
