/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.service;

/**
*  会议服务接口
*  Generated Date 2011-09-02 11:44:14   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IMeetingService {
    /**
     * 查询会议
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.business.domain.MeetingBean[] queryMeetings(
        final com.ourteam.business.dao.MeetingDAOQueryBean queryBean)
        throws Exception;
} // end IMeetingService
