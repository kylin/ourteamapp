/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  ϵͳӦ�÷���
*  Generated Date 2011-11-01 14:43:00   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISystemApplicationService {
    /**
     * ȡ��ϵͳӦ�����б�
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.ApplicationDomain[] getApplicationDomains()
        throws Exception;

    /**
     * ȡ��Ӧ�ù��ܲ˵�
     *
     * @param aDomainId
     * @param aParentId
     * @param aQueryCallback
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemFunction[] getSystemFunctions(
        long aDomainId, long aParentId,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
        throws Exception;

    /**
     * ȡ��Ӧ���������й��ܲ˵�
     *
     * @param aDomianId
     * @param aQueryCallback
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemFunction[] getAllSystemFunctions(
        long aDomianId,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
        throws Exception;

    /**
     * �½�ϵͳ���ܲ˵�
     *
     * @param aSystemFunctionMenu
     *
     * @throws Exception
     *
     * @model
     */
    void createSystemFunction(
        final com.ourteam.system.domain.SystemFunction aSystemFunctionMenu)
        throws Exception;

    /**
     * ȡ��ϵͳ���ܲ˵��������
     *
     * @param aDomainId
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxSystemFunctionSort(long aDomainId, long aParentId)
        throws Exception;

    /**
     * ȡ��ϵͳ����
     *
     * @param aSysFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemFunction getSystemFunctionById(
        long aSysFunctionId) throws Exception;

    /**
     * ���ϵͳ����
     *
     * @param sSystemFunction
     *
     * @throws Exception
     *
     * @model
     */
    void modifySystemFunction(
        final com.ourteam.system.domain.SystemFunction sSystemFunction)
        throws Exception;

    /**
     * ɾ��ϵͳ����
     *
     * @param aSysFunctionId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSystemFunction(long aSysFunctionId) throws Exception;

    /**
     * ȡ��Ӧ��������
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int queryApplicationDomainCount(
        com.ourteam.system.dao.SysDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * ��ѯӦ����
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.ApplicationDomain[] queryApplicationDomains(
        com.ourteam.system.dao.SysDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * �½�Ӧ����
     *
     * @param aApplicationDomain
     *
     * @throws Exception
     *
     * @model
     */
    void createApplicationDomain(
        final com.ourteam.system.domain.ApplicationDomain aApplicationDomain)
        throws Exception;

    /**
     * ���Ӧ����
     *
     * @param aApplicationDomain
     *
     * @throws Exception
     *
     * @model
     */
    void modifyApplicationDomain(
        final com.ourteam.system.domain.ApplicationDomain aApplicationDomain)
        throws Exception;

    /**
     * ɾ��Ӧ����
     *
     * @param aApplicationDomainId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteApplicationDomain(long aApplicationDomainId)
        throws Exception;

    /**
     * ȡ�����Ӧ��������
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxApplicationDomainSort() throws Exception;

    /**
     * ����Ӧ��������
     *
     * @param aSysDomainId
     * @param aSortIndex
     *
     * @throws Exception
     *
     * @model
     */
    void setSysDomainSortIndex(long aSysDomainId, int aSortIndex)
        throws Exception;

    /**
     * ȡ��ϵͳ����ģ��
     *
     * @param domainId
     * @param parentModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemModule[] getSystemModules(
        final long domainId, final long parentModuleId)
        throws Exception;

    /**
     * ȡ��ϵͳ����
     *
     * @param moduleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemAction[] getSystemActions(
        final long moduleId) throws Exception;

    /**
     * ����idȡ��Ӧ����
     *
     * @param domainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.ApplicationDomain getApplicationDomainById(
        final long domainId) throws Exception;

    /**
     * ����IDȡ��ϵͳģ��
     *
     * @param sysModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemModule getSystemModuleById(
        final long sysModuleId) throws Exception;

    /**
     * ����idȡ��ϵͳ����
     *
     * @param sysActionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemAction getSystemActionById(
        final long sysActionId) throws Exception;

    /**
     * �½�ϵͳģ��
     *
     * @param systemModule
     *
     * @throws Exception
     *
     * @model
     */
    void createSystemModule(
        final com.ourteam.system.domain.SystemModule systemModule)
        throws Exception;

    /**
     * ����ϵͳģ����Ϣ
     *
     * @param systemModule
     *
     * @throws Exception
     *
     * @model
     */
    void modifySystemModule(
        final com.ourteam.system.domain.SystemModule systemModule)
        throws Exception;

    /**
     * ɾ��ϵͳģ����Ϣ
     *
     * @param systemModuleId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSystemModule(final long systemModuleId)
        throws Exception;

    /**
     * �½�ϵͳ����
     *
     * @param systemAction
     *
     * @throws Exception
     *
     * @model
     */
    void createSystemAction(
        final com.ourteam.system.domain.SystemAction systemAction)
        throws Exception;

    /**
     * ����ϵͳ������Ϣ
     *
     * @param systemAction
     *
     * @throws Exception
     *
     * @model
     */
    void modifySystemAction(
        final com.ourteam.system.domain.SystemAction systemAction)
        throws Exception;

    /**
     * ɾ��ϵͳ������Ϣ
     *
     * @param systemActionId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSystemAction(final long systemActionId)
        throws Exception;

    /**
     * ����ϵͳģ������
     *
     * @param moduleId
     * @param sortIndex
     *
     * @throws Exception
     *
     * @model
     */
    void setSysModuleSortIndex(final long moduleId, final int sortIndex)
        throws Exception;

    /**
     * ȡ�����ϵͳģ������
     *
     * @param appDomainId
     * @param parentModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxSystemModuleSort(final long appDomainId, final long parentModuleId)
        throws Exception;

    /**
     * ���ݱ�ʶȡ��ϵͳģ��
     *
     * @param moduleCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemModule getSystemModuleByCode(
        final String moduleCode) throws Exception;

    /**
     * ��ѯϵͳģ��
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemModule[] querySystemModules(
        final com.ourteam.system.dao.SysModuleDAOQueryBean queryBean)
        throws Exception;
} // end ISystemApplicationService
