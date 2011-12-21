/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.project.service;

import com.ourteam.project.dao.ProjectDAOQueryBean;
import com.ourteam.project.domain.ProjectBean;

/**
 * impl Generated Date 2010-11-05 15:42:16
 * 
 * @author $Auto Gen
 */
public class ProjectServiceImpl extends AbstractProjectService {
	/**
	 * ����û�idȡ����Ŀ�б� impl
	 * 
	 * @param userId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.project.domain.ProjectBean[] doGetProjectsByUserId(
			final long userId) throws Exception {

		ProjectDAOQueryBean projectDAOQueryBean = new ProjectDAOQueryBean();

		return ProjectBean.toArray(this.projectDao
				.queryProject(projectDAOQueryBean));
	} // end doGetProjectsByUserId()
} // end ProjectServiceImpl
