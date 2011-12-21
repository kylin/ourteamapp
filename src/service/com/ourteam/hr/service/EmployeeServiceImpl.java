/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.hr.service;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.identity.User;
import org.apache.commons.lang.ArrayUtils;

import com.ourteam.hr.dao.Employee;
import com.ourteam.hr.dao.EmployeeDAOQueryBean;
import com.ourteam.hr.dao.EmployeeDepartmentRelate;
import com.ourteam.hr.dao.EmployeeDepartmentRelateDAOQueryBean;
import com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO;
import com.ourteam.hr.domain.EmployeeBean;

/**
 * impl Generated Date 2011-10-28 16:31:12
 * 
 * @author $Auto Gen
 */
public class EmployeeServiceImpl extends AbstractEmployeeService {
	/**
	 * ��ݲ���IDȡ��Ա���б� impl
	 * 
	 * @param departmentId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.hr.domain.EmployeeBean[] doGetEmployeesByDepartmentId(
			final long departmentId) throws Exception {

		EmployeeDepartmentRelateDAOQueryBean queryBean = new EmployeeDepartmentRelateDAOQueryBean();

		queryBean.createCriteria().andDepartmentIdEqualTo(departmentId);

		queryBean.setSortProperty(IEmployeeDepartmentRelateDAO.DepartmentRole);

		queryBean.setSortProperty(IEmployeeDepartmentRelateDAO.EmployeeName);

		EmployeeDepartmentRelate[] employeeDepartmentRelates = this.employeeDepartmentRelateDao
				.queryEmployeeDepartmentRelate(queryBean);

		if (ArrayUtils.isNotEmpty(employeeDepartmentRelates)) {

			List<Long> employeeIds = new ArrayList<Long>();

			for (int i = 0; i < employeeDepartmentRelates.length; i++) {
				EmployeeDepartmentRelate employeeDepartmentRelate = employeeDepartmentRelates[i];
				employeeIds.add(employeeDepartmentRelate.getEmployeeId());
			}

			EmployeeDAOQueryBean employeeDAOQueryBean = new EmployeeDAOQueryBean();

			employeeDAOQueryBean.createCriteria().andIdIn(employeeIds);

			return EmployeeBean.toArray(this.employeeDao
					.queryEmployee(employeeDAOQueryBean));
		} else {
			return new EmployeeBean[0];
		}
	} // end doGetEmployeesByDepartmentId()

	@Override
	protected int doQueryEmployeeCount(EmployeeDAOQueryBean queryBean)
			throws Exception {

		if (queryBean == null) {
			queryBean = new EmployeeDAOQueryBean();
		}

		return this.employeeDao.queryEmployeeCount(queryBean);
	}

	@Override
	protected EmployeeBean[] doQueryEmployee(EmployeeDAOQueryBean queryBean)
			throws Exception {

		if (queryBean == null) {
			queryBean = new EmployeeDAOQueryBean();
		}

		return EmployeeBean.toArray(this.employeeDao.queryEmployee(queryBean));
	}

	@Override
	protected void doAddEmployee(EmployeeBean employee) throws Exception {

		this.employeeDao.insertEmployee(employee.convertToEmployee());

		User user = this.dentityService
				.newUser(String.valueOf(employee.getId()));

		user.setEmail(employee.getMailAddress());
		user.setLastName(employee.getName());

		this.dentityService.saveUser(user);

	}

	@Override
	protected void doModifyEmployee(EmployeeBean employee) throws Exception {

		this.employeeDao.updateEmployee(employee.convertToEmployee());

		User user = this.dentityService.createUserQuery()
				.userId(String.valueOf(employee.getId())).singleResult();

		user.setEmail(employee.getMailAddress());
		user.setLastName(employee.getName());

		this.dentityService.saveUser(user);

	}

	@Override
	protected void doDeleteEmployees(long[] employeeIds) throws Exception {

		EmployeeDAOQueryBean queryBean = new EmployeeDAOQueryBean();

		queryBean.createCriteria().andIdIn(employeeIds);

		this.employeeDao.deleteEmployee(queryBean);

		for (int i = 0; i < employeeIds.length; i++) {

			this.dentityService.deleteUser(String.valueOf(employeeIds[i]));

		}

	}

	@Override
	protected EmployeeBean doGetEmployeeBySystemUserId(long sysUserId)
			throws Exception {

		EmployeeDAOQueryBean queryBean = new EmployeeDAOQueryBean();

		queryBean.createCriteria().andUserIdEqualTo(sysUserId);

		EmployeeBean[] employeeBeans = EmployeeBean.toArray(this.employeeDao
				.queryEmployee(queryBean));

		return ArrayUtils.isNotEmpty(employeeBeans) ? employeeBeans[0] : null;
	}

	@Override
	protected EmployeeBean doGetEmployeeById(long employeeId) throws Exception {
		Employee employee = this.employeeDao.findEmployeeById(employeeId);
		return employee != null ? new EmployeeBean(employee) : null;
	}
} // end EmployeeServiceImpl
