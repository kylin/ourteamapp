/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.project.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Generated Date 2010-11-05 15:42:16
 *
 * @author Auto Gen
 */
abstract class AbstractProjectService extends net.service.DefaultServiceImpl
    implements IProjectService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractProjectService.class);

    /** Project DAO Instance */
    protected com.ourteam.project.dao.IProjectDAO projectDao;

    /**
     * Get Project DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.project.dao.IProjectDAO getProjectDao() {
        return projectDao;
    } // end getProjectDao()

    /**
     * Set Project DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProjectDao(com.ourteam.project.dao.IProjectDAO aDao) {
        projectDao = aDao;
    } // end setProjectDao()

    /**
     * 根据用户id取得项目列表
     *
     * @param userId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.project.domain.ProjectBean[] doGetProjectsByUserId(
        final long userId) throws Exception;

    /**
     * 根据用户id取得项目列表
     *
     * @param userId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.project.domain.ProjectBean[] getProjectsByUserId(
        final long userId) throws Exception {
        try {
            com.ourteam.project.domain.ProjectBean[] result = doGetProjectsByUserId(userId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProjectsByUserId error", e);
            throw e;
        } // end catch
    } // end getProjectsByUserId()
} // end AbstractProjectService
