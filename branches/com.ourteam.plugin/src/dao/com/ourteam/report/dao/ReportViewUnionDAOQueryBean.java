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
 * ReportViewUnion query bean 2011-09-27 11:38:01
 *
 * @author Auto Gen
 */
public class ReportViewUnionDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ReportViewUnionDAOQueryBean object.
     */
    public ReportViewUnionDAOQueryBean() {
        super();
    } // end ReportViewUnionDAOQueryBean()

    /**
     * Creates a new ReportViewUnionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ReportViewUnionDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ReportViewUnionDAOQueryBean()

    /**
     * Creates a new ReportViewUnionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ReportViewUnionDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ReportViewUnionDAOQueryBean()

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
            addSelectProperty(IReportViewUnionDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewUnionDAO.Id, "id");
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
            addSelectProperty(IReportViewUnionDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewUnionDAO.Remarks, "remarks");
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
            addSelectProperty(IReportViewUnionDAO.ReportViewId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewUnionDAO.ReportViewId, "reportViewId");
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
            addSelectProperty(IReportViewUnionDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewUnionDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUnionViewIdSelectProperty() {
        addUnionViewIdSelectProperty("unionViewId");
    } // end addUnionViewIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUnionViewIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewUnionDAO.UnionViewId, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewUnionDAO.UnionViewId, "unionViewId");
        } // end else
    } // end addUnionViewIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUnionedViewCodeSelectProperty() {
        addUnionedViewCodeSelectProperty("unionedViewCode");
    } // end addUnionedViewCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUnionedViewCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewUnionDAO.UnionedViewCode, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewUnionDAO.UnionedViewCode,
                "unionedViewCode");
        } // end else
    } // end addUnionedViewCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUnionedViewNameSelectProperty() {
        addUnionedViewNameSelectProperty("unionedViewName");
    } // end addUnionedViewNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUnionedViewNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IReportViewUnionDAO.UnionedViewName, aAlias);
        } // end if
        else {
            addSelectProperty(IReportViewUnionDAO.UnionedViewName,
                "unionedViewName");
        } // end else
    } // end addUnionedViewNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addReportViewIdSelectProperty();

        addStatusSelectProperty();

        addUnionViewIdSelectProperty();

        addUnionedViewCodeSelectProperty();

        addUnionedViewNameSelectProperty();
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
            addCriterion("REPORT_VIEW_UNION.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("REPORT_VIEW_UNION.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_UNION.ID is not null AND REPORT_VIEW_UNION.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_UNION.ID is null OR REPORT_VIEW_UNION.ID = '')");

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
            addCriterion("REPORT_VIEW_UNION.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.ID");
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
            addCriterion("REPORT_VIEW_UNION.ID <>", value, "id");

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
            addCriterion("REPORT_VIEW_UNION.ID is null OR REPORT_VIEW_UNION.ID <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.ID");
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
            addCriterion("REPORT_VIEW_UNION.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.ID");
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
            addCriterion("REPORT_VIEW_UNION.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.ID");
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
            addCriterion("REPORT_VIEW_UNION.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.ID");
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
            addCriterion("REPORT_VIEW_UNION.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.ID");
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
                addCriterion("REPORT_VIEW_UNION.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_UNION.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_UNION.ID in", values, "id");

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
                addCriterion("REPORT_VIEW_UNION.ID not in", values, "id");

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
                addCriterion("REPORT_VIEW_UNION.ID in", Arrays.asList(values),
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
                addCriterion("REPORT_VIEW_UNION.ID not in",
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
            addCriterion("REPORT_VIEW_UNION.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_UNION.ID between", value1, value2, "id");

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
            addCriterion("REPORT_VIEW_UNION.ID not between", value1, value2,
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
            addCriterion("REPORT_VIEW_UNION.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("REPORT_VIEW_UNION.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("REPORT_VIEW_UNION.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_UNION.REMARKS is not null AND REPORT_VIEW_UNION.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_UNION.REMARKS is null OR REPORT_VIEW_UNION.REMARKS = '')");

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
            addCriterion("REPORT_VIEW_UNION.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.REMARKS");
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
            addCriterion("REPORT_VIEW_UNION.REMARKS <>", value, "remarks");

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
            addCriterion("REPORT_VIEW_UNION.REMARKS is null OR REPORT_VIEW_UNION.REMARKS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.REMARKS");
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
            addCriterion("REPORT_VIEW_UNION.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.REMARKS");
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
            addCriterion("REPORT_VIEW_UNION.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.REMARKS");
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
            addCriterion("REPORT_VIEW_UNION.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.REMARKS");
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
            addCriterion("REPORT_VIEW_UNION.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.REMARKS");
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
            addCriterion("REPORT_VIEW_UNION.REMARKS like", buffer.toString(),
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
            addCriterion("REPORT_VIEW_UNION.REMARKS not like",
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
                addCriterion("REPORT_VIEW_UNION.REMARKS in", values, "remarks");

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
                addCriterion("REPORT_VIEW_UNION.REMARKS not in", values,
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
                addCriterion("REPORT_VIEW_UNION.REMARKS in",
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
                addCriterion("REPORT_VIEW_UNION.REMARKS not in",
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
            addCriterion("REPORT_VIEW_UNION.REMARKS between", value1, value2,
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
            addCriterion("REPORT_VIEW_UNION.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNull() {
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID is null");

            return this;
        } // end andReportViewIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotNull() {
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID is not null");

            return this;
        } // end andReportViewIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_UNION.REPORT_VIEW_ID is not null AND REPORT_VIEW_UNION.REPORT_VIEW_ID <> ''");

            return this;
        } // end andReportViewIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReportViewIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_UNION.REPORT_VIEW_ID is null OR REPORT_VIEW_UNION.REPORT_VIEW_ID = '')");

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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID =", value,
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
                    "REPORT_VIEW_UNION.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID <>", value,
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID is null OR REPORT_VIEW_UNION.REPORT_VIEW_ID <>",
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
                    "REPORT_VIEW_UNION.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID >", value,
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
                    "REPORT_VIEW_UNION.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID >=", value,
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
                    "REPORT_VIEW_UNION.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID <", value,
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
                    "REPORT_VIEW_UNION.REPORT_VIEW_ID");
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID <=", value,
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
                    "REPORT_VIEW_UNION.REPORT_VIEW_ID");
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
                addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID in", values,
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
                addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID not in", values,
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
                addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID in", values,
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
                addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID not in", values,
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
                addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID in",
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
                addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID not in",
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID between", value1,
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID between", value1,
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID not between",
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
            addCriterion("REPORT_VIEW_UNION.REPORT_VIEW_ID not between",
                value1, value2, "reportViewId");

            return this;
        } // end andReportViewIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("REPORT_VIEW_UNION.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("REPORT_VIEW_UNION.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_UNION.STATUS is not null AND REPORT_VIEW_UNION.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_UNION.STATUS is null OR REPORT_VIEW_UNION.STATUS = '')");

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
            addCriterion("REPORT_VIEW_UNION.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.STATUS");
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
            addCriterion("REPORT_VIEW_UNION.STATUS <>", value, "status");

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
            addCriterion("REPORT_VIEW_UNION.STATUS is null OR REPORT_VIEW_UNION.STATUS <>",
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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.STATUS");
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
            addCriterion("REPORT_VIEW_UNION.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.STATUS");
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
            addCriterion("REPORT_VIEW_UNION.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.STATUS");
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
            addCriterion("REPORT_VIEW_UNION.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.STATUS");
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
            addCriterion("REPORT_VIEW_UNION.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("REPORT_VIEW_UNION.STATUS");
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
            addCriterion("REPORT_VIEW_UNION.STATUS like", buffer.toString(),
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
            addCriterion("REPORT_VIEW_UNION.STATUS not like",
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
                addCriterion("REPORT_VIEW_UNION.STATUS in", values, "status");

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
                addCriterion("REPORT_VIEW_UNION.STATUS not in", values, "status");

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
                addCriterion("REPORT_VIEW_UNION.STATUS in",
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
                addCriterion("REPORT_VIEW_UNION.STATUS not in",
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
            addCriterion("REPORT_VIEW_UNION.STATUS between", value1, value2,
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
            addCriterion("REPORT_VIEW_UNION.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdIsNull() {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID is null");

            return this;
        } // end andUnionViewIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdIsNotNull() {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID is not null");

            return this;
        } // end andUnionViewIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdIsNotEmpty() {
            addCriterion(
                "REPORT_VIEW_UNION.UNION_VIEW_ID is not null AND REPORT_VIEW_UNION.UNION_VIEW_ID <> ''");

            return this;
        } // end andUnionViewIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdIsEmpty() {
            addCriterion(
                "(REPORT_VIEW_UNION.UNION_VIEW_ID is null OR REPORT_VIEW_UNION.UNION_VIEW_ID = '')");

            return this;
        } // end andUnionViewIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdEqualTo(long value) {
            return andUnionViewIdEqualTo(Long.valueOf(value));
        } // end andUnionViewIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID =", value,
                "unionViewId");

            return this;
        } // end andUnionViewIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_UNION.UNION_VIEW_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotEqualTo(long value) {
            return andUnionViewIdNotEqualTo(Long.valueOf(value));
        } // end andUnionViewIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID <>", value,
                "unionViewId");

            return this;
        } // end andUnionViewIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotEqualToOrIsNull(long value) {
            return andUnionViewIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andUnionViewIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID is null OR REPORT_VIEW_UNION.UNION_VIEW_ID <>",
                value, "unionViewId");

            return this;
        } // end andUnionViewIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_UNION.UNION_VIEW_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdGreaterThan(long value) {
            return andUnionViewIdGreaterThan(Long.valueOf(value));
        } // end andUnionViewIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdGreaterThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID >", value,
                "unionViewId");

            return this;
        } // end andUnionViewIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_UNION.UNION_VIEW_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdGreaterThanOrEqualTo(long value) {
            return andUnionViewIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andUnionViewIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID >=", value,
                "unionViewId");

            return this;
        } // end andUnionViewIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_UNION.UNION_VIEW_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdLessThan(long value) {
            return andUnionViewIdLessThan(Long.valueOf(value));
        } // end andUnionViewIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdLessThan(java.lang.Long value) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID <", value,
                "unionViewId");

            return this;
        } // end andUnionViewIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_UNION.UNION_VIEW_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdLessThanOrEqualTo(long value) {
            return andUnionViewIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andUnionViewIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID <=", value,
                "unionViewId");

            return this;
        } // end andUnionViewIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "REPORT_VIEW_UNION.UNION_VIEW_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionViewIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdIn(long[] values) {
            if (values.length == 1) {
                return andUnionViewIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID in", values,
                    "unionViewId");

                return this;
            } // end else
        } // end andUnionViewIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotIn(long[] values) {
            if (values.length == 1) {
                return andUnionViewIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID not in", values,
                    "unionViewId");

                return this;
            } // end else
        } // end andUnionViewIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdIn(List values) {
            if (values.size() == 1) {
                return andUnionViewIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID in", values,
                    "unionViewId");

                return this;
            } // end else
        } // end andUnionViewIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotIn(List values) {
            if (values.size() == 1) {
                return andUnionViewIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID not in", values,
                    "unionViewId");

                return this;
            } // end else
        } // end andUnionViewIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdIn(Object[] values) {
            if (values.length == 1) {
                return andUnionViewIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID in",
                    Arrays.asList(values), "unionViewId");

                return this;
            } // end else
        } // end andUnionViewIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andUnionViewIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID not in",
                    Arrays.asList(values), "unionViewId");

                return this;
            } // end else
        } // end andUnionViewIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID between", value1,
                value2, "unionViewId");

            return this;
        } // end andUnionViewIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID between", value1,
                value2, "unionViewId");

            return this;
        } // end andUnionViewIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotBetween(long value1, long value2) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID not between", value1,
                value2, "unionViewId");

            return this;
        } // end andUnionViewIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionViewIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("REPORT_VIEW_UNION.UNION_VIEW_ID not between", value1,
                value2, "unionViewId");

            return this;
        } // end andUnionViewIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeIsNull() {
            addCriterion("unionViewDefineA.CODE is null");

            return this;
        } // end andUnionedViewCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeIsNotNull() {
            addCriterion("unionViewDefineA.CODE is not null");

            return this;
        } // end andUnionedViewCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeIsNotEmpty() {
            addCriterion(
                "unionViewDefineA.CODE is not null AND unionViewDefineA.CODE <> ''");

            return this;
        } // end andUnionedViewCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeIsEmpty() {
            addCriterion(
                "(unionViewDefineA.CODE is null OR unionViewDefineA.CODE = '')");

            return this;
        } // end andUnionedViewCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeEqualTo(String value) {
            addCriterion("unionViewDefineA.CODE =", value, "unionedViewCode");

            return this;
        } // end andUnionedViewCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeNotEqualTo(String value) {
            addCriterion("unionViewDefineA.CODE <>", value, "unionedViewCode");

            return this;
        } // end andUnionedViewCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeNotEqualToOrIsNull(String value) {
            addCriterion("unionViewDefineA.CODE is null OR unionViewDefineA.CODE <>",
                value, "unionedViewCode");

            return this;
        } // end andUnionedViewCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeGreaterThan(String value) {
            addCriterion("unionViewDefineA.CODE >", value, "unionedViewCode");

            return this;
        } // end andUnionedViewCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeGreaterThanOrEqualTo(String value) {
            addCriterion("unionViewDefineA.CODE >=", value, "unionedViewCode");

            return this;
        } // end andUnionedViewCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeLessThan(String value) {
            addCriterion("unionViewDefineA.CODE <", value, "unionedViewCode");

            return this;
        } // end andUnionedViewCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeLessThanOrEqualTo(String value) {
            addCriterion("unionViewDefineA.CODE <=", value, "unionedViewCode");

            return this;
        } // end andUnionedViewCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("unionViewDefineA.CODE like", buffer.toString(),
                "unionedViewCode");

            return this;
        } // end andUnionedViewCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("unionViewDefineA.CODE not like", buffer.toString(),
                "unionedViewCode");

            return this;
        } // end andUnionedViewCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeIn(List values) {
            if (values.size() == 1) {
                return andUnionedViewCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("unionViewDefineA.CODE in", values,
                    "unionedViewCode");

                return this;
            } // end else
        } // end andUnionedViewCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeNotIn(List values) {
            if (values.size() == 1) {
                return andUnionedViewCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("unionViewDefineA.CODE not in", values,
                    "unionedViewCode");

                return this;
            } // end else
        } // end andUnionedViewCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeIn(Object[] values) {
            if (values.length == 1) {
                return andUnionedViewCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("unionViewDefineA.CODE in", Arrays.asList(values),
                    "unionedViewCode");

                return this;
            } // end else
        } // end andUnionedViewCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andUnionedViewCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("unionViewDefineA.CODE not in",
                    Arrays.asList(values), "unionedViewCode");

                return this;
            } // end else
        } // end andUnionedViewCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeBetween(String value1, String value2) {
            addCriterion("unionViewDefineA.CODE between", value1, value2,
                "unionedViewCode");

            return this;
        } // end andUnionedViewCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewCodeNotBetween(String value1,
            String value2) {
            addCriterion("unionViewDefineA.CODE not between", value1, value2,
                "unionedViewCode");

            return this;
        } // end andUnionedViewCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameIsNull() {
            addCriterion("unionViewDefineA.NAME is null");

            return this;
        } // end andUnionedViewNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameIsNotNull() {
            addCriterion("unionViewDefineA.NAME is not null");

            return this;
        } // end andUnionedViewNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameIsNotEmpty() {
            addCriterion(
                "unionViewDefineA.NAME is not null AND unionViewDefineA.NAME <> ''");

            return this;
        } // end andUnionedViewNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameIsEmpty() {
            addCriterion(
                "(unionViewDefineA.NAME is null OR unionViewDefineA.NAME = '')");

            return this;
        } // end andUnionedViewNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameEqualTo(String value) {
            addCriterion("unionViewDefineA.NAME =", value, "unionedViewName");

            return this;
        } // end andUnionedViewNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameNotEqualTo(String value) {
            addCriterion("unionViewDefineA.NAME <>", value, "unionedViewName");

            return this;
        } // end andUnionedViewNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameNotEqualToOrIsNull(String value) {
            addCriterion("unionViewDefineA.NAME is null OR unionViewDefineA.NAME <>",
                value, "unionedViewName");

            return this;
        } // end andUnionedViewNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameGreaterThan(String value) {
            addCriterion("unionViewDefineA.NAME >", value, "unionedViewName");

            return this;
        } // end andUnionedViewNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameGreaterThanOrEqualTo(String value) {
            addCriterion("unionViewDefineA.NAME >=", value, "unionedViewName");

            return this;
        } // end andUnionedViewNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameLessThan(String value) {
            addCriterion("unionViewDefineA.NAME <", value, "unionedViewName");

            return this;
        } // end andUnionedViewNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameLessThanOrEqualTo(String value) {
            addCriterion("unionViewDefineA.NAME <=", value, "unionedViewName");

            return this;
        } // end andUnionedViewNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("unionViewDefineA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUnionedViewNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("unionViewDefineA.NAME like", buffer.toString(),
                "unionedViewName");

            return this;
        } // end andUnionedViewNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("unionViewDefineA.NAME not like", buffer.toString(),
                "unionedViewName");

            return this;
        } // end andUnionedViewNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameIn(List values) {
            if (values.size() == 1) {
                return andUnionedViewNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("unionViewDefineA.NAME in", values,
                    "unionedViewName");

                return this;
            } // end else
        } // end andUnionedViewNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameNotIn(List values) {
            if (values.size() == 1) {
                return andUnionedViewNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("unionViewDefineA.NAME not in", values,
                    "unionedViewName");

                return this;
            } // end else
        } // end andUnionedViewNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameIn(Object[] values) {
            if (values.length == 1) {
                return andUnionedViewNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("unionViewDefineA.NAME in", Arrays.asList(values),
                    "unionedViewName");

                return this;
            } // end else
        } // end andUnionedViewNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andUnionedViewNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("unionViewDefineA.NAME not in",
                    Arrays.asList(values), "unionedViewName");

                return this;
            } // end else
        } // end andUnionedViewNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameBetween(String value1, String value2) {
            addCriterion("unionViewDefineA.NAME between", value1, value2,
                "unionedViewName");

            return this;
        } // end andUnionedViewNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUnionedViewNameNotBetween(String value1,
            String value2) {
            addCriterion("unionViewDefineA.NAME not between", value1, value2,
                "unionedViewName");

            return this;
        } // end andUnionedViewNameNotBetween()
    } // end Criteria
} // end ReportViewUnionDAOQueryBean
