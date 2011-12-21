/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * ProjectWorkspaceRelate query bean 2011-09-22 10:17:22
 *
 * @author Auto Gen
 */
public class ProjectWorkspaceRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ProjectWorkspaceRelateDAOQueryBean object.
     */
    public ProjectWorkspaceRelateDAOQueryBean() {
        super();
    } // end ProjectWorkspaceRelateDAOQueryBean()

    /**
     * Creates a new ProjectWorkspaceRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ProjectWorkspaceRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ProjectWorkspaceRelateDAOQueryBean()

    /**
     * Creates a new ProjectWorkspaceRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ProjectWorkspaceRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ProjectWorkspaceRelateDAOQueryBean()

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
            addSelectProperty(IProjectWorkspaceRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectWorkspaceRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProjectIdSelectProperty() {
        addProjectIdSelectProperty("projectId");
    } // end addProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProjectWorkspaceRelateDAO.ProjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectWorkspaceRelateDAO.ProjectId, "projectId");
        } // end else
    } // end addProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWorkspaceIdSelectProperty() {
        addWorkspaceIdSelectProperty("workspaceId");
    } // end addWorkspaceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWorkspaceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProjectWorkspaceRelateDAO.WorkspaceId, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectWorkspaceRelateDAO.WorkspaceId,
                "workspaceId");
        } // end else
    } // end addWorkspaceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addProjectIdSelectProperty();

        addWorkspaceIdSelectProperty();
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("PROJECT_WORKSPACE_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "PROJECT_WORKSPACE_RELATE.ID is not null AND PROJECT_WORKSPACE_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(PROJECT_WORKSPACE_RELATE.ID is null OR PROJECT_WORKSPACE_RELATE.ID = '')");

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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_WORKSPACE_RELATE.ID");
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID <>", value, "id");

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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID is null OR PROJECT_WORKSPACE_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("PROJECT_WORKSPACE_RELATE.ID");
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_WORKSPACE_RELATE.ID");
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_WORKSPACE_RELATE.ID");
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_WORKSPACE_RELATE.ID");
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_WORKSPACE_RELATE.ID");
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
                addCriterion("PROJECT_WORKSPACE_RELATE.ID in", values, "id");

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
                addCriterion("PROJECT_WORKSPACE_RELATE.ID not in", values, "id");

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
                addCriterion("PROJECT_WORKSPACE_RELATE.ID in", values, "id");

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
                addCriterion("PROJECT_WORKSPACE_RELATE.ID not in", values, "id");

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
                addCriterion("PROJECT_WORKSPACE_RELATE.ID in",
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
                addCriterion("PROJECT_WORKSPACE_RELATE.ID not in",
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID between", value1, value2,
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID between", value1, value2,
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID not between", value1,
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
            addCriterion("PROJECT_WORKSPACE_RELATE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID is null");

            return this;
        } // end andProjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID is not null");

            return this;
        } // end andProjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNotEmpty() {
            addCriterion(
                "PROJECT_WORKSPACE_RELATE.PROJECT_ID is not null AND PROJECT_WORKSPACE_RELATE.PROJECT_ID <> ''");

            return this;
        } // end andProjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsEmpty() {
            addCriterion(
                "(PROJECT_WORKSPACE_RELATE.PROJECT_ID is null OR PROJECT_WORKSPACE_RELATE.PROJECT_ID = '')");

            return this;
        } // end andProjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualTo(long value) {
            return andProjectIdEqualTo(Long.valueOf(value));
        } // end andProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID =", value,
                "projectId");

            return this;
        } // end andProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.PROJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualTo(long value) {
            return andProjectIdNotEqualTo(Long.valueOf(value));
        } // end andProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID <>", value,
                "projectId");

            return this;
        } // end andProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToOrIsNull(long value) {
            return andProjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID is null OR PROJECT_WORKSPACE_RELATE.PROJECT_ID <>",
                value, "projectId");

            return this;
        } // end andProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.PROJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThan(long value) {
            return andProjectIdGreaterThan(Long.valueOf(value));
        } // end andProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThan(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID >", value,
                "projectId");

            return this;
        } // end andProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.PROJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualTo(long value) {
            return andProjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID >=", value,
                "projectId");

            return this;
        } // end andProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.PROJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThan(long value) {
            return andProjectIdLessThan(Long.valueOf(value));
        } // end andProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThan(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID <", value,
                "projectId");

            return this;
        } // end andProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.PROJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualTo(long value) {
            return andProjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID <=", value,
                "projectId");

            return this;
        } // end andProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.PROJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(long[] values) {
            if (values.length == 1) {
                return andProjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID not in",
                    values, "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(List values) {
            if (values.size() == 1) {
                return andProjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andProjectIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID not in",
                    values, "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andProjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID in",
                    Arrays.asList(values), "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID not in",
                    Arrays.asList(values), "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdBetween(long value1, long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID between", value1,
                value2, "projectId");

            return this;
        } // end andProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID between", value1,
                value2, "projectId");

            return this;
        } // end andProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotBetween(long value1, long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID not between",
                value1, value2, "projectId");

            return this;
        } // end andProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.PROJECT_ID not between",
                value1, value2, "projectId");

            return this;
        } // end andProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNull() {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID is null");

            return this;
        } // end andWorkspaceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNotNull() {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID is not null");

            return this;
        } // end andWorkspaceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNotEmpty() {
            addCriterion(
                "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID is not null AND PROJECT_WORKSPACE_RELATE.WORKSPACE_ID <> ''");

            return this;
        } // end andWorkspaceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsEmpty() {
            addCriterion(
                "(PROJECT_WORKSPACE_RELATE.WORKSPACE_ID is null OR PROJECT_WORKSPACE_RELATE.WORKSPACE_ID = '')");

            return this;
        } // end andWorkspaceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdEqualTo(long value) {
            return andWorkspaceIdEqualTo(Long.valueOf(value));
        } // end andWorkspaceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID =", value,
                "workspaceId");

            return this;
        } // end andWorkspaceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotEqualTo(long value) {
            return andWorkspaceIdNotEqualTo(Long.valueOf(value));
        } // end andWorkspaceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID <>", value,
                "workspaceId");

            return this;
        } // end andWorkspaceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotEqualToOrIsNull(long value) {
            return andWorkspaceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andWorkspaceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID is null OR PROJECT_WORKSPACE_RELATE.WORKSPACE_ID <>",
                value, "workspaceId");

            return this;
        } // end andWorkspaceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdGreaterThan(long value) {
            return andWorkspaceIdGreaterThan(Long.valueOf(value));
        } // end andWorkspaceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdGreaterThan(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID >", value,
                "workspaceId");

            return this;
        } // end andWorkspaceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdGreaterThanOrEqualTo(long value) {
            return andWorkspaceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andWorkspaceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID >=", value,
                "workspaceId");

            return this;
        } // end andWorkspaceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdLessThan(long value) {
            return andWorkspaceIdLessThan(Long.valueOf(value));
        } // end andWorkspaceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdLessThan(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID <", value,
                "workspaceId");

            return this;
        } // end andWorkspaceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdLessThanOrEqualTo(long value) {
            return andWorkspaceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andWorkspaceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID <=", value,
                "workspaceId");

            return this;
        } // end andWorkspaceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIn(long[] values) {
            if (values.length == 1) {
                return andWorkspaceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID in",
                    values, "workspaceId");

                return this;
            } // end else
        } // end andWorkspaceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andWorkspaceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID not in",
                    values, "workspaceId");

                return this;
            } // end else
        } // end andWorkspaceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID in",
                    values, "workspaceId");

                return this;
            } // end else
        } // end andWorkspaceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID not in",
                    values, "workspaceId");

                return this;
            } // end else
        } // end andWorkspaceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID in",
                    Arrays.asList(values), "workspaceId");

                return this;
            } // end else
        } // end andWorkspaceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID not in",
                    Arrays.asList(values), "workspaceId");

                return this;
            } // end else
        } // end andWorkspaceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdBetween(long value1, long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID between",
                value1, value2, "workspaceId");

            return this;
        } // end andWorkspaceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID between",
                value1, value2, "workspaceId");

            return this;
        } // end andWorkspaceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotBetween(long value1, long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID not between",
                value1, value2, "workspaceId");

            return this;
        } // end andWorkspaceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_WORKSPACE_RELATE.WORKSPACE_ID not between",
                value1, value2, "workspaceId");

            return this;
        } // end andWorkspaceIdNotBetween()
    } // end Criteria
} // end ProjectWorkspaceRelateDAOQueryBean
