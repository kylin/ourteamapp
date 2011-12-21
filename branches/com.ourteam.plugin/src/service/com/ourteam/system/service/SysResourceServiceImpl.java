package com.ourteam.system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.enums.EnumUtils;

import com.ourteam.system.dao.ISysResourceDAO;
import com.ourteam.system.dao.ISysResourcePropertyDAO;
import com.ourteam.system.dao.ISysResourceTypeDAO;
import com.ourteam.system.dao.SysResource;
import com.ourteam.system.dao.SysResourceDAOQueryBean;
import com.ourteam.system.dao.SysResourceDAOQueryBean.Criteria;
import com.ourteam.system.dao.SysResourceProperty;
import com.ourteam.system.dao.SysResourcePropertyDAOQueryBean;
import com.ourteam.system.dao.SysResourceType;
import com.ourteam.system.dao.SysResourceTypeDAOQueryBean;
import com.ourteam.system.dao.SysResourceTypeIdEnum;
import com.ourteam.system.domain.SystemResource;
import com.ourteam.system.domain.SystemResourceProperty;

/**
 * ϵͳ��Դ���� impl Generated Date 2009-06-29 21:55:50
 * 
 * @author $Auto Gen
 */
public class SysResourceServiceImpl extends AbstractSysResourceService {

	/**
	 * ȡ��ϵͳ��Դ���� impl
	 * 
	 * @param aSysResourceId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws BusinessErrorException
	 * @throws Exception
	 */
	protected com.ourteam.system.dao.SysResourceProperty[] doGetSysResourceProperties(
			final long aSysResourceId) throws Exception {

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		queryBean.createCriteria().andIdEqualTo(Long.valueOf(aSysResourceId));

		queryBean
				.setSortProperty(ISysResourcePropertyDAO.ResourcePropertyOrder);

		SysResourceProperty[] sysResourceProperties = sysResourceDao
				.querySysResourcePropertys(queryBean);

		return sysResourceProperties;

	}

	/**
	 * ȡ��ϵͳ��Դ���Զ��� impl
	 * 
	 * @param aSysReourceId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws BusinessErrorException
	 * @throws Exception
	 */
	protected com.ourteam.system.dao.SysResourceType[] doGetSysResourcePropertyDefines(
			final long aSysResourceTypeId) throws Exception {

		SysResourceTypeDAOQueryBean queryBean = new SysResourceTypeDAOQueryBean();

		queryBean.createCriteria().andResourceTypeIdEqualTo(
				Long.valueOf(aSysResourceTypeId));

		queryBean.setSortProperty(ISysResourceTypeDAO.Sort);

		SysResourceType[] sysResourceAttrTypes = sysResourceTypeDao
				.querySysResourceType(queryBean);

		return sysResourceAttrTypes;

	}

