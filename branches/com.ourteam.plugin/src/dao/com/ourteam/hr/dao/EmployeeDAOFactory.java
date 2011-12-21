/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import com.ourteam.hr.dao.IEmployeeDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-31 11:55:28
 *
 * @author kylin
 */
public class EmployeeDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IEmployeeDAO getEmployeeDAO() {
        return (IEmployeeDAO) SpringContextAgent.getBean(IEmployeeDAO.class.getName());
    } // end getEmployeeDAO()
} // end EmployeeDAOFactory
