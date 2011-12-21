/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportFilterDAO;
import com.ourteam.report.dao.ReportFilter;
import com.ourteam.report.dao.ReportFilterDAOQueryBean;

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
abstract public class BaseReportFilterDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportFilterDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Connection, FieldId, LeftSymbol, Operation, Remarks,
            ReportInstanceId, RightSymbol, Status, Value, FieldDataType,
            FieldName, FieldAlias, FieldTitle, FieldListSourceId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Connection, DataProperty.FieldId,
            DataProperty.LeftSymbol, DataProperty.Operation,
            DataProperty.Remarks, DataProperty.ReportInstanceId,
            DataProperty.RightSymbol, DataProperty.Status, DataProperty.Value,
            DataProperty.FieldDataType, DataProperty.FieldName,
            DataProperty.FieldAlias, DataProperty.FieldTitle,
            DataProperty.FieldListSourceId
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
     * Creates a new BaseReportFilterDAOJdbcImpl object.
     */
    public BaseReportFilterDAOJdbcImpl() {
        super();
    } // end BaseReportFilterDAOJdbcImpl()

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
                " LEFT JOIN REPORT_VIEW_FIELD reportViewFieldE ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " reportViewFieldE.ID = REPORT_FILTER.FIELD_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ReportFilter
     *
     * @param aReportFilter
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportFilter aReportFilter)
        throws Exception {
        if (aReportFilter == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportFilter, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportFilter
     *
     * @param aReportFilter
     *
     * @throws Exception
     */
    public void insertReportFilter(ReportFilter aReportFilter)
        throws Exception {
        insert(aReportFilter);
    } // end insertReportFilter()

    /**
     * Batch Insert IReportFilter
     *
     * @param aReportFilter
     *
     * @throws Exception
     */
    public void batchInsertReportFilter(ReportFilter[] aReportFilter)
        throws Exception {
        batchInsert(aReportFilter);
    } // end batchInsertReportFilter()

    /**
     * Delete IReportFilter
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportFilter(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportFilter()

    /**
     * Delete IReportFilter
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportFilter(ReportFilterDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportFilter()

    /**
     * Update IReportFilter Selective
     *
     * @param aReportFilter
     *
     * @throws Exception
     */
    public void updateReportFilter(ReportFilter aReportFilter)
        throws Exception {
        if (aReportFilter.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportFilter);

        ReportFilter tempObj = findReportFilterById(aReportFilter.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportFilter, tempObj);
        } // end if
    } // end updateReportFilter()

    /**
     * Batch Update IReportFilter
     *
     * @param aReportFilter
     *
     * @throws Exception
     */
    public void batchUpdateReportFilter(ReportFilter[] aReportFilter)
        throws Exception {
        batchUpdate(aReportFilter);
    } // end batchUpdateReportFilter()

    /**
     * Update IReportFilter
     *
     * @param aReportFilter
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportFilter(ReportFilter aReportFilter,
        ReportFilterDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportFilter, aQueryBean);
    } // end updateReportFilter()

    /**
     * DOCUMENT ME!
     *
     * @param aReportFilter DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportFilter aReportFilter)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportFilters DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportFilter(ReportFilter[] aReportFilters,
        ReportFilterDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportFilter(aReportFilters, aQueryBean, null);
    } // end synchronizeReportFilter()

    /**
     * DOCUMENT ME!
     *
     * @param aReportFilters DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportFilter(ReportFilter[] aReportFilters,
        ReportFilterDAOQueryBean aQueryBean,
        ReportFilterSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportFilters) == false) {
            inputList.addAll(Arrays.asList(aReportFilters));
        } // end if

        ReportFilter[] existentReportFilters = this.queryReportFilter(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportFilters) == false) {
            existentList.addAll(Arrays.asList(existentReportFilters));
        } // end if

        List willAddReportFilters = ListUtils.subtract(inputList, existentList);

        List willDeleteReportFilters = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportFilters = ListUtils.intersection(existentList,
                inputList);

        ReportFilter[] willUpdateReportFilterArray = (ReportFilter[]) willUpdateReportFilters.toArray(new ReportFilter[willUpdateReportFilters.size()]);
        ReportFilter[] willAddReportFilterArray = (ReportFilter[]) willAddReportFilters.toArray(new ReportFilter[willAddReportFilters.size()]);
        ReportFilter[] willDeleteReportFilterArray = (ReportFilter[]) willDeleteReportFilters.toArray(new ReportFilter[willDeleteReportFilters.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportFilterArray,
                willUpdateReportFilterArray, willDeleteReportFilterArray);
        } // end if

        if (willUpdateReportFilters.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportFilterArray);
            } // end if

            this.batchUpdateReportFilter(willUpdateReportFilterArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportFilterArray);
            } // end if
        } // end if

        if (willAddReportFilters.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportFilterArray);
            } // end if

            this.batchInsertReportFilter(willAddReportFilterArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportFilterArray);
            } // end if
        } // end if

        if (willDeleteReportFilters.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportFilterArray);
            } // end if

            for (int i = 0; i < willDeleteReportFilterArray.length; i++) {
                ReportFilter object = willDeleteReportFilterArray[i];
                this.deleteReportFilter(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportFilterArray);
            } // end if
        } // end if
    } // end synchronizeReportFilter()

    /**
     * Query IReportFilter
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportFilter findReportFilterById(final long aId)
        throws Exception {
        ReportFilterDAOQueryBean queryBean = new ReportFilterDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportFilter[] ReportFilters = queryReportFilter(queryBean);

        if (ReportFilters.length == 0) {
            return null;
        } // end if
        else {
            return ReportFilters[0];
        } // end else
    } // end findReportFilterById()

    /**
     * Query IReportFilter
     *
     * @param queryBean
     *
     * @return IReportFilter[]
     *
     * @throws Exception
     */
    public ReportFilter[] queryReportFilter(ReportFilterDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcReportFilterRowMapper());

        return (ReportFilter[]) result.toArray(new ReportFilter[result.size()]);
    } // end queryReportFilter()

    /**
     * Query ReportFilter Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportFilterSelective(ReportFilterDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportFilterSelective()

    /**
     * Query IReportFilter Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportFilterCount(ReportFilterDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportFilterCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportFilterRowMapper
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
            ReportFilter object = new ReportFilter();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Connection = resultSet.getObject(columnIndex++);

                object.setConnectionNull(resultSet.getBoolean(columnIndex++));

                if (Connection != null) {
                    BeanUtils.setProperty(object, DataProperty.Connection,
                        Connection);
                } // end if

                Object FieldId = resultSet.getObject(columnIndex++);

                object.setFieldIdNull(resultSet.getBoolean(columnIndex++));

                if (FieldId != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldId, FieldId);
                } // end if

                Object LeftSymbol = resultSet.getObject(columnIndex++);

                object.setLeftSymbolNull(resultSet.getBoolean(columnIndex++));

                if (LeftSymbol != null) {
                    BeanUtils.setProperty(object, DataProperty.LeftSymbol,
                        LeftSymbol);
                } // end if

                Object Operation = resultSet.getObject(columnIndex++);

                object.setOperationNull(resultSet.getBoolean(columnIndex++));

                if (Operation != null) {
                    BeanUtils.setProperty(object, DataProperty.Operation,
                        Operation);
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

                Object RightSymbol = resultSet.getObject(columnIndex++);

                object.setRightSymbolNull(resultSet.getBoolean(columnIndex++));

                if (RightSymbol != null) {
                    BeanUtils.setProperty(object, DataProperty.RightSymbol,
                        RightSymbol);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object Value = resultSet.getObject(columnIndex++);

                object.setValueNull(resultSet.getBoolean(columnIndex++));

                if (Value != null) {
                    BeanUtils.setProperty(object, DataProperty.Value, Value);
                } // end if

                Object FieldDataType = resultSet.getObject(columnIndex++);

                object.setFieldDataTypeNull(resultSet.getBoolean(columnIndex++));

                if (FieldDataType != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldDataType,
                        FieldDataType);
                } // end if

                Object FieldName = resultSet.getObject(columnIndex++);

                object.setFieldNameNull(resultSet.getBoolean(columnIndex++));

                if (FieldName != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldName,
                        FieldName);
                } // end if

                Object FieldAlias = resultSet.getObject(columnIndex++);

                object.setFieldAliasNull(resultSet.getBoolean(columnIndex++));

                if (FieldAlias != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldAlias,
                        FieldAlias);
                } // end if

                Object FieldTitle = resultSet.getObject(columnIndex++);

                object.setFieldTitleNull(resultSet.getBoolean(columnIndex++));

                if (FieldTitle != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldTitle,
                        FieldTitle);
                } // end if

                Object FieldListSourceId = resultSet.getObject(columnIndex++);

                object.setFieldListSourceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (FieldListSourceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.FieldListSourceId, FieldListSourceId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportFilterRowMapper
} // end BaseReportFilterDAOJdbcImpl
