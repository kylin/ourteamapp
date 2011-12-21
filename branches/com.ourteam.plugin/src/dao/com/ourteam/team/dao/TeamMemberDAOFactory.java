/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import com.ourteam.team.dao.ITeamMemberDAO;

import net.service.SpringContextAgent;


/**
 * DAO Factory GenDate 2011-11-02 14:32:44
 *
 * @author kylin
 */
public class TeamMemberDAOFactory {
    /**
     * Get  DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ITeamMemberDAO getTeamMemberDAO() {
        return (ITeamMemberDAO) SpringContextAgent.getBean(ITeamMemberDAO.class.getName());
    } // end getTeamMemberDAO()
} // end TeamMemberDAOFactory
