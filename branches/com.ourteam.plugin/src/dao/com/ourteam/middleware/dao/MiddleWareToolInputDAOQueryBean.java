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
 * MiddleWareToolInput query bean 2011-12-08 15:07:38
 *
 * @author Auto Gen
 */
public class MiddleWareToolInputDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new MiddleWareToolInputDAOQueryBean object.
     */
    public MiddleWareToolInputDAOQueryBean() {
        super();
    } // end MiddleWareToolInputDAOQueryBean()

    /**
     * Creates a new MiddleWareToolInputDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public MiddleWareToolInputDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end MiddleWareToolInputDAOQueryBean()

    /**
     * Creates a new MiddleWareToolInputDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public MiddleWareToolInputDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end MiddleWareToolInputDAOQueryBean()

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
            addSelectProperty(IMiddleWareToolInputDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsRequiredSelectProperty() {
        addIsRequiredSelectProperty("isRequired");
    } // end addIsRequiredSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsRequiredSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputDAO.IsRequired, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.IsRequired, "isRequired");
        } // end else
    } // end addIsRequiredSelectProperty()

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
            addSelectProperty(IMiddleWareToolInputDAO.ParameterCode, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.ParameterCode,
                "parameterCode");
        } // end else
    } // end addParameterCodeSelectProperty()

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
            addSelectProperty(IMiddleWareToolInputDAO.ParameterName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.ParameterName,
                "parameterName");
        } // end else
    } // end addParameterNameSelectProperty()

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
            addSelectProperty(IMiddleWareToolInputDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.Remarks, "remarks");
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
            addSelectProperty(IMiddleWareToolInputDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.SortIndex, "sortIndex");
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
            addSelectProperty(IMiddleWareToolInputDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolIdSelectProperty() {
        addToolIdSelectProperty("toolId");
    } // end addToolIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputDAO.ToolId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.ToolId, "toolId");
        } // end else
    } // end addToolIdSelectProperty()

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
            addSelectProperty(IMiddleWareToolInputDAO.ParameterType, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.ParameterType,
                "parameterType");
        } // end else
    } // end addParameterTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDefaultValueSelectProperty() {
        addDefaultValueSelectProperty("defaultValue");
    } // end addDefaultValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDefaultValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolInputDAO.DefaultValue, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolInputDAO.DefaultValue,
                "defaultValue");
        } // end else
    } // end addDefaultValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addIsRequiredSelectProperty();

        addParameterCodeSelectProperty();

        addParameterNameSelectProperty();

        addRemarksSelectProperty();

        addSortIndexSelectProperty();

        addStatusSelectProperty();

        addToolIdSelectProperty();

        addParameterTypeSelectProperty();

        addDefaultValueSelectProperty();
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.ID is not null AND MIDDLE_WARE_TOOL_INPUT.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.ID is null OR MIDDLE_WARE_TOOL_INPUT.ID = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID <>", value, "id");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID is null OR MIDDLE_WARE_TOOL_INPUT.ID <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.ID");
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.ID in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.ID not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID not between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED is null");

            return this;
        } // end andIsRequiredIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED is not null");

            return this;
        } // end andIsRequiredIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED is not null AND MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED <> ''");

            return this;
        } // end andIsRequiredIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED is null OR MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED = '')");

            return this;
        } // end andIsRequiredIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED =", value,
                "isRequired");

            return this;
        } // end andIsRequiredEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsRequiredEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED <>", value,
                "isRequired");

            return this;
        } // end andIsRequiredNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED is null OR MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED <>",
                value, "isRequired");

            return this;
        } // end andIsRequiredNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsRequiredNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED >", value,
                "isRequired");

            return this;
        } // end andIsRequiredGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsRequiredGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED >=", value,
                "isRequired");

            return this;
        } // end andIsRequiredGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsRequiredGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED <", value,
                "isRequired");

            return this;
        } // end andIsRequiredLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsRequiredLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED <=", value,
                "isRequired");

            return this;
        } // end andIsRequiredLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsRequiredLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED like",
                buffer.toString(), "isRequired");

            return this;
        } // end andIsRequiredLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED not like",
                buffer.toString(), "isRequired");

            return this;
        } // end andIsRequiredNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredIn(List values) {
            if (values.size() == 1) {
                return andIsRequiredEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED in", values,
                    "isRequired");

                return this;
            } // end else
        } // end andIsRequiredIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredNotIn(List values) {
            if (values.size() == 1) {
                return andIsRequiredNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED not in",
                    values, "isRequired");

                return this;
            } // end else
        } // end andIsRequiredNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredIn(Object[] values) {
            if (values.length == 1) {
                return andIsRequiredEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED in",
                    Arrays.asList(values), "isRequired");

                return this;
            } // end else
        } // end andIsRequiredIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsRequiredNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED not in",
                    Arrays.asList(values), "isRequired");

                return this;
            } // end else
        } // end andIsRequiredNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED between", value1,
                value2, "isRequired");

            return this;
        } // end andIsRequiredBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsRequiredNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED not between",
                value1, value2, "isRequired");

            return this;
        } // end andIsRequiredNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE is null");

            return this;
        } // end andParameterCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE is not null");

            return this;
        } // end andParameterCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE is not null AND MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE <> ''");

            return this;
        } // end andParameterCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterCodeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE is null OR MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE =", value,
                "parameterCode");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE <>", value,
                "parameterCode");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE is null OR MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE <>",
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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE >", value,
                "parameterCode");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE >=", value,
                "parameterCode");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE <", value,
                "parameterCode");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE <=", value,
                "parameterCode");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE like",
                buffer.toString(), "parameterCode");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE not like",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE in",
                    values, "parameterCode");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE not in",
                    values, "parameterCode");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE between",
                value1, value2, "parameterCode");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE not between",
                value1, value2, "parameterCode");

            return this;
        } // end andParameterCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME is null");

            return this;
        } // end andParameterNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME is not null");

            return this;
        } // end andParameterNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME is not null AND MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME <> ''");

            return this;
        } // end andParameterNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterNameIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME is null OR MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME =", value,
                "parameterName");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME <>", value,
                "parameterName");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME is null OR MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME <>",
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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME >", value,
                "parameterName");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME >=", value,
                "parameterName");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME <", value,
                "parameterName");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME <=", value,
                "parameterName");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME like",
                buffer.toString(), "parameterName");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME not like",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME in",
                    values, "parameterName");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME not in",
                    values, "parameterName");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME between",
                value1, value2, "parameterName");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME not between",
                value1, value2, "parameterName");

            return this;
        } // end andParameterNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.REMARKS is not null AND MIDDLE_WARE_TOOL_INPUT.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.REMARKS is null OR MIDDLE_WARE_TOOL_INPUT.REMARKS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS =", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_INPUT.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS <>", value, "remarks");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS is null OR MIDDLE_WARE_TOOL_INPUT.REMARKS <>",
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
                    "MIDDLE_WARE_TOOL_INPUT.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS >", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_INPUT.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS >=", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_INPUT.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS <", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_INPUT.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS <=", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_INPUT.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS like",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX is not null AND MIDDLE_WARE_TOOL_INPUT.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.SORT_INDEX is null OR MIDDLE_WARE_TOOL_INPUT.SORT_INDEX = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX =", value,
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
                    "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX <>", value,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX is null OR MIDDLE_WARE_TOOL_INPUT.SORT_INDEX <>",
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
                    "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX >", value,
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
                    "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX >=", value,
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
                    "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX <", value,
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
                    "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX <=", value,
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
                    "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX");
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX in", values,
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
        public Criteria andSortIndexNotIn(int[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX not in",
                    values, "sortIndex");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX in", values,
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
                return andSortIndexNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX not in",
                    values, "sortIndex");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX in",
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
                return andSortIndexNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX between", value1,
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
        public Criteria andSortIndexBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX between", value1,
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
        public Criteria andSortIndexNotBetween(int value1, int value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX not between",
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
        public Criteria andSortIndexNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.SORT_INDEX not between",
                value1, value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.STATUS is not null AND MIDDLE_WARE_TOOL_INPUT.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.STATUS is null OR MIDDLE_WARE_TOOL_INPUT.STATUS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS <>", value, "status");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS is null OR MIDDLE_WARE_TOOL_INPUT.STATUS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_INPUT.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS like",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID is null");

            return this;
        } // end andToolIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID is not null");

            return this;
        } // end andToolIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.TOOL_ID is not null AND MIDDLE_WARE_TOOL_INPUT.TOOL_ID <> ''");

            return this;
        } // end andToolIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.TOOL_ID is null OR MIDDLE_WARE_TOOL_INPUT.TOOL_ID = '')");

            return this;
        } // end andToolIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdEqualTo(long value) {
            return andToolIdEqualTo(Long.valueOf(value));
        } // end andToolIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID =", value, "toolId");

            return this;
        } // end andToolIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.TOOL_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualTo(long value) {
            return andToolIdNotEqualTo(Long.valueOf(value));
        } // end andToolIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID <>", value, "toolId");

            return this;
        } // end andToolIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualToOrIsNull(long value) {
            return andToolIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andToolIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID is null OR MIDDLE_WARE_TOOL_INPUT.TOOL_ID <>",
                value, "toolId");

            return this;
        } // end andToolIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.TOOL_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThan(long value) {
            return andToolIdGreaterThan(Long.valueOf(value));
        } // end andToolIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID >", value, "toolId");

            return this;
        } // end andToolIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.TOOL_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanOrEqualTo(long value) {
            return andToolIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andToolIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID >=", value, "toolId");

            return this;
        } // end andToolIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.TOOL_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThan(long value) {
            return andToolIdLessThan(Long.valueOf(value));
        } // end andToolIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID <", value, "toolId");

            return this;
        } // end andToolIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.TOOL_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanOrEqualTo(long value) {
            return andToolIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andToolIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID <=", value, "toolId");

            return this;
        } // end andToolIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.TOOL_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIn(long[] values) {
            if (values.length == 1) {
                return andToolIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID in", values,
                    "toolId");

                return this;
            } // end else
        } // end andToolIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotIn(long[] values) {
            if (values.length == 1) {
                return andToolIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID not in", values,
                    "toolId");

                return this;
            } // end else
        } // end andToolIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIn(List values) {
            if (values.size() == 1) {
                return andToolIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID in", values,
                    "toolId");

                return this;
            } // end else
        } // end andToolIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotIn(List values) {
            if (values.size() == 1) {
                return andToolIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID not in", values,
                    "toolId");

                return this;
            } // end else
        } // end andToolIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIn(Object[] values) {
            if (values.length == 1) {
                return andToolIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID in",
                    Arrays.asList(values), "toolId");

                return this;
            } // end else
        } // end andToolIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID not in",
                    Arrays.asList(values), "toolId");

                return this;
            } // end else
        } // end andToolIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID not between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.TOOL_ID not between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE is null");

            return this;
        } // end andParameterTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE is not null");

            return this;
        } // end andParameterTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE is not null AND MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE <> ''");

            return this;
        } // end andParameterTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParameterTypeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE is null OR MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE =", value,
                "parameterType");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE <>", value,
                "parameterType");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE is null OR MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE <>",
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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE >", value,
                "parameterType");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE >=", value,
                "parameterType");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE <", value,
                "parameterType");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE <=", value,
                "parameterType");

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
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE");
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE like",
                buffer.toString(), "parameterType");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE not like",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE in",
                    values, "parameterType");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE not in",
                    values, "parameterType");

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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE in",
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
                addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE not in",
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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE between",
                value1, value2, "parameterType");

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
            addCriterion("MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE not between",
                value1, value2, "parameterType");

            return this;
        } // end andParameterTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE is null");

            return this;
        } // end andDefaultValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE is not null");

            return this;
        } // end andDefaultValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE is not null AND MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE <> ''");

            return this;
        } // end andDefaultValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE is null OR MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE = '')");

            return this;
        } // end andDefaultValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE =", value,
                "defaultValue");

            return this;
        } // end andDefaultValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDefaultValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE <>", value,
                "defaultValue");

            return this;
        } // end andDefaultValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE is null OR MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE <>",
                value, "defaultValue");

            return this;
        } // end andDefaultValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDefaultValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE >", value,
                "defaultValue");

            return this;
        } // end andDefaultValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDefaultValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE >=", value,
                "defaultValue");

            return this;
        } // end andDefaultValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDefaultValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE <", value,
                "defaultValue");

            return this;
        } // end andDefaultValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDefaultValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE <=", value,
                "defaultValue");

            return this;
        } // end andDefaultValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDefaultValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE like",
                buffer.toString(), "defaultValue");

            return this;
        } // end andDefaultValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE not like",
                buffer.toString(), "defaultValue");

            return this;
        } // end andDefaultValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueIn(List values) {
            if (values.size() == 1) {
                return andDefaultValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE in", values,
                    "defaultValue");

                return this;
            } // end else
        } // end andDefaultValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueNotIn(List values) {
            if (values.size() == 1) {
                return andDefaultValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE not in",
                    values, "defaultValue");

                return this;
            } // end else
        } // end andDefaultValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueIn(Object[] values) {
            if (values.length == 1) {
                return andDefaultValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE in",
                    Arrays.asList(values), "defaultValue");

                return this;
            } // end else
        } // end andDefaultValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andDefaultValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE not in",
                    Arrays.asList(values), "defaultValue");

                return this;
            } // end else
        } // end andDefaultValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE between",
                value1, value2, "defaultValue");

            return this;
        } // end andDefaultValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDefaultValueNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE not between",
                value1, value2, "defaultValue");

            return this;
        } // end andDefaultValueNotBetween()
    } // end Criteria
} // end MiddleWareToolInputDAOQueryBean
