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
 * WorkspaceConfigProperty query bean 2011-09-22 10:17:23
 *
 * @author Auto Gen
 */
public class WorkspaceConfigPropertyDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new WorkspaceConfigPropertyDAOQueryBean object.
     */
    public WorkspaceConfigPropertyDAOQueryBean() {
        super();
    } // end WorkspaceConfigPropertyDAOQueryBean()

    /**
     * Creates a new WorkspaceConfigPropertyDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public WorkspaceConfigPropertyDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end WorkspaceConfigPropertyDAOQueryBean()

    /**
     * Creates a new WorkspaceConfigPropertyDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public WorkspaceConfigPropertyDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end WorkspaceConfigPropertyDAOQueryBean()

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
            addSelectProperty(IWorkspaceConfigPropertyDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConfigPropertySelectProperty() {
        addConfigPropertySelectProperty("configProperty");
    } // end addConfigPropertySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConfigPropertySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigPropertyDAO.ConfigProperty, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.ConfigProperty,
                "configProperty");
        } // end else
    } // end addConfigPropertySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConfigValueSelectProperty() {
        addConfigValueSelectProperty("configValue");
    } // end addConfigValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConfigValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigPropertyDAO.ConfigValue, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.ConfigValue,
                "configValue");
        } // end else
    } // end addConfigValueSelectProperty()

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
            addSelectProperty(IWorkspaceConfigPropertyDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.Description,
                "description");
        } // end else
    } // end addDescriptionSelectProperty()

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
            addSelectProperty(IWorkspaceConfigPropertyDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWorkspaceConfigIdSelectProperty() {
        addWorkspaceConfigIdSelectProperty("workspaceConfigId");
    } // end addWorkspaceConfigIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWorkspaceConfigIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigPropertyDAO.WorkspaceConfigId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.WorkspaceConfigId,
                "workspaceConfigId");
        } // end else
    } // end addWorkspaceConfigIdSelectProperty()

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
            addSelectProperty(IWorkspaceConfigPropertyDAO.WorkspaceId, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.WorkspaceId,
                "workspaceId");
        } // end else
    } // end addWorkspaceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWorkspaceConfigItemSelectProperty() {
        addWorkspaceConfigItemSelectProperty("workspaceConfigItem");
    } // end addWorkspaceConfigItemSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWorkspaceConfigItemSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigPropertyDAO.WorkspaceConfigItem,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigPropertyDAO.WorkspaceConfigItem,
                "workspaceConfigItem");
        } // end else
    } // end addWorkspaceConfigItemSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addConfigPropertySelectProperty();

        addConfigValueSelectProperty();

        addDescriptionSelectProperty();

        addStatusSelectProperty();

        addWorkspaceConfigIdSelectProperty();

        addWorkspaceIdSelectProperty();

        addWorkspaceConfigItemSelectProperty();
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.ID is not null AND WORKSPACE_CONFIG_PROPERTY.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG_PROPERTY.ID is null OR WORKSPACE_CONFIG_PROPERTY.ID = '')");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG_PROPERTY.ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID <>", value, "id");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID is null OR WORKSPACE_CONFIG_PROPERTY.ID <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG_PROPERTY.ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG_PROPERTY.ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG_PROPERTY.ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG_PROPERTY.ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG_PROPERTY.ID");
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.ID in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.ID not in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.ID in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.ID not in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.ID in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.ID not in",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID between", value1,
                value2, "id");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID between", value1,
                value2, "id");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID not between", value1,
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyIsNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY is null");

            return this;
        } // end andConfigPropertyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyIsNotNull() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY is not null");

            return this;
        } // end andConfigPropertyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY is not null AND WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY <> ''");

            return this;
        } // end andConfigPropertyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY is null OR WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY = '')");

            return this;
        } // end andConfigPropertyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY =", value,
                "configProperty");

            return this;
        } // end andConfigPropertyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigPropertyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyNotEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY <>", value,
                "configProperty");

            return this;
        } // end andConfigPropertyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY is null OR WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY <>",
                value, "configProperty");

            return this;
        } // end andConfigPropertyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigPropertyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyGreaterThan(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY >", value,
                "configProperty");

            return this;
        } // end andConfigPropertyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigPropertyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY >=", value,
                "configProperty");

            return this;
        } // end andConfigPropertyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigPropertyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyLessThan(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY <", value,
                "configProperty");

            return this;
        } // end andConfigPropertyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigPropertyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY <=", value,
                "configProperty");

            return this;
        } // end andConfigPropertyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigPropertyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY like",
                buffer.toString(), "configProperty");

            return this;
        } // end andConfigPropertyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY not like",
                buffer.toString(), "configProperty");

            return this;
        } // end andConfigPropertyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyIn(List values) {
            if (values.size() == 1) {
                return andConfigPropertyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY in",
                    values, "configProperty");

                return this;
            } // end else
        } // end andConfigPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyNotIn(List values) {
            if (values.size() == 1) {
                return andConfigPropertyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY not in",
                    values, "configProperty");

                return this;
            } // end else
        } // end andConfigPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyIn(Object[] values) {
            if (values.length == 1) {
                return andConfigPropertyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY in",
                    Arrays.asList(values), "configProperty");

                return this;
            } // end else
        } // end andConfigPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyNotIn(Object[] values) {
            if (values.length == 1) {
                return andConfigPropertyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY not in",
                    Arrays.asList(values), "configProperty");

                return this;
            } // end else
        } // end andConfigPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY between",
                value1, value2, "configProperty");

            return this;
        } // end andConfigPropertyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigPropertyNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY not between",
                value1, value2, "configProperty");

            return this;
        } // end andConfigPropertyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueIsNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE is null");

            return this;
        } // end andConfigValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueIsNotNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE is not null");

            return this;
        } // end andConfigValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE is not null AND WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE <> ''");

            return this;
        } // end andConfigValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE is null OR WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE = '')");

            return this;
        } // end andConfigValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE =", value,
                "configValue");

            return this;
        } // end andConfigValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueNotEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE <>", value,
                "configValue");

            return this;
        } // end andConfigValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE is null OR WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE <>",
                value, "configValue");

            return this;
        } // end andConfigValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueGreaterThan(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE >", value,
                "configValue");

            return this;
        } // end andConfigValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE >=", value,
                "configValue");

            return this;
        } // end andConfigValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueLessThan(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE <", value,
                "configValue");

            return this;
        } // end andConfigValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE <=", value,
                "configValue");

            return this;
        } // end andConfigValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE like",
                buffer.toString(), "configValue");

            return this;
        } // end andConfigValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE not like",
                buffer.toString(), "configValue");

            return this;
        } // end andConfigValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueIn(List values) {
            if (values.size() == 1) {
                return andConfigValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE in",
                    values, "configValue");

                return this;
            } // end else
        } // end andConfigValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueNotIn(List values) {
            if (values.size() == 1) {
                return andConfigValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE not in",
                    values, "configValue");

                return this;
            } // end else
        } // end andConfigValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueIn(Object[] values) {
            if (values.length == 1) {
                return andConfigValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE in",
                    Arrays.asList(values), "configValue");

                return this;
            } // end else
        } // end andConfigValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andConfigValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE not in",
                    Arrays.asList(values), "configValue");

                return this;
            } // end else
        } // end andConfigValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE between",
                value1, value2, "configValue");

            return this;
        } // end andConfigValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigValueNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE not between",
                value1, value2, "configValue");

            return this;
        } // end andConfigValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION is not null AND WORKSPACE_CONFIG_PROPERTY.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG_PROPERTY.DESCRIPTION is null OR WORKSPACE_CONFIG_PROPERTY.DESCRIPTION = '')");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION =", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION <>", value,
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION is null OR WORKSPACE_CONFIG_PROPERTY.DESCRIPTION <>",
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
                    "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION >", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION >=", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION <", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION <=", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION like",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION not like",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION in",
                    values, "description");

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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION not in",
                    values, "description");

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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION not in",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION between",
                value1, value2, "description");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.DESCRIPTION not between",
                value1, value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.STATUS is not null AND WORKSPACE_CONFIG_PROPERTY.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG_PROPERTY.STATUS is null OR WORKSPACE_CONFIG_PROPERTY.STATUS = '')");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.STATUS");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS <>", value, "status");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS is null OR WORKSPACE_CONFIG_PROPERTY.STATUS <>",
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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.STATUS");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.STATUS");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.STATUS");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.STATUS");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.STATUS");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS like",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS not like",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS in", values,
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
        public Criteria andStatusNotIn(List values) {
            if (values.size() == 1) {
                return andStatusNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS not in", values,
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS not in",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS between", value1,
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdIsNull() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID is null");

            return this;
        } // end andWorkspaceConfigIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdIsNotNull() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID is not null");

            return this;
        } // end andWorkspaceConfigIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID is not null AND WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID <> ''");

            return this;
        } // end andWorkspaceConfigIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID is null OR WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID = '')");

            return this;
        } // end andWorkspaceConfigIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdEqualTo(long value) {
            return andWorkspaceConfigIdEqualTo(Long.valueOf(value));
        } // end andWorkspaceConfigIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID =",
                value, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotEqualTo(long value) {
            return andWorkspaceConfigIdNotEqualTo(Long.valueOf(value));
        } // end andWorkspaceConfigIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID <>",
                value, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotEqualToOrIsNull(long value) {
            return andWorkspaceConfigIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andWorkspaceConfigIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID is null OR WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID <>",
                value, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdGreaterThan(long value) {
            return andWorkspaceConfigIdGreaterThan(Long.valueOf(value));
        } // end andWorkspaceConfigIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdGreaterThan(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID >",
                value, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdGreaterThanOrEqualTo(long value) {
            return andWorkspaceConfigIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andWorkspaceConfigIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID >=",
                value, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdLessThan(long value) {
            return andWorkspaceConfigIdLessThan(Long.valueOf(value));
        } // end andWorkspaceConfigIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdLessThan(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID <",
                value, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdLessThanOrEqualTo(long value) {
            return andWorkspaceConfigIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andWorkspaceConfigIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID <=",
                value, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdIn(long[] values) {
            if (values.length == 1) {
                return andWorkspaceConfigIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID in",
                    values, "workspaceConfigId");

                return this;
            } // end else
        } // end andWorkspaceConfigIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotIn(long[] values) {
            if (values.length == 1) {
                return andWorkspaceConfigIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID not in",
                    values, "workspaceConfigId");

                return this;
            } // end else
        } // end andWorkspaceConfigIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceConfigIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID in",
                    values, "workspaceConfigId");

                return this;
            } // end else
        } // end andWorkspaceConfigIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceConfigIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID not in",
                    values, "workspaceConfigId");

                return this;
            } // end else
        } // end andWorkspaceConfigIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceConfigIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID in",
                    Arrays.asList(values), "workspaceConfigId");

                return this;
            } // end else
        } // end andWorkspaceConfigIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceConfigIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID not in",
                    Arrays.asList(values), "workspaceConfigId");

                return this;
            } // end else
        } // end andWorkspaceConfigIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdBetween(long value1, long value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID between",
                value1, value2, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID between",
                value1, value2, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotBetween(long value1, long value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID not between",
                value1, value2, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID not between",
                value1, value2, "workspaceConfigId");

            return this;
        } // end andWorkspaceConfigIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID is null");

            return this;
        } // end andWorkspaceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNotNull() {
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID is not null");

            return this;
        } // end andWorkspaceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID is not null AND WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID <> ''");

            return this;
        } // end andWorkspaceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID is null OR WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID = '')");

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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID =", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID <>", value,
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID is null OR WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID <>",
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
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID >", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID >=", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID <", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID");
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID <=", value,
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
                    "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID");
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID not in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID not in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID in",
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
                addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID not in",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID between",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID between",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID not between",
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
            addCriterion("WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID not between",
                value1, value2, "workspaceId");

            return this;
        } // end andWorkspaceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemIsNull() {
            addCriterion("workspaceConfig.CONFIG_ITEM is null");

            return this;
        } // end andWorkspaceConfigItemIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemIsNotNull() {
            addCriterion("workspaceConfig.CONFIG_ITEM is not null");

            return this;
        } // end andWorkspaceConfigItemIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemIsNotEmpty() {
            addCriterion(
                "workspaceConfig.CONFIG_ITEM is not null AND workspaceConfig.CONFIG_ITEM <> ''");

            return this;
        } // end andWorkspaceConfigItemIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemIsEmpty() {
            addCriterion(
                "(workspaceConfig.CONFIG_ITEM is null OR workspaceConfig.CONFIG_ITEM = '')");

            return this;
        } // end andWorkspaceConfigItemIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemEqualTo(String value) {
            addCriterion("workspaceConfig.CONFIG_ITEM =", value,
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceConfig.CONFIG_ITEM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigItemEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemNotEqualTo(String value) {
            addCriterion("workspaceConfig.CONFIG_ITEM <>", value,
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemNotEqualToOrIsNull(String value) {
            addCriterion("workspaceConfig.CONFIG_ITEM is null OR workspaceConfig.CONFIG_ITEM <>",
                value, "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceConfig.CONFIG_ITEM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigItemNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemGreaterThan(String value) {
            addCriterion("workspaceConfig.CONFIG_ITEM >", value,
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceConfig.CONFIG_ITEM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigItemGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemGreaterThanOrEqualTo(String value) {
            addCriterion("workspaceConfig.CONFIG_ITEM >=", value,
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceConfig.CONFIG_ITEM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigItemGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemLessThan(String value) {
            addCriterion("workspaceConfig.CONFIG_ITEM <", value,
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceConfig.CONFIG_ITEM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigItemLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemLessThanOrEqualTo(String value) {
            addCriterion("workspaceConfig.CONFIG_ITEM <=", value,
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("workspaceConfig.CONFIG_ITEM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceConfigItemLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("workspaceConfig.CONFIG_ITEM like", buffer.toString(),
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("workspaceConfig.CONFIG_ITEM not like",
                buffer.toString(), "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceConfigItemEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("workspaceConfig.CONFIG_ITEM in", values,
                    "workspaceConfigItem");

                return this;
            } // end else
        } // end andWorkspaceConfigItemIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemNotIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceConfigItemNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("workspaceConfig.CONFIG_ITEM not in", values,
                    "workspaceConfigItem");

                return this;
            } // end else
        } // end andWorkspaceConfigItemNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceConfigItemEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("workspaceConfig.CONFIG_ITEM in",
                    Arrays.asList(values), "workspaceConfigItem");

                return this;
            } // end else
        } // end andWorkspaceConfigItemIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemNotIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceConfigItemNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("workspaceConfig.CONFIG_ITEM not in",
                    Arrays.asList(values), "workspaceConfigItem");

                return this;
            } // end else
        } // end andWorkspaceConfigItemNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemBetween(String value1,
            String value2) {
            addCriterion("workspaceConfig.CONFIG_ITEM between", value1, value2,
                "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceConfigItemNotBetween(String value1,
            String value2) {
            addCriterion("workspaceConfig.CONFIG_ITEM not between", value1,
                value2, "workspaceConfigItem");

            return this;
        } // end andWorkspaceConfigItemNotBetween()
    } // end Criteria
} // end WorkspaceConfigPropertyDAOQueryBean
