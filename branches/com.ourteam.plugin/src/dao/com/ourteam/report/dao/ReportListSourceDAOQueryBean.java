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
 * ReportListSource query bean 2011-09-27 11:37:57
 *
 * @author Auto Gen
 */
public class ReportListSourceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportListSourceDAOQueryBean object.
     */
    public ReportListSourceDAOQueryBean() {
        super();
    } // end ReportListSourceDAOQueryBean()

    /**
     * Creates a new ReportListSourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportListSourceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportListSourceDAOQueryBean()

    /**
     * Creates a new ReportListSourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportListSourceDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportListSourceDAOQueryBean()

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
            addSelectProperty(IReportListSourceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.Id, "id");
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
            addSelectProperty(IReportListSourceDAO.Code, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.Code, "code");
        } // end else
    } // end addCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIdAttrSelectProperty() {
        addIdAttrSelectProperty("idAttr");
    } // end addIdAttrSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIdAttrSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportListSourceDAO.IdAttr, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.IdAttr, "idAttr");
        } // end else
    } // end addIdAttrSelectProperty()

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
            addSelectProperty(IReportListSourceDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

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
            addSelectProperty(IReportListSourceDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.Remarks, "remarks");
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
            addSelectProperty(IReportListSourceDAO.ReportProjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.ReportProjectId,
                "reportProjectId");
        } // end else
    } // end addReportProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSqlScriptSelectProperty() {
        addSqlScriptSelectProperty("sqlScript");
    } // end addSqlScriptSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSqlScriptSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportListSourceDAO.SqlScript, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.SqlScript, "sqlScript");
        } // end else
    } // end addSqlScriptSelectProperty()

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
            addSelectProperty(IReportListSourceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTextAttrSelectProperty() {
        addTextAttrSelectProperty("textAttr");
    } // end addTextAttrSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTextAttrSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportListSourceDAO.TextAttr, aAlias);
        } // end if
        else {
            addSelectProperty(IReportListSourceDAO.TextAttr, "textAttr");
        } // end else
    } // end addTextAttrSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCodeSelectProperty();

        addIdAttrSelectProperty();

        addNameSelectProperty();

        addRemarksSelectProperty();

        addReportProjectIdSelectProperty();

        addSqlScriptSelectProperty();

        addStatusSelectProperty();

        addTextAttrSelectProperty();
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
            addCriterion("REPORT_LIST_SOURCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.ID is not null AND REPORT_LIST_SOURCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.ID is null OR REPORT_LIST_SOURCE.ID = '')");

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
            addCriterion("REPORT_LIST_SOURCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID");
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
            addCriterion("REPORT_LIST_SOURCE.ID <>", value, "id");

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
            addCriterion("REPORT_LIST_SOURCE.ID is null OR REPORT_LIST_SOURCE.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID");
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
            addCriterion("REPORT_LIST_SOURCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID");
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
            addCriterion("REPORT_LIST_SOURCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID");
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
            addCriterion("REPORT_LIST_SOURCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID");
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
            addCriterion("REPORT_LIST_SOURCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID");
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
                addCriterion("REPORT_LIST_SOURCE.ID in", values, "id");

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
                addCriterion("REPORT_LIST_SOURCE.ID not in", values, "id");

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
                addCriterion("REPORT_LIST_SOURCE.ID in", values, "id");

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
                addCriterion("REPORT_LIST_SOURCE.ID not in", values, "id");

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
                addCriterion("REPORT_LIST_SOURCE.ID in", Arrays.asList(values),
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
                addCriterion("REPORT_LIST_SOURCE.ID not in",
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
            addCriterion("REPORT_LIST_SOURCE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_LIST_SOURCE.ID between", value1, value2, "id");

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
            addCriterion("REPORT_LIST_SOURCE.ID not between", value1, value2,
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
            addCriterion("REPORT_LIST_SOURCE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNull() {
            addCriterion("REPORT_LIST_SOURCE.CODE is null");

            return this;
        } // end andCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.CODE is not null");

            return this;
        } // end andCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.CODE is not null AND REPORT_LIST_SOURCE.CODE <> ''");

            return this;
        } // end andCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.CODE is null OR REPORT_LIST_SOURCE.CODE = '')");

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
            addCriterion("REPORT_LIST_SOURCE.CODE =", value, "code");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.CODE");
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
            addCriterion("REPORT_LIST_SOURCE.CODE <>", value, "code");

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
            addCriterion("REPORT_LIST_SOURCE.CODE is null OR REPORT_LIST_SOURCE.CODE <>",
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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.CODE");
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
            addCriterion("REPORT_LIST_SOURCE.CODE >", value, "code");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.CODE");
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
            addCriterion("REPORT_LIST_SOURCE.CODE >=", value, "code");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.CODE");
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
            addCriterion("REPORT_LIST_SOURCE.CODE <", value, "code");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.CODE");
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
            addCriterion("REPORT_LIST_SOURCE.CODE <=", value, "code");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.CODE");
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
            addCriterion("REPORT_LIST_SOURCE.CODE like", buffer.toString(),
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
            addCriterion("REPORT_LIST_SOURCE.CODE not like", buffer.toString(),
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
                addCriterion("REPORT_LIST_SOURCE.CODE in", values, "code");

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
                addCriterion("REPORT_LIST_SOURCE.CODE not in", values, "code");

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
                addCriterion("REPORT_LIST_SOURCE.CODE in",
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
                addCriterion("REPORT_LIST_SOURCE.CODE not in",
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
            addCriterion("REPORT_LIST_SOURCE.CODE between", value1, value2,
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
            addCriterion("REPORT_LIST_SOURCE.CODE not between", value1, value2,
                "code");

            return this;
        } // end andCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrIsNull() {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR is null");

            return this;
        } // end andIdAttrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR is not null");

            return this;
        } // end andIdAttrIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.ID_ATTR is not null AND REPORT_LIST_SOURCE.ID_ATTR <> ''");

            return this;
        } // end andIdAttrIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.ID_ATTR is null OR REPORT_LIST_SOURCE.ID_ATTR = '')");

            return this;
        } // end andIdAttrIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR =", value, "idAttr");

            return this;
        } // end andIdAttrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID_ATTR");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdAttrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrNotEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR <>", value, "idAttr");

            return this;
        } // end andIdAttrNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR is null OR REPORT_LIST_SOURCE.ID_ATTR <>",
                value, "idAttr");

            return this;
        } // end andIdAttrNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID_ATTR");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdAttrNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrGreaterThan(String value) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR >", value, "idAttr");

            return this;
        } // end andIdAttrGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID_ATTR");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdAttrGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR >=", value, "idAttr");

            return this;
        } // end andIdAttrGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID_ATTR");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdAttrGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrLessThan(String value) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR <", value, "idAttr");

            return this;
        } // end andIdAttrLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID_ATTR");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdAttrLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrLessThanOrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR <=", value, "idAttr");

            return this;
        } // end andIdAttrLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.ID_ATTR");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdAttrLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR like", buffer.toString(),
                "idAttr");

            return this;
        } // end andIdAttrLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR not like",
                buffer.toString(), "idAttr");

            return this;
        } // end andIdAttrNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrIn(List values) {
            if (values.size() == 1) {
                return andIdAttrEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.ID_ATTR in", values, "idAttr");

                return this;
            } // end else
        } // end andIdAttrIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrNotIn(List values) {
            if (values.size() == 1) {
                return andIdAttrNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.ID_ATTR not in", values,
                    "idAttr");

                return this;
            } // end else
        } // end andIdAttrNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrIn(Object[] values) {
            if (values.length == 1) {
                return andIdAttrEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.ID_ATTR in",
                    Arrays.asList(values), "idAttr");

                return this;
            } // end else
        } // end andIdAttrIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrNotIn(Object[] values) {
            if (values.length == 1) {
                return andIdAttrNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.ID_ATTR not in",
                    Arrays.asList(values), "idAttr");

                return this;
            } // end else
        } // end andIdAttrNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrBetween(String value1, String value2) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR between", value1, value2,
                "idAttr");

            return this;
        } // end andIdAttrBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdAttrNotBetween(String value1, String value2) {
            addCriterion("REPORT_LIST_SOURCE.ID_ATTR not between", value1,
                value2, "idAttr");

            return this;
        } // end andIdAttrNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("REPORT_LIST_SOURCE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.NAME is not null AND REPORT_LIST_SOURCE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.NAME is null OR REPORT_LIST_SOURCE.NAME = '')");

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
            addCriterion("REPORT_LIST_SOURCE.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.NAME");
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
            addCriterion("REPORT_LIST_SOURCE.NAME <>", value, "name");

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
            addCriterion("REPORT_LIST_SOURCE.NAME is null OR REPORT_LIST_SOURCE.NAME <>",
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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.NAME");
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
            addCriterion("REPORT_LIST_SOURCE.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.NAME");
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
            addCriterion("REPORT_LIST_SOURCE.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.NAME");
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
            addCriterion("REPORT_LIST_SOURCE.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.NAME");
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
            addCriterion("REPORT_LIST_SOURCE.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.NAME");
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
            addCriterion("REPORT_LIST_SOURCE.NAME like", buffer.toString(),
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
            addCriterion("REPORT_LIST_SOURCE.NAME not like", buffer.toString(),
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
                addCriterion("REPORT_LIST_SOURCE.NAME in", values, "name");

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
                addCriterion("REPORT_LIST_SOURCE.NAME not in", values, "name");

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
                addCriterion("REPORT_LIST_SOURCE.NAME in",
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
                addCriterion("REPORT_LIST_SOURCE.NAME not in",
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
            addCriterion("REPORT_LIST_SOURCE.NAME between", value1, value2,
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
            addCriterion("REPORT_LIST_SOURCE.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_LIST_SOURCE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.REMARKS is not null AND REPORT_LIST_SOURCE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.REMARKS is null OR REPORT_LIST_SOURCE.REMARKS = '')");

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
            addCriterion("REPORT_LIST_SOURCE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.REMARKS");
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_LIST_SOURCE.REMARKS is null OR REPORT_LIST_SOURCE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.REMARKS");
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.REMARKS");
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.REMARKS");
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.REMARKS");
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.REMARKS");
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS like", buffer.toString(),
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS not like",
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
                addCriterion("REPORT_LIST_SOURCE.REMARKS in", values, "remarks");

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
                addCriterion("REPORT_LIST_SOURCE.REMARKS not in", values,
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
                addCriterion("REPORT_LIST_SOURCE.REMARKS in",
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
                addCriterion("REPORT_LIST_SOURCE.REMARKS not in",
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS between", value1, value2,
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
            addCriterion("REPORT_LIST_SOURCE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNull() {
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID is null");

            return this;
        } // end andReportProjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID is not null");

            return this;
        } // end andReportProjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.REPORT_PROJECT_ID is not null AND REPORT_LIST_SOURCE.REPORT_PROJECT_ID <> ''");

            return this;
        } // end andReportProjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportProjectIdIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.REPORT_PROJECT_ID is null OR REPORT_LIST_SOURCE.REPORT_PROJECT_ID = '')");

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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID =", value,
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
                    "REPORT_LIST_SOURCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID <>", value,
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID is null OR REPORT_LIST_SOURCE.REPORT_PROJECT_ID <>",
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
                    "REPORT_LIST_SOURCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID >", value,
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
                    "REPORT_LIST_SOURCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID >=", value,
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
                    "REPORT_LIST_SOURCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID <", value,
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
                    "REPORT_LIST_SOURCE.REPORT_PROJECT_ID");
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID <=", value,
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
                    "REPORT_LIST_SOURCE.REPORT_PROJECT_ID");
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
                addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID in", values,
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
                addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID not in",
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
                addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID in", values,
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
                addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID not in",
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
                addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID in",
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
                addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID not in",
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID between",
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID between",
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID not between",
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
            addCriterion("REPORT_LIST_SOURCE.REPORT_PROJECT_ID not between",
                value1, value2, "reportProjectId");

            return this;
        } // end andReportProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptIsNull() {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT is null");

            return this;
        } // end andSqlScriptIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT is not null");

            return this;
        } // end andSqlScriptIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.SQL_SCRIPT is not null AND REPORT_LIST_SOURCE.SQL_SCRIPT <> ''");

            return this;
        } // end andSqlScriptIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.SQL_SCRIPT is null OR REPORT_LIST_SOURCE.SQL_SCRIPT = '')");

            return this;
        } // end andSqlScriptIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT =", value, "sqlScript");

            return this;
        } // end andSqlScriptEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.SQL_SCRIPT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSqlScriptEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptNotEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT <>", value, "sqlScript");

            return this;
        } // end andSqlScriptNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT is null OR REPORT_LIST_SOURCE.SQL_SCRIPT <>",
                value, "sqlScript");

            return this;
        } // end andSqlScriptNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.SQL_SCRIPT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSqlScriptNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptGreaterThan(String value) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT >", value, "sqlScript");

            return this;
        } // end andSqlScriptGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.SQL_SCRIPT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSqlScriptGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT >=", value, "sqlScript");

            return this;
        } // end andSqlScriptGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.SQL_SCRIPT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSqlScriptGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptLessThan(String value) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT <", value, "sqlScript");

            return this;
        } // end andSqlScriptLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.SQL_SCRIPT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSqlScriptLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptLessThanOrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT <=", value, "sqlScript");

            return this;
        } // end andSqlScriptLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.SQL_SCRIPT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSqlScriptLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT like",
                buffer.toString(), "sqlScript");

            return this;
        } // end andSqlScriptLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT not like",
                buffer.toString(), "sqlScript");

            return this;
        } // end andSqlScriptNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptIn(List values) {
            if (values.size() == 1) {
                return andSqlScriptEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT in", values,
                    "sqlScript");

                return this;
            } // end else
        } // end andSqlScriptIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptNotIn(List values) {
            if (values.size() == 1) {
                return andSqlScriptNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT not in", values,
                    "sqlScript");

                return this;
            } // end else
        } // end andSqlScriptNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptIn(Object[] values) {
            if (values.length == 1) {
                return andSqlScriptEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT in",
                    Arrays.asList(values), "sqlScript");

                return this;
            } // end else
        } // end andSqlScriptIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptNotIn(Object[] values) {
            if (values.length == 1) {
                return andSqlScriptNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT not in",
                    Arrays.asList(values), "sqlScript");

                return this;
            } // end else
        } // end andSqlScriptNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptBetween(String value1, String value2) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT between", value1,
                value2, "sqlScript");

            return this;
        } // end andSqlScriptBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSqlScriptNotBetween(String value1, String value2) {
            addCriterion("REPORT_LIST_SOURCE.SQL_SCRIPT not between", value1,
                value2, "sqlScript");

            return this;
        } // end andSqlScriptNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_LIST_SOURCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.STATUS is not null AND REPORT_LIST_SOURCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.STATUS is null OR REPORT_LIST_SOURCE.STATUS = '')");

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
            addCriterion("REPORT_LIST_SOURCE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.STATUS");
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
            addCriterion("REPORT_LIST_SOURCE.STATUS <>", value, "status");

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
            addCriterion("REPORT_LIST_SOURCE.STATUS is null OR REPORT_LIST_SOURCE.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.STATUS");
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
            addCriterion("REPORT_LIST_SOURCE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.STATUS");
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
            addCriterion("REPORT_LIST_SOURCE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.STATUS");
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
            addCriterion("REPORT_LIST_SOURCE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.STATUS");
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
            addCriterion("REPORT_LIST_SOURCE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.STATUS");
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
            addCriterion("REPORT_LIST_SOURCE.STATUS like", buffer.toString(),
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
            addCriterion("REPORT_LIST_SOURCE.STATUS not like",
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
                addCriterion("REPORT_LIST_SOURCE.STATUS in", values, "status");

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
                addCriterion("REPORT_LIST_SOURCE.STATUS not in", values,
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
                addCriterion("REPORT_LIST_SOURCE.STATUS in",
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
                addCriterion("REPORT_LIST_SOURCE.STATUS not in",
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
            addCriterion("REPORT_LIST_SOURCE.STATUS between", value1, value2,
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
            addCriterion("REPORT_LIST_SOURCE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrIsNull() {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR is null");

            return this;
        } // end andTextAttrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrIsNotNull() {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR is not null");

            return this;
        } // end andTextAttrIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrIsNotEmpty() {
            addCriterion(
                "REPORT_LIST_SOURCE.TEXT_ATTR is not null AND REPORT_LIST_SOURCE.TEXT_ATTR <> ''");

            return this;
        } // end andTextAttrIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrIsEmpty() {
            addCriterion(
                "(REPORT_LIST_SOURCE.TEXT_ATTR is null OR REPORT_LIST_SOURCE.TEXT_ATTR = '')");

            return this;
        } // end andTextAttrIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR =", value, "textAttr");

            return this;
        } // end andTextAttrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.TEXT_ATTR");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTextAttrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrNotEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR <>", value, "textAttr");

            return this;
        } // end andTextAttrNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrNotEqualToOrIsNull(String value) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR is null OR REPORT_LIST_SOURCE.TEXT_ATTR <>",
                value, "textAttr");

            return this;
        } // end andTextAttrNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.TEXT_ATTR");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTextAttrNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrGreaterThan(String value) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR >", value, "textAttr");

            return this;
        } // end andTextAttrGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.TEXT_ATTR");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTextAttrGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR >=", value, "textAttr");

            return this;
        } // end andTextAttrGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.TEXT_ATTR");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTextAttrGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrLessThan(String value) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR <", value, "textAttr");

            return this;
        } // end andTextAttrLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.TEXT_ATTR");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTextAttrLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrLessThanOrEqualTo(String value) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR <=", value, "textAttr");

            return this;
        } // end andTextAttrLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("REPORT_LIST_SOURCE.TEXT_ATTR");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTextAttrLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR like",
                buffer.toString(), "textAttr");

            return this;
        } // end andTextAttrLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR not like",
                buffer.toString(), "textAttr");

            return this;
        } // end andTextAttrNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrIn(List values) {
            if (values.size() == 1) {
                return andTextAttrEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR in", values,
                    "textAttr");

                return this;
            } // end else
        } // end andTextAttrIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrNotIn(List values) {
            if (values.size() == 1) {
                return andTextAttrNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR not in", values,
                    "textAttr");

                return this;
            } // end else
        } // end andTextAttrNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrIn(Object[] values) {
            if (values.length == 1) {
                return andTextAttrEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR in",
                    Arrays.asList(values), "textAttr");

                return this;
            } // end else
        } // end andTextAttrIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrNotIn(Object[] values) {
            if (values.length == 1) {
                return andTextAttrNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR not in",
                    Arrays.asList(values), "textAttr");

                return this;
            } // end else
        } // end andTextAttrNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrBetween(String value1, String value2) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR between", value1,
                value2, "textAttr");

            return this;
        } // end andTextAttrBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTextAttrNotBetween(String value1, String value2) {
            addCriterion("REPORT_LIST_SOURCE.TEXT_ATTR not between", value1,
                value2, "textAttr");

            return this;
        } // end andTextAttrNotBetween()
    } // end Criteria
} // end ReportListSourceDAOQueryBean
