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
 * Workspace query bean 2011-09-22 10:17:22
 *
 * @author Auto Gen
 */
public class WorkspaceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new WorkspaceDAOQueryBean object.
     */
    public WorkspaceDAOQueryBean() {
        super();
    } // end WorkspaceDAOQueryBean()

    /**
     * Creates a new WorkspaceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public WorkspaceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end WorkspaceDAOQueryBean()

    /**
     * Creates a new WorkspaceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public WorkspaceDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end WorkspaceDAOQueryBean()

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
            addSelectProperty(IWorkspaceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCreateDateSelectProperty() {
        addCreateDateSelectProperty("createDate");
    } // end addCreateDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCreateDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceDAO.CreateDate, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceDAO.CreateDate, "createDate");
        } // end else
    } // end addCreateDateSelectProperty()

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
            addSelectProperty(IWorkspaceDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

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
            addSelectProperty(IWorkspaceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWorkspacePathSelectProperty() {
        addWorkspacePathSelectProperty("workspacePath");
    } // end addWorkspacePathSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWorkspacePathSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceDAO.WorkspacePath, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceDAO.WorkspacePath, "workspacePath");
        } // end else
    } // end addWorkspacePathSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWorkspaceTypeSelectProperty() {
        addWorkspaceTypeSelectProperty("workspaceType");
    } // end addWorkspaceTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWorkspaceTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceDAO.WorkspaceType, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceDAO.WorkspaceType, "workspaceType");
        } // end else
    } // end addWorkspaceTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDescriptionSelectProperty() {
        addDescriptionSelectProperty("description");
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCreateDateSelectProperty();

        addNameSelectProperty();

        addStatusSelectProperty();

        addWorkspacePathSelectProperty();

        addWorkspaceTypeSelectProperty();

        addDescriptionSelectProperty();
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
            addCriterion("WORKSPACE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("WORKSPACE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("WORKSPACE.ID is not null AND WORKSPACE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(WORKSPACE.ID is null OR WORKSPACE.ID = '')");

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
            addCriterion("WORKSPACE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE.ID");
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
            addCriterion("WORKSPACE.ID <>", value, "id");

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
            addCriterion("WORKSPACE.ID is null OR WORKSPACE.ID <>", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE.ID");
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
            addCriterion("WORKSPACE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE.ID");
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
            addCriterion("WORKSPACE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE.ID");
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
            addCriterion("WORKSPACE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE.ID");
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
            addCriterion("WORKSPACE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE.ID");
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
                addCriterion("WORKSPACE.ID in", values, "id");

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
                addCriterion("WORKSPACE.ID not in", values, "id");

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
                addCriterion("WORKSPACE.ID in", values, "id");

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
                addCriterion("WORKSPACE.ID not in", values, "id");

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
                addCriterion("WORKSPACE.ID in", Arrays.asList(values), "id");

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
                addCriterion("WORKSPACE.ID not in", Arrays.asList(values), "id");

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
            addCriterion("WORKSPACE.ID between", value1, value2, "id");

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
            addCriterion("WORKSPACE.ID between", value1, value2, "id");

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
            addCriterion("WORKSPACE.ID not between", value1, value2, "id");

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
            addCriterion("WORKSPACE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNull() {
            addCriterion("WORKSPACE.CREATE_DATE is null");

            return this;
        } // end andCreateDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNotNull() {
            addCriterion("WORKSPACE.CREATE_DATE is not null");

            return this;
        } // end andCreateDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNotEmpty() {
            addCriterion(
                "WORKSPACE.CREATE_DATE is not null AND WORKSPACE.CREATE_DATE <> ''");

            return this;
        } // end andCreateDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsEmpty() {
            addCriterion(
                "(WORKSPACE.CREATE_DATE is null OR WORKSPACE.CREATE_DATE = '')");

            return this;
        } // end andCreateDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE =", value,
                "createDate");

            return this;
        } // end andCreateDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.CREATE_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE <>", value,
                "createDate");

            return this;
        } // end andCreateDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE is null OR WORKSPACE.CREATE_DATE <>",
                value, "createDate");

            return this;
        } // end andCreateDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.CREATE_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE >", value,
                "createDate");

            return this;
        } // end andCreateDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.CREATE_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE >=", value,
                "createDate");

            return this;
        } // end andCreateDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.CREATE_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE <", value,
                "createDate");

            return this;
        } // end andCreateDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.CREATE_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE <=", value,
                "createDate");

            return this;
        } // end andCreateDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.CREATE_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIn(List values) {
            if (values.size() == 1) {
                return andCreateDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("WORKSPACE.CREATE_DATE in", values,
                    "createDate");

                return this;
            } // end else
        } // end andCreateDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotIn(List values) {
            if (values.size() == 1) {
                return andCreateDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("WORKSPACE.CREATE_DATE not in", values,
                    "createDate");

                return this;
            } // end else
        } // end andCreateDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIn(Object[] values) {
            if (values.length == 1) {
                return andCreateDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("WORKSPACE.CREATE_DATE in",
                    Arrays.asList(values), "createDate");

                return this;
            } // end else
        } // end andCreateDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andCreateDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("WORKSPACE.CREATE_DATE not in",
                    Arrays.asList(values), "createDate");

                return this;
            } // end else
        } // end andCreateDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE between", value1,
                value2, "createDate");

            return this;
        } // end andCreateDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("WORKSPACE.CREATE_DATE not between",
                value1, value2, "createDate");

            return this;
        } // end andCreateDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("WORKSPACE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("WORKSPACE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion("WORKSPACE.NAME is not null AND WORKSPACE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion("(WORKSPACE.NAME is null OR WORKSPACE.NAME = '')");

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
            addCriterion("WORKSPACE.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE.NAME");
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
            addCriterion("WORKSPACE.NAME <>", value, "name");

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
            addCriterion("WORKSPACE.NAME is null OR WORKSPACE.NAME <>", value,
                "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE.NAME");
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
            addCriterion("WORKSPACE.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE.NAME");
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
            addCriterion("WORKSPACE.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE.NAME");
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
            addCriterion("WORKSPACE.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE.NAME");
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
            addCriterion("WORKSPACE.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE.NAME");
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
            addCriterion("WORKSPACE.NAME like", buffer.toString(), "name");

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
            addCriterion("WORKSPACE.NAME not like", buffer.toString(), "name");

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
                addCriterion("WORKSPACE.NAME in", values, "name");

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
                addCriterion("WORKSPACE.NAME not in", values, "name");

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
                addCriterion("WORKSPACE.NAME in", Arrays.asList(values), "name");

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
                addCriterion("WORKSPACE.NAME not in", Arrays.asList(values),
                    "name");

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
            addCriterion("WORKSPACE.NAME between", value1, value2, "name");

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
            addCriterion("WORKSPACE.NAME not between", value1, value2, "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("WORKSPACE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("WORKSPACE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "WORKSPACE.STATUS is not null AND WORKSPACE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion("(WORKSPACE.STATUS is null OR WORKSPACE.STATUS = '')");

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
            addCriterion("WORKSPACE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE.STATUS");
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
            addCriterion("WORKSPACE.STATUS <>", value, "status");

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
            addCriterion("WORKSPACE.STATUS is null OR WORKSPACE.STATUS <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE.STATUS");
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
            addCriterion("WORKSPACE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE.STATUS");
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
            addCriterion("WORKSPACE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE.STATUS");
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
            addCriterion("WORKSPACE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE.STATUS");
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
            addCriterion("WORKSPACE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE.STATUS");
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
            addCriterion("WORKSPACE.STATUS like", buffer.toString(), "status");

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
            addCriterion("WORKSPACE.STATUS not like", buffer.toString(),
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
                addCriterion("WORKSPACE.STATUS in", values, "status");

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
                addCriterion("WORKSPACE.STATUS not in", values, "status");

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
                addCriterion("WORKSPACE.STATUS in", Arrays.asList(values),
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
                addCriterion("WORKSPACE.STATUS not in", Arrays.asList(values),
                    "status");

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
            addCriterion("WORKSPACE.STATUS between", value1, value2, "status");

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
            addCriterion("WORKSPACE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsNull() {
            addCriterion("WORKSPACE.WORKSPACE_PATH is null");

            return this;
        } // end andWorkspacePathIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsNotNull() {
            addCriterion("WORKSPACE.WORKSPACE_PATH is not null");

            return this;
        } // end andWorkspacePathIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsNotEmpty() {
            addCriterion(
                "WORKSPACE.WORKSPACE_PATH is not null AND WORKSPACE.WORKSPACE_PATH <> ''");

            return this;
        } // end andWorkspacePathIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsEmpty() {
            addCriterion(
                "(WORKSPACE.WORKSPACE_PATH is null OR WORKSPACE.WORKSPACE_PATH = '')");

            return this;
        } // end andWorkspacePathIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_PATH =", value, "workspacePath");

            return this;
        } // end andWorkspacePathEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_PATH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspacePathEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathNotEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_PATH <>", value, "workspacePath");

            return this;
        } // end andWorkspacePathNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE.WORKSPACE_PATH is null OR WORKSPACE.WORKSPACE_PATH <>",
                value, "workspacePath");

            return this;
        } // end andWorkspacePathNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_PATH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspacePathNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathGreaterThan(String value) {
            addCriterion("WORKSPACE.WORKSPACE_PATH >", value, "workspacePath");

            return this;
        } // end andWorkspacePathGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_PATH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspacePathGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_PATH >=", value, "workspacePath");

            return this;
        } // end andWorkspacePathGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_PATH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspacePathGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathLessThan(String value) {
            addCriterion("WORKSPACE.WORKSPACE_PATH <", value, "workspacePath");

            return this;
        } // end andWorkspacePathLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_PATH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspacePathLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_PATH <=", value, "workspacePath");

            return this;
        } // end andWorkspacePathLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_PATH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspacePathLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE.WORKSPACE_PATH like", buffer.toString(),
                "workspacePath");

            return this;
        } // end andWorkspacePathLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE.WORKSPACE_PATH not like",
                buffer.toString(), "workspacePath");

            return this;
        } // end andWorkspacePathNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIn(List values) {
            if (values.size() == 1) {
                return andWorkspacePathEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_PATH in", values,
                    "workspacePath");

                return this;
            } // end else
        } // end andWorkspacePathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathNotIn(List values) {
            if (values.size() == 1) {
                return andWorkspacePathNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_PATH not in", values,
                    "workspacePath");

                return this;
            } // end else
        } // end andWorkspacePathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspacePathEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_PATH in",
                    Arrays.asList(values), "workspacePath");

                return this;
            } // end else
        } // end andWorkspacePathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathNotIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspacePathNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_PATH not in",
                    Arrays.asList(values), "workspacePath");

                return this;
            } // end else
        } // end andWorkspacePathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathBetween(String value1, String value2) {
            addCriterion("WORKSPACE.WORKSPACE_PATH between", value1, value2,
                "workspacePath");

            return this;
        } // end andWorkspacePathBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE.WORKSPACE_PATH not between", value1,
                value2, "workspacePath");

            return this;
        } // end andWorkspacePathNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeIsNull() {
            addCriterion("WORKSPACE.WORKSPACE_TYPE is null");

            return this;
        } // end andWorkspaceTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeIsNotNull() {
            addCriterion("WORKSPACE.WORKSPACE_TYPE is not null");

            return this;
        } // end andWorkspaceTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeIsNotEmpty() {
            addCriterion(
                "WORKSPACE.WORKSPACE_TYPE is not null AND WORKSPACE.WORKSPACE_TYPE <> ''");

            return this;
        } // end andWorkspaceTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeIsEmpty() {
            addCriterion(
                "(WORKSPACE.WORKSPACE_TYPE is null OR WORKSPACE.WORKSPACE_TYPE = '')");

            return this;
        } // end andWorkspaceTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE =", value, "workspaceType");

            return this;
        } // end andWorkspaceTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeNotEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE <>", value, "workspaceType");

            return this;
        } // end andWorkspaceTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE is null OR WORKSPACE.WORKSPACE_TYPE <>",
                value, "workspaceType");

            return this;
        } // end andWorkspaceTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeGreaterThan(String value) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE >", value, "workspaceType");

            return this;
        } // end andWorkspaceTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE >=", value, "workspaceType");

            return this;
        } // end andWorkspaceTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeLessThan(String value) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE <", value, "workspaceType");

            return this;
        } // end andWorkspaceTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE <=", value, "workspaceType");

            return this;
        } // end andWorkspaceTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.WORKSPACE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE.WORKSPACE_TYPE like", buffer.toString(),
                "workspaceType");

            return this;
        } // end andWorkspaceTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE.WORKSPACE_TYPE not like",
                buffer.toString(), "workspaceType");

            return this;
        } // end andWorkspaceTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_TYPE in", values,
                    "workspaceType");

                return this;
            } // end else
        } // end andWorkspaceTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeNotIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_TYPE not in", values,
                    "workspaceType");

                return this;
            } // end else
        } // end andWorkspaceTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_TYPE in",
                    Arrays.asList(values), "workspaceType");

                return this;
            } // end else
        } // end andWorkspaceTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE.WORKSPACE_TYPE not in",
                    Arrays.asList(values), "workspaceType");

                return this;
            } // end else
        } // end andWorkspaceTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeBetween(String value1, String value2) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE between", value1, value2,
                "workspaceType");

            return this;
        } // end andWorkspaceTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceTypeNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE.WORKSPACE_TYPE not between", value1,
                value2, "workspaceType");

            return this;
        } // end andWorkspaceTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("WORKSPACE.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("WORKSPACE.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "WORKSPACE.DESCRIPTION is not null AND WORKSPACE.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(WORKSPACE.DESCRIPTION is null OR WORKSPACE.DESCRIPTION = '')");

            return this;
        } // end andDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("WORKSPACE.DESCRIPTION =", value, "description");

            return this;
        } // end andDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("WORKSPACE.DESCRIPTION <>", value, "description");

            return this;
        } // end andDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE.DESCRIPTION is null OR WORKSPACE.DESCRIPTION <>",
                value, "description");

            return this;
        } // end andDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("WORKSPACE.DESCRIPTION >", value, "description");

            return this;
        } // end andDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE.DESCRIPTION >=", value, "description");

            return this;
        } // end andDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThan(String value) {
            addCriterion("WORKSPACE.DESCRIPTION <", value, "description");

            return this;
        } // end andDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE.DESCRIPTION <=", value, "description");

            return this;
        } // end andDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE.DESCRIPTION like", buffer.toString(),
                "description");

            return this;
        } // end andDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE.DESCRIPTION not like", buffer.toString(),
                "description");

            return this;
        } // end andDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(List values) {
            if (values.size() == 1) {
                return andDescriptionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE.DESCRIPTION in", values, "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andDescriptionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE.DESCRIPTION not in", values,
                    "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE.DESCRIPTION in", Arrays.asList(values),
                    "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE.DESCRIPTION not in",
                    Arrays.asList(values), "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("WORKSPACE.DESCRIPTION between", value1, value2,
                "description");

            return this;
        } // end andDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE.DESCRIPTION not between", value1, value2,
                "description");

            return this;
        } // end andDescriptionNotBetween()
    } // end Criteria
} // end WorkspaceDAOQueryBean
