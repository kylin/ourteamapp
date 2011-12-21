/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ��ƷĿ¼���� Generated Date 2010-11-28 11:19:21
 *
 * @author Auto Gen
 */
abstract class AbstractProductCatalogService extends net.service.DefaultServiceImpl
    implements IProductCatalogService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractProductCatalogService.class);

    /** ProductCatalog DAO Instance */
    protected com.ourteam.product.dao.IProductCatalogDAO productCatalogDao;

    /** ProductDefine DAO Instance */
    protected com.ourteam.product.dao.IProductDefineDAO productDefineDao;

    /**
     * Get ProductCatalog DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductCatalogDAO getProductCatalogDao() {
        return productCatalogDao;
    } // end getProductCatalogDao()

    /**
     * Set ProductCatalog DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductCatalogDao(
        com.ourteam.product.dao.IProductCatalogDAO aDao) {
        productCatalogDao = aDao;
    } // end setProductCatalogDao()

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
     * ȡ�ò�ƷĿ¼
     *
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductCatalogBean[] doGetProductCatalogs(
        final long aParentId) throws Exception;

    /**
     * ȡ�ò�ƷĿ¼
     *
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductCatalogBean[] getProductCatalogs(
        final long aParentId) throws Exception {
        try {
            com.ourteam.product.domain.ProductCatalogBean[] result = doGetProductCatalogs(aParentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductCatalogs error", e);
            throw e;
        } // end catch
    } // end getProductCatalogs()

    /**
     * ������ƷĿ¼
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    protected abstract void doCreateProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception;

    /**
     * ������ƷĿ¼
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    public void createProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception {
        try {
            if (aProductCatalog == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aProductCatalog] Value is NULL");
            } // end if

            doCreateProductCatalog(aProductCatalog);
        } // end try
        catch (Exception e) {
            logger.error("do createProductCatalog error", e);
            throw e;
        } // end catch
    } // end createProductCatalog()

    /**
     * ���²�ƷĿ¼
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    protected abstract void doModifyProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception;

    /**
     * ���²�ƷĿ¼
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    public void modifyProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception {
        try {
            doModifyProductCatalog(aProductCatalog);
        } // end try
        catch (Exception e) {
            logger.error("do modifyProductCatalog error", e);
            throw e;
        } // end catch
    } // end modifyProductCatalog()

    /**
     * ɾ����ƷĿ¼
     *
     * @param aProductCatalogId
     *
     * @throws Exception
     */
    protected abstract void doDeleteProductCatalog(final long aProductCatalogId)
        throws Exception;

    /**
     * ɾ����ƷĿ¼
     *
     * @param aProductCatalogId
     *
     * @throws Exception
     */
    public void deleteProductCatalog(final long aProductCatalogId)
        throws Exception {
        try {
            doDeleteProductCatalog(aProductCatalogId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteProductCatalog error", e);
            throw e;
        } // end catch
    } // end deleteProductCatalog()

    /**
     * ����IDȡ�ò�ƷĿ¼
     *
     * @param aProductCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductCatalogBean doGetProductCatalogById(
        final long aProductCatalogId) throws Exception;

    /**
     * ����IDȡ�ò�ƷĿ¼
     *
     * @param aProductCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductCatalogBean getProductCatalogById(
        final long aProductCatalogId) throws Exception {
        try {
            com.ourteam.product.domain.ProductCatalogBean result = doGetProductCatalogById(aProductCatalogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductCatalogById error", e);
            throw e;
        } // end catch
    } // end getProductCatalogById()

    /**
     * ȡ�ò�ƷĿ¼�Ƿ����ɾ��
     *
     * @param aProductCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract boolean doCanDeleteProductCatalog(
        final long aProductCatalogId) throws Exception;

    /**
     * ȡ�ò�ƷĿ¼�Ƿ����ɾ��
     *
     * @param aProductCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean canDeleteProductCatalog(final long aProductCatalogId)
        throws Exception {
        try {
            boolean result = doCanDeleteProductCatalog(aProductCatalogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do canDeleteProductCatalog error", e);
            throw e;
        } // end catch
    } // end canDeleteProductCatalog()

    /**
     * ȡ�ò�ƷĿ¼����
     *
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetMaxProductCatalogSort(final long aParentId)
        throws Exception;

    /**
     * ȡ�ò�ƷĿ¼����
     *
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getMaxProductCatalogSort(final long aParentId)
        throws Exception {
        try {
            int result = doGetMaxProductCatalogSort(aParentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getMaxProductCatalogSort error", e);
            throw e;
        } // end catch
    } // end getMaxProductCatalogSort()

    /**
     * ȡ�����в�ƷĿ¼
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductCatalogBean[] doGetAllProductCatalogs()
        throws Exception;

    /**
     * ȡ�����в�ƷĿ¼
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductCatalogBean[] getAllProductCatalogs()
        throws Exception {
        try {
            com.ourteam.product.domain.ProductCatalogBean[] result = doGetAllProductCatalogs();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getAllProductCatalogs error", e);
            throw e;
        } // end catch
    } // end getAllProductCatalogs()
} // end AbstractProductCatalogService
