package com.ourteam.product.service;

import com.ourteam.product.dao.ProductDefine;
import com.ourteam.product.dao.ProductGlossary;
import com.ourteam.product.dao.ProductGlossaryChangLog;
import com.ourteam.product.dao.ProductGlossaryDAOQueryBean;
import com.ourteam.product.dao.ProductTeamRelate;
import com.ourteam.product.dao.ProductTeamRelateDAOQueryBean;
import com.ourteam.product.domain.ProductDefineBean;
import com.ourteam.product.domain.ProductGlossaryBean;
import com.ourteam.product.domain.ProductTeamRelateBean;

/**
 * ��Ʒ���� impl Generated Date 2009-10-28 15:27:14
 * 
 * @author $Auto Gen
 */
public class ProductServiceImpl extends AbstractProductService {

	/**
	 * ��ѯ��Ʒ impl
	 * 
	 * @param aProductDefineDAOQueryBean
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.product.domain.ProductDefineBean[] doQueryProductDefines(
			final com.ourteam.product.dao.ProductDefineDAOQueryBean aProductDefineDAOQueryBean)
			throws Exception {

		ProductDefine[] productDefines = productDefineDao
				.queryProductDefine(aProductDefineDAOQueryBean);

		return ProductDefineBean.toArray(productDefines);

	}

	/**
	 * ��ѯ��Ʒ�� impl
	 * 
	 * @param aProductDefineDAOQueryBean
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected int doQueryProductDefineCount(
			final com.ourteam.product.dao.ProductDefineDAOQueryBean aProductDefineDAOQueryBean)
			throws Exception {

		return productDefineDao
				.queryProductDefineCount(aProductDefineDAOQueryBean);

	}

	@Override
	protected void doCreateProductDefine(
			com.ourteam.product.domain.ProductDefineBean aProductDefine)
			throws Exception {

		ProductDefine productDefine = aProductDefine.convertToProductDefine();

		if (productDefineDao.checkIsUnique(productDefine) == false) {
			throw new Exception("product define '"
					+ productDefine.getProductName() + "' already exist ");
		}

		productDefineDao.insertProductDefine(productDefine);

	}

	@Override
	protected void doModifyProductDefine(
			com.ourteam.product.domain.ProductDefineBean aProductDefine)
			throws Exception {

		ProductDefine productDefine = aProductDefine.convertToProductDefine();

		if (productDefineDao.checkIsUnique(productDefine) == false) {
			throw new Exception("product define '"
					+ productDefine.getProductName() + "' already exist ");
		}

		productDefineDao.updateProductDefine(productDefine);
	}

	@Override
	protected void doDeleteProductDefine(long aProductDefineId)
			throws Exception {
		productDefineDao.deleteProductDefine(aProductDefineId);
	}

	@Override
	protected ProductDefineBean doGetProductDefineById(long productDefineId)
			throws Exception {
		ProductDefine productDefine = productDefineDao
				.findProductDefineById(productDefineId);
		return productDefine != null ? new ProductDefineBean(productDefine)
				: null;
	}

	@Override
	protected void doSetProductTeamRelates(long productId,
			ProductTeamRelateBean[] productTeamRelateBean) throws Exception {

		ProductTeamRelate[] productTeamRelates = new ProductTeamRelate[productTeamRelateBean.length];

		for (int i = 0; i < productTeamRelates.length; i++) {
			productTeamRelates[i] = productTeamRelateBean[i]
					.convertToProductTeamRelate();
			productTeamRelates[i].setProductId(productId);

		}

		ProductTeamRelateDAOQueryBean queryBean = new ProductTeamRelateDAOQueryBean();

		queryBean.createCriteria().andProductIdEqualTo(productId);

		productTeamRelateDao.synchronizeProductTeamRelate(productTeamRelates,
				queryBean);

	}

	@Override
	protected ProductTeamRelateBean[] doGetProductTeamRelates(long productId)
			throws Exception {
		ProductTeamRelateDAOQueryBean queryBean = new ProductTeamRelateDAOQueryBean();

		queryBean.createCriteria().andProductIdEqualTo(productId);

		return ProductTeamRelateBean.toArray(productTeamRelateDao
				.queryProductTeamRelate(queryBean));
	}

	@Override
	protected ProductTeamRelateBean doGetProductTeamRelateById(
			long productTeamRelateId) throws Exception {

		ProductTeamRelate productTeamRelate = productTeamRelateDao
				.findProductTeamRelateById(productTeamRelateId);

		return productTeamRelate != null ? new ProductTeamRelateBean(
				productTeamRelate) : null;
	}

	@Override
	protected ProductGlossaryBean[] doGetProductGlossaries(long productId)
			throws Exception {

		ProductGlossaryDAOQueryBean queryBean = new ProductGlossaryDAOQueryBean();

		queryBean.createCriteria().andProductIdEqualTo(productId);

		return ProductGlossaryBean.toArray(productGlossaryDao
				.queryProductGlossary(queryBean));
	}

	@Override
	protected ProductGlossaryBean doGetProductGlossaryById(
			long productGlossaryId) throws Exception {

		ProductGlossary productGlossary = productGlossaryDao
				.findProductGlossaryById(productGlossaryId);

		return productGlossary != null ? new ProductGlossaryBean(
				productGlossary) : null;
	}

	@Override
	protected void doAddProductGlossary(long productId,
			ProductGlossaryBean productGlossary) throws Exception {

		productGlossary.setProductId(productId);

		productGlossaryDao.insertProductGlossary(productGlossary
				.convertToProductGlossary());

		ProductGlossaryChangLog changLog = new ProductGlossaryChangLog();

		changLog.setBeforChangeContent("");

		changLog.setAfterChangeContent(productGlossary.getContent());

		changLog.setProductGlossaryId(productGlossary.getId());

		changLog.setEditDate(productGlossary.getLastEditDate());

		changLog.setEditorId(productGlossary.getCreatorId());

		productGlossaryChangLogDao.insertProductGlossaryChangLog(changLog);
	}

	@Override
	protected void doModifyProductGlossary(long productId,
			ProductGlossaryBean productGlossary) throws Exception {

		ProductGlossary oldProductGlossary = productGlossaryDao
				.findProductGlossaryById(productGlossary.getId());

		productGlossary.setProductId(productId);

		productGlossaryDao.updateProductGlossary(productGlossary
				.convertToProductGlossary());

		ProductGlossaryChangLog changLog = new ProductGlossaryChangLog();

		changLog.setBeforChangeContent(oldProductGlossary.getContent());

		changLog.setAfterChangeContent(productGlossary.getContent());

		changLog.setProductGlossaryId(productGlossary.getId());

		changLog.setEditDate(productGlossary.getLastEditDate());

		changLog.setEditorId(productGlossary.getLastEditorId());

		productGlossaryChangLogDao.insertProductGlossaryChangLog(changLog);

	}

	@Override
	protected void doDeleteProductGlossaries(long[] productGlossaryIds)
			throws Exception {

		ProductGlossaryDAOQueryBean queryBean = new ProductGlossaryDAOQueryBean();

		queryBean.createCriteria().andIdIn(productGlossaryIds);

		productGlossaryDao.deleteProductGlossary(queryBean);

	}

}
