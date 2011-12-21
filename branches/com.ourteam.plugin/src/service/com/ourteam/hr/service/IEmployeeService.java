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
     * ���ݲ���IDȡ��Ա���б�
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
     * ��ѯԱ������
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
     * ��ѯԱ��
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
     * ���Ա����Ϣ
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
     * �޸�Ա����Ϣ
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
     * ɾ��Ա����Ϣ
     *
     * @param employeeIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployees(final long[] employeeIds) throws Exception;

    /**
     * ����ϵͳ�ʺ�IDȡ��Ա����Ϣ
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
     * ���ݾ�IDȡ��Ա��
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
