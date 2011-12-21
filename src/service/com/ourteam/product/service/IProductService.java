/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.service;

/**
*  产品服务
*  Generated Date 2011-10-12 11:42:46   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IProductService {
    /**
     * 查询产品
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
     * 查询产品数
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
     * 新建产品定义
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
     * 更新产品定义
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
     * 删除产品定义
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
     * 根据ID取得产品定义
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
     * 设置产品团队关联
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
     * 取得产品团队关系
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
     * 根据ID取得产品团队关系
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
     * 取得产品词汇表
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
     * 根据ID取得产品词汇
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
     * 添加产品词汇
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
     * 更新产品词汇
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
     * 删除产品词汇
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
