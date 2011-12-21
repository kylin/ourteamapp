/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  系统应用服务
*  Generated Date 2011-11-01 14:43:00   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISystemApplicationService {
    /**
     * 取得系统应用域列表
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
     * 取得应用功能菜单
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
     * 取得应用域下所有功能菜单
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
     * 新建系统功能菜单
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
     * 取得系统功能菜单最大排序
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
     * 取得系统功能
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
     * 变更系统功能
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
     * 删除系统功能
     *
     * @param aSysFunctionId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSystemFunction(long aSysFunctionId) throws Exception;

    /**
     * 取得应用域总数
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
     * 查询应用域
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
     * 新建应用域
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
     * 变更应用域
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
     * 删除应用域
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
     * 取得最大应用域排序
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxApplicationDomainSort() throws Exception;

    /**
     * 设置应用域排序
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
     * 取得系统功能模块
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
     * 取得系统功能
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
     * 根据id取得应用域
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
     * 根据ID取得系统模块
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
     * 根据id取得系统功能
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
     * 新建系统模块
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
     * 更新系统模块信息
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
     * 删除系统模块信息
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
     * 新建系统功能
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
     * 更新系统功能信息
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
     * 删除系统功能信息
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
     * 设置系统模块排序
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
     * 取得最大系统模块排序
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
     * 根据标识取得系统模块
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
     * 查询系统模块
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
