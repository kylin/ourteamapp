/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 产品目录服务 Generated Date 2010-11-28 11:19:21
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
     * 取得产品目录
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
     * 取得产品目录
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
     * 创建产品目录
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    protected abstract void doCreateProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception;

    /**
     * 创建产品目录
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
     * 更新产品目录
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    protected abstract void doModifyProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception;

    /**
     * 更新产品目录
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
     * 删除产品目录
     *
     * @param aProductCatalogId
     *
     * @throws Exception
     */
    protected abstract void doDeleteProductCatalog(final long aProductCatalogId)
        throws Exception;

    /**
     * 删除产品目录
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
     * 根据ID取得产品目录
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
     * 根据ID取得产品目录
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
     * 取得产品目录是否可以删除
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
     * 取得产品目录是否可以删除
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
     * 取得产品目录排序
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
     * 取得产品目录排序
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
     * 取得所有产品目录
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductCatalogBean[] doGetAllProductCatalogs()
        throws Exception;

    /**
     * 取得所有产品目录
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
