/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.service;

import com.ourteam.hr.service.IDepartmentService;

import net.service.SpringContextAgent;


/**
 * GenDate 2011-11-29 20:15:14
 *
 * @author Auto Gen
 */
public class DepartmentServiceFactory {
    /**
     * Get IDepartmentService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IDepartmentService getDepartmentService() {
        return (IDepartmentService) SpringContextAgent.getBean(IDepartmentService.class.getName());
    } // end getDepartmentService()
} // end DepartmentServiceFactory
