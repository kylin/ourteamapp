/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao.impl;

import com.ourteam.workspace.dao.IProjectServerRelateDAO;
import com.ourteam.workspace.dao.ProjectServerRelate;
import com.ourteam.workspace.dao.ProjectServerRelateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-06-10 22:46:11
 *
 * @author Kylin
 */
abstract public class BaseProjectServerRelateDAOJdbcImpl extends AbstractJdbcDAO
    implements IProjectServerRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, MiddleWareId, ProjectId, Status, ServerType
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.MiddleWareId, DataProperty.ProjectId,
            DataProperty.Status, DataProperty.ServerType
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
     * Creates a new BaseProjectServerRelateDAOJdbcImpl object.
     */
    public BaseProjectServerRelateDAOJdbcImpl() {
        super();
    } // end BaseProjectServerRelateDAOJdbcImpl()

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
     * Check Unique ProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProjectServerRelate aProjectServerRelate)
        throws Exception {
        if (aProjectServerRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProjectServerRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     */
    public void insertProjectServerRelate(
        ProjectServerRelate aProjectServerRelate) throws Exception {
        insert(aProjectServerRelate);
    } // end insertProjectServerRelate()

    /**
     * Batch Insert IProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     */
    public void batchInsertProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelate) throws Exception {
        batchInsert(aProjectServerRelate);
    } // end batchInsertProjectServerRelate()

    /**
     * Delete IProjectServerRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProjectServerRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProjectServerRelate()

    /**
     * Delete IProjectServerRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProjectServerRelate(
        ProjectServerRelateDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProjectServerRelate()

    /**
     * Update IProjectServerRelate Selective
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     */
    public void updateProjectServerRelate(
        ProjectServerRelate aProjectServerRelate) throws Exception {
        if (aProjectServerRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProjectServerRelate);

        ProjectServerRelate tempObj = findProjectServerRelateById(aProjectServerRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProjectServerRelate, tempObj);
        } // end if
    } // end updateProjectServerRelate()

    /**
     * Batch Update IProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     */
    public void batchUpdateProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelate) throws Exception {
        batchUpdate(aProjectServerRelate);
    } // end batchUpdateProjectServerRelate()

    /**
     * Update IProjectServerRelate
     *
     * @param aProjectServerRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProjectServerRelate(
        ProjectServerRelate aProjectServerRelate,
        ProjectServerRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aProjectServerRelate, aQueryBean);
    } // end updateProjectServerRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProjectServerRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ProjectServerRelate aProjectServerRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProjectServerRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelates,
        ProjectServerRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeProjectServerRelate(aProjectServerRelates, aQueryBean, null);
    } // end synchronizeProjectServerRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProjectServerRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelates,
        ProjectServerRelateDAOQueryBean aQueryBean,
        ProjectServerRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProjectServerRelates) == false) {
            inputList.addAll(Arrays.asList(aProjectServerRelates));
        } // end if

        ProjectServerRelate[] existentProjectServerRelates = this.queryProjectServerRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProjectServerRelates) == false) {
            existentList.addAll(Arrays.asList(existentProjectServerRelates));
        } // end if

        List willAddProjectServerRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteProjectServerRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProjectServerRelates = ListUtils.intersection(existentList,
                inputList);

        ProjectServerRelate[] willUpdateProjectServerRelateArray = (ProjectServerRelate[]) willUpdateProjectServerRelates.toArray(new ProjectServerRelate[willUpdateProjectServerRelates.size()]);
        ProjectServerRelate[] willAddProjectServerRelateArray = (ProjectServerRelate[]) willAddProjectServerRelates.toArray(new ProjectServerRelate[willAddProjectServerRelates.size()]);
        ProjectServerRelate[] willDeleteProjectServerRelateArray = (ProjectServerRelate[]) willDeleteProjectServerRelates.toArray(new ProjectServerRelate[willDeleteProjectServerRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProjectServerRelateArray,
                willUpdateProjectServerRelateArray,
                willDeleteProjectServerRelateArray);
        } // end if

        if (willUpdateProjectServerRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProjectServerRelateArray);
            } // end if

            this.batchUpdateProjectServerRelate(willUpdateProjectServerRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProjectServerRelateArray);
            } // end if
        } // end if

        if (willAddProjectServerRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProjectServerRelateArray);
            } // end if

            this.batchInsertProjectServerRelate(willAddProjectServerRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProjectServerRelateArray);
            } // end if
        } // end if

        if (willDeleteProjectServerRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProjectServerRelateArray);
            } // end if

            for (int i = 0; i < willDeleteProjectServerRelateArray.length;
                    i++) {
                ProjectServerRelate object = willDeleteProjectServerRelateArray[i];
                this.deleteProjectServerRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProjectServerRelateArray);
            } // end if
        } // end if
    } // end synchronizeProjectServerRelate()

    /**
     * Query IProjectServerRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProjectServerRelate findProjectServerRelateById(final long aId)
        throws Exception {
        ProjectServerRelateDAOQueryBean queryBean = new ProjectServerRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProjectServerRelate[] ProjectServerRelates = queryProjectServerRelate(queryBean);

        if (ProjectServerRelates.length == 0) {
            return null;
        } // end if
        else {
            return ProjectServerRelates[0];
        } // end else
    } // end findProjectServerRelateById()

    /**
     * Query IProjectServerRelate
     *
     * @param queryBean
     *
     * @return IProjectServerRelate[]
     *
     * @throws Exception
     */
    public ProjectServerRelate[] queryProjectServerRelate(
        ProjectServerRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcProjectServerRelateRowMapper());

        return (ProjectServerRelate[]) result.toArray(new ProjectServerRelate[result.size()]);
    } // end queryProjectServerRelate()

    /**
     * Query ProjectServerRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProjectServerRelateSelective(
        ProjectServerRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProjectServerRelateSelective()

    /**
     * Query IProjectServerRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProjectServerRelateCount(
        ProjectServerRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryProjectServerRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProjectServerRelateRowMapper
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
            ProjectServerRelate object = new ProjectServerRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object MiddleWareId = resultSet.getObject(columnIndex++);

                object.setMiddleWareIdNull(resultSet.getBoolean(columnIndex++));

                if (MiddleWareId != null) {
                    BeanUtils.setProperty(object, DataProperty.MiddleWareId,
                        MiddleWareId);
                } // end if

                Object ProjectId = resultSet.getObject(columnIndex++);

                object.setProjectIdNull(resultSet.getBoolean(columnIndex++));

                if (ProjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProjectId,
                        ProjectId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object ServerType = resultSet.getObject(columnIndex++);

                object.setServerTypeNull(resultSet.getBoolean(columnIndex++));

                if (ServerType != null) {
                    BeanUtils.setProperty(object, DataProperty.ServerType,
                        ServerType);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProjectServerRelateRowMapper
} // end BaseProjectServerRelateDAOJdbcImpl
