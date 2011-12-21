/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.service;

/**
*  �м���������
*  Generated Date 2011-12-09 11:21:19   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IMiddleWareService {
    /**
     * ��ѯ�м��
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
     * ��ѯ�м������
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
     * ɾ���м��
     *
     * @param middleWareIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWare(final long[] middleWareIds) throws Exception;

    /**
     * ����м�����߷���
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
     * ȡ���м�����߷���
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
     * �༭�м�����߷���
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
     * ɾ���м�����߷���
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
     * ����IDȡ���ߵ÷�����Ϣ
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
     * ȡ����󹤾߷�������
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
     * ȡ���м���ṩ��
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
     * ����м���ṩ��
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
     * �޸��м���ṩ��
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
     * ɾ���м���ṩ��
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
     * ����IDȡ���м���ṩ����Ϣ
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
     * ����м��������
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
     * �޸��м��������
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
     * ɾ���м��������
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
     * ����IDȡ���м������
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
     * ȡ���м��������
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
     * ����м����������
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
     * �༭�м����������
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
     * ɾ���м����������
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
     * ȡ���м����������
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
     * ����IDȡ���м����������
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
     * ȡ���м���������������������
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
     * ���ù�������ѡ��
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
     * ȡ�ù�������ѡ��
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
     * ��ӹ���ִ��Log
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
     * ��ѯ����ִ����־
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
     * ��ѯ����ִ����־����
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
     * ȡ�ù���ִ��������־
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
