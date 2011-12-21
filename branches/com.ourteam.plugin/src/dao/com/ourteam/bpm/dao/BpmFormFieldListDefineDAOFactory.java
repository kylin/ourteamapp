/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import com.ourteam.bpm.dao.IBpmFormFieldListDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-01 13:19:52
 *
 * @author kylin
 */
public class BpmFormFieldListDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static IBpmFormFieldListDefineDAO getBpmFormFieldListDefineDAO() {
        return (IBpmFormFieldListDefineDAO) SpringContextAgent.getBean(IBpmFormFieldListDefineDAO.class.getName());
    } // end getBpmFormFieldListDefineDAO()
} // end BpmFormFieldListDefineDAOFactory
