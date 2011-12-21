/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  ϵͳ�û�����
*  Generated Date 2011-11-07 10:13:22   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysUserService {
    /**
     * ��ѯϵͳ�û�
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
     * ��ѯϵͳ�û�����
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
     * ����ϵͳ�û�
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
     * �޸�ϵͳ�û�
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
     * ����û�����
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
     * �����ʺ�ȡ���û���Ϣ
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
     * ����IDȡ��ϵͳ�û���Ϣ
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
     * ȡ���û�������Ϣ
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
     * ����ϵͳ�û�Ȩ��
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
     * ȡ���û�Ȩ������
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
     * ɾ��ϵͳ�û�
     *
     * @param sysUserIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUsers(final long[] sysUserIds) throws Exception;

    /**
     * ����ID����ȡ��ϵͳ�û�
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
