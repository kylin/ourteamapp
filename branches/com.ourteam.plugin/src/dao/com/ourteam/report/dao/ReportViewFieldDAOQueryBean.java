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
 * ReportViewField query bean 2011-09-27 11:37:59
 *
 * @author Auto Gen
 */
public class ReportViewFieldDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportViewFieldDAOQueryBean object.
     */
    public ReportViewFieldDAOQueryBean() {
        super();
    } // end ReportViewFieldDAOQueryBean()

    /**
     * Creates a new ReportViewFieldDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportViewFieldDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportViewFieldDAOQueryBean()

    /**
     * Creates a new ReportViewFieldDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportViewFieldDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportViewFieldDAOQueryBean()

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
            addSelectProperty(IReportViewFieldDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDataTypeSelectProperty() {
        addDataTypeSelectProperty("dataType");
    } // end addDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewFieldDAO.DataType, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.DataType, "dataType");
        } // end else
    } // end addDataTypeSelectProperty()

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
            addSelectProperty(IReportViewFieldDAO.FieldAlias, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.FieldAlias, "fieldAlias");
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
            addSelectProperty(IReportViewFieldDAO.FieldName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.FieldName, "fieldName");
        } // end else
    } // end addFieldNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addListSourceIdSelectProperty() {
        addListSourceIdSelectProperty("listSourceId");
    } // end addListSourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addListSourceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewFieldDAO.ListSourceId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.ListSourceId, "listSourceId");
        } // end else
    } // end addListSourceIdSelectProperty()

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
            addSelectProperty(IReportViewFieldDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.Remarks, "remarks");
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
            addSelectProperty(IReportViewFieldDAO.ReportViewId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.ReportViewId, "reportViewId");
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
            addSelectProperty(IReportViewFieldDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTitleSelectProperty() {
        addTitleSelectProperty("title");
    } // end addTitleSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTitleSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewFieldDAO.Title, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.Title, "title");
        } // end else
    } // end addTitleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWidthSelectProperty() {
        addWidthSelectProperty("width");
    } // end addWidthSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWidthSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewFieldDAO.Width, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.Width, "width");
        } // end else
    } // end addWidthSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addListSourceCodeSelectProperty() {
        addListSourceCodeSelectProperty("listSourceCode");
    } // end addListSourceCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addListSourceCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewFieldDAO.ListSourceCode, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.ListSourceCode,
                "listSourceCode");
        } // end else
    } // end addListSourceCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addListSourceNameSelectProperty() {
        addListSourceNameSelectProperty("listSourceName");
    } // end addListSourceNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addListSourceNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewFieldDAO.ListSourceName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.ListSourceName,
                "listSourceName");
        } // end else
    } // end addListSourceNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTableIdSelectProperty() {
        addTableIdSelectProperty("tableId");
    } // end addTableIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTableIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewFieldDAO.TableId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.TableId, "tableId");
        } // end else
    } // end addTableIdSelectProperty()

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
            addSelectProperty(IReportViewFieldDAO.TableName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.TableName, "tableName");
        } // end else
    } // end addTableNameSelectProperty()

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
            addSelectProperty(IReportViewFieldDAO.TableAlias, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewFieldDAO.TableAlias, "tableAlias");
        } // end else
    } // end addTableAliasSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDataTypeSelectProperty();

        addFieldAliasSelectProperty();

        addFieldNameSelectProperty();

        addListSourceIdSelectProperty();

        addRemarksSelectProperty();

        addReportViewIdSelectProperty();

        addStatusSelectProperty();

        addTitleSelectProperty();

        addWidthSelectProperty();

        addListSourceCodeSelectProperty();

        addListSourceNameSelectProperty();

        addTableIdSelectProperty();

        addTableNameSelectProperty();

        addTableAliasSelectProperty();
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
            addCriterion("REPORT_VIEW_FIELD.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.ID is not null AND REPORT_VIEW_FIELD.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.ID is null OR REPORT_VIEW_FIELD.ID = '')");

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
            addCriterion("REPORT_VIEW_FIELD.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.ID");
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
            addCriterion("REPORT_VIEW_FIELD.ID <>", value, "id");

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
            addCriterion("REPORT_VIEW_FIELD.ID is null OR REPORT_VIEW_FIELD.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.ID");
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
            addCriterion("REPORT_VIEW_FIELD.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.ID");
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
            addCriterion("REPORT_VIEW_FIELD.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.ID");
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
            addCriterion("REPORT_VIEW_FIELD.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.ID");
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
            addCriterion("REPORT_VIEW_FIELD.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.ID");
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
                addCriterion("REPORT_VIEW_FIELD.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_FIELD.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_FIELD.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_FIELD.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_FIELD.ID in", Arrays.asList(values),
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
                addCriterion("REPORT_VIEW_FIELD.ID not in",
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
            addCriterion("REPORT_VIEW_FIELD.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_FIELD.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_FIELD.ID not between", value1, value2,
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
            addCriterion("REPORT_VIEW_FIELD.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNull() {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE is null");

            return this;
        } // end andDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE is not null");

            return this;
        } // end andDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.DATA_TYPE is not null AND REPORT_VIEW_FIELD.DATA_TYPE <> ''");

            return this;
        } // end andDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.DATA_TYPE is null OR REPORT_VIEW_FIELD.DATA_TYPE = '')");

            return this;
        } // end andDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE =", value, "dataType");

            return this;
        } // end andDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE <>", value, "dataType");

            return this;
        } // end andDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE is null OR REPORT_VIEW_FIELD.DATA_TYPE <>",
                value, "dataType");

            return this;
        } // end andDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE >", value, "dataType");

            return this;
        } // end andDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE >=", value, "dataType");

            return this;
        } // end andDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThan(String value) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE <", value, "dataType");

            return this;
        } // end andDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE <=", value, "dataType");

            return this;
        } // end andDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE like", buffer.toString(),
                "dataType");

            return this;
        } // end andDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE not like",
                buffer.toString(), "dataType");

            return this;
        } // end andDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIn(List values) {
            if (values.size() == 1) {
                return andDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.DATA_TYPE in", values,
                    "dataType");

                return this;
            } // end else
        } // end andDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andDataTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.DATA_TYPE not in", values,
                    "dataType");

                return this;
            } // end else
        } // end andDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.DATA_TYPE in",
                    Arrays.asList(values), "dataType");

                return this;
            } // end else
        } // end andDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.DATA_TYPE not in",
                    Arrays.asList(values), "dataType");

                return this;
            } // end else
        } // end andDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE between", value1, value2,
                "dataType");

            return this;
        } // end andDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_FIELD.DATA_TYPE not between", value1,
                value2, "dataType");

            return this;
        } // end andDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNull() {
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS is null");

            return this;
        } // end andFieldAliasIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS is not null");

            return this;
        } // end andFieldAliasIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.FIELD_ALIAS is not null AND REPORT_VIEW_FIELD.FIELD_ALIAS <> ''");

            return this;
        } // end andFieldAliasIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.FIELD_ALIAS is null OR REPORT_VIEW_FIELD.FIELD_ALIAS = '')");

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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS =", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_ALIAS");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS <>", value, "fieldAlias");

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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS is null OR REPORT_VIEW_FIELD.FIELD_ALIAS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_ALIAS");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS >", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_ALIAS");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS >=", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_ALIAS");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS <", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_ALIAS");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS <=", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_ALIAS");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS like",
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS not like",
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS in", values,
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS not in", values,
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS in",
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS not in",
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS between", value1,
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_ALIAS not between", value1,
                value2, "fieldAlias");

            return this;
        } // end andFieldAliasNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNull() {
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME is null");

            return this;
        } // end andFieldNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME is not null");

            return this;
        } // end andFieldNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.FIELD_NAME is not null AND REPORT_VIEW_FIELD.FIELD_NAME <> ''");

            return this;
        } // end andFieldNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.FIELD_NAME is null OR REPORT_VIEW_FIELD.FIELD_NAME = '')");

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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME =", value, "fieldName");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_NAME");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME <>", value, "fieldName");

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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME is null OR REPORT_VIEW_FIELD.FIELD_NAME <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_NAME");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME >", value, "fieldName");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_NAME");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME >=", value, "fieldName");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_NAME");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME <", value, "fieldName");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_NAME");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME <=", value, "fieldName");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.FIELD_NAME");
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME like",
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME not like",
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_NAME in", values,
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_NAME not in", values,
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_NAME in",
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
                addCriterion("REPORT_VIEW_FIELD.FIELD_NAME not in",
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME between", value1,
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
            addCriterion("REPORT_VIEW_FIELD.FIELD_NAME not between", value1,
                value2, "fieldName");

            return this;
        } // end andFieldNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdIsNull() {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID is null");

            return this;
        } // end andListSourceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID is not null");

            return this;
        } // end andListSourceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.LIST_SOURCE_ID is not null AND REPORT_VIEW_FIELD.LIST_SOURCE_ID <> ''");

            return this;
        } // end andListSourceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.LIST_SOURCE_ID is null OR REPORT_VIEW_FIELD.LIST_SOURCE_ID = '')");

            return this;
        } // end andListSourceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdEqualTo(long value) {
            return andListSourceIdEqualTo(Long.valueOf(value));
        } // end andListSourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID =", value,
                "listSourceId");

            return this;
        } // end andListSourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_FIELD.LIST_SOURCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotEqualTo(long value) {
            return andListSourceIdNotEqualTo(Long.valueOf(value));
        } // end andListSourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID <>", value,
                "listSourceId");

            return this;
        } // end andListSourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotEqualToOrIsNull(long value) {
            return andListSourceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andListSourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID is null OR REPORT_VIEW_FIELD.LIST_SOURCE_ID <>",
                value, "listSourceId");

            return this;
        } // end andListSourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_FIELD.LIST_SOURCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdGreaterThan(long value) {
            return andListSourceIdGreaterThan(Long.valueOf(value));
        } // end andListSourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdGreaterThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID >", value,
                "listSourceId");

            return this;
        } // end andListSourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_FIELD.LIST_SOURCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdGreaterThanOrEqualTo(long value) {
            return andListSourceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andListSourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID >=", value,
                "listSourceId");

            return this;
        } // end andListSourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_FIELD.LIST_SOURCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdLessThan(long value) {
            return andListSourceIdLessThan(Long.valueOf(value));
        } // end andListSourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdLessThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID <", value,
                "listSourceId");

            return this;
        } // end andListSourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_FIELD.LIST_SOURCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdLessThanOrEqualTo(long value) {
            return andListSourceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andListSourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID <=", value,
                "listSourceId");

            return this;
        } // end andListSourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_FIELD.LIST_SOURCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdIn(long[] values) {
            if (values.length == 1) {
                return andListSourceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID in", values,
                    "listSourceId");

                return this;
            } // end else
        } // end andListSourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andListSourceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID not in", values,
                    "listSourceId");

                return this;
            } // end else
        } // end andListSourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdIn(List values) {
            if (values.size() == 1) {
                return andListSourceIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID in", values,
                    "listSourceId");

                return this;
            } // end else
        } // end andListSourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotIn(List values) {
            if (values.size() == 1) {
                return andListSourceIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID not in", values,
                    "listSourceId");

                return this;
            } // end else
        } // end andListSourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdIn(Object[] values) {
            if (values.length == 1) {
                return andListSourceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID in",
                    Arrays.asList(values), "listSourceId");

                return this;
            } // end else
        } // end andListSourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andListSourceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID not in",
                    Arrays.asList(values), "listSourceId");

                return this;
            } // end else
        } // end andListSourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID between", value1,
                value2, "listSourceId");

            return this;
        } // end andListSourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID between", value1,
                value2, "listSourceId");

            return this;
        } // end andListSourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID not between",
                value1, value2, "listSourceId");

            return this;
        } // end andListSourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_FIELD.LIST_SOURCE_ID not between",
                value1, value2, "listSourceId");

            return this;
        } // end andListSourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_VIEW_FIELD.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.REMARKS is not null AND REPORT_VIEW_FIELD.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.REMARKS is null OR REPORT_VIEW_FIELD.REMARKS = '')");

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
            addCriterion("REPORT_VIEW_FIELD.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.REMARKS");
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_VIEW_FIELD.REMARKS is null OR REPORT_VIEW_FIELD.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.REMARKS");
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.REMARKS");
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.REMARKS");
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.REMARKS");
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.REMARKS");
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS like", buffer.toString(),
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS not like",
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
                addCriterion("REPORT_VIEW_FIELD.REMARKS in", values, "remarks");

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
                addCriterion("REPORT_VIEW_FIELD.REMARKS not in", values,
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
                addCriterion("REPORT_VIEW_FIELD.REMARKS in",
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
                addCriterion("REPORT_VIEW_FIELD.REMARKS not in",
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS between", value1, value2,
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
            addCriterion("REPORT_VIEW_FIELD.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNull() {
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID is null");

            return this;
        } // end andReportViewIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID is not null");

            return this;
        } // end andReportViewIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.REPORT_VIEW_ID is not null AND REPORT_VIEW_FIELD.REPORT_VIEW_ID <> ''");

            return this;
        } // end andReportViewIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.REPORT_VIEW_ID is null OR REPORT_VIEW_FIELD.REPORT_VIEW_ID = '')");

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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID =", value,
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
                    "REPORT_VIEW_FIELD.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID <>", value,
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID is null OR REPORT_VIEW_FIELD.REPORT_VIEW_ID <>",
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
                    "REPORT_VIEW_FIELD.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID >", value,
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
                    "REPORT_VIEW_FIELD.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID >=", value,
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
                    "REPORT_VIEW_FIELD.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID <", value,
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
                    "REPORT_VIEW_FIELD.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID <=", value,
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
                    "REPORT_VIEW_FIELD.REPORT_VIEW_ID");
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
                addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID in", values,
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
                addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID not in", values,
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
                addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID in", values,
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
                addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID not in", values,
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
                addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID in",
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
                addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID not in",
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID between", value1,
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID between", value1,
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID not between",
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
            addCriterion("REPORT_VIEW_FIELD.REPORT_VIEW_ID not between",
                value1, value2, "reportViewId");

            return this;
        } // end andReportViewIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_VIEW_FIELD.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.STATUS is not null AND REPORT_VIEW_FIELD.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.STATUS is null OR REPORT_VIEW_FIELD.STATUS = '')");

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
            addCriterion("REPORT_VIEW_FIELD.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.STATUS");
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
            addCriterion("REPORT_VIEW_FIELD.STATUS <>", value, "status");

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
            addCriterion("REPORT_VIEW_FIELD.STATUS is null OR REPORT_VIEW_FIELD.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.STATUS");
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
            addCriterion("REPORT_VIEW_FIELD.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.STATUS");
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
            addCriterion("REPORT_VIEW_FIELD.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.STATUS");
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
            addCriterion("REPORT_VIEW_FIELD.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.STATUS");
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
            addCriterion("REPORT_VIEW_FIELD.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.STATUS");
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
            addCriterion("REPORT_VIEW_FIELD.STATUS like", buffer.toString(),
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
            addCriterion("REPORT_VIEW_FIELD.STATUS not like",
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
                addCriterion("REPORT_VIEW_FIELD.STATUS in", values, "status");

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
                addCriterion("REPORT_VIEW_FIELD.STATUS not in", values, "status");

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
                addCriterion("REPORT_VIEW_FIELD.STATUS in",
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
                addCriterion("REPORT_VIEW_FIELD.STATUS not in",
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
            addCriterion("REPORT_VIEW_FIELD.STATUS between", value1, value2,
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
            addCriterion("REPORT_VIEW_FIELD.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleIsNull() {
            addCriterion("REPORT_VIEW_FIELD.TITLE is null");

            return this;
        } // end andTitleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.TITLE is not null");

            return this;
        } // end andTitleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.TITLE is not null AND REPORT_VIEW_FIELD.TITLE <> ''");

            return this;
        } // end andTitleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.TITLE is null OR REPORT_VIEW_FIELD.TITLE = '')");

            return this;
        } // end andTitleIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.TITLE =", value, "title");

            return this;
        } // end andTitleEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TITLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTitleEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.TITLE <>", value, "title");

            return this;
        } // end andTitleNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_VIEW_FIELD.TITLE is null OR REPORT_VIEW_FIELD.TITLE <>",
                value, "title");

            return this;
        } // end andTitleNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TITLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTitleNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleGreaterThan(String value) {
            addCriterion("REPORT_VIEW_FIELD.TITLE >", value, "title");

            return this;
        } // end andTitleGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TITLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTitleGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.TITLE >=", value, "title");

            return this;
        } // end andTitleGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TITLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTitleGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleLessThan(String value) {
            addCriterion("REPORT_VIEW_FIELD.TITLE <", value, "title");

            return this;
        } // end andTitleLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TITLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTitleLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("REPORT_VIEW_FIELD.TITLE <=", value, "title");

            return this;
        } // end andTitleLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TITLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTitleLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_FIELD.TITLE like", buffer.toString(),
                "title");

            return this;
        } // end andTitleLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_VIEW_FIELD.TITLE not like", buffer.toString(),
                "title");

            return this;
        } // end andTitleNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleIn(List values) {
            if (values.size() == 1) {
                return andTitleEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TITLE in", values, "title");

                return this;
            } // end else
        } // end andTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleNotIn(List values) {
            if (values.size() == 1) {
                return andTitleNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TITLE not in", values, "title");

                return this;
            } // end else
        } // end andTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleIn(Object[] values) {
            if (values.length == 1) {
                return andTitleEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TITLE in",
                    Arrays.asList(values), "title");

                return this;
            } // end else
        } // end andTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleNotIn(Object[] values) {
            if (values.length == 1) {
                return andTitleNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TITLE not in",
                    Arrays.asList(values), "title");

                return this;
            } // end else
        } // end andTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_FIELD.TITLE between", value1, value2,
                "title");

            return this;
        } // end andTitleBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("REPORT_VIEW_FIELD.TITLE not between", value1, value2,
                "title");

            return this;
        } // end andTitleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthIsNull() {
            addCriterion("REPORT_VIEW_FIELD.WIDTH is null");

            return this;
        } // end andWidthIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.WIDTH is not null");

            return this;
        } // end andWidthIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.WIDTH is not null AND REPORT_VIEW_FIELD.WIDTH <> ''");

            return this;
        } // end andWidthIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.WIDTH is null OR REPORT_VIEW_FIELD.WIDTH = '')");

            return this;
        } // end andWidthIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthEqualTo(int value) {
            return andWidthEqualTo(Integer.valueOf(value));
        } // end andWidthEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthEqualTo(java.lang.Integer value) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH =", value, "width");

            return this;
        } // end andWidthEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.WIDTH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWidthEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotEqualTo(int value) {
            return andWidthNotEqualTo(Integer.valueOf(value));
        } // end andWidthNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotEqualTo(java.lang.Integer value) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH <>", value, "width");

            return this;
        } // end andWidthNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotEqualToOrIsNull(int value) {
            return andWidthNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andWidthNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH is null OR REPORT_VIEW_FIELD.WIDTH <>",
                value, "width");

            return this;
        } // end andWidthNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.WIDTH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWidthNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthGreaterThan(int value) {
            return andWidthGreaterThan(Integer.valueOf(value));
        } // end andWidthGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthGreaterThan(java.lang.Integer value) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH >", value, "width");

            return this;
        } // end andWidthGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.WIDTH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWidthGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthGreaterThanOrEqualTo(int value) {
            return andWidthGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andWidthGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH >=", value, "width");

            return this;
        } // end andWidthGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.WIDTH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWidthGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthLessThan(int value) {
            return andWidthLessThan(Integer.valueOf(value));
        } // end andWidthLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthLessThan(java.lang.Integer value) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH <", value, "width");

            return this;
        } // end andWidthLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.WIDTH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWidthLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthLessThanOrEqualTo(int value) {
            return andWidthLessThanOrEqualTo(Integer.valueOf(value));
        } // end andWidthLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH <=", value, "width");

            return this;
        } // end andWidthLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.WIDTH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWidthLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthIn(int[] values) {
            if (values.length == 1) {
                return andWidthEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.WIDTH in", values, "width");

                return this;
            } // end else
        } // end andWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotIn(int[] values) {
            if (values.length == 1) {
                return andWidthNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.WIDTH not in", values, "width");

                return this;
            } // end else
        } // end andWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthIn(List values) {
            if (values.size() == 1) {
                return andWidthEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.WIDTH in", values, "width");

                return this;
            } // end else
        } // end andWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotIn(List values) {
            if (values.size() == 1) {
                return andWidthNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.WIDTH not in", values, "width");

                return this;
            } // end else
        } // end andWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthIn(Object[] values) {
            if (values.length == 1) {
                return andWidthEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.WIDTH in",
                    Arrays.asList(values), "width");

                return this;
            } // end else
        } // end andWidthIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotIn(Object[] values) {
            if (values.length == 1) {
                return andWidthNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.WIDTH not in",
                    Arrays.asList(values), "width");

                return this;
            } // end else
        } // end andWidthNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthBetween(int value1, int value2) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH between", value1, value2,
                "width");

            return this;
        } // end andWidthBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH between", value1, value2,
                "width");

            return this;
        } // end andWidthBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotBetween(int value1, int value2) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH not between", value1, value2,
                "width");

            return this;
        } // end andWidthNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWidthNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("REPORT_VIEW_FIELD.WIDTH not between", value1, value2,
                "width");

            return this;
        } // end andWidthNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeIsNull() {
            addCriterion("reportListSourceB.CODE is null");

            return this;
        } // end andListSourceCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeIsNotNull() {
            addCriterion("reportListSourceB.CODE is not null");

            return this;
        } // end andListSourceCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeIsNotEmpty() {
            addCriterion(
                "reportListSourceB.CODE is not null AND reportListSourceB.CODE <> ''");

            return this;
        } // end andListSourceCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeIsEmpty() {
            addCriterion(
                "(reportListSourceB.CODE is null OR reportListSourceB.CODE = '')");

            return this;
        } // end andListSourceCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeEqualTo(String value) {
            addCriterion("reportListSourceB.CODE =", value, "listSourceCode");

            return this;
        } // end andListSourceCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeNotEqualTo(String value) {
            addCriterion("reportListSourceB.CODE <>", value, "listSourceCode");

            return this;
        } // end andListSourceCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeNotEqualToOrIsNull(String value) {
            addCriterion("reportListSourceB.CODE is null OR reportListSourceB.CODE <>",
                value, "listSourceCode");

            return this;
        } // end andListSourceCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeGreaterThan(String value) {
            addCriterion("reportListSourceB.CODE >", value, "listSourceCode");

            return this;
        } // end andListSourceCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reportListSourceB.CODE >=", value, "listSourceCode");

            return this;
        } // end andListSourceCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeLessThan(String value) {
            addCriterion("reportListSourceB.CODE <", value, "listSourceCode");

            return this;
        } // end andListSourceCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeLessThanOrEqualTo(String value) {
            addCriterion("reportListSourceB.CODE <=", value, "listSourceCode");

            return this;
        } // end andListSourceCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportListSourceB.CODE like", buffer.toString(),
                "listSourceCode");

            return this;
        } // end andListSourceCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportListSourceB.CODE not like", buffer.toString(),
                "listSourceCode");

            return this;
        } // end andListSourceCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeIn(List values) {
            if (values.size() == 1) {
                return andListSourceCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportListSourceB.CODE in", values,
                    "listSourceCode");

                return this;
            } // end else
        } // end andListSourceCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeNotIn(List values) {
            if (values.size() == 1) {
                return andListSourceCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportListSourceB.CODE not in", values,
                    "listSourceCode");

                return this;
            } // end else
        } // end andListSourceCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeIn(Object[] values) {
            if (values.length == 1) {
                return andListSourceCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportListSourceB.CODE in",
                    Arrays.asList(values), "listSourceCode");

                return this;
            } // end else
        } // end andListSourceCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andListSourceCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportListSourceB.CODE not in",
                    Arrays.asList(values), "listSourceCode");

                return this;
            } // end else
        } // end andListSourceCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeBetween(String value1, String value2) {
            addCriterion("reportListSourceB.CODE between", value1, value2,
                "listSourceCode");

            return this;
        } // end andListSourceCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceCodeNotBetween(String value1, String value2) {
            addCriterion("reportListSourceB.CODE not between", value1, value2,
                "listSourceCode");

            return this;
        } // end andListSourceCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameIsNull() {
            addCriterion("reportListSourceB.NAME is null");

            return this;
        } // end andListSourceNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameIsNotNull() {
            addCriterion("reportListSourceB.NAME is not null");

            return this;
        } // end andListSourceNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameIsNotEmpty() {
            addCriterion(
                "reportListSourceB.NAME is not null AND reportListSourceB.NAME <> ''");

            return this;
        } // end andListSourceNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameIsEmpty() {
            addCriterion(
                "(reportListSourceB.NAME is null OR reportListSourceB.NAME = '')");

            return this;
        } // end andListSourceNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameEqualTo(String value) {
            addCriterion("reportListSourceB.NAME =", value, "listSourceName");

            return this;
        } // end andListSourceNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameNotEqualTo(String value) {
            addCriterion("reportListSourceB.NAME <>", value, "listSourceName");

            return this;
        } // end andListSourceNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameNotEqualToOrIsNull(String value) {
            addCriterion("reportListSourceB.NAME is null OR reportListSourceB.NAME <>",
                value, "listSourceName");

            return this;
        } // end andListSourceNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameGreaterThan(String value) {
            addCriterion("reportListSourceB.NAME >", value, "listSourceName");

            return this;
        } // end andListSourceNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("reportListSourceB.NAME >=", value, "listSourceName");

            return this;
        } // end andListSourceNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameLessThan(String value) {
            addCriterion("reportListSourceB.NAME <", value, "listSourceName");

            return this;
        } // end andListSourceNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameLessThanOrEqualTo(String value) {
            addCriterion("reportListSourceB.NAME <=", value, "listSourceName");

            return this;
        } // end andListSourceNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("reportListSourceB.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andListSourceNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportListSourceB.NAME like", buffer.toString(),
                "listSourceName");

            return this;
        } // end andListSourceNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("reportListSourceB.NAME not like", buffer.toString(),
                "listSourceName");

            return this;
        } // end andListSourceNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameIn(List values) {
            if (values.size() == 1) {
                return andListSourceNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportListSourceB.NAME in", values,
                    "listSourceName");

                return this;
            } // end else
        } // end andListSourceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameNotIn(List values) {
            if (values.size() == 1) {
                return andListSourceNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("reportListSourceB.NAME not in", values,
                    "listSourceName");

                return this;
            } // end else
        } // end andListSourceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameIn(Object[] values) {
            if (values.length == 1) {
                return andListSourceNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportListSourceB.NAME in",
                    Arrays.asList(values), "listSourceName");

                return this;
            } // end else
        } // end andListSourceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andListSourceNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("reportListSourceB.NAME not in",
                    Arrays.asList(values), "listSourceName");

                return this;
            } // end else
        } // end andListSourceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameBetween(String value1, String value2) {
            addCriterion("reportListSourceB.NAME between", value1, value2,
                "listSourceName");

            return this;
        } // end andListSourceNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andListSourceNameNotBetween(String value1, String value2) {
            addCriterion("reportListSourceB.NAME not between", value1, value2,
                "listSourceName");

            return this;
        } // end andListSourceNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdIsNull() {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID is null");

            return this;
        } // end andTableIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdIsNotNull() {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID is not null");

            return this;
        } // end andTableIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_FIELD.TABLE_ID is not null AND REPORT_VIEW_FIELD.TABLE_ID <> ''");

            return this;
        } // end andTableIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_FIELD.TABLE_ID is null OR REPORT_VIEW_FIELD.TABLE_ID = '')");

            return this;
        } // end andTableIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdEqualTo(long value) {
            return andTableIdEqualTo(Long.valueOf(value));
        } // end andTableIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID =", value, "tableId");

            return this;
        } // end andTableIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TABLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotEqualTo(long value) {
            return andTableIdNotEqualTo(Long.valueOf(value));
        } // end andTableIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID <>", value, "tableId");

            return this;
        } // end andTableIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotEqualToOrIsNull(long value) {
            return andTableIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTableIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID is null OR REPORT_VIEW_FIELD.TABLE_ID <>",
                value, "tableId");

            return this;
        } // end andTableIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TABLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdGreaterThan(long value) {
            return andTableIdGreaterThan(Long.valueOf(value));
        } // end andTableIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdGreaterThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID >", value, "tableId");

            return this;
        } // end andTableIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TABLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdGreaterThanOrEqualTo(long value) {
            return andTableIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTableIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID >=", value, "tableId");

            return this;
        } // end andTableIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TABLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdLessThan(long value) {
            return andTableIdLessThan(Long.valueOf(value));
        } // end andTableIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdLessThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID <", value, "tableId");

            return this;
        } // end andTableIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TABLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdLessThanOrEqualTo(long value) {
            return andTableIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTableIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID <=", value, "tableId");

            return this;
        } // end andTableIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_VIEW_FIELD.TABLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdIn(long[] values) {
            if (values.length == 1) {
                return andTableIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TABLE_ID in", values, "tableId");

                return this;
            } // end else
        } // end andTableIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTableIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TABLE_ID not in", values,
                    "tableId");

                return this;
            } // end else
        } // end andTableIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdIn(List values) {
            if (values.size() == 1) {
                return andTableIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TABLE_ID in", values, "tableId");

                return this;
            } // end else
        } // end andTableIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotIn(List values) {
            if (values.size() == 1) {
                return andTableIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TABLE_ID not in", values,
                    "tableId");

                return this;
            } // end else
        } // end andTableIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdIn(Object[] values) {
            if (values.length == 1) {
                return andTableIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TABLE_ID in",
                    Arrays.asList(values), "tableId");

                return this;
            } // end else
        } // end andTableIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTableIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_FIELD.TABLE_ID not in",
                    Arrays.asList(values), "tableId");

                return this;
            } // end else
        } // end andTableIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID between", value1, value2,
                "tableId");

            return this;
        } // end andTableIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID between", value1, value2,
                "tableId");

            return this;
        } // end andTableIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID not between", value1,
                value2, "tableId");

            return this;
        } // end andTableIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_FIELD.TABLE_ID not between", value1,
                value2, "tableId");

            return this;
        } // end andTableIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNull() {
            addCriterion("reportViewTableB.TABLE_NAME is null");

            return this;
        } // end andTableNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNotNull() {
            addCriterion("reportViewTableB.TABLE_NAME is not null");

            return this;
        } // end andTableNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNotEmpty() {
            addCriterion(
                "reportViewTableB.TABLE_NAME is not null AND reportViewTableB.TABLE_NAME <> ''");

            return this;
        } // end andTableNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsEmpty() {
            addCriterion(
                "(reportViewTableB.TABLE_NAME is null OR reportViewTableB.TABLE_NAME = '')");

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
            addCriterion("reportViewTableB.TABLE_NAME =", value, "tableName");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_NAME");
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
            addCriterion("reportViewTableB.TABLE_NAME <>", value, "tableName");

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
            addCriterion("reportViewTableB.TABLE_NAME is null OR reportViewTableB.TABLE_NAME <>",
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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_NAME");
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
            addCriterion("reportViewTableB.TABLE_NAME >", value, "tableName");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_NAME");
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
            addCriterion("reportViewTableB.TABLE_NAME >=", value, "tableName");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_NAME");
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
            addCriterion("reportViewTableB.TABLE_NAME <", value, "tableName");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_NAME");
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
            addCriterion("reportViewTableB.TABLE_NAME <=", value, "tableName");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_NAME");
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
            addCriterion("reportViewTableB.TABLE_NAME like", buffer.toString(),
                "tableName");

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
            addCriterion("reportViewTableB.TABLE_NAME not like",
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
                addCriterion("reportViewTableB.TABLE_NAME in", values,
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
                addCriterion("reportViewTableB.TABLE_NAME not in", values,
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
                addCriterion("reportViewTableB.TABLE_NAME in",
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
                addCriterion("reportViewTableB.TABLE_NAME not in",
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
            addCriterion("reportViewTableB.TABLE_NAME between", value1, value2,
                "tableName");

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
            addCriterion("reportViewTableB.TABLE_NAME not between", value1,
                value2, "tableName");

            return this;
        } // end andTableNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsNull() {
            addCriterion("reportViewTableB.TABLE_ALIAS is null");

            return this;
        } // end andTableAliasIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsNotNull() {
            addCriterion("reportViewTableB.TABLE_ALIAS is not null");

            return this;
        } // end andTableAliasIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsNotEmpty() {
            addCriterion(
                "reportViewTableB.TABLE_ALIAS is not null AND reportViewTableB.TABLE_ALIAS <> ''");

            return this;
        } // end andTableAliasIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableAliasIsEmpty() {
            addCriterion(
                "(reportViewTableB.TABLE_ALIAS is null OR reportViewTableB.TABLE_ALIAS = '')");

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
            addCriterion("reportViewTableB.TABLE_ALIAS =", value, "tableAlias");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_ALIAS");
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
            addCriterion("reportViewTableB.TABLE_ALIAS <>", value, "tableAlias");

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
            addCriterion("reportViewTableB.TABLE_ALIAS is null OR reportViewTableB.TABLE_ALIAS <>",
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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_ALIAS");
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
            addCriterion("reportViewTableB.TABLE_ALIAS >", value, "tableAlias");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_ALIAS");
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
            addCriterion("reportViewTableB.TABLE_ALIAS >=", value, "tableAlias");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_ALIAS");
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
            addCriterion("reportViewTableB.TABLE_ALIAS <", value, "tableAlias");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_ALIAS");
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
            addCriterion("reportViewTableB.TABLE_ALIAS <=", value, "tableAlias");

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
            StringBuffer str = new StringBuffer("reportViewTableB.TABLE_ALIAS");
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
            addCriterion("reportViewTableB.TABLE_ALIAS like",
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
            addCriterion("reportViewTableB.TABLE_ALIAS not like",
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
                addCriterion("reportViewTableB.TABLE_ALIAS in", values,
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
                addCriterion("reportViewTableB.TABLE_ALIAS not in", values,
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
                addCriterion("reportViewTableB.TABLE_ALIAS in",
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
                addCriterion("reportViewTableB.TABLE_ALIAS not in",
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
            addCriterion("reportViewTableB.TABLE_ALIAS between", value1,
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
            addCriterion("reportViewTableB.TABLE_ALIAS not between", value1,
                value2, "tableAlias");

            return this;
        } // end andTableAliasNotBetween()
    } // end Criteria
} // end ReportViewFieldDAOQueryBean
