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
 * ReportInstance query bean 2011-09-27 11:37:55
 *
 * @author Auto Gen
 */
public class ReportInstanceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportInstanceDAOQueryBean object.
     */
    public ReportInstanceDAOQueryBean() {
        super();
    } // end ReportInstanceDAOQueryBean()

    /**
     * Creates a new ReportInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportInstanceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportInstanceDAOQueryBean()

    /**
     * Creates a new ReportInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportInstanceDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportInstanceDAOQueryBean()

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
            addSelectProperty(IReportInstanceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCatalogIdSelectProperty() {
        addCatalogIdSelectProperty("catalogId");
    } // end addCatalogIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCatalogIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.CatalogId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.CatalogId, "catalogId");
        } // end else
    } // end addCatalogIdSelectProperty()

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
            addSelectProperty(IReportInstanceDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.Remarks, "remarks");
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
            addSelectProperty(IReportInstanceDAO.ReportProjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportProjectId,
                "reportProjectId");
        } // end else
    } // end addReportProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportTitleSelectProperty() {
        addReportTitleSelectProperty("reportTitle");
    } // end addReportTitleSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportTitleSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.ReportTitle, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportTitle, "reportTitle");
        } // end else
    } // end addReportTitleSelectProperty()

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
            addSelectProperty(IReportInstanceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(IReportInstanceDAO.ReportViewId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportViewId, "reportViewId");
        } // end else
    } // end addReportViewIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportViewNameSelectProperty() {
        addReportViewNameSelectProperty("reportViewName");
    } // end addReportViewNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportViewNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.ReportViewName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportViewName,
                "reportViewName");
        } // end else
    } // end addReportViewNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportViewCodeSelectProperty() {
        addReportViewCodeSelectProperty("reportViewCode");
    } // end addReportViewCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportViewCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.ReportViewCode, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportViewCode,
                "reportViewCode");
        } // end else
    } // end addReportViewCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportViewIsDistinctSelectProperty() {
        addReportViewIsDistinctSelectProperty("reportViewIsDistinct");
    } // end addReportViewIsDistinctSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportViewIsDistinctSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.ReportViewIsDistinct, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportViewIsDistinct,
                "reportViewIsDistinct");
        } // end else
    } // end addReportViewIsDistinctSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportViewFiltersSelectProperty() {
        addReportViewFiltersSelectProperty("reportViewFilters");
    } // end addReportViewFiltersSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportViewFiltersSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.ReportViewFilters, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportViewFilters,
                "reportViewFilters");
        } // end else
    } // end addReportViewFiltersSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportViewGroupBySelectProperty() {
        addReportViewGroupBySelectProperty("reportViewGroupBy");
    } // end addReportViewGroupBySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportViewGroupBySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.ReportViewGroupBy, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportViewGroupBy,
                "reportViewGroupBy");
        } // end else
    } // end addReportViewGroupBySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportViewOrderBySelectProperty() {
        addReportViewOrderBySelectProperty("reportViewOrderBy");
    } // end addReportViewOrderBySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportViewOrderBySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportInstanceDAO.ReportViewOrderBy, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportViewOrderBy,
                "reportViewOrderBy");
        } // end else
    } // end addReportViewOrderBySelectProperty()

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
            addSelectProperty(IReportInstanceDAO.ReportProjectName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportProjectName,
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
            addSelectProperty(IReportInstanceDAO.ReportProjectCode, aAlias);
        } // end if
        else {
            addSelectProperty(IReportInstanceDAO.ReportProjectCode,
                "reportProjectCode");
        } // end else
    } // end addReportProjectCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCatalogIdSelectProperty();

        addRemarksSelectProperty();

        addReportProjectIdSelectProperty();

        addReportTitleSelectProperty();

        addStatusSelectProperty();

        addReportViewIdSelectProperty();

        addReportViewNameSelectProperty();

        addReportViewCodeSelectProperty();

        addReportViewIsDistinctSelectProperty();

        addReportViewFiltersSelectProperty();

        addReportViewGroupBySelectProperty();

        addReportViewOrderBySelectProperty();

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
            addCriterion("REPORT_INSTANCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_INSTANCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_INSTANCE.ID is not null AND REPORT_INSTANCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(REPORT_INSTANCE.ID is null OR REPORT_INSTANCE.ID = '')");

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
            addCriterion("REPORT_INSTANCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.ID");
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
            addCriterion("REPORT_INSTANCE.ID <>", value, "id");

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
            addCriterion("REPORT_INSTANCE.ID is null OR REPORT_INSTANCE.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.ID");
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
            addCriterion("REPORT_INSTANCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.ID");
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
            addCriterion("REPORT_INSTANCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.ID");
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
            addCriterion("REPORT_INSTANCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.ID");
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
            addCriterion("REPORT_INSTANCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.ID");
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
                addCriterion("REPORT_INSTANCE.ID in", values, "id");

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
                addCriterion("REPORT_INSTANCE.ID not in", values, "id");

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
                addCriterion("REPORT_INSTANCE.ID in", values, "id");

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
                addCriterion("REPORT_INSTANCE.ID not in", values, "id");

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
                addCriterion("REPORT_INSTANCE.ID in", Arrays.asList(values),
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
                addCriterion("REPORT_INSTANCE.ID not in",
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
            addCriterion("REPORT_INSTANCE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_INSTANCE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_INSTANCE.ID not between", value1, value2, "id");

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
            addCriterion("REPORT_INSTANCE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsNull() {
            addCriterion("REPORT_INSTANCE.CATALOG_ID is null");

            return this;
        } // end andCatalogIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsNotNull() {
            addCriterion("REPORT_INSTANCE.CATALOG_ID is not null");

            return this;
        } // end andCatalogIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsNotEmpty() {
            addCriterion(
                "REPORT_INSTANCE.CATALOG_ID is not null AND REPORT_INSTANCE.CATALOG_ID <> ''");

            return this;
        } // end andCatalogIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsEmpty() {
            addCriterion(
                "(REPORT_INSTANCE.CATALOG_ID is null OR REPORT_INSTANCE.CATALOG_ID = '')");

            return this;
        } // end andCatalogIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdEqualTo(long value) {
            return andCatalogIdEqualTo(Long.valueOf(value));
        } // end andCatalogIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdEqualTo(java.lang.Long value) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID =", value, "catalogId");

            return this;
        } // end andCatalogIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.CATALOG_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualTo(long value) {
            return andCatalogIdNotEqualTo(Long.valueOf(value));
        } // end andCatalogIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualTo(java.lang.Long value) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID <>", value, "catalogId");

            return this;
        } // end andCatalogIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualToOrIsNull(long value) {
            return andCatalogIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andCatalogIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID is null OR REPORT_INSTANCE.CATALOG_ID <>",
                value, "catalogId");

            return this;
        } // end andCatalogIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.CATALOG_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThan(long value) {
            return andCatalogIdGreaterThan(Long.valueOf(value));
        } // end andCatalogIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThan(java.lang.Long value) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID >", value, "catalogId");

            return this;
        } // end andCatalogIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.CATALOG_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanOrEqualTo(long value) {
            return andCatalogIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andCatalogIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID >=", value, "catalogId");

            return this;
        } // end andCatalogIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.CATALOG_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThan(long value) {
            return andCatalogIdLessThan(Long.valueOf(value));
        } // end andCatalogIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThan(java.lang.Long value) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID <", value, "catalogId");

            return this;
        } // end andCatalogIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.CATALOG_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanOrEqualTo(long value) {
            return andCatalogIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andCatalogIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID <=", value, "catalogId");

            return this;
        } // end andCatalogIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.CATALOG_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIn(long[] values) {
            if (values.length == 1) {
                return andCatalogIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.CATALOG_ID in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotIn(long[] values) {
            if (values.length == 1) {
                return andCatalogIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.CATALOG_ID not in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIn(List values) {
            if (values.size() == 1) {
                return andCatalogIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.CATALOG_ID in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotIn(List values) {
            if (values.size() == 1) {
                return andCatalogIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.CATALOG_ID not in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIn(Object[] values) {
            if (values.length == 1) {
                return andCatalogIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.CATALOG_ID in",
                    Arrays.asList(values), "catalogId");

                return this;
            } // end else
        } // end andCatalogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andCatalogIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.CATALOG_ID not in",
                    Arrays.asList(values), "catalogId");

                return this;
            } // end else
        } // end andCatalogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdBetween(long value1, long value2) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID between", value1, value2,
                "catalogId");

            return this;
        } // end andCatalogIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID between", value1, value2,
                "catalogId");

            return this;
        } // end andCatalogIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotBetween(long value1, long value2) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID not between", value1,
                value2, "catalogId");

            return this;
        } // end andCatalogIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_INSTANCE.CATALOG_ID not between", value1,
                value2, "catalogId");

            return this;
        } // end andCatalogIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_INSTANCE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_INSTANCE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_INSTANCE.REMARKS is not null AND REPORT_INSTANCE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_INSTANCE.REMARKS is null OR REPORT_INSTANCE.REMARKS = '')");

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
            addCriterion("REPORT_INSTANCE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REMARKS");
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
            addCriterion("REPORT_INSTANCE.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_INSTANCE.REMARKS is null OR REPORT_INSTANCE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REMARKS");
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
            addCriterion("REPORT_INSTANCE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REMARKS");
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
            addCriterion("REPORT_INSTANCE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REMARKS");
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
            addCriterion("REPORT_INSTANCE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REMARKS");
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
            addCriterion("REPORT_INSTANCE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REMARKS");
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
            addCriterion("REPORT_INSTANCE.REMARKS like", buffer.toString(),
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
            addCriterion("REPORT_INSTANCE.REMARKS not like", buffer.toString(),
                "remarks");

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
                addCriterion("REPORT_INSTANCE.REMARKS in", values, "remarks");

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
                addCriterion("REPORT_INSTANCE.REMARKS not in", values, "remarks");

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
                addCriterion("REPORT_INSTANCE.REMARKS in",
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
                addCriterion("REPORT_INSTANCE.REMARKS not in",
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
            addCriterion("REPORT_INSTANCE.REMARKS between", value1, value2,
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
            addCriterion("REPORT_INSTANCE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNull() {
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID is null");

            return this;
        } // end andReportProjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNotNull() {
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID is not null");

            return this;
        } // end andReportProjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNotEmpty() {
            addCriterion(
                "REPORT_INSTANCE.REPORT_PROJECT_ID is not null AND REPORT_INSTANCE.REPORT_PROJECT_ID <> ''");

            return this;
        } // end andReportProjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsEmpty() {
            addCriterion(
                "(REPORT_INSTANCE.REPORT_PROJECT_ID is null OR REPORT_INSTANCE.REPORT_PROJECT_ID = '')");

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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID =", value,
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
                    "REPORT_INSTANCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID <>", value,
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID is null OR REPORT_INSTANCE.REPORT_PROJECT_ID <>",
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
                    "REPORT_INSTANCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID >", value,
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
                    "REPORT_INSTANCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID >=", value,
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
                    "REPORT_INSTANCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID <", value,
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
                    "REPORT_INSTANCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID <=", value,
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
                    "REPORT_INSTANCE.REPORT_PROJECT_ID");
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
                addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID in", values,
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
                addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID not in",
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
                addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID in", values,
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
                addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID not in",
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
                addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID in",
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
                addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID not in",
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID between", value1,
                value2, "reportProjectId");

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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID between", value1,
                value2, "reportProjectId");

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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID not between",
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
            addCriterion("REPORT_INSTANCE.REPORT_PROJECT_ID not between",
                value1, value2, "reportProjectId");

            return this;
        } // end andReportProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleIsNull() {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE is null");

            return this;
        } // end andReportTitleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleIsNotNull() {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE is not null");

            return this;
        } // end andReportTitleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleIsNotEmpty() {
            addCriterion(
                "REPORT_INSTANCE.REPORT_TITLE is not null AND REPORT_INSTANCE.REPORT_TITLE <> ''");

            return this;
        } // end andReportTitleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleIsEmpty() {
            addCriterion(
                "(REPORT_INSTANCE.REPORT_TITLE is null OR REPORT_INSTANCE.REPORT_TITLE = '')");

            return this;
        } // end andReportTitleIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleEqualTo(String value) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE =", value, "reportTitle");

            return this;
        } // end andReportTitleEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REPORT_TITLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportTitleEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleNotEqualTo(String value) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE <>", value, "reportTitle");

            return this;
        } // end andReportTitleNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE is null OR REPORT_INSTANCE.REPORT_TITLE <>",
                value, "reportTitle");

            return this;
        } // end andReportTitleNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REPORT_TITLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportTitleNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleGreaterThan(String value) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE >", value, "reportTitle");

            return this;
        } // end andReportTitleGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REPORT_TITLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportTitleGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE >=", value, "reportTitle");

            return this;
        } // end andReportTitleGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REPORT_TITLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportTitleGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleLessThan(String value) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE <", value, "reportTitle");

            return this;
        } // end andReportTitleLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REPORT_TITLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportTitleLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleLessThanOrEqualTo(String value) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE <=", value, "reportTitle");

            return this;
        } // end andReportTitleLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.REPORT_TITLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportTitleLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_INSTANCE.REPORT_TITLE like",
                buffer.toString(), "reportTitle");

            return this;
        } // end andReportTitleLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_INSTANCE.REPORT_TITLE not like",
                buffer.toString(), "reportTitle");

            return this;
        } // end andReportTitleNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleIn(List values) {
            if (values.size() == 1) {
                return andReportTitleEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.REPORT_TITLE in", values,
                    "reportTitle");

                return this;
            } // end else
        } // end andReportTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleNotIn(List values) {
            if (values.size() == 1) {
                return andReportTitleNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.REPORT_TITLE not in", values,
                    "reportTitle");

                return this;
            } // end else
        } // end andReportTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleIn(Object[] values) {
            if (values.length == 1) {
                return andReportTitleEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.REPORT_TITLE in",
                    Arrays.asList(values), "reportTitle");

                return this;
            } // end else
        } // end andReportTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportTitleNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_INSTANCE.REPORT_TITLE not in",
                    Arrays.asList(values), "reportTitle");

                return this;
            } // end else
        } // end andReportTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleBetween(String value1, String value2) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE between", value1,
                value2, "reportTitle");

            return this;
        } // end andReportTitleBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportTitleNotBetween(String value1, String value2) {
            addCriterion("REPORT_INSTANCE.REPORT_TITLE not between", value1,
                value2, "reportTitle");

            return this;
        } // end andReportTitleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_INSTANCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_INSTANCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_INSTANCE.STATUS is not null AND REPORT_INSTANCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_INSTANCE.STATUS is null OR REPORT_INSTANCE.STATUS = '')");

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
            addCriterion("REPORT_INSTANCE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.STATUS");
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
            addCriterion("REPORT_INSTANCE.STATUS <>", value, "status");

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
            addCriterion("REPORT_INSTANCE.STATUS is null OR REPORT_INSTANCE.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.STATUS");
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
            addCriterion("REPORT_INSTANCE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.STATUS");
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
            addCriterion("REPORT_INSTANCE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.STATUS");
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
            addCriterion("REPORT_INSTANCE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.STATUS");
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
            addCriterion("REPORT_INSTANCE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_INSTANCE.STATUS");
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
            addCriterion("REPORT_INSTANCE.STATUS like", buffer.toString(),
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
            addCriterion("REPORT_INSTANCE.STATUS not like", buffer.toString(),
                "status");

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
                addCriterion("REPORT_INSTANCE.STATUS in", values, "status");

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
                addCriterion("REPORT_INSTANCE.STATUS not in", values, "status");

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
                addCriterion("REPORT_INSTANCE.STATUS in",
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
                addCriterion("REPORT_INSTANCE.STATUS not in",
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
            addCriterion("REPORT_INSTANCE.STATUS between", value1, value2,
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
            addCriterion("REPORT_INSTANCE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNull() {
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID is null");

            return this;
        } // end andReportViewIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotNull() {
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID is not null");

            return this;
        } // end andReportViewIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotEmpty() {
            addCriterion(
                "REPORT_INSTANCE.REPORT_VIEW_ID is not null AND REPORT_INSTANCE.REPORT_VIEW_ID <> ''");

            return this;
        } // end andReportViewIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsEmpty() {
            addCriterion(
                "(REPORT_INSTANCE.REPORT_VIEW_ID is null OR REPORT_INSTANCE.REPORT_VIEW_ID = '')");

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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID =", value,
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
                    "REPORT_INSTANCE.REPORT_VIEW_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID <>", value,
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID is null OR REPORT_INSTANCE.REPORT_VIEW_ID <>",
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
                    "REPORT_INSTANCE.REPORT_VIEW_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID >", value,
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
                    "REPORT_INSTANCE.REPORT_VIEW_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID >=", value,
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
                    "REPORT_INSTANCE.REPORT_VIEW_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID <", value,
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
                    "REPORT_INSTANCE.REPORT_VIEW_ID");
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID <=", value,
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
                    "REPORT_INSTANCE.REPORT_VIEW_ID");
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
                addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID in", values,
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
                addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID not in", values,
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
                addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID in", values,
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
                addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID not in", values,
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
                addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID in",
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
                addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID not in",
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID between", value1,
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID between", value1,
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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID not between", value1,
                value2, "reportViewId");

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
            addCriterion("REPORT_INSTANCE.REPORT_VIEW_ID not between", value1,
                value2, "reportViewId");

            return this;
        } // end andReportViewIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameIsNull() {
            addCriterion("reportViewDefineC.NAME is null");

            return this;
        } // end andReportViewNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameIsNotNull() {
            addCriterion("reportViewDefineC.NAME is not null");

            return this;
        } // end andReportViewNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameIsNotEmpty() {
            addCriterion(
                "reportViewDefineC.NAME is not null AND reportViewDefineC.NAME <> ''");

            return this;
        } // end andReportViewNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameIsEmpty() {
            addCriterion(
                "(reportViewDefineC.NAME is null OR reportViewDefineC.NAME = '')");

            return this;
        } // end andReportViewNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameEqualTo(String value) {
            addCriterion("reportViewDefineC.NAME =", value, "reportViewName");

            return this;
        } // end andReportViewNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameNotEqualTo(String value) {
            addCriterion("reportViewDefineC.NAME <>", value, "reportViewName");

            return this;
        } // end andReportViewNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameNotEqualToOrIsNull(String value) {
            addCriterion("reportViewDefineC.NAME is null OR reportViewDefineC.NAME <>",
                value, "reportViewName");

            return this;
        } // end andReportViewNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameGreaterThan(String value) {
            addCriterion("reportViewDefineC.NAME >", value, "reportViewName");

            return this;
        } // end andReportViewNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.NAME >=", value, "reportViewName");

            return this;
        } // end andReportViewNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameLessThan(String value) {
            addCriterion("reportViewDefineC.NAME <", value, "reportViewName");

            return this;
        } // end andReportViewNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameLessThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.NAME <=", value, "reportViewName");

            return this;
        } // end andReportViewNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.NAME like", buffer.toString(),
                "reportViewName");

            return this;
        } // end andReportViewNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.NAME not like", buffer.toString(),
                "reportViewName");

            return this;
        } // end andReportViewNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameIn(List values) {
            if (values.size() == 1) {
                return andReportViewNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.NAME in", values,
                    "reportViewName");

                return this;
            } // end else
        } // end andReportViewNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameNotIn(List values) {
            if (values.size() == 1) {
                return andReportViewNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.NAME not in", values,
                    "reportViewName");

                return this;
            } // end else
        } // end andReportViewNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.NAME in",
                    Arrays.asList(values), "reportViewName");

                return this;
            } // end else
        } // end andReportViewNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.NAME not in",
                    Arrays.asList(values), "reportViewName");

                return this;
            } // end else
        } // end andReportViewNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameBetween(String value1, String value2) {
            addCriterion("reportViewDefineC.NAME between", value1, value2,
                "reportViewName");

            return this;
        } // end andReportViewNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewNameNotBetween(String value1, String value2) {
            addCriterion("reportViewDefineC.NAME not between", value1, value2,
                "reportViewName");

            return this;
        } // end andReportViewNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeIsNull() {
            addCriterion("reportViewDefineC.CODE is null");

            return this;
        } // end andReportViewCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeIsNotNull() {
            addCriterion("reportViewDefineC.CODE is not null");

            return this;
        } // end andReportViewCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeIsNotEmpty() {
            addCriterion(
                "reportViewDefineC.CODE is not null AND reportViewDefineC.CODE <> ''");

            return this;
        } // end andReportViewCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeIsEmpty() {
            addCriterion(
                "(reportViewDefineC.CODE is null OR reportViewDefineC.CODE = '')");

            return this;
        } // end andReportViewCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeEqualTo(String value) {
            addCriterion("reportViewDefineC.CODE =", value, "reportViewCode");

            return this;
        } // end andReportViewCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeNotEqualTo(String value) {
            addCriterion("reportViewDefineC.CODE <>", value, "reportViewCode");

            return this;
        } // end andReportViewCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeNotEqualToOrIsNull(String value) {
            addCriterion("reportViewDefineC.CODE is null OR reportViewDefineC.CODE <>",
                value, "reportViewCode");

            return this;
        } // end andReportViewCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeGreaterThan(String value) {
            addCriterion("reportViewDefineC.CODE >", value, "reportViewCode");

            return this;
        } // end andReportViewCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.CODE >=", value, "reportViewCode");

            return this;
        } // end andReportViewCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeLessThan(String value) {
            addCriterion("reportViewDefineC.CODE <", value, "reportViewCode");

            return this;
        } // end andReportViewCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeLessThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.CODE <=", value, "reportViewCode");

            return this;
        } // end andReportViewCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.CODE like", buffer.toString(),
                "reportViewCode");

            return this;
        } // end andReportViewCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.CODE not like", buffer.toString(),
                "reportViewCode");

            return this;
        } // end andReportViewCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeIn(List values) {
            if (values.size() == 1) {
                return andReportViewCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.CODE in", values,
                    "reportViewCode");

                return this;
            } // end else
        } // end andReportViewCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeNotIn(List values) {
            if (values.size() == 1) {
                return andReportViewCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.CODE not in", values,
                    "reportViewCode");

                return this;
            } // end else
        } // end andReportViewCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.CODE in",
                    Arrays.asList(values), "reportViewCode");

                return this;
            } // end else
        } // end andReportViewCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.CODE not in",
                    Arrays.asList(values), "reportViewCode");

                return this;
            } // end else
        } // end andReportViewCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeBetween(String value1, String value2) {
            addCriterion("reportViewDefineC.CODE between", value1, value2,
                "reportViewCode");

            return this;
        } // end andReportViewCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewCodeNotBetween(String value1, String value2) {
            addCriterion("reportViewDefineC.CODE not between", value1, value2,
                "reportViewCode");

            return this;
        } // end andReportViewCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctIsNull() {
            addCriterion("reportViewDefineC.IS_DISTINCT is null");

            return this;
        } // end andReportViewIsDistinctIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctIsNotNull() {
            addCriterion("reportViewDefineC.IS_DISTINCT is not null");

            return this;
        } // end andReportViewIsDistinctIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctIsNotEmpty() {
            addCriterion(
                "reportViewDefineC.IS_DISTINCT is not null AND reportViewDefineC.IS_DISTINCT <> ''");

            return this;
        } // end andReportViewIsDistinctIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctIsEmpty() {
            addCriterion(
                "(reportViewDefineC.IS_DISTINCT is null OR reportViewDefineC.IS_DISTINCT = '')");

            return this;
        } // end andReportViewIsDistinctIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctEqualTo(String value) {
            addCriterion("reportViewDefineC.IS_DISTINCT =", value,
                "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.IS_DISTINCT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIsDistinctEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctNotEqualTo(String value) {
            addCriterion("reportViewDefineC.IS_DISTINCT <>", value,
                "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctNotEqualToOrIsNull(String value) {
            addCriterion("reportViewDefineC.IS_DISTINCT is null OR reportViewDefineC.IS_DISTINCT <>",
                value, "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.IS_DISTINCT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIsDistinctNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctGreaterThan(String value) {
            addCriterion("reportViewDefineC.IS_DISTINCT >", value,
                "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.IS_DISTINCT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIsDistinctGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctGreaterThanOrEqualTo(
            String value) {
            addCriterion("reportViewDefineC.IS_DISTINCT >=", value,
                "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.IS_DISTINCT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIsDistinctGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctLessThan(String value) {
            addCriterion("reportViewDefineC.IS_DISTINCT <", value,
                "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.IS_DISTINCT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIsDistinctLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctLessThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.IS_DISTINCT <=", value,
                "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.IS_DISTINCT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewIsDistinctLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.IS_DISTINCT like",
                buffer.toString(), "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.IS_DISTINCT not like",
                buffer.toString(), "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctIn(List values) {
            if (values.size() == 1) {
                return andReportViewIsDistinctEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.IS_DISTINCT in", values,
                    "reportViewIsDistinct");

                return this;
            } // end else
        } // end andReportViewIsDistinctIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctNotIn(List values) {
            if (values.size() == 1) {
                return andReportViewIsDistinctNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.IS_DISTINCT not in", values,
                    "reportViewIsDistinct");

                return this;
            } // end else
        } // end andReportViewIsDistinctNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewIsDistinctEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.IS_DISTINCT in",
                    Arrays.asList(values), "reportViewIsDistinct");

                return this;
            } // end else
        } // end andReportViewIsDistinctIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewIsDistinctNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.IS_DISTINCT not in",
                    Arrays.asList(values), "reportViewIsDistinct");

                return this;
            } // end else
        } // end andReportViewIsDistinctNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctBetween(String value1,
            String value2) {
            addCriterion("reportViewDefineC.IS_DISTINCT between", value1,
                value2, "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIsDistinctNotBetween(String value1,
            String value2) {
            addCriterion("reportViewDefineC.IS_DISTINCT not between", value1,
                value2, "reportViewIsDistinct");

            return this;
        } // end andReportViewIsDistinctNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersIsNull() {
            addCriterion("reportViewDefineC.VIEW_FILTERS is null");

            return this;
        } // end andReportViewFiltersIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersIsNotNull() {
            addCriterion("reportViewDefineC.VIEW_FILTERS is not null");

            return this;
        } // end andReportViewFiltersIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersIsNotEmpty() {
            addCriterion(
                "reportViewDefineC.VIEW_FILTERS is not null AND reportViewDefineC.VIEW_FILTERS <> ''");

            return this;
        } // end andReportViewFiltersIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersIsEmpty() {
            addCriterion(
                "(reportViewDefineC.VIEW_FILTERS is null OR reportViewDefineC.VIEW_FILTERS = '')");

            return this;
        } // end andReportViewFiltersIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersEqualTo(String value) {
            addCriterion("reportViewDefineC.VIEW_FILTERS =", value,
                "reportViewFilters");

            return this;
        } // end andReportViewFiltersEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewDefineC.VIEW_FILTERS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewFiltersEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersNotEqualTo(String value) {
            addCriterion("reportViewDefineC.VIEW_FILTERS <>", value,
                "reportViewFilters");

            return this;
        } // end andReportViewFiltersNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersNotEqualToOrIsNull(String value) {
            addCriterion("reportViewDefineC.VIEW_FILTERS is null OR reportViewDefineC.VIEW_FILTERS <>",
                value, "reportViewFilters");

            return this;
        } // end andReportViewFiltersNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewDefineC.VIEW_FILTERS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewFiltersNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersGreaterThan(String value) {
            addCriterion("reportViewDefineC.VIEW_FILTERS >", value,
                "reportViewFilters");

            return this;
        } // end andReportViewFiltersGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewDefineC.VIEW_FILTERS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewFiltersGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.VIEW_FILTERS >=", value,
                "reportViewFilters");

            return this;
        } // end andReportViewFiltersGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewDefineC.VIEW_FILTERS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewFiltersGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersLessThan(String value) {
            addCriterion("reportViewDefineC.VIEW_FILTERS <", value,
                "reportViewFilters");

            return this;
        } // end andReportViewFiltersLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewDefineC.VIEW_FILTERS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewFiltersLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersLessThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.VIEW_FILTERS <=", value,
                "reportViewFilters");

            return this;
        } // end andReportViewFiltersLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewDefineC.VIEW_FILTERS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewFiltersLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.VIEW_FILTERS like",
                buffer.toString(), "reportViewFilters");

            return this;
        } // end andReportViewFiltersLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.VIEW_FILTERS not like",
                buffer.toString(), "reportViewFilters");

            return this;
        } // end andReportViewFiltersNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersIn(List values) {
            if (values.size() == 1) {
                return andReportViewFiltersEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.VIEW_FILTERS in", values,
                    "reportViewFilters");

                return this;
            } // end else
        } // end andReportViewFiltersIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersNotIn(List values) {
            if (values.size() == 1) {
                return andReportViewFiltersNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.VIEW_FILTERS not in", values,
                    "reportViewFilters");

                return this;
            } // end else
        } // end andReportViewFiltersNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewFiltersEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.VIEW_FILTERS in",
                    Arrays.asList(values), "reportViewFilters");

                return this;
            } // end else
        } // end andReportViewFiltersIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewFiltersNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.VIEW_FILTERS not in",
                    Arrays.asList(values), "reportViewFilters");

                return this;
            } // end else
        } // end andReportViewFiltersNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersBetween(String value1, String value2) {
            addCriterion("reportViewDefineC.VIEW_FILTERS between", value1,
                value2, "reportViewFilters");

            return this;
        } // end andReportViewFiltersBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewFiltersNotBetween(String value1,
            String value2) {
            addCriterion("reportViewDefineC.VIEW_FILTERS not between", value1,
                value2, "reportViewFilters");

            return this;
        } // end andReportViewFiltersNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByIsNull() {
            addCriterion("reportViewDefineC.GROUP_BY is null");

            return this;
        } // end andReportViewGroupByIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByIsNotNull() {
            addCriterion("reportViewDefineC.GROUP_BY is not null");

            return this;
        } // end andReportViewGroupByIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByIsNotEmpty() {
            addCriterion(
                "reportViewDefineC.GROUP_BY is not null AND reportViewDefineC.GROUP_BY <> ''");

            return this;
        } // end andReportViewGroupByIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByIsEmpty() {
            addCriterion(
                "(reportViewDefineC.GROUP_BY is null OR reportViewDefineC.GROUP_BY = '')");

            return this;
        } // end andReportViewGroupByIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByEqualTo(String value) {
            addCriterion("reportViewDefineC.GROUP_BY =", value,
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.GROUP_BY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewGroupByEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByNotEqualTo(String value) {
            addCriterion("reportViewDefineC.GROUP_BY <>", value,
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByNotEqualToOrIsNull(String value) {
            addCriterion("reportViewDefineC.GROUP_BY is null OR reportViewDefineC.GROUP_BY <>",
                value, "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.GROUP_BY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewGroupByNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByGreaterThan(String value) {
            addCriterion("reportViewDefineC.GROUP_BY >", value,
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.GROUP_BY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewGroupByGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.GROUP_BY >=", value,
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.GROUP_BY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewGroupByGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByLessThan(String value) {
            addCriterion("reportViewDefineC.GROUP_BY <", value,
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.GROUP_BY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewGroupByLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByLessThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.GROUP_BY <=", value,
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.GROUP_BY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewGroupByLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.GROUP_BY like", buffer.toString(),
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.GROUP_BY not like",
                buffer.toString(), "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByIn(List values) {
            if (values.size() == 1) {
                return andReportViewGroupByEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.GROUP_BY in", values,
                    "reportViewGroupBy");

                return this;
            } // end else
        } // end andReportViewGroupByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByNotIn(List values) {
            if (values.size() == 1) {
                return andReportViewGroupByNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.GROUP_BY not in", values,
                    "reportViewGroupBy");

                return this;
            } // end else
        } // end andReportViewGroupByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewGroupByEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.GROUP_BY in",
                    Arrays.asList(values), "reportViewGroupBy");

                return this;
            } // end else
        } // end andReportViewGroupByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewGroupByNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.GROUP_BY not in",
                    Arrays.asList(values), "reportViewGroupBy");

                return this;
            } // end else
        } // end andReportViewGroupByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByBetween(String value1, String value2) {
            addCriterion("reportViewDefineC.GROUP_BY between", value1, value2,
                "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewGroupByNotBetween(String value1,
            String value2) {
            addCriterion("reportViewDefineC.GROUP_BY not between", value1,
                value2, "reportViewGroupBy");

            return this;
        } // end andReportViewGroupByNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByIsNull() {
            addCriterion("reportViewDefineC.ORDER_BY is null");

            return this;
        } // end andReportViewOrderByIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByIsNotNull() {
            addCriterion("reportViewDefineC.ORDER_BY is not null");

            return this;
        } // end andReportViewOrderByIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByIsNotEmpty() {
            addCriterion(
                "reportViewDefineC.ORDER_BY is not null AND reportViewDefineC.ORDER_BY <> ''");

            return this;
        } // end andReportViewOrderByIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByIsEmpty() {
            addCriterion(
                "(reportViewDefineC.ORDER_BY is null OR reportViewDefineC.ORDER_BY = '')");

            return this;
        } // end andReportViewOrderByIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByEqualTo(String value) {
            addCriterion("reportViewDefineC.ORDER_BY =", value,
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.ORDER_BY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewOrderByEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByNotEqualTo(String value) {
            addCriterion("reportViewDefineC.ORDER_BY <>", value,
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByNotEqualToOrIsNull(String value) {
            addCriterion("reportViewDefineC.ORDER_BY is null OR reportViewDefineC.ORDER_BY <>",
                value, "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.ORDER_BY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewOrderByNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByGreaterThan(String value) {
            addCriterion("reportViewDefineC.ORDER_BY >", value,
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.ORDER_BY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewOrderByGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.ORDER_BY >=", value,
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.ORDER_BY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewOrderByGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByLessThan(String value) {
            addCriterion("reportViewDefineC.ORDER_BY <", value,
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.ORDER_BY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewOrderByLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByLessThanOrEqualTo(String value) {
            addCriterion("reportViewDefineC.ORDER_BY <=", value,
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewDefineC.ORDER_BY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportViewOrderByLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.ORDER_BY like", buffer.toString(),
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewDefineC.ORDER_BY not like",
                buffer.toString(), "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByIn(List values) {
            if (values.size() == 1) {
                return andReportViewOrderByEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.ORDER_BY in", values,
                    "reportViewOrderBy");

                return this;
            } // end else
        } // end andReportViewOrderByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByNotIn(List values) {
            if (values.size() == 1) {
                return andReportViewOrderByNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewDefineC.ORDER_BY not in", values,
                    "reportViewOrderBy");

                return this;
            } // end else
        } // end andReportViewOrderByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewOrderByEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.ORDER_BY in",
                    Arrays.asList(values), "reportViewOrderBy");

                return this;
            } // end else
        } // end andReportViewOrderByIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportViewOrderByNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewDefineC.ORDER_BY not in",
                    Arrays.asList(values), "reportViewOrderBy");

                return this;
            } // end else
        } // end andReportViewOrderByNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByBetween(String value1, String value2) {
            addCriterion("reportViewDefineC.ORDER_BY between", value1, value2,
                "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewOrderByNotBetween(String value1,
            String value2) {
            addCriterion("reportViewDefineC.ORDER_BY not between", value1,
                value2, "reportViewOrderBy");

            return this;
        } // end andReportViewOrderByNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsNull() {
            addCriterion("reportProjectC.NAME is null");

            return this;
        } // end andReportProjectNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsNotNull() {
            addCriterion("reportProjectC.NAME is not null");

            return this;
        } // end andReportProjectNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsNotEmpty() {
            addCriterion(
                "reportProjectC.NAME is not null AND reportProjectC.NAME <> ''");

            return this;
        } // end andReportProjectNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectNameIsEmpty() {
            addCriterion(
                "(reportProjectC.NAME is null OR reportProjectC.NAME = '')");

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
            addCriterion("reportProjectC.NAME =", value, "reportProjectName");

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
            StringBuffer str = new StringBuffer("reportProjectC.NAME");
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
            addCriterion("reportProjectC.NAME <>", value, "reportProjectName");

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
            addCriterion("reportProjectC.NAME is null OR reportProjectC.NAME <>",
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
            StringBuffer str = new StringBuffer("reportProjectC.NAME");
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
            addCriterion("reportProjectC.NAME >", value, "reportProjectName");

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
            StringBuffer str = new StringBuffer("reportProjectC.NAME");
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
            addCriterion("reportProjectC.NAME >=", value, "reportProjectName");

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
            StringBuffer str = new StringBuffer("reportProjectC.NAME");
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
            addCriterion("reportProjectC.NAME <", value, "reportProjectName");

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
            StringBuffer str = new StringBuffer("reportProjectC.NAME");
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
            addCriterion("reportProjectC.NAME <=", value, "reportProjectName");

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
            StringBuffer str = new StringBuffer("reportProjectC.NAME");
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
            addCriterion("reportProjectC.NAME like", buffer.toString(),
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
            addCriterion("reportProjectC.NAME not like", buffer.toString(),
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
                addCriterion("reportProjectC.NAME in", values,
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
                addCriterion("reportProjectC.NAME not in", values,
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
                addCriterion("reportProjectC.NAME in", Arrays.asList(values),
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
                addCriterion("reportProjectC.NAME not in",
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
            addCriterion("reportProjectC.NAME between", value1, value2,
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
            addCriterion("reportProjectC.NAME not between", value1, value2,
                "reportProjectName");

            return this;
        } // end andReportProjectNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsNull() {
            addCriterion("reportProjectC.CODE is null");

            return this;
        } // end andReportProjectCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsNotNull() {
            addCriterion("reportProjectC.CODE is not null");

            return this;
        } // end andReportProjectCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsNotEmpty() {
            addCriterion(
                "reportProjectC.CODE is not null AND reportProjectC.CODE <> ''");

            return this;
        } // end andReportProjectCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectCodeIsEmpty() {
            addCriterion(
                "(reportProjectC.CODE is null OR reportProjectC.CODE = '')");

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
            addCriterion("reportProjectC.CODE =", value, "reportProjectCode");

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
            StringBuffer str = new StringBuffer("reportProjectC.CODE");
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
            addCriterion("reportProjectC.CODE <>", value, "reportProjectCode");

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
            addCriterion("reportProjectC.CODE is null OR reportProjectC.CODE <>",
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
            StringBuffer str = new StringBuffer("reportProjectC.CODE");
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
            addCriterion("reportProjectC.CODE >", value, "reportProjectCode");

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
            StringBuffer str = new StringBuffer("reportProjectC.CODE");
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
            addCriterion("reportProjectC.CODE >=", value, "reportProjectCode");

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
            StringBuffer str = new StringBuffer("reportProjectC.CODE");
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
            addCriterion("reportProjectC.CODE <", value, "reportProjectCode");

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
            StringBuffer str = new StringBuffer("reportProjectC.CODE");
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
            addCriterion("reportProjectC.CODE <=", value, "reportProjectCode");

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
            StringBuffer str = new StringBuffer("reportProjectC.CODE");
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
            addCriterion("reportProjectC.CODE like", buffer.toString(),
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
            addCriterion("reportProjectC.CODE not like", buffer.toString(),
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
                addCriterion("reportProjectC.CODE in", values,
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
                addCriterion("reportProjectC.CODE not in", values,
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
                addCriterion("reportProjectC.CODE in", Arrays.asList(values),
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
                addCriterion("reportProjectC.CODE not in",
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
            addCriterion("reportProjectC.CODE between", value1, value2,
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
            addCriterion("reportProjectC.CODE not between", value1, value2,
                "reportProjectCode");

            return this;
        } // end andReportProjectCodeNotBetween()
    } // end Criteria
} // end ReportInstanceDAOQueryBean
