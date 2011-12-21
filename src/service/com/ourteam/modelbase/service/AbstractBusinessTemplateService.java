/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 业务模板服务 Generated Date 2010-12-07 21:47:58
 *
 * @author Auto Gen
 */
abstract class AbstractBusinessTemplateService extends net.service.DefaultServiceImpl
    implements IBusinessTemplateService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractBusinessTemplateService.class);

    /** VelocityTemplate DAO Instance */
    protected com.ourteam.modelbase.dao.IVelocityTemplateDAO velocityTemplateDao;

    /** BusinessTemplate DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessTemplateDAO businessTemplateDao;

    /** BusinessDomainService Instance */
    protected com.ourteam.modelbase.service.IBusinessDomainService businessDomainService;

    /** BusinessObjectService Instance */
    protected com.ourteam.modelbase.service.IBusinessObjectService businessObjectService;

    /** BusinessPackageService Instance */
    protected com.ourteam.modelbase.service.IBusinessPackageService businessPackageService;

    /** BusinessTemplateProviderType DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO businessTemplateProviderTypeDao;

    /**
     * Get VelocityTemplate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IVelocityTemplateDAO getVelocityTemplateDao() {
        return velocityTemplateDao;
    } // end getVelocityTemplateDao()

    /**
     * Set VelocityTemplate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setVelocityTemplateDao(
        com.ourteam.modelbase.dao.IVelocityTemplateDAO aDao) {
        velocityTemplateDao = aDao;
    } // end setVelocityTemplateDao()

    /**
     * Get BusinessTemplate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessTemplateDAO getBusinessTemplateDao() {
        return businessTemplateDao;
    } // end getBusinessTemplateDao()

    /**
     * Set BusinessTemplate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessTemplateDao(
        com.ourteam.modelbase.dao.IBusinessTemplateDAO aDao) {
        businessTemplateDao = aDao;
    } // end setBusinessTemplateDao()

    /**
     * Get BusinessDomainService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.service.IBusinessDomainService getBusinessDomainService() {
        return businessDomainService;
    } // end getBusinessDomainService()

    /**
     * Set BusinessDomainService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setBusinessDomainService(
        com.ourteam.modelbase.service.IBusinessDomainService aService) {
        businessDomainService = aService;
    } // end setBusinessDomainService()

    /**
     * Get BusinessObjectService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.service.IBusinessObjectService getBusinessObjectService() {
        return businessObjectService;
    } // end getBusinessObjectService()

    /**
     * Set BusinessObjectService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setBusinessObjectService(
        com.ourteam.modelbase.service.IBusinessObjectService aService) {
        businessObjectService = aService;
    } // end setBusinessObjectService()

    /**
     * Get BusinessPackageService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.service.IBusinessPackageService getBusinessPackageService() {
        return businessPackageService;
    } // end getBusinessPackageService()

    /**
     * Set BusinessPackageService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setBusinessPackageService(
        com.ourteam.modelbase.service.IBusinessPackageService aService) {
        businessPackageService = aService;
    } // end setBusinessPackageService()

    /**
     * Get BusinessTemplateProviderType DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO getBusinessTemplateProviderTypeDao() {
        return businessTemplateProviderTypeDao;
    } // end getBusinessTemplateProviderTypeDao()

    /**
     * Set BusinessTemplateProviderType DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessTemplateProviderTypeDao(
        com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO aDao) {
        businessTemplateProviderTypeDao = aDao;
    } // end setBusinessTemplateProviderTypeDao()

    /**
     * 取得业务模板
     *
     * @param businessObjectType
     * @param providerTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessTemplateBean[] doGetBusinessTemplates(
        final String businessObjectType, final long providerTypeId)
        throws Exception;

    /**
     * 取得业务模板
     *
     * @param businessObjectType
     * @param providerTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessTemplateBean[] getBusinessTemplates(
        final String businessObjectType, final long providerTypeId)
        throws Exception {
        try {
            if (businessObjectType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessObjectType] Value is NULL");
            } // end if

            com.ourteam.modelbase.domain.BusinessTemplateBean[] result = doGetBusinessTemplates(businessObjectType,
                    providerTypeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessTemplates error", e);
            throw e;
        } // end catch
    } // end getBusinessTemplates()

    /**
     * 添加业务模板
     *
     * @param businessTemplate
     *
     * @throws Exception
     */
    protected abstract void doAddBusinessTemplate(
        final com.ourteam.modelbase.domain.BusinessTemplateBean businessTemplate)
        throws Exception;

    /**
     * 添加业务模板
     *
     * @param businessTemplate
     *
     * @throws Exception
     */
    public void addBusinessTemplate(
        final com.ourteam.modelbase.domain.BusinessTemplateBean businessTemplate)
        throws Exception {
        try {
            if (businessTemplate == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessTemplate] Value is NULL");
            } // end if

            doAddBusinessTemplate(businessTemplate);
        } // end try
        catch (Exception e) {
            logger.error("do addBusinessTemplate error", e);
            throw e;
        } // end catch
    } // end addBusinessTemplate()

    /**
     * 根据id取得业务模板
     *
     * @param businessTemplateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessTemplateBean doGetBusinessTemplateById(
        final long businessTemplateId) throws Exception;

    /**
     * 根据id取得业务模板
     *
     * @param businessTemplateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessTemplateBean getBusinessTemplateById(
        final long businessTemplateId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessTemplateBean result = doGetBusinessTemplateById(businessTemplateId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessTemplateById error", e);
            throw e;
        } // end catch
    } // end getBusinessTemplateById()

    /**
     * 修改业务模板信息
     *
     * @param businessTemplateBean
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessTemplateInfo(
        final com.ourteam.modelbase.domain.BusinessTemplateBean businessTemplateBean)
        throws Exception;

    /**
     * 修改业务模板信息
     *
     * @param businessTemplateBean
     *
     * @throws Exception
     */
    public void modifyBusinessTemplateInfo(
        final com.ourteam.modelbase.domain.BusinessTemplateBean businessTemplateBean)
        throws Exception {
        try {
            if (businessTemplateBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessTemplateBean] Value is NULL");
            } // end if

            doModifyBusinessTemplateInfo(businessTemplateBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessTemplateInfo error", e);
            throw e;
        } // end catch
    } // end modifyBusinessTemplateInfo()

    /**
     * 根据id取得模板对象
     *
     * @param templateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.VelocityTemplateBean doGetTemplateById(
        final long templateId) throws Exception;

    /**
     * 根据id取得模板对象
     *
     * @param templateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.VelocityTemplateBean getTemplateById(
        final long templateId) throws Exception {
        try {
            com.ourteam.modelbase.domain.VelocityTemplateBean result = doGetTemplateById(templateId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getTemplateById error", e);
            throw e;
        } // end catch
    } // end getTemplateById()

    /**
     * 修改模板信息
     *
     * @param velocityTemplateBean
     *
     * @throws Exception
     */
    protected abstract void doModifyTemplate(
        final com.ourteam.modelbase.domain.VelocityTemplateBean velocityTemplateBean)
        throws Exception;

    /**
     * 修改模板信息
     *
     * @param velocityTemplateBean
     *
     * @throws Exception
     */
    public void modifyTemplate(
        final com.ourteam.modelbase.domain.VelocityTemplateBean velocityTemplateBean)
        throws Exception {
        try {
            if (velocityTemplateBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [velocityTemplateBean] Value is NULL");
            } // end if

            doModifyTemplate(velocityTemplateBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyTemplate error", e);
            throw e;
        } // end catch
    } // end modifyTemplate()

    /**
     * 取得模板提供类型
     *
     * @param businessObjectType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean[] doGetBusinessTemplateProviderTypes(
        final String businessObjectType) throws Exception;

    /**
     * 取得模板提供类型
     *
     * @param businessObjectType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean[] getBusinessTemplateProviderTypes(
        final String businessObjectType) throws Exception {
        try {
            if (businessObjectType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessObjectType] Value is NULL");
            } // end if

            com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean[] result =
                doGetBusinessTemplateProviderTypes(businessObjectType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessTemplateProviderTypes error", e);
            throw e;
        } // end catch
    } // end getBusinessTemplateProviderTypes()

    /**
     * 
    DOCUMENT ME!
     *
     * @param providerId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean doGetBusinessTemplateProviderTypeById(
        final long providerId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param providerId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean getBusinessTemplateProviderTypeById(
        final long providerId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean result =
                doGetBusinessTemplateProviderTypeById(providerId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessTemplateProviderTypeById error", e);
            throw e;
        } // end catch
    } // end getBusinessTemplateProviderTypeById()

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessTemplateProviderType
     *
     * @throws Exception
     */
    protected abstract void doAddBusinessTemplateProviderType(
        final com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean businessTemplateProviderType)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessTemplateProviderType
     *
     * @throws Exception
     */
    public void addBusinessTemplateProviderType(
        final com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean businessTemplateProviderType)
        throws Exception {
        try {
            doAddBusinessTemplateProviderType(businessTemplateProviderType);
        } // end try
        catch (Exception e) {
            logger.error("do addBusinessTemplateProviderType error", e);
            throw e;
        } // end catch
    } // end addBusinessTemplateProviderType()

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessTemplateProviderType
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessTemplateProviderType(
        final com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean businessTemplateProviderType)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessTemplateProviderType
     *
     * @throws Exception
     */
    public void modifyBusinessTemplateProviderType(
        final com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean businessTemplateProviderType)
        throws Exception {
        try {
            doModifyBusinessTemplateProviderType(businessTemplateProviderType);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessTemplateProviderType error", e);
            throw e;
        } // end catch
    } // end modifyBusinessTemplateProviderType()
} // end AbstractBusinessTemplateService
