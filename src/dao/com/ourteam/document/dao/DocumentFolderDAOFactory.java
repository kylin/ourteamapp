/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

import com.ourteam.document.dao.IDocumentFolderDAO;

import net.service.SpringContextAgent;


/**
 * �ĵ�Ŀ¼ DAO Factory GenDate 2011-09-22 10:16:22
 *
 * @author kylin
 */
public class DocumentFolderDAOFactory {
    /**
     * Get �ĵ�Ŀ¼ DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IDocumentFolderDAO getDocumentFolderDAO() {
        return (IDocumentFolderDAO) SpringContextAgent.getBean(IDocumentFolderDAO.class.getName());
    } // end getDocumentFolderDAO()
} // end DocumentFolderDAOFactory
