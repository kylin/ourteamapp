/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductFunctionVersionRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-10 16:06:18
 *
 * @author kylin
 */
public class ProductFunctionVersionRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductFunctionVersionRelateDAO getProductFunctionVersionRelateDAO() {
        return (IProductFunctionVersionRelateDAO) SpringContextAgent.getBean(IProductFunctionVersionRelateDAO.class.getName());
    } // end getProductFunctionVersionRelateDAO()
} // end ProductFunctionVersionRelateDAOFactory
