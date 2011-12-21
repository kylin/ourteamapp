/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 业务域服务对象 Generated Date 2011-05-31 15:23:48
 *
 * @author Auto Gen
 */
abstract class AbstractBusinessDomainService extends net.service.DefaultServiceImpl
    implements IBusinessDomainService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractBusinessDomainService.class);

    /** BusinessDomain DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessDomainDAO businessDomainDao;

    /** BusinessDomainGroup DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessDomainGroupDAO businessDomainGroupDao;

    /** BusinessDomainGroupRelate DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO businessDomainGroupRelateDao;

    /**
     * Get BusinessDomain DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessDomainDAO getBusinessDomainDao() {
        return businessDomainDao;
    } // end getBusinessDomainDao()

    /**
     * Set BusinessDomain DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessDomainDao(
        com.ourteam.modelbase.dao.IBusinessDomainDAO aDao) {
        businessDomainDao = aDao;
    } // end setBusinessDomainDao()

    /**
     * Get BusinessDomainGroup DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessDomainGroupDAO getBusinessDomainGroupDao() {
        return businessDomainGroupDao;
    } // end getBusinessDomainGroupDao()

    /**
     * Set BusinessDomainGroup DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessDomainGroupDao(
        com.ourteam.modelbase.dao.IBusinessDomainGroupDAO aDao) {
        businessDomainGroupDao = aDao;
    } // end setBusinessDomainGroupDao()

    /**
     * Get BusinessDomainGroupRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO getBusinessDomainGroupRelateDao() {
        return businessDomainGroupRelateDao;
    } // end getBusinessDomainGroupRelateDao()

    /**
     * Set BusinessDomainGroupRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessDomainGroupRelateDao(
        com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO aDao) {
        businessDomainGroupRelateDao = aDao;
    } // end setBusinessDomainGroupRelateDao()

    /**
     * 取得所有业务域
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessDomainBean[] doGetAllBusinessDomains()
        throws Exception;

    /**
     * 取得所有业务域
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessDomainBean[] getAllBusinessDomains()
        throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessDomainBean[] result = doGetAllBusinessDomains();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getAllBusinessDomains error", e);
            throw e;
        } // end catch
    } // end getAllBusinessDomains()

    /**
     * 修改业务域信息
     *
     * @param businessDomainBean
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean businessDomainBean)
        throws Exception;

    /**
     * 修改业务域信息
     *
     * @param businessDomainBean
     *
     * @throws Exception
     */
    public void modifyBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean businessDomainBean)
        throws Exception {
        try {
            if (businessDomainBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessDomainBean] Value is NULL");
            } // end if

            doModifyBusinessDomain(businessDomainBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessDomain error", e);
            throw e;
        } // end catch
    } // end modifyBusinessDomain()

    /**
     * 添加业务域
     *
     * @param aBusinessDomainBean
     *
     * @throws Exception
     */
    protected abstract void doAddNewBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean aBusinessDomainBean)
        throws Exception;

    /**
     * 添加业务域
     *
     * @param aBusinessDomainBean
     *
     * @throws Exception
     */
    public void addNewBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean aBusinessDomainBean)
        throws Exception {
        try {
            if (aBusinessDomainBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aBusinessDomainBean] Value is NULL");
            } // end if

            doAddNewBusinessDomain(aBusinessDomainBean);
        } // end try
        catch (Exception e) {
            logger.error("do addNewBusinessDomain error", e);
            throw e;
        } // end catch
    } // end addNewBusinessDomain()

    /**
     * 删除业务域
     *
     * @param aBusinessDomainId
     *
     * @throws Exception
     */
    protected abstract void doDeleteBusinessDomain(final long aBusinessDomainId)
        throws Exception;

    /**
     * 删除业务域
     *
     * @param aBusinessDomainId
     *
     * @throws Exception
     */
    public void deleteBusinessDomain(final long aBusinessDomainId)
        throws Exception {
        try {
            doDeleteBusinessDomain(aBusinessDomainId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBusinessDomain error", e);
            throw e;
        } // end catch
    } // end deleteBusinessDomain()

    /**
     * 根据ID取得业务域
     *
     * @param businessDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessDomainBean doGetBusinessDomainById(
        final long businessDomainId) throws Exception;

    /**
     * 根据ID取得业务域
     *
     * @param businessDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessDomainBean getBusinessDomainById(
        final long businessDomainId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessDomainBean result = doGetBusinessDomainById(businessDomainId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessDomainById error", e);
            throw e;
        } // end catch
    } // end getBusinessDomainById()

    /**
     * 
    DOCUMENT ME!
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessDomainBean[] doQueryBusinessDomain(
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
     */
    public com.ourteam.modelbase.domain.BusinessDomainBean[] queryBusinessDomain(
        final com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessDomainBean[] result = doQueryBusinessDomain(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessDomain error", e);
            throw e;
        } // end catch
    } // end queryBusinessDomain()

    /**
     * 
    DOCUMENT ME!
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryBusinessDomainCount(
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
     */
    public int queryBusinessDomainCount(
        final com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryBusinessDomainCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessDomainCount error", e);
            throw e;
        } // end catch
    } // end queryBusinessDomainCount()

    /**
     * 取得所有业务域组信息
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessDomainGroupBean[] doGetAllBusinessDomainGroups()
        throws Exception;

    /**
     * 取得所有业务域组信息
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessDomainGroupBean[] getAllBusinessDomainGroups()
        throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessDomainGroupBean[] result = doGetAllBusinessDomainGroups();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getAllBusinessDomainGroups error", e);
            throw e;
        } // end catch
    } // end getAllBusinessDomainGroups()

    /**
     * 根据组ID取得业务域信息
     *
     * @param businessDomainGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessDomainBean[] doGetBusinessDomainsByGroupId(
        final long businessDomainGroupId) throws Exception;

    /**
     * 根据组ID取得业务域信息
     *
     * @param businessDomainGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessDomainBean[] getBusinessDomainsByGroupId(
        final long businessDomainGroupId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessDomainBean[] result = doGetBusinessDomainsByGroupId(businessDomainGroupId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessDomainsByGroupId error", e);
            throw e;
        } // end catch
    } // end getBusinessDomainsByGroupId()

    /**
     * 设置业务域与组的关联关系
     *
     * @param businessDomainGroupId
     * @param businessDomainIds
     *
     * @throws Exception
     */
    protected abstract void doSetBusinessDomainGroupRelate(
        final long businessDomainGroupId, final long[] businessDomainIds)
        throws Exception;

    /**
     * 设置业务域与组的关联关系
     *
     * @param businessDomainGroupId
     * @param businessDomainIds
     *
     * @throws Exception
     */
    public void setBusinessDomainGroupRelate(final long businessDomainGroupId,
        final long[] businessDomainIds) throws Exception {
        try {
            doSetBusinessDomainGroupRelate(businessDomainGroupId,
                businessDomainIds);
        } // end try
        catch (Exception e) {
            logger.error("do setBusinessDomainGroupRelate error", e);
            throw e;
        } // end catch
    } // end setBusinessDomainGroupRelate()

    /**
     * 新建业务域分组
     *
     * @param businessDomainGroupBean
     * @param businessDomainIds
     *
     * @throws Exception
     */
    protected abstract void doAddNewBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean,
        final long[] businessDomainIds) throws Exception;

    /**
     * 新建业务域分组
     *
     * @param businessDomainGroupBean
     * @param businessDomainIds
     *
     * @throws Exception
     */
    public void addNewBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean,
        final long[] businessDomainIds) throws Exception {
        try {
            if (businessDomainGroupBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessDomainGroupBean] Value is NULL");
            } // end if

            doAddNewBusinessDomainGroup(businessDomainGroupBean,
                businessDomainIds);
        } // end try
        catch (Exception e) {
            logger.error("do addNewBusinessDomainGroup error", e);
            throw e;
        } // end catch
    } // end addNewBusinessDomainGroup()

    /**
     * 删除业务域分组
     *
     * @param businessDomainGroupId
     *
     * @throws Exception
     */
    protected abstract void doRemoveBusinessDomainGroup(
        final long businessDomainGroupId) throws Exception;

    /**
     * 删除业务域分组
     *
     * @param businessDomainGroupId
     *
     * @throws Exception
     */
    public void removeBusinessDomainGroup(final long businessDomainGroupId)
        throws Exception {
        try {
            doRemoveBusinessDomainGroup(businessDomainGroupId);
        } // end try
        catch (Exception e) {
            logger.error("do removeBusinessDomainGroup error", e);
            throw e;
        } // end catch
    } // end removeBusinessDomainGroup()

    /**
     * 批量删除业务域分组
     *
     * @param businessDomainGroupIds
     *
     * @throws Exception
     */
    protected abstract void doRemoveBusinessDomainGroups(
        final long[] businessDomainGroupIds) throws Exception;

    /**
     * 批量删除业务域分组
     *
     * @param businessDomainGroupIds
     *
     * @throws Exception
     */
    public void removeBusinessDomainGroups(final long[] businessDomainGroupIds)
        throws Exception {
        try {
            doRemoveBusinessDomainGroups(businessDomainGroupIds);
        } // end try
        catch (Exception e) {
            logger.error("do removeBusinessDomainGroups error", e);
            throw e;
        } // end catch
    } // end removeBusinessDomainGroups()

    /**
     * 编辑业务域分组信息
     *
     * @param businessDomainGroupBean
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean)
        throws Exception;

    /**
     * 编辑业务域分组信息
     *
     * @param businessDomainGroupBean
     *
     * @throws Exception
     */
    public void modifyBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean)
        throws Exception {
        try {
            if (businessDomainGroupBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessDomainGroupBean] Value is NULL");
            } // end if

            doModifyBusinessDomainGroup(businessDomainGroupBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessDomainGroup error", e);
            throw e;
        } // end catch
    } // end modifyBusinessDomainGroup()
} // end AbstractBusinessDomainService
