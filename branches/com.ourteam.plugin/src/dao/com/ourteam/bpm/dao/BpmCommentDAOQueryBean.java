/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * BpmComment query bean 2011-12-02 13:52:02
 *
 * @author Auto Gen
 */
public class BpmCommentDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmCommentDAOQueryBean object.
     */
    public BpmCommentDAOQueryBean() {
        super();
    } // end BpmCommentDAOQueryBean()

    /**
     * Creates a new BpmCommentDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmCommentDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmCommentDAOQueryBean()

    /**
     * Creates a new BpmCommentDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmCommentDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmCommentDAOQueryBean()

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
            addSelectProperty(IBpmCommentDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmCommentDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAuthorDateSelectProperty() {
        addAuthorDateSelectProperty("authorDate");
    } // end addAuthorDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAuthorDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmCommentDAO.AuthorDate, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmCommentDAO.AuthorDate, "authorDate");
        } // end else
    } // end addAuthorDateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAuthorIdSelectProperty() {
        addAuthorIdSelectProperty("authorId");
    } // end addAuthorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAuthorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmCommentDAO.AuthorId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmCommentDAO.AuthorId, "authorId");
        } // end else
    } // end addAuthorIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCommentSelectProperty() {
        addCommentSelectProperty("comment");
    } // end addCommentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCommentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmCommentDAO.Comment, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmCommentDAO.Comment, "comment");
        } // end else
    } // end addCommentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessInstanceIdSelectProperty() {
        addProcessInstanceIdSelectProperty("processInstanceId");
    } // end addProcessInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmCommentDAO.ProcessInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmCommentDAO.ProcessInstanceId,
                "processInstanceId");
        } // end else
    } // end addProcessInstanceIdSelectProperty()

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
            addSelectProperty(IBpmCommentDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmCommentDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAuthorNameSelectProperty() {
        addAuthorNameSelectProperty("authorName");
    } // end addAuthorNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAuthorNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmCommentDAO.AuthorName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmCommentDAO.AuthorName, "authorName");
        } // end else
    } // end addAuthorNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addAuthorDateSelectProperty();

        addAuthorIdSelectProperty();

        addCommentSelectProperty();

        addProcessInstanceIdSelectProperty();

        addStatusSelectProperty();

        addAuthorNameSelectProperty();
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
            addCriterion("BPM_COMMENT.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_COMMENT.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("BPM_COMMENT.ID is not null AND BPM_COMMENT.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(BPM_COMMENT.ID is null OR BPM_COMMENT.ID = '')");

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
            addCriterion("BPM_COMMENT.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.ID");
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
            addCriterion("BPM_COMMENT.ID <>", value, "id");

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
            addCriterion("BPM_COMMENT.ID is null OR BPM_COMMENT.ID <>", value,
                "id");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.ID");
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
            addCriterion("BPM_COMMENT.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.ID");
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
            addCriterion("BPM_COMMENT.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.ID");
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
            addCriterion("BPM_COMMENT.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.ID");
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
            addCriterion("BPM_COMMENT.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.ID");
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
                addCriterion("BPM_COMMENT.ID in", values, "id");

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
                addCriterion("BPM_COMMENT.ID not in", values, "id");

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
                addCriterion("BPM_COMMENT.ID in", values, "id");

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
                addCriterion("BPM_COMMENT.ID not in", values, "id");

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
                addCriterion("BPM_COMMENT.ID in", Arrays.asList(values), "id");

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
                addCriterion("BPM_COMMENT.ID not in", Arrays.asList(values),
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
            addCriterion("BPM_COMMENT.ID between", value1, value2, "id");

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
            addCriterion("BPM_COMMENT.ID between", value1, value2, "id");

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
            addCriterion("BPM_COMMENT.ID not between", value1, value2, "id");

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
            addCriterion("BPM_COMMENT.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateIsNull() {
            addCriterion("BPM_COMMENT.AUTHOR_DATE is null");

            return this;
        } // end andAuthorDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateIsNotNull() {
            addCriterion("BPM_COMMENT.AUTHOR_DATE is not null");

            return this;
        } // end andAuthorDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateIsNotEmpty() {
            addCriterion(
                "BPM_COMMENT.AUTHOR_DATE is not null AND BPM_COMMENT.AUTHOR_DATE <> ''");

            return this;
        } // end andAuthorDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateIsEmpty() {
            addCriterion(
                "(BPM_COMMENT.AUTHOR_DATE is null OR BPM_COMMENT.AUTHOR_DATE = '')");

            return this;
        } // end andAuthorDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE =", value,
                "authorDate");

            return this;
        } // end andAuthorDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE <>", value,
                "authorDate");

            return this;
        } // end andAuthorDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE is null OR BPM_COMMENT.AUTHOR_DATE <>",
                value, "authorDate");

            return this;
        } // end andAuthorDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE >", value,
                "authorDate");

            return this;
        } // end andAuthorDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE >=", value,
                "authorDate");

            return this;
        } // end andAuthorDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE <", value,
                "authorDate");

            return this;
        } // end andAuthorDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE <=", value,
                "authorDate");

            return this;
        } // end andAuthorDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateIn(List values) {
            if (values.size() == 1) {
                return andAuthorDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE in", values,
                    "authorDate");

                return this;
            } // end else
        } // end andAuthorDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateNotIn(List values) {
            if (values.size() == 1) {
                return andAuthorDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE not in",
                    values, "authorDate");

                return this;
            } // end else
        } // end andAuthorDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateIn(Object[] values) {
            if (values.length == 1) {
                return andAuthorDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE in",
                    Arrays.asList(values), "authorDate");

                return this;
            } // end else
        } // end andAuthorDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andAuthorDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE not in",
                    Arrays.asList(values), "authorDate");

                return this;
            } // end else
        } // end andAuthorDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE between", value1,
                value2, "authorDate");

            return this;
        } // end andAuthorDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_COMMENT.AUTHOR_DATE not between",
                value1, value2, "authorDate");

            return this;
        } // end andAuthorDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdIsNull() {
            addCriterion("BPM_COMMENT.AUTHOR_ID is null");

            return this;
        } // end andAuthorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdIsNotNull() {
            addCriterion("BPM_COMMENT.AUTHOR_ID is not null");

            return this;
        } // end andAuthorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdIsNotEmpty() {
            addCriterion(
                "BPM_COMMENT.AUTHOR_ID is not null AND BPM_COMMENT.AUTHOR_ID <> ''");

            return this;
        } // end andAuthorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdIsEmpty() {
            addCriterion(
                "(BPM_COMMENT.AUTHOR_ID is null OR BPM_COMMENT.AUTHOR_ID = '')");

            return this;
        } // end andAuthorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdEqualTo(long value) {
            return andAuthorIdEqualTo(Long.valueOf(value));
        } // end andAuthorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_COMMENT.AUTHOR_ID =", value, "authorId");

            return this;
        } // end andAuthorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotEqualTo(long value) {
            return andAuthorIdNotEqualTo(Long.valueOf(value));
        } // end andAuthorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_COMMENT.AUTHOR_ID <>", value, "authorId");

            return this;
        } // end andAuthorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotEqualToOrIsNull(long value) {
            return andAuthorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andAuthorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_COMMENT.AUTHOR_ID is null OR BPM_COMMENT.AUTHOR_ID <>",
                value, "authorId");

            return this;
        } // end andAuthorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdGreaterThan(long value) {
            return andAuthorIdGreaterThan(Long.valueOf(value));
        } // end andAuthorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_COMMENT.AUTHOR_ID >", value, "authorId");

            return this;
        } // end andAuthorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdGreaterThanOrEqualTo(long value) {
            return andAuthorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andAuthorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_COMMENT.AUTHOR_ID >=", value, "authorId");

            return this;
        } // end andAuthorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdLessThan(long value) {
            return andAuthorIdLessThan(Long.valueOf(value));
        } // end andAuthorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdLessThan(java.lang.Long value) {
            addCriterion("BPM_COMMENT.AUTHOR_ID <", value, "authorId");

            return this;
        } // end andAuthorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdLessThanOrEqualTo(long value) {
            return andAuthorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andAuthorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_COMMENT.AUTHOR_ID <=", value, "authorId");

            return this;
        } // end andAuthorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.AUTHOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdIn(long[] values) {
            if (values.length == 1) {
                return andAuthorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.AUTHOR_ID in", values, "authorId");

                return this;
            } // end else
        } // end andAuthorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andAuthorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.AUTHOR_ID not in", values, "authorId");

                return this;
            } // end else
        } // end andAuthorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdIn(List values) {
            if (values.size() == 1) {
                return andAuthorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_COMMENT.AUTHOR_ID in", values, "authorId");

                return this;
            } // end else
        } // end andAuthorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotIn(List values) {
            if (values.size() == 1) {
                return andAuthorIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_COMMENT.AUTHOR_ID not in", values, "authorId");

                return this;
            } // end else
        } // end andAuthorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdIn(Object[] values) {
            if (values.length == 1) {
                return andAuthorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.AUTHOR_ID in", Arrays.asList(values),
                    "authorId");

                return this;
            } // end else
        } // end andAuthorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andAuthorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.AUTHOR_ID not in",
                    Arrays.asList(values), "authorId");

                return this;
            } // end else
        } // end andAuthorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdBetween(long value1, long value2) {
            addCriterion("BPM_COMMENT.AUTHOR_ID between", value1, value2,
                "authorId");

            return this;
        } // end andAuthorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_COMMENT.AUTHOR_ID between", value1, value2,
                "authorId");

            return this;
        } // end andAuthorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotBetween(long value1, long value2) {
            addCriterion("BPM_COMMENT.AUTHOR_ID not between", value1, value2,
                "authorId");

            return this;
        } // end andAuthorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_COMMENT.AUTHOR_ID not between", value1, value2,
                "authorId");

            return this;
        } // end andAuthorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentIsNull() {
            addCriterion("BPM_COMMENT.COMMENT is null");

            return this;
        } // end andCommentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentIsNotNull() {
            addCriterion("BPM_COMMENT.COMMENT is not null");

            return this;
        } // end andCommentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentIsNotEmpty() {
            addCriterion(
                "BPM_COMMENT.COMMENT is not null AND BPM_COMMENT.COMMENT <> ''");

            return this;
        } // end andCommentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentIsEmpty() {
            addCriterion(
                "(BPM_COMMENT.COMMENT is null OR BPM_COMMENT.COMMENT = '')");

            return this;
        } // end andCommentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentEqualTo(String value) {
            addCriterion("BPM_COMMENT.COMMENT =", value, "comment");

            return this;
        } // end andCommentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.COMMENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("BPM_COMMENT.COMMENT <>", value, "comment");

            return this;
        } // end andCommentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentNotEqualToOrIsNull(String value) {
            addCriterion("BPM_COMMENT.COMMENT is null OR BPM_COMMENT.COMMENT <>",
                value, "comment");

            return this;
        } // end andCommentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.COMMENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentGreaterThan(String value) {
            addCriterion("BPM_COMMENT.COMMENT >", value, "comment");

            return this;
        } // end andCommentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.COMMENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_COMMENT.COMMENT >=", value, "comment");

            return this;
        } // end andCommentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.COMMENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentLessThan(String value) {
            addCriterion("BPM_COMMENT.COMMENT <", value, "comment");

            return this;
        } // end andCommentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.COMMENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("BPM_COMMENT.COMMENT <=", value, "comment");

            return this;
        } // end andCommentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_COMMENT.COMMENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCommentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_COMMENT.COMMENT like", buffer.toString(),
                "comment");

            return this;
        } // end andCommentLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_COMMENT.COMMENT not like", buffer.toString(),
                "comment");

            return this;
        } // end andCommentNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentIn(List values) {
            if (values.size() == 1) {
                return andCommentEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_COMMENT.COMMENT in", values, "comment");

                return this;
            } // end else
        } // end andCommentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentNotIn(List values) {
            if (values.size() == 1) {
                return andCommentNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_COMMENT.COMMENT not in", values, "comment");

                return this;
            } // end else
        } // end andCommentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentIn(Object[] values) {
            if (values.length == 1) {
                return andCommentEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.COMMENT in", Arrays.asList(values),
                    "comment");

                return this;
            } // end else
        } // end andCommentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentNotIn(Object[] values) {
            if (values.length == 1) {
                return andCommentNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.COMMENT not in",
                    Arrays.asList(values), "comment");

                return this;
            } // end else
        } // end andCommentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("BPM_COMMENT.COMMENT between", value1, value2,
                "comment");

            return this;
        } // end andCommentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("BPM_COMMENT.COMMENT not between", value1, value2,
                "comment");

            return this;
        } // end andCommentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID is null");

            return this;
        } // end andProcessInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID is not null");

            return this;
        } // end andProcessInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotEmpty() {
            addCriterion(
                "BPM_COMMENT.PROCESS_INSTANCE_ID is not null AND BPM_COMMENT.PROCESS_INSTANCE_ID <> ''");

            return this;
        } // end andProcessInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsEmpty() {
            addCriterion(
                "(BPM_COMMENT.PROCESS_INSTANCE_ID is null OR BPM_COMMENT.PROCESS_INSTANCE_ID = '')");

            return this;
        } // end andProcessInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualTo(long value) {
            return andProcessInstanceIdEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID =", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_COMMENT.PROCESS_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualTo(long value) {
            return andProcessInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID <>", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToOrIsNull(long value) {
            return andProcessInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProcessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID is null OR BPM_COMMENT.PROCESS_INSTANCE_ID <>",
                value, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_COMMENT.PROCESS_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThan(long value) {
            return andProcessInstanceIdGreaterThan(Long.valueOf(value));
        } // end andProcessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID >", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_COMMENT.PROCESS_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(long value) {
            return andProcessInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID >=", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_COMMENT.PROCESS_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThan(long value) {
            return andProcessInstanceIdLessThan(Long.valueOf(value));
        } // end andProcessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThan(java.lang.Long value) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID <", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_COMMENT.PROCESS_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualTo(long value) {
            return andProcessInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID <=", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_COMMENT.PROCESS_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID not in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andProcessInstanceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andProcessInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID not in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID in",
                    Arrays.asList(values), "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID not in",
                    Arrays.asList(values), "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdBetween(long value1, long value2) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotBetween(long value1, long value2) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID not between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_COMMENT.PROCESS_INSTANCE_ID not between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_COMMENT.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_COMMENT.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_COMMENT.STATUS is not null AND BPM_COMMENT.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_COMMENT.STATUS is null OR BPM_COMMENT.STATUS = '')");

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
            addCriterion("BPM_COMMENT.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.STATUS");
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
            addCriterion("BPM_COMMENT.STATUS <>", value, "status");

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
            addCriterion("BPM_COMMENT.STATUS is null OR BPM_COMMENT.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_COMMENT.STATUS");
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
            addCriterion("BPM_COMMENT.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.STATUS");
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
            addCriterion("BPM_COMMENT.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.STATUS");
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
            addCriterion("BPM_COMMENT.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.STATUS");
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
            addCriterion("BPM_COMMENT.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_COMMENT.STATUS");
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
            addCriterion("BPM_COMMENT.STATUS like", buffer.toString(), "status");

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
            addCriterion("BPM_COMMENT.STATUS not like", buffer.toString(),
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
                addCriterion("BPM_COMMENT.STATUS in", values, "status");

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
                addCriterion("BPM_COMMENT.STATUS not in", values, "status");

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
                addCriterion("BPM_COMMENT.STATUS in", Arrays.asList(values),
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
                addCriterion("BPM_COMMENT.STATUS not in",
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
            addCriterion("BPM_COMMENT.STATUS between", value1, value2, "status");

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
            addCriterion("BPM_COMMENT.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameIsNull() {
            addCriterion("authorA.NAME is null");

            return this;
        } // end andAuthorNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameIsNotNull() {
            addCriterion("authorA.NAME is not null");

            return this;
        } // end andAuthorNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameIsNotEmpty() {
            addCriterion("authorA.NAME is not null AND authorA.NAME <> ''");

            return this;
        } // end andAuthorNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameIsEmpty() {
            addCriterion("(authorA.NAME is null OR authorA.NAME = '')");

            return this;
        } // end andAuthorNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("authorA.NAME =", value, "authorName");

            return this;
        } // end andAuthorNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("authorA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("authorA.NAME <>", value, "authorName");

            return this;
        } // end andAuthorNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameNotEqualToOrIsNull(String value) {
            addCriterion("authorA.NAME is null OR authorA.NAME <>", value,
                "authorName");

            return this;
        } // end andAuthorNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("authorA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("authorA.NAME >", value, "authorName");

            return this;
        } // end andAuthorNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("authorA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("authorA.NAME >=", value, "authorName");

            return this;
        } // end andAuthorNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("authorA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("authorA.NAME <", value, "authorName");

            return this;
        } // end andAuthorNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("authorA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("authorA.NAME <=", value, "authorName");

            return this;
        } // end andAuthorNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("authorA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAuthorNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("authorA.NAME like", buffer.toString(), "authorName");

            return this;
        } // end andAuthorNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("authorA.NAME not like", buffer.toString(),
                "authorName");

            return this;
        } // end andAuthorNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameIn(List values) {
            if (values.size() == 1) {
                return andAuthorNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("authorA.NAME in", values, "authorName");

                return this;
            } // end else
        } // end andAuthorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameNotIn(List values) {
            if (values.size() == 1) {
                return andAuthorNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("authorA.NAME not in", values, "authorName");

                return this;
            } // end else
        } // end andAuthorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameIn(Object[] values) {
            if (values.length == 1) {
                return andAuthorNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("authorA.NAME in", Arrays.asList(values),
                    "authorName");

                return this;
            } // end else
        } // end andAuthorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andAuthorNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("authorA.NAME not in", Arrays.asList(values),
                    "authorName");

                return this;
            } // end else
        } // end andAuthorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("authorA.NAME between", value1, value2, "authorName");

            return this;
        } // end andAuthorNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("authorA.NAME not between", value1, value2,
                "authorName");

            return this;
        } // end andAuthorNameNotBetween()
    } // end Criteria
} // end BpmCommentDAOQueryBean
