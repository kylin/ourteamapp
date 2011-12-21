/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao.impl;

import com.ourteam.report.dao.IReportProjectDAO;
import com.ourteam.report.dao.ReportProject;
import com.ourteam.report.dao.ReportProjectDAOQueryBean;

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
abstract public class BaseReportProjectDAOJdbcImpl extends AbstractJdbcDAO
    implements IReportProjectDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, Name, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.Name,
            DataProperty.Remarks, DataProperty.Status
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
     * Creates a new BaseReportProjectDAOJdbcImpl object.
     */
    public BaseReportProjectDAOJdbcImpl() {
        super();
    } // end BaseReportProjectDAOJdbcImpl()

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
     * Check Unique ReportProject
     *
     * @param aReportProject
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ReportProject aReportProject)
        throws Exception {
        if (aReportProject == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aReportProject,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IReportProject
     *
     * @param aReportProject
     *
     * @throws Exception
     */
    public void insertReportProject(ReportProject aReportProject)
        throws Exception {
        insert(aReportProject);
    } // end insertReportProject()

    /**
     * Batch Insert IReportProject
     *
     * @param aReportProject
     *
     * @throws Exception
     */
    public void batchInsertReportProject(ReportProject[] aReportProject)
        throws Exception {
        batchInsert(aReportProject);
    } // end batchInsertReportProject()

    /**
     * Delete IReportProject
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteReportProject(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteReportProject()

    /**
     * Delete IReportProject
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteReportProject(ReportProjectDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteReportProject()

    /**
     * Update IReportProject Selective
     *
     * @param aReportProject
     *
     * @throws Exception
     */
    public void updateReportProject(ReportProject aReportProject)
        throws Exception {
        if (aReportProject.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aReportProject);

        ReportProject tempObj = findReportProjectById(aReportProject.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aReportProject, tempObj);
        } // end if
    } // end updateReportProject()

    /**
     * Batch Update IReportProject
     *
     * @param aReportProject
     *
     * @throws Exception
     */
    public void batchUpdateReportProject(ReportProject[] aReportProject)
        throws Exception {
        batchUpdate(aReportProject);
    } // end batchUpdateReportProject()

    /**
     * Update IReportProject
     *
     * @param aReportProject
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateReportProject(ReportProject aReportProject,
        ReportProjectDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aReportProject, aQueryBean);
    } // end updateReportProject()

    /**
     * DOCUMENT ME!
     *
     * @param aReportProject DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ReportProject aReportProject)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aReportProjects DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportProject(ReportProject[] aReportProjects,
        ReportProjectDAOQueryBean aQueryBean) throws Exception {
        synchronizeReportProject(aReportProjects, aQueryBean, null);
    } // end synchronizeReportProject()

    /**
     * DOCUMENT ME!
     *
     * @param aReportProjects DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeReportProject(ReportProject[] aReportProjects,
        ReportProjectDAOQueryBean aQueryBean,
        ReportProjectSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aReportProjects) == false) {
            inputList.addAll(Arrays.asList(aReportProjects));
        } // end if

        ReportProject[] existentReportProjects = this.queryReportProject(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentReportProjects) == false) {
            existentList.addAll(Arrays.asList(existentReportProjects));
        } // end if

        List willAddReportProjects = ListUtils.subtract(inputList, existentList);

        List willDeleteReportProjects = ListUtils.subtract(existentList,
                inputList);

        List willUpdateReportProjects = ListUtils.intersection(existentList,
                inputList);

        ReportProject[] willUpdateReportProjectArray = (ReportProject[]) willUpdateReportProjects.toArray(new ReportProject[willUpdateReportProjects.size()]);
        ReportProject[] willAddReportProjectArray = (ReportProject[]) willAddReportProjects.toArray(new ReportProject[willAddReportProjects.size()]);
        ReportProject[] willDeleteReportProjectArray = (ReportProject[]) willDeleteReportProjects.toArray(new ReportProject[willDeleteReportProjects.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddReportProjectArray,
                willUpdateReportProjectArray, willDeleteReportProjectArray);
        } // end if

        if (willUpdateReportProjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateReportProjectArray);
            } // end if

            this.batchUpdateReportProject(willUpdateReportProjectArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateReportProjectArray);
            } // end if
        } // end if

        if (willAddReportProjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddReportProjectArray);
            } // end if

            this.batchInsertReportProject(willAddReportProjectArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddReportProjectArray);
            } // end if
        } // end if

        if (willDeleteReportProjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteReportProjectArray);
            } // end if

            for (int i = 0; i < willDeleteReportProjectArray.length; i++) {
                ReportProject object = willDeleteReportProjectArray[i];
                this.deleteReportProject(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteReportProjectArray);
            } // end if
        } // end if
    } // end synchronizeReportProject()

    /**
     * Query IReportProject
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ReportProject findReportProjectById(final long aId)
        throws Exception {
        ReportProjectDAOQueryBean queryBean = new ReportProjectDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ReportProject[] ReportProjects = queryReportProject(queryBean);

        if (ReportProjects.length == 0) {
            return null;
        } // end if
        else {
            return ReportProjects[0];
        } // end else
    } // end findReportProjectById()

    /**
     * Query IReportProject
     *
     * @param queryBean
     *
     * @return IReportProject[]
     *
     * @throws Exception
     */
    public ReportProject[] queryReportProject(
        ReportProjectDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcReportProjectRowMapper());

        return (ReportProject[]) result.toArray(new ReportProject[result.size()]);
    } // end queryReportProject()

    /**
     * Query ReportProject Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryReportProjectSelective(
        ReportProjectDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryReportProjectSelective()

    /**
     * Query IReportProject Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryReportProjectCount(ReportProjectDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryReportProjectCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcReportProjectRowMapper
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
            ReportProject object = new ReportProject();

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
    } // end JdbcReportProjectRowMapper
} // end BaseReportProjectDAOJdbcImpl
