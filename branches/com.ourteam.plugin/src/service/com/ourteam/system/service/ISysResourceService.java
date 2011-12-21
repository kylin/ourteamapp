/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  ϵͳ��Դ����
*  Generated Date 2010-07-23 19:38:19   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysResourceService {
    /**
     * ȡ��ϵͳ��Դ
     *
     * @param aDomainId
     * @param aParentId
     * @param aResourceType
     * @param aQueryCallback
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemResource[] getSysResources(long aDomainId,
        long aParentId,
        final com.ourteam.system.dao.SysResourceTypeIdEnum aResourceType,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
        throws Exception;

    /**
     * ȡ��ϵͳ��Դ����
     *
     * @param aSysResourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.dao.SysResourceProperty[] getSysResourceProperties(
        long aSysResourceId) throws Exception;

    /**
     * ȡ��ϵͳ��Դ���Զ���
     *
     * @param aSysResourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.dao.SysResourceType[] getSysResourcePropertyDefines(
        final long aSysResourceTypeId) throws Exception;

    /**
     * ȡ������ϵͳ��Դ
     *
     * @param aDomainId
     * @param aResourceType
     * @param aQueryCallback
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemResource[] getAllSysResources(
        long aDomainId,
        final com.ourteam.system.dao.SysResourceTypeIdEnum aResourceType,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
        throws Exception;

    /**
     * �½�ϵͳ��Դ
     *
     * @param aSysResource
     *
     * @throws Exception
     *
     * @model
     */
    void createSysResource(
        final com.ourteam.system.domain.SystemResource aSysResource)
        throws Exception;

    /**
     * ȡ��ϵͳ��Դ��������
     *
     * @param aDomainId
     * @param aParentId
     * @param aTypeIdEnum
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxSysResourceSortIndex(long aDomainId, long aParentId,
        final com.ourteam.system.dao.SysResourceTypeIdEnum aTypeIdEnum)
        throws Exception;

    /**
     * ȡ��ϵͳ��Դ
     *
     * @param aSysResourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemResource getSysResourceById(
        long aSysResourceId) throws Exception;

    /**
     * ���ϵͳ��Դ
     *
     * @param aSysResource
     *
     * @throws Exception
     *
     * @model
     */
    void modifySysResource(
        final com.ourteam.system.domain.SystemResource aSysResource)
        throws Exception;

    /**
     * ������Դ����
     *
     * @param aSysResourceId
     * @param aSort
     *
     * @throws Exception
     *
     * @model
     */
    void setSysResourceSortIndex(long aSysResourceId, int aSort)
        throws Exception;

    /**
     * ɾ��ϵͳ��Դ
     *
     * @param aSysResourceId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResource(long aSysResourceId) throws Exception;

    /**
     * ȡ����Դ����
     *
     * @param aDomainId
     * @param aParentId
     * @param aResourceType
     * @param aQueryCallback
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getSysResourcesCount(long aDomainId, long aParentId,
        final com.ourteam.system.dao.SysResourceTypeIdEnum aResourceType,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
        throws Exception;

    /**
     * ����ϵͳ��Դ���ʻ���Ϣ
     *
     * @param aSystemResource
     * @param aLocale
     *
     * @throws Exception
     *
     * @model
     */
    void setSysResourceTitleMessage(
        com.ourteam.system.domain.SystemResource aSystemResource,
        java.util.Locale aLocale) throws Exception;
} // end ISysResourceService
