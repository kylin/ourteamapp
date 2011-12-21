/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao.impl;

import com.ourteam.workspace.dao.IWorkspaceConfigPropertyDAO;
import com.ourteam.workspace.dao.WorkspaceConfigProperty;
import com.ourteam.workspace.dao.WorkspaceConfigPropertyDAOQueryBean;

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
abstract public class BaseWorkspaceConfigPropertyDAOJdbcImpl
    extends AbstractJdbcDAO implements IWorkspaceConfigPropertyDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ConfigProperty, ConfigValue, Description, Status,
            WorkspaceConfigId, WorkspaceId, WorkspaceConfigItem
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ConfigProperty,
            DataProperty.ConfigValue, DataProperty.Description,
            DataProperty.Status, DataProperty.WorkspaceConfigId,
            DataProperty.WorkspaceId, DataProperty.WorkspaceConfigItem
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
     * Creates a new BaseWorkspaceConfigPropertyDAOJdbcImpl object.
     */
    public BaseWorkspaceConfigPropertyDAOJdbcImpl() {
        super();
    } // end BaseWorkspaceConfigPropertyDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(
                " LEFT JOIN WORKSPACE_CONFIG workspaceConfig ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " workspaceConfig.ID = WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        WorkspaceConfigProperty aWorkspaceConfigProperty)
        throws Exception {
        if (aWorkspaceConfigProperty == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aWorkspaceConfigProperty,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IWorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     */
    public void insertWorkspaceConfigProperty(
        WorkspaceConfigProperty aWorkspaceConfigProperty)
        throws Exception {
        insert(aWorkspaceConfigProperty);
    } // end insertWorkspaceConfigProperty()

    /**
     * Batch Insert IWorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     */
    public void batchInsertWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigProperty)
        throws Exception {
        batchInsert(aWorkspaceConfigProperty);
    } // end batchInsertWorkspaceConfigProperty()

    /**
     * Delete IWorkspaceConfigProperty
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteWorkspaceConfigProperty(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteWorkspaceConfigProperty()

    /**
     * Delete IWorkspaceConfigProperty
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteWorkspaceConfigProperty(
        WorkspaceConfigPropertyDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteWorkspaceConfigProperty()

    /**
     * Update IWorkspaceConfigProperty Selective
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     */
    public void updateWorkspaceConfigProperty(
        WorkspaceConfigProperty aWorkspaceConfigProperty)
        throws Exception {
        if (aWorkspaceConfigProperty.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aWorkspaceConfigProperty);

        WorkspaceConfigProperty tempObj = findWorkspaceConfigPropertyById(aWorkspaceConfigProperty.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aWorkspaceConfigProperty, tempObj);
        } // end if
    } // end updateWorkspaceConfigProperty()

    /**
     * Batch Update IWorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     */
    public void batchUpdateWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigProperty)
        throws Exception {
        batchUpdate(aWorkspaceConfigProperty);
    } // end batchUpdateWorkspaceConfigProperty()

    /**
     * Update IWorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateWorkspaceConfigProperty(
        WorkspaceConfigProperty aWorkspaceConfigProperty,
        WorkspaceConfigPropertyDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aWorkspaceConfigProperty, aQueryBean);
    } // end updateWorkspaceConfigProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfigProperty DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        WorkspaceConfigProperty aWorkspaceConfigProperty)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfigPropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigPropertys,
        WorkspaceConfigPropertyDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeWorkspaceConfigProperty(aWorkspaceConfigPropertys,
            aQueryBean, null);
    } // end synchronizeWorkspaceConfigProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfigPropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigPropertys,
        WorkspaceConfigPropertyDAOQueryBean aQueryBean,
        WorkspaceConfigPropertySynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aWorkspaceConfigPropertys) == false) {
            inputList.addAll(Arrays.asList(aWorkspaceConfigPropertys));
        } // end if

        WorkspaceConfigProperty[] existentWorkspaceConfigPropertys = this.queryWorkspaceConfigProperty(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentWorkspaceConfigPropertys) == false) {
            existentList.addAll(Arrays.asList(existentWorkspaceConfigPropertys));
        } // end if

        List willAddWorkspaceConfigPropertys = ListUtils.subtract(inputList,
                existentList);

        List willDeleteWorkspaceConfigPropertys = ListUtils.subtract(existentList,
                inputList);

        List willUpdateWorkspaceConfigPropertys = ListUtils.intersection(existentList,
                inputList);

        WorkspaceConfigProperty[] willUpdateWorkspaceConfigPropertyArray = (WorkspaceConfigProperty[]) willUpdateWorkspaceConfigPropertys.toArray(new WorkspaceConfigProperty[willUpdateWorkspaceConfigPropertys.size()]);
        WorkspaceConfigProperty[] willAddWorkspaceConfigPropertyArray = (WorkspaceConfigProperty[]) willAddWorkspaceConfigPropertys.toArray(new WorkspaceConfigProperty[willAddWorkspaceConfigPropertys.size()]);
        WorkspaceConfigProperty[] willDeleteWorkspaceConfigPropertyArray = (WorkspaceConfigProperty[]) willDeleteWorkspaceConfigPropertys.toArray(new WorkspaceConfigProperty[willDeleteWorkspaceConfigPropertys.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddWorkspaceConfigPropertyArray,
                willUpdateWorkspaceConfigPropertyArray,
                willDeleteWorkspaceConfigPropertyArray);
        } // end if

        if (willUpdateWorkspaceConfigPropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateWorkspaceConfigPropertyArray);
            } // end if

            this.batchUpdateWorkspaceConfigProperty(willUpdateWorkspaceConfigPropertyArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateWorkspaceConfigPropertyArray);
            } // end if
        } // end if

        if (willAddWorkspaceConfigPropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddWorkspaceConfigPropertyArray);
            } // end if

            this.batchInsertWorkspaceConfigProperty(willAddWorkspaceConfigPropertyArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddWorkspaceConfigPropertyArray);
            } // end if
        } // end if

        if (willDeleteWorkspaceConfigPropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteWorkspaceConfigPropertyArray);
            } // end if

            for (int i = 0; i < willDeleteWorkspaceConfigPropertyArray.length;
                    i++) {
                WorkspaceConfigProperty object = willDeleteWorkspaceConfigPropertyArray[i];
                this.deleteWorkspaceConfigProperty(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteWorkspaceConfigPropertyArray);
            } // end if
        } // end if
    } // end synchronizeWorkspaceConfigProperty()

    /**
     * Query IWorkspaceConfigProperty
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public WorkspaceConfigProperty findWorkspaceConfigPropertyById(
        final long aId) throws Exception {
        WorkspaceConfigPropertyDAOQueryBean queryBean = new WorkspaceConfigPropertyDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        WorkspaceConfigProperty[] WorkspaceConfigPropertys = queryWorkspaceConfigProperty(queryBean);

        if (WorkspaceConfigPropertys.length == 0) {
            return null;
        } // end if
        else {
            return WorkspaceConfigPropertys[0];
        } // end else
    } // end findWorkspaceConfigPropertyById()

    /**
     * Query IWorkspaceConfigProperty
     *
     * @param queryBean
     *
     * @return IWorkspaceConfigProperty[]
     *
     * @throws Exception
     */
    public WorkspaceConfigProperty[] queryWorkspaceConfigProperty(
        WorkspaceConfigPropertyDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcWorkspaceConfigPropertyRowMapper());

        return (WorkspaceConfigProperty[]) result.toArray(new WorkspaceConfigProperty[result.size()]);
    } // end queryWorkspaceConfigProperty()

    /**
     * Query WorkspaceConfigProperty Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryWorkspaceConfigPropertySelective(
        WorkspaceConfigPropertyDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryWorkspaceConfigPropertySelective()

    /**
     * Query IWorkspaceConfigProperty Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryWorkspaceConfigPropertyCount(
        WorkspaceConfigPropertyDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryWorkspaceConfigPropertyCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcWorkspaceConfigPropertyRowMapper
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
            WorkspaceConfigProperty object = new WorkspaceConfigProperty();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ConfigProperty = resultSet.getObject(columnIndex++);

                object.setConfigPropertyNull(resultSet.getBoolean(columnIndex++));

                if (ConfigProperty != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigProperty,
                        ConfigProperty);
                } // end if

                Object ConfigValue = resultSet.getObject(columnIndex++);

                object.setConfigValueNull(resultSet.getBoolean(columnIndex++));

                if (ConfigValue != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigValue,
                        ConfigValue);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object WorkspaceConfigId = resultSet.getObject(columnIndex++);

                object.setWorkspaceConfigIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (WorkspaceConfigId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.WorkspaceConfigId, WorkspaceConfigId);
                } // end if

                Object WorkspaceId = resultSet.getObject(columnIndex++);

                object.setWorkspaceIdNull(resultSet.getBoolean(columnIndex++));

                if (WorkspaceId != null) {
                    BeanUtils.setProperty(object, DataProperty.WorkspaceId,
                        WorkspaceId);
                } // end if

                Object WorkspaceConfigItem = resultSet.getObject(columnIndex++);

                object.setWorkspaceConfigItemNull(resultSet.getBoolean(
                        columnIndex++));

                if (WorkspaceConfigItem != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.WorkspaceConfigItem, WorkspaceConfigItem);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcWorkspaceConfigPropertyRowMapper
} // end BaseWorkspaceConfigPropertyDAOJdbcImpl
