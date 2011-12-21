/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  产品功能服务
*  Generated Date 2011-03-19 09:20:46   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductFunctionService {
    /**
     * 取得产品功能列表
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
     * 添加产品功能
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
     * 变更产品功能
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
     * 删除产品功能
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
