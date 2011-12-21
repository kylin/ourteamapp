/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 团队服务 Generated Date 2011-11-26 09:36:02
 *
 * @author Auto Gen
 */
abstract class AbstractTeamService extends net.service.DefaultServiceImpl
    implements ITeamService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractTeamService.class);

    /** TeamDefine DAO Instance */
    protected com.ourteam.team.dao.ITeamDefineDAO teamDefineDao;

    /** TeamMember DAO Instance */
    protected com.ourteam.team.dao.ITeamMemberDAO teamMemberDao;

    /** TeamRole DAO Instance */
    protected com.ourteam.team.dao.ITeamRoleDAO teamRoleDao;

    /** TeamCalendarDefine DAO Instance */
    protected com.ourteam.calendar.dao.ITeamCalendarDefineDAO teamCalendarDefineDao;

    /** TeamBusinessDefine DAO Instance */
    protected com.ourteam.team.dao.ITeamBusinessDefineDAO teamBusinessDefineDao;

    /**
     * Get TeamDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.team.dao.ITeamDefineDAO getTeamDefineDao() {
        return teamDefineDao;
    } // end getTeamDefineDao()

    /**
     * Set TeamDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setTeamDefineDao(com.ourteam.team.dao.ITeamDefineDAO aDao) {
        teamDefineDao = aDao;
    } // end setTeamDefineDao()

    /**
     * Get TeamMember DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.team.dao.ITeamMemberDAO getTeamMemberDao() {
        return teamMemberDao;
    } // end getTeamMemberDao()

    /**
     * Set TeamMember DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setTeamMemberDao(com.ourteam.team.dao.ITeamMemberDAO aDao) {
        teamMemberDao = aDao;
    } // end setTeamMemberDao()

    /**
     * Get TeamRole DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.team.dao.ITeamRoleDAO getTeamRoleDao() {
        return teamRoleDao;
    } // end getTeamRoleDao()

    /**
     * Set TeamRole DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setTeamRoleDao(com.ourteam.team.dao.ITeamRoleDAO aDao) {
        teamRoleDao = aDao;
    } // end setTeamRoleDao()

    /**
     * Get TeamCalendarDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.calendar.dao.ITeamCalendarDefineDAO getTeamCalendarDefineDao() {
        return teamCalendarDefineDao;
    } // end getTeamCalendarDefineDao()

    /**
     * Set TeamCalendarDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setTeamCalendarDefineDao(
        com.ourteam.calendar.dao.ITeamCalendarDefineDAO aDao) {
        teamCalendarDefineDao = aDao;
    } // end setTeamCalendarDefineDao()

    /**
     * Get TeamBusinessDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.team.dao.ITeamBusinessDefineDAO getTeamBusinessDefineDao() {
        return teamBusinessDefineDao;
    } // end getTeamBusinessDefineDao()

    /**
     * Set TeamBusinessDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setTeamBusinessDefineDao(
        com.ourteam.team.dao.ITeamBusinessDefineDAO aDao) {
        teamBusinessDefineDao = aDao;
    } // end setTeamBusinessDefineDao()

    /**
     * 取得团队数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetTeamDefineCount(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取得团队数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getTeamDefineCount(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doGetTeamDefineCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamDefineCount error", e);
            throw e;
        } // end catch
    } // end getTeamDefineCount()

    /**
     * 取得团队信息
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamDefineBean[] doGetTeamDefines(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取得团队信息
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamDefineBean[] getTeamDefines(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.team.domain.TeamDefineBean[] result = doGetTeamDefines(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamDefines error", e);
            throw e;
        } // end catch
    } // end getTeamDefines()

    /**
     * 通过ID取得团队信息
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamDefineBean doGetTeamDefineById(
        final long teamId) throws Exception;

    /**
     * 通过ID取得团队信息
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamDefineBean getTeamDefineById(
        final long teamId) throws Exception {
        try {
            com.ourteam.team.domain.TeamDefineBean result = doGetTeamDefineById(teamId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamDefineById error", e);
            throw e;
        } // end catch
    } // end getTeamDefineById()

    /**
     * 修改团队定义
     *
     * @param teamDefine
     *
     * @throws Exception
     */
    protected abstract void doModifyTeamDefine(
        final com.ourteam.team.domain.TeamDefineBean teamDefine)
        throws Exception;

    /**
     * 修改团队定义
     *
     * @param teamDefine
     *
     * @throws Exception
     */
    public void modifyTeamDefine(
        final com.ourteam.team.domain.TeamDefineBean teamDefine)
        throws Exception {
        try {
            if (teamDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [teamDefine] Value is NULL");
            } // end if

            doModifyTeamDefine(teamDefine);
        } // end try
        catch (Exception e) {
            logger.error("do modifyTeamDefine error", e);
            throw e;
        } // end catch
    } // end modifyTeamDefine()

    /**
     * 新建团队定义
     *
     * @param teamDefine
     *
     * @throws Exception
     */
    protected abstract void doAddNewTeamDefine(
        final com.ourteam.team.domain.TeamDefineBean teamDefine)
        throws Exception;

    /**
     * 新建团队定义
     *
     * @param teamDefine
     *
     * @throws Exception
     */
    public void addNewTeamDefine(
        final com.ourteam.team.domain.TeamDefineBean teamDefine)
        throws Exception {
        try {
            if (teamDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [teamDefine] Value is NULL");
            } // end if

            doAddNewTeamDefine(teamDefine);
        } // end try
        catch (Exception e) {
            logger.error("do addNewTeamDefine error", e);
            throw e;
        } // end catch
    } // end addNewTeamDefine()

    /**
     * 删除团队定义
     *
     * @param teamDefineId
     *
     * @throws Exception
     */
    protected abstract void doDeleteTeamDefine(final long teamDefineId)
        throws Exception;

    /**
     * 删除团队定义
     *
     * @param teamDefineId
     *
     * @throws Exception
     */
    public void deleteTeamDefine(final long teamDefineId)
        throws Exception {
        try {
            doDeleteTeamDefine(teamDefineId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteTeamDefine error", e);
            throw e;
        } // end catch
    } // end deleteTeamDefine()

    /**
     * 取得团队成员
     *
     * @param teamDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamMemberBean[] doGetTeamMembers(
        final long teamDefineId) throws Exception;

    /**
     * 取得团队成员
     *
     * @param teamDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamMemberBean[] getTeamMembers(
        final long teamDefineId) throws Exception {
        try {
            com.ourteam.team.domain.TeamMemberBean[] result = doGetTeamMembers(teamDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamMembers error", e);
            throw e;
        } // end catch
    } // end getTeamMembers()

    /**
     * 取得团队角色定义
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamRoleBean[] doGetTeamRoles(
        final long teamId) throws Exception;

    /**
     * 取得团队角色定义
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamRoleBean[] getTeamRoles(
        final long teamId) throws Exception {
        try {
            com.ourteam.team.domain.TeamRoleBean[] result = doGetTeamRoles(teamId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamRoles error", e);
            throw e;
        } // end catch
    } // end getTeamRoles()

    /**
     * 批量删除团队定义
     *
     * @param teamIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteTeamDefines(final long[] teamIds)
        throws Exception;

    /**
     * 批量删除团队定义
     *
     * @param teamIds
     *
     * @throws Exception
     */
    public void deleteTeamDefines(final long[] teamIds)
        throws Exception {
        try {
            doDeleteTeamDefines(teamIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteTeamDefines error", e);
            throw e;
        } // end catch
    } // end deleteTeamDefines()

    /**
     * 添加团队成员
     *
     * @param teamId
     * @param teamMembers
     *
     * @throws Exception
     */
    protected abstract void doAddTeamMembers(final long teamId,
        final com.ourteam.team.domain.TeamMemberBean[] teamMembers)
        throws Exception;

    /**
     * 添加团队成员
     *
     * @param teamId
     * @param teamMembers
     *
     * @throws Exception
     */
    public void addTeamMembers(final long teamId,
        final com.ourteam.team.domain.TeamMemberBean[] teamMembers)
        throws Exception {
        try {
            doAddTeamMembers(teamId, teamMembers);
        } // end try
        catch (Exception e) {
            logger.error("do addTeamMembers error", e);
            throw e;
        } // end catch
    } // end addTeamMembers()

    /**
     * 删除团队成员
     *
     * @param teamMemberIds
     *
     * @throws Exception
     */
    protected abstract void doRemoveTeamMembers(final long[] teamMemberIds)
        throws Exception;

    /**
     * 删除团队成员
     *
     * @param teamMemberIds
     *
     * @throws Exception
     */
    public void removeTeamMembers(final long[] teamMemberIds)
        throws Exception {
        try {
            doRemoveTeamMembers(teamMemberIds);
        } // end try
        catch (Exception e) {
            logger.error("do removeTeamMembers error", e);
            throw e;
        } // end catch
    } // end removeTeamMembers()

    /**
     * 修改团队成员信息
     *
     * @param teamMembers
     *
     * @throws Exception
     */
    protected abstract void doModifyTeamMembers(
        final com.ourteam.team.domain.TeamMemberBean[] teamMembers)
        throws Exception;

    /**
     * 修改团队成员信息
     *
     * @param teamMembers
     *
     * @throws Exception
     */
    public void modifyTeamMembers(
        final com.ourteam.team.domain.TeamMemberBean[] teamMembers)
        throws Exception {
        try {
            doModifyTeamMembers(teamMembers);
        } // end try
        catch (Exception e) {
            logger.error("do modifyTeamMembers error", e);
            throw e;
        } // end catch
    } // end modifyTeamMembers()

    /**
     * 添加团队角色
     *
     * @param teamId
     * @param teamRole
     *
     * @throws Exception
     */
    protected abstract void doAddTeamRole(final long teamId,
        final com.ourteam.team.domain.TeamRoleBean teamRole)
        throws Exception;

    /**
     * 添加团队角色
     *
     * @param teamId
     * @param teamRole
     *
     * @throws Exception
     */
    public void addTeamRole(final long teamId,
        final com.ourteam.team.domain.TeamRoleBean teamRole)
        throws Exception {
        try {
            if (teamRole == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [teamRole] Value is NULL");
            } // end if

            doAddTeamRole(teamId, teamRole);
        } // end try
        catch (Exception e) {
            logger.error("do addTeamRole error", e);
            throw e;
        } // end catch
    } // end addTeamRole()

    /**
     * 更新团队角色
     *
     * @param teamRole
     *
     * @throws Exception
     */
    protected abstract void doModifyTeamRole(
        final com.ourteam.team.domain.TeamRoleBean teamRole)
        throws Exception;

    /**
     * 更新团队角色
     *
     * @param teamRole
     *
     * @throws Exception
     */
    public void modifyTeamRole(
        final com.ourteam.team.domain.TeamRoleBean teamRole)
        throws Exception {
        try {
            doModifyTeamRole(teamRole);
        } // end try
        catch (Exception e) {
            logger.error("do modifyTeamRole error", e);
            throw e;
        } // end catch
    } // end modifyTeamRole()

    /**
     * 删除团队角色
     *
     * @param teamRoleIds
     *
     * @throws Exception
     */
    protected abstract void doRemoveTeamRoles(final long[] teamRoleIds)
        throws Exception;

    /**
     * 删除团队角色
     *
     * @param teamRoleIds
     *
     * @throws Exception
     */
    public void removeTeamRoles(final long[] teamRoleIds)
        throws Exception {
        try {
            doRemoveTeamRoles(teamRoleIds);
        } // end try
        catch (Exception e) {
            logger.error("do removeTeamRoles error", e);
            throw e;
        } // end catch
    } // end removeTeamRoles()

    /**
     * 根据团队ID取得团队日历
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.calendar.domain.TeamCalendarDefineBean doGetTeamCalendarByTeamId(
        final long teamId) throws Exception;

    /**
     * 根据团队ID取得团队日历
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.calendar.domain.TeamCalendarDefineBean getTeamCalendarByTeamId(
        final long teamId) throws Exception {
        try {
            com.ourteam.calendar.domain.TeamCalendarDefineBean result = doGetTeamCalendarByTeamId(teamId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamCalendarByTeamId error", e);
            throw e;
        } // end catch
    } // end getTeamCalendarByTeamId()

    /**
     * 取得团队日历
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.calendar.domain.TeamCalendarDefineBean[] doGetTeamCalendars(
        final com.ourteam.calendar.dao.TeamCalendarDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取得团队日历
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.calendar.domain.TeamCalendarDefineBean[] getTeamCalendars(
        final com.ourteam.calendar.dao.TeamCalendarDefineDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.calendar.domain.TeamCalendarDefineBean[] result = doGetTeamCalendars(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamCalendars error", e);
            throw e;
        } // end catch
    } // end getTeamCalendars()

    /**
     * 取得团队日历数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetTeamCalendarCount(
        final com.ourteam.calendar.dao.TeamCalendarDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取得团队日历数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getTeamCalendarCount(
        final com.ourteam.calendar.dao.TeamCalendarDefineDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doGetTeamCalendarCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamCalendarCount error", e);
            throw e;
        } // end catch
    } // end getTeamCalendarCount()

    /**
     * 通过成员ID取得团队成员信息
     *
     * @param memberId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamMemberBean[] doGetTeamMembersByMemberId(
        final long memberId) throws Exception;

    /**
     * 通过成员ID取得团队成员信息
     *
     * @param memberId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamMemberBean[] getTeamMembersByMemberId(
        final long memberId) throws Exception {
        try {
            com.ourteam.team.domain.TeamMemberBean[] result = doGetTeamMembersByMemberId(memberId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamMembersByMemberId error", e);
            throw e;
        } // end catch
    } // end getTeamMembersByMemberId()

    /**
     * 取得团队业务定义
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamBusinessDefineBean[] doGetTeamBusinessDefines(
        final long teamId) throws Exception;

    /**
     * 取得团队业务定义
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamBusinessDefineBean[] getTeamBusinessDefines(
        final long teamId) throws Exception {
        try {
            com.ourteam.team.domain.TeamBusinessDefineBean[] result = doGetTeamBusinessDefines(teamId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamBusinessDefines error", e);
            throw e;
        } // end catch
    } // end getTeamBusinessDefines()

    /**
     * 根据ID取得团队业务定义
     *
     * @param teamId
     * @param teamBusinessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamBusinessDefineBean doGetTeamBusinessDefineById(
        final long teamId, final long teamBusinessDefineId)
        throws Exception;

    /**
     * 根据ID取得团队业务定义
     *
     * @param teamId
     * @param teamBusinessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamBusinessDefineBean getTeamBusinessDefineById(
        final long teamId, final long teamBusinessDefineId)
        throws Exception {
        try {
            com.ourteam.team.domain.TeamBusinessDefineBean result = doGetTeamBusinessDefineById(teamId,
                    teamBusinessDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamBusinessDefineById error", e);
            throw e;
        } // end catch
    } // end getTeamBusinessDefineById()

    /**
     * 查询团队定义
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamDefineBean[] doQueryTeamDefine(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询团队定义
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamDefineBean[] queryTeamDefine(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.team.domain.TeamDefineBean[] result = doQueryTeamDefine(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryTeamDefine error", e);
            throw e;
        } // end catch
    } // end queryTeamDefine()

    /**
     * 根据团队ID取得系统用户
     *
     * @param teamIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeBean[] doGetEmployeesByTeamIds(
        final long[] teamIds) throws Exception;

    /**
     * 根据团队ID取得系统用户
     *
     * @param teamIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.EmployeeBean[] getEmployeesByTeamIds(
        final long[] teamIds) throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeBean[] result = doGetEmployeesByTeamIds(teamIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeesByTeamIds error", e);
            throw e;
        } // end catch
    } // end getEmployeesByTeamIds()

    /**
     * 根据成员ID取得团队
     *
     * @param memberId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract long[] doGetTeamByMemberId(final long memberId)
        throws Exception;

    /**
     * 根据成员ID取得团队
     *
     * @param memberId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public long[] getTeamByMemberId(final long memberId)
        throws Exception {
        try {
            long[] result = doGetTeamByMemberId(memberId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTeamByMemberId error", e);
            throw e;
        } // end catch
    } // end getTeamByMemberId()

    /**
     * 取得员工所属团队
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.team.domain.TeamDefineBean[] doGetEmployeeTeams(
        final long employeeId) throws Exception;

    /**
     * 取得员工所属团队
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.team.domain.TeamDefineBean[] getEmployeeTeams(
        final long employeeId) throws Exception {
        try {
            com.ourteam.team.domain.TeamDefineBean[] result = doGetEmployeeTeams(employeeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeeTeams error", e);
            throw e;
        } // end catch
    } // end getEmployeeTeams()
} // end AbstractTeamService
