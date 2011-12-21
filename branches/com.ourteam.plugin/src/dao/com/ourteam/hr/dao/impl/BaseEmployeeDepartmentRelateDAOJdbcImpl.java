/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao.impl;

import com.ourteam.hr.dao.EmployeeDepartmentRelate;
import com.ourteam.hr.dao.EmployeeDepartmentRelateDAOQueryBean;
import com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-29 20:18:59
 *
 * @author Kylin
 */
abstract public class BaseEmployeeDepartmentRelateDAOJdbcImpl
    extends AbstractJdbcDAO implements IEmployeeDepartmentRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DepartmentRole, Status, DepartmentId, EmployeeId, EmployeeName,
            DepartmentName, ParentDepartmentId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DepartmentRole, DataProperty.Status,
            DataProperty.DepartmentId, DataProperty.EmployeeId,
            DataProperty.EmployeeName, DataProperty.DepartmentName,
            DataProperty.ParentDepartmentId
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
     * Creates a new BaseEmployeeDepartmentRelateDAOJdbcImpl object.
     */
    public BaseEmployeeDepartmentRelateDAOJdbcImpl() {
        super();
    } // end BaseEmployeeDepartmentRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(
                " LEFT JOIN HR_DEPARTMENT sysDepartmentA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysDepartmentA.ID = HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE employeeA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " employeeA.ID = HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate)
        throws Exception {
        if (aEmployeeDepartmentRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aEmployeeDepartmentRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IEmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     */
    public void insertEmployeeDepartmentRelate(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate)
        throws Exception {
        insert(aEmployeeDepartmentRelate);
    } // end insertEmployeeDepartmentRelate()

    /**
     * Batch Insert IEmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     */
    public void batchInsertEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelate)
        throws Exception {
        batchInsert(aEmployeeDepartmentRelate);
    } // end batchInsertEmployeeDepartmentRelate()

    /**
     * Delete IEmployeeDepartmentRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteEmployeeDepartmentRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteEmployeeDepartmentRelate()

    /**
     * Delete IEmployeeDepartmentRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteEmployeeDepartmentRelate(
        EmployeeDepartmentRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteEmployeeDepartmentRelate()

    /**
     * Update IEmployeeDepartmentRelate Selective
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     */
    public void updateEmployeeDepartmentRelate(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate)
        throws Exception {
        if (aEmployeeDepartmentRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aEmployeeDepartmentRelate);

        EmployeeDepartmentRelate tempObj = findEmployeeDepartmentRelateById(aEmployeeDepartmentRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aEmployeeDepartmentRelate, tempObj);
        } // end if
    } // end updateEmployeeDepartmentRelate()

    /**
     * Batch Update IEmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     */
    public void batchUpdateEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelate)
        throws Exception {
        batchUpdate(aEmployeeDepartmentRelate);
    } // end batchUpdateEmployeeDepartmentRelate()

    /**
     * Update IEmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateEmployeeDepartmentRelate(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate,
        EmployeeDepartmentRelateDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aEmployeeDepartmentRelate, aQueryBean);
    } // end updateEmployeeDepartmentRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployeeDepartmentRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployeeDepartmentRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelates,
        EmployeeDepartmentRelateDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeEmployeeDepartmentRelate(aEmployeeDepartmentRelates,
            aQueryBean, null);
    } // end synchronizeEmployeeDepartmentRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployeeDepartmentRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelates,
        EmployeeDepartmentRelateDAOQueryBean aQueryBean,
        EmployeeDepartmentRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aEmployeeDepartmentRelates) == false) {
            inputList.addAll(Arrays.asList(aEmployeeDepartmentRelates));
        } // end if

        EmployeeDepartmentRelate[] existentEmployeeDepartmentRelates = this.queryEmployeeDepartmentRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentEmployeeDepartmentRelates) == false) {
            existentList.addAll(Arrays.asList(existentEmployeeDepartmentRelates));
        } // end if

        List willAddEmployeeDepartmentRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteEmployeeDepartmentRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateEmployeeDepartmentRelates = ListUtils.intersection(existentList,
                inputList);

        EmployeeDepartmentRelate[] willUpdateEmployeeDepartmentRelateArray = (EmployeeDepartmentRelate[]) willUpdateEmployeeDepartmentRelates.toArray(new EmployeeDepartmentRelate[willUpdateEmployeeDepartmentRelates.size()]);
        EmployeeDepartmentRelate[] willAddEmployeeDepartmentRelateArray = (EmployeeDepartmentRelate[]) willAddEmployeeDepartmentRelates.toArray(new EmployeeDepartmentRelate[willAddEmployeeDepartmentRelates.size()]);
        EmployeeDepartmentRelate[] willDeleteEmployeeDepartmentRelateArray = (EmployeeDepartmentRelate[]) willDeleteEmployeeDepartmentRelates.toArray(new EmployeeDepartmentRelate[willDeleteEmployeeDepartmentRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddEmployeeDepartmentRelateArray,
                willUpdateEmployeeDepartmentRelateArray,
                willDeleteEmployeeDepartmentRelateArray);
        } // end if

        if (willUpdateEmployeeDepartmentRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateEmployeeDepartmentRelateArray);
            } // end if

            this.batchUpdateEmployeeDepartmentRelate(willUpdateEmployeeDepartmentRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateEmployeeDepartmentRelateArray);
            } // end if
        } // end if

        if (willAddEmployeeDepartmentRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddEmployeeDepartmentRelateArray);
            } // end if

            this.batchInsertEmployeeDepartmentRelate(willAddEmployeeDepartmentRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddEmployeeDepartmentRelateArray);
            } // end if
        } // end if

        if (willDeleteEmployeeDepartmentRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteEmployeeDepartmentRelateArray);
            } // end if

            for (int i = 0; i < willDeleteEmployeeDepartmentRelateArray.length;
                    i++) {
                EmployeeDepartmentRelate object = willDeleteEmployeeDepartmentRelateArray[i];
                this.deleteEmployeeDepartmentRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteEmployeeDepartmentRelateArray);
            } // end if
        } // end if
    } // end synchronizeEmployeeDepartmentRelate()

    /**
     * Query IEmployeeDepartmentRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public EmployeeDepartmentRelate findEmployeeDepartmentRelateById(
        final long aId) throws Exception {
        EmployeeDepartmentRelateDAOQueryBean queryBean = new EmployeeDepartmentRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        EmployeeDepartmentRelate[] EmployeeDepartmentRelates = queryEmployeeDepartmentRelate(queryBean);

        if (EmployeeDepartmentRelates.length == 0) {
            return null;
        } // end if
        else {
            return EmployeeDepartmentRelates[0];
        } // end else
    } // end findEmployeeDepartmentRelateById()

    /**
     * Query IEmployeeDepartmentRelate
     *
     * @param queryBean
     *
     * @return IEmployeeDepartmentRelate[]
     *
     * @throws Exception
     */
    public EmployeeDepartmentRelate[] queryEmployeeDepartmentRelate(
        EmployeeDepartmentRelateDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcEmployeeDepartmentRelateRowMapper());

        return (EmployeeDepartmentRelate[]) result.toArray(new EmployeeDepartmentRelate[result.size()]);
    } // end queryEmployeeDepartmentRelate()

    /**
     * Query EmployeeDepartmentRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryEmployeeDepartmentRelateSelective(
        EmployeeDepartmentRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryEmployeeDepartmentRelateSelective()

    /**
     * Query IEmployeeDepartmentRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryEmployeeDepartmentRelateCount(
        EmployeeDepartmentRelateDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryEmployeeDepartmentRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcEmployeeDepartmentRelateRowMapper
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
            EmployeeDepartmentRelate object = new EmployeeDepartmentRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DepartmentRole = resultSet.getObject(columnIndex++);

                object.setDepartmentRoleNull(resultSet.getBoolean(columnIndex++));

                if (DepartmentRole != null) {
                    BeanUtils.setProperty(object, DataProperty.DepartmentRole,
                        DepartmentRole);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object DepartmentId = resultSet.getObject(columnIndex++);

                object.setDepartmentIdNull(resultSet.getBoolean(columnIndex++));

                if (DepartmentId != null) {
                    BeanUtils.setProperty(object, DataProperty.DepartmentId,
                        DepartmentId);
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

                Object DepartmentName = resultSet.getObject(columnIndex++);

                object.setDepartmentNameNull(resultSet.getBoolean(columnIndex++));

                if (DepartmentName != null) {
                    BeanUtils.setProperty(object, DataProperty.DepartmentName,
                        DepartmentName);
                } // end if

                Object ParentDepartmentId = resultSet.getObject(columnIndex++);

                object.setParentDepartmentIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ParentDepartmentId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ParentDepartmentId, ParentDepartmentId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcEmployeeDepartmentRelateRowMapper
} // end BaseEmployeeDepartmentRelateDAOJdbcImpl
