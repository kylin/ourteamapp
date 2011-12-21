/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportViewUnionDAO;
import com.ourteam.report.dao.ReportViewUnion;
import com.ourteam.report.dao.ReportViewUnionDAOQueryBean;

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
abstract public class BaseReportViewUnionDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportViewUnionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, ReportViewId, Status, UnionViewId, UnionedViewCode,
            UnionedViewName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.ReportViewId,
            DataProperty.Status, DataProperty.UnionViewId,
            DataProperty.UnionedViewCode, DataProperty.UnionedViewName
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
     * Creates a new BaseReportViewUnionDAOJdbcImpl object.
     */
    public BaseReportViewUnionDAOJdbcImpl() {
        super();
    } // end BaseReportViewUnionDAOJdbcImpl()

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
                " LEFT JOIN REPORT_VIEW_DEFINE unionViewDefineA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " unionViewDefineA.ID = REPORT_VIEW_UNION.UNION_VIEW_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportViewUnion aReportViewUnion)
        throws Exception {
        if (aReportViewUnion == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportViewUnion,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     */
    public void insertReportViewUnion(ReportViewUnion aReportViewUnion)
        throws Exception {
        insert(aReportViewUnion);
    } // end insertReportViewUnion()

    /**
     * Batch Insert IReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     */
    public void batchInsertReportViewUnion(ReportViewUnion[] aReportViewUnion)
        throws Exception {
        batchInsert(aReportViewUnion);
    } // end batchInsertReportViewUnion()

    /**
     * Delete IReportViewUnion
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportViewUnion(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportViewUnion()

    /**
     * Delete IReportViewUnion
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportViewUnion(ReportViewUnionDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportViewUnion()

    /**
     * Update IReportViewUnion Selective
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     */
    public void updateReportViewUnion(ReportViewUnion aReportViewUnion)
        throws Exception {
        if (aReportViewUnion.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportViewUnion);

        ReportViewUnion tempObj = findReportViewUnionById(aReportViewUnion.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportViewUnion, tempObj);
        } // end if
    } // end updateReportViewUnion()

    /**
     * Batch Update IReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     */
    public void batchUpdateReportViewUnion(ReportViewUnion[] aReportViewUnion)
        throws Exception {
        batchUpdate(aReportViewUnion);
    } // end batchUpdateReportViewUnion()

    /**
     * Update IReportViewUnion
     *
     * @param aReportViewUnion
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportViewUnion(ReportViewUnion aReportViewUnion,
        ReportViewUnionDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportViewUnion, aQueryBean);
    } // end updateReportViewUnion()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewUnion DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportViewUnion aReportViewUnion)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewUnions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewUnion(
        ReportViewUnion[] aReportViewUnions,
        ReportViewUnionDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportViewUnion(aReportViewUnions, aQueryBean, null);
    } // end synchronizeReportViewUnion()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewUnions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportViewUnion(
        ReportViewUnion[] aReportViewUnions,
        ReportViewUnionDAOQueryBean aQueryBean,
        ReportViewUnionSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportViewUnions) == false) {
            inputList.addAll(Arrays.asList(aReportViewUnions));
        } // end if

        ReportViewUnion[] existentReportViewUnions = this.queryReportViewUnion(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportViewUnions) == false) {
            existentList.addAll(Arrays.asList(existentReportViewUnions));
        } // end if

        List willAddReportViewUnions = ListUtils.subtract(inputList,
                existentList);

        List willDeleteReportViewUnions = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportViewUnions = ListUtils.intersection(existentList,
                inputList);

        ReportViewUnion[] willUpdateReportViewUnionArray = (ReportViewUnion[]) willUpdateReportViewUnions.toArray(new ReportViewUnion[willUpdateReportViewUnions.size()]);
        ReportViewUnion[] willAddReportViewUnionArray = (ReportViewUnion[]) willAddReportViewUnions.toArray(new ReportViewUnion[willAddReportViewUnions.size()]);
        ReportViewUnion[] willDeleteReportViewUnionArray = (ReportViewUnion[]) willDeleteReportViewUnions.toArray(new ReportViewUnion[willDeleteReportViewUnions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportViewUnionArray,
                willUpdateReportViewUnionArray, willDeleteReportViewUnionArray);
        } // end if

        if (willUpdateReportViewUnions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportViewUnionArray);
            } // end if

            this.batchUpdateReportViewUnion(willUpdateReportViewUnionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportViewUnionArray);
            } // end if
        } // end if

        if (willAddReportViewUnions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportViewUnionArray);
            } // end if

            this.batchInsertReportViewUnion(willAddReportViewUnionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportViewUnionArray);
            } // end if
        } // end if

        if (willDeleteReportViewUnions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportViewUnionArray);
            } // end if

            for (int i = 0; i < willDeleteReportViewUnionArray.length; i++) {
                ReportViewUnion object = willDeleteReportViewUnionArray[i];
                this.deleteReportViewUnion(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportViewUnionArray);
            } // end if
        } // end if
    } // end synchronizeReportViewUnion()

    /**
     * Query IReportViewUnion
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportViewUnion findReportViewUnionById(final long aId)
        throws Exception {
        ReportViewUnionDAOQueryBean queryBean = new ReportViewUnionDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportViewUnion[] ReportViewUnions = queryReportViewUnion(queryBean);

        if (ReportViewUnions.length == 0) {
            return null;
        } // end if
        else {
            return ReportViewUnions[0];
        } // end else
    } // end findReportViewUnionById()

    /**
     * Query IReportViewUnion
     *
     * @param queryBean
     *
     * @return IReportViewUnion[]
     *
     * @throws Exception
     */
    public ReportViewUnion[] queryReportViewUnion(
        ReportViewUnionDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportViewUnionRowMapper());

        return (ReportViewUnion[]) result.toArray(new ReportViewUnion[result.size()]);
    } // end queryReportViewUnion()

    /**
     * Query ReportViewUnion Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportViewUnionSelective(
        ReportViewUnionDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportViewUnionSelective()

    /**
     * Query IReportViewUnion Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportViewUnionCount(ReportViewUnionDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportViewUnionCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportViewUnionRowMapper
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
            ReportViewUnion object = new ReportViewUnion();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object UnionViewId = resultSet.getObject(columnIndex++);

                object.setUnionViewIdNull(resultSet.getBoolean(columnIndex++));

                if (UnionViewId != null) {
                    BeanUtils.setProperty(object, DataProperty.UnionViewId,
                        UnionViewId);
                } // end if

                Object UnionedViewCode = resultSet.getObject(columnIndex++);

                object.setUnionedViewCodeNull(resultSet.getBoolean(
                        columnIndex++));

                if (UnionedViewCode != null) {
                    BeanUtils.setProperty(object, DataProperty.UnionedViewCode,
                        UnionedViewCode);
                } // end if

                Object UnionedViewName = resultSet.getObject(columnIndex++);

                object.setUnionedViewNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (UnionedViewName != null) {
                    BeanUtils.setProperty(object, DataProperty.UnionedViewName,
                        UnionedViewName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportViewUnionRowMapper
} // end BaseReportViewUnionDAOJdbcImpl
