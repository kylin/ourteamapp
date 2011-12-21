/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysDomainDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-29 09:07:50
 *
 * @author kylin
 */
public class SysDomainDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysDomainDAO getSysDomainDAO() {
        return (ISysDomainDAO) SpringContextAgent.getBean(ISysDomainDAO.class.getName());
    } // end getSysDomainDAO()
} // end SysDomainDAOFactory
