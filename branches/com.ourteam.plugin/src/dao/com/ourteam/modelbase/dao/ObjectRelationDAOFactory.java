/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IObjectRelationDAO;

import net.service.SpringContextAgent;


/**
 * ���������ϵ DAO Factory GenDate 2011-09-22 10:16:44
 *
 * @author kylin
 */
public class ObjectRelationDAOFactory {
    /**
     * Get ���������ϵ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IObjectRelationDAO getObjectRelationDAO() {
        return (IObjectRelationDAO) SpringContextAgent.getBean(IObjectRelationDAO.class.getName());
    } // end getObjectRelationDAO()
} // end ObjectRelationDAOFactory
