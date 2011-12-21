/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.service;

/**
*  资源服务
*  Generated Date 2011-09-13 16:04:09   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IResourceService {
    /**
     * 取得资源类型列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.resource.domain.ResourceTypeBean[] getResourceTypes()
        throws Exception;

    /**
     * 根据ID取得资源类型
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.resource.domain.ResourceTypeBean getResourceTypeById(
        final long resourceTypeId) throws Exception;

    /**
     * 更新资源类型
     *
     * @param resourceType
     *
     * @throws Exception
     *
     * @model
     */
    void modifyResourceType(
        final com.ourteam.resource.domain.ResourceTypeBean resourceType)
        throws Exception;

    /**
     * 根据类型取得资源属性定义
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.resource.domain.ResourcePropertyBean[] getResourcePropertiesDefineByType(
        final long resourceTypeId) throws Exception;

    /**
     * 添加资源属性定义
     *
     * @param resourceTypeId
     * @param resourcePropertyBean
     *
     * @throws Exception
     *
     * @model
     */
    void addResourcePropertyDefine(final long resourceTypeId,
        final com.ourteam.resource.domain.ResourcePropertyBean resourcePropertyBean)
        throws Exception;

    /**
     * 删除资源属性定义
     *
     * @param ids
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourcePropertyDefines(final long[] ids)
        throws Exception;

    /**
     * 更新资源属性定义
     *
     * @param resourcePropertyBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyResourcePropertyDefine(
        final com.ourteam.resource.domain.ResourcePropertyBean resourcePropertyBean)
        throws Exception;

    /**
     * 根据资源类型取得资源实例
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.resource.domain.ResourceInstanceBean[] getResourceInstancesByTypeId(
        final long resourceTypeId) throws Exception;

    /**
     * 根据ID取得资源实例
     *
     * @param resourceInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.resource.domain.ResourceInstanceBean getResourceInstanceById(
        final long resourceInstanceId) throws Exception;

    /**
     * 新建资源实例
     *
     * @param resourceInstanceBean
     * @param propertyInstanceBeans
     *
     * @throws Exception
     *
     * @model
     */
    void addResourceInstance(
        final com.ourteam.resource.domain.ResourceInstanceBean resourceInstanceBean,
        final com.ourteam.resource.domain.ResourcePropertyInstanceBean[] propertyInstanceBeans)
        throws Exception;

    /**
     * 更新资源实例
     *
     * @param resourceInstanceBean
     * @param propertyInstanceBeans
     *
     * @throws Exception
     *
     * @model
     */
    void modifyResourceInstance(
        final com.ourteam.resource.domain.ResourceInstanceBean resourceInstanceBean,
        final com.ourteam.resource.domain.ResourcePropertyInstanceBean[] propertyInstanceBeans)
        throws Exception;

    /**
     * 删除资源实例
     *
     * @param resourceInstanceIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceInstances(final long[] resourceInstanceIds)
        throws Exception;

    /**
     * 根据资源ID取得资源属性
     *
     * @param resourceInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.resource.domain.ResourcePropertyInstanceBean[] getResourcePropertyInstancesByResourceId(
        final long resourceInstanceId) throws Exception;

    /**
     * 新建资源类型
     *
     * @param resourceTypeBean
     *
     * @throws Exception
     *
     * @model
     */
    void addResourceType(
        final com.ourteam.resource.domain.ResourceTypeBean resourceTypeBean)
        throws Exception;

    /**
     * 删除资源类型
     *
     * @param resourceTypeIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceType(final long[] resourceTypeIds)
        throws Exception;

    /**
     * 取得资源预订信息
     *
     * @param resourceInstanceId
     * @param startTime
     * @param endTime
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.resource.domain.ResourceBookingBean[] getResourceInstanceBookings(
        final long resourceInstanceId, final java.util.Date startTime,
        final java.util.Date endTime) throws Exception;
} // end IResourceService
