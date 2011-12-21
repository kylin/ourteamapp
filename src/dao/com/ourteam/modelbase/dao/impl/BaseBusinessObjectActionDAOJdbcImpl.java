/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessObjectAction;
import com.ourteam.modelbase.dao.BusinessObjectActionDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessObjectActionDAO;

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
 * 业务对象动作 DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseBusinessObjectActionDAOJdbcImpl
    extends AbstractJdbcDAO implements IBusinessObjectActionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ObjectActionId, Action, ObjectId, PropertyId, PropertyValue,
            PropertyDataSize, PropertyDataType, PropertyDefaultValue,
            PropertyDescription, PropertyIsEnum, PropertyIsGenerate,
            PropertyIsPrimaryProperty, PropertyKind, PropertyName,
            PropertyOrderIndex, PropertyState, PropertyType, Operation
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ObjectActionId, DataProperty.Action,
            DataProperty.ObjectId, DataProperty.PropertyId,
            DataProperty.PropertyValue, DataProperty.PropertyDataSize,
            DataProperty.PropertyDataType, DataProperty.PropertyDefaultValue,
            DataProperty.PropertyDescription, DataProperty.PropertyIsEnum,
            DataProperty.PropertyIsGenerate,
            DataProperty.PropertyIsPrimaryProperty, DataProperty.PropertyKind,
            DataProperty.PropertyName, DataProperty.PropertyOrderIndex,
            DataProperty.PropertyState, DataProperty.PropertyType,
            DataProperty.Operation
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { ObjectActionId };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            ObjectActionId
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
     * Creates a new BaseBusinessObjectActionDAOJdbcImpl object.
     */
    public BaseBusinessObjectActionDAOJdbcImpl() {
        super();
    } // end BaseBusinessObjectActionDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN OBJECT_PROPERTY property ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " property.OBJECT_PROPERTY = OBJECT_ACTION.PROPERTY_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BusinessObjectAction aBusinessObjectAction)
        throws Exception {
        if (aBusinessObjectAction == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBusinessObjectAction,
                DataProperty.ObjectActionId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     */
    public void insertBusinessObjectAction(
        BusinessObjectAction aBusinessObjectAction) throws Exception {
        insert(aBusinessObjectAction);
    } // end insertBusinessObjectAction()

    /**
     * Batch Insert IBusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     */
    public void batchInsertBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectAction) throws Exception {
        batchInsert(aBusinessObjectAction);
    } // end batchInsertBusinessObjectAction()

    /**
     * Delete IBusinessObjectAction
     *
     * @param aObjectActionId long aObjectActionId
     *
     * @throws Exception
     */
    public void deleteBusinessObjectAction(final long aObjectActionId)
        throws Exception {
        deleteById(new Object[] { new Long(aObjectActionId) });
    } // end deleteBusinessObjectAction()

    /**
     * Delete IBusinessObjectAction
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessObjectAction(
        BusinessObjectActionDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessObjectAction()

    /**
     * Update IBusinessObjectAction Selective
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     */
    public void updateBusinessObjectAction(
        BusinessObjectAction aBusinessObjectAction) throws Exception {
        if (aBusinessObjectAction.getObjectActionId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessObjectAction);

        BusinessObjectAction tempObj = findBusinessObjectActionById(aBusinessObjectAction.getObjectActionId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessObjectAction, tempObj);
        } // end if
    } // end updateBusinessObjectAction()

    /**
     * Batch Update IBusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     */
    public void batchUpdateBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectAction) throws Exception {
        batchUpdate(aBusinessObjectAction);
    } // end batchUpdateBusinessObjectAction()

    /**
     * Update IBusinessObjectAction
     *
     * @param aBusinessObjectAction
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessObjectAction(
        BusinessObjectAction aBusinessObjectAction,
        BusinessObjectActionDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBusinessObjectAction, aQueryBean);
    } // end updateBusinessObjectAction()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObjectAction DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BusinessObjectAction aBusinessObjectAction)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObjectActions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectActions,
        BusinessObjectActionDAOQueryBean aQueryBean) throws Exception {
        synchronizeBusinessObjectAction(aBusinessObjectActions, aQueryBean, null);
    } // end synchronizeBusinessObjectAction()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObjectActions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectActions,
        BusinessObjectActionDAOQueryBean aQueryBean,
        BusinessObjectActionSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessObjectActions) == false) {
            inputList.addAll(Arrays.asList(aBusinessObjectActions));
        } // end if

        BusinessObjectAction[] existentBusinessObjectActions = this.queryBusinessObjectAction(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessObjectActions) == false) {
            existentList.addAll(Arrays.asList(existentBusinessObjectActions));
        } // end if

        List willAddBusinessObjectActions = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBusinessObjectActions = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessObjectActions = ListUtils.intersection(existentList,
                inputList);

        BusinessObjectAction[] willUpdateBusinessObjectActionArray = (BusinessObjectAction[]) willUpdateBusinessObjectActions.toArray(new BusinessObjectAction[willUpdateBusinessObjectActions.size()]);
        BusinessObjectAction[] willAddBusinessObjectActionArray = (BusinessObjectAction[]) willAddBusinessObjectActions.toArray(new BusinessObjectAction[willAddBusinessObjectActions.size()]);
        BusinessObjectAction[] willDeleteBusinessObjectActionArray = (BusinessObjectAction[]) willDeleteBusinessObjectActions.toArray(new BusinessObjectAction[willDeleteBusinessObjectActions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessObjectActionArray,
                willUpdateBusinessObjectActionArray,
                willDeleteBusinessObjectActionArray);
        } // end if

        if (willUpdateBusinessObjectActions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessObjectActionArray);
            } // end if

            this.batchUpdateBusinessObjectAction(willUpdateBusinessObjectActionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessObjectActionArray);
            } // end if
        } // end if

        if (willAddBusinessObjectActions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessObjectActionArray);
            } // end if

            this.batchInsertBusinessObjectAction(willAddBusinessObjectActionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessObjectActionArray);
            } // end if
        } // end if

        if (willDeleteBusinessObjectActions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessObjectActionArray);
            } // end if

            for (int i = 0; i < willDeleteBusinessObjectActionArray.length;
                    i++) {
                BusinessObjectAction object = willDeleteBusinessObjectActionArray[i];
                this.deleteBusinessObjectAction(object.getObjectActionId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessObjectActionArray);
            } // end if
        } // end if
    } // end synchronizeBusinessObjectAction()

    /**
     * Query IBusinessObjectAction
     *
     * @param aObjectActionId long aObjectActionId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessObjectAction findBusinessObjectActionById(
        final long aObjectActionId) throws Exception {
        BusinessObjectActionDAOQueryBean queryBean = new BusinessObjectActionDAOQueryBean();

        queryBean.createCriteria()
                 .andObjectActionIdEqualTo(new java.lang.Long(aObjectActionId));

        queryBean.setDistinct(true);

        BusinessObjectAction[] BusinessObjectActions = queryBusinessObjectAction(queryBean);

        if (BusinessObjectActions.length == 0) {
            return null;
        } // end if
        else {
            return BusinessObjectActions[0];
        } // end else
    } // end findBusinessObjectActionById()

    /**
     * Query IBusinessObjectAction
     *
     * @param queryBean
     *
     * @return IBusinessObjectAction[]
     *
     * @throws Exception
     */
    public BusinessObjectAction[] queryBusinessObjectAction(
        BusinessObjectActionDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBusinessObjectActionRowMapper());

        return (BusinessObjectAction[]) result.toArray(new BusinessObjectAction[result.size()]);
    } // end queryBusinessObjectAction()

    /**
     * Query BusinessObjectAction Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessObjectActionSelective(
        BusinessObjectActionDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessObjectActionSelective()

    /**
     * Query IBusinessObjectAction Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessObjectActionCount(
        BusinessObjectActionDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessObjectActionCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessObjectActionRowMapper
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
            BusinessObjectAction object = new BusinessObjectAction();

            int columnIndex = 1;

            try {
                Object ObjectActionId = resultSet.getObject(columnIndex++);

                object.setObjectActionIdNull(resultSet.getBoolean(columnIndex++));

                if (ObjectActionId != null) {
                    BeanUtils.setProperty(object, DataProperty.ObjectActionId,
                        ObjectActionId);
                } // end if

                Object Action = resultSet.getObject(columnIndex++);

                object.setActionNull(resultSet.getBoolean(columnIndex++));

                if (Action != null) {
                    BeanUtils.setProperty(object, DataProperty.Action, Action);
                } // end if

                Object ObjectId = resultSet.getObject(columnIndex++);

                object.setObjectIdNull(resultSet.getBoolean(columnIndex++));

                if (ObjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.ObjectId,
                        ObjectId);
                } // end if

                Object PropertyId = resultSet.getObject(columnIndex++);

                object.setPropertyIdNull(resultSet.getBoolean(columnIndex++));

                if (PropertyId != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyId,
                        PropertyId);
                } // end if

                Object PropertyValue = resultSet.getObject(columnIndex++);

                object.setPropertyValueNull(resultSet.getBoolean(columnIndex++));

                if (PropertyValue != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyValue,
                        PropertyValue);
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

                Object PropertyDefaultValue = resultSet.getObject(columnIndex++);

                object.setPropertyDefaultValueNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyDefaultValue != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyDefaultValue, PropertyDefaultValue);
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

                Object PropertyKind = resultSet.getObject(columnIndex++);

                object.setPropertyKindNull(resultSet.getBoolean(columnIndex++));

                if (PropertyKind != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyKind,
                        PropertyKind);
                } // end if

                Object PropertyName = resultSet.getObject(columnIndex++);

                object.setPropertyNameNull(resultSet.getBoolean(columnIndex++));

                if (PropertyName != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyName,
                        PropertyName);
                } // end if

                Object PropertyOrderIndex = resultSet.getObject(columnIndex++);

                object.setPropertyOrderIndexNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyOrderIndex != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyOrderIndex, PropertyOrderIndex);
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

                Object Operation = resultSet.getObject(columnIndex++);

                object.setOperationNull(resultSet.getBoolean(columnIndex++));

                if (Operation != null) {
                    BeanUtils.setProperty(object, DataProperty.Operation,
                        Operation);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBusinessObjectActionRowMapper
} // end BaseBusinessObjectActionDAOJdbcImpl
