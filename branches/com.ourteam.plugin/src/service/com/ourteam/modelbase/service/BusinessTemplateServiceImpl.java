/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.modelbase.service;

import com.ourteam.modelbase.dao.BusinessTemplate;
import com.ourteam.modelbase.dao.BusinessTemplateDAOQueryBean;
import com.ourteam.modelbase.dao.BusinessTemplateProviderType;
import com.ourteam.modelbase.dao.BusinessTemplateProviderTypeDAOQueryBean;
import com.ourteam.modelbase.dao.VelocityTemplate;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.domain.VelocityTemplateBean;

/**
 * ҵ��ģ����� impl Generated Date 2010-11-23 15:48:11
 * 
 * @author $Auto Gen
 */
public class BusinessTemplateServiceImpl extends
		AbstractBusinessTemplateService {

	@Override
	protected BusinessTemplateBean[] doGetBusinessTemplates(
			String businessObjectType, long providerType) throws Exception {

		BusinessTemplateDAOQueryBean queryBean = new BusinessTemplateDAOQueryBean();

		BusinessTemplateDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andBusinessObjectTypeEqualTo(businessObjectType);

		criteria.andProviderTypeIdEqualTo(providerType);

		return BusinessTemplateBean.toArray(this.businessTemplateDao
				.queryBusinessTemplate(queryBean));
	}

	@Override
	protected void doAddBusinessTemplate(BusinessTemplateBean businessTemplate)
			throws Exception {

		VelocityTemplate velocityTemplate = new VelocityTemplate();

		velocityTemplate.setTemplateName(businessTemplate.getName());

		velocityTemplate.setTemplateContent("");

		velocityTemplate.setDescription(businessTemplate.getDescription());

		this.velocityTemplateDao.insertVelocityTemplate(velocityTemplate);

		businessTemplate.setTemplateId(velocityTemplate.getId());

		this.businessTemplateDao.insertBusinessTemplate(businessTemplate
				.convertToBusinessTemplate());

	}

	@Override
	protected BusinessTemplateBean doGetBusinessTemplateById(
			long businessTemplateId) throws Exception {

		BusinessTemplate businessTemplate = this.businessTemplateDao
				.findBusinessTemplateById(businessTemplateId);

		return businessTemplate != null ? new BusinessTemplateBean(
				businessTemplate) : null;
	}

	@Override
	protected void doModifyBusinessTemplateInfo(
			BusinessTemplateBean businessTemplateBean) throws Exception {

		this.businessTemplateDao.updateBusinessTemplate(businessTemplateBean
				.convertToBusinessTemplate());
	}

	@Override
	protected VelocityTemplateBean doGetTemplateById(long templateId)
			throws Exception {

		VelocityTemplate velocityTemplate = this.velocityTemplateDao
				.findVelocityTemplateById(templateId);

		return velocityTemplate != null ? new VelocityTemplateBean(
				velocityTemplate) : null;
	}

	@Override
	protected void doModifyTemplate(VelocityTemplateBean velocityTemplateBean)
			throws Exception {

		this.velocityTemplateDao.updateVelocityTemplate(velocityTemplateBean
				.convertToVelocityTemplate());
	}

	@Override
	protected BusinessTemplateProviderTypeBean[] doGetBusinessTemplateProviderTypes(
			String businessObjectType) throws Exception {

		BusinessTemplateProviderTypeDAOQueryBean queryBean = new BusinessTemplateProviderTypeDAOQueryBean();

		queryBean.createCriteria().andBusinessObjectTypeEqualTo(
				businessObjectType);

		return BusinessTemplateProviderTypeBean
				.toArray(this.businessTemplateProviderTypeDao
						.queryBusinessTemplateProviderType(queryBean));
	}

	@Override
	protected BusinessTemplateProviderTypeBean doGetBusinessTemplateProviderTypeById(
			long providerId) throws Exception {
		BusinessTemplateProviderType providerType = this.businessTemplateProviderTypeDao
				.findBusinessTemplateProviderTypeById(providerId);
		return providerType == null ? null
				: new BusinessTemplateProviderTypeBean(providerType);
	}

	@Override
	protected void doAddBusinessTemplateProviderType(
			BusinessTemplateProviderTypeBean businessTemplateProviderType)
			throws Exception {

		businessTemplateProviderType = convertBusinessTemplateProviderType(businessTemplateProviderType);

		this.businessTemplateProviderTypeDao
				.insertBusinessTemplateProviderType(businessTemplateProviderType
						.convertToBusinessTemplateProviderType());

	}

	@Override
	protected void doModifyBusinessTemplateProviderType(
			BusinessTemplateProviderTypeBean businessTemplateProviderType)
			throws Exception {

		businessTemplateProviderType = convertBusinessTemplateProviderType(businessTemplateProviderType);

		this.businessTemplateProviderTypeDao
				.updateBusinessTemplateProviderType(businessTemplateProviderType
						.convertToBusinessTemplateProviderType());

	}

	protected BusinessTemplateProviderTypeBean convertBusinessTemplateProviderType(
			BusinessTemplateProviderTypeBean businessTemplateProviderType) {

		String businessObjectType = businessTemplateProviderType
				.getBusinessObjectType();

		if (BusinessPackageTypeEnum.BUSINESS_PACKAGE.getName().equals(
				businessObjectType)) {
			businessObjectType = BusinessObjectTypeEnum.DAO.getName();
		} else if (BusinessPackageTypeEnum.SERVICE_PACKAGE.getName().equals(
				businessObjectType)) {
			businessObjectType = BusinessObjectTypeEnum.SERVICE.getName();
		} else if (BusinessPackageTypeEnum.PERSISTENT_PACKAGE.getName().equals(
				businessObjectType)) {
			businessObjectType = BusinessObjectTypeEnum.PERSISTENT.getName();
		}

		businessTemplateProviderType.setBusinessObjectType(businessObjectType);

		return businessTemplateProviderType;

	}

} // end BusinessTemplateServiceImpl
