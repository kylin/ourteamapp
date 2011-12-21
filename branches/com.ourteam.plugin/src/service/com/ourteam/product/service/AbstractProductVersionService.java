/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ��Ʒ�汾������� Generated Date 2011-10-12 16:34:16
 *
 * @author Auto Gen
 */
abstract class AbstractProductVersionService extends net.service.DefaultServiceImpl
    implements IProductVersionService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractProductVersionService.class);

    /** ProductDefine DAO Instance */
    protected com.ourteam.product.dao.IProductDefineDAO productDefineDao;

    /** ProductVersion DAO Instance */
    protected com.ourteam.product.dao.IProductVersionDAO productVersionDao;

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
     * Get ProductVersion DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.dao.IProductVersionDAO getProductVersionDao() {
        return productVersionDao;
    } // end getProductVersionDao()

    /**
     * Set ProductVersion DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setProductVersionDao(
        com.ourteam.product.dao.IProductVersionDAO aDao) {
        productVersionDao = aDao;
    } // end setProductVersionDao()

    /**
     * ȡ�ò�Ʒ�汾�б�
     *
     * @param aProductDefineId
     * @param parentVersionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductVersionBean[] doGetProductVersions(
        final long aProductDefineId, final long parentVersionId)
        throws Exception;

    /**
     * ȡ�ò�Ʒ�汾�б�
     *
     * @param aProductDefineId
     * @param parentVersionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductVersionBean[] getProductVersions(
        final long aProductDefineId, final long parentVersionId)
        throws Exception {
        try {
            com.ourteam.product.domain.ProductVersionBean[] result = doGetProductVersions(aProductDefineId,
                    parentVersionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductVersions error", e);
            throw e;
        } // end catch
    } // end getProductVersions()

    /**
     * ��Ӳ�Ʒ�汾
     *
     * @param productId
     * @param parentVersionId
     * @param aProductVersion
     *
     * @throws Exception
     */
    protected abstract void doAddNewProductVersion(final long productId,
        final long parentVersionId,
        final com.ourteam.product.domain.ProductVersionBean aProductVersion)
        throws Exception;

    /**
     * ��Ӳ�Ʒ�汾
     *
     * @param productId
     * @param parentVersionId
     * @param aProductVersion
     *
     * @throws Exception
     */
    public void addNewProductVersion(final long productId,
        final long parentVersionId,
        final com.ourteam.product.domain.ProductVersionBean aProductVersion)
        throws Exception {
        try {
            if (aProductVersion == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aProductVersion] Value is NULL");
            } // end if

            doAddNewProductVersion(productId, parentVersionId, aProductVersion);
        } // end try
        catch (Exception e) {
            logger.error("do addNewProductVersion error", e);
            throw e;
        } // end catch
    } // end addNewProductVersion()

    /**
     * ȥ����Ʒ�汾��Ϣ
     *
     * @param aProductVersionId
     *
     * @throws Exception
     */
    protected abstract void doRemoveProductVersion(final long aProductVersionId)
        throws Exception;

    /**
     * ȥ����Ʒ�汾��Ϣ
     *
     * @param aProductVersionId
     *
     * @throws Exception
     */
    public void removeProductVersion(final long aProductVersionId)
        throws Exception {
        try {
            doRemoveProductVersion(aProductVersionId);
        } // end try
        catch (Exception e) {
            logger.error("do removeProductVersion error", e);
            throw e;
        } // end catch
    } // end removeProductVersion()

    /**
     * �����Ʒ�汾
     *
     * @param aProductVersion
     *
     * @throws Exception
     */
    protected abstract void doModifyProductVersion(
        final com.ourteam.product.domain.ProductVersionBean aProductVersion)
        throws Exception;

    /**
     * �����Ʒ�汾
     *
     * @param aProductVersion
     *
     * @throws Exception
     */
    public void modifyProductVersion(
        final com.ourteam.product.domain.ProductVersionBean aProductVersion)
        throws Exception {
        try {
            doModifyProductVersion(aProductVersion);
        } // end try
        catch (Exception e) {
            logger.error("do modifyProductVersion error", e);
            throw e;
        } // end catch
    } // end modifyProductVersion()

    /**
     * ����IDȡ�ò�Ʒ�汾
     *
     * @param productVersionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductVersionBean doGetProductVersionById(
        final long productVersionId) throws Exception;

    /**
     * ����IDȡ�ò�Ʒ�汾
     *
     * @param productVersionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductVersionBean getProductVersionById(
        final long productVersionId) throws Exception {
        try {
            com.ourteam.product.domain.ProductVersionBean result = doGetProductVersionById(productVersionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getProductVersionById error", e);
            throw e;
        } // end catch
    } // end getProductVersionById()

    /**
     * ȡ�����в�Ʒ�汾
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.product.domain.ProductVersionBean[] doGetAllProductVersions(
        final long productId) throws Exception;

    /**
     * ȡ�����в�Ʒ�汾
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.product.domain.ProductVersionBean[] getAllProductVersions(
        final long productId) throws Exception {
        try {
            com.ourteam.product.domain.ProductVersionBean[] result = doGetAllProductVersions(productId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getAllProductVersions error", e);
            throw e;
        } // end catch
    } // end getAllProductVersions()
} // end AbstractProductVersionService
