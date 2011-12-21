/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.team.service;

import org.apache.commons.lang.ArrayUtils;

import com.ourteam.calendar.dao.TeamCalendarDefine;
import com.ourteam.calendar.dao.TeamCalendarDefineDAOQueryBean;
import com.ourteam.calendar.domain.TeamCalendarDefineBean;
import com.ourteam.hr.domain.EmployeeBean;
import com.ourteam.team.dao.ITeamMemberDAO;
import com.ourteam.team.dao.TeamBusinessDefine;
import com.ourteam.team.dao.TeamBusinessDefineDAOQueryBean;
import com.ourteam.team.dao.TeamDefine;
import com.ourteam.team.dao.TeamDefineDAOQueryBean;
import com.ourteam.team.dao.TeamMember;
import com.ourteam.team.dao.TeamMemberDAOQueryBean;
import com.ourteam.team.dao.TeamRoleDAOQueryBean;
import com.ourteam.team.domain.TeamBusinessDefineBean;
import com.ourteam.team.domain.TeamDefineBean;
import com.ourteam.team.domain.TeamMemberBean;
import com.ourteam.team.domain.TeamRoleBean;

/**
 * �Ŷӷ��� impl Generated Date 2011-04-13 10:11:51
 * 
 * @author $Auto Gen
 */
