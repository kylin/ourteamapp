/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.bpm.service;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.activiti.engine.form.FormData;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Attachment;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.IdentityLink;
import org.activiti.engine.task.Task;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.ourteam.bpm.dao.BpmAttachment;
import com.ourteam.bpm.dao.BpmAttachmentDAOQueryBean;
import com.ourteam.bpm.dao.BpmComment;
import com.ourteam.bpm.dao.BpmCommentDAOQueryBean;
import com.ourteam.bpm.dao.BpmDomain;
import com.ourteam.bpm.dao.BpmDomainDAOQueryBean;
import com.ourteam.bpm.dao.BpmDomainSysModuleRelate;
import com.ourteam.bpm.dao.BpmDomainSysModuleRelateDAOQueryBean;
import com.ourteam.bpm.dao.BpmEmployeeRoleRelate;
import com.ourteam.bpm.dao.BpmEmployeeRoleRelateDAOQueryBean;
import com.ourteam.bpm.dao.BpmFormDefineDAOQueryBean;
import com.ourteam.bpm.dao.BpmFormFieldDefineDAOQueryBean;
import com.ourteam.bpm.dao.BpmFormFieldStatusDefineDAOQueryBean;
import com.ourteam.bpm.dao.BpmProcessCatalog;
import com.ourteam.bpm.dao.BpmProcessCatalogDAOQueryBean;
import com.ourteam.bpm.dao.BpmProcessDefine;
import com.ourteam.bpm.dao.BpmProcessDefineDAOQueryBean;
import com.ourteam.bpm.dao.BpmProcessFormInstance;
import com.ourteam.bpm.dao.BpmProcessFormInstanceDAOQueryBean;
import com.ourteam.bpm.dao.BpmProcessFormValue;
import com.ourteam.bpm.dao.BpmProcessFormValueDAOQueryBean;
import com.ourteam.bpm.dao.BpmProcessInstance;
import com.ourteam.bpm.dao.BpmProcessInstanceDAOQueryBean;
import com.ourteam.bpm.dao.BpmProcessRolePurview;
import com.ourteam.bpm.dao.BpmProcessRolePurviewDAOQueryBean;
import com.ourteam.bpm.dao.BpmPublicUiConfigDAOQueryBean;
import com.ourteam.bpm.dao.BpmRole;
import com.ourteam.bpm.dao.BpmRoleDAOQueryBean;
import com.ourteam.bpm.dao.BpmTask;
import com.ourteam.bpm.dao.BpmTaskDAOQueryBean;
import com.ourteam.bpm.dao.BpmTaskRoleRelate;
import com.ourteam.bpm.dao.BpmTaskRoleRelateDAOQueryBean;
import com.ourteam.bpm.dao.IBpmCommentDAO;
import com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO;
import com.ourteam.bpm.dao.IBpmFormFieldDefineDAO;
import com.ourteam.bpm.dao.IBpmProcessCatalogDAO;
import com.ourteam.bpm.dao.IBpmTaskDAO;
import com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO;
import com.ourteam.bpm.domain.BpmAttachmentBean;
import com.ourteam.bpm.domain.BpmCommentBean;
import com.ourteam.bpm.domain.BpmDomainBean;
import com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean;
import com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean;
import com.ourteam.bpm.domain.BpmFormDefineBean;
import com.ourteam.bpm.domain.BpmFormFieldDefineBean;
import com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean;
import com.ourteam.bpm.domain.BpmProcessCatalogBean;
import com.ourteam.bpm.domain.BpmProcessDefineBean;
import com.ourteam.bpm.domain.BpmProcessInstanceBean;
import com.ourteam.bpm.domain.BpmProcessRolePurviewBean;
import com.ourteam.bpm.domain.BpmProcessStatusEnum;
import com.ourteam.bpm.domain.BpmPublicUiConfigBean;
import com.ourteam.bpm.domain.BpmRoleBean;
import com.ourteam.bpm.domain.BpmTaskBean;
import com.ourteam.bpm.domain.BpmTaskRoleRelateBean;
import com.ourteam.bpm.domain.BpmTaskStatusEnum;
import com.ourteam.hr.dao.EmployeeDAOQueryBean;
import com.ourteam.hr.domain.DepartmentBean;
import com.ourteam.hr.domain.EmployeeBean;

/**
 * ���̷���ӿ� impl Generated Date 2011-10-13 15:58:14
 * 
 * @author $Auto Gen
 */
