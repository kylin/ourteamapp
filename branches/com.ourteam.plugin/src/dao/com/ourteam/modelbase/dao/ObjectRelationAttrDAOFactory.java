/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import com.ourteam.modelbase.dao.IObjectRelationAttrDAO;

import net.service.SpringContextAgent;


/**
 * 关联关系映射属性 DAO Factory GenDate 2011-09-22 10:16:49
 *
 * @author kylin
 */
public class ObjectRelationAttrDAOFactory {
    /**
     * Get 关联关系映射属性 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IObjectRelationAttrDAO getObjectRelationAttrDAO() {
        return (IObjectRelationAttrDAO) SpringContextAgent.getBean(IObjectRelationAttrDAO.class.getName());
    } // end getObjectRelationAttrDAO()
} // end ObjectRelationAttrDAOFactory
