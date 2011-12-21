/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  系统资源服务
*  Generated Date 2010-07-23 19:38:19   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysResourceService {
    /**
     * 取得系统资源
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
     * 取得系统资源属性
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
     * 取得系统资源属性定义
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
     * 取得所有系统资源
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
     * 新建系统资源
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
     * 取得系统资源最大排序号
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
     * 取得系统资源
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
     * 变更系统资源
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
     * 设置资源排序
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
     * 删除系统资源
     *
     * @param aSysResourceId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResource(long aSysResourceId) throws Exception;

    /**
     * 取得资源总数
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
     * 设置系统资源国际化信息
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
