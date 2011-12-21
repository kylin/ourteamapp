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
 * ReportDisplayColumn query bean 2011-09-27 11:37:53
 *
 * @author Auto Gen
 */
public class ReportDisplayColumnDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportDisplayColumnDAOQueryBean object.
     */
    public ReportDisplayColumnDAOQueryBean() {
        super();
    } // end ReportDisplayColumnDAOQueryBean()

    /**
     * Creates a new ReportDisplayColumnDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportDisplayColumnDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportDisplayColumnDAOQueryBean()

    /**
     * Creates a new ReportDisplayColumnDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportDisplayColumnDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportDisplayColumnDAOQueryBean()

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
            addSelectProperty(IReportDisplayColumnDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addColumnTitleSelectProperty() {
        addColumnTitleSelectProperty("columnTitle");
    } // end addColumnTitleSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addColumnTitleSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportDisplayColumnDAO.ColumnTitle, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.ColumnTitle, "columnTitle");
        } // end else
    } // end addColumnTitleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addColumnWidthSelectProperty() {
        addColumnWidthSelectProperty("columnWidth");
    } // end addColumnWidthSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addColumnWidthSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportDisplayColumnDAO.ColumnWidth, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.ColumnWidth, "columnWidth");
        } // end else
    } // end addColumnWidthSelectProperty()

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
            addSelectProperty(IReportDisplayColumnDAO.FieldId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.FieldId, "fieldId");
        } // end else
    } // end addFieldIdSelectProperty()

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
            addSelectProperty(IReportDisplayColumnDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReportInstanceIdSelectProperty() {
        addReportInstanceIdSelectProperty("reportInstanceId");
    } // end addReportInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReportInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportDisplayColumnDAO.ReportInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.ReportInstanceId,
                "reportInstanceId");
        } // end else
    } // end addReportInstanceIdSelectProperty()

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
            addSelectProperty(IReportDisplayColumnDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.SortIndex, "sortIndex");
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
            addSelectProperty(IReportDisplayColumnDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldDataTypeSelectProperty() {
        addFieldDataTypeSelectProperty("fieldDataType");
    } // end addFieldDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportDisplayColumnDAO.FieldDataType, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.FieldDataType,
                "fieldDataType");
        } // end else
    } // end addFieldDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldAliasSelectProperty() {
        addFieldAliasSelectProperty("fieldAlias");
    } // end addFieldAliasSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldAliasSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportDisplayColumnDAO.FieldAlias, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.FieldAlias, "fieldAlias");
        } // end else
    } // end addFieldAliasSelectProperty()

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
            addSelectProperty(IReportDisplayColumnDAO.FieldName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.FieldName, "fieldName");
        } // end else
    } // end addFieldNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldWidthSelectProperty() {
        addFieldWidthSelectProperty("fieldWidth");
    } // end addFieldWidthSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldWidthSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportDisplayColumnDAO.FieldWidth, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.FieldWidth, "fieldWidth");
        } // end else
    } // end addFieldWidthSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldTitleSelectProperty() {
        addFieldTitleSelectProperty("fieldTitle");
    } // end addFieldTitleSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldTitleSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportDisplayColumnDAO.FieldTitle, aAlias);
        } // end if
        else {
            addSelectProperty(IReportDisplayColumnDAO.FieldTitle, "fieldTitle");
        } // end else
    } // end addFieldTitleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addColumnTitleSelectProperty();

        addColumnWidthSelectProperty();

        addFieldIdSelectProperty();

        addRemarksSelectProperty();

        addReportInstanceIdSelectProperty();

        addSortIndexSelectProperty();

        addStatusSelectProperty();

        addFieldDataTypeSelectProperty();

        addFieldAliasSelectProperty();

        addFieldNameSelectProperty();

        addFieldWidthSelectProperty();

        addFieldTitleSelectProperty();
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.ID is not null AND REPORT_DISPLAY_COLUMN.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.ID is null OR REPORT_DISPLAY_COLUMN.ID = '')");

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
            addCriterion("REPORT_DISPLAY_COLUMN.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID <>", value, "id");

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
            addCriterion("REPORT_DISPLAY_COLUMN.ID is null OR REPORT_DISPLAY_COLUMN.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.ID");
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
                addCriterion("REPORT_DISPLAY_COLUMN.ID in", values, "id");

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
                addCriterion("REPORT_DISPLAY_COLUMN.ID not in", values, "id");

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
                addCriterion("REPORT_DISPLAY_COLUMN.ID in", values, "id");

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
                addCriterion("REPORT_DISPLAY_COLUMN.ID not in", values, "id");

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
                addCriterion("REPORT_DISPLAY_COLUMN.ID in",
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
                addCriterion("REPORT_DISPLAY_COLUMN.ID not in",
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID between", value1, value2,
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID between", value1, value2,
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID not between", value1,
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
            addCriterion("REPORT_DISPLAY_COLUMN.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleIsNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE is null");

            return this;
        } // end andColumnTitleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE is not null");

            return this;
        } // end andColumnTitleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.COLUMN_TITLE is not null AND REPORT_DISPLAY_COLUMN.COLUMN_TITLE <> ''");

            return this;
        } // end andColumnTitleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.COLUMN_TITLE is null OR REPORT_DISPLAY_COLUMN.COLUMN_TITLE = '')");

            return this;
        } // end andColumnTitleIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleEqualTo(String value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE =", value,
                "columnTitle");

            return this;
        } // end andColumnTitleEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_TITLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnTitleEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleNotEqualTo(String value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE <>", value,
                "columnTitle");

            return this;
        } // end andColumnTitleNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE is null OR REPORT_DISPLAY_COLUMN.COLUMN_TITLE <>",
                value, "columnTitle");

            return this;
        } // end andColumnTitleNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_TITLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnTitleNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleGreaterThan(String value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE >", value,
                "columnTitle");

            return this;
        } // end andColumnTitleGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_TITLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnTitleGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE >=", value,
                "columnTitle");

            return this;
        } // end andColumnTitleGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_TITLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnTitleGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleLessThan(String value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE <", value,
                "columnTitle");

            return this;
        } // end andColumnTitleLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_TITLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnTitleLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleLessThanOrEqualTo(String value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE <=", value,
                "columnTitle");

            return this;
        } // end andColumnTitleLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_TITLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnTitleLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE like",
                buffer.toString(), "columnTitle");

            return this;
        } // end andColumnTitleLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE not like",
                buffer.toString(), "columnTitle");

            return this;
        } // end andColumnTitleNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleIn(List values) {
            if (values.size() == 1) {
                return andColumnTitleEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE in", values,
                    "columnTitle");

                return this;
            } // end else
        } // end andColumnTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleNotIn(List values) {
            if (values.size() == 1) {
                return andColumnTitleNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE not in",
                    values, "columnTitle");

                return this;
            } // end else
        } // end andColumnTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleIn(Object[] values) {
            if (values.length == 1) {
                return andColumnTitleEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE in",
                    Arrays.asList(values), "columnTitle");

                return this;
            } // end else
        } // end andColumnTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleNotIn(Object[] values) {
            if (values.length == 1) {
                return andColumnTitleNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE not in",
                    Arrays.asList(values), "columnTitle");

                return this;
            } // end else
        } // end andColumnTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleBetween(String value1, String value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE between", value1,
                value2, "columnTitle");

            return this;
        } // end andColumnTitleBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnTitleNotBetween(String value1, String value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_TITLE not between",
                value1, value2, "columnTitle");

            return this;
        } // end andColumnTitleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthIsNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH is null");

            return this;
        } // end andColumnWidthIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH is not null");

            return this;
        } // end andColumnWidthIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH is not null AND REPORT_DISPLAY_COLUMN.COLUMN_WIDTH <> ''");

            return this;
        } // end andColumnWidthIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.COLUMN_WIDTH is null OR REPORT_DISPLAY_COLUMN.COLUMN_WIDTH = '')");

            return this;
        } // end andColumnWidthIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthEqualTo(int value) {
            return andColumnWidthEqualTo(Integer.valueOf(value));
        } // end andColumnWidthEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthEqualTo(java.lang.Integer value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH =", value,
                "columnWidth");

            return this;
        } // end andColumnWidthEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnWidthEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotEqualTo(int value) {
            return andColumnWidthNotEqualTo(Integer.valueOf(value));
        } // end andColumnWidthNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotEqualTo(java.lang.Integer value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH <>", value,
                "columnWidth");

            return this;
        } // end andColumnWidthNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotEqualToOrIsNull(int value) {
            return andColumnWidthNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andColumnWidthNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotEqualToOrIsNull(
            java.lang.Integer value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH is null OR REPORT_DISPLAY_COLUMN.COLUMN_WIDTH <>",
                value, "columnWidth");

            return this;
        } // end andColumnWidthNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnWidthNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthGreaterThan(int value) {
            return andColumnWidthGreaterThan(Integer.valueOf(value));
        } // end andColumnWidthGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthGreaterThan(java.lang.Integer value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH >", value,
                "columnWidth");

            return this;
        } // end andColumnWidthGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnWidthGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthGreaterThanOrEqualTo(int value) {
            return andColumnWidthGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andColumnWidthGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH >=", value,
                "columnWidth");

            return this;
        } // end andColumnWidthGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnWidthGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthLessThan(int value) {
            return andColumnWidthLessThan(Integer.valueOf(value));
        } // end andColumnWidthLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthLessThan(java.lang.Integer value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH <", value,
                "columnWidth");

            return this;
        } // end andColumnWidthLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnWidthLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthLessThanOrEqualTo(int value) {
            return andColumnWidthLessThanOrEqualTo(Integer.valueOf(value));
        } // end andColumnWidthLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH <=", value,
                "columnWidth");

            return this;
        } // end andColumnWidthLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnWidthLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthIn(int[] values) {
            if (values.length == 1) {
                return andColumnWidthEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH in", values,
                    "columnWidth");

                return this;
            } // end else
        } // end andColumnWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotIn(int[] values) {
            if (values.length == 1) {
                return andColumnWidthNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH not in",
                    values, "columnWidth");

                return this;
            } // end else
        } // end andColumnWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthIn(List values) {
            if (values.size() == 1) {
                return andColumnWidthEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH in", values,
                    "columnWidth");

                return this;
            } // end else
        } // end andColumnWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotIn(List values) {
            if (values.size() == 1) {
                return andColumnWidthNotEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH not in",
                    values, "columnWidth");

                return this;
            } // end else
        } // end andColumnWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthIn(Object[] values) {
            if (values.length == 1) {
                return andColumnWidthEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH in",
                    Arrays.asList(values), "columnWidth");

                return this;
            } // end else
        } // end andColumnWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotIn(Object[] values) {
            if (values.length == 1) {
                return andColumnWidthNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH not in",
                    Arrays.asList(values), "columnWidth");

                return this;
            } // end else
        } // end andColumnWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthBetween(int value1, int value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH between", value1,
                value2, "columnWidth");

            return this;
        } // end andColumnWidthBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH between", value1,
                value2, "columnWidth");

            return this;
        } // end andColumnWidthBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotBetween(int value1, int value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH not between",
                value1, value2, "columnWidth");

            return this;
        } // end andColumnWidthNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnWidthNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.COLUMN_WIDTH not between",
                value1, value2, "columnWidth");

            return this;
        } // end andColumnWidthNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID is null");

            return this;
        } // end andFieldIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID is not null");

            return this;
        } // end andFieldIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.FIELD_ID is not null AND REPORT_DISPLAY_COLUMN.FIELD_ID <> ''");

            return this;
        } // end andFieldIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.FIELD_ID is null OR REPORT_DISPLAY_COLUMN.FIELD_ID = '')");

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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID =", value, "fieldId");

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
                    "REPORT_DISPLAY_COLUMN.FIELD_ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID <>", value, "fieldId");

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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID is null OR REPORT_DISPLAY_COLUMN.FIELD_ID <>",
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
                    "REPORT_DISPLAY_COLUMN.FIELD_ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID >", value, "fieldId");

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
                    "REPORT_DISPLAY_COLUMN.FIELD_ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID >=", value, "fieldId");

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
                    "REPORT_DISPLAY_COLUMN.FIELD_ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID <", value, "fieldId");

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
                    "REPORT_DISPLAY_COLUMN.FIELD_ID");
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID <=", value, "fieldId");

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
                    "REPORT_DISPLAY_COLUMN.FIELD_ID");
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
                addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID in", values,
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
                addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID not in", values,
                    "fieldId");

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
                addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID in", values,
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
                addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID not in", values,
                    "fieldId");

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
                addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID in",
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
                addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID not in",
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID between", value1,
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID between", value1,
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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID not between", value1,
                value2, "fieldId");

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
            addCriterion("REPORT_DISPLAY_COLUMN.FIELD_ID not between", value1,
                value2, "fieldId");

            return this;
        } // end andFieldIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.REMARKS is not null AND REPORT_DISPLAY_COLUMN.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.REMARKS is null OR REPORT_DISPLAY_COLUMN.REMARKS = '')");

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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.REMARKS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS is null OR REPORT_DISPLAY_COLUMN.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.REMARKS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.REMARKS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.REMARKS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.REMARKS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.REMARKS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS like",
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS not like",
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
                addCriterion("REPORT_DISPLAY_COLUMN.REMARKS in", values,
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
                addCriterion("REPORT_DISPLAY_COLUMN.REMARKS not in", values,
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
                addCriterion("REPORT_DISPLAY_COLUMN.REMARKS in",
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
                addCriterion("REPORT_DISPLAY_COLUMN.REMARKS not in",
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS between", value1,
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
            addCriterion("REPORT_DISPLAY_COLUMN.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID is null");

            return this;
        } // end andReportInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID is not null");

            return this;
        } // end andReportInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID is not null AND REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID <> ''");

            return this;
        } // end andReportInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID is null OR REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID = '')");

            return this;
        } // end andReportInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdEqualTo(long value) {
            return andReportInstanceIdEqualTo(Long.valueOf(value));
        } // end andReportInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID =", value,
                "reportInstanceId");

            return this;
        } // end andReportInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotEqualTo(long value) {
            return andReportInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andReportInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID <>", value,
                "reportInstanceId");

            return this;
        } // end andReportInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotEqualToOrIsNull(long value) {
            return andReportInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andReportInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID is null OR REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID <>",
                value, "reportInstanceId");

            return this;
        } // end andReportInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdGreaterThan(long value) {
            return andReportInstanceIdGreaterThan(Long.valueOf(value));
        } // end andReportInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID >", value,
                "reportInstanceId");

            return this;
        } // end andReportInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdGreaterThanOrEqualTo(long value) {
            return andReportInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andReportInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID >=", value,
                "reportInstanceId");

            return this;
        } // end andReportInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdLessThan(long value) {
            return andReportInstanceIdLessThan(Long.valueOf(value));
        } // end andReportInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdLessThan(java.lang.Long value) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID <", value,
                "reportInstanceId");

            return this;
        } // end andReportInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdLessThanOrEqualTo(long value) {
            return andReportInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andReportInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID <=", value,
                "reportInstanceId");

            return this;
        } // end andReportInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReportInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andReportInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID in",
                    values, "reportInstanceId");

                return this;
            } // end else
        } // end andReportInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andReportInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID not in",
                    values, "reportInstanceId");

                return this;
            } // end else
        } // end andReportInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andReportInstanceIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID in",
                    values, "reportInstanceId");

                return this;
            } // end else
        } // end andReportInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andReportInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID not in",
                    values, "reportInstanceId");

                return this;
            } // end else
        } // end andReportInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andReportInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID in",
                    Arrays.asList(values), "reportInstanceId");

                return this;
            } // end else
        } // end andReportInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andReportInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID not in",
                    Arrays.asList(values), "reportInstanceId");

                return this;
            } // end else
        } // end andReportInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdBetween(long value1, long value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID between",
                value1, value2, "reportInstanceId");

            return this;
        } // end andReportInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID between",
                value1, value2, "reportInstanceId");

            return this;
        } // end andReportInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotBetween(long value1, long value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID not between",
                value1, value2, "reportInstanceId");

            return this;
        } // end andReportInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID not between",
                value1, value2, "reportInstanceId");

            return this;
        } // end andReportInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.SORT_INDEX is not null AND REPORT_DISPLAY_COLUMN.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.SORT_INDEX is null OR REPORT_DISPLAY_COLUMN.SORT_INDEX = '')");

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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX =", value,
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
                    "REPORT_DISPLAY_COLUMN.SORT_INDEX");
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX <>", value,
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX is null OR REPORT_DISPLAY_COLUMN.SORT_INDEX <>",
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
                    "REPORT_DISPLAY_COLUMN.SORT_INDEX");
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX >", value,
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
                    "REPORT_DISPLAY_COLUMN.SORT_INDEX");
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX >=", value,
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
                    "REPORT_DISPLAY_COLUMN.SORT_INDEX");
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX <", value,
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
                    "REPORT_DISPLAY_COLUMN.SORT_INDEX");
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX <=", value,
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
                    "REPORT_DISPLAY_COLUMN.SORT_INDEX");
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
                addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX in", values,
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
                addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX not in", values,
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
                return andSortIndexEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX in", values,
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
                addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX not in", values,
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
                return andSortIndexEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX in",
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
                addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX not in",
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX between", value1,
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX between", value1,
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX not between",
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
            addCriterion("REPORT_DISPLAY_COLUMN.SORT_INDEX not between",
                value1, value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_DISPLAY_COLUMN.STATUS is not null AND REPORT_DISPLAY_COLUMN.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_DISPLAY_COLUMN.STATUS is null OR REPORT_DISPLAY_COLUMN.STATUS = '')");

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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.STATUS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS <>", value, "status");

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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS is null OR REPORT_DISPLAY_COLUMN.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.STATUS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.STATUS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.STATUS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.STATUS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_DISPLAY_COLUMN.STATUS");
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS like",
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS not like",
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
                addCriterion("REPORT_DISPLAY_COLUMN.STATUS in", values, "status");

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
                addCriterion("REPORT_DISPLAY_COLUMN.STATUS not in", values,
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
                addCriterion("REPORT_DISPLAY_COLUMN.STATUS in",
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
                addCriterion("REPORT_DISPLAY_COLUMN.STATUS not in",
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS between", value1,
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
            addCriterion("REPORT_DISPLAY_COLUMN.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsNull() {
            addCriterion("reportViewFieldD.DATA_TYPE is null");

            return this;
        } // end andFieldDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsNotNull() {
            addCriterion("reportViewFieldD.DATA_TYPE is not null");

            return this;
        } // end andFieldDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsNotEmpty() {
            addCriterion(
                "reportViewFieldD.DATA_TYPE is not null AND reportViewFieldD.DATA_TYPE <> ''");

            return this;
        } // end andFieldDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsEmpty() {
            addCriterion(
                "(reportViewFieldD.DATA_TYPE is null OR reportViewFieldD.DATA_TYPE = '')");

            return this;
        } // end andFieldDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeEqualTo(String value) {
            addCriterion("reportViewFieldD.DATA_TYPE =", value, "fieldDataType");

            return this;
        } // end andFieldDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeNotEqualTo(String value) {
            addCriterion("reportViewFieldD.DATA_TYPE <>", value, "fieldDataType");

            return this;
        } // end andFieldDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeNotEqualToOrIsNull(String value) {
            addCriterion("reportViewFieldD.DATA_TYPE is null OR reportViewFieldD.DATA_TYPE <>",
                value, "fieldDataType");

            return this;
        } // end andFieldDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeGreaterThan(String value) {
            addCriterion("reportViewFieldD.DATA_TYPE >", value, "fieldDataType");

            return this;
        } // end andFieldDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewFieldD.DATA_TYPE >=", value, "fieldDataType");

            return this;
        } // end andFieldDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeLessThan(String value) {
            addCriterion("reportViewFieldD.DATA_TYPE <", value, "fieldDataType");

            return this;
        } // end andFieldDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeLessThanOrEqualTo(String value) {
            addCriterion("reportViewFieldD.DATA_TYPE <=", value, "fieldDataType");

            return this;
        } // end andFieldDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewFieldD.DATA_TYPE like", buffer.toString(),
                "fieldDataType");

            return this;
        } // end andFieldDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewFieldD.DATA_TYPE not like",
                buffer.toString(), "fieldDataType");

            return this;
        } // end andFieldDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIn(List values) {
            if (values.size() == 1) {
                return andFieldDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.DATA_TYPE in", values,
                    "fieldDataType");

                return this;
            } // end else
        } // end andFieldDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andFieldDataTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.DATA_TYPE not in", values,
                    "fieldDataType");

                return this;
            } // end else
        } // end andFieldDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andFieldDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.DATA_TYPE in",
                    Arrays.asList(values), "fieldDataType");

                return this;
            } // end else
        } // end andFieldDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.DATA_TYPE not in",
                    Arrays.asList(values), "fieldDataType");

                return this;
            } // end else
        } // end andFieldDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeBetween(String value1, String value2) {
            addCriterion("reportViewFieldD.DATA_TYPE between", value1, value2,
                "fieldDataType");

            return this;
        } // end andFieldDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeNotBetween(String value1, String value2) {
            addCriterion("reportViewFieldD.DATA_TYPE not between", value1,
                value2, "fieldDataType");

            return this;
        } // end andFieldDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNull() {
            addCriterion("reportViewFieldD.FIELD_ALIAS is null");

            return this;
        } // end andFieldAliasIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNotNull() {
            addCriterion("reportViewFieldD.FIELD_ALIAS is not null");

            return this;
        } // end andFieldAliasIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNotEmpty() {
            addCriterion(
                "reportViewFieldD.FIELD_ALIAS is not null AND reportViewFieldD.FIELD_ALIAS <> ''");

            return this;
        } // end andFieldAliasIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsEmpty() {
            addCriterion(
                "(reportViewFieldD.FIELD_ALIAS is null OR reportViewFieldD.FIELD_ALIAS = '')");

            return this;
        } // end andFieldAliasIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasEqualTo(String value) {
            addCriterion("reportViewFieldD.FIELD_ALIAS =", value, "fieldAlias");

            return this;
        } // end andFieldAliasEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_ALIAS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldAliasEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasNotEqualTo(String value) {
            addCriterion("reportViewFieldD.FIELD_ALIAS <>", value, "fieldAlias");

            return this;
        } // end andFieldAliasNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasNotEqualToOrIsNull(String value) {
            addCriterion("reportViewFieldD.FIELD_ALIAS is null OR reportViewFieldD.FIELD_ALIAS <>",
                value, "fieldAlias");

            return this;
        } // end andFieldAliasNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_ALIAS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldAliasNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasGreaterThan(String value) {
            addCriterion("reportViewFieldD.FIELD_ALIAS >", value, "fieldAlias");

            return this;
        } // end andFieldAliasGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_ALIAS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldAliasGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewFieldD.FIELD_ALIAS >=", value, "fieldAlias");

            return this;
        } // end andFieldAliasGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_ALIAS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldAliasGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasLessThan(String value) {
            addCriterion("reportViewFieldD.FIELD_ALIAS <", value, "fieldAlias");

            return this;
        } // end andFieldAliasLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_ALIAS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldAliasLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasLessThanOrEqualTo(String value) {
            addCriterion("reportViewFieldD.FIELD_ALIAS <=", value, "fieldAlias");

            return this;
        } // end andFieldAliasLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_ALIAS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldAliasLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewFieldD.FIELD_ALIAS like",
                buffer.toString(), "fieldAlias");

            return this;
        } // end andFieldAliasLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewFieldD.FIELD_ALIAS not like",
                buffer.toString(), "fieldAlias");

            return this;
        } // end andFieldAliasNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIn(List values) {
            if (values.size() == 1) {
                return andFieldAliasEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.FIELD_ALIAS in", values,
                    "fieldAlias");

                return this;
            } // end else
        } // end andFieldAliasIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasNotIn(List values) {
            if (values.size() == 1) {
                return andFieldAliasNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.FIELD_ALIAS not in", values,
                    "fieldAlias");

                return this;
            } // end else
        } // end andFieldAliasNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIn(Object[] values) {
            if (values.length == 1) {
                return andFieldAliasEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.FIELD_ALIAS in",
                    Arrays.asList(values), "fieldAlias");

                return this;
            } // end else
        } // end andFieldAliasIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldAliasNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.FIELD_ALIAS not in",
                    Arrays.asList(values), "fieldAlias");

                return this;
            } // end else
        } // end andFieldAliasNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasBetween(String value1, String value2) {
            addCriterion("reportViewFieldD.FIELD_ALIAS between", value1,
                value2, "fieldAlias");

            return this;
        } // end andFieldAliasBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasNotBetween(String value1, String value2) {
            addCriterion("reportViewFieldD.FIELD_ALIAS not between", value1,
                value2, "fieldAlias");

            return this;
        } // end andFieldAliasNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNull() {
            addCriterion("reportViewFieldD.FIELD_NAME is null");

            return this;
        } // end andFieldNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotNull() {
            addCriterion("reportViewFieldD.FIELD_NAME is not null");

            return this;
        } // end andFieldNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotEmpty() {
            addCriterion(
                "reportViewFieldD.FIELD_NAME is not null AND reportViewFieldD.FIELD_NAME <> ''");

            return this;
        } // end andFieldNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsEmpty() {
            addCriterion(
                "(reportViewFieldD.FIELD_NAME is null OR reportViewFieldD.FIELD_NAME = '')");

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
            addCriterion("reportViewFieldD.FIELD_NAME =", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_NAME");
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
            addCriterion("reportViewFieldD.FIELD_NAME <>", value, "fieldName");

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
            addCriterion("reportViewFieldD.FIELD_NAME is null OR reportViewFieldD.FIELD_NAME <>",
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
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_NAME");
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
            addCriterion("reportViewFieldD.FIELD_NAME >", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_NAME");
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
            addCriterion("reportViewFieldD.FIELD_NAME >=", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_NAME");
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
            addCriterion("reportViewFieldD.FIELD_NAME <", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_NAME");
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
            addCriterion("reportViewFieldD.FIELD_NAME <=", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldD.FIELD_NAME");
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
            addCriterion("reportViewFieldD.FIELD_NAME like", buffer.toString(),
                "fieldName");

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
            addCriterion("reportViewFieldD.FIELD_NAME not like",
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
                addCriterion("reportViewFieldD.FIELD_NAME in", values,
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
                addCriterion("reportViewFieldD.FIELD_NAME not in", values,
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
                addCriterion("reportViewFieldD.FIELD_NAME in",
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
                addCriterion("reportViewFieldD.FIELD_NAME not in",
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
            addCriterion("reportViewFieldD.FIELD_NAME between", value1, value2,
                "fieldName");

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
            addCriterion("reportViewFieldD.FIELD_NAME not between", value1,
                value2, "fieldName");

            return this;
        } // end andFieldNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthIsNull() {
            addCriterion("reportViewFieldD.WIDTH is null");

            return this;
        } // end andFieldWidthIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthIsNotNull() {
            addCriterion("reportViewFieldD.WIDTH is not null");

            return this;
        } // end andFieldWidthIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthIsNotEmpty() {
            addCriterion(
                "reportViewFieldD.WIDTH is not null AND reportViewFieldD.WIDTH <> ''");

            return this;
        } // end andFieldWidthIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthIsEmpty() {
            addCriterion(
                "(reportViewFieldD.WIDTH is null OR reportViewFieldD.WIDTH = '')");

            return this;
        } // end andFieldWidthIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthEqualTo(int value) {
            return andFieldWidthEqualTo(Integer.valueOf(value));
        } // end andFieldWidthEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthEqualTo(java.lang.Integer value) {
            addCriterion("reportViewFieldD.WIDTH =", value, "fieldWidth");

            return this;
        } // end andFieldWidthEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.WIDTH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldWidthEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotEqualTo(int value) {
            return andFieldWidthNotEqualTo(Integer.valueOf(value));
        } // end andFieldWidthNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotEqualTo(java.lang.Integer value) {
            addCriterion("reportViewFieldD.WIDTH <>", value, "fieldWidth");

            return this;
        } // end andFieldWidthNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotEqualToOrIsNull(int value) {
            return andFieldWidthNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andFieldWidthNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("reportViewFieldD.WIDTH is null OR reportViewFieldD.WIDTH <>",
                value, "fieldWidth");

            return this;
        } // end andFieldWidthNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.WIDTH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldWidthNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthGreaterThan(int value) {
            return andFieldWidthGreaterThan(Integer.valueOf(value));
        } // end andFieldWidthGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthGreaterThan(java.lang.Integer value) {
            addCriterion("reportViewFieldD.WIDTH >", value, "fieldWidth");

            return this;
        } // end andFieldWidthGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.WIDTH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldWidthGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthGreaterThanOrEqualTo(int value) {
            return andFieldWidthGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andFieldWidthGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("reportViewFieldD.WIDTH >=", value, "fieldWidth");

            return this;
        } // end andFieldWidthGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.WIDTH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldWidthGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthLessThan(int value) {
            return andFieldWidthLessThan(Integer.valueOf(value));
        } // end andFieldWidthLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthLessThan(java.lang.Integer value) {
            addCriterion("reportViewFieldD.WIDTH <", value, "fieldWidth");

            return this;
        } // end andFieldWidthLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.WIDTH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldWidthLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthLessThanOrEqualTo(int value) {
            return andFieldWidthLessThanOrEqualTo(Integer.valueOf(value));
        } // end andFieldWidthLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("reportViewFieldD.WIDTH <=", value, "fieldWidth");

            return this;
        } // end andFieldWidthLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.WIDTH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldWidthLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthIn(int[] values) {
            if (values.length == 1) {
                return andFieldWidthEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.WIDTH in", values, "fieldWidth");

                return this;
            } // end else
        } // end andFieldWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotIn(int[] values) {
            if (values.length == 1) {
                return andFieldWidthNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.WIDTH not in", values,
                    "fieldWidth");

                return this;
            } // end else
        } // end andFieldWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthIn(List values) {
            if (values.size() == 1) {
                return andFieldWidthEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.WIDTH in", values, "fieldWidth");

                return this;
            } // end else
        } // end andFieldWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotIn(List values) {
            if (values.size() == 1) {
                return andFieldWidthNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.WIDTH not in", values,
                    "fieldWidth");

                return this;
            } // end else
        } // end andFieldWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthIn(Object[] values) {
            if (values.length == 1) {
                return andFieldWidthEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.WIDTH in",
                    Arrays.asList(values), "fieldWidth");

                return this;
            } // end else
        } // end andFieldWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldWidthNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.WIDTH not in",
                    Arrays.asList(values), "fieldWidth");

                return this;
            } // end else
        } // end andFieldWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthBetween(int value1, int value2) {
            addCriterion("reportViewFieldD.WIDTH between", value1, value2,
                "fieldWidth");

            return this;
        } // end andFieldWidthBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("reportViewFieldD.WIDTH between", value1, value2,
                "fieldWidth");

            return this;
        } // end andFieldWidthBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotBetween(int value1, int value2) {
            addCriterion("reportViewFieldD.WIDTH not between", value1, value2,
                "fieldWidth");

            return this;
        } // end andFieldWidthNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldWidthNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("reportViewFieldD.WIDTH not between", value1, value2,
                "fieldWidth");

            return this;
        } // end andFieldWidthNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsNull() {
            addCriterion("reportViewFieldD.TITLE is null");

            return this;
        } // end andFieldTitleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsNotNull() {
            addCriterion("reportViewFieldD.TITLE is not null");

            return this;
        } // end andFieldTitleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsNotEmpty() {
            addCriterion(
                "reportViewFieldD.TITLE is not null AND reportViewFieldD.TITLE <> ''");

            return this;
        } // end andFieldTitleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsEmpty() {
            addCriterion(
                "(reportViewFieldD.TITLE is null OR reportViewFieldD.TITLE = '')");

            return this;
        } // end andFieldTitleIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleEqualTo(String value) {
            addCriterion("reportViewFieldD.TITLE =", value, "fieldTitle");

            return this;
        } // end andFieldTitleEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.TITLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTitleEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleNotEqualTo(String value) {
            addCriterion("reportViewFieldD.TITLE <>", value, "fieldTitle");

            return this;
        } // end andFieldTitleNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleNotEqualToOrIsNull(String value) {
            addCriterion("reportViewFieldD.TITLE is null OR reportViewFieldD.TITLE <>",
                value, "fieldTitle");

            return this;
        } // end andFieldTitleNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.TITLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTitleNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleGreaterThan(String value) {
            addCriterion("reportViewFieldD.TITLE >", value, "fieldTitle");

            return this;
        } // end andFieldTitleGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.TITLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTitleGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleGreaterThanOrEqualTo(String value) {
            addCriterion("reportViewFieldD.TITLE >=", value, "fieldTitle");

            return this;
        } // end andFieldTitleGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.TITLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTitleGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleLessThan(String value) {
            addCriterion("reportViewFieldD.TITLE <", value, "fieldTitle");

            return this;
        } // end andFieldTitleLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.TITLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTitleLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleLessThanOrEqualTo(String value) {
            addCriterion("reportViewFieldD.TITLE <=", value, "fieldTitle");

            return this;
        } // end andFieldTitleLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportViewFieldD.TITLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldTitleLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewFieldD.TITLE like", buffer.toString(),
                "fieldTitle");

            return this;
        } // end andFieldTitleLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportViewFieldD.TITLE not like", buffer.toString(),
                "fieldTitle");

            return this;
        } // end andFieldTitleNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIn(List values) {
            if (values.size() == 1) {
                return andFieldTitleEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.TITLE in", values, "fieldTitle");

                return this;
            } // end else
        } // end andFieldTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleNotIn(List values) {
            if (values.size() == 1) {
                return andFieldTitleNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportViewFieldD.TITLE not in", values,
                    "fieldTitle");

                return this;
            } // end else
        } // end andFieldTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIn(Object[] values) {
            if (values.length == 1) {
                return andFieldTitleEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.TITLE in",
                    Arrays.asList(values), "fieldTitle");

                return this;
            } // end else
        } // end andFieldTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldTitleNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldD.TITLE not in",
                    Arrays.asList(values), "fieldTitle");

                return this;
            } // end else
        } // end andFieldTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleBetween(String value1, String value2) {
            addCriterion("reportViewFieldD.TITLE between", value1, value2,
                "fieldTitle");

            return this;
        } // end andFieldTitleBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleNotBetween(String value1, String value2) {
            addCriterion("reportViewFieldD.TITLE not between", value1, value2,
                "fieldTitle");

            return this;
        } // end andFieldTitleNotBetween()
    } // end Criteria
} // end ReportDisplayColumnDAOQueryBean
