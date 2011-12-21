/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import com.ourteam.product.dao.IProductGlossaryChangLogDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-12 13:50:05
 *
 * @author kylin
 */
public class ProductGlossaryChangLogDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IProductGlossaryChangLogDAO getProductGlossaryChangLogDAO() {
        return (IProductGlossaryChangLogDAO) SpringContextAgent.getBean(IProductGlossaryChangLogDAO.class.getName());
    } // end getProductGlossaryChangLogDAO()
} // end ProductGlossaryChangLogDAOFactory
