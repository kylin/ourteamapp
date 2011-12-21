/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao.impl;

import com.ourteam.hr.dao.Employee;
import com.ourteam.hr.dao.EmployeeDAOQueryBean;
import com.ourteam.hr.dao.IEmployeeDAO;

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
 * DAO JDBC Impl Generate Date : 2011-10-31 11:56:27
 *
 * @author kylin
 */
abstract public class BaseEmployeeDAOJdbcImpl extends AbstractJdbcDAO
    implements IEmployeeDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, BirthDay, HomeAddress, MailAddress, Name, PhoneCall, Remarks,
            Sex, Status, UserId, Code
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.BirthDay, DataProperty.HomeAddress,
            DataProperty.MailAddress, DataProperty.Name, DataProperty.PhoneCall,
            DataProperty.Remarks, DataProperty.Sex, DataProperty.Status,
            DataProperty.UserId, DataProperty.Code
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
     * Creates a new BaseEmployeeDAOJdbcImpl object.
     */
    public BaseEmployeeDAOJdbcImpl() {
        super();
    } // end BaseEmployeeDAOJdbcImpl()

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
     * Check Unique Employee
     *
     * @param aEmployee
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(Employee aEmployee) throws Exception {
        if (aEmployee == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aEmployee, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IEmployee
     *
     * @param aEmployee
     *
     * @throws Exception
     */
    public void insertEmployee(Employee aEmployee) throws Exception {
        insert(aEmployee);
    } // end insertEmployee()

    /**
     * Batch Insert IEmployee
     *
     * @param aEmployee
     *
     * @throws Exception
     */
    public void batchInsertEmployee(Employee[] aEmployee)
        throws Exception {
        batchInsert(aEmployee);
    } // end batchInsertEmployee()

    /**
     * Delete IEmployee
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteEmployee(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteEmployee()

    /**
     * Delete IEmployee
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteEmployee(EmployeeDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteEmployee()

    /**
     * Update IEmployee Selective
     *
     * @param aEmployee
     *
     * @throws Exception
     */
    public void updateEmployee(Employee aEmployee) throws Exception {
        if (aEmployee.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aEmployee);

        Employee tempObj = findEmployeeById(aEmployee.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aEmployee, tempObj);
        } // end if
    } // end updateEmployee()

    /**
     * Batch Update IEmployee
     *
     * @param aEmployee
     *
     * @throws Exception
     */
    public void batchUpdateEmployee(Employee[] aEmployee)
        throws Exception {
        batchUpdate(aEmployee);
    } // end batchUpdateEmployee()

    /**
     * Update IEmployee
     *
     * @param aEmployee
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateEmployee(Employee aEmployee,
        EmployeeDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aEmployee, aQueryBean);
    } // end updateEmployee()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployee DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(Employee aEmployee) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployees DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeEmployee(Employee[] aEmployees,
        EmployeeDAOQueryBean aQueryBean) throws Exception {
        synchronizeEmployee(aEmployees, aQueryBean, null);
    } // end synchronizeEmployee()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployees DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeEmployee(Employee[] aEmployees,
        EmployeeDAOQueryBean aQueryBean, EmployeeSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aEmployees) == false) {
            inputList.addAll(Arrays.asList(aEmployees));
        } // end if

        Employee[] existentEmployees = this.queryEmployee(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentEmployees) == false) {
            existentList.addAll(Arrays.asList(existentEmployees));
        } // end if

        List willAddEmployees = ListUtils.subtract(inputList, existentList);

        List willDeleteEmployees = ListUtils.subtract(existentList, inputList);

        List willUpdateEmployees = ListUtils.intersection(existentList,
                inputList);

        Employee[] willUpdateEmployeeArray = (Employee[]) willUpdateEmployees.toArray(new Employee[willUpdateEmployees.size()]);
        Employee[] willAddEmployeeArray = (Employee[]) willAddEmployees.toArray(new Employee[willAddEmployees.size()]);
        Employee[] willDeleteEmployeeArray = (Employee[]) willDeleteEmployees.toArray(new Employee[willDeleteEmployees.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddEmployeeArray,
                willUpdateEmployeeArray, willDeleteEmployeeArray);
        } // end if

        if (willUpdateEmployees.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateEmployeeArray);
            } // end if

            this.batchUpdateEmployee(willUpdateEmployeeArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateEmployeeArray);
            } // end if
        } // end if

        if (willAddEmployees.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddEmployeeArray);
            } // end if

            this.batchInsertEmployee(willAddEmployeeArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddEmployeeArray);
            } // end if
        } // end if

        if (willDeleteEmployees.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteEmployeeArray);
            } // end if

            for (int i = 0; i < willDeleteEmployeeArray.length; i++) {
                Employee object = willDeleteEmployeeArray[i];
                this.deleteEmployee(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteEmployeeArray);
            } // end if
        } // end if
    } // end synchronizeEmployee()

    /**
     * Query IEmployee
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public Employee findEmployeeById(final long aId) throws Exception {
        EmployeeDAOQueryBean queryBean = new EmployeeDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        Employee[] Employees = queryEmployee(queryBean);

        if (Employees.length == 0) {
            return null;
        } // end if
        else {
            return Employees[0];
        } // end else
    } // end findEmployeeById()

    /**
     * Query IEmployee
     *
     * @param queryBean
     *
     * @return IEmployee[]
     *
     * @throws Exception
     */
    public Employee[] queryEmployee(EmployeeDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcEmployeeRowMapper());

        return (Employee[]) result.toArray(new Employee[result.size()]);
    } // end queryEmployee()

    /**
     * Query Employee Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryEmployeeSelective(EmployeeDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryEmployeeSelective()

    /**
     * Query IEmployee Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryEmployeeCount(EmployeeDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryEmployeeCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcEmployeeRowMapper implements ParameterizedRowMapper {
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
            Employee object = new Employee();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object BirthDay = resultSet.getObject(columnIndex++);

                object.setBirthDayNull(resultSet.getBoolean(columnIndex++));

                if (BirthDay != null) {
                    BeanUtils.setProperty(object, DataProperty.BirthDay,
                        BirthDay);
                } // end if

                Object HomeAddress = resultSet.getObject(columnIndex++);

                object.setHomeAddressNull(resultSet.getBoolean(columnIndex++));

                if (HomeAddress != null) {
                    BeanUtils.setProperty(object, DataProperty.HomeAddress,
                        HomeAddress);
                } // end if

                Object MailAddress = resultSet.getObject(columnIndex++);

                object.setMailAddressNull(resultSet.getBoolean(columnIndex++));

                if (MailAddress != null) {
                    BeanUtils.setProperty(object, DataProperty.MailAddress,
                        MailAddress);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object PhoneCall = resultSet.getObject(columnIndex++);

                object.setPhoneCallNull(resultSet.getBoolean(columnIndex++));

                if (PhoneCall != null) {
                    BeanUtils.setProperty(object, DataProperty.PhoneCall,
                        PhoneCall);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object Sex = resultSet.getObject(columnIndex++);

                object.setSexNull(resultSet.getBoolean(columnIndex++));

                if (Sex != null) {
                    BeanUtils.setProperty(object, DataProperty.Sex, Sex);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object UserId = resultSet.getObject(columnIndex++);

                object.setUserIdNull(resultSet.getBoolean(columnIndex++));

                if (UserId != null) {
                    BeanUtils.setProperty(object, DataProperty.UserId, UserId);
                } // end if

                Object Code = resultSet.getObject(columnIndex++);

                object.setCodeNull(resultSet.getBoolean(columnIndex++));

                if (Code != null) {
                    BeanUtils.setProperty(object, DataProperty.Code, Code);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcEmployeeRowMapper
} // end BaseEmployeeDAOJdbcImpl
