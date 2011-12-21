/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO;
import com.ourteam.modelbase.dao.PersistentPropertyConstValue;
import com.ourteam.modelbase.dao.PersistentPropertyConstValueDAOQueryBean;

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
 * 持久对象属性值 DAO JDBC Impl Generate Date : 2011-06-29 21:07:06
 *
 * @author Kylin
 */
abstract public class BasePersistentPropertyConstValueDAOJdbcImpl
    extends AbstractJdbcDAO implements IPersistentPropertyConstValueDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ColumnId, ColumnName, DelFlag, Description, FieldOrder, RowId,
            TableName, Value
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ColumnId, DataProperty.ColumnName, DataProperty.DelFlag,
            DataProperty.Description, DataProperty.FieldOrder,
            DataProperty.RowId, DataProperty.TableName, DataProperty.Value
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { RowId };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] { RowId };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] {
            ColumnName, TableName, Value
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
     * Creates a new BasePersistentPropertyConstValueDAOJdbcImpl object.
     */
    public BasePersistentPropertyConstValueDAOJdbcImpl() {
        super();
    } // end BasePersistentPropertyConstValueDAOJdbcImpl()

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

            basicFilterSQLbuffer.append(" SYS_FIELD_DESC.DEL_FLAG = 1 ");

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
     * Check Unique PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        PersistentPropertyConstValue aPersistentPropertyConstValue)
        throws Exception {
        if (aPersistentPropertyConstValue == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        valueList.add(PropertyUtils.getProperty(aPersistentPropertyConstValue,
                DataProperty.ColumnName));

        pkValueList.add(PropertyUtils.getProperty(
                aPersistentPropertyConstValue, DataProperty.RowId));

        valueList.add(PropertyUtils.getProperty(aPersistentPropertyConstValue,
                DataProperty.TableName));

        valueList.add(PropertyUtils.getProperty(aPersistentPropertyConstValue,
                DataProperty.Value));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IPersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     */
    public void insertPersistentPropertyConstValue(
        PersistentPropertyConstValue aPersistentPropertyConstValue)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aPersistentPropertyConstValue,
            "delFlag",
            org.apache.commons.beanutils.ConvertUtils.convert("1", int.class));

        insert(aPersistentPropertyConstValue);
    } // end insertPersistentPropertyConstValue()

    /**
     * Batch Insert IPersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     */
    public void batchInsertPersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValue)
        throws Exception {
        batchInsert(aPersistentPropertyConstValue);
    } // end batchInsertPersistentPropertyConstValue()

    /**
     * Delete IPersistentPropertyConstValue
     *
     * @param aRowId long aRowId
     *
     * @throws Exception
     */
    public void deletePersistentPropertyConstValue(final long aRowId)
        throws Exception {
        PersistentPropertyConstValue tempPersistentPropertyConstValue = findPersistentPropertyConstValueById(aRowId);

        org.apache.commons.beanutils.PropertyUtils.setProperty(tempPersistentPropertyConstValue,
            "delFlag",
            org.apache.commons.beanutils.ConvertUtils.convert("0", int.class));

        updatePersistentPropertyConstValue(tempPersistentPropertyConstValue);
    } // end deletePersistentPropertyConstValue()

    /**
     * Delete IPersistentPropertyConstValue
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deletePersistentPropertyConstValue(
        PersistentPropertyConstValueDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deletePersistentPropertyConstValue()

    /**
     * Update IPersistentPropertyConstValue Selective
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     */
    public void updatePersistentPropertyConstValue(
        PersistentPropertyConstValue aPersistentPropertyConstValue)
        throws Exception {
        if (aPersistentPropertyConstValue.getRowId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aPersistentPropertyConstValue);

        PersistentPropertyConstValue tempObj = findPersistentPropertyConstValueById(aPersistentPropertyConstValue.getRowId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aPersistentPropertyConstValue, tempObj);
        } // end if
    } // end updatePersistentPropertyConstValue()

    /**
     * Batch Update IPersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     */
    public void batchUpdatePersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValue)
        throws Exception {
        batchUpdate(aPersistentPropertyConstValue);
    } // end batchUpdatePersistentPropertyConstValue()

    /**
     * Update IPersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updatePersistentPropertyConstValue(
        PersistentPropertyConstValue aPersistentPropertyConstValue,
        PersistentPropertyConstValueDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aPersistentPropertyConstValue, aQueryBean);
    } // end updatePersistentPropertyConstValue()

    /**
     * DOCUMENT ME!
     *
     * @param aPersistentPropertyConstValue DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        PersistentPropertyConstValue aPersistentPropertyConstValue)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aPersistentPropertyConstValues DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizePersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValues,
        PersistentPropertyConstValueDAOQueryBean aQueryBean)
        throws Exception {
        synchronizePersistentPropertyConstValue(aPersistentPropertyConstValues,
            aQueryBean, null);
    } // end synchronizePersistentPropertyConstValue()

    /**
     * DOCUMENT ME!
     *
     * @param aPersistentPropertyConstValues DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizePersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValues,
        PersistentPropertyConstValueDAOQueryBean aQueryBean,
        PersistentPropertyConstValueSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aPersistentPropertyConstValues) == false) {
            inputList.addAll(Arrays.asList(aPersistentPropertyConstValues));
        } // end if

        PersistentPropertyConstValue[] existentPersistentPropertyConstValues = this.queryPersistentPropertyConstValue(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentPersistentPropertyConstValues) == false) {
            existentList.addAll(Arrays.asList(
                    existentPersistentPropertyConstValues));
        } // end if

        List willAddPersistentPropertyConstValues = ListUtils.subtract(inputList,
                existentList);

        List willDeletePersistentPropertyConstValues = ListUtils.subtract(existentList,
                inputList);

        List willUpdatePersistentPropertyConstValues = ListUtils.intersection(existentList,
                inputList);

        PersistentPropertyConstValue[] willUpdatePersistentPropertyConstValueArray =
            (PersistentPropertyConstValue[]) willUpdatePersistentPropertyConstValues.toArray(new PersistentPropertyConstValue[willUpdatePersistentPropertyConstValues.size()]);
        PersistentPropertyConstValue[] willAddPersistentPropertyConstValueArray = (PersistentPropertyConstValue[]) willAddPersistentPropertyConstValues.toArray(new PersistentPropertyConstValue[willAddPersistentPropertyConstValues.size()]);
        PersistentPropertyConstValue[] willDeletePersistentPropertyConstValueArray =
            (PersistentPropertyConstValue[]) willDeletePersistentPropertyConstValues.toArray(new PersistentPropertyConstValue[willDeletePersistentPropertyConstValues.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddPersistentPropertyConstValueArray,
                willUpdatePersistentPropertyConstValueArray,
                willDeletePersistentPropertyConstValueArray);
        } // end if

        if (willUpdatePersistentPropertyConstValues.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdatePersistentPropertyConstValueArray);
            } // end if

            this.batchUpdatePersistentPropertyConstValue(willUpdatePersistentPropertyConstValueArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdatePersistentPropertyConstValueArray);
            } // end if
        } // end if

        if (willAddPersistentPropertyConstValues.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddPersistentPropertyConstValueArray);
            } // end if

            this.batchInsertPersistentPropertyConstValue(willAddPersistentPropertyConstValueArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddPersistentPropertyConstValueArray);
            } // end if
        } // end if

        if (willDeletePersistentPropertyConstValues.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeletePersistentPropertyConstValueArray);
            } // end if

            for (int i = 0;
                    i < willDeletePersistentPropertyConstValueArray.length;
                    i++) {
                PersistentPropertyConstValue object = willDeletePersistentPropertyConstValueArray[i];
                this.deletePersistentPropertyConstValue(object.getRowId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeletePersistentPropertyConstValueArray);
            } // end if
        } // end if
    } // end synchronizePersistentPropertyConstValue()

    /**
     * Query IPersistentPropertyConstValue
     *
     * @param aRowId long aRowId
     *
     * @return
     *
     * @throws Exception
     */
    public PersistentPropertyConstValue findPersistentPropertyConstValueById(
        final long aRowId) throws Exception {
        PersistentPropertyConstValueDAOQueryBean queryBean = new PersistentPropertyConstValueDAOQueryBean();

        queryBean.createCriteria().andRowIdEqualTo(new java.lang.Long(aRowId));

        queryBean.setDistinct(true);

        PersistentPropertyConstValue[] PersistentPropertyConstValues = queryPersistentPropertyConstValue(queryBean);

        if (PersistentPropertyConstValues.length == 0) {
            return null;
        } // end if
        else {
            return PersistentPropertyConstValues[0];
        } // end else
    } // end findPersistentPropertyConstValueById()

    /**
     * Query IPersistentPropertyConstValue
     *
     * @param queryBean
     *
     * @return IPersistentPropertyConstValue[]
     *
     * @throws Exception
     */
    public PersistentPropertyConstValue[] queryPersistentPropertyConstValue(
        PersistentPropertyConstValueDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcPersistentPropertyConstValueRowMapper());

        return (PersistentPropertyConstValue[]) result.toArray(new PersistentPropertyConstValue[result.size()]);
    } // end queryPersistentPropertyConstValue()

    /**
     * Query PersistentPropertyConstValue Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryPersistentPropertyConstValueSelective(
        PersistentPropertyConstValueDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryPersistentPropertyConstValueSelective()

    /**
     * Query IPersistentPropertyConstValue Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryPersistentPropertyConstValueCount(
        PersistentPropertyConstValueDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryPersistentPropertyConstValueCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcPersistentPropertyConstValueRowMapper
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
            PersistentPropertyConstValue object = new PersistentPropertyConstValue();

            int columnIndex = 1;

            try {
                Object ColumnId = resultSet.getObject(columnIndex++);

                object.setColumnIdNull(resultSet.getBoolean(columnIndex++));

                if (ColumnId != null) {
                    BeanUtils.setProperty(object, DataProperty.ColumnId,
                        ColumnId);
                } // end if

                Object ColumnName = resultSet.getObject(columnIndex++);

                object.setColumnNameNull(resultSet.getBoolean(columnIndex++));

                if (ColumnName != null) {
                    BeanUtils.setProperty(object, DataProperty.ColumnName,
                        ColumnName);
                } // end if

                Object DelFlag = resultSet.getObject(columnIndex++);

                object.setDelFlagNull(resultSet.getBoolean(columnIndex++));

                if (DelFlag != null) {
                    BeanUtils.setProperty(object, DataProperty.DelFlag, DelFlag);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object FieldOrder = resultSet.getObject(columnIndex++);

                object.setFieldOrderNull(resultSet.getBoolean(columnIndex++));

                if (FieldOrder != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldOrder,
                        FieldOrder);
                } // end if

                Object RowId = resultSet.getObject(columnIndex++);

                object.setRowIdNull(resultSet.getBoolean(columnIndex++));

                if (RowId != null) {
                    BeanUtils.setProperty(object, DataProperty.RowId, RowId);
                } // end if

                Object TableName = resultSet.getObject(columnIndex++);

                object.setTableNameNull(resultSet.getBoolean(columnIndex++));

                if (TableName != null) {
                    BeanUtils.setProperty(object, DataProperty.TableName,
                        TableName);
                } // end if

                Object Value = resultSet.getObject(columnIndex++);

                object.setValueNull(resultSet.getBoolean(columnIndex++));

                if (Value != null) {
                    BeanUtils.setProperty(object, DataProperty.Value, Value);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcPersistentPropertyConstValueRowMapper
} // end BasePersistentPropertyConstValueDAOJdbcImpl
