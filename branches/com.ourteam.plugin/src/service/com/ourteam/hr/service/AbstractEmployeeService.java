/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Generated Date 2011-11-17 15:47:36
 *
 * @author Auto Gen
 */
abstract class AbstractEmployeeService extends net.service.DefaultServiceImpl
    implements IEmployeeService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractEmployeeService.class);

    /** Employee DAO Instance */
    protected com.ourteam.hr.dao.IEmployeeDAO employeeDao;

    /** EmployeeDepartmentRelate DAO Instance */
    protected com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO employeeDepartmentRelateDao;

    /** dentityService Instance */
    protected org.activiti.engine.IdentityService dentityService;

    /**
     * Get Employee DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.hr.dao.IEmployeeDAO getEmployeeDao() {
        return employeeDao;
    } // end getEmployeeDao()

    /**
     * Set Employee DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setEmployeeDao(com.ourteam.hr.dao.IEmployeeDAO aDao) {
        employeeDao = aDao;
    } // end setEmployeeDao()

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
     * Get dentityService Instance
     *
     * @return DOCUMENT ME!
     */
    public org.activiti.engine.IdentityService getdentityService() {
        return dentityService;
    } // end getdentityService()

    /**
     * Set dentityService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setdentityService(org.activiti.engine.IdentityService aService) {
        dentityService = aService;
    } // end setdentityService()

    /**
     * ���ݲ���IDȡ��Ա���б�
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeBean[] doGetEmployeesByDepartmentId(
        final long departmentId) throws Exception;

    /**
     * ���ݲ���IDȡ��Ա���б�
     *
     * @param departmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.EmployeeBean[] getEmployeesByDepartmentId(
        final long departmentId) throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeBean[] result = doGetEmployeesByDepartmentId(departmentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeesByDepartmentId error", e);
            throw e;
        } // end catch
    } // end getEmployeesByDepartmentId()

    /**
     * ��ѯԱ������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryEmployeeCount(
        final com.ourteam.hr.dao.EmployeeDAOQueryBean queryBean)
        throws Exception;

    /**
     * ��ѯԱ������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryEmployeeCount(
        final com.ourteam.hr.dao.EmployeeDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryEmployeeCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryEmployeeCount error", e);
            throw e;
        } // end catch
    } // end queryEmployeeCount()

    /**
     * ��ѯԱ��
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeBean[] doQueryEmployee(
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
     */
    public com.ourteam.hr.domain.EmployeeBean[] queryEmployee(
        final com.ourteam.hr.dao.EmployeeDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeBean[] result = doQueryEmployee(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryEmployee error", e);
            throw e;
        } // end catch
    } // end queryEmployee()

    /**
     * ���Ա����Ϣ
     *
     * @param employee
     *
     * @throws Exception
     */
    protected abstract void doAddEmployee(
        final com.ourteam.hr.domain.EmployeeBean employee)
        throws Exception;

    /**
     * ���Ա����Ϣ
     *
     * @param employee
     *
     * @throws Exception
     */
    public void addEmployee(final com.ourteam.hr.domain.EmployeeBean employee)
        throws Exception {
        try {
            if (employee == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [employee] Value is NULL");
            } // end if

            doAddEmployee(employee);
        } // end try
        catch (Exception e) {
            logger.error("do addEmployee error", e);
            throw e;
        } // end catch
    } // end addEmployee()

    /**
     * �޸�Ա����Ϣ
     *
     * @param employee
     *
     * @throws Exception
     */
    protected abstract void doModifyEmployee(
        final com.ourteam.hr.domain.EmployeeBean employee)
        throws Exception;

    /**
     * �޸�Ա����Ϣ
     *
     * @param employee
     *
     * @throws Exception
     */
    public void modifyEmployee(
        final com.ourteam.hr.domain.EmployeeBean employee)
        throws Exception {
        try {
            if (employee == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [employee] Value is NULL");
            } // end if

            doModifyEmployee(employee);
        } // end try
        catch (Exception e) {
            logger.error("do modifyEmployee error", e);
            throw e;
        } // end catch
    } // end modifyEmployee()

    /**
     * ɾ��Ա����Ϣ
     *
     * @param employeeIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteEmployees(final long[] employeeIds)
        throws Exception;

    /**
     * ɾ��Ա����Ϣ
     *
     * @param employeeIds
     *
     * @throws Exception
     */
    public void deleteEmployees(final long[] employeeIds)
        throws Exception {
        try {
            doDeleteEmployees(employeeIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteEmployees error", e);
            throw e;
        } // end catch
    } // end deleteEmployees()

    /**
     * ����ϵͳ�ʺ�IDȡ��Ա����Ϣ
     *
     * @param sysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeBean doGetEmployeeBySystemUserId(
        final long sysUserId) throws Exception;

    /**
     * ����ϵͳ�ʺ�IDȡ��Ա����Ϣ
     *
     * @param sysUserId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.EmployeeBean getEmployeeBySystemUserId(
        final long sysUserId) throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeBean result = doGetEmployeeBySystemUserId(sysUserId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeeBySystemUserId error", e);
            throw e;
        } // end catch
    } // end getEmployeeBySystemUserId()

    /**
     * ���ݾ�IDȡ��Ա��
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeBean doGetEmployeeById(
        final long employeeId) throws Exception;

    /**
     * ���ݾ�IDȡ��Ա��
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.EmployeeBean getEmployeeById(
        final long employeeId) throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeBean result = doGetEmployeeById(employeeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeeById error", e);
            throw e;
        } // end catch
    } // end getEmployeeById()
} // end AbstractEmployeeService
