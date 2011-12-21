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
 * WorkspaceConfig query bean 2011-09-22 10:17:23
 *
 * @author Auto Gen
 */
public class WorkspaceConfigDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new WorkspaceConfigDAOQueryBean object.
     */
    public WorkspaceConfigDAOQueryBean() {
        super();
    } // end WorkspaceConfigDAOQueryBean()

    /**
     * Creates a new WorkspaceConfigDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public WorkspaceConfigDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end WorkspaceConfigDAOQueryBean()

    /**
     * Creates a new WorkspaceConfigDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public WorkspaceConfigDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end WorkspaceConfigDAOQueryBean()

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
            addSelectProperty(IWorkspaceConfigDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConfigItemSelectProperty() {
        addConfigItemSelectProperty("configItem");
    } // end addConfigItemSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConfigItemSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigDAO.ConfigItem, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigDAO.ConfigItem, "configItem");
        } // end else
    } // end addConfigItemSelectProperty()

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
            addSelectProperty(IWorkspaceConfigDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentConfigIdSelectProperty() {
        addParentConfigIdSelectProperty("parentConfigId");
    } // end addParentConfigIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentConfigIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigDAO.ParentConfigId, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigDAO.ParentConfigId,
                "parentConfigId");
        } // end else
    } // end addParentConfigIdSelectProperty()

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
            addSelectProperty(IWorkspaceConfigDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConfigNameSelectProperty() {
        addConfigNameSelectProperty("configName");
    } // end addConfigNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConfigNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigDAO.ConfigName, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigDAO.ConfigName, "configName");
        } // end else
    } // end addConfigNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConfigFormSelectProperty() {
        addConfigFormSelectProperty("configForm");
    } // end addConfigFormSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConfigFormSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceConfigDAO.ConfigForm, aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceConfigDAO.ConfigForm, "configForm");
        } // end else
    } // end addConfigFormSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addConfigItemSelectProperty();

        addDescriptionSelectProperty();

        addParentConfigIdSelectProperty();

        addStatusSelectProperty();

        addConfigNameSelectProperty();

        addConfigFormSelectProperty();
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
            addCriterion("WORKSPACE_CONFIG.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("WORKSPACE_CONFIG.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG.ID is not null AND WORKSPACE_CONFIG.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG.ID is null OR WORKSPACE_CONFIG.ID = '')");

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
            addCriterion("WORKSPACE_CONFIG.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.ID");
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
            addCriterion("WORKSPACE_CONFIG.ID <>", value, "id");

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
            addCriterion("WORKSPACE_CONFIG.ID is null OR WORKSPACE_CONFIG.ID <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.ID");
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
            addCriterion("WORKSPACE_CONFIG.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.ID");
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
            addCriterion("WORKSPACE_CONFIG.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.ID");
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
            addCriterion("WORKSPACE_CONFIG.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.ID");
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
            addCriterion("WORKSPACE_CONFIG.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.ID");
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
                addCriterion("WORKSPACE_CONFIG.ID in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG.ID not in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG.ID in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG.ID not in", values, "id");

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
                addCriterion("WORKSPACE_CONFIG.ID in", Arrays.asList(values),
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
                addCriterion("WORKSPACE_CONFIG.ID not in",
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
            addCriterion("WORKSPACE_CONFIG.ID between", value1, value2, "id");

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
            addCriterion("WORKSPACE_CONFIG.ID between", value1, value2, "id");

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
            addCriterion("WORKSPACE_CONFIG.ID not between", value1, value2, "id");

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
            addCriterion("WORKSPACE_CONFIG.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemIsNull() {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM is null");

            return this;
        } // end andConfigItemIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemIsNotNull() {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM is not null");

            return this;
        } // end andConfigItemIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG.CONFIG_ITEM is not null AND WORKSPACE_CONFIG.CONFIG_ITEM <> ''");

            return this;
        } // end andConfigItemIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG.CONFIG_ITEM is null OR WORKSPACE_CONFIG.CONFIG_ITEM = '')");

            return this;
        } // end andConfigItemIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM =", value, "configItem");

            return this;
        } // end andConfigItemEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_ITEM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigItemEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemNotEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM <>", value, "configItem");

            return this;
        } // end andConfigItemNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM is null OR WORKSPACE_CONFIG.CONFIG_ITEM <>",
                value, "configItem");

            return this;
        } // end andConfigItemNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_ITEM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigItemNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemGreaterThan(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM >", value, "configItem");

            return this;
        } // end andConfigItemGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_ITEM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigItemGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM >=", value, "configItem");

            return this;
        } // end andConfigItemGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_ITEM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigItemGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemLessThan(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM <", value, "configItem");

            return this;
        } // end andConfigItemLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_ITEM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigItemLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM <=", value, "configItem");

            return this;
        } // end andConfigItemLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_ITEM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigItemLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM like",
                buffer.toString(), "configItem");

            return this;
        } // end andConfigItemLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM not like",
                buffer.toString(), "configItem");

            return this;
        } // end andConfigItemNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemIn(List values) {
            if (values.size() == 1) {
                return andConfigItemEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM in", values,
                    "configItem");

                return this;
            } // end else
        } // end andConfigItemIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemNotIn(List values) {
            if (values.size() == 1) {
                return andConfigItemNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM not in", values,
                    "configItem");

                return this;
            } // end else
        } // end andConfigItemNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemIn(Object[] values) {
            if (values.length == 1) {
                return andConfigItemEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM in",
                    Arrays.asList(values), "configItem");

                return this;
            } // end else
        } // end andConfigItemIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemNotIn(Object[] values) {
            if (values.length == 1) {
                return andConfigItemNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM not in",
                    Arrays.asList(values), "configItem");

                return this;
            } // end else
        } // end andConfigItemNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM between", value1,
                value2, "configItem");

            return this;
        } // end andConfigItemBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigItemNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_ITEM not between", value1,
                value2, "configItem");

            return this;
        } // end andConfigItemNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG.DESCRIPTION is not null AND WORKSPACE_CONFIG.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG.DESCRIPTION is null OR WORKSPACE_CONFIG.DESCRIPTION = '')");

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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION <>", value, "description");

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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION is null OR WORKSPACE_CONFIG.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION >=", value, "description");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION <=", value, "description");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.DESCRIPTION");
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION like",
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION not like",
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
                addCriterion("WORKSPACE_CONFIG.DESCRIPTION in", values,
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
                addCriterion("WORKSPACE_CONFIG.DESCRIPTION not in", values,
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
                addCriterion("WORKSPACE_CONFIG.DESCRIPTION in",
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
                addCriterion("WORKSPACE_CONFIG.DESCRIPTION not in",
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION between", value1,
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
            addCriterion("WORKSPACE_CONFIG.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdIsNull() {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID is null");

            return this;
        } // end andParentConfigIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdIsNotNull() {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID is not null");

            return this;
        } // end andParentConfigIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG.PARENT_CONFIG_ID is not null AND WORKSPACE_CONFIG.PARENT_CONFIG_ID <> ''");

            return this;
        } // end andParentConfigIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG.PARENT_CONFIG_ID is null OR WORKSPACE_CONFIG.PARENT_CONFIG_ID = '')");

            return this;
        } // end andParentConfigIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdEqualTo(long value) {
            return andParentConfigIdEqualTo(Long.valueOf(value));
        } // end andParentConfigIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID =", value,
                "parentConfigId");

            return this;
        } // end andParentConfigIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG.PARENT_CONFIG_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentConfigIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotEqualTo(long value) {
            return andParentConfigIdNotEqualTo(Long.valueOf(value));
        } // end andParentConfigIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID <>", value,
                "parentConfigId");

            return this;
        } // end andParentConfigIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotEqualToOrIsNull(long value) {
            return andParentConfigIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andParentConfigIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID is null OR WORKSPACE_CONFIG.PARENT_CONFIG_ID <>",
                value, "parentConfigId");

            return this;
        } // end andParentConfigIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG.PARENT_CONFIG_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentConfigIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdGreaterThan(long value) {
            return andParentConfigIdGreaterThan(Long.valueOf(value));
        } // end andParentConfigIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdGreaterThan(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID >", value,
                "parentConfigId");

            return this;
        } // end andParentConfigIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG.PARENT_CONFIG_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentConfigIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdGreaterThanOrEqualTo(long value) {
            return andParentConfigIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andParentConfigIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID >=", value,
                "parentConfigId");

            return this;
        } // end andParentConfigIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG.PARENT_CONFIG_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentConfigIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdLessThan(long value) {
            return andParentConfigIdLessThan(Long.valueOf(value));
        } // end andParentConfigIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdLessThan(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID <", value,
                "parentConfigId");

            return this;
        } // end andParentConfigIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG.PARENT_CONFIG_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentConfigIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdLessThanOrEqualTo(long value) {
            return andParentConfigIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andParentConfigIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID <=", value,
                "parentConfigId");

            return this;
        } // end andParentConfigIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_CONFIG.PARENT_CONFIG_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentConfigIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdIn(long[] values) {
            if (values.length == 1) {
                return andParentConfigIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID in", values,
                    "parentConfigId");

                return this;
            } // end else
        } // end andParentConfigIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotIn(long[] values) {
            if (values.length == 1) {
                return andParentConfigIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID not in",
                    values, "parentConfigId");

                return this;
            } // end else
        } // end andParentConfigIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdIn(List values) {
            if (values.size() == 1) {
                return andParentConfigIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID in", values,
                    "parentConfigId");

                return this;
            } // end else
        } // end andParentConfigIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentConfigIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID not in",
                    values, "parentConfigId");

                return this;
            } // end else
        } // end andParentConfigIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentConfigIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID in",
                    Arrays.asList(values), "parentConfigId");

                return this;
            } // end else
        } // end andParentConfigIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentConfigIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID not in",
                    Arrays.asList(values), "parentConfigId");

                return this;
            } // end else
        } // end andParentConfigIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdBetween(long value1, long value2) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID between", value1,
                value2, "parentConfigId");

            return this;
        } // end andParentConfigIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID between", value1,
                value2, "parentConfigId");

            return this;
        } // end andParentConfigIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotBetween(long value1, long value2) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID not between",
                value1, value2, "parentConfigId");

            return this;
        } // end andParentConfigIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentConfigIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("WORKSPACE_CONFIG.PARENT_CONFIG_ID not between",
                value1, value2, "parentConfigId");

            return this;
        } // end andParentConfigIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("WORKSPACE_CONFIG.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("WORKSPACE_CONFIG.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG.STATUS is not null AND WORKSPACE_CONFIG.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG.STATUS is null OR WORKSPACE_CONFIG.STATUS = '')");

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
            addCriterion("WORKSPACE_CONFIG.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.STATUS");
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
            addCriterion("WORKSPACE_CONFIG.STATUS <>", value, "status");

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
            addCriterion("WORKSPACE_CONFIG.STATUS is null OR WORKSPACE_CONFIG.STATUS <>",
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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.STATUS");
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
            addCriterion("WORKSPACE_CONFIG.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.STATUS");
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
            addCriterion("WORKSPACE_CONFIG.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.STATUS");
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
            addCriterion("WORKSPACE_CONFIG.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.STATUS");
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
            addCriterion("WORKSPACE_CONFIG.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.STATUS");
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
            addCriterion("WORKSPACE_CONFIG.STATUS like", buffer.toString(),
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
            addCriterion("WORKSPACE_CONFIG.STATUS not like", buffer.toString(),
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
                addCriterion("WORKSPACE_CONFIG.STATUS in", values, "status");

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
                addCriterion("WORKSPACE_CONFIG.STATUS not in", values, "status");

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
                addCriterion("WORKSPACE_CONFIG.STATUS in",
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
                addCriterion("WORKSPACE_CONFIG.STATUS not in",
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
            addCriterion("WORKSPACE_CONFIG.STATUS between", value1, value2,
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
            addCriterion("WORKSPACE_CONFIG.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsNull() {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME is null");

            return this;
        } // end andConfigNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsNotNull() {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME is not null");

            return this;
        } // end andConfigNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG.CONFIG_NAME is not null AND WORKSPACE_CONFIG.CONFIG_NAME <> ''");

            return this;
        } // end andConfigNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG.CONFIG_NAME is null OR WORKSPACE_CONFIG.CONFIG_NAME = '')");

            return this;
        } // end andConfigNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME =", value, "configName");

            return this;
        } // end andConfigNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME <>", value, "configName");

            return this;
        } // end andConfigNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME is null OR WORKSPACE_CONFIG.CONFIG_NAME <>",
                value, "configName");

            return this;
        } // end andConfigNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME >", value, "configName");

            return this;
        } // end andConfigNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME >=", value, "configName");

            return this;
        } // end andConfigNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThan(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME <", value, "configName");

            return this;
        } // end andConfigNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME <=", value, "configName");

            return this;
        } // end andConfigNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME like",
                buffer.toString(), "configName");

            return this;
        } // end andConfigNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME not like",
                buffer.toString(), "configName");

            return this;
        } // end andConfigNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIn(List values) {
            if (values.size() == 1) {
                return andConfigNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_NAME in", values,
                    "configName");

                return this;
            } // end else
        } // end andConfigNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotIn(List values) {
            if (values.size() == 1) {
                return andConfigNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_NAME not in", values,
                    "configName");

                return this;
            } // end else
        } // end andConfigNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIn(Object[] values) {
            if (values.length == 1) {
                return andConfigNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_NAME in",
                    Arrays.asList(values), "configName");

                return this;
            } // end else
        } // end andConfigNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andConfigNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_NAME not in",
                    Arrays.asList(values), "configName");

                return this;
            } // end else
        } // end andConfigNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME between", value1,
                value2, "configName");

            return this;
        } // end andConfigNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_NAME not between", value1,
                value2, "configName");

            return this;
        } // end andConfigNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormIsNull() {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM is null");

            return this;
        } // end andConfigFormIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormIsNotNull() {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM is not null");

            return this;
        } // end andConfigFormIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormIsNotEmpty() {
            addCriterion(
                "WORKSPACE_CONFIG.CONFIG_FORM is not null AND WORKSPACE_CONFIG.CONFIG_FORM <> ''");

            return this;
        } // end andConfigFormIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormIsEmpty() {
            addCriterion(
                "(WORKSPACE_CONFIG.CONFIG_FORM is null OR WORKSPACE_CONFIG.CONFIG_FORM = '')");

            return this;
        } // end andConfigFormIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM =", value, "configForm");

            return this;
        } // end andConfigFormEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_FORM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigFormEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormNotEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM <>", value, "configForm");

            return this;
        } // end andConfigFormNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM is null OR WORKSPACE_CONFIG.CONFIG_FORM <>",
                value, "configForm");

            return this;
        } // end andConfigFormNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_FORM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigFormNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormGreaterThan(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM >", value, "configForm");

            return this;
        } // end andConfigFormGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_FORM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigFormGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM >=", value, "configForm");

            return this;
        } // end andConfigFormGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_FORM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigFormGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormLessThan(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM <", value, "configForm");

            return this;
        } // end andConfigFormLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_FORM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigFormLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM <=", value, "configForm");

            return this;
        } // end andConfigFormLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("WORKSPACE_CONFIG.CONFIG_FORM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigFormLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM like",
                buffer.toString(), "configForm");

            return this;
        } // end andConfigFormLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM not like",
                buffer.toString(), "configForm");

            return this;
        } // end andConfigFormNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormIn(List values) {
            if (values.size() == 1) {
                return andConfigFormEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_FORM in", values,
                    "configForm");

                return this;
            } // end else
        } // end andConfigFormIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormNotIn(List values) {
            if (values.size() == 1) {
                return andConfigFormNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_FORM not in", values,
                    "configForm");

                return this;
            } // end else
        } // end andConfigFormNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormIn(Object[] values) {
            if (values.length == 1) {
                return andConfigFormEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_FORM in",
                    Arrays.asList(values), "configForm");

                return this;
            } // end else
        } // end andConfigFormIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormNotIn(Object[] values) {
            if (values.length == 1) {
                return andConfigFormNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_CONFIG.CONFIG_FORM not in",
                    Arrays.asList(values), "configForm");

                return this;
            } // end else
        } // end andConfigFormNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM between", value1,
                value2, "configForm");

            return this;
        } // end andConfigFormBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigFormNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_CONFIG.CONFIG_FORM not between", value1,
                value2, "configForm");

            return this;
        } // end andConfigFormNotBetween()
    } // end Criteria
} // end WorkspaceConfigDAOQueryBean
