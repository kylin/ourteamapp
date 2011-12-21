/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IServiceFunctionDAO;
import com.ourteam.modelbase.dao.ServiceFunction;
import com.ourteam.modelbase.dao.ServiceFunctionDAOQueryBean;

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
 * 服务功能定义 DAO JDBC Impl Generate Date : 2011-06-29 21:07:06
 *
 * @author Kylin
 */
abstract public class BaseServiceFunctionDAOJdbcImpl extends AbstractJdbcDAO
    implements IServiceFunctionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ObjectFunctionId, Description, IsQuery, Name, ObjectId, State, Type
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ObjectFunctionId, DataProperty.Description,
            DataProperty.IsQuery, DataProperty.Name, DataProperty.ObjectId,
            DataProperty.State, DataProperty.Type
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            ObjectFunctionId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            ObjectFunctionId
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
     * Creates a new BaseServiceFunctionDAOJdbcImpl object.
     */
    public BaseServiceFunctionDAOJdbcImpl() {
        super();
    } // end BaseServiceFunctionDAOJdbcImpl()

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
     * Check Unique ServiceFunction
     *
     * @param aServiceFunction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ServiceFunction aServiceFunction)
        throws Exception {
        if (aServiceFunction == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aServiceFunction,
                DataProperty.ObjectFunctionId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IServiceFunction
     *
     * @param aServiceFunction
     *
     * @throws Exception
     */
    public void insertServiceFunction(ServiceFunction aServiceFunction)
        throws Exception {
        insert(aServiceFunction);
    } // end insertServiceFunction()

    /**
     * Batch Insert IServiceFunction
     *
     * @param aServiceFunction
     *
     * @throws Exception
     */
    public void batchInsertServiceFunction(ServiceFunction[] aServiceFunction)
        throws Exception {
        batchInsert(aServiceFunction);
    } // end batchInsertServiceFunction()

    /**
     * Delete IServiceFunction
     *
     * @param aObjectFunctionId long aObjectFunctionId
     *
     * @throws Exception
     */
    public void deleteServiceFunction(final long aObjectFunctionId)
        throws Exception {
        deleteById(new Object[] { new Long(aObjectFunctionId) });
    } // end deleteServiceFunction()

    /**
     * Delete IServiceFunction
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteServiceFunction(ServiceFunctionDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteServiceFunction()

    /**
     * Update IServiceFunction Selective
     *
     * @param aServiceFunction
     *
     * @throws Exception
     */
    public void updateServiceFunction(ServiceFunction aServiceFunction)
        throws Exception {
        if (aServiceFunction.getObjectFunctionId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aServiceFunction);

        ServiceFunction tempObj = findServiceFunctionById(aServiceFunction.getObjectFunctionId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aServiceFunction, tempObj);
        } // end if
    } // end updateServiceFunction()

    /**
     * Batch Update IServiceFunction
     *
     * @param aServiceFunction
     *
     * @throws Exception
     */
    public void batchUpdateServiceFunction(ServiceFunction[] aServiceFunction)
        throws Exception {
        batchUpdate(aServiceFunction);
    } // end batchUpdateServiceFunction()

    /**
     * Update IServiceFunction
     *
     * @param aServiceFunction
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateServiceFunction(ServiceFunction aServiceFunction,
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aServiceFunction, aQueryBean);
    } // end updateServiceFunction()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceFunction DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ServiceFunction aServiceFunction)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceFunctions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeServiceFunction(
        ServiceFunction[] aServiceFunctions,
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception {
        synchronizeServiceFunction(aServiceFunctions, aQueryBean, null);
    } // end synchronizeServiceFunction()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceFunctions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeServiceFunction(
        ServiceFunction[] aServiceFunctions,
        ServiceFunctionDAOQueryBean aQueryBean,
        ServiceFunctionSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aServiceFunctions) == false) {
            inputList.addAll(Arrays.asList(aServiceFunctions));
        } // end if

        ServiceFunction[] existentServiceFunctions = this.queryServiceFunction(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentServiceFunctions) == false) {
            existentList.addAll(Arrays.asList(existentServiceFunctions));
        } // end if

        List willAddServiceFunctions = ListUtils.subtract(inputList,
                existentList);

        List willDeleteServiceFunctions = ListUtils.subtract(existentList,
                inputList);

        List willUpdateServiceFunctions = ListUtils.intersection(existentList,
                inputList);

        ServiceFunction[] willUpdateServiceFunctionArray = (ServiceFunction[]) willUpdateServiceFunctions.toArray(new ServiceFunction[willUpdateServiceFunctions.size()]);
        ServiceFunction[] willAddServiceFunctionArray = (ServiceFunction[]) willAddServiceFunctions.toArray(new ServiceFunction[willAddServiceFunctions.size()]);
        ServiceFunction[] willDeleteServiceFunctionArray = (ServiceFunction[]) willDeleteServiceFunctions.toArray(new ServiceFunction[willDeleteServiceFunctions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddServiceFunctionArray,
                willUpdateServiceFunctionArray, willDeleteServiceFunctionArray);
        } // end if

        if (willUpdateServiceFunctions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateServiceFunctionArray);
            } // end if

            this.batchUpdateServiceFunction(willUpdateServiceFunctionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateServiceFunctionArray);
            } // end if
        } // end if

        if (willAddServiceFunctions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddServiceFunctionArray);
            } // end if

            this.batchInsertServiceFunction(willAddServiceFunctionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddServiceFunctionArray);
            } // end if
        } // end if

        if (willDeleteServiceFunctions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteServiceFunctionArray);
            } // end if

            for (int i = 0; i < willDeleteServiceFunctionArray.length; i++) {
                ServiceFunction object = willDeleteServiceFunctionArray[i];
                this.deleteServiceFunction(object.getObjectFunctionId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteServiceFunctionArray);
            } // end if
        } // end if
    } // end synchronizeServiceFunction()

    /**
     * Query IServiceFunction
     *
     * @param aObjectFunctionId long aObjectFunctionId
     *
     * @return
     *
     * @throws Exception
     */
    public ServiceFunction findServiceFunctionById(final long aObjectFunctionId)
        throws Exception {
        ServiceFunctionDAOQueryBean queryBean = new ServiceFunctionDAOQueryBean();

        queryBean.createCriteria()
                 .andObjectFunctionIdEqualTo(new java.lang.Long(
                aObjectFunctionId));

        queryBean.setDistinct(true);

        ServiceFunction[] ServiceFunctions = queryServiceFunction(queryBean);

        if (ServiceFunctions.length == 0) {
            return null;
        } // end if
        else {
            return ServiceFunctions[0];
        } // end else
    } // end findServiceFunctionById()

    /**
     * Query IServiceFunction
     *
     * @param queryBean
     *
     * @return IServiceFunction[]
     *
     * @throws Exception
     */
    public ServiceFunction[] queryServiceFunction(
        ServiceFunctionDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcServiceFunctionRowMapper());

        return (ServiceFunction[]) result.toArray(new ServiceFunction[result.size()]);
    } // end queryServiceFunction()

    /**
     * Query ServiceFunction Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryServiceFunctionSelective(
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryServiceFunctionSelective()

    /**
     * Query IServiceFunction Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryServiceFunctionCount(ServiceFunctionDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryServiceFunctionCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.impl.BaseServiceParameterDAOJdbcImpl serviceParameter;

    /**
     * DOCUMENT ME!
     *
     * @param serviceParameter DOCUMENT ME!
     */
    public void setServiceParameter(
        com.ourteam.modelbase.dao.impl.BaseServiceParameterDAOJdbcImpl serviceParameter) {
        this.serviceParameter = serviceParameter;
    } // end setServiceParameter()

    /**
     * Query Related IServiceParameter
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IServiceParameter" containment="true"
     */
    public com.ourteam.modelbase.dao.ServiceParameter[] queryServiceParameters(
        ServiceFunctionDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_FUNCTION ON ( ");

        joinSQL.append(
            " SERVICE_PARAMETER.SERVICE_FUNCTION_ID = OBJECT_FUNCTION.OBJECT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IServiceParameterDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseServiceParameterDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseServiceParameterDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = serviceParameter.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.modelbase.dao.impl.BaseServiceParameterDAOJdbcImpl.JdbcServiceParameterRowMapper());

        return (com.ourteam.modelbase.dao.ServiceParameter[]) list.toArray(new com.ourteam.modelbase.dao.ServiceParameter[list.size()]);
    } // end queryServiceParameters()

    /**
     * Query ServiceFunction Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryServiceParametersSelective(
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.ServiceParameterId,
                "serviceParameterId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.DataType,
                "dataType");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.Description,
                "description");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.IsArray,
                "isArray");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.Name,
                "name");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.PreProcess,
                "preProcess");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.Sort,
                "sort");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.Type,
                "type");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.ValidateInfo,
                "validateInfo");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.ServiceFunctionId,
                "serviceFunctionId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IServiceParameterDAO.ReferenceObjectId,
                "referenceObjectId");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_FUNCTION ON ( ");

        joinSQL.append(
            " SERVICE_PARAMETER.SERVICE_FUNCTION_ID = OBJECT_FUNCTION.OBJECT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IServiceParameterDAO.EntityName;

        return serviceParameter.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryServiceParametersSelective()

    /**
     * Update Related IServiceParameter
     *
     * @param aServiceParameter {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateServiceParameter(
        com.ourteam.modelbase.dao.ServiceParameter aServiceParameter,
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_FUNCTION ON ( ");

        joinSQL.append(
            " SERVICE_PARAMETER.SERVICE_FUNCTION_ID = OBJECT_FUNCTION.OBJECT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IServiceParameterDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseServiceParameterDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseServiceParameterDAOJdbcImpl.ENTITY_PROPERTIES;

        serviceParameter.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aServiceParameter, aQueryBean);
    } // end updateServiceParameter()

    /**
     * Delete Related IServiceParameter
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteServiceParameter(ServiceFunctionDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_FUNCTION ON ( ");

        joinSQL.append(
            " SERVICE_PARAMETER.SERVICE_FUNCTION_ID = OBJECT_FUNCTION.OBJECT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IServiceParameterDAO.EntityName;

        serviceParameter.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteServiceParameter()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcServiceFunctionRowMapper
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
            ServiceFunction object = new ServiceFunction();

            int columnIndex = 1;

            try {
                Object ObjectFunctionId = resultSet.getObject(columnIndex++);

                object.setObjectFunctionIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ObjectFunctionId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ObjectFunctionId, ObjectFunctionId);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object IsQuery = resultSet.getObject(columnIndex++);

                object.setIsQueryNull(resultSet.getBoolean(columnIndex++));

                if (IsQuery != null) {
                    BeanUtils.setProperty(object, DataProperty.IsQuery, IsQuery);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcServiceFunctionRowMapper
} // end BaseServiceFunctionDAOJdbcImpl
