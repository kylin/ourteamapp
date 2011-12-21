/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareToolInputDAO;
import com.ourteam.middleware.dao.MiddleWareToolInput;
import com.ourteam.middleware.dao.MiddleWareToolInputDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-08 15:07:48
 *
 * @author kylin
 */
abstract public class BaseMiddleWareToolInputDAOJdbcImpl extends AbstractJdbcDAO
    implements IMiddleWareToolInputDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, IsRequired, ParameterCode, ParameterName, Remarks, SortIndex,
            Status, ToolId, ParameterType, DefaultValue
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.IsRequired, DataProperty.ParameterCode,
            DataProperty.ParameterName, DataProperty.Remarks,
            DataProperty.SortIndex, DataProperty.Status, DataProperty.ToolId,
            DataProperty.ParameterType, DataProperty.DefaultValue
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
     * Creates a new BaseMiddleWareToolInputDAOJdbcImpl object.
     */
    public BaseMiddleWareToolInputDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareToolInputDAOJdbcImpl()

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
     * Check Unique MiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MiddleWareToolInput aMiddleWareToolInput)
        throws Exception {
        if (aMiddleWareToolInput == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWareToolInput,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     */
    public void insertMiddleWareToolInput(
        MiddleWareToolInput aMiddleWareToolInput) throws Exception {
        insert(aMiddleWareToolInput);
    } // end insertMiddleWareToolInput()

    /**
     * Batch Insert IMiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     */
    public void batchInsertMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInput) throws Exception {
        batchInsert(aMiddleWareToolInput);
    } // end batchInsertMiddleWareToolInput()

    /**
     * Delete IMiddleWareToolInput
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolInput(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWareToolInput()

    /**
     * Delete IMiddleWareToolInput
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolInput(
        MiddleWareToolInputDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWareToolInput()

    /**
     * Update IMiddleWareToolInput Selective
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     */
    public void updateMiddleWareToolInput(
        MiddleWareToolInput aMiddleWareToolInput) throws Exception {
        if (aMiddleWareToolInput.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWareToolInput);

        MiddleWareToolInput tempObj = findMiddleWareToolInputById(aMiddleWareToolInput.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWareToolInput, tempObj);
        } // end if
    } // end updateMiddleWareToolInput()

    /**
     * Batch Update IMiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInput) throws Exception {
        batchUpdate(aMiddleWareToolInput);
    } // end batchUpdateMiddleWareToolInput()

    /**
     * Update IMiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWareToolInput(
        MiddleWareToolInput aMiddleWareToolInput,
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMiddleWareToolInput, aQueryBean);
    } // end updateMiddleWareToolInput()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInput DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MiddleWareToolInput aMiddleWareToolInput)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInputs,
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception {
        synchronizeMiddleWareToolInput(aMiddleWareToolInputs, aQueryBean, null);
    } // end synchronizeMiddleWareToolInput()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInputs,
        MiddleWareToolInputDAOQueryBean aQueryBean,
        MiddleWareToolInputSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWareToolInputs) == false) {
            inputList.addAll(Arrays.asList(aMiddleWareToolInputs));
        } // end if

        MiddleWareToolInput[] existentMiddleWareToolInputs = this.queryMiddleWareToolInput(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWareToolInputs) == false) {
            existentList.addAll(Arrays.asList(existentMiddleWareToolInputs));
        } // end if

        List willAddMiddleWareToolInputs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteMiddleWareToolInputs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMiddleWareToolInputs = ListUtils.intersection(existentList,
                inputList);

        MiddleWareToolInput[] willUpdateMiddleWareToolInputArray = (MiddleWareToolInput[]) willUpdateMiddleWareToolInputs.toArray(new MiddleWareToolInput[willUpdateMiddleWareToolInputs.size()]);
        MiddleWareToolInput[] willAddMiddleWareToolInputArray = (MiddleWareToolInput[]) willAddMiddleWareToolInputs.toArray(new MiddleWareToolInput[willAddMiddleWareToolInputs.size()]);
        MiddleWareToolInput[] willDeleteMiddleWareToolInputArray = (MiddleWareToolInput[]) willDeleteMiddleWareToolInputs.toArray(new MiddleWareToolInput[willDeleteMiddleWareToolInputs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareToolInputArray,
                willUpdateMiddleWareToolInputArray,
                willDeleteMiddleWareToolInputArray);
        } // end if

        if (willUpdateMiddleWareToolInputs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareToolInputArray);
            } // end if

            this.batchUpdateMiddleWareToolInput(willUpdateMiddleWareToolInputArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareToolInputArray);
            } // end if
        } // end if

        if (willAddMiddleWareToolInputs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareToolInputArray);
            } // end if

            this.batchInsertMiddleWareToolInput(willAddMiddleWareToolInputArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareToolInputArray);
            } // end if
        } // end if

        if (willDeleteMiddleWareToolInputs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareToolInputArray);
            } // end if

            for (int i = 0; i < willDeleteMiddleWareToolInputArray.length;
                    i++) {
                MiddleWareToolInput object = willDeleteMiddleWareToolInputArray[i];
                this.deleteMiddleWareToolInput(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareToolInputArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWareToolInput()

    /**
     * Query IMiddleWareToolInput
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWareToolInput findMiddleWareToolInputById(final long aId)
        throws Exception {
        MiddleWareToolInputDAOQueryBean queryBean = new MiddleWareToolInputDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWareToolInput[] MiddleWareToolInputs = queryMiddleWareToolInput(queryBean);

        if (MiddleWareToolInputs.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWareToolInputs[0];
        } // end else
    } // end findMiddleWareToolInputById()

    /**
     * Query IMiddleWareToolInput
     *
     * @param queryBean
     *
     * @return IMiddleWareToolInput[]
     *
     * @throws Exception
     */
    public MiddleWareToolInput[] queryMiddleWareToolInput(
        MiddleWareToolInputDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcMiddleWareToolInputRowMapper());

        return (MiddleWareToolInput[]) result.toArray(new MiddleWareToolInput[result.size()]);
    } // end queryMiddleWareToolInput()

    /**
     * Query MiddleWareToolInput Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolInputSelective(
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareToolInputSelective()

    /**
     * Query IMiddleWareToolInput Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareToolInputCount(
        MiddleWareToolInputDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareToolInputCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputOptionDAOJdbcImpl middleWareToolInputOption;

    /**
     * DOCUMENT ME!
     *
     * @param middleWareToolInputOption DOCUMENT ME!
     */
    public void setMiddleWareToolInputOption(
        com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputOptionDAOJdbcImpl middleWareToolInputOption) {
        this.middleWareToolInputOption = middleWareToolInputOption;
    } // end setMiddleWareToolInputOption()

    /**
     * Query Related IMiddleWareToolInputOption
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputOption" containment="true"
     */
    public com.ourteam.middleware.dao.MiddleWareToolInputOption[] queryMiddleWareToolInputOptions(
        MiddleWareToolInputDAOQueryBean aDaoQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_INPUT ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_OPTION.TOOL_INPUT_ID = MIDDLE_WARE_TOOL_INPUT.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.EntityName;

        String[] entityFields = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputOptionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputOptionDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = middleWareToolInputOption.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputOptionDAOJdbcImpl.JdbcMiddleWareToolInputOptionRowMapper());

        return (com.ourteam.middleware.dao.MiddleWareToolInputOption[]) list.toArray(new com.ourteam.middleware.dao.MiddleWareToolInputOption[list.size()]);
    } // end queryMiddleWareToolInputOptions()

    /**
     * Query MiddleWareToolInput Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolInputOptionsSelective(
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.DisplayLabel,
                "displayLabel");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.RealValue,
                "realValue");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.SortIndex,
                "sortIndex");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.ToolInputId,
                "toolInputId");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_INPUT ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_OPTION.TOOL_INPUT_ID = MIDDLE_WARE_TOOL_INPUT.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.EntityName;

        return middleWareToolInputOption.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryMiddleWareToolInputOptionsSelective()

    /**
     * Update Related IMiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateMiddleWareToolInputOption(
        com.ourteam.middleware.dao.MiddleWareToolInputOption aMiddleWareToolInputOption,
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_INPUT ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_OPTION.TOOL_INPUT_ID = MIDDLE_WARE_TOOL_INPUT.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.EntityName;

        String[] entityFields = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputOptionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputOptionDAOJdbcImpl.ENTITY_PROPERTIES;

        middleWareToolInputOption.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aMiddleWareToolInputOption,
            aQueryBean);
    } // end updateMiddleWareToolInputOption()

    /**
     * Delete Related IMiddleWareToolInputOption
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteMiddleWareToolInputOption(
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_INPUT ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_OPTION.TOOL_INPUT_ID = MIDDLE_WARE_TOOL_INPUT.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.EntityName;

        middleWareToolInputOption.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteMiddleWareToolInputOption()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareToolInputRowMapper
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
            MiddleWareToolInput object = new MiddleWareToolInput();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object IsRequired = resultSet.getObject(columnIndex++);

                object.setIsRequiredNull(resultSet.getBoolean(columnIndex++));

                if (IsRequired != null) {
                    BeanUtils.setProperty(object, DataProperty.IsRequired,
                        IsRequired);
                } // end if

                Object ParameterCode = resultSet.getObject(columnIndex++);

                object.setParameterCodeNull(resultSet.getBoolean(columnIndex++));

                if (ParameterCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ParameterCode,
                        ParameterCode);
                } // end if

                Object ParameterName = resultSet.getObject(columnIndex++);

                object.setParameterNameNull(resultSet.getBoolean(columnIndex++));

                if (ParameterName != null) {
                    BeanUtils.setProperty(object, DataProperty.ParameterName,
                        ParameterName);
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

                Object ToolId = resultSet.getObject(columnIndex++);

                object.setToolIdNull(resultSet.getBoolean(columnIndex++));

                if (ToolId != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolId, ToolId);
                } // end if

                Object ParameterType = resultSet.getObject(columnIndex++);

                object.setParameterTypeNull(resultSet.getBoolean(columnIndex++));

                if (ParameterType != null) {
                    BeanUtils.setProperty(object, DataProperty.ParameterType,
                        ParameterType);
                } // end if

                Object DefaultValue = resultSet.getObject(columnIndex++);

                object.setDefaultValueNull(resultSet.getBoolean(columnIndex++));

                if (DefaultValue != null) {
                    BeanUtils.setProperty(object, DataProperty.DefaultValue,
                        DefaultValue);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMiddleWareToolInputRowMapper
} // end BaseMiddleWareToolInputDAOJdbcImpl
