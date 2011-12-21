/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import com.ourteam.hr.dao.IDepartmentDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-10-28 17:10:31
 *
 * @author kylin
 */
public class DepartmentDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IDepartmentDAO getDepartmentDAO() {
        return (IDepartmentDAO) SpringContextAgent.getBean(IDepartmentDAO.class.getName());
    } // end getDepartmentDAO()
} // end DepartmentDAOFactory
