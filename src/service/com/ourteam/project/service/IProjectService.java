/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.project.service;

/**
*  
*  Generated Date 2010-11-05 15:42:06   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProjectService {
    /**
     * �����û�idȡ����Ŀ�б�
     *
     * @param userId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.project.domain.ProjectBean[] getProjectsByUserId(
        final long userId) throws Exception;
} // end IProjectService
