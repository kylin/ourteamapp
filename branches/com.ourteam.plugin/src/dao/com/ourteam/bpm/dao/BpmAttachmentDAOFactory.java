/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmAttachmentDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-12-02 14:46:14
 *
 * @author kylin
 */
public class BpmAttachmentDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmAttachmentDAO getBpmAttachmentDAO() {
        return (IBpmAttachmentDAO) SpringContextAgent.getBean(IBpmAttachmentDAO.class.getName());
    } // end getBpmAttachmentDAO()
} // end BpmAttachmentDAOFactory
