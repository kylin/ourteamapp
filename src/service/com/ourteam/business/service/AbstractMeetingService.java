/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 会议服务接口 Generated Date 2011-09-02 11:45:17
 *
 * @author Auto Gen
 */
abstract class AbstractMeetingService extends net.service.DefaultServiceImpl
    implements IMeetingService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractMeetingService.class);

    /** Meeting DAO Instance */
    protected com.ourteam.business.dao.IMeetingDAO meetingDao;

    /** MeetingContent DAO Instance */
    protected com.ourteam.business.dao.IMeetingContentDAO meetingContentDao;

    /** MeetingMember DAO Instance */
    protected com.ourteam.business.dao.IMeetingMemberDAO meetingMemberDao;

    /** MeetingResource DAO Instance */
    protected com.ourteam.business.dao.IMeetingResourceDAO meetingResourceDao;

    /**
     * Get Meeting DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.business.dao.IMeetingDAO getMeetingDao() {
        return meetingDao;
    } // end getMeetingDao()

    /**
     * Set Meeting DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMeetingDao(com.ourteam.business.dao.IMeetingDAO aDao) {
        meetingDao = aDao;
    } // end setMeetingDao()

    /**
     * Get MeetingContent DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.business.dao.IMeetingContentDAO getMeetingContentDao() {
        return meetingContentDao;
    } // end getMeetingContentDao()

    /**
     * Set MeetingContent DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMeetingContentDao(
        com.ourteam.business.dao.IMeetingContentDAO aDao) {
        meetingContentDao = aDao;
    } // end setMeetingContentDao()

    /**
     * Get MeetingMember DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.business.dao.IMeetingMemberDAO getMeetingMemberDao() {
        return meetingMemberDao;
    } // end getMeetingMemberDao()

    /**
     * Set MeetingMember DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMeetingMemberDao(
        com.ourteam.business.dao.IMeetingMemberDAO aDao) {
        meetingMemberDao = aDao;
    } // end setMeetingMemberDao()

    /**
     * Get MeetingResource DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.business.dao.IMeetingResourceDAO getMeetingResourceDao() {
        return meetingResourceDao;
    } // end getMeetingResourceDao()

    /**
     * Set MeetingResource DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMeetingResourceDao(
        com.ourteam.business.dao.IMeetingResourceDAO aDao) {
        meetingResourceDao = aDao;
    } // end setMeetingResourceDao()

    /**
     * 查询会议
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.business.domain.MeetingBean[] doQueryMeetings(
        final com.ourteam.business.dao.MeetingDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询会议
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.business.domain.MeetingBean[] queryMeetings(
        final com.ourteam.business.dao.MeetingDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.business.domain.MeetingBean[] result = doQueryMeetings(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryMeetings error", e);
            throw e;
        } // end catch
    } // end queryMeetings()
} // end AbstractMeetingService
