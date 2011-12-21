package com.ourteam.system.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.ourteam.system.dao.ISysDomainDAO;
import com.ourteam.system.dao.ISysModuleDAO;
import com.ourteam.system.dao.SysAction;
import com.ourteam.system.dao.SysActionDAOQueryBean;
import com.ourteam.system.dao.SysDomain;
import com.ourteam.system.dao.SysDomainDAOQueryBean;
import com.ourteam.system.dao.SysModule;
import com.ourteam.system.dao.SysModuleDAOQueryBean;
import com.ourteam.system.dao.SysResourceDAOQueryBean;
import com.ourteam.system.dao.SysResourceProperty;
import com.ourteam.system.dao.SysResourceTypeIdEnum;
import com.ourteam.system.dao.SysRoleActionRelateDAOQueryBean;
import com.ourteam.system.domain.ApplicationDomain;
import com.ourteam.system.domain.SystemAction;
import com.ourteam.system.domain.SystemFunction;
import com.ourteam.system.domain.SystemModule;
import com.ourteam.system.domain.SystemResource;

public class SystemApplicationServiceImpl extends
		AbstractSystemApplicationService {

	protected ApplicationDomain[] doGetApplicationDomains() throws Exception {
		SysDomainDAOQueryBean queryBean = new SysDomainDAOQueryBean();

		queryBean.setSortProperty(ISysDomainDAO.SortIndex);

		SysDomain[] sysDomains = sysDomainDao.querySysDomain(queryBean);

		ApplicationDomain[] appDomains = new ApplicationDomain[sysDomains.length];

		for (int i = 0; i < sysDomains.length; i++) {
			SysDomain sysDomain = sysDomains[i];
			appDomains[i] = new ApplicationDomain(sysDomain);
		}

		return appDomains;
	}

	protected void configSystemFunctionMenuProperties(SystemFunction menus,
			SysResourceProperty[] extendProperties) throws Exception {

		for (int j = 0; j < extendProperties.length; j++) {
			SysResourceProperty sysResourceProperty = extendProperties[j];
			if (PropertyUtils.isWriteable(menus,
					sysResourceProperty.getResourcePropertyCode())) {

				Class valueType = PropertyUtils.getPropertyType(menus,
						sysResourceProperty.getResourcePropertyCode());

				Object value = ConvertUtils.convert(
						sysResourceProperty.getResourcePropertyValue(),
						valueType);

				PropertyUtils.setProperty(menus,
						sysResourceProperty.getResourcePropertyCode(), value);
			}
		}
	}

	protected SystemFunction[] doGetSystemFunctions(long aDomainId,
			long aParentId, ISysResourceQueryCallback aCallback)
			throws Exception {

		SystemResource[] sysResources = sysResourceService.getSysResources(
				aDomainId, aParentId, SysResourceTypeIdEnum.SYS_FUNCTION,
				aCallback);

		SystemFunction[] menus = new SystemFunction[sysResources.length];

		SystemFunction parentFunction = null;

		if (aParentId != 0) {
			parentFunction = getSystemFunctionById(aParentId);
		}

		for (int i = 0; i < sysResources.length; i++) {
			SystemResource sysResource = sysResources[i];

			menus[i] = new SystemFunction(sysResource);

			menus[i].setParentFunction(parentFunction);
		}

		return menus;
	}

	protected SystemFunction[] doGetAllSystemFunctions(long aDomainId,
			ISysResourceQueryCallback aCallback) throws Exception {
		SystemResource[] sysResources = sysResourceService.getAllSysResources(
				aDomainId, SysResourceTypeIdEnum.SYS_FUNCTION, aCallback);

		SystemFunction[] menus = new SystemFunction[sysResources.length];

		Map functionMap = new HashMap();

		for (int i = 0; i < sysResources.length; i++) {
			SystemResource sysResource = sysResources[i];

			menus[i] = new SystemFunction(sysResource);

			functionMap.put(Long.valueOf(menus[i].getId()), menus[i]);
		}

		for (int i = 0; i < menus.length; i++) {
			SystemFunction systemFunction = menus[i];
			if (systemFunction.getParentId() > 0) {
				SystemFunction parentFunction = (SystemFunction) functionMap
						.get(Long.valueOf(systemFunction.getParentId()));
				systemFunction.setParentFunction(parentFunction);
			}
		}

		functionMap.clear();

		return menus;
	}

	protected void doCreateSystemFunction(SystemFunction aSystemFunctionMenu)
			throws Exception {

		sysResourceService.createSysResource(aSystemFunctionMenu);

	}

	protected int doGetMaxSystemFunctionSort(long aDomainId, long aParentId)
			throws Exception {
		return sysResourceService.getMaxSysResourceSortIndex(aDomainId,
				aParentId, SysResourceTypeIdEnum.SYS_FUNCTION);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.ourteam.system.service.AbstractSystemApplicationService#
	 * doGetSystemFunctionById(long)
	 */
	protected SystemFunction doGetSystemFunctionById(long aSysFunctionId)
			throws Exception {
		SystemResource sysResource = sysResourceService
				.getSysResourceById(aSysFunctionId);

		if (sysResource == null) {
			return null;
		}

		SystemFunction function = new SystemFunction(sysResource);

		return function;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.ourteam.system.service.AbstractSystemApplicationService#
	 * doModifySystemFunction(com.ourteam.system.domain.SystemFunction)
	 */
	protected void doModifySystemFunction(SystemFunction aSystemFunction)
			throws Exception {

		sysResourceService.modifySysResource(aSystemFunction);

	}

	protected void doDeleteSystemFunction(long aSysFunctionId) throws Exception {
		sysResourceService.deleteSysResource(aSysFunctionId);
	}

	protected int doQueryApplicationDomainCount(SysDomainDAOQueryBean aQueryBean)
			throws Exception {
		return sysDomainDao.querySysDomainCount(aQueryBean);
	}

	protected ApplicationDomain[] doQueryApplicationDomains(
			SysDomainDAOQueryBean aQueryBean) throws Exception {

		SysDomain[] domains = sysDomainDao.querySysDomain(aQueryBean);

		return ApplicationDomain.toArray(domains);
	}

	protected void doCreateApplicationDomain(
			ApplicationDomain aApplicationDomain) throws Exception {

		SysDomain sysDomain = aApplicationDomain.convertToSysDomain();

		if (sysDomainDao.checkIsUnique(sysDomain) == false) {
			throw new Exception("Sys Domain[" + sysDomain.getDomainCode()
					+ "] is alerady exist");
		}

		if (StringUtils.isBlank(sysDomain.getDomainTitelKey())) {
			sysDomain.setDomainTitelKey(sysDomain.getDomainName());
		}

		sysDomainDao.insertSysDomain(sysDomain);

		if (sysDomain.getSortIndex() == null) {
			int maxSortIndex = getMaxApplicationDomainSort();
			sysDomain.setSortIndex(new Integer(maxSortIndex + 1));
		}

		setSysDomainSortIndex(sysDomain.getId(), sysDomain.getSortIndex()
				.intValue());

	}

	protected void doDeleteApplicationDomain(long aApplicationDomainId)
			throws Exception {

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		queryBean.createCriteria().andDomainIdEqualTo(
				Long.valueOf(aApplicationDomainId));

		if (sysResourceDao.querySysResourceCount(queryBean) > 0) {
			throw new Exception("Sys Domain[" + aApplicationDomainId
					+ "] is refrenced by other resource");
		}

		SysModuleDAOQueryBean sysModuleDAOQueryBean = new SysModuleDAOQueryBean();

		sysModuleDAOQueryBean.createCriteria().andDomainIdEqualTo(
				aApplicationDomainId);

		SysModule[] sysModules = sysModuleDao
				.querySysModule(sysModuleDAOQueryBean);

		for (int i = 0; i < sysModules.length; i++) {
			deleteSystemModule(sysModules[i].getId());
		}

		sysDomainDao.deleteSysDomain(aApplicationDomainId);

	}

	protected void doModifyApplicationDomain(
			ApplicationDomain aApplicationDomain) throws Exception {

		SysDomain sysDomain = aApplicationDomain.convertToSysDomain();

		if (sysDomainDao.checkIsUnique(sysDomain) == false) {
			throw new Exception("Sys Domain[" + sysDomain.getDomainCode()
					+ "] is alerady exist");
		}

		sysDomainDao.updateSysDomain(sysDomain);

		if (sysDomain.getSortIndex() == null) {
			int maxSortIndex = getMaxApplicationDomainSort();
			sysDomain.setSortIndex(new Integer(maxSortIndex));
		}

		setSysDomainSortIndex(sysDomain.getId(), sysDomain.getSortIndex()
				.intValue());

	}

	protected int doGetMaxApplicationDomainSort() throws Exception {
		SysDomainDAOQueryBean queryBean = new SysDomainDAOQueryBean();

		queryBean.addMaxFunctionProperty(ISysDomainDAO.SortIndex,
				"maxSysDomainSort");

		Map[] results = sysDomainDao.querySysDomainSelective(queryBean);

		return MapUtils.getIntValue(results[0], "maxSysDomainSort");

	}

	protected void doSetSysDomainSortIndex(long aSysDomainId, int aSortIndex)
			throws Exception {
		if (aSortIndex < 0) {
			logger.warn("The Sort Index Must Gret Then 0");
			return;
		}

		SysDomain sysDomain = sysDomainDao.findSysDomainById(aSysDomainId);

		if (sysDomain == null) {
			logger.warn("Can Not Found The System Domain[" + aSysDomainId + "]");
			return;
		}

		SysDomainDAOQueryBean queryBean = new SysDomainDAOQueryBean();

		queryBean.createCriteria().andIdNotEqualTo(
				Long.valueOf(sysDomain.getId()));

		queryBean.setSortProperty(ISysDomainDAO.SortIndex);

		SysDomain[] sysDomains = sysDomainDao.querySysDomain(queryBean);

		if (aSortIndex > sysDomains.length + 1) {
			logger.warn("The Sort Index Must Less than " + sysDomains.length
					+ 1);
			return;
		}

		if (aSortIndex > 0) {
			sysDomains = (SysDomain[]) ArrayUtils.add(sysDomains,
					aSortIndex - 1, sysDomain);

		} else {
			sysDomains = (SysDomain[]) ArrayUtils.add(sysDomains, sysDomain);
		}

		for (int i = 0; i < sysDomains.length; i++) {
			sysDomains[i].setSortIndex(new Integer(i + 1));
		}

		sysDomainDao.batchUpdateSysDomain(sysDomains);
	}

	@Override
	protected SystemModule[] doGetSystemModules(long domainId,
			long parentModuleId) throws Exception {
		SysModuleDAOQueryBean queryBean = new SysModuleDAOQueryBean();

		queryBean.createCriteria().andDomainIdEqualTo(domainId)
				.andParentModuleIdEqualTo(parentModuleId);

		queryBean.setSortProperty(ISysModuleDAO.SortIndex);

		return SystemModule.toArray(sysModuleDao.querySysModule(queryBean));
	}

	@Override
	protected SystemAction[] doGetSystemActions(long moduleId) throws Exception {

		SysActionDAOQueryBean queryBean = new SysActionDAOQueryBean();

		queryBean.createCriteria().andModuleIdEqualTo(moduleId);

		return SystemAction.toArray(sysActionDao.querySysAction(queryBean));
	}

	@Override
	protected ApplicationDomain doGetApplicationDomainById(long domainId)
			throws Exception {
		SysDomain sysDomain = sysDomainDao.findSysDomainById(domainId);
		return sysDomain != null ? new ApplicationDomain(sysDomain) : null;
	}

	@Override
	protected SystemModule doGetSystemModuleById(long sysModuleId)
			throws Exception {
		SysModule sysModule = sysModuleDao.findSysModuleById(sysModuleId);
		return sysModule != null ? new SystemModule(sysModule) : null;
	}

	@Override
	protected SystemAction doGetSystemActionById(long sysActionId)
			throws Exception {
		SysAction sysAction = sysActionDao.findSysActionById(sysActionId);
		return sysAction != null ? new SystemAction(sysAction) : null;
	}

	@Override
	protected void doCreateSystemModule(SystemModule systemModule)
			throws Exception {

		sysModuleDao.insertSysModule(systemModule.convertToSysModule());

		if (systemModule.getSortIndex() == 0) {
			int maxSortIndex = getMaxSystemModuleSort(
					systemModule.getDomainId(),
					systemModule.getParentModuleId());
			systemModule.setSortIndex(new Integer(maxSortIndex + 1));
		}

		setSysModuleSortIndex(systemModule.getId(), systemModule.getSortIndex());

	}

	@Override
	protected void doModifySystemModule(SystemModule systemModule)
			throws Exception {
		sysModuleDao.updateSysModule(systemModule.convertToSysModule());

	}

	@Override
	protected void doDeleteSystemModule(long systemModuleId) throws Exception {

		SysActionDAOQueryBean sysActionDAOQueryBean = new SysActionDAOQueryBean();

		sysActionDAOQueryBean.createCriteria().andModuleIdEqualTo(
				systemModuleId);

		sysActionDao.deleteSysRoleActionRelate(sysActionDAOQueryBean);

		sysActionDao.deleteSysAction(sysActionDAOQueryBean);

		sysModuleDao.deleteSysModule(systemModuleId);
	}

	@Override
	protected void doCreateSystemAction(SystemAction systemAction)
			throws Exception {

		SysModule sysModule = sysModuleDao.findSysModuleById(systemAction
				.getModuleId());

		systemAction.setDomainId(sysModule.getDomainId());

		sysActionDao.insertSysAction(systemAction.convertToSysAction());

	}

	@Override
	protected void doModifySystemAction(SystemAction systemAction)
			throws Exception {
		sysActionDao.updateSysAction(systemAction.convertToSysAction());
	}

	@Override
	protected void doDeleteSystemAction(long systemActionId) throws Exception {

		SysRoleActionRelateDAOQueryBean queryBean = new SysRoleActionRelateDAOQueryBean();

		queryBean.createCriteria().andActionIdEqualTo(systemActionId);

		sysRoleActionRelateDao.deleteSysRoleActionRelate(queryBean);

		sysActionDao.deleteSysAction(systemActionId);
	}

	@Override
	protected void doSetSysModuleSortIndex(long moduleId, int sortIndex)
			throws Exception {

		if (sortIndex < 0) {
			logger.warn("The Sort Index Must Gret Then 0");
			return;
		}

		SysModule sysModule = sysModuleDao.findSysModuleById(moduleId);

		if (sysModule == null) {
			logger.warn("Can Not Found The System Module[" + moduleId + "]");
			return;
		}

		SysModuleDAOQueryBean queryBean = new SysModuleDAOQueryBean();

		queryBean.createCriteria().andDomainIdEqualTo(sysModule.getDomainId())
				.andParentModuleIdEqualTo(sysModule.getParentModuleId())
				.andIdNotEqualTo(moduleId);

		queryBean.setSortProperty(ISysModuleDAO.SortIndex);

		SysModule[] sysModules = sysModuleDao.querySysModule(queryBean);

		if (sortIndex > sysModules.length + 1) {
			logger.warn("The Sort Index Must Less than " + sysModules.length
					+ 1);
			return;
		}

		if (sortIndex > 0) {
			sysModules = (SysModule[]) ArrayUtils.add(sysModules,
					sortIndex - 1, sysModule);

		} else {
			sysModules = (SysModule[]) ArrayUtils.add(sysModules, sysModule);
		}

		for (int i = 0; i < sysModules.length; i++) {
			sysModules[i].setSortIndex(new Integer(i + 1));
		}

		sysModuleDao.batchUpdateSysModule(sysModules);

	}

	@Override
	protected int doGetMaxSystemModuleSort(long appDomainId, long parentModuleId)
			throws Exception {
		SysModuleDAOQueryBean queryBean = new SysModuleDAOQueryBean();

		queryBean.createCriteria().andDomainIdEqualTo(appDomainId)
				.andParentModuleIdEqualTo(parentModuleId);

		queryBean.addMaxFunctionProperty(ISysModuleDAO.SortIndex,
				"maxSysModuleSort");

		Map[] results = sysModuleDao.querySysModuleSelective(queryBean);

		return MapUtils.getIntValue(results[0], "maxSysModuleSort");
	}

	@Override
	protected SystemModule doGetSystemModuleByCode(String moduleCode)
			throws Exception {

		SysModuleDAOQueryBean queryBean = new SysModuleDAOQueryBean();

		queryBean.createCriteria().andModuleCodeEqualTo(moduleCode);

		SysModule[] sysModules = sysModuleDao.querySysModule(queryBean);

		return ArrayUtils.isNotEmpty(sysModules) ? new SystemModule(
				sysModules[0]) : null;
	}

	@Override
	protected SystemModule[] doQuerySystemModules(
			SysModuleDAOQueryBean queryBean) throws Exception {

		if (queryBean == null) {
			queryBean = new SysModuleDAOQueryBean();
		}

		return SystemModule
				.toArray(this.sysModuleDao.querySysModule(queryBean));
	}

}
