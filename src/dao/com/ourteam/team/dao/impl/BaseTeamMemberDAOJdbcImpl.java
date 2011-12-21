/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao.impl;

import com.ourteam.team.dao.ITeamMemberDAO;
import com.ourteam.team.dao.TeamMember;
import com.ourteam.team.dao.TeamMemberDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-11-02 14:33:53
 *
 * @author kylin
 */
abstract public class BaseTeamMemberDAOJdbcImpl extends AbstractJdbcDAO
    implements ITeamMemberDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, Status, EmployeeId, TeamId, TeamRoleId, TeamRoleCode,
            TeamRoleName, TeamCode, TeamName, EmployeeName, EmployeeCode
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.Status,
            DataProperty.EmployeeId, DataProperty.TeamId,
            DataProperty.TeamRoleId, DataProperty.TeamRoleCode,
            DataProperty.TeamRoleName, DataProperty.TeamCode,
            DataProperty.TeamName, DataProperty.EmployeeName,
            DataProperty.EmployeeCode
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
     * Creates a new BaseTeamMemberDAOJdbcImpl object.
     */
    public BaseTeamMemberDAOJdbcImpl() {
        super();
    } // end BaseTeamMemberDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN TEAM_ROLE teamRoleA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " teamRoleA.ID = TEAM_MEMBER.TEAM_ROLE_ID ");

            relatedJoinSQLBuffer.append(" AND ");
            relatedJoinSQLBuffer.append(
                " teamRoleA.TEAM_ID = TEAM_MEMBER.TEAM_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN TEAM_DEFINE teamA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(" teamA.ID = TEAM_MEMBER.TEAM_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE employeeA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " employeeA.ID = TEAM_MEMBER.EMPLOYEE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique TeamMember
     *
     * @param aTeamMember
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(TeamMember aTeamMember)
        throws Exception {
        if (aTeamMember == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aTeamMember, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ITeamMember
     *
     * @param aTeamMember
     *
     * @throws Exception
     */
    public void insertTeamMember(TeamMember aTeamMember)
        throws Exception {
        insert(aTeamMember);
    } // end insertTeamMember()

    /**
     * Batch Insert ITeamMember
     *
     * @param aTeamMember
     *
     * @throws Exception
     */
    public void batchInsertTeamMember(TeamMember[] aTeamMember)
        throws Exception {
        batchInsert(aTeamMember);
    } // end batchInsertTeamMember()

    /**
     * Delete ITeamMember
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteTeamMember(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteTeamMember()

    /**
     * Delete ITeamMember
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteTeamMember(TeamMemberDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteTeamMember()

    /**
     * Update ITeamMember Selective
     *
     * @param aTeamMember
     *
     * @throws Exception
     */
    public void updateTeamMember(TeamMember aTeamMember)
        throws Exception {
        if (aTeamMember.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aTeamMember);

        TeamMember tempObj = findTeamMemberById(aTeamMember.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aTeamMember, tempObj);
        } // end if
    } // end updateTeamMember()

    /**
     * Batch Update ITeamMember
     *
     * @param aTeamMember
     *
     * @throws Exception
     */
    public void batchUpdateTeamMember(TeamMember[] aTeamMember)
        throws Exception {
        batchUpdate(aTeamMember);
    } // end batchUpdateTeamMember()

    /**
     * Update ITeamMember
     *
     * @param aTeamMember
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateTeamMember(TeamMember aTeamMember,
        TeamMemberDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aTeamMember, aQueryBean);
    } // end updateTeamMember()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamMember DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(TeamMember aTeamMember)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamMembers DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamMember(TeamMember[] aTeamMembers,
        TeamMemberDAOQueryBean aQueryBean) throws Exception {
        synchronizeTeamMember(aTeamMembers, aQueryBean, null);
    } // end synchronizeTeamMember()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamMembers DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamMember(TeamMember[] aTeamMembers,
        TeamMemberDAOQueryBean aQueryBean,
        TeamMemberSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aTeamMembers) == false) {
            inputList.addAll(Arrays.asList(aTeamMembers));
        } // end if

        TeamMember[] existentTeamMembers = this.queryTeamMember(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentTeamMembers) == false) {
            existentList.addAll(Arrays.asList(existentTeamMembers));
        } // end if

        List willAddTeamMembers = ListUtils.subtract(inputList, existentList);

        List willDeleteTeamMembers = ListUtils.subtract(existentList, inputList);

        List willUpdateTeamMembers = ListUtils.intersection(existentList,
                inputList);

        TeamMember[] willUpdateTeamMemberArray = (TeamMember[]) willUpdateTeamMembers.toArray(new TeamMember[willUpdateTeamMembers.size()]);
        TeamMember[] willAddTeamMemberArray = (TeamMember[]) willAddTeamMembers.toArray(new TeamMember[willAddTeamMembers.size()]);
        TeamMember[] willDeleteTeamMemberArray = (TeamMember[]) willDeleteTeamMembers.toArray(new TeamMember[willDeleteTeamMembers.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddTeamMemberArray,
                willUpdateTeamMemberArray, willDeleteTeamMemberArray);
        } // end if

        if (willUpdateTeamMembers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateTeamMemberArray);
            } // end if

            this.batchUpdateTeamMember(willUpdateTeamMemberArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateTeamMemberArray);
            } // end if
        } // end if

        if (willAddTeamMembers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddTeamMemberArray);
            } // end if

            this.batchInsertTeamMember(willAddTeamMemberArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddTeamMemberArray);
            } // end if
        } // end if

        if (willDeleteTeamMembers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteTeamMemberArray);
            } // end if

            for (int i = 0; i < willDeleteTeamMemberArray.length; i++) {
                TeamMember object = willDeleteTeamMemberArray[i];
                this.deleteTeamMember(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteTeamMemberArray);
            } // end if
        } // end if
    } // end synchronizeTeamMember()

    /**
     * Query ITeamMember
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public TeamMember findTeamMemberById(final long aId)
        throws Exception {
        TeamMemberDAOQueryBean queryBean = new TeamMemberDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        TeamMember[] TeamMembers = queryTeamMember(queryBean);

        if (TeamMembers.length == 0) {
            return null;
        } // end if
        else {
            return TeamMembers[0];
        } // end else
    } // end findTeamMemberById()

    /**
     * Query ITeamMember
     *
     * @param queryBean
     *
     * @return ITeamMember[]
     *
     * @throws Exception
     */
    public TeamMember[] queryTeamMember(TeamMemberDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcTeamMemberRowMapper());

        return (TeamMember[]) result.toArray(new TeamMember[result.size()]);
    } // end queryTeamMember()

    /**
     * Query TeamMember Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryTeamMemberSelective(TeamMemberDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryTeamMemberSelective()

    /**
     * Query ITeamMember Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryTeamMemberCount(TeamMemberDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryTeamMemberCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.hr.dao.impl.BaseEmployeeDAOJdbcImpl employee;

    /**
     * DOCUMENT ME!
     *
     * @param employee DOCUMENT ME!
     */
    public void setEmployee(
        com.ourteam.hr.dao.impl.BaseEmployeeDAOJdbcImpl employee) {
        this.employee = employee;
    } // end setEmployee()

    /**
     * Query Related IEmployee
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IEmployee" containment="true"
     */
    public com.ourteam.hr.dao.Employee[] queryEmployees(
        TeamMemberDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN TEAM_MEMBER ON ( ");

        joinSQL.append(" HR_EMPLOYEE.ID = TEAM_MEMBER.EMPLOYEE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.hr.dao.IEmployeeDAO.EntityName;

        String[] entityFields = com.ourteam.hr.dao.impl.BaseEmployeeDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.hr.dao.impl.BaseEmployeeDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = employee.query(entityName, entityFields, entityProperties,
                aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.hr.dao.impl.BaseEmployeeDAOJdbcImpl.JdbcEmployeeRowMapper());

        return (com.ourteam.hr.dao.Employee[]) list.toArray(new com.ourteam.hr.dao.Employee[list.size()]);
    } // end queryEmployees()

    /**
     * Query TeamMember Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryEmployeesSelective(TeamMemberDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.BirthDay,
                "birthDay");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.HomeAddress,
                "homeAddress");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.MailAddress,
                "mailAddress");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.Name,
                "name");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.PhoneCall,
                "phoneCall");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.Sex,
                "sex");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.UserId,
                "userId");

            aQueryBean.addSelectProperty(com.ourteam.hr.dao.IEmployeeDAO.Code,
                "code");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN TEAM_MEMBER ON ( ");

        joinSQL.append(" HR_EMPLOYEE.ID = TEAM_MEMBER.EMPLOYEE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.hr.dao.IEmployeeDAO.EntityName;

        return employee.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryEmployeesSelective()

    /**
     * Update Related IEmployee
     *
     * @param aEmployee {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateEmployee(com.ourteam.hr.dao.Employee aEmployee,
        TeamMemberDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN TEAM_MEMBER ON ( ");

        joinSQL.append(" HR_EMPLOYEE.ID = TEAM_MEMBER.EMPLOYEE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.hr.dao.IEmployeeDAO.EntityName;

        String[] entityFields = com.ourteam.hr.dao.impl.BaseEmployeeDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.hr.dao.impl.BaseEmployeeDAOJdbcImpl.ENTITY_PROPERTIES;

        employee.updateByQuery(entityName, entityFields, entityProperties,
            joinSQL.toString(), aEmployee, aQueryBean);
    } // end updateEmployee()

    /**
     * Delete Related IEmployee
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteEmployee(TeamMemberDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN TEAM_MEMBER ON ( ");

        joinSQL.append(" HR_EMPLOYEE.ID = TEAM_MEMBER.EMPLOYEE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.hr.dao.IEmployeeDAO.EntityName;

        employee.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteEmployee()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcTeamMemberRowMapper
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
            TeamMember object = new TeamMember();

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

                Object EmployeeId = resultSet.getObject(columnIndex++);

                object.setEmployeeIdNull(resultSet.getBoolean(columnIndex++));

                if (EmployeeId != null) {
                    BeanUtils.setProperty(object, DataProperty.EmployeeId,
                        EmployeeId);
                } // end if

                Object TeamId = resultSet.getObject(columnIndex++);

                object.setTeamIdNull(resultSet.getBoolean(columnIndex++));

                if (TeamId != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamId, TeamId);
                } // end if

                Object TeamRoleId = resultSet.getObject(columnIndex++);

                object.setTeamRoleIdNull(resultSet.getBoolean(columnIndex++));

                if (TeamRoleId != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamRoleId,
                        TeamRoleId);
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

                Object TeamCode = resultSet.getObject(columnIndex++);

                object.setTeamCodeNull(resultSet.getBoolean(columnIndex++));

                if (TeamCode != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamCode,
                        TeamCode);
                } // end if

                Object TeamName = resultSet.getObject(columnIndex++);

                object.setTeamNameNull(resultSet.getBoolean(columnIndex++));

                if (TeamName != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamName,
                        TeamName);
                } // end if

                Object EmployeeName = resultSet.getObject(columnIndex++);

                object.setEmployeeNameNull(resultSet.getBoolean(columnIndex++));

                if (EmployeeName != null) {
                    BeanUtils.setProperty(object, DataProperty.EmployeeName,
                        EmployeeName);
                } // end if

                Object EmployeeCode = resultSet.getObject(columnIndex++);

                object.setEmployeeCodeNull(resultSet.getBoolean(columnIndex++));

                if (EmployeeCode != null) {
                    BeanUtils.setProperty(object, DataProperty.EmployeeCode,
                        EmployeeCode);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcTeamMemberRowMapper
} // end BaseTeamMemberDAOJdbcImpl
