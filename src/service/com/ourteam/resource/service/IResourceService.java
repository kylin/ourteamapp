/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.service;

/**
*  ��Դ����
*  Generated Date 2011-09-13 16:04:09   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IResourceService {
    /**
     * ȡ����Դ�����б�
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
     * ����IDȡ����Դ����
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
     * ������Դ����
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
     * ��������ȡ����Դ���Զ���
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
     * �����Դ���Զ���
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
     * ɾ����Դ���Զ���
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
     * ������Դ���Զ���
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
     * ������Դ����ȡ����Դʵ��
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
     * ����IDȡ����Դʵ��
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
     * �½���Դʵ��
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
     * ������Դʵ��
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
     * ɾ����Դʵ��
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
     * ������ԴIDȡ����Դ����
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
     * �½���Դ����
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
     * ɾ����Դ����
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
     * ȡ����ԴԤ����Ϣ
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
