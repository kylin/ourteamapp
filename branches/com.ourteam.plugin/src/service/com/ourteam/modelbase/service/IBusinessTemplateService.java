/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

/**
*  业务模板服务
*  Generated Date 2010-12-07 21:47:46   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IBusinessTemplateService {
    /**
     * 取得业务模板
     *
     * @param businessObjectType
     * @param providerTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessTemplateBean[] getBusinessTemplates(
        final String businessObjectType, final long providerTypeId)
        throws Exception;

    /**
     * 添加业务模板
     *
     * @param businessTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void addBusinessTemplate(
        final com.ourteam.modelbase.domain.BusinessTemplateBean businessTemplate)
        throws Exception;

    /**
     * 根据id取得业务模板
     *
     * @param businessTemplateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessTemplateBean getBusinessTemplateById(
        final long businessTemplateId) throws Exception;

    /**
     * 修改业务模板信息
     *
     * @param businessTemplateBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessTemplateInfo(
        final com.ourteam.modelbase.domain.BusinessTemplateBean businessTemplateBean)
        throws Exception;

    /**
     * 根据id取得模板对象
     *
     * @param templateId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.VelocityTemplateBean getTemplateById(
        final long templateId) throws Exception;

    /**
     * 修改模板信息
     *
     * @param velocityTemplateBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyTemplate(
        final com.ourteam.modelbase.domain.VelocityTemplateBean velocityTemplateBean)
        throws Exception;

    /**
     * 取得模板提供类型
     *
     * @param businessObjectType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean[] getBusinessTemplateProviderTypes(
        final String businessObjectType) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param providerId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean getBusinessTemplateProviderTypeById(
        final long providerId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessTemplateProviderType
     *
     * @throws Exception
     *
     * @model
     */
    void addBusinessTemplateProviderType(
        final com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean businessTemplateProviderType)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessTemplateProviderType
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessTemplateProviderType(
        final com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean businessTemplateProviderType)
        throws Exception;
} // end IBusinessTemplateService
