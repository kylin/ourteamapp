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
 * BpmProcessFormValue query bean 2011-11-28 15:45:28
 *
 * @author Auto Gen
 */
public class BpmProcessFormValueDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmProcessFormValueDAOQueryBean object.
     */
    public BpmProcessFormValueDAOQueryBean() {
        super();
    } // end BpmProcessFormValueDAOQueryBean()

    /**
     * Creates a new BpmProcessFormValueDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmProcessFormValueDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmProcessFormValueDAOQueryBean()

    /**
     * Creates a new BpmProcessFormValueDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmProcessFormValueDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmProcessFormValueDAOQueryBean()

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
            addSelectProperty(IBpmProcessFormValueDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDoubleValueSelectProperty() {
        addDoubleValueSelectProperty("doubleValue");
    } // end addDoubleValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDoubleValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormValueDAO.DoubleValue, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.DoubleValue, "doubleValue");
        } // end else
    } // end addDoubleValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFormInstanceIdSelectProperty() {
        addFormInstanceIdSelectProperty("formInstanceId");
    } // end addFormInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFormInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormValueDAO.FormInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.FormInstanceId,
                "formInstanceId");
        } // end else
    } // end addFormInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLongValueSelectProperty() {
        addLongValueSelectProperty("longValue");
    } // end addLongValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLongValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormValueDAO.LongValue, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.LongValue, "longValue");
        } // end else
    } // end addLongValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyDataTypeSelectProperty() {
        addPropertyDataTypeSelectProperty("propertyDataType");
    } // end addPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormValueDAO.PropertyDataType, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.PropertyDataType,
                "propertyDataType");
        } // end else
    } // end addPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyNameSelectProperty() {
        addPropertyNameSelectProperty("propertyName");
    } // end addPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormValueDAO.PropertyName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.PropertyName,
                "propertyName");
        } // end else
    } // end addPropertyNameSelectProperty()

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
            addSelectProperty(IBpmProcessFormValueDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.Remarks, "remarks");
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
            addSelectProperty(IBpmProcessFormValueDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStringValueSelectProperty() {
        addStringValueSelectProperty("stringValue");
    } // end addStringValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStringValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessFormValueDAO.StringValue, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessFormValueDAO.StringValue, "stringValue");
        } // end else
    } // end addStringValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDoubleValueSelectProperty();

        addFormInstanceIdSelectProperty();

        addLongValueSelectProperty();

        addPropertyDataTypeSelectProperty();

        addPropertyNameSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addStringValueSelectProperty();
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.ID is not null AND BPM_PROCESS_FORM_VALUE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.ID is null OR BPM_PROCESS_FORM_VALUE.ID = '')");

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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.ID");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID <>", value, "id");

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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID is null OR BPM_PROCESS_FORM_VALUE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.ID");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.ID");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.ID");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.ID");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.ID");
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
                addCriterion("BPM_PROCESS_FORM_VALUE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_VALUE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_VALUE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_VALUE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_FORM_VALUE.ID in",
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
                addCriterion("BPM_PROCESS_FORM_VALUE.ID not in",
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID between", value1, value2,
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID between", value1, value2,
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID not between", value1,
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
            addCriterion("BPM_PROCESS_FORM_VALUE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE is null");

            return this;
        } // end andDoubleValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE is not null");

            return this;
        } // end andDoubleValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE is not null AND BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE <> ''");

            return this;
        } // end andDoubleValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE is null OR BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE = '')");

            return this;
        } // end andDoubleValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueEqualTo(java.lang.Double value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE =", value,
                "doubleValue");

            return this;
        } // end andDoubleValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDoubleValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueNotEqualTo(java.lang.Double value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE <>", value,
                "doubleValue");

            return this;
        } // end andDoubleValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueNotEqualToOrIsNull(java.lang.Double value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE is null OR BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE <>",
                value, "doubleValue");

            return this;
        } // end andDoubleValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDoubleValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueGreaterThan(java.lang.Double value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE >", value,
                "doubleValue");

            return this;
        } // end andDoubleValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDoubleValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueGreaterThanOrEqualTo(
            java.lang.Double value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE >=", value,
                "doubleValue");

            return this;
        } // end andDoubleValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDoubleValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueLessThan(java.lang.Double value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE <", value,
                "doubleValue");

            return this;
        } // end andDoubleValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDoubleValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueLessThanOrEqualTo(java.lang.Double value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE <=", value,
                "doubleValue");

            return this;
        } // end andDoubleValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDoubleValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueIn(List values) {
            if (values.size() == 1) {
                return andDoubleValueEqualTo((java.lang.Double) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE in", values,
                    "doubleValue");

                return this;
            } // end else
        } // end andDoubleValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueNotIn(List values) {
            if (values.size() == 1) {
                return andDoubleValueNotEqualTo((java.lang.Double) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE not in",
                    values, "doubleValue");

                return this;
            } // end else
        } // end andDoubleValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueIn(Object[] values) {
            if (values.length == 1) {
                return andDoubleValueEqualTo((java.lang.Double) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE in",
                    Arrays.asList(values), "doubleValue");

                return this;
            } // end else
        } // end andDoubleValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andDoubleValueNotEqualTo((java.lang.Double) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE not in",
                    Arrays.asList(values), "doubleValue");

                return this;
            } // end else
        } // end andDoubleValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueBetween(java.lang.Double value1,
            java.lang.Double value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE between", value1,
                value2, "doubleValue");

            return this;
        } // end andDoubleValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDoubleValueNotBetween(java.lang.Double value1,
            java.lang.Double value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE not between",
                value1, value2, "doubleValue");

            return this;
        } // end andDoubleValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID is null");

            return this;
        } // end andFormInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID is not null");

            return this;
        } // end andFormInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID is not null AND BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID <> ''");

            return this;
        } // end andFormInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID is null OR BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID = '')");

            return this;
        } // end andFormInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdEqualTo(long value) {
            return andFormInstanceIdEqualTo(Long.valueOf(value));
        } // end andFormInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID =", value,
                "formInstanceId");

            return this;
        } // end andFormInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotEqualTo(long value) {
            return andFormInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andFormInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID <>", value,
                "formInstanceId");

            return this;
        } // end andFormInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotEqualToOrIsNull(long value) {
            return andFormInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andFormInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID is null OR BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID <>",
                value, "formInstanceId");

            return this;
        } // end andFormInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdGreaterThan(long value) {
            return andFormInstanceIdGreaterThan(Long.valueOf(value));
        } // end andFormInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID >", value,
                "formInstanceId");

            return this;
        } // end andFormInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdGreaterThanOrEqualTo(long value) {
            return andFormInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andFormInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID >=", value,
                "formInstanceId");

            return this;
        } // end andFormInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdLessThan(long value) {
            return andFormInstanceIdLessThan(Long.valueOf(value));
        } // end andFormInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdLessThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID <", value,
                "formInstanceId");

            return this;
        } // end andFormInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdLessThanOrEqualTo(long value) {
            return andFormInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andFormInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID <=", value,
                "formInstanceId");

            return this;
        } // end andFormInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andFormInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID in",
                    values, "formInstanceId");

                return this;
            } // end else
        } // end andFormInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andFormInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID not in",
                    values, "formInstanceId");

                return this;
            } // end else
        } // end andFormInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andFormInstanceIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID in",
                    values, "formInstanceId");

                return this;
            } // end else
        } // end andFormInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andFormInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID not in",
                    values, "formInstanceId");

                return this;
            } // end else
        } // end andFormInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andFormInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID in",
                    Arrays.asList(values), "formInstanceId");

                return this;
            } // end else
        } // end andFormInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andFormInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID not in",
                    Arrays.asList(values), "formInstanceId");

                return this;
            } // end else
        } // end andFormInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID between",
                value1, value2, "formInstanceId");

            return this;
        } // end andFormInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID between",
                value1, value2, "formInstanceId");

            return this;
        } // end andFormInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID not between",
                value1, value2, "formInstanceId");

            return this;
        } // end andFormInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID not between",
                value1, value2, "formInstanceId");

            return this;
        } // end andFormInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE is null");

            return this;
        } // end andLongValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE is not null");

            return this;
        } // end andLongValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.LONG_VALUE is not null AND BPM_PROCESS_FORM_VALUE.LONG_VALUE <> ''");

            return this;
        } // end andLongValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.LONG_VALUE is null OR BPM_PROCESS_FORM_VALUE.LONG_VALUE = '')");

            return this;
        } // end andLongValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE =", value,
                "longValue");

            return this;
        } // end andLongValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.LONG_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLongValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE <>", value,
                "longValue");

            return this;
        } // end andLongValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE is null OR BPM_PROCESS_FORM_VALUE.LONG_VALUE <>",
                value, "longValue");

            return this;
        } // end andLongValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.LONG_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLongValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueGreaterThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE >", value,
                "longValue");

            return this;
        } // end andLongValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.LONG_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLongValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE >=", value,
                "longValue");

            return this;
        } // end andLongValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.LONG_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLongValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueLessThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE <", value,
                "longValue");

            return this;
        } // end andLongValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.LONG_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLongValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE <=", value,
                "longValue");

            return this;
        } // end andLongValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.LONG_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLongValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueIn(List values) {
            if (values.size() == 1) {
                return andLongValueEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE in", values,
                    "longValue");

                return this;
            } // end else
        } // end andLongValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueNotIn(List values) {
            if (values.size() == 1) {
                return andLongValueNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE not in",
                    values, "longValue");

                return this;
            } // end else
        } // end andLongValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueIn(Object[] values) {
            if (values.length == 1) {
                return andLongValueEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE in",
                    Arrays.asList(values), "longValue");

                return this;
            } // end else
        } // end andLongValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andLongValueNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE not in",
                    Arrays.asList(values), "longValue");

                return this;
            } // end else
        } // end andLongValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE between", value1,
                value2, "longValue");

            return this;
        } // end andLongValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLongValueNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.LONG_VALUE not between",
                value1, value2, "longValue");

            return this;
        } // end andLongValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE is null");

            return this;
        } // end andPropertyDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNotNull() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE is not null");

            return this;
        } // end andPropertyDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE is not null AND BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE <> ''");

            return this;
        } // end andPropertyDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE is null OR BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE = '')");

            return this;
        } // end andPropertyDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE =", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE <>", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE is null OR BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE <>",
                value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThan(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE >", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE >=", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThan(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE <", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE <=", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE like",
                buffer.toString(), "propertyDataType");

            return this;
        } // end andPropertyDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE not like",
                buffer.toString(), "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE in",
                    values, "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE not in",
                    values, "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE in",
                    Arrays.asList(values), "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE not in",
                    Arrays.asList(values), "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE between",
                value1, value2, "propertyDataType");

            return this;
        } // end andPropertyDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotBetween(String value1,
            String value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE not between",
                value1, value2, "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME is null");

            return this;
        } // end andPropertyNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME is not null");

            return this;
        } // end andPropertyNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME is not null AND BPM_PROCESS_FORM_VALUE.PROPERTY_NAME <> ''");

            return this;
        } // end andPropertyNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.PROPERTY_NAME is null OR BPM_PROCESS_FORM_VALUE.PROPERTY_NAME = '')");

            return this;
        } // end andPropertyNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME =", value,
                "propertyName");

            return this;
        } // end andPropertyNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME <>", value,
                "propertyName");

            return this;
        } // end andPropertyNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME is null OR BPM_PROCESS_FORM_VALUE.PROPERTY_NAME <>",
                value, "propertyName");

            return this;
        } // end andPropertyNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThan(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME >", value,
                "propertyName");

            return this;
        } // end andPropertyNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME >=", value,
                "propertyName");

            return this;
        } // end andPropertyNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThan(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME <", value,
                "propertyName");

            return this;
        } // end andPropertyNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME <=", value,
                "propertyName");

            return this;
        } // end andPropertyNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME like",
                buffer.toString(), "propertyName");

            return this;
        } // end andPropertyNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME not like",
                buffer.toString(), "propertyName");

            return this;
        } // end andPropertyNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIn(List values) {
            if (values.size() == 1) {
                return andPropertyNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME in", values,
                    "propertyName");

                return this;
            } // end else
        } // end andPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME not in",
                    values, "propertyName");

                return this;
            } // end else
        } // end andPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME in",
                    Arrays.asList(values), "propertyName");

                return this;
            } // end else
        } // end andPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME not in",
                    Arrays.asList(values), "propertyName");

                return this;
            } // end else
        } // end andPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME between",
                value1, value2, "propertyName");

            return this;
        } // end andPropertyNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.PROPERTY_NAME not between",
                value1, value2, "propertyName");

            return this;
        } // end andPropertyNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.REMARKS is not null AND BPM_PROCESS_FORM_VALUE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.REMARKS is null OR BPM_PROCESS_FORM_VALUE.REMARKS = '')");

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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS =", value, "remarks");

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
                    "BPM_PROCESS_FORM_VALUE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS is null OR BPM_PROCESS_FORM_VALUE.REMARKS <>",
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
                    "BPM_PROCESS_FORM_VALUE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS >", value, "remarks");

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
                    "BPM_PROCESS_FORM_VALUE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS >=", value, "remarks");

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
                    "BPM_PROCESS_FORM_VALUE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS <", value, "remarks");

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
                    "BPM_PROCESS_FORM_VALUE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS <=", value, "remarks");

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
                    "BPM_PROCESS_FORM_VALUE.REMARKS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS like",
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS not like",
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
                addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS in", values,
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
                addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS not in", values,
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
                addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS in",
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
                addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS not in",
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS between", value1,
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
            addCriterion("BPM_PROCESS_FORM_VALUE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.STATUS is not null AND BPM_PROCESS_FORM_VALUE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.STATUS is null OR BPM_PROCESS_FORM_VALUE.STATUS = '')");

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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS <>", value, "status");

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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS is null OR BPM_PROCESS_FORM_VALUE.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_FORM_VALUE.STATUS");
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS like",
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS not like",
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
                addCriterion("BPM_PROCESS_FORM_VALUE.STATUS in", values,
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
                addCriterion("BPM_PROCESS_FORM_VALUE.STATUS not in", values,
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
                addCriterion("BPM_PROCESS_FORM_VALUE.STATUS in",
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
                addCriterion("BPM_PROCESS_FORM_VALUE.STATUS not in",
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS between", value1,
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
            addCriterion("BPM_PROCESS_FORM_VALUE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueIsNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE is null");

            return this;
        } // end andStringValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueIsNotNull() {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE is not null");

            return this;
        } // end andStringValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_FORM_VALUE.STRING_VALUE is not null AND BPM_PROCESS_FORM_VALUE.STRING_VALUE <> ''");

            return this;
        } // end andStringValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_FORM_VALUE.STRING_VALUE is null OR BPM_PROCESS_FORM_VALUE.STRING_VALUE = '')");

            return this;
        } // end andStringValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE =", value,
                "stringValue");

            return this;
        } // end andStringValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.STRING_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStringValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE <>", value,
                "stringValue");

            return this;
        } // end andStringValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE is null OR BPM_PROCESS_FORM_VALUE.STRING_VALUE <>",
                value, "stringValue");

            return this;
        } // end andStringValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.STRING_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStringValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueGreaterThan(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE >", value,
                "stringValue");

            return this;
        } // end andStringValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.STRING_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStringValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE >=", value,
                "stringValue");

            return this;
        } // end andStringValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.STRING_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStringValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueLessThan(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE <", value,
                "stringValue");

            return this;
        } // end andStringValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.STRING_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStringValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE <=", value,
                "stringValue");

            return this;
        } // end andStringValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_FORM_VALUE.STRING_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStringValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE like",
                buffer.toString(), "stringValue");

            return this;
        } // end andStringValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE not like",
                buffer.toString(), "stringValue");

            return this;
        } // end andStringValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueIn(List values) {
            if (values.size() == 1) {
                return andStringValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE in", values,
                    "stringValue");

                return this;
            } // end else
        } // end andStringValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueNotIn(List values) {
            if (values.size() == 1) {
                return andStringValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE not in",
                    values, "stringValue");

                return this;
            } // end else
        } // end andStringValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueIn(Object[] values) {
            if (values.length == 1) {
                return andStringValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE in",
                    Arrays.asList(values), "stringValue");

                return this;
            } // end else
        } // end andStringValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andStringValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE not in",
                    Arrays.asList(values), "stringValue");

                return this;
            } // end else
        } // end andStringValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE between", value1,
                value2, "stringValue");

            return this;
        } // end andStringValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStringValueNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_FORM_VALUE.STRING_VALUE not between",
                value1, value2, "stringValue");

            return this;
        } // end andStringValueNotBetween()
    } // end Criteria
} // end BpmProcessFormValueDAOQueryBean
