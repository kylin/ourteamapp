/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 系统应用服务 Generated Date 2011-11-01 14:43:52
 *
 * @author Auto Gen
 */
abstract class AbstractSystemApplicationService extends net.service.DefaultServiceImpl
    implements ISystemApplicationService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractSystemApplicationService.class);

    /** SysDomain DAO Instance */
    protected com.ourteam.system.dao.ISysDomainDAO sysDomainDao;

    /** SysResourceService Instance */
    protected com.ourteam.system.service.ISysResourceService sysResourceService;

    /** SysResource DAO Instance */
    protected com.ourteam.system.dao.ISysResourceDAO sysResourceDao;

    /** SysMessageResourceService Instance */
    protected com.ourteam.system.service.ISysMessageResourceService sysMessageResourceService;

    /** SysModule DAO Instance */
    protected com.ourteam.system.dao.ISysModuleDAO sysModuleDao;

    /** SysAction DAO Instance */
    protected com.ourteam.system.dao.ISysActionDAO sysActionDao;

    /** SysRoleActionRelate DAO Instance */
    protected com.ourteam.system.dao.ISysRoleActionRelateDAO sysRoleActionRelateDao;

    /**
     * Get SysDomain DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysDomainDAO getSysDomainDao() {
        return sysDomainDao;
    } // end getSysDomainDao()

    /**
     * Set SysDomain DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysDomainDao(com.ourteam.system.dao.ISysDomainDAO aDao) {
        sysDomainDao = aDao;
    } // end setSysDomainDao()

    /**
     * Get SysResourceService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.service.ISysResourceService getSysResourceService() {
        return sysResourceService;
    } // end getSysResourceService()

    /**
     * Set SysResourceService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setSysResourceService(
        com.ourteam.system.service.ISysResourceService aService) {
        sysResourceService = aService;
    } // end setSysResourceService()

    /**
     * Get SysResource DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysResourceDAO getSysResourceDao() {
        return sysResourceDao;
    } // end getSysResourceDao()

    /**
     * Set SysResource DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysResourceDao(com.ourteam.system.dao.ISysResourceDAO aDao) {
        sysResourceDao = aDao;
    } // end setSysResourceDao()

    /**
     * Get SysMessageResourceService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.service.ISysMessageResourceService getSysMessageResourceService() {
        return sysMessageResourceService;
    } // end getSysMessageResourceService()

    /**
     * Set SysMessageResourceService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setSysMessageResourceService(
        com.ourteam.system.service.ISysMessageResourceService aService) {
        sysMessageResourceService = aService;
    } // end setSysMessageResourceService()

    /**
     * Get SysModule DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysModuleDAO getSysModuleDao() {
        return sysModuleDao;
    } // end getSysModuleDao()

    /**
     * Set SysModule DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysModuleDao(com.ourteam.system.dao.ISysModuleDAO aDao) {
        sysModuleDao = aDao;
    } // end setSysModuleDao()

    /**
     * Get SysAction DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysActionDAO getSysActionDao() {
        return sysActionDao;
    } // end getSysActionDao()

    /**
     * Set SysAction DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysActionDao(com.ourteam.system.dao.ISysActionDAO aDao) {
        sysActionDao = aDao;
    } // end setSysActionDao()

    /**
     * Get SysRoleActionRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysRoleActionRelateDAO getSysRoleActionRelateDao() {
        return sysRoleActionRelateDao;
    } // end getSysRoleActionRelateDao()

    /**
     * Set SysRoleActionRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysRoleActionRelateDao(
        com.ourteam.system.dao.ISysRoleActionRelateDAO aDao) {
        sysRoleActionRelateDao = aDao;
    } // end setSysRoleActionRelateDao()

    /**
     * 取得系统应用域列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.ApplicationDomain[] doGetApplicationDomains()
        throws Exception;

    /**
     * 取得系统应用域列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.ApplicationDomain[] getApplicationDomains()
        throws Exception {
        try {
            com.ourteam.system.domain.ApplicationDomain[] result = doGetApplicationDomains();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getApplicationDomains error", e);
            throw e;
        } // end catch
    } // end getApplicationDomains()

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
     */
    protected abstract com.ourteam.system.domain.SystemFunction[] doGetSystemFunctions(
        long aDomainId, long aParentId,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
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
     */
    public com.ourteam.system.domain.SystemFunction[] getSystemFunctions(
        long aDomainId, long aParentId,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemFunction[] result = doGetSystemFunctions(aDomainId,
                    aParentId, aQueryCallback);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemFunctions error", e);
            throw e;
        } // end catch
    } // end getSystemFunctions()

    /**
     * 取得应用域下所有功能菜单
     *
     * @param aDomianId
     * @param aQueryCallback
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemFunction[] doGetAllSystemFunctions(
        long aDomianId,
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
     */
    public com.ourteam.system.domain.SystemFunction[] getAllSystemFunctions(
        long aDomianId,
        com.ourteam.system.service.ISysResourceQueryCallback aQueryCallback)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemFunction[] result = doGetAllSystemFunctions(aDomianId,
                    aQueryCallback);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getAllSystemFunctions error", e);
            throw e;
        } // end catch
    } // end getAllSystemFunctions()

    /**
     * 新建系统功能菜单
     *
     * @param aSystemFunctionMenu
     *
     * @throws Exception
     */
    protected abstract void doCreateSystemFunction(
        final com.ourteam.system.domain.SystemFunction aSystemFunctionMenu)
        throws Exception;

    /**
     * 新建系统功能菜单
     *
     * @param aSystemFunctionMenu
     *
     * @throws Exception
     */
    public void createSystemFunction(
        final com.ourteam.system.domain.SystemFunction aSystemFunctionMenu)
        throws Exception {
        try {
            if (aSystemFunctionMenu == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aSystemFunctionMenu] Value is NULL");
            } // end if

            doCreateSystemFunction(aSystemFunctionMenu);
        } // end try
        catch (Exception e) {
            logger.error("do createSystemFunction error", e);
            throw e;
        } // end catch
    } // end createSystemFunction()

    /**
     * 取得系统功能菜单最大排序
     *
     * @param aDomainId
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetMaxSystemFunctionSort(long aDomainId,
        long aParentId) throws Exception;

    /**
     * 取得系统功能菜单最大排序
     *
     * @param aDomainId
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getMaxSystemFunctionSort(long aDomainId, long aParentId)
        throws Exception {
        try {
            int result = doGetMaxSystemFunctionSort(aDomainId, aParentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMaxSystemFunctionSort error", e);
            throw e;
        } // end catch
    } // end getMaxSystemFunctionSort()

    /**
     * 取得系统功能
     *
     * @param aSysFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemFunction doGetSystemFunctionById(
        long aSysFunctionId) throws Exception;

    /**
     * 取得系统功能
     *
     * @param aSysFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemFunction getSystemFunctionById(
        long aSysFunctionId) throws Exception {
        try {
            com.ourteam.system.domain.SystemFunction result = doGetSystemFunctionById(aSysFunctionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemFunctionById error", e);
            throw e;
        } // end catch
    } // end getSystemFunctionById()

    /**
     * 变更系统功能
     *
     * @param sSystemFunction
     *
     * @throws Exception
     */
    protected abstract void doModifySystemFunction(
        final com.ourteam.system.domain.SystemFunction sSystemFunction)
        throws Exception;

    /**
     * 变更系统功能
     *
     * @param sSystemFunction
     *
     * @throws Exception
     */
    public void modifySystemFunction(
        final com.ourteam.system.domain.SystemFunction sSystemFunction)
        throws Exception {
        try {
            if (sSystemFunction == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [sSystemFunction] Value is NULL");
            } // end if

            doModifySystemFunction(sSystemFunction);
        } // end try
        catch (Exception e) {
            logger.error("do modifySystemFunction error", e);
            throw e;
        } // end catch
    } // end modifySystemFunction()

    /**
     * 删除系统功能
     *
     * @param aSysFunctionId
     *
     * @throws Exception
     */
    protected abstract void doDeleteSystemFunction(long aSysFunctionId)
        throws Exception;

    /**
     * 删除系统功能
     *
     * @param aSysFunctionId
     *
     * @throws Exception
     */
    public void deleteSystemFunction(long aSysFunctionId)
        throws Exception {
        try {
            doDeleteSystemFunction(aSysFunctionId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteSystemFunction error", e);
            throw e;
        } // end catch
    } // end deleteSystemFunction()

    /**
     * 取得应用域总数
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryApplicationDomainCount(
        com.ourteam.system.dao.SysDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * 取得应用域总数
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryApplicationDomainCount(
        com.ourteam.system.dao.SysDomainDAOQueryBean aQueryBean)
        throws Exception {
        try {
            if (aQueryBean == null) {
                logger.warn(
                    "The Parameter [aQueryBean] Value is NULL,Auto Create New Instance");

                aQueryBean = new com.ourteam.system.dao.SysDomainDAOQueryBean();
            } // end if

            int result = doQueryApplicationDomainCount(aQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryApplicationDomainCount error", e);
            throw e;
        } // end catch
    } // end queryApplicationDomainCount()

    /**
     * 查询应用域
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.ApplicationDomain[] doQueryApplicationDomains(
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
     */
    public com.ourteam.system.domain.ApplicationDomain[] queryApplicationDomains(
        com.ourteam.system.dao.SysDomainDAOQueryBean aQueryBean)
        throws Exception {
        try {
            if (aQueryBean == null) {
                logger.warn(
                    "The Parameter [aQueryBean] Value is NULL,Auto Create New Instance");

                aQueryBean = new com.ourteam.system.dao.SysDomainDAOQueryBean();
            } // end if

            com.ourteam.system.domain.ApplicationDomain[] result = doQueryApplicationDomains(aQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryApplicationDomains error", e);
            throw e;
        } // end catch
    } // end queryApplicationDomains()

    /**
     * 新建应用域
     *
     * @param aApplicationDomain
     *
     * @throws Exception
     */
    protected abstract void doCreateApplicationDomain(
        final com.ourteam.system.domain.ApplicationDomain aApplicationDomain)
        throws Exception;

    /**
     * 新建应用域
     *
     * @param aApplicationDomain
     *
     * @throws Exception
     */
    public void createApplicationDomain(
        final com.ourteam.system.domain.ApplicationDomain aApplicationDomain)
        throws Exception {
        try {
            if (aApplicationDomain == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aApplicationDomain] Value is NULL");
            } // end if

            doCreateApplicationDomain(aApplicationDomain);
        } // end try
        catch (Exception e) {
            logger.error("do createApplicationDomain error", e);
            throw e;
        } // end catch
    } // end createApplicationDomain()

    /**
     * 变更应用域
     *
     * @param aApplicationDomain
     *
     * @throws Exception
     */
    protected abstract void doModifyApplicationDomain(
        final com.ourteam.system.domain.ApplicationDomain aApplicationDomain)
        throws Exception;

    /**
     * 变更应用域
     *
     * @param aApplicationDomain
     *
     * @throws Exception
     */
    public void modifyApplicationDomain(
        final com.ourteam.system.domain.ApplicationDomain aApplicationDomain)
        throws Exception {
        try {
            if (aApplicationDomain == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aApplicationDomain] Value is NULL");
            } // end if

            doModifyApplicationDomain(aApplicationDomain);
        } // end try
        catch (Exception e) {
            logger.error("do modifyApplicationDomain error", e);
            throw e;
        } // end catch
    } // end modifyApplicationDomain()

    /**
     * 删除应用域
     *
     * @param aApplicationDomainId
     *
     * @throws Exception
     */
    protected abstract void doDeleteApplicationDomain(long aApplicationDomainId)
        throws Exception;

    /**
     * 删除应用域
     *
     * @param aApplicationDomainId
     *
     * @throws Exception
     */
    public void deleteApplicationDomain(long aApplicationDomainId)
        throws Exception {
        try {
            doDeleteApplicationDomain(aApplicationDomainId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteApplicationDomain error", e);
            throw e;
        } // end catch
    } // end deleteApplicationDomain()

    /**
     * 取得最大应用域排序
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetMaxApplicationDomainSort()
        throws Exception;

    /**
     * 取得最大应用域排序
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getMaxApplicationDomainSort() throws Exception {
        try {
            int result = doGetMaxApplicationDomainSort();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMaxApplicationDomainSort error", e);
            throw e;
        } // end catch
    } // end getMaxApplicationDomainSort()

    /**
     * 设置应用域排序
     *
     * @param aSysDomainId
     * @param aSortIndex
     *
     * @throws Exception
     */
    protected abstract void doSetSysDomainSortIndex(long aSysDomainId,
        int aSortIndex) throws Exception;

    /**
     * 设置应用域排序
     *
     * @param aSysDomainId
     * @param aSortIndex
     *
     * @throws Exception
     */
    public void setSysDomainSortIndex(long aSysDomainId, int aSortIndex)
        throws Exception {
        try {
            doSetSysDomainSortIndex(aSysDomainId, aSortIndex);
        } // end try
        catch (Exception e) {
            logger.error("do setSysDomainSortIndex error", e);
            throw e;
        } // end catch
    } // end setSysDomainSortIndex()

    /**
     * 取得系统功能模块
     *
     * @param domainId
     * @param parentModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemModule[] doGetSystemModules(
        final long domainId, final long parentModuleId)
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
     */
    public com.ourteam.system.domain.SystemModule[] getSystemModules(
        final long domainId, final long parentModuleId)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemModule[] result = doGetSystemModules(domainId,
                    parentModuleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemModules error", e);
            throw e;
        } // end catch
    } // end getSystemModules()

    /**
     * 取得系统功能
     *
     * @param moduleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemAction[] doGetSystemActions(
        final long moduleId) throws Exception;

    /**
     * 取得系统功能
     *
     * @param moduleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemAction[] getSystemActions(
        final long moduleId) throws Exception {
        try {
            com.ourteam.system.domain.SystemAction[] result = doGetSystemActions(moduleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemActions error", e);
            throw e;
        } // end catch
    } // end getSystemActions()

    /**
     * 根据id取得应用域
     *
     * @param domainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.ApplicationDomain doGetApplicationDomainById(
        final long domainId) throws Exception;

    /**
     * 根据id取得应用域
     *
     * @param domainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.ApplicationDomain getApplicationDomainById(
        final long domainId) throws Exception {
        try {
            com.ourteam.system.domain.ApplicationDomain result = doGetApplicationDomainById(domainId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getApplicationDomainById error", e);
            throw e;
        } // end catch
    } // end getApplicationDomainById()

    /**
     * 根据ID取得系统模块
     *
     * @param sysModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemModule doGetSystemModuleById(
        final long sysModuleId) throws Exception;

    /**
     * 根据ID取得系统模块
     *
     * @param sysModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemModule getSystemModuleById(
        final long sysModuleId) throws Exception {
        try {
            com.ourteam.system.domain.SystemModule result = doGetSystemModuleById(sysModuleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemModuleById error", e);
            throw e;
        } // end catch
    } // end getSystemModuleById()

    /**
     * 根据id取得系统功能
     *
     * @param sysActionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemAction doGetSystemActionById(
        final long sysActionId) throws Exception;

    /**
     * 根据id取得系统功能
     *
     * @param sysActionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemAction getSystemActionById(
        final long sysActionId) throws Exception {
        try {
            com.ourteam.system.domain.SystemAction result = doGetSystemActionById(sysActionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemActionById error", e);
            throw e;
        } // end catch
    } // end getSystemActionById()

    /**
     * 新建系统模块
     *
     * @param systemModule
     *
     * @throws Exception
     */
    protected abstract void doCreateSystemModule(
        final com.ourteam.system.domain.SystemModule systemModule)
        throws Exception;

    /**
     * 新建系统模块
     *
     * @param systemModule
     *
     * @throws Exception
     */
    public void createSystemModule(
        final com.ourteam.system.domain.SystemModule systemModule)
        throws Exception {
        try {
            if (systemModule == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [systemModule] Value is NULL");
            } // end if

            doCreateSystemModule(systemModule);
        } // end try
        catch (Exception e) {
            logger.error("do createSystemModule error", e);
            throw e;
        } // end catch
    } // end createSystemModule()

    /**
     * 更新系统模块信息
     *
     * @param systemModule
     *
     * @throws Exception
     */
    protected abstract void doModifySystemModule(
        final com.ourteam.system.domain.SystemModule systemModule)
        throws Exception;

    /**
     * 更新系统模块信息
     *
     * @param systemModule
     *
     * @throws Exception
     */
    public void modifySystemModule(
        final com.ourteam.system.domain.SystemModule systemModule)
        throws Exception {
        try {
            if (systemModule == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [systemModule] Value is NULL");
            } // end if

            doModifySystemModule(systemModule);
        } // end try
        catch (Exception e) {
            logger.error("do modifySystemModule error", e);
            throw e;
        } // end catch
    } // end modifySystemModule()

    /**
     * 删除系统模块信息
     *
     * @param systemModuleId
     *
     * @throws Exception
     */
    protected abstract void doDeleteSystemModule(final long systemModuleId)
        throws Exception;

    /**
     * 删除系统模块信息
     *
     * @param systemModuleId
     *
     * @throws Exception
     */
    public void deleteSystemModule(final long systemModuleId)
        throws Exception {
        try {
            doDeleteSystemModule(systemModuleId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteSystemModule error", e);
            throw e;
        } // end catch
    } // end deleteSystemModule()

    /**
     * 新建系统功能
     *
     * @param systemAction
     *
     * @throws Exception
     */
    protected abstract void doCreateSystemAction(
        final com.ourteam.system.domain.SystemAction systemAction)
        throws Exception;

    /**
     * 新建系统功能
     *
     * @param systemAction
     *
     * @throws Exception
     */
    public void createSystemAction(
        final com.ourteam.system.domain.SystemAction systemAction)
        throws Exception {
        try {
            if (systemAction == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [systemAction] Value is NULL");
            } // end if

            doCreateSystemAction(systemAction);
        } // end try
        catch (Exception e) {
            logger.error("do createSystemAction error", e);
            throw e;
        } // end catch
    } // end createSystemAction()

    /**
     * 更新系统功能信息
     *
     * @param systemAction
     *
     * @throws Exception
     */
    protected abstract void doModifySystemAction(
        final com.ourteam.system.domain.SystemAction systemAction)
        throws Exception;

    /**
     * 更新系统功能信息
     *
     * @param systemAction
     *
     * @throws Exception
     */
    public void modifySystemAction(
        final com.ourteam.system.domain.SystemAction systemAction)
        throws Exception {
        try {
            if (systemAction == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [systemAction] Value is NULL");
            } // end if

            doModifySystemAction(systemAction);
        } // end try
        catch (Exception e) {
            logger.error("do modifySystemAction error", e);
            throw e;
        } // end catch
    } // end modifySystemAction()

    /**
     * 删除系统功能信息
     *
     * @param systemActionId
     *
     * @throws Exception
     */
    protected abstract void doDeleteSystemAction(final long systemActionId)
        throws Exception;

    /**
     * 删除系统功能信息
     *
     * @param systemActionId
     *
     * @throws Exception
     */
    public void deleteSystemAction(final long systemActionId)
        throws Exception {
        try {
            doDeleteSystemAction(systemActionId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteSystemAction error", e);
            throw e;
        } // end catch
    } // end deleteSystemAction()

    /**
     * 设置系统模块排序
     *
     * @param moduleId
     * @param sortIndex
     *
     * @throws Exception
     */
    protected abstract void doSetSysModuleSortIndex(final long moduleId,
        final int sortIndex) throws Exception;

    /**
     * 设置系统模块排序
     *
     * @param moduleId
     * @param sortIndex
     *
     * @throws Exception
     */
    public void setSysModuleSortIndex(final long moduleId, final int sortIndex)
        throws Exception {
        try {
            doSetSysModuleSortIndex(moduleId, sortIndex);
        } // end try
        catch (Exception e) {
            logger.error("do setSysModuleSortIndex error", e);
            throw e;
        } // end catch
    } // end setSysModuleSortIndex()

    /**
     * 取得最大系统模块排序
     *
     * @param appDomainId
     * @param parentModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetMaxSystemModuleSort(final long appDomainId,
        final long parentModuleId) throws Exception;

    /**
     * 取得最大系统模块排序
     *
     * @param appDomainId
     * @param parentModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getMaxSystemModuleSort(final long appDomainId,
        final long parentModuleId) throws Exception {
        try {
            int result = doGetMaxSystemModuleSort(appDomainId, parentModuleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMaxSystemModuleSort error", e);
            throw e;
        } // end catch
    } // end getMaxSystemModuleSort()

    /**
     * 根据标识取得系统模块
     *
     * @param moduleCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemModule doGetSystemModuleByCode(
        final String moduleCode) throws Exception;

    /**
     * 根据标识取得系统模块
     *
     * @param moduleCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemModule getSystemModuleByCode(
        final String moduleCode) throws Exception {
        try {
            if (moduleCode == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [moduleCode] Value is NULL");
            } // end if

            com.ourteam.system.domain.SystemModule result = doGetSystemModuleByCode(moduleCode);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemModuleByCode error", e);
            throw e;
        } // end catch
    } // end getSystemModuleByCode()

    /**
     * 查询系统模块
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemModule[] doQuerySystemModules(
        final com.ourteam.system.dao.SysModuleDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询系统模块
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemModule[] querySystemModules(
        final com.ourteam.system.dao.SysModuleDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemModule[] result = doQuerySystemModules(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do querySystemModules error", e);
            throw e;
        } // end catch
    } // end querySystemModules()
} // end AbstractSystemApplicationService
