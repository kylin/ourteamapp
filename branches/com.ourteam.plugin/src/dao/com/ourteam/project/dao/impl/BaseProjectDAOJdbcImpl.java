/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.project.dao.impl;

import com.ourteam.project.dao.IProjectDAO;
import com.ourteam.project.dao.Project;
import com.ourteam.project.dao.ProjectDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-06-10 22:46:24
 *
 * @author Kylin
 */
abstract public class BaseProjectDAOJdbcImpl extends AbstractJdbcDAO
    implements IProjectDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Description, Name, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Description, DataProperty.Name,
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
     * Creates a new BaseProjectDAOJdbcImpl object.
     */
    public BaseProjectDAOJdbcImpl() {
        super();
    } // end BaseProjectDAOJdbcImpl()

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
     * Check Unique Project
     *
     * @param aProject
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(Project aProject) throws Exception {
        if (aProject == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProject, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProject
     *
     * @param aProject
     *
     * @throws Exception
     */
    public void insertProject(Project aProject) throws Exception {
        insert(aProject);
    } // end insertProject()

    /**
     * Batch Insert IProject
     *
     * @param aProject
     *
     * @throws Exception
     */
    public void batchInsertProject(Project[] aProject)
        throws Exception {
        batchInsert(aProject);
    } // end batchInsertProject()

    /**
     * Delete IProject
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProject(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProject()

    /**
     * Delete IProject
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProject(ProjectDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProject()

    /**
     * Update IProject Selective
     *
     * @param aProject
     *
     * @throws Exception
     */
    public void updateProject(Project aProject) throws Exception {
        if (aProject.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProject);

        Project tempObj = findProjectById(aProject.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProject, tempObj);
        } // end if
    } // end updateProject()

    /**
     * Batch Update IProject
     *
     * @param aProject
     *
     * @throws Exception
     */
    public void batchUpdateProject(Project[] aProject)
        throws Exception {
        batchUpdate(aProject);
    } // end batchUpdateProject()

    /**
     * Update IProject
     *
     * @param aProject
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProject(Project aProject, ProjectDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aProject, aQueryBean);
    } // end updateProject()

    /**
     * DOCUMENT ME!
     *
     * @param aProject DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(Project aProject) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProjects DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProject(Project[] aProjects,
        ProjectDAOQueryBean aQueryBean) throws Exception {
        synchronizeProject(aProjects, aQueryBean, null);
    } // end synchronizeProject()

    /**
     * DOCUMENT ME!
     *
     * @param aProjects DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProject(Project[] aProjects,
        ProjectDAOQueryBean aQueryBean, ProjectSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProjects) == false) {
            inputList.addAll(Arrays.asList(aProjects));
        } // end if

        Project[] existentProjects = this.queryProject(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProjects) == false) {
            existentList.addAll(Arrays.asList(existentProjects));
        } // end if

        List willAddProjects = ListUtils.subtract(inputList, existentList);

        List willDeleteProjects = ListUtils.subtract(existentList, inputList);

        List willUpdateProjects = ListUtils.intersection(existentList, inputList);

        Project[] willUpdateProjectArray = (Project[]) willUpdateProjects.toArray(new Project[willUpdateProjects.size()]);
        Project[] willAddProjectArray = (Project[]) willAddProjects.toArray(new Project[willAddProjects.size()]);
        Project[] willDeleteProjectArray = (Project[]) willDeleteProjects.toArray(new Project[willDeleteProjects.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProjectArray,
                willUpdateProjectArray, willDeleteProjectArray);
        } // end if

        if (willUpdateProjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProjectArray);
            } // end if

            this.batchUpdateProject(willUpdateProjectArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProjectArray);
            } // end if
        } // end if

        if (willAddProjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProjectArray);
            } // end if

            this.batchInsertProject(willAddProjectArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProjectArray);
            } // end if
        } // end if

        if (willDeleteProjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProjectArray);
            } // end if

            for (int i = 0; i < willDeleteProjectArray.length; i++) {
                Project object = willDeleteProjectArray[i];
                this.deleteProject(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProjectArray);
            } // end if
        } // end if
    } // end synchronizeProject()

    /**
     * Query IProject
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public Project findProjectById(final long aId) throws Exception {
        ProjectDAOQueryBean queryBean = new ProjectDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        Project[] Projects = queryProject(queryBean);

        if (Projects.length == 0) {
            return null;
        } // end if
        else {
            return Projects[0];
        } // end else
    } // end findProjectById()

    /**
     * Query IProject
     *
     * @param queryBean
     *
     * @return IProject[]
     *
     * @throws Exception
     */
    public Project[] queryProject(ProjectDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcProjectRowMapper());

        return (Project[]) result.toArray(new Project[result.size()]);
    } // end queryProject()

    /**
     * Query Project Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProjectSelective(ProjectDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProjectSelective()

    /**
     * Query IProject Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProjectCount(ProjectDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProjectCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProjectRowMapper implements ParameterizedRowMapper {
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
            Project object = new Project();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProjectRowMapper
} // end BaseProjectDAOJdbcImpl
