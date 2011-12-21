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
 * BpmProcessInstance query bean 2011-11-25 15:17:21
 *
 * @author Auto Gen
 */
public class BpmProcessInstanceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmProcessInstanceDAOQueryBean object.
     */
    public BpmProcessInstanceDAOQueryBean() {
        super();
    } // end BpmProcessInstanceDAOQueryBean()

    /**
     * Creates a new BpmProcessInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmProcessInstanceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmProcessInstanceDAOQueryBean()

    /**
     * Creates a new BpmProcessInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmProcessInstanceDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmProcessInstanceDAOQueryBean()

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
            addSelectProperty(IBpmProcessInstanceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCompleteDateSelectProperty() {
        addCompleteDateSelectProperty("completeDate");
    } // end addCompleteDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCompleteDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.CompleteDate, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.CompleteDate,
                "completeDate");
        } // end else
    } // end addCompleteDateSelectProperty()

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
            addSelectProperty(IBpmProcessInstanceDAO.ProcessDefineId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.ProcessDefineId,
                "processDefineId");
        } // end else
    } // end addProcessDefineIdSelectProperty()

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
            addSelectProperty(IBpmProcessInstanceDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

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
            addSelectProperty(IBpmProcessInstanceDAO.StarterId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.StarterId, "starterId");
        } // end else
    } // end addStarterIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStartDateSelectProperty() {
        addStartDateSelectProperty("startDate");
    } // end addStartDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStartDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.StartDate, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.StartDate, "startDate");
        } // end else
    } // end addStartDateSelectProperty()

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
            addSelectProperty(IBpmProcessInstanceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(IBpmProcessInstanceDAO.ProcessName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.ProcessName, "processName");
        } // end else
    } // end addProcessNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessKeySelectProperty() {
        addProcessKeySelectProperty("processKey");
    } // end addProcessKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.ProcessKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.ProcessKey, "processKey");
        } // end else
    } // end addProcessKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStarterNameSelectProperty() {
        addStarterNameSelectProperty("starterName");
    } // end addStarterNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStarterNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.StarterName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.StarterName, "starterName");
        } // end else
    } // end addStarterNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStarterCodeSelectProperty() {
        addStarterCodeSelectProperty("starterCode");
    } // end addStarterCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStarterCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.StarterCode, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.StarterCode, "starterCode");
        } // end else
    } // end addStarterCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addInstanceIdSelectProperty() {
        addInstanceIdSelectProperty("instanceId");
    } // end addInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.InstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.InstanceId, "instanceId");
        } // end else
    } // end addInstanceIdSelectProperty()

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
            addSelectProperty(IBpmProcessInstanceDAO.SerialNumber, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.SerialNumber,
                "serialNumber");
        } // end else
    } // end addSerialNumberSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLastOperatorIdSelectProperty() {
        addLastOperatorIdSelectProperty("lastOperatorId");
    } // end addLastOperatorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLastOperatorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.LastOperatorId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.LastOperatorId,
                "lastOperatorId");
        } // end else
    } // end addLastOperatorIdSelectProperty()

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
            addSelectProperty(IBpmProcessInstanceDAO.CommentCount, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.CommentCount,
                "commentCount");
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
            addSelectProperty(IBpmProcessInstanceDAO.AttachmentCount, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.AttachmentCount,
                "attachmentCount");
        } // end else
    } // end addAttachmentCountSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStartFormKeySelectProperty() {
        addStartFormKeySelectProperty("startFormKey");
    } // end addStartFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStartFormKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessInstanceDAO.StartFormKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessInstanceDAO.StartFormKey,
                "startFormKey");
        } // end else
    } // end addStartFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCompleteDateSelectProperty();

        addProcessDefineIdSelectProperty();

        addRemarksSelectProperty();

        addStarterIdSelectProperty();

        addStartDateSelectProperty();

        addStatusSelectProperty();

        addProcessNameSelectProperty();

        addProcessKeySelectProperty();

        addStarterNameSelectProperty();

        addStarterCodeSelectProperty();

        addInstanceIdSelectProperty();

        addSerialNumberSelectProperty();

        addLastOperatorIdSelectProperty();

        addCommentCountSelectProperty();

        addAttachmentCountSelectProperty();

        addStartFormKeySelectProperty();
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
            addCriterion("BPM_PROCESS_INSTANCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.ID is not null AND BPM_PROCESS_INSTANCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.ID is null OR BPM_PROCESS_INSTANCE.ID = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.ID <>", value, "id");

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
            addCriterion("BPM_PROCESS_INSTANCE.ID is null OR BPM_PROCESS_INSTANCE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.ID");
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
                addCriterion("BPM_PROCESS_INSTANCE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_INSTANCE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_INSTANCE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_INSTANCE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_INSTANCE.ID in",
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
                addCriterion("BPM_PROCESS_INSTANCE.ID not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.ID between", value1, value2, "id");

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
            addCriterion("BPM_PROCESS_INSTANCE.ID between", value1, value2, "id");

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
            addCriterion("BPM_PROCESS_INSTANCE.ID not between", value1, value2,
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
            addCriterion("BPM_PROCESS_INSTANCE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.COMPLETE_DATE is null");

            return this;
        } // end andCompleteDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.COMPLETE_DATE is not null");

            return this;
        } // end andCompleteDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.COMPLETE_DATE is not null AND BPM_PROCESS_INSTANCE.COMPLETE_DATE <> ''");

            return this;
        } // end andCompleteDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.COMPLETE_DATE is null OR BPM_PROCESS_INSTANCE.COMPLETE_DATE = '')");

            return this;
        } // end andCompleteDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE =",
                value, "completeDate");

            return this;
        } // end andCompleteDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMPLETE_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE <>",
                value, "completeDate");

            return this;
        } // end andCompleteDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE is null OR BPM_PROCESS_INSTANCE.COMPLETE_DATE <>",
                value, "completeDate");

            return this;
        } // end andCompleteDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMPLETE_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE >",
                value, "completeDate");

            return this;
        } // end andCompleteDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMPLETE_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE >=",
                value, "completeDate");

            return this;
        } // end andCompleteDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMPLETE_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE <",
                value, "completeDate");

            return this;
        } // end andCompleteDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMPLETE_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE <=",
                value, "completeDate");

            return this;
        } // end andCompleteDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMPLETE_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateIn(List values) {
            if (values.size() == 1) {
                return andCompleteDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE in",
                    values, "completeDate");

                return this;
            } // end else
        } // end andCompleteDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateNotIn(List values) {
            if (values.size() == 1) {
                return andCompleteDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE not in",
                    values, "completeDate");

                return this;
            } // end else
        } // end andCompleteDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateIn(Object[] values) {
            if (values.length == 1) {
                return andCompleteDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE in",
                    Arrays.asList(values), "completeDate");

                return this;
            } // end else
        } // end andCompleteDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andCompleteDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE not in",
                    Arrays.asList(values), "completeDate");

                return this;
            } // end else
        } // end andCompleteDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE between",
                value1, value2, "completeDate");

            return this;
        } // end andCompleteDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.COMPLETE_DATE not between",
                value1, value2, "completeDate");

            return this;
        } // end andCompleteDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID is null");

            return this;
        } // end andProcessDefineIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID is not null");

            return this;
        } // end andProcessDefineIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID is not null AND BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID <> ''");

            return this;
        } // end andProcessDefineIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID is null OR BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID =", value,
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
                    "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID <>", value,
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID is null OR BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID <>",
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
                    "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID >", value,
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
                    "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID >=", value,
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
                    "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID <", value,
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
                    "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID <=", value,
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
                    "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID");
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
                addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID in",
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
                addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID not in",
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
                addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID in",
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
                addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID not in",
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
                addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID in",
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
                addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID between",
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID between",
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID not between",
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
            addCriterion("BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID not between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.REMARKS is not null AND BPM_PROCESS_INSTANCE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.REMARKS is null OR BPM_PROCESS_INSTANCE.REMARKS = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS is null OR BPM_PROCESS_INSTANCE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS like",
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS not like",
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
                addCriterion("BPM_PROCESS_INSTANCE.REMARKS in", values,
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
                addCriterion("BPM_PROCESS_INSTANCE.REMARKS not in", values,
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
                addCriterion("BPM_PROCESS_INSTANCE.REMARKS in",
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
                addCriterion("BPM_PROCESS_INSTANCE.REMARKS not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS between", value1,
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
            addCriterion("BPM_PROCESS_INSTANCE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID is null");

            return this;
        } // end andStarterIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID is not null");

            return this;
        } // end andStarterIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.STARTER_ID is not null AND BPM_PROCESS_INSTANCE.STARTER_ID <> ''");

            return this;
        } // end andStarterIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.STARTER_ID is null OR BPM_PROCESS_INSTANCE.STARTER_ID = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID =", value, "starterId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.STARTER_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID <>", value,
                "starterId");

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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID is null OR BPM_PROCESS_INSTANCE.STARTER_ID <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.STARTER_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID >", value, "starterId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.STARTER_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID >=", value,
                "starterId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.STARTER_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID <", value, "starterId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.STARTER_ID");
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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID <=", value,
                "starterId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.STARTER_ID");
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
                addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID in", values,
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
        public Criteria andStarterIdNotIn(long[] values) {
            if (values.length == 1) {
                return andStarterIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID not in", values,
                    "starterId");

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
                addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID in", values,
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
        public Criteria andStarterIdNotIn(List values) {
            if (values.size() == 1) {
                return andStarterIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID not in", values,
                    "starterId");

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
                addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID in",
                    Arrays.asList(values), "starterId");

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
                addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID between", value1,
                value2, "starterId");

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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID between", value1,
                value2, "starterId");

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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID not between", value1,
                value2, "starterId");

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
            addCriterion("BPM_PROCESS_INSTANCE.STARTER_ID not between", value1,
                value2, "starterId");

            return this;
        } // end andStarterIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.START_DATE is null");

            return this;
        } // end andStartDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.START_DATE is not null");

            return this;
        } // end andStartDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.START_DATE is not null AND BPM_PROCESS_INSTANCE.START_DATE <> ''");

            return this;
        } // end andStartDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.START_DATE is null OR BPM_PROCESS_INSTANCE.START_DATE = '')");

            return this;
        } // end andStartDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE =", value,
                "startDate");

            return this;
        } // end andStartDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE <>",
                value, "startDate");

            return this;
        } // end andStartDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE is null OR BPM_PROCESS_INSTANCE.START_DATE <>",
                value, "startDate");

            return this;
        } // end andStartDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE >", value,
                "startDate");

            return this;
        } // end andStartDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE >=",
                value, "startDate");

            return this;
        } // end andStartDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE <", value,
                "startDate");

            return this;
        } // end andStartDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE <=",
                value, "startDate");

            return this;
        } // end andStartDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateIn(List values) {
            if (values.size() == 1) {
                return andStartDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE in",
                    values, "startDate");

                return this;
            } // end else
        } // end andStartDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateNotIn(List values) {
            if (values.size() == 1) {
                return andStartDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE not in",
                    values, "startDate");

                return this;
            } // end else
        } // end andStartDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateIn(Object[] values) {
            if (values.length == 1) {
                return andStartDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE in",
                    Arrays.asList(values), "startDate");

                return this;
            } // end else
        } // end andStartDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andStartDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE not in",
                    Arrays.asList(values), "startDate");

                return this;
            } // end else
        } // end andStartDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE between",
                value1, value2, "startDate");

            return this;
        } // end andStartDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_PROCESS_INSTANCE.START_DATE not between",
                value1, value2, "startDate");

            return this;
        } // end andStartDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.STATUS is not null AND BPM_PROCESS_INSTANCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.STATUS is null OR BPM_PROCESS_INSTANCE.STATUS = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS <>", value, "status");

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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS is null OR BPM_PROCESS_INSTANCE.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS like", buffer.toString(),
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS not like",
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
                addCriterion("BPM_PROCESS_INSTANCE.STATUS in", values, "status");

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
                addCriterion("BPM_PROCESS_INSTANCE.STATUS not in", values,
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
                addCriterion("BPM_PROCESS_INSTANCE.STATUS in",
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
                addCriterion("BPM_PROCESS_INSTANCE.STATUS not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS between", value1, value2,
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
            addCriterion("BPM_PROCESS_INSTANCE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNull() {
            addCriterion("bpmProcessDefineE.PROCESS_NAME is null");

            return this;
        } // end andProcessNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNotNull() {
            addCriterion("bpmProcessDefineE.PROCESS_NAME is not null");

            return this;
        } // end andProcessNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNotEmpty() {
            addCriterion(
                "bpmProcessDefineE.PROCESS_NAME is not null AND bpmProcessDefineE.PROCESS_NAME <> ''");

            return this;
        } // end andProcessNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsEmpty() {
            addCriterion(
                "(bpmProcessDefineE.PROCESS_NAME is null OR bpmProcessDefineE.PROCESS_NAME = '')");

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
            addCriterion("bpmProcessDefineE.PROCESS_NAME =", value,
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
                    "bpmProcessDefineE.PROCESS_NAME");
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME <>", value,
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME is null OR bpmProcessDefineE.PROCESS_NAME <>",
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
                    "bpmProcessDefineE.PROCESS_NAME");
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME >", value,
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
                    "bpmProcessDefineE.PROCESS_NAME");
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME >=", value,
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
                    "bpmProcessDefineE.PROCESS_NAME");
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME <", value,
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
                    "bpmProcessDefineE.PROCESS_NAME");
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME <=", value,
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
                    "bpmProcessDefineE.PROCESS_NAME");
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME like",
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME not like",
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
                addCriterion("bpmProcessDefineE.PROCESS_NAME in", values,
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
                addCriterion("bpmProcessDefineE.PROCESS_NAME not in", values,
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
                addCriterion("bpmProcessDefineE.PROCESS_NAME in",
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
                addCriterion("bpmProcessDefineE.PROCESS_NAME not in",
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME between", value1,
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
            addCriterion("bpmProcessDefineE.PROCESS_NAME not between", value1,
                value2, "processName");

            return this;
        } // end andProcessNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsNull() {
            addCriterion("bpmProcessDefineE.PROCESS_KEY is null");

            return this;
        } // end andProcessKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsNotNull() {
            addCriterion("bpmProcessDefineE.PROCESS_KEY is not null");

            return this;
        } // end andProcessKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsNotEmpty() {
            addCriterion(
                "bpmProcessDefineE.PROCESS_KEY is not null AND bpmProcessDefineE.PROCESS_KEY <> ''");

            return this;
        } // end andProcessKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsEmpty() {
            addCriterion(
                "(bpmProcessDefineE.PROCESS_KEY is null OR bpmProcessDefineE.PROCESS_KEY = '')");

            return this;
        } // end andProcessKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyEqualTo(String value) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY =", value, "processKey");

            return this;
        } // end andProcessKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmProcessDefineE.PROCESS_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotEqualTo(String value) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY <>", value, "processKey");

            return this;
        } // end andProcessKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotEqualToOrIsNull(String value) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY is null OR bpmProcessDefineE.PROCESS_KEY <>",
                value, "processKey");

            return this;
        } // end andProcessKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmProcessDefineE.PROCESS_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThan(String value) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY >", value, "processKey");

            return this;
        } // end andProcessKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmProcessDefineE.PROCESS_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThanOrEqualTo(String value) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY >=", value, "processKey");

            return this;
        } // end andProcessKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmProcessDefineE.PROCESS_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThan(String value) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY <", value, "processKey");

            return this;
        } // end andProcessKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmProcessDefineE.PROCESS_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThanOrEqualTo(String value) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY <=", value, "processKey");

            return this;
        } // end andProcessKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmProcessDefineE.PROCESS_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmProcessDefineE.PROCESS_KEY like",
                buffer.toString(), "processKey");

            return this;
        } // end andProcessKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmProcessDefineE.PROCESS_KEY not like",
                buffer.toString(), "processKey");

            return this;
        } // end andProcessKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIn(List values) {
            if (values.size() == 1) {
                return andProcessKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmProcessDefineE.PROCESS_KEY in", values,
                    "processKey");

                return this;
            } // end else
        } // end andProcessKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotIn(List values) {
            if (values.size() == 1) {
                return andProcessKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmProcessDefineE.PROCESS_KEY not in", values,
                    "processKey");

                return this;
            } // end else
        } // end andProcessKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIn(Object[] values) {
            if (values.length == 1) {
                return andProcessKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessDefineE.PROCESS_KEY in",
                    Arrays.asList(values), "processKey");

                return this;
            } // end else
        } // end andProcessKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmProcessDefineE.PROCESS_KEY not in",
                    Arrays.asList(values), "processKey");

                return this;
            } // end else
        } // end andProcessKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyBetween(String value1, String value2) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY between", value1,
                value2, "processKey");

            return this;
        } // end andProcessKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotBetween(String value1, String value2) {
            addCriterion("bpmProcessDefineE.PROCESS_KEY not between", value1,
                value2, "processKey");

            return this;
        } // end andProcessKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameIsNull() {
            addCriterion("employeeE.NAME is null");

            return this;
        } // end andStarterNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameIsNotNull() {
            addCriterion("employeeE.NAME is not null");

            return this;
        } // end andStarterNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameIsNotEmpty() {
            addCriterion("employeeE.NAME is not null AND employeeE.NAME <> ''");

            return this;
        } // end andStarterNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameIsEmpty() {
            addCriterion("(employeeE.NAME is null OR employeeE.NAME = '')");

            return this;
        } // end andStarterNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameEqualTo(String value) {
            addCriterion("employeeE.NAME =", value, "starterName");

            return this;
        } // end andStarterNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameNotEqualTo(String value) {
            addCriterion("employeeE.NAME <>", value, "starterName");

            return this;
        } // end andStarterNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameNotEqualToOrIsNull(String value) {
            addCriterion("employeeE.NAME is null OR employeeE.NAME <>", value,
                "starterName");

            return this;
        } // end andStarterNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameGreaterThan(String value) {
            addCriterion("employeeE.NAME >", value, "starterName");

            return this;
        } // end andStarterNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeE.NAME >=", value, "starterName");

            return this;
        } // end andStarterNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameLessThan(String value) {
            addCriterion("employeeE.NAME <", value, "starterName");

            return this;
        } // end andStarterNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameLessThanOrEqualTo(String value) {
            addCriterion("employeeE.NAME <=", value, "starterName");

            return this;
        } // end andStarterNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeE.NAME like", buffer.toString(), "starterName");

            return this;
        } // end andStarterNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeE.NAME not like", buffer.toString(),
                "starterName");

            return this;
        } // end andStarterNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameIn(List values) {
            if (values.size() == 1) {
                return andStarterNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeE.NAME in", values, "starterName");

                return this;
            } // end else
        } // end andStarterNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameNotIn(List values) {
            if (values.size() == 1) {
                return andStarterNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeE.NAME not in", values, "starterName");

                return this;
            } // end else
        } // end andStarterNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameIn(Object[] values) {
            if (values.length == 1) {
                return andStarterNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeE.NAME in", Arrays.asList(values),
                    "starterName");

                return this;
            } // end else
        } // end andStarterNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andStarterNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeE.NAME not in", Arrays.asList(values),
                    "starterName");

                return this;
            } // end else
        } // end andStarterNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameBetween(String value1, String value2) {
            addCriterion("employeeE.NAME between", value1, value2, "starterName");

            return this;
        } // end andStarterNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterNameNotBetween(String value1, String value2) {
            addCriterion("employeeE.NAME not between", value1, value2,
                "starterName");

            return this;
        } // end andStarterNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeIsNull() {
            addCriterion("employeeE.CODE is null");

            return this;
        } // end andStarterCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeIsNotNull() {
            addCriterion("employeeE.CODE is not null");

            return this;
        } // end andStarterCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeIsNotEmpty() {
            addCriterion("employeeE.CODE is not null AND employeeE.CODE <> ''");

            return this;
        } // end andStarterCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeIsEmpty() {
            addCriterion("(employeeE.CODE is null OR employeeE.CODE = '')");

            return this;
        } // end andStarterCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeEqualTo(String value) {
            addCriterion("employeeE.CODE =", value, "starterCode");

            return this;
        } // end andStarterCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeNotEqualTo(String value) {
            addCriterion("employeeE.CODE <>", value, "starterCode");

            return this;
        } // end andStarterCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeNotEqualToOrIsNull(String value) {
            addCriterion("employeeE.CODE is null OR employeeE.CODE <>", value,
                "starterCode");

            return this;
        } // end andStarterCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeGreaterThan(String value) {
            addCriterion("employeeE.CODE >", value, "starterCode");

            return this;
        } // end andStarterCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("employeeE.CODE >=", value, "starterCode");

            return this;
        } // end andStarterCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeLessThan(String value) {
            addCriterion("employeeE.CODE <", value, "starterCode");

            return this;
        } // end andStarterCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeLessThanOrEqualTo(String value) {
            addCriterion("employeeE.CODE <=", value, "starterCode");

            return this;
        } // end andStarterCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeE.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStarterCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeE.CODE like", buffer.toString(), "starterCode");

            return this;
        } // end andStarterCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeE.CODE not like", buffer.toString(),
                "starterCode");

            return this;
        } // end andStarterCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeIn(List values) {
            if (values.size() == 1) {
                return andStarterCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeE.CODE in", values, "starterCode");

                return this;
            } // end else
        } // end andStarterCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeNotIn(List values) {
            if (values.size() == 1) {
                return andStarterCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeE.CODE not in", values, "starterCode");

                return this;
            } // end else
        } // end andStarterCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeIn(Object[] values) {
            if (values.length == 1) {
                return andStarterCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeE.CODE in", Arrays.asList(values),
                    "starterCode");

                return this;
            } // end else
        } // end andStarterCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andStarterCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeE.CODE not in", Arrays.asList(values),
                    "starterCode");

                return this;
            } // end else
        } // end andStarterCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeBetween(String value1, String value2) {
            addCriterion("employeeE.CODE between", value1, value2, "starterCode");

            return this;
        } // end andStarterCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStarterCodeNotBetween(String value1, String value2) {
            addCriterion("employeeE.CODE not between", value1, value2,
                "starterCode");

            return this;
        } // end andStarterCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID is null");

            return this;
        } // end andInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID is not null");

            return this;
        } // end andInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.INSTANCE_ID is not null AND BPM_PROCESS_INSTANCE.INSTANCE_ID <> ''");

            return this;
        } // end andInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.INSTANCE_ID is null OR BPM_PROCESS_INSTANCE.INSTANCE_ID = '')");

            return this;
        } // end andInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID =", value,
                "instanceId");

            return this;
        } // end andInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID <>", value,
                "instanceId");

            return this;
        } // end andInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID is null OR BPM_PROCESS_INSTANCE.INSTANCE_ID <>",
                value, "instanceId");

            return this;
        } // end andInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdGreaterThan(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID >", value,
                "instanceId");

            return this;
        } // end andInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID >=", value,
                "instanceId");

            return this;
        } // end andInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdLessThan(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID <", value,
                "instanceId");

            return this;
        } // end andInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID <=", value,
                "instanceId");

            return this;
        } // end andInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID like",
                buffer.toString(), "instanceId");

            return this;
        } // end andInstanceIdLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID not like",
                buffer.toString(), "instanceId");

            return this;
        } // end andInstanceIdNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andInstanceIdEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID in", values,
                    "instanceId");

                return this;
            } // end else
        } // end andInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andInstanceIdNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID not in", values,
                    "instanceId");

                return this;
            } // end else
        } // end andInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andInstanceIdEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID in",
                    Arrays.asList(values), "instanceId");

                return this;
            } // end else
        } // end andInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andInstanceIdNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID not in",
                    Arrays.asList(values), "instanceId");

                return this;
            } // end else
        } // end andInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID between", value1,
                value2, "instanceId");

            return this;
        } // end andInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInstanceIdNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_INSTANCE.INSTANCE_ID not between",
                value1, value2, "instanceId");

            return this;
        } // end andInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER is null");

            return this;
        } // end andSerialNumberIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER is not null");

            return this;
        } // end andSerialNumberIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.SERIAL_NUMBER is not null AND BPM_PROCESS_INSTANCE.SERIAL_NUMBER <> ''");

            return this;
        } // end andSerialNumberIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.SERIAL_NUMBER is null OR BPM_PROCESS_INSTANCE.SERIAL_NUMBER = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER =", value,
                "serialNumber");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.SERIAL_NUMBER");
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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER <>", value,
                "serialNumber");

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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER is null OR BPM_PROCESS_INSTANCE.SERIAL_NUMBER <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.SERIAL_NUMBER");
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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER >", value,
                "serialNumber");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.SERIAL_NUMBER");
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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER >=", value,
                "serialNumber");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.SERIAL_NUMBER");
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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER <", value,
                "serialNumber");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.SERIAL_NUMBER");
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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER <=", value,
                "serialNumber");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.SERIAL_NUMBER");
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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER like",
                buffer.toString(), "serialNumber");

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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER not like",
                buffer.toString(), "serialNumber");

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
                addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER in", values,
                    "serialNumber");

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
                addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER not in",
                    values, "serialNumber");

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
                addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER in",
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
                addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER between", value1,
                value2, "serialNumber");

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
            addCriterion("BPM_PROCESS_INSTANCE.SERIAL_NUMBER not between",
                value1, value2, "serialNumber");

            return this;
        } // end andSerialNumberNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID is null");

            return this;
        } // end andLastOperatorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID is not null");

            return this;
        } // end andLastOperatorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID is not null AND BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID <> ''");

            return this;
        } // end andLastOperatorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID is null OR BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID = '')");

            return this;
        } // end andLastOperatorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdEqualTo(long value) {
            return andLastOperatorIdEqualTo(Long.valueOf(value));
        } // end andLastOperatorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID =", value,
                "lastOperatorId");

            return this;
        } // end andLastOperatorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastOperatorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotEqualTo(long value) {
            return andLastOperatorIdNotEqualTo(Long.valueOf(value));
        } // end andLastOperatorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID <>", value,
                "lastOperatorId");

            return this;
        } // end andLastOperatorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotEqualToOrIsNull(long value) {
            return andLastOperatorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andLastOperatorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID is null OR BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID <>",
                value, "lastOperatorId");

            return this;
        } // end andLastOperatorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastOperatorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdGreaterThan(long value) {
            return andLastOperatorIdGreaterThan(Long.valueOf(value));
        } // end andLastOperatorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID >", value,
                "lastOperatorId");

            return this;
        } // end andLastOperatorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastOperatorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdGreaterThanOrEqualTo(long value) {
            return andLastOperatorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andLastOperatorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID >=", value,
                "lastOperatorId");

            return this;
        } // end andLastOperatorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastOperatorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdLessThan(long value) {
            return andLastOperatorIdLessThan(Long.valueOf(value));
        } // end andLastOperatorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdLessThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID <", value,
                "lastOperatorId");

            return this;
        } // end andLastOperatorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastOperatorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdLessThanOrEqualTo(long value) {
            return andLastOperatorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andLastOperatorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID <=", value,
                "lastOperatorId");

            return this;
        } // end andLastOperatorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastOperatorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdIn(long[] values) {
            if (values.length == 1) {
                return andLastOperatorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID in",
                    values, "lastOperatorId");

                return this;
            } // end else
        } // end andLastOperatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andLastOperatorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID not in",
                    values, "lastOperatorId");

                return this;
            } // end else
        } // end andLastOperatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdIn(List values) {
            if (values.size() == 1) {
                return andLastOperatorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID in",
                    values, "lastOperatorId");

                return this;
            } // end else
        } // end andLastOperatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotIn(List values) {
            if (values.size() == 1) {
                return andLastOperatorIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID not in",
                    values, "lastOperatorId");

                return this;
            } // end else
        } // end andLastOperatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdIn(Object[] values) {
            if (values.length == 1) {
                return andLastOperatorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID in",
                    Arrays.asList(values), "lastOperatorId");

                return this;
            } // end else
        } // end andLastOperatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andLastOperatorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID not in",
                    Arrays.asList(values), "lastOperatorId");

                return this;
            } // end else
        } // end andLastOperatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID between",
                value1, value2, "lastOperatorId");

            return this;
        } // end andLastOperatorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID between",
                value1, value2, "lastOperatorId");

            return this;
        } // end andLastOperatorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID not between",
                value1, value2, "lastOperatorId");

            return this;
        } // end andLastOperatorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastOperatorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID not between",
                value1, value2, "lastOperatorId");

            return this;
        } // end andLastOperatorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT is null");

            return this;
        } // end andCommentCountIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT is not null");

            return this;
        } // end andCommentCountIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.COMMENT_COUNT is not null AND BPM_PROCESS_INSTANCE.COMMENT_COUNT <> ''");

            return this;
        } // end andCommentCountIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentCountIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.COMMENT_COUNT is null OR BPM_PROCESS_INSTANCE.COMMENT_COUNT = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT =", value,
                "commentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT <>", value,
                "commentCount");

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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT is null OR BPM_PROCESS_INSTANCE.COMMENT_COUNT <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT >", value,
                "commentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT >=", value,
                "commentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT <", value,
                "commentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT <=", value,
                "commentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.COMMENT_COUNT");
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
                addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT in", values,
                    "commentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT not in",
                    values, "commentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT in", values,
                    "commentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT not in",
                    values, "commentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT in",
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
                addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT between", value1,
                value2, "commentCount");

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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT between", value1,
                value2, "commentCount");

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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT not between",
                value1, value2, "commentCount");

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
            addCriterion("BPM_PROCESS_INSTANCE.COMMENT_COUNT not between",
                value1, value2, "commentCount");

            return this;
        } // end andCommentCountNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT is null");

            return this;
        } // end andAttachmentCountIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT is not null");

            return this;
        } // end andAttachmentCountIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT is not null AND BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT <> ''");

            return this;
        } // end andAttachmentCountIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentCountIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT is null OR BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT = '')");

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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT =", value,
                "attachmentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT <>", value,
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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT is null OR BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT >", value,
                "attachmentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT >=", value,
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT <", value,
                "attachmentCount");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT");
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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT <=", value,
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT");
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
                addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT in",
                    values, "attachmentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT not in",
                    values, "attachmentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT in",
                    values, "attachmentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT not in",
                    values, "attachmentCount");

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
                addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT in",
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
                addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT not in",
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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT between",
                value1, value2, "attachmentCount");

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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT between",
                value1, value2, "attachmentCount");

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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT not between",
                value1, value2, "attachmentCount");

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
            addCriterion("BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT not between",
                value1, value2, "attachmentCount");

            return this;
        } // end andAttachmentCountNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsNull() {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY is null");

            return this;
        } // end andStartFormKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsNotNull() {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY is not null");

            return this;
        } // end andStartFormKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_INSTANCE.START_FORM_KEY is not null AND BPM_PROCESS_INSTANCE.START_FORM_KEY <> ''");

            return this;
        } // end andStartFormKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_INSTANCE.START_FORM_KEY is null OR BPM_PROCESS_INSTANCE.START_FORM_KEY = '')");

            return this;
        } // end andStartFormKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY =", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_FORM_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY <>", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY is null OR BPM_PROCESS_INSTANCE.START_FORM_KEY <>",
                value, "startFormKey");

            return this;
        } // end andStartFormKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_FORM_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThan(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY >", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_FORM_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY >=", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_FORM_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThan(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY <", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_FORM_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY <=", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_INSTANCE.START_FORM_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY like",
                buffer.toString(), "startFormKey");

            return this;
        } // end andStartFormKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY not like",
                buffer.toString(), "startFormKey");

            return this;
        } // end andStartFormKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIn(List values) {
            if (values.size() == 1) {
                return andStartFormKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY in", values,
                    "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotIn(List values) {
            if (values.size() == 1) {
                return andStartFormKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY not in",
                    values, "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIn(Object[] values) {
            if (values.length == 1) {
                return andStartFormKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY in",
                    Arrays.asList(values), "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andStartFormKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY not in",
                    Arrays.asList(values), "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY between", value1,
                value2, "startFormKey");

            return this;
        } // end andStartFormKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_INSTANCE.START_FORM_KEY not between",
                value1, value2, "startFormKey");

            return this;
        } // end andStartFormKeyNotBetween()
    } // end Criteria
} // end BpmProcessInstanceDAOQueryBean
