/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmEmployeeRoleRelate;
import com.ourteam.bpm.dao.BpmEmployeeRoleRelateDAOQueryBean;
import com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-16 10:32:37
 *
 * @author kylin
 */
abstract public class BaseBpmEmployeeRoleRelateDAOJdbcImpl
    extends AbstractJdbcDAO implements IBpmEmployeeRoleRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, BpmRoleId, BusinessInstanceId, BusinessType, Remarks, Status,
            SysModuleId, EmployeeId, EmployeeName, BpmRoleName, BpmRoleKey,
            SysModuleCode, SysModuleName, EmployeeCode, ProjectId, ProductId,
            TeamId, DepartmentId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.BpmRoleId,
            DataProperty.BusinessInstanceId, DataProperty.BusinessType,
            DataProperty.Remarks, DataProperty.Status, DataProperty.SysModuleId,
            DataProperty.EmployeeId, DataProperty.EmployeeName,
            DataProperty.BpmRoleName, DataProperty.BpmRoleKey,
            DataProperty.SysModuleCode, DataProperty.SysModuleName,
            DataProperty.EmployeeCode, DataProperty.ProjectId,
            DataProperty.ProductId, DataProperty.TeamId,
            DataProperty.DepartmentId
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
     * Creates a new BaseBpmEmployeeRoleRelateDAOJdbcImpl object.
     */
    public BaseBpmEmployeeRoleRelateDAOJdbcImpl() {
        super();
    } // end BaseBpmEmployeeRoleRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN BPM_ROLE bpmRoleC ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " bpmRoleC.ID = BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_MODULE sysModuleC ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysModuleC.ID = BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE employeeC ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " employeeC.ID = BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmEmployeeRoleRelate aBpmEmployeeRoleRelate)
        throws Exception {
        if (aBpmEmployeeRoleRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmEmployeeRoleRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     */
    public void insertBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate aBpmEmployeeRoleRelate) throws Exception {
        insert(aBpmEmployeeRoleRelate);
    } // end insertBpmEmployeeRoleRelate()

    /**
     * Batch Insert IBpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     */
    public void batchInsertBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelate)
        throws Exception {
        batchInsert(aBpmEmployeeRoleRelate);
    } // end batchInsertBpmEmployeeRoleRelate()

    /**
     * Delete IBpmEmployeeRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmEmployeeRoleRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmEmployeeRoleRelate()

    /**
     * Delete IBpmEmployeeRoleRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelateDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmEmployeeRoleRelate()

    /**
     * Update IBpmEmployeeRoleRelate Selective
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     */
    public void updateBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate aBpmEmployeeRoleRelate) throws Exception {
        if (aBpmEmployeeRoleRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmEmployeeRoleRelate);

        BpmEmployeeRoleRelate tempObj = findBpmEmployeeRoleRelateById(aBpmEmployeeRoleRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmEmployeeRoleRelate, tempObj);
        } // end if
    } // end updateBpmEmployeeRoleRelate()

    /**
     * Batch Update IBpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     */
    public void batchUpdateBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelate)
        throws Exception {
        batchUpdate(aBpmEmployeeRoleRelate);
    } // end batchUpdateBpmEmployeeRoleRelate()

    /**
     * Update IBpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate aBpmEmployeeRoleRelate,
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmEmployeeRoleRelate, aQueryBean);
    } // end updateBpmEmployeeRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmEmployeeRoleRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmEmployeeRoleRelate aBpmEmployeeRoleRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmEmployeeRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates,
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmEmployeeRoleRelate(aBpmEmployeeRoleRelates, aQueryBean,
            null);
    } // end synchronizeBpmEmployeeRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmEmployeeRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates,
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean,
        BpmEmployeeRoleRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmEmployeeRoleRelates) == false) {
            inputList.addAll(Arrays.asList(aBpmEmployeeRoleRelates));
        } // end if

        BpmEmployeeRoleRelate[] existentBpmEmployeeRoleRelates = this.queryBpmEmployeeRoleRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmEmployeeRoleRelates) == false) {
            existentList.addAll(Arrays.asList(existentBpmEmployeeRoleRelates));
        } // end if

        List willAddBpmEmployeeRoleRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmEmployeeRoleRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmEmployeeRoleRelates = ListUtils.intersection(existentList,
                inputList);

        BpmEmployeeRoleRelate[] willUpdateBpmEmployeeRoleRelateArray = (BpmEmployeeRoleRelate[]) willUpdateBpmEmployeeRoleRelates.toArray(new BpmEmployeeRoleRelate[willUpdateBpmEmployeeRoleRelates.size()]);
        BpmEmployeeRoleRelate[] willAddBpmEmployeeRoleRelateArray = (BpmEmployeeRoleRelate[]) willAddBpmEmployeeRoleRelates.toArray(new BpmEmployeeRoleRelate[willAddBpmEmployeeRoleRelates.size()]);
        BpmEmployeeRoleRelate[] willDeleteBpmEmployeeRoleRelateArray = (BpmEmployeeRoleRelate[]) willDeleteBpmEmployeeRoleRelates.toArray(new BpmEmployeeRoleRelate[willDeleteBpmEmployeeRoleRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmEmployeeRoleRelateArray,
                willUpdateBpmEmployeeRoleRelateArray,
                willDeleteBpmEmployeeRoleRelateArray);
        } // end if

        if (willUpdateBpmEmployeeRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmEmployeeRoleRelateArray);
            } // end if

            this.batchUpdateBpmEmployeeRoleRelate(willUpdateBpmEmployeeRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmEmployeeRoleRelateArray);
            } // end if
        } // end if

        if (willAddBpmEmployeeRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmEmployeeRoleRelateArray);
            } // end if

            this.batchInsertBpmEmployeeRoleRelate(willAddBpmEmployeeRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmEmployeeRoleRelateArray);
            } // end if
        } // end if

        if (willDeleteBpmEmployeeRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmEmployeeRoleRelateArray);
            } // end if

            for (int i = 0; i < willDeleteBpmEmployeeRoleRelateArray.length;
                    i++) {
                BpmEmployeeRoleRelate object = willDeleteBpmEmployeeRoleRelateArray[i];
                this.deleteBpmEmployeeRoleRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmEmployeeRoleRelateArray);
            } // end if
        } // end if
    } // end synchronizeBpmEmployeeRoleRelate()

    /**
     * Query IBpmEmployeeRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmEmployeeRoleRelate findBpmEmployeeRoleRelateById(final long aId)
        throws Exception {
        BpmEmployeeRoleRelateDAOQueryBean queryBean = new BpmEmployeeRoleRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmEmployeeRoleRelate[] BpmEmployeeRoleRelates = queryBpmEmployeeRoleRelate(queryBean);

        if (BpmEmployeeRoleRelates.length == 0) {
            return null;
        } // end if
        else {
            return BpmEmployeeRoleRelates[0];
        } // end else
    } // end findBpmEmployeeRoleRelateById()

    /**
     * Query IBpmEmployeeRoleRelate
     *
     * @param queryBean
     *
     * @return IBpmEmployeeRoleRelate[]
     *
     * @throws Exception
     */
    public BpmEmployeeRoleRelate[] queryBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmEmployeeRoleRelateRowMapper());

        return (BpmEmployeeRoleRelate[]) result.toArray(new BpmEmployeeRoleRelate[result.size()]);
    } // end queryBpmEmployeeRoleRelate()

    /**
     * Query BpmEmployeeRoleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmEmployeeRoleRelateSelective(
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmEmployeeRoleRelateSelective()

    /**
     * Query IBpmEmployeeRoleRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmEmployeeRoleRelateCount(
        BpmEmployeeRoleRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmEmployeeRoleRelateCount()

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
        BpmEmployeeRoleRelateDAOQueryBean aDaoQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BPM_EMPLOYEE_ROLE_RELATE ON ( ");

        joinSQL.append(
            " HR_EMPLOYEE.ID = BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID ");

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
     * Query BpmEmployeeRoleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryEmployeesSelective(
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception {
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

        joinSQL.append(" LEFT JOIN BPM_EMPLOYEE_ROLE_RELATE ON ( ");

        joinSQL.append(
            " HR_EMPLOYEE.ID = BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID ");

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
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BPM_EMPLOYEE_ROLE_RELATE ON ( ");

        joinSQL.append(
            " HR_EMPLOYEE.ID = BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID ");

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
    public void deleteEmployee(BpmEmployeeRoleRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BPM_EMPLOYEE_ROLE_RELATE ON ( ");

        joinSQL.append(
            " HR_EMPLOYEE.ID = BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID ");

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
    public static class JdbcBpmEmployeeRoleRelateRowMapper
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
            BpmEmployeeRoleRelate object = new BpmEmployeeRoleRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object BpmRoleId = resultSet.getObject(columnIndex++);

                object.setBpmRoleIdNull(resultSet.getBoolean(columnIndex++));

                if (BpmRoleId != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmRoleId,
                        BpmRoleId);
                } // end if

                Object BusinessInstanceId = resultSet.getObject(columnIndex++);

                object.setBusinessInstanceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessInstanceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessInstanceId, BusinessInstanceId);
                } // end if

                Object BusinessType = resultSet.getObject(columnIndex++);

                object.setBusinessTypeNull(resultSet.getBoolean(columnIndex++));

                if (BusinessType != null) {
                    BeanUtils.setProperty(object, DataProperty.BusinessType,
                        BusinessType);
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

                Object SysModuleId = resultSet.getObject(columnIndex++);

                object.setSysModuleIdNull(resultSet.getBoolean(columnIndex++));

                if (SysModuleId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysModuleId,
                        SysModuleId);
                } // end if

                Object EmployeeId = resultSet.getObject(columnIndex++);

                object.setEmployeeIdNull(resultSet.getBoolean(columnIndex++));

                if (EmployeeId != null) {
                    BeanUtils.setProperty(object, DataProperty.EmployeeId,
                        EmployeeId);
                } // end if

                Object EmployeeName = resultSet.getObject(columnIndex++);

                object.setEmployeeNameNull(resultSet.getBoolean(columnIndex++));

                if (EmployeeName != null) {
                    BeanUtils.setProperty(object, DataProperty.EmployeeName,
                        EmployeeName);
                } // end if

                Object BpmRoleName = resultSet.getObject(columnIndex++);

                object.setBpmRoleNameNull(resultSet.getBoolean(columnIndex++));

                if (BpmRoleName != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmRoleName,
                        BpmRoleName);
                } // end if

                Object BpmRoleKey = resultSet.getObject(columnIndex++);

                object.setBpmRoleKeyNull(resultSet.getBoolean(columnIndex++));

                if (BpmRoleKey != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmRoleKey,
                        BpmRoleKey);
                } // end if

                Object SysModuleCode = resultSet.getObject(columnIndex++);

                object.setSysModuleCodeNull(resultSet.getBoolean(columnIndex++));

                if (SysModuleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.SysModuleCode,
                        SysModuleCode);
                } // end if

                Object SysModuleName = resultSet.getObject(columnIndex++);

                object.setSysModuleNameNull(resultSet.getBoolean(columnIndex++));

                if (SysModuleName != null) {
                    BeanUtils.setProperty(object, DataProperty.SysModuleName,
                        SysModuleName);
                } // end if

                Object EmployeeCode = resultSet.getObject(columnIndex++);

                object.setEmployeeCodeNull(resultSet.getBoolean(columnIndex++));

                if (EmployeeCode != null) {
                    BeanUtils.setProperty(object, DataProperty.EmployeeCode,
                        EmployeeCode);
                } // end if

                Object ProjectId = resultSet.getObject(columnIndex++);

                object.setProjectIdNull(resultSet.getBoolean(columnIndex++));

                if (ProjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProjectId,
                        ProjectId);
                } // end if

                Object ProductId = resultSet.getObject(columnIndex++);

                object.setProductIdNull(resultSet.getBoolean(columnIndex++));

                if (ProductId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProductId,
                        ProductId);
                } // end if

                Object TeamId = resultSet.getObject(columnIndex++);

                object.setTeamIdNull(resultSet.getBoolean(columnIndex++));

                if (TeamId != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamId, TeamId);
                } // end if

                Object DepartmentId = resultSet.getObject(columnIndex++);

                object.setDepartmentIdNull(resultSet.getBoolean(columnIndex++));

                if (DepartmentId != null) {
                    BeanUtils.setProperty(object, DataProperty.DepartmentId,
                        DepartmentId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmEmployeeRoleRelateRowMapper
} // end BaseBpmEmployeeRoleRelateDAOJdbcImpl
