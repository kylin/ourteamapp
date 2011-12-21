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
 * ReportViewDefine query bean 2011-09-27 11:37:58
 *
 * @author Auto Gen
 */
public class ReportViewDefineDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportViewDefineDAOQueryBean object.
     */
    public ReportViewDefineDAOQueryBean() {
        super();
    } // end ReportViewDefineDAOQueryBean()

    /**
     * Creates a new ReportViewDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportViewDefineDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportViewDefineDAOQueryBean()

    /**
     * Creates a new ReportViewDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportViewDefineDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportViewDefineDAOQueryBean()

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
            addSelectProperty(IReportViewDefineDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCodeSelectProperty() {
        addCodeSelectProperty("code");
    } // end addCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.Code, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.Code, "code");
        } // end else
    } // end addCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addGroupBySelectProperty() {
        addGroupBySelectProperty("groupBy");
    } // end addGroupBySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addGroupBySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.GroupBy, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.GroupBy, "groupBy");
        } // end else
    } // end addGroupBySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsDistinctSelectProperty() {
        addIsDistinctSelectProperty("isDistinct");
    } // end addIsDistinctSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsDistinctSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.IsDistinct, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.IsDistinct, "isDistinct");
        } // end else
    } // end addIsDistinctSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNameSelectProperty() {
        addNameSelectProperty("name");
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addOrderBySelectProperty() {
        addOrderBySelectProperty("orderBy");
    } // end addOrderBySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addOrderBySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.OrderBy, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.OrderBy, "orderBy");
        } // end else
    } // end addOrderBySelectProperty()

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
            addSelectProperty(IReportViewDefineDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportProjectIdSelectProperty() {
        addReportProjectIdSelectProperty("reportProjectId");
    } // end addReportProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportProjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.ReportProjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.ReportProjectId,
                "reportProjectId");
        } // end else
    } // end addReportProjectIdSelectProperty()

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
            addSelectProperty(IReportViewDefineDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUnionViewsSelectProperty() {
        addUnionViewsSelectProperty("unionViews");
    } // end addUnionViewsSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUnionViewsSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.UnionViews, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.UnionViews, "unionViews");
        } // end else
    } // end addUnionViewsSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addViewFiltersSelectProperty() {
        addViewFiltersSelectProperty("viewFilters");
    } // end addViewFiltersSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addViewFiltersSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.ViewFilters, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.ViewFilters, "viewFilters");
        } // end else
    } // end addViewFiltersSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportProjectNameSelectProperty() {
        addReportProjectNameSelectProperty("reportProjectName");
    } // end addReportProjectNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportProjectNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.ReportProjectName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.ReportProjectName,
                "reportProjectName");
        } // end else
    } // end addReportProjectNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportProjectCodeSelectProperty() {
        addReportProjectCodeSelectProperty("reportProjectCode");
    } // end addReportProjectCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportProjectCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewDefineDAO.ReportProjectCode, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewDefineDAO.ReportProjectCode,
                "reportProjectCode");
        } // end else
    } // end addReportProjectCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCodeSelectProperty();

        addGroupBySelectProperty();

        addIsDistinctSelectProperty();

        addNameSelectProperty();

        addOrderBySelectProperty();

        addRemarksSelectProperty();

        addReportProjectIdSelectProperty();

        addStatusSelectProperty();

        addUnionViewsSelectProperty();

        addViewFiltersSelectProperty();

        addReportProjectNameSelectProperty();

        addReportProjectCodeSelectProperty();
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
            addCriterion("REPORT_VIEW_DEFINE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.ID is not null AND REPORT_VIEW_DEFINE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.ID is null OR REPORT_VIEW_DEFINE.ID = '')");

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
            addCriterion("REPORT_VIEW_DEFINE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ID");
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
            addCriterion("REPORT_VIEW_DEFINE.ID <>", value, "id");

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
            addCriterion("REPORT_VIEW_DEFINE.ID is null OR REPORT_VIEW_DEFINE.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ID");
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
            addCriterion("REPORT_VIEW_DEFINE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ID");
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
            addCriterion("REPORT_VIEW_DEFINE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ID");
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
            addCriterion("REPORT_VIEW_DEFINE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ID");
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
            addCriterion("REPORT_VIEW_DEFINE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ID");
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
                addCriterion("REPORT_VIEW_DEFINE.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_DEFINE.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_DEFINE.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_DEFINE.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_DEFINE.ID in", Arrays.asList(values),
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
                addCriterion("REPORT_VIEW_DEFINE.ID not in",
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
            addCriterion("REPORT_VIEW_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_DEFINE.ID not between", value1, value2,
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
            addCriterion("REPORT_VIEW_DEFINE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.CODE is null");

            return this;
        } // end andCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.CODE is not null");

            return this;
        } // end andCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.CODE is not null AND REPORT_VIEW_DEFINE.CODE <> ''");

            return this;
        } // end andCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.CODE is null OR REPORT_VIEW_DEFINE.CODE = '')");

            return this;
        } // end andCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.CODE =", value, "code");

            return this;
        } // end andCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.CODE <>", value, "code");

            return this;
        } // end andCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_DEFINE.CODE is null OR REPORT_VIEW_DEFINE.CODE <>",
                value, "code");

            return this;
        } // end andCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.CODE >", value, "code");

            return this;
        } // end andCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.CODE >=", value, "code");

            return this;
        } // end andCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.CODE <", value, "code");

            return this;
        } // end andCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.CODE <=", value, "code");

            return this;
        } // end andCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.CODE like", buffer.toString(),
                "code");

            return this;
        } // end andCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.CODE not like", buffer.toString(),
                "code");

            return this;
        } // end andCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIn(List values) {
            if (values.size() == 1) {
                return andCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.CODE in", values, "code");

                return this;
            } // end else
        } // end andCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotIn(List values) {
            if (values.size() == 1) {
                return andCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.CODE not in", values, "code");

                return this;
            } // end else
        } // end andCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIn(Object[] values) {
            if (values.length == 1) {
                return andCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.CODE in",
                    Arrays.asList(values), "code");

                return this;
            } // end else
        } // end andCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.CODE not in",
                    Arrays.asList(values), "code");

                return this;
            } // end else
        } // end andCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.CODE between", value1, value2,
                "code");

            return this;
        } // end andCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.CODE not between", value1, value2,
                "code");

            return this;
        } // end andCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY is null");

            return this;
        } // end andGroupByIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY is not null");

            return this;
        } // end andGroupByIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.GROUP_BY is not null AND REPORT_VIEW_DEFINE.GROUP_BY <> ''");

            return this;
        } // end andGroupByIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.GROUP_BY is null OR REPORT_VIEW_DEFINE.GROUP_BY = '')");

            return this;
        } // end andGroupByIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY =", value, "groupBy");

            return this;
        } // end andGroupByEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.GROUP_BY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupByEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY <>", value, "groupBy");

            return this;
        } // end andGroupByNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY is null OR REPORT_VIEW_DEFINE.GROUP_BY <>",
                value, "groupBy");

            return this;
        } // end andGroupByNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.GROUP_BY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupByNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByGreaterThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY >", value, "groupBy");

            return this;
        } // end andGroupByGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.GROUP_BY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupByGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY >=", value, "groupBy");

            return this;
        } // end andGroupByGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.GROUP_BY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupByGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByLessThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY <", value, "groupBy");

            return this;
        } // end andGroupByLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.GROUP_BY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupByLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY <=", value, "groupBy");

            return this;
        } // end andGroupByLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.GROUP_BY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupByLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY like", buffer.toString(),
                "groupBy");

            return this;
        } // end andGroupByLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY not like",
                buffer.toString(), "groupBy");

            return this;
        } // end andGroupByNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByIn(List values) {
            if (values.size() == 1) {
                return andGroupByEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.GROUP_BY in", values, "groupBy");

                return this;
            } // end else
        } // end andGroupByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByNotIn(List values) {
            if (values.size() == 1) {
                return andGroupByNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.GROUP_BY not in", values,
                    "groupBy");

                return this;
            } // end else
        } // end andGroupByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByIn(Object[] values) {
            if (values.length == 1) {
                return andGroupByEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.GROUP_BY in",
                    Arrays.asList(values), "groupBy");

                return this;
            } // end else
        } // end andGroupByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByNotIn(Object[] values) {
            if (values.length == 1) {
                return andGroupByNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.GROUP_BY not in",
                    Arrays.asList(values), "groupBy");

                return this;
            } // end else
        } // end andGroupByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY between", value1, value2,
                "groupBy");

            return this;
        } // end andGroupByBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupByNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.GROUP_BY not between", value1,
                value2, "groupBy");

            return this;
        } // end andGroupByNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT is null");

            return this;
        } // end andIsDistinctIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT is not null");

            return this;
        } // end andIsDistinctIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.IS_DISTINCT is not null AND REPORT_VIEW_DEFINE.IS_DISTINCT <> ''");

            return this;
        } // end andIsDistinctIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.IS_DISTINCT is null OR REPORT_VIEW_DEFINE.IS_DISTINCT = '')");

            return this;
        } // end andIsDistinctIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT =", value, "isDistinct");

            return this;
        } // end andIsDistinctEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.IS_DISTINCT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsDistinctEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT <>", value,
                "isDistinct");

            return this;
        } // end andIsDistinctNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT is null OR REPORT_VIEW_DEFINE.IS_DISTINCT <>",
                value, "isDistinct");

            return this;
        } // end andIsDistinctNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.IS_DISTINCT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsDistinctNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctGreaterThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT >", value, "isDistinct");

            return this;
        } // end andIsDistinctGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.IS_DISTINCT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsDistinctGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT >=", value,
                "isDistinct");

            return this;
        } // end andIsDistinctGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.IS_DISTINCT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsDistinctGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctLessThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT <", value, "isDistinct");

            return this;
        } // end andIsDistinctLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.IS_DISTINCT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsDistinctLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT <=", value,
                "isDistinct");

            return this;
        } // end andIsDistinctLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.IS_DISTINCT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsDistinctLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT like",
                buffer.toString(), "isDistinct");

            return this;
        } // end andIsDistinctLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT not like",
                buffer.toString(), "isDistinct");

            return this;
        } // end andIsDistinctNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctIn(List values) {
            if (values.size() == 1) {
                return andIsDistinctEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT in", values,
                    "isDistinct");

                return this;
            } // end else
        } // end andIsDistinctIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctNotIn(List values) {
            if (values.size() == 1) {
                return andIsDistinctNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT not in", values,
                    "isDistinct");

                return this;
            } // end else
        } // end andIsDistinctNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctIn(Object[] values) {
            if (values.length == 1) {
                return andIsDistinctEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT in",
                    Arrays.asList(values), "isDistinct");

                return this;
            } // end else
        } // end andIsDistinctIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsDistinctNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT not in",
                    Arrays.asList(values), "isDistinct");

                return this;
            } // end else
        } // end andIsDistinctNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT between", value1,
                value2, "isDistinct");

            return this;
        } // end andIsDistinctBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsDistinctNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.IS_DISTINCT not between", value1,
                value2, "isDistinct");

            return this;
        } // end andIsDistinctNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.NAME is not null AND REPORT_VIEW_DEFINE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.NAME is null OR REPORT_VIEW_DEFINE.NAME = '')");

            return this;
        } // end andNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.NAME =", value, "name");

            return this;
        } // end andNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.NAME <>", value, "name");

            return this;
        } // end andNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_DEFINE.NAME is null OR REPORT_VIEW_DEFINE.NAME <>",
                value, "name");

            return this;
        } // end andNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.NAME >", value, "name");

            return this;
        } // end andNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.NAME >=", value, "name");

            return this;
        } // end andNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.NAME <", value, "name");

            return this;
        } // end andNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.NAME <=", value, "name");

            return this;
        } // end andNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.NAME like", buffer.toString(),
                "name");

            return this;
        } // end andNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.NAME not like", buffer.toString(),
                "name");

            return this;
        } // end andNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(List values) {
            if (values.size() == 1) {
                return andNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.NAME in", values, "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(List values) {
            if (values.size() == 1) {
                return andNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.NAME not in", values, "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(Object[] values) {
            if (values.length == 1) {
                return andNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.NAME in",
                    Arrays.asList(values), "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.NAME not in",
                    Arrays.asList(values), "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.NAME between", value1, value2,
                "name");

            return this;
        } // end andNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY is null");

            return this;
        } // end andOrderByIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY is not null");

            return this;
        } // end andOrderByIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.ORDER_BY is not null AND REPORT_VIEW_DEFINE.ORDER_BY <> ''");

            return this;
        } // end andOrderByIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.ORDER_BY is null OR REPORT_VIEW_DEFINE.ORDER_BY = '')");

            return this;
        } // end andOrderByIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY =", value, "orderBy");

            return this;
        } // end andOrderByEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ORDER_BY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderByEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY <>", value, "orderBy");

            return this;
        } // end andOrderByNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY is null OR REPORT_VIEW_DEFINE.ORDER_BY <>",
                value, "orderBy");

            return this;
        } // end andOrderByNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ORDER_BY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderByNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByGreaterThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY >", value, "orderBy");

            return this;
        } // end andOrderByGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ORDER_BY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderByGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY >=", value, "orderBy");

            return this;
        } // end andOrderByGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ORDER_BY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderByGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByLessThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY <", value, "orderBy");

            return this;
        } // end andOrderByLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ORDER_BY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderByLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY <=", value, "orderBy");

            return this;
        } // end andOrderByLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.ORDER_BY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderByLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY like", buffer.toString(),
                "orderBy");

            return this;
        } // end andOrderByLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY not like",
                buffer.toString(), "orderBy");

            return this;
        } // end andOrderByNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByIn(List values) {
            if (values.size() == 1) {
                return andOrderByEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.ORDER_BY in", values, "orderBy");

                return this;
            } // end else
        } // end andOrderByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByNotIn(List values) {
            if (values.size() == 1) {
                return andOrderByNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.ORDER_BY not in", values,
                    "orderBy");

                return this;
            } // end else
        } // end andOrderByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByIn(Object[] values) {
            if (values.length == 1) {
                return andOrderByEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.ORDER_BY in",
                    Arrays.asList(values), "orderBy");

                return this;
            } // end else
        } // end andOrderByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByNotIn(Object[] values) {
            if (values.length == 1) {
                return andOrderByNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.ORDER_BY not in",
                    Arrays.asList(values), "orderBy");

                return this;
            } // end else
        } // end andOrderByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY between", value1, value2,
                "orderBy");

            return this;
        } // end andOrderByBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderByNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.ORDER_BY not between", value1,
                value2, "orderBy");

            return this;
        } // end andOrderByNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.REMARKS is not null AND REPORT_VIEW_DEFINE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.REMARKS is null OR REPORT_VIEW_DEFINE.REMARKS = '')");

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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.REMARKS");
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS is null OR REPORT_VIEW_DEFINE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.REMARKS");
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.REMARKS");
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.REMARKS");
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.REMARKS");
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.REMARKS");
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS like", buffer.toString(),
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS not like",
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
                addCriterion("REPORT_VIEW_DEFINE.REMARKS in", values, "remarks");

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
                addCriterion("REPORT_VIEW_DEFINE.REMARKS not in", values,
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
                addCriterion("REPORT_VIEW_DEFINE.REMARKS in",
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
                addCriterion("REPORT_VIEW_DEFINE.REMARKS not in",
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS between", value1, value2,
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
            addCriterion("REPORT_VIEW_DEFINE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID is null");

            return this;
        } // end andReportProjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID is not null");

            return this;
        } // end andReportProjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID is not null AND REPORT_VIEW_DEFINE.REPORT_PROJECT_ID <> ''");

            return this;
        } // end andReportProjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.REPORT_PROJECT_ID is null OR REPORT_VIEW_DEFINE.REPORT_PROJECT_ID = '')");

            return this;
        } // end andReportProjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdEqualTo(long value) {
            return andReportProjectIdEqualTo(Long.valueOf(value));
        } // end andReportProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID =", value,
                "reportProjectId");

            return this;
        } // end andReportProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotEqualTo(long value) {
            return andReportProjectIdNotEqualTo(Long.valueOf(value));
        } // end andReportProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID <>", value,
                "reportProjectId");

            return this;
        } // end andReportProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotEqualToOrIsNull(long value) {
            return andReportProjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andReportProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID is null OR REPORT_VIEW_DEFINE.REPORT_PROJECT_ID <>",
                value, "reportProjectId");

            return this;
        } // end andReportProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdGreaterThan(long value) {
            return andReportProjectIdGreaterThan(Long.valueOf(value));
        } // end andReportProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdGreaterThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID >", value,
                "reportProjectId");

            return this;
        } // end andReportProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdGreaterThanOrEqualTo(long value) {
            return andReportProjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andReportProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID >=", value,
                "reportProjectId");

            return this;
        } // end andReportProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdLessThan(long value) {
            return andReportProjectIdLessThan(Long.valueOf(value));
        } // end andReportProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdLessThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID <", value,
                "reportProjectId");

            return this;
        } // end andReportProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdLessThanOrEqualTo(long value) {
            return andReportProjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andReportProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID <=", value,
                "reportProjectId");

            return this;
        } // end andReportProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIn(long[] values) {
            if (values.length == 1) {
                return andReportProjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID in", values,
                    "reportProjectId");

                return this;
            } // end else
        } // end andReportProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andReportProjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID not in",
                    values, "reportProjectId");

                return this;
            } // end else
        } // end andReportProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIn(List values) {
            if (values.size() == 1) {
                return andReportProjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID in", values,
                    "reportProjectId");

                return this;
            } // end else
        } // end andReportProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andReportProjectIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID not in",
                    values, "reportProjectId");

                return this;
            } // end else
        } // end andReportProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andReportProjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID in",
                    Arrays.asList(values), "reportProjectId");

                return this;
            } // end else
        } // end andReportProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportProjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID not in",
                    Arrays.asList(values), "reportProjectId");

                return this;
            } // end else
        } // end andReportProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID between",
                value1, value2, "reportProjectId");

            return this;
        } // end andReportProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID between",
                value1, value2, "reportProjectId");

            return this;
        } // end andReportProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID not between",
                value1, value2, "reportProjectId");

            return this;
        } // end andReportProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_DEFINE.REPORT_PROJECT_ID not between",
                value1, value2, "reportProjectId");

            return this;
        } // end andReportProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.STATUS is not null AND REPORT_VIEW_DEFINE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.STATUS is null OR REPORT_VIEW_DEFINE.STATUS = '')");

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
            addCriterion("REPORT_VIEW_DEFINE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.STATUS");
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS <>", value, "status");

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
            addCriterion("REPORT_VIEW_DEFINE.STATUS is null OR REPORT_VIEW_DEFINE.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.STATUS");
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.STATUS");
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.STATUS");
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.STATUS");
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_DEFINE.STATUS");
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS like", buffer.toString(),
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS not like",
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
                addCriterion("REPORT_VIEW_DEFINE.STATUS in", values, "status");

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
                addCriterion("REPORT_VIEW_DEFINE.STATUS not in", values,
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
                addCriterion("REPORT_VIEW_DEFINE.STATUS in",
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
                addCriterion("REPORT_VIEW_DEFINE.STATUS not in",
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS between", value1, value2,
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
            addCriterion("REPORT_VIEW_DEFINE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS is null");

            return this;
        } // end andUnionViewsIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS is not null");

            return this;
        } // end andUnionViewsIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.UNION_VIEWS is not null AND REPORT_VIEW_DEFINE.UNION_VIEWS <> ''");

            return this;
        } // end andUnionViewsIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.UNION_VIEWS is null OR REPORT_VIEW_DEFINE.UNION_VIEWS = '')");

            return this;
        } // end andUnionViewsIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS =", value, "unionViews");

            return this;
        } // end andUnionViewsEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.UNION_VIEWS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewsEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS <>", value,
                "unionViews");

            return this;
        } // end andUnionViewsNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS is null OR REPORT_VIEW_DEFINE.UNION_VIEWS <>",
                value, "unionViews");

            return this;
        } // end andUnionViewsNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.UNION_VIEWS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewsNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsGreaterThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS >", value, "unionViews");

            return this;
        } // end andUnionViewsGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.UNION_VIEWS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewsGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS >=", value,
                "unionViews");

            return this;
        } // end andUnionViewsGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.UNION_VIEWS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewsGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsLessThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS <", value, "unionViews");

            return this;
        } // end andUnionViewsLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.UNION_VIEWS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewsLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS <=", value,
                "unionViews");

            return this;
        } // end andUnionViewsLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.UNION_VIEWS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewsLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS like",
                buffer.toString(), "unionViews");

            return this;
        } // end andUnionViewsLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS not like",
                buffer.toString(), "unionViews");

            return this;
        } // end andUnionViewsNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsIn(List values) {
            if (values.size() == 1) {
                return andUnionViewsEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS in", values,
                    "unionViews");

                return this;
            } // end else
        } // end andUnionViewsIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsNotIn(List values) {
            if (values.size() == 1) {
                return andUnionViewsNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS not in", values,
                    "unionViews");

                return this;
            } // end else
        } // end andUnionViewsNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsIn(Object[] values) {
            if (values.length == 1) {
                return andUnionViewsEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS in",
                    Arrays.asList(values), "unionViews");

                return this;
            } // end else
        } // end andUnionViewsIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsNotIn(Object[] values) {
            if (values.length == 1) {
                return andUnionViewsNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS not in",
                    Arrays.asList(values), "unionViews");

                return this;
            } // end else
        } // end andUnionViewsNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS between", value1,
                value2, "unionViews");

            return this;
        } // end andUnionViewsBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewsNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.UNION_VIEWS not between", value1,
                value2, "unionViews");

            return this;
        } // end andUnionViewsNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersIsNull() {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS is null");

            return this;
        } // end andViewFiltersIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersIsNotNull() {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS is not null");

            return this;
        } // end andViewFiltersIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_DEFINE.VIEW_FILTERS is not null AND REPORT_VIEW_DEFINE.VIEW_FILTERS <> ''");

            return this;
        } // end andViewFiltersIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_DEFINE.VIEW_FILTERS is null OR REPORT_VIEW_DEFINE.VIEW_FILTERS = '')");

            return this;
        } // end andViewFiltersIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS =", value,
                "viewFilters");

            return this;
        } // end andViewFiltersEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.VIEW_FILTERS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andViewFiltersEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS <>", value,
                "viewFilters");

            return this;
        } // end andViewFiltersNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS is null OR REPORT_VIEW_DEFINE.VIEW_FILTERS <>",
                value, "viewFilters");

            return this;
        } // end andViewFiltersNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.VIEW_FILTERS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andViewFiltersNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersGreaterThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS >", value,
                "viewFilters");

            return this;
        } // end andViewFiltersGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.VIEW_FILTERS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andViewFiltersGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS >=", value,
                "viewFilters");

            return this;
        } // end andViewFiltersGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.VIEW_FILTERS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andViewFiltersGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersLessThan(String value) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS <", value,
                "viewFilters");

            return this;
        } // end andViewFiltersLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.VIEW_FILTERS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andViewFiltersLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS <=", value,
                "viewFilters");

            return this;
        } // end andViewFiltersLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_DEFINE.VIEW_FILTERS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andViewFiltersLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS like",
                buffer.toString(), "viewFilters");

            return this;
        } // end andViewFiltersLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS not like",
                buffer.toString(), "viewFilters");

            return this;
        } // end andViewFiltersNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersIn(List values) {
            if (values.size() == 1) {
                return andViewFiltersEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS in", values,
                    "viewFilters");

                return this;
            } // end else
        } // end andViewFiltersIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersNotIn(List values) {
            if (values.size() == 1) {
                return andViewFiltersNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS not in", values,
                    "viewFilters");

                return this;
            } // end else
        } // end andViewFiltersNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersIn(Object[] values) {
            if (values.length == 1) {
                return andViewFiltersEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS in",
                    Arrays.asList(values), "viewFilters");

                return this;
            } // end else
        } // end andViewFiltersIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersNotIn(Object[] values) {
            if (values.length == 1) {
                return andViewFiltersNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS not in",
                    Arrays.asList(values), "viewFilters");

                return this;
            } // end else
        } // end andViewFiltersNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS between", value1,
                value2, "viewFilters");

            return this;
        } // end andViewFiltersBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andViewFiltersNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_DEFINE.VIEW_FILTERS not between", value1,
                value2, "viewFilters");

            return this;
        } // end andViewFiltersNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsNull() {
            addCriterion("reportProjectA.NAME is null");

            return this;
        } // end andReportProjectNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsNotNull() {
            addCriterion("reportProjectA.NAME is not null");

            return this;
        } // end andReportProjectNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsNotEmpty() {
            addCriterion(
                "reportProjectA.NAME is not null AND reportProjectA.NAME <> ''");

            return this;
        } // end andReportProjectNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsEmpty() {
            addCriterion(
                "(reportProjectA.NAME is null OR reportProjectA.NAME = '')");

            return this;
        } // end andReportProjectNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameEqualTo(String value) {
            addCriterion("reportProjectA.NAME =", value, "reportProjectName");

            return this;
        } // end andReportProjectNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameNotEqualTo(String value) {
            addCriterion("reportProjectA.NAME <>", value, "reportProjectName");

            return this;
        } // end andReportProjectNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameNotEqualToOrIsNull(String value) {
            addCriterion("reportProjectA.NAME is null OR reportProjectA.NAME <>",
                value, "reportProjectName");

            return this;
        } // end andReportProjectNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameGreaterThan(String value) {
            addCriterion("reportProjectA.NAME >", value, "reportProjectName");

            return this;
        } // end andReportProjectNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("reportProjectA.NAME >=", value, "reportProjectName");

            return this;
        } // end andReportProjectNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameLessThan(String value) {
            addCriterion("reportProjectA.NAME <", value, "reportProjectName");

            return this;
        } // end andReportProjectNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameLessThanOrEqualTo(String value) {
            addCriterion("reportProjectA.NAME <=", value, "reportProjectName");

            return this;
        } // end andReportProjectNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportProjectA.NAME like", buffer.toString(),
                "reportProjectName");

            return this;
        } // end andReportProjectNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportProjectA.NAME not like", buffer.toString(),
                "reportProjectName");

            return this;
        } // end andReportProjectNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIn(List values) {
            if (values.size() == 1) {
                return andReportProjectNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportProjectA.NAME in", values,
                    "reportProjectName");

                return this;
            } // end else
        } // end andReportProjectNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameNotIn(List values) {
            if (values.size() == 1) {
                return andReportProjectNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportProjectA.NAME not in", values,
                    "reportProjectName");

                return this;
            } // end else
        } // end andReportProjectNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIn(Object[] values) {
            if (values.length == 1) {
                return andReportProjectNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportProjectA.NAME in", Arrays.asList(values),
                    "reportProjectName");

                return this;
            } // end else
        } // end andReportProjectNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportProjectNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportProjectA.NAME not in",
                    Arrays.asList(values), "reportProjectName");

                return this;
            } // end else
        } // end andReportProjectNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameBetween(String value1, String value2) {
            addCriterion("reportProjectA.NAME between", value1, value2,
                "reportProjectName");

            return this;
        } // end andReportProjectNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameNotBetween(String value1,
            String value2) {
            addCriterion("reportProjectA.NAME not between", value1, value2,
                "reportProjectName");

            return this;
        } // end andReportProjectNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsNull() {
            addCriterion("reportProjectA.CODE is null");

            return this;
        } // end andReportProjectCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsNotNull() {
            addCriterion("reportProjectA.CODE is not null");

            return this;
        } // end andReportProjectCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsNotEmpty() {
            addCriterion(
                "reportProjectA.CODE is not null AND reportProjectA.CODE <> ''");

            return this;
        } // end andReportProjectCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsEmpty() {
            addCriterion(
                "(reportProjectA.CODE is null OR reportProjectA.CODE = '')");

            return this;
        } // end andReportProjectCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeEqualTo(String value) {
            addCriterion("reportProjectA.CODE =", value, "reportProjectCode");

            return this;
        } // end andReportProjectCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeNotEqualTo(String value) {
            addCriterion("reportProjectA.CODE <>", value, "reportProjectCode");

            return this;
        } // end andReportProjectCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeNotEqualToOrIsNull(String value) {
            addCriterion("reportProjectA.CODE is null OR reportProjectA.CODE <>",
                value, "reportProjectCode");

            return this;
        } // end andReportProjectCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeGreaterThan(String value) {
            addCriterion("reportProjectA.CODE >", value, "reportProjectCode");

            return this;
        } // end andReportProjectCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reportProjectA.CODE >=", value, "reportProjectCode");

            return this;
        } // end andReportProjectCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeLessThan(String value) {
            addCriterion("reportProjectA.CODE <", value, "reportProjectCode");

            return this;
        } // end andReportProjectCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("reportProjectA.CODE <=", value, "reportProjectCode");

            return this;
        } // end andReportProjectCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportProjectA.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportProjectCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportProjectA.CODE like", buffer.toString(),
                "reportProjectCode");

            return this;
        } // end andReportProjectCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportProjectA.CODE not like", buffer.toString(),
                "reportProjectCode");

            return this;
        } // end andReportProjectCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIn(List values) {
            if (values.size() == 1) {
                return andReportProjectCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportProjectA.CODE in", values,
                    "reportProjectCode");

                return this;
            } // end else
        } // end andReportProjectCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeNotIn(List values) {
            if (values.size() == 1) {
                return andReportProjectCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportProjectA.CODE not in", values,
                    "reportProjectCode");

                return this;
            } // end else
        } // end andReportProjectCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIn(Object[] values) {
            if (values.length == 1) {
                return andReportProjectCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportProjectA.CODE in", Arrays.asList(values),
                    "reportProjectCode");

                return this;
            } // end else
        } // end andReportProjectCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportProjectCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportProjectA.CODE not in",
                    Arrays.asList(values), "reportProjectCode");

                return this;
            } // end else
        } // end andReportProjectCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeBetween(String value1, String value2) {
            addCriterion("reportProjectA.CODE between", value1, value2,
                "reportProjectCode");

            return this;
        } // end andReportProjectCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeNotBetween(String value1,
            String value2) {
            addCriterion("reportProjectA.CODE not between", value1, value2,
                "reportProjectCode");

            return this;
        } // end andReportProjectCodeNotBetween()
    } // end Criteria
} // end ReportViewDefineDAOQueryBean
