/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.resource.service;

import java.util.Date;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;

import com.ourteam.calendar.domain.CalendarDefineBean;
import com.ourteam.resource.dao.IResourceBookingDAO;
import com.ourteam.resource.dao.IResourcePropertyDAO;
import com.ourteam.resource.dao.ResourceBookingDAOQueryBean;
import com.ourteam.resource.dao.ResourceInstance;
import com.ourteam.resource.dao.ResourceInstanceDAOQueryBean;
import com.ourteam.resource.dao.ResourceProperty;
import com.ourteam.resource.dao.ResourcePropertyDAOQueryBean;
import com.ourteam.resource.dao.ResourcePropertyInstance;
import com.ourteam.resource.dao.ResourcePropertyInstanceDAOQueryBean;
import com.ourteam.resource.dao.ResourceType;
import com.ourteam.resource.dao.ResourceTypeDAOQueryBean;
import com.ourteam.resource.domain.ResourceBookingBean;
import com.ourteam.resource.domain.ResourceInstanceBean;
import com.ourteam.resource.domain.ResourcePropertyBean;
import com.ourteam.resource.domain.ResourcePropertyInstanceBean;
import com.ourteam.resource.domain.ResourceTypeBean;

/**
 * ��Դ���� impl Generated Date 2011-08-31 10:32:31
 * 
 * @author $Auto Gen
 */
public class ResourceServiceImpl extends AbstractResourceService {

	@Override
	protected ResourceTypeBean[] doGetResourceTypes() throws Exception {
		ResourceTypeDAOQueryBean queryBean = new ResourceTypeDAOQueryBean();

		return ResourceTypeBean.toArray(resourceTypeDao
				.queryResourceType(queryBean));
	}

	@Override
	protected ResourceTypeBean doGetResourceTypeById(long resourceTypeId)
			throws Exception {

		ResourceType resourceType = resourceTypeDao
				.findResourceTypeById(resourceTypeId);

		return resourceType != null ? new ResourceTypeBean(resourceType) : null;
	}

	@Override
	protected void doModifyResourceType(ResourceTypeBean resourceType)
			throws Exception {

		ResourceType type = resourceType.convertToResourceType();

		resourceTypeDao.updateResourceType(type);

	}

	@Override
	protected ResourcePropertyBean[] doGetResourcePropertiesDefineByType(
			long resourceTypeId) throws Exception {

		ResourcePropertyDAOQueryBean queryBean = new ResourcePropertyDAOQueryBean();

		queryBean.createCriteria().andResourceTypeIdEqualTo(resourceTypeId);

		queryBean.setSortProperty(IResourcePropertyDAO.SortIndex);

		return ResourcePropertyBean.toArray(this.resourcePropertyDao
				.queryResourceProperty(queryBean));
	}

	@Override
	protected void doAddResourcePropertyDefine(long resourceTypeId,
			ResourcePropertyBean resourcePropertyBean) throws Exception {

		ResourceProperty resourceProperty = resourcePropertyBean
				.convertToResourceProperty();

		resourceProperty.setResourceTypeId(resourceTypeId);

		this.resourcePropertyDao.insertResourceProperty(resourceProperty);

	}

	@Override
	protected void doDeleteResourcePropertyDefines(long[] ids) throws Exception {

		if (ArrayUtils.isEmpty(ids)) {
			return;
		}

		ResourcePropertyDAOQueryBean queryBean = new ResourcePropertyDAOQueryBean();

		queryBean.createCriteria().andIdIn(ids);

		this.resourcePropertyDao.deleteResourceProperty(queryBean);
	}

	@Override
	protected void doModifyResourcePropertyDefine(
			ResourcePropertyBean resourcePropertyBean) throws Exception {

		this.resourcePropertyDao.updateResourceProperty(resourcePropertyBean
				.convertToResourceProperty());
	}

	@Override
	protected ResourceInstanceBean[] doGetResourceInstancesByTypeId(
			long resourceTypeId) throws Exception {

		ResourceInstanceDAOQueryBean queryBean = new ResourceInstanceDAOQueryBean();

		queryBean.createCriteria().andResourceTypeIdEqualTo(resourceTypeId);

		return ResourceInstanceBean.toArray(this.resourceInstanceDao
				.queryResourceInstance(queryBean));
	}

	@Override
	protected ResourceInstanceBean doGetResourceInstanceById(
			long resourceInstanceId) throws Exception {

		ResourceInstance resourceInstance = this.resourceInstanceDao
				.findResourceInstanceById(resourceInstanceId);

		return resourceInstance != null ? new ResourceInstanceBean(
				resourceInstance) : null;
	}

	@Override
	protected void doAddResourceInstance(
			ResourceInstanceBean resourceInstanceBean,
			ResourcePropertyInstanceBean[] propertyInstanceBeans)
			throws Exception {

		this.resourceInstanceDao.insertResourceInstance(resourceInstanceBean
				.convertToResourceInstance());

		ResourcePropertyInstance[] propertyInstances = new ResourcePropertyInstance[propertyInstanceBeans.length];

		for (int i = 0; i < propertyInstances.length; i++) {
			propertyInstances[i] = propertyInstanceBeans[i]
					.convertToResourcePropertyInstance();
			propertyInstances[i].setResourceInstanceId(resourceInstanceBean
					.getId());
			propertyInstances[i].setResourceTypeId(resourceInstanceBean
					.getResourceTypeId());
		}

		this.resourcePropertyInstanceDao
				.batchInsertResourcePropertyInstance(propertyInstances);

		CalendarDefineBean calendarDefineBean = new CalendarDefineBean();

		Integer rgb[] = new Integer[3];

		rgb[0] = Integer.valueOf(RandomUtils.nextInt(256));

		rgb[1] = Integer.valueOf(RandomUtils.nextInt(256));

		rgb[2] = Integer.valueOf(RandomUtils.nextInt(256));

		calendarDefineBean.setCalendarName(resourceInstanceBean.getName());

		calendarDefineBean.setCalendarStyle("rgb(" + StringUtils.join(rgb, ",")
				+ ")");

	}

