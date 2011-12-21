/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ��Ʒ���� Generated Date 2011-10-12 11:44:50
 *
 * @author Auto Gen
 */
abstract class AbstractProductService extends net.service.DefaultServiceImpl
    implements IProductService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractProductService.class);

    /** ProductDefine DAO Instance */
    protected com.ourteam.product.dao.IProductDefineDAO productDefineDao;

    /** ProductTeamRelate DAO Instance */
    protected com.ourteam.product.dao.IProductTeamRelateDAO productTeamRelateDao;

    /** ProductGlossary DAO Instance */
    protected com.ourteam.product.dao.IProductGlossaryDAO productGlossaryDao;

    /** ProductGlossaryChangLog DAO Instance */
    protected com.ourteam.product.dao.IProductGlossaryChangLogDAO productGlossaryChangLogDao;

    /**
     * Get ProductDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductDefineDAO getProductDefineDao() {
        return productDefineDao;
    } // end getProductDefineDao()

    /**
     * Set ProductDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductDefineDao(
        com.ourteam.product.dao.IProductDefineDAO aDao) {
        productDefineDao = aDao;
    } // end setProductDefineDao()

    /**
     * Get ProductTeamRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductTeamRelateDAO getProductTeamRelateDao() {
        return productTeamRelateDao;
    } // end getProductTeamRelateDao()

    /**
     * Set ProductTeamRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductTeamRelateDao(
        com.ourteam.product.dao.IProductTeamRelateDAO aDao) {
        productTeamRelateDao = aDao;
    } // end setProductTeamRelateDao()

    /**
     * Get ProductGlossary DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductGlossaryDAO getProductGlossaryDao() {
        return productGlossaryDao;
    } // end getProductGlossaryDao()

    /**
     * Set ProductGlossary DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductGlossaryDao(
        com.ourteam.product.dao.IProductGlossaryDAO aDao) {
        productGlossaryDao = aDao;
    } // end setProductGlossaryDao()

    /**
     * Get ProductGlossaryChangLog DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductGlossaryChangLogDAO getProductGlossaryChangLogDao() {
        return productGlossaryChangLogDao;
    } // end getProductGlossaryChangLogDao()

    /**
     * Set ProductGlossaryChangLog DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductGlossaryChangLogDao(
        com.ourteam.product.dao.IProductGlossaryChangLogDAO aDao) {
        productGlossaryChangLogDao = aDao;
    } // end setProductGlossaryChangLogDao()

    /**
     * ��ѯ��Ʒ
     *
     * @param aProductDefineDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductDefineBean[] doQueryProductDefines(
        final com.ourteam.product.dao.ProductDefineDAOQueryBean aProductDefineDAOQueryBean)
        throws Exception;

    /**
     * ��ѯ��Ʒ
     *
     * @param aProductDefineDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductDefineBean[] queryProductDefines(
        final com.ourteam.product.dao.ProductDefineDAOQueryBean aProductDefineDAOQueryBean)
        throws Exception {
        try {
            com.ourteam.product.domain.ProductDefineBean[] result = doQueryProductDefines(aProductDefineDAOQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryProductDefines error", e);
            throw e;
        } // end catch
    } // end queryProductDefines()

    /**
     * ��ѯ��Ʒ��
     *
     * @param aProductDefineDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryProductDefineCount(
        final com.ourteam.product.dao.ProductDefineDAOQueryBean aProductDefineDAOQueryBean)
        throws Exception;

    /**
     * ��ѯ��Ʒ��
     *
     * @param aProductDefineDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryProductDefineCount(
        final com.ourteam.product.dao.ProductDefineDAOQueryBean aProductDefineDAOQueryBean)
        throws Exception {
        try {
            int result = doQueryProductDefineCount(aProductDefineDAOQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryProductDefineCount error", e);
            throw e;
        } // end catch
    } // end queryProductDefineCount()

    /**
     * �½���Ʒ����
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    protected abstract void doCreateProductDefine(
        final com.ourteam.product.domain.ProductDefineBean aProductDefine)
        throws Exception;

    /**
     * �½���Ʒ����
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    public void createProductDefine(
        final com.ourteam.product.domain.ProductDefineBean aProductDefine)
        throws Exception {
        try {
            if (aProductDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aProductDefine] Value is NULL");
            } // end if

            doCreateProductDefine(aProductDefine);
        } // end try
        catch (Exception e) {
            logger.error("do createProductDefine error", e);
            throw e;
        } // end catch
    } // end createProductDefine()

    /**
     * ���²�Ʒ����
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    protected abstract void doModifyProductDefine(
        final com.ourteam.product.domain.ProductDefineBean aProductDefine)
        throws Exception;

    /**
     * ���²�Ʒ����
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    public void modifyProductDefine(
        final com.ourteam.product.domain.ProductDefineBean aProductDefine)
        throws Exception {
        try {
            if (aProductDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aProductDefine] Value is NULL");
            } // end if

            doModifyProductDefine(aProductDefine);
        } // end try
        catch (Exception e) {
            logger.error("do modifyProductDefine error", e);
            throw e;
        } // end catch
    } // end modifyProductDefine()

    /**
     * ɾ����Ʒ����
     *
     * @param aProductDefineId
     *
     * @throws Exception
     */
    protected abstract void doDeleteProductDefine(final long aProductDefineId)
        throws Exception;

    /**
     * ɾ����Ʒ����
     *
     * @param aProductDefineId
     *
     * @throws Exception
     */
    public void deleteProductDefine(final long aProductDefineId)
        throws Exception {
        try {
            doDeleteProductDefine(aProductDefineId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteProductDefine error", e);
            throw e;
        } // end catch
    } // end deleteProductDefine()

    /**
     * ����IDȡ�ò�Ʒ����
     *
     * @param productDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductDefineBean doGetProductDefineById(
        final long productDefineId) throws Exception;

    /**
     * ����IDȡ�ò�Ʒ����
     *
     * @param productDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductDefineBean getProductDefineById(
        final long productDefineId) throws Exception {
        try {
            com.ourteam.product.domain.ProductDefineBean result = doGetProductDefineById(productDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductDefineById error", e);
            throw e;
        } // end catch
    } // end getProductDefineById()

    /**
     * ���ò�Ʒ�Ŷӹ���
     *
     * @param productId
     * @param productTeamRelates
     *
     * @throws Exception
     */
    protected abstract void doSetProductTeamRelates(final long productId,
        final com.ourteam.product.domain.ProductTeamRelateBean[] productTeamRelates)
        throws Exception;

    /**
     * ���ò�Ʒ�Ŷӹ���
     *
     * @param productId
     * @param productTeamRelates
     *
     * @throws Exception
     */
    public void setProductTeamRelates(final long productId,
        final com.ourteam.product.domain.ProductTeamRelateBean[] productTeamRelates)
        throws Exception {
        try {
            doSetProductTeamRelates(productId, productTeamRelates);
        } // end try
        catch (Exception e) {
            logger.error("do setProductTeamRelates error", e);
            throw e;
        } // end catch
    } // end setProductTeamRelates()

    /**
     * ȡ�ò�Ʒ�Ŷӹ�ϵ
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductTeamRelateBean[] doGetProductTeamRelates(
        final long productId) throws Exception;

    /**
     * ȡ�ò�Ʒ�Ŷӹ�ϵ
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductTeamRelateBean[] getProductTeamRelates(
        final long productId) throws Exception {
        try {
            com.ourteam.product.domain.ProductTeamRelateBean[] result = doGetProductTeamRelates(productId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductTeamRelates error", e);
            throw e;
        } // end catch
    } // end getProductTeamRelates()

    /**
     * ����IDȡ�ò�Ʒ�Ŷӹ�ϵ
     *
     * @param productTeamRelateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductTeamRelateBean doGetProductTeamRelateById(
        final long productTeamRelateId) throws Exception;

    /**
     * ����IDȡ�ò�Ʒ�Ŷӹ�ϵ
     *
     * @param productTeamRelateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductTeamRelateBean getProductTeamRelateById(
        final long productTeamRelateId) throws Exception {
        try {
            com.ourteam.product.domain.ProductTeamRelateBean result = doGetProductTeamRelateById(productTeamRelateId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductTeamRelateById error", e);
            throw e;
        } // end catch
    } // end getProductTeamRelateById()

    /**
     * ȡ�ò�Ʒ�ʻ��
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductGlossaryBean[] doGetProductGlossaries(
        final long productId) throws Exception;

    /**
     * ȡ�ò�Ʒ�ʻ��
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductGlossaryBean[] getProductGlossaries(
        final long productId) throws Exception {
        try {
            com.ourteam.product.domain.ProductGlossaryBean[] result = doGetProductGlossaries(productId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductGlossaries error", e);
            throw e;
        } // end catch
    } // end getProductGlossaries()

    /**
     * ����IDȡ�ò�Ʒ�ʻ�
     *
     * @param productGlossaryId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductGlossaryBean doGetProductGlossaryById(
        final long productGlossaryId) throws Exception;

    /**
     * ����IDȡ�ò�Ʒ�ʻ�
     *
     * @param productGlossaryId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductGlossaryBean getProductGlossaryById(
        final long productGlossaryId) throws Exception {
        try {
            com.ourteam.product.domain.ProductGlossaryBean result = doGetProductGlossaryById(productGlossaryId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductGlossaryById error", e);
            throw e;
        } // end catch
    } // end getProductGlossaryById()

    /**
     * ��Ӳ�Ʒ�ʻ�
     *
     * @param productId
     * @param productGlossary
     *
     * @throws Exception
     */
    protected abstract void doAddProductGlossary(final long productId,
        final com.ourteam.product.domain.ProductGlossaryBean productGlossary)
        throws Exception;

    /**
     * ��Ӳ�Ʒ�ʻ�
     *
     * @param productId
     * @param productGlossary
     *
     * @throws Exception
     */
    public void addProductGlossary(final long productId,
        final com.ourteam.product.domain.ProductGlossaryBean productGlossary)
        throws Exception {
        try {
            if (productGlossary == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [productGlossary] Value is NULL");
            } // end if

            doAddProductGlossary(productId, productGlossary);
        } // end try
        catch (Exception e) {
            logger.error("do addProductGlossary error", e);
            throw e;
        } // end catch
    } // end addProductGlossary()

    /**
     * ���²�Ʒ�ʻ�
     *
     * @param productId
     * @param productGlossary
     *
     * @throws Exception
     */
    protected abstract void doModifyProductGlossary(final long productId,
        final com.ourteam.product.domain.ProductGlossaryBean productGlossary)
        throws Exception;

    /**
     * ���²�Ʒ�ʻ�
     *
     * @param productId
     * @param productGlossary
     *
     * @throws Exception
     */
    public void modifyProductGlossary(final long productId,
        final com.ourteam.product.domain.ProductGlossaryBean productGlossary)
        throws Exception {
        try {
            if (productGlossary == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [productGlossary] Value is NULL");
            } // end if

            doModifyProductGlossary(productId, productGlossary);
        } // end try
        catch (Exception e) {
            logger.error("do modifyProductGlossary error", e);
            throw e;
        } // end catch
    } // end modifyProductGlossary()

    /**
     * ɾ����Ʒ�ʻ�
     *
     * @param productGlossaryIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteProductGlossaries(
        final long[] productGlossaryIds) throws Exception;

    /**
     * ɾ����Ʒ�ʻ�
     *
     * @param productGlossaryIds
     *
     * @throws Exception
     */
    public void deleteProductGlossaries(final long[] productGlossaryIds)
        throws Exception {
        try {
            doDeleteProductGlossaries(productGlossaryIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteProductGlossaries error", e);
            throw e;
        } // end catch
    } // end deleteProductGlossaries()
} // end AbstractProductService
