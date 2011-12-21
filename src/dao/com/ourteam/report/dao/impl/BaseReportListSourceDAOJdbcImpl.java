/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportListSourceDAO;
import com.ourteam.report.dao.ReportListSource;
import com.ourteam.report.dao.ReportListSourceDAOQueryBean;

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
abstract public class BaseReportListSourceDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportListSourceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, IdAttr, Name, Remarks, ReportProjectId, SqlScript, Status,
            TextAttr
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.IdAttr,
            DataProperty.Name, DataProperty.Remarks,
            DataProperty.ReportProjectId, DataProperty.SqlScript,
            DataProperty.Status, DataProperty.TextAttr
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
     * Creates a new BaseReportListSourceDAOJdbcImpl object.
     */
    public BaseReportListSourceDAOJdbcImpl() {
        super();
    } // end BaseReportListSourceDAOJdbcImpl()

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
     * Check Unique ReportListSource
     *
     * @param aReportListSource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportListSource aReportListSource)
        throws Exception {
        if (aReportListSource == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportListSource,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportListSource
     *
     * @param aReportListSource
     *
     * @throws Exception
     */
    public void insertReportListSource(ReportListSource aReportListSource)
        throws Exception {
        insert(aReportListSource);
    } // end insertReportListSource()

    /**
     * Batch Insert IReportListSource
     *
     * @param aReportListSource
     *
     * @throws Exception
     */
    public void batchInsertReportListSource(
        ReportListSource[] aReportListSource) throws Exception {
        batchInsert(aReportListSource);
    } // end batchInsertReportListSource()

    /**
     * Delete IReportListSource
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportListSource(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportListSource()

    /**
     * Delete IReportListSource
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportListSource(ReportListSourceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportListSource()

    /**
     * Update IReportListSource Selective
     *
     * @param aReportListSource
     *
     * @throws Exception
     */
    public void updateReportListSource(ReportListSource aReportListSource)
        throws Exception {
        if (aReportListSource.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportListSource);

        ReportListSource tempObj = findReportListSourceById(aReportListSource.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportListSource, tempObj);
        } // end if
    } // end updateReportListSource()

    /**
     * Batch Update IReportListSource
     *
     * @param aReportListSource
     *
     * @throws Exception
     */
    public void batchUpdateReportListSource(
        ReportListSource[] aReportListSource) throws Exception {
        batchUpdate(aReportListSource);
    } // end batchUpdateReportListSource()

    /**
     * Update IReportListSource
     *
     * @param aReportListSource
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportListSource(ReportListSource aReportListSource,
        ReportListSourceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportListSource, aQueryBean);
    } // end updateReportListSource()

    /**
     * DOCUMENT ME!
     *
     * @param aReportListSource DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportListSource aReportListSource)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportListSources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportListSource(
        ReportListSource[] aReportListSources,
        ReportListSourceDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportListSource(aReportListSources, aQueryBean, null);
    } // end synchronizeReportListSource()

    /**
     * DOCUMENT ME!
     *
     * @param aReportListSources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportListSource(
        ReportListSource[] aReportListSources,
        ReportListSourceDAOQueryBean aQueryBean,
        ReportListSourceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportListSources) == false) {
            inputList.addAll(Arrays.asList(aReportListSources));
        } // end if

        ReportListSource[] existentReportListSources = this.queryReportListSource(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportListSources) == false) {
            existentList.addAll(Arrays.asList(existentReportListSources));
        } // end if

        List willAddReportListSources = ListUtils.subtract(inputList,
                existentList);

        List willDeleteReportListSources = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportListSources = ListUtils.intersection(existentList,
                inputList);

        ReportListSource[] willUpdateReportListSourceArray = (ReportListSource[]) willUpdateReportListSources.toArray(new ReportListSource[willUpdateReportListSources.size()]);
        ReportListSource[] willAddReportListSourceArray = (ReportListSource[]) willAddReportListSources.toArray(new ReportListSource[willAddReportListSources.size()]);
        ReportListSource[] willDeleteReportListSourceArray = (ReportListSource[]) willDeleteReportListSources.toArray(new ReportListSource[willDeleteReportListSources.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportListSourceArray,
                willUpdateReportListSourceArray, willDeleteReportListSourceArray);
        } // end if

        if (willUpdateReportListSources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportListSourceArray);
            } // end if

            this.batchUpdateReportListSource(willUpdateReportListSourceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportListSourceArray);
            } // end if
        } // end if

        if (willAddReportListSources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportListSourceArray);
            } // end if

            this.batchInsertReportListSource(willAddReportListSourceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportListSourceArray);
            } // end if
        } // end if

        if (willDeleteReportListSources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportListSourceArray);
            } // end if

            for (int i = 0; i < willDeleteReportListSourceArray.length; i++) {
                ReportListSource object = willDeleteReportListSourceArray[i];
                this.deleteReportListSource(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportListSourceArray);
            } // end if
        } // end if
    } // end synchronizeReportListSource()

    /**
     * Query IReportListSource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportListSource findReportListSourceById(final long aId)
        throws Exception {
        ReportListSourceDAOQueryBean queryBean = new ReportListSourceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportListSource[] ReportListSources = queryReportListSource(queryBean);

        if (ReportListSources.length == 0) {
            return null;
        } // end if
        else {
            return ReportListSources[0];
        } // end else
    } // end findReportListSourceById()

    /**
     * Query IReportListSource
     *
     * @param queryBean
     *
     * @return IReportListSource[]
     *
     * @throws Exception
     */
    public ReportListSource[] queryReportListSource(
        ReportListSourceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportListSourceRowMapper());

        return (ReportListSource[]) result.toArray(new ReportListSource[result.size()]);
    } // end queryReportListSource()

    /**
     * Query ReportListSource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportListSourceSelective(
        ReportListSourceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportListSourceSelective()

    /**
     * Query IReportListSource Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportListSourceCount(
        ReportListSourceDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryReportListSourceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportListSourceRowMapper
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
            ReportListSource object = new ReportListSource();

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

                Object IdAttr = resultSet.getObject(columnIndex++);

                object.setIdAttrNull(resultSet.getBoolean(columnIndex++));

                if (IdAttr != null) {
                    BeanUtils.setProperty(object, DataProperty.IdAttr, IdAttr);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
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

                Object SqlScript = resultSet.getObject(columnIndex++);

                object.setSqlScriptNull(resultSet.getBoolean(columnIndex++));

                if (SqlScript != null) {
                    BeanUtils.setProperty(object, DataProperty.SqlScript,
                        SqlScript);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object TextAttr = resultSet.getObject(columnIndex++);

                object.setTextAttrNull(resultSet.getBoolean(columnIndex++));

                if (TextAttr != null) {
                    BeanUtils.setProperty(object, DataProperty.TextAttr,
                        TextAttr);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportListSourceRowMapper
} // end BaseReportListSourceDAOJdbcImpl
