/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IObjectPropertyDAO;

import net.service.SpringContextAgent;


/**
 * 对象属性 DAO Factory GenDate 2011-09-22 10:16:43
 *
 * @author kylin
 */
public class ObjectPropertyDAOFactory {
    /**
     * Get 对象属性 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IObjectPropertyDAO getObjectPropertyDAO() {
        return (IObjectPropertyDAO) SpringContextAgent.getBean(IObjectPropertyDAO.class.getName());
    } // end getObjectPropertyDAO()
} // end ObjectPropertyDAOFactory
