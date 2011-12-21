/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * BpmEmployeeRoleRelate query bean 2011-11-16 10:32:26
 *
 * @author Auto Gen
 */
public class BpmEmployeeRoleRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmEmployeeRoleRelateDAOQueryBean object.
     */
    public BpmEmployeeRoleRelateDAOQueryBean() {
        super();
    } // end BpmEmployeeRoleRelateDAOQueryBean()

    /**
     * Creates a new BpmEmployeeRoleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmEmployeeRoleRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmEmployeeRoleRelateDAOQueryBean()

    /**
     * Creates a new BpmEmployeeRoleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmEmployeeRoleRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmEmployeeRoleRelateDAOQueryBean()

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
            addSelectProperty(IBpmEmployeeRoleRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBpmRoleIdSelectProperty() {
        addBpmRoleIdSelectProperty("bpmRoleId");
    } // end addBpmRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBpmRoleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BpmRoleId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BpmRoleId, "bpmRoleId");
        } // end else
    } // end addBpmRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessInstanceIdSelectProperty() {
        addBusinessInstanceIdSelectProperty("businessInstanceId");
    } // end addBusinessInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BusinessInstanceId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BusinessInstanceId,
                "businessInstanceId");
        } // end else
    } // end addBusinessInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessTypeSelectProperty() {
        addBusinessTypeSelectProperty("businessType");
    } // end addBusinessTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BusinessType, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BusinessType,
                "businessType");
        } // end else
    } // end addBusinessTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRemarksSelectProperty() {
        addRemarksSelectProperty("remarks");
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRemarksSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

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
            addSelectProperty(IBpmEmployeeRoleRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysModuleIdSelectProperty() {
        addSysModuleIdSelectProperty("sysModuleId");
    } // end addSysModuleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysModuleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.SysModuleId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.SysModuleId,
                "sysModuleId");
        } // end else
    } // end addSysModuleIdSelectProperty()

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
            addSelectProperty(IBpmEmployeeRoleRelateDAO.EmployeeId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.EmployeeId, "employeeId");
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
            addSelectProperty(IBpmEmployeeRoleRelateDAO.EmployeeName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.EmployeeName,
                "employeeName");
        } // end else
    } // end addEmployeeNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBpmRoleNameSelectProperty() {
        addBpmRoleNameSelectProperty("bpmRoleName");
    } // end addBpmRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBpmRoleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BpmRoleName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BpmRoleName,
                "bpmRoleName");
        } // end else
    } // end addBpmRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBpmRoleKeySelectProperty() {
        addBpmRoleKeySelectProperty("bpmRoleKey");
    } // end addBpmRoleKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBpmRoleKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BpmRoleKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.BpmRoleKey, "bpmRoleKey");
        } // end else
    } // end addBpmRoleKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysModuleCodeSelectProperty() {
        addSysModuleCodeSelectProperty("sysModuleCode");
    } // end addSysModuleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysModuleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.SysModuleCode, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.SysModuleCode,
                "sysModuleCode");
        } // end else
    } // end addSysModuleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysModuleNameSelectProperty() {
        addSysModuleNameSelectProperty("sysModuleName");
    } // end addSysModuleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysModuleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.SysModuleName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.SysModuleName,
                "sysModuleName");
        } // end else
    } // end addSysModuleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEmployeeCodeSelectProperty() {
        addEmployeeCodeSelectProperty("employeeCode");
    } // end addEmployeeCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEmployeeCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.EmployeeCode, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.EmployeeCode,
                "employeeCode");
        } // end else
    } // end addEmployeeCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProjectIdSelectProperty() {
        addProjectIdSelectProperty("projectId");
    } // end addProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.ProjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.ProjectId, "projectId");
        } // end else
    } // end addProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductIdSelectProperty() {
        addProductIdSelectProperty("productId");
    } // end addProductIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.ProductId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.ProductId, "productId");
        } // end else
    } // end addProductIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamIdSelectProperty() {
        addTeamIdSelectProperty("teamId");
    } // end addTeamIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.TeamId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.TeamId, "teamId");
        } // end else
    } // end addTeamIdSelectProperty()

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
            addSelectProperty(IBpmEmployeeRoleRelateDAO.DepartmentId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmEmployeeRoleRelateDAO.DepartmentId,
                "departmentId");
        } // end else
    } // end addDepartmentIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addBpmRoleIdSelectProperty();

        addBusinessInstanceIdSelectProperty();

        addBusinessTypeSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addSysModuleIdSelectProperty();

        addEmployeeIdSelectProperty();

        addEmployeeNameSelectProperty();

        addBpmRoleNameSelectProperty();

        addBpmRoleKeySelectProperty();

        addSysModuleCodeSelectProperty();

        addSysModuleNameSelectProperty();

        addEmployeeCodeSelectProperty();

        addProjectIdSelectProperty();

        addProductIdSelectProperty();

        addTeamIdSelectProperty();

        addDepartmentIdSelectProperty();
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.ID is null OR BPM_EMPLOYEE_ROLE_RELATE.ID = '')");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_EMPLOYEE_ROLE_RELATE.ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID <>", value, "id");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID is null OR BPM_EMPLOYEE_ROLE_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_EMPLOYEE_ROLE_RELATE.ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_EMPLOYEE_ROLE_RELATE.ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_EMPLOYEE_ROLE_RELATE.ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_EMPLOYEE_ROLE_RELATE.ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_EMPLOYEE_ROLE_RELATE.ID");
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID in", values, "id");

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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID not in", values, "id");

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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID in", values, "id");

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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID not in", values, "id");

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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID not in",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID between", value1, value2,
                "id");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID between", value1, value2,
                "id");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID not between", value1,
                value2, "id");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID is null");

            return this;
        } // end andBpmRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID is not null");

            return this;
        } // end andBpmRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID <> ''");

            return this;
        } // end andBpmRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID = '')");

            return this;
        } // end andBpmRoleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdEqualTo(long value) {
            return andBpmRoleIdEqualTo(Long.valueOf(value));
        } // end andBpmRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID =", value,
                "bpmRoleId");

            return this;
        } // end andBpmRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotEqualTo(long value) {
            return andBpmRoleIdNotEqualTo(Long.valueOf(value));
        } // end andBpmRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID <>", value,
                "bpmRoleId");

            return this;
        } // end andBpmRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotEqualToOrIsNull(long value) {
            return andBpmRoleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBpmRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID <>",
                value, "bpmRoleId");

            return this;
        } // end andBpmRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdGreaterThan(long value) {
            return andBpmRoleIdGreaterThan(Long.valueOf(value));
        } // end andBpmRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID >", value,
                "bpmRoleId");

            return this;
        } // end andBpmRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdGreaterThanOrEqualTo(long value) {
            return andBpmRoleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBpmRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID >=", value,
                "bpmRoleId");

            return this;
        } // end andBpmRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdLessThan(long value) {
            return andBpmRoleIdLessThan(Long.valueOf(value));
        } // end andBpmRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdLessThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID <", value,
                "bpmRoleId");

            return this;
        } // end andBpmRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdLessThanOrEqualTo(long value) {
            return andBpmRoleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBpmRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID <=", value,
                "bpmRoleId");

            return this;
        } // end andBpmRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIn(long[] values) {
            if (values.length == 1) {
                return andBpmRoleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID in", values,
                    "bpmRoleId");

                return this;
            } // end else
        } // end andBpmRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBpmRoleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID not in",
                    values, "bpmRoleId");

                return this;
            } // end else
        } // end andBpmRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIn(List values) {
            if (values.size() == 1) {
                return andBpmRoleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID in", values,
                    "bpmRoleId");

                return this;
            } // end else
        } // end andBpmRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotIn(List values) {
            if (values.size() == 1) {
                return andBpmRoleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID not in",
                    values, "bpmRoleId");

                return this;
            } // end else
        } // end andBpmRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIn(Object[] values) {
            if (values.length == 1) {
                return andBpmRoleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID in",
                    Arrays.asList(values), "bpmRoleId");

                return this;
            } // end else
        } // end andBpmRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBpmRoleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID not in",
                    Arrays.asList(values), "bpmRoleId");

                return this;
            } // end else
        } // end andBpmRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID between",
                value1, value2, "bpmRoleId");

            return this;
        } // end andBpmRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID between",
                value1, value2, "bpmRoleId");

            return this;
        } // end andBpmRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID not between",
                value1, value2, "bpmRoleId");

            return this;
        } // end andBpmRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID not between",
                value1, value2, "bpmRoleId");

            return this;
        } // end andBpmRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdIsNull() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID is null");

            return this;
        } // end andBusinessInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdIsNotNull() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID is not null");

            return this;
        } // end andBusinessInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID <> ''");

            return this;
        } // end andBusinessInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID = '')");

            return this;
        } // end andBusinessInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdEqualTo(long value) {
            return andBusinessInstanceIdEqualTo(Long.valueOf(value));
        } // end andBusinessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID =",
                value, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotEqualTo(long value) {
            return andBusinessInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andBusinessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID <>",
                value, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotEqualToOrIsNull(long value) {
            return andBusinessInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBusinessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID <>",
                value, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdGreaterThan(long value) {
            return andBusinessInstanceIdGreaterThan(Long.valueOf(value));
        } // end andBusinessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID >",
                value, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdGreaterThanOrEqualTo(long value) {
            return andBusinessInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID >=",
                value, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdLessThan(long value) {
            return andBusinessInstanceIdLessThan(Long.valueOf(value));
        } // end andBusinessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdLessThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID <",
                value, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdLessThanOrEqualTo(long value) {
            return andBusinessInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID <=",
                value, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andBusinessInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID in",
                    values, "businessInstanceId");

                return this;
            } // end else
        } // end andBusinessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBusinessInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID not in",
                    values, "businessInstanceId");

                return this;
            } // end else
        } // end andBusinessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andBusinessInstanceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID in",
                    values, "businessInstanceId");

                return this;
            } // end else
        } // end andBusinessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID not in",
                    values, "businessInstanceId");

                return this;
            } // end else
        } // end andBusinessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID in",
                    Arrays.asList(values), "businessInstanceId");

                return this;
            } // end else
        } // end andBusinessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID not in",
                    Arrays.asList(values), "businessInstanceId");

                return this;
            } // end else
        } // end andBusinessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID between",
                value1, value2, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID between",
                value1, value2, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID not between",
                value1, value2, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID not between",
                value1, value2, "businessInstanceId");

            return this;
        } // end andBusinessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE is null");

            return this;
        } // end andBusinessTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE is not null");

            return this;
        } // end andBusinessTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE is not null AND BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE <> ''");

            return this;
        } // end andBusinessTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE is null OR BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE = '')");

            return this;
        } // end andBusinessTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE =", value,
                "businessType");

            return this;
        } // end andBusinessTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE <>", value,
                "businessType");

            return this;
        } // end andBusinessTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeNotEqualToOrIsNull(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE is null OR BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE <>",
                value, "businessType");

            return this;
        } // end andBusinessTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE >", value,
                "businessType");

            return this;
        } // end andBusinessTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE >=", value,
                "businessType");

            return this;
        } // end andBusinessTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE <", value,
                "businessType");

            return this;
        } // end andBusinessTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE <=", value,
                "businessType");

            return this;
        } // end andBusinessTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE like",
                buffer.toString(), "businessType");

            return this;
        } // end andBusinessTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE not like",
                buffer.toString(), "businessType");

            return this;
        } // end andBusinessTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeIn(List values) {
            if (values.size() == 1) {
                return andBusinessTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE in",
                    values, "businessType");

                return this;
            } // end else
        } // end andBusinessTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE not in",
                    values, "businessType");

                return this;
            } // end else
        } // end andBusinessTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE in",
                    Arrays.asList(values), "businessType");

                return this;
            } // end else
        } // end andBusinessTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE not in",
                    Arrays.asList(values), "businessType");

                return this;
            } // end else
        } // end andBusinessTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE between",
                value1, value2, "businessType");

            return this;
        } // end andBusinessTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE not between",
                value1, value2, "businessType");

            return this;
        } // end andBusinessTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.REMARKS is not null AND BPM_EMPLOYEE_ROLE_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.REMARKS is null OR BPM_EMPLOYEE_ROLE_RELATE.REMARKS = '')");

            return this;
        } // end andRemarksIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS =", value, "remarks");

            return this;
        } // end andRemarksEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.REMARKS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS <>", value, "remarks");

            return this;
        } // end andRemarksNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotEqualToOrIsNull(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS is null OR BPM_EMPLOYEE_ROLE_RELATE.REMARKS <>",
                value, "remarks");

            return this;
        } // end andRemarksNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.REMARKS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS >", value, "remarks");

            return this;
        } // end andRemarksGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.REMARKS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS >=", value, "remarks");

            return this;
        } // end andRemarksGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.REMARKS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThan(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS <", value, "remarks");

            return this;
        } // end andRemarksLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.REMARKS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS <=", value, "remarks");

            return this;
        } // end andRemarksLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.REMARKS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS like",
                buffer.toString(), "remarks");

            return this;
        } // end andRemarksLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS not like",
                buffer.toString(), "remarks");

            return this;
        } // end andRemarksNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIn(List values) {
            if (values.size() == 1) {
                return andRemarksEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS in", values,
                    "remarks");

                return this;
            } // end else
        } // end andRemarksIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotIn(List values) {
            if (values.size() == 1) {
                return andRemarksNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS not in", values,
                    "remarks");

                return this;
            } // end else
        } // end andRemarksNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS in",
                    Arrays.asList(values), "remarks");

                return this;
            } // end else
        } // end andRemarksIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS not in",
                    Arrays.asList(values), "remarks");

                return this;
            } // end else
        } // end andRemarksNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.STATUS is not null AND BPM_EMPLOYEE_ROLE_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.STATUS is null OR BPM_EMPLOYEE_ROLE_RELATE.STATUS = '')");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS =", value, "status");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS <>", value, "status");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS is null OR BPM_EMPLOYEE_ROLE_RELATE.STATUS <>",
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
                    "BPM_EMPLOYEE_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS >", value, "status");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS >=", value, "status");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS <", value, "status");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS <=", value, "status");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS like",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS not like",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS in", values,
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS not in", values,
                    "status");

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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS not in",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS between", value1,
                value2, "status");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID is null");

            return this;
        } // end andSysModuleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID is not null");

            return this;
        } // end andSysModuleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID <> ''");

            return this;
        } // end andSysModuleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID = '')");

            return this;
        } // end andSysModuleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdEqualTo(long value) {
            return andSysModuleIdEqualTo(Long.valueOf(value));
        } // end andSysModuleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID =", value,
                "sysModuleId");

            return this;
        } // end andSysModuleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualTo(long value) {
            return andSysModuleIdNotEqualTo(Long.valueOf(value));
        } // end andSysModuleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID <>", value,
                "sysModuleId");

            return this;
        } // end andSysModuleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualToOrIsNull(long value) {
            return andSysModuleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSysModuleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID <>",
                value, "sysModuleId");

            return this;
        } // end andSysModuleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThan(long value) {
            return andSysModuleIdGreaterThan(Long.valueOf(value));
        } // end andSysModuleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID >", value,
                "sysModuleId");

            return this;
        } // end andSysModuleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanOrEqualTo(long value) {
            return andSysModuleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSysModuleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID >=", value,
                "sysModuleId");

            return this;
        } // end andSysModuleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThan(long value) {
            return andSysModuleIdLessThan(Long.valueOf(value));
        } // end andSysModuleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID <", value,
                "sysModuleId");

            return this;
        } // end andSysModuleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanOrEqualTo(long value) {
            return andSysModuleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSysModuleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID <=", value,
                "sysModuleId");

            return this;
        } // end andSysModuleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIn(long[] values) {
            if (values.length == 1) {
                return andSysModuleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID in",
                    values, "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSysModuleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID not in",
                    values, "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIn(List values) {
            if (values.size() == 1) {
                return andSysModuleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID in",
                    values, "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysModuleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID not in",
                    values, "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID in",
                    Arrays.asList(values), "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID not in",
                    Arrays.asList(values), "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID between",
                value1, value2, "sysModuleId");

            return this;
        } // end andSysModuleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID between",
                value1, value2, "sysModuleId");

            return this;
        } // end andSysModuleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID not between",
                value1, value2, "sysModuleId");

            return this;
        } // end andSysModuleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID not between",
                value1, value2, "sysModuleId");

            return this;
        } // end andSysModuleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID is null");

            return this;
        } // end andEmployeeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID is not null");

            return this;
        } // end andEmployeeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID <> ''");

            return this;
        } // end andEmployeeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID = '')");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID =", value,
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
                    "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID <>", value,
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID <>",
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
                    "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID >", value,
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
                    "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID >=", value,
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
                    "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID <", value,
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
                    "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID <=", value,
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
                    "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID");
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID in", values,
                    "employeeId");

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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID not in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID in", values,
                    "employeeId");

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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID not in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID not in",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID between",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID between",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID not between",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID not between",
                value1, value2, "employeeId");

            return this;
        } // end andEmployeeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNull() {
            addCriterion("employeeC.NAME is null");

            return this;
        } // end andEmployeeNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employeeC.NAME is not null");

            return this;
        } // end andEmployeeNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNotEmpty() {
            addCriterion("employeeC.NAME is not null AND employeeC.NAME <> ''");

            return this;
        } // end andEmployeeNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsEmpty() {
            addCriterion("(employeeC.NAME is null OR employeeC.NAME = '')");

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
            addCriterion("employeeC.NAME =", value, "employeeName");

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
            StringBuffer str = new StringBuffer("employeeC.NAME");
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
            addCriterion("employeeC.NAME <>", value, "employeeName");

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
            addCriterion("employeeC.NAME is null OR employeeC.NAME <>", value,
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
            StringBuffer str = new StringBuffer("employeeC.NAME");
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
            addCriterion("employeeC.NAME >", value, "employeeName");

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
            StringBuffer str = new StringBuffer("employeeC.NAME");
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
            addCriterion("employeeC.NAME >=", value, "employeeName");

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
            StringBuffer str = new StringBuffer("employeeC.NAME");
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
            addCriterion("employeeC.NAME <", value, "employeeName");

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
            StringBuffer str = new StringBuffer("employeeC.NAME");
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
            addCriterion("employeeC.NAME <=", value, "employeeName");

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
            StringBuffer str = new StringBuffer("employeeC.NAME");
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
            addCriterion("employeeC.NAME like", buffer.toString(),
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
            addCriterion("employeeC.NAME not like", buffer.toString(),
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
                addCriterion("employeeC.NAME in", values, "employeeName");

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
                addCriterion("employeeC.NAME not in", values, "employeeName");

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
                addCriterion("employeeC.NAME in", Arrays.asList(values),
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
                addCriterion("employeeC.NAME not in", Arrays.asList(values),
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
            addCriterion("employeeC.NAME between", value1, value2,
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
            addCriterion("employeeC.NAME not between", value1, value2,
                "employeeName");

            return this;
        } // end andEmployeeNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameIsNull() {
            addCriterion("bpmRoleC.ROLE_NAME is null");

            return this;
        } // end andBpmRoleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameIsNotNull() {
            addCriterion("bpmRoleC.ROLE_NAME is not null");

            return this;
        } // end andBpmRoleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameIsNotEmpty() {
            addCriterion(
                "bpmRoleC.ROLE_NAME is not null AND bpmRoleC.ROLE_NAME <> ''");

            return this;
        } // end andBpmRoleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameIsEmpty() {
            addCriterion(
                "(bpmRoleC.ROLE_NAME is null OR bpmRoleC.ROLE_NAME = '')");

            return this;
        } // end andBpmRoleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_NAME =", value, "bpmRoleName");

            return this;
        } // end andBpmRoleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameNotEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_NAME <>", value, "bpmRoleName");

            return this;
        } // end andBpmRoleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameNotEqualToOrIsNull(String value) {
            addCriterion("bpmRoleC.ROLE_NAME is null OR bpmRoleC.ROLE_NAME <>",
                value, "bpmRoleName");

            return this;
        } // end andBpmRoleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameGreaterThan(String value) {
            addCriterion("bpmRoleC.ROLE_NAME >", value, "bpmRoleName");

            return this;
        } // end andBpmRoleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_NAME >=", value, "bpmRoleName");

            return this;
        } // end andBpmRoleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameLessThan(String value) {
            addCriterion("bpmRoleC.ROLE_NAME <", value, "bpmRoleName");

            return this;
        } // end andBpmRoleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameLessThanOrEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_NAME <=", value, "bpmRoleName");

            return this;
        } // end andBpmRoleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleC.ROLE_NAME like", buffer.toString(),
                "bpmRoleName");

            return this;
        } // end andBpmRoleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleC.ROLE_NAME not like", buffer.toString(),
                "bpmRoleName");

            return this;
        } // end andBpmRoleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameIn(List values) {
            if (values.size() == 1) {
                return andBpmRoleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_NAME in", values, "bpmRoleName");

                return this;
            } // end else
        } // end andBpmRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameNotIn(List values) {
            if (values.size() == 1) {
                return andBpmRoleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_NAME not in", values, "bpmRoleName");

                return this;
            } // end else
        } // end andBpmRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameIn(Object[] values) {
            if (values.length == 1) {
                return andBpmRoleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_NAME in", Arrays.asList(values),
                    "bpmRoleName");

                return this;
            } // end else
        } // end andBpmRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andBpmRoleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_NAME not in",
                    Arrays.asList(values), "bpmRoleName");

                return this;
            } // end else
        } // end andBpmRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameBetween(String value1, String value2) {
            addCriterion("bpmRoleC.ROLE_NAME between", value1, value2,
                "bpmRoleName");

            return this;
        } // end andBpmRoleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleNameNotBetween(String value1, String value2) {
            addCriterion("bpmRoleC.ROLE_NAME not between", value1, value2,
                "bpmRoleName");

            return this;
        } // end andBpmRoleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyIsNull() {
            addCriterion("bpmRoleC.ROLE_KEY is null");

            return this;
        } // end andBpmRoleKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyIsNotNull() {
            addCriterion("bpmRoleC.ROLE_KEY is not null");

            return this;
        } // end andBpmRoleKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyIsNotEmpty() {
            addCriterion(
                "bpmRoleC.ROLE_KEY is not null AND bpmRoleC.ROLE_KEY <> ''");

            return this;
        } // end andBpmRoleKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyIsEmpty() {
            addCriterion(
                "(bpmRoleC.ROLE_KEY is null OR bpmRoleC.ROLE_KEY = '')");

            return this;
        } // end andBpmRoleKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_KEY =", value, "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyNotEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_KEY <>", value, "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyNotEqualToOrIsNull(String value) {
            addCriterion("bpmRoleC.ROLE_KEY is null OR bpmRoleC.ROLE_KEY <>",
                value, "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyGreaterThan(String value) {
            addCriterion("bpmRoleC.ROLE_KEY >", value, "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_KEY >=", value, "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyLessThan(String value) {
            addCriterion("bpmRoleC.ROLE_KEY <", value, "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyLessThanOrEqualTo(String value) {
            addCriterion("bpmRoleC.ROLE_KEY <=", value, "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleC.ROLE_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmRoleKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleC.ROLE_KEY like", buffer.toString(),
                "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleC.ROLE_KEY not like", buffer.toString(),
                "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyIn(List values) {
            if (values.size() == 1) {
                return andBpmRoleKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_KEY in", values, "bpmRoleKey");

                return this;
            } // end else
        } // end andBpmRoleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyNotIn(List values) {
            if (values.size() == 1) {
                return andBpmRoleKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_KEY not in", values, "bpmRoleKey");

                return this;
            } // end else
        } // end andBpmRoleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyIn(Object[] values) {
            if (values.length == 1) {
                return andBpmRoleKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_KEY in", Arrays.asList(values),
                    "bpmRoleKey");

                return this;
            } // end else
        } // end andBpmRoleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andBpmRoleKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleC.ROLE_KEY not in", Arrays.asList(values),
                    "bpmRoleKey");

                return this;
            } // end else
        } // end andBpmRoleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyBetween(String value1, String value2) {
            addCriterion("bpmRoleC.ROLE_KEY between", value1, value2,
                "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleKeyNotBetween(String value1, String value2) {
            addCriterion("bpmRoleC.ROLE_KEY not between", value1, value2,
                "bpmRoleKey");

            return this;
        } // end andBpmRoleKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsNull() {
            addCriterion("sysModuleC.MODULE_CODE is null");

            return this;
        } // end andSysModuleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsNotNull() {
            addCriterion("sysModuleC.MODULE_CODE is not null");

            return this;
        } // end andSysModuleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsNotEmpty() {
            addCriterion(
                "sysModuleC.MODULE_CODE is not null AND sysModuleC.MODULE_CODE <> ''");

            return this;
        } // end andSysModuleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsEmpty() {
            addCriterion(
                "(sysModuleC.MODULE_CODE is null OR sysModuleC.MODULE_CODE = '')");

            return this;
        } // end andSysModuleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_CODE =", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_CODE <>", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotEqualToOrIsNull(String value) {
            addCriterion("sysModuleC.MODULE_CODE is null OR sysModuleC.MODULE_CODE <>",
                value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThan(String value) {
            addCriterion("sysModuleC.MODULE_CODE >", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_CODE >=", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThan(String value) {
            addCriterion("sysModuleC.MODULE_CODE <", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_CODE <=", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleC.MODULE_CODE like", buffer.toString(),
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleC.MODULE_CODE not like", buffer.toString(),
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIn(List values) {
            if (values.size() == 1) {
                return andSysModuleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_CODE in", values,
                    "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andSysModuleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_CODE not in", values,
                    "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_CODE in",
                    Arrays.asList(values), "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_CODE not in",
                    Arrays.asList(values), "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeBetween(String value1, String value2) {
            addCriterion("sysModuleC.MODULE_CODE between", value1, value2,
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotBetween(String value1, String value2) {
            addCriterion("sysModuleC.MODULE_CODE not between", value1, value2,
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsNull() {
            addCriterion("sysModuleC.MODULE_NAME is null");

            return this;
        } // end andSysModuleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsNotNull() {
            addCriterion("sysModuleC.MODULE_NAME is not null");

            return this;
        } // end andSysModuleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsNotEmpty() {
            addCriterion(
                "sysModuleC.MODULE_NAME is not null AND sysModuleC.MODULE_NAME <> ''");

            return this;
        } // end andSysModuleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsEmpty() {
            addCriterion(
                "(sysModuleC.MODULE_NAME is null OR sysModuleC.MODULE_NAME = '')");

            return this;
        } // end andSysModuleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_NAME =", value, "sysModuleName");

            return this;
        } // end andSysModuleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_NAME <>", value, "sysModuleName");

            return this;
        } // end andSysModuleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotEqualToOrIsNull(String value) {
            addCriterion("sysModuleC.MODULE_NAME is null OR sysModuleC.MODULE_NAME <>",
                value, "sysModuleName");

            return this;
        } // end andSysModuleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThan(String value) {
            addCriterion("sysModuleC.MODULE_NAME >", value, "sysModuleName");

            return this;
        } // end andSysModuleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_NAME >=", value, "sysModuleName");

            return this;
        } // end andSysModuleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThan(String value) {
            addCriterion("sysModuleC.MODULE_NAME <", value, "sysModuleName");

            return this;
        } // end andSysModuleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThanOrEqualTo(String value) {
            addCriterion("sysModuleC.MODULE_NAME <=", value, "sysModuleName");

            return this;
        } // end andSysModuleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleC.MODULE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleC.MODULE_NAME like", buffer.toString(),
                "sysModuleName");

            return this;
        } // end andSysModuleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleC.MODULE_NAME not like", buffer.toString(),
                "sysModuleName");

            return this;
        } // end andSysModuleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIn(List values) {
            if (values.size() == 1) {
                return andSysModuleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_NAME in", values,
                    "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotIn(List values) {
            if (values.size() == 1) {
                return andSysModuleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_NAME not in", values,
                    "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_NAME in",
                    Arrays.asList(values), "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleC.MODULE_NAME not in",
                    Arrays.asList(values), "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameBetween(String value1, String value2) {
            addCriterion("sysModuleC.MODULE_NAME between", value1, value2,
                "sysModuleName");

            return this;
        } // end andSysModuleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotBetween(String value1, String value2) {
            addCriterion("sysModuleC.MODULE_NAME not between", value1, value2,
                "sysModuleName");

            return this;
        } // end andSysModuleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsNull() {
            addCriterion("employeeC.CODE is null");

            return this;
        } // end andEmployeeCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("employeeC.CODE is not null");

            return this;
        } // end andEmployeeCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsNotEmpty() {
            addCriterion("employeeC.CODE is not null AND employeeC.CODE <> ''");

            return this;
        } // end andEmployeeCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsEmpty() {
            addCriterion("(employeeC.CODE is null OR employeeC.CODE = '')");

            return this;
        } // end andEmployeeCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeEqualTo(String value) {
            addCriterion("employeeC.CODE =", value, "employeeCode");

            return this;
        } // end andEmployeeCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotEqualTo(String value) {
            addCriterion("employeeC.CODE <>", value, "employeeCode");

            return this;
        } // end andEmployeeCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotEqualToOrIsNull(String value) {
            addCriterion("employeeC.CODE is null OR employeeC.CODE <>", value,
                "employeeCode");

            return this;
        } // end andEmployeeCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThan(String value) {
            addCriterion("employeeC.CODE >", value, "employeeCode");

            return this;
        } // end andEmployeeCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("employeeC.CODE >=", value, "employeeCode");

            return this;
        } // end andEmployeeCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThan(String value) {
            addCriterion("employeeC.CODE <", value, "employeeCode");

            return this;
        } // end andEmployeeCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThanOrEqualTo(String value) {
            addCriterion("employeeC.CODE <=", value, "employeeCode");

            return this;
        } // end andEmployeeCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeC.CODE like", buffer.toString(),
                "employeeCode");

            return this;
        } // end andEmployeeCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeC.CODE not like", buffer.toString(),
                "employeeCode");

            return this;
        } // end andEmployeeCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIn(List values) {
            if (values.size() == 1) {
                return andEmployeeCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeC.CODE in", values, "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotIn(List values) {
            if (values.size() == 1) {
                return andEmployeeCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeC.CODE not in", values, "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeC.CODE in", Arrays.asList(values),
                    "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeC.CODE not in", Arrays.asList(values),
                    "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeBetween(String value1, String value2) {
            addCriterion("employeeC.CODE between", value1, value2,
                "employeeCode");

            return this;
        } // end andEmployeeCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotBetween(String value1, String value2) {
            addCriterion("employeeC.CODE not between", value1, value2,
                "employeeCode");

            return this;
        } // end andEmployeeCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID is null");

            return this;
        } // end andProjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID is not null");

            return this;
        } // end andProjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID <> ''");

            return this;
        } // end andProjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID = '')");

            return this;
        } // end andProjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualTo(long value) {
            return andProjectIdEqualTo(Long.valueOf(value));
        } // end andProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID =", value,
                "projectId");

            return this;
        } // end andProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualTo(long value) {
            return andProjectIdNotEqualTo(Long.valueOf(value));
        } // end andProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID <>", value,
                "projectId");

            return this;
        } // end andProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToOrIsNull(long value) {
            return andProjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID <>",
                value, "projectId");

            return this;
        } // end andProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThan(long value) {
            return andProjectIdGreaterThan(Long.valueOf(value));
        } // end andProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID >", value,
                "projectId");

            return this;
        } // end andProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualTo(long value) {
            return andProjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID >=", value,
                "projectId");

            return this;
        } // end andProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThan(long value) {
            return andProjectIdLessThan(Long.valueOf(value));
        } // end andProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID <", value,
                "projectId");

            return this;
        } // end andProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualTo(long value) {
            return andProjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID <=", value,
                "projectId");

            return this;
        } // end andProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(long[] values) {
            if (values.length == 1) {
                return andProjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID not in",
                    values, "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(List values) {
            if (values.size() == 1) {
                return andProjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andProjectIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID not in",
                    values, "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andProjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID in",
                    Arrays.asList(values), "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID not in",
                    Arrays.asList(values), "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID between", value1,
                value2, "projectId");

            return this;
        } // end andProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID between", value1,
                value2, "projectId");

            return this;
        } // end andProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID not between",
                value1, value2, "projectId");

            return this;
        } // end andProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID not between",
                value1, value2, "projectId");

            return this;
        } // end andProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID is null");

            return this;
        } // end andProductIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID is not null");

            return this;
        } // end andProductIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID <> ''");

            return this;
        } // end andProductIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID = '')");

            return this;
        } // end andProductIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdEqualTo(long value) {
            return andProductIdEqualTo(Long.valueOf(value));
        } // end andProductIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID =", value,
                "productId");

            return this;
        } // end andProductIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualTo(long value) {
            return andProductIdNotEqualTo(Long.valueOf(value));
        } // end andProductIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID <>", value,
                "productId");

            return this;
        } // end andProductIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualToOrIsNull(long value) {
            return andProductIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProductIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID <>",
                value, "productId");

            return this;
        } // end andProductIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThan(long value) {
            return andProductIdGreaterThan(Long.valueOf(value));
        } // end andProductIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID >", value,
                "productId");

            return this;
        } // end andProductIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanOrEqualTo(long value) {
            return andProductIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProductIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID >=", value,
                "productId");

            return this;
        } // end andProductIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThan(long value) {
            return andProductIdLessThan(Long.valueOf(value));
        } // end andProductIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID <", value,
                "productId");

            return this;
        } // end andProductIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanOrEqualTo(long value) {
            return andProductIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProductIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID <=", value,
                "productId");

            return this;
        } // end andProductIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIn(long[] values) {
            if (values.length == 1) {
                return andProductIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID in", values,
                    "productId");

                return this;
            } // end else
        } // end andProductIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProductIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID not in",
                    values, "productId");

                return this;
            } // end else
        } // end andProductIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIn(List values) {
            if (values.size() == 1) {
                return andProductIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID in", values,
                    "productId");

                return this;
            } // end else
        } // end andProductIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotIn(List values) {
            if (values.size() == 1) {
                return andProductIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID not in",
                    values, "productId");

                return this;
            } // end else
        } // end andProductIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIn(Object[] values) {
            if (values.length == 1) {
                return andProductIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID in",
                    Arrays.asList(values), "productId");

                return this;
            } // end else
        } // end andProductIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID not in",
                    Arrays.asList(values), "productId");

                return this;
            } // end else
        } // end andProductIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID between", value1,
                value2, "productId");

            return this;
        } // end andProductIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID between", value1,
                value2, "productId");

            return this;
        } // end andProductIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID not between",
                value1, value2, "productId");

            return this;
        } // end andProductIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID not between",
                value1, value2, "productId");

            return this;
        } // end andProductIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID is null");

            return this;
        } // end andTeamIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID is not null");

            return this;
        } // end andTeamIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID <> ''");

            return this;
        } // end andTeamIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID = '')");

            return this;
        } // end andTeamIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualTo(long value) {
            return andTeamIdEqualTo(Long.valueOf(value));
        } // end andTeamIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID =", value, "teamId");

            return this;
        } // end andTeamIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualTo(long value) {
            return andTeamIdNotEqualTo(Long.valueOf(value));
        } // end andTeamIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID <>", value, "teamId");

            return this;
        } // end andTeamIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToOrIsNull(long value) {
            return andTeamIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTeamIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID <>",
                value, "teamId");

            return this;
        } // end andTeamIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThan(long value) {
            return andTeamIdGreaterThan(Long.valueOf(value));
        } // end andTeamIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID >", value, "teamId");

            return this;
        } // end andTeamIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualTo(long value) {
            return andTeamIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTeamIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID >=", value, "teamId");

            return this;
        } // end andTeamIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThan(long value) {
            return andTeamIdLessThan(Long.valueOf(value));
        } // end andTeamIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThan(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID <", value, "teamId");

            return this;
        } // end andTeamIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualTo(long value) {
            return andTeamIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTeamIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID <=", value, "teamId");

            return this;
        } // end andTeamIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(long[] values) {
            if (values.length == 1) {
                return andTeamIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTeamIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID not in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(List values) {
            if (values.size() == 1) {
                return andTeamIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(List values) {
            if (values.size() == 1) {
                return andTeamIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID not in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(Object[] values) {
            if (values.length == 1) {
                return andTeamIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID in",
                    Arrays.asList(values), "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID not in",
                    Arrays.asList(values), "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotBetween(long value1, long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID not between",
                value1, value2, "teamId");

            return this;
        } // end andTeamIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID not between",
                value1, value2, "teamId");

            return this;
        } // end andTeamIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID is null");

            return this;
        } // end andDepartmentIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID is not null");

            return this;
        } // end andDepartmentIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsNotEmpty() {
            addCriterion(
                "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID is not null AND BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID <> ''");

            return this;
        } // end andDepartmentIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDepartmentIdIsEmpty() {
            addCriterion(
                "(BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID = '')");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID =", value,
                "departmentId");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID <>", value,
                "departmentId");

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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID is null OR BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID <>",
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
                    "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID >", value,
                "departmentId");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID >=", value,
                "departmentId");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID <", value,
                "departmentId");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID");
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID <=", value,
                "departmentId");

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
                    "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID");
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID not in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID not in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID in",
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
                addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID not in",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID between",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID between",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID not between",
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
            addCriterion("BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID not between",
                value1, value2, "departmentId");

            return this;
        } // end andDepartmentIdNotBetween()
    } // end Criteria
} // end BpmEmployeeRoleRelateDAOQueryBean
