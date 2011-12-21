/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductFunctionDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-10 16:06:18
 *
 * @author kylin
 */
public class ProductFunctionDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductFunctionDAO getProductFunctionDAO() {
        return (IProductFunctionDAO) SpringContextAgent.getBean(IProductFunctionDAO.class.getName());
    } // end getProductFunctionDAO()
} // end ProductFunctionDAOFactory
