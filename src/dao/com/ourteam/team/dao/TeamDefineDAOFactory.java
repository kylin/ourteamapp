/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import com.ourteam.team.dao.ITeamDefineDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:56
 *
 * @author kylin
 */
public class TeamDefineDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ITeamDefineDAO getTeamDefineDAO() {
        return (ITeamDefineDAO) SpringContextAgent.getBean(ITeamDefineDAO.class.getName());
    } // end getTeamDefineDAO()
} // end TeamDefineDAOFactory
