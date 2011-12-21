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
 * BpmFormFieldStatusDefine query bean 2011-11-01 13:19:52
 *
 * @author Auto Gen
 */
public class BpmFormFieldStatusDefineDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmFormFieldStatusDefineDAOQueryBean object.
     */
    public BpmFormFieldStatusDefineDAOQueryBean() {
        super();
    } // end BpmFormFieldStatusDefineDAOQueryBean()

    /**
     * Creates a new BpmFormFieldStatusDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmFormFieldStatusDefineDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmFormFieldStatusDefineDAOQueryBean()

    /**
     * Creates a new BpmFormFieldStatusDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmFormFieldStatusDefineDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmFormFieldStatusDefineDAOQueryBean()

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
            addSelectProperty(IBpmFormFieldStatusDefineDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.Id, "id");
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
            addSelectProperty(IBpmFormFieldStatusDefineDAO.BpmRoleId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.BpmRoleId,
                "bpmRoleId");
        } // end else
    } // end addBpmRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldDefineIdSelectProperty() {
        addFieldDefineIdSelectProperty("fieldDefineId");
    } // end addFieldDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldDefineIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.FieldDefineId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.FieldDefineId,
                "fieldDefineId");
        } // end else
    } // end addFieldDefineIdSelectProperty()

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
            addSelectProperty(IBpmFormFieldStatusDefineDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.Remarks, "remarks");
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
            addSelectProperty(IBpmFormFieldStatusDefineDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStepDefineIdSelectProperty() {
        addStepDefineIdSelectProperty("stepDefineId");
    } // end addStepDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStepDefineIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.StepDefineId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.StepDefineId,
                "stepDefineId");
        } // end else
    } // end addStepDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldStatusSelectProperty() {
        addFieldStatusSelectProperty("fieldStatus");
    } // end addFieldStatusSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldStatusSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.FieldStatus, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldStatusDefineDAO.FieldStatus,
                "fieldStatus");
        } // end else
    } // end addFieldStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addBpmRoleIdSelectProperty();

        addFieldDefineIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addStepDefineIdSelectProperty();

        addFieldStatusSelectProperty();
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.ID is not null AND BPM_FORM_FIELD_STATUS_DEFINE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_STATUS_DEFINE.ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.ID = '')");

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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID =", value, "id");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID <>", value, "id");

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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.ID <>",
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID >", value, "id");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID >=", value, "id");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID <", value, "id");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID <=", value, "id");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.ID");
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID not in", values,
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID not in", values,
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID not in",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID between", value1,
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID between", value1,
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID not between", value1,
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID is null");

            return this;
        } // end andBpmRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsNotNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID is not null");

            return this;
        } // end andBpmRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID is not null AND BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID <> ''");

            return this;
        } // end andBpmRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmRoleIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID = '')");

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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID =", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID <>", value,
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID <>",
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID >", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID >=", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID <", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID <=", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID");
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID in",
                    values, "bpmRoleId");

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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID not in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID in",
                    values, "bpmRoleId");

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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID not in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID not in",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID between",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID between",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID not between",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID not between",
                value1, value2, "bpmRoleId");

            return this;
        } // end andBpmRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdIsNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID is null");

            return this;
        } // end andFieldDefineIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdIsNotNull() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID is not null");

            return this;
        } // end andFieldDefineIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID is not null AND BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID <> ''");

            return this;
        } // end andFieldDefineIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID = '')");

            return this;
        } // end andFieldDefineIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdEqualTo(long value) {
            return andFieldDefineIdEqualTo(Long.valueOf(value));
        } // end andFieldDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID =",
                value, "fieldDefineId");

            return this;
        } // end andFieldDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDefineIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotEqualTo(long value) {
            return andFieldDefineIdNotEqualTo(Long.valueOf(value));
        } // end andFieldDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID <>",
                value, "fieldDefineId");

            return this;
        } // end andFieldDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotEqualToOrIsNull(long value) {
            return andFieldDefineIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andFieldDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID <>",
                value, "fieldDefineId");

            return this;
        } // end andFieldDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDefineIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdGreaterThan(long value) {
            return andFieldDefineIdGreaterThan(Long.valueOf(value));
        } // end andFieldDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID >",
                value, "fieldDefineId");

            return this;
        } // end andFieldDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDefineIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdGreaterThanOrEqualTo(long value) {
            return andFieldDefineIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andFieldDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID >=",
                value, "fieldDefineId");

            return this;
        } // end andFieldDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDefineIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdLessThan(long value) {
            return andFieldDefineIdLessThan(Long.valueOf(value));
        } // end andFieldDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdLessThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID <",
                value, "fieldDefineId");

            return this;
        } // end andFieldDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDefineIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdLessThanOrEqualTo(long value) {
            return andFieldDefineIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andFieldDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID <=",
                value, "fieldDefineId");

            return this;
        } // end andFieldDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDefineIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdIn(long[] values) {
            if (values.length == 1) {
                return andFieldDefineIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID in",
                    values, "fieldDefineId");

                return this;
            } // end else
        } // end andFieldDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotIn(long[] values) {
            if (values.length == 1) {
                return andFieldDefineIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID not in",
                    values, "fieldDefineId");

                return this;
            } // end else
        } // end andFieldDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdIn(List values) {
            if (values.size() == 1) {
                return andFieldDefineIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID in",
                    values, "fieldDefineId");

                return this;
            } // end else
        } // end andFieldDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotIn(List values) {
            if (values.size() == 1) {
                return andFieldDefineIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID not in",
                    values, "fieldDefineId");

                return this;
            } // end else
        } // end andFieldDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdIn(Object[] values) {
            if (values.length == 1) {
                return andFieldDefineIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID in",
                    Arrays.asList(values), "fieldDefineId");

                return this;
            } // end else
        } // end andFieldDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldDefineIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID not in",
                    Arrays.asList(values), "fieldDefineId");

                return this;
            } // end else
        } // end andFieldDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID between",
                value1, value2, "fieldDefineId");

            return this;
        } // end andFieldDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID between",
                value1, value2, "fieldDefineId");

            return this;
        } // end andFieldDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID not between",
                value1, value2, "fieldDefineId");

            return this;
        } // end andFieldDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDefineIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID not between",
                value1, value2, "fieldDefineId");

            return this;
        } // end andFieldDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS is not null AND BPM_FORM_FIELD_STATUS_DEFINE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_STATUS_DEFINE.REMARKS is null OR BPM_FORM_FIELD_STATUS_DEFINE.REMARKS = '')");

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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS =", value,
                "remarks");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS <>", value,
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS is null OR BPM_FORM_FIELD_STATUS_DEFINE.REMARKS <>",
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS >", value,
                "remarks");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS >=", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS <", value,
                "remarks");

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
                    "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS <=", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS like",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS not like",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS in", values,
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS not in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS not in",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS between",
                value1, value2, "remarks");

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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.STATUS is not null AND BPM_FORM_FIELD_STATUS_DEFINE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_STATUS_DEFINE.STATUS is null OR BPM_FORM_FIELD_STATUS_DEFINE.STATUS = '')");

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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS =", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS <>", value,
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS is null OR BPM_FORM_FIELD_STATUS_DEFINE.STATUS <>",
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS >", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS >=", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS <", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS <=", value,
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
                    "BPM_FORM_FIELD_STATUS_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS like",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS not like",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS in", values,
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS not in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS in",
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
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS not in",
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS between", value1,
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
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdIsNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID is null");

            return this;
        } // end andStepDefineIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdIsNotNull() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID is not null");

            return this;
        } // end andStepDefineIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID is not null AND BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID <> ''");

            return this;
        } // end andStepDefineIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID = '')");

            return this;
        } // end andStepDefineIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdEqualTo(long value) {
            return andStepDefineIdEqualTo(Long.valueOf(value));
        } // end andStepDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID =",
                value, "stepDefineId");

            return this;
        } // end andStepDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStepDefineIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotEqualTo(long value) {
            return andStepDefineIdNotEqualTo(Long.valueOf(value));
        } // end andStepDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID <>",
                value, "stepDefineId");

            return this;
        } // end andStepDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotEqualToOrIsNull(long value) {
            return andStepDefineIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andStepDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID is null OR BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID <>",
                value, "stepDefineId");

            return this;
        } // end andStepDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStepDefineIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdGreaterThan(long value) {
            return andStepDefineIdGreaterThan(Long.valueOf(value));
        } // end andStepDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID >",
                value, "stepDefineId");

            return this;
        } // end andStepDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStepDefineIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdGreaterThanOrEqualTo(long value) {
            return andStepDefineIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andStepDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID >=",
                value, "stepDefineId");

            return this;
        } // end andStepDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStepDefineIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdLessThan(long value) {
            return andStepDefineIdLessThan(Long.valueOf(value));
        } // end andStepDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdLessThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID <",
                value, "stepDefineId");

            return this;
        } // end andStepDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStepDefineIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdLessThanOrEqualTo(long value) {
            return andStepDefineIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andStepDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID <=",
                value, "stepDefineId");

            return this;
        } // end andStepDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStepDefineIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdIn(long[] values) {
            if (values.length == 1) {
                return andStepDefineIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID in",
                    values, "stepDefineId");

                return this;
            } // end else
        } // end andStepDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotIn(long[] values) {
            if (values.length == 1) {
                return andStepDefineIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID not in",
                    values, "stepDefineId");

                return this;
            } // end else
        } // end andStepDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdIn(List values) {
            if (values.size() == 1) {
                return andStepDefineIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID in",
                    values, "stepDefineId");

                return this;
            } // end else
        } // end andStepDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotIn(List values) {
            if (values.size() == 1) {
                return andStepDefineIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID not in",
                    values, "stepDefineId");

                return this;
            } // end else
        } // end andStepDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdIn(Object[] values) {
            if (values.length == 1) {
                return andStepDefineIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID in",
                    Arrays.asList(values), "stepDefineId");

                return this;
            } // end else
        } // end andStepDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andStepDefineIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID not in",
                    Arrays.asList(values), "stepDefineId");

                return this;
            } // end else
        } // end andStepDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID between",
                value1, value2, "stepDefineId");

            return this;
        } // end andStepDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID between",
                value1, value2, "stepDefineId");

            return this;
        } // end andStepDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID not between",
                value1, value2, "stepDefineId");

            return this;
        } // end andStepDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStepDefineIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID not between",
                value1, value2, "stepDefineId");

            return this;
        } // end andStepDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusIsNull() {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS is null");

            return this;
        } // end andFieldStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusIsNotNull() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS is not null");

            return this;
        } // end andFieldStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS is not null AND BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS <> ''");

            return this;
        } // end andFieldStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS is null OR BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS = '')");

            return this;
        } // end andFieldStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS =", value,
                "fieldStatus");

            return this;
        } // end andFieldStatusEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldStatusEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusNotEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS <>", value,
                "fieldStatus");

            return this;
        } // end andFieldStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusNotEqualToOrIsNull(String value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS is null OR BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS <>",
                value, "fieldStatus");

            return this;
        } // end andFieldStatusNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldStatusNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusGreaterThan(String value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS >", value,
                "fieldStatus");

            return this;
        } // end andFieldStatusGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldStatusGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS >=", value,
                "fieldStatus");

            return this;
        } // end andFieldStatusGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldStatusGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusLessThan(String value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS <", value,
                "fieldStatus");

            return this;
        } // end andFieldStatusLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldStatusLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusLessThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS <=", value,
                "fieldStatus");

            return this;
        } // end andFieldStatusLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS like",
                buffer.toString(), "fieldStatus");

            return this;
        } // end andFieldStatusLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS not like",
                buffer.toString(), "fieldStatus");

            return this;
        } // end andFieldStatusNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusIn(List values) {
            if (values.size() == 1) {
                return andFieldStatusEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS in",
                    values, "fieldStatus");

                return this;
            } // end else
        } // end andFieldStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusNotIn(List values) {
            if (values.size() == 1) {
                return andFieldStatusNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS not in",
                    values, "fieldStatus");

                return this;
            } // end else
        } // end andFieldStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusIn(Object[] values) {
            if (values.length == 1) {
                return andFieldStatusEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS in",
                    Arrays.asList(values), "fieldStatus");

                return this;
            } // end else
        } // end andFieldStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS not in",
                    Arrays.asList(values), "fieldStatus");

                return this;
            } // end else
        } // end andFieldStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS between",
                value1, value2, "fieldStatus");

            return this;
        } // end andFieldStatusBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldStatusNotBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS not between",
                value1, value2, "fieldStatus");

            return this;
        } // end andFieldStatusNotBetween()
    } // end Criteria
} // end BpmFormFieldStatusDefineDAOQueryBean
