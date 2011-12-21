package com.ourteam.system.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ourteam.system.dao.ISysRoleActionRelateDAO;
import com.ourteam.system.dao.SysActionDAOQueryBean;
import com.ourteam.system.dao.SysRole;
import com.ourteam.system.dao.SysRoleActionRelate;
import com.ourteam.system.dao.SysRoleActionRelateDAOQueryBean;
import com.ourteam.system.dao.SysRoleDAOQueryBean;
import com.ourteam.system.dao.SysRoleGroup;
import com.ourteam.system.dao.SysRoleGroupDAOQueryBean;
import com.ourteam.system.dao.SysRoleModuleRelate;
import com.ourteam.system.dao.SysRoleModuleRelateDAOQueryBean;
import com.ourteam.system.dao.SysRoleRelate;
import com.ourteam.system.dao.SysRoleRelateDAOQueryBean;
import com.ourteam.system.dao.SysRoleResourceRelate;
import com.ourteam.system.dao.SysRoleResourceRelateDAOQueryBean;
import com.ourteam.system.domain.SystemAction;
import com.ourteam.system.domain.SystemModule;
import com.ourteam.system.domain.SystemRole;
import com.ourteam.system.domain.SystemRoleGroup;
import com.ourteam.system.domain.SystemRoleGroupRelate;
import com.ourteam.system.domain.SystemRoleResourceRelate;

/**
 * ϵͳ��ɫ���� impl Generated Date 2009-07-20 22:45:00
 * 
 * @author $Auto Gen
 */
public class SysRoleServiceImpl extends AbstractSysRoleService {

	private static final Map<Long, List<String>> ROLE_ACTION_MAP = new HashMap<Long, List<String>>();

	@Override
	protected SystemRole[] doGetSysRoles(
			SysRoleDAOQueryBean aSysRoleDAOQueryBean) throws Exception {

		SysRole[] sysRoles = sysRoleDao.querySysRole(aSysRoleDAOQueryBean);

		SystemRole[] roles = new SystemRole[sysRoles.length];

		for (int i = 0; i < roles.length; i++) {
			roles[i] = new SystemRole(sysRoles[i]);
		}

		return roles;
	}

	@Override
	protected int doGetSysRoleCount(SysRoleDAOQueryBean aSysRoleDAOQueryBean)
			throws Exception {

		return sysRoleDao.querySysRoleCount(aSysRoleDAOQueryBean);
	}

	@Override
	protected void doCreateSysRole(SystemRole sysRole) throws Exception {

		SysRole role = sysRole.convertToSysRole();

		if (sysRoleDao.checkIsUnique(role) == false) {
			throw new Exception("Role Code [" + role.getRoleCode()
					+ "] Is In Use");
		}

		sysRoleDao.insertSysRole(role);

	}

	@Override
	protected void doModifySysRole(SystemRole sysRole) throws Exception {

		SysRole role = sysRole.convertToSysRole();

		if (sysRoleDao.checkIsUnique(role) == false) {
			throw new Exception("Role Code [" + role.getRoleCode()
					+ "] Is In Use");
		}

		sysRoleDao.updateSysRole(role);
	}

	@Override
	protected SystemRoleResourceRelate[] doGetSysRoleResourceRelates(
			long aSysRoleId) throws Exception {

		SysRoleDAOQueryBean queryBean = new SysRoleDAOQueryBean();

		queryBean.createCriteria().andIdEqualTo(Long.valueOf(aSysRoleId));

		SysRoleResourceRelate[] sysRoleResourceRelates = sysRoleDao
				.querySysRoleResourceRelates(queryBean);

		SystemRoleResourceRelate[] relates = new SystemRoleResourceRelate[sysRoleResourceRelates.length];

		for (int i = 0; i < relates.length; i++) {
			relates[i] = new SystemRoleResourceRelate(sysRoleResourceRelates[i]);

		}

		return relates;
	}

	@Override
	protected void doSetSysRoleResourceRelates(long aSysRoleId,
			SystemRoleResourceRelate[] aSystemRoleResourceRelates)
			throws Exception {

		SysRoleResourceRelateDAOQueryBean queryBean = new SysRoleResourceRelateDAOQueryBean();

		queryBean.createCriteria()
				.andSysRoleIdEqualTo(Long.valueOf(aSysRoleId));

		SysRoleResourceRelate[] sysRoleResourceRelates = new SysRoleResourceRelate[aSystemRoleResourceRelates.length];

		for (int i = 0; i < sysRoleResourceRelates.length; i++) {
			sysRoleResourceRelates[i] = aSystemRoleResourceRelates[i]
					.convertToSysRoleResourceRelate();

			sysRoleResourceRelates[i].setSysRoleId(aSysRoleId);

		}

		sysRoleResourceRelateDao.synchronizeSysRoleResourceRelate(
				sysRoleResourceRelates, queryBean);
	}

