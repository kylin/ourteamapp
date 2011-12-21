/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IObjectMappingDAO;
import com.ourteam.modelbase.dao.ObjectMapping;
import com.ourteam.modelbase.dao.ObjectMappingDAOQueryBean;

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
 * ∂‘œÛ”≥…‰ DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseObjectMappingDAOJdbcImpl extends AbstractJdbcDAO
    implements IObjectMappingDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ObjectMappingId, BusinessObjectId, PersistentObjectId, State
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ObjectMappingId, DataProperty.BusinessObjectId,
            DataProperty.PersistentObjectId, DataProperty.State
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { ObjectMappingId };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            ObjectMappingId
        };

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
     * Creates a new BaseObjectMappingDAOJdbcImpl object.
     */
    public BaseObjectMappingDAOJdbcImpl() {
        super();
    } // end BaseObjectMappingDAOJdbcImpl()

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
     * Check Unique ObjectMapping
     *
     * @param aObjectMapping
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ObjectMapping aObjectMapping)
        throws Exception {
        if (aObjectMapping == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aObjectMapping,
                DataProperty.ObjectMappingId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IObjectMapping
     *
     * @param aObjectMapping
     *
     * @throws Exception
     */
    public void insertObjectMapping(ObjectMapping aObjectMapping)
        throws Exception {
        insert(aObjectMapping);
    } // end insertObjectMapping()

    /**
     * Batch Insert IObjectMapping
     *
     * @param aObjectMapping
     *
     * @throws Exception
     */
    public void batchInsertObjectMapping(ObjectMapping[] aObjectMapping)
        throws Exception {
        batchInsert(aObjectMapping);
    } // end batchInsertObjectMapping()

    /**
     * Delete IObjectMapping
     *
     * @param aObjectMappingId long aObjectMappingId
     *
     * @throws Exception
     */
    public void deleteObjectMapping(final long aObjectMappingId)
        throws Exception {
        deleteById(new Object[] { new Long(aObjectMappingId) });
    } // end deleteObjectMapping()

    /**
     * Delete IObjectMapping
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteObjectMapping(ObjectMappingDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteObjectMapping()

    /**
     * Update IObjectMapping Selective
     *
     * @param aObjectMapping
     *
     * @throws Exception
     */
    public void updateObjectMapping(ObjectMapping aObjectMapping)
        throws Exception {
        if (aObjectMapping.getObjectMappingId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aObjectMapping);

        ObjectMapping tempObj = findObjectMappingById(aObjectMapping.getObjectMappingId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aObjectMapping, tempObj);
        } // end if
    } // end updateObjectMapping()

    /**
     * Batch Update IObjectMapping
     *
     * @param aObjectMapping
     *
     * @throws Exception
     */
    public void batchUpdateObjectMapping(ObjectMapping[] aObjectMapping)
        throws Exception {
        batchUpdate(aObjectMapping);
    } // end batchUpdateObjectMapping()

    /**
     * Update IObjectMapping
     *
     * @param aObjectMapping
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateObjectMapping(ObjectMapping aObjectMapping,
        ObjectMappingDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aObjectMapping, aQueryBean);
    } // end updateObjectMapping()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectMapping DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ObjectMapping aObjectMapping)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectMappings DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectMapping(ObjectMapping[] aObjectMappings,
        ObjectMappingDAOQueryBean aQueryBean) throws Exception {
        synchronizeObjectMapping(aObjectMappings, aQueryBean, null);
    } // end synchronizeObjectMapping()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectMappings DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectMapping(ObjectMapping[] aObjectMappings,
        ObjectMappingDAOQueryBean aQueryBean,
        ObjectMappingSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aObjectMappings) == false) {
            inputList.addAll(Arrays.asList(aObjectMappings));
        } // end if

        ObjectMapping[] existentObjectMappings = this.queryObjectMapping(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentObjectMappings) == false) {
            existentList.addAll(Arrays.asList(existentObjectMappings));
        } // end if

        List willAddObjectMappings = ListUtils.subtract(inputList, existentList);

        List willDeleteObjectMappings = ListUtils.subtract(existentList,
                inputList);

        List willUpdateObjectMappings = ListUtils.intersection(existentList,
                inputList);

        ObjectMapping[] willUpdateObjectMappingArray = (ObjectMapping[]) willUpdateObjectMappings.toArray(new ObjectMapping[willUpdateObjectMappings.size()]);
        ObjectMapping[] willAddObjectMappingArray = (ObjectMapping[]) willAddObjectMappings.toArray(new ObjectMapping[willAddObjectMappings.size()]);
        ObjectMapping[] willDeleteObjectMappingArray = (ObjectMapping[]) willDeleteObjectMappings.toArray(new ObjectMapping[willDeleteObjectMappings.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddObjectMappingArray,
                willUpdateObjectMappingArray, willDeleteObjectMappingArray);
        } // end if

        if (willUpdateObjectMappings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateObjectMappingArray);
            } // end if

            this.batchUpdateObjectMapping(willUpdateObjectMappingArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateObjectMappingArray);
            } // end if
        } // end if

        if (willAddObjectMappings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddObjectMappingArray);
            } // end if

            this.batchInsertObjectMapping(willAddObjectMappingArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddObjectMappingArray);
            } // end if
        } // end if

        if (willDeleteObjectMappings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteObjectMappingArray);
            } // end if

            for (int i = 0; i < willDeleteObjectMappingArray.length; i++) {
                ObjectMapping object = willDeleteObjectMappingArray[i];
                this.deleteObjectMapping(object.getObjectMappingId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteObjectMappingArray);
            } // end if
        } // end if
    } // end synchronizeObjectMapping()

    /**
     * Query IObjectMapping
     *
     * @param aObjectMappingId long aObjectMappingId
     *
     * @return
     *
     * @throws Exception
     */
    public ObjectMapping findObjectMappingById(final long aObjectMappingId)
        throws Exception {
        ObjectMappingDAOQueryBean queryBean = new ObjectMappingDAOQueryBean();

        queryBean.createCriteria()
                 .andObjectMappingIdEqualTo(new java.lang.Long(aObjectMappingId));

        queryBean.setDistinct(true);

        ObjectMapping[] ObjectMappings = queryObjectMapping(queryBean);

        if (ObjectMappings.length == 0) {
            return null;
        } // end if
        else {
            return ObjectMappings[0];
        } // end else
    } // end findObjectMappingById()

    /**
     * Query IObjectMapping
     *
     * @param queryBean
     *
     * @return IObjectMapping[]
     *
     * @throws Exception
     */
    public ObjectMapping[] queryObjectMapping(
        ObjectMappingDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcObjectMappingRowMapper());

        return (ObjectMapping[]) result.toArray(new ObjectMapping[result.size()]);
    } // end queryObjectMapping()

    /**
     * Query ObjectMapping Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryObjectMappingSelective(
        ObjectMappingDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryObjectMappingSelective()

    /**
     * Query IObjectMapping Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryObjectMappingCount(ObjectMappingDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryObjectMappingCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcObjectMappingRowMapper
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
            ObjectMapping object = new ObjectMapping();

            int columnIndex = 1;

            try {
                Object ObjectMappingId = resultSet.getObject(columnIndex++);

                object.setObjectMappingIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ObjectMappingId != null) {
                    BeanUtils.setProperty(object, DataProperty.ObjectMappingId,
                        ObjectMappingId);
                } // end if

                Object BusinessObjectId = resultSet.getObject(columnIndex++);

                object.setBusinessObjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessObjectId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessObjectId, BusinessObjectId);
                } // end if

                Object PersistentObjectId = resultSet.getObject(columnIndex++);

                object.setPersistentObjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (PersistentObjectId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PersistentObjectId, PersistentObjectId);
                } // end if

                Object State = resultSet.getObject(columnIndex++);

                object.setStateNull(resultSet.getBoolean(columnIndex++));

                if (State != null) {
                    BeanUtils.setProperty(object, DataProperty.State, State);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcObjectMappingRowMapper
} // end BaseObjectMappingDAOJdbcImpl
