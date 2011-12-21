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
 * BpmProcessFormInstance query bean 2011-11-28 15:45:02
 *
 * @author Auto Gen
 */
public class BpmProcessFormInstanceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmProcessFormInstanceDAOQueryBean object.
     */
    public BpmProcessFormInstanceDAOQueryBean() {
        super();
    } // end BpmProcessFormInstanceDAOQueryBean()

    /**
     * Creates a new BpmProcessFormInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmProcessFormInstanceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmProcessFormInstanceDAOQueryBean()

    /**
     * Creates a new BpmProcessFormInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmProcessFormInstanceDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmProcessFormInstanceDAOQueryBean()

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
            addSelectProperty(IBpmProcessFormInstanceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormInstanceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFormKeySelectProperty() {
        addFormKeySelectProperty("formKey");
    } // end addFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFormKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormInstanceDAO.FormKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormInstanceDAO.FormKey, "formKey");
        } // end else
    } // end addFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFormXmlSelectProperty() {
        addFormXmlSelectProperty("formXml");
    } // end addFormXmlSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFormXmlSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormInstanceDAO.FormXml, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormInstanceDAO.FormXml, "formXml");
        } // end else
    } // end addFormXmlSelectProperty()

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
            addSelectProperty(IBpmProcessFormInstanceDAO.ProcessInstanceId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormInstanceDAO.ProcessInstanceId,
                "processInstanceId");
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
            addSelectProperty(IBpmProcessFormInstanceDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormInstanceDAO.Remarks, "remarks");
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
            addSelectProperty(IBpmProcessFormInstanceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormInstanceDAO.Status, "status");
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
            addSelectProperty(IBpmProcessFormInstanceDAO.TaskId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormInstanceDAO.TaskId, "taskId");
        } // end else
    } // end addTaskIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addFormKeySelectProperty();

        addFormXmlSelectProperty();

        addProcessInstanceIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addTaskIdSelectProperty();
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.ID is not null AND BPM_PROCESS_FORM_INSTANCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_INSTANCE.ID is null OR BPM_PROCESS_FORM_INSTANCE.ID = '')");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID <>", value, "id");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID is null OR BPM_PROCESS_FORM_INSTANCE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_INSTANCE.ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_INSTANCE.ID");
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.ID in",
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.ID not in",
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID between", value1,
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID between", value1,
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID not between", value1,
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyIsNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY is null");

            return this;
        } // end andFormKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY is not null");

            return this;
        } // end andFormKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.FORM_KEY is not null AND BPM_PROCESS_FORM_INSTANCE.FORM_KEY <> ''");

            return this;
        } // end andFormKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_INSTANCE.FORM_KEY is null OR BPM_PROCESS_FORM_INSTANCE.FORM_KEY = '')");

            return this;
        } // end andFormKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY =", value,
                "formKey");

            return this;
        } // end andFormKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY <>", value,
                "formKey");

            return this;
        } // end andFormKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY is null OR BPM_PROCESS_FORM_INSTANCE.FORM_KEY <>",
                value, "formKey");

            return this;
        } // end andFormKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyGreaterThan(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY >", value,
                "formKey");

            return this;
        } // end andFormKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY >=", value,
                "formKey");

            return this;
        } // end andFormKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyLessThan(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY <", value,
                "formKey");

            return this;
        } // end andFormKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY <=", value,
                "formKey");

            return this;
        } // end andFormKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY like",
                buffer.toString(), "formKey");

            return this;
        } // end andFormKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY not like",
                buffer.toString(), "formKey");

            return this;
        } // end andFormKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyIn(List values) {
            if (values.size() == 1) {
                return andFormKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY in", values,
                    "formKey");

                return this;
            } // end else
        } // end andFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyNotIn(List values) {
            if (values.size() == 1) {
                return andFormKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY not in",
                    values, "formKey");

                return this;
            } // end else
        } // end andFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyIn(Object[] values) {
            if (values.length == 1) {
                return andFormKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY in",
                    Arrays.asList(values), "formKey");

                return this;
            } // end else
        } // end andFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andFormKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY not in",
                    Arrays.asList(values), "formKey");

                return this;
            } // end else
        } // end andFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY between", value1,
                value2, "formKey");

            return this;
        } // end andFormKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_KEY not between",
                value1, value2, "formKey");

            return this;
        } // end andFormKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlIsNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML is null");

            return this;
        } // end andFormXmlIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML is not null");

            return this;
        } // end andFormXmlIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.FORM_XML is not null AND BPM_PROCESS_FORM_INSTANCE.FORM_XML <> ''");

            return this;
        } // end andFormXmlIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_INSTANCE.FORM_XML is null OR BPM_PROCESS_FORM_INSTANCE.FORM_XML = '')");

            return this;
        } // end andFormXmlIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML =", value,
                "formXml");

            return this;
        } // end andFormXmlEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_XML");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormXmlEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML <>", value,
                "formXml");

            return this;
        } // end andFormXmlNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML is null OR BPM_PROCESS_FORM_INSTANCE.FORM_XML <>",
                value, "formXml");

            return this;
        } // end andFormXmlNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_XML");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormXmlNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlGreaterThan(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML >", value,
                "formXml");

            return this;
        } // end andFormXmlGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_XML");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormXmlGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML >=", value,
                "formXml");

            return this;
        } // end andFormXmlGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_XML");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormXmlGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlLessThan(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML <", value,
                "formXml");

            return this;
        } // end andFormXmlLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_XML");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormXmlLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML <=", value,
                "formXml");

            return this;
        } // end andFormXmlLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.FORM_XML");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormXmlLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML like",
                buffer.toString(), "formXml");

            return this;
        } // end andFormXmlLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML not like",
                buffer.toString(), "formXml");

            return this;
        } // end andFormXmlNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlIn(List values) {
            if (values.size() == 1) {
                return andFormXmlEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML in", values,
                    "formXml");

                return this;
            } // end else
        } // end andFormXmlIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlNotIn(List values) {
            if (values.size() == 1) {
                return andFormXmlNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML not in",
                    values, "formXml");

                return this;
            } // end else
        } // end andFormXmlNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlIn(Object[] values) {
            if (values.length == 1) {
                return andFormXmlEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML in",
                    Arrays.asList(values), "formXml");

                return this;
            } // end else
        } // end andFormXmlIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlNotIn(Object[] values) {
            if (values.length == 1) {
                return andFormXmlNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML not in",
                    Arrays.asList(values), "formXml");

                return this;
            } // end else
        } // end andFormXmlNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML between", value1,
                value2, "formXml");

            return this;
        } // end andFormXmlBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormXmlNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.FORM_XML not between",
                value1, value2, "formXml");

            return this;
        } // end andFormXmlNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNull() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID is null");

            return this;
        } // end andProcessInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID is not null");

            return this;
        } // end andProcessInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID is not null AND BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID <> ''");

            return this;
        } // end andProcessInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID is null OR BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID = '')");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID =",
                value, "processInstanceId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID <>",
                value, "processInstanceId");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID is null OR BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID >",
                value, "processInstanceId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID >=",
                value, "processInstanceId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID <",
                value, "processInstanceId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID <=",
                value, "processInstanceId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID");
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID in",
                    values, "processInstanceId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID not in",
                    values, "processInstanceId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID in",
                    values, "processInstanceId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID not in",
                    values, "processInstanceId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID in",
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID not in",
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID between",
                value1, value2, "processInstanceId");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID between",
                value1, value2, "processInstanceId");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID not between",
                value1, value2, "processInstanceId");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID not between",
                value1, value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.REMARKS is not null AND BPM_PROCESS_FORM_INSTANCE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_INSTANCE.REMARKS is null OR BPM_PROCESS_FORM_INSTANCE.REMARKS = '')");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS =", value, "remarks");

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
                    "BPM_PROCESS_FORM_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS <>", value,
                "remarks");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS is null OR BPM_PROCESS_FORM_INSTANCE.REMARKS <>",
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
                    "BPM_PROCESS_FORM_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS >", value, "remarks");

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
                    "BPM_PROCESS_FORM_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS >=", value,
                "remarks");

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
                    "BPM_PROCESS_FORM_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS <", value, "remarks");

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
                    "BPM_PROCESS_FORM_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS <=", value,
                "remarks");

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
                    "BPM_PROCESS_FORM_INSTANCE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS like",
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS not like",
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS in", values,
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS not in",
                    values, "remarks");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS in",
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS not in",
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS between", value1,
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.STATUS is not null AND BPM_PROCESS_FORM_INSTANCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_INSTANCE.STATUS is null OR BPM_PROCESS_FORM_INSTANCE.STATUS = '')");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS =", value, "status");

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
                    "BPM_PROCESS_FORM_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS <>", value, "status");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS is null OR BPM_PROCESS_FORM_INSTANCE.STATUS <>",
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
                    "BPM_PROCESS_FORM_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS >", value, "status");

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
                    "BPM_PROCESS_FORM_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS >=", value, "status");

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
                    "BPM_PROCESS_FORM_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS <", value, "status");

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
                    "BPM_PROCESS_FORM_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS <=", value, "status");

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
                    "BPM_PROCESS_FORM_INSTANCE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS like",
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS not like",
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS in", values,
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS not in", values,
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS in",
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS not in",
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS between", value1,
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID is null");

            return this;
        } // end andTaskIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID is not null");

            return this;
        } // end andTaskIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_INSTANCE.TASK_ID is not null AND BPM_PROCESS_FORM_INSTANCE.TASK_ID <> ''");

            return this;
        } // end andTaskIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_INSTANCE.TASK_ID is null OR BPM_PROCESS_FORM_INSTANCE.TASK_ID = '')");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID =", value, "taskId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.TASK_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID <>", value, "taskId");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID is null OR BPM_PROCESS_FORM_INSTANCE.TASK_ID <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.TASK_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID >", value, "taskId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.TASK_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID >=", value, "taskId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.TASK_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID <", value, "taskId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.TASK_ID");
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID <=", value, "taskId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_INSTANCE.TASK_ID");
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID in", values,
                    "taskId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID not in",
                    values, "taskId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID in", values,
                    "taskId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID not in",
                    values, "taskId");

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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID in",
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
                addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID not in",
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID between", value1,
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID between", value1,
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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID not between",
                value1, value2, "taskId");

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
            addCriterion("BPM_PROCESS_FORM_INSTANCE.TASK_ID not between",
                value1, value2, "taskId");

            return this;
        } // end andTaskIdNotBetween()
    } // end Criteria
} // end BpmProcessFormInstanceDAOQueryBean
