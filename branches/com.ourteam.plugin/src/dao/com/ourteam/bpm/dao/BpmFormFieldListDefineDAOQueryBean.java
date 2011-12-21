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
 * BpmFormFieldListDefine query bean 2011-11-01 13:19:51
 *
 * @author Auto Gen
 */
public class BpmFormFieldListDefineDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmFormFieldListDefineDAOQueryBean object.
     */
    public BpmFormFieldListDefineDAOQueryBean() {
        super();
    } // end BpmFormFieldListDefineDAOQueryBean()

    /**
     * Creates a new BpmFormFieldListDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmFormFieldListDefineDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmFormFieldListDefineDAOQueryBean()

    /**
     * Creates a new BpmFormFieldListDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmFormFieldListDefineDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmFormFieldListDefineDAOQueryBean()

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
            addSelectProperty(IBpmFormFieldListDefineDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldListDefineDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldIdSelectProperty() {
        addFieldIdSelectProperty("fieldId");
    } // end addFieldIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldListDefineDAO.FieldId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldListDefineDAO.FieldId, "fieldId");
        } // end else
    } // end addFieldIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addListKeySelectProperty() {
        addListKeySelectProperty("listKey");
    } // end addListKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addListKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldListDefineDAO.ListKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldListDefineDAO.ListKey, "listKey");
        } // end else
    } // end addListKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addListNameSelectProperty() {
        addListNameSelectProperty("listName");
    } // end addListNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addListNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldListDefineDAO.ListName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldListDefineDAO.ListName, "listName");
        } // end else
    } // end addListNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addListTypeSelectProperty() {
        addListTypeSelectProperty("listType");
    } // end addListTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addListTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmFormFieldListDefineDAO.ListType, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldListDefineDAO.ListType, "listType");
        } // end else
    } // end addListTypeSelectProperty()

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
            addSelectProperty(IBpmFormFieldListDefineDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldListDefineDAO.Remarks, "remarks");
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
            addSelectProperty(IBpmFormFieldListDefineDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmFormFieldListDefineDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addFieldIdSelectProperty();

        addListKeySelectProperty();

        addListNameSelectProperty();

        addListTypeSelectProperty();

        addRemarksSelectProperty();

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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_LIST_DEFINE.ID is not null AND BPM_FORM_FIELD_LIST_DEFINE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_LIST_DEFINE.ID is null OR BPM_FORM_FIELD_LIST_DEFINE.ID = '')");

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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_LIST_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID <>", value, "id");

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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID is null OR BPM_FORM_FIELD_LIST_DEFINE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_LIST_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_LIST_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_LIST_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_LIST_DEFINE.ID");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_FORM_FIELD_LIST_DEFINE.ID");
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID not in", values,
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID not in", values,
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID in",
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID not in",
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID between", value1,
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID between", value1,
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID not between", value1,
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID is null");

            return this;
        } // end andFieldIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNotNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID is not null");

            return this;
        } // end andFieldIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID is not null AND BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID <> ''");

            return this;
        } // end andFieldIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID is null OR BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID = '')");

            return this;
        } // end andFieldIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdEqualTo(long value) {
            return andFieldIdEqualTo(Long.valueOf(value));
        } // end andFieldIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID =", value,
                "fieldId");

            return this;
        } // end andFieldIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotEqualTo(long value) {
            return andFieldIdNotEqualTo(Long.valueOf(value));
        } // end andFieldIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID <>", value,
                "fieldId");

            return this;
        } // end andFieldIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotEqualToOrIsNull(long value) {
            return andFieldIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andFieldIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID is null OR BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID <>",
                value, "fieldId");

            return this;
        } // end andFieldIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdGreaterThan(long value) {
            return andFieldIdGreaterThan(Long.valueOf(value));
        } // end andFieldIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID >", value,
                "fieldId");

            return this;
        } // end andFieldIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdGreaterThanOrEqualTo(long value) {
            return andFieldIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andFieldIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID >=", value,
                "fieldId");

            return this;
        } // end andFieldIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdLessThan(long value) {
            return andFieldIdLessThan(Long.valueOf(value));
        } // end andFieldIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdLessThan(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID <", value,
                "fieldId");

            return this;
        } // end andFieldIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdLessThanOrEqualTo(long value) {
            return andFieldIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andFieldIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID <=", value,
                "fieldId");

            return this;
        } // end andFieldIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIn(long[] values) {
            if (values.length == 1) {
                return andFieldIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID in", values,
                    "fieldId");

                return this;
            } // end else
        } // end andFieldIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotIn(long[] values) {
            if (values.length == 1) {
                return andFieldIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID not in",
                    values, "fieldId");

                return this;
            } // end else
        } // end andFieldIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIn(List values) {
            if (values.size() == 1) {
                return andFieldIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID in", values,
                    "fieldId");

                return this;
            } // end else
        } // end andFieldIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotIn(List values) {
            if (values.size() == 1) {
                return andFieldIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID not in",
                    values, "fieldId");

                return this;
            } // end else
        } // end andFieldIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIn(Object[] values) {
            if (values.length == 1) {
                return andFieldIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID in",
                    Arrays.asList(values), "fieldId");

                return this;
            } // end else
        } // end andFieldIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID not in",
                    Arrays.asList(values), "fieldId");

                return this;
            } // end else
        } // end andFieldIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID between", value1,
                value2, "fieldId");

            return this;
        } // end andFieldIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID between", value1,
                value2, "fieldId");

            return this;
        } // end andFieldIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotBetween(long value1, long value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID not between",
                value1, value2, "fieldId");

            return this;
        } // end andFieldIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID not between",
                value1, value2, "fieldId");

            return this;
        } // end andFieldIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyIsNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY is null");

            return this;
        } // end andListKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyIsNotNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY is not null");

            return this;
        } // end andListKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY is not null AND BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY <> ''");

            return this;
        } // end andListKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY is null OR BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY = '')");

            return this;
        } // end andListKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY =", value,
                "listKey");

            return this;
        } // end andListKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyNotEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY <>", value,
                "listKey");

            return this;
        } // end andListKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY is null OR BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY <>",
                value, "listKey");

            return this;
        } // end andListKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyGreaterThan(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY >", value,
                "listKey");

            return this;
        } // end andListKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY >=", value,
                "listKey");

            return this;
        } // end andListKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyLessThan(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY <", value,
                "listKey");

            return this;
        } // end andListKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY <=", value,
                "listKey");

            return this;
        } // end andListKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY like",
                buffer.toString(), "listKey");

            return this;
        } // end andListKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY not like",
                buffer.toString(), "listKey");

            return this;
        } // end andListKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyIn(List values) {
            if (values.size() == 1) {
                return andListKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY in", values,
                    "listKey");

                return this;
            } // end else
        } // end andListKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyNotIn(List values) {
            if (values.size() == 1) {
                return andListKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY not in",
                    values, "listKey");

                return this;
            } // end else
        } // end andListKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyIn(Object[] values) {
            if (values.length == 1) {
                return andListKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY in",
                    Arrays.asList(values), "listKey");

                return this;
            } // end else
        } // end andListKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andListKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY not in",
                    Arrays.asList(values), "listKey");

                return this;
            } // end else
        } // end andListKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY between", value1,
                value2, "listKey");

            return this;
        } // end andListKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY not between",
                value1, value2, "listKey");

            return this;
        } // end andListKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameIsNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME is null");

            return this;
        } // end andListNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameIsNotNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME is not null");

            return this;
        } // end andListNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME is not null AND BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME <> ''");

            return this;
        } // end andListNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME is null OR BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME = '')");

            return this;
        } // end andListNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME =", value,
                "listName");

            return this;
        } // end andListNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameNotEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME <>", value,
                "listName");

            return this;
        } // end andListNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameNotEqualToOrIsNull(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME is null OR BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME <>",
                value, "listName");

            return this;
        } // end andListNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameGreaterThan(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME >", value,
                "listName");

            return this;
        } // end andListNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME >=", value,
                "listName");

            return this;
        } // end andListNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameLessThan(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME <", value,
                "listName");

            return this;
        } // end andListNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameLessThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME <=", value,
                "listName");

            return this;
        } // end andListNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME like",
                buffer.toString(), "listName");

            return this;
        } // end andListNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME not like",
                buffer.toString(), "listName");

            return this;
        } // end andListNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameIn(List values) {
            if (values.size() == 1) {
                return andListNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME in", values,
                    "listName");

                return this;
            } // end else
        } // end andListNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameNotIn(List values) {
            if (values.size() == 1) {
                return andListNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME not in",
                    values, "listName");

                return this;
            } // end else
        } // end andListNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameIn(Object[] values) {
            if (values.length == 1) {
                return andListNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME in",
                    Arrays.asList(values), "listName");

                return this;
            } // end else
        } // end andListNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andListNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME not in",
                    Arrays.asList(values), "listName");

                return this;
            } // end else
        } // end andListNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME between",
                value1, value2, "listName");

            return this;
        } // end andListNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListNameNotBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME not between",
                value1, value2, "listName");

            return this;
        } // end andListNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeIsNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE is null");

            return this;
        } // end andListTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeIsNotNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE is not null");

            return this;
        } // end andListTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE is not null AND BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE <> ''");

            return this;
        } // end andListTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE is null OR BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE = '')");

            return this;
        } // end andListTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE =", value,
                "listType");

            return this;
        } // end andListTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeNotEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE <>", value,
                "listType");

            return this;
        } // end andListTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeNotEqualToOrIsNull(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE is null OR BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE <>",
                value, "listType");

            return this;
        } // end andListTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeGreaterThan(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE >", value,
                "listType");

            return this;
        } // end andListTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE >=", value,
                "listType");

            return this;
        } // end andListTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeLessThan(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE <", value,
                "listType");

            return this;
        } // end andListTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeLessThanOrEqualTo(String value) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE <=", value,
                "listType");

            return this;
        } // end andListTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE like",
                buffer.toString(), "listType");

            return this;
        } // end andListTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE not like",
                buffer.toString(), "listType");

            return this;
        } // end andListTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeIn(List values) {
            if (values.size() == 1) {
                return andListTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE in", values,
                    "listType");

                return this;
            } // end else
        } // end andListTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeNotIn(List values) {
            if (values.size() == 1) {
                return andListTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE not in",
                    values, "listType");

                return this;
            } // end else
        } // end andListTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeIn(Object[] values) {
            if (values.length == 1) {
                return andListTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE in",
                    Arrays.asList(values), "listType");

                return this;
            } // end else
        } // end andListTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andListTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE not in",
                    Arrays.asList(values), "listType");

                return this;
            } // end else
        } // end andListTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE between",
                value1, value2, "listType");

            return this;
        } // end andListTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListTypeNotBetween(String value1, String value2) {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE not between",
                value1, value2, "listType");

            return this;
        } // end andListTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_LIST_DEFINE.REMARKS is not null AND BPM_FORM_FIELD_LIST_DEFINE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_LIST_DEFINE.REMARKS is null OR BPM_FORM_FIELD_LIST_DEFINE.REMARKS = '')");

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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS =", value,
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
                    "BPM_FORM_FIELD_LIST_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS <>", value,
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS is null OR BPM_FORM_FIELD_LIST_DEFINE.REMARKS <>",
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
                    "BPM_FORM_FIELD_LIST_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS >", value,
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
                    "BPM_FORM_FIELD_LIST_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS >=", value,
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
                    "BPM_FORM_FIELD_LIST_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS <", value,
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
                    "BPM_FORM_FIELD_LIST_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS <=", value,
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
                    "BPM_FORM_FIELD_LIST_DEFINE.REMARKS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS like",
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS not like",
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS in", values,
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS not in",
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS in",
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS not in",
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS between", value1,
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_FORM_FIELD_LIST_DEFINE.STATUS is not null AND BPM_FORM_FIELD_LIST_DEFINE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_FORM_FIELD_LIST_DEFINE.STATUS is null OR BPM_FORM_FIELD_LIST_DEFINE.STATUS = '')");

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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS =", value, "status");

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
                    "BPM_FORM_FIELD_LIST_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS <>", value, "status");

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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS is null OR BPM_FORM_FIELD_LIST_DEFINE.STATUS <>",
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
                    "BPM_FORM_FIELD_LIST_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS >", value, "status");

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
                    "BPM_FORM_FIELD_LIST_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS >=", value, "status");

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
                    "BPM_FORM_FIELD_LIST_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS <", value, "status");

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
                    "BPM_FORM_FIELD_LIST_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS <=", value, "status");

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
                    "BPM_FORM_FIELD_LIST_DEFINE.STATUS");
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS like",
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS not like",
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS in", values,
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS not in",
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS in",
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
                addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS not in",
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS between", value1,
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
            addCriterion("BPM_FORM_FIELD_LIST_DEFINE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()
    } // end Criteria
} // end BpmFormFieldListDefineDAOQueryBean
