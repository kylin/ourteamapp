/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-01 13:19:52
 *
 * @author kylin
 */
public class BpmFormFieldStatusDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmFormFieldStatusDefineDAO getBpmFormFieldStatusDefineDAO() {
        return (IBpmFormFieldStatusDefineDAO) SpringContextAgent.getBean(IBpmFormFieldStatusDefineDAO.class.getName());
    } // end getBpmFormFieldStatusDefineDAO()
} // end BpmFormFieldStatusDefineDAOFactory