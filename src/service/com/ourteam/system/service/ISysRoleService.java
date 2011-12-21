/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  ϵͳ��ɫ����
*  Generated Date 2011-10-27 10:02:44   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysRoleService {
    /**
     * ȡ��ϵͳ��ɫ
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
     * ȡ�ý�ɫ����
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
     * �½�ϵͳ��ɫ
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
     * �޸�ϵͳ��ɫ
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
     * ȡ��ϵͳ��ɫ��Դ����
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
     * ����ϵͳ��ɫ��Դ����
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
     * ȡ��ϵͳ��ɫȺ�б�
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
     * ȡ��ϵͳ��ɫȺ����
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
     * ����ϵͳ��ɫȺ��
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
     * �޸�ϵͳ��ɫȺ��
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
     * ȡ�ý�ɫ������Ľ�ɫ
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
     * ���ý�ɫ������Ľ�ɫ
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
     * ȡ��ϵͳ��ɫ�б��������Դ
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
     * ����idȡ��ϵͳ��ɫ
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
     * ����idȡ��ϵͳ��ɫ��
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
     * ɾ��ϵͳ��ɫ
     *
     * @param sysRoleId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRole(final long sysRoleId) throws Exception;

    /**
     * ɾ��ϵͳ��ɫ��
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
     * ��ѯϵͳ��ɫ
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
     * ȡ��ϵͳ��ɫȨ��
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
     * ����ϵͳ��ɫȨ��
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
     * ���ϵͳ��ɫ�Ƿ�ӵ��ϵͳ����
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
     * ȡ�ý�ɫ������ϵͳģ��
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
     * ���ý�ɫģ�����
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
