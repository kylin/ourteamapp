/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * MiddleWareToolInputLog query bean 2011-12-09 08:49:12
 *
 * @author Auto Gen
 */
public class MiddleWareToolInputLogDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new MiddleWareToolInputLogDAOQueryBean object.
     */
    public MiddleWareToolInputLogDAOQueryBean() {
        super();
    } // end MiddleWareToolInputLogDAOQueryBean()

    /**
     * Creates a new MiddleWareToolInputLogDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public MiddleWareToolInputLogDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end MiddleWareToolInputLogDAOQueryBean()

    /**
     * Creates a new MiddleWareToolInputLogDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public MiddleWareToolInputLogDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end MiddleWareToolInputLogDAOQueryBean()

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
            addSelectProperty(IMiddleWareToolInputLogDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.Id, "id");
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
            addSelectProperty(IMiddleWareToolInputLogDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.Remarks, "remarks");
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
            addSelectProperty(IMiddleWareToolInputLogDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolInputIdSelectProperty() {
        addToolInputIdSelectProperty("toolInputId");
    } // end addToolInputIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolInputIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputLogDAO.ToolInputId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.ToolInputId,
                "toolInputId");
        } // end else
    } // end addToolInputIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolInputValueSelectProperty() {
        addToolInputValueSelectProperty("toolInputValue");
    } // end addToolInputValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolInputValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputLogDAO.ToolInputValue, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.ToolInputValue,
                "toolInputValue");
        } // end else
    } // end addToolInputValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolLogIdSelectProperty() {
        addToolLogIdSelectProperty("toolLogId");
    } // end addToolLogIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolLogIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputLogDAO.ToolLogId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.ToolLogId, "toolLogId");
        } // end else
    } // end addToolLogIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParameterNameSelectProperty() {
        addParameterNameSelectProperty("parameterName");
    } // end addParameterNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParameterNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputLogDAO.ParameterName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.ParameterName,
                "parameterName");
        } // end else
    } // end addParameterNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParameterCodeSelectProperty() {
        addParameterCodeSelectProperty("parameterCode");
    } // end addParameterCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParameterCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputLogDAO.ParameterCode, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.ParameterCode,
                "parameterCode");
        } // end else
    } // end addParameterCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParameterTypeSelectProperty() {
        addParameterTypeSelectProperty("parameterType");
    } // end addParameterTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParameterTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputLogDAO.ParameterType, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.ParameterType,
                "parameterType");
        } // end else
    } // end addParameterTypeSelectProperty()

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
            addSelectProperty(IMiddleWareToolInputLogDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputLogDAO.SortIndex, "sortIndex");
        } // end else
    } // end addSortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addToolInputIdSelectProperty();

        addToolInputValueSelectProperty();

        addToolLogIdSelectProperty();

        addParameterNameSelectProperty();

        addParameterCodeSelectProperty();

        addParameterTypeSelectProperty();

        addSortIndexSelectProperty();
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT_LOG.ID is not null AND MIDDLE_WARE_TOOL_INPUT_LOG.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT_LOG.ID is null OR MIDDLE_WARE_TOOL_INPUT_LOG.ID = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID <>", value, "id");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID is null OR MIDDLE_WARE_TOOL_INPUT_LOG.ID <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT_LOG.ID");
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID not between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS is not null AND MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS is null OR MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS =", value,
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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS <>", value,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS is null OR MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS <>",
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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS >", value,
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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS >=", value,
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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS <", value,
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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS <=", value,
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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS like",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS not in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS is not null AND MIDDLE_WARE_TOOL_INPUT_LOG.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT_LOG.STATUS is null OR MIDDLE_WARE_TOOL_INPUT_LOG.STATUS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS =", value, "status");

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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS <>", value, "status");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS is null OR MIDDLE_WARE_TOOL_INPUT_LOG.STATUS <>",
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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS >", value, "status");

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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS >=", value, "status");

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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS <", value, "status");

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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS <=", value, "status");

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
                    "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS like",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS not in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID is null");

            return this;
        } // end andToolInputIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID is not null");

            return this;
        } // end andToolInputIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID is not null AND MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID <> ''");

            return this;
        } // end andToolInputIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID is null OR MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID = '')");

            return this;
        } // end andToolInputIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdEqualTo(long value) {
            return andToolInputIdEqualTo(Long.valueOf(value));
        } // end andToolInputIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID =", value,
                "toolInputId");

            return this;
        } // end andToolInputIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotEqualTo(long value) {
            return andToolInputIdNotEqualTo(Long.valueOf(value));
        } // end andToolInputIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID <>", value,
                "toolInputId");

            return this;
        } // end andToolInputIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotEqualToOrIsNull(long value) {
            return andToolInputIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andToolInputIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID is null OR MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID <>",
                value, "toolInputId");

            return this;
        } // end andToolInputIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdGreaterThan(long value) {
            return andToolInputIdGreaterThan(Long.valueOf(value));
        } // end andToolInputIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID >", value,
                "toolInputId");

            return this;
        } // end andToolInputIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdGreaterThanOrEqualTo(long value) {
            return andToolInputIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andToolInputIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID >=", value,
                "toolInputId");

            return this;
        } // end andToolInputIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdLessThan(long value) {
            return andToolInputIdLessThan(Long.valueOf(value));
        } // end andToolInputIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID <", value,
                "toolInputId");

            return this;
        } // end andToolInputIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdLessThanOrEqualTo(long value) {
            return andToolInputIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andToolInputIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID <=", value,
                "toolInputId");

            return this;
        } // end andToolInputIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdIn(long[] values) {
            if (values.length == 1) {
                return andToolInputIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID in",
                    values, "toolInputId");

                return this;
            } // end else
        } // end andToolInputIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotIn(long[] values) {
            if (values.length == 1) {
                return andToolInputIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID not in",
                    values, "toolInputId");

                return this;
            } // end else
        } // end andToolInputIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdIn(List values) {
            if (values.size() == 1) {
                return andToolInputIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID in",
                    values, "toolInputId");

                return this;
            } // end else
        } // end andToolInputIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotIn(List values) {
            if (values.size() == 1) {
                return andToolInputIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID not in",
                    values, "toolInputId");

                return this;
            } // end else
        } // end andToolInputIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdIn(Object[] values) {
            if (values.length == 1) {
                return andToolInputIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID in",
                    Arrays.asList(values), "toolInputId");

                return this;
            } // end else
        } // end andToolInputIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolInputIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID not in",
                    Arrays.asList(values), "toolInputId");

                return this;
            } // end else
        } // end andToolInputIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID between",
                value1, value2, "toolInputId");

            return this;
        } // end andToolInputIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID between",
                value1, value2, "toolInputId");

            return this;
        } // end andToolInputIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID not between",
                value1, value2, "toolInputId");

            return this;
        } // end andToolInputIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID not between",
                value1, value2, "toolInputId");

            return this;
        } // end andToolInputIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE is null");

            return this;
        } // end andToolInputValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueIsNotNull() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE is not null");

            return this;
        } // end andToolInputValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE is not null AND MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE <> ''");

            return this;
        } // end andToolInputValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE is null OR MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE = '')");

            return this;
        } // end andToolInputValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE =",
                value, "toolInputValue");

            return this;
        } // end andToolInputValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE <>",
                value, "toolInputValue");

            return this;
        } // end andToolInputValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE is null OR MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE <>",
                value, "toolInputValue");

            return this;
        } // end andToolInputValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE >",
                value, "toolInputValue");

            return this;
        } // end andToolInputValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE >=",
                value, "toolInputValue");

            return this;
        } // end andToolInputValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE <",
                value, "toolInputValue");

            return this;
        } // end andToolInputValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE <=",
                value, "toolInputValue");

            return this;
        } // end andToolInputValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolInputValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE like",
                buffer.toString(), "toolInputValue");

            return this;
        } // end andToolInputValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE not like",
                buffer.toString(), "toolInputValue");

            return this;
        } // end andToolInputValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueIn(List values) {
            if (values.size() == 1) {
                return andToolInputValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE in",
                    values, "toolInputValue");

                return this;
            } // end else
        } // end andToolInputValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueNotIn(List values) {
            if (values.size() == 1) {
                return andToolInputValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE not in",
                    values, "toolInputValue");

                return this;
            } // end else
        } // end andToolInputValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueIn(Object[] values) {
            if (values.length == 1) {
                return andToolInputValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE in",
                    Arrays.asList(values), "toolInputValue");

                return this;
            } // end else
        } // end andToolInputValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolInputValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE not in",
                    Arrays.asList(values), "toolInputValue");

                return this;
            } // end else
        } // end andToolInputValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE between",
                value1, value2, "toolInputValue");

            return this;
        } // end andToolInputValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolInputValueNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE not between",
                value1, value2, "toolInputValue");

            return this;
        } // end andToolInputValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID is null");

            return this;
        } // end andToolLogIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID is not null");

            return this;
        } // end andToolLogIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID is not null AND MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID <> ''");

            return this;
        } // end andToolLogIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID is null OR MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID = '')");

            return this;
        } // end andToolLogIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdEqualTo(long value) {
            return andToolLogIdEqualTo(Long.valueOf(value));
        } // end andToolLogIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID =", value,
                "toolLogId");

            return this;
        } // end andToolLogIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolLogIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotEqualTo(long value) {
            return andToolLogIdNotEqualTo(Long.valueOf(value));
        } // end andToolLogIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID <>", value,
                "toolLogId");

            return this;
        } // end andToolLogIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotEqualToOrIsNull(long value) {
            return andToolLogIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andToolLogIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID is null OR MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID <>",
                value, "toolLogId");

            return this;
        } // end andToolLogIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolLogIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdGreaterThan(long value) {
            return andToolLogIdGreaterThan(Long.valueOf(value));
        } // end andToolLogIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID >", value,
                "toolLogId");

            return this;
        } // end andToolLogIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolLogIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdGreaterThanOrEqualTo(long value) {
            return andToolLogIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andToolLogIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID >=", value,
                "toolLogId");

            return this;
        } // end andToolLogIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolLogIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdLessThan(long value) {
            return andToolLogIdLessThan(Long.valueOf(value));
        } // end andToolLogIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID <", value,
                "toolLogId");

            return this;
        } // end andToolLogIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolLogIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdLessThanOrEqualTo(long value) {
            return andToolLogIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andToolLogIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID <=", value,
                "toolLogId");

            return this;
        } // end andToolLogIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolLogIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdIn(long[] values) {
            if (values.length == 1) {
                return andToolLogIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID in",
                    values, "toolLogId");

                return this;
            } // end else
        } // end andToolLogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotIn(long[] values) {
            if (values.length == 1) {
                return andToolLogIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID not in",
                    values, "toolLogId");

                return this;
            } // end else
        } // end andToolLogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdIn(List values) {
            if (values.size() == 1) {
                return andToolLogIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID in",
                    values, "toolLogId");

                return this;
            } // end else
        } // end andToolLogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotIn(List values) {
            if (values.size() == 1) {
                return andToolLogIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID not in",
                    values, "toolLogId");

                return this;
            } // end else
        } // end andToolLogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdIn(Object[] values) {
            if (values.length == 1) {
                return andToolLogIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID in",
                    Arrays.asList(values), "toolLogId");

                return this;
            } // end else
        } // end andToolLogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolLogIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID not in",
                    Arrays.asList(values), "toolLogId");

                return this;
            } // end else
        } // end andToolLogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID between",
                value1, value2, "toolLogId");

            return this;
        } // end andToolLogIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID between",
                value1, value2, "toolLogId");

            return this;
        } // end andToolLogIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID not between",
                value1, value2, "toolLogId");

            return this;
        } // end andToolLogIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolLogIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID not between",
                value1, value2, "toolLogId");

            return this;
        } // end andToolLogIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsNull() {
            addCriterion("toolInputD.PARAMETER_NAME is null");

            return this;
        } // end andParameterNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsNotNull() {
            addCriterion("toolInputD.PARAMETER_NAME is not null");

            return this;
        } // end andParameterNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsNotEmpty() {
            addCriterion(
                "toolInputD.PARAMETER_NAME is not null AND toolInputD.PARAMETER_NAME <> ''");

            return this;
        } // end andParameterNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsEmpty() {
            addCriterion(
                "(toolInputD.PARAMETER_NAME is null OR toolInputD.PARAMETER_NAME = '')");

            return this;
        } // end andParameterNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_NAME =", value, "parameterName");

            return this;
        } // end andParameterNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameNotEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_NAME <>", value, "parameterName");

            return this;
        } // end andParameterNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameNotEqualToOrIsNull(String value) {
            addCriterion("toolInputD.PARAMETER_NAME is null OR toolInputD.PARAMETER_NAME <>",
                value, "parameterName");

            return this;
        } // end andParameterNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameGreaterThan(String value) {
            addCriterion("toolInputD.PARAMETER_NAME >", value, "parameterName");

            return this;
        } // end andParameterNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameGreaterThanOrEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_NAME >=", value, "parameterName");

            return this;
        } // end andParameterNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameLessThan(String value) {
            addCriterion("toolInputD.PARAMETER_NAME <", value, "parameterName");

            return this;
        } // end andParameterNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameLessThanOrEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_NAME <=", value, "parameterName");

            return this;
        } // end andParameterNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("toolInputD.PARAMETER_NAME like", buffer.toString(),
                "parameterName");

            return this;
        } // end andParameterNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("toolInputD.PARAMETER_NAME not like",
                buffer.toString(), "parameterName");

            return this;
        } // end andParameterNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIn(List values) {
            if (values.size() == 1) {
                return andParameterNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_NAME in", values,
                    "parameterName");

                return this;
            } // end else
        } // end andParameterNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameNotIn(List values) {
            if (values.size() == 1) {
                return andParameterNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_NAME not in", values,
                    "parameterName");

                return this;
            } // end else
        } // end andParameterNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIn(Object[] values) {
            if (values.length == 1) {
                return andParameterNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_NAME in",
                    Arrays.asList(values), "parameterName");

                return this;
            } // end else
        } // end andParameterNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andParameterNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_NAME not in",
                    Arrays.asList(values), "parameterName");

                return this;
            } // end else
        } // end andParameterNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameBetween(String value1, String value2) {
            addCriterion("toolInputD.PARAMETER_NAME between", value1, value2,
                "parameterName");

            return this;
        } // end andParameterNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameNotBetween(String value1, String value2) {
            addCriterion("toolInputD.PARAMETER_NAME not between", value1,
                value2, "parameterName");

            return this;
        } // end andParameterNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsNull() {
            addCriterion("toolInputD.PARAMETER_CODE is null");

            return this;
        } // end andParameterCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsNotNull() {
            addCriterion("toolInputD.PARAMETER_CODE is not null");

            return this;
        } // end andParameterCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsNotEmpty() {
            addCriterion(
                "toolInputD.PARAMETER_CODE is not null AND toolInputD.PARAMETER_CODE <> ''");

            return this;
        } // end andParameterCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsEmpty() {
            addCriterion(
                "(toolInputD.PARAMETER_CODE is null OR toolInputD.PARAMETER_CODE = '')");

            return this;
        } // end andParameterCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_CODE =", value, "parameterCode");

            return this;
        } // end andParameterCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeNotEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_CODE <>", value, "parameterCode");

            return this;
        } // end andParameterCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeNotEqualToOrIsNull(String value) {
            addCriterion("toolInputD.PARAMETER_CODE is null OR toolInputD.PARAMETER_CODE <>",
                value, "parameterCode");

            return this;
        } // end andParameterCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeGreaterThan(String value) {
            addCriterion("toolInputD.PARAMETER_CODE >", value, "parameterCode");

            return this;
        } // end andParameterCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_CODE >=", value, "parameterCode");

            return this;
        } // end andParameterCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeLessThan(String value) {
            addCriterion("toolInputD.PARAMETER_CODE <", value, "parameterCode");

            return this;
        } // end andParameterCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeLessThanOrEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_CODE <=", value, "parameterCode");

            return this;
        } // end andParameterCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("toolInputD.PARAMETER_CODE like", buffer.toString(),
                "parameterCode");

            return this;
        } // end andParameterCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("toolInputD.PARAMETER_CODE not like",
                buffer.toString(), "parameterCode");

            return this;
        } // end andParameterCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIn(List values) {
            if (values.size() == 1) {
                return andParameterCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_CODE in", values,
                    "parameterCode");

                return this;
            } // end else
        } // end andParameterCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeNotIn(List values) {
            if (values.size() == 1) {
                return andParameterCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_CODE not in", values,
                    "parameterCode");

                return this;
            } // end else
        } // end andParameterCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIn(Object[] values) {
            if (values.length == 1) {
                return andParameterCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_CODE in",
                    Arrays.asList(values), "parameterCode");

                return this;
            } // end else
        } // end andParameterCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andParameterCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_CODE not in",
                    Arrays.asList(values), "parameterCode");

                return this;
            } // end else
        } // end andParameterCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeBetween(String value1, String value2) {
            addCriterion("toolInputD.PARAMETER_CODE between", value1, value2,
                "parameterCode");

            return this;
        } // end andParameterCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeNotBetween(String value1, String value2) {
            addCriterion("toolInputD.PARAMETER_CODE not between", value1,
                value2, "parameterCode");

            return this;
        } // end andParameterCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsNull() {
            addCriterion("toolInputD.PARAMETER_TYPE is null");

            return this;
        } // end andParameterTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsNotNull() {
            addCriterion("toolInputD.PARAMETER_TYPE is not null");

            return this;
        } // end andParameterTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsNotEmpty() {
            addCriterion(
                "toolInputD.PARAMETER_TYPE is not null AND toolInputD.PARAMETER_TYPE <> ''");

            return this;
        } // end andParameterTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsEmpty() {
            addCriterion(
                "(toolInputD.PARAMETER_TYPE is null OR toolInputD.PARAMETER_TYPE = '')");

            return this;
        } // end andParameterTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_TYPE =", value, "parameterType");

            return this;
        } // end andParameterTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeNotEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_TYPE <>", value, "parameterType");

            return this;
        } // end andParameterTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeNotEqualToOrIsNull(String value) {
            addCriterion("toolInputD.PARAMETER_TYPE is null OR toolInputD.PARAMETER_TYPE <>",
                value, "parameterType");

            return this;
        } // end andParameterTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeGreaterThan(String value) {
            addCriterion("toolInputD.PARAMETER_TYPE >", value, "parameterType");

            return this;
        } // end andParameterTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_TYPE >=", value, "parameterType");

            return this;
        } // end andParameterTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeLessThan(String value) {
            addCriterion("toolInputD.PARAMETER_TYPE <", value, "parameterType");

            return this;
        } // end andParameterTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeLessThanOrEqualTo(String value) {
            addCriterion("toolInputD.PARAMETER_TYPE <=", value, "parameterType");

            return this;
        } // end andParameterTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("toolInputD.PARAMETER_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParameterTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("toolInputD.PARAMETER_TYPE like", buffer.toString(),
                "parameterType");

            return this;
        } // end andParameterTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("toolInputD.PARAMETER_TYPE not like",
                buffer.toString(), "parameterType");

            return this;
        } // end andParameterTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIn(List values) {
            if (values.size() == 1) {
                return andParameterTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_TYPE in", values,
                    "parameterType");

                return this;
            } // end else
        } // end andParameterTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeNotIn(List values) {
            if (values.size() == 1) {
                return andParameterTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_TYPE not in", values,
                    "parameterType");

                return this;
            } // end else
        } // end andParameterTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIn(Object[] values) {
            if (values.length == 1) {
                return andParameterTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_TYPE in",
                    Arrays.asList(values), "parameterType");

                return this;
            } // end else
        } // end andParameterTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andParameterTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.PARAMETER_TYPE not in",
                    Arrays.asList(values), "parameterType");

                return this;
            } // end else
        } // end andParameterTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeBetween(String value1, String value2) {
            addCriterion("toolInputD.PARAMETER_TYPE between", value1, value2,
                "parameterType");

            return this;
        } // end andParameterTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeNotBetween(String value1, String value2) {
            addCriterion("toolInputD.PARAMETER_TYPE not between", value1,
                value2, "parameterType");

            return this;
        } // end andParameterTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("toolInputD.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("toolInputD.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "toolInputD.SORT_INDEX is not null AND toolInputD.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(toolInputD.SORT_INDEX is null OR toolInputD.SORT_INDEX = '')");

            return this;
        } // end andSortIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(int value) {
            return andSortIndexEqualTo(Integer.valueOf(value));
        } // end andSortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(java.lang.Integer value) {
            addCriterion("toolInputD.SORT_INDEX =", value, "sortIndex");

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
            StringBuffer str = new StringBuffer("toolInputD.SORT_INDEX");
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
        public Criteria andSortIndexNotEqualTo(int value) {
            return andSortIndexNotEqualTo(Integer.valueOf(value));
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualTo(java.lang.Integer value) {
            addCriterion("toolInputD.SORT_INDEX <>", value, "sortIndex");

            return this;
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(int value) {
            return andSortIndexNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andSortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("toolInputD.SORT_INDEX is null OR toolInputD.SORT_INDEX <>",
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
            StringBuffer str = new StringBuffer("toolInputD.SORT_INDEX");
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
        public Criteria andSortIndexGreaterThan(int value) {
            return andSortIndexGreaterThan(Integer.valueOf(value));
        } // end andSortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThan(java.lang.Integer value) {
            addCriterion("toolInputD.SORT_INDEX >", value, "sortIndex");

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
            StringBuffer str = new StringBuffer("toolInputD.SORT_INDEX");
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
        public Criteria andSortIndexGreaterThanOrEqualTo(int value) {
            return andSortIndexGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andSortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("toolInputD.SORT_INDEX >=", value, "sortIndex");

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
            StringBuffer str = new StringBuffer("toolInputD.SORT_INDEX");
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
        public Criteria andSortIndexLessThan(int value) {
            return andSortIndexLessThan(Integer.valueOf(value));
        } // end andSortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThan(java.lang.Integer value) {
            addCriterion("toolInputD.SORT_INDEX <", value, "sortIndex");

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
            StringBuffer str = new StringBuffer("toolInputD.SORT_INDEX");
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
        public Criteria andSortIndexLessThanOrEqualTo(int value) {
            return andSortIndexLessThanOrEqualTo(Integer.valueOf(value));
        } // end andSortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("toolInputD.SORT_INDEX <=", value, "sortIndex");

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
            StringBuffer str = new StringBuffer("toolInputD.SORT_INDEX");
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
        public Criteria andSortIndexIn(int[] values) {
            if (values.length == 1) {
                return andSortIndexEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.SORT_INDEX in", values, "sortIndex");

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
        public Criteria andSortIndexNotIn(int[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.SORT_INDEX not in", values, "sortIndex");

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
                return andSortIndexEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.SORT_INDEX in", values, "sortIndex");

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
                return andSortIndexNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("toolInputD.SORT_INDEX not in", values, "sortIndex");

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
                return andSortIndexEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.SORT_INDEX in", Arrays.asList(values),
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
        public Criteria andSortIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("toolInputD.SORT_INDEX not in",
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
        public Criteria andSortIndexBetween(int value1, int value2) {
            addCriterion("toolInputD.SORT_INDEX between", value1, value2,
                "sortIndex");

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
        public Criteria andSortIndexBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("toolInputD.SORT_INDEX between", value1, value2,
                "sortIndex");

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
        public Criteria andSortIndexNotBetween(int value1, int value2) {
            addCriterion("toolInputD.SORT_INDEX not between", value1, value2,
                "sortIndex");

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
        public Criteria andSortIndexNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("toolInputD.SORT_INDEX not between", value1, value2,
                "sortIndex");

            return this;
        } // end andSortIndexNotBetween()
    } // end Criteria
} // end MiddleWareToolInputLogDAOQueryBean
