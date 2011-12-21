/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductTeamRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-10 16:06:21
 *
 * @author kylin
 */
public class ProductTeamRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductTeamRelateDAO getProductTeamRelateDAO() {
        return (IProductTeamRelateDAO) SpringContextAgent.getBean(IProductTeamRelateDAO.class.getName());
    } // end getProductTeamRelateDAO()
} // end ProductTeamRelateDAOFactory
