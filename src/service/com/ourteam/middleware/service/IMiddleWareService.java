/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.service;

/**
*  中间件管理服务
*  Generated Date 2011-12-09 11:21:19   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IMiddleWareService {
    /**
     * 查询中间件
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareBean[] queryMiddleWare(
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
     *
     * @model
     */
    int queryMiddleWareCount(
        final com.ourteam.middleware.dao.MiddleWareDAOQueryBean queryBean)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareBean getMiddleWareById(
        final long middleWareId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareTypeEnum
     * @param groupId
     * @param middleWareBean
     *
     * @throws Exception
     *
     * @model
     */
    void addMiddleWare(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareTypeEnum,
        final long groupId,
        final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param middleWareBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyMiddleWare(
        final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
        throws Exception;

    /**
     * 删除中间件
     *
     * @param middleWareIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWare(final long[] middleWareIds) throws Exception;

    /**
     * 添加中间件工具分组
     *
     * @param providerId
     * @param middleWareToolGroup
     *
     * @throws Exception
     *
     * @model
     */
    void addMiddleWareToolGroup(final long providerId,
        final com.ourteam.middleware.domain.MiddleWareToolGroupBean middleWareToolGroup)
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
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolGroupBean[] getMiddleWareToolGroups(
        final long providerId, final long parentGroupId)
        throws Exception;

    /**
     * 编辑中间件工具分组
     *
     * @param middleWareToolGroup
     *
     * @throws Exception
     *
     * @model
     */
    void modifyMiddleWareToolGroup(
        final com.ourteam.middleware.domain.MiddleWareToolGroupBean middleWareToolGroup)
        throws Exception;

    /**
     * 删除中间件工具分组
     *
     * @param middleWareToolGroupIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolGroups(final long[] middleWareToolGroupIds)
        throws Exception;

    /**
     * 根据ID取工具得分组信息
     *
     * @param middleWareToolGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolGroupBean getMiddleWareToolGroupById(
        final long middleWareToolGroupId) throws Exception;

    /**
     * 取得最大工具分组排序
     *
     * @param providerId
     * @param parentGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxMiddleWareToolGroupSortIndex(final long providerId,
        final long parentGroupId) throws Exception;

    /**
     * 取得中间件提供商
     *
     * @param middleWareType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareProviderBean[] getMiddleWareProviders(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareType)
        throws Exception;

    /**
     * 添加中间件提供商
     *
     * @param middleWareType
     * @param middleWareProvider
     *
     * @throws Exception
     *
     * @model
     */
    void addMiddleWareProvider(
        final com.ourteam.middleware.domain.MiddleWareTypeEnum middleWareType,
        final com.ourteam.middleware.domain.MiddleWareProviderBean middleWareProvider)
        throws Exception;

    /**
     * 修改中间件提供商
     *
     * @param middleWareProvider
     *
     * @throws Exception
     *
     * @model
     */
    void modifyMiddleWareProvider(
        final com.ourteam.middleware.domain.MiddleWareProviderBean middleWareProvider)
        throws Exception;

    /**
     * 删除中间件提供商
     *
     * @param middleWareProviderIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareProviders(final long[] middleWareProviderIds)
        throws Exception;

    /**
     * 根据ID取得中间件提供商信息
     *
     * @param middleWareProviderId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareProviderBean getMiddleWareProviderById(
        final long middleWareProviderId) throws Exception;

    /**
     * 添加中间件管理工具
     *
     * @param toolGroupId
     * @param middleWareTool
     *
     * @throws Exception
     *
     * @model
     */
    void addMiddleWareTool(final long toolGroupId,
        final com.ourteam.middleware.domain.MiddleWareToolBean middleWareTool)
        throws Exception;

    /**
     * 修改中间件管理工具
     *
     * @param middleWareTool
     *
     * @throws Exception
     *
     * @model
     */
    void modifyMiddleWareTool(
        final com.ourteam.middleware.domain.MiddleWareToolBean middleWareTool)
        throws Exception;

    /**
     * 删除中间件管理工具
     *
     * @param middleWareToolIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareTools(final long[] middleWareToolIds)
        throws Exception;

    /**
     * 根据ID取得中间件工具
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolBean getMiddleWareToolById(
        final long middleWareToolId) throws Exception;

    /**
     * 取得中间件管理工具
     *
     * @param toolGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolBean[] getMiddleWareTools(
        final long toolGroupId) throws Exception;

    /**
     * 添加中间件工具输入
     *
     * @param middleWareToolId
     * @param middleWareToolInput
     *
     * @throws Exception
     *
     * @model
     */
    void addMiddleWareToolInput(final long middleWareToolId,
        final com.ourteam.middleware.domain.MiddleWareToolInputBean middleWareToolInput)
        throws Exception;

    /**
     * 编辑中间件工具输入
     *
     * @param middleWareToolInput
     *
     * @throws Exception
     *
     * @model
     */
    void modifyMiddleWareToolInput(
        final com.ourteam.middleware.domain.MiddleWareToolInputBean middleWareToolInput)
        throws Exception;

    /**
     * 删除中间件工具输入
     *
     * @param middleWareToolInputIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInputs(final long[] middleWareToolInputIds)
        throws Exception;

    /**
     * 取得中间件工具输入
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolInputBean[] getMiddleWareToolInputs(
        final long middleWareToolId) throws Exception;

    /**
     * 根据ID取得中间件工具输入
     *
     * @param middleWareToolInputId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolInputBean getMiddleWareToolInputById(
        final long middleWareToolInputId) throws Exception;

    /**
     * 取得中间件工具输入最大排序索引
     *
     * @param middleWareToolId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxMiddleWareToolInputSortIndex(final long middleWareToolId)
        throws Exception;

    /**
     * 设置工具输入选项
     *
     * @param toolInputId
     * @param inputOptions
     *
     * @throws Exception
     *
     * @model
     */
    void setMiddleWareToolInputOptions(final long toolInputId,
        final com.ourteam.middleware.domain.MiddleWareToolInputOptionBean[] inputOptions)
        throws Exception;

    /**
     * 取得工具输入选项
     *
     * @param toolInputId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolInputOptionBean[] getMiddleWareToolInputOptions(
        final long toolInputId) throws Exception;

    /**
     * 添加工具执行Log
     *
     * @param middleWareToolLog
     * @param middleWareToolInputLogs
     *
     * @throws Exception
     *
     * @model
     */
    void addMiddleWareToolExecuteLog(
        final com.ourteam.middleware.domain.MiddleWareToolLogBean middleWareToolLog,
        final com.ourteam.middleware.domain.MiddleWareToolInputLogBean[] middleWareToolInputLogs)
        throws Exception;

    /**
     * 查询工具执行日志
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolLogBean[] queryMiddleWareToolExecuteLogs(
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
     *
     * @model
     */
    int queryMiddleWareToolExecuteLogCount(
        final com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取得工具执行输入日志
     *
     * @param middleWareToolLogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.middleware.domain.MiddleWareToolInputLogBean[] getMiddleWareToolInputLogs(
        final long middleWareToolLogId) throws Exception;
} // end IMiddleWareService
