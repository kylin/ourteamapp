/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmFormFieldDefine;
import com.ourteam.bpm.dao.BpmFormFieldDefineDAOQueryBean;
import com.ourteam.bpm.dao.IBpmFormFieldDefineDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-11 13:32:33
 *
 * @author kylin
 */
abstract public class BaseBpmFormFieldDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmFormFieldDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, FieldKey, FieldName, FieldType, FormDefineId, ParentFieldId,
            Remarks, SortIndex, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.FieldKey, DataProperty.FieldName,
            DataProperty.FieldType, DataProperty.FormDefineId,
            DataProperty.ParentFieldId, DataProperty.Remarks,
            DataProperty.SortIndex, DataProperty.Status
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
     * Creates a new BaseBpmFormFieldDefineDAOJdbcImpl object.
     */
    public BaseBpmFormFieldDefineDAOJdbcImpl() {
        super();
    } // end BaseBpmFormFieldDefineDAOJdbcImpl()

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
     * Check Unique BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmFormFieldDefine aBpmFormFieldDefine)
        throws Exception {
        if (aBpmFormFieldDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmFormFieldDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     */
    public void insertBpmFormFieldDefine(BpmFormFieldDefine aBpmFormFieldDefine)
        throws Exception {
        insert(aBpmFormFieldDefine);
    } // end insertBpmFormFieldDefine()

    /**
     * Batch Insert IBpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     */
    public void batchInsertBpmFormFieldDefine(
        BpmFormFieldDefine[] aBpmFormFieldDefine) throws Exception {
        batchInsert(aBpmFormFieldDefine);
    } // end batchInsertBpmFormFieldDefine()

    /**
     * Delete IBpmFormFieldDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmFormFieldDefine(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmFormFieldDefine()

    /**
     * Delete IBpmFormFieldDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmFormFieldDefine(
        BpmFormFieldDefineDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmFormFieldDefine()

    /**
     * Update IBpmFormFieldDefine Selective
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     */
    public void updateBpmFormFieldDefine(BpmFormFieldDefine aBpmFormFieldDefine)
        throws Exception {
        if (aBpmFormFieldDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmFormFieldDefine);

        BpmFormFieldDefine tempObj = findBpmFormFieldDefineById(aBpmFormFieldDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmFormFieldDefine, tempObj);
        } // end if
    } // end updateBpmFormFieldDefine()

    /**
     * Batch Update IBpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     */
    public void batchUpdateBpmFormFieldDefine(
        BpmFormFieldDefine[] aBpmFormFieldDefine) throws Exception {
        batchUpdate(aBpmFormFieldDefine);
    } // end batchUpdateBpmFormFieldDefine()

    /**
     * Update IBpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmFormFieldDefine(
        BpmFormFieldDefine aBpmFormFieldDefine,
        BpmFormFieldDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmFormFieldDefine, aQueryBean);
    } // end updateBpmFormFieldDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmFormFieldDefine aBpmFormFieldDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormFieldDefine(
        BpmFormFieldDefine[] aBpmFormFieldDefines,
        BpmFormFieldDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmFormFieldDefine(aBpmFormFieldDefines, aQueryBean, null);
    } // end synchronizeBpmFormFieldDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormFieldDefine(
        BpmFormFieldDefine[] aBpmFormFieldDefines,
        BpmFormFieldDefineDAOQueryBean aQueryBean,
        BpmFormFieldDefineSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmFormFieldDefines) == false) {
            inputList.addAll(Arrays.asList(aBpmFormFieldDefines));
        } // end if

        BpmFormFieldDefine[] existentBpmFormFieldDefines = this.queryBpmFormFieldDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmFormFieldDefines) == false) {
            existentList.addAll(Arrays.asList(existentBpmFormFieldDefines));
        } // end if

        List willAddBpmFormFieldDefines = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmFormFieldDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmFormFieldDefines = ListUtils.intersection(existentList,
                inputList);

        BpmFormFieldDefine[] willUpdateBpmFormFieldDefineArray = (BpmFormFieldDefine[]) willUpdateBpmFormFieldDefines.toArray(new BpmFormFieldDefine[willUpdateBpmFormFieldDefines.size()]);
        BpmFormFieldDefine[] willAddBpmFormFieldDefineArray = (BpmFormFieldDefine[]) willAddBpmFormFieldDefines.toArray(new BpmFormFieldDefine[willAddBpmFormFieldDefines.size()]);
        BpmFormFieldDefine[] willDeleteBpmFormFieldDefineArray = (BpmFormFieldDefine[]) willDeleteBpmFormFieldDefines.toArray(new BpmFormFieldDefine[willDeleteBpmFormFieldDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmFormFieldDefineArray,
                willUpdateBpmFormFieldDefineArray,
                willDeleteBpmFormFieldDefineArray);
        } // end if

        if (willUpdateBpmFormFieldDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmFormFieldDefineArray);
            } // end if

            this.batchUpdateBpmFormFieldDefine(willUpdateBpmFormFieldDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmFormFieldDefineArray);
            } // end if
        } // end if

        if (willAddBpmFormFieldDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmFormFieldDefineArray);
            } // end if

            this.batchInsertBpmFormFieldDefine(willAddBpmFormFieldDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmFormFieldDefineArray);
            } // end if
        } // end if

        if (willDeleteBpmFormFieldDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmFormFieldDefineArray);
            } // end if

            for (int i = 0; i < willDeleteBpmFormFieldDefineArray.length;
                    i++) {
                BpmFormFieldDefine object = willDeleteBpmFormFieldDefineArray[i];
                this.deleteBpmFormFieldDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmFormFieldDefineArray);
            } // end if
        } // end if
    } // end synchronizeBpmFormFieldDefine()

    /**
     * Query IBpmFormFieldDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmFormFieldDefine findBpmFormFieldDefineById(final long aId)
        throws Exception {
        BpmFormFieldDefineDAOQueryBean queryBean = new BpmFormFieldDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmFormFieldDefine[] BpmFormFieldDefines = queryBpmFormFieldDefine(queryBean);

        if (BpmFormFieldDefines.length == 0) {
            return null;
        } // end if
        else {
            return BpmFormFieldDefines[0];
        } // end else
    } // end findBpmFormFieldDefineById()

    /**
     * Query IBpmFormFieldDefine
     *
     * @param queryBean
     *
     * @return IBpmFormFieldDefine[]
     *
     * @throws Exception
     */
    public BpmFormFieldDefine[] queryBpmFormFieldDefine(
        BpmFormFieldDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmFormFieldDefineRowMapper());

        return (BpmFormFieldDefine[]) result.toArray(new BpmFormFieldDefine[result.size()]);
    } // end queryBpmFormFieldDefine()

    /**
     * Query BpmFormFieldDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmFormFieldDefineSelective(
        BpmFormFieldDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmFormFieldDefineSelective()

    /**
     * Query IBpmFormFieldDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmFormFieldDefineCount(
        BpmFormFieldDefineDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmFormFieldDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmFormFieldDefineRowMapper
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
            BpmFormFieldDefine object = new BpmFormFieldDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object FieldKey = resultSet.getObject(columnIndex++);

                object.setFieldKeyNull(resultSet.getBoolean(columnIndex++));

                if (FieldKey != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldKey,
                        FieldKey);
                } // end if

                Object FieldName = resultSet.getObject(columnIndex++);

                object.setFieldNameNull(resultSet.getBoolean(columnIndex++));

                if (FieldName != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldName,
                        FieldName);
                } // end if

                Object FieldType = resultSet.getObject(columnIndex++);

                object.setFieldTypeNull(resultSet.getBoolean(columnIndex++));

                if (FieldType != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldType,
                        FieldType);
                } // end if

                Object FormDefineId = resultSet.getObject(columnIndex++);

                object.setFormDefineIdNull(resultSet.getBoolean(columnIndex++));

                if (FormDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.FormDefineId,
                        FormDefineId);
                } // end if

                Object ParentFieldId = resultSet.getObject(columnIndex++);

                object.setParentFieldIdNull(resultSet.getBoolean(columnIndex++));

                if (ParentFieldId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentFieldId,
                        ParentFieldId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmFormFieldDefineRowMapper
} // end BaseBpmFormFieldDefineDAOJdbcImpl