public class TeamServiceImpl extends AbstractTeamService {
	/**
	 * ȡ���Ŷ����� impl
	 * 
	 * @param queryBean
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected int doGetTeamDefineCount(
			final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
			throws Exception {
		return teamDefineDao.queryTeamDefineCount(queryBean);
	} // end doGetTeamDefineCount()

	/**
	 * ȡ���Ŷ���Ϣ impl
	 * 
	 * @param queryBean
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.team.domain.TeamDefineBean[] doGetTeamDefines(
			final com.ourteam.team.dao.TeamDefineDAOQueryBean queryBean)
			throws Exception {
		return TeamDefineBean.toArray(teamDefineDao.queryTeamDefine(queryBean));
	} // end doGetTeamDefines()

	@Override
	protected TeamDefineBean doGetTeamDefineById(long teamId) throws Exception {
		TeamDefine teamDefine = teamDefineDao.findTeamDefineById(teamId);
		return teamDefine != null ? new TeamDefineBean(teamDefine) : null;
	}

	@Override
	protected void doModifyTeamDefine(TeamDefineBean teamDefineBean)
			throws Exception {

		TeamDefine teamDefine = teamDefineBean.convertToTeamDefine();

		teamDefineDao.updateTeamDefine(teamDefine);

	}

	@Override
	protected void doAddNewTeamDefine(TeamDefineBean teamDefineBean)
			throws Exception {

		TeamDefine teamDefine = teamDefineBean.convertToTeamDefine();

		teamDefineDao.insertTeamDefine(teamDefine);

	}

	@Override
	protected void doDeleteTeamDefine(long teamDefineId) throws Exception {

		TeamMemberDAOQueryBean teamMemberDAOQueryBean = new TeamMemberDAOQueryBean();

		teamMemberDAOQueryBean.createCriteria().andTeamIdEqualTo(teamDefineId);

		teamMemberDao.deleteTeamMember(teamMemberDAOQueryBean);

		teamDefineDao.deleteTeamDefine(teamDefineId);

	}

	@Override
	protected TeamMemberBean[] doGetTeamMembers(long teamDefineId)
			throws Exception {

		TeamMemberDAOQueryBean queryBean = new TeamMemberDAOQueryBean();

		queryBean.createCriteria().andTeamIdEqualTo(teamDefineId);

		queryBean.setSortProperty(ITeamMemberDAO.TeamRoleCode);

		return TeamMemberBean.toArray(teamMemberDao.queryTeamMember(queryBean));
	}

	@Override
	protected TeamRoleBean[] doGetTeamRoles(long teamId) throws Exception {

		TeamRoleDAOQueryBean queryBean = new TeamRoleDAOQueryBean();

		queryBean.createCriteria().andTeamIdEqualTo(teamId);

		return TeamRoleBean.toArray(teamRoleDao.queryTeamRole(queryBean));
	}

	@Override
	protected void doDeleteTeamDefines(long[] teamIds) throws Exception {

		if (ArrayUtils.isEmpty(teamIds)) {
			return;
		}

		TeamMemberDAOQueryBean teamMemberDAOQueryBean = new TeamMemberDAOQueryBean();

		teamMemberDAOQueryBean.createCriteria().andTeamIdIn(teamIds);

		teamMemberDao.deleteTeamMember(teamMemberDAOQueryBean);

		TeamDefineDAOQueryBean queryBean = new TeamDefineDAOQueryBean();

		queryBean.createCriteria().andIdIn(teamIds);

		teamDefineDao.deleteTeamDefine(queryBean);

	}

	@Override
	protected void doAddTeamMembers(long teamId, TeamMemberBean[] teamMembers)
			throws Exception {

		TeamMember[] members = new TeamMember[teamMembers.length];

		for (int i = 0; i < teamMembers.length; i++) {
			TeamMemberBean teamMemberBean = teamMembers[i];
			teamMemberBean.setTeamId(teamId);
			members[i] = teamMemberBean.convertToTeamMember();
		}

		teamMemberDao.batchInsertTeamMember(members);

	}

	@Override
	protected void doRemoveTeamMembers(long[] teamMemberIds) throws Exception {

		if (ArrayUtils.isEmpty(teamMemberIds)) {
			return;
		}

		TeamMemberDAOQueryBean queryBean = new TeamMemberDAOQueryBean();

		queryBean.createCriteria().andIdIn(teamMemberIds);

		teamMemberDao.deleteTeamMember(queryBean);
	}

	@Override
	protected void doModifyTeamMembers(TeamMemberBean[] teamMembers)
			throws Exception {

		TeamMember[] members = new TeamMember[teamMembers.length];

		for (int i = 0; i < teamMembers.length; i++) {
			TeamMemberBean teamMemberBean = teamMembers[i];
			members[i] = teamMemberBean.convertToTeamMember();
		}

		teamMemberDao.batchUpdateTeamMember(members);

	}

	@Override
	protected void doAddTeamRole(long teamId, TeamRoleBean teamRole)
			throws Exception {

		teamRole.setTeamId(teamId);

		this.teamRoleDao.insertTeamRole(teamRole.convertToTeamRole());

	}

	@Override
	protected void doModifyTeamRole(TeamRoleBean teamRole) throws Exception {

		this.teamRoleDao.updateTeamRole(teamRole.convertToTeamRole());

	}

	@Override
	protected void doRemoveTeamRoles(long[] teamRoleIds) throws Exception {

		TeamRoleDAOQueryBean queryBean = new TeamRoleDAOQueryBean();

		queryBean.createCriteria().andIdIn(teamRoleIds);

		this.teamRoleDao.deleteTeamRole(queryBean);

	}

	@Override
	protected TeamCalendarDefineBean doGetTeamCalendarByTeamId(long teamId)
			throws Exception {

		TeamCalendarDefineDAOQueryBean queryBean = new TeamCalendarDefineDAOQueryBean();

		queryBean.createCriteria().andOwnerIdEqualTo(teamId);

		TeamCalendarDefine[] teamCalendarDefines = teamCalendarDefineDao
				.queryTeamCalendarDefine(queryBean);

		if (ArrayUtils.isEmpty(teamCalendarDefines)) {

			TeamDefineBean teamDefineBean = getTeamDefineById(teamId);

			TeamCalendarDefine teamCalendarDefine = new TeamCalendarDefine();

			teamCalendarDefine.setCalendarName(teamDefineBean.getTeamName());

			teamCalendarDefine.setOwnerId(teamId);

			teamCalendarDefine.setCalendarType("TEAM");

			teamCalendarDefineDao.insertTeamCalendarDefine(teamCalendarDefine);

			return new TeamCalendarDefineBean(teamCalendarDefine);

		} else {
			return new TeamCalendarDefineBean(teamCalendarDefines[0]);
		}

	}

	@Override
	protected TeamCalendarDefineBean[] doGetTeamCalendars(
			TeamCalendarDefineDAOQueryBean queryBean) throws Exception {

		return TeamCalendarDefineBean.toArray(teamCalendarDefineDao
				.queryTeamCalendarDefine(queryBean));
	}

	@Override
	protected int doGetTeamCalendarCount(
			TeamCalendarDefineDAOQueryBean queryBean) throws Exception {

		return teamCalendarDefineDao.queryTeamCalendarDefineCount(queryBean);
	}

	@Override
	protected TeamMemberBean[] doGetTeamMembersByMemberId(long memberId)
			throws Exception {

		TeamMemberDAOQueryBean queryBean = new TeamMemberDAOQueryBean();

		queryBean.createCriteria().andEmployeeIdEqualTo(memberId);

		return TeamMemberBean.toArray(this.teamMemberDao
				.queryTeamMember(queryBean));

	}

	@Override
	protected TeamBusinessDefineBean[] doGetTeamBusinessDefines(long teamId)
			throws Exception {

		TeamDefine teamDefine = this.teamDefineDao.findTeamDefineById(teamId);

		TeamBusinessDefineDAOQueryBean queryBean = new TeamBusinessDefineDAOQueryBean();

		queryBean.createCriteria().andTeamIdIn(new long[] { 0, teamId });

		TeamBusinessDefine[] businessDefines = this.teamBusinessDefineDao
				.queryTeamBusinessDefine(queryBean);

		for (int i = 0; i < businessDefines.length; i++) {
			TeamBusinessDefine teamBusinessDefine = businessDefines[i];
			teamBusinessDefine.setTeamId(teamId);
			teamBusinessDefine.setTeamName(teamDefine.getTeamName());
		}

		return TeamBusinessDefineBean.toArray(businessDefines);
	}

	@Override
	protected TeamBusinessDefineBean doGetTeamBusinessDefineById(long teamId,
			long teamBusinessDefineId) throws Exception {

		TeamBusinessDefine teamBusinessDefine = this.teamBusinessDefineDao
				.findTeamBusinessDefineById(teamBusinessDefineId);

		TeamDefine teamDefine = this.teamDefineDao.findTeamDefineById(teamId);

		teamBusinessDefine.setTeamId(teamId);

		teamBusinessDefine.setTeamName(teamDefine.getTeamName());

		return teamBusinessDefine != null ? new TeamBusinessDefineBean(
				teamBusinessDefine) : null;
	}

	@Override
	protected TeamDefineBean[] doQueryTeamDefine(
			TeamDefineDAOQueryBean queryBean) throws Exception {

		if (queryBean == null) {
			queryBean = new TeamDefineDAOQueryBean();
		}

		return TeamDefineBean.toArray(teamDefineDao.queryTeamDefine(queryBean));
	}

	@Override
	protected EmployeeBean[] doGetEmployeesByTeamIds(long[] teamIds)
			throws Exception {

		if (ArrayUtils.isEmpty(teamIds)) {
			return new EmployeeBean[0];
		}

		TeamMemberDAOQueryBean queryBean = new TeamMemberDAOQueryBean();

		queryBean.createCriteria().andTeamIdIn(teamIds);

		return EmployeeBean.toArray(teamMemberDao.queryEmployees(queryBean));
	}

	@Override
	protected long[] doGetTeamByMemberId(long memberId) throws Exception {

		TeamMemberDAOQueryBean queryBean = new TeamMemberDAOQueryBean();

		queryBean.createCriteria().andEmployeeIdEqualTo(memberId);

		TeamMember[] teamMembers = teamMemberDao.queryTeamMember(queryBean);

		long[] teamIds = new long[teamMembers.length];

		for (int i = 0; i < teamIds.length; i++) {
			teamIds[i] = teamMembers[i].getTeamId();
		}

		return teamIds;
	}

	@Override
	protected TeamDefineBean[] doGetEmployeeTeams(long employeeId)
			throws Exception {

		TeamMemberDAOQueryBean queryBean = new TeamMemberDAOQueryBean();

		queryBean.createCriteria().andEmployeeIdEqualTo(employeeId);

		TeamMember[] teamMembers = teamMemberDao.queryTeamMember(queryBean);

		long[] teamIds = new long[teamMembers.length];

		for (int i = 0; i < teamIds.length; i++) {
			teamIds[i] = teamMembers[i].getTeamId();
		}

		if (ArrayUtils.isEmpty(teamIds)) {
			return new TeamDefineBean[0];
		}

		TeamDefineDAOQueryBean teanQueryBean = new TeamDefineDAOQueryBean();

		teanQueryBean.createCriteria().andIdIn(teamIds);

		return TeamDefineBean.toArray(this.teamDefineDao
				.queryTeamDefine(teanQueryBean));
	}

} // end TeamServiceImpl
