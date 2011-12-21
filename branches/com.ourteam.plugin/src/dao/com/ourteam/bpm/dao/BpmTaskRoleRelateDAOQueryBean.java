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
 * BpmTaskRoleRelate query bean 2011-11-30 15:28:13
 *
 * @author Auto Gen
 */
public class BpmTaskRoleRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmTaskRoleRelateDAOQueryBean object.
     */
    public BpmTaskRoleRelateDAOQueryBean() {
        super();
    } // end BpmTaskRoleRelateDAOQueryBean()

    /**
     * Creates a new BpmTaskRoleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmTaskRoleRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmTaskRoleRelateDAOQueryBean()

    /**
     * Creates a new BpmTaskRoleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmTaskRoleRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmTaskRoleRelateDAOQueryBean()

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
            addSelectProperty(IBpmTaskRoleRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(IBpmTaskRoleRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleIdSelectProperty() {
        addRoleIdSelectProperty("roleId");
    } // end addRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskRoleRelateDAO.RoleId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.RoleId, "roleId");
        } // end else
    } // end addRoleIdSelectProperty()

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
            addSelectProperty(IBpmTaskRoleRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTaskIdSelectProperty() {
        addTaskIdSelectProperty("taskId");
    } // end addTaskIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTaskIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskRoleRelateDAO.TaskId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.TaskId, "taskId");
        } // end else
    } // end addTaskIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessInstanceIdSelectProperty() {
        addProcessInstanceIdSelectProperty("processInstanceId");
    } // end addProcessInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskRoleRelateDAO.ProcessInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.ProcessInstanceId,
                "processInstanceId");
        } // end else
    } // end addProcessInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTaskNameSelectProperty() {
        addTaskNameSelectProperty("taskName");
    } // end addTaskNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTaskNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskRoleRelateDAO.TaskName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.TaskName, "taskName");
        } // end else
    } // end addTaskNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTaskSerialNumberSelectProperty() {
        addTaskSerialNumberSelectProperty("taskSerialNumber");
    } // end addTaskSerialNumberSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTaskSerialNumberSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskRoleRelateDAO.TaskSerialNumber, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskRoleRelateDAO.TaskSerialNumber,
                "taskSerialNumber");
        } // end else
    } // end addTaskSerialNumberSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addRoleIdSelectProperty();

        addStatusSelectProperty();

        addTaskIdSelectProperty();

        addProcessInstanceIdSelectProperty();

        addTaskNameSelectProperty();

        addTaskSerialNumberSelectProperty();
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
            addCriterion("BPM_TASK_ROLE_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_TASK_ROLE_RELATE.ID is not null AND BPM_TASK_ROLE_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_TASK_ROLE_RELATE.ID is null OR BPM_TASK_ROLE_RELATE.ID = '')");

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
            addCriterion("BPM_TASK_ROLE_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ID");
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
            addCriterion("BPM_TASK_ROLE_RELATE.ID <>", value, "id");

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
            addCriterion("BPM_TASK_ROLE_RELATE.ID is null OR BPM_TASK_ROLE_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ID");
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
            addCriterion("BPM_TASK_ROLE_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ID");
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
            addCriterion("BPM_TASK_ROLE_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ID");
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
            addCriterion("BPM_TASK_ROLE_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ID");
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
            addCriterion("BPM_TASK_ROLE_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ID");
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
                addCriterion("BPM_TASK_ROLE_RELATE.ID in", values, "id");

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
                addCriterion("BPM_TASK_ROLE_RELATE.ID not in", values, "id");

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
                addCriterion("BPM_TASK_ROLE_RELATE.ID in", values, "id");

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
                addCriterion("BPM_TASK_ROLE_RELATE.ID not in", values, "id");

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
                addCriterion("BPM_TASK_ROLE_RELATE.ID in",
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
                addCriterion("BPM_TASK_ROLE_RELATE.ID not in",
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
            addCriterion("BPM_TASK_ROLE_RELATE.ID between", value1, value2, "id");

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
            addCriterion("BPM_TASK_ROLE_RELATE.ID between", value1, value2, "id");

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
            addCriterion("BPM_TASK_ROLE_RELATE.ID not between", value1, value2,
                "id");

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
            addCriterion("BPM_TASK_ROLE_RELATE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_TASK_ROLE_RELATE.REMARKS is not null AND BPM_TASK_ROLE_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_TASK_ROLE_RELATE.REMARKS is null OR BPM_TASK_ROLE_RELATE.REMARKS = '')");

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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.REMARKS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS is null OR BPM_TASK_ROLE_RELATE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.REMARKS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.REMARKS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.REMARKS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.REMARKS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.REMARKS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS like",
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS not like",
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
                addCriterion("BPM_TASK_ROLE_RELATE.REMARKS in", values,
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
                addCriterion("BPM_TASK_ROLE_RELATE.REMARKS not in", values,
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
                addCriterion("BPM_TASK_ROLE_RELATE.REMARKS in",
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
                addCriterion("BPM_TASK_ROLE_RELATE.REMARKS not in",
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS between", value1,
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
            addCriterion("BPM_TASK_ROLE_RELATE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID is null");

            return this;
        } // end andRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNotNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID is not null");

            return this;
        } // end andRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNotEmpty() {
            addCriterion(
                "BPM_TASK_ROLE_RELATE.ROLE_ID is not null AND BPM_TASK_ROLE_RELATE.ROLE_ID <> ''");

            return this;
        } // end andRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsEmpty() {
            addCriterion(
                "(BPM_TASK_ROLE_RELATE.ROLE_ID is null OR BPM_TASK_ROLE_RELATE.ROLE_ID = '')");

            return this;
        } // end andRoleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualTo(long value) {
            return andRoleIdEqualTo(Long.valueOf(value));
        } // end andRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID =", value, "roleId");

            return this;
        } // end andRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ROLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualTo(long value) {
            return andRoleIdNotEqualTo(Long.valueOf(value));
        } // end andRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID <>", value, "roleId");

            return this;
        } // end andRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToOrIsNull(long value) {
            return andRoleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID is null OR BPM_TASK_ROLE_RELATE.ROLE_ID <>",
                value, "roleId");

            return this;
        } // end andRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ROLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThan(long value) {
            return andRoleIdGreaterThan(Long.valueOf(value));
        } // end andRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID >", value, "roleId");

            return this;
        } // end andRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ROLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualTo(long value) {
            return andRoleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID >=", value, "roleId");

            return this;
        } // end andRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ROLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThan(long value) {
            return andRoleIdLessThan(Long.valueOf(value));
        } // end andRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThan(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID <", value, "roleId");

            return this;
        } // end andRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ROLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualTo(long value) {
            return andRoleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID <=", value, "roleId");

            return this;
        } // end andRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.ROLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(long[] values) {
            if (values.length == 1) {
                return andRoleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID in", values, "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRoleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID not in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(List values) {
            if (values.size() == 1) {
                return andRoleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID in", values, "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(List values) {
            if (values.size() == 1) {
                return andRoleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID not in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(Object[] values) {
            if (values.length == 1) {
                return andRoleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID in",
                    Arrays.asList(values), "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID not in",
                    Arrays.asList(values), "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdBetween(long value1, long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotBetween(long value1, long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID not between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.ROLE_ID not between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_TASK_ROLE_RELATE.STATUS is not null AND BPM_TASK_ROLE_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_TASK_ROLE_RELATE.STATUS is null OR BPM_TASK_ROLE_RELATE.STATUS = '')");

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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS <>", value, "status");

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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS is null OR BPM_TASK_ROLE_RELATE.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.STATUS");
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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS like", buffer.toString(),
                "status");

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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS not like",
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
                addCriterion("BPM_TASK_ROLE_RELATE.STATUS in", values, "status");

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
                addCriterion("BPM_TASK_ROLE_RELATE.STATUS not in", values,
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
                addCriterion("BPM_TASK_ROLE_RELATE.STATUS in",
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
                addCriterion("BPM_TASK_ROLE_RELATE.STATUS not in",
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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS between", value1, value2,
                "status");

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
            addCriterion("BPM_TASK_ROLE_RELATE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID is null");

            return this;
        } // end andTaskIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNotNull() {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID is not null");

            return this;
        } // end andTaskIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNotEmpty() {
            addCriterion(
                "BPM_TASK_ROLE_RELATE.TASK_ID is not null AND BPM_TASK_ROLE_RELATE.TASK_ID <> ''");

            return this;
        } // end andTaskIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsEmpty() {
            addCriterion(
                "(BPM_TASK_ROLE_RELATE.TASK_ID is null OR BPM_TASK_ROLE_RELATE.TASK_ID = '')");

            return this;
        } // end andTaskIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdEqualTo(long value) {
            return andTaskIdEqualTo(Long.valueOf(value));
        } // end andTaskIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID =", value, "taskId");

            return this;
        } // end andTaskIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.TASK_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualTo(long value) {
            return andTaskIdNotEqualTo(Long.valueOf(value));
        } // end andTaskIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID <>", value, "taskId");

            return this;
        } // end andTaskIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualToOrIsNull(long value) {
            return andTaskIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTaskIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID is null OR BPM_TASK_ROLE_RELATE.TASK_ID <>",
                value, "taskId");

            return this;
        } // end andTaskIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.TASK_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThan(long value) {
            return andTaskIdGreaterThan(Long.valueOf(value));
        } // end andTaskIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID >", value, "taskId");

            return this;
        } // end andTaskIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.TASK_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanOrEqualTo(long value) {
            return andTaskIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTaskIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID >=", value, "taskId");

            return this;
        } // end andTaskIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.TASK_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThan(long value) {
            return andTaskIdLessThan(Long.valueOf(value));
        } // end andTaskIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThan(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID <", value, "taskId");

            return this;
        } // end andTaskIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.TASK_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanOrEqualTo(long value) {
            return andTaskIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTaskIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID <=", value, "taskId");

            return this;
        } // end andTaskIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK_ROLE_RELATE.TASK_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIn(long[] values) {
            if (values.length == 1) {
                return andTaskIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID in", values, "taskId");

                return this;
            } // end else
        } // end andTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTaskIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID not in", values,
                    "taskId");

                return this;
            } // end else
        } // end andTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIn(List values) {
            if (values.size() == 1) {
                return andTaskIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID in", values, "taskId");

                return this;
            } // end else
        } // end andTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotIn(List values) {
            if (values.size() == 1) {
                return andTaskIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID not in", values,
                    "taskId");

                return this;
            } // end else
        } // end andTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIn(Object[] values) {
            if (values.length == 1) {
                return andTaskIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID in",
                    Arrays.asList(values), "taskId");

                return this;
            } // end else
        } // end andTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTaskIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID not in",
                    Arrays.asList(values), "taskId");

                return this;
            } // end else
        } // end andTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdBetween(long value1, long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID between", value1,
                value2, "taskId");

            return this;
        } // end andTaskIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID between", value1,
                value2, "taskId");

            return this;
        } // end andTaskIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotBetween(long value1, long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID not between", value1,
                value2, "taskId");

            return this;
        } // end andTaskIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK_ROLE_RELATE.TASK_ID not between", value1,
                value2, "taskId");

            return this;
        } // end andTaskIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID is null");

            return this;
        } // end andProcessInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID is not null");

            return this;
        } // end andProcessInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotEmpty() {
            addCriterion(
                "bpmTaskG.PROCESS_INSTANCE_ID is not null AND bpmTaskG.PROCESS_INSTANCE_ID <> ''");

            return this;
        } // end andProcessInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsEmpty() {
            addCriterion(
                "(bpmTaskG.PROCESS_INSTANCE_ID is null OR bpmTaskG.PROCESS_INSTANCE_ID = '')");

            return this;
        } // end andProcessInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualTo(long value) {
            return andProcessInstanceIdEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID =", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.PROCESS_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualTo(long value) {
            return andProcessInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID <>", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToOrIsNull(long value) {
            return andProcessInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProcessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID is null OR bpmTaskG.PROCESS_INSTANCE_ID <>",
                value, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.PROCESS_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThan(long value) {
            return andProcessInstanceIdGreaterThan(Long.valueOf(value));
        } // end andProcessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID >", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.PROCESS_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(long value) {
            return andProcessInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID >=", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.PROCESS_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThan(long value) {
            return andProcessInstanceIdLessThan(Long.valueOf(value));
        } // end andProcessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThan(java.lang.Long value) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID <", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.PROCESS_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualTo(long value) {
            return andProcessInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID <=", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.PROCESS_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.PROCESS_INSTANCE_ID in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.PROCESS_INSTANCE_ID not in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andProcessInstanceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("bpmTaskG.PROCESS_INSTANCE_ID in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andProcessInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("bpmTaskG.PROCESS_INSTANCE_ID not in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.PROCESS_INSTANCE_ID in",
                    Arrays.asList(values), "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.PROCESS_INSTANCE_ID not in",
                    Arrays.asList(values), "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdBetween(long value1, long value2) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotBetween(long value1, long value2) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID not between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("bpmTaskG.PROCESS_INSTANCE_ID not between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsNull() {
            addCriterion("bpmTaskG.TASK_NAME is null");

            return this;
        } // end andTaskNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsNotNull() {
            addCriterion("bpmTaskG.TASK_NAME is not null");

            return this;
        } // end andTaskNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsNotEmpty() {
            addCriterion(
                "bpmTaskG.TASK_NAME is not null AND bpmTaskG.TASK_NAME <> ''");

            return this;
        } // end andTaskNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsEmpty() {
            addCriterion(
                "(bpmTaskG.TASK_NAME is null OR bpmTaskG.TASK_NAME = '')");

            return this;
        } // end andTaskNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("bpmTaskG.TASK_NAME =", value, "taskName");

            return this;
        } // end andTaskNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.TASK_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("bpmTaskG.TASK_NAME <>", value, "taskName");

            return this;
        } // end andTaskNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameNotEqualToOrIsNull(String value) {
            addCriterion("bpmTaskG.TASK_NAME is null OR bpmTaskG.TASK_NAME <>",
                value, "taskName");

            return this;
        } // end andTaskNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.TASK_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("bpmTaskG.TASK_NAME >", value, "taskName");

            return this;
        } // end andTaskNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.TASK_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("bpmTaskG.TASK_NAME >=", value, "taskName");

            return this;
        } // end andTaskNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.TASK_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameLessThan(String value) {
            addCriterion("bpmTaskG.TASK_NAME <", value, "taskName");

            return this;
        } // end andTaskNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.TASK_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("bpmTaskG.TASK_NAME <=", value, "taskName");

            return this;
        } // end andTaskNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.TASK_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmTaskG.TASK_NAME like", buffer.toString(),
                "taskName");

            return this;
        } // end andTaskNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmTaskG.TASK_NAME not like", buffer.toString(),
                "taskName");

            return this;
        } // end andTaskNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIn(List values) {
            if (values.size() == 1) {
                return andTaskNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmTaskG.TASK_NAME in", values, "taskName");

                return this;
            } // end else
        } // end andTaskNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameNotIn(List values) {
            if (values.size() == 1) {
                return andTaskNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmTaskG.TASK_NAME not in", values, "taskName");

                return this;
            } // end else
        } // end andTaskNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIn(Object[] values) {
            if (values.length == 1) {
                return andTaskNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.TASK_NAME in", Arrays.asList(values),
                    "taskName");

                return this;
            } // end else
        } // end andTaskNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTaskNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.TASK_NAME not in",
                    Arrays.asList(values), "taskName");

                return this;
            } // end else
        } // end andTaskNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("bpmTaskG.TASK_NAME between", value1, value2,
                "taskName");

            return this;
        } // end andTaskNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("bpmTaskG.TASK_NAME not between", value1, value2,
                "taskName");

            return this;
        } // end andTaskNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberIsNull() {
            addCriterion("bpmTaskG.SERIAL_NUMBER is null");

            return this;
        } // end andTaskSerialNumberIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberIsNotNull() {
            addCriterion("bpmTaskG.SERIAL_NUMBER is not null");

            return this;
        } // end andTaskSerialNumberIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberIsNotEmpty() {
            addCriterion(
                "bpmTaskG.SERIAL_NUMBER is not null AND bpmTaskG.SERIAL_NUMBER <> ''");

            return this;
        } // end andTaskSerialNumberIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberIsEmpty() {
            addCriterion(
                "(bpmTaskG.SERIAL_NUMBER is null OR bpmTaskG.SERIAL_NUMBER = '')");

            return this;
        } // end andTaskSerialNumberIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberEqualTo(String value) {
            addCriterion("bpmTaskG.SERIAL_NUMBER =", value, "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.SERIAL_NUMBER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskSerialNumberEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberNotEqualTo(String value) {
            addCriterion("bpmTaskG.SERIAL_NUMBER <>", value, "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberNotEqualToOrIsNull(String value) {
            addCriterion("bpmTaskG.SERIAL_NUMBER is null OR bpmTaskG.SERIAL_NUMBER <>",
                value, "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.SERIAL_NUMBER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskSerialNumberNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberGreaterThan(String value) {
            addCriterion("bpmTaskG.SERIAL_NUMBER >", value, "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.SERIAL_NUMBER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskSerialNumberGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bpmTaskG.SERIAL_NUMBER >=", value, "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.SERIAL_NUMBER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskSerialNumberGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberLessThan(String value) {
            addCriterion("bpmTaskG.SERIAL_NUMBER <", value, "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.SERIAL_NUMBER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskSerialNumberLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("bpmTaskG.SERIAL_NUMBER <=", value, "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmTaskG.SERIAL_NUMBER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskSerialNumberLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmTaskG.SERIAL_NUMBER like", buffer.toString(),
                "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmTaskG.SERIAL_NUMBER not like", buffer.toString(),
                "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberIn(List values) {
            if (values.size() == 1) {
                return andTaskSerialNumberEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmTaskG.SERIAL_NUMBER in", values,
                    "taskSerialNumber");

                return this;
            } // end else
        } // end andTaskSerialNumberIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberNotIn(List values) {
            if (values.size() == 1) {
                return andTaskSerialNumberNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmTaskG.SERIAL_NUMBER not in", values,
                    "taskSerialNumber");

                return this;
            } // end else
        } // end andTaskSerialNumberNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberIn(Object[] values) {
            if (values.length == 1) {
                return andTaskSerialNumberEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.SERIAL_NUMBER in",
                    Arrays.asList(values), "taskSerialNumber");

                return this;
            } // end else
        } // end andTaskSerialNumberIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberNotIn(Object[] values) {
            if (values.length == 1) {
                return andTaskSerialNumberNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmTaskG.SERIAL_NUMBER not in",
                    Arrays.asList(values), "taskSerialNumber");

                return this;
            } // end else
        } // end andTaskSerialNumberNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberBetween(String value1, String value2) {
            addCriterion("bpmTaskG.SERIAL_NUMBER between", value1, value2,
                "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskSerialNumberNotBetween(String value1,
            String value2) {
            addCriterion("bpmTaskG.SERIAL_NUMBER not between", value1, value2,
                "taskSerialNumber");

            return this;
        } // end andTaskSerialNumberNotBetween()
    } // end Criteria
} // end BpmTaskRoleRelateDAOQueryBean
