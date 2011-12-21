package com.ourteam.modelbase.service;

import com.ourteam.modelbase.dao.BusinessPackage;
import com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessPackageDAO;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

/**
 * 业锟斤拷锟斤拷锟斤拷锟斤拷锟�impl Generated Date 2010-04-28 10:20:20
 * 
 * @author $Auto Gen
 */
public class BusinessPackageServiceImpl extends AbstractBusinessPackageService {

	/**
	 * 取锟斤拷业锟斤拷锟�impl
	 * 
	 * @param aBusinessDomainId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.modelbase.domain.BusinessPackageBean[] doGetBusinessPackages(
			final long aBusinessDomainId) throws Exception {

		BusinessPackageDAOQueryBean queryBean = new BusinessPackageDAOQueryBean();

		queryBean.createCriteria().andBusinessDomainIdEqualTo(
				Long.valueOf(aBusinessDomainId));

		queryBean.setSortProperty(IBusinessPackageDAO.Type);

		return BusinessPackageBean.toArray(businessPackageDao
				.queryBusinessPackage(queryBean));

	}

	@Override
	protected BusinessPackageBean[] doGetBusinessPackagesByType(long aDomainId,
			BusinessPackageTypeEnum aBusinessPackageType) throws Exception {

		BusinessPackageDAOQueryBean queryBean = new BusinessPackageDAOQueryBean();

		queryBean.createCriteria()
				.andBusinessDomainIdEqualTo(Long.valueOf(aDomainId))
				.andTypeEqualTo(aBusinessPackageType.getName());

		return BusinessPackageBean.toArray(businessPackageDao
				.queryBusinessPackage(queryBean));
	}

	@Override
	protected void doModifyBusinessPackage(BusinessPackageBean aBusinessPackage)
			throws Exception {

		businessPackageDao.updateBusinessPackage(aBusinessPackage
				.convertToBusinessPackage());

	}

	@Override
	protected void doAddNewBusinessPackage(
			BusinessPackageBean businessPackageBean) throws Exception {
		businessPackageDao.insertBusinessPackage(businessPackageBean
				.convertToBusinessPackage());

	}

	@Override
	protected void doDeleteBusinessPackage(long packageId) throws Exception {
		businessPackageDao.deleteBusinessPackage(packageId);

	}

	@Override
	protected int doQueryBusinessPackageCount(
			BusinessPackageDAOQueryBean queryBean) throws Exception {
		return businessPackageDao.queryBusinessPackageCount(queryBean);
	}

	@Override
	protected BusinessPackageBean[] doQueryBusinessPackages(
			BusinessPackageDAOQueryBean queryBean) throws Exception {
		return BusinessPackageBean.toArray(businessPackageDao
				.queryBusinessPackage(queryBean));
	}

	@Override
	protected BusinessPackageBean doGetBusinessPackageById(long packageId)
			throws Exception {

		BusinessPackage businessPackage = businessPackageDao
				.findBusinessPackageById(packageId);

		if (businessPackage == null) {
			return null;
		} else {
			return new BusinessPackageBean(businessPackage);
		}

	}

}
