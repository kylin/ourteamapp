/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * ReportViewTable query bean 2011-09-27 11:38:00
 *
 * @author Auto Gen
 */
public class ReportViewTableDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportViewTableDAOQueryBean object.
     */
    public ReportViewTableDAOQueryBean() {
        super();
    } // end ReportViewTableDAOQueryBean()

    /**
     * Creates a new ReportViewTableDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportViewTableDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportViewTableDAOQueryBean()

    /**
     * Creates a new ReportViewTableDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportViewTableDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportViewTableDAOQueryBean()

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
            addSelectProperty(IReportViewTableDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addJoinCondSelectProperty() {
        addJoinCondSelectProperty("joinCond");
    } // end addJoinCondSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addJoinCondSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewTableDAO.JoinCond, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.JoinCond, "joinCond");
        } // end else
    } // end addJoinCondSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addJoinTypeSelectProperty() {
        addJoinTypeSelectProperty("joinType");
    } // end addJoinTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addJoinTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewTableDAO.JoinType, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.JoinType, "joinType");
        } // end else
    } // end addJoinTypeSelectProperty()

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
            addSelectProperty(IReportViewTableDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportViewIdSelectProperty() {
        addReportViewIdSelectProperty("reportViewId");
    } // end addReportViewIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportViewIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewTableDAO.ReportViewId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.ReportViewId, "reportViewId");
        } // end else
    } // end addReportViewIdSelectProperty()

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
            addSelectProperty(IReportViewTableDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTableAliasSelectProperty() {
        addTableAliasSelectProperty("tableAlias");
    } // end addTableAliasSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTableAliasSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewTableDAO.TableAlias, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.TableAlias, "tableAlias");
        } // end else
    } // end addTableAliasSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTableNameSelectProperty() {
        addTableNameSelectProperty("tableName");
    } // end addTableNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTableNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewTableDAO.TableName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewTableDAO.TableName, "tableName");
        } // end else
    } // end addTableNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addJoinCondSelectProperty();

        addJoinTypeSelectProperty();

        addRemarksSelectProperty();

        addReportViewIdSelectProperty();

        addStatusSelectProperty();

        addTableAliasSelectProperty();

        addTableNameSelectProperty();
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
            addCriterion("REPORT_VIEW_TABLE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.ID is not null AND REPORT_VIEW_TABLE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.ID is null OR REPORT_VIEW_TABLE.ID = '')");

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
            addCriterion("REPORT_VIEW_TABLE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.ID");
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
            addCriterion("REPORT_VIEW_TABLE.ID <>", value, "id");

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
            addCriterion("REPORT_VIEW_TABLE.ID is null OR REPORT_VIEW_TABLE.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.ID");
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
            addCriterion("REPORT_VIEW_TABLE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.ID");
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
            addCriterion("REPORT_VIEW_TABLE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.ID");
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
            addCriterion("REPORT_VIEW_TABLE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.ID");
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
            addCriterion("REPORT_VIEW_TABLE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.ID");
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
                addCriterion("REPORT_VIEW_TABLE.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_TABLE.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_TABLE.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_TABLE.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_TABLE.ID in", Arrays.asList(values),
                    "id");

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
                addCriterion("REPORT_VIEW_TABLE.ID not in",
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
            addCriterion("REPORT_VIEW_TABLE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_TABLE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_TABLE.ID not between", value1, value2,
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
            addCriterion("REPORT_VIEW_TABLE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondIsNull() {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND is null");

            return this;
        } // end andJoinCondIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND is not null");

            return this;
        } // end andJoinCondIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.JOIN_COND is not null AND REPORT_VIEW_TABLE.JOIN_COND <> ''");

            return this;
        } // end andJoinCondIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.JOIN_COND is null OR REPORT_VIEW_TABLE.JOIN_COND = '')");

            return this;
        } // end andJoinCondIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND =", value, "joinCond");

            return this;
        } // end andJoinCondEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_COND");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinCondEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND <>", value, "joinCond");

            return this;
        } // end andJoinCondNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND is null OR REPORT_VIEW_TABLE.JOIN_COND <>",
                value, "joinCond");

            return this;
        } // end andJoinCondNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_COND");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinCondNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondGreaterThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND >", value, "joinCond");

            return this;
        } // end andJoinCondGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_COND");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinCondGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND >=", value, "joinCond");

            return this;
        } // end andJoinCondGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_COND");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinCondGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondLessThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND <", value, "joinCond");

            return this;
        } // end andJoinCondLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_COND");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinCondLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND <=", value, "joinCond");

            return this;
        } // end andJoinCondLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_COND");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinCondLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND like", buffer.toString(),
                "joinCond");

            return this;
        } // end andJoinCondLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND not like",
                buffer.toString(), "joinCond");

            return this;
        } // end andJoinCondNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondIn(List values) {
            if (values.size() == 1) {
                return andJoinCondEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_COND in", values,
                    "joinCond");

                return this;
            } // end else
        } // end andJoinCondIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondNotIn(List values) {
            if (values.size() == 1) {
                return andJoinCondNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_COND not in", values,
                    "joinCond");

                return this;
            } // end else
        } // end andJoinCondNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondIn(Object[] values) {
            if (values.length == 1) {
                return andJoinCondEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_COND in",
                    Arrays.asList(values), "joinCond");

                return this;
            } // end else
        } // end andJoinCondIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondNotIn(Object[] values) {
            if (values.length == 1) {
                return andJoinCondNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_COND not in",
                    Arrays.asList(values), "joinCond");

                return this;
            } // end else
        } // end andJoinCondNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND between", value1, value2,
                "joinCond");

            return this;
        } // end andJoinCondBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinCondNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_COND not between", value1,
                value2, "joinCond");

            return this;
        } // end andJoinCondNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeIsNull() {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE is null");

            return this;
        } // end andJoinTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE is not null");

            return this;
        } // end andJoinTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.JOIN_TYPE is not null AND REPORT_VIEW_TABLE.JOIN_TYPE <> ''");

            return this;
        } // end andJoinTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.JOIN_TYPE is null OR REPORT_VIEW_TABLE.JOIN_TYPE = '')");

            return this;
        } // end andJoinTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE =", value, "joinType");

            return this;
        } // end andJoinTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE <>", value, "joinType");

            return this;
        } // end andJoinTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE is null OR REPORT_VIEW_TABLE.JOIN_TYPE <>",
                value, "joinType");

            return this;
        } // end andJoinTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeGreaterThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE >", value, "joinType");

            return this;
        } // end andJoinTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE >=", value, "joinType");

            return this;
        } // end andJoinTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeLessThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE <", value, "joinType");

            return this;
        } // end andJoinTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE <=", value, "joinType");

            return this;
        } // end andJoinTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.JOIN_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andJoinTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE like", buffer.toString(),
                "joinType");

            return this;
        } // end andJoinTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE not like",
                buffer.toString(), "joinType");

            return this;
        } // end andJoinTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeIn(List values) {
            if (values.size() == 1) {
                return andJoinTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE in", values,
                    "joinType");

                return this;
            } // end else
        } // end andJoinTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeNotIn(List values) {
            if (values.size() == 1) {
                return andJoinTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE not in", values,
                    "joinType");

                return this;
            } // end else
        } // end andJoinTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeIn(Object[] values) {
            if (values.length == 1) {
                return andJoinTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE in",
                    Arrays.asList(values), "joinType");

                return this;
            } // end else
        } // end andJoinTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andJoinTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE not in",
                    Arrays.asList(values), "joinType");

                return this;
            } // end else
        } // end andJoinTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE between", value1, value2,
                "joinType");

            return this;
        } // end andJoinTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andJoinTypeNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.JOIN_TYPE not between", value1,
                value2, "joinType");

            return this;
        } // end andJoinTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_VIEW_TABLE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.REMARKS is not null AND REPORT_VIEW_TABLE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.REMARKS is null OR REPORT_VIEW_TABLE.REMARKS = '')");

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
            addCriterion("REPORT_VIEW_TABLE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.REMARKS");
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
            addCriterion("REPORT_VIEW_TABLE.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_VIEW_TABLE.REMARKS is null OR REPORT_VIEW_TABLE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.REMARKS");
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
            addCriterion("REPORT_VIEW_TABLE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.REMARKS");
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
            addCriterion("REPORT_VIEW_TABLE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.REMARKS");
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
            addCriterion("REPORT_VIEW_TABLE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.REMARKS");
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
            addCriterion("REPORT_VIEW_TABLE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.REMARKS");
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
            addCriterion("REPORT_VIEW_TABLE.REMARKS like", buffer.toString(),
                "remarks");

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
            addCriterion("REPORT_VIEW_TABLE.REMARKS not like",
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
                addCriterion("REPORT_VIEW_TABLE.REMARKS in", values, "remarks");

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
                addCriterion("REPORT_VIEW_TABLE.REMARKS not in", values,
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
                addCriterion("REPORT_VIEW_TABLE.REMARKS in",
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
                addCriterion("REPORT_VIEW_TABLE.REMARKS not in",
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
            addCriterion("REPORT_VIEW_TABLE.REMARKS between", value1, value2,
                "remarks");

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
            addCriterion("REPORT_VIEW_TABLE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNull() {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID is null");

            return this;
        } // end andReportViewIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID is not null");

            return this;
        } // end andReportViewIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.REPORT_VIEW_ID is not null AND REPORT_VIEW_TABLE.REPORT_VIEW_ID <> ''");

            return this;
        } // end andReportViewIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.REPORT_VIEW_ID is null OR REPORT_VIEW_TABLE.REPORT_VIEW_ID = '')");

            return this;
        } // end andReportViewIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdEqualTo(long value) {
            return andReportViewIdEqualTo(Long.valueOf(value));
        } // end andReportViewIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID =", value,
                "reportViewId");

            return this;
        } // end andReportViewIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_TABLE.REPORT_VIEW_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotEqualTo(long value) {
            return andReportViewIdNotEqualTo(Long.valueOf(value));
        } // end andReportViewIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID <>", value,
                "reportViewId");

            return this;
        } // end andReportViewIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotEqualToOrIsNull(long value) {
            return andReportViewIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andReportViewIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID is null OR REPORT_VIEW_TABLE.REPORT_VIEW_ID <>",
                value, "reportViewId");

            return this;
        } // end andReportViewIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_TABLE.REPORT_VIEW_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdGreaterThan(long value) {
            return andReportViewIdGreaterThan(Long.valueOf(value));
        } // end andReportViewIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdGreaterThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID >", value,
                "reportViewId");

            return this;
        } // end andReportViewIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_TABLE.REPORT_VIEW_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdGreaterThanOrEqualTo(long value) {
            return andReportViewIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andReportViewIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID >=", value,
                "reportViewId");

            return this;
        } // end andReportViewIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_TABLE.REPORT_VIEW_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdLessThan(long value) {
            return andReportViewIdLessThan(Long.valueOf(value));
        } // end andReportViewIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdLessThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID <", value,
                "reportViewId");

            return this;
        } // end andReportViewIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_TABLE.REPORT_VIEW_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdLessThanOrEqualTo(long value) {
            return andReportViewIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andReportViewIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID <=", value,
                "reportViewId");

            return this;
        } // end andReportViewIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_TABLE.REPORT_VIEW_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIn(long[] values) {
            if (values.length == 1) {
                return andReportViewIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID in", values,
                    "reportViewId");

                return this;
            } // end else
        } // end andReportViewIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotIn(long[] values) {
            if (values.length == 1) {
                return andReportViewIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID not in", values,
                    "reportViewId");

                return this;
            } // end else
        } // end andReportViewIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIn(List values) {
            if (values.size() == 1) {
                return andReportViewIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID in", values,
                    "reportViewId");

                return this;
            } // end else
        } // end andReportViewIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotIn(List values) {
            if (values.size() == 1) {
                return andReportViewIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID not in", values,
                    "reportViewId");

                return this;
            } // end else
        } // end andReportViewIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID in",
                    Arrays.asList(values), "reportViewId");

                return this;
            } // end else
        } // end andReportViewIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID not in",
                    Arrays.asList(values), "reportViewId");

                return this;
            } // end else
        } // end andReportViewIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID between", value1,
                value2, "reportViewId");

            return this;
        } // end andReportViewIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID between", value1,
                value2, "reportViewId");

            return this;
        } // end andReportViewIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID not between",
                value1, value2, "reportViewId");

            return this;
        } // end andReportViewIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_TABLE.REPORT_VIEW_ID not between",
                value1, value2, "reportViewId");

            return this;
        } // end andReportViewIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_VIEW_TABLE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.STATUS is not null AND REPORT_VIEW_TABLE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.STATUS is null OR REPORT_VIEW_TABLE.STATUS = '')");

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
            addCriterion("REPORT_VIEW_TABLE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.STATUS");
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
            addCriterion("REPORT_VIEW_TABLE.STATUS <>", value, "status");

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
            addCriterion("REPORT_VIEW_TABLE.STATUS is null OR REPORT_VIEW_TABLE.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.STATUS");
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
            addCriterion("REPORT_VIEW_TABLE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.STATUS");
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
            addCriterion("REPORT_VIEW_TABLE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.STATUS");
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
            addCriterion("REPORT_VIEW_TABLE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.STATUS");
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
            addCriterion("REPORT_VIEW_TABLE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.STATUS");
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
            addCriterion("REPORT_VIEW_TABLE.STATUS like", buffer.toString(),
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
            addCriterion("REPORT_VIEW_TABLE.STATUS not like",
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
                addCriterion("REPORT_VIEW_TABLE.STATUS in", values, "status");

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
                addCriterion("REPORT_VIEW_TABLE.STATUS not in", values, "status");

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
                addCriterion("REPORT_VIEW_TABLE.STATUS in",
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
                addCriterion("REPORT_VIEW_TABLE.STATUS not in",
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
            addCriterion("REPORT_VIEW_TABLE.STATUS between", value1, value2,
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
            addCriterion("REPORT_VIEW_TABLE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsNull() {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS is null");

            return this;
        } // end andTableAliasIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS is not null");

            return this;
        } // end andTableAliasIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.TABLE_ALIAS is not null AND REPORT_VIEW_TABLE.TABLE_ALIAS <> ''");

            return this;
        } // end andTableAliasIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.TABLE_ALIAS is null OR REPORT_VIEW_TABLE.TABLE_ALIAS = '')");

            return this;
        } // end andTableAliasIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS =", value, "tableAlias");

            return this;
        } // end andTableAliasEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_ALIAS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableAliasEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS <>", value, "tableAlias");

            return this;
        } // end andTableAliasNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS is null OR REPORT_VIEW_TABLE.TABLE_ALIAS <>",
                value, "tableAlias");

            return this;
        } // end andTableAliasNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_ALIAS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableAliasNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasGreaterThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS >", value, "tableAlias");

            return this;
        } // end andTableAliasGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_ALIAS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableAliasGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS >=", value, "tableAlias");

            return this;
        } // end andTableAliasGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_ALIAS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableAliasGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasLessThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS <", value, "tableAlias");

            return this;
        } // end andTableAliasLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_ALIAS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableAliasLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS <=", value, "tableAlias");

            return this;
        } // end andTableAliasLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_ALIAS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableAliasLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS like",
                buffer.toString(), "tableAlias");

            return this;
        } // end andTableAliasLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS not like",
                buffer.toString(), "tableAlias");

            return this;
        } // end andTableAliasNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIn(List values) {
            if (values.size() == 1) {
                return andTableAliasEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS in", values,
                    "tableAlias");

                return this;
            } // end else
        } // end andTableAliasIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasNotIn(List values) {
            if (values.size() == 1) {
                return andTableAliasNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS not in", values,
                    "tableAlias");

                return this;
            } // end else
        } // end andTableAliasNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIn(Object[] values) {
            if (values.length == 1) {
                return andTableAliasEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS in",
                    Arrays.asList(values), "tableAlias");

                return this;
            } // end else
        } // end andTableAliasIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasNotIn(Object[] values) {
            if (values.length == 1) {
                return andTableAliasNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS not in",
                    Arrays.asList(values), "tableAlias");

                return this;
            } // end else
        } // end andTableAliasNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS between", value1,
                value2, "tableAlias");

            return this;
        } // end andTableAliasBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_ALIAS not between", value1,
                value2, "tableAlias");

            return this;
        } // end andTableAliasNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNull() {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME is null");

            return this;
        } // end andTableNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNotNull() {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME is not null");

            return this;
        } // end andTableNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_TABLE.TABLE_NAME is not null AND REPORT_VIEW_TABLE.TABLE_NAME <> ''");

            return this;
        } // end andTableNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_TABLE.TABLE_NAME is null OR REPORT_VIEW_TABLE.TABLE_NAME = '')");

            return this;
        } // end andTableNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME =", value, "tableName");

            return this;
        } // end andTableNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME <>", value, "tableName");

            return this;
        } // end andTableNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME is null OR REPORT_VIEW_TABLE.TABLE_NAME <>",
                value, "tableName");

            return this;
        } // end andTableNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME >", value, "tableName");

            return this;
        } // end andTableNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME >=", value, "tableName");

            return this;
        } // end andTableNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThan(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME <", value, "tableName");

            return this;
        } // end andTableNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME <=", value, "tableName");

            return this;
        } // end andTableNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_TABLE.TABLE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME like",
                buffer.toString(), "tableName");

            return this;
        } // end andTableNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME not like",
                buffer.toString(), "tableName");

            return this;
        } // end andTableNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIn(List values) {
            if (values.size() == 1) {
                return andTableNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_NAME in", values,
                    "tableName");

                return this;
            } // end else
        } // end andTableNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotIn(List values) {
            if (values.size() == 1) {
                return andTableNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_NAME not in", values,
                    "tableName");

                return this;
            } // end else
        } // end andTableNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIn(Object[] values) {
            if (values.length == 1) {
                return andTableNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_NAME in",
                    Arrays.asList(values), "tableName");

                return this;
            } // end else
        } // end andTableNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTableNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_TABLE.TABLE_NAME not in",
                    Arrays.asList(values), "tableName");

                return this;
            } // end else
        } // end andTableNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME between", value1,
                value2, "tableName");

            return this;
        } // end andTableNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_TABLE.TABLE_NAME not between", value1,
                value2, "tableName");

            return this;
        } // end andTableNameNotBetween()
    } // end Criteria
} // end ReportViewTableDAOQueryBean
