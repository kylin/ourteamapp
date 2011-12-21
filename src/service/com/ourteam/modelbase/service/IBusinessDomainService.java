/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

/**
*  业务域服务对象
*  Generated Date 2011-05-31 15:23:24   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IBusinessDomainService {
    /**
     * 取得所有业务域
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean[] getAllBusinessDomains()
        throws Exception;

    /**
     * 修改业务域信息
     *
     * @param businessDomainBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean businessDomainBean)
        throws Exception;

    /**
     * 添加业务域
     *
     * @param aBusinessDomainBean
     *
     * @throws Exception
     *
     * @model
     */
    void addNewBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean aBusinessDomainBean)
        throws Exception;

    /**
     * 删除业务域
     *
     * @param aBusinessDomainId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomain(final long aBusinessDomainId)
        throws Exception;

    /**
     * 根据ID取得业务域
     *
     * @param businessDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean getBusinessDomainById(
        final long businessDomainId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean[] queryBusinessDomain(
        final com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean queryBean)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessDomainCount(
        final com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取得所有业务域组信息
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainGroupBean[] getAllBusinessDomainGroups()
        throws Exception;

    /**
     * 根据组ID取得业务域信息
     *
     * @param businessDomainGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean[] getBusinessDomainsByGroupId(
        final long businessDomainGroupId) throws Exception;

    /**
     * 设置业务域与组的关联关系
     *
     * @param businessDomainGroupId
     * @param businessDomainIds
     *
     * @throws Exception
     *
     * @model
     */
    void setBusinessDomainGroupRelate(final long businessDomainGroupId,
        final long[] businessDomainIds) throws Exception;

    /**
     * 新建业务域分组
     *
     * @param businessDomainGroupBean
     * @param businessDomainIds
     *
     * @throws Exception
     *
     * @model
     */
    void addNewBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean,
        final long[] businessDomainIds) throws Exception;

    /**
     * 删除业务域分组
     *
     * @param businessDomainGroupId
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessDomainGroup(final long businessDomainGroupId)
        throws Exception;

    /**
     * 批量删除业务域分组
     *
     * @param businessDomainGroupIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessDomainGroups(final long[] businessDomainGroupIds)
        throws Exception;

    /**
     * 编辑业务域分组信息
     *
     * @param businessDomainGroupBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean)
        throws Exception;
} // end IBusinessDomainService
