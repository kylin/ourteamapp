/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IObjectRelationDAO;

import net.service.SpringContextAgent;


/**
 * 对象关联关系 DAO Factory GenDate 2011-09-22 10:16:44
 *
 * @author kylin
 */
public class ObjectRelationDAOFactory {
    /**
     * Get 对象关联关系 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IObjectRelationDAO getObjectRelationDAO() {
        return (IObjectRelationDAO) SpringContextAgent.getBean(IObjectRelationDAO.class.getName());
    } // end getObjectRelationDAO()
} // end ObjectRelationDAOFactory
