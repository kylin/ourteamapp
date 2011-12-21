/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao.impl;

import com.ourteam.hr.dao.Department;
import com.ourteam.hr.dao.DepartmentDAOQueryBean;
import com.ourteam.hr.dao.IDepartmentDAO;

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
 * DAO JDBC Impl Generate Date : 2011-10-28 17:10:47
 *
 * @author kylin
 */
abstract public class BaseDepartmentDAOJdbcImpl extends AbstractJdbcDAO
    implements IDepartmentDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DepartmentName, Description, ParentId, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DepartmentName,
            DataProperty.Description, DataProperty.ParentId, DataProperty.Status
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
     * Creates a new BaseDepartmentDAOJdbcImpl object.
     */
    public BaseDepartmentDAOJdbcImpl() {
        super();
    } // end BaseDepartmentDAOJdbcImpl()

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
     * Check Unique Department
     *
     * @param aDepartment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(Department aDepartment)
        throws Exception {
        if (aDepartment == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aDepartment, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IDepartment
     *
     * @param aDepartment
     *
     * @throws Exception
     */
    public void insertDepartment(Department aDepartment)
        throws Exception {
        insert(aDepartment);
    } // end insertDepartment()

    /**
     * Batch Insert IDepartment
     *
     * @param aDepartment
     *
     * @throws Exception
     */
    public void batchInsertDepartment(Department[] aDepartment)
        throws Exception {
        batchInsert(aDepartment);
    } // end batchInsertDepartment()

    /**
     * Delete IDepartment
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteDepartment(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteDepartment()

    /**
     * Delete IDepartment
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteDepartment(DepartmentDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteDepartment()

    /**
     * Update IDepartment Selective
     *
     * @param aDepartment
     *
     * @throws Exception
     */
    public void updateDepartment(Department aDepartment)
        throws Exception {
        if (aDepartment.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aDepartment);

        Department tempObj = findDepartmentById(aDepartment.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aDepartment, tempObj);
        } // end if
    } // end updateDepartment()

    /**
     * Batch Update IDepartment
     *
     * @param aDepartment
     *
     * @throws Exception
     */
    public void batchUpdateDepartment(Department[] aDepartment)
        throws Exception {
        batchUpdate(aDepartment);
    } // end batchUpdateDepartment()

    /**
     * Update IDepartment
     *
     * @param aDepartment
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateDepartment(Department aDepartment,
        DepartmentDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aDepartment, aQueryBean);
    } // end updateDepartment()

    /**
     * DOCUMENT ME!
     *
     * @param aDepartment DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(Department aDepartment)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aDepartments DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeDepartment(Department[] aDepartments,
        DepartmentDAOQueryBean aQueryBean) throws Exception {
        synchronizeDepartment(aDepartments, aQueryBean, null);
    } // end synchronizeDepartment()

    /**
     * DOCUMENT ME!
     *
     * @param aDepartments DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeDepartment(Department[] aDepartments,
        DepartmentDAOQueryBean aQueryBean,
        DepartmentSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aDepartments) == false) {
            inputList.addAll(Arrays.asList(aDepartments));
        } // end if

        Department[] existentDepartments = this.queryDepartment(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentDepartments) == false) {
            existentList.addAll(Arrays.asList(existentDepartments));
        } // end if

        List willAddDepartments = ListUtils.subtract(inputList, existentList);

        List willDeleteDepartments = ListUtils.subtract(existentList, inputList);

        List willUpdateDepartments = ListUtils.intersection(existentList,
                inputList);

        Department[] willUpdateDepartmentArray = (Department[]) willUpdateDepartments.toArray(new Department[willUpdateDepartments.size()]);
        Department[] willAddDepartmentArray = (Department[]) willAddDepartments.toArray(new Department[willAddDepartments.size()]);
        Department[] willDeleteDepartmentArray = (Department[]) willDeleteDepartments.toArray(new Department[willDeleteDepartments.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddDepartmentArray,
                willUpdateDepartmentArray, willDeleteDepartmentArray);
        } // end if

        if (willUpdateDepartments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateDepartmentArray);
            } // end if

            this.batchUpdateDepartment(willUpdateDepartmentArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateDepartmentArray);
            } // end if
        } // end if

        if (willAddDepartments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddDepartmentArray);
            } // end if

            this.batchInsertDepartment(willAddDepartmentArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddDepartmentArray);
            } // end if
        } // end if

        if (willDeleteDepartments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteDepartmentArray);
            } // end if

            for (int i = 0; i < willDeleteDepartmentArray.length; i++) {
                Department object = willDeleteDepartmentArray[i];
                this.deleteDepartment(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteDepartmentArray);
            } // end if
        } // end if
    } // end synchronizeDepartment()

    /**
     * Query IDepartment
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public Department findDepartmentById(final long aId)
        throws Exception {
        DepartmentDAOQueryBean queryBean = new DepartmentDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        Department[] Departments = queryDepartment(queryBean);

        if (Departments.length == 0) {
            return null;
        } // end if
        else {
            return Departments[0];
        } // end else
    } // end findDepartmentById()

    /**
     * Query IDepartment
     *
     * @param queryBean
     *
     * @return IDepartment[]
     *
     * @throws Exception
     */
    public Department[] queryDepartment(DepartmentDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcDepartmentRowMapper());

        return (Department[]) result.toArray(new Department[result.size()]);
    } // end queryDepartment()

    /**
     * Query Department Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryDepartmentSelective(DepartmentDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryDepartmentSelective()

    /**
     * Query IDepartment Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryDepartmentCount(DepartmentDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryDepartmentCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcDepartmentRowMapper
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
            Department object = new Department();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DepartmentName = resultSet.getObject(columnIndex++);

                object.setDepartmentNameNull(resultSet.getBoolean(columnIndex++));

                if (DepartmentName != null) {
                    BeanUtils.setProperty(object, DataProperty.DepartmentName,
                        DepartmentName);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object ParentId = resultSet.getObject(columnIndex++);

                object.setParentIdNull(resultSet.getBoolean(columnIndex++));

                if (ParentId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentId,
                        ParentId);
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
    } // end JdbcDepartmentRowMapper
} // end BaseDepartmentDAOJdbcImpl
