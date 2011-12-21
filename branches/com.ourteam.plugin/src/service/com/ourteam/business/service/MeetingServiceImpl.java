/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.business.service;

import com.ourteam.business.domain.MeetingBean;

/**
 * �������ӿ� impl Generated Date 2011-09-02 11:45:17
 * 
 * @author $Auto Gen
 */
public class MeetingServiceImpl extends AbstractMeetingService {
	/**
	 * ��ѯ���� impl
	 * 
	 * @param queryBean
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.business.domain.MeetingBean[] doQueryMeetings(
			final com.ourteam.business.dao.MeetingDAOQueryBean queryBean)
			throws Exception {
		return MeetingBean.toArray(this.meetingDao.queryMeeting(queryBean));
	} // end doQueryMeetings()
} // end MeetingServiceImpl
