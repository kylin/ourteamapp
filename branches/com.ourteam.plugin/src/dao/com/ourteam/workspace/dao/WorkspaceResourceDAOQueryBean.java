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
 * WorkspaceResource query bean 2011-09-22 10:17:24
 *
 * @author Auto Gen
 */
public class WorkspaceResourceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new WorkspaceResourceDAOQueryBean object.
     */
    public WorkspaceResourceDAOQueryBean() {
        super();
    } // end WorkspaceResourceDAOQueryBean()

    /**
     * Creates a new WorkspaceResourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public WorkspaceResourceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end WorkspaceResourceDAOQueryBean()

    /**
     * Creates a new WorkspaceResourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public WorkspaceResourceDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end WorkspaceResourceDAOQueryBean()

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
            addSelectProperty(IWorkspaceResourceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(IWorkspaceResourceDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addOrderIndexSelectProperty() {
        addOrderIndexSelectProperty("orderIndex");
    } // end addOrderIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addOrderIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceDAO.OrderIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.OrderIndex, "orderIndex");
        } // end else
    } // end addOrderIndexSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePathSelectProperty() {
        addResourcePathSelectProperty("resourcePath");
    } // end addResourcePathSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePathSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceDAO.ResourcePath, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.ResourcePath, "resourcePath");
        } // end else
    } // end addResourcePathSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceTypeSelectProperty() {
        addResourceTypeSelectProperty("resourceType");
    } // end addResourceTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceDAO.ResourceType, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.ResourceType, "resourceType");
        } // end else
    } // end addResourceTypeSelectProperty()

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
            addSelectProperty(IWorkspaceResourceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(IWorkspaceResourceDAO.WorkspaceId, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.WorkspaceId, "workspaceId");
        } // end else
    } // end addWorkspaceIdSelectProperty()

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
            addSelectProperty(IWorkspaceResourceDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

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
            addSelectProperty(IWorkspaceResourceDAO.WorkspacePath, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.WorkspacePath,
                "workspacePath");
        } // end else
    } // end addWorkspacePathSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWorkspaceNameSelectProperty() {
        addWorkspaceNameSelectProperty("workspaceName");
    } // end addWorkspaceNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWorkspaceNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceDAO.WorkspaceName, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceDAO.WorkspaceName,
                "workspaceName");
        } // end else
    } // end addWorkspaceNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDescriptionSelectProperty();

        addOrderIndexSelectProperty();

        addResourcePathSelectProperty();

        addResourceTypeSelectProperty();

        addStatusSelectProperty();

        addWorkspaceIdSelectProperty();

        addNameSelectProperty();

        addWorkspacePathSelectProperty();

        addWorkspaceNameSelectProperty();
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
            addCriterion("WORKSPACE_RESOURCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.ID is not null AND WORKSPACE_RESOURCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.ID is null OR WORKSPACE_RESOURCE.ID = '')");

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
            addCriterion("WORKSPACE_RESOURCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.ID");
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
            addCriterion("WORKSPACE_RESOURCE.ID <>", value, "id");

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
            addCriterion("WORKSPACE_RESOURCE.ID is null OR WORKSPACE_RESOURCE.ID <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.ID");
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
            addCriterion("WORKSPACE_RESOURCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.ID");
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
            addCriterion("WORKSPACE_RESOURCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.ID");
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
            addCriterion("WORKSPACE_RESOURCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.ID");
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
            addCriterion("WORKSPACE_RESOURCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.ID");
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
                addCriterion("WORKSPACE_RESOURCE.ID in", values, "id");

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
                addCriterion("WORKSPACE_RESOURCE.ID not in", values, "id");

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
                addCriterion("WORKSPACE_RESOURCE.ID in", values, "id");

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
                addCriterion("WORKSPACE_RESOURCE.ID not in", values, "id");

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
                addCriterion("WORKSPACE_RESOURCE.ID in", Arrays.asList(values),
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
                addCriterion("WORKSPACE_RESOURCE.ID not in",
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
            addCriterion("WORKSPACE_RESOURCE.ID between", value1, value2, "id");

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
            addCriterion("WORKSPACE_RESOURCE.ID between", value1, value2, "id");

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
            addCriterion("WORKSPACE_RESOURCE.ID not between", value1, value2,
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
            addCriterion("WORKSPACE_RESOURCE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.DESCRIPTION is not null AND WORKSPACE_RESOURCE.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.DESCRIPTION is null OR WORKSPACE_RESOURCE.DESCRIPTION = '')");

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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION =", value,
                "description");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.DESCRIPTION");
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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION <>", value,
                "description");

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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION is null OR WORKSPACE_RESOURCE.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.DESCRIPTION");
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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION >", value,
                "description");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.DESCRIPTION");
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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION >=", value,
                "description");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.DESCRIPTION");
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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION <", value,
                "description");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.DESCRIPTION");
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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION <=", value,
                "description");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.DESCRIPTION");
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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION like",
                buffer.toString(), "description");

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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION not like",
                buffer.toString(), "description");

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
                addCriterion("WORKSPACE_RESOURCE.DESCRIPTION in", values,
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
        public Criteria andDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andDescriptionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.DESCRIPTION not in", values,
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
                addCriterion("WORKSPACE_RESOURCE.DESCRIPTION in",
                    Arrays.asList(values), "description");

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
                addCriterion("WORKSPACE_RESOURCE.DESCRIPTION not in",
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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION between", value1,
                value2, "description");

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
            addCriterion("WORKSPACE_RESOURCE.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNull() {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX is null");

            return this;
        } // end andOrderIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX is not null");

            return this;
        } // end andOrderIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.ORDER_INDEX is not null AND WORKSPACE_RESOURCE.ORDER_INDEX <> ''");

            return this;
        } // end andOrderIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.ORDER_INDEX is null OR WORKSPACE_RESOURCE.ORDER_INDEX = '')");

            return this;
        } // end andOrderIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexEqualTo(int value) {
            return andOrderIndexEqualTo(Integer.valueOf(value));
        } // end andOrderIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexEqualTo(java.lang.Integer value) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX =", value, "orderIndex");

            return this;
        } // end andOrderIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.ORDER_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualTo(int value) {
            return andOrderIndexNotEqualTo(Integer.valueOf(value));
        } // end andOrderIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualTo(java.lang.Integer value) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX <>", value,
                "orderIndex");

            return this;
        } // end andOrderIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualToOrIsNull(int value) {
            return andOrderIndexNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andOrderIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX is null OR WORKSPACE_RESOURCE.ORDER_INDEX <>",
                value, "orderIndex");

            return this;
        } // end andOrderIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.ORDER_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThan(int value) {
            return andOrderIndexGreaterThan(Integer.valueOf(value));
        } // end andOrderIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThan(java.lang.Integer value) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX >", value, "orderIndex");

            return this;
        } // end andOrderIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.ORDER_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThanOrEqualTo(int value) {
            return andOrderIndexGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andOrderIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX >=", value,
                "orderIndex");

            return this;
        } // end andOrderIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.ORDER_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThan(int value) {
            return andOrderIndexLessThan(Integer.valueOf(value));
        } // end andOrderIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThan(java.lang.Integer value) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX <", value, "orderIndex");

            return this;
        } // end andOrderIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.ORDER_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThanOrEqualTo(int value) {
            return andOrderIndexLessThanOrEqualTo(Integer.valueOf(value));
        } // end andOrderIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX <=", value,
                "orderIndex");

            return this;
        } // end andOrderIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.ORDER_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIn(int[] values) {
            if (values.length == 1) {
                return andOrderIndexEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX in", values,
                    "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotIn(int[] values) {
            if (values.length == 1) {
                return andOrderIndexNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX not in", values,
                    "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIn(List values) {
            if (values.size() == 1) {
                return andOrderIndexEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX in", values,
                    "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotIn(List values) {
            if (values.size() == 1) {
                return andOrderIndexNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX not in", values,
                    "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIn(Object[] values) {
            if (values.length == 1) {
                return andOrderIndexEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX in",
                    Arrays.asList(values), "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andOrderIndexNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX not in",
                    Arrays.asList(values), "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexBetween(int value1, int value2) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX between", value1,
                value2, "orderIndex");

            return this;
        } // end andOrderIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX between", value1,
                value2, "orderIndex");

            return this;
        } // end andOrderIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotBetween(int value1, int value2) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX not between", value1,
                value2, "orderIndex");

            return this;
        } // end andOrderIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("WORKSPACE_RESOURCE.ORDER_INDEX not between", value1,
                value2, "orderIndex");

            return this;
        } // end andOrderIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathIsNull() {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH is null");

            return this;
        } // end andResourcePathIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH is not null");

            return this;
        } // end andResourcePathIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.RESOURCE_PATH is not null AND WORKSPACE_RESOURCE.RESOURCE_PATH <> ''");

            return this;
        } // end andResourcePathIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.RESOURCE_PATH is null OR WORKSPACE_RESOURCE.RESOURCE_PATH = '')");

            return this;
        } // end andResourcePathIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH =", value,
                "resourcePath");

            return this;
        } // end andResourcePathEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_PATH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePathEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathNotEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH <>", value,
                "resourcePath");

            return this;
        } // end andResourcePathNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH is null OR WORKSPACE_RESOURCE.RESOURCE_PATH <>",
                value, "resourcePath");

            return this;
        } // end andResourcePathNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_PATH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePathNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathGreaterThan(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH >", value,
                "resourcePath");

            return this;
        } // end andResourcePathGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_PATH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePathGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH >=", value,
                "resourcePath");

            return this;
        } // end andResourcePathGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_PATH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePathGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathLessThan(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH <", value,
                "resourcePath");

            return this;
        } // end andResourcePathLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_PATH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePathLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH <=", value,
                "resourcePath");

            return this;
        } // end andResourcePathLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_PATH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePathLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH like",
                buffer.toString(), "resourcePath");

            return this;
        } // end andResourcePathLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH not like",
                buffer.toString(), "resourcePath");

            return this;
        } // end andResourcePathNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathIn(List values) {
            if (values.size() == 1) {
                return andResourcePathEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH in", values,
                    "resourcePath");

                return this;
            } // end else
        } // end andResourcePathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePathNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH not in", values,
                    "resourcePath");

                return this;
            } // end else
        } // end andResourcePathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePathEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH in",
                    Arrays.asList(values), "resourcePath");

                return this;
            } // end else
        } // end andResourcePathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePathNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH not in",
                    Arrays.asList(values), "resourcePath");

                return this;
            } // end else
        } // end andResourcePathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathBetween(String value1, String value2) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH between", value1,
                value2, "resourcePath");

            return this;
        } // end andResourcePathBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePathNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_PATH not between",
                value1, value2, "resourcePath");

            return this;
        } // end andResourcePathNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIsNull() {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE is null");

            return this;
        } // end andResourceTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE is not null");

            return this;
        } // end andResourceTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.RESOURCE_TYPE is not null AND WORKSPACE_RESOURCE.RESOURCE_TYPE <> ''");

            return this;
        } // end andResourceTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.RESOURCE_TYPE is null OR WORKSPACE_RESOURCE.RESOURCE_TYPE = '')");

            return this;
        } // end andResourceTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE =", value,
                "resourceType");

            return this;
        } // end andResourceTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE <>", value,
                "resourceType");

            return this;
        } // end andResourceTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE is null OR WORKSPACE_RESOURCE.RESOURCE_TYPE <>",
                value, "resourceType");

            return this;
        } // end andResourceTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE >", value,
                "resourceType");

            return this;
        } // end andResourceTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE >=", value,
                "resourceType");

            return this;
        } // end andResourceTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE <", value,
                "resourceType");

            return this;
        } // end andResourceTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE <=", value,
                "resourceType");

            return this;
        } // end andResourceTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE.RESOURCE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE like",
                buffer.toString(), "resourceType");

            return this;
        } // end andResourceTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE not like",
                buffer.toString(), "resourceType");

            return this;
        } // end andResourceTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE in", values,
                    "resourceType");

                return this;
            } // end else
        } // end andResourceTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNotIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE not in", values,
                    "resourceType");

                return this;
            } // end else
        } // end andResourceTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE in",
                    Arrays.asList(values), "resourceType");

                return this;
            } // end else
        } // end andResourceTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE not in",
                    Arrays.asList(values), "resourceType");

                return this;
            } // end else
        } // end andResourceTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE between", value1,
                value2, "resourceType");

            return this;
        } // end andResourceTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_RESOURCE.RESOURCE_TYPE not between",
                value1, value2, "resourceType");

            return this;
        } // end andResourceTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("WORKSPACE_RESOURCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.STATUS is not null AND WORKSPACE_RESOURCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.STATUS is null OR WORKSPACE_RESOURCE.STATUS = '')");

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
            addCriterion("WORKSPACE_RESOURCE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.STATUS");
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
            addCriterion("WORKSPACE_RESOURCE.STATUS <>", value, "status");

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
            addCriterion("WORKSPACE_RESOURCE.STATUS is null OR WORKSPACE_RESOURCE.STATUS <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.STATUS");
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
            addCriterion("WORKSPACE_RESOURCE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.STATUS");
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
            addCriterion("WORKSPACE_RESOURCE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.STATUS");
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
            addCriterion("WORKSPACE_RESOURCE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.STATUS");
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
            addCriterion("WORKSPACE_RESOURCE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.STATUS");
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
            addCriterion("WORKSPACE_RESOURCE.STATUS like", buffer.toString(),
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
            addCriterion("WORKSPACE_RESOURCE.STATUS not like",
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
                addCriterion("WORKSPACE_RESOURCE.STATUS in", values, "status");

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
                addCriterion("WORKSPACE_RESOURCE.STATUS not in", values,
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
                addCriterion("WORKSPACE_RESOURCE.STATUS in",
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
                addCriterion("WORKSPACE_RESOURCE.STATUS not in",
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
            addCriterion("WORKSPACE_RESOURCE.STATUS between", value1, value2,
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
            addCriterion("WORKSPACE_RESOURCE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNull() {
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID is null");

            return this;
        } // end andWorkspaceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID is not null");

            return this;
        } // end andWorkspaceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.WORKSPACE_ID is not null AND WORKSPACE_RESOURCE.WORKSPACE_ID <> ''");

            return this;
        } // end andWorkspaceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.WORKSPACE_ID is null OR WORKSPACE_RESOURCE.WORKSPACE_ID = '')");

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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID =", value,
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
                    "WORKSPACE_RESOURCE.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID <>", value,
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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID is null OR WORKSPACE_RESOURCE.WORKSPACE_ID <>",
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
                    "WORKSPACE_RESOURCE.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID >", value,
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
                    "WORKSPACE_RESOURCE.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID >=", value,
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
                    "WORKSPACE_RESOURCE.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID <", value,
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
                    "WORKSPACE_RESOURCE.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID <=", value,
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
                    "WORKSPACE_RESOURCE.WORKSPACE_ID");
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
                addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID in", values,
                    "workspaceId");

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
                addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID not in", values,
                    "workspaceId");

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
                addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID in", values,
                    "workspaceId");

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
                addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID not in", values,
                    "workspaceId");

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
                addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID in",
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
                addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID not in",
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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID between", value1,
                value2, "workspaceId");

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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID between", value1,
                value2, "workspaceId");

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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID not between", value1,
                value2, "workspaceId");

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
            addCriterion("WORKSPACE_RESOURCE.WORKSPACE_ID not between", value1,
                value2, "workspaceId");

            return this;
        } // end andWorkspaceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("WORKSPACE_RESOURCE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("WORKSPACE_RESOURCE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE.NAME is not null AND WORKSPACE_RESOURCE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE.NAME is null OR WORKSPACE_RESOURCE.NAME = '')");

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
            addCriterion("WORKSPACE_RESOURCE.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.NAME");
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
            addCriterion("WORKSPACE_RESOURCE.NAME <>", value, "name");

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
            addCriterion("WORKSPACE_RESOURCE.NAME is null OR WORKSPACE_RESOURCE.NAME <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.NAME");
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
            addCriterion("WORKSPACE_RESOURCE.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.NAME");
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
            addCriterion("WORKSPACE_RESOURCE.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.NAME");
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
            addCriterion("WORKSPACE_RESOURCE.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.NAME");
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
            addCriterion("WORKSPACE_RESOURCE.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("WORKSPACE_RESOURCE.NAME");
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
            addCriterion("WORKSPACE_RESOURCE.NAME like", buffer.toString(),
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
            addCriterion("WORKSPACE_RESOURCE.NAME not like", buffer.toString(),
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
                addCriterion("WORKSPACE_RESOURCE.NAME in", values, "name");

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
                addCriterion("WORKSPACE_RESOURCE.NAME not in", values, "name");

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
                addCriterion("WORKSPACE_RESOURCE.NAME in",
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
                addCriterion("WORKSPACE_RESOURCE.NAME not in",
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
            addCriterion("WORKSPACE_RESOURCE.NAME between", value1, value2,
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
            addCriterion("WORKSPACE_RESOURCE.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsNull() {
            addCriterion("workspaceA.WORKSPACE_PATH is null");

            return this;
        } // end andWorkspacePathIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsNotNull() {
            addCriterion("workspaceA.WORKSPACE_PATH is not null");

            return this;
        } // end andWorkspacePathIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsNotEmpty() {
            addCriterion(
                "workspaceA.WORKSPACE_PATH is not null AND workspaceA.WORKSPACE_PATH <> ''");

            return this;
        } // end andWorkspacePathIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspacePathIsEmpty() {
            addCriterion(
                "(workspaceA.WORKSPACE_PATH is null OR workspaceA.WORKSPACE_PATH = '')");

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
            addCriterion("workspaceA.WORKSPACE_PATH =", value, "workspacePath");

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
            StringBuffer str = new StringBuffer("workspaceA.WORKSPACE_PATH");
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
            addCriterion("workspaceA.WORKSPACE_PATH <>", value, "workspacePath");

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
            addCriterion("workspaceA.WORKSPACE_PATH is null OR workspaceA.WORKSPACE_PATH <>",
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
            StringBuffer str = new StringBuffer("workspaceA.WORKSPACE_PATH");
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
            addCriterion("workspaceA.WORKSPACE_PATH >", value, "workspacePath");

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
            StringBuffer str = new StringBuffer("workspaceA.WORKSPACE_PATH");
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
            addCriterion("workspaceA.WORKSPACE_PATH >=", value, "workspacePath");

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
            StringBuffer str = new StringBuffer("workspaceA.WORKSPACE_PATH");
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
            addCriterion("workspaceA.WORKSPACE_PATH <", value, "workspacePath");

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
            StringBuffer str = new StringBuffer("workspaceA.WORKSPACE_PATH");
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
            addCriterion("workspaceA.WORKSPACE_PATH <=", value, "workspacePath");

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
            StringBuffer str = new StringBuffer("workspaceA.WORKSPACE_PATH");
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
            addCriterion("workspaceA.WORKSPACE_PATH like", buffer.toString(),
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
            addCriterion("workspaceA.WORKSPACE_PATH not like",
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
                addCriterion("workspaceA.WORKSPACE_PATH in", values,
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
                addCriterion("workspaceA.WORKSPACE_PATH not in", values,
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
                addCriterion("workspaceA.WORKSPACE_PATH in",
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
                addCriterion("workspaceA.WORKSPACE_PATH not in",
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
            addCriterion("workspaceA.WORKSPACE_PATH between", value1, value2,
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
            addCriterion("workspaceA.WORKSPACE_PATH not between", value1,
                value2, "workspacePath");

            return this;
        } // end andWorkspacePathNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameIsNull() {
            addCriterion("workspaceA.NAME is null");

            return this;
        } // end andWorkspaceNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameIsNotNull() {
            addCriterion("workspaceA.NAME is not null");

            return this;
        } // end andWorkspaceNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameIsNotEmpty() {
            addCriterion(
                "workspaceA.NAME is not null AND workspaceA.NAME <> ''");

            return this;
        } // end andWorkspaceNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameIsEmpty() {
            addCriterion("(workspaceA.NAME is null OR workspaceA.NAME = '')");

            return this;
        } // end andWorkspaceNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameEqualTo(String value) {
            addCriterion("workspaceA.NAME =", value, "workspaceName");

            return this;
        } // end andWorkspaceNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameNotEqualTo(String value) {
            addCriterion("workspaceA.NAME <>", value, "workspaceName");

            return this;
        } // end andWorkspaceNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameNotEqualToOrIsNull(String value) {
            addCriterion("workspaceA.NAME is null OR workspaceA.NAME <>",
                value, "workspaceName");

            return this;
        } // end andWorkspaceNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameGreaterThan(String value) {
            addCriterion("workspaceA.NAME >", value, "workspaceName");

            return this;
        } // end andWorkspaceNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("workspaceA.NAME >=", value, "workspaceName");

            return this;
        } // end andWorkspaceNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameLessThan(String value) {
            addCriterion("workspaceA.NAME <", value, "workspaceName");

            return this;
        } // end andWorkspaceNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameLessThanOrEqualTo(String value) {
            addCriterion("workspaceA.NAME <=", value, "workspaceName");

            return this;
        } // end andWorkspaceNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("workspaceA.NAME like", buffer.toString(),
                "workspaceName");

            return this;
        } // end andWorkspaceNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("workspaceA.NAME not like", buffer.toString(),
                "workspaceName");

            return this;
        } // end andWorkspaceNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("workspaceA.NAME in", values, "workspaceName");

                return this;
            } // end else
        } // end andWorkspaceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameNotIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("workspaceA.NAME not in", values, "workspaceName");

                return this;
            } // end else
        } // end andWorkspaceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("workspaceA.NAME in", Arrays.asList(values),
                    "workspaceName");

                return this;
            } // end else
        } // end andWorkspaceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("workspaceA.NAME not in", Arrays.asList(values),
                    "workspaceName");

                return this;
            } // end else
        } // end andWorkspaceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameBetween(String value1, String value2) {
            addCriterion("workspaceA.NAME between", value1, value2,
                "workspaceName");

            return this;
        } // end andWorkspaceNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceNameNotBetween(String value1, String value2) {
            addCriterion("workspaceA.NAME not between", value1, value2,
                "workspaceName");

            return this;
        } // end andWorkspaceNameNotBetween()
    } // end Criteria
} // end WorkspaceResourceDAOQueryBean
