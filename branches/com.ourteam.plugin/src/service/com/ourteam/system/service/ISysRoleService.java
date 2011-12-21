/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  系统角色服务
*  Generated Date 2011-10-27 10:02:44   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysRoleService {
    /**
     * 取得系统角色
     *
     * @param aSysRoleDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRole[] getSysRoles(
        final com.ourteam.system.dao.SysRoleDAOQueryBean aSysRoleDAOQueryBean)
        throws Exception;

    /**
     * 取得角色数量
     *
     * @param aSysRoleDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getSysRoleCount(
        final com.ourteam.system.dao.SysRoleDAOQueryBean aSysRoleDAOQueryBean)
        throws Exception;

    /**
     * 新建系统角色
     *
     * @param sysRole
     *
     * @throws Exception
     *
     * @model
     */
    void createSysRole(final com.ourteam.system.domain.SystemRole sysRole)
        throws Exception;

    /**
     * 修改系统角色
     *
     * @param sysRole
     *
     * @throws Exception
     *
     * @model
     */
    void modifySysRole(final com.ourteam.system.domain.SystemRole sysRole)
        throws Exception;

    /**
     * 取得系统角色资源关联
     *
     * @param aSysRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRoleResourceRelate[] getSysRoleResourceRelates(
        final long aSysRoleId) throws Exception;

    /**
     * 设置系统角色资源关联
     *
     * @param aSysRoleId
     * @param aSystemRoleResourceRelates
     *
     * @throws Exception
     *
     * @model
     */
    void setSysRoleResourceRelates(final long aSysRoleId,
        final com.ourteam.system.domain.SystemRoleResourceRelate[] aSystemRoleResourceRelates)
        throws Exception;

    /**
     * 取得系统角色群列表
     *
     * @param aSysRoleGroupDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRoleGroup[] getSysRoleGroups(
        final com.ourteam.system.dao.SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
        throws Exception;

    /**
     * 取得系统角色群数量
     *
     * @param aSysRoleGroupDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getSysRoleGroupCount(
        final com.ourteam.system.dao.SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
        throws Exception;

    /**
     * 创建系统角色群组
     *
     * @param aSystemRoleGroup
     *
     * @throws Exception
     *
     * @model
     */
    void createSysRoleGroup(
        final com.ourteam.system.domain.SystemRoleGroup aSystemRoleGroup)
        throws Exception;

    /**
     * 修改系统角色群组
     *
     * @param aSystemRoleGroup
     *
     * @throws Exception
     *
     * @model
     */
    void modifySysRoleGroup(
        final com.ourteam.system.domain.SystemRoleGroup aSystemRoleGroup)
        throws Exception;

    /**
     * 取得角色组关联的角色
     *
     * @param aSysRoleGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRoleGroupRelate[] getSysRoleGroupRelatedRoles(
        final long aSysRoleGroupId) throws Exception;

    /**
     * 设置角色组关联的角色
     *
     * @param aSysRoleGroupId
     * @param aSystemRoleGroupRelates
     *
     * @throws Exception
     *
     * @model
     */
    void setSysRoleGroupRelatedRoles(final long aSysRoleGroupId,
        final com.ourteam.system.domain.SystemRoleGroupRelate[] aSystemRoleGroupRelates)
        throws Exception;

    /**
     * 取得系统角色列表关联的资源
     *
     * @param aSysRoleCodes
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRoleResourceRelate[] getSysRoleResourceRelatesByRoleCode(
        final String[] aSysRoleCodes) throws Exception;

    /**
     * 根据id取得系统角色
     *
     * @param sysRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRole getSysRoleById(final long sysRoleId)
        throws Exception;

    /**
     * 根据id取得系统角色组
     *
     * @param systemRoleGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRoleGroup getSysRoleGroupById(
        final long systemRoleGroupId) throws Exception;

    /**
     * 删除系统角色
     *
     * @param sysRoleId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRole(final long sysRoleId) throws Exception;

    /**
     * 删除系统角色组
     *
     * @param sysRoleGroupId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleGroup(final long sysRoleGroupId)
        throws Exception;

    /**
     * 查询系统角色
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemRole[] querySysRoles(
        final com.ourteam.system.dao.SysRoleDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取得系统角色权限
     *
     * @param sysRoleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemAction[] getSysRoleActions(
        final long[] sysRoleIds) throws Exception;

    /**
     * 设置系统角色权限
     *
     * @param sysRoleId
     * @param actionIds
     *
     * @throws Exception
     *
     * @model
     */
    void setSysRoleActions(final long sysRoleId, final long[] actionIds)
        throws Exception;

    /**
     * 检查系统角色是否拥有系统功能
     *
     * @param roleId
     * @param domainCode
     * @param actionCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    boolean isSysRoleHasAction(final long roleId, final String domainCode,
        final String actionCode) throws Exception;

    /**
     * 取得角色关联的系统模块
     *
     * @param sysRoleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemModule[] getSysRoleModules(
        final long[] sysRoleIds) throws Exception;

    /**
     * 设置角色模块关联
     *
     * @param sysRoleId
     * @param sysModuleIds
     *
     * @throws Exception
     *
     * @model
     */
    void setSysRoleModules(final long sysRoleId, final long[] sysModuleIds)
        throws Exception;
} // end ISysRoleService
