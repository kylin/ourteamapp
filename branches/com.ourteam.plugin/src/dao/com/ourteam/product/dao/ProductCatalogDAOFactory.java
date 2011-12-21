/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductCatalogDAO;

import net.service.SpringContextAgent;


/**
 * 产品目录 DAO Factory GenDate 2011-10-10 16:06:16
 *
 * @author kylin
 */
public class ProductCatalogDAOFactory {
    /**
     * Get 产品目录 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductCatalogDAO getProductCatalogDAO() {
        return (IProductCatalogDAO) SpringContextAgent.getBean(IProductCatalogDAO.class.getName());
    } // end getProductCatalogDAO()
} // end ProductCatalogDAOFactory
