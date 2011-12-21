/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IObjectPropertyDAO;
import com.ourteam.modelbase.dao.ObjectProperty;
import com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean;

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
 * ∂‘œÛ Ù–‘ DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseObjectPropertyDAOJdbcImpl extends AbstractJdbcDAO
    implements IObjectPropertyDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ObjectPropertyId, DataSize, DataType, Description, IsEnum,
            IsGenerate, IsPrimaryProperty, Name, ObjectId, OrderIndex,
            PropertyKind, State, Type, Value, IsUnique, ObjectName, IsAllowNull,
            PrecisionSize, IsReadable, IsWritable, IsArray, ReferenceObjectId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ObjectPropertyId, DataProperty.DataSize,
            DataProperty.DataType, DataProperty.Description, DataProperty.IsEnum,
            DataProperty.IsGenerate, DataProperty.IsPrimaryProperty,
            DataProperty.Name, DataProperty.ObjectId, DataProperty.OrderIndex,
            DataProperty.PropertyKind, DataProperty.State, DataProperty.Type,
            DataProperty.Value, DataProperty.IsUnique, DataProperty.ObjectName,
            DataProperty.IsAllowNull, DataProperty.PrecisionSize,
            DataProperty.IsReadable, DataProperty.IsWritable,
            DataProperty.IsArray, DataProperty.ReferenceObjectId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            ObjectPropertyId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            ObjectPropertyId
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
     * Creates a new BaseObjectPropertyDAOJdbcImpl object.
     */
    public BaseObjectPropertyDAOJdbcImpl() {
        super();
    } // end BaseObjectPropertyDAOJdbcImpl()

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
                " LEFT JOIN BUSINESS_OBJECT businessObject ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " businessObject.BUSINESS_OBJECT_ID = OBJECT_PROPERTY.OBJECT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ObjectProperty
     *
     * @param aObjectProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ObjectProperty aObjectProperty)
        throws Exception {
        if (aObjectProperty == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aObjectProperty,
                DataProperty.ObjectPropertyId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IObjectProperty
     *
     * @param aObjectProperty
     *
     * @throws Exception
     */
    public void insertObjectProperty(ObjectProperty aObjectProperty)
        throws Exception {
        insert(aObjectProperty);
    } // end insertObjectProperty()

    /**
     * Batch Insert IObjectProperty
     *
     * @param aObjectProperty
     *
     * @throws Exception
     */
    public void batchInsertObjectProperty(ObjectProperty[] aObjectProperty)
        throws Exception {
        batchInsert(aObjectProperty);
    } // end batchInsertObjectProperty()

    /**
     * Delete IObjectProperty
     *
     * @param aObjectPropertyId long aObjectPropertyId
     *
     * @throws Exception
     */
    public void deleteObjectProperty(final long aObjectPropertyId)
        throws Exception {
        deleteById(new Object[] { new Long(aObjectPropertyId) });
    } // end deleteObjectProperty()

    /**
     * Delete IObjectProperty
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteObjectProperty(ObjectPropertyDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteObjectProperty()

    /**
     * Update IObjectProperty Selective
     *
     * @param aObjectProperty
     *
     * @throws Exception
     */
    public void updateObjectProperty(ObjectProperty aObjectProperty)
        throws Exception {
        if (aObjectProperty.getObjectPropertyId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aObjectProperty);

        ObjectProperty tempObj = findObjectPropertyById(aObjectProperty.getObjectPropertyId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aObjectProperty, tempObj);
        } // end if
    } // end updateObjectProperty()

    /**
     * Batch Update IObjectProperty
     *
     * @param aObjectProperty
     *
     * @throws Exception
     */
    public void batchUpdateObjectProperty(ObjectProperty[] aObjectProperty)
        throws Exception {
        batchUpdate(aObjectProperty);
    } // end batchUpdateObjectProperty()

    /**
     * Update IObjectProperty
     *
     * @param aObjectProperty
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateObjectProperty(ObjectProperty aObjectProperty,
        ObjectPropertyDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aObjectProperty, aQueryBean);
    } // end updateObjectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectProperty DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ObjectProperty aObjectProperty)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectPropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectProperty(ObjectProperty[] aObjectPropertys,
        ObjectPropertyDAOQueryBean aQueryBean) throws Exception {
        synchronizeObjectProperty(aObjectPropertys, aQueryBean, null);
    } // end synchronizeObjectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectPropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectProperty(ObjectProperty[] aObjectPropertys,
        ObjectPropertyDAOQueryBean aQueryBean,
        ObjectPropertySynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aObjectPropertys) == false) {
            inputList.addAll(Arrays.asList(aObjectPropertys));
        } // end if

        ObjectProperty[] existentObjectPropertys = this.queryObjectProperty(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentObjectPropertys) == false) {
            existentList.addAll(Arrays.asList(existentObjectPropertys));
        } // end if

        List willAddObjectPropertys = ListUtils.subtract(inputList, existentList);

        List willDeleteObjectPropertys = ListUtils.subtract(existentList,
                inputList);

        List willUpdateObjectPropertys = ListUtils.intersection(existentList,
                inputList);

        ObjectProperty[] willUpdateObjectPropertyArray = (ObjectProperty[]) willUpdateObjectPropertys.toArray(new ObjectProperty[willUpdateObjectPropertys.size()]);
        ObjectProperty[] willAddObjectPropertyArray = (ObjectProperty[]) willAddObjectPropertys.toArray(new ObjectProperty[willAddObjectPropertys.size()]);
        ObjectProperty[] willDeleteObjectPropertyArray = (ObjectProperty[]) willDeleteObjectPropertys.toArray(new ObjectProperty[willDeleteObjectPropertys.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddObjectPropertyArray,
                willUpdateObjectPropertyArray, willDeleteObjectPropertyArray);
        } // end if

        if (willUpdateObjectPropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateObjectPropertyArray);
            } // end if

            this.batchUpdateObjectProperty(willUpdateObjectPropertyArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateObjectPropertyArray);
            } // end if
        } // end if

        if (willAddObjectPropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddObjectPropertyArray);
            } // end if

            this.batchInsertObjectProperty(willAddObjectPropertyArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddObjectPropertyArray);
            } // end if
        } // end if

        if (willDeleteObjectPropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteObjectPropertyArray);
            } // end if

            for (int i = 0; i < willDeleteObjectPropertyArray.length; i++) {
                ObjectProperty object = willDeleteObjectPropertyArray[i];
                this.deleteObjectProperty(object.getObjectPropertyId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteObjectPropertyArray);
            } // end if
        } // end if
    } // end synchronizeObjectProperty()

    /**
     * Query IObjectProperty
     *
     * @param aObjectPropertyId long aObjectPropertyId
     *
     * @return
     *
     * @throws Exception
     */
    public ObjectProperty findObjectPropertyById(final long aObjectPropertyId)
        throws Exception {
        ObjectPropertyDAOQueryBean queryBean = new ObjectPropertyDAOQueryBean();

        queryBean.createCriteria()
                 .andObjectPropertyIdEqualTo(new java.lang.Long(
                aObjectPropertyId));

        queryBean.setDistinct(true);

        ObjectProperty[] ObjectPropertys = queryObjectProperty(queryBean);

        if (ObjectPropertys.length == 0) {
            return null;
        } // end if
        else {
            return ObjectPropertys[0];
        } // end else
    } // end findObjectPropertyById()

    /**
     * Query IObjectProperty
     *
     * @param queryBean
     *
     * @return IObjectProperty[]
     *
     * @throws Exception
     */
    public ObjectProperty[] queryObjectProperty(
        ObjectPropertyDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcObjectPropertyRowMapper());

        return (ObjectProperty[]) result.toArray(new ObjectProperty[result.size()]);
    } // end queryObjectProperty()

    /**
     * Query ObjectProperty Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryObjectPropertySelective(
        ObjectPropertyDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryObjectPropertySelective()

    /**
     * Query IObjectProperty Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryObjectPropertyCount(ObjectPropertyDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryObjectPropertyCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcObjectPropertyRowMapper
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
            ObjectProperty object = new ObjectProperty();

            int columnIndex = 1;

            try {
                Object ObjectPropertyId = resultSet.getObject(columnIndex++);

                object.setObjectPropertyIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ObjectPropertyId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ObjectPropertyId, ObjectPropertyId);
                } // end if

                Object DataSize = resultSet.getObject(columnIndex++);

                object.setDataSizeNull(resultSet.getBoolean(columnIndex++));

                if (DataSize != null) {
                    BeanUtils.setProperty(object, DataProperty.DataSize,
                        DataSize);
                } // end if

                Object DataType = resultSet.getObject(columnIndex++);

                object.setDataTypeNull(resultSet.getBoolean(columnIndex++));

                if (DataType != null) {
                    BeanUtils.setProperty(object, DataProperty.DataType,
                        DataType);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object IsEnum = resultSet.getObject(columnIndex++);

                object.setIsEnumNull(resultSet.getBoolean(columnIndex++));

                if (IsEnum != null) {
                    BeanUtils.setProperty(object, DataProperty.IsEnum, IsEnum);
                } // end if

                Object IsGenerate = resultSet.getObject(columnIndex++);

                object.setIsGenerateNull(resultSet.getBoolean(columnIndex++));

                if (IsGenerate != null) {
                    BeanUtils.setProperty(object, DataProperty.IsGenerate,
                        IsGenerate);
                } // end if

                Object IsPrimaryProperty = resultSet.getObject(columnIndex++);

                object.setIsPrimaryPropertyNull(resultSet.getBoolean(
                        columnIndex++));

                if (IsPrimaryProperty != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.IsPrimaryProperty, IsPrimaryProperty);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object ObjectId = resultSet.getObject(columnIndex++);

                object.setObjectIdNull(resultSet.getBoolean(columnIndex++));

                if (ObjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.ObjectId,
                        ObjectId);
                } // end if

                Object OrderIndex = resultSet.getObject(columnIndex++);

                object.setOrderIndexNull(resultSet.getBoolean(columnIndex++));

                if (OrderIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.OrderIndex,
                        OrderIndex);
                } // end if

                Object PropertyKind = resultSet.getObject(columnIndex++);

                object.setPropertyKindNull(resultSet.getBoolean(columnIndex++));

                if (PropertyKind != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyKind,
                        PropertyKind);
                } // end if

                Object State = resultSet.getObject(columnIndex++);

                object.setStateNull(resultSet.getBoolean(columnIndex++));

                if (State != null) {
                    BeanUtils.setProperty(object, DataProperty.State, State);
                } // end if

                Object Type = resultSet.getObject(columnIndex++);

                object.setTypeNull(resultSet.getBoolean(columnIndex++));

                if (Type != null) {
                    BeanUtils.setProperty(object, DataProperty.Type, Type);
                } // end if

                Object Value = resultSet.getObject(columnIndex++);

                object.setValueNull(resultSet.getBoolean(columnIndex++));

                if (Value != null) {
                    BeanUtils.setProperty(object, DataProperty.Value, Value);
                } // end if

                Object IsUnique = resultSet.getObject(columnIndex++);

                object.setIsUniqueNull(resultSet.getBoolean(columnIndex++));

                if (IsUnique != null) {
                    BeanUtils.setProperty(object, DataProperty.IsUnique,
                        IsUnique);
                } // end if

                Object ObjectName = resultSet.getObject(columnIndex++);

                object.setObjectNameNull(resultSet.getBoolean(columnIndex++));

                if (ObjectName != null) {
                    BeanUtils.setProperty(object, DataProperty.ObjectName,
                        ObjectName);
                } // end if

                Object IsAllowNull = resultSet.getObject(columnIndex++);

                object.setIsAllowNullNull(resultSet.getBoolean(columnIndex++));

                if (IsAllowNull != null) {
                    BeanUtils.setProperty(object, DataProperty.IsAllowNull,
                        IsAllowNull);
                } // end if

                Object PrecisionSize = resultSet.getObject(columnIndex++);

                object.setPrecisionSizeNull(resultSet.getBoolean(columnIndex++));

                if (PrecisionSize != null) {
                    BeanUtils.setProperty(object, DataProperty.PrecisionSize,
                        PrecisionSize);
                } // end if

                Object IsReadable = resultSet.getObject(columnIndex++);

                object.setIsReadableNull(resultSet.getBoolean(columnIndex++));

                if (IsReadable != null) {
                    BeanUtils.setProperty(object, DataProperty.IsReadable,
                        IsReadable);
                } // end if

                Object IsWritable = resultSet.getObject(columnIndex++);

                object.setIsWritableNull(resultSet.getBoolean(columnIndex++));

                if (IsWritable != null) {
                    BeanUtils.setProperty(object, DataProperty.IsWritable,
                        IsWritable);
                } // end if

                Object IsArray = resultSet.getObject(columnIndex++);

                object.setIsArrayNull(resultSet.getBoolean(columnIndex++));

                if (IsArray != null) {
                    BeanUtils.setProperty(object, DataProperty.IsArray, IsArray);
                } // end if

                Object ReferenceObjectId = resultSet.getObject(columnIndex++);

                object.setReferenceObjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReferenceObjectId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReferenceObjectId, ReferenceObjectId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcObjectPropertyRowMapper
} // end BaseObjectPropertyDAOJdbcImpl