	@Override
	protected void doModifyResourceInstance(
			ResourceInstanceBean resourceInstanceBean,
			ResourcePropertyInstanceBean[] propertyInstanceBeans)
			throws Exception {

		this.resourceInstanceDao.updateResourceInstance(resourceInstanceBean
				.convertToResourceInstance());

		ResourcePropertyInstance[] propertyInstances = new ResourcePropertyInstance[propertyInstanceBeans.length];

		for (int i = 0; i < propertyInstances.length; i++) {
			propertyInstances[i] = propertyInstanceBeans[i]
					.convertToResourcePropertyInstance();
			propertyInstances[i].setResourceInstanceId(resourceInstanceBean
					.getId());
			propertyInstances[i].setResourceTypeId(resourceInstanceBean
					.getResourceTypeId());
		}

		ResourcePropertyInstanceDAOQueryBean queryBean = new ResourcePropertyInstanceDAOQueryBean();

		queryBean.createCriteria().andResourceInstanceIdEqualTo(
				resourceInstanceBean.getId());

		this.resourcePropertyInstanceDao.synchronizeResourcePropertyInstance(
				propertyInstances, queryBean);
	}

	@Override
	protected void doDeleteResourceInstances(long[] resourceInstanceIds)
			throws Exception {

		ResourcePropertyInstanceDAOQueryBean propertyQueryBean = new ResourcePropertyInstanceDAOQueryBean();

		propertyQueryBean.createCriteria().andResourceInstanceIdIn(
				resourceInstanceIds);

		this.resourcePropertyInstanceDao
				.deleteResourcePropertyInstance(propertyQueryBean);

		ResourceInstanceDAOQueryBean queryBean = new ResourceInstanceDAOQueryBean();

		queryBean.createCriteria().andIdIn(resourceInstanceIds);

		this.resourceInstanceDao.deleteResourceInstance(queryBean);

	}

	@Override
	protected ResourcePropertyInstanceBean[] doGetResourcePropertyInstancesByResourceId(
			long resourceInstanceId) throws Exception {

		ResourcePropertyInstanceDAOQueryBean propertyQueryBean = new ResourcePropertyInstanceDAOQueryBean();

		propertyQueryBean.createCriteria().andResourceInstanceIdEqualTo(
				resourceInstanceId);

		return ResourcePropertyInstanceBean
				.toArray(this.resourcePropertyInstanceDao
						.queryResourcePropertyInstance(propertyQueryBean));

	}

	@Override
	protected void doAddResourceType(ResourceTypeBean resourceTypeBean)
			throws Exception {
		this.resourceTypeDao.insertResourceType(resourceTypeBean
				.convertToResourceType());
	}

	@Override
	protected void doDeleteResourceType(long[] resourceTypeIds)
			throws Exception {

		ResourcePropertyInstanceDAOQueryBean propertyInstanceQueryBean = new ResourcePropertyInstanceDAOQueryBean();

		propertyInstanceQueryBean.createCriteria().andResourceTypeIdIn(
				resourceTypeIds);

		this.resourcePropertyInstanceDao
				.deleteResourcePropertyInstance(propertyInstanceQueryBean);

		ResourceInstanceDAOQueryBean resourceInstanceQueryBean = new ResourceInstanceDAOQueryBean();

		resourceInstanceQueryBean.createCriteria().andResourceTypeIdIn(
				resourceTypeIds);

		this.resourceInstanceDao
				.deleteResourceInstance(resourceInstanceQueryBean);

		ResourcePropertyDAOQueryBean propertyQueryBean = new ResourcePropertyDAOQueryBean();

		propertyQueryBean.createCriteria().andResourceTypeIdIn(resourceTypeIds);

		this.resourcePropertyDao.deleteResourceProperty(propertyQueryBean);

		ResourceTypeDAOQueryBean queryBean = new ResourceTypeDAOQueryBean();

		queryBean.createCriteria().andIdIn(resourceTypeIds);

		this.resourceTypeDao.deleteResourceType(queryBean);

	}

	@Override
	protected ResourceBookingBean[] doGetResourceInstanceBookings(
			long resourceInstanceId, Date startTime, Date endTime)
			throws Exception {

		ResourceBookingDAOQueryBean queryBean = new ResourceBookingDAOQueryBean();

		queryBean.createCriteria()
				.andResourceInstanceIdEqualTo(resourceInstanceId)
				.andStartTimeGreaterThanOrEqualTo(startTime)
				.andEndTimeLessThanOrEqualTo(endTime);

		queryBean.setSortProperty(IResourceBookingDAO.StartTime);

		return ResourceBookingBean.toArray(this.resourceBookingDao
				.queryResourceBooking(queryBean));
	}

} // end ResourceServiceImpl
