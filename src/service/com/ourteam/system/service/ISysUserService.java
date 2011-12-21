/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  系统用户服务
*  Generated Date 2011-11-07 10:13:22   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysUserService {
    /**
     * 查询系统用户
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemUser[] getSysUsers(
        final com.ourteam.system.dao.SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * 查询系统用户数量
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getSysUserCount(
        final com.ourteam.system.dao.SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * 创建系统用户
     *
     * @param systemUser
     *
     * @throws Exception
     *
     * @model
     */
    void createSysUser(final com.ourteam.system.domain.SystemUser systemUser)
        throws Exception;

    /**
     * 修改系统用户
     *
     * @param systemUser
     *
     * @throws Exception
     *
     * @model
     */
    void modifySysUser(final com.ourteam.system.domain.SystemUser systemUser)
        throws Exception;

    /**
     * 变更用户密码
     *
     * @param aSystemUserPassword
     *
     * @throws Exception
     *
     * @model
     */
    void changeUserPassword(
        final com.ourteam.system.domain.SystemUserPassword aSystemUserPassword)
        throws Exception;

    /**
     * 根据帐号取得用户信息
     *
     * @param aAccount
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemUser getSysUserByAccount(
        final String aAccount) throws Exception;

    /**
     * 根据ID取得系统用户信息
     *
     * @param aSystemUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemUser getSysUserById(
        final long aSystemUserId) throws Exception;

    /**
     * 取得用户密码信息
     *
     * @param aAccount
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemUserPassword getSysUserPassword(
        final String aAccount) throws Exception;

    /**
     * 设置系统用户权限
     *
     * @param aSysUserId
     * @param aSystemUserAuthorities
     *
     * @throws Exception
     *
     * @model
     */
    void setSysUserAuthorities(final long aSysUserId,
        final com.ourteam.system.domain.SystemUserRoleRelate[] aSystemUserAuthorities)
        throws Exception;

    /**
     * 取得用户权限设置
     *
     * @param aSysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemUserRoleRelate[] getSysUserAuthorities(
        final long aSysUserId) throws Exception;

    /**
     * 删除系统用户
     *
     * @param sysUserIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUsers(final long[] sysUserIds) throws Exception;

    /**
     * 根据ID数组取得系统用户
     *
     * @param sysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemUser[] getSysUsersByIds(
        final long[] sysUserId) throws Exception;
} // end ISysUserService
