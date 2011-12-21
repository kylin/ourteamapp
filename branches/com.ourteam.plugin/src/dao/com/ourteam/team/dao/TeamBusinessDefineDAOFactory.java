/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import com.ourteam.team.dao.ITeamBusinessDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:55
 *
 * @author kylin
 */
public class TeamBusinessDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ITeamBusinessDefineDAO getTeamBusinessDefineDAO() {
        return (ITeamBusinessDefineDAO) SpringContextAgent.getBean(ITeamBusinessDefineDAO.class.getName());
    } // end getTeamBusinessDefineDAO()
} // end TeamBusinessDefineDAOFactory
