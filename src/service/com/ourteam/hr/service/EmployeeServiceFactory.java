/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.service;

import com.ourteam.hr.service.IEmployeeService;

import net.service.SpringContextAgent;


/**
 * GenDate 2011-11-17 15:45:43
 *
 * @author Auto Gen
 */
public class EmployeeServiceFactory {
    /**
     * Get IEmployeeService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IEmployeeService getEmployeeService() {
        return (IEmployeeService) SpringContextAgent.getBean(IEmployeeService.class.getName());
    } // end getEmployeeService()
} // end EmployeeServiceFactory
