package com.ourteam.product.service;

import com.ourteam.product.dao.ProductFunctionDAOQueryBean;
import com.ourteam.product.dao.ProductFunctionVersionRelate;
import com.ourteam.product.dao.ProductFunctionVersionRelateDAOQueryBean;
import com.ourteam.product.domain.ProductFunctionBean;

/**
 * ��Ʒ���ܷ��� impl Generated Date 2009-11-05 13:56:09
 * 
 * @author $Auto Gen
 */
public class ProductFunctionServiceImpl extends AbstractProductFunctionService {

	/**
	 * ȡ�ò�Ʒ�����б� impl
	 * 
	 * @param aProductDefineId
	 * 
	 * @param aProductVersionId
	 * 
	 * @param aParentFunctionId
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.product.domain.ProductFunctionBean[] doGetProductFunctions(
			final long aProductDefineId, final long aParentFunctionId)
			throws Exception {

		ProductFunctionDAOQueryBean functionDAOQueryBean = new ProductFunctionDAOQueryBean();

		functionDAOQueryBean.createCriteria()
				.andParentFunctionIdEqualTo(Long.valueOf(aParentFunctionId))
				.andProductDefineIdEqualTo(aProductDefineId);

		com.ourteam.product.dao.ProductFunction[] productFunctions = productFunctionDao
				.queryProductFunction(functionDAOQueryBean);

		return ProductFunctionBean.toArray(productFunctions);

	}

	@Override
	protected void doAddNewProductFunction(long aProductVersionId,
			ProductFunctionBean aProductFunction) throws Exception {

		com.ourteam.product.dao.ProductFunction productFunction = aProductFunction
				.convertToProductFunction();

		if (productFunctionDao.checkIsUnique(productFunction) == false) {
			throw new Exception("product function '"
					+ productFunction.getFunctionName() + "' already exist ");
		}

		productFunctionDao.insertProductFunction(productFunction);

		ProductFunctionVersionRelate functionVersionRelate = new ProductFunctionVersionRelate();

		functionVersionRelate.setProductFunctionId(productFunction.getId());

		functionVersionRelate.setProductVersionId(aProductVersionId);

		productFunctionVersionRelateDao
				.insertProductFunctionVersionRelate(functionVersionRelate);

	}

	@Override
	protected void doDeleteProductFunction(long aProductFunctionId)
			throws Exception {

		productFunctionDao.deleteProductFunction(aProductFunctionId);

		ProductFunctionVersionRelateDAOQueryBean queryBean = new ProductFunctionVersionRelateDAOQueryBean();

		queryBean.createCriteria().andProductFunctionIdEqualTo(
				Long.valueOf(aProductFunctionId));

		productFunctionVersionRelateDao.deleteProductFunction(queryBean);
	}

	@Override
	protected void doModifyProductFunction(ProductFunctionBean aProductFunction)
			throws Exception {

		com.ourteam.product.dao.ProductFunction productFunction = aProductFunction
				.convertToProductFunction();

		if (productFunctionDao.checkIsUnique(productFunction) == false) {
			throw new Exception("product function '"
					+ productFunction.getFunctionName() + "' already exist ");
		}

		productFunctionDao.updateProductFunction(productFunction);

	}

}
