/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.service;

/**
*  
*  Generated Date 2011-11-29 20:15:14   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IDepartmentService {
    /**
     * 取得部门列表
     *
     * @param parentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.DepartmentBean[] getDepartmentByParentId(
        final long parentId) throws Exception;

    /**
     * 根据id取得部门信息
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.DepartmentBean getDepartmentById(
        final long departmentId) throws Exception;

    /**
     * 修改部门信息
     *
     * @param departments
     *
     * @throws Exception
     *
     * @model
     */
    void modifyDepartments(
        final com.ourteam.hr.domain.DepartmentBean[] departments)
        throws Exception;

    /**
     * 添加部门
     *
     * @param department
     *
     * @throws Exception
     *
     * @model
     */
    void addNewDepartment(final com.ourteam.hr.domain.DepartmentBean department)
        throws Exception;

    /**
     * 删除部门
     *
     * @param departmentIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteDepartments(final long[] departmentIds)
        throws Exception;

    /**
     * 取得部门成员
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] getDepartmentMembers(
        final long departmentId) throws Exception;

    /**
     * 根据id取得部门成员
     *
     * @param relatedId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeDepartmentRelateBean getDepartmentMemberById(
        final long relatedId) throws Exception;

    /**
     * 添加部门成员
     *
     * @param departmentMembers
     * @param isMove
     *
     * @throws Exception
     *
     * @model
     */
    void addDepartmentMembers(
        final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] departmentMembers,
        final boolean isMove) throws Exception;

    /**
     * 删除部门成员
     *
     * @param departmentMemberIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeDepartmentMemebers(final long[] departmentMemberIds)
        throws Exception;

    /**
     * 修改部门成员
     *
     * @param employeeDepartmentRelate
     *
     * @throws Exception
     *
     * @model
     */
    void modifyDepartmentMembers(
        final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] employeeDepartmentRelate)
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
     *
     * @model
     */
    com.ourteam.hr.domain.DepartmentBean[] getEmployeeDepartments(
        final long employeeId, final boolean includeParentdepartment)
        throws Exception;
} // end IDepartmentService
