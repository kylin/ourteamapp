/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.service;

/**
*  �������ӿ�
*  Generated Date 2011-09-02 11:44:14   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IMeetingService {
    /**
     * ��ѯ����
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
