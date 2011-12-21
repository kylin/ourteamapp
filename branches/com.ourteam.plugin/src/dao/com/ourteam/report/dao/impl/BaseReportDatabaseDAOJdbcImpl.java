/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportDatabaseDAO;
import com.ourteam.report.dao.ReportDatabase;
import com.ourteam.report.dao.ReportDatabaseDAOQueryBean;

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
abstract public class BaseReportDatabaseDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportDatabaseDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DatabaseId, Remarks, ReportProjectId, Status, DatabaseName,
            DatabaseProvider
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DatabaseId, DataProperty.Remarks,
            DataProperty.ReportProjectId, DataProperty.Status,
            DataProperty.DatabaseName, DataProperty.DatabaseProvider
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
     * Creates a new BaseReportDatabaseDAOJdbcImpl object.
     */
    public BaseReportDatabaseDAOJdbcImpl() {
        super();
    } // end BaseReportDatabaseDAOJdbcImpl()

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
                " LEFT JOIN MIDDLE_WARE databaseMiddlewareA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " databaseMiddlewareA.ID = REPORT_DATABASE.DATABASE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ReportDatabase
     *
     * @param aReportDatabase
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportDatabase aReportDatabase)
        throws Exception {
        if (aReportDatabase == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportDatabase,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportDatabase
     *
     * @param aReportDatabase
     *
     * @throws Exception
     */
    public void insertReportDatabase(ReportDatabase aReportDatabase)
        throws Exception {
        insert(aReportDatabase);
    } // end insertReportDatabase()

    /**
     * Batch Insert IReportDatabase
     *
     * @param aReportDatabase
     *
     * @throws Exception
     */
    public void batchInsertReportDatabase(ReportDatabase[] aReportDatabase)
        throws Exception {
        batchInsert(aReportDatabase);
    } // end batchInsertReportDatabase()

    /**
     * Delete IReportDatabase
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportDatabase(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportDatabase()

    /**
     * Delete IReportDatabase
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportDatabase(ReportDatabaseDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportDatabase()

    /**
     * Update IReportDatabase Selective
     *
     * @param aReportDatabase
     *
     * @throws Exception
     */
    public void updateReportDatabase(ReportDatabase aReportDatabase)
        throws Exception {
        if (aReportDatabase.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportDatabase);

        ReportDatabase tempObj = findReportDatabaseById(aReportDatabase.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportDatabase, tempObj);
        } // end if
    } // end updateReportDatabase()

    /**
     * Batch Update IReportDatabase
     *
     * @param aReportDatabase
     *
     * @throws Exception
     */
    public void batchUpdateReportDatabase(ReportDatabase[] aReportDatabase)
        throws Exception {
        batchUpdate(aReportDatabase);
    } // end batchUpdateReportDatabase()

    /**
     * Update IReportDatabase
     *
     * @param aReportDatabase
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportDatabase(ReportDatabase aReportDatabase,
        ReportDatabaseDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportDatabase, aQueryBean);
    } // end updateReportDatabase()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDatabase DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportDatabase aReportDatabase)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDatabases DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportDatabase(ReportDatabase[] aReportDatabases,
        ReportDatabaseDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportDatabase(aReportDatabases, aQueryBean, null);
    } // end synchronizeReportDatabase()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDatabases DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportDatabase(ReportDatabase[] aReportDatabases,
        ReportDatabaseDAOQueryBean aQueryBean,
        ReportDatabaseSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportDatabases) == false) {
            inputList.addAll(Arrays.asList(aReportDatabases));
        } // end if

        ReportDatabase[] existentReportDatabases = this.queryReportDatabase(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportDatabases) == false) {
            existentList.addAll(Arrays.asList(existentReportDatabases));
        } // end if

        List willAddReportDatabases = ListUtils.subtract(inputList, existentList);

        List willDeleteReportDatabases = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportDatabases = ListUtils.intersection(existentList,
                inputList);

        ReportDatabase[] willUpdateReportDatabaseArray = (ReportDatabase[]) willUpdateReportDatabases.toArray(new ReportDatabase[willUpdateReportDatabases.size()]);
        ReportDatabase[] willAddReportDatabaseArray = (ReportDatabase[]) willAddReportDatabases.toArray(new ReportDatabase[willAddReportDatabases.size()]);
        ReportDatabase[] willDeleteReportDatabaseArray = (ReportDatabase[]) willDeleteReportDatabases.toArray(new ReportDatabase[willDeleteReportDatabases.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportDatabaseArray,
                willUpdateReportDatabaseArray, willDeleteReportDatabaseArray);
        } // end if

        if (willUpdateReportDatabases.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportDatabaseArray);
            } // end if

            this.batchUpdateReportDatabase(willUpdateReportDatabaseArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportDatabaseArray);
            } // end if
        } // end if

        if (willAddReportDatabases.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportDatabaseArray);
            } // end if

            this.batchInsertReportDatabase(willAddReportDatabaseArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportDatabaseArray);
            } // end if
        } // end if

        if (willDeleteReportDatabases.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportDatabaseArray);
            } // end if

            for (int i = 0; i < willDeleteReportDatabaseArray.length; i++) {
                ReportDatabase object = willDeleteReportDatabaseArray[i];
                this.deleteReportDatabase(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportDatabaseArray);
            } // end if
        } // end if
    } // end synchronizeReportDatabase()

    /**
     * Query IReportDatabase
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportDatabase findReportDatabaseById(final long aId)
        throws Exception {
        ReportDatabaseDAOQueryBean queryBean = new ReportDatabaseDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportDatabase[] ReportDatabases = queryReportDatabase(queryBean);

        if (ReportDatabases.length == 0) {
            return null;
        } // end if
        else {
            return ReportDatabases[0];
        } // end else
    } // end findReportDatabaseById()

    /**
     * Query IReportDatabase
     *
     * @param queryBean
     *
     * @return IReportDatabase[]
     *
     * @throws Exception
     */
    public ReportDatabase[] queryReportDatabase(
        ReportDatabaseDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportDatabaseRowMapper());

        return (ReportDatabase[]) result.toArray(new ReportDatabase[result.size()]);
    } // end queryReportDatabase()

    /**
     * Query ReportDatabase Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportDatabaseSelective(
        ReportDatabaseDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportDatabaseSelective()

    /**
     * Query IReportDatabase Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportDatabaseCount(ReportDatabaseDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportDatabaseCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportDatabaseRowMapper
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
            ReportDatabase object = new ReportDatabase();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DatabaseId = resultSet.getObject(columnIndex++);

                object.setDatabaseIdNull(resultSet.getBoolean(columnIndex++));

                if (DatabaseId != null) {
                    BeanUtils.setProperty(object, DataProperty.DatabaseId,
                        DatabaseId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ReportProjectId = resultSet.getObject(columnIndex++);

                object.setReportProjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportProjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.ReportProjectId,
                        ReportProjectId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object DatabaseName = resultSet.getObject(columnIndex++);

                object.setDatabaseNameNull(resultSet.getBoolean(columnIndex++));

                if (DatabaseName != null) {
                    BeanUtils.setProperty(object, DataProperty.DatabaseName,
                        DatabaseName);
                } // end if

                Object DatabaseProvider = resultSet.getObject(columnIndex++);

                object.setDatabaseProviderNull(resultSet.getBoolean(
                        columnIndex++));

                if (DatabaseProvider != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.DatabaseProvider, DatabaseProvider);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportDatabaseRowMapper
} // end BaseReportDatabaseDAOJdbcImpl
