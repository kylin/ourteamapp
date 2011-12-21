/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportViewFieldDAO;
import com.ourteam.report.dao.ReportViewField;
import com.ourteam.report.dao.ReportViewFieldDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-27 11:38:58
 *
 * @author kylin
 */
abstract public class BaseReportViewFieldDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportViewFieldDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DataType, FieldAlias, FieldName, ListSourceId, Remarks,
            ReportViewId, Status, Title, Width, ListSourceCode, ListSourceName,
            TableId, TableName, TableAlias
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DataType, DataProperty.FieldAlias,
            DataProperty.FieldName, DataProperty.ListSourceId,
            DataProperty.Remarks, DataProperty.ReportViewId, DataProperty.Status,
            DataProperty.Title, DataProperty.Width, DataProperty.ListSourceCode,
            DataProperty.ListSourceName, DataProperty.TableId,
            DataProperty.TableName, DataProperty.TableAlias
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
     * Creates a new BaseReportViewFieldDAOJdbcImpl object.
     */
    public BaseReportViewFieldDAOJdbcImpl() {
        super();
    } // end BaseReportViewFieldDAOJdbcImpl()

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
                " LEFT JOIN REPORT_LIST_SOURCE reportListSourceB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " reportListSourceB.ID = REPORT_VIEW_FIELD.LIST_SOURCE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN REPORT_VIEW_TABLE reportViewTableB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " reportViewTableB.REPORT_VIEW_ID = REPORT_VIEW_FIELD.REPORT_VIEW_ID ");

            relatedJoinSQLBuffer.append(" AND ");
            relatedJoinSQLBuffer.append(
                " reportViewTableB.ID = REPORT_VIEW_FIELD.TABLE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ReportViewField
     *
     * @param aReportViewField
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportViewField aReportViewField)
        throws Exception {
        if (aReportViewField == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportViewField,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportViewField
     *
     * @param aReportViewField
     *
     * @throws Exception
     */
    public void insertReportViewField(ReportViewField aReportViewField)
        throws Exception {
        insert(aReportViewField);
    } // end insertReportViewField()

    /**
     * Batch Insert IReportViewField
     *
     * @param aReportViewField
     *
     * @throws Exception
     */
    public void batchInsertReportViewField(ReportViewField[] aReportViewField)
        throws Exception {
        batchInsert(aReportViewField);
    } // end batchInsertReportViewField()

    /**
     * Delete IReportViewField
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportViewField(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportViewField()

    /**
     * Delete IReportViewField
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportViewField(ReportViewFieldDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportViewField()

    /**
     * Update IReportViewField Selective
     *
     * @param aReportViewField
     *
     * @throws Exception
     */
    public void updateReportViewField(ReportViewField aReportViewField)
        throws Exception {
        if (aReportViewField.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportViewField);

        ReportViewField tempObj = findReportViewFieldById(aReportViewField.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportViewField, tempObj);
        } // end if
    } // end updateReportViewField()

    /**
     * Batch Update IReportViewField
     *
     * @param aReportViewField
     *
     * @throws Exception
     */
    public void batchUpdateReportViewField(ReportViewField[] aReportViewField)
        throws Exception {
        batchUpdate(aReportViewField);
    } // end batchUpdateReportViewField()

    /**
     * Update IReportViewField
     *
     * @param aReportViewField
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportViewField(ReportViewField aReportViewField,
        ReportViewFieldDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportViewField, aQueryBean);
    } // end updateReportViewField()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewField DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportViewField aReportViewField)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewFields DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewField(
        ReportViewField[] aReportViewFields,
        ReportViewFieldDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportViewField(aReportViewFields, aQueryBean, null);
    } // end synchronizeReportViewField()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewFields DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewField(
        ReportViewField[] aReportViewFields,
        ReportViewFieldDAOQueryBean aQueryBean,
        ReportViewFieldSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportViewFields) == false) {
            inputList.addAll(Arrays.asList(aReportViewFields));
        } // end if

        ReportViewField[] existentReportViewFields = this.queryReportViewField(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportViewFields) == false) {
            existentList.addAll(Arrays.asList(existentReportViewFields));
        } // end if

        List willAddReportViewFields = ListUtils.subtract(inputList,
                existentList);

        List willDeleteReportViewFields = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportViewFields = ListUtils.intersection(existentList,
                inputList);

        ReportViewField[] willUpdateReportViewFieldArray = (ReportViewField[]) willUpdateReportViewFields.toArray(new ReportViewField[willUpdateReportViewFields.size()]);
        ReportViewField[] willAddReportViewFieldArray = (ReportViewField[]) willAddReportViewFields.toArray(new ReportViewField[willAddReportViewFields.size()]);
        ReportViewField[] willDeleteReportViewFieldArray = (ReportViewField[]) willDeleteReportViewFields.toArray(new ReportViewField[willDeleteReportViewFields.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportViewFieldArray,
                willUpdateReportViewFieldArray, willDeleteReportViewFieldArray);
        } // end if

        if (willUpdateReportViewFields.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportViewFieldArray);
            } // end if

            this.batchUpdateReportViewField(willUpdateReportViewFieldArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportViewFieldArray);
            } // end if
        } // end if

        if (willAddReportViewFields.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportViewFieldArray);
            } // end if

            this.batchInsertReportViewField(willAddReportViewFieldArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportViewFieldArray);
            } // end if
        } // end if

        if (willDeleteReportViewFields.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportViewFieldArray);
            } // end if

            for (int i = 0; i < willDeleteReportViewFieldArray.length; i++) {
                ReportViewField object = willDeleteReportViewFieldArray[i];
                this.deleteReportViewField(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportViewFieldArray);
            } // end if
        } // end if
    } // end synchronizeReportViewField()

    /**
     * Query IReportViewField
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportViewField findReportViewFieldById(final long aId)
        throws Exception {
        ReportViewFieldDAOQueryBean queryBean = new ReportViewFieldDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportViewField[] ReportViewFields = queryReportViewField(queryBean);

        if (ReportViewFields.length == 0) {
            return null;
        } // end if
        else {
            return ReportViewFields[0];
        } // end else
    } // end findReportViewFieldById()

    /**
     * Query IReportViewField
     *
     * @param queryBean
     *
     * @return IReportViewField[]
     *
     * @throws Exception
     */
    public ReportViewField[] queryReportViewField(
        ReportViewFieldDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportViewFieldRowMapper());

        return (ReportViewField[]) result.toArray(new ReportViewField[result.size()]);
    } // end queryReportViewField()

    /**
     * Query ReportViewField Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportViewFieldSelective(
        ReportViewFieldDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportViewFieldSelective()

    /**
     * Query IReportViewField Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportViewFieldCount(ReportViewFieldDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportViewFieldCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportViewFieldRowMapper
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
            ReportViewField object = new ReportViewField();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DataType = resultSet.getObject(columnIndex++);

                object.setDataTypeNull(resultSet.getBoolean(columnIndex++));

                if (DataType != null) {
                    BeanUtils.setProperty(object, DataProperty.DataType,
                        DataType);
                } // end if

                Object FieldAlias = resultSet.getObject(columnIndex++);

                object.setFieldAliasNull(resultSet.getBoolean(columnIndex++));

                if (FieldAlias != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldAlias,
                        FieldAlias);
                } // end if

                Object FieldName = resultSet.getObject(columnIndex++);

                object.setFieldNameNull(resultSet.getBoolean(columnIndex++));

                if (FieldName != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldName,
                        FieldName);
                } // end if

                Object ListSourceId = resultSet.getObject(columnIndex++);

                object.setListSourceIdNull(resultSet.getBoolean(columnIndex++));

                if (ListSourceId != null) {
                    BeanUtils.setProperty(object, DataProperty.ListSourceId,
                        ListSourceId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ReportViewId = resultSet.getObject(columnIndex++);

                object.setReportViewIdNull(resultSet.getBoolean(columnIndex++));

                if (ReportViewId != null) {
                    BeanUtils.setProperty(object, DataProperty.ReportViewId,
                        ReportViewId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object Title = resultSet.getObject(columnIndex++);

                object.setTitleNull(resultSet.getBoolean(columnIndex++));

                if (Title != null) {
                    BeanUtils.setProperty(object, DataProperty.Title, Title);
                } // end if

                Object Width = resultSet.getObject(columnIndex++);

                object.setWidthNull(resultSet.getBoolean(columnIndex++));

                if (Width != null) {
                    BeanUtils.setProperty(object, DataProperty.Width, Width);
                } // end if

                Object ListSourceCode = resultSet.getObject(columnIndex++);

                object.setListSourceCodeNull(resultSet.getBoolean(columnIndex++));

                if (ListSourceCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ListSourceCode,
                        ListSourceCode);
                } // end if

                Object ListSourceName = resultSet.getObject(columnIndex++);

                object.setListSourceNameNull(resultSet.getBoolean(columnIndex++));

                if (ListSourceName != null) {
                    BeanUtils.setProperty(object, DataProperty.ListSourceName,
                        ListSourceName);
                } // end if

                Object TableId = resultSet.getObject(columnIndex++);

                object.setTableIdNull(resultSet.getBoolean(columnIndex++));

                if (TableId != null) {
                    BeanUtils.setProperty(object, DataProperty.TableId, TableId);
                } // end if

                Object TableName = resultSet.getObject(columnIndex++);

                object.setTableNameNull(resultSet.getBoolean(columnIndex++));

                if (TableName != null) {
                    BeanUtils.setProperty(object, DataProperty.TableName,
                        TableName);
                } // end if

                Object TableAlias = resultSet.getObject(columnIndex++);

                object.setTableAliasNull(resultSet.getBoolean(columnIndex++));

                if (TableAlias != null) {
                    BeanUtils.setProperty(object, DataProperty.TableAlias,
                        TableAlias);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportViewFieldRowMapper
} // end BaseReportViewFieldDAOJdbcImpl
