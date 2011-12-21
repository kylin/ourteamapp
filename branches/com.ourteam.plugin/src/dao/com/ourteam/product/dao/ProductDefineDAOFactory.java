/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductDefineDAO;

import net.service.SpringContextAgent;


/**
 * 产品定义 DAO Factory GenDate 2011-10-10 16:06:17
 *
 * @author kylin
 */
public class ProductDefineDAOFactory {
    /**
     * Get 产品定义 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductDefineDAO getProductDefineDAO() {
        return (IProductDefineDAO) SpringContextAgent.getBean(IProductDefineDAO.class.getName());
    } // end getProductDefineDAO()
} // end ProductDefineDAOFactory
