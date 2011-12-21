/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ϵͳ��ɫ���� Generated Date 2011-10-27 10:03:56
 *
 * @author Auto Gen
 */
abstract class AbstractSysRoleService extends net.service.DefaultServiceImpl
    implements ISysRoleService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractSysRoleService.class);

    /** SysRole DAO Instance */
    protected com.ourteam.system.dao.ISysRoleDAO sysRoleDao;

    /** SysRoleRelate DAO Instance */
    protected com.ourteam.system.dao.ISysRoleRelateDAO sysRoleRelateDao;

    /** SysRoleResourceRelate DAO Instance */
    protected com.ourteam.system.dao.ISysRoleResourceRelateDAO sysRoleResourceRelateDao;

    /** SysRoleGroup DAO Instance */
    protected com.ourteam.system.dao.ISysRoleGroupDAO sysRoleGroupDao;

    /** SysRoleActionRelate DAO Instance */
    protected com.ourteam.system.dao.ISysRoleActionRelateDAO sysRoleActionRelateDao;

    /** SysAction DAO Instance */
    protected com.ourteam.system.dao.ISysActionDAO sysActionDao;

    /** SysRoleModuleRelate DAO Instance */
    protected com.ourteam.system.dao.ISysRoleModuleRelateDAO sysRoleModuleRelateDao;

    /**
     * Get SysRole DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysRoleDAO getSysRoleDao() {
        return sysRoleDao;
    } // end getSysRoleDao()

    /**
     * Set SysRole DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysRoleDao(com.ourteam.system.dao.ISysRoleDAO aDao) {
        sysRoleDao = aDao;
    } // end setSysRoleDao()

    /**
     * Get SysRoleRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysRoleRelateDAO getSysRoleRelateDao() {
        return sysRoleRelateDao;
    } // end getSysRoleRelateDao()

    /**
     * Set SysRoleRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysRoleRelateDao(
        com.ourteam.system.dao.ISysRoleRelateDAO aDao) {
        sysRoleRelateDao = aDao;
    } // end setSysRoleRelateDao()

    /**
     * Get SysRoleResourceRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysRoleResourceRelateDAO getSysRoleResourceRelateDao() {
        return sysRoleResourceRelateDao;
    } // end getSysRoleResourceRelateDao()

    /**
     * Set SysRoleResourceRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysRoleResourceRelateDao(
        com.ourteam.system.dao.ISysRoleResourceRelateDAO aDao) {
        sysRoleResourceRelateDao = aDao;
    } // end setSysRoleResourceRelateDao()

    /**
     * Get SysRoleGroup DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysRoleGroupDAO getSysRoleGroupDao() {
        return sysRoleGroupDao;
    } // end getSysRoleGroupDao()

    /**
     * Set SysRoleGroup DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysRoleGroupDao(com.ourteam.system.dao.ISysRoleGroupDAO aDao) {
        sysRoleGroupDao = aDao;
    } // end setSysRoleGroupDao()

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
     * Get SysRoleModuleRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysRoleModuleRelateDAO getSysRoleModuleRelateDao() {
        return sysRoleModuleRelateDao;
    } // end getSysRoleModuleRelateDao()

    /**
     * Set SysRoleModuleRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysRoleModuleRelateDao(
        com.ourteam.system.dao.ISysRoleModuleRelateDAO aDao) {
        sysRoleModuleRelateDao = aDao;
    } // end setSysRoleModuleRelateDao()

    /**
     * ȡ��ϵͳ��ɫ
     *
     * @param aSysRoleDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRole[] doGetSysRoles(
        final com.ourteam.system.dao.SysRoleDAOQueryBean aSysRoleDAOQueryBean)
        throws Exception;

    /**
     * ȡ��ϵͳ��ɫ
     *
     * @param aSysRoleDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRole[] getSysRoles(
        final com.ourteam.system.dao.SysRoleDAOQueryBean aSysRoleDAOQueryBean)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemRole[] result = doGetSysRoles(aSysRoleDAOQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoles error", e);
            throw e;
        } // end catch
    } // end getSysRoles()

    /**
     * ȡ�ý�ɫ����
     *
     * @param aSysRoleDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetSysRoleCount(
        final com.ourteam.system.dao.SysRoleDAOQueryBean aSysRoleDAOQueryBean)
        throws Exception;

    /**
     * ȡ�ý�ɫ����
     *
     * @param aSysRoleDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getSysRoleCount(
        final com.ourteam.system.dao.SysRoleDAOQueryBean aSysRoleDAOQueryBean)
        throws Exception {
        try {
            int result = doGetSysRoleCount(aSysRoleDAOQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleCount error", e);
            throw e;
        } // end catch
    } // end getSysRoleCount()

    /**
     * �½�ϵͳ��ɫ
     *
     * @param sysRole
     *
     * @throws Exception
     */
    protected abstract void doCreateSysRole(
        final com.ourteam.system.domain.SystemRole sysRole)
        throws Exception;

    /**
     * �½�ϵͳ��ɫ
     *
     * @param sysRole
     *
     * @throws Exception
     */
    public void createSysRole(
        final com.ourteam.system.domain.SystemRole sysRole)
        throws Exception {
        try {
            if (sysRole == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [sysRole] Value is NULL");
            } // end if

            doCreateSysRole(sysRole);
        } // end try
        catch (Exception e) {
            logger.error("do createSysRole error", e);
            throw e;
        } // end catch
    } // end createSysRole()

    /**
     * �޸�ϵͳ��ɫ
     *
     * @param sysRole
     *
     * @throws Exception
     */
    protected abstract void doModifySysRole(
        final com.ourteam.system.domain.SystemRole sysRole)
        throws Exception;

    /**
     * �޸�ϵͳ��ɫ
     *
     * @param sysRole
     *
     * @throws Exception
     */
    public void modifySysRole(
        final com.ourteam.system.domain.SystemRole sysRole)
        throws Exception {
        try {
            if (sysRole == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [sysRole] Value is NULL");
            } // end if

            doModifySysRole(sysRole);
        } // end try
        catch (Exception e) {
            logger.error("do modifySysRole error", e);
            throw e;
        } // end catch
    } // end modifySysRole()

    /**
     * ȡ��ϵͳ��ɫ��Դ����
     *
     * @param aSysRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRoleResourceRelate[] doGetSysRoleResourceRelates(
        final long aSysRoleId) throws Exception;

    /**
     * ȡ��ϵͳ��ɫ��Դ����
     *
     * @param aSysRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRoleResourceRelate[] getSysRoleResourceRelates(
        final long aSysRoleId) throws Exception {
        try {
            com.ourteam.system.domain.SystemRoleResourceRelate[] result = doGetSysRoleResourceRelates(aSysRoleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleResourceRelates error", e);
            throw e;
        } // end catch
    } // end getSysRoleResourceRelates()

    /**
     * ����ϵͳ��ɫ��Դ����
     *
     * @param aSysRoleId
     * @param aSystemRoleResourceRelates
     *
     * @throws Exception
     */
    protected abstract void doSetSysRoleResourceRelates(final long aSysRoleId,
        final com.ourteam.system.domain.SystemRoleResourceRelate[] aSystemRoleResourceRelates)
        throws Exception;

    /**
     * ����ϵͳ��ɫ��Դ����
     *
     * @param aSysRoleId
     * @param aSystemRoleResourceRelates
     *
     * @throws Exception
     */
    public void setSysRoleResourceRelates(final long aSysRoleId,
        final com.ourteam.system.domain.SystemRoleResourceRelate[] aSystemRoleResourceRelates)
        throws Exception {
        try {
            doSetSysRoleResourceRelates(aSysRoleId, aSystemRoleResourceRelates);
        } // end try
        catch (Exception e) {
            logger.error("do setSysRoleResourceRelates error", e);
            throw e;
        } // end catch
    } // end setSysRoleResourceRelates()

    /**
     * ȡ��ϵͳ��ɫȺ�б�
     *
     * @param aSysRoleGroupDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRoleGroup[] doGetSysRoleGroups(
        final com.ourteam.system.dao.SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
        throws Exception;

    /**
     * ȡ��ϵͳ��ɫȺ�б�
     *
     * @param aSysRoleGroupDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRoleGroup[] getSysRoleGroups(
        final com.ourteam.system.dao.SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemRoleGroup[] result = doGetSysRoleGroups(aSysRoleGroupDAOQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleGroups error", e);
            throw e;
        } // end catch
    } // end getSysRoleGroups()

    /**
     * ȡ��ϵͳ��ɫȺ����
     *
     * @param aSysRoleGroupDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetSysRoleGroupCount(
        final com.ourteam.system.dao.SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
        throws Exception;

    /**
     * ȡ��ϵͳ��ɫȺ����
     *
     * @param aSysRoleGroupDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getSysRoleGroupCount(
        final com.ourteam.system.dao.SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
        throws Exception {
        try {
            int result = doGetSysRoleGroupCount(aSysRoleGroupDAOQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleGroupCount error", e);
            throw e;
        } // end catch
    } // end getSysRoleGroupCount()

    /**
     * ����ϵͳ��ɫȺ��
     *
     * @param aSystemRoleGroup
     *
     * @throws Exception
     */
    protected abstract void doCreateSysRoleGroup(
        final com.ourteam.system.domain.SystemRoleGroup aSystemRoleGroup)
        throws Exception;

    /**
     * ����ϵͳ��ɫȺ��
     *
     * @param aSystemRoleGroup
     *
     * @throws Exception
     */
    public void createSysRoleGroup(
        final com.ourteam.system.domain.SystemRoleGroup aSystemRoleGroup)
        throws Exception {
        try {
            if (aSystemRoleGroup == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aSystemRoleGroup] Value is NULL");
            } // end if

            doCreateSysRoleGroup(aSystemRoleGroup);
        } // end try
        catch (Exception e) {
            logger.error("do createSysRoleGroup error", e);
            throw e;
        } // end catch
    } // end createSysRoleGroup()

    /**
     * �޸�ϵͳ��ɫȺ��
     *
     * @param aSystemRoleGroup
     *
     * @throws Exception
     */
    protected abstract void doModifySysRoleGroup(
        final com.ourteam.system.domain.SystemRoleGroup aSystemRoleGroup)
        throws Exception;

    /**
     * �޸�ϵͳ��ɫȺ��
     *
     * @param aSystemRoleGroup
     *
     * @throws Exception
     */
    public void modifySysRoleGroup(
        final com.ourteam.system.domain.SystemRoleGroup aSystemRoleGroup)
        throws Exception {
        try {
            if (aSystemRoleGroup == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aSystemRoleGroup] Value is NULL");
            } // end if

            doModifySysRoleGroup(aSystemRoleGroup);
        } // end try
        catch (Exception e) {
            logger.error("do modifySysRoleGroup error", e);
            throw e;
        } // end catch
    } // end modifySysRoleGroup()

    /**
     * ȡ�ý�ɫ������Ľ�ɫ
     *
     * @param aSysRoleGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRoleGroupRelate[] doGetSysRoleGroupRelatedRoles(
        final long aSysRoleGroupId) throws Exception;

    /**
     * ȡ�ý�ɫ������Ľ�ɫ
     *
     * @param aSysRoleGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRoleGroupRelate[] getSysRoleGroupRelatedRoles(
        final long aSysRoleGroupId) throws Exception {
        try {
            com.ourteam.system.domain.SystemRoleGroupRelate[] result = doGetSysRoleGroupRelatedRoles(aSysRoleGroupId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleGroupRelatedRoles error", e);
            throw e;
        } // end catch
    } // end getSysRoleGroupRelatedRoles()

    /**
     * ���ý�ɫ������Ľ�ɫ
     *
     * @param aSysRoleGroupId
     * @param aSystemRoleGroupRelates
     *
     * @throws Exception
     */
    protected abstract void doSetSysRoleGroupRelatedRoles(
        final long aSysRoleGroupId,
        final com.ourteam.system.domain.SystemRoleGroupRelate[] aSystemRoleGroupRelates)
        throws Exception;

    /**
     * ���ý�ɫ������Ľ�ɫ
     *
     * @param aSysRoleGroupId
     * @param aSystemRoleGroupRelates
     *
     * @throws Exception
     */
    public void setSysRoleGroupRelatedRoles(final long aSysRoleGroupId,
        final com.ourteam.system.domain.SystemRoleGroupRelate[] aSystemRoleGroupRelates)
        throws Exception {
        try {
            doSetSysRoleGroupRelatedRoles(aSysRoleGroupId,
                aSystemRoleGroupRelates);
        } // end try
        catch (Exception e) {
            logger.error("do setSysRoleGroupRelatedRoles error", e);
            throw e;
        } // end catch
    } // end setSysRoleGroupRelatedRoles()

    /**
     * ȡ��ϵͳ��ɫ�б��������Դ
     *
     * @param aSysRoleCodes
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRoleResourceRelate[] doGetSysRoleResourceRelatesByRoleCode(
        final String[] aSysRoleCodes) throws Exception;

    /**
     * ȡ��ϵͳ��ɫ�б��������Դ
     *
     * @param aSysRoleCodes
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRoleResourceRelate[] getSysRoleResourceRelatesByRoleCode(
        final String[] aSysRoleCodes) throws Exception {
        try {
            com.ourteam.system.domain.SystemRoleResourceRelate[] result = doGetSysRoleResourceRelatesByRoleCode(aSysRoleCodes);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleResourceRelatesByRoleCode error", e);
            throw e;
        } // end catch
    } // end getSysRoleResourceRelatesByRoleCode()

    /**
     * ����idȡ��ϵͳ��ɫ
     *
     * @param sysRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRole doGetSysRoleById(
        final long sysRoleId) throws Exception;

    /**
     * ����idȡ��ϵͳ��ɫ
     *
     * @param sysRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRole getSysRoleById(
        final long sysRoleId) throws Exception {
        try {
            com.ourteam.system.domain.SystemRole result = doGetSysRoleById(sysRoleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleById error", e);
            throw e;
        } // end catch
    } // end getSysRoleById()

    /**
     * ����idȡ��ϵͳ��ɫ��
     *
     * @param systemRoleGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRoleGroup doGetSysRoleGroupById(
        final long systemRoleGroupId) throws Exception;

    /**
     * ����idȡ��ϵͳ��ɫ��
     *
     * @param systemRoleGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRoleGroup getSysRoleGroupById(
        final long systemRoleGroupId) throws Exception {
        try {
            com.ourteam.system.domain.SystemRoleGroup result = doGetSysRoleGroupById(systemRoleGroupId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleGroupById error", e);
            throw e;
        } // end catch
    } // end getSysRoleGroupById()

    /**
     * ɾ��ϵͳ��ɫ
     *
     * @param sysRoleId
     *
     * @throws Exception
     */
    protected abstract void doDeleteSysRole(final long sysRoleId)
        throws Exception;

    /**
     * ɾ��ϵͳ��ɫ
     *
     * @param sysRoleId
     *
     * @throws Exception
     */
    public void deleteSysRole(final long sysRoleId) throws Exception {
        try {
            doDeleteSysRole(sysRoleId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteSysRole error", e);
            throw e;
        } // end catch
    } // end deleteSysRole()

    /**
     * ɾ��ϵͳ��ɫ��
     *
     * @param sysRoleGroupId
     *
     * @throws Exception
     */
    protected abstract void doDeleteSysRoleGroup(final long sysRoleGroupId)
        throws Exception;

    /**
     * ɾ��ϵͳ��ɫ��
     *
     * @param sysRoleGroupId
     *
     * @throws Exception
     */
    public void deleteSysRoleGroup(final long sysRoleGroupId)
        throws Exception {
        try {
            doDeleteSysRoleGroup(sysRoleGroupId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteSysRoleGroup error", e);
            throw e;
        } // end catch
    } // end deleteSysRoleGroup()

    /**
     * ��ѯϵͳ��ɫ
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemRole[] doQuerySysRoles(
        final com.ourteam.system.dao.SysRoleDAOQueryBean queryBean)
        throws Exception;

    /**
     * ��ѯϵͳ��ɫ
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemRole[] querySysRoles(
        final com.ourteam.system.dao.SysRoleDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.system.domain.SystemRole[] result = doQuerySysRoles(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do querySysRoles error", e);
            throw e;
        } // end catch
    } // end querySysRoles()

    /**
     * ȡ��ϵͳ��ɫȨ��
     *
     * @param sysRoleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemAction[] doGetSysRoleActions(
        final long[] sysRoleIds) throws Exception;

    /**
     * ȡ��ϵͳ��ɫȨ��
     *
     * @param sysRoleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemAction[] getSysRoleActions(
        final long[] sysRoleIds) throws Exception {
        try {
            com.ourteam.system.domain.SystemAction[] result = doGetSysRoleActions(sysRoleIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleActions error", e);
            throw e;
        } // end catch
    } // end getSysRoleActions()

    /**
     * ����ϵͳ��ɫȨ��
     *
     * @param sysRoleId
     * @param actionIds
     *
     * @throws Exception
     */
    protected abstract void doSetSysRoleActions(final long sysRoleId,
        final long[] actionIds) throws Exception;

    /**
     * ����ϵͳ��ɫȨ��
     *
     * @param sysRoleId
     * @param actionIds
     *
     * @throws Exception
     */
    public void setSysRoleActions(final long sysRoleId, final long[] actionIds)
        throws Exception {
        try {
            doSetSysRoleActions(sysRoleId, actionIds);
        } // end try
        catch (Exception e) {
            logger.error("do setSysRoleActions error", e);
            throw e;
        } // end catch
    } // end setSysRoleActions()

    /**
     * ���ϵͳ��ɫ�Ƿ�ӵ��ϵͳ����
     *
     * @param roleId
     * @param domainCode
     * @param actionCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract boolean doIsSysRoleHasAction(final long roleId,
        final String domainCode, final String actionCode)
        throws Exception;

    /**
     * ���ϵͳ��ɫ�Ƿ�ӵ��ϵͳ����
     *
     * @param roleId
     * @param domainCode
     * @param actionCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean isSysRoleHasAction(final long roleId,
        final String domainCode, final String actionCode)
        throws Exception {
        try {
            boolean result = doIsSysRoleHasAction(roleId, domainCode, actionCode);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do isSysRoleHasAction error", e);
            throw e;
        } // end catch
    } // end isSysRoleHasAction()

    /**
     * ȡ�ý�ɫ������ϵͳģ��
     *
     * @param sysRoleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemModule[] doGetSysRoleModules(
        final long[] sysRoleIds) throws Exception;

    /**
     * ȡ�ý�ɫ������ϵͳģ��
     *
     * @param sysRoleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemModule[] getSysRoleModules(
        final long[] sysRoleIds) throws Exception {
        try {
            com.ourteam.system.domain.SystemModule[] result = doGetSysRoleModules(sysRoleIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSysRoleModules error", e);
            throw e;
        } // end catch
    } // end getSysRoleModules()

    /**
     * ���ý�ɫģ�����
     *
     * @param sysRoleId
     * @param sysModuleIds
     *
     * @throws Exception
     */
    protected abstract void doSetSysRoleModules(final long sysRoleId,
        final long[] sysModuleIds) throws Exception;

    /**
     * ���ý�ɫģ�����
     *
     * @param sysRoleId
     * @param sysModuleIds
     *
     * @throws Exception
     */
    public void setSysRoleModules(final long sysRoleId,
        final long[] sysModuleIds) throws Exception {
        try {
            doSetSysRoleModules(sysRoleId, sysModuleIds);
        } // end try
        catch (Exception e) {
            logger.error("do setSysRoleModules error", e);
            throw e;
        } // end catch
    } // end setSysRoleModules()
} // end AbstractSysRoleService
