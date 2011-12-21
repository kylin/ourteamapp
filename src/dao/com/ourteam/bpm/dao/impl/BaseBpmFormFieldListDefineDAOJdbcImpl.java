/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmFormFieldListDefine;
import com.ourteam.bpm.dao.BpmFormFieldListDefineDAOQueryBean;
import com.ourteam.bpm.dao.IBpmFormFieldListDefineDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-01 13:20:49
 *
 * @author kylin
 */
abstract public class BaseBpmFormFieldListDefineDAOJdbcImpl
    extends AbstractJdbcDAO implements IBpmFormFieldListDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, FieldId, ListKey, ListName, ListType, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.FieldId, DataProperty.ListKey,
            DataProperty.ListName, DataProperty.ListType, DataProperty.Remarks,
            DataProperty.Status
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
     * Creates a new BaseBpmFormFieldListDefineDAOJdbcImpl object.
     */
    public BaseBpmFormFieldListDefineDAOJdbcImpl() {
        super();
    } // end BaseBpmFormFieldListDefineDAOJdbcImpl()

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
     * Check Unique BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmFormFieldListDefine aBpmFormFieldListDefine)
        throws Exception {
        if (aBpmFormFieldListDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmFormFieldListDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     */
    public void insertBpmFormFieldListDefine(
        BpmFormFieldListDefine aBpmFormFieldListDefine)
        throws Exception {
        insert(aBpmFormFieldListDefine);
    } // end insertBpmFormFieldListDefine()

    /**
     * Batch Insert IBpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     */
    public void batchInsertBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefine)
        throws Exception {
        batchInsert(aBpmFormFieldListDefine);
    } // end batchInsertBpmFormFieldListDefine()

    /**
     * Delete IBpmFormFieldListDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmFormFieldListDefine(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmFormFieldListDefine()

    /**
     * Delete IBpmFormFieldListDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmFormFieldListDefine(
        BpmFormFieldListDefineDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmFormFieldListDefine()

    /**
     * Update IBpmFormFieldListDefine Selective
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     */
    public void updateBpmFormFieldListDefine(
        BpmFormFieldListDefine aBpmFormFieldListDefine)
        throws Exception {
        if (aBpmFormFieldListDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmFormFieldListDefine);

        BpmFormFieldListDefine tempObj = findBpmFormFieldListDefineById(aBpmFormFieldListDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmFormFieldListDefine, tempObj);
        } // end if
    } // end updateBpmFormFieldListDefine()

    /**
     * Batch Update IBpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     */
    public void batchUpdateBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefine)
        throws Exception {
        batchUpdate(aBpmFormFieldListDefine);
    } // end batchUpdateBpmFormFieldListDefine()

    /**
     * Update IBpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmFormFieldListDefine(
        BpmFormFieldListDefine aBpmFormFieldListDefine,
        BpmFormFieldListDefineDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBpmFormFieldListDefine, aQueryBean);
    } // end updateBpmFormFieldListDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldListDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        BpmFormFieldListDefine aBpmFormFieldListDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldListDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefines,
        BpmFormFieldListDefineDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeBpmFormFieldListDefine(aBpmFormFieldListDefines, aQueryBean,
            null);
    } // end synchronizeBpmFormFieldListDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldListDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefines,
        BpmFormFieldListDefineDAOQueryBean aQueryBean,
        BpmFormFieldListDefineSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmFormFieldListDefines) == false) {
            inputList.addAll(Arrays.asList(aBpmFormFieldListDefines));
        } // end if

        BpmFormFieldListDefine[] existentBpmFormFieldListDefines = this.queryBpmFormFieldListDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmFormFieldListDefines) == false) {
            existentList.addAll(Arrays.asList(existentBpmFormFieldListDefines));
        } // end if

        List willAddBpmFormFieldListDefines = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmFormFieldListDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmFormFieldListDefines = ListUtils.intersection(existentList,
                inputList);

        BpmFormFieldListDefine[] willUpdateBpmFormFieldListDefineArray = (BpmFormFieldListDefine[]) willUpdateBpmFormFieldListDefines.toArray(new BpmFormFieldListDefine[willUpdateBpmFormFieldListDefines.size()]);
        BpmFormFieldListDefine[] willAddBpmFormFieldListDefineArray = (BpmFormFieldListDefine[]) willAddBpmFormFieldListDefines.toArray(new BpmFormFieldListDefine[willAddBpmFormFieldListDefines.size()]);
        BpmFormFieldListDefine[] willDeleteBpmFormFieldListDefineArray = (BpmFormFieldListDefine[]) willDeleteBpmFormFieldListDefines.toArray(new BpmFormFieldListDefine[willDeleteBpmFormFieldListDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmFormFieldListDefineArray,
                willUpdateBpmFormFieldListDefineArray,
                willDeleteBpmFormFieldListDefineArray);
        } // end if

        if (willUpdateBpmFormFieldListDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmFormFieldListDefineArray);
            } // end if

            this.batchUpdateBpmFormFieldListDefine(willUpdateBpmFormFieldListDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmFormFieldListDefineArray);
            } // end if
        } // end if

        if (willAddBpmFormFieldListDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmFormFieldListDefineArray);
            } // end if

            this.batchInsertBpmFormFieldListDefine(willAddBpmFormFieldListDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmFormFieldListDefineArray);
            } // end if
        } // end if

        if (willDeleteBpmFormFieldListDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmFormFieldListDefineArray);
            } // end if

            for (int i = 0; i < willDeleteBpmFormFieldListDefineArray.length;
                    i++) {
                BpmFormFieldListDefine object = willDeleteBpmFormFieldListDefineArray[i];
                this.deleteBpmFormFieldListDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmFormFieldListDefineArray);
            } // end if
        } // end if
    } // end synchronizeBpmFormFieldListDefine()

    /**
     * Query IBpmFormFieldListDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmFormFieldListDefine findBpmFormFieldListDefineById(final long aId)
        throws Exception {
        BpmFormFieldListDefineDAOQueryBean queryBean = new BpmFormFieldListDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmFormFieldListDefine[] BpmFormFieldListDefines = queryBpmFormFieldListDefine(queryBean);

        if (BpmFormFieldListDefines.length == 0) {
            return null;
        } // end if
        else {
            return BpmFormFieldListDefines[0];
        } // end else
    } // end findBpmFormFieldListDefineById()

    /**
     * Query IBpmFormFieldListDefine
     *
     * @param queryBean
     *
     * @return IBpmFormFieldListDefine[]
     *
     * @throws Exception
     */
    public BpmFormFieldListDefine[] queryBpmFormFieldListDefine(
        BpmFormFieldListDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmFormFieldListDefineRowMapper());

        return (BpmFormFieldListDefine[]) result.toArray(new BpmFormFieldListDefine[result.size()]);
    } // end queryBpmFormFieldListDefine()

    /**
     * Query BpmFormFieldListDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmFormFieldListDefineSelective(
        BpmFormFieldListDefineDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmFormFieldListDefineSelective()

    /**
     * Query IBpmFormFieldListDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmFormFieldListDefineCount(
        BpmFormFieldListDefineDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmFormFieldListDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmFormFieldListDefineRowMapper
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
            BpmFormFieldListDefine object = new BpmFormFieldListDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object FieldId = resultSet.getObject(columnIndex++);

                object.setFieldIdNull(resultSet.getBoolean(columnIndex++));

                if (FieldId != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldId, FieldId);
                } // end if

                Object ListKey = resultSet.getObject(columnIndex++);

                object.setListKeyNull(resultSet.getBoolean(columnIndex++));

                if (ListKey != null) {
                    BeanUtils.setProperty(object, DataProperty.ListKey, ListKey);
                } // end if

                Object ListName = resultSet.getObject(columnIndex++);

                object.setListNameNull(resultSet.getBoolean(columnIndex++));

                if (ListName != null) {
                    BeanUtils.setProperty(object, DataProperty.ListName,
                        ListName);
                } // end if

                Object ListType = resultSet.getObject(columnIndex++);

                object.setListTypeNull(resultSet.getBoolean(columnIndex++));

                if (ListType != null) {
                    BeanUtils.setProperty(object, DataProperty.ListType,
                        ListType);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmFormFieldListDefineRowMapper
} // end BaseBpmFormFieldListDefineDAOJdbcImpl
