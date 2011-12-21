/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao.impl;

import com.ourteam.workspace.dao.IWorkspaceConfigDAO;
import com.ourteam.workspace.dao.WorkspaceConfig;
import com.ourteam.workspace.dao.WorkspaceConfigDAOQueryBean;

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
abstract public class BaseWorkspaceConfigDAOJdbcImpl extends AbstractJdbcDAO
    implements IWorkspaceConfigDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ConfigItem, Description, ParentConfigId, Status, ConfigName,
            ConfigForm
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ConfigItem, DataProperty.Description,
            DataProperty.ParentConfigId, DataProperty.Status,
            DataProperty.ConfigName, DataProperty.ConfigForm
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
     * Creates a new BaseWorkspaceConfigDAOJdbcImpl object.
     */
    public BaseWorkspaceConfigDAOJdbcImpl() {
        super();
    } // end BaseWorkspaceConfigDAOJdbcImpl()

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

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique WorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(WorkspaceConfig aWorkspaceConfig)
        throws Exception {
        if (aWorkspaceConfig == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aWorkspaceConfig,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IWorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     */
    public void insertWorkspaceConfig(WorkspaceConfig aWorkspaceConfig)
        throws Exception {
        insert(aWorkspaceConfig);
    } // end insertWorkspaceConfig()

    /**
     * Batch Insert IWorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     */
    public void batchInsertWorkspaceConfig(WorkspaceConfig[] aWorkspaceConfig)
        throws Exception {
        batchInsert(aWorkspaceConfig);
    } // end batchInsertWorkspaceConfig()

    /**
     * Delete IWorkspaceConfig
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteWorkspaceConfig(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteWorkspaceConfig()

    /**
     * Delete IWorkspaceConfig
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteWorkspaceConfig(WorkspaceConfigDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteWorkspaceConfig()

    /**
     * Update IWorkspaceConfig Selective
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     */
    public void updateWorkspaceConfig(WorkspaceConfig aWorkspaceConfig)
        throws Exception {
        if (aWorkspaceConfig.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aWorkspaceConfig);

        WorkspaceConfig tempObj = findWorkspaceConfigById(aWorkspaceConfig.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aWorkspaceConfig, tempObj);
        } // end if
    } // end updateWorkspaceConfig()

    /**
     * Batch Update IWorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     */
    public void batchUpdateWorkspaceConfig(WorkspaceConfig[] aWorkspaceConfig)
        throws Exception {
        batchUpdate(aWorkspaceConfig);
    } // end batchUpdateWorkspaceConfig()

    /**
     * Update IWorkspaceConfig
     *
     * @param aWorkspaceConfig
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateWorkspaceConfig(WorkspaceConfig aWorkspaceConfig,
        WorkspaceConfigDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aWorkspaceConfig, aQueryBean);
    } // end updateWorkspaceConfig()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfig DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(WorkspaceConfig aWorkspaceConfig)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfigs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceConfig(
        WorkspaceConfig[] aWorkspaceConfigs,
        WorkspaceConfigDAOQueryBean aQueryBean) throws Exception {
        synchronizeWorkspaceConfig(aWorkspaceConfigs, aQueryBean, null);
    } // end synchronizeWorkspaceConfig()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceConfigs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceConfig(
        WorkspaceConfig[] aWorkspaceConfigs,
        WorkspaceConfigDAOQueryBean aQueryBean,
        WorkspaceConfigSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aWorkspaceConfigs) == false) {
            inputList.addAll(Arrays.asList(aWorkspaceConfigs));
        } // end if

        WorkspaceConfig[] existentWorkspaceConfigs = this.queryWorkspaceConfig(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentWorkspaceConfigs) == false) {
            existentList.addAll(Arrays.asList(existentWorkspaceConfigs));
        } // end if

        List willAddWorkspaceConfigs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteWorkspaceConfigs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateWorkspaceConfigs = ListUtils.intersection(existentList,
                inputList);

        WorkspaceConfig[] willUpdateWorkspaceConfigArray = (WorkspaceConfig[]) willUpdateWorkspaceConfigs.toArray(new WorkspaceConfig[willUpdateWorkspaceConfigs.size()]);
        WorkspaceConfig[] willAddWorkspaceConfigArray = (WorkspaceConfig[]) willAddWorkspaceConfigs.toArray(new WorkspaceConfig[willAddWorkspaceConfigs.size()]);
        WorkspaceConfig[] willDeleteWorkspaceConfigArray = (WorkspaceConfig[]) willDeleteWorkspaceConfigs.toArray(new WorkspaceConfig[willDeleteWorkspaceConfigs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddWorkspaceConfigArray,
                willUpdateWorkspaceConfigArray, willDeleteWorkspaceConfigArray);
        } // end if

        if (willUpdateWorkspaceConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateWorkspaceConfigArray);
            } // end if

            this.batchUpdateWorkspaceConfig(willUpdateWorkspaceConfigArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateWorkspaceConfigArray);
            } // end if
        } // end if

        if (willAddWorkspaceConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddWorkspaceConfigArray);
            } // end if

            this.batchInsertWorkspaceConfig(willAddWorkspaceConfigArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddWorkspaceConfigArray);
            } // end if
        } // end if

        if (willDeleteWorkspaceConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteWorkspaceConfigArray);
            } // end if

            for (int i = 0; i < willDeleteWorkspaceConfigArray.length; i++) {
                WorkspaceConfig object = willDeleteWorkspaceConfigArray[i];
                this.deleteWorkspaceConfig(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteWorkspaceConfigArray);
            } // end if
        } // end if
    } // end synchronizeWorkspaceConfig()

    /**
     * Query IWorkspaceConfig
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public WorkspaceConfig findWorkspaceConfigById(final long aId)
        throws Exception {
        WorkspaceConfigDAOQueryBean queryBean = new WorkspaceConfigDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        WorkspaceConfig[] WorkspaceConfigs = queryWorkspaceConfig(queryBean);

        if (WorkspaceConfigs.length == 0) {
            return null;
        } // end if
        else {
            return WorkspaceConfigs[0];
        } // end else
    } // end findWorkspaceConfigById()

    /**
     * Query IWorkspaceConfig
     *
     * @param queryBean
     *
     * @return IWorkspaceConfig[]
     *
     * @throws Exception
     */
    public WorkspaceConfig[] queryWorkspaceConfig(
        WorkspaceConfigDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcWorkspaceConfigRowMapper());

        return (WorkspaceConfig[]) result.toArray(new WorkspaceConfig[result.size()]);
    } // end queryWorkspaceConfig()

    /**
     * Query WorkspaceConfig Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryWorkspaceConfigSelective(
        WorkspaceConfigDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryWorkspaceConfigSelective()

    /**
     * Query IWorkspaceConfig Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryWorkspaceConfigCount(WorkspaceConfigDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryWorkspaceConfigCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcWorkspaceConfigRowMapper
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
            WorkspaceConfig object = new WorkspaceConfig();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ConfigItem = resultSet.getObject(columnIndex++);

                object.setConfigItemNull(resultSet.getBoolean(columnIndex++));

                if (ConfigItem != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigItem,
                        ConfigItem);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object ParentConfigId = resultSet.getObject(columnIndex++);

                object.setParentConfigIdNull(resultSet.getBoolean(columnIndex++));

                if (ParentConfigId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentConfigId,
                        ParentConfigId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object ConfigName = resultSet.getObject(columnIndex++);

                object.setConfigNameNull(resultSet.getBoolean(columnIndex++));

                if (ConfigName != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigName,
                        ConfigName);
                } // end if

                Object ConfigForm = resultSet.getObject(columnIndex++);

                object.setConfigFormNull(resultSet.getBoolean(columnIndex++));

                if (ConfigForm != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigForm,
                        ConfigForm);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcWorkspaceConfigRowMapper
} // end BaseWorkspaceConfigDAOJdbcImpl
