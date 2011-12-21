/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysResourceDAO;
import com.ourteam.system.dao.SysResource;
import com.ourteam.system.dao.SysResourceDAOQueryBean;

import net.dao.AbstractJdbcDAO;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.ArrayUtils;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 系统资源 DAO JDBC Impl Generate Date : 2011-06-10 22:45:09
 *
 * @author Kylin
 */
abstract public class BaseSysResourceDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysResourceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DomainId, ParentResourceId, Remarks, ResourceCode, ResourceName,
            ResourceTypeId, Status, Sort, ResourceTitleKey, DomainTitleKey
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DomainId,
            DataProperty.ParentResourceId, DataProperty.Remarks,
            DataProperty.ResourceCode, DataProperty.ResourceName,
            DataProperty.ResourceTypeId, DataProperty.Status, DataProperty.Sort,
            DataProperty.ResourceTitleKey, DataProperty.DomainTitleKey
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { Id };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] { Id };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] {
            DomainId, ResourceCode, ResourceTypeId
        };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseSysResourceDAOJdbcImpl object.
     */
    public BaseSysResourceDAOJdbcImpl() {
        super();
    } // end BaseSysResourceDAOJdbcImpl()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getEntityName() {
        return EntityName;
    } // end getEntityName()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityFields() {
        return ENTITY_FIELDS;
    } // end getEntityFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityProperties() {
        return ENTITY_PROPERTIES;
    } // end getEntityProperties()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityPKFields() {
        return ENTITY_PK_FIELDS;
    } // end getEntityPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityAutoGenPKFields() {
        return ENTITY_AUTO_GEN_PK_FIELDS;
    } // end getEntityAutoGenPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityUniqueFields() {
        return ENTITY_UNIQUE_FIELDS;
    } // end getEntityUniqueFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getBaiscQueryFilter() {
        if (basicFilterSQL == null) {
            StringBuffer basicFilterSQLbuffer = new StringBuffer();

            basicFilterSQL = basicFilterSQLbuffer.toString();
        } // end if

        return basicFilterSQL;
    } // end getBaiscQueryFilter()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getRelatedJoinSQL() {
        if (relatedJoinSQL == null) {
            StringBuffer relatedJoinSQLBuffer = new StringBuffer();

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_DOMAIN resourceDomain ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " resourceDomain.ID = SYS_RESOURCE.DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysResource
     *
     * @param aSysResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysResource aSysResource)
        throws Exception {
        if (aSysResource == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysResource, DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aSysResource,
                DataProperty.DomainId));

        valueList.add(PropertyUtils.getProperty(aSysResource,
                DataProperty.ResourceCode));

        valueList.add(PropertyUtils.getProperty(aSysResource,
                DataProperty.ResourceTypeId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysResource
     *
     * @param aSysResource
     *
     * @throws Exception
     */
    public void insertSysResource(SysResource aSysResource)
        throws Exception {
        insert(aSysResource);
    } // end insertSysResource()

    /**
     * Batch Insert ISysResource
     *
     * @param aSysResource
     *
     * @throws Exception
     */
    public void batchInsertSysResource(SysResource[] aSysResource)
        throws Exception {
        batchInsert(aSysResource);
    } // end batchInsertSysResource()

    /**
     * Delete ISysResource
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysResource(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysResource()

    /**
     * Delete ISysResource
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysResource(SysResourceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysResource()

    /**
     * Update ISysResource Selective
     *
     * @param aSysResource
     *
     * @throws Exception
     */
    public void updateSysResource(SysResource aSysResource)
        throws Exception {
        if (aSysResource.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysResource);

        SysResource tempObj = findSysResourceById(aSysResource.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysResource, tempObj);
        } // end if
    } // end updateSysResource()

    /**
     * Batch Update ISysResource
     *
     * @param aSysResource
     *
     * @throws Exception
     */
    public void batchUpdateSysResource(SysResource[] aSysResource)
        throws Exception {
        batchUpdate(aSysResource);
    } // end batchUpdateSysResource()

    /**
     * Update ISysResource
     *
     * @param aSysResource
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysResource(SysResource aSysResource,
        SysResourceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysResource, aQueryBean);
    } // end updateSysResource()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResource DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysResource aSysResource)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResource(SysResource[] aSysResources,
        SysResourceDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysResource(aSysResources, aQueryBean, null);
    } // end synchronizeSysResource()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResource(SysResource[] aSysResources,
        SysResourceDAOQueryBean aQueryBean,
        SysResourceSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysResources) == false) {
            inputList.addAll(Arrays.asList(aSysResources));
        } // end if

        SysResource[] existentSysResources = this.querySysResource(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysResources) == false) {
            existentList.addAll(Arrays.asList(existentSysResources));
        } // end if

        List willAddSysResources = ListUtils.subtract(inputList, existentList);

        List willDeleteSysResources = ListUtils.subtract(existentList, inputList);

        List willUpdateSysResources = ListUtils.intersection(existentList,
                inputList);

        SysResource[] willUpdateSysResourceArray = (SysResource[]) willUpdateSysResources.toArray(new SysResource[willUpdateSysResources.size()]);
        SysResource[] willAddSysResourceArray = (SysResource[]) willAddSysResources.toArray(new SysResource[willAddSysResources.size()]);
        SysResource[] willDeleteSysResourceArray = (SysResource[]) willDeleteSysResources.toArray(new SysResource[willDeleteSysResources.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysResourceArray,
                willUpdateSysResourceArray, willDeleteSysResourceArray);
        } // end if

        if (willUpdateSysResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysResourceArray);
            } // end if

            this.batchUpdateSysResource(willUpdateSysResourceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysResourceArray);
            } // end if
        } // end if

        if (willAddSysResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysResourceArray);
            } // end if

            this.batchInsertSysResource(willAddSysResourceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysResourceArray);
            } // end if
        } // end if

        if (willDeleteSysResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysResourceArray);
            } // end if

            for (int i = 0; i < willDeleteSysResourceArray.length; i++) {
                SysResource object = willDeleteSysResourceArray[i];
                this.deleteSysResource(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysResourceArray);
            } // end if
        } // end if
    } // end synchronizeSysResource()

    /**
     * Query ISysResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysResource findSysResourceById(final long aId)
        throws Exception {
        SysResourceDAOQueryBean queryBean = new SysResourceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysResource[] SysResources = querySysResource(queryBean);

        if (SysResources.length == 0) {
            return null;
        } // end if
        else {
            return SysResources[0];
        } // end else
    } // end findSysResourceById()

    /**
     * Query ISysResource
     *
     * @param queryBean
     *
     * @return ISysResource[]
     *
     * @throws Exception
     */
    public SysResource[] querySysResource(SysResourceDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcSysResourceRowMapper());

        return (SysResource[]) result.toArray(new SysResource[result.size()]);
    } // end querySysResource()

    /**
     * Query SysResource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysResourceSelective(SysResourceDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysResourceSelective()

    /**
     * Query ISysResource Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysResourceCount(SysResourceDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysResourceCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysResourcePropertyDAOJdbcImpl sysResourceProperty;

    /**
     * DOCUMENT ME!
     *
     * @param sysResourceProperty DOCUMENT ME!
     */
    public void setSysResourceProperty(
        com.ourteam.system.dao.impl.BaseSysResourcePropertyDAOJdbcImpl sysResourceProperty) {
        this.sysResourceProperty = sysResourceProperty;
    } // end setSysResourceProperty()

    /**
     * Query Related ISysResourceProperty
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourceProperty" containment="true"
     */
    public com.ourteam.system.dao.SysResourceProperty[] querySysResourcePropertys(
        SysResourceDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID = SYS_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysResourcePropertyDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysResourcePropertyDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysResourceProperty.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysResourcePropertyDAOJdbcImpl.JdbcSysResourcePropertyRowMapper());

        return (com.ourteam.system.dao.SysResourceProperty[]) list.toArray(new com.ourteam.system.dao.SysResourceProperty[list.size()]);
    } // end querySysResourcePropertys()

    /**
     * Query SysResource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysResourcePropertysSelective(
        SysResourceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyCode,
                "resourcePropertyCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyDefaultValue,
                "resourcePropertyDefaultValue");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyName,
                "resourcePropertyName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyOrder,
                "resourcePropertyOrder");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyType,
                "resourcePropertyType");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.ResourcePropertyValue,
                "resourcePropertyValue");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyDAO.SysResourceId,
                "sysResourceId");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID = SYS_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyDAO.EntityName;

        return sysResourceProperty.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysResourcePropertysSelective()

    /**
     * Update Related ISysResourceProperty
     *
     * @param aSysResourceProperty {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysResourceProperty(
        com.ourteam.system.dao.SysResourceProperty aSysResourceProperty,
        SysResourceDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID = SYS_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysResourcePropertyDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysResourcePropertyDAOJdbcImpl.ENTITY_PROPERTIES;

        sysResourceProperty.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aSysResourceProperty,
            aQueryBean);
    } // end updateSysResourceProperty()

    /**
     * Delete Related ISysResourceProperty
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysResourceProperty(SysResourceDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID = SYS_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyDAO.EntityName;

        sysResourceProperty.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteSysResourceProperty()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysResourceTypeDAOJdbcImpl sysResourceType;

    /**
     * DOCUMENT ME!
     *
     * @param sysResourceType DOCUMENT ME!
     */
    public void setSysResourceType(
        com.ourteam.system.dao.impl.BaseSysResourceTypeDAOJdbcImpl sysResourceType) {
        this.sysResourceType = sysResourceType;
    } // end setSysResourceType()

    /**
     * Query Related ISysResourceType
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourceType" containment="true"
     */
    public com.ourteam.system.dao.SysResourceType[] querySysResourceTypes(
        SysResourceDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID = SYS_RESOURCE.RESOURCE_TYPE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourceTypeDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysResourceTypeDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysResourceTypeDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysResourceType.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysResourceTypeDAOJdbcImpl.JdbcSysResourceTypeRowMapper());

        return (com.ourteam.system.dao.SysResourceType[]) list.toArray(new com.ourteam.system.dao.SysResourceType[list.size()]);
    } // end querySysResourceTypes()

    /**
     * Query SysResource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysResourceTypesSelective(
        SysResourceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.ConfigCode,
                "configCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.ConfigName,
                "configName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.DomainId,
                "domainId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.ResourceTypeId,
                "resourceTypeId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourceTypeDAO.Sort,
                "sort");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID = SYS_RESOURCE.RESOURCE_TYPE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourceTypeDAO.EntityName;

        return sysResourceType.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysResourceTypesSelective()

    /**
     * Update Related ISysResourceType
     *
     * @param aSysResourceType {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysResourceType(
        com.ourteam.system.dao.SysResourceType aSysResourceType,
        SysResourceDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID = SYS_RESOURCE.RESOURCE_TYPE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourceTypeDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysResourceTypeDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysResourceTypeDAOJdbcImpl.ENTITY_PROPERTIES;

        sysResourceType.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aSysResourceType, aQueryBean);
    } // end updateSysResourceType()

    /**
     * Delete Related ISysResourceType
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysResourceType(SysResourceDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID = SYS_RESOURCE.RESOURCE_TYPE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourceTypeDAO.EntityName;

        sysResourceType.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteSysResourceType()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysResourceRowMapper
        implements ParameterizedRowMapper {
        /**
         * DOCUMENT ME!
         *
         * @param resultSet DOCUMENT ME!
         * @param arg1 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         *
         * @throws SQLException DOCUMENT ME!
         */
        public Object mapRow(ResultSet resultSet, int arg1)
            throws SQLException {
            SysResource object = new SysResource();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DomainId = resultSet.getObject(columnIndex++);

                object.setDomainIdNull(resultSet.getBoolean(columnIndex++));

                if (DomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainId,
                        DomainId);
                } // end if

                Object ParentResourceId = resultSet.getObject(columnIndex++);

                object.setParentResourceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ParentResourceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ParentResourceId, ParentResourceId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ResourceCode = resultSet.getObject(columnIndex++);

                object.setResourceCodeNull(resultSet.getBoolean(columnIndex++));

                if (ResourceCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceCode,
                        ResourceCode);
                } // end if

                Object ResourceName = resultSet.getObject(columnIndex++);

                object.setResourceNameNull(resultSet.getBoolean(columnIndex++));

                if (ResourceName != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceName,
                        ResourceName);
                } // end if

                Object ResourceTypeId = resultSet.getObject(columnIndex++);

                object.setResourceTypeIdNull(resultSet.getBoolean(columnIndex++));

                if (ResourceTypeId != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceTypeId,
                        ResourceTypeId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object Sort = resultSet.getObject(columnIndex++);

                object.setSortNull(resultSet.getBoolean(columnIndex++));

                if (Sort != null) {
                    BeanUtils.setProperty(object, DataProperty.Sort, Sort);
                } // end if

                Object ResourceTitleKey = resultSet.getObject(columnIndex++);

                object.setResourceTitleKeyNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceTitleKey != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceTitleKey, ResourceTitleKey);
                } // end if

                Object DomainTitleKey = resultSet.getObject(columnIndex++);

                object.setDomainTitleKeyNull(resultSet.getBoolean(columnIndex++));

                if (DomainTitleKey != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainTitleKey,
                        DomainTitleKey);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysResourceRowMapper
} // end BaseSysResourceDAOJdbcImpl
