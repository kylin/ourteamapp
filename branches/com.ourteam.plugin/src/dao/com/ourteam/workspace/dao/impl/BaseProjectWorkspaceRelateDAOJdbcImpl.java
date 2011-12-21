/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao.impl;

import com.ourteam.workspace.dao.IProjectWorkspaceRelateDAO;
import com.ourteam.workspace.dao.ProjectWorkspaceRelate;
import com.ourteam.workspace.dao.ProjectWorkspaceRelateDAOQueryBean;

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
abstract public class BaseProjectWorkspaceRelateDAOJdbcImpl
    extends AbstractJdbcDAO implements IProjectWorkspaceRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ProjectId, WorkspaceId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ProjectId, DataProperty.WorkspaceId
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
     * Creates a new BaseProjectWorkspaceRelateDAOJdbcImpl object.
     */
    public BaseProjectWorkspaceRelateDAOJdbcImpl() {
        super();
    } // end BaseProjectWorkspaceRelateDAOJdbcImpl()

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
     * Check Unique ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProjectWorkspaceRelate aProjectWorkspaceRelate)
        throws Exception {
        if (aProjectWorkspaceRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProjectWorkspaceRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     */
    public void insertProjectWorkspaceRelate(
        ProjectWorkspaceRelate aProjectWorkspaceRelate)
        throws Exception {
        insert(aProjectWorkspaceRelate);
    } // end insertProjectWorkspaceRelate()

    /**
     * Batch Insert IProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     */
    public void batchInsertProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelate)
        throws Exception {
        batchInsert(aProjectWorkspaceRelate);
    } // end batchInsertProjectWorkspaceRelate()

    /**
     * Delete IProjectWorkspaceRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProjectWorkspaceRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProjectWorkspaceRelate()

    /**
     * Delete IProjectWorkspaceRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProjectWorkspaceRelate(
        ProjectWorkspaceRelateDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProjectWorkspaceRelate()

    /**
     * Update IProjectWorkspaceRelate Selective
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     */
    public void updateProjectWorkspaceRelate(
        ProjectWorkspaceRelate aProjectWorkspaceRelate)
        throws Exception {
        if (aProjectWorkspaceRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProjectWorkspaceRelate);

        ProjectWorkspaceRelate tempObj = findProjectWorkspaceRelateById(aProjectWorkspaceRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProjectWorkspaceRelate, tempObj);
        } // end if
    } // end updateProjectWorkspaceRelate()

    /**
     * Batch Update IProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     */
    public void batchUpdateProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelate)
        throws Exception {
        batchUpdate(aProjectWorkspaceRelate);
    } // end batchUpdateProjectWorkspaceRelate()

    /**
     * Update IProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProjectWorkspaceRelate(
        ProjectWorkspaceRelate aProjectWorkspaceRelate,
        ProjectWorkspaceRelateDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aProjectWorkspaceRelate, aQueryBean);
    } // end updateProjectWorkspaceRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProjectWorkspaceRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        ProjectWorkspaceRelate aProjectWorkspaceRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProjectWorkspaceRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelates,
        ProjectWorkspaceRelateDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeProjectWorkspaceRelate(aProjectWorkspaceRelates, aQueryBean,
            null);
    } // end synchronizeProjectWorkspaceRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProjectWorkspaceRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelates,
        ProjectWorkspaceRelateDAOQueryBean aQueryBean,
        ProjectWorkspaceRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProjectWorkspaceRelates) == false) {
            inputList.addAll(Arrays.asList(aProjectWorkspaceRelates));
        } // end if

        ProjectWorkspaceRelate[] existentProjectWorkspaceRelates = this.queryProjectWorkspaceRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProjectWorkspaceRelates) == false) {
            existentList.addAll(Arrays.asList(existentProjectWorkspaceRelates));
        } // end if

        List willAddProjectWorkspaceRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteProjectWorkspaceRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProjectWorkspaceRelates = ListUtils.intersection(existentList,
                inputList);

        ProjectWorkspaceRelate[] willUpdateProjectWorkspaceRelateArray = (ProjectWorkspaceRelate[]) willUpdateProjectWorkspaceRelates.toArray(new ProjectWorkspaceRelate[willUpdateProjectWorkspaceRelates.size()]);
        ProjectWorkspaceRelate[] willAddProjectWorkspaceRelateArray = (ProjectWorkspaceRelate[]) willAddProjectWorkspaceRelates.toArray(new ProjectWorkspaceRelate[willAddProjectWorkspaceRelates.size()]);
        ProjectWorkspaceRelate[] willDeleteProjectWorkspaceRelateArray = (ProjectWorkspaceRelate[]) willDeleteProjectWorkspaceRelates.toArray(new ProjectWorkspaceRelate[willDeleteProjectWorkspaceRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProjectWorkspaceRelateArray,
                willUpdateProjectWorkspaceRelateArray,
                willDeleteProjectWorkspaceRelateArray);
        } // end if

        if (willUpdateProjectWorkspaceRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProjectWorkspaceRelateArray);
            } // end if

            this.batchUpdateProjectWorkspaceRelate(willUpdateProjectWorkspaceRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProjectWorkspaceRelateArray);
            } // end if
        } // end if

        if (willAddProjectWorkspaceRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProjectWorkspaceRelateArray);
            } // end if

            this.batchInsertProjectWorkspaceRelate(willAddProjectWorkspaceRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProjectWorkspaceRelateArray);
            } // end if
        } // end if

        if (willDeleteProjectWorkspaceRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProjectWorkspaceRelateArray);
            } // end if

            for (int i = 0; i < willDeleteProjectWorkspaceRelateArray.length;
                    i++) {
                ProjectWorkspaceRelate object = willDeleteProjectWorkspaceRelateArray[i];
                this.deleteProjectWorkspaceRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProjectWorkspaceRelateArray);
            } // end if
        } // end if
    } // end synchronizeProjectWorkspaceRelate()

    /**
     * Query IProjectWorkspaceRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProjectWorkspaceRelate findProjectWorkspaceRelateById(final long aId)
        throws Exception {
        ProjectWorkspaceRelateDAOQueryBean queryBean = new ProjectWorkspaceRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProjectWorkspaceRelate[] ProjectWorkspaceRelates = queryProjectWorkspaceRelate(queryBean);

        if (ProjectWorkspaceRelates.length == 0) {
            return null;
        } // end if
        else {
            return ProjectWorkspaceRelates[0];
        } // end else
    } // end findProjectWorkspaceRelateById()

    /**
     * Query IProjectWorkspaceRelate
     *
     * @param queryBean
     *
     * @return IProjectWorkspaceRelate[]
     *
     * @throws Exception
     */
    public ProjectWorkspaceRelate[] queryProjectWorkspaceRelate(
        ProjectWorkspaceRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcProjectWorkspaceRelateRowMapper());

        return (ProjectWorkspaceRelate[]) result.toArray(new ProjectWorkspaceRelate[result.size()]);
    } // end queryProjectWorkspaceRelate()

    /**
     * Query ProjectWorkspaceRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProjectWorkspaceRelateSelective(
        ProjectWorkspaceRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProjectWorkspaceRelateSelective()

    /**
     * Query IProjectWorkspaceRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProjectWorkspaceRelateCount(
        ProjectWorkspaceRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryProjectWorkspaceRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProjectWorkspaceRelateRowMapper
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
            ProjectWorkspaceRelate object = new ProjectWorkspaceRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ProjectId = resultSet.getObject(columnIndex++);

                object.setProjectIdNull(resultSet.getBoolean(columnIndex++));

                if (ProjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProjectId,
                        ProjectId);
                } // end if

                Object WorkspaceId = resultSet.getObject(columnIndex++);

                object.setWorkspaceIdNull(resultSet.getBoolean(columnIndex++));

                if (WorkspaceId != null) {
                    BeanUtils.setProperty(object, DataProperty.WorkspaceId,
                        WorkspaceId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProjectWorkspaceRelateRowMapper
} // end BaseProjectWorkspaceRelateDAOJdbcImpl
