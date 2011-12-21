/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmFormFieldDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-11 13:31:05
 *
 * @author kylin
 */
public class BpmFormFieldDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmFormFieldDefineDAO getBpmFormFieldDefineDAO() {
        return (IBpmFormFieldDefineDAO) SpringContextAgent.getBean(IBpmFormFieldDefineDAO.class.getName());
    } // end getBpmFormFieldDefineDAO()
} // end BpmFormFieldDefineDAOFactory
