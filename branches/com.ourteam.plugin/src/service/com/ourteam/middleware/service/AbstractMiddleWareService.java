/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 中间件管理服务 Generated Date 2011-12-09 11:22:04
 *
 * @author Auto Gen
 */
abstract class AbstractMiddleWareService extends net.service.DefaultServiceImpl
    implements IMiddleWareService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractMiddleWareService.class);

    /** MiddleWare DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareDAO middleWareDao;

    /** MiddleWareToolGroup DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareToolGroupDAO middleWareToolGroupDao;

    /** MiddleWareProvider DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareProviderDAO middleWareProviderDao;

    /** MiddleWareTool DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareToolDAO middleWareToolDao;

    /** MiddleWareToolInput DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareToolInputDAO middleWareToolInputDao;

    /** MiddleWareToolInputOption DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO middleWareToolInputOptionDao;

    /** MiddleWareToolLog DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareToolLogDAO middleWareToolLogDao;

    /** MiddleWareToolInputLog DAO Instance */
    protected com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO middleWareToolInputLogDao;

    /**
     * Get MiddleWare DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareDAO getMiddleWareDao() {
        return middleWareDao;
    } // end getMiddleWareDao()

    /**
     * Set MiddleWare DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareDao(com.ourteam.middleware.dao.IMiddleWareDAO aDao) {
        middleWareDao = aDao;
    } // end setMiddleWareDao()

    /**
     * Get MiddleWareToolGroup DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareToolGroupDAO getMiddleWareToolGroupDao() {
        return middleWareToolGroupDao;
    } // end getMiddleWareToolGroupDao()

    /**
     * Set MiddleWareToolGroup DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareToolGroupDao(
        com.ourteam.middleware.dao.IMiddleWareToolGroupDAO aDao) {
        middleWareToolGroupDao = aDao;
    } // end setMiddleWareToolGroupDao()

    /**
     * Get MiddleWareProvider DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareProviderDAO getMiddleWareProviderDao() {
        return middleWareProviderDao;
    } // end getMiddleWareProviderDao()

    /**
     * Set MiddleWareProvider DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareProviderDao(
        com.ourteam.middleware.dao.IMiddleWareProviderDAO aDao) {
        middleWareProviderDao = aDao;
    } // end setMiddleWareProviderDao()

    /**
     * Get MiddleWareTool DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareToolDAO getMiddleWareToolDao() {
        return middleWareToolDao;
    } // end getMiddleWareToolDao()

    /**
     * Set MiddleWareTool DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareToolDao(
        com.ourteam.middleware.dao.IMiddleWareToolDAO aDao) {
        middleWareToolDao = aDao;
    } // end setMiddleWareToolDao()

    /**
     * Get MiddleWareToolInput DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareToolInputDAO getMiddleWareToolInputDao() {
        return middleWareToolInputDao;
    } // end getMiddleWareToolInputDao()

    /**
     * Set MiddleWareToolInput DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareToolInputDao(
        com.ourteam.middleware.dao.IMiddleWareToolInputDAO aDao) {
        middleWareToolInputDao = aDao;
    } // end setMiddleWareToolInputDao()

    /**
     * Get MiddleWareToolInputOption DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO getMiddleWareToolInputOptionDao() {
        return middleWareToolInputOptionDao;
    } // end getMiddleWareToolInputOptionDao()

    /**
     * Set MiddleWareToolInputOption DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareToolInputOptionDao(
        com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO aDao) {
        middleWareToolInputOptionDao = aDao;
    } // end setMiddleWareToolInputOptionDao()

    /**
     * Get MiddleWareToolLog DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareToolLogDAO getMiddleWareToolLogDao() {
        return middleWareToolLogDao;
    } // end getMiddleWareToolLogDao()

    /**
     * Set MiddleWareToolLog DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareToolLogDao(
        com.ourteam.middleware.dao.IMiddleWareToolLogDAO aDao) {
        middleWareToolLogDao = aDao;
    } // end setMiddleWareToolLogDao()

    /**
     * Get MiddleWareToolInputLog DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO getMiddleWareToolInputLogDao() {
        return middleWareToolInputLogDao;
    } // end getMiddleWareToolInputLogDao()

    /**
     * Set MiddleWareToolInputLog DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setMiddleWareToolInputLogDao(
        com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO aDao) {
        middleWareToolInputLogDao = aDao;
    } // end setMiddleWareToolInputLogDao()

    /**
     * 查询中间件
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareBean[] doQueryMiddleWare(
        final com.ourteam.middleware.dao.MiddleWareDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询中间件
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareBean[] queryMiddleWare(
        final com.ourteam.middleware.dao.MiddleWareDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareBean[] result = doQueryMiddleWare(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryMiddleWare error", e);
            throw e;
        } // end catch
    } // end queryMiddleWare()

    /**
     * 查询中间件数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryMiddleWareCount(
        final com.ourteam.middleware.dao.MiddleWareDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询中间件数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryMiddleWareCount(
        final com.ourteam.middleware.dao.MiddleWareDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryMiddleWareCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryMiddleWareCount error", e);
            throw e;
        } // end catch
    } // end queryMiddleWareCount()

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareBean doGetMiddleWareById(
        final long middleWareId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareBean getMiddleWareById(
        final long middleWareId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareBean result = doGetMiddleWareById(middleWareId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareById error", e);
            throw e;
        } // end catch
    } // end getMiddleWareById()

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareTypeEnum
     * @param groupId
     * @param middleWareBean
     *
     * @throws Exception
     */
    protected abstract void doAddMiddleWare(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareTypeEnum,
        final long groupId,
        final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareTypeEnum
     * @param groupId
     * @param middleWareBean
     *
     * @throws Exception
     */
    public void addMiddleWare(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareTypeEnum,
        final long groupId,
        final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
        throws Exception {
        try {
            if (middleWareTypeEnum == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareTypeEnum] Value is NULL");
            } // end if

            if (middleWareBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareBean] Value is NULL");
            } // end if

            doAddMiddleWare(middleWareTypeEnum, groupId, middleWareBean);
        } // end try
        catch (Exception e) {
            logger.error("do addMiddleWare error", e);
            throw e;
        } // end catch
    } // end addMiddleWare()

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareBean
     *
     * @throws Exception
     */
    protected abstract void doModifyMiddleWare(
        final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareBean
     *
     * @throws Exception
     */
    public void modifyMiddleWare(
        final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
        throws Exception {
        try {
            if (middleWareBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareBean] Value is NULL");
            } // end if

            doModifyMiddleWare(middleWareBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyMiddleWare error", e);
            throw e;
        } // end catch
    } // end modifyMiddleWare()

    /**
     * 删除中间件
     *
     * @param middleWareIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteMiddleWare(final long[] middleWareIds)
        throws Exception;

    /**
     * 删除中间件
     *
     * @param middleWareIds
     *
     * @throws Exception
     */
    public void deleteMiddleWare(final long[] middleWareIds)
        throws Exception {
        try {
            doDeleteMiddleWare(middleWareIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteMiddleWare error", e);
            throw e;
        } // end catch
    } // end deleteMiddleWare()

    /**
     * 添加中间件工具分组
     *
     * @param providerId
     * @param middleWareToolGroup
     *
     * @throws Exception
     */
    protected abstract void doAddMiddleWareToolGroup(final long providerId,
        final com.ourteam.middleware.domain.MiddleWareToolGroupBean middleWareToolGroup)
        throws Exception;

    /**
     * 添加中间件工具分组
     *
     * @param providerId
     * @param middleWareToolGroup
     *
     * @throws Exception
     */
    public void addMiddleWareToolGroup(final long providerId,
        final com.ourteam.middleware.domain.MiddleWareToolGroupBean middleWareToolGroup)
        throws Exception {
        try {
            if (middleWareToolGroup == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareToolGroup] Value is NULL");
            } // end if

            doAddMiddleWareToolGroup(providerId, middleWareToolGroup);
        } // end try
        catch (Exception e) {
            logger.error("do addMiddleWareToolGroup error", e);
            throw e;
        } // end catch
    } // end addMiddleWareToolGroup()

    /**
     * 取得中间件工具分组
     *
     * @param providerId
     * @param parentGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolGroupBean[] doGetMiddleWareToolGroups(
        final long providerId, final long parentGroupId)
        throws Exception;

    /**
     * 取得中间件工具分组
     *
     * @param providerId
     * @param parentGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolGroupBean[] getMiddleWareToolGroups(
        final long providerId, final long parentGroupId)
        throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolGroupBean[] result = doGetMiddleWareToolGroups(providerId,
                    parentGroupId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareToolGroups error", e);
            throw e;
        } // end catch
    } // end getMiddleWareToolGroups()

    /**
     * 编辑中间件工具分组
     *
     * @param middleWareToolGroup
     *
     * @throws Exception
     */
    protected abstract void doModifyMiddleWareToolGroup(
        final com.ourteam.middleware.domain.MiddleWareToolGroupBean middleWareToolGroup)
        throws Exception;

    /**
     * 编辑中间件工具分组
     *
     * @param middleWareToolGroup
     *
     * @throws Exception
     */
    public void modifyMiddleWareToolGroup(
        final com.ourteam.middleware.domain.MiddleWareToolGroupBean middleWareToolGroup)
        throws Exception {
        try {
            if (middleWareToolGroup == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareToolGroup] Value is NULL");
            } // end if

            doModifyMiddleWareToolGroup(middleWareToolGroup);
        } // end try
        catch (Exception e) {
            logger.error("do modifyMiddleWareToolGroup error", e);
            throw e;
        } // end catch
    } // end modifyMiddleWareToolGroup()

    /**
     * 删除中间件工具分组
     *
     * @param middleWareToolGroupIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteMiddleWareToolGroups(
        final long[] middleWareToolGroupIds) throws Exception;

    /**
     * 删除中间件工具分组
     *
     * @param middleWareToolGroupIds
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolGroups(final long[] middleWareToolGroupIds)
        throws Exception {
        try {
            doDeleteMiddleWareToolGroups(middleWareToolGroupIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteMiddleWareToolGroups error", e);
            throw e;
        } // end catch
    } // end deleteMiddleWareToolGroups()

    /**
     * 根据ID取工具得分组信息
     *
     * @param middleWareToolGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolGroupBean doGetMiddleWareToolGroupById(
        final long middleWareToolGroupId) throws Exception;

    /**
     * 根据ID取工具得分组信息
     *
     * @param middleWareToolGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolGroupBean getMiddleWareToolGroupById(
        final long middleWareToolGroupId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolGroupBean result = doGetMiddleWareToolGroupById(middleWareToolGroupId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareToolGroupById error", e);
            throw e;
        } // end catch
    } // end getMiddleWareToolGroupById()

    /**
     * 取得最大工具分组排序
     *
     * @param providerId
     * @param parentGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetMaxMiddleWareToolGroupSortIndex(
        final long providerId, final long parentGroupId)
        throws Exception;

    /**
     * 取得最大工具分组排序
     *
     * @param providerId
     * @param parentGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getMaxMiddleWareToolGroupSortIndex(final long providerId,
        final long parentGroupId) throws Exception {
        try {
            int result = doGetMaxMiddleWareToolGroupSortIndex(providerId,
                    parentGroupId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMaxMiddleWareToolGroupSortIndex error", e);
            throw e;
        } // end catch
    } // end getMaxMiddleWareToolGroupSortIndex()

    /**
     * 取得中间件提供商
     *
     * @param middleWareType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareProviderBean[] doGetMiddleWareProviders(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareType)
        throws Exception;

    /**
     * 取得中间件提供商
     *
     * @param middleWareType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareProviderBean[] getMiddleWareProviders(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareType)
        throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareProviderBean[] result = doGetMiddleWareProviders(middleWareType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareProviders error", e);
            throw e;
        } // end catch
    } // end getMiddleWareProviders()

    /**
     * 添加中间件提供商
     *
     * @param middleWareType
     * @param middleWareProvider
     *
     * @throws Exception
     */
    protected abstract void doAddMiddleWareProvider(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareType,
        final com.ourteam.middleware.domain.MiddleWareProviderBean middleWareProvider)
        throws Exception;

    /**
     * 添加中间件提供商
     *
     * @param middleWareType
     * @param middleWareProvider
     *
     * @throws Exception
     */
    public void addMiddleWareProvider(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareType,
        final com.ourteam.middleware.domain.MiddleWareProviderBean middleWareProvider)
        throws Exception {
        try {
            if (middleWareType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareType] Value is NULL");
            } // end if

            if (middleWareProvider == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareProvider] Value is NULL");
            } // end if

            doAddMiddleWareProvider(middleWareType, middleWareProvider);
        } // end try
        catch (Exception e) {
            logger.error("do addMiddleWareProvider error", e);
            throw e;
        } // end catch
    } // end addMiddleWareProvider()

    /**
     * 修改中间件提供商
     *
     * @param middleWareProvider
     *
     * @throws Exception
     */
    protected abstract void doModifyMiddleWareProvider(
        final com.ourteam.middleware.domain.MiddleWareProviderBean middleWareProvider)
        throws Exception;

    /**
     * 修改中间件提供商
     *
     * @param middleWareProvider
     *
     * @throws Exception
     */
    public void modifyMiddleWareProvider(
        final com.ourteam.middleware.domain.MiddleWareProviderBean middleWareProvider)
        throws Exception {
        try {
            if (middleWareProvider == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareProvider] Value is NULL");
            } // end if

            doModifyMiddleWareProvider(middleWareProvider);
        } // end try
        catch (Exception e) {
            logger.error("do modifyMiddleWareProvider error", e);
            throw e;
        } // end catch
    } // end modifyMiddleWareProvider()

    /**
     * 删除中间件提供商
     *
     * @param middleWareProviderIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteMiddleWareProviders(
        final long[] middleWareProviderIds) throws Exception;

    /**
     * 删除中间件提供商
     *
     * @param middleWareProviderIds
     *
     * @throws Exception
     */
    public void deleteMiddleWareProviders(final long[] middleWareProviderIds)
        throws Exception {
        try {
            doDeleteMiddleWareProviders(middleWareProviderIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteMiddleWareProviders error", e);
            throw e;
        } // end catch
    } // end deleteMiddleWareProviders()

    /**
     * 根据ID取得中间件提供商信息
     *
     * @param middleWareProviderId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareProviderBean doGetMiddleWareProviderById(
        final long middleWareProviderId) throws Exception;

    /**
     * 根据ID取得中间件提供商信息
     *
     * @param middleWareProviderId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareProviderBean getMiddleWareProviderById(
        final long middleWareProviderId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareProviderBean result = doGetMiddleWareProviderById(middleWareProviderId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareProviderById error", e);
            throw e;
        } // end catch
    } // end getMiddleWareProviderById()

    /**
     * 添加中间件管理工具
     *
     * @param toolGroupId
     * @param middleWareTool
     *
     * @throws Exception
     */
    protected abstract void doAddMiddleWareTool(final long toolGroupId,
        final com.ourteam.middleware.domain.MiddleWareToolBean middleWareTool)
        throws Exception;

    /**
     * 添加中间件管理工具
     *
     * @param toolGroupId
     * @param middleWareTool
     *
     * @throws Exception
     */
    public void addMiddleWareTool(final long toolGroupId,
        final com.ourteam.middleware.domain.MiddleWareToolBean middleWareTool)
        throws Exception {
        try {
            if (middleWareTool == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareTool] Value is NULL");
            } // end if

            doAddMiddleWareTool(toolGroupId, middleWareTool);
        } // end try
        catch (Exception e) {
            logger.error("do addMiddleWareTool error", e);
            throw e;
        } // end catch
    } // end addMiddleWareTool()

    /**
     * 修改中间件管理工具
     *
     * @param middleWareTool
     *
     * @throws Exception
     */
    protected abstract void doModifyMiddleWareTool(
        final com.ourteam.middleware.domain.MiddleWareToolBean middleWareTool)
        throws Exception;

    /**
     * 修改中间件管理工具
     *
     * @param middleWareTool
     *
     * @throws Exception
     */
    public void modifyMiddleWareTool(
        final com.ourteam.middleware.domain.MiddleWareToolBean middleWareTool)
        throws Exception {
        try {
            if (middleWareTool == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareTool] Value is NULL");
            } // end if

            doModifyMiddleWareTool(middleWareTool);
        } // end try
        catch (Exception e) {
            logger.error("do modifyMiddleWareTool error", e);
            throw e;
        } // end catch
    } // end modifyMiddleWareTool()

    /**
     * 删除中间件管理工具
     *
     * @param middleWareToolIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteMiddleWareTools(
        final long[] middleWareToolIds) throws Exception;

    /**
     * 删除中间件管理工具
     *
     * @param middleWareToolIds
     *
     * @throws Exception
     */
    public void deleteMiddleWareTools(final long[] middleWareToolIds)
        throws Exception {
        try {
            doDeleteMiddleWareTools(middleWareToolIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteMiddleWareTools error", e);
            throw e;
        } // end catch
    } // end deleteMiddleWareTools()

    /**
     * 根据ID取得中间件工具
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolBean doGetMiddleWareToolById(
        final long middleWareToolId) throws Exception;

    /**
     * 根据ID取得中间件工具
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolBean getMiddleWareToolById(
        final long middleWareToolId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolBean result = doGetMiddleWareToolById(middleWareToolId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareToolById error", e);
            throw e;
        } // end catch
    } // end getMiddleWareToolById()

    /**
     * 取得中间件管理工具
     *
     * @param toolGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolBean[] doGetMiddleWareTools(
        final long toolGroupId) throws Exception;

    /**
     * 取得中间件管理工具
     *
     * @param toolGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolBean[] getMiddleWareTools(
        final long toolGroupId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolBean[] result = doGetMiddleWareTools(toolGroupId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareTools error", e);
            throw e;
        } // end catch
    } // end getMiddleWareTools()

    /**
     * 添加中间件工具输入
     *
     * @param middleWareToolId
     * @param middleWareToolInput
     *
     * @throws Exception
     */
    protected abstract void doAddMiddleWareToolInput(
        final long middleWareToolId,
        final com.ourteam.middleware.domain.MiddleWareToolInputBean middleWareToolInput)
        throws Exception;

    /**
     * 添加中间件工具输入
     *
     * @param middleWareToolId
     * @param middleWareToolInput
     *
     * @throws Exception
     */
    public void addMiddleWareToolInput(final long middleWareToolId,
        final com.ourteam.middleware.domain.MiddleWareToolInputBean middleWareToolInput)
        throws Exception {
        try {
            if (middleWareToolInput == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareToolInput] Value is NULL");
            } // end if

            doAddMiddleWareToolInput(middleWareToolId, middleWareToolInput);
        } // end try
        catch (Exception e) {
            logger.error("do addMiddleWareToolInput error", e);
            throw e;
        } // end catch
    } // end addMiddleWareToolInput()

    /**
     * 编辑中间件工具输入
     *
     * @param middleWareToolInput
     *
     * @throws Exception
     */
    protected abstract void doModifyMiddleWareToolInput(
        final com.ourteam.middleware.domain.MiddleWareToolInputBean middleWareToolInput)
        throws Exception;

    /**
     * 编辑中间件工具输入
     *
     * @param middleWareToolInput
     *
     * @throws Exception
     */
    public void modifyMiddleWareToolInput(
        final com.ourteam.middleware.domain.MiddleWareToolInputBean middleWareToolInput)
        throws Exception {
        try {
            if (middleWareToolInput == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareToolInput] Value is NULL");
            } // end if

            doModifyMiddleWareToolInput(middleWareToolInput);
        } // end try
        catch (Exception e) {
            logger.error("do modifyMiddleWareToolInput error", e);
            throw e;
        } // end catch
    } // end modifyMiddleWareToolInput()

    /**
     * 删除中间件工具输入
     *
     * @param middleWareToolInputIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteMiddleWareToolInputs(
        final long[] middleWareToolInputIds) throws Exception;

    /**
     * 删除中间件工具输入
     *
     * @param middleWareToolInputIds
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolInputs(final long[] middleWareToolInputIds)
        throws Exception {
        try {
            doDeleteMiddleWareToolInputs(middleWareToolInputIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteMiddleWareToolInputs error", e);
            throw e;
        } // end catch
    } // end deleteMiddleWareToolInputs()

    /**
     * 取得中间件工具输入
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolInputBean[] doGetMiddleWareToolInputs(
        final long middleWareToolId) throws Exception;

    /**
     * 取得中间件工具输入
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolInputBean[] getMiddleWareToolInputs(
        final long middleWareToolId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolInputBean[] result = doGetMiddleWareToolInputs(middleWareToolId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareToolInputs error", e);
            throw e;
        } // end catch
    } // end getMiddleWareToolInputs()

    /**
     * 根据ID取得中间件工具输入
     *
     * @param middleWareToolInputId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolInputBean doGetMiddleWareToolInputById(
        final long middleWareToolInputId) throws Exception;

    /**
     * 根据ID取得中间件工具输入
     *
     * @param middleWareToolInputId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolInputBean getMiddleWareToolInputById(
        final long middleWareToolInputId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolInputBean result = doGetMiddleWareToolInputById(middleWareToolInputId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareToolInputById error", e);
            throw e;
        } // end catch
    } // end getMiddleWareToolInputById()

    /**
     * 取得中间件工具输入最大排序索引
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetMaxMiddleWareToolInputSortIndex(
        final long middleWareToolId) throws Exception;

    /**
     * 取得中间件工具输入最大排序索引
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getMaxMiddleWareToolInputSortIndex(final long middleWareToolId)
        throws Exception {
        try {
            int result = doGetMaxMiddleWareToolInputSortIndex(middleWareToolId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMaxMiddleWareToolInputSortIndex error", e);
            throw e;
        } // end catch
    } // end getMaxMiddleWareToolInputSortIndex()

    /**
     * 设置工具输入选项
     *
     * @param toolInputId
     * @param inputOptions
     *
     * @throws Exception
     */
    protected abstract void doSetMiddleWareToolInputOptions(
        final long toolInputId,
        final com.ourteam.middleware.domain.MiddleWareToolInputOptionBean[] inputOptions)
        throws Exception;

    /**
     * 设置工具输入选项
     *
     * @param toolInputId
     * @param inputOptions
     *
     * @throws Exception
     */
    public void setMiddleWareToolInputOptions(final long toolInputId,
        final com.ourteam.middleware.domain.MiddleWareToolInputOptionBean[] inputOptions)
        throws Exception {
        try {
            doSetMiddleWareToolInputOptions(toolInputId, inputOptions);
        } // end try
        catch (Exception e) {
            logger.error("do setMiddleWareToolInputOptions error", e);
            throw e;
        } // end catch
    } // end setMiddleWareToolInputOptions()

    /**
     * 取得工具输入选项
     *
     * @param toolInputId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolInputOptionBean[] doGetMiddleWareToolInputOptions(
        final long toolInputId) throws Exception;

    /**
     * 取得工具输入选项
     *
     * @param toolInputId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolInputOptionBean[] getMiddleWareToolInputOptions(
        final long toolInputId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolInputOptionBean[] result =
                doGetMiddleWareToolInputOptions(toolInputId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareToolInputOptions error", e);
            throw e;
        } // end catch
    } // end getMiddleWareToolInputOptions()

    /**
     * 添加工具执行Log
     *
     * @param middleWareToolLog
     * @param middleWareToolInputLogs
     *
     * @throws Exception
     */
    protected abstract void doAddMiddleWareToolExecuteLog(
        final com.ourteam.middleware.domain.MiddleWareToolLogBean middleWareToolLog,
        final com.ourteam.middleware.domain.MiddleWareToolInputLogBean[] middleWareToolInputLogs)
        throws Exception;

    /**
     * 添加工具执行Log
     *
     * @param middleWareToolLog
     * @param middleWareToolInputLogs
     *
     * @throws Exception
     */
    public void addMiddleWareToolExecuteLog(
        final com.ourteam.middleware.domain.MiddleWareToolLogBean middleWareToolLog,
        final com.ourteam.middleware.domain.MiddleWareToolInputLogBean[] middleWareToolInputLogs)
        throws Exception {
        try {
            if (middleWareToolLog == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [middleWareToolLog] Value is NULL");
            } // end if

            doAddMiddleWareToolExecuteLog(middleWareToolLog,
                middleWareToolInputLogs);
        } // end try
        catch (Exception e) {
            logger.error("do addMiddleWareToolExecuteLog error", e);
            throw e;
        } // end catch
    } // end addMiddleWareToolExecuteLog()

    /**
     * 查询工具执行日志
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolLogBean[] doQueryMiddleWareToolExecuteLogs(
        final com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询工具执行日志
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolLogBean[] queryMiddleWareToolExecuteLogs(
        final com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolLogBean[] result = doQueryMiddleWareToolExecuteLogs(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryMiddleWareToolExecuteLogs error", e);
            throw e;
        } // end catch
    } // end queryMiddleWareToolExecuteLogs()

    /**
     * 查询工具执行日志数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryMiddleWareToolExecuteLogCount(
        final com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询工具执行日志数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryMiddleWareToolExecuteLogCount(
        final com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryMiddleWareToolExecuteLogCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryMiddleWareToolExecuteLogCount error", e);
            throw e;
        } // end catch
    } // end queryMiddleWareToolExecuteLogCount()

    /**
     * 取得工具执行输入日志
     *
     * @param middleWareToolLogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.middleware.domain.MiddleWareToolInputLogBean[] doGetMiddleWareToolInputLogs(
        final long middleWareToolLogId) throws Exception;

    /**
     * 取得工具执行输入日志
     *
     * @param middleWareToolLogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.middleware.domain.MiddleWareToolInputLogBean[] getMiddleWareToolInputLogs(
        final long middleWareToolLogId) throws Exception {
        try {
            com.ourteam.middleware.domain.MiddleWareToolInputLogBean[] result = doGetMiddleWareToolInputLogs(middleWareToolLogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMiddleWareToolInputLogs error", e);
            throw e;
        } // end catch
    } // end getMiddleWareToolInputLogs()
} // end AbstractMiddleWareService
