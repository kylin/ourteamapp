/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  ��Ʒ�汾�������
*  Generated Date 2011-10-12 16:34:08   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductVersionService {
    /**
     * ȡ�ò�Ʒ�汾�б�
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
     * ��Ӳ�Ʒ�汾
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
     * ȥ����Ʒ�汾��Ϣ
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
     * �����Ʒ�汾
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
     * ����IDȡ�ò�Ʒ�汾
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
     * ȡ�����в�Ʒ�汾
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
