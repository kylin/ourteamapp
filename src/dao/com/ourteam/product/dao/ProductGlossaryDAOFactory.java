/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductGlossaryDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-12 16:26:32
 *
 * @author kylin
 */
public class ProductGlossaryDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductGlossaryDAO getProductGlossaryDAO() {
        return (IProductGlossaryDAO) SpringContextAgent.getBean(IProductGlossaryDAO.class.getName());
    } // end getProductGlossaryDAO()
} // end ProductGlossaryDAOFactory
