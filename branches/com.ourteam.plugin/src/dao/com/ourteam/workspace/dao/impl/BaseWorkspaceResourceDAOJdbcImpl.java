/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao.impl;

import com.ourteam.workspace.dao.IWorkspaceResourceDAO;
import com.ourteam.workspace.dao.WorkspaceResource;
import com.ourteam.workspace.dao.WorkspaceResourceDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-06-10 22:46:12
 *
 * @author Kylin
 */
abstract public class BaseWorkspaceResourceDAOJdbcImpl extends AbstractJdbcDAO
    implements IWorkspaceResourceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Description, OrderIndex, ResourcePath, ResourceType, Status,
            WorkspaceId, Name, WorkspacePath, WorkspaceName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Description, DataProperty.OrderIndex,
            DataProperty.ResourcePath, DataProperty.ResourceType,
            DataProperty.Status, DataProperty.WorkspaceId, DataProperty.Name,
            DataProperty.WorkspacePath, DataProperty.WorkspaceName
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
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] {  };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseWorkspaceResourceDAOJdbcImpl object.
     */
    public BaseWorkspaceResourceDAOJdbcImpl() {
        super();
    } // end BaseWorkspaceResourceDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN WORKSPACE workspaceA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " workspaceA.ID = WORKSPACE_RESOURCE.WORKSPACE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique WorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(WorkspaceResource aWorkspaceResource)
        throws Exception {
        if (aWorkspaceResource == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aWorkspaceResource,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IWorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     */
    public void insertWorkspaceResource(WorkspaceResource aWorkspaceResource)
        throws Exception {
        insert(aWorkspaceResource);
    } // end insertWorkspaceResource()

    /**
     * Batch Insert IWorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     */
    public void batchInsertWorkspaceResource(
        WorkspaceResource[] aWorkspaceResource) throws Exception {
        batchInsert(aWorkspaceResource);
    } // end batchInsertWorkspaceResource()

    /**
     * Delete IWorkspaceResource
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteWorkspaceResource(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteWorkspaceResource()

    /**
     * Delete IWorkspaceResource
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteWorkspaceResource(WorkspaceResourceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteWorkspaceResource()

    /**
     * Update IWorkspaceResource Selective
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     */
    public void updateWorkspaceResource(WorkspaceResource aWorkspaceResource)
        throws Exception {
        if (aWorkspaceResource.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aWorkspaceResource);

        WorkspaceResource tempObj = findWorkspaceResourceById(aWorkspaceResource.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aWorkspaceResource, tempObj);
        } // end if
    } // end updateWorkspaceResource()

    /**
     * Batch Update IWorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     */
    public void batchUpdateWorkspaceResource(
        WorkspaceResource[] aWorkspaceResource) throws Exception {
        batchUpdate(aWorkspaceResource);
    } // end batchUpdateWorkspaceResource()

    /**
     * Update IWorkspaceResource
     *
     * @param aWorkspaceResource
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateWorkspaceResource(WorkspaceResource aWorkspaceResource,
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aWorkspaceResource, aQueryBean);
    } // end updateWorkspaceResource()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResource DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(WorkspaceResource aWorkspaceResource)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceResource(
        WorkspaceResource[] aWorkspaceResources,
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception {
        synchronizeWorkspaceResource(aWorkspaceResources, aQueryBean, null);
    } // end synchronizeWorkspaceResource()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceResource(
        WorkspaceResource[] aWorkspaceResources,
        WorkspaceResourceDAOQueryBean aQueryBean,
        WorkspaceResourceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aWorkspaceResources) == false) {
            inputList.addAll(Arrays.asList(aWorkspaceResources));
        } // end if

        WorkspaceResource[] existentWorkspaceResources = this.queryWorkspaceResource(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentWorkspaceResources) == false) {
            existentList.addAll(Arrays.asList(existentWorkspaceResources));
        } // end if

        List willAddWorkspaceResources = ListUtils.subtract(inputList,
                existentList);

        List willDeleteWorkspaceResources = ListUtils.subtract(existentList,
                inputList);

        List willUpdateWorkspaceResources = ListUtils.intersection(existentList,
                inputList);

        WorkspaceResource[] willUpdateWorkspaceResourceArray = (WorkspaceResource[]) willUpdateWorkspaceResources.toArray(new WorkspaceResource[willUpdateWorkspaceResources.size()]);
        WorkspaceResource[] willAddWorkspaceResourceArray = (WorkspaceResource[]) willAddWorkspaceResources.toArray(new WorkspaceResource[willAddWorkspaceResources.size()]);
        WorkspaceResource[] willDeleteWorkspaceResourceArray = (WorkspaceResource[]) willDeleteWorkspaceResources.toArray(new WorkspaceResource[willDeleteWorkspaceResources.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddWorkspaceResourceArray,
                willUpdateWorkspaceResourceArray,
                willDeleteWorkspaceResourceArray);
        } // end if

        if (willUpdateWorkspaceResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateWorkspaceResourceArray);
            } // end if

            this.batchUpdateWorkspaceResource(willUpdateWorkspaceResourceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateWorkspaceResourceArray);
            } // end if
        } // end if

        if (willAddWorkspaceResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddWorkspaceResourceArray);
            } // end if

            this.batchInsertWorkspaceResource(willAddWorkspaceResourceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddWorkspaceResourceArray);
            } // end if
        } // end if

        if (willDeleteWorkspaceResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteWorkspaceResourceArray);
            } // end if

            for (int i = 0; i < willDeleteWorkspaceResourceArray.length; i++) {
                WorkspaceResource object = willDeleteWorkspaceResourceArray[i];
                this.deleteWorkspaceResource(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteWorkspaceResourceArray);
            } // end if
        } // end if
    } // end synchronizeWorkspaceResource()

    /**
     * Query IWorkspaceResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public WorkspaceResource findWorkspaceResourceById(final long aId)
        throws Exception {
        WorkspaceResourceDAOQueryBean queryBean = new WorkspaceResourceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        WorkspaceResource[] WorkspaceResources = queryWorkspaceResource(queryBean);

        if (WorkspaceResources.length == 0) {
            return null;
        } // end if
        else {
            return WorkspaceResources[0];
        } // end else
    } // end findWorkspaceResourceById()

    /**
     * Query IWorkspaceResource
     *
     * @param queryBean
     *
     * @return IWorkspaceResource[]
     *
     * @throws Exception
     */
    public WorkspaceResource[] queryWorkspaceResource(
        WorkspaceResourceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcWorkspaceResourceRowMapper());

        return (WorkspaceResource[]) result.toArray(new WorkspaceResource[result.size()]);
    } // end queryWorkspaceResource()

    /**
     * Query WorkspaceResource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryWorkspaceResourceSelective(
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryWorkspaceResourceSelective()

    /**
     * Query IWorkspaceResource Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryWorkspaceResourceCount(
        WorkspaceResourceDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryWorkspaceResourceCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.workspace.dao.impl.BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl workspaceResourceBusinessPackageRelate;

    /**
     * DOCUMENT ME!
     *
     * @param workspaceResourceBusinessPackageRelate DOCUMENT ME!
     */
    public void setWorkspaceResourceBusinessPackageRelate(
        com.ourteam.workspace.dao.impl.BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl workspaceResourceBusinessPackageRelate) {
        this.workspaceResourceBusinessPackageRelate = workspaceResourceBusinessPackageRelate;
    } // end setWorkspaceResourceBusinessPackageRelate()

    /**
     * Query Related IWorkspaceResourceBusinessPackageRelate
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IWorkspaceResourceBusinessPackageRelate" containment="true"
     */
    public com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate[] queryWorkspaceResourceBusinessPackageRelates(
        WorkspaceResourceDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN WORKSPACE_RESOURCE ON ( ");

        joinSQL.append(
            " WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID = WORKSPACE_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.EntityName;

        String[] entityFields = com.ourteam.workspace.dao.impl.BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.workspace.dao.impl.BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = workspaceResourceBusinessPackageRelate.query(entityName,
                entityFields, entityProperties, aDaoQueryBean,
                joinSQL.toString(),
                new com.ourteam.workspace.dao.impl.BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl.JdbcWorkspaceResourceBusinessPackageRelateRowMapper());

        return (com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate[]) list.toArray(new com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate[list.size()]);
    } // end queryWorkspaceResourceBusinessPackageRelates()

    /**
     * Query WorkspaceResource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryWorkspaceResourceBusinessPackageRelatesSelective(
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessPcakageId,
                "businessPcakageId");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.Description,
                "description");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.WorkspaceResourceId,
                "workspaceResourceId");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageName,
                "businessPackageName");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainName,
                "businessDomainName");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainId,
                "businessDomainId");

            aQueryBean.addSelectProperty(com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageType,
                "businessPackageType");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN WORKSPACE_RESOURCE ON ( ");

        joinSQL.append(
            " WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID = WORKSPACE_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.EntityName;

        return workspaceResourceBusinessPackageRelate.querySelective(entityName,
            aQueryBean, joinSQL.toString());
    } // end queryWorkspaceResourceBusinessPackageRelatesSelective()

    /**
     * Update Related IWorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *        {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateWorkspaceResourceBusinessPackageRelate(
        com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate,
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN WORKSPACE_RESOURCE ON ( ");

        joinSQL.append(
            " WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID = WORKSPACE_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.EntityName;

        String[] entityFields = com.ourteam.workspace.dao.impl.BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.workspace.dao.impl.BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        workspaceResourceBusinessPackageRelate.updateByQuery(entityName,
            entityFields, entityProperties, joinSQL.toString(),
            aWorkspaceResourceBusinessPackageRelate, aQueryBean);
    } // end updateWorkspaceResourceBusinessPackageRelate()

    /**
     * Delete Related IWorkspaceResourceBusinessPackageRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN WORKSPACE_RESOURCE ON ( ");

        joinSQL.append(
            " WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID = WORKSPACE_RESOURCE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.EntityName;

        workspaceResourceBusinessPackageRelate.deleteByQuery(entityName,
            joinSQL.toString(), aQueryBean);
    } // end deleteWorkspaceResourceBusinessPackageRelate()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcWorkspaceResourceRowMapper
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
            WorkspaceResource object = new WorkspaceResource();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object OrderIndex = resultSet.getObject(columnIndex++);

                object.setOrderIndexNull(resultSet.getBoolean(columnIndex++));

                if (OrderIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.OrderIndex,
                        OrderIndex);
                } // end if

                Object ResourcePath = resultSet.getObject(columnIndex++);

                object.setResourcePathNull(resultSet.getBoolean(columnIndex++));

                if (ResourcePath != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourcePath,
                        ResourcePath);
                } // end if

                Object ResourceType = resultSet.getObject(columnIndex++);

                object.setResourceTypeNull(resultSet.getBoolean(columnIndex++));

                if (ResourceType != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceType,
                        ResourceType);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object WorkspaceId = resultSet.getObject(columnIndex++);

                object.setWorkspaceIdNull(resultSet.getBoolean(columnIndex++));

                if (WorkspaceId != null) {
                    BeanUtils.setProperty(object, DataProperty.WorkspaceId,
                        WorkspaceId);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object WorkspacePath = resultSet.getObject(columnIndex++);

                object.setWorkspacePathNull(resultSet.getBoolean(columnIndex++));

                if (WorkspacePath != null) {
                    BeanUtils.setProperty(object, DataProperty.WorkspacePath,
                        WorkspacePath);
                } // end if

                Object WorkspaceName = resultSet.getObject(columnIndex++);

                object.setWorkspaceNameNull(resultSet.getBoolean(columnIndex++));

                if (WorkspaceName != null) {
                    BeanUtils.setProperty(object, DataProperty.WorkspaceName,
                        WorkspaceName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcWorkspaceResourceRowMapper
} // end BaseWorkspaceResourceDAOJdbcImpl
