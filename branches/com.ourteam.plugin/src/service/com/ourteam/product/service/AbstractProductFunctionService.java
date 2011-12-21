/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 产品功能服务 Generated Date 2011-03-19 09:21:02
 *
 * @author Auto Gen
 */
abstract class AbstractProductFunctionService extends net.service.DefaultServiceImpl
    implements IProductFunctionService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractProductFunctionService.class);

    /** ProductFunction DAO Instance */
    protected com.ourteam.product.dao.IProductFunctionDAO productFunctionDao;

    /** ProductFunctionVersionRelate DAO Instance */
    protected com.ourteam.product.dao.IProductFunctionVersionRelateDAO productFunctionVersionRelateDao;

    /**
     * Get ProductFunction DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductFunctionDAO getProductFunctionDao() {
        return productFunctionDao;
    } // end getProductFunctionDao()

    /**
     * Set ProductFunction DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductFunctionDao(
        com.ourteam.product.dao.IProductFunctionDAO aDao) {
        productFunctionDao = aDao;
    } // end setProductFunctionDao()

    /**
     * Get ProductFunctionVersionRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductFunctionVersionRelateDAO getProductFunctionVersionRelateDao() {
        return productFunctionVersionRelateDao;
    } // end getProductFunctionVersionRelateDao()

    /**
     * Set ProductFunctionVersionRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductFunctionVersionRelateDao(
        com.ourteam.product.dao.IProductFunctionVersionRelateDAO aDao) {
        productFunctionVersionRelateDao = aDao;
    } // end setProductFunctionVersionRelateDao()

    /**
     * 取得产品功能列表
     *
     * @param aProductDefineId
     * @param aParentFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductFunctionBean[] doGetProductFunctions(
        final long aProductDefineId, final long aParentFunctionId)
        throws Exception;

    /**
     * 取得产品功能列表
     *
     * @param aProductDefineId
     * @param aParentFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductFunctionBean[] getProductFunctions(
        final long aProductDefineId, final long aParentFunctionId)
        throws Exception {
        try {
            com.ourteam.product.domain.ProductFunctionBean[] result = doGetProductFunctions(aProductDefineId,
                    aParentFunctionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductFunctions error", e);
            throw e;
        } // end catch
    } // end getProductFunctions()

    /**
     * 添加产品功能
     *
     * @param aProductVersionId
     * @param aProductFunction
     *
     * @throws Exception
     */
    protected abstract void doAddNewProductFunction(
        final long aProductVersionId,
        final com.ourteam.product.domain.ProductFunctionBean aProductFunction)
        throws Exception;

    /**
     * 添加产品功能
     *
     * @param aProductVersionId
     * @param aProductFunction
     *
     * @throws Exception
     */
    public void addNewProductFunction(final long aProductVersionId,
        final com.ourteam.product.domain.ProductFunctionBean aProductFunction)
        throws Exception {
        try {
            if (aProductFunction == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aProductFunction] Value is NULL");
            } // end if

            doAddNewProductFunction(aProductVersionId, aProductFunction);
        } // end try
        catch (Exception e) {
            logger.error("do addNewProductFunction error", e);
            throw e;
        } // end catch
    } // end addNewProductFunction()

    /**
     * 变更产品功能
     *
     * @param aProductFunction
     *
     * @throws Exception
     */
    protected abstract void doModifyProductFunction(
        final com.ourteam.product.domain.ProductFunctionBean aProductFunction)
        throws Exception;

    /**
     * 变更产品功能
     *
     * @param aProductFunction
     *
     * @throws Exception
     */
    public void modifyProductFunction(
        final com.ourteam.product.domain.ProductFunctionBean aProductFunction)
        throws Exception {
        try {
            if (aProductFunction == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aProductFunction] Value is NULL");
            } // end if

            doModifyProductFunction(aProductFunction);
        } // end try
        catch (Exception e) {
            logger.error("do modifyProductFunction error", e);
            throw e;
        } // end catch
    } // end modifyProductFunction()

    /**
     * 删除产品功能
     *
     * @param aProductFunctionId
     *
     * @throws Exception
     */
    protected abstract void doDeleteProductFunction(
        final long aProductFunctionId) throws Exception;

    /**
     * 删除产品功能
     *
     * @param aProductFunctionId
     *
     * @throws Exception
     */
    public void deleteProductFunction(final long aProductFunctionId)
        throws Exception {
        try {
            doDeleteProductFunction(aProductFunctionId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteProductFunction error", e);
            throw e;
        } // end catch
    } // end deleteProductFunction()
} // end AbstractProductFunctionService
