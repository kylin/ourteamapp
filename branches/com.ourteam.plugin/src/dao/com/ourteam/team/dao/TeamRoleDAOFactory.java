/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import com.ourteam.team.dao.ITeamRoleDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-09-22 10:17:57
 *
 * @author kylin
 */
public class TeamRoleDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ITeamRoleDAO getTeamRoleDAO() {
        return (ITeamRoleDAO) SpringContextAgent.getBean(ITeamRoleDAO.class.getName());
    } // end getTeamRoleDAO()
} // end TeamRoleDAOFactory
