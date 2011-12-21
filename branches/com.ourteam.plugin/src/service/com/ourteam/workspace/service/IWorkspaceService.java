/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.service;

/**
*  
*  Generated Date 2010-12-23 16:25:57   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IWorkspaceService {
    /**
     * �����Ŀidȡ�ù���ƽ̨
     *
     * @param projectIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceBean[] getWorkspacesByProjectIds(
        final long[] projectIds) throws Exception;

    /**
     * ȡ�ù���ƽ̨��Դ
     *
     * @param workspaceId
     * @param workspaceResourceTypeEnums
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceResourceBean[] getWorkspaceResources(
        final long workspaceId,
        final com.ourteam.workspace.dao.WorkspaceResourceTypeEnum[] workspaceResourceTypeEnums)
        throws Exception;

    /**
     * ��ӹ����ռ�
     *
     * @param projectId
     * @param workspaceBean
     *
     * @throws Exception
     *
     * @model
     */
    void addNewWorkspace(final long projectId,
        final com.ourteam.workspace.domain.WorkspaceBean workspaceBean)
        throws Exception;

    /**
     * ��ӹ���ƽ̨��Դ
     *
     * @param workspaceResourceBean
     *
     * @throws Exception
     *
     * @model
     */
    void addWorkspaceResource(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception;

    /**
     * ���idȡ�ù����ռ����
     *
     * @param workspaceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceBean getWorkspaceById(
        final long workspaceId) throws Exception;

    /**
     * ���idȡ�ù����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceResourceBean getWorkspaceResourceById(
        final long workspaceResourceId) throws Exception;

    /**
     * �޸Ĺ���ƽ̨��Դ��Ϣ
     *
     * @param workspaceResourceBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyWorkspaceResource(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception;

    /**
     * ȡ����Դ��ҵ���Ĺ���
     *
     * @param resourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean[] getWorkspaceResourceBusinessPackageRelates(
        final long resourceId) throws Exception;

    /**
     * ��ӹ����ռ���Դ��ҵ��ģ�Ͱ����
     *
     * @param resourceId
     * @param businessPackageId
     *
     * @throws Exception
     *
     * @model
     */
    void addWorkspaceResourceBusinessPackageRelate(final long resourceId,
        final long[] businessPackageId) throws Exception;

    /**
     * ɾ�����ռ���Դ��ҵ��ģ�Ͱ����
     *
     * @param relateIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeWorkspaceResourceBusinessPackageRelates(final long[] relateIds)
        throws Exception;

    /**
     * ȡ�ù�����Դ�ļ�
     *
     * @param workspaceResourceBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    java.io.File getWorkspaceResourceFileObject(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception;

    /**
     * ȡ�ù����ռ�����
     *
     * @param workspaceId
     * @param parentWorkspaceConfigId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceConfigBean[] getWorkspaceConfigs(
        final long workspaceId, final long parentWorkspaceConfigId)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param workspaceId
     * @param workspaceConfigId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] getWorkspaceConfigProperties(
        final long workspaceId, final long workspaceConfigId)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param workspaceId
     * @param workspaceConfigId
     * @param workspaceConfigPropertyBeans
     *
     * @throws Exception
     *
     * @model
     */
    void setWorkspaceConfigProperties(final long workspaceId,
        final long workspaceConfigId,
        final com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] workspaceConfigPropertyBeans)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param workspaceId
     * @param configItem
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] getWorkspaceConfigPropertiesByConfigItem(
        final long workspaceId, final String configItem)
        throws Exception;

    /**
     * �����ĿIDȡ�÷����б�
     *
     * @param projectId
     * @param serverTypeEnums
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareBean[] getServersByProjectIds(
        final long[] projectId,
        final com.ourteam.middleware.domain.MiddleWareTypeEnum[] serverTypeEnums)
        throws Exception;

    /**
     * ������������ù����ռ�����
     *
     * @param workspaceId
     * @param configItem
     * @param workspaceConfigPropertyBean
     *
     * @throws Exception
     *
     * @model
     */
    void setWorkspaceConfigPropertiesByConfigItem(final long workspaceId,
        final String configItem,
        final com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] workspaceConfigPropertyBean)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param workspace
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    java.io.File getWorkspaceFileObject(
        final com.ourteam.workspace.domain.WorkspaceBean workspace)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    java.io.File getWorkspaceRootFileObject() throws Exception;

    /**
     * ɾ�����ռ�
     *
     * @param workspaceId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspace(final long workspaceId) throws Exception;

    /**
     * ɾ�����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceResource(final long workspaceResourceId)
        throws Exception;

    /**
     * ȥ�����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @throws Exception
     *
     * @model
     */
    void removeWorkspaceResource(final long workspaceResourceId)
        throws Exception;

    /**
     * �����Ŀ����
     *
     * @param middleWareServerId
     * @param projectId
     *
     * @throws Exception
     *
     * @model
     */
    void addServerToProject(final long middleWareServerId, final long projectId)
        throws Exception;
} // end IWorkspaceService