	protected int doGetMaxSysResourceSortIndex(long aDomainId, long aParentId,
			SysResourceTypeIdEnum aTypeIdEnum) throws Exception {

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		queryBean.addMaxFunctionProperty(ISysResourceDAO.Sort, "MaxSort");

		queryBean.createCriteria().andDomainIdEqualTo(Long.valueOf(aDomainId))
				.andParentResourceIdEqualTo(Long.valueOf(aParentId))
				.andResourceTypeIdEqualTo(Long.valueOf(aTypeIdEnum.getValue()));

		Map[] resMaps = sysResourceDao.querySysResourceSelective(queryBean);

		if (ArrayUtils.isEmpty(resMaps)) {
			return 0;
		} else {
			if (resMaps[0].get("MaxSort") == null) {
				return 0;
			} else {
				return ((Number) resMaps[0].get("MaxSort")).intValue();
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ourteam.system.service.AbstractSysResourceService#doGetSysResourceById
	 * (long)
	 */
	protected SystemResource doGetSysResourceById(long aSysResourceId)
			throws Exception {
		SysResource sysResource = sysResourceDao
				.findSysResourceById(aSysResourceId);

		if (sysResource == null) {
			return null;
		}

		SystemResource resource = new SystemResource(sysResource);

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		queryBean.createCriteria().andIdEqualTo(Long.valueOf(aSysResourceId));

		SysResourceProperty[] sysResourceProperties = sysResourceDao
				.querySysResourcePropertys(queryBean);

		SystemResourceProperty[] properties = new SystemResourceProperty[sysResourceProperties.length];

		for (int i = 0; i < properties.length; i++) {
			properties[i] = new SystemResourceProperty(sysResourceProperties[i]);

		}

		resource.setProperties(properties);

		return resource;
	}

	protected void doCreateSysResource(SystemResource aSysResource)
			throws Exception {

		SysResource resource = aSysResource.convertToSysResource();

		if (sysResourceDao.checkIsUnique(resource) == false) {
			throw new Exception("Sys Resource[" + aSysResource.getName()
					+ "] is duplicate");
		}

		resource.setResourceTitleKey(getSysResourceTitleKey(aSysResource));

		sysResourceDao.insertSysResource(resource);

		SystemResourceProperty[] resourceProperties = aSysResource
				.getProperties();

		if (ArrayUtils.isEmpty(resourceProperties) == false) {
			SysResourceProperty[] properties = new SysResourceProperty[resourceProperties.length];

			for (int i = 0; i < properties.length; i++) {
				resourceProperties[i].setSystemResourceId(aSysResource.getId());
				resourceProperties[i].setPropertySort(Integer.valueOf(i + 1));
				properties[i] = resourceProperties[i]
						.convertToSysResourceProperty();
			}

			sysResourcePropertyDao.batchInsertSysResourceProperty(properties);

		}

		if (resource.getSort() != 0) {
			setSysResourceSortIndex(resource.getId(), resource.getSort());
		}

	}

	protected void doModifySysResource(SystemResource aSysResource)
			throws Exception {

		if (aSysResource == null) {
			return;
		}

		SysResource sysResource = aSysResource.convertToSysResource();

		if (sysResourceDao.checkIsUnique(sysResource) == false) {
			throw new Exception("Sys Resource[" + sysResource.getResourceName()
					+ "] is duplicate");
		}
		
		sysResource.setResourceTitleKey(getSysResourceTitleKey(aSysResource));

		sysResourceDao.updateSysResource(sysResource);

		SystemResourceProperty[] properties = aSysResource.getProperties();

		SysResourceProperty[] sysResourceProperties = null;

		if (ArrayUtils.isEmpty(properties)) {
			sysResourceProperties = new SysResourceProperty[0];
		} else {
			sysResourceProperties = new SysResourceProperty[properties.length];
			for (int i = 0; i < sysResourceProperties.length; i++) {
				sysResourceProperties[i] = properties[i]
						.convertToSysResourceProperty();

			}
		}

		SysResourcePropertyDAOQueryBean queryBean = new SysResourcePropertyDAOQueryBean();

		queryBean.createCriteria().andSysResourceIdEqualTo(
				Long.valueOf(aSysResource.getId()));

		sysResourcePropertyDao.synchronizeSysResourceProperty(
				sysResourceProperties, queryBean);

		if (aSysResource.getSort() != 0) {
			setSysResourceSortIndex(aSysResource.getId(), aSysResource
					.getSort());
		}

	}

	protected SystemResource[] doGetAllSysResources(long aDomainId,
			SysResourceTypeIdEnum aResourceType,
			ISysResourceQueryCallback aQueryCallback) throws Exception {

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		Criteria criteria = queryBean.createCriteria();

		criteria.andDomainIdEqualTo(Long.valueOf(aDomainId))
				.andResourceTypeIdEqualTo(
						Long.valueOf(aResourceType.getValue()));

		if (aQueryCallback != null) {
			aQueryCallback.buildQueryCriteria(criteria);
		}

		queryBean.setSortProperty(ISysResourceDAO.Sort);

		SysResource[] sysResources = sysResourceDao.querySysResource(queryBean);

		SysResourceProperty[] sysResourceProperties = sysResourceDao
				.querySysResourcePropertys(queryBean);

		SystemResource[] resources = new SystemResource[sysResources.length];

		for (int i = 0; i < sysResources.length; i++) {
			resources[i] = new SystemResource(sysResources[i]);
			List propertyList = new ArrayList();
			for (int j = 0; j < sysResourceProperties.length; j++) {
				if (sysResourceProperties[j].getSysResourceId().longValue() == resources[i]
						.getId()) {
					propertyList.add(new SystemResourceProperty(
							sysResourceProperties[j]));
				}

			}

			resources[i].setProperties((SystemResourceProperty[]) propertyList
					.toArray(new SystemResourceProperty[0]));

		}

		return resources;
	}

	protected SystemResource[] doGetSysResources(long aDomainId,
			long aParentId, SysResourceTypeIdEnum aResourceType,
			ISysResourceQueryCallback aQueryCallback) throws Exception {

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		Criteria criteria = queryBean.createCriteria();

		if (aDomainId > 0) {
			criteria.andDomainIdEqualTo(Long.valueOf(aDomainId));
		}

		criteria.andParentResourceIdEqualTo(Long.valueOf(aParentId))
				.andResourceTypeIdEqualTo(
						Long.valueOf(aResourceType.getValue()));

		queryBean.setSortProperty(ISysResourceDAO.DomainId);
		queryBean.setSortProperty(ISysResourceDAO.Sort);

		if (aQueryCallback != null) {
			aQueryCallback.buildQueryCriteria(criteria);
		}

		SysResource[] sysResources = sysResourceDao.querySysResource(queryBean);

		SysResourceProperty[] sysResourceProperties = sysResourceDao
				.querySysResourcePropertys(queryBean);

		SystemResource[] resources = new SystemResource[sysResources.length];

		for (int i = 0; i < resources.length; i++) {
			resources[i] = new SystemResource(sysResources[i]);
			List propertyList = new ArrayList();
			for (int j = 0; j < sysResourceProperties.length; j++) {
				if (sysResourceProperties[j].getSysResourceId().longValue() == resources[i]
						.getId()) {
					propertyList.add(new SystemResourceProperty(
							sysResourceProperties[j]));
				}

			}

			resources[i].setProperties((SystemResourceProperty[]) propertyList
					.toArray(new SystemResourceProperty[0]));
		}

		return resources;
	}

	protected void doSetSysResourceSortIndex(long aSysResourceId, int aSortIndex)
			throws Exception {
		if (aSortIndex < 0) {
			logger.warn("The Sort Index Must Gret Then 0");
			return;
		}

		SysResource sysResource = sysResourceDao
				.findSysResourceById(aSysResourceId);

		if (sysResource == null) {
			logger.warn("Can Not Found The System Resource[" + aSysResourceId
					+ "]");
			return;
		}

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		queryBean.createCriteria().andDomainIdEqualTo(
				Long.valueOf(sysResource.getDomainId()))
				.andParentResourceIdEqualTo(
						Long.valueOf(sysResource.getParentResourceId()))
				.andResourceTypeIdEqualTo(
						Long.valueOf(sysResource.getResourceTypeId()))
				.andIdNotEqualTo(Long.valueOf(sysResource.getId()));

		queryBean.setSortProperty(ISysResourceDAO.Sort);

		SysResource[] sysResources = sysResourceDao.querySysResource(queryBean);

		if (aSortIndex > sysResources.length + 1) {
			logger.warn("The Sort Index Must Less than " + sysResources.length
					+ 1);
			return;
		}

		sysResources = (SysResource[]) ArrayUtils.add(sysResources,
				aSortIndex - 1, sysResource);

		for (int i = 0; i < sysResources.length; i++) {
			sysResources[i].setSort(i + 1);
		}

		sysResourceDao.batchUpdateSysResource(sysResources);
	}

	protected void doDeleteSysResource(long aSysResourceId) throws Exception {

		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		queryBean.createCriteria().andParentResourceIdEqualTo(
				Long.valueOf(aSysResourceId));

		if (sysResourceDao.querySysResourceCount(queryBean) > 0) {
			throw new Exception("The Resource[" + aSysResourceId
					+ "] is depend by other resources");
		}

		SysResource sysResource = sysResourceDao
				.findSysResourceById(aSysResourceId);

		SysResourcePropertyDAOQueryBean propertyQueryBean = new SysResourcePropertyDAOQueryBean();

		propertyQueryBean.createCriteria().andSysResourceIdEqualTo(
				Long.valueOf(aSysResourceId));

		sysResourcePropertyDao.deleteSysResourceProperty(propertyQueryBean);

		sysResourceDao.deleteSysResource(aSysResourceId);

		SysResourceDAOQueryBean sortQueryBean = new SysResourceDAOQueryBean();

		sortQueryBean.createCriteria().andDomainIdEqualTo(
				Long.valueOf(sysResource.getDomainId()))
				.andParentResourceIdEqualTo(
						Long.valueOf(sysResource.getParentResourceId()));

		sortQueryBean.setSortProperty(ISysResourceDAO.Sort);

		SysResource[] sysResources = sysResourceDao
				.querySysResource(sortQueryBean);

		for (int i = 0; i < sysResources.length; i++) {
			sysResources[i].setSort(i + 1);
		}

		sysResourceDao.batchUpdateSysResource(sysResources);

		SysResourceTypeIdEnum typeIdEnum = (SysResourceTypeIdEnum) EnumUtils
				.getEnum(SysResourceTypeIdEnum.class, (int) sysResource
						.getResourceTypeId());

		sysMessageResourceService.deleteMessageResource(typeIdEnum.getDesc()
				+ "." + sysResource.getResourceCode());

	}

	protected int doGetSysResourcesCount(long aDomainId, long aParentId,
			SysResourceTypeIdEnum aResourceType,
			ISysResourceQueryCallback aQueryCallback) throws Exception {
		SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

		Criteria criteria = queryBean.createCriteria();

		if (aDomainId > 0) {
			criteria.andDomainIdEqualTo(Long.valueOf(aDomainId));
		}

		criteria.andParentResourceIdEqualTo(Long.valueOf(aParentId))
				.andResourceTypeIdEqualTo(
						Long.valueOf(aResourceType.getValue()));

		if (aQueryCallback != null) {
			aQueryCallback.buildQueryCriteria(criteria);
		}

		return sysResourceDao.querySysResourceCount(queryBean);

	}

	protected void doSetSysResourceTitleMessage(SystemResource aSystemResource,
			Locale aLocale) throws Exception {

		sysMessageResourceService.updateMessageResource(
				getSysResourceTitleKey(aSystemResource), aSystemResource
						.getName(), aLocale);

	}

	protected String getSysResourceTitleKey(SystemResource aSystemResource) {
		SysResource sysResource = aSystemResource.convertToSysResource();

		SysResourceTypeIdEnum typeIdEnum = (SysResourceTypeIdEnum) EnumUtils
				.getEnum(SysResourceTypeIdEnum.class, (int) sysResource
						.getResourceTypeId());

		StringBuffer messageKey = new StringBuffer();
		messageKey.append(typeIdEnum.getDesc());
		messageKey.append(".").append(sysResource.getResourceCode());

		return messageKey.toString();
	}

}
