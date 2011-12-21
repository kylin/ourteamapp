/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-30 15:28:13
 *
 * @author kylin
 */
public class BpmTaskRoleRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmTaskRoleRelateDAO getBpmTaskRoleRelateDAO() {
        return (IBpmTaskRoleRelateDAO) SpringContextAgent.getBean(IBpmTaskRoleRelateDAO.class.getName());
    } // end getBpmTaskRoleRelateDAO()
} // end BpmTaskRoleRelateDAOFactory
