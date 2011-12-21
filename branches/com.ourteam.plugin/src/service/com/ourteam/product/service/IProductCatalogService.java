/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  产品目录服务
*  Generated Date 2010-11-28 11:18:57   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductCatalogService {
    /**
     * 取得产品目录
     *
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductCatalogBean[] getProductCatalogs(
        final long aParentId) throws Exception;

    /**
     * 创建产品目录
     *
     * @param aProductCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void createProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception;

    /**
     * 更新产品目录
     *
     * @param aProductCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void modifyProductCatalog(
        final com.ourteam.product.domain.ProductCatalogBean aProductCatalog)
        throws Exception;

    /**
     * 删除产品目录
     *
     * @param aProductCatalogId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductCatalog(final long aProductCatalogId)
        throws Exception;

    /**
     * 根据ID取得产品目录
     *
     * @param aProductCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductCatalogBean getProductCatalogById(
        final long aProductCatalogId) throws Exception;

    /**
     * 取得产品目录是否可以删除
     *
     * @param aProductCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    boolean canDeleteProductCatalog(final long aProductCatalogId)
        throws Exception;

    /**
     * 取得产品目录排序
     *
     * @param aParentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getMaxProductCatalogSort(final long aParentId)
        throws Exception;

    /**
     * 取得所有产品目录
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductCatalogBean[] getAllProductCatalogs()
        throws Exception;
} // end IProductCatalogService
