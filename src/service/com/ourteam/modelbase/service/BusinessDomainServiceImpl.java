package com.ourteam.modelbase.service;

import org.apache.commons.lang.ArrayUtils;

import com.ourteam.modelbase.dao.BusinessDomain;
import com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean;
import com.ourteam.modelbase.dao.BusinessDomainGroupDAOQueryBean;
import com.ourteam.modelbase.dao.BusinessDomainGroupRelate;
import com.ourteam.modelbase.dao.BusinessDomainGroupRelateDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessDomainDAO;
import com.ourteam.modelbase.dao.IBusinessDomainGroupDAO;
import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessDomainGroupBean;

/**
 * ҵ���������� impl Generated Date 2010-04-27 11:18:44
 * 
 * @author $Auto Gen
 */
public class BusinessDomainServiceImpl extends AbstractBusinessDomainService {

	/**
	 * ȡ������ҵ���� impl
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.modelbase.domain.BusinessDomainBean[] doGetAllBusinessDomains()
			throws Exception {

		BusinessDomain[] domains = businessDomainDao.queryBusinessDomain(null);

		return BusinessDomainBean.toArray(domains);

	}

	@Override
	protected void doAddNewBusinessDomain(BusinessDomainBean aBusinessDomainBean)
			throws Exception {

		businessDomainDao.insertBusinessDomain(aBusinessDomainBean
				.convertToBusinessDomain());

	}

	@Override
	protected void doModifyBusinessDomain(BusinessDomainBean businessDomainBean)
			throws Exception {

		businessDomainDao.updateBusinessDomain(businessDomainBean
				.convertToBusinessDomain());

	}

	@Override
	protected void doDeleteBusinessDomain(long aBusinessDomainId)
			throws Exception {

		BusinessDomainGroupRelateDAOQueryBean relatedQueryBean = new BusinessDomainGroupRelateDAOQueryBean();

		relatedQueryBean.createCriteria().andDomainIdEqualTo(aBusinessDomainId);

		this.businessDomainGroupRelateDao
				.deleteBusinessDomainGroupRelate(relatedQueryBean);

		businessDomainDao.deleteBusinessDomain(aBusinessDomainId);

	}

	@Override
	protected BusinessDomainBean doGetBusinessDomainById(long businessDomainId)
			throws Exception {

		BusinessDomain businessDomain = businessDomainDao
				.findBusinessDomainById(businessDomainId);

		if (businessDomain == null) {
			return null;
		} else {
			return new BusinessDomainBean(businessDomain);
		}
	}

	@Override
	protected BusinessDomainBean[] doQueryBusinessDomain(
			BusinessDomainDAOQueryBean queryBean) throws Exception {

		BusinessDomain[] businessDomains = businessDomainDao
				.queryBusinessDomain(queryBean);

		return BusinessDomainBean.toArray(businessDomains);
	}

	@Override
	protected int doQueryBusinessDomainCount(
			BusinessDomainDAOQueryBean queryBean) throws Exception {

		return businessDomainDao.queryBusinessDomainCount(queryBean);
	}

	@Override
	protected BusinessDomainGroupBean[] doGetAllBusinessDomainGroups()
			throws Exception {

		BusinessDomainGroupDAOQueryBean queryBean = new BusinessDomainGroupDAOQueryBean();

		queryBean.setSortProperty(IBusinessDomainGroupDAO.GroupName);

		return BusinessDomainGroupBean.toArray(this.businessDomainGroupDao
				.queryBusinessDomainGroup(queryBean));
	}

	@Override
	protected BusinessDomainBean[] doGetBusinessDomainsByGroupId(
			long businessDomainGroupId) throws Exception {
		BusinessDomainGroupRelateDAOQueryBean queryBean = new BusinessDomainGroupRelateDAOQueryBean();

		queryBean.createCriteria().andGroupIdEqualTo(businessDomainGroupId);

		// queryBean.setSortProperty(IBusinessDomainDAO.Name);

		return BusinessDomainBean.toArray(this.businessDomainGroupRelateDao
				.queryBusinessDomains(queryBean));
	}

	@Override
	protected void doSetBusinessDomainGroupRelate(long businessDomainGroupId,
			long[] businessDomainIds) throws Exception {

		BusinessDomainGroupRelateDAOQueryBean queryBean = new BusinessDomainGroupRelateDAOQueryBean();

		queryBean.createCriteria().andGroupIdEqualTo(businessDomainGroupId);

		BusinessDomainGroupRelate[] businessDomainGroupRelates = new BusinessDomainGroupRelate[businessDomainIds.length];

		for (int i = 0; i < businessDomainIds.length; i++) {
			businessDomainGroupRelates[i] = new BusinessDomainGroupRelate();
			businessDomainGroupRelates[i].setDomainId(businessDomainIds[i]);
			businessDomainGroupRelates[i].setGroupId(businessDomainGroupId);
		}

		this.businessDomainGroupRelateDao.synchronizeBusinessDomainGroupRelate(
				businessDomainGroupRelates, queryBean);
	}

	@Override
	protected void doAddNewBusinessDomainGroup(
			BusinessDomainGroupBean businessDomainGroupBean,
			long[] businessDomainIds) throws Exception {

		this.businessDomainGroupDao
				.insertBusinessDomainGroup(businessDomainGroupBean
						.convertToBusinessDomainGroup());

		setBusinessDomainGroupRelate(businessDomainGroupBean.getId(),
				businessDomainIds);
	}

	@Override
	protected void doRemoveBusinessDomainGroup(long businessDomainGroupId)
			throws Exception {

		removeBusinessDomainGroups(new long[] { businessDomainGroupId });

	}

	@Override
	protected void doRemoveBusinessDomainGroups(long[] businessDomainGroupIds)
			throws Exception {

		if (ArrayUtils.isEmpty(businessDomainGroupIds)) {
			return;
		}

		BusinessDomainGroupRelateDAOQueryBean relatedQueryBean = new BusinessDomainGroupRelateDAOQueryBean();

		relatedQueryBean.createCriteria().andGroupIdIn(businessDomainGroupIds);

		this.businessDomainGroupRelateDao
				.deleteBusinessDomainGroupRelate(relatedQueryBean);

		BusinessDomainGroupDAOQueryBean queryBean = new BusinessDomainGroupDAOQueryBean();

		queryBean.createCriteria().andIdIn(businessDomainGroupIds);

		this.businessDomainGroupDao.deleteBusinessDomainGroup(queryBean);
	}

	@Override
	protected void doModifyBusinessDomainGroup(
			BusinessDomainGroupBean businessDomainGroupBean) throws Exception {
		this.businessDomainGroupDao
				.updateBusinessDomainGroup(businessDomainGroupBean
						.convertToBusinessDomainGroup());
	}

}
