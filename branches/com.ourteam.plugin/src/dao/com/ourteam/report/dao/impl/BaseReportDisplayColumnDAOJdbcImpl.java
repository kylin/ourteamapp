/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportDisplayColumnDAO;
import com.ourteam.report.dao.ReportDisplayColumn;
import com.ourteam.report.dao.ReportDisplayColumnDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-27 11:38:57
 *
 * @author kylin
 */
abstract public class BaseReportDisplayColumnDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportDisplayColumnDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ColumnTitle, ColumnWidth, FieldId, Remarks, ReportInstanceId,
            SortIndex, Status, FieldDataType, FieldAlias, FieldName, FieldWidth,
            FieldTitle
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ColumnTitle, DataProperty.ColumnWidth,
            DataProperty.FieldId, DataProperty.Remarks,
            DataProperty.ReportInstanceId, DataProperty.SortIndex,
            DataProperty.Status, DataProperty.FieldDataType,
            DataProperty.FieldAlias, DataProperty.FieldName,
            DataProperty.FieldWidth, DataProperty.FieldTitle
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
     * Creates a new BaseReportDisplayColumnDAOJdbcImpl object.
     */
    public BaseReportDisplayColumnDAOJdbcImpl() {
        super();
    } // end BaseReportDisplayColumnDAOJdbcImpl()

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
                " LEFT JOIN REPORT_VIEW_FIELD reportViewFieldD ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " reportViewFieldD.ID = REPORT_DISPLAY_COLUMN.FIELD_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportDisplayColumn aReportDisplayColumn)
        throws Exception {
        if (aReportDisplayColumn == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportDisplayColumn,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     */
    public void insertReportDisplayColumn(
        ReportDisplayColumn aReportDisplayColumn) throws Exception {
        insert(aReportDisplayColumn);
    } // end insertReportDisplayColumn()

    /**
     * Batch Insert IReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     */
    public void batchInsertReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumn) throws Exception {
        batchInsert(aReportDisplayColumn);
    } // end batchInsertReportDisplayColumn()

    /**
     * Delete IReportDisplayColumn
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportDisplayColumn(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportDisplayColumn()

    /**
     * Delete IReportDisplayColumn
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportDisplayColumn(
        ReportDisplayColumnDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportDisplayColumn()

    /**
     * Update IReportDisplayColumn Selective
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     */
    public void updateReportDisplayColumn(
        ReportDisplayColumn aReportDisplayColumn) throws Exception {
        if (aReportDisplayColumn.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportDisplayColumn);

        ReportDisplayColumn tempObj = findReportDisplayColumnById(aReportDisplayColumn.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportDisplayColumn, tempObj);
        } // end if
    } // end updateReportDisplayColumn()

    /**
     * Batch Update IReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     */
    public void batchUpdateReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumn) throws Exception {
        batchUpdate(aReportDisplayColumn);
    } // end batchUpdateReportDisplayColumn()

    /**
     * Update IReportDisplayColumn
     *
     * @param aReportDisplayColumn
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportDisplayColumn(
        ReportDisplayColumn aReportDisplayColumn,
        ReportDisplayColumnDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportDisplayColumn, aQueryBean);
    } // end updateReportDisplayColumn()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDisplayColumn DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportDisplayColumn aReportDisplayColumn)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDisplayColumns DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumns,
        ReportDisplayColumnDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportDisplayColumn(aReportDisplayColumns, aQueryBean, null);
    } // end synchronizeReportDisplayColumn()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDisplayColumns DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumns,
        ReportDisplayColumnDAOQueryBean aQueryBean,
        ReportDisplayColumnSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportDisplayColumns) == false) {
            inputList.addAll(Arrays.asList(aReportDisplayColumns));
        } // end if

        ReportDisplayColumn[] existentReportDisplayColumns = this.queryReportDisplayColumn(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportDisplayColumns) == false) {
            existentList.addAll(Arrays.asList(existentReportDisplayColumns));
        } // end if

        List willAddReportDisplayColumns = ListUtils.subtract(inputList,
                existentList);

        List willDeleteReportDisplayColumns = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportDisplayColumns = ListUtils.intersection(existentList,
                inputList);

        ReportDisplayColumn[] willUpdateReportDisplayColumnArray = (ReportDisplayColumn[]) willUpdateReportDisplayColumns.toArray(new ReportDisplayColumn[willUpdateReportDisplayColumns.size()]);
        ReportDisplayColumn[] willAddReportDisplayColumnArray = (ReportDisplayColumn[]) willAddReportDisplayColumns.toArray(new ReportDisplayColumn[willAddReportDisplayColumns.size()]);
        ReportDisplayColumn[] willDeleteReportDisplayColumnArray = (ReportDisplayColumn[]) willDeleteReportDisplayColumns.toArray(new ReportDisplayColumn[willDeleteReportDisplayColumns.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportDisplayColumnArray,
                willUpdateReportDisplayColumnArray,
                willDeleteReportDisplayColumnArray);
        } // end if

        if (willUpdateReportDisplayColumns.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportDisplayColumnArray);
            } // end if

            this.batchUpdateReportDisplayColumn(willUpdateReportDisplayColumnArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportDisplayColumnArray);
            } // end if
        } // end if

        if (willAddReportDisplayColumns.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportDisplayColumnArray);
            } // end if

            this.batchInsertReportDisplayColumn(willAddReportDisplayColumnArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportDisplayColumnArray);
            } // end if
        } // end if

        if (willDeleteReportDisplayColumns.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportDisplayColumnArray);
            } // end if

            for (int i = 0; i < willDeleteReportDisplayColumnArray.length;
                    i++) {
                ReportDisplayColumn object = willDeleteReportDisplayColumnArray[i];
                this.deleteReportDisplayColumn(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportDisplayColumnArray);
            } // end if
        } // end if
    } // end synchronizeReportDisplayColumn()

    /**
     * Query IReportDisplayColumn
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportDisplayColumn findReportDisplayColumnById(final long aId)
        throws Exception {
        ReportDisplayColumnDAOQueryBean queryBean = new ReportDisplayColumnDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportDisplayColumn[] ReportDisplayColumns = queryReportDisplayColumn(queryBean);

        if (ReportDisplayColumns.length == 0) {
            return null;
        } // end if
        else {
            return ReportDisplayColumns[0];
        } // end else
    } // end findReportDisplayColumnById()

    /**
     * Query IReportDisplayColumn
     *
     * @param queryBean
     *
     * @return IReportDisplayColumn[]
     *
     * @throws Exception
     */
    public ReportDisplayColumn[] queryReportDisplayColumn(
        ReportDisplayColumnDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcReportDisplayColumnRowMapper());

        return (ReportDisplayColumn[]) result.toArray(new ReportDisplayColumn[result.size()]);
    } // end queryReportDisplayColumn()

    /**
     * Query ReportDisplayColumn Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportDisplayColumnSelective(
        ReportDisplayColumnDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportDisplayColumnSelective()

    /**
     * Query IReportDisplayColumn Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportDisplayColumnCount(
        ReportDisplayColumnDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryReportDisplayColumnCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportDisplayColumnRowMapper
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
            ReportDisplayColumn object = new ReportDisplayColumn();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ColumnTitle = resultSet.getObject(columnIndex++);

                object.setColumnTitleNull(resultSet.getBoolean(columnIndex++));

                if (ColumnTitle != null) {
                    BeanUtils.setProperty(object, DataProperty.ColumnTitle,
                        ColumnTitle);
                } // end if

                Object ColumnWidth = resultSet.getObject(columnIndex++);

                object.setColumnWidthNull(resultSet.getBoolean(columnIndex++));

                if (ColumnWidth != null) {
                    BeanUtils.setProperty(object, DataProperty.ColumnWidth,
                        ColumnWidth);
                } // end if

                Object FieldId = resultSet.getObject(columnIndex++);

                object.setFieldIdNull(resultSet.getBoolean(columnIndex++));

                if (FieldId != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldId, FieldId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ReportInstanceId = resultSet.getObject(columnIndex++);

                object.setReportInstanceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportInstanceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReportInstanceId, ReportInstanceId);
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

                Object FieldDataType = resultSet.getObject(columnIndex++);

                object.setFieldDataTypeNull(resultSet.getBoolean(columnIndex++));

                if (FieldDataType != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldDataType,
                        FieldDataType);
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

                Object FieldWidth = resultSet.getObject(columnIndex++);

                object.setFieldWidthNull(resultSet.getBoolean(columnIndex++));

                if (FieldWidth != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldWidth,
                        FieldWidth);
                } // end if

                Object FieldTitle = resultSet.getObject(columnIndex++);

                object.setFieldTitleNull(resultSet.getBoolean(columnIndex++));

                if (FieldTitle != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldTitle,
                        FieldTitle);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportDisplayColumnRowMapper
} // end BaseReportDisplayColumnDAOJdbcImpl
