/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

import com.ourteam.document.dao.IDocumentInfoDAO;

import net.service.SpringContextAgent;


/**
 * �ĵ���Ϣ DAO Factory GenDate 2011-09-22 10:16:24
 *
 * @author kylin
 */
public class DocumentInfoDAOFactory {
    /**
     * Get �ĵ���Ϣ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IDocumentInfoDAO getDocumentInfoDAO() {
        return (IDocumentInfoDAO) SpringContextAgent.getBean(IDocumentInfoDAO.class.getName());
    } // end getDocumentInfoDAO()
} // end DocumentInfoDAOFactory
