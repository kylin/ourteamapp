/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ҵ�������� Generated Date 2011-06-29 10:04:06
 *
 * @author Auto Gen
 */
abstract class AbstractBusinessObjectService extends net.service.DefaultServiceImpl
    implements IBusinessObjectService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractBusinessObjectService.class);

    /** BusinessObject DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessObjectDAO businessObjectDao;

    /** ObjectProperty DAO Instance */
    protected com.ourteam.modelbase.dao.IObjectPropertyDAO objectPropertyDao;

    /** ServiceFunction DAO Instance */
    protected com.ourteam.modelbase.dao.IServiceFunctionDAO serviceFunctionDao;

    /** PersistentPropertyConstValue DAO Instance */
    protected com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO persistentPropertyConstValueDao;

    /** ObjectRelation DAO Instance */
    protected com.ourteam.modelbase.dao.IObjectRelationDAO objectRelationDao;

    /** ObjectRelationAttr DAO Instance */
    protected com.ourteam.modelbase.dao.IObjectRelationAttrDAO objectRelationAttrDao;

    /** BusinessObjectAction DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessObjectActionDAO businessObjectActionDao;

    /** ServiceParameter DAO Instance */
    protected com.ourteam.modelbase.dao.IServiceParameterDAO serviceParameterDao;

    /** BusinessPackage DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessPackageDAO businessPackageDao;

    /**
     * Get BusinessObject DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessObjectDAO getBusinessObjectDao() {
        return businessObjectDao;
    } // end getBusinessObjectDao()

    /**
     * Set BusinessObject DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessObjectDao(
        com.ourteam.modelbase.dao.IBusinessObjectDAO aDao) {
        businessObjectDao = aDao;
    } // end setBusinessObjectDao()

    /**
     * Get ObjectProperty DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IObjectPropertyDAO getObjectPropertyDao() {
        return objectPropertyDao;
    } // end getObjectPropertyDao()

    /**
     * Set ObjectProperty DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setObjectPropertyDao(
        com.ourteam.modelbase.dao.IObjectPropertyDAO aDao) {
        objectPropertyDao = aDao;
    } // end setObjectPropertyDao()

    /**
     * Get ServiceFunction DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IServiceFunctionDAO getServiceFunctionDao() {
        return serviceFunctionDao;
    } // end getServiceFunctionDao()

    /**
     * Set ServiceFunction DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setServiceFunctionDao(
        com.ourteam.modelbase.dao.IServiceFunctionDAO aDao) {
        serviceFunctionDao = aDao;
    } // end setServiceFunctionDao()

    /**
     * Get PersistentPropertyConstValue DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO getPersistentPropertyConstValueDao() {
        return persistentPropertyConstValueDao;
    } // end getPersistentPropertyConstValueDao()

    /**
     * Set PersistentPropertyConstValue DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setPersistentPropertyConstValueDao(
        com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO aDao) {
        persistentPropertyConstValueDao = aDao;
    } // end setPersistentPropertyConstValueDao()

    /**
     * Get ObjectRelation DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IObjectRelationDAO getObjectRelationDao() {
        return objectRelationDao;
    } // end getObjectRelationDao()

    /**
     * Set ObjectRelation DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setObjectRelationDao(
        com.ourteam.modelbase.dao.IObjectRelationDAO aDao) {
        objectRelationDao = aDao;
    } // end setObjectRelationDao()

    /**
     * Get ObjectRelationAttr DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IObjectRelationAttrDAO getObjectRelationAttrDao() {
        return objectRelationAttrDao;
    } // end getObjectRelationAttrDao()

    /**
     * Set ObjectRelationAttr DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setObjectRelationAttrDao(
        com.ourteam.modelbase.dao.IObjectRelationAttrDAO aDao) {
        objectRelationAttrDao = aDao;
    } // end setObjectRelationAttrDao()

    /**
     * Get BusinessObjectAction DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessObjectActionDAO getBusinessObjectActionDao() {
        return businessObjectActionDao;
    } // end getBusinessObjectActionDao()

    /**
     * Set BusinessObjectAction DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessObjectActionDao(
        com.ourteam.modelbase.dao.IBusinessObjectActionDAO aDao) {
        businessObjectActionDao = aDao;
    } // end setBusinessObjectActionDao()

    /**
     * Get ServiceParameter DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IServiceParameterDAO getServiceParameterDao() {
        return serviceParameterDao;
    } // end getServiceParameterDao()

    /**
     * Set ServiceParameter DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setServiceParameterDao(
        com.ourteam.modelbase.dao.IServiceParameterDAO aDao) {
        serviceParameterDao = aDao;
    } // end setServiceParameterDao()

    /**
     * Get BusinessPackage DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessPackageDAO getBusinessPackageDao() {
        return businessPackageDao;
    } // end getBusinessPackageDao()

    /**
     * Set BusinessPackage DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessPackageDao(
        com.ourteam.modelbase.dao.IBusinessPackageDAO aDao) {
        businessPackageDao = aDao;
    } // end setBusinessPackageDao()

    /**
     * �������ȡ��ҵ������б�
     *
     * @param aPackageId
     * @param aBusinessObjectType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessObjectBean[] doGetBusinessObjectsByType(
        final long aPackageId,
        final com.ourteam.modelbase.domain.BusinessObjectTypeEnum aBusinessObjectType)
        throws Exception;

    /**
     * �������ȡ��ҵ������б�
     *
     * @param aPackageId
     * @param aBusinessObjectType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessObjectBean[] getBusinessObjectsByType(
        final long aPackageId,
        final com.ourteam.modelbase.domain.BusinessObjectTypeEnum aBusinessObjectType)
        throws Exception {
        try {
            if (aBusinessObjectType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aBusinessObjectType] Value is NULL");
            } // end if

            com.ourteam.modelbase.domain.BusinessObjectBean[] result = doGetBusinessObjectsByType(aPackageId,
                    aBusinessObjectType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectsByType error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectsByType()

    /**
     * ȡ�ö��������б�
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectPropertyBean[] doGetBusinessObjectProperties(
        final long aObjectId) throws Exception;

    /**
     * ȡ�ö��������б�
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectPropertyBean[] getBusinessObjectProperties(
        final long aObjectId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectPropertyBean[] result = doGetBusinessObjectProperties(aObjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectProperties error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectProperties()

    /**
     * ȡ�÷������б�
     *
     * @param aServiceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ServiceFunctionBean[] doGetServiceFunctions(
        final long aServiceId) throws Exception;

    /**
     * ȡ�÷������б�
     *
     * @param aServiceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ServiceFunctionBean[] getServiceFunctions(
        final long aServiceId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ServiceFunctionBean[] result = doGetServiceFunctions(aServiceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getServiceFunctions error", e);
            throw e;
        } // end catch
    } // end getServiceFunctions()

    /**
     * ����־ö���
     *
     * @param aPersistentPackageId
     * @param aTables
     *
     * @throws Exception
     */
    protected abstract void doImportPersistentObjects(
        final long aPersistentPackageId,
        final org.apache.ddlutils.model.Table[] aTables)
        throws Exception;

    /**
     * ����־ö���
     *
     * @param aPersistentPackageId
     * @param aTables
     *
     * @throws Exception
     */
    public void importPersistentObjects(final long aPersistentPackageId,
        final org.apache.ddlutils.model.Table[] aTables)
        throws Exception {
        try {
            if (aTables == null) {
                logger.warn("The Parameter [aTables] Value is NULL,Exit");

                return;
            } // end if

            doImportPersistentObjects(aPersistentPackageId, aTables);
        } // end try
        catch (Exception e) {
            logger.error("do importPersistentObjects error", e);
            throw e;
        } // end catch
    } // end importPersistentObjects()

    /**
     * ȡ�ó־ö���ӳ���ҵ������б�
     *
     * @param aPersistentObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessObjectBean[] doGetPersistentObjectMappedBusinessObjects(
        final long aPersistentObjectId) throws Exception;

    /**
     * ȡ�ó־ö���ӳ���ҵ������б�
     *
     * @param aPersistentObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessObjectBean[] getPersistentObjectMappedBusinessObjects(
        final long aPersistentObjectId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessObjectBean[] result = doGetPersistentObjectMappedBusinessObjects(aPersistentObjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getPersistentObjectMappedBusinessObjects error", e);
            throw e;
        } // end catch
    } // end getPersistentObjectMappedBusinessObjects()

    /**
     * ȡ�ó־����Գ����б�
     *
     * @param aPersistentPropertyId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.PersistentPropertyConstValueBean[] doGetPersistentPropertyConstValues(
        final long aPersistentPropertyId) throws Exception;

    /**
     * ȡ�ó־����Գ����б�
     *
     * @param aPersistentPropertyId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.PersistentPropertyConstValueBean[] getPersistentPropertyConstValues(
        final long aPersistentPropertyId) throws Exception {
        try {
            com.ourteam.modelbase.domain.PersistentPropertyConstValueBean[] result =
                doGetPersistentPropertyConstValues(aPersistentPropertyId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getPersistentPropertyConstValues error", e);
            throw e;
        } // end catch
    } // end getPersistentPropertyConstValues()

    /**
     * ��ӳ־ö������Գ���ֵ
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     */
    protected abstract void doAddPersistentPropertyConstValue(
        final com.ourteam.modelbase.domain.PersistentPropertyConstValueBean aPersistentPropertyConstValue)
        throws Exception;

    /**
     * ��ӳ־ö������Գ���ֵ
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     */
    public void addPersistentPropertyConstValue(
        final com.ourteam.modelbase.domain.PersistentPropertyConstValueBean aPersistentPropertyConstValue)
        throws Exception {
        try {
            if (aPersistentPropertyConstValue == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aPersistentPropertyConstValue] Value is NULL");
            } // end if

            doAddPersistentPropertyConstValue(aPersistentPropertyConstValue);
        } // end try
        catch (Exception e) {
            logger.error("do addPersistentPropertyConstValue error", e);
            throw e;
        } // end catch
    } // end addPersistentPropertyConstValue()

    /**
     * ���IDȡ��ģ�Ͷ���
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessObjectBean doGetBusinessObjectById(
        final long aObjectId) throws Exception;

    /**
     * ���IDȡ��ģ�Ͷ���
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessObjectBean getBusinessObjectById(
        final long aObjectId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessObjectBean result = doGetBusinessObjectById(aObjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectById error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectById()

    /**
     * ɾ��־����Գ���ֵ
     *
     * @param aConstvalueId
     *
     * @throws Exception
     */
    protected abstract void doRemovePersistentPropertyConstValue(
        final long[] aConstvalueId) throws Exception;

    /**
     * ɾ��־����Գ���ֵ
     *
     * @param aConstvalueId
     *
     * @throws Exception
     */
    public void removePersistentPropertyConstValue(final long[] aConstvalueId)
        throws Exception {
        try {
            doRemovePersistentPropertyConstValue(aConstvalueId);
        } // end try
        catch (Exception e) {
            logger.error("do removePersistentPropertyConstValue error", e);
            throw e;
        } // end catch
    } // end removePersistentPropertyConstValue()

    /**
     * �޸�ҵ�����
     *
     * @param aBusinessObject
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean aBusinessObject)
        throws Exception;

    /**
     * �޸�ҵ�����
     *
     * @param aBusinessObject
     *
     * @throws Exception
     */
    public void modifyBusinessObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean aBusinessObject)
        throws Exception {
        try {
            if (aBusinessObject == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aBusinessObject] Value is NULL");
            } // end if

            doModifyBusinessObject(aBusinessObject);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessObject error", e);
            throw e;
        } // end catch
    } // end modifyBusinessObject()

    /**
     * �޸�ҵ������
     *
     * @param aObjectProperty
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessObjectProperty(
        final com.ourteam.modelbase.domain.ObjectPropertyBean aObjectProperty)
        throws Exception;

    /**
     * �޸�ҵ������
     *
     * @param aObjectProperty
     *
     * @throws Exception
     */
    public void modifyBusinessObjectProperty(
        final com.ourteam.modelbase.domain.ObjectPropertyBean aObjectProperty)
        throws Exception {
        try {
            if (aObjectProperty == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aObjectProperty] Value is NULL");
            } // end if

            doModifyBusinessObjectProperty(aObjectProperty);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessObjectProperty error", e);
            throw e;
        } // end catch
    } // end modifyBusinessObjectProperty()

    /**
     * ��ѯҵ�����
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessObjectBean[] doQueryBusinessObjects(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * ��ѯҵ�����
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessObjectBean[] queryBusinessObjects(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean aQueryBean)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessObjectBean[] result = doQueryBusinessObjects(aQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessObjects error", e);
            throw e;
        } // end catch
    } // end queryBusinessObjects()

    /**
     * ��ѯҵ���������
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryBusinessObjectCount(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * ��ѯҵ���������
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryBusinessObjectCount(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean aQueryBean)
        throws Exception {
        try {
            int result = doQueryBusinessObjectCount(aQueryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessObjectCount error", e);
            throw e;
        } // end catch
    } // end queryBusinessObjectCount()

    /**
     * ȡ��ҵ����������ҵ�����
     *
     * @param aBusinessObjctId
     * @param objectRelationTypeEnum
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationBean[] doGetBusinessObjectRelatedBusinessObjects(
        final long aBusinessObjctId,
        final com.ourteam.modelbase.domain.ObjectRelationTypeEnum objectRelationTypeEnum)
        throws Exception;

    /**
     * ȡ��ҵ����������ҵ�����
     *
     * @param aBusinessObjctId
     * @param objectRelationTypeEnum
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationBean[] getBusinessObjectRelatedBusinessObjects(
        final long aBusinessObjctId,
        final com.ourteam.modelbase.domain.ObjectRelationTypeEnum objectRelationTypeEnum)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationBean[] result = doGetBusinessObjectRelatedBusinessObjects(aBusinessObjctId,
                    objectRelationTypeEnum);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectRelatedBusinessObjects error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectRelatedBusinessObjects()

    /**
     * ���ҵ��������
     *
     * @param objectRelations
     *
     * @throws Exception
     */
    protected abstract void doAddBusinessObjectRelations(
        final com.ourteam.modelbase.domain.ObjectRelationBean[] objectRelations)
        throws Exception;

    /**
     * ���ҵ��������
     *
     * @param objectRelations
     *
     * @throws Exception
     */
    public void addBusinessObjectRelations(
        final com.ourteam.modelbase.domain.ObjectRelationBean[] objectRelations)
        throws Exception {
        try {
            if (objectRelations == null) {
                logger.warn(
                    "The Parameter [objectRelations] Value is NULL,Exit");

                return;
            } // end if

            doAddBusinessObjectRelations(objectRelations);
        } // end try
        catch (Exception e) {
            logger.error("do addBusinessObjectRelations error", e);
            throw e;
        } // end catch
    } // end addBusinessObjectRelations()

    /**
     * ȥ�������ϵ
     *
     * @param objectRelationIds
     *
     * @throws Exception
     */
    protected abstract void doRemoveBusinessObjectRelations(
        final long[] objectRelationIds) throws Exception;

    /**
     * ȥ�������ϵ
     *
     * @param objectRelationIds
     *
     * @throws Exception
     */
    public void removeBusinessObjectRelations(final long[] objectRelationIds)
        throws Exception {
        try {
            doRemoveBusinessObjectRelations(objectRelationIds);
        } // end try
        catch (Exception e) {
            logger.error("do removeBusinessObjectRelations error", e);
            throw e;
        } // end catch
    } // end removeBusinessObjectRelations()

    /**
     * �޸Ķ��������ϵ
     *
     * @param objectRelationBean
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessObjectRelation(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectRelationBean)
        throws Exception;

    /**
     * �޸Ķ��������ϵ
     *
     * @param objectRelationBean
     *
     * @throws Exception
     */
    public void modifyBusinessObjectRelation(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectRelationBean)
        throws Exception {
        try {
            if (objectRelationBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [objectRelationBean] Value is NULL");
            } // end if

            doModifyBusinessObjectRelation(objectRelationBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessObjectRelation error", e);
            throw e;
        } // end catch
    } // end modifyBusinessObjectRelation()

    /**
     * ��ѯҵ������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectPropertyBean[] doQueryBusinessProperties(
        final com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean queryBean)
        throws Exception;

    /**
     * ��ѯҵ������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectPropertyBean[] queryBusinessProperties(
        final com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectPropertyBean[] result = doQueryBusinessProperties(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessProperties error", e);
            throw e;
        } // end catch
    } // end queryBusinessProperties()

    /**
     * ��ѯҵ����������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryBusinessPropertyCount(
        final com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean queryBean)
        throws Exception;

    /**
     * ��ѯҵ����������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryBusinessPropertyCount(
        final com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryBusinessPropertyCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessPropertyCount error", e);
            throw e;
        } // end catch
    } // end queryBusinessPropertyCount()

    /**
     * ȡ��ҵ������������
     *
     * @param relationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationAttrBean[] doGetBusinessObjectRelatedProperties(
        final long relationId) throws Exception;

    /**
     * ȡ��ҵ������������
     *
     * @param relationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationAttrBean[] getBusinessObjectRelatedProperties(
        final long relationId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationAttrBean[] result = doGetBusinessObjectRelatedProperties(relationId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectRelatedProperties error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectRelatedProperties()

    /**
     * ����ҵ�������չ��Ϣ
     *
     * @param objectRelationBean
     *
     * @throws Exception
     */
    protected abstract void doSetBusinessObjectExtension(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectRelationBean)
        throws Exception;

    /**
     * ����ҵ�������չ��Ϣ
     *
     * @param objectRelationBean
     *
     * @throws Exception
     */
    public void setBusinessObjectExtension(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectRelationBean)
        throws Exception {
        try {
            if (objectRelationBean == null) {
                logger.warn(
                    "The Parameter [objectRelationBean] Value is NULL,Exit");

                return;
            } // end if

            doSetBusinessObjectExtension(objectRelationBean);
        } // end try
        catch (Exception e) {
            logger.error("do setBusinessObjectExtension error", e);
            throw e;
        } // end catch
    } // end setBusinessObjectExtension()

    /**
     * ȡ��ҵ�������չ��Ϣ
     *
     * @param businessObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationBean doGetBusinessObjectExtension(
        final long businessObjectId) throws Exception;

    /**
     * ȡ��ҵ�������չ��Ϣ
     *
     * @param businessObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationBean getBusinessObjectExtension(
        final long businessObjectId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationBean result = doGetBusinessObjectExtension(businessObjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectExtension error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectExtension()

    /**
     * ɾ�������չ��Ϣ
     *
     * @param objectId
     *
     * @throws Exception
     */
    protected abstract void doRemoveBusinessObjectExtension(final long objectId)
        throws Exception;

    /**
     * ɾ�������չ��Ϣ
     *
     * @param objectId
     *
     * @throws Exception
     */
    public void removeBusinessObjectExtension(final long objectId)
        throws Exception {
        try {
            doRemoveBusinessObjectExtension(objectId);
        } // end try
        catch (Exception e) {
            logger.error("do removeBusinessObjectExtension error", e);
            throw e;
        } // end catch
    } // end removeBusinessObjectExtension()

    /**
     * ȡ��ҵ�����ӳ��ĳ־ò����
     *
     * @param aBusinessObjctId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationBean doGetBusinessObjectMappedPersistentObject(
        final long aBusinessObjctId) throws Exception;

    /**
     * ȡ��ҵ�����ӳ��ĳ־ò����
     *
     * @param aBusinessObjctId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationBean getBusinessObjectMappedPersistentObject(
        final long aBusinessObjctId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationBean result = doGetBusinessObjectMappedPersistentObject(aBusinessObjctId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectMappedPersistentObject error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectMappedPersistentObject()

    /**
     * ����ҵ�����ӳ��
     *
     * @param objectMapping
     *
     * @throws Exception
     */
    protected abstract void doSetBusinessObjectMappedPersistentObject(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectMapping)
        throws Exception;

    /**
     * ����ҵ�����ӳ��
     *
     * @param objectMapping
     *
     * @throws Exception
     */
    public void setBusinessObjectMappedPersistentObject(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectMapping)
        throws Exception {
        try {
            doSetBusinessObjectMappedPersistentObject(objectMapping);
        } // end try
        catch (Exception e) {
            logger.error("do setBusinessObjectMappedPersistentObject error", e);
            throw e;
        } // end catch
    } // end setBusinessObjectMappedPersistentObject()

    /**
     * ɾ��ҵ�����ӳ���ϵ
     *
     * @param objectId
     *
     * @throws Exception
     */
    protected abstract void doRemoveBusinessObjectMappedPersistentObject(
        final long objectId) throws Exception;

    /**
     * ɾ��ҵ�����ӳ���ϵ
     *
     * @param objectId
     *
     * @throws Exception
     */
    public void removeBusinessObjectMappedPersistentObject(final long objectId)
        throws Exception {
        try {
            doRemoveBusinessObjectMappedPersistentObject(objectId);
        } // end try
        catch (Exception e) {
            logger.error("do removeBusinessObjectMappedPersistentObject error",
                e);
            throw e;
        } // end catch
    } // end removeBusinessObjectMappedPersistentObject()

    /**
     * ȡ��ҵ�������
     *
     * @param objectId
     * @param actionEnumType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessObjectActionBean[] doGetBusinessObjectActions(
        final long objectId,
        final com.ourteam.modelbase.domain.ObjectActionEnumType actionEnumType)
        throws Exception;

    /**
     * ȡ��ҵ�������
     *
     * @param objectId
     * @param actionEnumType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessObjectActionBean[] getBusinessObjectActions(
        final long objectId,
        final com.ourteam.modelbase.domain.ObjectActionEnumType actionEnumType)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessObjectActionBean[] result = doGetBusinessObjectActions(objectId,
                    actionEnumType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectActions error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectActions()

    /**
     * ���ҵ�������
     *
     * @param businessObjectAction
     *
     * @throws Exception
     */
    protected abstract void doAddBusinessObjectAction(
        final com.ourteam.modelbase.domain.BusinessObjectActionBean businessObjectAction)
        throws Exception;

    /**
     * ���ҵ�������
     *
     * @param businessObjectAction
     *
     * @throws Exception
     */
    public void addBusinessObjectAction(
        final com.ourteam.modelbase.domain.BusinessObjectActionBean businessObjectAction)
        throws Exception {
        try {
            if (businessObjectAction == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessObjectAction] Value is NULL");
            } // end if

            doAddBusinessObjectAction(businessObjectAction);
        } // end try
        catch (Exception e) {
            logger.error("do addBusinessObjectAction error", e);
            throw e;
        } // end catch
    } // end addBusinessObjectAction()

    /**
     * ɾ��ҵ�������
     *
     * @param businessObjectActionId
     *
     * @throws Exception
     */
    protected abstract void doRemoveBusinessObjectActions(
        final long[] businessObjectActionId) throws Exception;

    /**
     * ɾ��ҵ�������
     *
     * @param businessObjectActionId
     *
     * @throws Exception
     */
    public void removeBusinessObjectActions(final long[] businessObjectActionId)
        throws Exception {
        try {
            doRemoveBusinessObjectActions(businessObjectActionId);
        } // end try
        catch (Exception e) {
            logger.error("do removeBusinessObjectActions error", e);
            throw e;
        } // end catch
    } // end removeBusinessObjectActions()

    /**
     * �޸�ҵ�������
     *
     * @param businessObjectAction
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessObjectAction(
        final com.ourteam.modelbase.domain.BusinessObjectActionBean businessObjectAction)
        throws Exception;

    /**
     * �޸�ҵ�������
     *
     * @param businessObjectAction
     *
     * @throws Exception
     */
    public void modifyBusinessObjectAction(
        final com.ourteam.modelbase.domain.BusinessObjectActionBean businessObjectAction)
        throws Exception {
        try {
            if (businessObjectAction == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessObjectAction] Value is NULL");
            } // end if

            doModifyBusinessObjectAction(businessObjectAction);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessObjectAction error", e);
            throw e;
        } // end catch
    } // end modifyBusinessObjectAction()

    /**
     * �޸ĳ־����Գ���
     *
     * @param aPersistentPropertyConstValueBean
     *
     * @throws Exception
     */
    protected abstract void doModifyPersistentPropertyConstValue(
        final com.ourteam.modelbase.domain.PersistentPropertyConstValueBean aPersistentPropertyConstValueBean)
        throws Exception;

    /**
     * �޸ĳ־����Գ���
     *
     * @param aPersistentPropertyConstValueBean
     *
     * @throws Exception
     */
    public void modifyPersistentPropertyConstValue(
        final com.ourteam.modelbase.domain.PersistentPropertyConstValueBean aPersistentPropertyConstValueBean)
        throws Exception {
        try {
            doModifyPersistentPropertyConstValue(aPersistentPropertyConstValueBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyPersistentPropertyConstValue error", e);
            throw e;
        } // end catch
    } // end modifyPersistentPropertyConstValue()

    /**
     * ȡ�ö���ӳ���ϵ����
     *
     * @param relationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationAttrBean[] doGetBusinessObjectMappedProperties(
        final long relationId) throws Exception;

    /**
     * ȡ�ö���ӳ���ϵ����
     *
     * @param relationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationAttrBean[] getBusinessObjectMappedProperties(
        final long relationId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationAttrBean[] result = doGetBusinessObjectMappedProperties(relationId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectMappedProperties error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectMappedProperties()

    /**
     * ȡ��δӳ�������
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectPropertyBean[] doGetBusinessObjectNotMappedProperties(
        final long aObjectId) throws Exception;

    /**
     * ȡ��δӳ�������
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectPropertyBean[] getBusinessObjectNotMappedProperties(
        final long aObjectId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectPropertyBean[] result = doGetBusinessObjectNotMappedProperties(aObjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectNotMappedProperties error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectNotMappedProperties()

    /**
     * ȡ���������ϵ�ҵ�����
     *
     * @param aBeanObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationBean[] doGetBeanObjectCompoundedBusinessObjects(
        final long aBeanObjectId) throws Exception;

    /**
     * ȡ���������ϵ�ҵ�����
     *
     * @param aBeanObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationBean[] getBeanObjectCompoundedBusinessObjects(
        final long aBeanObjectId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationBean[] result = doGetBeanObjectCompoundedBusinessObjects(aBeanObjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBeanObjectCompoundedBusinessObjects error", e);
            throw e;
        } // end catch
    } // end getBeanObjectCompoundedBusinessObjects()

    /**
     * ȡ�÷������������ҵ�����
     *
     * @param aServiceObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationBean[] doGetServiceObjectDependedBusinessObjects(
        final long aServiceObjectId) throws Exception;

    /**
     * ȡ�÷������������ҵ�����
     *
     * @param aServiceObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationBean[] getServiceObjectDependedBusinessObjects(
        final long aServiceObjectId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationBean[] result = doGetServiceObjectDependedBusinessObjects(aServiceObjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getServiceObjectDependedBusinessObjects error", e);
            throw e;
        } // end catch
    } // end getServiceObjectDependedBusinessObjects()

    /**
     * �޸ķ��񷽷�
     *
     * @param serviceFunctionBean
     *
     * @throws Exception
     */
    protected abstract void doModifyServiceFunction(
        final com.ourteam.modelbase.domain.ServiceFunctionBean serviceFunctionBean)
        throws Exception;

    /**
     * �޸ķ��񷽷�
     *
     * @param serviceFunctionBean
     *
     * @throws Exception
     */
    public void modifyServiceFunction(
        final com.ourteam.modelbase.domain.ServiceFunctionBean serviceFunctionBean)
        throws Exception {
        try {
            if (serviceFunctionBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [serviceFunctionBean] Value is NULL");
            } // end if

            doModifyServiceFunction(serviceFunctionBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyServiceFunction error", e);
            throw e;
        } // end catch
    } // end modifyServiceFunction()

    /**
     * ȡ�÷����������
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ServiceParameterBean doGetServiceOutputParameter(
        final long serviceFunctionId) throws Exception;

    /**
     * ȡ�÷����������
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ServiceParameterBean getServiceOutputParameter(
        final long serviceFunctionId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ServiceParameterBean result = doGetServiceOutputParameter(serviceFunctionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getServiceOutputParameter error", e);
            throw e;
        } // end catch
    } // end getServiceOutputParameter()

    /**
     * ȡ�÷�����������б�
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ServiceParameterBean[] doGetServiceInputParameters(
        final long serviceFunctionId) throws Exception;

    /**
     * ȡ�÷�����������б�
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ServiceParameterBean[] getServiceInputParameters(
        final long serviceFunctionId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ServiceParameterBean[] result = doGetServiceInputParameters(serviceFunctionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getServiceInputParameters error", e);
            throw e;
        } // end catch
    } // end getServiceInputParameters()

    /**
     * ���÷����������
     *
     * @param serviceFunctionId
     * @param serviceParameterBean
     *
     * @throws Exception
     */
    protected abstract void doSetServiceOutputParameter(
        final long serviceFunctionId,
        final com.ourteam.modelbase.domain.ServiceParameterBean serviceParameterBean)
        throws Exception;

    /**
     * ���÷����������
     *
     * @param serviceFunctionId
     * @param serviceParameterBean
     *
     * @throws Exception
     */
    public void setServiceOutputParameter(final long serviceFunctionId,
        final com.ourteam.modelbase.domain.ServiceParameterBean serviceParameterBean)
        throws Exception {
        try {
            doSetServiceOutputParameter(serviceFunctionId, serviceParameterBean);
        } // end try
        catch (Exception e) {
            logger.error("do setServiceOutputParameter error", e);
            throw e;
        } // end catch
    } // end setServiceOutputParameter()

    /**
     * ���÷�����������б�
     *
     * @param serviceFunctionId
     * @param serviceParameterBeans
     *
     * @throws Exception
     */
    protected abstract void doSetServiceInputParameters(
        final long serviceFunctionId,
        final com.ourteam.modelbase.domain.ServiceParameterBean[] serviceParameterBeans)
        throws Exception;

    /**
     * ���÷�����������б�
     *
     * @param serviceFunctionId
     * @param serviceParameterBeans
     *
     * @throws Exception
     */
    public void setServiceInputParameters(final long serviceFunctionId,
        final com.ourteam.modelbase.domain.ServiceParameterBean[] serviceParameterBeans)
        throws Exception {
        try {
            doSetServiceInputParameters(serviceFunctionId, serviceParameterBeans);
        } // end try
        catch (Exception e) {
            logger.error("do setServiceInputParameters error", e);
            throw e;
        } // end catch
    } // end setServiceInputParameters()

    /**
     * ���ҵ�����
     *
     * @param businessObjectBean
     *
     * @throws Exception
     */
    protected abstract void doAddNewBusinessObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean businessObjectBean)
        throws Exception;

    /**
     * ���ҵ�����
     *
     * @param businessObjectBean
     *
     * @throws Exception
     */
    public void addNewBusinessObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean businessObjectBean)
        throws Exception {
        try {
            if (businessObjectBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessObjectBean] Value is NULL");
            } // end if

            doAddNewBusinessObject(businessObjectBean);
        } // end try
        catch (Exception e) {
            logger.error("do addNewBusinessObject error", e);
            throw e;
        } // end catch
    } // end addNewBusinessObject()

    /**
     * ���ҵ������
     *
     * @param objectPropertyBean
     *
     * @throws Exception
     */
    protected abstract void doAddNewBusinessObjectProperties(
        final com.ourteam.modelbase.domain.ObjectPropertyBean[] objectPropertyBean)
        throws Exception;

    /**
     * ���ҵ������
     *
     * @param objectPropertyBean
     *
     * @throws Exception
     */
    public void addNewBusinessObjectProperties(
        final com.ourteam.modelbase.domain.ObjectPropertyBean[] objectPropertyBean)
        throws Exception {
        try {
            if (objectPropertyBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [objectPropertyBean] Value is NULL");
            } // end if

            doAddNewBusinessObjectProperties(objectPropertyBean);
        } // end try
        catch (Exception e) {
            logger.error("do addNewBusinessObjectProperties error", e);
            throw e;
        } // end catch
    } // end addNewBusinessObjectProperties()

    /**
     * ɾ��ҵ�����
     *
     * @param businessObjectId
     *
     * @throws Exception
     */
    protected abstract void doDeleteBusinessObject(final long businessObjectId)
        throws Exception;

    /**
     * ɾ��ҵ�����
     *
     * @param businessObjectId
     *
     * @throws Exception
     */
    public void deleteBusinessObject(final long businessObjectId)
        throws Exception {
        try {
            doDeleteBusinessObject(businessObjectId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBusinessObject error", e);
            throw e;
        } // end catch
    } // end deleteBusinessObject()

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessObjectPropertyId
     *
     * @throws Exception
     */
    protected abstract void doDeleteBusinessObjectProperty(
        final long businessObjectPropertyId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessObjectPropertyId
     *
     * @throws Exception
     */
    public void deleteBusinessObjectProperty(
        final long businessObjectPropertyId) throws Exception {
        try {
            doDeleteBusinessObjectProperty(businessObjectPropertyId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBusinessObjectProperty error", e);
            throw e;
        } // end catch
    } // end deleteBusinessObjectProperty()

    /**
     * �������IDȡ�����Զ���
     *
     * @param propertyId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectPropertyBean doGetBusinessObjectPropertyById(
        final long propertyId) throws Exception;

    /**
     * �������IDȡ�����Զ���
     *
     * @param propertyId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectPropertyBean getBusinessObjectPropertyById(
        final long propertyId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectPropertyBean result = doGetBusinessObjectPropertyById(propertyId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectPropertyById error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectPropertyById()

    /**
     * ���IDȡ�ù�������
     *
     * @param objectRelationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationBean doGetBusinessObjectRelationById(
        final long objectRelationId) throws Exception;

    /**
     * ���IDȡ�ù�������
     *
     * @param objectRelationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationBean getBusinessObjectRelationById(
        final long objectRelationId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationBean result = doGetBusinessObjectRelationById(objectRelationId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectRelationById error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectRelationById()

    /**
     * ��ӷ��񷽷�
     *
     * @param serviceFunctionBean
     *
     * @throws Exception
     */
    protected abstract void doAddNewServiceFunction(
        final com.ourteam.modelbase.domain.ServiceFunctionBean serviceFunctionBean)
        throws Exception;

    /**
     * ��ӷ��񷽷�
     *
     * @param serviceFunctionBean
     *
     * @throws Exception
     */
    public void addNewServiceFunction(
        final com.ourteam.modelbase.domain.ServiceFunctionBean serviceFunctionBean)
        throws Exception {
        try {
            if (serviceFunctionBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [serviceFunctionBean] Value is NULL");
            } // end if

            doAddNewServiceFunction(serviceFunctionBean);
        } // end try
        catch (Exception e) {
            logger.error("do addNewServiceFunction error", e);
            throw e;
        } // end catch
    } // end addNewServiceFunction()

    /**
     * ���idȡ�÷��񷽷�
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ServiceFunctionBean doGetServiceFunctionById(
        final long serviceFunctionId) throws Exception;

    /**
     * ���idȡ�÷��񷽷�
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ServiceFunctionBean getServiceFunctionById(
        final long serviceFunctionId) throws Exception {
        try {
            com.ourteam.modelbase.domain.ServiceFunctionBean result = doGetServiceFunctionById(serviceFunctionId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getServiceFunctionById error", e);
            throw e;
        } // end catch
    } // end getServiceFunctionById()

    /**
     * 
    DOCUMENT ME!
     *
     * @param serviceFunctionId
     *
     * @throws Exception
     */
    protected abstract void doDeleteServiceFunction(
        final long serviceFunctionId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param serviceFunctionId
     *
     * @throws Exception
     */
    public void deleteServiceFunction(final long serviceFunctionId)
        throws Exception {
        try {
            doDeleteServiceFunction(serviceFunctionId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteServiceFunction error", e);
            throw e;
        } // end catch
    } // end deleteServiceFunction()

    /**
     * ȡ�ö������õĹ�ϵ
     *
     * @param businessObjectId
     * @param businessObjectTypeEnums
     * @param objectRelationTypeEnums
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.ObjectRelationBean[] doGetBusinessObjectBeRefrencedRelations(
        final long businessObjectId,
        final com.ourteam.modelbase.domain.BusinessObjectTypeEnum[] businessObjectTypeEnums,
        final com.ourteam.modelbase.domain.ObjectRelationTypeEnum[] objectRelationTypeEnums)
        throws Exception;

    /**
     * ȡ�ö������õĹ�ϵ
     *
     * @param businessObjectId
     * @param businessObjectTypeEnums
     * @param objectRelationTypeEnums
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.ObjectRelationBean[] getBusinessObjectBeRefrencedRelations(
        final long businessObjectId,
        final com.ourteam.modelbase.domain.BusinessObjectTypeEnum[] businessObjectTypeEnums,
        final com.ourteam.modelbase.domain.ObjectRelationTypeEnum[] objectRelationTypeEnums)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.ObjectRelationBean[] result = doGetBusinessObjectBeRefrencedRelations(businessObjectId,
                    businessObjectTypeEnums, objectRelationTypeEnums);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectBeRefrencedRelations error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectBeRefrencedRelations()

    /**
     * ȡ���Զ����������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessObjectBean[] doQueryCustomDataObjects(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean queryBean)
        throws Exception;

    /**
     * ȡ���Զ����������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessObjectBean[] queryCustomDataObjects(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessObjectBean[] result = doQueryCustomDataObjects(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryCustomDataObjects error", e);
            throw e;
        } // end catch
    } // end queryCustomDataObjects()

    /**
     * ����Զ����������
     *
     * @param customDataObject
     *
     * @throws Exception
     */
    protected abstract void doAddNewCustomDataObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean customDataObject)
        throws Exception;

    /**
     * ����Զ����������
     *
     * @param customDataObject
     *
     * @throws Exception
     */
    public void addNewCustomDataObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean customDataObject)
        throws Exception {
        try {
            if (customDataObject == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [customDataObject] Value is NULL");
            } // end if

            doAddNewCustomDataObject(customDataObject);
        } // end try
        catch (Exception e) {
            logger.error("do addNewCustomDataObject error", e);
            throw e;
        } // end catch
    } // end addNewCustomDataObject()

    /**
     * �޸��Զ����������
     *
     * @param customDataObject
     *
     * @throws Exception
     */
    protected abstract void doModifyCustomDataObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean customDataObject)
        throws Exception;

    /**
     * �޸��Զ����������
     *
     * @param customDataObject
     *
     * @throws Exception
     */
    public void modifyCustomDataObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean customDataObject)
        throws Exception {
        try {
            if (customDataObject == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [customDataObject] Value is NULL");
            } // end if

            doModifyCustomDataObject(customDataObject);
        } // end try
        catch (Exception e) {
            logger.error("do modifyCustomDataObject error", e);
            throw e;
        } // end catch
    } // end modifyCustomDataObject()

    /**
     * ɾ���Զ����������
     *
     * @param customDataObjectIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteCustomDataObjects(
        final long[] customDataObjectIds) throws Exception;

    /**
     * ɾ���Զ����������
     *
     * @param customDataObjectIds
     *
     * @throws Exception
     */
    public void deleteCustomDataObjects(final long[] customDataObjectIds)
        throws Exception {
        try {
            doDeleteCustomDataObjects(customDataObjectIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteCustomDataObjects error", e);
            throw e;
        } // end catch
    } // end deleteCustomDataObjects()

    /**
     * ����Զ����������״̬
     *
     * @param customDataObjectIds
     * @param statusEnum
     *
     * @throws Exception
     */
    protected abstract void doChangeCustomDataObjectStatus(
        final long[] customDataObjectIds,
        final com.ourteam.modelbase.domain.CustomDataObjectStatusEnum statusEnum)
        throws Exception;

    /**
     * ����Զ����������״̬
     *
     * @param customDataObjectIds
     * @param statusEnum
     *
     * @throws Exception
     */
    public void changeCustomDataObjectStatus(final long[] customDataObjectIds,
        final com.ourteam.modelbase.domain.CustomDataObjectStatusEnum statusEnum)
        throws Exception {
        try {
            if (statusEnum == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [statusEnum] Value is NULL");
            } // end if

            doChangeCustomDataObjectStatus(customDataObjectIds, statusEnum);
        } // end try
        catch (Exception e) {
            logger.error("do changeCustomDataObjectStatus error", e);
            throw e;
        } // end catch
    } // end changeCustomDataObjectStatus()

    /**
     * ��ѯ�Զ��������������
     *
     * @param querybean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryCustomDataObjectCount(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean querybean)
        throws Exception;

    /**
     * ��ѯ�Զ��������������
     *
     * @param querybean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryCustomDataObjectCount(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean querybean)
        throws Exception {
        try {
            int result = doQueryCustomDataObjectCount(querybean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryCustomDataObjectCount error", e);
            throw e;
        } // end catch
    } // end queryCustomDataObjectCount()

    /**
     * ͨ��ҵ���IDȡ��ҵ�����
     *
     * @param packageIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessObjectBean[] doGetBusinessObjectsByPackageId(
        final long[] packageIds) throws Exception;

    /**
     * ͨ��ҵ���IDȡ��ҵ�����
     *
     * @param packageIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessObjectBean[] getBusinessObjectsByPackageId(
        final long[] packageIds) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessObjectBean[] result = doGetBusinessObjectsByPackageId(packageIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessObjectsByPackageId error", e);
            throw e;
        } // end catch
    } // end getBusinessObjectsByPackageId()
} // end AbstractBusinessObjectService