	@Override
	protected void doCreateSysRoleGroup(SystemRoleGroup aSystemRoleGroup)
			throws Exception {

		SysRoleGroup roleGroup = aSystemRoleGroup.convertToSysRoleGroup();

		if (sysRoleGroupDao.checkIsUnique(roleGroup) == false) {
			throw new Exception("Role Group Code [" + roleGroup.getRoleCode()
					+ "] Is In Use");
		}

		sysRoleGroupDao.insertSysRoleGroup(roleGroup);

	}

	@Override
	protected int doGetSysRoleGroupCount(
			SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
			throws Exception {

		return sysRoleGroupDao
				.querySysRoleGroupCount(aSysRoleGroupDAOQueryBean);
	}

	@Override
	protected SystemRoleGroup[] doGetSysRoleGroups(
			SysRoleGroupDAOQueryBean aSysRoleGroupDAOQueryBean)
			throws Exception {

		SysRoleGroup[] roleGroups = sysRoleGroupDao
				.querySysRoleGroup(aSysRoleGroupDAOQueryBean);

		SystemRoleGroup[] systemRoleGroups = new SystemRoleGroup[roleGroups.length];

		for (int i = 0; i < systemRoleGroups.length; i++) {
			systemRoleGroups[i] = new SystemRoleGroup(roleGroups[i]);

		}

		return systemRoleGroups;
	}

	@Override
	protected void doModifySysRoleGroup(SystemRoleGroup aSystemRoleGroup)
			throws Exception {
		SysRoleGroup roleGroup = aSystemRoleGroup.convertToSysRoleGroup();

		if (sysRoleGroupDao.checkIsUnique(roleGroup) == false) {
			throw new Exception("Role Group Code [" + roleGroup.getRoleCode()
					+ "] Is In Use");
		}

		sysRoleGroupDao.updateSysRoleGroup(roleGroup);

	}

	@Override
	protected SystemRoleGroupRelate[] doGetSysRoleGroupRelatedRoles(
			long aSysRoleGroupId) throws Exception {

		SysRoleGroupDAOQueryBean queryBean = new SysRoleGroupDAOQueryBean();

		queryBean.createCriteria().andIdEqualTo(Long.valueOf(aSysRoleGroupId));

		SysRoleRelate[] roleRelates = sysRoleGroupDao
				.querySysRoleRelates(queryBean);

		SystemRoleGroupRelate[] systemRoleGroupRelates = new SystemRoleGroupRelate[roleRelates.length];

		for (int i = 0; i < systemRoleGroupRelates.length; i++) {
			systemRoleGroupRelates[i] = new SystemRoleGroupRelate(
					roleRelates[i]);
		}

		return systemRoleGroupRelates;
	}

	@Override
	protected void doSetSysRoleGroupRelatedRoles(long aSysRoleGroupId,
			SystemRoleGroupRelate[] aSystemRoleGroupRelates) throws Exception {

		SysRoleRelate[] relates = new SysRoleRelate[aSystemRoleGroupRelates.length];

		for (int i = 0; i < relates.length; i++) {
			aSystemRoleGroupRelates[i].setSysRoleGroupId(aSysRoleGroupId);
			relates[i] = aSystemRoleGroupRelates[i].convertToSysRoleRelate();
		}

		SysRoleRelateDAOQueryBean queryBean = new SysRoleRelateDAOQueryBean();

		queryBean.createCriteria().andSysRoleGroupIdEqualTo(
				Long.valueOf(aSysRoleGroupId));

		sysRoleRelateDao.synchronizeSysRoleRelate(relates, queryBean);
	}

	@Override
	protected SystemRoleResourceRelate[] doGetSysRoleResourceRelatesByRoleCode(
			String[] aSysRoleCodes) throws Exception {

		SysRoleDAOQueryBean queryBean = new SysRoleDAOQueryBean();

		queryBean.createCriteria().andRoleCodeIn(Arrays.asList(aSysRoleCodes));

		SysRoleResourceRelate[] sysRoleResourceRelates = sysRoleDao
				.querySysRoleResourceRelates(queryBean);

		SystemRoleResourceRelate[] relates = new SystemRoleResourceRelate[sysRoleResourceRelates.length];

		for (int i = 0; i < relates.length; i++) {
			relates[i] = new SystemRoleResourceRelate(sysRoleResourceRelates[i]);

		}

		return relates;

	}

	@Override
	protected SystemRole doGetSysRoleById(long sysRoleId) throws Exception {
		SysRole sysRole = sysRoleDao.findSysRoleById(sysRoleId);
		return sysRole == null ? null : new SystemRole(sysRole);
	}

	@Override
	protected SystemRoleGroup doGetSysRoleGroupById(long systemRoleGroupId)
			throws Exception {
		SysRoleGroup sysRoleGroup = sysRoleGroupDao
				.findSysRoleGroupById(systemRoleGroupId);
		return sysRoleGroup == null ? null : new SystemRoleGroup(sysRoleGroup);
	}

	@Override
	protected void doDeleteSysRole(long sysRoleId) throws Exception {
		sysRoleDao.deleteSysRole(sysRoleId);
	}

	@Override
	protected void doDeleteSysRoleGroup(long sysRoleGroupId) throws Exception {
		SysRoleRelateDAOQueryBean queryBean = new SysRoleRelateDAOQueryBean();

		queryBean.createCriteria().andSysRoleGroupIdEqualTo(sysRoleGroupId);

		sysRoleRelateDao.deleteSysRoleRelate(queryBean);

		sysRoleGroupDao.deleteSysRoleGroup(sysRoleGroupId);

	}

	@Override
	protected SystemRole[] doQuerySysRoles(SysRoleDAOQueryBean queryBean)
			throws Exception {
		SysRole[] sysRoles = sysRoleDao.querySysRole(queryBean);
		return SystemRole.toArray(sysRoles);
	}

	@Override
	protected SystemAction[] doGetSysRoleActions(long[] sysRoleIds)
			throws Exception {

		SysActionDAOQueryBean queryBean = new SysActionDAOQueryBean();

		SysRoleActionRelateDAOQueryBean jionCriterion = new SysRoleActionRelateDAOQueryBean();

		jionCriterion.createCriteria().andRoleIdIn(sysRoleIds);

		queryBean.addJoin(ISysRoleActionRelateDAO.EntityName, jionCriterion);

		queryBean.createCriteria().andIdEqualToForeignKey(
				ISysRoleActionRelateDAO.ActionId);

		SystemAction[] actions = SystemAction.toArray(sysActionDao
				.querySysAction(queryBean));

		List<SystemAction> systemActions = new ArrayList<SystemAction>();

		for (int i = 0; i < actions.length; i++) {
			SystemAction sysAction = actions[i];
			if (systemActions.contains(sysAction) == false) {
				systemActions.add(sysAction);
			}
		}

		return systemActions.toArray(new SystemAction[systemActions.size()]);
	}

	@Override
	protected void doSetSysRoleActions(long sysRoleId, long[] actionIds)
			throws Exception {

		SysRoleActionRelateDAOQueryBean queryBean = new SysRoleActionRelateDAOQueryBean();

		queryBean.createCriteria().andRoleIdEqualTo(sysRoleId);

		sysRoleActionRelateDao.deleteSysRoleActionRelate(queryBean);

		SysRoleActionRelate[] roleActionRelates = new SysRoleActionRelate[actionIds.length];

		for (int i = 0; i < roleActionRelates.length; i++) {
			roleActionRelates[i] = new SysRoleActionRelate();

			roleActionRelates[i].setRoleId(sysRoleId);

			roleActionRelates[i].setActionId(actionIds[i]);

		}

		sysRoleActionRelateDao
				.batchInsertSysRoleActionRelate(roleActionRelates);

		ROLE_ACTION_MAP.remove(Long.valueOf(sysRoleId));

	}

	@Override
	protected boolean doIsSysRoleHasAction(long roleId, String domainCode,
			String actionCode) throws Exception {

		Long sysRoleId = Long.valueOf(roleId);

		if (ROLE_ACTION_MAP.containsKey(sysRoleId) == false) {
			SystemAction[] actions = getSysRoleActions(new long[] { roleId });

			List<String> actionIds = new ArrayList<String>();

			for (int i = 0; i < actions.length; i++) {
				SystemAction systemAction = actions[i];
				actionIds.add(systemAction.getDomainCode() + "."
						+ systemAction.getActionCode());
			}

			ROLE_ACTION_MAP.put(sysRoleId, actionIds);
		}

		List<String> actionIds = ROLE_ACTION_MAP.get(sysRoleId);

		return actionIds.contains(domainCode + "." + actionCode);
	}

	@Override
	protected SystemModule[] doGetSysRoleModules(long[] sysRoleIds)
			throws Exception {

		SysRoleModuleRelateDAOQueryBean queryBean = new SysRoleModuleRelateDAOQueryBean();

		queryBean.createCriteria().andRoleIdIn(sysRoleIds);

		return SystemModule.toArray(this.sysRoleModuleRelateDao
				.querySysModules(queryBean));
	}

	@Override
	protected void doSetSysRoleModules(long sysRoleId, long[] sysModuleIds)
			throws Exception {

		SysRoleModuleRelateDAOQueryBean queryBean = new SysRoleModuleRelateDAOQueryBean();

		queryBean.createCriteria().andRoleIdEqualTo(sysRoleId);

		sysRoleModuleRelateDao.deleteSysRoleModuleRelate(queryBean);

		SysRoleModuleRelate[] roleModuleRelates = new SysRoleModuleRelate[sysModuleIds.length];

		for (int i = 0; i < roleModuleRelates.length; i++) {
			roleModuleRelates[i] = new SysRoleModuleRelate();

			roleModuleRelates[i].setRoleId(sysRoleId);

			roleModuleRelates[i].setModuleId(sysModuleIds[i]);

		}

		sysRoleModuleRelateDao
				.batchInsertSysRoleModuleRelate(roleModuleRelates);
	}

}
