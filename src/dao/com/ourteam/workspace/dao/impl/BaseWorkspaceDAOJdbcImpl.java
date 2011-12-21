/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao.impl;

import com.ourteam.workspace.dao.IWorkspaceDAO;
import com.ourteam.workspace.dao.Workspace;
import com.ourteam.workspace.dao.WorkspaceDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-06-10 22:46:12
 *
 * @author Kylin
 */
abstract public class BaseWorkspaceDAOJdbcImpl extends AbstractJdbcDAO
    implements IWorkspaceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CreateDate, Name, Status, WorkspacePath, WorkspaceType,
            Description
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CreateDate, DataProperty.Name,
            DataProperty.Status, DataProperty.WorkspacePath,
            DataProperty.WorkspaceType, DataProperty.Description
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
     * Creates a new BaseWorkspaceDAOJdbcImpl object.
     */
    public BaseWorkspaceDAOJdbcImpl() {
        super();
    } // end BaseWorkspaceDAOJdbcImpl()

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
     * Check Unique Workspace
     *
     * @param aWorkspace
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(Workspace aWorkspace)
        throws Exception {
        if (aWorkspace == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aWorkspace, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IWorkspace
     *
     * @param aWorkspace
     *
     * @throws Exception
     */
    public void insertWorkspace(Workspace aWorkspace) throws Exception {
        insert(aWorkspace);
    } // end insertWorkspace()

    /**
     * Batch Insert IWorkspace
     *
     * @param aWorkspace
     *
     * @throws Exception
     */
    public void batchInsertWorkspace(Workspace[] aWorkspace)
        throws Exception {
        batchInsert(aWorkspace);
    } // end batchInsertWorkspace()

    /**
     * Delete IWorkspace
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteWorkspace(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteWorkspace()

    /**
     * Delete IWorkspace
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteWorkspace(WorkspaceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteWorkspace()

    /**
     * Update IWorkspace Selective
     *
     * @param aWorkspace
     *
     * @throws Exception
     */
    public void updateWorkspace(Workspace aWorkspace) throws Exception {
        if (aWorkspace.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aWorkspace);

        Workspace tempObj = findWorkspaceById(aWorkspace.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aWorkspace, tempObj);
        } // end if
    } // end updateWorkspace()

    /**
     * Batch Update IWorkspace
     *
     * @param aWorkspace
     *
     * @throws Exception
     */
    public void batchUpdateWorkspace(Workspace[] aWorkspace)
        throws Exception {
        batchUpdate(aWorkspace);
    } // end batchUpdateWorkspace()

    /**
     * Update IWorkspace
     *
     * @param aWorkspace
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateWorkspace(Workspace aWorkspace,
        WorkspaceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aWorkspace, aQueryBean);
    } // end updateWorkspace()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspace DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(Workspace aWorkspace)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaces DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspace(Workspace[] aWorkspaces,
        WorkspaceDAOQueryBean aQueryBean) throws Exception {
        synchronizeWorkspace(aWorkspaces, aQueryBean, null);
    } // end synchronizeWorkspace()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaces DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspace(Workspace[] aWorkspaces,
        WorkspaceDAOQueryBean aQueryBean, WorkspaceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aWorkspaces) == false) {
            inputList.addAll(Arrays.asList(aWorkspaces));
        } // end if

        Workspace[] existentWorkspaces = this.queryWorkspace(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentWorkspaces) == false) {
            existentList.addAll(Arrays.asList(existentWorkspaces));
        } // end if

        List willAddWorkspaces = ListUtils.subtract(inputList, existentList);

        List willDeleteWorkspaces = ListUtils.subtract(existentList, inputList);

        List willUpdateWorkspaces = ListUtils.intersection(existentList,
                inputList);

        Workspace[] willUpdateWorkspaceArray = (Workspace[]) willUpdateWorkspaces.toArray(new Workspace[willUpdateWorkspaces.size()]);
        Workspace[] willAddWorkspaceArray = (Workspace[]) willAddWorkspaces.toArray(new Workspace[willAddWorkspaces.size()]);
        Workspace[] willDeleteWorkspaceArray = (Workspace[]) willDeleteWorkspaces.toArray(new Workspace[willDeleteWorkspaces.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddWorkspaceArray,
                willUpdateWorkspaceArray, willDeleteWorkspaceArray);
        } // end if

        if (willUpdateWorkspaces.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateWorkspaceArray);
            } // end if

            this.batchUpdateWorkspace(willUpdateWorkspaceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateWorkspaceArray);
            } // end if
        } // end if

        if (willAddWorkspaces.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddWorkspaceArray);
            } // end if

            this.batchInsertWorkspace(willAddWorkspaceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddWorkspaceArray);
            } // end if
        } // end if

        if (willDeleteWorkspaces.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteWorkspaceArray);
            } // end if

            for (int i = 0; i < willDeleteWorkspaceArray.length; i++) {
                Workspace object = willDeleteWorkspaceArray[i];
                this.deleteWorkspace(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteWorkspaceArray);
            } // end if
        } // end if
    } // end synchronizeWorkspace()

    /**
     * Query IWorkspace
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public Workspace findWorkspaceById(final long aId)
        throws Exception {
        WorkspaceDAOQueryBean queryBean = new WorkspaceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        Workspace[] Workspaces = queryWorkspace(queryBean);

        if (Workspaces.length == 0) {
            return null;
        } // end if
        else {
            return Workspaces[0];
        } // end else
    } // end findWorkspaceById()

    /**
     * Query IWorkspace
     *
     * @param queryBean
     *
     * @return IWorkspace[]
     *
     * @throws Exception
     */
    public Workspace[] queryWorkspace(WorkspaceDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcWorkspaceRowMapper());

        return (Workspace[]) result.toArray(new Workspace[result.size()]);
    } // end queryWorkspace()

    /**
     * Query Workspace Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryWorkspaceSelective(WorkspaceDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryWorkspaceSelective()

    /**
     * Query IWorkspace Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryWorkspaceCount(WorkspaceDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryWorkspaceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcWorkspaceRowMapper implements ParameterizedRowMapper {
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
            Workspace object = new Workspace();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CreateDate = resultSet.getObject(columnIndex++);

                object.setCreateDateNull(resultSet.getBoolean(columnIndex++));

                if (CreateDate != null) {
                    BeanUtils.setProperty(object, DataProperty.CreateDate,
                        CreateDate);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object WorkspacePath = resultSet.getObject(columnIndex++);

                object.setWorkspacePathNull(resultSet.getBoolean(columnIndex++));

                if (WorkspacePath != null) {
                    BeanUtils.setProperty(object, DataProperty.WorkspacePath,
                        WorkspacePath);
                } // end if

                Object WorkspaceType = resultSet.getObject(columnIndex++);

                object.setWorkspaceTypeNull(resultSet.getBoolean(columnIndex++));

                if (WorkspaceType != null) {
                    BeanUtils.setProperty(object, DataProperty.WorkspaceType,
                        WorkspaceType);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcWorkspaceRowMapper
} // end BaseWorkspaceDAOJdbcImpl
