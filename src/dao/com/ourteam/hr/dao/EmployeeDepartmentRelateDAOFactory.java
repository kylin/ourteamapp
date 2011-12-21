/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-29 20:18:38
 *
 * @author Kylin
 */
public class EmployeeDepartmentRelateDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IEmployeeDepartmentRelateDAO getEmployeeDepartmentRelateDAO() {
        return (IEmployeeDepartmentRelateDAO) SpringContextAgent.getBean(IEmployeeDepartmentRelateDAO.class.getName());
    } // end getEmployeeDepartmentRelateDAO()
} // end EmployeeDepartmentRelateDAOFactory
