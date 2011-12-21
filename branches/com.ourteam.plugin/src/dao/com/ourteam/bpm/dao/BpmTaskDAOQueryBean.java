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
 * BpmTask query bean 2011-11-30 15:28:42
 *
 * @author Auto Gen
 */
public class BpmTaskDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmTaskDAOQueryBean object.
     */
    public BpmTaskDAOQueryBean() {
        super();
    } // end BpmTaskDAOQueryBean()

    /**
     * Creates a new BpmTaskDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmTaskDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmTaskDAOQueryBean()

    /**
     * Creates a new BpmTaskDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmTaskDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmTaskDAOQueryBean()

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
            addSelectProperty(IBpmTaskDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAssignerIdSelectProperty() {
        addAssignerIdSelectProperty("assignerId");
    } // end addAssignerIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAssignerIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.AssignerId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.AssignerId, "assignerId");
        } // end else
    } // end addAssignerIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEndDateTimeSelectProperty() {
        addEndDateTimeSelectProperty("endDateTime");
    } // end addEndDateTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEndDateTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.EndDateTime, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.EndDateTime, "endDateTime");
        } // end else
    } // end addEndDateTimeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPrioritySelectProperty() {
        addPrioritySelectProperty("priority");
    } // end addPrioritySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPrioritySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.Priority, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.Priority, "priority");
        } // end else
    } // end addPrioritySelectProperty()

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
            addSelectProperty(IBpmTaskDAO.ProcessInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.ProcessInstanceId, "processInstanceId");
        } // end else
    } // end addProcessInstanceIdSelectProperty()

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
            addSelectProperty(IBpmTaskDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStartDateTimeSelectProperty() {
        addStartDateTimeSelectProperty("startDateTime");
    } // end addStartDateTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStartDateTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.StartDateTime, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.StartDateTime, "startDateTime");
        } // end else
    } // end addStartDateTimeSelectProperty()

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
            addSelectProperty(IBpmTaskDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTaskKeySelectProperty() {
        addTaskKeySelectProperty("taskKey");
    } // end addTaskKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTaskKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.TaskKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.TaskKey, "taskKey");
        } // end else
    } // end addTaskKeySelectProperty()

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
            addSelectProperty(IBpmTaskDAO.TaskName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.TaskName, "taskName");
        } // end else
    } // end addTaskNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessDefineIdSelectProperty() {
        addProcessDefineIdSelectProperty("processDefineId");
    } // end addProcessDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessDefineIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.ProcessDefineId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.ProcessDefineId, "processDefineId");
        } // end else
    } // end addProcessDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessNameSelectProperty() {
        addProcessNameSelectProperty("processName");
    } // end addProcessNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.ProcessName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.ProcessName, "processName");
        } // end else
    } // end addProcessNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAssignerNameSelectProperty() {
        addAssignerNameSelectProperty("assignerName");
    } // end addAssignerNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAssignerNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.AssignerName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.AssignerName, "assignerName");
        } // end else
    } // end addAssignerNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStarterIdSelectProperty() {
        addStarterIdSelectProperty("starterId");
    } // end addStarterIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStarterIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.StarterId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.StarterId, "starterId");
        } // end else
    } // end addStarterIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSerialNumberSelectProperty() {
        addSerialNumberSelectProperty("serialNumber");
    } // end addSerialNumberSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSerialNumberSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.SerialNumber, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.SerialNumber, "serialNumber");
        } // end else
    } // end addSerialNumberSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCommentCountSelectProperty() {
        addCommentCountSelectProperty("commentCount");
    } // end addCommentCountSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCommentCountSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.CommentCount, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.CommentCount, "commentCount");
        } // end else
    } // end addCommentCountSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAttachmentCountSelectProperty() {
        addAttachmentCountSelectProperty("attachmentCount");
    } // end addAttachmentCountSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAttachmentCountSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.AttachmentCount, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.AttachmentCount, "attachmentCount");
        } // end else
    } // end addAttachmentCountSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTaskFormKeySelectProperty() {
        addTaskFormKeySelectProperty("taskFormKey");
    } // end addTaskFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTaskFormKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.TaskFormKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.TaskFormKey, "taskFormKey");
        } // end else
    } // end addTaskFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessFormKeySelectProperty() {
        addProcessFormKeySelectProperty("processFormKey");
    } // end addProcessFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessFormKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.ProcessFormKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.ProcessFormKey, "processFormKey");
        } // end else
    } // end addProcessFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPreTaskIdSelectProperty() {
        addPreTaskIdSelectProperty("preTaskId");
    } // end addPreTaskIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPreTaskIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmTaskDAO.PreTaskId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmTaskDAO.PreTaskId, "preTaskId");
        } // end else
    } // end addPreTaskIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addAssignerIdSelectProperty();

        addEndDateTimeSelectProperty();

        addPrioritySelectProperty();

        addProcessInstanceIdSelectProperty();

        addRemarksSelectProperty();

        addStartDateTimeSelectProperty();

        addStatusSelectProperty();

        addTaskKeySelectProperty();

        addTaskNameSelectProperty();

        addProcessDefineIdSelectProperty();

        addProcessNameSelectProperty();

        addAssignerNameSelectProperty();

        addStarterIdSelectProperty();

        addSerialNumberSelectProperty();

        addCommentCountSelectProperty();

        addAttachmentCountSelectProperty();

        addTaskFormKeySelectProperty();

        addProcessFormKeySelectProperty();

        addPreTaskIdSelectProperty();
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
            addCriterion("BPM_TASK.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_TASK.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("BPM_TASK.ID is not null AND BPM_TASK.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(BPM_TASK.ID is null OR BPM_TASK.ID = '')");

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
            addCriterion("BPM_TASK.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK.ID");
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
            addCriterion("BPM_TASK.ID <>", value, "id");

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
            addCriterion("BPM_TASK.ID is null OR BPM_TASK.ID <>", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK.ID");
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
            addCriterion("BPM_TASK.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK.ID");
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
            addCriterion("BPM_TASK.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK.ID");
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
            addCriterion("BPM_TASK.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK.ID");
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
            addCriterion("BPM_TASK.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_TASK.ID");
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
                addCriterion("BPM_TASK.ID in", values, "id");

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
                addCriterion("BPM_TASK.ID not in", values, "id");

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
                addCriterion("BPM_TASK.ID in", values, "id");

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
                addCriterion("BPM_TASK.ID not in", values, "id");

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
                addCriterion("BPM_TASK.ID in", Arrays.asList(values), "id");

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
                addCriterion("BPM_TASK.ID not in", Arrays.asList(values), "id");

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
            addCriterion("BPM_TASK.ID between", value1, value2, "id");

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
            addCriterion("BPM_TASK.ID between", value1, value2, "id");

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
            addCriterion("BPM_TASK.ID not between", value1, value2, "id");

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
            addCriterion("BPM_TASK.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdIsNull() {
            addCriterion("BPM_TASK.ASSIGNER_ID is null");

            return this;
        } // end andAssignerIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdIsNotNull() {
            addCriterion("BPM_TASK.ASSIGNER_ID is not null");

            return this;
        } // end andAssignerIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdIsNotEmpty() {
            addCriterion(
                "BPM_TASK.ASSIGNER_ID is not null AND BPM_TASK.ASSIGNER_ID <> ''");

            return this;
        } // end andAssignerIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdIsEmpty() {
            addCriterion(
                "(BPM_TASK.ASSIGNER_ID is null OR BPM_TASK.ASSIGNER_ID = '')");

            return this;
        } // end andAssignerIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdEqualTo(Long value) {
            addCriterion("BPM_TASK.ASSIGNER_ID =", value, "assignerId");

            return this;
        } // end andAssignerIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ASSIGNER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdNotEqualTo(Long value) {
            addCriterion("BPM_TASK.ASSIGNER_ID <>", value, "assignerId");

            return this;
        } // end andAssignerIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdNotEqualToOrIsNull(Long value) {
            addCriterion("BPM_TASK.ASSIGNER_ID is null OR BPM_TASK.ASSIGNER_ID <>",
                value, "assignerId");

            return this;
        } // end andAssignerIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ASSIGNER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdGreaterThan(Long value) {
            addCriterion("BPM_TASK.ASSIGNER_ID >", value, "assignerId");

            return this;
        } // end andAssignerIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ASSIGNER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BPM_TASK.ASSIGNER_ID >=", value, "assignerId");

            return this;
        } // end andAssignerIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ASSIGNER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdLessThan(Long value) {
            addCriterion("BPM_TASK.ASSIGNER_ID <", value, "assignerId");

            return this;
        } // end andAssignerIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ASSIGNER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdLessThanOrEqualTo(Long value) {
            addCriterion("BPM_TASK.ASSIGNER_ID <=", value, "assignerId");

            return this;
        } // end andAssignerIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ASSIGNER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdIn(List values) {
            if (values.size() == 1) {
                return andAssignerIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.ASSIGNER_ID in", values, "assignerId");

                return this;
            } // end else
        } // end andAssignerIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdNotIn(List values) {
            if (values.size() == 1) {
                return andAssignerIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.ASSIGNER_ID not in", values, "assignerId");

                return this;
            } // end else
        } // end andAssignerIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdIn(Object[] values) {
            if (values.length == 1) {
                return andAssignerIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.ASSIGNER_ID in", Arrays.asList(values),
                    "assignerId");

                return this;
            } // end else
        } // end andAssignerIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andAssignerIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.ASSIGNER_ID not in",
                    Arrays.asList(values), "assignerId");

                return this;
            } // end else
        } // end andAssignerIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdBetween(Long value1, Long value2) {
            addCriterion("BPM_TASK.ASSIGNER_ID between", value1, value2,
                "assignerId");

            return this;
        } // end andAssignerIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerIdNotBetween(Long value1, Long value2) {
            addCriterion("BPM_TASK.ASSIGNER_ID not between", value1, value2,
                "assignerId");

            return this;
        } // end andAssignerIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsNull() {
            addCriterion("BPM_TASK.END_DATE_TIME is null");

            return this;
        } // end andEndDateTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsNotNull() {
            addCriterion("BPM_TASK.END_DATE_TIME is not null");

            return this;
        } // end andEndDateTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsNotEmpty() {
            addCriterion(
                "BPM_TASK.END_DATE_TIME is not null AND BPM_TASK.END_DATE_TIME <> ''");

            return this;
        } // end andEndDateTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsEmpty() {
            addCriterion(
                "(BPM_TASK.END_DATE_TIME is null OR BPM_TASK.END_DATE_TIME = '')");

            return this;
        } // end andEndDateTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME =", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.END_DATE_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME <>", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME is null OR BPM_TASK.END_DATE_TIME <>",
                value, "endDateTime");

            return this;
        } // end andEndDateTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.END_DATE_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME >", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.END_DATE_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME >=", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.END_DATE_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME <", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.END_DATE_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME <=", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.END_DATE_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIn(List values) {
            if (values.size() == 1) {
                return andEndDateTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME in", values,
                    "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotIn(List values) {
            if (values.size() == 1) {
                return andEndDateTimeNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME not in",
                    values, "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIn(Object[] values) {
            if (values.length == 1) {
                return andEndDateTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME in",
                    Arrays.asList(values), "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andEndDateTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME not in",
                    Arrays.asList(values), "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME between", value1,
                value2, "endDateTime");

            return this;
        } // end andEndDateTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_TASK.END_DATE_TIME not between",
                value1, value2, "endDateTime");

            return this;
        } // end andEndDateTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityIsNull() {
            addCriterion("BPM_TASK.PRIORITY is null");

            return this;
        } // end andPriorityIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityIsNotNull() {
            addCriterion("BPM_TASK.PRIORITY is not null");

            return this;
        } // end andPriorityIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityIsNotEmpty() {
            addCriterion(
                "BPM_TASK.PRIORITY is not null AND BPM_TASK.PRIORITY <> ''");

            return this;
        } // end andPriorityIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityIsEmpty() {
            addCriterion(
                "(BPM_TASK.PRIORITY is null OR BPM_TASK.PRIORITY = '')");

            return this;
        } // end andPriorityIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityEqualTo(int value) {
            return andPriorityEqualTo(Integer.valueOf(value));
        } // end andPriorityEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.PRIORITY =", value, "priority");

            return this;
        } // end andPriorityEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRIORITY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPriorityEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotEqualTo(int value) {
            return andPriorityNotEqualTo(Integer.valueOf(value));
        } // end andPriorityNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.PRIORITY <>", value, "priority");

            return this;
        } // end andPriorityNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotEqualToOrIsNull(int value) {
            return andPriorityNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andPriorityNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("BPM_TASK.PRIORITY is null OR BPM_TASK.PRIORITY <>",
                value, "priority");

            return this;
        } // end andPriorityNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRIORITY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPriorityNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityGreaterThan(int value) {
            return andPriorityGreaterThan(Integer.valueOf(value));
        } // end andPriorityGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityGreaterThan(java.lang.Integer value) {
            addCriterion("BPM_TASK.PRIORITY >", value, "priority");

            return this;
        } // end andPriorityGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRIORITY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPriorityGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityGreaterThanOrEqualTo(int value) {
            return andPriorityGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andPriorityGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.PRIORITY >=", value, "priority");

            return this;
        } // end andPriorityGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRIORITY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPriorityGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityLessThan(int value) {
            return andPriorityLessThan(Integer.valueOf(value));
        } // end andPriorityLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityLessThan(java.lang.Integer value) {
            addCriterion("BPM_TASK.PRIORITY <", value, "priority");

            return this;
        } // end andPriorityLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRIORITY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPriorityLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityLessThanOrEqualTo(int value) {
            return andPriorityLessThanOrEqualTo(Integer.valueOf(value));
        } // end andPriorityLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.PRIORITY <=", value, "priority");

            return this;
        } // end andPriorityLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRIORITY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPriorityLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityIn(int[] values) {
            if (values.length == 1) {
                return andPriorityEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRIORITY in", values, "priority");

                return this;
            } // end else
        } // end andPriorityIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotIn(int[] values) {
            if (values.length == 1) {
                return andPriorityNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRIORITY not in", values, "priority");

                return this;
            } // end else
        } // end andPriorityNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityIn(List values) {
            if (values.size() == 1) {
                return andPriorityEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.PRIORITY in", values, "priority");

                return this;
            } // end else
        } // end andPriorityIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotIn(List values) {
            if (values.size() == 1) {
                return andPriorityNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.PRIORITY not in", values, "priority");

                return this;
            } // end else
        } // end andPriorityNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityIn(Object[] values) {
            if (values.length == 1) {
                return andPriorityEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRIORITY in", Arrays.asList(values),
                    "priority");

                return this;
            } // end else
        } // end andPriorityIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotIn(Object[] values) {
            if (values.length == 1) {
                return andPriorityNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRIORITY not in", Arrays.asList(values),
                    "priority");

                return this;
            } // end else
        } // end andPriorityNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityBetween(int value1, int value2) {
            addCriterion("BPM_TASK.PRIORITY between", value1, value2, "priority");

            return this;
        } // end andPriorityBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("BPM_TASK.PRIORITY between", value1, value2, "priority");

            return this;
        } // end andPriorityBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotBetween(int value1, int value2) {
            addCriterion("BPM_TASK.PRIORITY not between", value1, value2,
                "priority");

            return this;
        } // end andPriorityNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPriorityNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("BPM_TASK.PRIORITY not between", value1, value2,
                "priority");

            return this;
        } // end andPriorityNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID is null");

            return this;
        } // end andProcessInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID is not null");

            return this;
        } // end andProcessInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotEmpty() {
            addCriterion(
                "BPM_TASK.PROCESS_INSTANCE_ID is not null AND BPM_TASK.PROCESS_INSTANCE_ID <> ''");

            return this;
        } // end andProcessInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsEmpty() {
            addCriterion(
                "(BPM_TASK.PROCESS_INSTANCE_ID is null OR BPM_TASK.PROCESS_INSTANCE_ID = '')");

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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID =", value,
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
            StringBuffer str = new StringBuffer("BPM_TASK.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID <>", value,
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID is null OR BPM_TASK.PROCESS_INSTANCE_ID <>",
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
            StringBuffer str = new StringBuffer("BPM_TASK.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID >", value,
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
            StringBuffer str = new StringBuffer("BPM_TASK.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID >=", value,
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
            StringBuffer str = new StringBuffer("BPM_TASK.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID <", value,
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
            StringBuffer str = new StringBuffer("BPM_TASK.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID <=", value,
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
            StringBuffer str = new StringBuffer("BPM_TASK.PROCESS_INSTANCE_ID");
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
                addCriterion("BPM_TASK.PROCESS_INSTANCE_ID in", values,
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
                addCriterion("BPM_TASK.PROCESS_INSTANCE_ID not in", values,
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
                addCriterion("BPM_TASK.PROCESS_INSTANCE_ID in", values,
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
                addCriterion("BPM_TASK.PROCESS_INSTANCE_ID not in", values,
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
                addCriterion("BPM_TASK.PROCESS_INSTANCE_ID in",
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
                addCriterion("BPM_TASK.PROCESS_INSTANCE_ID not in",
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID between", value1,
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID between", value1,
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID not between", value1,
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
            addCriterion("BPM_TASK.PROCESS_INSTANCE_ID not between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_TASK.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_TASK.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_TASK.REMARKS is not null AND BPM_TASK.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion("(BPM_TASK.REMARKS is null OR BPM_TASK.REMARKS = '')");

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
            addCriterion("BPM_TASK.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK.REMARKS");
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
            addCriterion("BPM_TASK.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_TASK.REMARKS is null OR BPM_TASK.REMARKS <>",
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
            StringBuffer str = new StringBuffer("BPM_TASK.REMARKS");
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
            addCriterion("BPM_TASK.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK.REMARKS");
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
            addCriterion("BPM_TASK.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK.REMARKS");
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
            addCriterion("BPM_TASK.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK.REMARKS");
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
            addCriterion("BPM_TASK.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_TASK.REMARKS");
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
            addCriterion("BPM_TASK.REMARKS like", buffer.toString(), "remarks");

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
            addCriterion("BPM_TASK.REMARKS not like", buffer.toString(),
                "remarks");

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
                addCriterion("BPM_TASK.REMARKS in", values, "remarks");

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
                addCriterion("BPM_TASK.REMARKS not in", values, "remarks");

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
                addCriterion("BPM_TASK.REMARKS in", Arrays.asList(values),
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
        public Criteria andRemarksNotIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.REMARKS not in", Arrays.asList(values),
                    "remarks");

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
            addCriterion("BPM_TASK.REMARKS between", value1, value2, "remarks");

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
            addCriterion("BPM_TASK.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsNull() {
            addCriterion("BPM_TASK.START_DATE_TIME is null");

            return this;
        } // end andStartDateTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsNotNull() {
            addCriterion("BPM_TASK.START_DATE_TIME is not null");

            return this;
        } // end andStartDateTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsNotEmpty() {
            addCriterion(
                "BPM_TASK.START_DATE_TIME is not null AND BPM_TASK.START_DATE_TIME <> ''");

            return this;
        } // end andStartDateTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsEmpty() {
            addCriterion(
                "(BPM_TASK.START_DATE_TIME is null OR BPM_TASK.START_DATE_TIME = '')");

            return this;
        } // end andStartDateTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME =", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.START_DATE_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME <>", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME is null OR BPM_TASK.START_DATE_TIME <>",
                value, "startDateTime");

            return this;
        } // end andStartDateTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.START_DATE_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME >", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.START_DATE_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME >=", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.START_DATE_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME <", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.START_DATE_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME <=", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.START_DATE_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIn(List values) {
            if (values.size() == 1) {
                return andStartDateTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME in", values,
                    "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotIn(List values) {
            if (values.size() == 1) {
                return andStartDateTimeNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME not in",
                    values, "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIn(Object[] values) {
            if (values.length == 1) {
                return andStartDateTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME in",
                    Arrays.asList(values), "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andStartDateTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME not in",
                    Arrays.asList(values), "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME between", value1,
                value2, "startDateTime");

            return this;
        } // end andStartDateTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_TASK.START_DATE_TIME not between",
                value1, value2, "startDateTime");

            return this;
        } // end andStartDateTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_TASK.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_TASK.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_TASK.STATUS is not null AND BPM_TASK.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion("(BPM_TASK.STATUS is null OR BPM_TASK.STATUS = '')");

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
            addCriterion("BPM_TASK.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK.STATUS");
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
            addCriterion("BPM_TASK.STATUS <>", value, "status");

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
            addCriterion("BPM_TASK.STATUS is null OR BPM_TASK.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_TASK.STATUS");
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
            addCriterion("BPM_TASK.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK.STATUS");
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
            addCriterion("BPM_TASK.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK.STATUS");
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
            addCriterion("BPM_TASK.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK.STATUS");
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
            addCriterion("BPM_TASK.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_TASK.STATUS");
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
            addCriterion("BPM_TASK.STATUS like", buffer.toString(), "status");

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
            addCriterion("BPM_TASK.STATUS not like", buffer.toString(), "status");

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
                addCriterion("BPM_TASK.STATUS in", values, "status");

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
                addCriterion("BPM_TASK.STATUS not in", values, "status");

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
                addCriterion("BPM_TASK.STATUS in", Arrays.asList(values),
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
        public Criteria andStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.STATUS not in", Arrays.asList(values),
                    "status");

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
            addCriterion("BPM_TASK.STATUS between", value1, value2, "status");

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
            addCriterion("BPM_TASK.STATUS not between", value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyIsNull() {
            addCriterion("BPM_TASK.TASK_KEY is null");

            return this;
        } // end andTaskKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyIsNotNull() {
            addCriterion("BPM_TASK.TASK_KEY is not null");

            return this;
        } // end andTaskKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyIsNotEmpty() {
            addCriterion(
                "BPM_TASK.TASK_KEY is not null AND BPM_TASK.TASK_KEY <> ''");

            return this;
        } // end andTaskKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyIsEmpty() {
            addCriterion(
                "(BPM_TASK.TASK_KEY is null OR BPM_TASK.TASK_KEY = '')");

            return this;
        } // end andTaskKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_KEY =", value, "taskKey");

            return this;
        } // end andTaskKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyNotEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_KEY <>", value, "taskKey");

            return this;
        } // end andTaskKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_TASK.TASK_KEY is null OR BPM_TASK.TASK_KEY <>",
                value, "taskKey");

            return this;
        } // end andTaskKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyGreaterThan(String value) {
            addCriterion("BPM_TASK.TASK_KEY >", value, "taskKey");

            return this;
        } // end andTaskKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_KEY >=", value, "taskKey");

            return this;
        } // end andTaskKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyLessThan(String value) {
            addCriterion("BPM_TASK.TASK_KEY <", value, "taskKey");

            return this;
        } // end andTaskKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_KEY <=", value, "taskKey");

            return this;
        } // end andTaskKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_TASK.TASK_KEY like", buffer.toString(), "taskKey");

            return this;
        } // end andTaskKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_TASK.TASK_KEY not like", buffer.toString(),
                "taskKey");

            return this;
        } // end andTaskKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyIn(List values) {
            if (values.size() == 1) {
                return andTaskKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_KEY in", values, "taskKey");

                return this;
            } // end else
        } // end andTaskKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyNotIn(List values) {
            if (values.size() == 1) {
                return andTaskKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_KEY not in", values, "taskKey");

                return this;
            } // end else
        } // end andTaskKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyIn(Object[] values) {
            if (values.length == 1) {
                return andTaskKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_KEY in", Arrays.asList(values),
                    "taskKey");

                return this;
            } // end else
        } // end andTaskKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andTaskKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_KEY not in", Arrays.asList(values),
                    "taskKey");

                return this;
            } // end else
        } // end andTaskKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyBetween(String value1, String value2) {
            addCriterion("BPM_TASK.TASK_KEY between", value1, value2, "taskKey");

            return this;
        } // end andTaskKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_TASK.TASK_KEY not between", value1, value2,
                "taskKey");

            return this;
        } // end andTaskKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsNull() {
            addCriterion("BPM_TASK.TASK_NAME is null");

            return this;
        } // end andTaskNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsNotNull() {
            addCriterion("BPM_TASK.TASK_NAME is not null");

            return this;
        } // end andTaskNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsNotEmpty() {
            addCriterion(
                "BPM_TASK.TASK_NAME is not null AND BPM_TASK.TASK_NAME <> ''");

            return this;
        } // end andTaskNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskNameIsEmpty() {
            addCriterion(
                "(BPM_TASK.TASK_NAME is null OR BPM_TASK.TASK_NAME = '')");

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
            addCriterion("BPM_TASK.TASK_NAME =", value, "taskName");

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
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_NAME");
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
            addCriterion("BPM_TASK.TASK_NAME <>", value, "taskName");

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
            addCriterion("BPM_TASK.TASK_NAME is null OR BPM_TASK.TASK_NAME <>",
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
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_NAME");
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
            addCriterion("BPM_TASK.TASK_NAME >", value, "taskName");

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
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_NAME");
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
            addCriterion("BPM_TASK.TASK_NAME >=", value, "taskName");

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
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_NAME");
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
            addCriterion("BPM_TASK.TASK_NAME <", value, "taskName");

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
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_NAME");
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
            addCriterion("BPM_TASK.TASK_NAME <=", value, "taskName");

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
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_NAME");
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
            addCriterion("BPM_TASK.TASK_NAME like", buffer.toString(),
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
            addCriterion("BPM_TASK.TASK_NAME not like", buffer.toString(),
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
                addCriterion("BPM_TASK.TASK_NAME in", values, "taskName");

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
                addCriterion("BPM_TASK.TASK_NAME not in", values, "taskName");

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
                addCriterion("BPM_TASK.TASK_NAME in", Arrays.asList(values),
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
                addCriterion("BPM_TASK.TASK_NAME not in",
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
            addCriterion("BPM_TASK.TASK_NAME between", value1, value2,
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
            addCriterion("BPM_TASK.TASK_NAME not between", value1, value2,
                "taskName");

            return this;
        } // end andTaskNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNull() {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID is null");

            return this;
        } // end andProcessDefineIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNotNull() {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID is not null");

            return this;
        } // end andProcessDefineIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNotEmpty() {
            addCriterion(
                "bpmProcessInstanceF.PROCESS_DEFINE_ID is not null AND bpmProcessInstanceF.PROCESS_DEFINE_ID <> ''");

            return this;
        } // end andProcessDefineIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsEmpty() {
            addCriterion(
                "(bpmProcessInstanceF.PROCESS_DEFINE_ID is null OR bpmProcessInstanceF.PROCESS_DEFINE_ID = '')");

            return this;
        } // end andProcessDefineIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdEqualTo(long value) {
            return andProcessDefineIdEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdEqualTo(java.lang.Long value) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID =", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.PROCESS_DEFINE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualTo(long value) {
            return andProcessDefineIdNotEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualTo(java.lang.Long value) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID <>", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualToOrIsNull(long value) {
            return andProcessDefineIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProcessDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID is null OR bpmProcessInstanceF.PROCESS_DEFINE_ID <>",
                value, "processDefineId");

            return this;
        } // end andProcessDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.PROCESS_DEFINE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThan(long value) {
            return andProcessDefineIdGreaterThan(Long.valueOf(value));
        } // end andProcessDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThan(java.lang.Long value) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID >", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.PROCESS_DEFINE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanOrEqualTo(long value) {
            return andProcessDefineIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID >=", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.PROCESS_DEFINE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThan(long value) {
            return andProcessDefineIdLessThan(Long.valueOf(value));
        } // end andProcessDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThan(java.lang.Long value) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID <", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.PROCESS_DEFINE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanOrEqualTo(long value) {
            return andProcessDefineIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID <=", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.PROCESS_DEFINE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIn(long[] values) {
            if (values.length == 1) {
                return andProcessDefineIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProcessDefineIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID not in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIn(List values) {
            if (values.size() == 1) {
                return andProcessDefineIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotIn(List values) {
            if (values.size() == 1) {
                return andProcessDefineIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID not in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIn(Object[] values) {
            if (values.length == 1) {
                return andProcessDefineIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID in",
                    Arrays.asList(values), "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessDefineIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID not in",
                    Arrays.asList(values), "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdBetween(long value1, long value2) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotBetween(long value1, long value2) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID not between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("bpmProcessInstanceF.PROCESS_DEFINE_ID not between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNull() {
            addCriterion("bpmProcessDefineF.PROCESS_NAME is null");

            return this;
        } // end andProcessNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNotNull() {
            addCriterion("bpmProcessDefineF.PROCESS_NAME is not null");

            return this;
        } // end andProcessNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNotEmpty() {
            addCriterion(
                "bpmProcessDefineF.PROCESS_NAME is not null AND bpmProcessDefineF.PROCESS_NAME <> ''");

            return this;
        } // end andProcessNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsEmpty() {
            addCriterion(
                "(bpmProcessDefineF.PROCESS_NAME is null OR bpmProcessDefineF.PROCESS_NAME = '')");

            return this;
        } // end andProcessNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME =", value,
                "processName");

            return this;
        } // end andProcessNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessDefineF.PROCESS_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME <>", value,
                "processName");

            return this;
        } // end andProcessNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotEqualToOrIsNull(String value) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME is null OR bpmProcessDefineF.PROCESS_NAME <>",
                value, "processName");

            return this;
        } // end andProcessNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessDefineF.PROCESS_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME >", value,
                "processName");

            return this;
        } // end andProcessNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessDefineF.PROCESS_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME >=", value,
                "processName");

            return this;
        } // end andProcessNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessDefineF.PROCESS_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThan(String value) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME <", value,
                "processName");

            return this;
        } // end andProcessNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessDefineF.PROCESS_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME <=", value,
                "processName");

            return this;
        } // end andProcessNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessDefineF.PROCESS_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmProcessDefineF.PROCESS_NAME like",
                buffer.toString(), "processName");

            return this;
        } // end andProcessNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmProcessDefineF.PROCESS_NAME not like",
                buffer.toString(), "processName");

            return this;
        } // end andProcessNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIn(List values) {
            if (values.size() == 1) {
                return andProcessNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmProcessDefineF.PROCESS_NAME in", values,
                    "processName");

                return this;
            } // end else
        } // end andProcessNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotIn(List values) {
            if (values.size() == 1) {
                return andProcessNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmProcessDefineF.PROCESS_NAME not in", values,
                    "processName");

                return this;
            } // end else
        } // end andProcessNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIn(Object[] values) {
            if (values.length == 1) {
                return andProcessNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessDefineF.PROCESS_NAME in",
                    Arrays.asList(values), "processName");

                return this;
            } // end else
        } // end andProcessNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessDefineF.PROCESS_NAME not in",
                    Arrays.asList(values), "processName");

                return this;
            } // end else
        } // end andProcessNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME between", value1,
                value2, "processName");

            return this;
        } // end andProcessNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("bpmProcessDefineF.PROCESS_NAME not between", value1,
                value2, "processName");

            return this;
        } // end andProcessNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameIsNull() {
            addCriterion("employeeF.NAME is null");

            return this;
        } // end andAssignerNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameIsNotNull() {
            addCriterion("employeeF.NAME is not null");

            return this;
        } // end andAssignerNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameIsNotEmpty() {
            addCriterion("employeeF.NAME is not null AND employeeF.NAME <> ''");

            return this;
        } // end andAssignerNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameIsEmpty() {
            addCriterion("(employeeF.NAME is null OR employeeF.NAME = '')");

            return this;
        } // end andAssignerNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameEqualTo(String value) {
            addCriterion("employeeF.NAME =", value, "assignerName");

            return this;
        } // end andAssignerNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeF.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameNotEqualTo(String value) {
            addCriterion("employeeF.NAME <>", value, "assignerName");

            return this;
        } // end andAssignerNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameNotEqualToOrIsNull(String value) {
            addCriterion("employeeF.NAME is null OR employeeF.NAME <>", value,
                "assignerName");

            return this;
        } // end andAssignerNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeF.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameGreaterThan(String value) {
            addCriterion("employeeF.NAME >", value, "assignerName");

            return this;
        } // end andAssignerNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeF.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeF.NAME >=", value, "assignerName");

            return this;
        } // end andAssignerNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeF.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameLessThan(String value) {
            addCriterion("employeeF.NAME <", value, "assignerName");

            return this;
        } // end andAssignerNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeF.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameLessThanOrEqualTo(String value) {
            addCriterion("employeeF.NAME <=", value, "assignerName");

            return this;
        } // end andAssignerNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeF.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignerNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeF.NAME like", buffer.toString(),
                "assignerName");

            return this;
        } // end andAssignerNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeF.NAME not like", buffer.toString(),
                "assignerName");

            return this;
        } // end andAssignerNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameIn(List values) {
            if (values.size() == 1) {
                return andAssignerNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeF.NAME in", values, "assignerName");

                return this;
            } // end else
        } // end andAssignerNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameNotIn(List values) {
            if (values.size() == 1) {
                return andAssignerNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeF.NAME not in", values, "assignerName");

                return this;
            } // end else
        } // end andAssignerNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameIn(Object[] values) {
            if (values.length == 1) {
                return andAssignerNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeF.NAME in", Arrays.asList(values),
                    "assignerName");

                return this;
            } // end else
        } // end andAssignerNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andAssignerNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeF.NAME not in", Arrays.asList(values),
                    "assignerName");

                return this;
            } // end else
        } // end andAssignerNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameBetween(String value1, String value2) {
            addCriterion("employeeF.NAME between", value1, value2,
                "assignerName");

            return this;
        } // end andAssignerNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignerNameNotBetween(String value1, String value2) {
            addCriterion("employeeF.NAME not between", value1, value2,
                "assignerName");

            return this;
        } // end andAssignerNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsNull() {
            addCriterion("BPM_TASK.STARTER_ID is null");

            return this;
        } // end andStarterIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsNotNull() {
            addCriterion("BPM_TASK.STARTER_ID is not null");

            return this;
        } // end andStarterIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsNotEmpty() {
            addCriterion(
                "BPM_TASK.STARTER_ID is not null AND BPM_TASK.STARTER_ID <> ''");

            return this;
        } // end andStarterIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsEmpty() {
            addCriterion(
                "(BPM_TASK.STARTER_ID is null OR BPM_TASK.STARTER_ID = '')");

            return this;
        } // end andStarterIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdEqualTo(long value) {
            return andStarterIdEqualTo(Long.valueOf(value));
        } // end andStarterIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.STARTER_ID =", value, "starterId");

            return this;
        } // end andStarterIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.STARTER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotEqualTo(long value) {
            return andStarterIdNotEqualTo(Long.valueOf(value));
        } // end andStarterIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.STARTER_ID <>", value, "starterId");

            return this;
        } // end andStarterIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotEqualToOrIsNull(long value) {
            return andStarterIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andStarterIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_TASK.STARTER_ID is null OR BPM_TASK.STARTER_ID <>",
                value, "starterId");

            return this;
        } // end andStarterIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.STARTER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdGreaterThan(long value) {
            return andStarterIdGreaterThan(Long.valueOf(value));
        } // end andStarterIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_TASK.STARTER_ID >", value, "starterId");

            return this;
        } // end andStarterIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.STARTER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdGreaterThanOrEqualTo(long value) {
            return andStarterIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andStarterIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.STARTER_ID >=", value, "starterId");

            return this;
        } // end andStarterIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.STARTER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdLessThan(long value) {
            return andStarterIdLessThan(Long.valueOf(value));
        } // end andStarterIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdLessThan(java.lang.Long value) {
            addCriterion("BPM_TASK.STARTER_ID <", value, "starterId");

            return this;
        } // end andStarterIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.STARTER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdLessThanOrEqualTo(long value) {
            return andStarterIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andStarterIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.STARTER_ID <=", value, "starterId");

            return this;
        } // end andStarterIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.STARTER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIn(long[] values) {
            if (values.length == 1) {
                return andStarterIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.STARTER_ID in", values, "starterId");

                return this;
            } // end else
        } // end andStarterIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotIn(long[] values) {
            if (values.length == 1) {
                return andStarterIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.STARTER_ID not in", values, "starterId");

                return this;
            } // end else
        } // end andStarterIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIn(List values) {
            if (values.size() == 1) {
                return andStarterIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.STARTER_ID in", values, "starterId");

                return this;
            } // end else
        } // end andStarterIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotIn(List values) {
            if (values.size() == 1) {
                return andStarterIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.STARTER_ID not in", values, "starterId");

                return this;
            } // end else
        } // end andStarterIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIn(Object[] values) {
            if (values.length == 1) {
                return andStarterIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.STARTER_ID in", Arrays.asList(values),
                    "starterId");

                return this;
            } // end else
        } // end andStarterIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andStarterIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.STARTER_ID not in",
                    Arrays.asList(values), "starterId");

                return this;
            } // end else
        } // end andStarterIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdBetween(long value1, long value2) {
            addCriterion("BPM_TASK.STARTER_ID between", value1, value2,
                "starterId");

            return this;
        } // end andStarterIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK.STARTER_ID between", value1, value2,
                "starterId");

            return this;
        } // end andStarterIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotBetween(long value1, long value2) {
            addCriterion("BPM_TASK.STARTER_ID not between", value1, value2,
                "starterId");

            return this;
        } // end andStarterIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK.STARTER_ID not between", value1, value2,
                "starterId");

            return this;
        } // end andStarterIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNull() {
            addCriterion("BPM_TASK.SERIAL_NUMBER is null");

            return this;
        } // end andSerialNumberIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNotNull() {
            addCriterion("BPM_TASK.SERIAL_NUMBER is not null");

            return this;
        } // end andSerialNumberIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNotEmpty() {
            addCriterion(
                "BPM_TASK.SERIAL_NUMBER is not null AND BPM_TASK.SERIAL_NUMBER <> ''");

            return this;
        } // end andSerialNumberIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsEmpty() {
            addCriterion(
                "(BPM_TASK.SERIAL_NUMBER is null OR BPM_TASK.SERIAL_NUMBER = '')");

            return this;
        } // end andSerialNumberIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("BPM_TASK.SERIAL_NUMBER =", value, "serialNumber");

            return this;
        } // end andSerialNumberEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.SERIAL_NUMBER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("BPM_TASK.SERIAL_NUMBER <>", value, "serialNumber");

            return this;
        } // end andSerialNumberNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualToOrIsNull(String value) {
            addCriterion("BPM_TASK.SERIAL_NUMBER is null OR BPM_TASK.SERIAL_NUMBER <>",
                value, "serialNumber");

            return this;
        } // end andSerialNumberNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.SERIAL_NUMBER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("BPM_TASK.SERIAL_NUMBER >", value, "serialNumber");

            return this;
        } // end andSerialNumberGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.SERIAL_NUMBER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_TASK.SERIAL_NUMBER >=", value, "serialNumber");

            return this;
        } // end andSerialNumberGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.SERIAL_NUMBER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("BPM_TASK.SERIAL_NUMBER <", value, "serialNumber");

            return this;
        } // end andSerialNumberLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.SERIAL_NUMBER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("BPM_TASK.SERIAL_NUMBER <=", value, "serialNumber");

            return this;
        } // end andSerialNumberLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.SERIAL_NUMBER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_TASK.SERIAL_NUMBER like", buffer.toString(),
                "serialNumber");

            return this;
        } // end andSerialNumberLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_TASK.SERIAL_NUMBER not like", buffer.toString(),
                "serialNumber");

            return this;
        } // end andSerialNumberNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.SERIAL_NUMBER in", values, "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.SERIAL_NUMBER not in", values,
                    "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.SERIAL_NUMBER in",
                    Arrays.asList(values), "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.SERIAL_NUMBER not in",
                    Arrays.asList(values), "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("BPM_TASK.SERIAL_NUMBER between", value1, value2,
                "serialNumber");

            return this;
        } // end andSerialNumberBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("BPM_TASK.SERIAL_NUMBER not between", value1, value2,
                "serialNumber");

            return this;
        } // end andSerialNumberNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsNull() {
            addCriterion("BPM_TASK.COMMENT_COUNT is null");

            return this;
        } // end andCommentCountIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsNotNull() {
            addCriterion("BPM_TASK.COMMENT_COUNT is not null");

            return this;
        } // end andCommentCountIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsNotEmpty() {
            addCriterion(
                "BPM_TASK.COMMENT_COUNT is not null AND BPM_TASK.COMMENT_COUNT <> ''");

            return this;
        } // end andCommentCountIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsEmpty() {
            addCriterion(
                "(BPM_TASK.COMMENT_COUNT is null OR BPM_TASK.COMMENT_COUNT = '')");

            return this;
        } // end andCommentCountIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountEqualTo(int value) {
            return andCommentCountEqualTo(Integer.valueOf(value));
        } // end andCommentCountEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.COMMENT_COUNT =", value, "commentCount");

            return this;
        } // end andCommentCountEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.COMMENT_COUNT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentCountEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotEqualTo(int value) {
            return andCommentCountNotEqualTo(Integer.valueOf(value));
        } // end andCommentCountNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.COMMENT_COUNT <>", value, "commentCount");

            return this;
        } // end andCommentCountNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotEqualToOrIsNull(int value) {
            return andCommentCountNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andCommentCountNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotEqualToOrIsNull(
            java.lang.Integer value) {
            addCriterion("BPM_TASK.COMMENT_COUNT is null OR BPM_TASK.COMMENT_COUNT <>",
                value, "commentCount");

            return this;
        } // end andCommentCountNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.COMMENT_COUNT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentCountNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountGreaterThan(int value) {
            return andCommentCountGreaterThan(Integer.valueOf(value));
        } // end andCommentCountGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountGreaterThan(java.lang.Integer value) {
            addCriterion("BPM_TASK.COMMENT_COUNT >", value, "commentCount");

            return this;
        } // end andCommentCountGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.COMMENT_COUNT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentCountGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountGreaterThanOrEqualTo(int value) {
            return andCommentCountGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andCommentCountGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("BPM_TASK.COMMENT_COUNT >=", value, "commentCount");

            return this;
        } // end andCommentCountGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.COMMENT_COUNT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentCountGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountLessThan(int value) {
            return andCommentCountLessThan(Integer.valueOf(value));
        } // end andCommentCountLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountLessThan(java.lang.Integer value) {
            addCriterion("BPM_TASK.COMMENT_COUNT <", value, "commentCount");

            return this;
        } // end andCommentCountLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.COMMENT_COUNT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentCountLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountLessThanOrEqualTo(int value) {
            return andCommentCountLessThanOrEqualTo(Integer.valueOf(value));
        } // end andCommentCountLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountLessThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("BPM_TASK.COMMENT_COUNT <=", value, "commentCount");

            return this;
        } // end andCommentCountLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.COMMENT_COUNT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentCountLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIn(int[] values) {
            if (values.length == 1) {
                return andCommentCountEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.COMMENT_COUNT in", values, "commentCount");

                return this;
            } // end else
        } // end andCommentCountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotIn(int[] values) {
            if (values.length == 1) {
                return andCommentCountNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.COMMENT_COUNT not in", values,
                    "commentCount");

                return this;
            } // end else
        } // end andCommentCountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIn(List values) {
            if (values.size() == 1) {
                return andCommentCountEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.COMMENT_COUNT in", values, "commentCount");

                return this;
            } // end else
        } // end andCommentCountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotIn(List values) {
            if (values.size() == 1) {
                return andCommentCountNotEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_TASK.COMMENT_COUNT not in", values,
                    "commentCount");

                return this;
            } // end else
        } // end andCommentCountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIn(Object[] values) {
            if (values.length == 1) {
                return andCommentCountEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.COMMENT_COUNT in",
                    Arrays.asList(values), "commentCount");

                return this;
            } // end else
        } // end andCommentCountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotIn(Object[] values) {
            if (values.length == 1) {
                return andCommentCountNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.COMMENT_COUNT not in",
                    Arrays.asList(values), "commentCount");

                return this;
            } // end else
        } // end andCommentCountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountBetween(int value1, int value2) {
            addCriterion("BPM_TASK.COMMENT_COUNT between", value1, value2,
                "commentCount");

            return this;
        } // end andCommentCountBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("BPM_TASK.COMMENT_COUNT between", value1, value2,
                "commentCount");

            return this;
        } // end andCommentCountBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotBetween(int value1, int value2) {
            addCriterion("BPM_TASK.COMMENT_COUNT not between", value1, value2,
                "commentCount");

            return this;
        } // end andCommentCountNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("BPM_TASK.COMMENT_COUNT not between", value1, value2,
                "commentCount");

            return this;
        } // end andCommentCountNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsNull() {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT is null");

            return this;
        } // end andAttachmentCountIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsNotNull() {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT is not null");

            return this;
        } // end andAttachmentCountIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsNotEmpty() {
            addCriterion(
                "BPM_TASK.ATTACHMENT_COUNT is not null AND BPM_TASK.ATTACHMENT_COUNT <> ''");

            return this;
        } // end andAttachmentCountIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsEmpty() {
            addCriterion(
                "(BPM_TASK.ATTACHMENT_COUNT is null OR BPM_TASK.ATTACHMENT_COUNT = '')");

            return this;
        } // end andAttachmentCountIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountEqualTo(int value) {
            return andAttachmentCountEqualTo(Integer.valueOf(value));
        } // end andAttachmentCountEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT =", value, "attachmentCount");

            return this;
        } // end andAttachmentCountEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ATTACHMENT_COUNT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentCountEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotEqualTo(int value) {
            return andAttachmentCountNotEqualTo(Integer.valueOf(value));
        } // end andAttachmentCountNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotEqualTo(java.lang.Integer value) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT <>", value,
                "attachmentCount");

            return this;
        } // end andAttachmentCountNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotEqualToOrIsNull(int value) {
            return andAttachmentCountNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andAttachmentCountNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotEqualToOrIsNull(
            java.lang.Integer value) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT is null OR BPM_TASK.ATTACHMENT_COUNT <>",
                value, "attachmentCount");

            return this;
        } // end andAttachmentCountNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ATTACHMENT_COUNT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentCountNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountGreaterThan(int value) {
            return andAttachmentCountGreaterThan(Integer.valueOf(value));
        } // end andAttachmentCountGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountGreaterThan(java.lang.Integer value) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT >", value, "attachmentCount");

            return this;
        } // end andAttachmentCountGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ATTACHMENT_COUNT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentCountGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountGreaterThanOrEqualTo(int value) {
            return andAttachmentCountGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andAttachmentCountGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT >=", value,
                "attachmentCount");

            return this;
        } // end andAttachmentCountGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ATTACHMENT_COUNT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentCountGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountLessThan(int value) {
            return andAttachmentCountLessThan(Integer.valueOf(value));
        } // end andAttachmentCountLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountLessThan(java.lang.Integer value) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT <", value, "attachmentCount");

            return this;
        } // end andAttachmentCountLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ATTACHMENT_COUNT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentCountLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountLessThanOrEqualTo(int value) {
            return andAttachmentCountLessThanOrEqualTo(Integer.valueOf(value));
        } // end andAttachmentCountLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountLessThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT <=", value,
                "attachmentCount");

            return this;
        } // end andAttachmentCountLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.ATTACHMENT_COUNT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentCountLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIn(int[] values) {
            if (values.length == 1) {
                return andAttachmentCountEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.ATTACHMENT_COUNT in", values,
                    "attachmentCount");

                return this;
            } // end else
        } // end andAttachmentCountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotIn(int[] values) {
            if (values.length == 1) {
                return andAttachmentCountNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.ATTACHMENT_COUNT not in", values,
                    "attachmentCount");

                return this;
            } // end else
        } // end andAttachmentCountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIn(List values) {
            if (values.size() == 1) {
                return andAttachmentCountEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_TASK.ATTACHMENT_COUNT in", values,
                    "attachmentCount");

                return this;
            } // end else
        } // end andAttachmentCountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotIn(List values) {
            if (values.size() == 1) {
                return andAttachmentCountNotEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_TASK.ATTACHMENT_COUNT not in", values,
                    "attachmentCount");

                return this;
            } // end else
        } // end andAttachmentCountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIn(Object[] values) {
            if (values.length == 1) {
                return andAttachmentCountEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.ATTACHMENT_COUNT in",
                    Arrays.asList(values), "attachmentCount");

                return this;
            } // end else
        } // end andAttachmentCountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotIn(Object[] values) {
            if (values.length == 1) {
                return andAttachmentCountNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.ATTACHMENT_COUNT not in",
                    Arrays.asList(values), "attachmentCount");

                return this;
            } // end else
        } // end andAttachmentCountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountBetween(int value1, int value2) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT between", value1, value2,
                "attachmentCount");

            return this;
        } // end andAttachmentCountBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT between", value1, value2,
                "attachmentCount");

            return this;
        } // end andAttachmentCountBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotBetween(int value1, int value2) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT not between", value1,
                value2, "attachmentCount");

            return this;
        } // end andAttachmentCountNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("BPM_TASK.ATTACHMENT_COUNT not between", value1,
                value2, "attachmentCount");

            return this;
        } // end andAttachmentCountNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyIsNull() {
            addCriterion("BPM_TASK.TASK_FORM_KEY is null");

            return this;
        } // end andTaskFormKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyIsNotNull() {
            addCriterion("BPM_TASK.TASK_FORM_KEY is not null");

            return this;
        } // end andTaskFormKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyIsNotEmpty() {
            addCriterion(
                "BPM_TASK.TASK_FORM_KEY is not null AND BPM_TASK.TASK_FORM_KEY <> ''");

            return this;
        } // end andTaskFormKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyIsEmpty() {
            addCriterion(
                "(BPM_TASK.TASK_FORM_KEY is null OR BPM_TASK.TASK_FORM_KEY = '')");

            return this;
        } // end andTaskFormKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_FORM_KEY =", value, "taskFormKey");

            return this;
        } // end andTaskFormKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_FORM_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskFormKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyNotEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_FORM_KEY <>", value, "taskFormKey");

            return this;
        } // end andTaskFormKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_TASK.TASK_FORM_KEY is null OR BPM_TASK.TASK_FORM_KEY <>",
                value, "taskFormKey");

            return this;
        } // end andTaskFormKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_FORM_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskFormKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyGreaterThan(String value) {
            addCriterion("BPM_TASK.TASK_FORM_KEY >", value, "taskFormKey");

            return this;
        } // end andTaskFormKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_FORM_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskFormKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_FORM_KEY >=", value, "taskFormKey");

            return this;
        } // end andTaskFormKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_FORM_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskFormKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyLessThan(String value) {
            addCriterion("BPM_TASK.TASK_FORM_KEY <", value, "taskFormKey");

            return this;
        } // end andTaskFormKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_FORM_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskFormKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_TASK.TASK_FORM_KEY <=", value, "taskFormKey");

            return this;
        } // end andTaskFormKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.TASK_FORM_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskFormKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_TASK.TASK_FORM_KEY like", buffer.toString(),
                "taskFormKey");

            return this;
        } // end andTaskFormKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_TASK.TASK_FORM_KEY not like", buffer.toString(),
                "taskFormKey");

            return this;
        } // end andTaskFormKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyIn(List values) {
            if (values.size() == 1) {
                return andTaskFormKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_FORM_KEY in", values, "taskFormKey");

                return this;
            } // end else
        } // end andTaskFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyNotIn(List values) {
            if (values.size() == 1) {
                return andTaskFormKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_FORM_KEY not in", values,
                    "taskFormKey");

                return this;
            } // end else
        } // end andTaskFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyIn(Object[] values) {
            if (values.length == 1) {
                return andTaskFormKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_FORM_KEY in",
                    Arrays.asList(values), "taskFormKey");

                return this;
            } // end else
        } // end andTaskFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andTaskFormKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.TASK_FORM_KEY not in",
                    Arrays.asList(values), "taskFormKey");

                return this;
            } // end else
        } // end andTaskFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyBetween(String value1, String value2) {
            addCriterion("BPM_TASK.TASK_FORM_KEY between", value1, value2,
                "taskFormKey");

            return this;
        } // end andTaskFormKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskFormKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_TASK.TASK_FORM_KEY not between", value1, value2,
                "taskFormKey");

            return this;
        } // end andTaskFormKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyIsNull() {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY is null");

            return this;
        } // end andProcessFormKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyIsNotNull() {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY is not null");

            return this;
        } // end andProcessFormKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyIsNotEmpty() {
            addCriterion(
                "bpmProcessInstanceF.START_FORM_KEY is not null AND bpmProcessInstanceF.START_FORM_KEY <> ''");

            return this;
        } // end andProcessFormKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyIsEmpty() {
            addCriterion(
                "(bpmProcessInstanceF.START_FORM_KEY is null OR bpmProcessInstanceF.START_FORM_KEY = '')");

            return this;
        } // end andProcessFormKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyEqualTo(String value) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY =", value,
                "processFormKey");

            return this;
        } // end andProcessFormKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.START_FORM_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessFormKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyNotEqualTo(String value) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY <>", value,
                "processFormKey");

            return this;
        } // end andProcessFormKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyNotEqualToOrIsNull(String value) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY is null OR bpmProcessInstanceF.START_FORM_KEY <>",
                value, "processFormKey");

            return this;
        } // end andProcessFormKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.START_FORM_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessFormKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyGreaterThan(String value) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY >", value,
                "processFormKey");

            return this;
        } // end andProcessFormKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.START_FORM_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessFormKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyGreaterThanOrEqualTo(String value) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY >=", value,
                "processFormKey");

            return this;
        } // end andProcessFormKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.START_FORM_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessFormKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyLessThan(String value) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY <", value,
                "processFormKey");

            return this;
        } // end andProcessFormKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.START_FORM_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessFormKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyLessThanOrEqualTo(String value) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY <=", value,
                "processFormKey");

            return this;
        } // end andProcessFormKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "bpmProcessInstanceF.START_FORM_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessFormKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmProcessInstanceF.START_FORM_KEY like",
                buffer.toString(), "processFormKey");

            return this;
        } // end andProcessFormKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmProcessInstanceF.START_FORM_KEY not like",
                buffer.toString(), "processFormKey");

            return this;
        } // end andProcessFormKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyIn(List values) {
            if (values.size() == 1) {
                return andProcessFormKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.START_FORM_KEY in", values,
                    "processFormKey");

                return this;
            } // end else
        } // end andProcessFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyNotIn(List values) {
            if (values.size() == 1) {
                return andProcessFormKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.START_FORM_KEY not in",
                    values, "processFormKey");

                return this;
            } // end else
        } // end andProcessFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyIn(Object[] values) {
            if (values.length == 1) {
                return andProcessFormKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.START_FORM_KEY in",
                    Arrays.asList(values), "processFormKey");

                return this;
            } // end else
        } // end andProcessFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessFormKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessInstanceF.START_FORM_KEY not in",
                    Arrays.asList(values), "processFormKey");

                return this;
            } // end else
        } // end andProcessFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyBetween(String value1, String value2) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY between", value1,
                value2, "processFormKey");

            return this;
        } // end andProcessFormKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessFormKeyNotBetween(String value1, String value2) {
            addCriterion("bpmProcessInstanceF.START_FORM_KEY not between",
                value1, value2, "processFormKey");

            return this;
        } // end andProcessFormKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdIsNull() {
            addCriterion("BPM_TASK.PRE_TASK_ID is null");

            return this;
        } // end andPreTaskIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdIsNotNull() {
            addCriterion("BPM_TASK.PRE_TASK_ID is not null");

            return this;
        } // end andPreTaskIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdIsNotEmpty() {
            addCriterion(
                "BPM_TASK.PRE_TASK_ID is not null AND BPM_TASK.PRE_TASK_ID <> ''");

            return this;
        } // end andPreTaskIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdIsEmpty() {
            addCriterion(
                "(BPM_TASK.PRE_TASK_ID is null OR BPM_TASK.PRE_TASK_ID = '')");

            return this;
        } // end andPreTaskIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdEqualTo(long value) {
            return andPreTaskIdEqualTo(Long.valueOf(value));
        } // end andPreTaskIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.PRE_TASK_ID =", value, "preTaskId");

            return this;
        } // end andPreTaskIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRE_TASK_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreTaskIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotEqualTo(long value) {
            return andPreTaskIdNotEqualTo(Long.valueOf(value));
        } // end andPreTaskIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.PRE_TASK_ID <>", value, "preTaskId");

            return this;
        } // end andPreTaskIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotEqualToOrIsNull(long value) {
            return andPreTaskIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andPreTaskIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_TASK.PRE_TASK_ID is null OR BPM_TASK.PRE_TASK_ID <>",
                value, "preTaskId");

            return this;
        } // end andPreTaskIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRE_TASK_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreTaskIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdGreaterThan(long value) {
            return andPreTaskIdGreaterThan(Long.valueOf(value));
        } // end andPreTaskIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_TASK.PRE_TASK_ID >", value, "preTaskId");

            return this;
        } // end andPreTaskIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRE_TASK_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreTaskIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdGreaterThanOrEqualTo(long value) {
            return andPreTaskIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andPreTaskIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.PRE_TASK_ID >=", value, "preTaskId");

            return this;
        } // end andPreTaskIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRE_TASK_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreTaskIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdLessThan(long value) {
            return andPreTaskIdLessThan(Long.valueOf(value));
        } // end andPreTaskIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdLessThan(java.lang.Long value) {
            addCriterion("BPM_TASK.PRE_TASK_ID <", value, "preTaskId");

            return this;
        } // end andPreTaskIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRE_TASK_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreTaskIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdLessThanOrEqualTo(long value) {
            return andPreTaskIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andPreTaskIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_TASK.PRE_TASK_ID <=", value, "preTaskId");

            return this;
        } // end andPreTaskIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_TASK.PRE_TASK_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreTaskIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdIn(long[] values) {
            if (values.length == 1) {
                return andPreTaskIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRE_TASK_ID in", values, "preTaskId");

                return this;
            } // end else
        } // end andPreTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotIn(long[] values) {
            if (values.length == 1) {
                return andPreTaskIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRE_TASK_ID not in", values, "preTaskId");

                return this;
            } // end else
        } // end andPreTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdIn(List values) {
            if (values.size() == 1) {
                return andPreTaskIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.PRE_TASK_ID in", values, "preTaskId");

                return this;
            } // end else
        } // end andPreTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotIn(List values) {
            if (values.size() == 1) {
                return andPreTaskIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_TASK.PRE_TASK_ID not in", values, "preTaskId");

                return this;
            } // end else
        } // end andPreTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdIn(Object[] values) {
            if (values.length == 1) {
                return andPreTaskIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRE_TASK_ID in", Arrays.asList(values),
                    "preTaskId");

                return this;
            } // end else
        } // end andPreTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andPreTaskIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_TASK.PRE_TASK_ID not in",
                    Arrays.asList(values), "preTaskId");

                return this;
            } // end else
        } // end andPreTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdBetween(long value1, long value2) {
            addCriterion("BPM_TASK.PRE_TASK_ID between", value1, value2,
                "preTaskId");

            return this;
        } // end andPreTaskIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK.PRE_TASK_ID between", value1, value2,
                "preTaskId");

            return this;
        } // end andPreTaskIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotBetween(long value1, long value2) {
            addCriterion("BPM_TASK.PRE_TASK_ID not between", value1, value2,
                "preTaskId");

            return this;
        } // end andPreTaskIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreTaskIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_TASK.PRE_TASK_ID not between", value1, value2,
                "preTaskId");

            return this;
        } // end andPreTaskIdNotBetween()
    } // end Criteria
} // end BpmTaskDAOQueryBean
