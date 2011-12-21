/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Generated Date 2010-12-23 16:26:34
 *
 * @author Auto Gen
 */
abstract class AbstractWorkspaceService extends net.service.DefaultServiceImpl
    implements IWorkspaceService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractWorkspaceService.class);

    /** Workspace DAO Instance */
    protected com.ourteam.workspace.dao.IWorkspaceDAO workspaceDao;

    /** ProjectWorkspaceRelate DAO Instance */
    protected com.ourteam.workspace.dao.IProjectWorkspaceRelateDAO projectWorkspaceRelateDao;

    /** WorkspaceResource DAO Instance */
    protected com.ourteam.workspace.dao.IWorkspaceResourceDAO workspaceResourceDao;

    /** WorkspaceResourceBusinessPackageRelate DAO Instance */
    protected com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO workspaceResourceBusinessPackageRelateDao;

    /** WorkspaceConfig DAO Instance */
    protected com.ourteam.workspace.dao.IWorkspaceConfigDAO workspaceConfigDao;

    /** WorkspaceConfigProperty DAO Instance */
    protected com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO workspaceConfigPropertyDao;

    /** ProjectServerRelate DAO Instance */
    protected com.ourteam.workspace.dao.IProjectServerRelateDAO projectServerRelateDao;

    /** MiddleWareService Instance */
    protected com.ourteam.middleware.service.IMiddleWareService middleWareService;

    /**
     * Get Workspace DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.workspace.dao.IWorkspaceDAO getWorkspaceDao() {
        return workspaceDao;
    } // end getWorkspaceDao()

    /**
     * Set Workspace DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setWorkspaceDao(com.ourteam.workspace.dao.IWorkspaceDAO aDao) {
        workspaceDao = aDao;
    } // end setWorkspaceDao()

    /**
     * Get ProjectWorkspaceRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.workspace.dao.IProjectWorkspaceRelateDAO getProjectWorkspaceRelateDao() {
        return projectWorkspaceRelateDao;
    } // end getProjectWorkspaceRelateDao()

    /**
     * Set ProjectWorkspaceRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProjectWorkspaceRelateDao(
        com.ourteam.workspace.dao.IProjectWorkspaceRelateDAO aDao) {
        projectWorkspaceRelateDao = aDao;
    } // end setProjectWorkspaceRelateDao()

    /**
     * Get WorkspaceResource DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.workspace.dao.IWorkspaceResourceDAO getWorkspaceResourceDao() {
        return workspaceResourceDao;
    } // end getWorkspaceResourceDao()

    /**
     * Set WorkspaceResource DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setWorkspaceResourceDao(
        com.ourteam.workspace.dao.IWorkspaceResourceDAO aDao) {
        workspaceResourceDao = aDao;
    } // end setWorkspaceResourceDao()

    /**
     * Get WorkspaceResourceBusinessPackageRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO getWorkspaceResourceBusinessPackageRelateDao() {
        return workspaceResourceBusinessPackageRelateDao;
    } // end getWorkspaceResourceBusinessPackageRelateDao()

    /**
     * Set WorkspaceResourceBusinessPackageRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setWorkspaceResourceBusinessPackageRelateDao(
        com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO aDao) {
        workspaceResourceBusinessPackageRelateDao = aDao;
    } // end setWorkspaceResourceBusinessPackageRelateDao()

    /**
     * Get WorkspaceConfig DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.workspace.dao.IWorkspaceConfigDAO getWorkspaceConfigDao() {
        return workspaceConfigDao;
    } // end getWorkspaceConfigDao()

    /**
     * Set WorkspaceConfig DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setWorkspaceConfigDao(
        com.ourteam.workspace.dao.IWorkspaceConfigDAO aDao) {
        workspaceConfigDao = aDao;
    } // end setWorkspaceConfigDao()

    /**
     * Get WorkspaceConfigProperty DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO getWorkspaceConfigPropertyDao() {
        return workspaceConfigPropertyDao;
    } // end getWorkspaceConfigPropertyDao()

    /**
     * Set WorkspaceConfigProperty DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setWorkspaceConfigPropertyDao(
        com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO aDao) {
        workspaceConfigPropertyDao = aDao;
    } // end setWorkspaceConfigPropertyDao()

    /**
     * Get ProjectServerRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.workspace.dao.IProjectServerRelateDAO getProjectServerRelateDao() {
        return projectServerRelateDao;
    } // end getProjectServerRelateDao()

    /**
     * Set ProjectServerRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProjectServerRelateDao(
        com.ourteam.workspace.dao.IProjectServerRelateDAO aDao) {
        projectServerRelateDao = aDao;
    } // end setProjectServerRelateDao()

    /**
     * Get MiddleWareService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.service.IMiddleWareService getMiddleWareService() {
        return middleWareService;
    } // end getMiddleWareService()

    /**
     * Set MiddleWareService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setMiddleWareService(
        com.ourteam.middleware.service.IMiddleWareService aService) {
        middleWareService = aService;
    } // end setMiddleWareService()

    /**
     * �����Ŀidȡ�ù���ƽ̨
     *
     * @param projectIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceBean[] doGetWorkspacesByProjectIds(
        final long[] projectIds) throws Exception;

    /**
     * �����Ŀidȡ�ù���ƽ̨
     *
     * @param projectIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.workspace.domain.WorkspaceBean[] getWorkspacesByProjectIds(
        final long[] projectIds) throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceBean[] result = doGetWorkspacesByProjectIds(projectIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspacesByProjectIds error", e);
            throw e;
        } // end catch
    } // end getWorkspacesByProjectIds()

    /**
     * ȡ�ù���ƽ̨��Դ
     *
     * @param workspaceId
     * @param workspaceResourceTypeEnums
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceResourceBean[] doGetWorkspaceResources(
        final long workspaceId,
        final com.ourteam.workspace.dao.WorkspaceResourceTypeEnum[] workspaceResourceTypeEnums)
        throws Exception;

    /**
     * ȡ�ù���ƽ̨��Դ
     *
     * @param workspaceId
     * @param workspaceResourceTypeEnums
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.workspace.domain.WorkspaceResourceBean[] getWorkspaceResources(
        final long workspaceId,
        final com.ourteam.workspace.dao.WorkspaceResourceTypeEnum[] workspaceResourceTypeEnums)
        throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceResourceBean[] result = doGetWorkspaceResources(workspaceId,
                    workspaceResourceTypeEnums);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceResources error", e);
            throw e;
        } // end catch
    } // end getWorkspaceResources()

    /**
     * ��ӹ����ռ�
     *
     * @param projectId
     * @param workspaceBean
     *
     * @throws Exception
     */
    protected abstract void doAddNewWorkspace(final long projectId,
        final com.ourteam.workspace.domain.WorkspaceBean workspaceBean)
        throws Exception;

    /**
     * ��ӹ����ռ�
     *
     * @param projectId
     * @param workspaceBean
     *
     * @throws Exception
     */
    public void addNewWorkspace(final long projectId,
        final com.ourteam.workspace.domain.WorkspaceBean workspaceBean)
        throws Exception {
        try {
            if (workspaceBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [workspaceBean] Value is NULL");
            } // end if

            doAddNewWorkspace(projectId, workspaceBean);
        } // end try
        catch (Exception e) {
            logger.error("do addNewWorkspace error", e);
            throw e;
        } // end catch
    } // end addNewWorkspace()

    /**
     * ��ӹ���ƽ̨��Դ
     *
     * @param workspaceResourceBean
     *
     * @throws Exception
     */
    protected abstract void doAddWorkspaceResource(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception;

    /**
     * ��ӹ���ƽ̨��Դ
     *
     * @param workspaceResourceBean
     *
     * @throws Exception
     */
    public void addWorkspaceResource(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception {
        try {
            if (workspaceResourceBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [workspaceResourceBean] Value is NULL");
            } // end if

            doAddWorkspaceResource(workspaceResourceBean);
        } // end try
        catch (Exception e) {
            logger.error("do addWorkspaceResource error", e);
            throw e;
        } // end catch
    } // end addWorkspaceResource()

    /**
     * ���idȡ�ù����ռ����
     *
     * @param workspaceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceBean doGetWorkspaceById(
        final long workspaceId) throws Exception;

    /**
     * ���idȡ�ù����ռ����
     *
     * @param workspaceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.workspace.domain.WorkspaceBean getWorkspaceById(
        final long workspaceId) throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceBean result = doGetWorkspaceById(workspaceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceById error", e);
            throw e;
        } // end catch
    } // end getWorkspaceById()

    /**
     * ���idȡ�ù����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceResourceBean doGetWorkspaceResourceById(
        final long workspaceResourceId) throws Exception;

    /**
     * ���idȡ�ù����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.workspace.domain.WorkspaceResourceBean getWorkspaceResourceById(
        final long workspaceResourceId) throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceResourceBean result = doGetWorkspaceResourceById(workspaceResourceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceResourceById error", e);
            throw e;
        } // end catch
    } // end getWorkspaceResourceById()

    /**
     * �޸Ĺ���ƽ̨��Դ��Ϣ
     *
     * @param workspaceResourceBean
     *
     * @throws Exception
     */
    protected abstract void doModifyWorkspaceResource(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception;

    /**
     * �޸Ĺ���ƽ̨��Դ��Ϣ
     *
     * @param workspaceResourceBean
     *
     * @throws Exception
     */
    public void modifyWorkspaceResource(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception {
        try {
            doModifyWorkspaceResource(workspaceResourceBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyWorkspaceResource error", e);
            throw e;
        } // end catch
    } // end modifyWorkspaceResource()

    /**
     * ȡ����Դ��ҵ���Ĺ���
     *
     * @param resourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean[] doGetWorkspaceResourceBusinessPackageRelates(
        final long resourceId) throws Exception;

    /**
     * ȡ����Դ��ҵ���Ĺ���
     *
     * @param resourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean[] getWorkspaceResourceBusinessPackageRelates(
        final long resourceId) throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean[] result =
                doGetWorkspaceResourceBusinessPackageRelates(resourceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceResourceBusinessPackageRelates error",
                e);
            throw e;
        } // end catch
    } // end getWorkspaceResourceBusinessPackageRelates()

    /**
     * ��ӹ����ռ���Դ��ҵ��ģ�Ͱ����
     *
     * @param resourceId
     * @param businessPackageId
     *
     * @throws Exception
     */
    protected abstract void doAddWorkspaceResourceBusinessPackageRelate(
        final long resourceId, final long[] businessPackageId)
        throws Exception;

    /**
     * ��ӹ����ռ���Դ��ҵ��ģ�Ͱ����
     *
     * @param resourceId
     * @param businessPackageId
     *
     * @throws Exception
     */
    public void addWorkspaceResourceBusinessPackageRelate(
        final long resourceId, final long[] businessPackageId)
        throws Exception {
        try {
            doAddWorkspaceResourceBusinessPackageRelate(resourceId,
                businessPackageId);
        } // end try
        catch (Exception e) {
            logger.error("do addWorkspaceResourceBusinessPackageRelate error", e);
            throw e;
        } // end catch
    } // end addWorkspaceResourceBusinessPackageRelate()

    /**
     * ɾ�����ռ���Դ��ҵ��ģ�Ͱ����
     *
     * @param relateIds
     *
     * @throws Exception
     */
    protected abstract void doRemoveWorkspaceResourceBusinessPackageRelates(
        final long[] relateIds) throws Exception;

    /**
     * ɾ�����ռ���Դ��ҵ��ģ�Ͱ����
     *
     * @param relateIds
     *
     * @throws Exception
     */
    public void removeWorkspaceResourceBusinessPackageRelates(
        final long[] relateIds) throws Exception {
        try {
            doRemoveWorkspaceResourceBusinessPackageRelates(relateIds);
        } // end try
        catch (Exception e) {
            logger.error("do removeWorkspaceResourceBusinessPackageRelates error",
                e);
            throw e;
        } // end catch
    } // end removeWorkspaceResourceBusinessPackageRelates()

    /**
     * ȡ�ù�����Դ�ļ�
     *
     * @param workspaceResourceBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract java.io.File doGetWorkspaceResourceFileObject(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception;

    /**
     * ȡ�ù�����Դ�ļ�
     *
     * @param workspaceResourceBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public java.io.File getWorkspaceResourceFileObject(
        final com.ourteam.workspace.domain.WorkspaceResourceBean workspaceResourceBean)
        throws Exception {
        try {
            if (workspaceResourceBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [workspaceResourceBean] Value is NULL");
            } // end if

            java.io.File result = doGetWorkspaceResourceFileObject(workspaceResourceBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceResourceFileObject error", e);
            throw e;
        } // end catch
    } // end getWorkspaceResourceFileObject()

    /**
     * ȡ�ù����ռ�����
     *
     * @param workspaceId
     * @param parentWorkspaceConfigId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceConfigBean[] doGetWorkspaceConfigs(
        final long workspaceId, final long parentWorkspaceConfigId)
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
     */
    public com.ourteam.workspace.domain.WorkspaceConfigBean[] getWorkspaceConfigs(
        final long workspaceId, final long parentWorkspaceConfigId)
        throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceConfigBean[] result = doGetWorkspaceConfigs(workspaceId,
                    parentWorkspaceConfigId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceConfigs error", e);
            throw e;
        } // end catch
    } // end getWorkspaceConfigs()

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
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] doGetWorkspaceConfigProperties(
        final long workspaceId, final long workspaceConfigId)
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
     */
    public com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] getWorkspaceConfigProperties(
        final long workspaceId, final long workspaceConfigId)
        throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] result = doGetWorkspaceConfigProperties(workspaceId,
                    workspaceConfigId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceConfigProperties error", e);
            throw e;
        } // end catch
    } // end getWorkspaceConfigProperties()

    /**
     * 
    DOCUMENT ME!
     *
     * @param workspaceId
     * @param workspaceConfigId
     * @param workspaceConfigPropertyBeans
     *
     * @throws Exception
     */
    protected abstract void doSetWorkspaceConfigProperties(
        final long workspaceId, final long workspaceConfigId,
        final com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] workspaceConfigPropertyBeans)
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
     */
    public void setWorkspaceConfigProperties(final long workspaceId,
        final long workspaceConfigId,
        final com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] workspaceConfigPropertyBeans)
        throws Exception {
        try {
            doSetWorkspaceConfigProperties(workspaceId, workspaceConfigId,
                workspaceConfigPropertyBeans);
        } // end try
        catch (Exception e) {
            logger.error("do setWorkspaceConfigProperties error", e);
            throw e;
        } // end catch
    } // end setWorkspaceConfigProperties()

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
     */
    protected abstract com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] doGetWorkspaceConfigPropertiesByConfigItem(
        final long workspaceId, final String configItem)
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
     */
    public com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] getWorkspaceConfigPropertiesByConfigItem(
        final long workspaceId, final String configItem)
        throws Exception {
        try {
            com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] result = doGetWorkspaceConfigPropertiesByConfigItem(workspaceId,
                    configItem);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceConfigPropertiesByConfigItem error", e);
            throw e;
        } // end catch
    } // end getWorkspaceConfigPropertiesByConfigItem()

    /**
     * �����ĿIDȡ�÷����б�
     *
     * @param projectId
     * @param serverTypeEnums
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareBean[] doGetServersByProjectIds(
        final long[] projectId,
        final com.ourteam.middleware.domain.MiddleWareTypeEnum[] serverTypeEnums)
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
     */
    public com.ourteam.middleware.domain.MiddleWareBean[] getServersByProjectIds(
        final long[] projectId,
        final com.ourteam.middleware.domain.MiddleWareTypeEnum[] serverTypeEnums)
        throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareBean[] result = doGetServersByProjectIds(projectId,
                    serverTypeEnums);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getServersByProjectIds error", e);
            throw e;
        } // end catch
    } // end getServersByProjectIds()

    /**
     * ������������ù����ռ�����
     *
     * @param workspaceId
     * @param configItem
     * @param workspaceConfigPropertyBean
     *
     * @throws Exception
     */
    protected abstract void doSetWorkspaceConfigPropertiesByConfigItem(
        final long workspaceId, final String configItem,
        final com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] workspaceConfigPropertyBean)
        throws Exception;

    /**
     * ������������ù����ռ�����
     *
     * @param workspaceId
     * @param configItem
     * @param workspaceConfigPropertyBean
     *
     * @throws Exception
     */
    public void setWorkspaceConfigPropertiesByConfigItem(
        final long workspaceId, final String configItem,
        final com.ourteam.workspace.domain.WorkspaceConfigPropertyBean[] workspaceConfigPropertyBean)
        throws Exception {
        try {
            doSetWorkspaceConfigPropertiesByConfigItem(workspaceId, configItem,
                workspaceConfigPropertyBean);
        } // end try
        catch (Exception e) {
            logger.error("do setWorkspaceConfigPropertiesByConfigItem error", e);
            throw e;
        } // end catch
    } // end setWorkspaceConfigPropertiesByConfigItem()

    /**
     * 
    DOCUMENT ME!
     *
     * @param workspace
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract java.io.File doGetWorkspaceFileObject(
        final com.ourteam.workspace.domain.WorkspaceBean workspace)
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
     */
    public java.io.File getWorkspaceFileObject(
        final com.ourteam.workspace.domain.WorkspaceBean workspace)
        throws Exception {
        try {
            if (workspace == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [workspace] Value is NULL");
            } // end if

            java.io.File result = doGetWorkspaceFileObject(workspace);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceFileObject error", e);
            throw e;
        } // end catch
    } // end getWorkspaceFileObject()

    /**
     * 
    DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract java.io.File doGetWorkspaceRootFileObject()
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public java.io.File getWorkspaceRootFileObject() throws Exception {
        try {
            java.io.File result = doGetWorkspaceRootFileObject();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getWorkspaceRootFileObject error", e);
            throw e;
        } // end catch
    } // end getWorkspaceRootFileObject()

    /**
     * ɾ�����ռ�
     *
     * @param workspaceId
     *
     * @throws Exception
     */
    protected abstract void doDeleteWorkspace(final long workspaceId)
        throws Exception;

    /**
     * ɾ�����ռ�
     *
     * @param workspaceId
     *
     * @throws Exception
     */
    public void deleteWorkspace(final long workspaceId)
        throws Exception {
        try {
            doDeleteWorkspace(workspaceId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteWorkspace error", e);
            throw e;
        } // end catch
    } // end deleteWorkspace()

    /**
     * ɾ�����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @throws Exception
     */
    protected abstract void doDeleteWorkspaceResource(
        final long workspaceResourceId) throws Exception;

    /**
     * ɾ�����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @throws Exception
     */
    public void deleteWorkspaceResource(final long workspaceResourceId)
        throws Exception {
        try {
            doDeleteWorkspaceResource(workspaceResourceId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteWorkspaceResource error", e);
            throw e;
        } // end catch
    } // end deleteWorkspaceResource()

    /**
     * ȥ�����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @throws Exception
     */
    protected abstract void doRemoveWorkspaceResource(
        final long workspaceResourceId) throws Exception;

    /**
     * ȥ�����ռ���Դ
     *
     * @param workspaceResourceId
     *
     * @throws Exception
     */
    public void removeWorkspaceResource(final long workspaceResourceId)
        throws Exception {
        try {
            doRemoveWorkspaceResource(workspaceResourceId);
        } // end try
        catch (Exception e) {
            logger.error("do removeWorkspaceResource error", e);
            throw e;
        } // end catch
    } // end removeWorkspaceResource()

    /**
     * �����Ŀ����
     *
     * @param middleWareServerId
     * @param projectId
     *
     * @throws Exception
     */
    protected abstract void doAddServerToProject(
        final long middleWareServerId, final long projectId)
        throws Exception;

    /**
     * �����Ŀ����
     *
     * @param middleWareServerId
     * @param projectId
     *
     * @throws Exception
     */
    public void addServerToProject(final long middleWareServerId,
        final long projectId) throws Exception {
        try {
            doAddServerToProject(middleWareServerId, projectId);
        } // end try
        catch (Exception e) {
            logger.error("do addServerToProject error", e);
            throw e;
        } // end catch
    } // end addServerToProject()
} // end AbstractWorkspaceService
