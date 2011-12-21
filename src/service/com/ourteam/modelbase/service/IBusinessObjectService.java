/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

/**
*  ҵ��������
*  Generated Date 2011-06-29 10:03:55   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IBusinessObjectService {
    /**
     * �������ȡ��ҵ������б�
     *
     * @param aPackageId
     * @param aBusinessObjectType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessObjectBean[] getBusinessObjectsByType(
        final long aPackageId,
        final com.ourteam.modelbase.domain.BusinessObjectTypeEnum aBusinessObjectType)
        throws Exception;

    /**
     * ȡ�ö��������б�
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectPropertyBean[] getBusinessObjectProperties(
        final long aObjectId) throws Exception;

    /**
     * ȡ�÷������б�
     *
     * @param aServiceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ServiceFunctionBean[] getServiceFunctions(
        final long aServiceId) throws Exception;

    /**
     * ����־ö���
     *
     * @param aPersistentPackageId
     * @param aTables
     *
     * @throws Exception
     *
     * @model
     */
    void importPersistentObjects(final long aPersistentPackageId,
        final org.apache.ddlutils.model.Table[] aTables)
        throws Exception;

    /**
     * ȡ�ó־ö���ӳ���ҵ������б�
     *
     * @param aPersistentObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessObjectBean[] getPersistentObjectMappedBusinessObjects(
        final long aPersistentObjectId) throws Exception;

    /**
     * ȡ�ó־����Գ����б�
     *
     * @param aPersistentPropertyId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.PersistentPropertyConstValueBean[] getPersistentPropertyConstValues(
        final long aPersistentPropertyId) throws Exception;

    /**
     * ��ӳ־ö������Գ���ֵ
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     *
     * @model
     */
    void addPersistentPropertyConstValue(
        final com.ourteam.modelbase.domain.PersistentPropertyConstValueBean aPersistentPropertyConstValue)
        throws Exception;

    /**
     * ���IDȡ��ģ�Ͷ���
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessObjectBean getBusinessObjectById(
        final long aObjectId) throws Exception;

    /**
     * ɾ��־����Գ���ֵ
     *
     * @param aConstvalueId
     *
     * @throws Exception
     *
     * @model
     */
    void removePersistentPropertyConstValue(final long[] aConstvalueId)
        throws Exception;

    /**
     * �޸�ҵ�����
     *
     * @param aBusinessObject
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean aBusinessObject)
        throws Exception;

    /**
     * �޸�ҵ������
     *
     * @param aObjectProperty
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessObjectProperty(
        final com.ourteam.modelbase.domain.ObjectPropertyBean aObjectProperty)
        throws Exception;

    /**
     * ��ѯҵ�����
     *
     * @param aQueryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessObjectBean[] queryBusinessObjects(
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
     *
     * @model
     */
    int queryBusinessObjectCount(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean aQueryBean)
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
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationBean[] getBusinessObjectRelatedBusinessObjects(
        final long aBusinessObjctId,
        final com.ourteam.modelbase.domain.ObjectRelationTypeEnum objectRelationTypeEnum)
        throws Exception;

    /**
     * ���ҵ��������
     *
     * @param objectRelations
     *
     * @throws Exception
     *
     * @model
     */
    void addBusinessObjectRelations(
        final com.ourteam.modelbase.domain.ObjectRelationBean[] objectRelations)
        throws Exception;

    /**
     * ȥ�������ϵ
     *
     * @param objectRelationIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessObjectRelations(final long[] objectRelationIds)
        throws Exception;

    /**
     * �޸Ķ��������ϵ
     *
     * @param objectRelationBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessObjectRelation(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectRelationBean)
        throws Exception;

    /**
     * ��ѯҵ������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectPropertyBean[] queryBusinessProperties(
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
     *
     * @model
     */
    int queryBusinessPropertyCount(
        final com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean queryBean)
        throws Exception;

    /**
     * ȡ��ҵ������������
     *
     * @param relationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationAttrBean[] getBusinessObjectRelatedProperties(
        final long relationId) throws Exception;

    /**
     * ����ҵ�������չ��Ϣ
     *
     * @param objectRelationBean
     *
     * @throws Exception
     *
     * @model
     */
    void setBusinessObjectExtension(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectRelationBean)
        throws Exception;

    /**
     * ȡ��ҵ�������չ��Ϣ
     *
     * @param businessObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationBean getBusinessObjectExtension(
        final long businessObjectId) throws Exception;

    /**
     * ɾ�������չ��Ϣ
     *
     * @param objectId
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessObjectExtension(final long objectId)
        throws Exception;

    /**
     * ȡ��ҵ�����ӳ��ĳ־ò����
     *
     * @param aBusinessObjctId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationBean getBusinessObjectMappedPersistentObject(
        final long aBusinessObjctId) throws Exception;

    /**
     * ����ҵ�����ӳ��
     *
     * @param objectMapping
     *
     * @throws Exception
     *
     * @model
     */
    void setBusinessObjectMappedPersistentObject(
        final com.ourteam.modelbase.domain.ObjectRelationBean objectMapping)
        throws Exception;

    /**
     * ɾ��ҵ�����ӳ���ϵ
     *
     * @param objectId
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessObjectMappedPersistentObject(final long objectId)
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
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessObjectActionBean[] getBusinessObjectActions(
        final long objectId,
        final com.ourteam.modelbase.domain.ObjectActionEnumType actionEnumType)
        throws Exception;

    /**
     * ���ҵ�������
     *
     * @param businessObjectAction
     *
     * @throws Exception
     *
     * @model
     */
    void addBusinessObjectAction(
        final com.ourteam.modelbase.domain.BusinessObjectActionBean businessObjectAction)
        throws Exception;

    /**
     * ɾ��ҵ�������
     *
     * @param businessObjectActionId
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessObjectActions(final long[] businessObjectActionId)
        throws Exception;

    /**
     * �޸�ҵ�������
     *
     * @param businessObjectAction
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessObjectAction(
        final com.ourteam.modelbase.domain.BusinessObjectActionBean businessObjectAction)
        throws Exception;

    /**
     * �޸ĳ־����Գ���
     *
     * @param aPersistentPropertyConstValueBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyPersistentPropertyConstValue(
        final com.ourteam.modelbase.domain.PersistentPropertyConstValueBean aPersistentPropertyConstValueBean)
        throws Exception;

    /**
     * ȡ�ö���ӳ���ϵ����
     *
     * @param relationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationAttrBean[] getBusinessObjectMappedProperties(
        final long relationId) throws Exception;

    /**
     * ȡ��δӳ�������
     *
     * @param aObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectPropertyBean[] getBusinessObjectNotMappedProperties(
        final long aObjectId) throws Exception;

    /**
     * ȡ���������ϵ�ҵ�����
     *
     * @param aBeanObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationBean[] getBeanObjectCompoundedBusinessObjects(
        final long aBeanObjectId) throws Exception;

    /**
     * ȡ�÷������������ҵ�����
     *
     * @param aServiceObjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationBean[] getServiceObjectDependedBusinessObjects(
        final long aServiceObjectId) throws Exception;

    /**
     * �޸ķ��񷽷�
     *
     * @param serviceFunctionBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyServiceFunction(
        final com.ourteam.modelbase.domain.ServiceFunctionBean serviceFunctionBean)
        throws Exception;

    /**
     * ȡ�÷����������
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ServiceParameterBean getServiceOutputParameter(
        final long serviceFunctionId) throws Exception;

    /**
     * ȡ�÷�����������б�
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ServiceParameterBean[] getServiceInputParameters(
        final long serviceFunctionId) throws Exception;

    /**
     * ���÷����������
     *
     * @param serviceFunctionId
     * @param serviceParameterBean
     *
     * @throws Exception
     *
     * @model
     */
    void setServiceOutputParameter(final long serviceFunctionId,
        final com.ourteam.modelbase.domain.ServiceParameterBean serviceParameterBean)
        throws Exception;

    /**
     * ���÷�����������б�
     *
     * @param serviceFunctionId
     * @param serviceParameterBeans
     *
     * @throws Exception
     *
     * @model
     */
    void setServiceInputParameters(final long serviceFunctionId,
        final com.ourteam.modelbase.domain.ServiceParameterBean[] serviceParameterBeans)
        throws Exception;

    /**
     * ���ҵ�����
     *
     * @param businessObjectBean
     *
     * @throws Exception
     *
     * @model
     */
    void addNewBusinessObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean businessObjectBean)
        throws Exception;

    /**
     * ���ҵ������
     *
     * @param objectPropertyBean
     *
     * @throws Exception
     *
     * @model
     */
    void addNewBusinessObjectProperties(
        final com.ourteam.modelbase.domain.ObjectPropertyBean[] objectPropertyBean)
        throws Exception;

    /**
     * ɾ��ҵ�����
     *
     * @param businessObjectId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessObject(final long businessObjectId)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param businessObjectPropertyId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessObjectProperty(final long businessObjectPropertyId)
        throws Exception;

    /**
     * �������IDȡ�����Զ���
     *
     * @param propertyId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectPropertyBean getBusinessObjectPropertyById(
        final long propertyId) throws Exception;

    /**
     * ���IDȡ�ù�������
     *
     * @param objectRelationId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationBean getBusinessObjectRelationById(
        final long objectRelationId) throws Exception;

    /**
     * ��ӷ��񷽷�
     *
     * @param serviceFunctionBean
     *
     * @throws Exception
     *
     * @model
     */
    void addNewServiceFunction(
        final com.ourteam.modelbase.domain.ServiceFunctionBean serviceFunctionBean)
        throws Exception;

    /**
     * ���idȡ�÷��񷽷�
     *
     * @param serviceFunctionId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.ServiceFunctionBean getServiceFunctionById(
        final long serviceFunctionId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param serviceFunctionId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteServiceFunction(final long serviceFunctionId)
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
     *
     * @model
     */
    com.ourteam.modelbase.domain.ObjectRelationBean[] getBusinessObjectBeRefrencedRelations(
        final long businessObjectId,
        final com.ourteam.modelbase.domain.BusinessObjectTypeEnum[] businessObjectTypeEnums,
        final com.ourteam.modelbase.domain.ObjectRelationTypeEnum[] objectRelationTypeEnums)
        throws Exception;

    /**
     * ȡ���Զ����������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessObjectBean[] queryCustomDataObjects(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean queryBean)
        throws Exception;

    /**
     * ����Զ����������
     *
     * @param customDataObject
     *
     * @throws Exception
     *
     * @model
     */
    void addNewCustomDataObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean customDataObject)
        throws Exception;

    /**
     * �޸��Զ����������
     *
     * @param customDataObject
     *
     * @throws Exception
     *
     * @model
     */
    void modifyCustomDataObject(
        final com.ourteam.modelbase.domain.BusinessObjectBean customDataObject)
        throws Exception;

    /**
     * ɾ���Զ����������
     *
     * @param customDataObjectIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCustomDataObjects(final long[] customDataObjectIds)
        throws Exception;

    /**
     * ����Զ����������״̬
     *
     * @param customDataObjectIds
     * @param statusEnum
     *
     * @throws Exception
     *
     * @model
     */
    void changeCustomDataObjectStatus(final long[] customDataObjectIds,
        final com.ourteam.modelbase.domain.CustomDataObjectStatusEnum statusEnum)
        throws Exception;

    /**
     * ��ѯ�Զ��������������
     *
     * @param querybean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int queryCustomDataObjectCount(
        final com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean querybean)
        throws Exception;

    /**
     * ͨ��ҵ���IDȡ��ҵ�����
     *
     * @param packageIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessObjectBean[] getBusinessObjectsByPackageId(
        final long[] packageIds) throws Exception;
} // end IBusinessObjectService
