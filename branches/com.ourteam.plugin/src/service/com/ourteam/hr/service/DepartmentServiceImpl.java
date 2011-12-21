/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.hr.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import com.ourteam.hr.dao.Department;
import com.ourteam.hr.dao.DepartmentDAOQueryBean;
import com.ourteam.hr.dao.EmployeeDepartmentRelate;
import com.ourteam.hr.dao.EmployeeDepartmentRelateDAOQueryBean;
import com.ourteam.hr.dao.IDepartmentDAO;
import com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO;
import com.ourteam.hr.domain.DepartmentBean;
import com.ourteam.hr.domain.EmployeeDepartmentRelateBean;

/**
 * impl Generated Date 2011-10-28 16:03:20
 * 
 * @author $Auto Gen
 */
public class DepartmentServiceImpl extends AbstractDepartmentService {
	/**
	 * ȡ�ò����б� impl
	 * 
	 * @param parentId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.hr.domain.DepartmentBean[] doGetDepartmentByParentId(
			final long parentId) throws Exception {

		DepartmentDAOQueryBean queryBean = new DepartmentDAOQueryBean();

		queryBean.createCriteria().andParentIdEqualTo(parentId);

		queryBean.setSortProperty(IDepartmentDAO.DepartmentName);

		return DepartmentBean.toArray(departmentDao.queryDepartment(queryBean));
	} // end doGetDepartmentByParentId()

	/**
	 * ���idȡ�ò�����Ϣ impl
	 * 
	 * @param departmentId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.hr.domain.DepartmentBean doGetDepartmentById(
			final long departmentId) throws Exception {
		Department department = this.departmentDao
				.findDepartmentById(departmentId);

		if (department == null) {
			return null;
		} else {
			return new DepartmentBean(department);
		}
	} // end doGetDepartmentById()

	/**
	 * �޸Ĳ�����Ϣ impl
	 * 
	 * @param departments
	 * 
	 * @throws Exception
	 */
	protected void doModifyDepartments(
			final com.ourteam.hr.domain.DepartmentBean[] departments)
			throws Exception {

		if (ArrayUtils.isNotEmpty(departments)) {

			Department[] departmentList = new Department[departments.length];

			for (int i = 0; i < departments.length; i++) {
				departmentList[i] = departments[i].convertToDepartment();
			}

			departmentDao.batchUpdateDepartment(departmentList);
		}

	} // end doModifyDepartments()

	/**
	 * ��Ӳ��� impl
	 * 
	 * @param department
	 * 
	 * @throws Exception
	 */
	protected void doAddNewDepartment(
			final com.ourteam.hr.domain.DepartmentBean department)
			throws Exception {
		departmentDao.insertDepartment(department.convertToDepartment());
	} // end doAddNewDepartment()

	/**
	 * ɾ���� impl
	 * 
	 * @param departmentIds
	 * 
	 * @throws Exception
	 */
	protected void doDeleteDepartments(final long[] departmentIds)
			throws Exception {

		if (ArrayUtils.isNotEmpty(departmentIds)) {
			DepartmentDAOQueryBean queryBean = new DepartmentDAOQueryBean();

			queryBean.createCriteria().andIdIn(departmentIds);

			departmentDao.deleteDepartment(queryBean);

		}

	} // end doDeleteDepartments()

