package com.ourteam.product.service;

import java.util.Map;

import org.apache.commons.collections.MapUtils;

import com.ourteam.product.dao.IProductCatalogDAO;
import com.ourteam.product.dao.ProductCatalog;
import com.ourteam.product.dao.ProductCatalogDAOQueryBean;
import com.ourteam.product.dao.ProductDefineDAOQueryBean;
import com.ourteam.product.domain.ProductCatalogBean;

/**
 * ��ƷĿ¼���� impl Generated Date 2009-10-28 13:49:49
 * 
 * @author $Auto Gen
 */
public class ProductCatalogServiceImpl extends AbstractProductCatalogService {

	/**
	 * ȡ�ò�ƷĿ¼ impl
	 * 
	 * @param aParentId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.product.domain.ProductCatalogBean[] doGetProductCatalogs(
			final long aParentId) throws Exception {

		ProductCatalogDAOQueryBean queryBean = new ProductCatalogDAOQueryBean();

		queryBean.createCriteria().andParentIdEqualTo(Long.valueOf(aParentId));

		queryBean.setSortProperty(IProductCatalogDAO.SortIndex);

		ProductCatalog[] productCatalogs = productCatalogDao
				.queryProductCatalog(queryBean);

		return ProductCatalogBean.toArray(productCatalogs);

	}

	/**
	 * ������ƷĿ¼ impl
	 * 
	 * @param aProductCatalog
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doCreateProductCatalog(
			final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
			throws Exception {

		ProductCatalog productCatalog = aProductCatalog
				.convertToProductCatalog();

		if (productCatalogDao.checkIsUnique(productCatalog) == false) {
			throw new Exception("catalog '" + productCatalog.getCatalogName()
					+ "' already exist ");
		}

		productCatalogDao.insertProductCatalog(productCatalog);
	}

	/**
	 * ���²�ƷĿ¼ impl
	 * 
	 * @param aProductCatalog
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doModifyProductCatalog(
			final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
			throws Exception {

		ProductCatalog productCatalog = aProductCatalog
				.convertToProductCatalog();

		if (productCatalogDao.checkIsUnique(productCatalog) == false) {
			throw new Exception("catalog '" + productCatalog.getCatalogName()
					+ "' already exist ");
		}

		productCatalogDao.updateProductCatalog(productCatalog);
	}

	/**
	 * ɾ���ƷĿ¼ impl
	 * 
	 * @param aProductCatalogId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doDeleteProductCatalog(final long aProductCatalogId)
			throws Exception {

		if (canDeleteProductCatalog(aProductCatalogId)) {
			productCatalogDao.deleteProductCatalog(aProductCatalogId);
		} else {

			ProductCatalog productCatalog = productCatalogDao
					.findProductCatalogById(aProductCatalogId);

			throw new Exception("catalog '" + productCatalog.getCatalogName()
					+ "' is not empty,can not be deleted ");
		}

	}

	/**
	 * ���IDȡ�ò�ƷĿ¼ impl
	 * 
	 * @param aProductCatalogId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.product.domain.ProductCatalogBean doGetProductCatalogById(
			final long aProductCatalogId) throws Exception {

		ProductCatalog productCatalog = productCatalogDao
				.findProductCatalogById(aProductCatalogId);

		if (productCatalog != null) {
			return new ProductCatalogBean(productCatalog);
		} else {
			return null;
		}

	}

	@Override
	protected boolean doCanDeleteProductCatalog(long aProductCatalogId)
			throws Exception {
		ProductDefineDAOQueryBean queryBean = new ProductDefineDAOQueryBean();

		queryBean.createCriteria().andCatalogIdEqualTo(
				Long.valueOf(aProductCatalogId));

		int count = productDefineDao.queryProductDefineCount(queryBean);

		return count == 0;
	}

	@Override
	protected int doGetMaxProductCatalogSort(long aParentId) throws Exception {

		ProductCatalogDAOQueryBean queryBean = new ProductCatalogDAOQueryBean();

		queryBean.createCriteria().andParentIdEqualTo(Long.valueOf(aParentId));

		queryBean.addMaxFunctionProperty(IProductCatalogDAO.SortIndex,
				"MaxSort");

		Map[] results = productCatalogDao
				.queryProductCatalogSelective(queryBean);

		return MapUtils.getIntValue(results[0], "MaxSort");

	}

	@Override
	protected com.ourteam.product.domain.ProductCatalogBean[] doGetAllProductCatalogs()
			throws Exception {

		ProductCatalogDAOQueryBean queryBean = new ProductCatalogDAOQueryBean();

		queryBean.setSortProperty(IProductCatalogDAO.ParentId);

		queryBean.setSortProperty(IProductCatalogDAO.SortIndex);

		ProductCatalog[] productCatalogs = productCatalogDao
				.queryProductCatalog(queryBean);

		return ProductCatalogBean.toArray(productCatalogs);
	}

}
