/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.service;

/**
*  
*  Generated Date 2011-11-17 15:45:42   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IEmployeeService {
    /**
     * 根据部门ID取得员工列表
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeBean[] getEmployeesByDepartmentId(
        final long departmentId) throws Exception;

    /**
     * 查询员工数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int queryEmployeeCount(
        final com.ourteam.hr.dao.EmployeeDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询员工
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeBean[] queryEmployee(
        final com.ourteam.hr.dao.EmployeeDAOQueryBean queryBean)
        throws Exception;

    /**
     * 添加员工信息
     *
     * @param employee
     *
     * @throws Exception
     *
     * @model
     */
    void addEmployee(final com.ourteam.hr.domain.EmployeeBean employee)
        throws Exception;

    /**
     * 修改员工信息
     *
     * @param employee
     *
     * @throws Exception
     *
     * @model
     */
    void modifyEmployee(final com.ourteam.hr.domain.EmployeeBean employee)
        throws Exception;

    /**
     * 删除员工信息
     *
     * @param employeeIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployees(final long[] employeeIds) throws Exception;

    /**
     * 根据系统帐号ID取得员工信息
     *
     * @param sysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeBean getEmployeeBySystemUserId(
        final long sysUserId) throws Exception;

    /**
     * 根据就ID取得员工
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeBean getEmployeeById(final long employeeId)
        throws Exception;
} // end IEmployeeService
