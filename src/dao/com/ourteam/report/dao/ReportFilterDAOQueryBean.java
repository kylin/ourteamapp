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
 * ReportFilter query bean 2011-09-27 11:37:54
 *
 * @author Auto Gen
 */
public class ReportFilterDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportFilterDAOQueryBean object.
     */
    public ReportFilterDAOQueryBean() {
        super();
    } // end ReportFilterDAOQueryBean()

    /**
     * Creates a new ReportFilterDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportFilterDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportFilterDAOQueryBean()

    /**
     * Creates a new ReportFilterDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportFilterDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportFilterDAOQueryBean()

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
            addSelectProperty(IReportFilterDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConnectionSelectProperty() {
        addConnectionSelectProperty("connection");
    } // end addConnectionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConnectionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportFilterDAO.Connection, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.Connection, "connection");
        } // end else
    } // end addConnectionSelectProperty()

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
            addSelectProperty(IReportFilterDAO.FieldId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.FieldId, "fieldId");
        } // end else
    } // end addFieldIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLeftSymbolSelectProperty() {
        addLeftSymbolSelectProperty("leftSymbol");
    } // end addLeftSymbolSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLeftSymbolSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportFilterDAO.LeftSymbol, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.LeftSymbol, "leftSymbol");
        } // end else
    } // end addLeftSymbolSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addOperationSelectProperty() {
        addOperationSelectProperty("operation");
    } // end addOperationSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addOperationSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportFilterDAO.Operation, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.Operation, "operation");
        } // end else
    } // end addOperationSelectProperty()

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
            addSelectProperty(IReportFilterDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.Remarks, "remarks");
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
            addSelectProperty(IReportFilterDAO.ReportInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.ReportInstanceId,
                "reportInstanceId");
        } // end else
    } // end addReportInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRightSymbolSelectProperty() {
        addRightSymbolSelectProperty("rightSymbol");
    } // end addRightSymbolSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRightSymbolSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportFilterDAO.RightSymbol, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.RightSymbol, "rightSymbol");
        } // end else
    } // end addRightSymbolSelectProperty()

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
            addSelectProperty(IReportFilterDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addValueSelectProperty() {
        addValueSelectProperty("value");
    } // end addValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportFilterDAO.Value, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.Value, "value");
        } // end else
    } // end addValueSelectProperty()

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
            addSelectProperty(IReportFilterDAO.FieldDataType, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.FieldDataType, "fieldDataType");
        } // end else
    } // end addFieldDataTypeSelectProperty()

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
            addSelectProperty(IReportFilterDAO.FieldName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.FieldName, "fieldName");
        } // end else
    } // end addFieldNameSelectProperty()

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
            addSelectProperty(IReportFilterDAO.FieldAlias, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.FieldAlias, "fieldAlias");
        } // end else
    } // end addFieldAliasSelectProperty()

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
            addSelectProperty(IReportFilterDAO.FieldTitle, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.FieldTitle, "fieldTitle");
        } // end else
    } // end addFieldTitleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldListSourceIdSelectProperty() {
        addFieldListSourceIdSelectProperty("fieldListSourceId");
    } // end addFieldListSourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldListSourceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportFilterDAO.FieldListSourceId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportFilterDAO.FieldListSourceId,
                "fieldListSourceId");
        } // end else
    } // end addFieldListSourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addConnectionSelectProperty();

        addFieldIdSelectProperty();

        addLeftSymbolSelectProperty();

        addOperationSelectProperty();

        addRemarksSelectProperty();

        addReportInstanceIdSelectProperty();

        addRightSymbolSelectProperty();

        addStatusSelectProperty();

        addValueSelectProperty();

        addFieldDataTypeSelectProperty();

        addFieldNameSelectProperty();

        addFieldAliasSelectProperty();

        addFieldTitleSelectProperty();

        addFieldListSourceIdSelectProperty();
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
            addCriterion("REPORT_FILTER.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_FILTER.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.ID is not null AND REPORT_FILTER.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(REPORT_FILTER.ID is null OR REPORT_FILTER.ID = '')");

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
            addCriterion("REPORT_FILTER.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.ID");
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
            addCriterion("REPORT_FILTER.ID <>", value, "id");

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
            addCriterion("REPORT_FILTER.ID is null OR REPORT_FILTER.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_FILTER.ID");
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
            addCriterion("REPORT_FILTER.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.ID");
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
            addCriterion("REPORT_FILTER.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.ID");
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
            addCriterion("REPORT_FILTER.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.ID");
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
            addCriterion("REPORT_FILTER.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.ID");
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
                addCriterion("REPORT_FILTER.ID in", values, "id");

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
                addCriterion("REPORT_FILTER.ID not in", values, "id");

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
                addCriterion("REPORT_FILTER.ID in", values, "id");

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
                addCriterion("REPORT_FILTER.ID not in", values, "id");

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
                addCriterion("REPORT_FILTER.ID in", Arrays.asList(values), "id");

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
                addCriterion("REPORT_FILTER.ID not in", Arrays.asList(values),
                    "id");

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
            addCriterion("REPORT_FILTER.ID between", value1, value2, "id");

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
            addCriterion("REPORT_FILTER.ID between", value1, value2, "id");

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
            addCriterion("REPORT_FILTER.ID not between", value1, value2, "id");

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
            addCriterion("REPORT_FILTER.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionIsNull() {
            addCriterion("REPORT_FILTER.CONNECTION is null");

            return this;
        } // end andConnectionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionIsNotNull() {
            addCriterion("REPORT_FILTER.CONNECTION is not null");

            return this;
        } // end andConnectionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.CONNECTION is not null AND REPORT_FILTER.CONNECTION <> ''");

            return this;
        } // end andConnectionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.CONNECTION is null OR REPORT_FILTER.CONNECTION = '')");

            return this;
        } // end andConnectionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionEqualTo(String value) {
            addCriterion("REPORT_FILTER.CONNECTION =", value, "connection");

            return this;
        } // end andConnectionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.CONNECTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConnectionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionNotEqualTo(String value) {
            addCriterion("REPORT_FILTER.CONNECTION <>", value, "connection");

            return this;
        } // end andConnectionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_FILTER.CONNECTION is null OR REPORT_FILTER.CONNECTION <>",
                value, "connection");

            return this;
        } // end andConnectionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.CONNECTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConnectionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionGreaterThan(String value) {
            addCriterion("REPORT_FILTER.CONNECTION >", value, "connection");

            return this;
        } // end andConnectionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.CONNECTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConnectionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.CONNECTION >=", value, "connection");

            return this;
        } // end andConnectionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.CONNECTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConnectionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionLessThan(String value) {
            addCriterion("REPORT_FILTER.CONNECTION <", value, "connection");

            return this;
        } // end andConnectionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.CONNECTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConnectionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionLessThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.CONNECTION <=", value, "connection");

            return this;
        } // end andConnectionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.CONNECTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConnectionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.CONNECTION like", buffer.toString(),
                "connection");

            return this;
        } // end andConnectionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.CONNECTION not like",
                buffer.toString(), "connection");

            return this;
        } // end andConnectionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionIn(List values) {
            if (values.size() == 1) {
                return andConnectionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.CONNECTION in", values, "connection");

                return this;
            } // end else
        } // end andConnectionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionNotIn(List values) {
            if (values.size() == 1) {
                return andConnectionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.CONNECTION not in", values,
                    "connection");

                return this;
            } // end else
        } // end andConnectionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionIn(Object[] values) {
            if (values.length == 1) {
                return andConnectionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.CONNECTION in",
                    Arrays.asList(values), "connection");

                return this;
            } // end else
        } // end andConnectionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionNotIn(Object[] values) {
            if (values.length == 1) {
                return andConnectionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.CONNECTION not in",
                    Arrays.asList(values), "connection");

                return this;
            } // end else
        } // end andConnectionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.CONNECTION between", value1, value2,
                "connection");

            return this;
        } // end andConnectionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConnectionNotBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.CONNECTION not between", value1,
                value2, "connection");

            return this;
        } // end andConnectionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNull() {
            addCriterion("REPORT_FILTER.FIELD_ID is null");

            return this;
        } // end andFieldIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNotNull() {
            addCriterion("REPORT_FILTER.FIELD_ID is not null");

            return this;
        } // end andFieldIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.FIELD_ID is not null AND REPORT_FILTER.FIELD_ID <> ''");

            return this;
        } // end andFieldIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldIdIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.FIELD_ID is null OR REPORT_FILTER.FIELD_ID = '')");

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
            addCriterion("REPORT_FILTER.FIELD_ID =", value, "fieldId");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.FIELD_ID");
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
            addCriterion("REPORT_FILTER.FIELD_ID <>", value, "fieldId");

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
            addCriterion("REPORT_FILTER.FIELD_ID is null OR REPORT_FILTER.FIELD_ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_FILTER.FIELD_ID");
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
            addCriterion("REPORT_FILTER.FIELD_ID >", value, "fieldId");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.FIELD_ID");
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
            addCriterion("REPORT_FILTER.FIELD_ID >=", value, "fieldId");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.FIELD_ID");
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
            addCriterion("REPORT_FILTER.FIELD_ID <", value, "fieldId");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.FIELD_ID");
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
            addCriterion("REPORT_FILTER.FIELD_ID <=", value, "fieldId");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.FIELD_ID");
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
                addCriterion("REPORT_FILTER.FIELD_ID in", values, "fieldId");

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
                addCriterion("REPORT_FILTER.FIELD_ID not in", values, "fieldId");

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
                addCriterion("REPORT_FILTER.FIELD_ID in", values, "fieldId");

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
                addCriterion("REPORT_FILTER.FIELD_ID not in", values, "fieldId");

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
                addCriterion("REPORT_FILTER.FIELD_ID in",
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
                addCriterion("REPORT_FILTER.FIELD_ID not in",
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
            addCriterion("REPORT_FILTER.FIELD_ID between", value1, value2,
                "fieldId");

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
            addCriterion("REPORT_FILTER.FIELD_ID between", value1, value2,
                "fieldId");

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
            addCriterion("REPORT_FILTER.FIELD_ID not between", value1, value2,
                "fieldId");

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
            addCriterion("REPORT_FILTER.FIELD_ID not between", value1, value2,
                "fieldId");

            return this;
        } // end andFieldIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolIsNull() {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL is null");

            return this;
        } // end andLeftSymbolIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolIsNotNull() {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL is not null");

            return this;
        } // end andLeftSymbolIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.LEFT_SYMBOL is not null AND REPORT_FILTER.LEFT_SYMBOL <> ''");

            return this;
        } // end andLeftSymbolIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.LEFT_SYMBOL is null OR REPORT_FILTER.LEFT_SYMBOL = '')");

            return this;
        } // end andLeftSymbolIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolEqualTo(String value) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL =", value, "leftSymbol");

            return this;
        } // end andLeftSymbolEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.LEFT_SYMBOL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLeftSymbolEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolNotEqualTo(String value) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL <>", value, "leftSymbol");

            return this;
        } // end andLeftSymbolNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL is null OR REPORT_FILTER.LEFT_SYMBOL <>",
                value, "leftSymbol");

            return this;
        } // end andLeftSymbolNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.LEFT_SYMBOL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLeftSymbolNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolGreaterThan(String value) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL >", value, "leftSymbol");

            return this;
        } // end andLeftSymbolGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.LEFT_SYMBOL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLeftSymbolGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL >=", value, "leftSymbol");

            return this;
        } // end andLeftSymbolGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.LEFT_SYMBOL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLeftSymbolGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolLessThan(String value) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL <", value, "leftSymbol");

            return this;
        } // end andLeftSymbolLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.LEFT_SYMBOL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLeftSymbolLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolLessThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL <=", value, "leftSymbol");

            return this;
        } // end andLeftSymbolLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.LEFT_SYMBOL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLeftSymbolLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.LEFT_SYMBOL like", buffer.toString(),
                "leftSymbol");

            return this;
        } // end andLeftSymbolLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.LEFT_SYMBOL not like",
                buffer.toString(), "leftSymbol");

            return this;
        } // end andLeftSymbolNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolIn(List values) {
            if (values.size() == 1) {
                return andLeftSymbolEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.LEFT_SYMBOL in", values,
                    "leftSymbol");

                return this;
            } // end else
        } // end andLeftSymbolIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolNotIn(List values) {
            if (values.size() == 1) {
                return andLeftSymbolNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.LEFT_SYMBOL not in", values,
                    "leftSymbol");

                return this;
            } // end else
        } // end andLeftSymbolNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolIn(Object[] values) {
            if (values.length == 1) {
                return andLeftSymbolEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.LEFT_SYMBOL in",
                    Arrays.asList(values), "leftSymbol");

                return this;
            } // end else
        } // end andLeftSymbolIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolNotIn(Object[] values) {
            if (values.length == 1) {
                return andLeftSymbolNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.LEFT_SYMBOL not in",
                    Arrays.asList(values), "leftSymbol");

                return this;
            } // end else
        } // end andLeftSymbolNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL between", value1, value2,
                "leftSymbol");

            return this;
        } // end andLeftSymbolBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLeftSymbolNotBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.LEFT_SYMBOL not between", value1,
                value2, "leftSymbol");

            return this;
        } // end andLeftSymbolNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsNull() {
            addCriterion("REPORT_FILTER.OPERATION is null");

            return this;
        } // end andOperationIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsNotNull() {
            addCriterion("REPORT_FILTER.OPERATION is not null");

            return this;
        } // end andOperationIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.OPERATION is not null AND REPORT_FILTER.OPERATION <> ''");

            return this;
        } // end andOperationIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.OPERATION is null OR REPORT_FILTER.OPERATION = '')");

            return this;
        } // end andOperationIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationEqualTo(String value) {
            addCriterion("REPORT_FILTER.OPERATION =", value, "operation");

            return this;
        } // end andOperationEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.OPERATION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("REPORT_FILTER.OPERATION <>", value, "operation");

            return this;
        } // end andOperationNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_FILTER.OPERATION is null OR REPORT_FILTER.OPERATION <>",
                value, "operation");

            return this;
        } // end andOperationNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.OPERATION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThan(String value) {
            addCriterion("REPORT_FILTER.OPERATION >", value, "operation");

            return this;
        } // end andOperationGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.OPERATION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.OPERATION >=", value, "operation");

            return this;
        } // end andOperationGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.OPERATION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThan(String value) {
            addCriterion("REPORT_FILTER.OPERATION <", value, "operation");

            return this;
        } // end andOperationLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.OPERATION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.OPERATION <=", value, "operation");

            return this;
        } // end andOperationLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.OPERATION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.OPERATION like", buffer.toString(),
                "operation");

            return this;
        } // end andOperationLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.OPERATION not like", buffer.toString(),
                "operation");

            return this;
        } // end andOperationNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIn(List values) {
            if (values.size() == 1) {
                return andOperationEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.OPERATION in", values, "operation");

                return this;
            } // end else
        } // end andOperationIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotIn(List values) {
            if (values.size() == 1) {
                return andOperationNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.OPERATION not in", values,
                    "operation");

                return this;
            } // end else
        } // end andOperationNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIn(Object[] values) {
            if (values.length == 1) {
                return andOperationEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.OPERATION in",
                    Arrays.asList(values), "operation");

                return this;
            } // end else
        } // end andOperationIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotIn(Object[] values) {
            if (values.length == 1) {
                return andOperationNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.OPERATION not in",
                    Arrays.asList(values), "operation");

                return this;
            } // end else
        } // end andOperationNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.OPERATION between", value1, value2,
                "operation");

            return this;
        } // end andOperationBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.OPERATION not between", value1, value2,
                "operation");

            return this;
        } // end andOperationNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_FILTER.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_FILTER.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.REMARKS is not null AND REPORT_FILTER.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.REMARKS is null OR REPORT_FILTER.REMARKS = '')");

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
            addCriterion("REPORT_FILTER.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.REMARKS");
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
            addCriterion("REPORT_FILTER.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_FILTER.REMARKS is null OR REPORT_FILTER.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_FILTER.REMARKS");
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
            addCriterion("REPORT_FILTER.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.REMARKS");
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
            addCriterion("REPORT_FILTER.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.REMARKS");
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
            addCriterion("REPORT_FILTER.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.REMARKS");
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
            addCriterion("REPORT_FILTER.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.REMARKS");
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
            addCriterion("REPORT_FILTER.REMARKS like", buffer.toString(),
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
            addCriterion("REPORT_FILTER.REMARKS not like", buffer.toString(),
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
                addCriterion("REPORT_FILTER.REMARKS in", values, "remarks");

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
                addCriterion("REPORT_FILTER.REMARKS not in", values, "remarks");

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
                addCriterion("REPORT_FILTER.REMARKS in", Arrays.asList(values),
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
        public Criteria andRemarksNotIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.REMARKS not in",
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
            addCriterion("REPORT_FILTER.REMARKS between", value1, value2,
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
            addCriterion("REPORT_FILTER.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsNull() {
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID is null");

            return this;
        } // end andReportInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsNotNull() {
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID is not null");

            return this;
        } // end andReportInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.REPORT_INSTANCE_ID is not null AND REPORT_FILTER.REPORT_INSTANCE_ID <> ''");

            return this;
        } // end andReportInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportInstanceIdIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.REPORT_INSTANCE_ID is null OR REPORT_FILTER.REPORT_INSTANCE_ID = '')");

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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID =", value,
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
                    "REPORT_FILTER.REPORT_INSTANCE_ID");
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID <>", value,
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID is null OR REPORT_FILTER.REPORT_INSTANCE_ID <>",
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
                    "REPORT_FILTER.REPORT_INSTANCE_ID");
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID >", value,
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
                    "REPORT_FILTER.REPORT_INSTANCE_ID");
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID >=", value,
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
                    "REPORT_FILTER.REPORT_INSTANCE_ID");
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID <", value,
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
                    "REPORT_FILTER.REPORT_INSTANCE_ID");
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID <=", value,
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
                    "REPORT_FILTER.REPORT_INSTANCE_ID");
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
                addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID in", values,
                    "reportInstanceId");

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
                addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID not in", values,
                    "reportInstanceId");

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
                addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID in", values,
                    "reportInstanceId");

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
                addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID not in", values,
                    "reportInstanceId");

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
                addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID in",
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
                addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID not in",
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID between", value1,
                value2, "reportInstanceId");

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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID between", value1,
                value2, "reportInstanceId");

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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID not between",
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
            addCriterion("REPORT_FILTER.REPORT_INSTANCE_ID not between",
                value1, value2, "reportInstanceId");

            return this;
        } // end andReportInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolIsNull() {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL is null");

            return this;
        } // end andRightSymbolIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolIsNotNull() {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL is not null");

            return this;
        } // end andRightSymbolIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.RIGHT_SYMBOL is not null AND REPORT_FILTER.RIGHT_SYMBOL <> ''");

            return this;
        } // end andRightSymbolIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.RIGHT_SYMBOL is null OR REPORT_FILTER.RIGHT_SYMBOL = '')");

            return this;
        } // end andRightSymbolIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolEqualTo(String value) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL =", value, "rightSymbol");

            return this;
        } // end andRightSymbolEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.RIGHT_SYMBOL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRightSymbolEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolNotEqualTo(String value) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL <>", value, "rightSymbol");

            return this;
        } // end andRightSymbolNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL is null OR REPORT_FILTER.RIGHT_SYMBOL <>",
                value, "rightSymbol");

            return this;
        } // end andRightSymbolNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.RIGHT_SYMBOL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRightSymbolNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolGreaterThan(String value) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL >", value, "rightSymbol");

            return this;
        } // end andRightSymbolGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.RIGHT_SYMBOL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRightSymbolGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL >=", value, "rightSymbol");

            return this;
        } // end andRightSymbolGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.RIGHT_SYMBOL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRightSymbolGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolLessThan(String value) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL <", value, "rightSymbol");

            return this;
        } // end andRightSymbolLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.RIGHT_SYMBOL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRightSymbolLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolLessThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL <=", value, "rightSymbol");

            return this;
        } // end andRightSymbolLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.RIGHT_SYMBOL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRightSymbolLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL like", buffer.toString(),
                "rightSymbol");

            return this;
        } // end andRightSymbolLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL not like",
                buffer.toString(), "rightSymbol");

            return this;
        } // end andRightSymbolNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolIn(List values) {
            if (values.size() == 1) {
                return andRightSymbolEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.RIGHT_SYMBOL in", values,
                    "rightSymbol");

                return this;
            } // end else
        } // end andRightSymbolIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolNotIn(List values) {
            if (values.size() == 1) {
                return andRightSymbolNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.RIGHT_SYMBOL not in", values,
                    "rightSymbol");

                return this;
            } // end else
        } // end andRightSymbolNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolIn(Object[] values) {
            if (values.length == 1) {
                return andRightSymbolEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.RIGHT_SYMBOL in",
                    Arrays.asList(values), "rightSymbol");

                return this;
            } // end else
        } // end andRightSymbolIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolNotIn(Object[] values) {
            if (values.length == 1) {
                return andRightSymbolNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.RIGHT_SYMBOL not in",
                    Arrays.asList(values), "rightSymbol");

                return this;
            } // end else
        } // end andRightSymbolNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL between", value1, value2,
                "rightSymbol");

            return this;
        } // end andRightSymbolBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRightSymbolNotBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.RIGHT_SYMBOL not between", value1,
                value2, "rightSymbol");

            return this;
        } // end andRightSymbolNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_FILTER.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_FILTER.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.STATUS is not null AND REPORT_FILTER.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.STATUS is null OR REPORT_FILTER.STATUS = '')");

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
            addCriterion("REPORT_FILTER.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.STATUS");
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
            addCriterion("REPORT_FILTER.STATUS <>", value, "status");

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
            addCriterion("REPORT_FILTER.STATUS is null OR REPORT_FILTER.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_FILTER.STATUS");
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
            addCriterion("REPORT_FILTER.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.STATUS");
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
            addCriterion("REPORT_FILTER.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.STATUS");
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
            addCriterion("REPORT_FILTER.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.STATUS");
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
            addCriterion("REPORT_FILTER.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_FILTER.STATUS");
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
            addCriterion("REPORT_FILTER.STATUS like", buffer.toString(),
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
            addCriterion("REPORT_FILTER.STATUS not like", buffer.toString(),
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
                addCriterion("REPORT_FILTER.STATUS in", values, "status");

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
                addCriterion("REPORT_FILTER.STATUS not in", values, "status");

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
                addCriterion("REPORT_FILTER.STATUS in", Arrays.asList(values),
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
        public Criteria andStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.STATUS not in",
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
            addCriterion("REPORT_FILTER.STATUS between", value1, value2,
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
            addCriterion("REPORT_FILTER.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNull() {
            addCriterion("REPORT_FILTER.VALUE is null");

            return this;
        } // end andValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotNull() {
            addCriterion("REPORT_FILTER.VALUE is not null");

            return this;
        } // end andValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotEmpty() {
            addCriterion(
                "REPORT_FILTER.VALUE is not null AND REPORT_FILTER.VALUE <> ''");

            return this;
        } // end andValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsEmpty() {
            addCriterion(
                "(REPORT_FILTER.VALUE is null OR REPORT_FILTER.VALUE = '')");

            return this;
        } // end andValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualTo(String value) {
            addCriterion("REPORT_FILTER.VALUE =", value, "value");

            return this;
        } // end andValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualTo(String value) {
            addCriterion("REPORT_FILTER.VALUE <>", value, "value");

            return this;
        } // end andValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_FILTER.VALUE is null OR REPORT_FILTER.VALUE <>",
                value, "value");

            return this;
        } // end andValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThan(String value) {
            addCriterion("REPORT_FILTER.VALUE >", value, "value");

            return this;
        } // end andValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.VALUE >=", value, "value");

            return this;
        } // end andValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThan(String value) {
            addCriterion("REPORT_FILTER.VALUE <", value, "value");

            return this;
        } // end andValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("REPORT_FILTER.VALUE <=", value, "value");

            return this;
        } // end andValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_FILTER.VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.VALUE like", buffer.toString(), "value");

            return this;
        } // end andValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_FILTER.VALUE not like", buffer.toString(),
                "value");

            return this;
        } // end andValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(List values) {
            if (values.size() == 1) {
                return andValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.VALUE in", values, "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(List values) {
            if (values.size() == 1) {
                return andValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_FILTER.VALUE not in", values, "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(Object[] values) {
            if (values.length == 1) {
                return andValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.VALUE in", Arrays.asList(values),
                    "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_FILTER.VALUE not in",
                    Arrays.asList(values), "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.VALUE between", value1, value2, "value");

            return this;
        } // end andValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("REPORT_FILTER.VALUE not between", value1, value2,
                "value");

            return this;
        } // end andValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsNull() {
            addCriterion("reportViewFieldE.DATA_TYPE is null");

            return this;
        } // end andFieldDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsNotNull() {
            addCriterion("reportViewFieldE.DATA_TYPE is not null");

            return this;
        } // end andFieldDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsNotEmpty() {
            addCriterion(
                "reportViewFieldE.DATA_TYPE is not null AND reportViewFieldE.DATA_TYPE <> ''");

            return this;
        } // end andFieldDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldDataTypeIsEmpty() {
            addCriterion(
                "(reportViewFieldE.DATA_TYPE is null OR reportViewFieldE.DATA_TYPE = '')");

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
            addCriterion("reportViewFieldE.DATA_TYPE =", value, "fieldDataType");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.DATA_TYPE");
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
            addCriterion("reportViewFieldE.DATA_TYPE <>", value, "fieldDataType");

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
            addCriterion("reportViewFieldE.DATA_TYPE is null OR reportViewFieldE.DATA_TYPE <>",
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
            StringBuffer str = new StringBuffer("reportViewFieldE.DATA_TYPE");
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
            addCriterion("reportViewFieldE.DATA_TYPE >", value, "fieldDataType");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.DATA_TYPE");
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
            addCriterion("reportViewFieldE.DATA_TYPE >=", value, "fieldDataType");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.DATA_TYPE");
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
            addCriterion("reportViewFieldE.DATA_TYPE <", value, "fieldDataType");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.DATA_TYPE");
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
            addCriterion("reportViewFieldE.DATA_TYPE <=", value, "fieldDataType");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.DATA_TYPE");
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
            addCriterion("reportViewFieldE.DATA_TYPE like", buffer.toString(),
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
            addCriterion("reportViewFieldE.DATA_TYPE not like",
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
                addCriterion("reportViewFieldE.DATA_TYPE in", values,
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
                addCriterion("reportViewFieldE.DATA_TYPE not in", values,
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
                addCriterion("reportViewFieldE.DATA_TYPE in",
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
                addCriterion("reportViewFieldE.DATA_TYPE not in",
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
            addCriterion("reportViewFieldE.DATA_TYPE between", value1, value2,
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
            addCriterion("reportViewFieldE.DATA_TYPE not between", value1,
                value2, "fieldDataType");

            return this;
        } // end andFieldDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNull() {
            addCriterion("reportViewFieldE.FIELD_NAME is null");

            return this;
        } // end andFieldNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotNull() {
            addCriterion("reportViewFieldE.FIELD_NAME is not null");

            return this;
        } // end andFieldNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsNotEmpty() {
            addCriterion(
                "reportViewFieldE.FIELD_NAME is not null AND reportViewFieldE.FIELD_NAME <> ''");

            return this;
        } // end andFieldNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldNameIsEmpty() {
            addCriterion(
                "(reportViewFieldE.FIELD_NAME is null OR reportViewFieldE.FIELD_NAME = '')");

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
            addCriterion("reportViewFieldE.FIELD_NAME =", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_NAME");
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
            addCriterion("reportViewFieldE.FIELD_NAME <>", value, "fieldName");

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
            addCriterion("reportViewFieldE.FIELD_NAME is null OR reportViewFieldE.FIELD_NAME <>",
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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_NAME");
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
            addCriterion("reportViewFieldE.FIELD_NAME >", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_NAME");
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
            addCriterion("reportViewFieldE.FIELD_NAME >=", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_NAME");
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
            addCriterion("reportViewFieldE.FIELD_NAME <", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_NAME");
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
            addCriterion("reportViewFieldE.FIELD_NAME <=", value, "fieldName");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_NAME");
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
            addCriterion("reportViewFieldE.FIELD_NAME like", buffer.toString(),
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
            addCriterion("reportViewFieldE.FIELD_NAME not like",
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
                addCriterion("reportViewFieldE.FIELD_NAME in", values,
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
                addCriterion("reportViewFieldE.FIELD_NAME not in", values,
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
                addCriterion("reportViewFieldE.FIELD_NAME in",
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
                addCriterion("reportViewFieldE.FIELD_NAME not in",
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
            addCriterion("reportViewFieldE.FIELD_NAME between", value1, value2,
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
            addCriterion("reportViewFieldE.FIELD_NAME not between", value1,
                value2, "fieldName");

            return this;
        } // end andFieldNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNull() {
            addCriterion("reportViewFieldE.FIELD_ALIAS is null");

            return this;
        } // end andFieldAliasIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNotNull() {
            addCriterion("reportViewFieldE.FIELD_ALIAS is not null");

            return this;
        } // end andFieldAliasIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsNotEmpty() {
            addCriterion(
                "reportViewFieldE.FIELD_ALIAS is not null AND reportViewFieldE.FIELD_ALIAS <> ''");

            return this;
        } // end andFieldAliasIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldAliasIsEmpty() {
            addCriterion(
                "(reportViewFieldE.FIELD_ALIAS is null OR reportViewFieldE.FIELD_ALIAS = '')");

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
            addCriterion("reportViewFieldE.FIELD_ALIAS =", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_ALIAS");
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
            addCriterion("reportViewFieldE.FIELD_ALIAS <>", value, "fieldAlias");

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
            addCriterion("reportViewFieldE.FIELD_ALIAS is null OR reportViewFieldE.FIELD_ALIAS <>",
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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_ALIAS");
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
            addCriterion("reportViewFieldE.FIELD_ALIAS >", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_ALIAS");
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
            addCriterion("reportViewFieldE.FIELD_ALIAS >=", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_ALIAS");
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
            addCriterion("reportViewFieldE.FIELD_ALIAS <", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_ALIAS");
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
            addCriterion("reportViewFieldE.FIELD_ALIAS <=", value, "fieldAlias");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.FIELD_ALIAS");
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
            addCriterion("reportViewFieldE.FIELD_ALIAS like",
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
            addCriterion("reportViewFieldE.FIELD_ALIAS not like",
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
                addCriterion("reportViewFieldE.FIELD_ALIAS in", values,
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
                addCriterion("reportViewFieldE.FIELD_ALIAS not in", values,
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
                addCriterion("reportViewFieldE.FIELD_ALIAS in",
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
                addCriterion("reportViewFieldE.FIELD_ALIAS not in",
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
            addCriterion("reportViewFieldE.FIELD_ALIAS between", value1,
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
            addCriterion("reportViewFieldE.FIELD_ALIAS not between", value1,
                value2, "fieldAlias");

            return this;
        } // end andFieldAliasNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsNull() {
            addCriterion("reportViewFieldE.TITLE is null");

            return this;
        } // end andFieldTitleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsNotNull() {
            addCriterion("reportViewFieldE.TITLE is not null");

            return this;
        } // end andFieldTitleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsNotEmpty() {
            addCriterion(
                "reportViewFieldE.TITLE is not null AND reportViewFieldE.TITLE <> ''");

            return this;
        } // end andFieldTitleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldTitleIsEmpty() {
            addCriterion(
                "(reportViewFieldE.TITLE is null OR reportViewFieldE.TITLE = '')");

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
            addCriterion("reportViewFieldE.TITLE =", value, "fieldTitle");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.TITLE");
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
            addCriterion("reportViewFieldE.TITLE <>", value, "fieldTitle");

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
            addCriterion("reportViewFieldE.TITLE is null OR reportViewFieldE.TITLE <>",
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
            StringBuffer str = new StringBuffer("reportViewFieldE.TITLE");
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
            addCriterion("reportViewFieldE.TITLE >", value, "fieldTitle");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.TITLE");
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
            addCriterion("reportViewFieldE.TITLE >=", value, "fieldTitle");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.TITLE");
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
            addCriterion("reportViewFieldE.TITLE <", value, "fieldTitle");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.TITLE");
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
            addCriterion("reportViewFieldE.TITLE <=", value, "fieldTitle");

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
            StringBuffer str = new StringBuffer("reportViewFieldE.TITLE");
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
            addCriterion("reportViewFieldE.TITLE like", buffer.toString(),
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
            addCriterion("reportViewFieldE.TITLE not like", buffer.toString(),
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
                addCriterion("reportViewFieldE.TITLE in", values, "fieldTitle");

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
                addCriterion("reportViewFieldE.TITLE not in", values,
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
                addCriterion("reportViewFieldE.TITLE in",
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
                addCriterion("reportViewFieldE.TITLE not in",
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
            addCriterion("reportViewFieldE.TITLE between", value1, value2,
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
            addCriterion("reportViewFieldE.TITLE not between", value1, value2,
                "fieldTitle");

            return this;
        } // end andFieldTitleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdIsNull() {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID is null");

            return this;
        } // end andFieldListSourceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdIsNotNull() {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID is not null");

            return this;
        } // end andFieldListSourceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdIsNotEmpty() {
            addCriterion(
                "reportViewFieldE.LIST_SOURCE_ID is not null AND reportViewFieldE.LIST_SOURCE_ID <> ''");

            return this;
        } // end andFieldListSourceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdIsEmpty() {
            addCriterion(
                "(reportViewFieldE.LIST_SOURCE_ID is null OR reportViewFieldE.LIST_SOURCE_ID = '')");

            return this;
        } // end andFieldListSourceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdEqualTo(long value) {
            return andFieldListSourceIdEqualTo(Long.valueOf(value));
        } // end andFieldListSourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdEqualTo(java.lang.Long value) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID =", value,
                "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewFieldE.LIST_SOURCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldListSourceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotEqualTo(long value) {
            return andFieldListSourceIdNotEqualTo(Long.valueOf(value));
        } // end andFieldListSourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotEqualTo(java.lang.Long value) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID <>", value,
                "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotEqualToOrIsNull(long value) {
            return andFieldListSourceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andFieldListSourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID is null OR reportViewFieldE.LIST_SOURCE_ID <>",
                value, "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewFieldE.LIST_SOURCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldListSourceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdGreaterThan(long value) {
            return andFieldListSourceIdGreaterThan(Long.valueOf(value));
        } // end andFieldListSourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdGreaterThan(java.lang.Long value) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID >", value,
                "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewFieldE.LIST_SOURCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldListSourceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdGreaterThanOrEqualTo(long value) {
            return andFieldListSourceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andFieldListSourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID >=", value,
                "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewFieldE.LIST_SOURCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldListSourceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdLessThan(long value) {
            return andFieldListSourceIdLessThan(Long.valueOf(value));
        } // end andFieldListSourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdLessThan(java.lang.Long value) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID <", value,
                "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewFieldE.LIST_SOURCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldListSourceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdLessThanOrEqualTo(long value) {
            return andFieldListSourceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andFieldListSourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID <=", value,
                "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "reportViewFieldE.LIST_SOURCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldListSourceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdIn(long[] values) {
            if (values.length == 1) {
                return andFieldListSourceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldE.LIST_SOURCE_ID in", values,
                    "fieldListSourceId");

                return this;
            } // end else
        } // end andFieldListSourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andFieldListSourceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldE.LIST_SOURCE_ID not in", values,
                    "fieldListSourceId");

                return this;
            } // end else
        } // end andFieldListSourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdIn(List values) {
            if (values.size() == 1) {
                return andFieldListSourceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("reportViewFieldE.LIST_SOURCE_ID in", values,
                    "fieldListSourceId");

                return this;
            } // end else
        } // end andFieldListSourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotIn(List values) {
            if (values.size() == 1) {
                return andFieldListSourceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("reportViewFieldE.LIST_SOURCE_ID not in", values,
                    "fieldListSourceId");

                return this;
            } // end else
        } // end andFieldListSourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdIn(Object[] values) {
            if (values.length == 1) {
                return andFieldListSourceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldE.LIST_SOURCE_ID in",
                    Arrays.asList(values), "fieldListSourceId");

                return this;
            } // end else
        } // end andFieldListSourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldListSourceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("reportViewFieldE.LIST_SOURCE_ID not in",
                    Arrays.asList(values), "fieldListSourceId");

                return this;
            } // end else
        } // end andFieldListSourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdBetween(long value1, long value2) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID between", value1,
                value2, "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID between", value1,
                value2, "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotBetween(long value1, long value2) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID not between", value1,
                value2, "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldListSourceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("reportViewFieldE.LIST_SOURCE_ID not between", value1,
                value2, "fieldListSourceId");

            return this;
        } // end andFieldListSourceIdNotBetween()
    } // end Criteria
} // end ReportFilterDAOQueryBean
