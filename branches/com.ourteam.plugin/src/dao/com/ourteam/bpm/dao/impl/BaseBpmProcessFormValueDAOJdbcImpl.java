/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmProcessFormValue;
import com.ourteam.bpm.dao.BpmProcessFormValueDAOQueryBean;
import com.ourteam.bpm.dao.IBpmProcessFormValueDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-28 15:45:39
 *
 * @author kylin
 */
abstract public class BaseBpmProcessFormValueDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmProcessFormValueDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DoubleValue, FormInstanceId, LongValue, PropertyDataType,
            PropertyName, Remarks, Status, StringValue
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DoubleValue,
            DataProperty.FormInstanceId, DataProperty.LongValue,
            DataProperty.PropertyDataType, DataProperty.PropertyName,
            DataProperty.Remarks, DataProperty.Status, DataProperty.StringValue
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
     * Creates a new BaseBpmProcessFormValueDAOJdbcImpl object.
     */
    public BaseBpmProcessFormValueDAOJdbcImpl() {
        super();
    } // end BaseBpmProcessFormValueDAOJdbcImpl()

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
     * Check Unique BpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmProcessFormValue aBpmProcessFormValue)
        throws Exception {
        if (aBpmProcessFormValue == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmProcessFormValue,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     */
    public void insertBpmProcessFormValue(
        BpmProcessFormValue aBpmProcessFormValue) throws Exception {
        insert(aBpmProcessFormValue);
    } // end insertBpmProcessFormValue()

    /**
     * Batch Insert IBpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     */
    public void batchInsertBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValue) throws Exception {
        batchInsert(aBpmProcessFormValue);
    } // end batchInsertBpmProcessFormValue()

    /**
     * Delete IBpmProcessFormValue
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmProcessFormValue(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmProcessFormValue()

    /**
     * Delete IBpmProcessFormValue
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmProcessFormValue(
        BpmProcessFormValueDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmProcessFormValue()

    /**
     * Update IBpmProcessFormValue Selective
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     */
    public void updateBpmProcessFormValue(
        BpmProcessFormValue aBpmProcessFormValue) throws Exception {
        if (aBpmProcessFormValue.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmProcessFormValue);

        BpmProcessFormValue tempObj = findBpmProcessFormValueById(aBpmProcessFormValue.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmProcessFormValue, tempObj);
        } // end if
    } // end updateBpmProcessFormValue()

    /**
     * Batch Update IBpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     */
    public void batchUpdateBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValue) throws Exception {
        batchUpdate(aBpmProcessFormValue);
    } // end batchUpdateBpmProcessFormValue()

    /**
     * Update IBpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmProcessFormValue(
        BpmProcessFormValue aBpmProcessFormValue,
        BpmProcessFormValueDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmProcessFormValue, aQueryBean);
    } // end updateBpmProcessFormValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormValue DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmProcessFormValue aBpmProcessFormValue)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormValues DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValues,
        BpmProcessFormValueDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmProcessFormValue(aBpmProcessFormValues, aQueryBean, null);
    } // end synchronizeBpmProcessFormValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormValues DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValues,
        BpmProcessFormValueDAOQueryBean aQueryBean,
        BpmProcessFormValueSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmProcessFormValues) == false) {
            inputList.addAll(Arrays.asList(aBpmProcessFormValues));
        } // end if

        BpmProcessFormValue[] existentBpmProcessFormValues = this.queryBpmProcessFormValue(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmProcessFormValues) == false) {
            existentList.addAll(Arrays.asList(existentBpmProcessFormValues));
        } // end if

        List willAddBpmProcessFormValues = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmProcessFormValues = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmProcessFormValues = ListUtils.intersection(existentList,
                inputList);

        BpmProcessFormValue[] willUpdateBpmProcessFormValueArray = (BpmProcessFormValue[]) willUpdateBpmProcessFormValues.toArray(new BpmProcessFormValue[willUpdateBpmProcessFormValues.size()]);
        BpmProcessFormValue[] willAddBpmProcessFormValueArray = (BpmProcessFormValue[]) willAddBpmProcessFormValues.toArray(new BpmProcessFormValue[willAddBpmProcessFormValues.size()]);
        BpmProcessFormValue[] willDeleteBpmProcessFormValueArray = (BpmProcessFormValue[]) willDeleteBpmProcessFormValues.toArray(new BpmProcessFormValue[willDeleteBpmProcessFormValues.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmProcessFormValueArray,
                willUpdateBpmProcessFormValueArray,
                willDeleteBpmProcessFormValueArray);
        } // end if

        if (willUpdateBpmProcessFormValues.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmProcessFormValueArray);
            } // end if

            this.batchUpdateBpmProcessFormValue(willUpdateBpmProcessFormValueArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmProcessFormValueArray);
            } // end if
        } // end if

        if (willAddBpmProcessFormValues.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmProcessFormValueArray);
            } // end if

            this.batchInsertBpmProcessFormValue(willAddBpmProcessFormValueArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmProcessFormValueArray);
            } // end if
        } // end if

        if (willDeleteBpmProcessFormValues.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmProcessFormValueArray);
            } // end if

            for (int i = 0; i < willDeleteBpmProcessFormValueArray.length;
                    i++) {
                BpmProcessFormValue object = willDeleteBpmProcessFormValueArray[i];
                this.deleteBpmProcessFormValue(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmProcessFormValueArray);
            } // end if
        } // end if
    } // end synchronizeBpmProcessFormValue()

    /**
     * Query IBpmProcessFormValue
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmProcessFormValue findBpmProcessFormValueById(final long aId)
        throws Exception {
        BpmProcessFormValueDAOQueryBean queryBean = new BpmProcessFormValueDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmProcessFormValue[] BpmProcessFormValues = queryBpmProcessFormValue(queryBean);

        if (BpmProcessFormValues.length == 0) {
            return null;
        } // end if
        else {
            return BpmProcessFormValues[0];
        } // end else
    } // end findBpmProcessFormValueById()

    /**
     * Query IBpmProcessFormValue
     *
     * @param queryBean
     *
     * @return IBpmProcessFormValue[]
     *
     * @throws Exception
     */
    public BpmProcessFormValue[] queryBpmProcessFormValue(
        BpmProcessFormValueDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmProcessFormValueRowMapper());

        return (BpmProcessFormValue[]) result.toArray(new BpmProcessFormValue[result.size()]);
    } // end queryBpmProcessFormValue()

    /**
     * Query BpmProcessFormValue Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmProcessFormValueSelective(
        BpmProcessFormValueDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmProcessFormValueSelective()

    /**
     * Query IBpmProcessFormValue Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmProcessFormValueCount(
        BpmProcessFormValueDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmProcessFormValueCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmProcessFormValueRowMapper
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
            BpmProcessFormValue object = new BpmProcessFormValue();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DoubleValue = resultSet.getObject(columnIndex++);

                object.setDoubleValueNull(resultSet.getBoolean(columnIndex++));

                if (DoubleValue != null) {
                    BeanUtils.setProperty(object, DataProperty.DoubleValue,
                        DoubleValue);
                } // end if

                Object FormInstanceId = resultSet.getObject(columnIndex++);

                object.setFormInstanceIdNull(resultSet.getBoolean(columnIndex++));

                if (FormInstanceId != null) {
                    BeanUtils.setProperty(object, DataProperty.FormInstanceId,
                        FormInstanceId);
                } // end if

                Object LongValue = resultSet.getObject(columnIndex++);

                object.setLongValueNull(resultSet.getBoolean(columnIndex++));

                if (LongValue != null) {
                    BeanUtils.setProperty(object, DataProperty.LongValue,
                        LongValue);
                } // end if

                Object PropertyDataType = resultSet.getObject(columnIndex++);

                object.setPropertyDataTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyDataType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyDataType, PropertyDataType);
                } // end if

                Object PropertyName = resultSet.getObject(columnIndex++);

                object.setPropertyNameNull(resultSet.getBoolean(columnIndex++));

                if (PropertyName != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyName,
                        PropertyName);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object StringValue = resultSet.getObject(columnIndex++);

                object.setStringValueNull(resultSet.getBoolean(columnIndex++));

                if (StringValue != null) {
                    BeanUtils.setProperty(object, DataProperty.StringValue,
                        StringValue);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmProcessFormValueRowMapper
} // end BaseBpmProcessFormValueDAOJdbcImpl
