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
     * ȡ�ò����б�
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
     * ����idȡ�ò�����Ϣ
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
     * �޸Ĳ�����Ϣ
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
     * ��Ӳ���
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
     * ɾ������
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
     * ȡ�ò��ų�Ա
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
     * ����idȡ�ò��ų�Ա
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
     * ��Ӳ��ų�Ա
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
     * ɾ�����ų�Ա
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
     * �޸Ĳ��ų�Ա
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
     * ȡ��Ա������
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
