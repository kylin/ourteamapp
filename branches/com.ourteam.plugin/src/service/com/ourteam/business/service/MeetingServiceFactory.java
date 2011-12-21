/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.service;

import com.ourteam.business.service.IMeetingService;

import net.service.SpringContextAgent;


/**
 * 会议服务接口 GenDate 2011-09-02 11:44:14
 *
 * @author Auto Gen
 */
public class MeetingServiceFactory {
    /**
     * Get IMeetingService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IMeetingService getMeetingService() {
        return (IMeetingService) SpringContextAgent.getBean(IMeetingService.class.getName());
    } // end getMeetingService()
} // end MeetingServiceFactory
