/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-16 10:32:28
 *
 * @author kylin
 */
public class BpmEmployeeRoleRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmEmployeeRoleRelateDAO getBpmEmployeeRoleRelateDAO() {
        return (IBpmEmployeeRoleRelateDAO) SpringContextAgent.getBean(IBpmEmployeeRoleRelateDAO.class.getName());
    } // end getBpmEmployeeRoleRelateDAO()
} // end BpmEmployeeRoleRelateDAOFactory
