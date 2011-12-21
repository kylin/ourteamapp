/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportInstanceDAO;
import com.ourteam.report.dao.ReportInstance;
import com.ourteam.report.dao.ReportInstanceDAOQueryBean;

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
abstract public class BaseReportInstanceDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportInstanceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CatalogId, Remarks, ReportProjectId, ReportTitle, Status,
            ReportViewId, ReportViewName, ReportViewCode, ReportViewIsDistinct,
            ReportViewFilters, ReportViewGroupBy, ReportViewOrderBy,
            ReportProjectName, ReportProjectCode
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CatalogId, DataProperty.Remarks,
            DataProperty.ReportProjectId, DataProperty.ReportTitle,
            DataProperty.Status, DataProperty.ReportViewId,
            DataProperty.ReportViewName, DataProperty.ReportViewCode,
            DataProperty.ReportViewIsDistinct, DataProperty.ReportViewFilters,
            DataProperty.ReportViewGroupBy, DataProperty.ReportViewOrderBy,
            DataProperty.ReportProjectName, DataProperty.ReportProjectCode
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
     * Creates a new BaseReportInstanceDAOJdbcImpl object.
     */
    public BaseReportInstanceDAOJdbcImpl() {
        super();
    } // end BaseReportInstanceDAOJdbcImpl()

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
                " LEFT JOIN REPORT_VIEW_DEFINE reportViewDefineC ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " reportViewDefineC.ID = REPORT_INSTANCE.REPORT_VIEW_ID ");

            relatedJoinSQLBuffer.append(" AND ");
            relatedJoinSQLBuffer.append(
                " reportViewDefineC.REPORT_PROJECT_ID = REPORT_INSTANCE.REPORT_PROJECT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN REPORT_PROJECT reportProjectC ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " reportProjectC.ID = REPORT_INSTANCE.REPORT_PROJECT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ReportInstance
     *
     * @param aReportInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportInstance aReportInstance)
        throws Exception {
        if (aReportInstance == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportInstance,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportInstance
     *
     * @param aReportInstance
     *
     * @throws Exception
     */
    public void insertReportInstance(ReportInstance aReportInstance)
        throws Exception {
        insert(aReportInstance);
    } // end insertReportInstance()

    /**
     * Batch Insert IReportInstance
     *
     * @param aReportInstance
     *
     * @throws Exception
     */
    public void batchInsertReportInstance(ReportInstance[] aReportInstance)
        throws Exception {
        batchInsert(aReportInstance);
    } // end batchInsertReportInstance()

    /**
     * Delete IReportInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportInstance(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportInstance()

    /**
     * Delete IReportInstance
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportInstance(ReportInstanceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportInstance()

    /**
     * Update IReportInstance Selective
     *
     * @param aReportInstance
     *
     * @throws Exception
     */
    public void updateReportInstance(ReportInstance aReportInstance)
        throws Exception {
        if (aReportInstance.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportInstance);

        ReportInstance tempObj = findReportInstanceById(aReportInstance.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportInstance, tempObj);
        } // end if
    } // end updateReportInstance()

    /**
     * Batch Update IReportInstance
     *
     * @param aReportInstance
     *
     * @throws Exception
     */
    public void batchUpdateReportInstance(ReportInstance[] aReportInstance)
        throws Exception {
        batchUpdate(aReportInstance);
    } // end batchUpdateReportInstance()

    /**
     * Update IReportInstance
     *
     * @param aReportInstance
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportInstance(ReportInstance aReportInstance,
        ReportInstanceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportInstance, aQueryBean);
    } // end updateReportInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aReportInstance DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportInstance aReportInstance)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportInstance(ReportInstance[] aReportInstances,
        ReportInstanceDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportInstance(aReportInstances, aQueryBean, null);
    } // end synchronizeReportInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aReportInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportInstance(ReportInstance[] aReportInstances,
        ReportInstanceDAOQueryBean aQueryBean,
        ReportInstanceSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportInstances) == false) {
            inputList.addAll(Arrays.asList(aReportInstances));
        } // end if

        ReportInstance[] existentReportInstances = this.queryReportInstance(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportInstances) == false) {
            existentList.addAll(Arrays.asList(existentReportInstances));
        } // end if

        List willAddReportInstances = ListUtils.subtract(inputList, existentList);

        List willDeleteReportInstances = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportInstances = ListUtils.intersection(existentList,
                inputList);

        ReportInstance[] willUpdateReportInstanceArray = (ReportInstance[]) willUpdateReportInstances.toArray(new ReportInstance[willUpdateReportInstances.size()]);
        ReportInstance[] willAddReportInstanceArray = (ReportInstance[]) willAddReportInstances.toArray(new ReportInstance[willAddReportInstances.size()]);
        ReportInstance[] willDeleteReportInstanceArray = (ReportInstance[]) willDeleteReportInstances.toArray(new ReportInstance[willDeleteReportInstances.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportInstanceArray,
                willUpdateReportInstanceArray, willDeleteReportInstanceArray);
        } // end if

        if (willUpdateReportInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportInstanceArray);
            } // end if

            this.batchUpdateReportInstance(willUpdateReportInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportInstanceArray);
            } // end if
        } // end if

        if (willAddReportInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportInstanceArray);
            } // end if

            this.batchInsertReportInstance(willAddReportInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportInstanceArray);
            } // end if
        } // end if

        if (willDeleteReportInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportInstanceArray);
            } // end if

            for (int i = 0; i < willDeleteReportInstanceArray.length; i++) {
                ReportInstance object = willDeleteReportInstanceArray[i];
                this.deleteReportInstance(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportInstanceArray);
            } // end if
        } // end if
    } // end synchronizeReportInstance()

    /**
     * Query IReportInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportInstance findReportInstanceById(final long aId)
        throws Exception {
        ReportInstanceDAOQueryBean queryBean = new ReportInstanceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportInstance[] ReportInstances = queryReportInstance(queryBean);

        if (ReportInstances.length == 0) {
            return null;
        } // end if
        else {
            return ReportInstances[0];
        } // end else
    } // end findReportInstanceById()

    /**
     * Query IReportInstance
     *
     * @param queryBean
     *
     * @return IReportInstance[]
     *
     * @throws Exception
     */
    public ReportInstance[] queryReportInstance(
        ReportInstanceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportInstanceRowMapper());

        return (ReportInstance[]) result.toArray(new ReportInstance[result.size()]);
    } // end queryReportInstance()

    /**
     * Query ReportInstance Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportInstanceSelective(
        ReportInstanceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportInstanceSelective()

    /**
     * Query IReportInstance Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportInstanceCount(ReportInstanceDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportInstanceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportInstanceRowMapper
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
            ReportInstance object = new ReportInstance();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CatalogId = resultSet.getObject(columnIndex++);

                object.setCatalogIdNull(resultSet.getBoolean(columnIndex++));

                if (CatalogId != null) {
                    BeanUtils.setProperty(object, DataProperty.CatalogId,
                        CatalogId);
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

                Object ReportTitle = resultSet.getObject(columnIndex++);

                object.setReportTitleNull(resultSet.getBoolean(columnIndex++));

                if (ReportTitle != null) {
                    BeanUtils.setProperty(object, DataProperty.ReportTitle,
                        ReportTitle);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object ReportViewId = resultSet.getObject(columnIndex++);

                object.setReportViewIdNull(resultSet.getBoolean(columnIndex++));

                if (ReportViewId != null) {
                    BeanUtils.setProperty(object, DataProperty.ReportViewId,
                        ReportViewId);
                } // end if

                Object ReportViewName = resultSet.getObject(columnIndex++);

                object.setReportViewNameNull(resultSet.getBoolean(columnIndex++));

                if (ReportViewName != null) {
                    BeanUtils.setProperty(object, DataProperty.ReportViewName,
                        ReportViewName);
                } // end if

                Object ReportViewCode = resultSet.getObject(columnIndex++);

                object.setReportViewCodeNull(resultSet.getBoolean(columnIndex++));

                if (ReportViewCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ReportViewCode,
                        ReportViewCode);
                } // end if

                Object ReportViewIsDistinct = resultSet.getObject(columnIndex++);

                object.setReportViewIsDistinctNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportViewIsDistinct != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReportViewIsDistinct, ReportViewIsDistinct);
                } // end if

                Object ReportViewFilters = resultSet.getObject(columnIndex++);

                object.setReportViewFiltersNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportViewFilters != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReportViewFilters, ReportViewFilters);
                } // end if

                Object ReportViewGroupBy = resultSet.getObject(columnIndex++);

                object.setReportViewGroupByNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportViewGroupBy != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReportViewGroupBy, ReportViewGroupBy);
                } // end if

                Object ReportViewOrderBy = resultSet.getObject(columnIndex++);

                object.setReportViewOrderByNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportViewOrderBy != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReportViewOrderBy, ReportViewOrderBy);
                } // end if

                Object ReportProjectName = resultSet.getObject(columnIndex++);

                object.setReportProjectNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportProjectName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReportProjectName, ReportProjectName);
                } // end if

                Object ReportProjectCode = resultSet.getObject(columnIndex++);

                object.setReportProjectCodeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ReportProjectCode != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ReportProjectCode, ReportProjectCode);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportInstanceRowMapper
} // end BaseReportInstanceDAOJdbcImpl
