/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IServiceParameterDAO;
import com.ourteam.modelbase.dao.ServiceParameter;
import com.ourteam.modelbase.dao.ServiceParameterDAOQueryBean;

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
 * 服务参数 DAO JDBC Impl Generate Date : 2011-06-29 21:07:06
 *
 * @author Kylin
 */
abstract public class BaseServiceParameterDAOJdbcImpl extends AbstractJdbcDAO
    implements IServiceParameterDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ServiceParameterId, DataType, Description, IsArray, Name, PreProcess,
            Sort, Type, ValidateInfo, ServiceFunctionId, ReferenceObjectId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ServiceParameterId, DataProperty.DataType,
            DataProperty.Description, DataProperty.IsArray, DataProperty.Name,
            DataProperty.PreProcess, DataProperty.Sort, DataProperty.Type,
            DataProperty.ValidateInfo, DataProperty.ServiceFunctionId,
            DataProperty.ReferenceObjectId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            ServiceParameterId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            ServiceParameterId
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
     * Creates a new BaseServiceParameterDAOJdbcImpl object.
     */
    public BaseServiceParameterDAOJdbcImpl() {
        super();
    } // end BaseServiceParameterDAOJdbcImpl()

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
     * Check Unique ServiceParameter
     *
     * @param aServiceParameter
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ServiceParameter aServiceParameter)
        throws Exception {
        if (aServiceParameter == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aServiceParameter,
                DataProperty.ServiceParameterId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IServiceParameter
     *
     * @param aServiceParameter
     *
     * @throws Exception
     */
    public void insertServiceParameter(ServiceParameter aServiceParameter)
        throws Exception {
        insert(aServiceParameter);
    } // end insertServiceParameter()

    /**
     * Batch Insert IServiceParameter
     *
     * @param aServiceParameter
     *
     * @throws Exception
     */
    public void batchInsertServiceParameter(
        ServiceParameter[] aServiceParameter) throws Exception {
        batchInsert(aServiceParameter);
    } // end batchInsertServiceParameter()

    /**
     * Delete IServiceParameter
     *
     * @param aServiceParameterId long aServiceParameterId
     *
     * @throws Exception
     */
    public void deleteServiceParameter(final long aServiceParameterId)
        throws Exception {
        deleteById(new Object[] { new Long(aServiceParameterId) });
    } // end deleteServiceParameter()

    /**
     * Delete IServiceParameter
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteServiceParameter(ServiceParameterDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteServiceParameter()

    /**
     * Update IServiceParameter Selective
     *
     * @param aServiceParameter
     *
     * @throws Exception
     */
    public void updateServiceParameter(ServiceParameter aServiceParameter)
        throws Exception {
        if (aServiceParameter.getServiceParameterId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aServiceParameter);

        ServiceParameter tempObj = findServiceParameterById(aServiceParameter.getServiceParameterId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aServiceParameter, tempObj);
        } // end if
    } // end updateServiceParameter()

    /**
     * Batch Update IServiceParameter
     *
     * @param aServiceParameter
     *
     * @throws Exception
     */
    public void batchUpdateServiceParameter(
        ServiceParameter[] aServiceParameter) throws Exception {
        batchUpdate(aServiceParameter);
    } // end batchUpdateServiceParameter()

    /**
     * Update IServiceParameter
     *
     * @param aServiceParameter
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateServiceParameter(ServiceParameter aServiceParameter,
        ServiceParameterDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aServiceParameter, aQueryBean);
    } // end updateServiceParameter()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceParameter DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ServiceParameter aServiceParameter)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceParameters DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeServiceParameter(
        ServiceParameter[] aServiceParameters,
        ServiceParameterDAOQueryBean aQueryBean) throws Exception {
        synchronizeServiceParameter(aServiceParameters, aQueryBean, null);
    } // end synchronizeServiceParameter()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceParameters DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeServiceParameter(
        ServiceParameter[] aServiceParameters,
        ServiceParameterDAOQueryBean aQueryBean,
        ServiceParameterSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aServiceParameters) == false) {
            inputList.addAll(Arrays.asList(aServiceParameters));
        } // end if

        ServiceParameter[] existentServiceParameters = this.queryServiceParameter(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentServiceParameters) == false) {
            existentList.addAll(Arrays.asList(existentServiceParameters));
        } // end if

        List willAddServiceParameters = ListUtils.subtract(inputList,
                existentList);

        List willDeleteServiceParameters = ListUtils.subtract(existentList,
                inputList);

        List willUpdateServiceParameters = ListUtils.intersection(existentList,
                inputList);

        ServiceParameter[] willUpdateServiceParameterArray = (ServiceParameter[]) willUpdateServiceParameters.toArray(new ServiceParameter[willUpdateServiceParameters.size()]);
        ServiceParameter[] willAddServiceParameterArray = (ServiceParameter[]) willAddServiceParameters.toArray(new ServiceParameter[willAddServiceParameters.size()]);
        ServiceParameter[] willDeleteServiceParameterArray = (ServiceParameter[]) willDeleteServiceParameters.toArray(new ServiceParameter[willDeleteServiceParameters.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddServiceParameterArray,
                willUpdateServiceParameterArray, willDeleteServiceParameterArray);
        } // end if

        if (willUpdateServiceParameters.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateServiceParameterArray);
            } // end if

            this.batchUpdateServiceParameter(willUpdateServiceParameterArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateServiceParameterArray);
            } // end if
        } // end if

        if (willAddServiceParameters.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddServiceParameterArray);
            } // end if

            this.batchInsertServiceParameter(willAddServiceParameterArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddServiceParameterArray);
            } // end if
        } // end if

        if (willDeleteServiceParameters.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteServiceParameterArray);
            } // end if

            for (int i = 0; i < willDeleteServiceParameterArray.length; i++) {
                ServiceParameter object = willDeleteServiceParameterArray[i];
                this.deleteServiceParameter(object.getServiceParameterId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteServiceParameterArray);
            } // end if
        } // end if
    } // end synchronizeServiceParameter()

    /**
     * Query IServiceParameter
     *
     * @param aServiceParameterId long aServiceParameterId
     *
     * @return
     *
     * @throws Exception
     */
    public ServiceParameter findServiceParameterById(
        final long aServiceParameterId) throws Exception {
        ServiceParameterDAOQueryBean queryBean = new ServiceParameterDAOQueryBean();

        queryBean.createCriteria()
                 .andServiceParameterIdEqualTo(new java.lang.Long(
                aServiceParameterId));

        queryBean.setDistinct(true);

        ServiceParameter[] ServiceParameters = queryServiceParameter(queryBean);

        if (ServiceParameters.length == 0) {
            return null;
        } // end if
        else {
            return ServiceParameters[0];
        } // end else
    } // end findServiceParameterById()

    /**
     * Query IServiceParameter
     *
     * @param queryBean
     *
     * @return IServiceParameter[]
     *
     * @throws Exception
     */
    public ServiceParameter[] queryServiceParameter(
        ServiceParameterDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcServiceParameterRowMapper());

        return (ServiceParameter[]) result.toArray(new ServiceParameter[result.size()]);
    } // end queryServiceParameter()

    /**
     * Query ServiceParameter Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryServiceParameterSelective(
        ServiceParameterDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryServiceParameterSelective()

    /**
     * Query IServiceParameter Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryServiceParameterCount(
        ServiceParameterDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryServiceParameterCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcServiceParameterRowMapper
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
            ServiceParameter object = new ServiceParameter();

            int columnIndex = 1;

            try {
                Object ServiceParameterId = resultSet.getObject(columnIndex++);

                object.setServiceParameterIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ServiceParameterId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ServiceParameterId, ServiceParameterId);
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

                Object IsArray = resultSet.getObject(columnIndex++);

                object.setIsArrayNull(resultSet.getBoolean(columnIndex++));

                if (IsArray != null) {
                    BeanUtils.setProperty(object, DataProperty.IsArray, IsArray);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object PreProcess = resultSet.getObject(columnIndex++);

                object.setPreProcessNull(resultSet.getBoolean(columnIndex++));

                if (PreProcess != null) {
                    BeanUtils.setProperty(object, DataProperty.PreProcess,
                        PreProcess);
                } // end if

                Object Sort = resultSet.getObject(columnIndex++);

                object.setSortNull(resultSet.getBoolean(columnIndex++));

                if (Sort != null) {
                    BeanUtils.setProperty(object, DataProperty.Sort, Sort);
                } // end if

                Object Type = resultSet.getObject(columnIndex++);

                object.setTypeNull(resultSet.getBoolean(columnIndex++));

                if (Type != null) {
                    BeanUtils.setProperty(object, DataProperty.Type, Type);
                } // end if

                Object ValidateInfo = resultSet.getObject(columnIndex++);

                object.setValidateInfoNull(resultSet.getBoolean(columnIndex++));

                if (ValidateInfo != null) {
                    BeanUtils.setProperty(object, DataProperty.ValidateInfo,
                        ValidateInfo);
                } // end if

                Object ServiceFunctionId = resultSet.getObject(columnIndex++);

                object.setServiceFunctionIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ServiceFunctionId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ServiceFunctionId, ServiceFunctionId);
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
    } // end JdbcServiceParameterRowMapper
} // end BaseServiceParameterDAOJdbcImpl