	/**
	 * ȡ�ò��ų�Ա impl
	 * 
	 * @param departmentId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] doGetDepartmentMembers(
			final long departmentId) throws Exception {

		EmployeeDepartmentRelateDAOQueryBean queryBean = new EmployeeDepartmentRelateDAOQueryBean();

		queryBean.createCriteria().andDepartmentIdEqualTo(departmentId);

		queryBean.setSortProperty(IEmployeeDepartmentRelateDAO.DepartmentRole);

		queryBean.setSortProperty(IEmployeeDepartmentRelateDAO.EmployeeName);

		return EmployeeDepartmentRelateBean
				.toArray(this.employeeDepartmentRelateDao
						.queryEmployeeDepartmentRelate(queryBean));
	} // end doGetDepartmentMembers()

	/**
	 * ���idȡ�ò��ų�Ա impl
	 * 
	 * @param relatedId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.hr.domain.EmployeeDepartmentRelateBean doGetDepartmentMemberById(
			final long relatedId) throws Exception {

		EmployeeDepartmentRelate employeeDepartmentRelate = this.employeeDepartmentRelateDao
				.findEmployeeDepartmentRelateById(relatedId);

		return employeeDepartmentRelate != null ? new EmployeeDepartmentRelateBean(
				employeeDepartmentRelate) : null;
	} // end doGetDepartmentMemberById()

	/**
	 * ��Ӳ��ų�Ա impl
	 * 
	 * @param departmentMembers
	 * @param isMove
	 * 
	 * @throws Exception
	 */
	protected void doAddDepartmentMembers(
			final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] departmentMembers,
			final boolean isMove) throws Exception {

		if (isMove) {
			long[] employeeIds = new long[departmentMembers.length];

			for (int i = 0; i < employeeIds.length; i++) {
				employeeIds[i] = departmentMembers[i].getEmployeeId();
			}

			EmployeeDepartmentRelateDAOQueryBean queryBean = new EmployeeDepartmentRelateDAOQueryBean();

			queryBean.createCriteria().andEmployeeIdIn(employeeIds);

			this.employeeDepartmentRelateDao
					.deleteEmployeeDepartmentRelate(queryBean);

		}

		EmployeeDepartmentRelate[] relates = new EmployeeDepartmentRelate[departmentMembers.length];

		for (int i = 0; i < relates.length; i++) {
			relates[i] = departmentMembers[i]
					.convertToEmployeeDepartmentRelate();

		}

		this.employeeDepartmentRelateDao
				.batchInsertEmployeeDepartmentRelate(relates);

	} // end doAddDepartmentMembers()

	/**
	 * ɾ���ų�Ա impl
	 * 
	 * @param departmentMemberIds
	 * 
	 * @throws Exception
	 */
	protected void doRemoveDepartmentMemebers(final long[] departmentMemberIds)
			throws Exception {

		EmployeeDepartmentRelateDAOQueryBean queryBean = new EmployeeDepartmentRelateDAOQueryBean();

		queryBean.createCriteria().andIdIn(departmentMemberIds);

		this.employeeDepartmentRelateDao
				.deleteEmployeeDepartmentRelate(queryBean);

	} // end doRemoveDepartmentMemebers()

	/**
	 * �޸Ĳ��ų�Ա impl
	 * 
	 * @param employeeDepartmentRelate
	 * 
	 * @throws Exception
	 */
	protected void doModifyDepartmentMembers(
			final com.ourteam.hr.domain.EmployeeDepartmentRelateBean[] employeeDepartmentRelate)
			throws Exception {

		EmployeeDepartmentRelate[] relates = new EmployeeDepartmentRelate[employeeDepartmentRelate.length];

		for (int i = 0; i < relates.length; i++) {
			relates[i] = employeeDepartmentRelate[i]
					.convertToEmployeeDepartmentRelate();

		}

		this.employeeDepartmentRelateDao
				.batchUpdateEmployeeDepartmentRelate(relates);

	} // end doModifyDepartmentMembers()

	@Override
	protected DepartmentBean[] doGetEmployeeDepartments(long employeeId,
			boolean includeParentDepartment) throws Exception {

		EmployeeDepartmentRelateDAOQueryBean queryBean = new EmployeeDepartmentRelateDAOQueryBean();

		queryBean.createCriteria().andEmployeeIdEqualTo(employeeId);

		EmployeeDepartmentRelate[] relates = this.employeeDepartmentRelateDao
				.queryEmployeeDepartmentRelate(queryBean);

		if (ArrayUtils.isEmpty(relates)) {
			return new DepartmentBean[0];
		}

		List<Long> departmentIds = new ArrayList<Long>();

		for (int i = 0; i < relates.length; i++) {
			departmentIds.add(Long.valueOf(relates[i].getDepartmentId()));
			if (includeParentDepartment) {
				departmentIds.addAll(getAllParentDepartmentIds(relates[i]
						.getDepartmentId()));
			}
		}

		DepartmentDAOQueryBean departmentQueryBean = new DepartmentDAOQueryBean();

		departmentQueryBean.createCriteria().andIdIn(departmentIds);

		return DepartmentBean.toArray(this.departmentDao
				.queryDepartment(departmentQueryBean));
	}

	protected List<Long> getAllParentDepartmentIds(long departmentId)
			throws Exception {

		Department department = this.departmentDao
				.findDepartmentById(departmentId);

		if (department == null || department.getParentId() == 0) {
			return new ArrayList<Long>(0);
		}

		List<Long> list = new ArrayList<Long>();

		Department parentDepartment = this.departmentDao
				.findDepartmentById(department.getParentId());

		while (parentDepartment != null) {
			list.add(Long.valueOf(parentDepartment.getId()));
			parentDepartment = this.departmentDao
					.findDepartmentById(parentDepartment.getParentId());
		}

		return list;

	}
} // end DepartmentServiceImpl
