/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.service;

import com.ourteam.team.service.ITeamService;

import net.service.SpringContextAgent;


/**
 * 团队服务 GenDate 2011-11-26 09:35:55
 *
 * @author Auto Gen
 */
public class TeamServiceFactory {
    /**
     * Get ITeamService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ITeamService getTeamService() {
        return (ITeamService) SpringContextAgent.getBean(ITeamService.class.getName());
    } // end getTeamService()
} // end TeamServiceFactory
