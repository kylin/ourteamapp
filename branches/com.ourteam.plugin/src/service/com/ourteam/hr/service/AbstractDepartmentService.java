/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Generated Date 2011-11-29 20:15:27
 *
 * @author Auto Gen
 */
abstract class AbstractDepartmentService extends net.service.DefaultServiceImpl
    implements IDepartmentService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractDepartmentService.class);

    /** Department DAO Instance */
    protected com.ourteam.hr.dao.IDepartmentDAO departmentDao;

    /** EmployeeDepartmentRelate DAO Instance */
    protected com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO employeeDepartmentRelateDao;

    /**
     * Get Department DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.hr.dao.IDepartmentDAO getDepartmentDao() {
        return departmentDao;
    } // end getDepartmentDao()

    /**
     * Set Department DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setDepartmentDao(com.ourteam.hr.dao.IDepartmentDAO aDao) {
        departmentDao = aDao;
    } // end setDepartmentDao()

    /**
     * Get EmployeeDepartmentRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO getEmployeeDepartmentRelateDao() {
        return employeeDepartmentRelateDao;
    } // end getEmployeeDepartmentRelateDao()

    /**
     * Set EmployeeDepartmentRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setEmployeeDepartmentRelateDao(
        com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO aDao) {
        employeeDepartmentRelateDao = aDao;
    } // end setEmployeeDepartmentRelateDao()

    /**
     * 取得部门列表
     *
     * @param parentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.DepartmentBean[] doGetDepartmentByParentId(
        final long parentId) throws Exception;

    /**
     * 取得部门列表
     *
     * @param parentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.DepartmentBean[] getDepartmentByParentId(
        final long parentId) throws Exception {
        try {
            com.ourteam.hr.domain.DepartmentBean[] result = doGetDepartmentByParentId(parentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getDepartmentByParentId error", e);
            throw e;
        } // end catch
    } // end getDepartmentByParentId()

    /**
     * 根据id取得部门信息
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.DepartmentBean doGetDepartmentById(
        final long departmentId) throws Exception;

    /**
     * 根据id取得部门信息
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.DepartmentBean getDepartmentById(
        final long departmentId) throws Exception {
        try {
            com.ourteam.hr.domain.DepartmentBean result = doGetDepartmentById(departmentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getDepartmentById error", e);
            throw e;
        } // end catch
    } // end getDepartmentById()

    /**
     * 修改部门信息
     *
     * @param departments
     *
     * @throws Exception
     */
    protected abstract void doModifyDepartments(
        final com.ourteam.hr.domain.DepartmentBean[] departments)
        throws Exception;

    /**
     * 修改部门信息
     *
     * @param departments
     *
     * @throws Exception
     */
    public void modifyDepartments(
        final com.ourteam.hr.domain.DepartmentBean[] departments)
        throws Exception {
        try {
            doModifyDepartments(departments);
        } // end try
        catch (Exception e) {
            logger.error("do modifyDepartments error", e);
            throw e;
        } // end catch
    } // end modifyDepartments()

    /**
     * 添加部门
     *
     * @param department
     *
     * @throws Exception
     */
    protected abstract void doAddNewDepartment(
        final com.ourteam.hr.domain.DepartmentBean department)
        throws Exception;

    /**
     * 添加部门
     *
     * @param department
     *
     * @throws Exception
     */
    public void addNewDepartment(
        final com.ourteam.hr.domain.DepartmentBean department)
        throws Exception {
        try {
            if (department == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [department] Value is NULL");
            } // end if

            doAddNewDepartment(department);
        } // end try
        catch (Exception e) {
            logger.error("do addNewDepartment error", e);
            throw e;
        } // end catch
    } // end addNewDepartment()

    /**
     * 删除部门
     *
     * @param departmentIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteDepartments(final long[] departmentIds)
        throws Exception;

    /**
     * 删除部门
     *
     * @param departmentIds
     *
     * @throws Exception
     */
    public void deleteDepartments(final long[] departmentIds)
        throws Exception {
        try {
            doDeleteDepartments(departmentIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteDepartments error", e);
            throw e;
        } // end catch
    } // end deleteDepartments()

    /**
     * 取得部门成员
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] doGetDepartmentMembers(
        final long departmentId) throws Exception;

    /**
     * 取得部门成员
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] getDepartmentMembers(
        final long departmentId) throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] result = doGetDepartmentMembers(departmentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getDepartmentMembers error", e);
            throw e;
        } // end catch
    } // end getDepartmentMembers()

    /**
     * 根据id取得部门成员
     *
     * @param relatedId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeDepartmentRelateBean doGetDepartmentMemberById(
        final long relatedId) throws Exception;

    /**
     * 根据id取得部门成员
     *
     * @param relatedId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.EmployeeDepartmentRelateBean getDepartmentMemberById(
        final long relatedId) throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeDepartmentRelateBean result = doGetDepartmentMemberById(relatedId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getDepartmentMemberById error", e);
            throw e;
        } // end catch
    } // end getDepartmentMemberById()

    /**
     * 添加部门成员
     *
     * @param departmentMembers
     * @param isMove
     *
     * @throws Exception
     */
    protected abstract void doAddDepartmentMembers(
        final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] departmentMembers,
        final boolean isMove) throws Exception;

    /**
     * 添加部门成员
     *
     * @param departmentMembers
     * @param isMove
     *
     * @throws Exception
     */
    public void addDepartmentMembers(
        final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] departmentMembers,
        final boolean isMove) throws Exception {
        try {
            doAddDepartmentMembers(departmentMembers, isMove);
        } // end try
        catch (Exception e) {
            logger.error("do addDepartmentMembers error", e);
            throw e;
        } // end catch
    } // end addDepartmentMembers()

    /**
     * 删除部门成员
     *
     * @param departmentMemberIds
     *
     * @throws Exception
     */
    protected abstract void doRemoveDepartmentMemebers(
        final long[] departmentMemberIds) throws Exception;

    /**
     * 删除部门成员
     *
     * @param departmentMemberIds
     *
     * @throws Exception
     */
    public void removeDepartmentMemebers(final long[] departmentMemberIds)
        throws Exception {
        try {
            doRemoveDepartmentMemebers(departmentMemberIds);
        } // end try
        catch (Exception e) {
            logger.error("do removeDepartmentMemebers error", e);
            throw e;
        } // end catch
    } // end removeDepartmentMemebers()

    /**
     * 修改部门成员
     *
     * @param employeeDepartmentRelate
     *
     * @throws Exception
     */
    protected abstract void doModifyDepartmentMembers(
        final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] employeeDepartmentRelate)
        throws Exception;

    /**
     * 修改部门成员
     *
     * @param employeeDepartmentRelate
     *
     * @throws Exception
     */
    public void modifyDepartmentMembers(
        final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] employeeDepartmentRelate)
        throws Exception {
        try {
            doModifyDepartmentMembers(employeeDepartmentRelate);
        } // end try
        catch (Exception e) {
            logger.error("do modifyDepartmentMembers error", e);
            throw e;
        } // end catch
    } // end modifyDepartmentMembers()

    /**
     * 取得员工部门
     *
     * @param employeeId
     * @param includeParentdepartment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.DepartmentBean[] doGetEmployeeDepartments(
        final long employeeId, final boolean includeParentdepartment)
        throws Exception;

    /**
     * 取得员工部门
     *
     * @param employeeId
     * @param includeParentdepartment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.DepartmentBean[] getEmployeeDepartments(
        final long employeeId, final boolean includeParentdepartment)
        throws Exception {
        try {
            com.ourteam.hr.domain.DepartmentBean[] result = doGetEmployeeDepartments(employeeId,
                    includeParentdepartment);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeeDepartments error", e);
            throw e;
        } // end catch
    } // end getEmployeeDepartments()
} // end AbstractDepartmentService
