/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ��Դ���� Generated Date 2011-09-13 16:05:24
 *
 * @author Auto Gen
 */
abstract class AbstractResourceService extends net.service.DefaultServiceImpl
    implements IResourceService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractResourceService.class);

    /** ResourceType DAO Instance */
    protected com.ourteam.resource.dao.IResourceTypeDAO resourceTypeDao;

    /** ResourceProperty DAO Instance */
    protected com.ourteam.resource.dao.IResourcePropertyDAO resourcePropertyDao;

    /** ResourceInstance DAO Instance */
    protected com.ourteam.resource.dao.IResourceInstanceDAO resourceInstanceDao;

    /** ResourcePropertyInstance DAO Instance */
    protected com.ourteam.resource.dao.IResourcePropertyInstanceDAO resourcePropertyInstanceDao;

    /** ResourceBooking DAO Instance */
    protected com.ourteam.resource.dao.IResourceBookingDAO resourceBookingDao;

    /**
     * Get ResourceType DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.resource.dao.IResourceTypeDAO getResourceTypeDao() {
        return resourceTypeDao;
    } // end getResourceTypeDao()

    /**
     * Set ResourceType DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setResourceTypeDao(
        com.ourteam.resource.dao.IResourceTypeDAO aDao) {
        resourceTypeDao = aDao;
    } // end setResourceTypeDao()

    /**
     * Get ResourceProperty DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.resource.dao.IResourcePropertyDAO getResourcePropertyDao() {
        return resourcePropertyDao;
    } // end getResourcePropertyDao()

    /**
     * Set ResourceProperty DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setResourcePropertyDao(
        com.ourteam.resource.dao.IResourcePropertyDAO aDao) {
        resourcePropertyDao = aDao;
    } // end setResourcePropertyDao()

    /**
     * Get ResourceInstance DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.resource.dao.IResourceInstanceDAO getResourceInstanceDao() {
        return resourceInstanceDao;
    } // end getResourceInstanceDao()

    /**
     * Set ResourceInstance DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setResourceInstanceDao(
        com.ourteam.resource.dao.IResourceInstanceDAO aDao) {
        resourceInstanceDao = aDao;
    } // end setResourceInstanceDao()

    /**
     * Get ResourcePropertyInstance DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.resource.dao.IResourcePropertyInstanceDAO getResourcePropertyInstanceDao() {
        return resourcePropertyInstanceDao;
    } // end getResourcePropertyInstanceDao()

    /**
     * Set ResourcePropertyInstance DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setResourcePropertyInstanceDao(
        com.ourteam.resource.dao.IResourcePropertyInstanceDAO aDao) {
        resourcePropertyInstanceDao = aDao;
    } // end setResourcePropertyInstanceDao()

    /**
     * Get ResourceBooking DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.resource.dao.IResourceBookingDAO getResourceBookingDao() {
        return resourceBookingDao;
    } // end getResourceBookingDao()

    /**
     * Set ResourceBooking DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setResourceBookingDao(
        com.ourteam.resource.dao.IResourceBookingDAO aDao) {
        resourceBookingDao = aDao;
    } // end setResourceBookingDao()

    /**
     * ȡ����Դ�����б�
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.resource.domain.ResourceTypeBean[] doGetResourceTypes()
        throws Exception;

    /**
     * ȡ����Դ�����б�
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.resource.domain.ResourceTypeBean[] getResourceTypes()
        throws Exception {
        try {
            com.ourteam.resource.domain.ResourceTypeBean[] result = doGetResourceTypes();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getResourceTypes error", e);
            throw e;
        } // end catch
    } // end getResourceTypes()

    /**
     * ����IDȡ����Դ����
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.resource.domain.ResourceTypeBean doGetResourceTypeById(
        final long resourceTypeId) throws Exception;

    /**
     * ����IDȡ����Դ����
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.resource.domain.ResourceTypeBean getResourceTypeById(
        final long resourceTypeId) throws Exception {
        try {
            com.ourteam.resource.domain.ResourceTypeBean result = doGetResourceTypeById(resourceTypeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getResourceTypeById error", e);
            throw e;
        } // end catch
    } // end getResourceTypeById()

    /**
     * ������Դ����
     *
     * @param resourceType
     *
     * @throws Exception
     */
    protected abstract void doModifyResourceType(
        final com.ourteam.resource.domain.ResourceTypeBean resourceType)
        throws Exception;

    /**
     * ������Դ����
     *
     * @param resourceType
     *
     * @throws Exception
     */
    public void modifyResourceType(
        final com.ourteam.resource.domain.ResourceTypeBean resourceType)
        throws Exception {
        try {
            if (resourceType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [resourceType] Value is NULL");
            } // end if

            doModifyResourceType(resourceType);
        } // end try
        catch (Exception e) {
            logger.error("do modifyResourceType error", e);
            throw e;
        } // end catch
    } // end modifyResourceType()

    /**
     * ��������ȡ����Դ���Զ���
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.resource.domain.ResourcePropertyBean[] doGetResourcePropertiesDefineByType(
        final long resourceTypeId) throws Exception;

    /**
     * ��������ȡ����Դ���Զ���
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.resource.domain.ResourcePropertyBean[] getResourcePropertiesDefineByType(
        final long resourceTypeId) throws Exception {
        try {
            com.ourteam.resource.domain.ResourcePropertyBean[] result = doGetResourcePropertiesDefineByType(resourceTypeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getResourcePropertiesDefineByType error", e);
            throw e;
        } // end catch
    } // end getResourcePropertiesDefineByType()

    /**
     * �����Դ���Զ���
     *
     * @param resourceTypeId
     * @param resourcePropertyBean
     *
     * @throws Exception
     */
    protected abstract void doAddResourcePropertyDefine(
        final long resourceTypeId,
        final com.ourteam.resource.domain.ResourcePropertyBean resourcePropertyBean)
        throws Exception;

    /**
     * �����Դ���Զ���
     *
     * @param resourceTypeId
     * @param resourcePropertyBean
     *
     * @throws Exception
     */
    public void addResourcePropertyDefine(final long resourceTypeId,
        final com.ourteam.resource.domain.ResourcePropertyBean resourcePropertyBean)
        throws Exception {
        try {
            if (resourcePropertyBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [resourcePropertyBean] Value is NULL");
            } // end if

            doAddResourcePropertyDefine(resourceTypeId, resourcePropertyBean);
        } // end try
        catch (Exception e) {
            logger.error("do addResourcePropertyDefine error", e);
            throw e;
        } // end catch
    } // end addResourcePropertyDefine()

    /**
     * ɾ����Դ���Զ���
     *
     * @param ids
     *
     * @throws Exception
     */
    protected abstract void doDeleteResourcePropertyDefines(final long[] ids)
        throws Exception;

    /**
     * ɾ����Դ���Զ���
     *
     * @param ids
     *
     * @throws Exception
     */
    public void deleteResourcePropertyDefines(final long[] ids)
        throws Exception {
        try {
            doDeleteResourcePropertyDefines(ids);
        } // end try
        catch (Exception e) {
            logger.error("do deleteResourcePropertyDefines error", e);
            throw e;
        } // end catch
    } // end deleteResourcePropertyDefines()

    /**
     * ������Դ���Զ���
     *
     * @param resourcePropertyBean
     *
     * @throws Exception
     */
    protected abstract void doModifyResourcePropertyDefine(
        final com.ourteam.resource.domain.ResourcePropertyBean resourcePropertyBean)
        throws Exception;

    /**
     * ������Դ���Զ���
     *
     * @param resourcePropertyBean
     *
     * @throws Exception
     */
    public void modifyResourcePropertyDefine(
        final com.ourteam.resource.domain.ResourcePropertyBean resourcePropertyBean)
        throws Exception {
        try {
            if (resourcePropertyBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [resourcePropertyBean] Value is NULL");
            } // end if

            doModifyResourcePropertyDefine(resourcePropertyBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyResourcePropertyDefine error", e);
            throw e;
        } // end catch
    } // end modifyResourcePropertyDefine()

    /**
     * ������Դ����ȡ����Դʵ��
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.resource.domain.ResourceInstanceBean[] doGetResourceInstancesByTypeId(
        final long resourceTypeId) throws Exception;

    /**
     * ������Դ����ȡ����Դʵ��
     *
     * @param resourceTypeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.resource.domain.ResourceInstanceBean[] getResourceInstancesByTypeId(
        final long resourceTypeId) throws Exception {
        try {
            com.ourteam.resource.domain.ResourceInstanceBean[] result = doGetResourceInstancesByTypeId(resourceTypeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getResourceInstancesByTypeId error", e);
            throw e;
        } // end catch
    } // end getResourceInstancesByTypeId()

    /**
     * ����IDȡ����Դʵ��
     *
     * @param resourceInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.resource.domain.ResourceInstanceBean doGetResourceInstanceById(
        final long resourceInstanceId) throws Exception;

    /**
     * ����IDȡ����Դʵ��
     *
     * @param resourceInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.resource.domain.ResourceInstanceBean getResourceInstanceById(
        final long resourceInstanceId) throws Exception {
        try {
            com.ourteam.resource.domain.ResourceInstanceBean result = doGetResourceInstanceById(resourceInstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getResourceInstanceById error", e);
            throw e;
        } // end catch
    } // end getResourceInstanceById()

    /**
     * �½���Դʵ��
     *
     * @param resourceInstanceBean
     * @param propertyInstanceBeans
     *
     * @throws Exception
     */
    protected abstract void doAddResourceInstance(
        final com.ourteam.resource.domain.ResourceInstanceBean resourceInstanceBean,
        final com.ourteam.resource.domain.ResourcePropertyInstanceBean[] propertyInstanceBeans)
        throws Exception;

    /**
     * �½���Դʵ��
     *
     * @param resourceInstanceBean
     * @param propertyInstanceBeans
     *
     * @throws Exception
     */
    public void addResourceInstance(
        final com.ourteam.resource.domain.ResourceInstanceBean resourceInstanceBean,
        final com.ourteam.resource.domain.ResourcePropertyInstanceBean[] propertyInstanceBeans)
        throws Exception {
        try {
            if (resourceInstanceBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [resourceInstanceBean] Value is NULL");
            } // end if

            doAddResourceInstance(resourceInstanceBean, propertyInstanceBeans);
        } // end try
        catch (Exception e) {
            logger.error("do addResourceInstance error", e);
            throw e;
        } // end catch
    } // end addResourceInstance()

    /**
     * ������Դʵ��
     *
     * @param resourceInstanceBean
     * @param propertyInstanceBeans
     *
     * @throws Exception
     */
    protected abstract void doModifyResourceInstance(
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
     */
    public void modifyResourceInstance(
        final com.ourteam.resource.domain.ResourceInstanceBean resourceInstanceBean,
        final com.ourteam.resource.domain.ResourcePropertyInstanceBean[] propertyInstanceBeans)
        throws Exception {
        try {
            if (resourceInstanceBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [resourceInstanceBean] Value is NULL");
            } // end if

            doModifyResourceInstance(resourceInstanceBean, propertyInstanceBeans);
        } // end try
        catch (Exception e) {
            logger.error("do modifyResourceInstance error", e);
            throw e;
        } // end catch
    } // end modifyResourceInstance()

    /**
     * ɾ����Դʵ��
     *
     * @param resourceInstanceIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteResourceInstances(
        final long[] resourceInstanceIds) throws Exception;

    /**
     * ɾ����Դʵ��
     *
     * @param resourceInstanceIds
     *
     * @throws Exception
     */
    public void deleteResourceInstances(final long[] resourceInstanceIds)
        throws Exception {
        try {
            doDeleteResourceInstances(resourceInstanceIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteResourceInstances error", e);
            throw e;
        } // end catch
    } // end deleteResourceInstances()

    /**
     * ������ԴIDȡ����Դ����
     *
     * @param resourceInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.resource.domain.ResourcePropertyInstanceBean[] doGetResourcePropertyInstancesByResourceId(
        final long resourceInstanceId) throws Exception;

    /**
     * ������ԴIDȡ����Դ����
     *
     * @param resourceInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.resource.domain.ResourcePropertyInstanceBean[] getResourcePropertyInstancesByResourceId(
        final long resourceInstanceId) throws Exception {
        try {
            com.ourteam.resource.domain.ResourcePropertyInstanceBean[] result = doGetResourcePropertyInstancesByResourceId(resourceInstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getResourcePropertyInstancesByResourceId error", e);
            throw e;
        } // end catch
    } // end getResourcePropertyInstancesByResourceId()

    /**
     * �½���Դ����
     *
     * @param resourceTypeBean
     *
     * @throws Exception
     */
    protected abstract void doAddResourceType(
        final com.ourteam.resource.domain.ResourceTypeBean resourceTypeBean)
        throws Exception;

    /**
     * �½���Դ����
     *
     * @param resourceTypeBean
     *
     * @throws Exception
     */
    public void addResourceType(
        final com.ourteam.resource.domain.ResourceTypeBean resourceTypeBean)
        throws Exception {
        try {
            if (resourceTypeBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [resourceTypeBean] Value is NULL");
            } // end if

            doAddResourceType(resourceTypeBean);
        } // end try
        catch (Exception e) {
            logger.error("do addResourceType error", e);
            throw e;
        } // end catch
    } // end addResourceType()

    /**
     * ɾ����Դ����
     *
     * @param resourceTypeIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteResourceType(final long[] resourceTypeIds)
        throws Exception;

    /**
     * ɾ����Դ����
     *
     * @param resourceTypeIds
     *
     * @throws Exception
     */
    public void deleteResourceType(final long[] resourceTypeIds)
        throws Exception {
        try {
            doDeleteResourceType(resourceTypeIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteResourceType error", e);
            throw e;
        } // end catch
    } // end deleteResourceType()

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
     */
    protected abstract com.ourteam.resource.domain.ResourceBookingBean[] doGetResourceInstanceBookings(
        final long resourceInstanceId, final java.util.Date startTime,
        final java.util.Date endTime) throws Exception;

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
     */
    public com.ourteam.resource.domain.ResourceBookingBean[] getResourceInstanceBookings(
        final long resourceInstanceId, final java.util.Date startTime,
        final java.util.Date endTime) throws Exception {
        try {
            if (startTime == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [startTime] Value is NULL");
            } // end if

            if (endTime == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [endTime] Value is NULL");
            } // end if

            com.ourteam.resource.domain.ResourceBookingBean[] result = doGetResourceInstanceBookings(resourceInstanceId,
                    startTime, endTime);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getResourceInstanceBookings error", e);
            throw e;
        } // end catch
    } // end getResourceInstanceBookings()
} // end AbstractResourceService
