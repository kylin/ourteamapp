package com.ourteam.product.service;

import com.ourteam.product.dao.IProductVersionDAO;
import com.ourteam.product.dao.ProductVersion;
import com.ourteam.product.dao.ProductVersionDAOQueryBean;
import com.ourteam.product.domain.ProductVersionBean;

/**
 * ��Ʒ�汾������� impl Generated Date 2009-11-03 15:54:28
 * 
 * @author $Auto Gen
 */
public class ProductVersionServiceImpl extends AbstractProductVersionService {

	/**
	 * ȡ�ò�Ʒ�汾�б� impl
	 * 
	 * @param aProductDefineId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.product.domain.ProductVersionBean[] doGetProductVersions(
			final long aProductDefineId, long parentVersionId) throws Exception {

		ProductVersionDAOQueryBean queryBean = new ProductVersionDAOQueryBean();

		queryBean.createCriteria().andProductDefineIdEqualTo(aProductDefineId)
				.andParentVersionIdEqualTo(parentVersionId);

		return ProductVersionBean.toArray(productVersionDao
				.queryProductVersion(queryBean));

	}

	/**
	 * ��Ӳ�Ʒ�汾 impl
	 * 
	 * @param aProductVersion
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doAddNewProductVersion(long productId, long parentVersionId,
			final com.ourteam.product.domain.ProductVersionBean aProductVersion)
			throws Exception {

		ProductVersion productVersion = aProductVersion
				.convertToProductVersion();

		aProductVersion.setProductDefineId(productId);

		aProductVersion.setParentVersionId(parentVersionId);

		if (productVersionDao.checkIsUnique(productVersion) == false) {
			throw new Exception("product version '"
					+ productVersion.getProductVersion() + "' already exist ");
		}

		productVersionDao.insertProductVersion(productVersion);

	}

	/**
	 * ȥ���Ʒ�汾��Ϣ impl
	 * 
	 * @param aProductVersionId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doRemoveProductVersion(final long aProductVersionId)
			throws Exception {

		productVersionDao.deleteProductVersion(aProductVersionId);

	}

	/**
	 * ����Ʒ�汾 impl
	 * 
	 * @param aProductVersion
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doModifyProductVersion(
			final com.ourteam.product.domain.ProductVersionBean aProductVersion)
			throws Exception {

		ProductVersion productVersion = aProductVersion
				.convertToProductVersion();

		if (productVersionDao.checkIsUnique(productVersion) == false) {
			throw new Exception("product version '"
					+ productVersion.getProductVersion() + "' already exist ");
		}

		productVersionDao.updateProductVersion(productVersion);
	}

	@Override
	protected ProductVersionBean doGetProductVersionById(long productVersionId)
			throws Exception {
		ProductVersion productVersion = productVersionDao
				.findProductVersionById(productVersionId);
		return productVersion != null ? new ProductVersionBean(productVersion)
				: null;
	}

	@Override
	protected ProductVersionBean[] doGetAllProductVersions(long productId)
			throws Exception {

		ProductVersionDAOQueryBean queryBean = new ProductVersionDAOQueryBean();

		queryBean.createCriteria().andProductDefineIdEqualTo(productId);

		queryBean.setSortProperty(IProductVersionDAO.ProductVersion);

		return ProductVersionBean.toArray(productVersionDao
				.queryProductVersion(queryBean));
	}

}
