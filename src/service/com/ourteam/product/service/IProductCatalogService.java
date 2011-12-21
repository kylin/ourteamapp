/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  ��ƷĿ¼����
*  Generated Date 2010-11-28 11:18:57   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductCatalogService {
    /**
     * ȡ�ò�ƷĿ¼
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
     * ������ƷĿ¼
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
     * ���²�ƷĿ¼
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
     * ɾ����ƷĿ¼
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
     * ����IDȡ�ò�ƷĿ¼
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
     * ȡ�ò�ƷĿ¼�Ƿ����ɾ��
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
     * ȡ�ò�ƷĿ¼����
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
     * ȡ�����в�ƷĿ¼
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
