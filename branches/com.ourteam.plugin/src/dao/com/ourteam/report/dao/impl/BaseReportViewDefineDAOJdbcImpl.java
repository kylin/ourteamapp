/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportViewDefineDAO;
import com.ourteam.report.dao.ReportViewDefine;
import com.ourteam.report.dao.ReportViewDefineDAOQueryBean;

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
abstract public class BaseReportViewDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportViewDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, GroupBy, IsDistinct, Name, OrderBy, Remarks,
            ReportProjectId, Status, UnionViews, ViewFilters, ReportProjectName,
            ReportProjectCode
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.GroupBy,
            DataProperty.IsDistinct, DataProperty.Name, DataProperty.OrderBy,
            DataProperty.Remarks, DataProperty.ReportProjectId,
            DataProperty.Status, DataProperty.UnionViews,
            DataProperty.ViewFilters, DataProperty.ReportProjectName,
            DataProperty.ReportProjectCode
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
     * Creates a new BaseReportViewDefineDAOJdbcImpl object.
     */
    public BaseReportViewDefineDAOJdbcImpl() {
        super();
    } // end BaseReportViewDefineDAOJdbcImpl()

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
                " LEFT JOIN REPORT_PROJECT reportProjectA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " reportProjectA.ID = REPORT_VIEW_DEFINE.REPORT_PROJECT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportViewDefine aReportViewDefine)
        throws Exception {
        if (aReportViewDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportViewDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     */
    public void insertReportViewDefine(ReportViewDefine aReportViewDefine)
        throws Exception {
        insert(aReportViewDefine);
    } // end insertReportViewDefine()

    /**
     * Batch Insert IReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     */
    public void batchInsertReportViewDefine(
        ReportViewDefine[] aReportViewDefine) throws Exception {
        batchInsert(aReportViewDefine);
    } // end batchInsertReportViewDefine()

    /**
     * Delete IReportViewDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportViewDefine(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportViewDefine()

    /**
     * Delete IReportViewDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportViewDefine(ReportViewDefineDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportViewDefine()

    /**
     * Update IReportViewDefine Selective
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     */
    public void updateReportViewDefine(ReportViewDefine aReportViewDefine)
        throws Exception {
        if (aReportViewDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportViewDefine);

        ReportViewDefine tempObj = findReportViewDefineById(aReportViewDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportViewDefine, tempObj);
        } // end if
    } // end updateReportViewDefine()

    /**
     * Batch Update IReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     */
    public void batchUpdateReportViewDefine(
        ReportViewDefine[] aReportViewDefine) throws Exception {
        batchUpdate(aReportViewDefine);
    } // end batchUpdateReportViewDefine()

    /**
     * Update IReportViewDefine
     *
     * @param aReportViewDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportViewDefine(ReportViewDefine aReportViewDefine,
        ReportViewDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportViewDefine, aQueryBean);
    } // end updateReportViewDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportViewDefine aReportViewDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewDefine(
        ReportViewDefine[] aReportViewDefines,
        ReportViewDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportViewDefine(aReportViewDefines, aQueryBean, null);
    } // end synchronizeReportViewDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewDefine(
        ReportViewDefine[] aReportViewDefines,
        ReportViewDefineDAOQueryBean aQueryBean,
        ReportViewDefineSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportViewDefines) == false) {
            inputList.addAll(Arrays.asList(aReportViewDefines));
        } // end if

        ReportViewDefine[] existentReportViewDefines = this.queryReportViewDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportViewDefines) == false) {
            existentList.addAll(Arrays.asList(existentReportViewDefines));
        } // end if

        List willAddReportViewDefines = ListUtils.subtract(inputList,
                existentList);

        List willDeleteReportViewDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportViewDefines = ListUtils.intersection(existentList,
                inputList);

        ReportViewDefine[] willUpdateReportViewDefineArray = (ReportViewDefine[]) willUpdateReportViewDefines.toArray(new ReportViewDefine[willUpdateReportViewDefines.size()]);
        ReportViewDefine[] willAddReportViewDefineArray = (ReportViewDefine[]) willAddReportViewDefines.toArray(new ReportViewDefine[willAddReportViewDefines.size()]);
        ReportViewDefine[] willDeleteReportViewDefineArray = (ReportViewDefine[]) willDeleteReportViewDefines.toArray(new ReportViewDefine[willDeleteReportViewDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportViewDefineArray,
                willUpdateReportViewDefineArray, willDeleteReportViewDefineArray);
        } // end if

        if (willUpdateReportViewDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportViewDefineArray);
            } // end if

            this.batchUpdateReportViewDefine(willUpdateReportViewDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportViewDefineArray);
            } // end if
        } // end if

        if (willAddReportViewDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportViewDefineArray);
            } // end if

            this.batchInsertReportViewDefine(willAddReportViewDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportViewDefineArray);
            } // end if
        } // end if

        if (willDeleteReportViewDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportViewDefineArray);
            } // end if

            for (int i = 0; i < willDeleteReportViewDefineArray.length; i++) {
                ReportViewDefine object = willDeleteReportViewDefineArray[i];
                this.deleteReportViewDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportViewDefineArray);
            } // end if
        } // end if
    } // end synchronizeReportViewDefine()

    /**
     * Query IReportViewDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportViewDefine findReportViewDefineById(final long aId)
        throws Exception {
        ReportViewDefineDAOQueryBean queryBean = new ReportViewDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportViewDefine[] ReportViewDefines = queryReportViewDefine(queryBean);

        if (ReportViewDefines.length == 0) {
            return null;
        } // end if
        else {
            return ReportViewDefines[0];
        } // end else
    } // end findReportViewDefineById()

    /**
     * Query IReportViewDefine
     *
     * @param queryBean
     *
     * @return IReportViewDefine[]
     *
     * @throws Exception
     */
    public ReportViewDefine[] queryReportViewDefine(
        ReportViewDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportViewDefineRowMapper());

        return (ReportViewDefine[]) result.toArray(new ReportViewDefine[result.size()]);
    } // end queryReportViewDefine()

    /**
     * Query ReportViewDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportViewDefineSelective(
        ReportViewDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportViewDefineSelective()

    /**
     * Query IReportViewDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportViewDefineCount(
        ReportViewDefineDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryReportViewDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportViewDefineRowMapper
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
            ReportViewDefine object = new ReportViewDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Code = resultSet.getObject(columnIndex++);

                object.setCodeNull(resultSet.getBoolean(columnIndex++));

                if (Code != null) {
                    BeanUtils.setProperty(object, DataProperty.Code, Code);
                } // end if

                Object GroupBy = resultSet.getObject(columnIndex++);

                object.setGroupByNull(resultSet.getBoolean(columnIndex++));

                if (GroupBy != null) {
                    BeanUtils.setProperty(object, DataProperty.GroupBy, GroupBy);
                } // end if

                Object IsDistinct = resultSet.getObject(columnIndex++);

                object.setIsDistinctNull(resultSet.getBoolean(columnIndex++));

                if (IsDistinct != null) {
                    BeanUtils.setProperty(object, DataProperty.IsDistinct,
                        IsDistinct);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object OrderBy = resultSet.getObject(columnIndex++);

                object.setOrderByNull(resultSet.getBoolean(columnIndex++));

                if (OrderBy != null) {
                    BeanUtils.setProperty(object, DataProperty.OrderBy, OrderBy);
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

                Object UnionViews = resultSet.getObject(columnIndex++);

                object.setUnionViewsNull(resultSet.getBoolean(columnIndex++));

                if (UnionViews != null) {
                    BeanUtils.setProperty(object, DataProperty.UnionViews,
                        UnionViews);
                } // end if

                Object ViewFilters = resultSet.getObject(columnIndex++);

                object.setViewFiltersNull(resultSet.getBoolean(columnIndex++));

                if (ViewFilters != null) {
                    BeanUtils.setProperty(object, DataProperty.ViewFilters,
                        ViewFilters);
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
    } // end JdbcReportViewDefineRowMapper
} // end BaseReportViewDefineDAOJdbcImpl
