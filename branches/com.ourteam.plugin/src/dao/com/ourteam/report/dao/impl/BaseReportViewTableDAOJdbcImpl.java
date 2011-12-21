/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportViewTableDAO;
import com.ourteam.report.dao.ReportViewTable;
import com.ourteam.report.dao.ReportViewTableDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-27 11:38:59
 *
 * @author kylin
 */
abstract public class BaseReportViewTableDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportViewTableDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, JoinCond, JoinType, Remarks, ReportViewId, Status, TableAlias,
            TableName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.JoinCond, DataProperty.JoinType,
            DataProperty.Remarks, DataProperty.ReportViewId, DataProperty.Status,
            DataProperty.TableAlias, DataProperty.TableName
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
     * Creates a new BaseReportViewTableDAOJdbcImpl object.
     */
    public BaseReportViewTableDAOJdbcImpl() {
        super();
    } // end BaseReportViewTableDAOJdbcImpl()

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
     * Check Unique ReportViewTable
     *
     * @param aReportViewTable
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportViewTable aReportViewTable)
        throws Exception {
        if (aReportViewTable == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportViewTable,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportViewTable
     *
     * @param aReportViewTable
     *
     * @throws Exception
     */
    public void insertReportViewTable(ReportViewTable aReportViewTable)
        throws Exception {
        insert(aReportViewTable);
    } // end insertReportViewTable()

    /**
     * Batch Insert IReportViewTable
     *
     * @param aReportViewTable
     *
     * @throws Exception
     */
    public void batchInsertReportViewTable(ReportViewTable[] aReportViewTable)
        throws Exception {
        batchInsert(aReportViewTable);
    } // end batchInsertReportViewTable()

    /**
     * Delete IReportViewTable
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportViewTable(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportViewTable()

    /**
     * Delete IReportViewTable
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportViewTable(ReportViewTableDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportViewTable()

    /**
     * Update IReportViewTable Selective
     *
     * @param aReportViewTable
     *
     * @throws Exception
     */
    public void updateReportViewTable(ReportViewTable aReportViewTable)
        throws Exception {
        if (aReportViewTable.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportViewTable);

        ReportViewTable tempObj = findReportViewTableById(aReportViewTable.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportViewTable, tempObj);
        } // end if
    } // end updateReportViewTable()

    /**
     * Batch Update IReportViewTable
     *
     * @param aReportViewTable
     *
     * @throws Exception
     */
    public void batchUpdateReportViewTable(ReportViewTable[] aReportViewTable)
        throws Exception {
        batchUpdate(aReportViewTable);
    } // end batchUpdateReportViewTable()

    /**
     * Update IReportViewTable
     *
     * @param aReportViewTable
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportViewTable(ReportViewTable aReportViewTable,
        ReportViewTableDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportViewTable, aQueryBean);
    } // end updateReportViewTable()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewTable DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportViewTable aReportViewTable)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewTables DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewTable(
        ReportViewTable[] aReportViewTables,
        ReportViewTableDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportViewTable(aReportViewTables, aQueryBean, null);
    } // end synchronizeReportViewTable()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewTables DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewTable(
        ReportViewTable[] aReportViewTables,
        ReportViewTableDAOQueryBean aQueryBean,
        ReportViewTableSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportViewTables) == false) {
            inputList.addAll(Arrays.asList(aReportViewTables));
        } // end if

        ReportViewTable[] existentReportViewTables = this.queryReportViewTable(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportViewTables) == false) {
            existentList.addAll(Arrays.asList(existentReportViewTables));
        } // end if

        List willAddReportViewTables = ListUtils.subtract(inputList,
                existentList);

        List willDeleteReportViewTables = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportViewTables = ListUtils.intersection(existentList,
                inputList);

        ReportViewTable[] willUpdateReportViewTableArray = (ReportViewTable[]) willUpdateReportViewTables.toArray(new ReportViewTable[willUpdateReportViewTables.size()]);
        ReportViewTable[] willAddReportViewTableArray = (ReportViewTable[]) willAddReportViewTables.toArray(new ReportViewTable[willAddReportViewTables.size()]);
        ReportViewTable[] willDeleteReportViewTableArray = (ReportViewTable[]) willDeleteReportViewTables.toArray(new ReportViewTable[willDeleteReportViewTables.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportViewTableArray,
                willUpdateReportViewTableArray, willDeleteReportViewTableArray);
        } // end if

        if (willUpdateReportViewTables.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportViewTableArray);
            } // end if

            this.batchUpdateReportViewTable(willUpdateReportViewTableArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportViewTableArray);
            } // end if
        } // end if

        if (willAddReportViewTables.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportViewTableArray);
            } // end if

            this.batchInsertReportViewTable(willAddReportViewTableArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportViewTableArray);
            } // end if
        } // end if

        if (willDeleteReportViewTables.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportViewTableArray);
            } // end if

            for (int i = 0; i < willDeleteReportViewTableArray.length; i++) {
                ReportViewTable object = willDeleteReportViewTableArray[i];
                this.deleteReportViewTable(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportViewTableArray);
            } // end if
        } // end if
    } // end synchronizeReportViewTable()

    /**
     * Query IReportViewTable
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportViewTable findReportViewTableById(final long aId)
        throws Exception {
        ReportViewTableDAOQueryBean queryBean = new ReportViewTableDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportViewTable[] ReportViewTables = queryReportViewTable(queryBean);

        if (ReportViewTables.length == 0) {
            return null;
        } // end if
        else {
            return ReportViewTables[0];
        } // end else
    } // end findReportViewTableById()

    /**
     * Query IReportViewTable
     *
     * @param queryBean
     *
     * @return IReportViewTable[]
     *
     * @throws Exception
     */
    public ReportViewTable[] queryReportViewTable(
        ReportViewTableDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportViewTableRowMapper());

        return (ReportViewTable[]) result.toArray(new ReportViewTable[result.size()]);
    } // end queryReportViewTable()

    /**
     * Query ReportViewTable Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportViewTableSelective(
        ReportViewTableDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportViewTableSelective()

    /**
     * Query IReportViewTable Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportViewTableCount(ReportViewTableDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportViewTableCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportViewTableRowMapper
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
            ReportViewTable object = new ReportViewTable();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object JoinCond = resultSet.getObject(columnIndex++);

                object.setJoinCondNull(resultSet.getBoolean(columnIndex++));

                if (JoinCond != null) {
                    BeanUtils.setProperty(object, DataProperty.JoinCond,
                        JoinCond);
                } // end if

                Object JoinType = resultSet.getObject(columnIndex++);

                object.setJoinTypeNull(resultSet.getBoolean(columnIndex++));

                if (JoinType != null) {
                    BeanUtils.setProperty(object, DataProperty.JoinType,
                        JoinType);
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

                Object TableAlias = resultSet.getObject(columnIndex++);

                object.setTableAliasNull(resultSet.getBoolean(columnIndex++));

                if (TableAlias != null) {
                    BeanUtils.setProperty(object, DataProperty.TableAlias,
                        TableAlias);
                } // end if

                Object TableName = resultSet.getObject(columnIndex++);

                object.setTableNameNull(resultSet.getBoolean(columnIndex++));

                if (TableName != null) {
                    BeanUtils.setProperty(object, DataProperty.TableName,
                        TableName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportViewTableRowMapper
} // end BaseReportViewTableDAOJdbcImpl
