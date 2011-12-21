/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IObjectMappingDAO;

import net.service.SpringContextAgent;


/**
 * 对象映射 DAO Factory GenDate 2011-09-22 10:16:40
 *
 * @author kylin
 */
public class ObjectMappingDAOFactory {
    /**
     * Get 对象映射 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IObjectMappingDAO getObjectMappingDAO() {
        return (IObjectMappingDAO) SpringContextAgent.getBean(IObjectMappingDAO.class.getName());
    } // end getObjectMappingDAO()
} // end ObjectMappingDAOFactory
