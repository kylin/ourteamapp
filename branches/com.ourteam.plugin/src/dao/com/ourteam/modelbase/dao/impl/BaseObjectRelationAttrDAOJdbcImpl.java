/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IObjectRelationAttrDAO;
import com.ourteam.modelbase.dao.ObjectRelationAttr;
import com.ourteam.modelbase.dao.ObjectRelationAttrDAOQueryBean;

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
 * 关联关系映射属性 DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseObjectRelationAttrDAOJdbcImpl extends AbstractJdbcDAO
    implements IObjectRelationAttrDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ObjectRelationAttrId, ObjectRelationId, PropertyId,
            RelatedPropertyId, ObjectRelationDescription, PropertyDataSize,
            PropertyDataType, PropertyDescription, PropertyIsEnum,
            PropertyIsGenerate, PropertyIsPrimaryProperty, PropertyName,
            PropertyObjectId, PropertyOrderIndex, PropertyKind, PropertyState,
            PropertyType, PropertyValue, RelatedPropertyDataSize,
            RelatedPropertyDataType, RelatedPropertyDescription,
            RelatedPropertyIsEnum, RelatedPropertyIsGenerate,
            RelatedPropertyIsPrimaryProperty, RelatedPropertyName,
            RelatedPropertyObjectId, RelatedPropertyOrderIndex,
            RelatedPropertyKind, RelatedPropertyState, RelatedPropertyType,
            RelatedPropertyValue, RelateAttrType, PropertyIsUnique,
            RelatedPropertyIsUnique
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ObjectRelationAttrId, DataProperty.ObjectRelationId,
            DataProperty.PropertyId, DataProperty.RelatedPropertyId,
            DataProperty.ObjectRelationDescription,
            DataProperty.PropertyDataSize, DataProperty.PropertyDataType,
            DataProperty.PropertyDescription, DataProperty.PropertyIsEnum,
            DataProperty.PropertyIsGenerate,
            DataProperty.PropertyIsPrimaryProperty, DataProperty.PropertyName,
            DataProperty.PropertyObjectId, DataProperty.PropertyOrderIndex,
            DataProperty.PropertyKind, DataProperty.PropertyState,
            DataProperty.PropertyType, DataProperty.PropertyValue,
            DataProperty.RelatedPropertyDataSize,
            DataProperty.RelatedPropertyDataType,
            DataProperty.RelatedPropertyDescription,
            DataProperty.RelatedPropertyIsEnum,
            DataProperty.RelatedPropertyIsGenerate,
            DataProperty.RelatedPropertyIsPrimaryProperty,
            DataProperty.RelatedPropertyName,
            DataProperty.RelatedPropertyObjectId,
            DataProperty.RelatedPropertyOrderIndex,
            DataProperty.RelatedPropertyKind, DataProperty.RelatedPropertyState,
            DataProperty.RelatedPropertyType, DataProperty.RelatedPropertyValue,
            DataProperty.RelateAttrType, DataProperty.PropertyIsUnique,
            DataProperty.RelatedPropertyIsUnique
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            ObjectRelationAttrId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            ObjectRelationAttrId
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
     * Creates a new BaseObjectRelationAttrDAOJdbcImpl object.
     */
    public BaseObjectRelationAttrDAOJdbcImpl() {
        super();
    } // end BaseObjectRelationAttrDAOJdbcImpl()

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
                " LEFT JOIN OBJECT_RELATION objectRelation ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " objectRelation.OBJECT_RELATION_ID = OBJECT_RELATION_ATTR.OBJECT_RELATION_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN OBJECT_PROPERTY property ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " property.OBJECT_PROPERTY = OBJECT_RELATION_ATTR.PROPERTY_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN OBJECT_PROPERTY relatedProperty ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " relatedProperty.OBJECT_PROPERTY = OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ObjectRelationAttr aObjectRelationAttr)
        throws Exception {
        if (aObjectRelationAttr == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aObjectRelationAttr,
                DataProperty.ObjectRelationAttrId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     */
    public void insertObjectRelationAttr(ObjectRelationAttr aObjectRelationAttr)
        throws Exception {
        insert(aObjectRelationAttr);
    } // end insertObjectRelationAttr()

    /**
     * Batch Insert IObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     */
    public void batchInsertObjectRelationAttr(
        ObjectRelationAttr[] aObjectRelationAttr) throws Exception {
        batchInsert(aObjectRelationAttr);
    } // end batchInsertObjectRelationAttr()

    /**
     * Delete IObjectRelationAttr
     *
     * @param aObjectRelationAttrId long aObjectRelationAttrId
     *
     * @throws Exception
     */
    public void deleteObjectRelationAttr(final long aObjectRelationAttrId)
        throws Exception {
        deleteById(new Object[] { new Long(aObjectRelationAttrId) });
    } // end deleteObjectRelationAttr()

    /**
     * Delete IObjectRelationAttr
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteObjectRelationAttr(
        ObjectRelationAttrDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteObjectRelationAttr()

    /**
     * Update IObjectRelationAttr Selective
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     */
    public void updateObjectRelationAttr(ObjectRelationAttr aObjectRelationAttr)
        throws Exception {
        if (aObjectRelationAttr.getObjectRelationAttrId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aObjectRelationAttr);

        ObjectRelationAttr tempObj = findObjectRelationAttrById(aObjectRelationAttr.getObjectRelationAttrId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aObjectRelationAttr, tempObj);
        } // end if
    } // end updateObjectRelationAttr()

    /**
     * Batch Update IObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     */
    public void batchUpdateObjectRelationAttr(
        ObjectRelationAttr[] aObjectRelationAttr) throws Exception {
        batchUpdate(aObjectRelationAttr);
    } // end batchUpdateObjectRelationAttr()

    /**
     * Update IObjectRelationAttr
     *
     * @param aObjectRelationAttr
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateObjectRelationAttr(
        ObjectRelationAttr aObjectRelationAttr,
        ObjectRelationAttrDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aObjectRelationAttr, aQueryBean);
    } // end updateObjectRelationAttr()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelationAttr DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ObjectRelationAttr aObjectRelationAttr)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelationAttrs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectRelationAttr(
        ObjectRelationAttr[] aObjectRelationAttrs,
        ObjectRelationAttrDAOQueryBean aQueryBean) throws Exception {
        synchronizeObjectRelationAttr(aObjectRelationAttrs, aQueryBean, null);
    } // end synchronizeObjectRelationAttr()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelationAttrs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectRelationAttr(
        ObjectRelationAttr[] aObjectRelationAttrs,
        ObjectRelationAttrDAOQueryBean aQueryBean,
        ObjectRelationAttrSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aObjectRelationAttrs) == false) {
            inputList.addAll(Arrays.asList(aObjectRelationAttrs));
        } // end if

        ObjectRelationAttr[] existentObjectRelationAttrs = this.queryObjectRelationAttr(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentObjectRelationAttrs) == false) {
            existentList.addAll(Arrays.asList(existentObjectRelationAttrs));
        } // end if

        List willAddObjectRelationAttrs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteObjectRelationAttrs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateObjectRelationAttrs = ListUtils.intersection(existentList,
                inputList);

        ObjectRelationAttr[] willUpdateObjectRelationAttrArray = (ObjectRelationAttr[]) willUpdateObjectRelationAttrs.toArray(new ObjectRelationAttr[willUpdateObjectRelationAttrs.size()]);
        ObjectRelationAttr[] willAddObjectRelationAttrArray = (ObjectRelationAttr[]) willAddObjectRelationAttrs.toArray(new ObjectRelationAttr[willAddObjectRelationAttrs.size()]);
        ObjectRelationAttr[] willDeleteObjectRelationAttrArray = (ObjectRelationAttr[]) willDeleteObjectRelationAttrs.toArray(new ObjectRelationAttr[willDeleteObjectRelationAttrs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddObjectRelationAttrArray,
                willUpdateObjectRelationAttrArray,
                willDeleteObjectRelationAttrArray);
        } // end if

        if (willUpdateObjectRelationAttrs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateObjectRelationAttrArray);
            } // end if

            this.batchUpdateObjectRelationAttr(willUpdateObjectRelationAttrArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateObjectRelationAttrArray);
            } // end if
        } // end if

        if (willAddObjectRelationAttrs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddObjectRelationAttrArray);
            } // end if

            this.batchInsertObjectRelationAttr(willAddObjectRelationAttrArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddObjectRelationAttrArray);
            } // end if
        } // end if

        if (willDeleteObjectRelationAttrs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteObjectRelationAttrArray);
            } // end if

            for (int i = 0; i < willDeleteObjectRelationAttrArray.length;
                    i++) {
                ObjectRelationAttr object = willDeleteObjectRelationAttrArray[i];
                this.deleteObjectRelationAttr(object.getObjectRelationAttrId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteObjectRelationAttrArray);
            } // end if
        } // end if
    } // end synchronizeObjectRelationAttr()

    /**
     * Query IObjectRelationAttr
     *
     * @param aObjectRelationAttrId long aObjectRelationAttrId
     *
     * @return
     *
     * @throws Exception
     */
    public ObjectRelationAttr findObjectRelationAttrById(
        final long aObjectRelationAttrId) throws Exception {
        ObjectRelationAttrDAOQueryBean queryBean = new ObjectRelationAttrDAOQueryBean();

        queryBean.createCriteria()
                 .andObjectRelationAttrIdEqualTo(new java.lang.Long(
                aObjectRelationAttrId));

        queryBean.setDistinct(true);

        ObjectRelationAttr[] ObjectRelationAttrs = queryObjectRelationAttr(queryBean);

        if (ObjectRelationAttrs.length == 0) {
            return null;
        } // end if
        else {
            return ObjectRelationAttrs[0];
        } // end else
    } // end findObjectRelationAttrById()

    /**
     * Query IObjectRelationAttr
     *
     * @param queryBean
     *
     * @return IObjectRelationAttr[]
     *
     * @throws Exception
     */
    public ObjectRelationAttr[] queryObjectRelationAttr(
        ObjectRelationAttrDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcObjectRelationAttrRowMapper());

        return (ObjectRelationAttr[]) result.toArray(new ObjectRelationAttr[result.size()]);
    } // end queryObjectRelationAttr()

    /**
     * Query ObjectRelationAttr Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryObjectRelationAttrSelective(
        ObjectRelationAttrDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryObjectRelationAttrSelective()

    /**
     * Query IObjectRelationAttr Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryObjectRelationAttrCount(
        ObjectRelationAttrDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryObjectRelationAttrCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcObjectRelationAttrRowMapper
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
            ObjectRelationAttr object = new ObjectRelationAttr();

            int columnIndex = 1;

            try {
                Object ObjectRelationAttrId = resultSet.getObject(columnIndex++);

                object.setObjectRelationAttrIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ObjectRelationAttrId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ObjectRelationAttrId, ObjectRelationAttrId);
                } // end if

                Object ObjectRelationId = resultSet.getObject(columnIndex++);

                object.setObjectRelationIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ObjectRelationId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ObjectRelationId, ObjectRelationId);
                } // end if

                Object PropertyId = resultSet.getObject(columnIndex++);

                object.setPropertyIdNull(resultSet.getBoolean(columnIndex++));

                if (PropertyId != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyId,
                        PropertyId);
                } // end if

                Object RelatedPropertyId = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyId, RelatedPropertyId);
                } // end if

                Object ObjectRelationDescription = resultSet.getObject(columnIndex++);

                object.setObjectRelationDescriptionNull(resultSet.getBoolean(
                        columnIndex++));

                if (ObjectRelationDescription != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ObjectRelationDescription,
                        ObjectRelationDescription);
                } // end if

                Object PropertyDataSize = resultSet.getObject(columnIndex++);

                object.setPropertyDataSizeNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyDataSize != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyDataSize, PropertyDataSize);
                } // end if

                Object PropertyDataType = resultSet.getObject(columnIndex++);

                object.setPropertyDataTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyDataType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyDataType, PropertyDataType);
                } // end if

                Object PropertyDescription = resultSet.getObject(columnIndex++);

                object.setPropertyDescriptionNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyDescription != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyDescription, PropertyDescription);
                } // end if

                Object PropertyIsEnum = resultSet.getObject(columnIndex++);

                object.setPropertyIsEnumNull(resultSet.getBoolean(columnIndex++));

                if (PropertyIsEnum != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyIsEnum,
                        PropertyIsEnum);
                } // end if

                Object PropertyIsGenerate = resultSet.getObject(columnIndex++);

                object.setPropertyIsGenerateNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyIsGenerate != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyIsGenerate, PropertyIsGenerate);
                } // end if

                Object PropertyIsPrimaryProperty = resultSet.getObject(columnIndex++);

                object.setPropertyIsPrimaryPropertyNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyIsPrimaryProperty != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyIsPrimaryProperty,
                        PropertyIsPrimaryProperty);
                } // end if

                Object PropertyName = resultSet.getObject(columnIndex++);

                object.setPropertyNameNull(resultSet.getBoolean(columnIndex++));

                if (PropertyName != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyName,
                        PropertyName);
                } // end if

                Object PropertyObjectId = resultSet.getObject(columnIndex++);

                object.setPropertyObjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyObjectId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyObjectId, PropertyObjectId);
                } // end if

                Object PropertyOrderIndex = resultSet.getObject(columnIndex++);

                object.setPropertyOrderIndexNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyOrderIndex != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyOrderIndex, PropertyOrderIndex);
                } // end if

                Object PropertyKind = resultSet.getObject(columnIndex++);

                object.setPropertyKindNull(resultSet.getBoolean(columnIndex++));

                if (PropertyKind != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyKind,
                        PropertyKind);
                } // end if

                Object PropertyState = resultSet.getObject(columnIndex++);

                object.setPropertyStateNull(resultSet.getBoolean(columnIndex++));

                if (PropertyState != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyState,
                        PropertyState);
                } // end if

                Object PropertyType = resultSet.getObject(columnIndex++);

                object.setPropertyTypeNull(resultSet.getBoolean(columnIndex++));

                if (PropertyType != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyType,
                        PropertyType);
                } // end if

                Object PropertyValue = resultSet.getObject(columnIndex++);

                object.setPropertyValueNull(resultSet.getBoolean(columnIndex++));

                if (PropertyValue != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyValue,
                        PropertyValue);
                } // end if

                Object RelatedPropertyDataSize = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyDataSizeNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyDataSize != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyDataSize,
                        RelatedPropertyDataSize);
                } // end if

                Object RelatedPropertyDataType = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyDataTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyDataType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyDataType,
                        RelatedPropertyDataType);
                } // end if

                Object RelatedPropertyDescription = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyDescriptionNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyDescription != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyDescription,
                        RelatedPropertyDescription);
                } // end if

                Object RelatedPropertyIsEnum = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyIsEnumNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyIsEnum != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyIsEnum,
                        RelatedPropertyIsEnum);
                } // end if

                Object RelatedPropertyIsGenerate = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyIsGenerateNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyIsGenerate != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyIsGenerate,
                        RelatedPropertyIsGenerate);
                } // end if

                Object RelatedPropertyIsPrimaryProperty = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyIsPrimaryPropertyNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyIsPrimaryProperty != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyIsPrimaryProperty,
                        RelatedPropertyIsPrimaryProperty);
                } // end if

                Object RelatedPropertyName = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyName, RelatedPropertyName);
                } // end if

                Object RelatedPropertyObjectId = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyObjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyObjectId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyObjectId,
                        RelatedPropertyObjectId);
                } // end if

                Object RelatedPropertyOrderIndex = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyOrderIndexNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyOrderIndex != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyOrderIndex,
                        RelatedPropertyOrderIndex);
                } // end if

                Object RelatedPropertyKind = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyKindNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyKind != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyKind, RelatedPropertyKind);
                } // end if

                Object RelatedPropertyState = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyStateNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyState != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyState, RelatedPropertyState);
                } // end if

                Object RelatedPropertyType = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyType, RelatedPropertyType);
                } // end if

                Object RelatedPropertyValue = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyValueNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyValue != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyValue, RelatedPropertyValue);
                } // end if

                Object RelateAttrType = resultSet.getObject(columnIndex++);

                object.setRelateAttrTypeNull(resultSet.getBoolean(columnIndex++));

                if (RelateAttrType != null) {
                    BeanUtils.setProperty(object, DataProperty.RelateAttrType,
                        RelateAttrType);
                } // end if

                Object PropertyIsUnique = resultSet.getObject(columnIndex++);

                object.setPropertyIsUniqueNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyIsUnique != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyIsUnique, PropertyIsUnique);
                } // end if

                Object RelatedPropertyIsUnique = resultSet.getObject(columnIndex++);

                object.setRelatedPropertyIsUniqueNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedPropertyIsUnique != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedPropertyIsUnique,
                        RelatedPropertyIsUnique);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcObjectRelationAttrRowMapper
} // end BaseObjectRelationAttrDAOJdbcImpl
