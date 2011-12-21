/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  产品版本服务对象
*  Generated Date 2011-10-12 16:34:08   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductVersionService {
    /**
     * 取得产品版本列表
     *
     * @param aProductDefineId
     * @param parentVersionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductVersionBean[] getProductVersions(
        final long aProductDefineId, final long parentVersionId)
        throws Exception;

    /**
     * 添加产品版本
     *
     * @param productId
     * @param parentVersionId
     * @param aProductVersion
     *
     * @throws Exception
     *
     * @model
     */
    void addNewProductVersion(final long productId, final long parentVersionId,
        final com.ourteam.product.domain.ProductVersionBean aProductVersion)
        throws Exception;

    /**
     * 去除产品版本信息
     *
     * @param aProductVersionId
     *
     * @throws Exception
     *
     * @model
     */
    void removeProductVersion(final long aProductVersionId)
        throws Exception;

    /**
     * 变更产品版本
     *
     * @param aProductVersion
     *
     * @throws Exception
     *
     * @model
     */
    void modifyProductVersion(
        final com.ourteam.product.domain.ProductVersionBean aProductVersion)
        throws Exception;

    /**
     * 根据ID取得产品版本
     *
     * @param productVersionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductVersionBean getProductVersionById(
        final long productVersionId) throws Exception;

    /**
     * 取得所有产品版本
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductVersionBean[] getAllProductVersions(
        final long productId) throws Exception;
} // end IProductVersionService
