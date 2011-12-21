/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.service;

/**
*  团队服务
*  Generated Date 2011-11-26 09:35:55   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ITeamService {
    /**
     * 取得团队数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getTeamDefineCount(
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
     *
     * @model
     */
    com.ourteam.team.domain.TeamDefineBean[] getTeamDefines(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 通过ID取得团队信息
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamDefineBean getTeamDefineById(final long teamId)
        throws Exception;

    /**
     * 修改团队定义
     *
     * @param teamDefine
     *
     * @throws Exception
     *
     * @model
     */
    void modifyTeamDefine(
        final com.ourteam.team.domain.TeamDefineBean teamDefine)
        throws Exception;

    /**
     * 新建团队定义
     *
     * @param teamDefine
     *
     * @throws Exception
     *
     * @model
     */
    void addNewTeamDefine(
        final com.ourteam.team.domain.TeamDefineBean teamDefine)
        throws Exception;

    /**
     * 删除团队定义
     *
     * @param teamDefineId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamDefine(final long teamDefineId) throws Exception;

    /**
     * 取得团队成员
     *
     * @param teamDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamMemberBean[] getTeamMembers(
        final long teamDefineId) throws Exception;

    /**
     * 取得团队角色定义
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamRoleBean[] getTeamRoles(final long teamId)
        throws Exception;

    /**
     * 批量删除团队定义
     *
     * @param teamIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamDefines(final long[] teamIds) throws Exception;

    /**
     * 添加团队成员
     *
     * @param teamId
     * @param teamMembers
     *
     * @throws Exception
     *
     * @model
     */
    void addTeamMembers(final long teamId,
        final com.ourteam.team.domain.TeamMemberBean[] teamMembers)
        throws Exception;

    /**
     * 删除团队成员
     *
     * @param teamMemberIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeTeamMembers(final long[] teamMemberIds)
        throws Exception;

    /**
     * 修改团队成员信息
     *
     * @param teamMembers
     *
     * @throws Exception
     *
     * @model
     */
    void modifyTeamMembers(
        final com.ourteam.team.domain.TeamMemberBean[] teamMembers)
        throws Exception;

    /**
     * 添加团队角色
     *
     * @param teamId
     * @param teamRole
     *
     * @throws Exception
     *
     * @model
     */
    void addTeamRole(final long teamId,
        final com.ourteam.team.domain.TeamRoleBean teamRole)
        throws Exception;

    /**
     * 更新团队角色
     *
     * @param teamRole
     *
     * @throws Exception
     *
     * @model
     */
    void modifyTeamRole(final com.ourteam.team.domain.TeamRoleBean teamRole)
        throws Exception;

    /**
     * 删除团队角色
     *
     * @param teamRoleIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeTeamRoles(final long[] teamRoleIds) throws Exception;

    /**
     * 根据团队ID取得团队日历
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.TeamCalendarDefineBean getTeamCalendarByTeamId(
        final long teamId) throws Exception;

    /**
     * 取得团队日历
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.calendar.domain.TeamCalendarDefineBean[] getTeamCalendars(
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
     *
     * @model
     */
    int getTeamCalendarCount(
        final com.ourteam.calendar.dao.TeamCalendarDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 通过成员ID取得团队成员信息
     *
     * @param memberId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamMemberBean[] getTeamMembersByMemberId(
        final long memberId) throws Exception;

    /**
     * 取得团队业务定义
     *
     * @param teamId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamBusinessDefineBean[] getTeamBusinessDefines(
        final long teamId) throws Exception;

    /**
     * 根据ID取得团队业务定义
     *
     * @param teamId
     * @param teamBusinessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamBusinessDefineBean getTeamBusinessDefineById(
        final long teamId, final long teamBusinessDefineId)
        throws Exception;

    /**
     * 查询团队定义
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamDefineBean[] queryTeamDefine(
        final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 根据团队ID取得系统用户
     *
     * @param teamIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeBean[] getEmployeesByTeamIds(
        final long[] teamIds) throws Exception;

    /**
     * 根据成员ID取得团队
     *
     * @param memberId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    long[] getTeamByMemberId(final long memberId) throws Exception;

    /**
     * 取得员工所属团队
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.team.domain.TeamDefineBean[] getEmployeeTeams(
        final long employeeId) throws Exception;
} // end ITeamService