public class BPMServiceImpl extends AbstractBPMService {
	/**
	 * ���ģ��IDȡ��B���̶��� impl
	 * 
	 * @param sysModuleId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.bpm.domain.BpmProcessDefineBean[] doGetBpmProcessDefinesByCatalogId(
			final long catalogIdId) throws Exception {

		BpmProcessDefineDAOQueryBean queryBean = new BpmProcessDefineDAOQueryBean();

		queryBean.createCriteria().andCatalogIdEqualTo(catalogIdId);

		return BpmProcessDefineBean.toArray(this.bpmProcessDefineDao
				.queryBpmProcessDefine(queryBean));
	} // end doGetBpmProcessDefinesByModuleId()

	@Override
	protected BpmRoleBean[] doGetBpmRolesByModuleId(long bpmDomainId,
			long sysModuleId) throws Exception {

		BpmRoleDAOQueryBean querBean = new BpmRoleDAOQueryBean();

		querBean.createCriteria().andBpmDomainIdEqualTo(bpmDomainId)
				.andSysModuleIdEqualTo(sysModuleId);

		return BpmRoleBean.toArray(this.bpmRoleDao.queryBpmRole(querBean));
	}

	@Override
	protected void doAddBpmRole(long bpmDomainId, long sysModuleId,
			BpmRoleBean bpmRole) throws Exception {

		bpmRole.setBpmDomainId(bpmDomainId);

		bpmRole.setSysModuleId(sysModuleId);

		this.bpmRoleDao.insertBpmRole(bpmRole.convertToBpmRole());

		Group group = this.dentityService.newGroup(String.valueOf(bpmRole
				.getId()));

		group.setName(bpmRole.getRoleName());

		group.setType("assignment");

		this.dentityService.saveGroup(group);
	}

	@Override
	protected void doModifyBpmRole(long bpmDomainId, long sysModuleId,
			BpmRoleBean bpmRole) throws Exception {

		bpmRole.setBpmDomainId(bpmDomainId);

		bpmRole.setSysModuleId(sysModuleId);

		this.bpmRoleDao.updateBpmRole(bpmRole.convertToBpmRole());

		Group group = this.dentityService.createGroupQuery()
				.groupId(String.valueOf(bpmRole.getId())).singleResult();

		group.setName(bpmRole.getRoleName());

		this.dentityService.saveGroup(group);

	}

	@Override
	protected void doDeleteBpmRoles(long[] bpmRoleIds) throws Exception {

		BpmRoleDAOQueryBean querBean = new BpmRoleDAOQueryBean();

		querBean.createCriteria().andIdIn(bpmRoleIds);

		this.bpmRoleDao.deleteBpmRole(querBean);

		for (int i = 0; i < bpmRoleIds.length; i++) {
			long roleId = bpmRoleIds[i];
			this.dentityService.deleteGroup(String.valueOf(roleId));
		}

	}

	@Override
	protected BpmRoleBean doGetBpmRoleById(long bpmRoleId) throws Exception {

		BpmRole bpmRole = this.bpmRoleDao.findBpmRoleById(bpmRoleId);

		return bpmRole != null ? new BpmRoleBean(bpmRole) : null;
	}

	@Override
	protected BpmRoleBean[] doGetBpmRolesByModuleCode(String sysModuleCode)
			throws Exception {

		BpmRoleDAOQueryBean querBean = new BpmRoleDAOQueryBean();

		querBean.createCriteria().andSysModuleCodeEqualTo(sysModuleCode);

		return BpmRoleBean.toArray(this.bpmRoleDao.queryBpmRole(querBean));
	}

	@Override
	protected void doAddBpmProcessDefine(long catalogId,
			BpmProcessDefineBean processDefine) throws Exception {

		processDefine.setCatalogId(catalogId);

		this.bpmProcessDefineDao.insertBpmProcessDefine(processDefine
				.convertToBpmProcessDefine());

	}

	@Override
	protected BpmProcessDefineBean doGetBpmProcessById(long processDefineId)
			throws Exception {

		BpmProcessDefine processDefine = this.bpmProcessDefineDao
				.findBpmProcessDefineById(processDefineId);

		return processDefine != null ? new BpmProcessDefineBean(processDefine)
				: null;
	}

	@Override
	protected void doModifyBpmProcessDefine(long catalogId,
			BpmProcessDefineBean processDefine) throws Exception {

		processDefine.setCatalogId(catalogId);

		this.bpmProcessDefineDao.updateBpmProcessDefine(processDefine
				.convertToBpmProcessDefine());
	}

	@Override
	protected BpmProcessRolePurviewBean[] doGetBpmProcessRolePurviews(
			long processDefineId, long[] roleIds) throws Exception {

		BpmProcessRolePurviewDAOQueryBean queryBean = new BpmProcessRolePurviewDAOQueryBean();

		BpmProcessRolePurviewDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andProcessDefineIdEqualTo(processDefineId);

		if (ArrayUtils.isNotEmpty(roleIds)) {
			criteria.andRoleIdIn(roleIds);
		}

		return BpmProcessRolePurviewBean.toArray(this.bpmProcessRolePurviewDao
				.queryBpmProcessRolePurview(queryBean));
	}

	@Override
	protected void doSetBpmProcessRolePurviews(long processDefineId,
			BpmProcessRolePurviewBean[] processRolePurviews) throws Exception {

		BpmProcessRolePurview[] purviews = new BpmProcessRolePurview[processRolePurviews.length];

		for (int i = 0; i < purviews.length; i++) {
			processRolePurviews[i].setProcessDefineId(processDefineId);
			purviews[i] = processRolePurviews[i]
					.convertToBpmProcessRolePurview();
		}

		BpmProcessRolePurviewDAOQueryBean queryBean = new BpmProcessRolePurviewDAOQueryBean();

		queryBean.createCriteria().andProcessDefineIdEqualTo(processDefineId);

		this.bpmProcessRolePurviewDao.synchronizeBpmProcessRolePurview(
				purviews, queryBean);
	}

	@Override
	protected void doDeleteBpmProcessDefines(long[] processDefineIds)
			throws Exception {

		BpmProcessDefineDAOQueryBean queryBean = new BpmProcessDefineDAOQueryBean();

		queryBean.createCriteria().andIdIn(processDefineIds);

		BpmProcessDefine[] bpmProcessDefines = this.bpmProcessDefineDao
				.queryBpmProcessDefine(queryBean);

		for (int i = 0; i < bpmProcessDefines.length; i++) {
			BpmProcessDefine bpmProcessDefine = bpmProcessDefines[i];
			if (StringUtils.isNotBlank(bpmProcessDefine.getProcessKey())) {
				List<Deployment> deployments = this.repositoryService
						.createDeploymentQuery()
						.deploymentName(bpmProcessDefine.getProcessKey())
						.list();

				for (Iterator<Deployment> iterator = deployments.iterator(); iterator
						.hasNext();) {
					Deployment deployment = iterator.next();
					this.repositoryService.deleteDeployment(deployment.getId());
				}

			}

		}

		this.bpmProcessDefineDao.deleteBpmProcessDefine(queryBean);
	}

	@Override
	protected BpmFormFieldDefineBean[] doGetBpmProcessFormFieldDefines(
			long formDefineId, long parentFieldId) throws Exception {

		BpmFormFieldDefineDAOQueryBean queryBean = new BpmFormFieldDefineDAOQueryBean();

		queryBean.createCriteria().andFormDefineIdEqualTo(formDefineId)
				.andParentFieldIdEqualTo(parentFieldId);

		queryBean.setSortProperty(IBpmFormFieldDefineDAO.SortIndex);

		return BpmFormFieldDefineBean.toArray(this.bpmFormFieldDefineDao
				.queryBpmFormFieldDefine(queryBean));
	}

	@Override
	protected void doAddBpmProcessFormFieldDefine(long formDefineId,
			BpmFormFieldDefineBean formFieldDefine) throws Exception {

		BpmFormFieldDefineDAOQueryBean queryBean = new BpmFormFieldDefineDAOQueryBean();

		BpmFormFieldDefineDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andFormDefineIdEqualTo(formDefineId);

		criteria.andParentFieldIdEqualTo(formFieldDefine.getParentFieldId());

		queryBean.addMaxFunctionProperty(IBpmFormFieldDefineDAO.SortIndex,
				"maxIndex");

		Map<String, Object>[] rows = this.bpmFormFieldDefineDao
				.queryBpmFormFieldDefineSelective(queryBean);

		formFieldDefine.setFormDefineId(formDefineId);

		if (ArrayUtils.isNotEmpty(rows)) {
			formFieldDefine.setSortIndex(MapUtils.getIntValue(rows[0],
					"maxIndex") + 1);
		} else {
			formFieldDefine.setSortIndex(1);
		}

		this.bpmFormFieldDefineDao.insertBpmFormFieldDefine(formFieldDefine
				.convertToBpmFormFieldDefine());

	}

	@Override
	protected void doModifyBpmProcessFormFieldDefine(long formDefineId,
			BpmFormFieldDefineBean formFieldDefine) throws Exception {

		formFieldDefine.setFormDefineId(formDefineId);

		this.bpmFormFieldDefineDao.updateBpmFormFieldDefine(formFieldDefine
				.convertToBpmFormFieldDefine());

	}

	@Override
	protected void doDeleteBpmProcessFormFieldDefines(long[] formFieldDefineIds)
			throws Exception {

		BpmFormFieldDefineDAOQueryBean queryBean = new BpmFormFieldDefineDAOQueryBean();

		queryBean.createCriteria().andIdIn(formFieldDefineIds);

		this.bpmFormFieldDefineDao.deleteBpmFormFieldDefine(queryBean);

		queryBean.clear();

	}

	@Override
	protected BpmFormFieldStatusDefineBean[] doGetBpmProcessFormFieldStatus(
			long fieldId, long[] roleIds) throws Exception {

		BpmFormFieldStatusDefineDAOQueryBean queryBean = new BpmFormFieldStatusDefineDAOQueryBean();

		BpmFormFieldStatusDefineDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andFieldDefineIdEqualTo(fieldId);

		if (ArrayUtils.isNotEmpty(roleIds)) {
			criteria.andBpmRoleIdIn(roleIds);
		}

		return BpmFormFieldStatusDefineBean
				.toArray(this.bpmFormFieldStatusDefineDao
						.queryBpmFormFieldStatusDefine(queryBean));
	}

	@Override
	protected void doAddBpmProcessFormFieldStatus(long stepId, long roleId,
			BpmFormFieldStatusDefineBean fieldStatusDefine) throws Exception {

		fieldStatusDefine.setBpmRoleId(roleId);

		fieldStatusDefine.setStepDefineId(stepId);

		this.bpmFormFieldStatusDefineDao
				.insertBpmFormFieldStatusDefine(fieldStatusDefine
						.convertToBpmFormFieldStatusDefine());

	}

	@Override
	protected void doDeleteBpmProcessFormFieldStatus(long stepId, long fieldId,
			long roleID) throws Exception {

		BpmFormFieldStatusDefineDAOQueryBean queryBean = new BpmFormFieldStatusDefineDAOQueryBean();

		queryBean.createCriteria().andBpmRoleIdEqualTo(roleID)
				.andStepDefineIdEqualTo(stepId)
				.andFieldDefineIdEqualTo(fieldId);

		this.bpmFormFieldStatusDefineDao
				.deleteBpmFormFieldStatusDefine(queryBean);

	}

	@Override
	protected BpmProcessRolePurviewBean[] doGetBpmProcessRolePurviewsByRoleId(
			long[] roleIds) throws Exception {

		if (ArrayUtils.isEmpty(roleIds)) {
			return new BpmProcessRolePurviewBean[0];
		}

		BpmProcessRolePurviewDAOQueryBean queryBean = new BpmProcessRolePurviewDAOQueryBean();

		queryBean.createCriteria().andRoleIdIn(roleIds);

		return BpmProcessRolePurviewBean.toArray(this.bpmProcessRolePurviewDao
				.queryBpmProcessRolePurview(queryBean));
	}

	@Override
	protected void doAddBpmDomain(BpmDomainBean bpmDomain) throws Exception {

		this.bpmDomainDao.insertBpmDomain(bpmDomain.convertToBpmDomain());
	}

	@Override
	protected void doModifyBpmDomain(BpmDomainBean bpmDomain) throws Exception {

		this.bpmDomainDao.updateBpmDomain(bpmDomain.convertToBpmDomain());
	}

	@Override
	protected void doDeleteBpmDomains(long[] bpmDomainIds) throws Exception {

		BpmDomainDAOQueryBean queryBean = new BpmDomainDAOQueryBean();

		queryBean.createCriteria().andIdIn(bpmDomainIds);

		this.bpmDomainDao.deleteBpmDomain(queryBean);
	}

	@Override
	protected BpmDomainBean doGetBpmDomainById(long bpmDomainId)
			throws Exception {

		BpmDomain bpmDomain = this.bpmDomainDao.findBpmDomainById(bpmDomainId);

		return bpmDomain != null ? new BpmDomainBean(bpmDomain) : null;
	}

	@Override
	protected BpmDomainBean[] doGetBpmDomains() throws Exception {

		BpmDomainDAOQueryBean queryBean = new BpmDomainDAOQueryBean();

		return BpmDomainBean.toArray(this.bpmDomainDao
				.queryBpmDomain(queryBean));
	}

	@Override
	protected BpmDomainSysModuleRelateBean[] doGetBpmDomianSysModuleRelates(
			long bpmDomainId) throws Exception {

		BpmDomainSysModuleRelateDAOQueryBean queryBean = new BpmDomainSysModuleRelateDAOQueryBean();

		queryBean.createCriteria().andBpmDomainIdEqualTo(bpmDomainId);

		return BpmDomainSysModuleRelateBean
				.toArray(this.bpmDomainSysModuleRelateDao
						.queryBpmDomainSysModuleRelate(queryBean));
	}

	@Override
	protected void doAddBpmDomainSysModuleRelate(long bpmDomainId,
			BpmDomainSysModuleRelateBean bpmDomainSysModuleRelate)
			throws Exception {

		bpmDomainSysModuleRelate.setBpmDomainId(bpmDomainId);

		this.bpmDomainSysModuleRelateDao
				.insertBpmDomainSysModuleRelate(bpmDomainSysModuleRelate
						.convertToBpmDomainSysModuleRelate());

	}

	@Override
	protected void doDeleteBpmDomainSysModuleRelates(
			long[] bpmDomainSysModuleRelateIds) throws Exception {

		BpmDomainSysModuleRelateDAOQueryBean queryBean = new BpmDomainSysModuleRelateDAOQueryBean();

		queryBean.createCriteria().andIdIn(bpmDomainSysModuleRelateIds);

		this.bpmDomainSysModuleRelateDao
				.deleteBpmDomainSysModuleRelate(queryBean);

	}

	@Override
	protected void doAddBpmDomainSysModuleRelates(long bpmDomainId,
			long[] sysModuleIds) throws Exception {

		BpmDomainSysModuleRelate[] relates = new BpmDomainSysModuleRelate[sysModuleIds.length];

		for (int i = 0; i < relates.length; i++) {
			relates[i] = new BpmDomainSysModuleRelate();
			relates[i].setBpmDomainId(bpmDomainId);
			relates[i].setSysModuleId(sysModuleIds[i]);
		}

		this.bpmDomainSysModuleRelateDao
				.batchInsertBpmDomainSysModuleRelate(relates);

	}

	@Override
	protected void doSetEmployeeBpmRoleRelate(long employeeId, long moduleId,
			long businessInstanceId, String businessType,
			BpmEmployeeRoleRelateBean[] employeeRoleRelates) throws Exception {

		BpmEmployeeRoleRelate[] bpmUserRoleRelates = new BpmEmployeeRoleRelate[ArrayUtils
				.isNotEmpty(employeeRoleRelates) ? employeeRoleRelates.length
				: 0];

		BpmEmployeeRoleRelateDAOQueryBean queryBean = new BpmEmployeeRoleRelateDAOQueryBean();

		queryBean.createCriteria().andEmployeeIdEqualTo(employeeId)
				.andSysModuleIdEqualTo(moduleId)
				.andBusinessInstanceIdEqualTo(businessInstanceId)
				.andBusinessTypeEqualTo(businessType);

		for (int i = 0; i < employeeRoleRelates.length; i++) {
			BpmEmployeeRoleRelateBean bpmUserRoleRelateBean = employeeRoleRelates[i];

			bpmUserRoleRelateBean.setEmployeeId(employeeId);
			bpmUserRoleRelateBean.setSysModuleId(moduleId);
			bpmUserRoleRelateBean.setBusinessInstanceId(businessInstanceId);
			bpmUserRoleRelateBean.setBusinessType(businessType);

			bpmUserRoleRelates[i] = bpmUserRoleRelateBean
					.convertToBpmEmployeeRoleRelate();
		}

		this.bpmEmployeeRoleRelateDao.synchronizeBpmEmployeeRoleRelate(
				bpmUserRoleRelates, queryBean);
	}

	@Override
	protected BpmEmployeeRoleRelateBean[] doGetEmployeeBpmRoleRelateByRoleId(
			long bpmRoleId) throws Exception {

		BpmEmployeeRoleRelateDAOQueryBean queryBean = new BpmEmployeeRoleRelateDAOQueryBean();

		queryBean.createCriteria().andBpmRoleIdEqualTo(bpmRoleId);

		return BpmEmployeeRoleRelateBean.toArray(this.bpmEmployeeRoleRelateDao
				.queryBpmEmployeeRoleRelate(queryBean));
	}

	@Override
	protected BpmEmployeeRoleRelateBean[] doAddBpmRoleEmployeeRelates(
			long businessInstanceId, String businessType, BpmRoleBean bpmRole,
			long[] employeeIds) throws Exception {
		BpmEmployeeRoleRelate[] relates = new BpmEmployeeRoleRelate[employeeIds.length];

		for (int i = 0; i < relates.length; i++) {
			relates[i] = new BpmEmployeeRoleRelate();
			relates[i].setBpmRoleId(bpmRole.getId());
			relates[i].setSysModuleId(bpmRole.getSysModuleId());
			relates[i].setBusinessInstanceId(businessInstanceId);
			relates[i].setBusinessType(businessType);
			relates[i].setEmployeeId(employeeIds[i]);

			if (StringUtils.isNotBlank(businessType)) {
				PropertyUtils.setProperty(relates[i], businessType, new Long(
						businessInstanceId));
			}

			this.dentityService.createMembership(
					String.valueOf(employeeIds[i]),
					String.valueOf(bpmRole.getId()));

		}

		this.bpmEmployeeRoleRelateDao.batchInsertBpmEmployeeRoleRelate(relates);

		return BpmEmployeeRoleRelateBean.toArray(relates);
	}

	@Override
	protected BpmEmployeeRoleRelateBean[] doGetBpmRoleEmployeeRelates(
			long bpmRoleId, long businessInstanceId, String businessType)
			throws Exception {

		if (businessType == null) {
			businessType = "";
		}

		BpmEmployeeRoleRelateDAOQueryBean queryBean = new BpmEmployeeRoleRelateDAOQueryBean();

		queryBean.createCriteria().andBpmRoleIdEqualTo(bpmRoleId)
				.andBusinessInstanceIdEqualTo(businessInstanceId)
				.andBusinessTypeEqualTo(businessType);

		return BpmEmployeeRoleRelateBean.toArray(this.bpmEmployeeRoleRelateDao
				.queryBpmEmployeeRoleRelate(queryBean));
	}

	@Override
	protected void doDeleteBpmRoleEmployeeRelates(
			long[] bpmRoleEmployeeRelateIds) throws Exception {

		BpmEmployeeRoleRelateDAOQueryBean queryBean = new BpmEmployeeRoleRelateDAOQueryBean();

		queryBean.createCriteria().andIdIn(bpmRoleEmployeeRelateIds);

		BpmEmployeeRoleRelate[] relates = this.bpmEmployeeRoleRelateDao
				.queryBpmEmployeeRoleRelate(queryBean);

		for (int i = 0; i < relates.length; i++) {
			BpmEmployeeRoleRelate bpmEmployeeRoleRelate = relates[i];
			this.dentityService.deleteMembership(
					String.valueOf(bpmEmployeeRoleRelate.getEmployeeId()),
					String.valueOf(bpmEmployeeRoleRelate.getBpmRoleId()));
		}

		this.bpmEmployeeRoleRelateDao.deleteBpmEmployeeRoleRelate(queryBean);

	}

	@Override
	protected BpmEmployeeRoleRelateBean[] doGetEmployeeBpmRoleRelateByModuleCode(
			long employeeId, String moduleCode, long businessInstanceId,
			String businessType) throws Exception {

		BpmEmployeeRoleRelateDAOQueryBean queryBean = new BpmEmployeeRoleRelateDAOQueryBean();

		queryBean.createCriteria().andEmployeeIdEqualTo(employeeId)
				.andSysModuleCodeEqualTo(moduleCode)
				.andBusinessInstanceIdEqualTo(businessInstanceId)
				.andBusinessTypeEqualTo(businessType);

		return BpmEmployeeRoleRelateBean.toArray(this.bpmEmployeeRoleRelateDao
				.queryBpmEmployeeRoleRelate(queryBean));
	}

	@Override
	protected BpmEmployeeRoleRelateBean[] doGetEmployeeBpmRoleRelateByEmployeeId(
			long employeeId) throws Exception {

		BpmEmployeeRoleRelateDAOQueryBean queryBean = new BpmEmployeeRoleRelateDAOQueryBean();

		queryBean.createCriteria().andEmployeeIdEqualTo(employeeId);

		return BpmEmployeeRoleRelateBean.toArray(this.bpmEmployeeRoleRelateDao
				.queryBpmEmployeeRoleRelate(queryBean));
	}

	@Override
	protected BpmDomainBean doGetBpmDomainByCode(String bpmDomainCode)
			throws Exception {

		BpmDomainDAOQueryBean queryBean = new BpmDomainDAOQueryBean();

		queryBean.createCriteria().andCodeEqualTo(bpmDomainCode);

		queryBean.setDistinct(true);

		BpmDomainBean[] domainBeans = BpmDomainBean.toArray(this.bpmDomainDao
				.queryBpmDomain(queryBean));

		return ArrayUtils.isNotEmpty(domainBeans) ? domainBeans[0] : null;
	}

	@Override
	protected BpmProcessCatalogBean[] doGetBpmProcessCatalogs(
			long parentCatalogId) throws Exception {

		BpmProcessCatalogDAOQueryBean queryBean = new BpmProcessCatalogDAOQueryBean();

		queryBean.createCriteria().andParentIdEqualTo(parentCatalogId);

		queryBean.setSortProperty(IBpmProcessCatalogDAO.OrderIndex);

		return BpmProcessCatalogBean.toArray(this.bpmProcessCatalogDao
				.queryBpmProcessCatalog(queryBean));
	}

	@Override
	protected void doAddBpmProcessCatalog(
			BpmProcessCatalogBean bpmProcessCatalog) throws Exception {

		this.bpmProcessCatalogDao.insertBpmProcessCatalog(bpmProcessCatalog
				.convertToBpmProcessCatalog());

	}

	@Override
	protected void doModifyBpmProcessCatalog(
			BpmProcessCatalogBean bpmProcessCatalog) throws Exception {

		this.bpmProcessCatalogDao.updateBpmProcessCatalog(bpmProcessCatalog
				.convertToBpmProcessCatalog());

	}

	@Override
	protected void doDeleteBpmProcessCatalogs(long[] bpmProcessCatalogIds)
			throws Exception {

		BpmProcessCatalogDAOQueryBean queryBean = new BpmProcessCatalogDAOQueryBean();

		queryBean.createCriteria().andIdIn(bpmProcessCatalogIds);

		this.bpmProcessCatalogDao.deleteBpmProcessCatalog(queryBean);

	}

	@Override
	protected BpmProcessCatalogBean doGetBpmProcessCatalogById(
			long bpmProcessCatalogId) throws Exception {

		BpmProcessCatalog processCatalog = this.bpmProcessCatalogDao
				.findBpmProcessCatalogById(bpmProcessCatalogId);

		return processCatalog != null ? new BpmProcessCatalogBean(
				processCatalog) : null;
	}

	@Override
	protected BpmRoleBean[] doQueryBpmRoles(BpmRoleDAOQueryBean queryBean)
			throws Exception {

		if (queryBean == null) {
			queryBean = new BpmRoleDAOQueryBean();
		}

		return BpmRoleBean.toArray(this.bpmRoleDao.queryBpmRole(queryBean));
	}

	@Override
	protected void doDeployBpmProcessDefine(long bpmProcessDefineId,
			Map<String, InputStream> resourceInputStreams) throws Exception {

		BpmProcessDefine bpmProcessDefine = this.bpmProcessDefineDao
				.findBpmProcessDefineById(bpmProcessDefineId);

		DeploymentBuilder deploymentBuilder = this.repositoryService
				.createDeployment().name(bpmProcessDefine.getProcessKey());

		Set<String> resourceNames = resourceInputStreams.keySet();

		for (Iterator<String> iterator = resourceNames.iterator(); iterator
				.hasNext();) {
			String resourceName = iterator.next();
			deploymentBuilder.addInputStream(resourceName,
					resourceInputStreams.get(resourceName));
		}

		deploymentBuilder.deploy();

		ProcessDefinition processDefinition = repositoryService
				.createProcessDefinitionQuery()
				.processDefinitionKey(bpmProcessDefine.getProcessKey())
				.latestVersion().singleResult();

		if (processDefinition != null) {

			Deployment deployment = repositoryService.createDeploymentQuery()
					.deploymentId(processDefinition.getDeploymentId())
					.singleResult();

			bpmProcessDefine.setProcessVersion(String.valueOf(processDefinition
					.getVersion()));

			if (deployment != null) {
				bpmProcessDefine
						.setLastEditDate(deployment.getDeploymentTime());
			}

			FormData formData = this.formService
					.getStartFormData(processDefinition.getId());

			if (formData != null) {
				bpmProcessDefine.setStartFormKey(formData.getFormKey());
			}

			this.bpmProcessDefineDao.updateBpmProcessDefine(bpmProcessDefine);

		}
	}

	@Override
	protected InputStream doGetBpmProcessDiagramResource(long bpmProcessDefineId)
			throws Exception {

		BpmProcessDefine bpmProcessDefine = this.bpmProcessDefineDao
				.findBpmProcessDefineById(bpmProcessDefineId);

		ProcessDefinition processDefinition = repositoryService
				.createProcessDefinitionQuery()
				.processDefinitionKey(bpmProcessDefine.getProcessKey())
				.latestVersion().singleResult();

		if (processDefinition != null) {
			String diagramResourceName = processDefinition
					.getDiagramResourceName();
			InputStream imageStream = repositoryService.getResourceAsStream(
					processDefinition.getDeploymentId(), diagramResourceName);

			return imageStream;
		} else {
			return null;
		}

	}

	@Override
	protected BpmProcessInstanceBean doStartBpmProcess(long bpmProcessDefineId,
			long starterId, String businessKey,
			Map<String, Object> startFormData) throws Exception {

		BpmProcessDefine bpmProcessDefine = this.bpmProcessDefineDao
				.findBpmProcessDefineById(bpmProcessDefineId);

		User user = this.dentityService.createUserQuery()
				.userId(String.valueOf(starterId)).singleResult();

		ProcessInstance processInstance = null;

		try {
			this.dentityService.setAuthenticatedUserId(user.getId());

			processInstance = this.runtimeService.startProcessInstanceByKey(
					bpmProcessDefine.getProcessKey(), businessKey,
					startFormData);
		} finally {
			this.dentityService.setAuthenticatedUserId(null);

		}

		BpmProcessInstance bpmProcessInstance = new BpmProcessInstance();

		String serialNumber = this.systemSerialCodeService
				.getSerialCode("bpm_process");

		bpmProcessInstance.setProcessDefineId(bpmProcessDefineId);

		bpmProcessInstance.setSerialNumber(serialNumber);

		bpmProcessInstance.setStartDate(new Date());

		bpmProcessInstance.setStarterId(starterId);

		bpmProcessInstance.setStartFormKey(bpmProcessDefine.getStartFormKey());

		bpmProcessInstance.setInstanceId(processInstance.getId());

		HistoricProcessInstance historicProcessInstance = this.historyService
				.createHistoricProcessInstanceQuery().finished()
				.processInstanceId(bpmProcessInstance.getInstanceId())
				.singleResult();

		if (historicProcessInstance != null) {
			bpmProcessInstance.setCompleteDate(historicProcessInstance
					.getEndTime());
			bpmProcessInstance.setLastOperatorId(starterId);
			bpmProcessInstance.setStatus(BpmProcessStatusEnum.FINISHED
					.getName());
		} else {
			bpmProcessInstance
					.setStatus(BpmProcessStatusEnum.STARTED.getName());

		}

		this.bpmProcessInstanceDao.insertBpmProcessInstance(bpmProcessInstance);

		BpmProcessFormInstance formInstance = new BpmProcessFormInstance();
		formInstance.setTaskId(0);
		formInstance.setProcessInstanceId(bpmProcessInstance.getId());
		formInstance.setFormKey(bpmProcessDefine.getStartFormKey());

		if (StringUtils.isNotBlank(bpmProcessDefine.getStartFormKey())) {
			BpmFormDefineBean formDefineBean = getBpmProcessFormDefineByKey(
					bpmProcessInstance.getProcessDefineId(),
					bpmProcessDefine.getStartFormKey());

			if (formDefineBean != null) {
				formInstance.setFormXml(formDefineBean.getFormXml());
			}

		}

		this.bpmProcessFormInstanceDao
				.insertBpmProcessFormInstance(formInstance);

		storeBpmProcessFormValues(formInstance.getId(), startFormData);

		synchronizaBpmTasks(new BpmProcessInstanceBean(bpmProcessInstance),
				starterId, 0);

		return new BpmProcessInstanceBean(bpmProcessInstance);

	}

	protected void doStoreBpmProcessFormValues(long bpmProcessFormInstanceId,
			Map<String, Object> values) throws Exception {

		if (values.isEmpty()) {
			return;
		}

		BpmProcessFormValue[] processFormValues = new BpmProcessFormValue[values
				.size()];

		int index = 0;

		for (Iterator<String> iterator = values.keySet().iterator(); iterator
				.hasNext();) {
			String propertyName = iterator.next();
			Object value = values.get(propertyName);
			BpmProcessFormValue bpmProcessFormValue = new BpmProcessFormValue();

			bpmProcessFormValue.setFormInstanceId(bpmProcessFormInstanceId);
			bpmProcessFormValue.setPropertyName(propertyName);

			if (value instanceof Date) {
				bpmProcessFormValue.setPropertyDataType("date");
				bpmProcessFormValue.setLongValue(new Long(((Date) value)
						.getTime()));
			} else if (value instanceof Long) {
				bpmProcessFormValue.setPropertyDataType("long");
				bpmProcessFormValue.setLongValue(new Long(((Long) value)));
			} else if (value instanceof Double) {
				bpmProcessFormValue.setPropertyDataType("double");
				bpmProcessFormValue
						.setDoubleValue(new Double(((Double) value)));
			} else if (value != null) {
				bpmProcessFormValue.setPropertyDataType("string");
				bpmProcessFormValue.setStringValue(value.toString());
			}

			processFormValues[index++] = bpmProcessFormValue;
		}

		this.bpmProcessFormValueDao
				.batchInsertBpmProcessFormValue(processFormValues);
	}

	protected BpmTaskRoleRelateBean[] synchronizaBpmTasks(
			BpmProcessInstanceBean bpmProcessInstance, long starterId,
			long preTaskId) throws Exception {

		List<Task> tasks = this.taskService.createTaskQuery()
				.processInstanceId(bpmProcessInstance.getInstanceId()).list();

		BpmTask[] bpmTasks = new BpmTask[tasks.size()];

		List<BpmTaskRoleRelateBean> totalTaskRoleRelates = new ArrayList<BpmTaskRoleRelateBean>();

		for (int i = 0; i < bpmTasks.length; i++) {
			bpmTasks[i] = new BpmTask();
			Task task = tasks.get(i);
			bpmTasks[i].setPreTaskId(preTaskId);
			bpmTasks[i].setStarterId(starterId);
			bpmTasks[i].setSerialNumber(this.systemSerialCodeService
					.getSerialCode("bpm_task"));
			bpmTasks[i].setStartDateTime(task.getCreateTime());
			bpmTasks[i].setRemarks(task.getDescription());
			bpmTasks[i].setPriority(task.getPriority());
			bpmTasks[i].setTaskKey(task.getId());
			bpmTasks[i].setTaskName(task.getName());
			bpmTasks[i].setProcessInstanceId(bpmProcessInstance.getId());
			if (StringUtils.isNotBlank(task.getAssignee())) {
				bpmTasks[i].setAssignerId(new Long(task.getAssignee()));
				bpmTasks[i].setStatus(BpmTaskStatusEnum.ASSIGNED.getName());
			} else {
				bpmTasks[i].setStatus(BpmTaskStatusEnum.UNASSIGNED.getName());
			}

			FormData formData = this.formService.getTaskFormData(task.getId());

			if (formData != null) {
				bpmTasks[i].setTaskFormKey(formData.getFormKey());
			}

			List<Comment> comments = this.taskService.getTaskComments(task
					.getId());

			bpmTasks[i].setCommentCount(comments.size());

			List<Attachment> attachments = this.taskService
					.getTaskAttachments(task.getId());

			bpmTasks[i].setAttachmentCount(attachments.size());

			this.bpmTaskDao.insertBpmTask(bpmTasks[i]);

			BpmProcessFormInstance formInstance = new BpmProcessFormInstance();

			formInstance.setProcessInstanceId(bpmProcessInstance.getId());
			formInstance.setTaskId(bpmTasks[i].getId());
			formInstance.setFormKey(bpmTasks[i].getTaskFormKey());

			if (StringUtils.isNotBlank(bpmTasks[i].getTaskFormKey())) {
				BpmFormDefineBean formDefineBean = getBpmProcessFormDefineByKey(
						bpmProcessInstance.getProcessDefineId(),
						bpmTasks[i].getTaskFormKey());

				if (formDefineBean != null) {
					formInstance.setFormXml(formDefineBean.getFormXml());
				}

			}

			this.bpmProcessFormInstanceDao
					.insertBpmProcessFormInstance(formInstance);

			List<IdentityLink> identityLinks = this.taskService
					.getIdentityLinksForTask(task.getId());

			List<BpmTaskRoleRelate> taskRoleRelates = new ArrayList<BpmTaskRoleRelate>();

			for (Iterator<IdentityLink> iterator = identityLinks.iterator(); iterator
					.hasNext();) {
				IdentityLink identityLink = (IdentityLink) iterator.next();

				if (StringUtils.isNotBlank(identityLink.getGroupId())) {
					BpmTaskRoleRelate taskRoleRelate = new BpmTaskRoleRelate();

					BpmRoleBean bpmRoleBean = getBpmRoleByKey(identityLink
							.getGroupId());

					taskRoleRelate.setTaskId(bpmTasks[i].getId());
					taskRoleRelate.setRoleId(bpmRoleBean.getId());

					taskRoleRelates.add(taskRoleRelate);
				}
			}

			BpmTaskRoleRelate[] bpmTaskRoleRelates = taskRoleRelates
					.toArray(new BpmTaskRoleRelate[taskRoleRelates.size()]);

			this.bpmTaskRoleRelateDao
					.batchInsertBpmTaskRoleRelate(bpmTaskRoleRelates);

			totalTaskRoleRelates.addAll(Arrays.asList(BpmTaskRoleRelateBean
					.toArray(bpmTaskRoleRelates)));

		}

		return totalTaskRoleRelates
				.toArray(new BpmTaskRoleRelateBean[totalTaskRoleRelates.size()]);

	}

	@Override
	protected BpmProcessInstanceBean[] doQueryBpmProcessInstances(
			BpmProcessInstanceDAOQueryBean queryBean) throws Exception {

		if (queryBean == null) {
			queryBean = new BpmProcessInstanceDAOQueryBean();
		}

		return BpmProcessInstanceBean.toArray(this.bpmProcessInstanceDao
				.queryBpmProcessInstance(queryBean));
	}

	@Override
	protected int doQueryBpmProcessInstanceCount(
			BpmProcessInstanceDAOQueryBean queryBean) throws Exception {
		if (queryBean == null) {
			queryBean = new BpmProcessInstanceDAOQueryBean();
		}

		return this.bpmProcessInstanceDao
				.queryBpmProcessInstanceCount(queryBean);
	}

	@Override
	protected void doCancelBpmProcess(long bpmProcessInstanceId,
			long operatorId, String cancelReason) throws Exception {

		BpmProcessInstance processInstance = this.bpmProcessInstanceDao
				.findBpmProcessInstanceById(bpmProcessInstanceId);

		this.runtimeService.deleteProcessInstance(
				processInstance.getInstanceId(), cancelReason);

		processInstance.setLastOperatorId(operatorId);

		processInstance.setStatus(BpmProcessStatusEnum.CANCELED.getName());

		processInstance.setCompleteDate(new Date());

		this.bpmProcessInstanceDao.updateBpmProcessInstance(processInstance);

		BpmTaskDAOQueryBean taskDAOQueryBean = new BpmTaskDAOQueryBean();

		taskDAOQueryBean.createCriteria().andProcessInstanceIdEqualTo(
				bpmProcessInstanceId);

		BpmTask bpmTask = new BpmTask();

		bpmTask.setStatus(BpmTaskStatusEnum.CANCELED.getName());

		this.bpmTaskDao.updateBpmTask(bpmTask, taskDAOQueryBean);

		BpmTaskRoleRelateDAOQueryBean taskRoleRelateDAOQueryBean = new BpmTaskRoleRelateDAOQueryBean();

		taskRoleRelateDAOQueryBean.createCriteria()
				.andProcessInstanceIdEqualTo(bpmProcessInstanceId);

		this.bpmTaskRoleRelateDao
				.deleteBpmTaskRoleRelate(taskRoleRelateDAOQueryBean);
	}

	@Override
	protected BpmFormDefineBean[] doGetBpmProcessFormDefines(
			long bpmProcessDefineId) throws Exception {

		BpmFormDefineDAOQueryBean queryBean = new BpmFormDefineDAOQueryBean();

		queryBean.createCriteria()
				.andProcessDefineIdEqualTo(bpmProcessDefineId);

		return BpmFormDefineBean.toArray(this.bpmFormDefineDao
				.queryBpmFormDefine(queryBean));
	}

	@Override
	protected void doAddBpmProcessFormDefine(long bpmProcessDefineId,
			BpmFormDefineBean bpmFormDefineBean) throws Exception {

		bpmFormDefineBean.setProcessDefineId(bpmProcessDefineId);

		this.bpmFormDefineDao.insertBpmFormDefine(bpmFormDefineBean
				.convertToBpmFormDefine());

	}

	@Override
	protected void doModifyBpmProcessFormDefine(long bpmProcessDefineId,
			BpmFormDefineBean bpmFormDefineBean) throws Exception {

		bpmFormDefineBean.setProcessDefineId(bpmProcessDefineId);

		this.bpmFormDefineDao.updateBpmFormDefine(bpmFormDefineBean
				.convertToBpmFormDefine());
	}

	@Override
	protected void doDeleteBpmProcessFormDefines(long[] bpmFormDefineBeanIds)
			throws Exception {

		if (ArrayUtils.isEmpty(bpmFormDefineBeanIds)) {
			return;
		}

		BpmFormDefineDAOQueryBean queryBean = new BpmFormDefineDAOQueryBean();

		queryBean.createCriteria().andIdIn(bpmFormDefineBeanIds);

		this.bpmFormDefineDao.deleteBpmFormDefine(queryBean);

	}

	@Override
	protected BpmFormDefineBean doGetBpmProcessFormDefineByKey(
			long bpmProcessDefineId, String formKey) throws Exception {

		BpmFormDefineDAOQueryBean queryBean = new BpmFormDefineDAOQueryBean();

		queryBean.createCriteria()
				.andProcessDefineIdEqualTo(bpmProcessDefineId)
				.andFormKeyEqualTo(formKey);

		BpmFormDefineBean[] formDefineBeans = BpmFormDefineBean
				.toArray(this.bpmFormDefineDao.queryBpmFormDefine(queryBean));

		return ArrayUtils.isNotEmpty(formDefineBeans) ? formDefineBeans[0]
				: null;
	}

	@Override
	protected BpmPublicUiConfigBean doGetBpmPublicUIConfig(String uiConfigType)
			throws Exception {

		BpmPublicUiConfigDAOQueryBean queryBean = new BpmPublicUiConfigDAOQueryBean();

		queryBean.createCriteria().andUiConfigTypeEqualTo(uiConfigType);

		BpmPublicUiConfigBean[] configBeans = BpmPublicUiConfigBean
				.toArray(this.bpmPublicUiConfigDao
						.queryBpmPublicUiConfig(queryBean));

		return ArrayUtils.isNotEmpty(configBeans) ? configBeans[0] : null;
	}

	@Override
	protected void doSetBpmPublicUIConfig(String bpmUiConfigType,
			BpmPublicUiConfigBean bpmPublicUiConfigBean) throws Exception {

		bpmPublicUiConfigBean.setUiConfigType(bpmUiConfigType);

		BpmPublicUiConfigBean publicUiConfigBean = getBpmPublicUIConfig(bpmUiConfigType);

		if (publicUiConfigBean == null) {
			this.bpmPublicUiConfigDao
					.insertBpmPublicUiConfig(bpmPublicUiConfigBean
							.convertToBpmPublicUiConfig());
		} else {
			publicUiConfigBean.setConfigXml(bpmPublicUiConfigBean
					.getConfigXml());
			publicUiConfigBean.setRemarks(bpmPublicUiConfigBean.getRemarks());
			publicUiConfigBean.setStatus(bpmPublicUiConfigBean.getStatus());
			this.bpmPublicUiConfigDao
					.updateBpmPublicUiConfig(publicUiConfigBean
							.convertToBpmPublicUiConfig());
		}

	}

	@Override
	protected BpmTaskBean[] doQueryBpmTasks(BpmTaskDAOQueryBean queryBean)
			throws Exception {
		if (queryBean == null) {
			queryBean = new BpmTaskDAOQueryBean();
		}
		return BpmTaskBean.toArray(this.bpmTaskDao.queryBpmTask(queryBean));
	}

	@Override
	protected int doQueryBpmTaskCount(BpmTaskDAOQueryBean queryBean)
			throws Exception {
		if (queryBean == null) {
			queryBean = new BpmTaskDAOQueryBean();
		}
		return this.bpmTaskDao.queryBpmTaskCount(queryBean);
	}

	@Override
	protected BpmRoleBean doGetBpmRoleByKey(String roleKey) throws Exception {

		BpmRoleDAOQueryBean queryBean = new BpmRoleDAOQueryBean();

		queryBean.createCriteria().andRoleKeyEqualTo(roleKey);

		BpmRoleBean[] roleBeans = BpmRoleBean.toArray(this.bpmRoleDao
				.queryBpmRole(queryBean));

		return ArrayUtils.isNotEmpty(roleBeans) ? roleBeans[0] : null;
	}

	@Override
	protected void doSetBpmTaskAssigner(long loginEmployeeId, long bpmTaskId,
			long assignerId, int priority, String comment) throws Exception {

		BpmTask bpmTask = this.bpmTaskDao.findBpmTaskById(bpmTaskId);

		BpmProcessInstance bpmProcessInstance = this.bpmProcessInstanceDao
				.findBpmProcessInstanceById(bpmTask.getProcessInstanceId());

		this.taskService
				.claim(bpmTask.getTaskKey(), String.valueOf(assignerId));

		if (StringUtils.isNotBlank(comment)) {

			try {
				this.dentityService.setAuthenticatedUserId(String
						.valueOf(loginEmployeeId));

				this.taskService.addComment(bpmTask.getTaskKey(),
						bpmProcessInstance.getInstanceId(), comment);

				List<Comment> comments = this.taskService
						.getTaskComments(bpmTask.getTaskKey());

				bpmTask.setCommentCount(comments.size());

			} finally {
				this.dentityService.setAuthenticatedUserId(null);
			}

		}

		this.taskService.setPriority(bpmTask.getTaskKey(), priority);

		bpmTask.setAssignerId(Long.valueOf(assignerId));

		bpmTask.setPriority(priority);

		bpmTask.setStatus(BpmTaskStatusEnum.ASSIGNED.getName());

		this.bpmTaskDao.updateBpmTask(bpmTask);

	}

	@Override
	protected Map<String, Object> doGetBpmProcessInstanceVariables(
			long bpmProcessInstanceId) throws Exception {

		BpmProcessInstance processInstance = this.bpmProcessInstanceDao
				.findBpmProcessInstanceById(bpmProcessInstanceId);

		ProcessInstance instance = this.runtimeService
				.createProcessInstanceQuery()
				.processInstanceId(processInstance.getInstanceId())
				.singleResult();

		return this.runtimeService
				.getVariables(instance.getProcessInstanceId());

	}

	@Override
	protected EmployeeBean[] doGetBpmTaskCandidateAssigners(long bpmTaskId)
			throws Exception {

		BpmTask bpmTask = this.bpmTaskDao.findBpmTaskById(bpmTaskId);

		BpmTaskRoleRelateDAOQueryBean queryBean = new BpmTaskRoleRelateDAOQueryBean();

		queryBean.createCriteria().andTaskIdEqualTo(bpmTaskId);

		BpmTaskRoleRelate[] taskRoleRelates = this.bpmTaskRoleRelateDao
				.queryBpmTaskRoleRelate(queryBean);

		if (ArrayUtils.isEmpty(taskRoleRelates)) {
			return new EmployeeBean[0];
		}

		long[] roleIds = new long[taskRoleRelates.length];

		for (int i = 0; i < roleIds.length; i++) {
			roleIds[i] = taskRoleRelates[i].getRoleId();
		}

		BpmEmployeeRoleRelateDAOQueryBean employeeRoleQueryBean = new BpmEmployeeRoleRelateDAOQueryBean();

		employeeRoleQueryBean.createCriteria().andBpmRoleIdIn(roleIds);

		BpmEmployeeRoleRelate[] employeeRoleRelates = this.bpmEmployeeRoleRelateDao
				.queryBpmEmployeeRoleRelate(employeeRoleQueryBean);

		long[] teamIds = this.teamService.getTeamByMemberId(bpmTask
				.getStarterId());

		DepartmentBean[] departmentBeans = this.departmentService
				.getEmployeeDepartments(bpmTask.getStarterId(), true);

		long[] deparmentIds = new long[departmentBeans.length];

		for (int i = 0; i < deparmentIds.length; i++) {
			deparmentIds[i] = departmentBeans[i].getId();
		}

		List<Long> employeeIds = new ArrayList<Long>();

		for (int i = 0; i < employeeRoleRelates.length; i++) {
			BpmEmployeeRoleRelate bpmEmployeeRoleRelate = employeeRoleRelates[i];
			if (StringUtils.isBlank(bpmEmployeeRoleRelate.getBusinessType())) {
				employeeIds
						.add(new Long(bpmEmployeeRoleRelate.getEmployeeId()));
			} else if (IBpmEmployeeRoleRelateDAO.DataProperty.TeamId
					.equals(bpmEmployeeRoleRelate.getBusinessType())) {
				if (ArrayUtils.contains(teamIds,
						bpmEmployeeRoleRelate.getTeamId())) {
					employeeIds.add(new Long(bpmEmployeeRoleRelate
							.getEmployeeId()));
				}

			} else if (IBpmEmployeeRoleRelateDAO.DataProperty.DepartmentId
					.equals(bpmEmployeeRoleRelate.getBusinessType())) {
				if (ArrayUtils.contains(deparmentIds,
						bpmEmployeeRoleRelate.getDepartmentId())) {
					employeeIds.add(new Long(bpmEmployeeRoleRelate
							.getEmployeeId()));
				}
			} else if (IBpmEmployeeRoleRelateDAO.DataProperty.ProjectId
					.equals(bpmEmployeeRoleRelate.getBusinessType())) {

			} else if (IBpmEmployeeRoleRelateDAO.DataProperty.ProductId
					.equals(bpmEmployeeRoleRelate.getBusinessType())) {

			}
		}

		if (employeeIds.isEmpty()) {
			return new EmployeeBean[0];
		} else {
			EmployeeDAOQueryBean employeeDAOQueryBean = new EmployeeDAOQueryBean();

			employeeDAOQueryBean.createCriteria().andIdIn(employeeIds);

			return this.employeeService.queryEmployee(employeeDAOQueryBean);
		}

	}

	@Override
	protected BpmTaskBean[] doGetBpmTaskByIds(long[] taskIds) throws Exception {

		if (ArrayUtils.isEmpty(taskIds)) {
			return new BpmTaskBean[0];
		}

		BpmTaskDAOQueryBean queryBean = new BpmTaskDAOQueryBean();

		queryBean.createCriteria().andIdIn(taskIds);

		return BpmTaskBean.toArray(this.bpmTaskDao.queryBpmTask(queryBean));
	}

	@Override
	protected void doCompleteBpmTask(long bpmTaskId, long executorId,
			Map<String, Object> formData) throws Exception {

		BpmTask bpmTask = this.bpmTaskDao.findBpmTaskById(bpmTaskId);

		BpmProcessInstance bpmProcessInstance = this.bpmProcessInstanceDao
				.findBpmProcessInstanceById(bpmTask.getProcessInstanceId());

		this.dentityService.setAuthenticatedUserId(String.valueOf(executorId));

		this.taskService.complete(bpmTask.getTaskKey(), formData);

		bpmTask.setEndDateTime(new Date());

		bpmTask.setStatus(BpmTaskStatusEnum.FINISHED.getName());

		this.bpmTaskDao.updateBpmTask(bpmTask);

		BpmProcessFormInstanceDAOQueryBean formInstanceQueryBean = new BpmProcessFormInstanceDAOQueryBean();

		formInstanceQueryBean.createCriteria()
				.andProcessInstanceIdEqualTo(bpmTask.getProcessInstanceId())
				.andTaskIdEqualTo(bpmTaskId);

		BpmProcessFormInstance[] formInstances = this.bpmProcessFormInstanceDao
				.queryBpmProcessFormInstance(formInstanceQueryBean);

		if (ArrayUtils.isNotEmpty(formInstances)) {
			storeBpmProcessFormValues(formInstances[0].getId(), formData);
		}

		BpmTaskRoleRelateDAOQueryBean taskRoleRelateDAOQueryBean = new BpmTaskRoleRelateDAOQueryBean();

		taskRoleRelateDAOQueryBean.createCriteria()
				.andProcessInstanceIdEqualTo(bpmProcessInstance.getId())
				.andTaskIdEqualTo(bpmTaskId);

		this.bpmTaskRoleRelateDao
				.deleteBpmTaskRoleRelate(taskRoleRelateDAOQueryBean);

		synchronizaBpmTasks(new BpmProcessInstanceBean(bpmProcessInstance),
				executorId, bpmTaskId);

		HistoricProcessInstance historicProcessInstance = this.historyService
				.createHistoricProcessInstanceQuery().finished()
				.processInstanceId(bpmProcessInstance.getInstanceId())
				.singleResult();

		if (historicProcessInstance != null) {
			bpmProcessInstance.setCompleteDate(historicProcessInstance
					.getEndTime());
			bpmProcessInstance.setLastOperatorId(executorId);
			bpmProcessInstance.setStatus(BpmProcessStatusEnum.FINISHED
					.getName());
			this.bpmProcessInstanceDao
					.updateBpmProcessInstance(bpmProcessInstance);
		}

	}

	@Override
	protected BpmAttachmentBean[] doGetBpmProcessInstanceAttachments(
			long bpmProcessinstanceId) throws Exception {

		BpmAttachmentDAOQueryBean queryBean = new BpmAttachmentDAOQueryBean();

		queryBean.createCriteria()
				.andProcessInstanceIdEqualTo(bpmProcessinstanceId)
				.andTaskIdEqualTo(0);

		return BpmAttachmentBean.toArray(this.bpmAttachmentDao
				.queryBpmAttachment(queryBean));
	}

	protected int getBpmProcessInstanceAttachmentCount(long processInstanceId)
			throws Exception {

		BpmAttachmentDAOQueryBean queryBean = new BpmAttachmentDAOQueryBean();

		queryBean.createCriteria().andProcessInstanceIdEqualTo(
				processInstanceId);

		return this.bpmAttachmentDao.queryBpmAttachmentCount(queryBean);
	}

	@Override
	protected void doAddBpmProcessInstanceAttachments(long processInstanceId,
			BpmAttachmentBean[] bpmAttachments,
			Map<String, InputStream> contentMap) throws Exception {

		BpmProcessInstance bpmProcessInstance = this.bpmProcessInstanceDao
				.findBpmProcessInstanceById(processInstanceId);

		BpmAttachment[] attachments = new BpmAttachment[bpmAttachments.length];

		Date createData = new Date();

		File baseDir = new File(FileUtils.getUserDirectory(), ".ourteam/bpm/"
				+ bpmProcessInstance.getId());

		if (baseDir.exists() == false) {
			baseDir.mkdirs();
		}

		for (int i = 0; i < bpmAttachments.length; i++) {
			BpmAttachmentBean bpmAttachmentBean = bpmAttachments[i];
			attachments[i] = bpmAttachmentBean.convertToBpmAttachment();
			attachments[i].setProcessInstanceId(processInstanceId);
			attachments[i].setTaskId(0);
			attachments[i].setCreateDate(createData);

			if (contentMap.containsKey(bpmAttachmentBean.getUrl())) {

				File file = new File(baseDir,
						new String(Base64.encodeBase64((attachments[i]
								.getFileName() + System.currentTimeMillis())
								.getBytes())));

				if (file.exists() == false) {
					file.createNewFile();
				}

				FileUtils.copyInputStreamToFile(
						contentMap.get(bpmAttachmentBean.getUrl()), file);

				attachments[i].setAttachementUrl(file.getPath());

			}

		}

		this.bpmAttachmentDao.batchInsertBpmAttachment(attachments);

		bpmProcessInstance
				.setAttachmentCount(getBpmProcessInstanceAttachmentCount(processInstanceId));

		this.bpmProcessInstanceDao.updateBpmProcessInstance(bpmProcessInstance);

	}

	@Override
	protected BpmCommentBean[] doGetBpmProcessInstanceComments(
			long bpmProcessInstanceId) throws Exception {

		BpmCommentDAOQueryBean queryBean = new BpmCommentDAOQueryBean();

		queryBean.createCriteria().andProcessInstanceIdEqualTo(
				bpmProcessInstanceId);

		queryBean.setSortProperty(IBpmCommentDAO.AuthorDate);

		return BpmCommentBean.toArray(this.bpmCommentDao
				.queryBpmComment(queryBean));
	}

	protected int getBpmProcessInstanceCommentCount(long bpmProcessInstanceId)
			throws Exception {
		BpmCommentDAOQueryBean queryBean = new BpmCommentDAOQueryBean();

		queryBean.createCriteria().andProcessInstanceIdEqualTo(
				bpmProcessInstanceId);

		return this.bpmCommentDao.queryBpmCommentCount(queryBean);
	}

	@Override
	protected void doAddBpmProcessInstanceComment(long bpmProcessInstanceId,
			long employeeId, String comment) throws Exception {

		BpmComment bpmComment = new BpmComment();

		bpmComment.setAuthorDate(new Date());

		bpmComment.setAuthorId(employeeId);

		bpmComment.setComment(comment);

		bpmComment.setProcessInstanceId(bpmProcessInstanceId);

		this.bpmCommentDao.insertBpmComment(bpmComment);

		BpmProcessInstance bpmProcessInstance = this.bpmProcessInstanceDao
				.findBpmProcessInstanceById(bpmProcessInstanceId);

		bpmProcessInstance
				.setCommentCount(getBpmProcessInstanceCommentCount(bpmProcessInstanceId));

		this.bpmProcessInstanceDao.updateBpmProcessInstance(bpmProcessInstance);

	}

	@Override
	protected BpmProcessInstanceBean doGetBpmProcessInstanceById(
			long bpmProcessInstanceId) throws Exception {

		BpmProcessInstance bpmProcessInstance = this.bpmProcessInstanceDao
				.findBpmProcessInstanceById(bpmProcessInstanceId);

		return bpmProcessInstance != null ? new BpmProcessInstanceBean(
				bpmProcessInstance) : null;
	}

	@Override
	protected BpmProcessDefineBean doGetBpmProcessDefineById(
			long processDefineId) throws Exception {
		BpmProcessDefine bpmProcessDefine = this.bpmProcessDefineDao
				.findBpmProcessDefineById(processDefineId);

		return bpmProcessDefine != null ? new BpmProcessDefineBean(
				bpmProcessDefine) : null;
	}

	@Override
	protected Map<String, Object> doGetBpmProcessFormValues(
			long processInstanceId, long taskId) throws Exception {

		Map<String, Object> values = new HashMap<String, Object>();

		BpmProcessFormInstanceDAOQueryBean formInstanceQueryBean = new BpmProcessFormInstanceDAOQueryBean();

		formInstanceQueryBean.createCriteria()
				.andProcessInstanceIdEqualTo(processInstanceId)
				.andTaskIdEqualTo(taskId);

		BpmProcessFormInstance[] formInstances = this.bpmProcessFormInstanceDao
				.queryBpmProcessFormInstance(formInstanceQueryBean);

		if (ArrayUtils.isEmpty(formInstances)) {
			return values;
		} else {
			BpmProcessFormValueDAOQueryBean formValueQueryBean = new BpmProcessFormValueDAOQueryBean();

			formValueQueryBean.createCriteria().andFormInstanceIdEqualTo(
					formInstances[0].getId());

			BpmProcessFormValue[] formValues = this.bpmProcessFormValueDao
					.queryBpmProcessFormValue(formValueQueryBean);

			for (int i = 0; i < formValues.length; i++) {
				BpmProcessFormValue bpmProcessFormValue = formValues[i];

				Object value = null;

				if ("date".equals(bpmProcessFormValue.getPropertyDataType())) {

					value = new Date(bpmProcessFormValue.getLongValue()
							.longValue());

				} else if ("long".equals(bpmProcessFormValue
						.getPropertyDataType())) {
					value = new Long(bpmProcessFormValue.getLongValue()
							.longValue());
				} else if ("double".equals(bpmProcessFormValue
						.getPropertyDataType())) {
					value = new Double(bpmProcessFormValue.getDoubleValue()
							.doubleValue());
				} else if ("string".equals(bpmProcessFormValue
						.getPropertyDataType())) {
					value = bpmProcessFormValue.getStringValue();
				}

				values.put(bpmProcessFormValue.getPropertyName(), value);
			}

		}

		return values;
	}

	@Override
	protected BpmTaskBean[] doGetBpmProcessFlow(long bpmProcessInstanceId)
			throws Exception {

		BpmTaskDAOQueryBean queryBean = new BpmTaskDAOQueryBean();

		queryBean.createCriteria()
				.andProcessInstanceIdEqualTo(bpmProcessInstanceId)
				.andStatusEqualTo(BpmTaskStatusEnum.FINISHED.getName());

		BpmTask[] bpmTasks = this.bpmTaskDao.queryBpmTask(queryBean);

		if (ArrayUtils.isEmpty(bpmTasks)) {
			return new BpmTaskBean[0];
		}

		Map<Long, List<BpmTaskBean>> taskMap = new HashMap<Long, List<BpmTaskBean>>();

		for (int i = 0; i < bpmTasks.length; i++) {
			BpmTask bpmTask = bpmTasks[i];
			if (taskMap.containsKey(Long.valueOf(bpmTask.getPreTaskId())) == false) {
				taskMap.put(Long.valueOf(bpmTask.getPreTaskId()),
						new ArrayList<BpmTaskBean>());
			}
			taskMap.get(Long.valueOf(bpmTask.getPreTaskId())).add(
					new BpmTaskBean(bpmTask));

		}

		List<BpmTaskBean> preBpmTasks = taskMap.get(Long.valueOf(0));

		List<BpmTaskBean> bpmTaskBeans = new ArrayList<BpmTaskBean>();

		while (CollectionUtils.isNotEmpty(preBpmTasks)) {

			bpmTaskBeans.addAll(preBpmTasks);

			List<BpmTaskBean> tempList = new ArrayList<BpmTaskBean>();

			for (Iterator<BpmTaskBean> iterator = preBpmTasks.iterator(); iterator
					.hasNext();) {
				BpmTaskBean preBpmTaskBean = iterator.next();
				if (taskMap.containsKey(Long.valueOf(preBpmTaskBean.getId()))) {
					tempList.addAll(taskMap.get(Long.valueOf(preBpmTaskBean
							.getId())));
				}
			}

			preBpmTasks = tempList;

		}

		return bpmTaskBeans.toArray(new BpmTaskBean[bpmTaskBeans.size()]);
	}

	@Override
	protected BpmTaskBean[] doGetUnAssignedBpmTasks(long bpmProcessInstanceId)
			throws Exception {

		BpmTaskDAOQueryBean queryBean = new BpmTaskDAOQueryBean();

		queryBean.createCriteria()
				.andProcessInstanceIdEqualTo(bpmProcessInstanceId)
				.andStatusEqualTo(BpmTaskStatusEnum.UNASSIGNED.getName());

		return BpmTaskBean.toArray(this.bpmTaskDao.queryBpmTask(queryBean));
	}

	@Override
	protected void doModifyBpmProcessFormValues(long bpmProcessInstanceId,
			long editorId, Map<String, Object> formValues) throws Exception {

		BpmProcessFormInstanceDAOQueryBean formInstanceQueryBean = new BpmProcessFormInstanceDAOQueryBean();

		formInstanceQueryBean.createCriteria()
				.andProcessInstanceIdEqualTo(bpmProcessInstanceId)
				.andTaskIdEqualTo(0);

		BpmProcessFormInstance[] formInstances = this.bpmProcessFormInstanceDao
				.queryBpmProcessFormInstance(formInstanceQueryBean);

		if (ArrayUtils.isNotEmpty(formInstances)) {
			storeBpmProcessFormValues(formInstances[0].getId(), formValues);
		}

	}

	@Override
	protected void doDeleteBpmProcessInstanceAttachments(
			long[] bpmAttachmentIds, long operatorId) throws Exception {

		List<Long> processInstanceIds = new ArrayList<Long>();

		for (int i = 0; i < bpmAttachmentIds.length; i++) {
			BpmAttachment attachment = this.bpmAttachmentDao
					.findBpmAttachmentById(bpmAttachmentIds[i]);

			if ("file".equals(attachment.getAttachementType())) {
				File file = new File(attachment.getAttachementUrl());
				if (file.exists() == true) {
					FileUtils.forceDelete(file);
				}

			}

			if (processInstanceIds.contains(Long.valueOf(attachment
					.getProcessInstanceId())) == false) {
				processInstanceIds.add(Long.valueOf(attachment
						.getProcessInstanceId()));
			}

			this.bpmAttachmentDao.deleteBpmAttachment(bpmAttachmentIds[i]);
		}

		for (Iterator<Long> iterator = processInstanceIds.iterator(); iterator
				.hasNext();) {
			long processInstanceId = iterator.next().longValue();

			BpmProcessInstance bpmProcessInstance = this.bpmProcessInstanceDao
					.findBpmProcessInstanceById(processInstanceId);

			bpmProcessInstance
					.setAttachmentCount(getBpmProcessInstanceAttachmentCount(processInstanceId));

			this.bpmProcessInstanceDao
					.updateBpmProcessInstance(bpmProcessInstance);

		}

	}

	@Override
	protected BpmAttachmentBean doGetBpmProcessInstanceAttachmentById(
			long bpmAttachmentId) throws Exception {

		BpmAttachment attachment = this.bpmAttachmentDao
				.findBpmAttachmentById(bpmAttachmentId);

		return attachment != null ? new BpmAttachmentBean(attachment) : null;
	}

	@Override
	protected int doGetBpmUnAssignedTaskCount(long employeeId) throws Exception {
		BpmEmployeeRoleRelateBean[] employeeRoleRelateBeans = getEmployeeBpmRoleRelateByEmployeeId(employeeId);

		long[] bpmRoleIds = new long[employeeRoleRelateBeans.length];

		for (int i = 0; i < bpmRoleIds.length; i++) {
			bpmRoleIds[i] = employeeRoleRelateBeans[i].getBpmRoleId();
		}

		BpmTaskDAOQueryBean queryBean = new BpmTaskDAOQueryBean();

		BpmTaskDAOQueryBean.Criteria criteria = queryBean.createCriteria();

		criteria.andAssignerIdIsNull();

		if (ArrayUtils.isNotEmpty(bpmRoleIds)) {

			BpmTaskRoleRelateDAOQueryBean daoQueryBean = new BpmTaskRoleRelateDAOQueryBean();

			daoQueryBean.createCriteria()
					.andTaskIdEqualToForeignKey(IBpmTaskDAO.Id)
					.andRoleIdIn(bpmRoleIds);

			queryBean.addInnerJoin(IBpmTaskRoleRelateDAO.EntityName,
					daoQueryBean);

			int taskCont = queryBpmTaskCount(queryBean);

			return taskCont;
		} else {
			return 0;
		}
	}

	@Override
	protected BpmTaskBean[] doGetBpmUnAssignedTask(long bpmRoleId)
			throws Exception {

		BpmTaskDAOQueryBean queryBean = new BpmTaskDAOQueryBean();

		BpmTaskDAOQueryBean.Criteria criteria = queryBean.createCriteria();

		criteria.andAssignerIdIsNull();

		BpmTaskRoleRelateDAOQueryBean daoQueryBean = new BpmTaskRoleRelateDAOQueryBean();

		daoQueryBean.createCriteria()
				.andTaskIdEqualToForeignKey(IBpmTaskDAO.Id)
				.andRoleIdEqualTo(bpmRoleId);

		queryBean.addInnerJoin(IBpmTaskRoleRelateDAO.EntityName, daoQueryBean);

		queryBean.setSortProperty(IBpmTaskDAO.StartDateTime, false);

		return queryBpmTasks(queryBean);
	}
} // end BPMServiceImpl
