/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportCatalogDAO;
import com.ourteam.report.dao.ReportCatalog;
import com.ourteam.report.dao.ReportCatalogDAOQueryBean;

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
abstract public class BaseReportCatalogDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportCatalogDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CatalogTitle, ParentCatalogId, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CatalogTitle,
            DataProperty.ParentCatalogId, DataProperty.Remarks,
            DataProperty.Status
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
     * Creates a new BaseReportCatalogDAOJdbcImpl object.
     */
    public BaseReportCatalogDAOJdbcImpl() {
        super();
    } // end BaseReportCatalogDAOJdbcImpl()

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
     * Check Unique ReportCatalog
     *
     * @param aReportCatalog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportCatalog aReportCatalog)
        throws Exception {
        if (aReportCatalog == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportCatalog,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportCatalog
     *
     * @param aReportCatalog
     *
     * @throws Exception
     */
    public void insertReportCatalog(ReportCatalog aReportCatalog)
        throws Exception {
        insert(aReportCatalog);
    } // end insertReportCatalog()

    /**
     * Batch Insert IReportCatalog
     *
     * @param aReportCatalog
     *
     * @throws Exception
     */
    public void batchInsertReportCatalog(ReportCatalog[] aReportCatalog)
        throws Exception {
        batchInsert(aReportCatalog);
    } // end batchInsertReportCatalog()

    /**
     * Delete IReportCatalog
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportCatalog(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportCatalog()

    /**
     * Delete IReportCatalog
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportCatalog(ReportCatalogDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportCatalog()

    /**
     * Update IReportCatalog Selective
     *
     * @param aReportCatalog
     *
     * @throws Exception
     */
    public void updateReportCatalog(ReportCatalog aReportCatalog)
        throws Exception {
        if (aReportCatalog.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportCatalog);

        ReportCatalog tempObj = findReportCatalogById(aReportCatalog.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportCatalog, tempObj);
        } // end if
    } // end updateReportCatalog()

    /**
     * Batch Update IReportCatalog
     *
     * @param aReportCatalog
     *
     * @throws Exception
     */
    public void batchUpdateReportCatalog(ReportCatalog[] aReportCatalog)
        throws Exception {
        batchUpdate(aReportCatalog);
    } // end batchUpdateReportCatalog()

    /**
     * Update IReportCatalog
     *
     * @param aReportCatalog
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportCatalog(ReportCatalog aReportCatalog,
        ReportCatalogDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportCatalog, aQueryBean);
    } // end updateReportCatalog()

    /**
     * DOCUMENT ME!
     *
     * @param aReportCatalog DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportCatalog aReportCatalog)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportCatalogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportCatalog(ReportCatalog[] aReportCatalogs,
        ReportCatalogDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportCatalog(aReportCatalogs, aQueryBean, null);
    } // end synchronizeReportCatalog()

    /**
     * DOCUMENT ME!
     *
     * @param aReportCatalogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportCatalog(ReportCatalog[] aReportCatalogs,
        ReportCatalogDAOQueryBean aQueryBean,
        ReportCatalogSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportCatalogs) == false) {
            inputList.addAll(Arrays.asList(aReportCatalogs));
        } // end if

        ReportCatalog[] existentReportCatalogs = this.queryReportCatalog(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportCatalogs) == false) {
            existentList.addAll(Arrays.asList(existentReportCatalogs));
        } // end if

        List willAddReportCatalogs = ListUtils.subtract(inputList, existentList);

        List willDeleteReportCatalogs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportCatalogs = ListUtils.intersection(existentList,
                inputList);

        ReportCatalog[] willUpdateReportCatalogArray = (ReportCatalog[]) willUpdateReportCatalogs.toArray(new ReportCatalog[willUpdateReportCatalogs.size()]);
        ReportCatalog[] willAddReportCatalogArray = (ReportCatalog[]) willAddReportCatalogs.toArray(new ReportCatalog[willAddReportCatalogs.size()]);
        ReportCatalog[] willDeleteReportCatalogArray = (ReportCatalog[]) willDeleteReportCatalogs.toArray(new ReportCatalog[willDeleteReportCatalogs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportCatalogArray,
                willUpdateReportCatalogArray, willDeleteReportCatalogArray);
        } // end if

        if (willUpdateReportCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportCatalogArray);
            } // end if

            this.batchUpdateReportCatalog(willUpdateReportCatalogArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportCatalogArray);
            } // end if
        } // end if

        if (willAddReportCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportCatalogArray);
            } // end if

            this.batchInsertReportCatalog(willAddReportCatalogArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportCatalogArray);
            } // end if
        } // end if

        if (willDeleteReportCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportCatalogArray);
            } // end if

            for (int i = 0; i < willDeleteReportCatalogArray.length; i++) {
                ReportCatalog object = willDeleteReportCatalogArray[i];
                this.deleteReportCatalog(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportCatalogArray);
            } // end if
        } // end if
    } // end synchronizeReportCatalog()

    /**
     * Query IReportCatalog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportCatalog findReportCatalogById(final long aId)
        throws Exception {
        ReportCatalogDAOQueryBean queryBean = new ReportCatalogDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportCatalog[] ReportCatalogs = queryReportCatalog(queryBean);

        if (ReportCatalogs.length == 0) {
            return null;
        } // end if
        else {
            return ReportCatalogs[0];
        } // end else
    } // end findReportCatalogById()

    /**
     * Query IReportCatalog
     *
     * @param queryBean
     *
     * @return IReportCatalog[]
     *
     * @throws Exception
     */
    public ReportCatalog[] queryReportCatalog(
        ReportCatalogDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportCatalogRowMapper());

        return (ReportCatalog[]) result.toArray(new ReportCatalog[result.size()]);
    } // end queryReportCatalog()

    /**
     * Query ReportCatalog Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportCatalogSelective(
        ReportCatalogDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportCatalogSelective()

    /**
     * Query IReportCatalog Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportCatalogCount(ReportCatalogDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportCatalogCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportCatalogRowMapper
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
            ReportCatalog object = new ReportCatalog();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CatalogTitle = resultSet.getObject(columnIndex++);

                object.setCatalogTitleNull(resultSet.getBoolean(columnIndex++));

                if (CatalogTitle != null) {
                    BeanUtils.setProperty(object, DataProperty.CatalogTitle,
                        CatalogTitle);
                } // end if

                Object ParentCatalogId = resultSet.getObject(columnIndex++);

                object.setParentCatalogIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ParentCatalogId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentCatalogId,
                        ParentCatalogId);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcReportCatalogRowMapper
} // end BaseReportCatalogDAOJdbcImpl
