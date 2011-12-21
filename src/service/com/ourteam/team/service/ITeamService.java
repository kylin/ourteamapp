/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.service;

/**
*  �Ŷӷ���
*  Generated Date 2011-11-26 09:35:55   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ITeamService {
    /**
     * ȡ���Ŷ�����
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
     * ȡ���Ŷ���Ϣ
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
     * ͨ��IDȡ���Ŷ���Ϣ
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
     * �޸��ŶӶ���
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
     * �½��ŶӶ���
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
     * ɾ���ŶӶ���
     *
     * @param teamDefineId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamDefine(final long teamDefineId) throws Exception;

    /**
     * ȡ���Ŷӳ�Ա
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
     * ȡ���Ŷӽ�ɫ����
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
     * ����ɾ���ŶӶ���
     *
     * @param teamIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamDefines(final long[] teamIds) throws Exception;

    /**
     * ����Ŷӳ�Ա
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
     * ɾ���Ŷӳ�Ա
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
     * �޸��Ŷӳ�Ա��Ϣ
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
     * ����Ŷӽ�ɫ
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
     * �����Ŷӽ�ɫ
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
     * ɾ���Ŷӽ�ɫ
     *
     * @param teamRoleIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeTeamRoles(final long[] teamRoleIds) throws Exception;

    /**
     * �����Ŷ�IDȡ���Ŷ�����
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
     * ȡ���Ŷ�����
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
     * ȡ���Ŷ���������
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
     * ͨ����ԱIDȡ���Ŷӳ�Ա��Ϣ
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
     * ȡ���Ŷ�ҵ����
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
     * ����IDȡ���Ŷ�ҵ����
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
     * ��ѯ�ŶӶ���
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
     * �����Ŷ�IDȡ��ϵͳ�û�
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
     * ���ݳ�ԱIDȡ���Ŷ�
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
     * ȡ��Ա�������Ŷ�
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
