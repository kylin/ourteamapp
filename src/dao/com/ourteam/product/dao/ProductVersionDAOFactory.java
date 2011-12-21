/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductVersionDAO;

import net.service.SpringContextAgent;


/**
 * ��Ʒ�汾 DAO Factory GenDate 2011-10-12 15:01:23
 *
 * @author kylin
 */
public class ProductVersionDAOFactory {
    /**
     * Get ��Ʒ�汾 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductVersionDAO getProductVersionDAO() {
        return (IProductVersionDAO) SpringContextAgent.getBean(IProductVersionDAO.class.getName());
    } // end getProductVersionDAO()
} // end ProductVersionDAOFactory
