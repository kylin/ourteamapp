/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao.impl;

import com.ourteam.team.dao.ITeamRoleDAO;
import com.ourteam.team.dao.TeamRole;
import com.ourteam.team.dao.TeamRoleDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-08 14:33:00
 *
 * @author kylin
 */
abstract public class BaseTeamRoleDAOJdbcImpl extends AbstractJdbcDAO
    implements ITeamRoleDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, Status, TeamRoleCode, TeamRoleName, TeamId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.Status,
            DataProperty.TeamRoleCode, DataProperty.TeamRoleName,
            DataProperty.TeamId
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
     * Creates a new BaseTeamRoleDAOJdbcImpl object.
     */
    public BaseTeamRoleDAOJdbcImpl() {
        super();
    } // end BaseTeamRoleDAOJdbcImpl()

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
     * Check Unique TeamRole
     *
     * @param aTeamRole
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(TeamRole aTeamRole) throws Exception {
        if (aTeamRole == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aTeamRole, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ITeamRole
     *
     * @param aTeamRole
     *
     * @throws Exception
     */
    public void insertTeamRole(TeamRole aTeamRole) throws Exception {
        insert(aTeamRole);
    } // end insertTeamRole()

    /**
     * Batch Insert ITeamRole
     *
     * @param aTeamRole
     *
     * @throws Exception
     */
    public void batchInsertTeamRole(TeamRole[] aTeamRole)
        throws Exception {
        batchInsert(aTeamRole);
    } // end batchInsertTeamRole()

    /**
     * Delete ITeamRole
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteTeamRole(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteTeamRole()

    /**
     * Delete ITeamRole
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteTeamRole(TeamRoleDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteTeamRole()

    /**
     * Update ITeamRole Selective
     *
     * @param aTeamRole
     *
     * @throws Exception
     */
    public void updateTeamRole(TeamRole aTeamRole) throws Exception {
        if (aTeamRole.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aTeamRole);

        TeamRole tempObj = findTeamRoleById(aTeamRole.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aTeamRole, tempObj);
        } // end if
    } // end updateTeamRole()

    /**
     * Batch Update ITeamRole
     *
     * @param aTeamRole
     *
     * @throws Exception
     */
    public void batchUpdateTeamRole(TeamRole[] aTeamRole)
        throws Exception {
        batchUpdate(aTeamRole);
    } // end batchUpdateTeamRole()

    /**
     * Update ITeamRole
     *
     * @param aTeamRole
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateTeamRole(TeamRole aTeamRole,
        TeamRoleDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aTeamRole, aQueryBean);
    } // end updateTeamRole()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamRole DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(TeamRole aTeamRole) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamRoles DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamRole(TeamRole[] aTeamRoles,
        TeamRoleDAOQueryBean aQueryBean) throws Exception {
        synchronizeTeamRole(aTeamRoles, aQueryBean, null);
    } // end synchronizeTeamRole()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamRoles DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamRole(TeamRole[] aTeamRoles,
        TeamRoleDAOQueryBean aQueryBean, TeamRoleSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aTeamRoles) == false) {
            inputList.addAll(Arrays.asList(aTeamRoles));
        } // end if

        TeamRole[] existentTeamRoles = this.queryTeamRole(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentTeamRoles) == false) {
            existentList.addAll(Arrays.asList(existentTeamRoles));
        } // end if

        List willAddTeamRoles = ListUtils.subtract(inputList, existentList);

        List willDeleteTeamRoles = ListUtils.subtract(existentList, inputList);

        List willUpdateTeamRoles = ListUtils.intersection(existentList,
                inputList);

        TeamRole[] willUpdateTeamRoleArray = (TeamRole[]) willUpdateTeamRoles.toArray(new TeamRole[willUpdateTeamRoles.size()]);
        TeamRole[] willAddTeamRoleArray = (TeamRole[]) willAddTeamRoles.toArray(new TeamRole[willAddTeamRoles.size()]);
        TeamRole[] willDeleteTeamRoleArray = (TeamRole[]) willDeleteTeamRoles.toArray(new TeamRole[willDeleteTeamRoles.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddTeamRoleArray,
                willUpdateTeamRoleArray, willDeleteTeamRoleArray);
        } // end if

        if (willUpdateTeamRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateTeamRoleArray);
            } // end if

            this.batchUpdateTeamRole(willUpdateTeamRoleArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateTeamRoleArray);
            } // end if
        } // end if

        if (willAddTeamRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddTeamRoleArray);
            } // end if

            this.batchInsertTeamRole(willAddTeamRoleArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddTeamRoleArray);
            } // end if
        } // end if

        if (willDeleteTeamRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteTeamRoleArray);
            } // end if

            for (int i = 0; i < willDeleteTeamRoleArray.length; i++) {
                TeamRole object = willDeleteTeamRoleArray[i];
                this.deleteTeamRole(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteTeamRoleArray);
            } // end if
        } // end if
    } // end synchronizeTeamRole()

    /**
     * Query ITeamRole
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public TeamRole findTeamRoleById(final long aId) throws Exception {
        TeamRoleDAOQueryBean queryBean = new TeamRoleDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        TeamRole[] TeamRoles = queryTeamRole(queryBean);

        if (TeamRoles.length == 0) {
            return null;
        } // end if
        else {
            return TeamRoles[0];
        } // end else
    } // end findTeamRoleById()

    /**
     * Query ITeamRole
     *
     * @param queryBean
     *
     * @return ITeamRole[]
     *
     * @throws Exception
     */
    public TeamRole[] queryTeamRole(TeamRoleDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcTeamRoleRowMapper());

        return (TeamRole[]) result.toArray(new TeamRole[result.size()]);
    } // end queryTeamRole()

    /**
     * Query TeamRole Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryTeamRoleSelective(TeamRoleDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryTeamRoleSelective()

    /**
     * Query ITeamRole Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryTeamRoleCount(TeamRoleDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryTeamRoleCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcTeamRoleRowMapper implements ParameterizedRowMapper {
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
            TeamRole object = new TeamRole();

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

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object TeamRoleCode = resultSet.getObject(columnIndex++);

                object.setTeamRoleCodeNull(resultSet.getBoolean(columnIndex++));

                if (TeamRoleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamRoleCode,
                        TeamRoleCode);
                } // end if

                Object TeamRoleName = resultSet.getObject(columnIndex++);

                object.setTeamRoleNameNull(resultSet.getBoolean(columnIndex++));

                if (TeamRoleName != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamRoleName,
                        TeamRoleName);
                } // end if

                Object TeamId = resultSet.getObject(columnIndex++);

                object.setTeamIdNull(resultSet.getBoolean(columnIndex++));

                if (TeamId != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamId, TeamId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcTeamRoleRowMapper
} // end BaseTeamRoleDAOJdbcImpl
