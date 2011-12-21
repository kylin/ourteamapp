/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  ��Ʒ���ܷ���
*  Generated Date 2011-03-19 09:20:46   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductFunctionService {
    /**
     * ȡ�ò�Ʒ�����б�
     *
     * @param aProductDefineId
     * @param aParentFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.product.domain.ProductFunctionBean[] getProductFunctions(
        final long aProductDefineId, final long aParentFunctionId)
        throws Exception;

    /**
     * ��Ӳ�Ʒ����
     *
     * @param aProductVersionId
     * @param aProductFunction
     *
     * @throws Exception
     *
     * @model
     */
    void addNewProductFunction(final long aProductVersionId,
        final com.ourteam.product.domain.ProductFunctionBean aProductFunction)
        throws Exception;

    /**
     * �����Ʒ����
     *
     * @param aProductFunction
     *
     * @throws Exception
     *
     * @model
     */
    void modifyProductFunction(
        final com.ourteam.product.domain.ProductFunctionBean aProductFunction)
        throws Exception;

    /**
     * ɾ����Ʒ����
     *
     * @param aProductFunctionId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductFunction(final long aProductFunctionId)
        throws Exception;
} // end IProductFunctionService
