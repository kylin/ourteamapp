/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * EmployeeDepartmentRelate query bean 2011-11-29 20:18:38
 *
 * @author Auto Gen
 */
public class EmployeeDepartmentRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new EmployeeDepartmentRelateDAOQueryBean object.
     */
    public EmployeeDepartmentRelateDAOQueryBean() {
        super();
    } // end EmployeeDepartmentRelateDAOQueryBean()

    /**
     * Creates a new EmployeeDepartmentRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public EmployeeDepartmentRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end EmployeeDepartmentRelateDAOQueryBean()

    /**
     * Creates a new EmployeeDepartmentRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public EmployeeDepartmentRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end EmployeeDepartmentRelateDAOQueryBean()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();

        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        } // end if

        return criteria;
    } // end createCriteria()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected Criteria createCriteriaInternal() {
        return new Criteria(this);
    } // end createCriteriaInternal()

    /**
     * DOCUMENT ME!
     */
    public void addIdSelectProperty() {
        addIdSelectProperty("id");
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDepartmentRoleSelectProperty() {
        addDepartmentRoleSelectProperty("departmentRole");
    } // end addDepartmentRoleSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDepartmentRoleSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.DepartmentRole,
                aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.DepartmentRole,
                "departmentRole");
        } // end else
    } // end addDepartmentRoleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStatusSelectProperty() {
        addStatusSelectProperty("status");
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStatusSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDepartmentIdSelectProperty() {
        addDepartmentIdSelectProperty("departmentId");
    } // end addDepartmentIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDepartmentIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.DepartmentId, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.DepartmentId,
                "departmentId");
        } // end else
    } // end addDepartmentIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEmployeeIdSelectProperty() {
        addEmployeeIdSelectProperty("employeeId");
    } // end addEmployeeIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEmployeeIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.EmployeeId, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.EmployeeId,
                "employeeId");
        } // end else
    } // end addEmployeeIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEmployeeNameSelectProperty() {
        addEmployeeNameSelectProperty("employeeName");
    } // end addEmployeeNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEmployeeNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.EmployeeName, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.EmployeeName,
                "employeeName");
        } // end else
    } // end addEmployeeNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDepartmentNameSelectProperty() {
        addDepartmentNameSelectProperty("departmentName");
    } // end addDepartmentNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDepartmentNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.DepartmentName,
                aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.DepartmentName,
                "departmentName");
        } // end else
    } // end addDepartmentNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentDepartmentIdSelectProperty() {
        addParentDepartmentIdSelectProperty("parentDepartmentId");
    } // end addParentDepartmentIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentDepartmentIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDepartmentRelateDAO.ParentDepartmentId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDepartmentRelateDAO.ParentDepartmentId,
                "parentDepartmentId");
        } // end else
    } // end addParentDepartmentIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDepartmentRoleSelectProperty();

        addStatusSelectProperty();

        addDepartmentIdSelectProperty();

        addEmployeeIdSelectProperty();

        addEmployeeNameSelectProperty();

        addDepartmentNameSelectProperty();

        addParentDepartmentIdSelectProperty();
    } // end addAllSelectProperties()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class Criteria extends BaseWhereCriterion {
        /**
         * Creates a new Criteria object.
         *
         * @param aParentObject DOCUMENT ME!
         */
        protected Criteria(Object aParentObject) {
            super(aParentObject);
        } // end Criteria()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNull() {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.ID is not null AND HR_EMPLOYEE_DEPARTMENT_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE_DEPARTMENT_RELATE.ID is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.ID = '')");

            return this;
        } // end andIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdEqualTo(long value) {
            return andIdEqualTo(Long.valueOf(value));
        } // end andIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID =", value, "id");

            return this;
        } // end andIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualTo(long value) {
            return andIdNotEqualTo(Long.valueOf(value));
        } // end andIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID <>", value, "id");

            return this;
        } // end andIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualToOrIsNull(long value) {
            return andIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.ID <>",
                value, "id");

            return this;
        } // end andIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThan(long value) {
            return andIdGreaterThan(Long.valueOf(value));
        } // end andIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID >", value, "id");

            return this;
        } // end andIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanOrEqualTo(long value) {
            return andIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID >=", value, "id");

            return this;
        } // end andIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThan(long value) {
            return andIdLessThan(Long.valueOf(value));
        } // end andIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID <", value, "id");

            return this;
        } // end andIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanOrEqualTo(long value) {
            return andIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID <=", value, "id");

            return this;
        } // end andIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIn(long[] values) {
            if (values.length == 1) {
                return andIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID in", values, "id");

                return this;
            } // end else
        } // end andIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotIn(long[] values) {
            if (values.length == 1) {
                return andIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID not in", values,
                    "id");

                return this;
            } // end else
        } // end andIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIn(List values) {
            if (values.size() == 1) {
                return andIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID in", values, "id");

                return this;
            } // end else
        } // end andIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotIn(List values) {
            if (values.size() == 1) {
                return andIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID not in", values,
                    "id");

                return this;
            } // end else
        } // end andIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIn(Object[] values) {
            if (values.length == 1) {
                return andIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID in",
                    Arrays.asList(values), "id");

                return this;
            } // end else
        } // end andIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID not in",
                    Arrays.asList(values), "id");

                return this;
            } // end else
        } // end andIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID between", value1,
                value2, "id");

            return this;
        } // end andIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID between", value1,
                value2, "id");

            return this;
        } // end andIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID not between",
                value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.ID not between",
                value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleIsNull() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE is null");

            return this;
        } // end andDepartmentRoleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleIsNotNull() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE is not null");

            return this;
        } // end andDepartmentRoleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE is not null AND HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE <> ''");

            return this;
        } // end andDepartmentRoleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE = '')");

            return this;
        } // end andDepartmentRoleIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE =",
                value, "departmentRole");

            return this;
        } // end andDepartmentRoleEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentRoleEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE <>",
                value, "departmentRole");

            return this;
        } // end andDepartmentRoleNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE <>",
                value, "departmentRole");

            return this;
        } // end andDepartmentRoleNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentRoleNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE >",
                value, "departmentRole");

            return this;
        } // end andDepartmentRoleGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentRoleGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE >=",
                value, "departmentRole");

            return this;
        } // end andDepartmentRoleGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentRoleGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleLessThan(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE <",
                value, "departmentRole");

            return this;
        } // end andDepartmentRoleLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentRoleLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE <=",
                value, "departmentRole");

            return this;
        } // end andDepartmentRoleLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentRoleLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE like",
                buffer.toString(), "departmentRole");

            return this;
        } // end andDepartmentRoleLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE not like",
                buffer.toString(), "departmentRole");

            return this;
        } // end andDepartmentRoleNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleIn(List values) {
            if (values.size() == 1) {
                return andDepartmentRoleEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE in",
                    values, "departmentRole");

                return this;
            } // end else
        } // end andDepartmentRoleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleNotIn(List values) {
            if (values.size() == 1) {
                return andDepartmentRoleNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE not in",
                    values, "departmentRole");

                return this;
            } // end else
        } // end andDepartmentRoleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleIn(Object[] values) {
            if (values.length == 1) {
                return andDepartmentRoleEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE in",
                    Arrays.asList(values), "departmentRole");

                return this;
            } // end else
        } // end andDepartmentRoleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleNotIn(Object[] values) {
            if (values.length == 1) {
                return andDepartmentRoleNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE not in",
                    Arrays.asList(values), "departmentRole");

                return this;
            } // end else
        } // end andDepartmentRoleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE between",
                value1, value2, "departmentRole");

            return this;
        } // end andDepartmentRoleBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentRoleNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE not between",
                value1, value2, "departmentRole");

            return this;
        } // end andDepartmentRoleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS is not null AND HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS = '')");

            return this;
        } // end andStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS =", value,
                "status");

            return this;
        } // end andStatusEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS <>", value,
                "status");

            return this;
        } // end andStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS <>",
                value, "status");

            return this;
        } // end andStatusNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS >", value,
                "status");

            return this;
        } // end andStatusGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS >=", value,
                "status");

            return this;
        } // end andStatusGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThan(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS <", value,
                "status");

            return this;
        } // end andStatusLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS <=", value,
                "status");

            return this;
        } // end andStatusLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS like",
                buffer.toString(), "status");

            return this;
        } // end andStatusLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS not like",
                buffer.toString(), "status");

            return this;
        } // end andStatusNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIn(List values) {
            if (values.size() == 1) {
                return andStatusEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS in", values,
                    "status");

                return this;
            } // end else
        } // end andStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotIn(List values) {
            if (values.size() == 1) {
                return andStatusNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS not in",
                    values, "status");

                return this;
            } // end else
        } // end andStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIn(Object[] values) {
            if (values.length == 1) {
                return andStatusEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS in",
                    Arrays.asList(values), "status");

                return this;
            } // end else
        } // end andStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS not in",
                    Arrays.asList(values), "status");

                return this;
            } // end else
        } // end andStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS between",
                value1, value2, "status");

            return this;
        } // end andStatusBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsNull() {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID is null");

            return this;
        } // end andDepartmentIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsNotNull() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID is not null");

            return this;
        } // end andDepartmentIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID is not null AND HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID <> ''");

            return this;
        } // end andDepartmentIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID = '')");

            return this;
        } // end andDepartmentIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdEqualTo(long value) {
            return andDepartmentIdEqualTo(Long.valueOf(value));
        } // end andDepartmentIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID =",
                value, "departmentId");

            return this;
        } // end andDepartmentIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotEqualTo(long value) {
            return andDepartmentIdNotEqualTo(Long.valueOf(value));
        } // end andDepartmentIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID <>",
                value, "departmentId");

            return this;
        } // end andDepartmentIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotEqualToOrIsNull(long value) {
            return andDepartmentIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andDepartmentIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID <>",
                value, "departmentId");

            return this;
        } // end andDepartmentIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdGreaterThan(long value) {
            return andDepartmentIdGreaterThan(Long.valueOf(value));
        } // end andDepartmentIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdGreaterThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID >",
                value, "departmentId");

            return this;
        } // end andDepartmentIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdGreaterThanOrEqualTo(long value) {
            return andDepartmentIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andDepartmentIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID >=",
                value, "departmentId");

            return this;
        } // end andDepartmentIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdLessThan(long value) {
            return andDepartmentIdLessThan(Long.valueOf(value));
        } // end andDepartmentIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdLessThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID <",
                value, "departmentId");

            return this;
        } // end andDepartmentIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdLessThanOrEqualTo(long value) {
            return andDepartmentIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andDepartmentIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID <=",
                value, "departmentId");

            return this;
        } // end andDepartmentIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIn(long[] values) {
            if (values.length == 1) {
                return andDepartmentIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID in",
                    values, "departmentId");

                return this;
            } // end else
        } // end andDepartmentIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotIn(long[] values) {
            if (values.length == 1) {
                return andDepartmentIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID not in",
                    values, "departmentId");

                return this;
            } // end else
        } // end andDepartmentIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIn(List values) {
            if (values.size() == 1) {
                return andDepartmentIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID in",
                    values, "departmentId");

                return this;
            } // end else
        } // end andDepartmentIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotIn(List values) {
            if (values.size() == 1) {
                return andDepartmentIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID not in",
                    values, "departmentId");

                return this;
            } // end else
        } // end andDepartmentIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIn(Object[] values) {
            if (values.length == 1) {
                return andDepartmentIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID in",
                    Arrays.asList(values), "departmentId");

                return this;
            } // end else
        } // end andDepartmentIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andDepartmentIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID not in",
                    Arrays.asList(values), "departmentId");

                return this;
            } // end else
        } // end andDepartmentIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID between",
                value1, value2, "departmentId");

            return this;
        } // end andDepartmentIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID between",
                value1, value2, "departmentId");

            return this;
        } // end andDepartmentIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID not between",
                value1, value2, "departmentId");

            return this;
        } // end andDepartmentIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID not between",
                value1, value2, "departmentId");

            return this;
        } // end andDepartmentIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNull() {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID is null");

            return this;
        } // end andEmployeeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNotNull() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID is not null");

            return this;
        } // end andEmployeeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID is not null AND HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID <> ''");

            return this;
        } // end andEmployeeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID = '')");

            return this;
        } // end andEmployeeIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdEqualTo(long value) {
            return andEmployeeIdEqualTo(Long.valueOf(value));
        } // end andEmployeeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID =", value,
                "employeeId");

            return this;
        } // end andEmployeeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualTo(long value) {
            return andEmployeeIdNotEqualTo(Long.valueOf(value));
        } // end andEmployeeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID <>", value,
                "employeeId");

            return this;
        } // end andEmployeeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualToOrIsNull(long value) {
            return andEmployeeIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andEmployeeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID is null OR HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID <>",
                value, "employeeId");

            return this;
        } // end andEmployeeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThan(long value) {
            return andEmployeeIdGreaterThan(Long.valueOf(value));
        } // end andEmployeeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID >", value,
                "employeeId");

            return this;
        } // end andEmployeeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanOrEqualTo(long value) {
            return andEmployeeIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andEmployeeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID >=", value,
                "employeeId");

            return this;
        } // end andEmployeeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThan(long value) {
            return andEmployeeIdLessThan(Long.valueOf(value));
        } // end andEmployeeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID <", value,
                "employeeId");

            return this;
        } // end andEmployeeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanOrEqualTo(long value) {
            return andEmployeeIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andEmployeeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID <=", value,
                "employeeId");

            return this;
        } // end andEmployeeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIn(long[] values) {
            if (values.length == 1) {
                return andEmployeeIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID in",
                    values, "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotIn(long[] values) {
            if (values.length == 1) {
                return andEmployeeIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID not in",
                    values, "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIn(List values) {
            if (values.size() == 1) {
                return andEmployeeIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID in",
                    values, "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotIn(List values) {
            if (values.size() == 1) {
                return andEmployeeIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID not in",
                    values, "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID in",
                    Arrays.asList(values), "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID not in",
                    Arrays.asList(values), "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID between",
                value1, value2, "employeeId");

            return this;
        } // end andEmployeeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID between",
                value1, value2, "employeeId");

            return this;
        } // end andEmployeeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID not between",
                value1, value2, "employeeId");

            return this;
        } // end andEmployeeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID not between",
                value1, value2, "employeeId");

            return this;
        } // end andEmployeeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNull() {
            addCriterion("employeeA.NAME is null");

            return this;
        } // end andEmployeeNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employeeA.NAME is not null");

            return this;
        } // end andEmployeeNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNotEmpty() {
            addCriterion("employeeA.NAME is not null AND employeeA.NAME <> ''");

            return this;
        } // end andEmployeeNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsEmpty() {
            addCriterion("(employeeA.NAME is null OR employeeA.NAME = '')");

            return this;
        } // end andEmployeeNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employeeA.NAME =", value, "employeeName");

            return this;
        } // end andEmployeeNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employeeA.NAME <>", value, "employeeName");

            return this;
        } // end andEmployeeNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotEqualToOrIsNull(String value) {
            addCriterion("employeeA.NAME is null OR employeeA.NAME <>", value,
                "employeeName");

            return this;
        } // end andEmployeeNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employeeA.NAME >", value, "employeeName");

            return this;
        } // end andEmployeeNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeA.NAME >=", value, "employeeName");

            return this;
        } // end andEmployeeNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employeeA.NAME <", value, "employeeName");

            return this;
        } // end andEmployeeNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employeeA.NAME <=", value, "employeeName");

            return this;
        } // end andEmployeeNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.NAME like", buffer.toString(),
                "employeeName");

            return this;
        } // end andEmployeeNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.NAME not like", buffer.toString(),
                "employeeName");

            return this;
        } // end andEmployeeNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIn(List values) {
            if (values.size() == 1) {
                return andEmployeeNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.NAME in", values, "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotIn(List values) {
            if (values.size() == 1) {
                return andEmployeeNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.NAME not in", values, "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.NAME in", Arrays.asList(values),
                    "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.NAME not in", Arrays.asList(values),
                    "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employeeA.NAME between", value1, value2,
                "employeeName");

            return this;
        } // end andEmployeeNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employeeA.NAME not between", value1, value2,
                "employeeName");

            return this;
        } // end andEmployeeNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameIsNull() {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME is null");

            return this;
        } // end andDepartmentNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME is not null");

            return this;
        } // end andDepartmentNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameIsNotEmpty() {
            addCriterion(
                "sysDepartmentA.DEPARTMENT_NAME is not null AND sysDepartmentA.DEPARTMENT_NAME <> ''");

            return this;
        } // end andDepartmentNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameIsEmpty() {
            addCriterion(
                "(sysDepartmentA.DEPARTMENT_NAME is null OR sysDepartmentA.DEPARTMENT_NAME = '')");

            return this;
        } // end andDepartmentNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME =", value,
                "departmentName");

            return this;
        } // end andDepartmentNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysDepartmentA.DEPARTMENT_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME <>", value,
                "departmentName");

            return this;
        } // end andDepartmentNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameNotEqualToOrIsNull(String value) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME is null OR sysDepartmentA.DEPARTMENT_NAME <>",
                value, "departmentName");

            return this;
        } // end andDepartmentNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysDepartmentA.DEPARTMENT_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME >", value,
                "departmentName");

            return this;
        } // end andDepartmentNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysDepartmentA.DEPARTMENT_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME >=", value,
                "departmentName");

            return this;
        } // end andDepartmentNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysDepartmentA.DEPARTMENT_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME <", value,
                "departmentName");

            return this;
        } // end andDepartmentNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysDepartmentA.DEPARTMENT_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME <=", value,
                "departmentName");

            return this;
        } // end andDepartmentNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysDepartmentA.DEPARTMENT_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDepartmentNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysDepartmentA.DEPARTMENT_NAME like",
                buffer.toString(), "departmentName");

            return this;
        } // end andDepartmentNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysDepartmentA.DEPARTMENT_NAME not like",
                buffer.toString(), "departmentName");

            return this;
        } // end andDepartmentNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameIn(List values) {
            if (values.size() == 1) {
                return andDepartmentNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysDepartmentA.DEPARTMENT_NAME in", values,
                    "departmentName");

                return this;
            } // end else
        } // end andDepartmentNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameNotIn(List values) {
            if (values.size() == 1) {
                return andDepartmentNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysDepartmentA.DEPARTMENT_NAME not in", values,
                    "departmentName");

                return this;
            } // end else
        } // end andDepartmentNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameIn(Object[] values) {
            if (values.length == 1) {
                return andDepartmentNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysDepartmentA.DEPARTMENT_NAME in",
                    Arrays.asList(values), "departmentName");

                return this;
            } // end else
        } // end andDepartmentNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andDepartmentNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysDepartmentA.DEPARTMENT_NAME not in",
                    Arrays.asList(values), "departmentName");

                return this;
            } // end else
        } // end andDepartmentNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME between", value1,
                value2, "departmentName");

            return this;
        } // end andDepartmentNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("sysDepartmentA.DEPARTMENT_NAME not between", value1,
                value2, "departmentName");

            return this;
        } // end andDepartmentNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdIsNull() {
            addCriterion("sysDepartmentA.PARENT_ID is null");

            return this;
        } // end andParentDepartmentIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdIsNotNull() {
            addCriterion("sysDepartmentA.PARENT_ID is not null");

            return this;
        } // end andParentDepartmentIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdIsNotEmpty() {
            addCriterion(
                "sysDepartmentA.PARENT_ID is not null AND sysDepartmentA.PARENT_ID <> ''");

            return this;
        } // end andParentDepartmentIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdIsEmpty() {
            addCriterion(
                "(sysDepartmentA.PARENT_ID is null OR sysDepartmentA.PARENT_ID = '')");

            return this;
        } // end andParentDepartmentIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdEqualTo(long value) {
            return andParentDepartmentIdEqualTo(Long.valueOf(value));
        } // end andParentDepartmentIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdEqualTo(java.lang.Long value) {
            addCriterion("sysDepartmentA.PARENT_ID =", value,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDepartmentA.PARENT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentDepartmentIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotEqualTo(long value) {
            return andParentDepartmentIdNotEqualTo(Long.valueOf(value));
        } // end andParentDepartmentIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotEqualTo(java.lang.Long value) {
            addCriterion("sysDepartmentA.PARENT_ID <>", value,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotEqualToOrIsNull(long value) {
            return andParentDepartmentIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andParentDepartmentIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("sysDepartmentA.PARENT_ID is null OR sysDepartmentA.PARENT_ID <>",
                value, "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDepartmentA.PARENT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentDepartmentIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdGreaterThan(long value) {
            return andParentDepartmentIdGreaterThan(Long.valueOf(value));
        } // end andParentDepartmentIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdGreaterThan(java.lang.Long value) {
            addCriterion("sysDepartmentA.PARENT_ID >", value,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDepartmentA.PARENT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentDepartmentIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdGreaterThanOrEqualTo(long value) {
            return andParentDepartmentIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andParentDepartmentIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("sysDepartmentA.PARENT_ID >=", value,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDepartmentA.PARENT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentDepartmentIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdLessThan(long value) {
            return andParentDepartmentIdLessThan(Long.valueOf(value));
        } // end andParentDepartmentIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdLessThan(java.lang.Long value) {
            addCriterion("sysDepartmentA.PARENT_ID <", value,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDepartmentA.PARENT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentDepartmentIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdLessThanOrEqualTo(long value) {
            return andParentDepartmentIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andParentDepartmentIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("sysDepartmentA.PARENT_ID <=", value,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDepartmentA.PARENT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentDepartmentIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdIn(long[] values) {
            if (values.length == 1) {
                return andParentDepartmentIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("sysDepartmentA.PARENT_ID in", values,
                    "parentDepartmentId");

                return this;
            } // end else
        } // end andParentDepartmentIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotIn(long[] values) {
            if (values.length == 1) {
                return andParentDepartmentIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("sysDepartmentA.PARENT_ID not in", values,
                    "parentDepartmentId");

                return this;
            } // end else
        } // end andParentDepartmentIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdIn(List values) {
            if (values.size() == 1) {
                return andParentDepartmentIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("sysDepartmentA.PARENT_ID in", values,
                    "parentDepartmentId");

                return this;
            } // end else
        } // end andParentDepartmentIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentDepartmentIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("sysDepartmentA.PARENT_ID not in", values,
                    "parentDepartmentId");

                return this;
            } // end else
        } // end andParentDepartmentIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentDepartmentIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("sysDepartmentA.PARENT_ID in",
                    Arrays.asList(values), "parentDepartmentId");

                return this;
            } // end else
        } // end andParentDepartmentIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentDepartmentIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("sysDepartmentA.PARENT_ID not in",
                    Arrays.asList(values), "parentDepartmentId");

                return this;
            } // end else
        } // end andParentDepartmentIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdBetween(long value1, long value2) {
            addCriterion("sysDepartmentA.PARENT_ID between", value1, value2,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("sysDepartmentA.PARENT_ID between", value1, value2,
                "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotBetween(long value1, long value2) {
            addCriterion("sysDepartmentA.PARENT_ID not between", value1,
                value2, "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentDepartmentIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("sysDepartmentA.PARENT_ID not between", value1,
                value2, "parentDepartmentId");

            return this;
        } // end andParentDepartmentIdNotBetween()
    } // end Criteria
} // end EmployeeDepartmentRelateDAOQueryBean
