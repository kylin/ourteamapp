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
 * BpmFormFieldDefine query bean 2011-11-11 13:31:05
 *
 * @author Auto Gen
 */
public class BpmFormFieldDefineDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmFormFieldDefineDAOQueryBean object.
     */
    public BpmFormFieldDefineDAOQueryBean() {
        super();
    } // end BpmFormFieldDefineDAOQueryBean()

    /**
     * Creates a new BpmFormFieldDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmFormFieldDefineDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmFormFieldDefineDAOQueryBean()

    /**
     * Creates a new BpmFormFieldDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmFormFieldDefineDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmFormFieldDefineDAOQueryBean()

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
            addSelectProperty(IBpmFormFieldDefineDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldKeySelectProperty() {
        addFieldKeySelectProperty("fieldKey");
    } // end addFieldKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldDefineDAO.FieldKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.FieldKey, "fieldKey");
        } // end else
    } // end addFieldKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldNameSelectProperty() {
        addFieldNameSelectProperty("fieldName");
    } // end addFieldNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldDefineDAO.FieldName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.FieldName, "fieldName");
        } // end else
    } // end addFieldNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldTypeSelectProperty() {
        addFieldTypeSelectProperty("fieldType");
    } // end addFieldTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldDefineDAO.FieldType, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.FieldType, "fieldType");
        } // end else
    } // end addFieldTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFormDefineIdSelectProperty() {
        addFormDefineIdSelectProperty("formDefineId");
    } // end addFormDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFormDefineIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldDefineDAO.FormDefineId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.FormDefineId,
                "formDefineId");
        } // end else
    } // end addFormDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentFieldIdSelectProperty() {
        addParentFieldIdSelectProperty("parentFieldId");
    } // end addParentFieldIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentFieldIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldDefineDAO.ParentFieldId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.ParentFieldId,
                "parentFieldId");
        } // end else
    } // end addParentFieldIdSelectProperty()

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
            addSelectProperty(IBpmFormFieldDefineDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSortIndexSelectProperty() {
        addSortIndexSelectProperty("sortIndex");
    } // end addSortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSortIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldDefineDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.SortIndex, "sortIndex");
        } // end else
    } // end addSortIndexSelectProperty()

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
            addSelectProperty(IBpmFormFieldDefineDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldDefineDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addFieldKeySelectProperty();

        addFieldNameSelectProperty();

        addFieldTypeSelectProperty();

        addFormDefineIdSelectProperty();

        addParentFieldIdSelectProperty();

        addRemarksSelectProperty();

        addSortIndexSelectProperty();

        addStatusSelectProperty();
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.ID is not null AND BPM_FORM_FIELD_DEFINE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.ID is null OR BPM_FORM_FIELD_DEFINE.ID = '')");

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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID <>", value, "id");

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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID is null OR BPM_FORM_FIELD_DEFINE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.ID");
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
                addCriterion("BPM_FORM_FIELD_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_DEFINE.ID not in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_DEFINE.ID not in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_DEFINE.ID in",
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
                addCriterion("BPM_FORM_FIELD_DEFINE.ID not in",
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID between", value1, value2,
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID between", value1, value2,
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID not between", value1,
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
            addCriterion("BPM_FORM_FIELD_DEFINE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY is null");

            return this;
        } // end andFieldKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY is not null");

            return this;
        } // end andFieldKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.FIELD_KEY is not null AND BPM_FORM_FIELD_DEFINE.FIELD_KEY <> ''");

            return this;
        } // end andFieldKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.FIELD_KEY is null OR BPM_FORM_FIELD_DEFINE.FIELD_KEY = '')");

            return this;
        } // end andFieldKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY =", value, "fieldKey");

            return this;
        } // end andFieldKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyNotEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY <>", value, "fieldKey");

            return this;
        } // end andFieldKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY is null OR BPM_FORM_FIELD_DEFINE.FIELD_KEY <>",
                value, "fieldKey");

            return this;
        } // end andFieldKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyGreaterThan(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY >", value, "fieldKey");

            return this;
        } // end andFieldKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY >=", value, "fieldKey");

            return this;
        } // end andFieldKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyLessThan(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY <", value, "fieldKey");

            return this;
        } // end andFieldKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY <=", value, "fieldKey");

            return this;
        } // end andFieldKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY like",
                buffer.toString(), "fieldKey");

            return this;
        } // end andFieldKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY not like",
                buffer.toString(), "fieldKey");

            return this;
        } // end andFieldKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyIn(List values) {
            if (values.size() == 1) {
                return andFieldKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY in", values,
                    "fieldKey");

                return this;
            } // end else
        } // end andFieldKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyNotIn(List values) {
            if (values.size() == 1) {
                return andFieldKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY not in", values,
                    "fieldKey");

                return this;
            } // end else
        } // end andFieldKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyIn(Object[] values) {
            if (values.length == 1) {
                return andFieldKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY in",
                    Arrays.asList(values), "fieldKey");

                return this;
            } // end else
        } // end andFieldKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY not in",
                    Arrays.asList(values), "fieldKey");

                return this;
            } // end else
        } // end andFieldKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY between", value1,
                value2, "fieldKey");

            return this;
        } // end andFieldKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_KEY not between", value1,
                value2, "fieldKey");

            return this;
        } // end andFieldKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME is null");

            return this;
        } // end andFieldNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME is not null");

            return this;
        } // end andFieldNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.FIELD_NAME is not null AND BPM_FORM_FIELD_DEFINE.FIELD_NAME <> ''");

            return this;
        } // end andFieldNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.FIELD_NAME is null OR BPM_FORM_FIELD_DEFINE.FIELD_NAME = '')");

            return this;
        } // end andFieldNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME =", value,
                "fieldName");

            return this;
        } // end andFieldNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME <>", value,
                "fieldName");

            return this;
        } // end andFieldNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameNotEqualToOrIsNull(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME is null OR BPM_FORM_FIELD_DEFINE.FIELD_NAME <>",
                value, "fieldName");

            return this;
        } // end andFieldNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME >", value,
                "fieldName");

            return this;
        } // end andFieldNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME >=", value,
                "fieldName");

            return this;
        } // end andFieldNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameLessThan(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME <", value,
                "fieldName");

            return this;
        } // end andFieldNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME <=", value,
                "fieldName");

            return this;
        } // end andFieldNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME like",
                buffer.toString(), "fieldName");

            return this;
        } // end andFieldNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME not like",
                buffer.toString(), "fieldName");

            return this;
        } // end andFieldNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIn(List values) {
            if (values.size() == 1) {
                return andFieldNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME in", values,
                    "fieldName");

                return this;
            } // end else
        } // end andFieldNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameNotIn(List values) {
            if (values.size() == 1) {
                return andFieldNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME not in", values,
                    "fieldName");

                return this;
            } // end else
        } // end andFieldNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIn(Object[] values) {
            if (values.length == 1) {
                return andFieldNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME in",
                    Arrays.asList(values), "fieldName");

                return this;
            } // end else
        } // end andFieldNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME not in",
                    Arrays.asList(values), "fieldName");

                return this;
            } // end else
        } // end andFieldNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME between", value1,
                value2, "fieldName");

            return this;
        } // end andFieldNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_NAME not between",
                value1, value2, "fieldName");

            return this;
        } // end andFieldNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE is null");

            return this;
        } // end andFieldTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE is not null");

            return this;
        } // end andFieldTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.FIELD_TYPE is not null AND BPM_FORM_FIELD_DEFINE.FIELD_TYPE <> ''");

            return this;
        } // end andFieldTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.FIELD_TYPE is null OR BPM_FORM_FIELD_DEFINE.FIELD_TYPE = '')");

            return this;
        } // end andFieldTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE =", value,
                "fieldType");

            return this;
        } // end andFieldTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeNotEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE <>", value,
                "fieldType");

            return this;
        } // end andFieldTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeNotEqualToOrIsNull(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE is null OR BPM_FORM_FIELD_DEFINE.FIELD_TYPE <>",
                value, "fieldType");

            return this;
        } // end andFieldTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeGreaterThan(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE >", value,
                "fieldType");

            return this;
        } // end andFieldTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE >=", value,
                "fieldType");

            return this;
        } // end andFieldTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeLessThan(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE <", value,
                "fieldType");

            return this;
        } // end andFieldTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeLessThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE <=", value,
                "fieldType");

            return this;
        } // end andFieldTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FIELD_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE like",
                buffer.toString(), "fieldType");

            return this;
        } // end andFieldTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE not like",
                buffer.toString(), "fieldType");

            return this;
        } // end andFieldTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeIn(List values) {
            if (values.size() == 1) {
                return andFieldTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE in", values,
                    "fieldType");

                return this;
            } // end else
        } // end andFieldTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeNotIn(List values) {
            if (values.size() == 1) {
                return andFieldTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE not in", values,
                    "fieldType");

                return this;
            } // end else
        } // end andFieldTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeIn(Object[] values) {
            if (values.length == 1) {
                return andFieldTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE in",
                    Arrays.asList(values), "fieldType");

                return this;
            } // end else
        } // end andFieldTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE not in",
                    Arrays.asList(values), "fieldType");

                return this;
            } // end else
        } // end andFieldTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE between", value1,
                value2, "fieldType");

            return this;
        } // end andFieldTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTypeNotBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FIELD_TYPE not between",
                value1, value2, "fieldType");

            return this;
        } // end andFieldTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID is null");

            return this;
        } // end andFormDefineIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID is not null");

            return this;
        } // end andFormDefineIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID is not null AND BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID <> ''");

            return this;
        } // end andFormDefineIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID is null OR BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID = '')");

            return this;
        } // end andFormDefineIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdEqualTo(long value) {
            return andFormDefineIdEqualTo(Long.valueOf(value));
        } // end andFormDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID =", value,
                "formDefineId");

            return this;
        } // end andFormDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormDefineIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotEqualTo(long value) {
            return andFormDefineIdNotEqualTo(Long.valueOf(value));
        } // end andFormDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID <>", value,
                "formDefineId");

            return this;
        } // end andFormDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotEqualToOrIsNull(long value) {
            return andFormDefineIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andFormDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID is null OR BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID <>",
                value, "formDefineId");

            return this;
        } // end andFormDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormDefineIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdGreaterThan(long value) {
            return andFormDefineIdGreaterThan(Long.valueOf(value));
        } // end andFormDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID >", value,
                "formDefineId");

            return this;
        } // end andFormDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormDefineIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdGreaterThanOrEqualTo(long value) {
            return andFormDefineIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andFormDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID >=", value,
                "formDefineId");

            return this;
        } // end andFormDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormDefineIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdLessThan(long value) {
            return andFormDefineIdLessThan(Long.valueOf(value));
        } // end andFormDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdLessThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID <", value,
                "formDefineId");

            return this;
        } // end andFormDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormDefineIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdLessThanOrEqualTo(long value) {
            return andFormDefineIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andFormDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID <=", value,
                "formDefineId");

            return this;
        } // end andFormDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFormDefineIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdIn(long[] values) {
            if (values.length == 1) {
                return andFormDefineIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID in", values,
                    "formDefineId");

                return this;
            } // end else
        } // end andFormDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotIn(long[] values) {
            if (values.length == 1) {
                return andFormDefineIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID not in",
                    values, "formDefineId");

                return this;
            } // end else
        } // end andFormDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdIn(List values) {
            if (values.size() == 1) {
                return andFormDefineIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID in", values,
                    "formDefineId");

                return this;
            } // end else
        } // end andFormDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotIn(List values) {
            if (values.size() == 1) {
                return andFormDefineIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID not in",
                    values, "formDefineId");

                return this;
            } // end else
        } // end andFormDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdIn(Object[] values) {
            if (values.length == 1) {
                return andFormDefineIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID in",
                    Arrays.asList(values), "formDefineId");

                return this;
            } // end else
        } // end andFormDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andFormDefineIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID not in",
                    Arrays.asList(values), "formDefineId");

                return this;
            } // end else
        } // end andFormDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID between",
                value1, value2, "formDefineId");

            return this;
        } // end andFormDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID between",
                value1, value2, "formDefineId");

            return this;
        } // end andFormDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID not between",
                value1, value2, "formDefineId");

            return this;
        } // end andFormDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFormDefineIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID not between",
                value1, value2, "formDefineId");

            return this;
        } // end andFormDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID is null");

            return this;
        } // end andParentFieldIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID is not null");

            return this;
        } // end andParentFieldIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID is not null AND BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID <> ''");

            return this;
        } // end andParentFieldIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID is null OR BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID = '')");

            return this;
        } // end andParentFieldIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdEqualTo(long value) {
            return andParentFieldIdEqualTo(Long.valueOf(value));
        } // end andParentFieldIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID =", value,
                "parentFieldId");

            return this;
        } // end andParentFieldIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFieldIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotEqualTo(long value) {
            return andParentFieldIdNotEqualTo(Long.valueOf(value));
        } // end andParentFieldIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID <>", value,
                "parentFieldId");

            return this;
        } // end andParentFieldIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotEqualToOrIsNull(long value) {
            return andParentFieldIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andParentFieldIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID is null OR BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID <>",
                value, "parentFieldId");

            return this;
        } // end andParentFieldIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFieldIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdGreaterThan(long value) {
            return andParentFieldIdGreaterThan(Long.valueOf(value));
        } // end andParentFieldIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID >", value,
                "parentFieldId");

            return this;
        } // end andParentFieldIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFieldIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdGreaterThanOrEqualTo(long value) {
            return andParentFieldIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andParentFieldIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID >=", value,
                "parentFieldId");

            return this;
        } // end andParentFieldIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFieldIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdLessThan(long value) {
            return andParentFieldIdLessThan(Long.valueOf(value));
        } // end andParentFieldIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdLessThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID <", value,
                "parentFieldId");

            return this;
        } // end andParentFieldIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFieldIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdLessThanOrEqualTo(long value) {
            return andParentFieldIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andParentFieldIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID <=", value,
                "parentFieldId");

            return this;
        } // end andParentFieldIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFieldIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdIn(long[] values) {
            if (values.length == 1) {
                return andParentFieldIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID in",
                    values, "parentFieldId");

                return this;
            } // end else
        } // end andParentFieldIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotIn(long[] values) {
            if (values.length == 1) {
                return andParentFieldIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID not in",
                    values, "parentFieldId");

                return this;
            } // end else
        } // end andParentFieldIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdIn(List values) {
            if (values.size() == 1) {
                return andParentFieldIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID in",
                    values, "parentFieldId");

                return this;
            } // end else
        } // end andParentFieldIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentFieldIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID not in",
                    values, "parentFieldId");

                return this;
            } // end else
        } // end andParentFieldIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentFieldIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID in",
                    Arrays.asList(values), "parentFieldId");

                return this;
            } // end else
        } // end andParentFieldIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentFieldIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID not in",
                    Arrays.asList(values), "parentFieldId");

                return this;
            } // end else
        } // end andParentFieldIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID between",
                value1, value2, "parentFieldId");

            return this;
        } // end andParentFieldIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID between",
                value1, value2, "parentFieldId");

            return this;
        } // end andParentFieldIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID not between",
                value1, value2, "parentFieldId");

            return this;
        } // end andParentFieldIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFieldIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID not between",
                value1, value2, "parentFieldId");

            return this;
        } // end andParentFieldIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.REMARKS is not null AND BPM_FORM_FIELD_DEFINE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.REMARKS is null OR BPM_FORM_FIELD_DEFINE.REMARKS = '')");

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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS is null OR BPM_FORM_FIELD_DEFINE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS like",
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS not like",
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
                addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS in", values,
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
                addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS not in", values,
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
                addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS in",
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
                addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS not in",
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS between", value1,
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
            addCriterion("BPM_FORM_FIELD_DEFINE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.SORT_INDEX is not null AND BPM_FORM_FIELD_DEFINE.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.SORT_INDEX is null OR BPM_FORM_FIELD_DEFINE.SORT_INDEX = '')");

            return this;
        } // end andSortIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(long value) {
            return andSortIndexEqualTo(Long.valueOf(value));
        } // end andSortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX =", value,
                "sortIndex");

            return this;
        } // end andSortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.SORT_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualTo(long value) {
            return andSortIndexNotEqualTo(Long.valueOf(value));
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX <>", value,
                "sortIndex");

            return this;
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(long value) {
            return andSortIndexNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX is null OR BPM_FORM_FIELD_DEFINE.SORT_INDEX <>",
                value, "sortIndex");

            return this;
        } // end andSortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.SORT_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThan(long value) {
            return andSortIndexGreaterThan(Long.valueOf(value));
        } // end andSortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX >", value,
                "sortIndex");

            return this;
        } // end andSortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.SORT_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualTo(long value) {
            return andSortIndexGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX >=", value,
                "sortIndex");

            return this;
        } // end andSortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.SORT_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThan(long value) {
            return andSortIndexLessThan(Long.valueOf(value));
        } // end andSortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX <", value,
                "sortIndex");

            return this;
        } // end andSortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.SORT_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualTo(long value) {
            return andSortIndexLessThanOrEqualTo(Long.valueOf(value));
        } // end andSortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX <=", value,
                "sortIndex");

            return this;
        } // end andSortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_DEFINE.SORT_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(long[] values) {
            if (values.length == 1) {
                return andSortIndexEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(long[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX not in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(List values) {
            if (values.size() == 1) {
                return andSortIndexEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(List values) {
            if (values.size() == 1) {
                return andSortIndexNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX not in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX in",
                    Arrays.asList(values), "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX not in",
                    Arrays.asList(values), "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX between", value1,
                value2, "sortIndex");

            return this;
        } // end andSortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX between", value1,
                value2, "sortIndex");

            return this;
        } // end andSortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX not between",
                value1, value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_DEFINE.SORT_INDEX not between",
                value1, value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_DEFINE.STATUS is not null AND BPM_FORM_FIELD_DEFINE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_DEFINE.STATUS is null OR BPM_FORM_FIELD_DEFINE.STATUS = '')");

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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS <>", value, "status");

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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS is null OR BPM_FORM_FIELD_DEFINE.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS like",
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS not like",
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
                addCriterion("BPM_FORM_FIELD_DEFINE.STATUS in", values, "status");

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
                addCriterion("BPM_FORM_FIELD_DEFINE.STATUS not in", values,
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
                addCriterion("BPM_FORM_FIELD_DEFINE.STATUS in",
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
                addCriterion("BPM_FORM_FIELD_DEFINE.STATUS not in",
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS between", value1,
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
            addCriterion("BPM_FORM_FIELD_DEFINE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()
    } // end Criteria
} // end BpmFormFieldDefineDAOQueryBean
