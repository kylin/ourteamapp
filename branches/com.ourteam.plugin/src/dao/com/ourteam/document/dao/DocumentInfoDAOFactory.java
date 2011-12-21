/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

import com.ourteam.document.dao.IDocumentInfoDAO;

import net.service.SpringContextAgent;


/**
 * 文档信息 DAO Factory GenDate 2011-09-22 10:16:24
 *
 * @author kylin
 */
public class DocumentInfoDAOFactory {
    /**
     * Get 文档信息 DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IDocumentInfoDAO getDocumentInfoDAO() {
        return (IDocumentInfoDAO) SpringContextAgent.getBean(IDocumentInfoDAO.class.getName());
    } // end getDocumentInfoDAO()
} // end DocumentInfoDAOFactory
