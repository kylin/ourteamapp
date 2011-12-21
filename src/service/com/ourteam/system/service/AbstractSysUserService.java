/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ϵͳ�û����� Generated Date 2011-11-07 10:13:31
 *
 * @author Auto Gen
 */
abstract class AbstractSysUserService extends net.service.DefaultServiceImpl
    implements ISysUserService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractSysUserService.class);

    /** SysUser DAO Instance */
    protected com.ourteam.system.dao.ISysUserDAO sysUserDao;

    /** SysUserRoleRelate DAO Instance */
    protected com.ourteam.system.dao.ISysUserRoleRelateDAO sysUserRoleRelateDao;

    /**
     * Get SysUser DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysUserDAO getSysUserDao() {
        return sysUserDao;
    } // end getSysUserDao()

    /**
     * Set SysUser DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysUserDao(com.ourteam.system.dao.ISysUserDAO aDao) {
        sysUserDao = aDao;
    } // end setSysUserDao()

    /**
     * Get SysUserRoleRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysUserRoleRelateDAO getSysUserRoleRelateDao() {
        return sysUserRoleRelateDao;
    } // end getSysUserRoleRelateDao()

    /**
     * Set SysUserRoleRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysUserRoleRelateDao(
        com.ourteam.system.dao.ISysUserRoleRelateDAO aDao) {
        sysUserRoleRelateDao = aDao;
    } // end setSysUserRoleRelateDao()

    /**
     * ��ѯϵͳ�û�
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemUser[] doGetSysUsers(
        final com.ourteam.system.dao.SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * ��ѯϵͳ�û�
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemUser[] getSysUsers(
        final com.ourteam.system.dao.SysUserDAOQueryBean aQueryBean)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemUser[] result = doGetSysUsers(aQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysUsers error", e);
            throw e;
        } // end catch
    } // end getSysUsers()

    /**
     * ��ѯϵͳ�û�����
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetSysUserCount(
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
     */
    public int getSysUserCount(
        final com.ourteam.system.dao.SysUserDAOQueryBean aQueryBean)
        throws Exception {
        try {
            int result = doGetSysUserCount(aQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysUserCount error", e);
            throw e;
        } // end catch
    } // end getSysUserCount()

    /**
     * ����ϵͳ�û�
     *
     * @param systemUser
     *
     * @throws Exception
     */
    protected abstract void doCreateSysUser(
        final com.ourteam.system.domain.SystemUser systemUser)
        throws Exception;

    /**
     * ����ϵͳ�û�
     *
     * @param systemUser
     *
     * @throws Exception
     */
    public void createSysUser(
        final com.ourteam.system.domain.SystemUser systemUser)
        throws Exception {
        try {
            if (systemUser == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [systemUser] Value is NULL");
            } // end if

            doCreateSysUser(systemUser);
        } // end try
        catch (Exception e) {
            logger.error("do createSysUser error", e);
            throw e;
        } // end catch
    } // end createSysUser()

    /**
     * �޸�ϵͳ�û�
     *
     * @param systemUser
     *
     * @throws Exception
     */
    protected abstract void doModifySysUser(
        final com.ourteam.system.domain.SystemUser systemUser)
        throws Exception;

    /**
     * �޸�ϵͳ�û�
     *
     * @param systemUser
     *
     * @throws Exception
     */
    public void modifySysUser(
        final com.ourteam.system.domain.SystemUser systemUser)
        throws Exception {
        try {
            if (systemUser == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [systemUser] Value is NULL");
            } // end if

            doModifySysUser(systemUser);
        } // end try
        catch (Exception e) {
            logger.error("do modifySysUser error", e);
            throw e;
        } // end catch
    } // end modifySysUser()

    /**
     * ����û�����
     *
     * @param aSystemUserPassword
     *
     * @throws Exception
     */
    protected abstract void doChangeUserPassword(
        final com.ourteam.system.domain.SystemUserPassword aSystemUserPassword)
        throws Exception;

    /**
     * ����û�����
     *
     * @param aSystemUserPassword
     *
     * @throws Exception
     */
    public void changeUserPassword(
        final com.ourteam.system.domain.SystemUserPassword aSystemUserPassword)
        throws Exception {
        try {
            if (aSystemUserPassword == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aSystemUserPassword] Value is NULL");
            } // end if

            doChangeUserPassword(aSystemUserPassword);
        } // end try
        catch (Exception e) {
            logger.error("do changeUserPassword error", e);
            throw e;
        } // end catch
    } // end changeUserPassword()

    /**
     * �����ʺ�ȡ���û���Ϣ
     *
     * @param aAccount
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemUser doGetSysUserByAccount(
        final String aAccount) throws Exception;

    /**
     * �����ʺ�ȡ���û���Ϣ
     *
     * @param aAccount
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemUser getSysUserByAccount(
        final String aAccount) throws Exception {
        try {
            if (aAccount == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aAccount] Value is NULL");
            } // end if

            com.ourteam.system.domain.SystemUser result = doGetSysUserByAccount(aAccount);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysUserByAccount error", e);
            throw e;
        } // end catch
    } // end getSysUserByAccount()

    /**
     * ����IDȡ��ϵͳ�û���Ϣ
     *
     * @param aSystemUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemUser doGetSysUserById(
        final long aSystemUserId) throws Exception;

    /**
     * ����IDȡ��ϵͳ�û���Ϣ
     *
     * @param aSystemUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemUser getSysUserById(
        final long aSystemUserId) throws Exception {
        try {
            com.ourteam.system.domain.SystemUser result = doGetSysUserById(aSystemUserId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysUserById error", e);
            throw e;
        } // end catch
    } // end getSysUserById()

    /**
     * ȡ���û�������Ϣ
     *
     * @param aAccount
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemUserPassword doGetSysUserPassword(
        final String aAccount) throws Exception;

    /**
     * ȡ���û�������Ϣ
     *
     * @param aAccount
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemUserPassword getSysUserPassword(
        final String aAccount) throws Exception {
        try {
            if (aAccount == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aAccount] Value is NULL");
            } // end if

            com.ourteam.system.domain.SystemUserPassword result = doGetSysUserPassword(aAccount);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysUserPassword error", e);
            throw e;
        } // end catch
    } // end getSysUserPassword()

    /**
     * ����ϵͳ�û�Ȩ��
     *
     * @param aSysUserId
     * @param aSystemUserAuthorities
     *
     * @throws Exception
     */
    protected abstract void doSetSysUserAuthorities(final long aSysUserId,
        final com.ourteam.system.domain.SystemUserRoleRelate[] aSystemUserAuthorities)
        throws Exception;

    /**
     * ����ϵͳ�û�Ȩ��
     *
     * @param aSysUserId
     * @param aSystemUserAuthorities
     *
     * @throws Exception
     */
    public void setSysUserAuthorities(final long aSysUserId,
        final com.ourteam.system.domain.SystemUserRoleRelate[] aSystemUserAuthorities)
        throws Exception {
        try {
            doSetSysUserAuthorities(aSysUserId, aSystemUserAuthorities);
        } // end try
        catch (Exception e) {
            logger.error("do setSysUserAuthorities error", e);
            throw e;
        } // end catch
    } // end setSysUserAuthorities()

    /**
     * ȡ���û�Ȩ������
     *
     * @param aSysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemUserRoleRelate[] doGetSysUserAuthorities(
        final long aSysUserId) throws Exception;

    /**
     * ȡ���û�Ȩ������
     *
     * @param aSysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemUserRoleRelate[] getSysUserAuthorities(
        final long aSysUserId) throws Exception {
        try {
            com.ourteam.system.domain.SystemUserRoleRelate[] result = doGetSysUserAuthorities(aSysUserId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysUserAuthorities error", e);
            throw e;
        } // end catch
    } // end getSysUserAuthorities()

    /**
     * ɾ��ϵͳ�û�
     *
     * @param sysUserIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteSysUsers(final long[] sysUserIds)
        throws Exception;

    /**
     * ɾ��ϵͳ�û�
     *
     * @param sysUserIds
     *
     * @throws Exception
     */
    public void deleteSysUsers(final long[] sysUserIds)
        throws Exception {
        try {
            doDeleteSysUsers(sysUserIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteSysUsers error", e);
            throw e;
        } // end catch
    } // end deleteSysUsers()

    /**
     * ����ID����ȡ��ϵͳ�û�
     *
     * @param sysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemUser[] doGetSysUsersByIds(
        final long[] sysUserId) throws Exception;

    /**
     * ����ID����ȡ��ϵͳ�û�
     *
     * @param sysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemUser[] getSysUsersByIds(
        final long[] sysUserId) throws Exception {
        try {
            com.ourteam.system.domain.SystemUser[] result = doGetSysUsersByIds(sysUserId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysUsersByIds error", e);
            throw e;
        } // end catch
    } // end getSysUsersByIds()
} // end AbstractSysUserService
