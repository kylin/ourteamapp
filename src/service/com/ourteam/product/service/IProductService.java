/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  ��Ʒ����
*  Generated Date 2011-10-12 11:42:46   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductService {
    /**
     * ��ѯ��Ʒ
     *
     * @param aProductDefineDAOQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductDefineBean[] queryProductDefines(
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
     *
     * @model
     */
    int queryProductDefineCount(
        final com.ourteam.product.dao.ProductDefineDAOQueryBean aProductDefineDAOQueryBean)
        throws Exception;

    /**
     * �½���Ʒ����
     *
     * @param aProductDefine
     *
     * @throws Exception
     *
     * @model
     */
    void createProductDefine(
        final com.ourteam.product.domain.ProductDefineBean aProductDefine)
        throws Exception;

    /**
     * ���²�Ʒ����
     *
     * @param aProductDefine
     *
     * @throws Exception
     *
     * @model
     */
    void modifyProductDefine(
        final com.ourteam.product.domain.ProductDefineBean aProductDefine)
        throws Exception;

    /**
     * ɾ����Ʒ����
     *
     * @param aProductDefineId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductDefine(final long aProductDefineId)
        throws Exception;

    /**
     * ����IDȡ�ò�Ʒ����
     *
     * @param productDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductDefineBean getProductDefineById(
        final long productDefineId) throws Exception;

    /**
     * ���ò�Ʒ�Ŷӹ���
     *
     * @param productId
     * @param productTeamRelates
     *
     * @throws Exception
     *
     * @model
     */
    void setProductTeamRelates(final long productId,
        final com.ourteam.product.domain.ProductTeamRelateBean[] productTeamRelates)
        throws Exception;

    /**
     * ȡ�ò�Ʒ�Ŷӹ�ϵ
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductTeamRelateBean[] getProductTeamRelates(
        final long productId) throws Exception;

    /**
     * ����IDȡ�ò�Ʒ�Ŷӹ�ϵ
     *
     * @param productTeamRelateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductTeamRelateBean getProductTeamRelateById(
        final long productTeamRelateId) throws Exception;

    /**
     * ȡ�ò�Ʒ�ʻ��
     *
     * @param productId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductGlossaryBean[] getProductGlossaries(
        final long productId) throws Exception;

    /**
     * ����IDȡ�ò�Ʒ�ʻ�
     *
     * @param productGlossaryId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductGlossaryBean getProductGlossaryById(
        final long productGlossaryId) throws Exception;

    /**
     * ��Ӳ�Ʒ�ʻ�
     *
     * @param productId
     * @param productGlossary
     *
     * @throws Exception
     *
     * @model
     */
    void addProductGlossary(final long productId,
        final com.ourteam.product.domain.ProductGlossaryBean productGlossary)
        throws Exception;

    /**
     * ���²�Ʒ�ʻ�
     *
     * @param productId
     * @param productGlossary
     *
     * @throws Exception
     *
     * @model
     */
    void modifyProductGlossary(final long productId,
        final com.ourteam.product.domain.ProductGlossaryBean productGlossary)
        throws Exception;

    /**
     * ɾ����Ʒ�ʻ�
     *
     * @param productGlossaryIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductGlossaries(final long[] productGlossaryIds)
        throws Exception;
} // end IProductService
