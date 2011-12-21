/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareToolDAO;
import com.ourteam.middleware.dao.MiddleWareTool;
import com.ourteam.middleware.dao.MiddleWareToolDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-17 17:31:11
 *
 * @author Kylin
 */
abstract public class BaseMiddleWareToolDAOJdbcImpl extends AbstractJdbcDAO
    implements IMiddleWareToolDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CompleteKeyWork, InputForm, OutputFile, Remarks, Status,
            SucceedKeyWork, TimeOut, ToolGroupId, ToolScript, ToolScriptType,
            LastEditorId, LastEditTime, LastEditorName, ToolName, ProviderId,
            ProviderName, MiddleWareName, MiddleWareVersion, MiddleWareType,
            ToolProgram
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CompleteKeyWork,
            DataProperty.InputForm, DataProperty.OutputFile,
            DataProperty.Remarks, DataProperty.Status,
            DataProperty.SucceedKeyWork, DataProperty.TimeOut,
            DataProperty.ToolGroupId, DataProperty.ToolScript,
            DataProperty.ToolScriptType, DataProperty.LastEditorId,
            DataProperty.LastEditTime, DataProperty.LastEditorName,
            DataProperty.ToolName, DataProperty.ProviderId,
            DataProperty.ProviderName, DataProperty.MiddleWareName,
            DataProperty.MiddleWareVersion, DataProperty.MiddleWareType,
            DataProperty.ToolProgram
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
     * Creates a new BaseMiddleWareToolDAOJdbcImpl object.
     */
    public BaseMiddleWareToolDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareToolDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE employeeA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " employeeA.ID = MIDDLE_WARE_TOOL.LAST_EDITOR_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN MIDDLE_WARE_PROVIDER middleWareProviderA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " middleWareProviderA.ID = MIDDLE_WARE_TOOL.PROVIDER_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique MiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MiddleWareTool aMiddleWareTool)
        throws Exception {
        if (aMiddleWareTool == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWareTool,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     */
    public void insertMiddleWareTool(MiddleWareTool aMiddleWareTool)
        throws Exception {
        insert(aMiddleWareTool);
    } // end insertMiddleWareTool()

    /**
     * Batch Insert IMiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     */
    public void batchInsertMiddleWareTool(MiddleWareTool[] aMiddleWareTool)
        throws Exception {
        batchInsert(aMiddleWareTool);
    } // end batchInsertMiddleWareTool()

    /**
     * Delete IMiddleWareTool
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWareTool(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWareTool()

    /**
     * Delete IMiddleWareTool
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWareTool(MiddleWareToolDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWareTool()

    /**
     * Update IMiddleWareTool Selective
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     */
    public void updateMiddleWareTool(MiddleWareTool aMiddleWareTool)
        throws Exception {
        if (aMiddleWareTool.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWareTool);

        MiddleWareTool tempObj = findMiddleWareToolById(aMiddleWareTool.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWareTool, tempObj);
        } // end if
    } // end updateMiddleWareTool()

    /**
     * Batch Update IMiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWareTool(MiddleWareTool[] aMiddleWareTool)
        throws Exception {
        batchUpdate(aMiddleWareTool);
    } // end batchUpdateMiddleWareTool()

    /**
     * Update IMiddleWareTool
     *
     * @param aMiddleWareTool
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWareTool(MiddleWareTool aMiddleWareTool,
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMiddleWareTool, aQueryBean);
    } // end updateMiddleWareTool()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareTool DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MiddleWareTool aMiddleWareTool)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareTools DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareTool(MiddleWareTool[] aMiddleWareTools,
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception {
        synchronizeMiddleWareTool(aMiddleWareTools, aQueryBean, null);
    } // end synchronizeMiddleWareTool()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareTools DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareTool(MiddleWareTool[] aMiddleWareTools,
        MiddleWareToolDAOQueryBean aQueryBean,
        MiddleWareToolSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWareTools) == false) {
            inputList.addAll(Arrays.asList(aMiddleWareTools));
        } // end if

        MiddleWareTool[] existentMiddleWareTools = this.queryMiddleWareTool(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWareTools) == false) {
            existentList.addAll(Arrays.asList(existentMiddleWareTools));
        } // end if

        List willAddMiddleWareTools = ListUtils.subtract(inputList, existentList);

        List willDeleteMiddleWareTools = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMiddleWareTools = ListUtils.intersection(existentList,
                inputList);

        MiddleWareTool[] willUpdateMiddleWareToolArray = (MiddleWareTool[]) willUpdateMiddleWareTools.toArray(new MiddleWareTool[willUpdateMiddleWareTools.size()]);
        MiddleWareTool[] willAddMiddleWareToolArray = (MiddleWareTool[]) willAddMiddleWareTools.toArray(new MiddleWareTool[willAddMiddleWareTools.size()]);
        MiddleWareTool[] willDeleteMiddleWareToolArray = (MiddleWareTool[]) willDeleteMiddleWareTools.toArray(new MiddleWareTool[willDeleteMiddleWareTools.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareToolArray,
                willUpdateMiddleWareToolArray, willDeleteMiddleWareToolArray);
        } // end if

        if (willUpdateMiddleWareTools.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareToolArray);
            } // end if

            this.batchUpdateMiddleWareTool(willUpdateMiddleWareToolArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareToolArray);
            } // end if
        } // end if

        if (willAddMiddleWareTools.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareToolArray);
            } // end if

            this.batchInsertMiddleWareTool(willAddMiddleWareToolArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareToolArray);
            } // end if
        } // end if

        if (willDeleteMiddleWareTools.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareToolArray);
            } // end if

            for (int i = 0; i < willDeleteMiddleWareToolArray.length; i++) {
                MiddleWareTool object = willDeleteMiddleWareToolArray[i];
                this.deleteMiddleWareTool(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareToolArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWareTool()

    /**
     * Query IMiddleWareTool
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWareTool findMiddleWareToolById(final long aId)
        throws Exception {
        MiddleWareToolDAOQueryBean queryBean = new MiddleWareToolDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWareTool[] MiddleWareTools = queryMiddleWareTool(queryBean);

        if (MiddleWareTools.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWareTools[0];
        } // end else
    } // end findMiddleWareToolById()

    /**
     * Query IMiddleWareTool
     *
     * @param queryBean
     *
     * @return IMiddleWareTool[]
     *
     * @throws Exception
     */
    public MiddleWareTool[] queryMiddleWareTool(
        MiddleWareToolDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcMiddleWareToolRowMapper());

        return (MiddleWareTool[]) result.toArray(new MiddleWareTool[result.size()]);
    } // end queryMiddleWareTool()

    /**
     * Query MiddleWareTool Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolSelective(
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareToolSelective()

    /**
     * Query IMiddleWareTool Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareToolCount(MiddleWareToolDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareToolCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputDAOJdbcImpl middleWareToolInput;

    /**
     * DOCUMENT ME!
     *
     * @param middleWareToolInput DOCUMENT ME!
     */
    public void setMiddleWareToolInput(
        com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputDAOJdbcImpl middleWareToolInput) {
        this.middleWareToolInput = middleWareToolInput;
    } // end setMiddleWareToolInput()

    /**
     * Query Related IMiddleWareToolInput
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInput" containment="true"
     */
    public com.ourteam.middleware.dao.MiddleWareToolInput[] queryMiddleWareToolInputs(
        MiddleWareToolDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL ON ( ");

        joinSQL.append(" MIDDLE_WARE_TOOL_INPUT.TOOL_ID = MIDDLE_WARE_TOOL.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputDAO.EntityName;

        String[] entityFields = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = middleWareToolInput.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputDAOJdbcImpl.JdbcMiddleWareToolInputRowMapper());

        return (com.ourteam.middleware.dao.MiddleWareToolInput[]) list.toArray(new com.ourteam.middleware.dao.MiddleWareToolInput[list.size()]);
    } // end queryMiddleWareToolInputs()

    /**
     * Query MiddleWareTool Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolInputsSelective(
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.IsRequired,
                "isRequired");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ParameterCode,
                "parameterCode");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ParameterName,
                "parameterName");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.SortIndex,
                "sortIndex");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ToolId,
                "toolId");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ParameterType,
                "parameterType");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputDAO.DefaultValue,
                "defaultValue");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL ON ( ");

        joinSQL.append(" MIDDLE_WARE_TOOL_INPUT.TOOL_ID = MIDDLE_WARE_TOOL.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputDAO.EntityName;

        return middleWareToolInput.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryMiddleWareToolInputsSelective()

    /**
     * Update Related IMiddleWareToolInput
     *
     * @param aMiddleWareToolInput {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateMiddleWareToolInput(
        com.ourteam.middleware.dao.MiddleWareToolInput aMiddleWareToolInput,
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL ON ( ");

        joinSQL.append(" MIDDLE_WARE_TOOL_INPUT.TOOL_ID = MIDDLE_WARE_TOOL.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputDAO.EntityName;

        String[] entityFields = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputDAOJdbcImpl.ENTITY_PROPERTIES;

        middleWareToolInput.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aMiddleWareToolInput,
            aQueryBean);
    } // end updateMiddleWareToolInput()

    /**
     * Delete Related IMiddleWareToolInput
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteMiddleWareToolInput(MiddleWareToolDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL ON ( ");

        joinSQL.append(" MIDDLE_WARE_TOOL_INPUT.TOOL_ID = MIDDLE_WARE_TOOL.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputDAO.EntityName;

        middleWareToolInput.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteMiddleWareToolInput()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareToolRowMapper
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
            MiddleWareTool object = new MiddleWareTool();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CompleteKeyWork = resultSet.getObject(columnIndex++);

                object.setCompleteKeyWorkNull(resultSet.getBoolean(
                        columnIndex++));

                if (CompleteKeyWork != null) {
                    BeanUtils.setProperty(object, DataProperty.CompleteKeyWork,
                        CompleteKeyWork);
                } // end if

                Object InputForm = resultSet.getObject(columnIndex++);

                object.setInputFormNull(resultSet.getBoolean(columnIndex++));

                if (InputForm != null) {
                    BeanUtils.setProperty(object, DataProperty.InputForm,
                        InputForm);
                } // end if

                Object OutputFile = resultSet.getObject(columnIndex++);

                object.setOutputFileNull(resultSet.getBoolean(columnIndex++));

                if (OutputFile != null) {
                    BeanUtils.setProperty(object, DataProperty.OutputFile,
                        OutputFile);
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

                Object SucceedKeyWork = resultSet.getObject(columnIndex++);

                object.setSucceedKeyWorkNull(resultSet.getBoolean(columnIndex++));

                if (SucceedKeyWork != null) {
                    BeanUtils.setProperty(object, DataProperty.SucceedKeyWork,
                        SucceedKeyWork);
                } // end if

                Object TimeOut = resultSet.getObject(columnIndex++);

                object.setTimeOutNull(resultSet.getBoolean(columnIndex++));

                if (TimeOut != null) {
                    BeanUtils.setProperty(object, DataProperty.TimeOut, TimeOut);
                } // end if

                Object ToolGroupId = resultSet.getObject(columnIndex++);

                object.setToolGroupIdNull(resultSet.getBoolean(columnIndex++));

                if (ToolGroupId != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolGroupId,
                        ToolGroupId);
                } // end if

                Object ToolScript = resultSet.getObject(columnIndex++);

                object.setToolScriptNull(resultSet.getBoolean(columnIndex++));

                if (ToolScript != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolScript,
                        ToolScript);
                } // end if

                Object ToolScriptType = resultSet.getObject(columnIndex++);

                object.setToolScriptTypeNull(resultSet.getBoolean(columnIndex++));

                if (ToolScriptType != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolScriptType,
                        ToolScriptType);
                } // end if

                Object LastEditorId = resultSet.getObject(columnIndex++);

                object.setLastEditorIdNull(resultSet.getBoolean(columnIndex++));

                if (LastEditorId != null) {
                    BeanUtils.setProperty(object, DataProperty.LastEditorId,
                        LastEditorId);
                } // end if

                Object LastEditTime = resultSet.getObject(columnIndex++);

                object.setLastEditTimeNull(resultSet.getBoolean(columnIndex++));

                if (LastEditTime != null) {
                    BeanUtils.setProperty(object, DataProperty.LastEditTime,
                        LastEditTime);
                } // end if

                Object LastEditorName = resultSet.getObject(columnIndex++);

                object.setLastEditorNameNull(resultSet.getBoolean(columnIndex++));

                if (LastEditorName != null) {
                    BeanUtils.setProperty(object, DataProperty.LastEditorName,
                        LastEditorName);
                } // end if

                Object ToolName = resultSet.getObject(columnIndex++);

                object.setToolNameNull(resultSet.getBoolean(columnIndex++));

                if (ToolName != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolName,
                        ToolName);
                } // end if

                Object ProviderId = resultSet.getObject(columnIndex++);

                object.setProviderIdNull(resultSet.getBoolean(columnIndex++));

                if (ProviderId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderId,
                        ProviderId);
                } // end if

                Object ProviderName = resultSet.getObject(columnIndex++);

                object.setProviderNameNull(resultSet.getBoolean(columnIndex++));

                if (ProviderName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderName,
                        ProviderName);
                } // end if

                Object MiddleWareName = resultSet.getObject(columnIndex++);

                object.setMiddleWareNameNull(resultSet.getBoolean(columnIndex++));

                if (MiddleWareName != null) {
                    BeanUtils.setProperty(object, DataProperty.MiddleWareName,
                        MiddleWareName);
                } // end if

                Object MiddleWareVersion = resultSet.getObject(columnIndex++);

                object.setMiddleWareVersionNull(resultSet.getBoolean(
                        columnIndex++));

                if (MiddleWareVersion != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.MiddleWareVersion, MiddleWareVersion);
                } // end if

                Object MiddleWareType = resultSet.getObject(columnIndex++);

                object.setMiddleWareTypeNull(resultSet.getBoolean(columnIndex++));

                if (MiddleWareType != null) {
                    BeanUtils.setProperty(object, DataProperty.MiddleWareType,
                        MiddleWareType);
                } // end if

                Object ToolProgram = resultSet.getObject(columnIndex++);

                object.setToolProgramNull(resultSet.getBoolean(columnIndex++));

                if (ToolProgram != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolProgram,
                        ToolProgram);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMiddleWareToolRowMapper
} // end BaseMiddleWareToolDAOJdbcImpl
