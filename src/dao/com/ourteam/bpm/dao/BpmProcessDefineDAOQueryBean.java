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
 * BpmProcessDefine query bean 2011-11-23 16:27:11
 *
 * @author Auto Gen
 */
public class BpmProcessDefineDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmProcessDefineDAOQueryBean object.
     */
    public BpmProcessDefineDAOQueryBean() {
        super();
    } // end BpmProcessDefineDAOQueryBean()

    /**
     * Creates a new BpmProcessDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmProcessDefineDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmProcessDefineDAOQueryBean()

    /**
     * Creates a new BpmProcessDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmProcessDefineDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmProcessDefineDAOQueryBean()

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
            addSelectProperty(IBpmProcessDefineDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLastEditorIdSelectProperty() {
        addLastEditorIdSelectProperty("lastEditorId");
    } // end addLastEditorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLastEditorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.LastEditorId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.LastEditorId, "lastEditorId");
        } // end else
    } // end addLastEditorIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLastEditDateSelectProperty() {
        addLastEditDateSelectProperty("lastEditDate");
    } // end addLastEditDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLastEditDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.LastEditDate, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.LastEditDate, "lastEditDate");
        } // end else
    } // end addLastEditDateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessKeySelectProperty() {
        addProcessKeySelectProperty("processKey");
    } // end addProcessKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.ProcessKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.ProcessKey, "processKey");
        } // end else
    } // end addProcessKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessNameSelectProperty() {
        addProcessNameSelectProperty("processName");
    } // end addProcessNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.ProcessName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.ProcessName, "processName");
        } // end else
    } // end addProcessNameSelectProperty()

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
            addSelectProperty(IBpmProcessDefineDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

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
            addSelectProperty(IBpmProcessDefineDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCatalogIdSelectProperty() {
        addCatalogIdSelectProperty("catalogId");
    } // end addCatalogIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCatalogIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.CatalogId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.CatalogId, "catalogId");
        } // end else
    } // end addCatalogIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessVersionSelectProperty() {
        addProcessVersionSelectProperty("processVersion");
    } // end addProcessVersionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessVersionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.ProcessVersion, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.ProcessVersion,
                "processVersion");
        } // end else
    } // end addProcessVersionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLastEditorNameSelectProperty() {
        addLastEditorNameSelectProperty("lastEditorName");
    } // end addLastEditorNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLastEditorNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.LastEditorName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.LastEditorName,
                "lastEditorName");
        } // end else
    } // end addLastEditorNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStartFormKeySelectProperty() {
        addStartFormKeySelectProperty("startFormKey");
    } // end addStartFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStartFormKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessDefineDAO.StartFormKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessDefineDAO.StartFormKey, "startFormKey");
        } // end else
    } // end addStartFormKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addLastEditorIdSelectProperty();

        addLastEditDateSelectProperty();

        addProcessKeySelectProperty();

        addProcessNameSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addCatalogIdSelectProperty();

        addProcessVersionSelectProperty();

        addLastEditorNameSelectProperty();

        addStartFormKeySelectProperty();
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
            addCriterion("BPM_PROCESS_DEFINE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.ID is not null AND BPM_PROCESS_DEFINE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.ID is null OR BPM_PROCESS_DEFINE.ID = '')");

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
            addCriterion("BPM_PROCESS_DEFINE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.ID");
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
            addCriterion("BPM_PROCESS_DEFINE.ID <>", value, "id");

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
            addCriterion("BPM_PROCESS_DEFINE.ID is null OR BPM_PROCESS_DEFINE.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.ID");
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
            addCriterion("BPM_PROCESS_DEFINE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.ID");
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
            addCriterion("BPM_PROCESS_DEFINE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.ID");
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
            addCriterion("BPM_PROCESS_DEFINE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.ID");
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
            addCriterion("BPM_PROCESS_DEFINE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.ID");
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
                addCriterion("BPM_PROCESS_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_DEFINE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_DEFINE.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_DEFINE.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_DEFINE.ID in", Arrays.asList(values),
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
                addCriterion("BPM_PROCESS_DEFINE.ID not in",
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
            addCriterion("BPM_PROCESS_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("BPM_PROCESS_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("BPM_PROCESS_DEFINE.ID not between", value1, value2,
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
            addCriterion("BPM_PROCESS_DEFINE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID is null");

            return this;
        } // end andLastEditorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID is not null");

            return this;
        } // end andLastEditorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.LAST_EDITOR_ID is not null AND BPM_PROCESS_DEFINE.LAST_EDITOR_ID <> ''");

            return this;
        } // end andLastEditorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.LAST_EDITOR_ID is null OR BPM_PROCESS_DEFINE.LAST_EDITOR_ID = '')");

            return this;
        } // end andLastEditorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdEqualTo(long value) {
            return andLastEditorIdEqualTo(Long.valueOf(value));
        } // end andLastEditorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID =", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDITOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualTo(long value) {
            return andLastEditorIdNotEqualTo(Long.valueOf(value));
        } // end andLastEditorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID <>", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualToOrIsNull(long value) {
            return andLastEditorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andLastEditorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID is null OR BPM_PROCESS_DEFINE.LAST_EDITOR_ID <>",
                value, "lastEditorId");

            return this;
        } // end andLastEditorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDITOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThan(long value) {
            return andLastEditorIdGreaterThan(Long.valueOf(value));
        } // end andLastEditorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID >", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDITOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanOrEqualTo(long value) {
            return andLastEditorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andLastEditorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID >=", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDITOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThan(long value) {
            return andLastEditorIdLessThan(Long.valueOf(value));
        } // end andLastEditorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID <", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDITOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanOrEqualTo(long value) {
            return andLastEditorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andLastEditorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID <=", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDITOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIn(long[] values) {
            if (values.length == 1) {
                return andLastEditorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID in", values,
                    "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andLastEditorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID not in",
                    values, "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIn(List values) {
            if (values.size() == 1) {
                return andLastEditorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID in", values,
                    "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotIn(List values) {
            if (values.size() == 1) {
                return andLastEditorIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID not in",
                    values, "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID in",
                    Arrays.asList(values), "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID not in",
                    Arrays.asList(values), "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID between", value1,
                value2, "lastEditorId");

            return this;
        } // end andLastEditorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID between", value1,
                value2, "lastEditorId");

            return this;
        } // end andLastEditorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID not between",
                value1, value2, "lastEditorId");

            return this;
        } // end andLastEditorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDITOR_ID not between",
                value1, value2, "lastEditorId");

            return this;
        } // end andLastEditorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDIT_DATE is null");

            return this;
        } // end andLastEditDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.LAST_EDIT_DATE is not null");

            return this;
        } // end andLastEditDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.LAST_EDIT_DATE is not null AND BPM_PROCESS_DEFINE.LAST_EDIT_DATE <> ''");

            return this;
        } // end andLastEditDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.LAST_EDIT_DATE is null OR BPM_PROCESS_DEFINE.LAST_EDIT_DATE = '')");

            return this;
        } // end andLastEditDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE =",
                value, "lastEditDate");

            return this;
        } // end andLastEditDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDIT_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE <>",
                value, "lastEditDate");

            return this;
        } // end andLastEditDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE is null OR BPM_PROCESS_DEFINE.LAST_EDIT_DATE <>",
                value, "lastEditDate");

            return this;
        } // end andLastEditDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDIT_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE >",
                value, "lastEditDate");

            return this;
        } // end andLastEditDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDIT_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE >=",
                value, "lastEditDate");

            return this;
        } // end andLastEditDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDIT_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE <",
                value, "lastEditDate");

            return this;
        } // end andLastEditDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDIT_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE <=",
                value, "lastEditDate");

            return this;
        } // end andLastEditDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.LAST_EDIT_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIn(List values) {
            if (values.size() == 1) {
                return andLastEditDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE in",
                    values, "lastEditDate");

                return this;
            } // end else
        } // end andLastEditDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateNotIn(List values) {
            if (values.size() == 1) {
                return andLastEditDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE not in",
                    values, "lastEditDate");

                return this;
            } // end else
        } // end andLastEditDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE in",
                    Arrays.asList(values), "lastEditDate");

                return this;
            } // end else
        } // end andLastEditDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE not in",
                    Arrays.asList(values), "lastEditDate");

                return this;
            } // end else
        } // end andLastEditDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE between",
                value1, value2, "lastEditDate");

            return this;
        } // end andLastEditDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_PROCESS_DEFINE.LAST_EDIT_DATE not between",
                value1, value2, "lastEditDate");

            return this;
        } // end andLastEditDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY is null");

            return this;
        } // end andProcessKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY is not null");

            return this;
        } // end andProcessKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.PROCESS_KEY is not null AND BPM_PROCESS_DEFINE.PROCESS_KEY <> ''");

            return this;
        } // end andProcessKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.PROCESS_KEY is null OR BPM_PROCESS_DEFINE.PROCESS_KEY = '')");

            return this;
        } // end andProcessKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY =", value, "processKey");

            return this;
        } // end andProcessKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY <>", value,
                "processKey");

            return this;
        } // end andProcessKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY is null OR BPM_PROCESS_DEFINE.PROCESS_KEY <>",
                value, "processKey");

            return this;
        } // end andProcessKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY >", value, "processKey");

            return this;
        } // end andProcessKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY >=", value,
                "processKey");

            return this;
        } // end andProcessKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY <", value, "processKey");

            return this;
        } // end andProcessKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY <=", value,
                "processKey");

            return this;
        } // end andProcessKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY like",
                buffer.toString(), "processKey");

            return this;
        } // end andProcessKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY not like",
                buffer.toString(), "processKey");

            return this;
        } // end andProcessKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIn(List values) {
            if (values.size() == 1) {
                return andProcessKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY in", values,
                    "processKey");

                return this;
            } // end else
        } // end andProcessKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotIn(List values) {
            if (values.size() == 1) {
                return andProcessKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY not in", values,
                    "processKey");

                return this;
            } // end else
        } // end andProcessKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyIn(Object[] values) {
            if (values.length == 1) {
                return andProcessKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY in",
                    Arrays.asList(values), "processKey");

                return this;
            } // end else
        } // end andProcessKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY not in",
                    Arrays.asList(values), "processKey");

                return this;
            } // end else
        } // end andProcessKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY between", value1,
                value2, "processKey");

            return this;
        } // end andProcessKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_KEY not between", value1,
                value2, "processKey");

            return this;
        } // end andProcessKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME is null");

            return this;
        } // end andProcessNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME is not null");

            return this;
        } // end andProcessNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.PROCESS_NAME is not null AND BPM_PROCESS_DEFINE.PROCESS_NAME <> ''");

            return this;
        } // end andProcessNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.PROCESS_NAME is null OR BPM_PROCESS_DEFINE.PROCESS_NAME = '')");

            return this;
        } // end andProcessNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME =", value,
                "processName");

            return this;
        } // end andProcessNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME <>", value,
                "processName");

            return this;
        } // end andProcessNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME is null OR BPM_PROCESS_DEFINE.PROCESS_NAME <>",
                value, "processName");

            return this;
        } // end andProcessNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME >", value,
                "processName");

            return this;
        } // end andProcessNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME >=", value,
                "processName");

            return this;
        } // end andProcessNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME <", value,
                "processName");

            return this;
        } // end andProcessNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME <=", value,
                "processName");

            return this;
        } // end andProcessNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME like",
                buffer.toString(), "processName");

            return this;
        } // end andProcessNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME not like",
                buffer.toString(), "processName");

            return this;
        } // end andProcessNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIn(List values) {
            if (values.size() == 1) {
                return andProcessNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME in", values,
                    "processName");

                return this;
            } // end else
        } // end andProcessNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotIn(List values) {
            if (values.size() == 1) {
                return andProcessNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME not in", values,
                    "processName");

                return this;
            } // end else
        } // end andProcessNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameIn(Object[] values) {
            if (values.length == 1) {
                return andProcessNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME in",
                    Arrays.asList(values), "processName");

                return this;
            } // end else
        } // end andProcessNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME not in",
                    Arrays.asList(values), "processName");

                return this;
            } // end else
        } // end andProcessNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME between", value1,
                value2, "processName");

            return this;
        } // end andProcessNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_NAME not between", value1,
                value2, "processName");

            return this;
        } // end andProcessNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.REMARKS is not null AND BPM_PROCESS_DEFINE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.REMARKS is null OR BPM_PROCESS_DEFINE.REMARKS = '')");

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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.REMARKS");
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS is null OR BPM_PROCESS_DEFINE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.REMARKS");
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.REMARKS");
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.REMARKS");
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.REMARKS");
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.REMARKS");
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS like", buffer.toString(),
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS not like",
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
                addCriterion("BPM_PROCESS_DEFINE.REMARKS in", values, "remarks");

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
                addCriterion("BPM_PROCESS_DEFINE.REMARKS not in", values,
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
                addCriterion("BPM_PROCESS_DEFINE.REMARKS in",
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
                addCriterion("BPM_PROCESS_DEFINE.REMARKS not in",
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS between", value1, value2,
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
            addCriterion("BPM_PROCESS_DEFINE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.STATUS is not null AND BPM_PROCESS_DEFINE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.STATUS is null OR BPM_PROCESS_DEFINE.STATUS = '')");

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
            addCriterion("BPM_PROCESS_DEFINE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.STATUS");
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS <>", value, "status");

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
            addCriterion("BPM_PROCESS_DEFINE.STATUS is null OR BPM_PROCESS_DEFINE.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.STATUS");
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.STATUS");
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.STATUS");
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.STATUS");
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.STATUS");
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS like", buffer.toString(),
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS not like",
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
                addCriterion("BPM_PROCESS_DEFINE.STATUS in", values, "status");

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
                addCriterion("BPM_PROCESS_DEFINE.STATUS not in", values,
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
                addCriterion("BPM_PROCESS_DEFINE.STATUS in",
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
                addCriterion("BPM_PROCESS_DEFINE.STATUS not in",
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS between", value1, value2,
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
            addCriterion("BPM_PROCESS_DEFINE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID is null");

            return this;
        } // end andCatalogIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID is not null");

            return this;
        } // end andCatalogIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.CATALOG_ID is not null AND BPM_PROCESS_DEFINE.CATALOG_ID <> ''");

            return this;
        } // end andCatalogIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.CATALOG_ID is null OR BPM_PROCESS_DEFINE.CATALOG_ID = '')");

            return this;
        } // end andCatalogIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdEqualTo(long value) {
            return andCatalogIdEqualTo(Long.valueOf(value));
        } // end andCatalogIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID =", value, "catalogId");

            return this;
        } // end andCatalogIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.CATALOG_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualTo(long value) {
            return andCatalogIdNotEqualTo(Long.valueOf(value));
        } // end andCatalogIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID <>", value, "catalogId");

            return this;
        } // end andCatalogIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualToOrIsNull(long value) {
            return andCatalogIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andCatalogIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID is null OR BPM_PROCESS_DEFINE.CATALOG_ID <>",
                value, "catalogId");

            return this;
        } // end andCatalogIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.CATALOG_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThan(long value) {
            return andCatalogIdGreaterThan(Long.valueOf(value));
        } // end andCatalogIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID >", value, "catalogId");

            return this;
        } // end andCatalogIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.CATALOG_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanOrEqualTo(long value) {
            return andCatalogIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andCatalogIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID >=", value, "catalogId");

            return this;
        } // end andCatalogIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.CATALOG_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThan(long value) {
            return andCatalogIdLessThan(Long.valueOf(value));
        } // end andCatalogIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID <", value, "catalogId");

            return this;
        } // end andCatalogIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.CATALOG_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanOrEqualTo(long value) {
            return andCatalogIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andCatalogIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID <=", value, "catalogId");

            return this;
        } // end andCatalogIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_PROCESS_DEFINE.CATALOG_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCatalogIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIn(long[] values) {
            if (values.length == 1) {
                return andCatalogIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotIn(long[] values) {
            if (values.length == 1) {
                return andCatalogIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID not in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIn(List values) {
            if (values.size() == 1) {
                return andCatalogIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotIn(List values) {
            if (values.size() == 1) {
                return andCatalogIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID not in", values,
                    "catalogId");

                return this;
            } // end else
        } // end andCatalogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdIn(Object[] values) {
            if (values.length == 1) {
                return andCatalogIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID in",
                    Arrays.asList(values), "catalogId");

                return this;
            } // end else
        } // end andCatalogIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andCatalogIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID not in",
                    Arrays.asList(values), "catalogId");

                return this;
            } // end else
        } // end andCatalogIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID between", value1,
                value2, "catalogId");

            return this;
        } // end andCatalogIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID between", value1,
                value2, "catalogId");

            return this;
        } // end andCatalogIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID not between", value1,
                value2, "catalogId");

            return this;
        } // end andCatalogIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCatalogIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_DEFINE.CATALOG_ID not between", value1,
                value2, "catalogId");

            return this;
        } // end andCatalogIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION is null");

            return this;
        } // end andProcessVersionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION is not null");

            return this;
        } // end andProcessVersionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.PROCESS_VERSION is not null AND BPM_PROCESS_DEFINE.PROCESS_VERSION <> ''");

            return this;
        } // end andProcessVersionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.PROCESS_VERSION is null OR BPM_PROCESS_DEFINE.PROCESS_VERSION = '')");

            return this;
        } // end andProcessVersionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION =", value,
                "processVersion");

            return this;
        } // end andProcessVersionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_VERSION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessVersionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION <>", value,
                "processVersion");

            return this;
        } // end andProcessVersionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION is null OR BPM_PROCESS_DEFINE.PROCESS_VERSION <>",
                value, "processVersion");

            return this;
        } // end andProcessVersionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_VERSION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessVersionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionGreaterThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION >", value,
                "processVersion");

            return this;
        } // end andProcessVersionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_VERSION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessVersionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION >=", value,
                "processVersion");

            return this;
        } // end andProcessVersionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_VERSION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessVersionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionLessThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION <", value,
                "processVersion");

            return this;
        } // end andProcessVersionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_VERSION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessVersionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION <=", value,
                "processVersion");

            return this;
        } // end andProcessVersionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.PROCESS_VERSION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessVersionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION like",
                buffer.toString(), "processVersion");

            return this;
        } // end andProcessVersionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION not like",
                buffer.toString(), "processVersion");

            return this;
        } // end andProcessVersionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionIn(List values) {
            if (values.size() == 1) {
                return andProcessVersionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION in", values,
                    "processVersion");

                return this;
            } // end else
        } // end andProcessVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionNotIn(List values) {
            if (values.size() == 1) {
                return andProcessVersionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION not in",
                    values, "processVersion");

                return this;
            } // end else
        } // end andProcessVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionIn(Object[] values) {
            if (values.length == 1) {
                return andProcessVersionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION in",
                    Arrays.asList(values), "processVersion");

                return this;
            } // end else
        } // end andProcessVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessVersionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION not in",
                    Arrays.asList(values), "processVersion");

                return this;
            } // end else
        } // end andProcessVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION between", value1,
                value2, "processVersion");

            return this;
        } // end andProcessVersionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessVersionNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.PROCESS_VERSION not between",
                value1, value2, "processVersion");

            return this;
        } // end andProcessVersionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNull() {
            addCriterion("sysUserA.USER_NAME is null");

            return this;
        } // end andLastEditorNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNotNull() {
            addCriterion("sysUserA.USER_NAME is not null");

            return this;
        } // end andLastEditorNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNotEmpty() {
            addCriterion(
                "sysUserA.USER_NAME is not null AND sysUserA.USER_NAME <> ''");

            return this;
        } // end andLastEditorNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsEmpty() {
            addCriterion(
                "(sysUserA.USER_NAME is null OR sysUserA.USER_NAME = '')");

            return this;
        } // end andLastEditorNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameEqualTo(String value) {
            addCriterion("sysUserA.USER_NAME =", value, "lastEditorName");

            return this;
        } // end andLastEditorNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysUserA.USER_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotEqualTo(String value) {
            addCriterion("sysUserA.USER_NAME <>", value, "lastEditorName");

            return this;
        } // end andLastEditorNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotEqualToOrIsNull(String value) {
            addCriterion("sysUserA.USER_NAME is null OR sysUserA.USER_NAME <>",
                value, "lastEditorName");

            return this;
        } // end andLastEditorNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysUserA.USER_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThan(String value) {
            addCriterion("sysUserA.USER_NAME >", value, "lastEditorName");

            return this;
        } // end andLastEditorNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysUserA.USER_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysUserA.USER_NAME >=", value, "lastEditorName");

            return this;
        } // end andLastEditorNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysUserA.USER_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThan(String value) {
            addCriterion("sysUserA.USER_NAME <", value, "lastEditorName");

            return this;
        } // end andLastEditorNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysUserA.USER_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThanOrEqualTo(String value) {
            addCriterion("sysUserA.USER_NAME <=", value, "lastEditorName");

            return this;
        } // end andLastEditorNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysUserA.USER_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysUserA.USER_NAME like", buffer.toString(),
                "lastEditorName");

            return this;
        } // end andLastEditorNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysUserA.USER_NAME not like", buffer.toString(),
                "lastEditorName");

            return this;
        } // end andLastEditorNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIn(List values) {
            if (values.size() == 1) {
                return andLastEditorNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysUserA.USER_NAME in", values, "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotIn(List values) {
            if (values.size() == 1) {
                return andLastEditorNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysUserA.USER_NAME not in", values,
                    "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysUserA.USER_NAME in", Arrays.asList(values),
                    "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysUserA.USER_NAME not in",
                    Arrays.asList(values), "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameBetween(String value1, String value2) {
            addCriterion("sysUserA.USER_NAME between", value1, value2,
                "lastEditorName");

            return this;
        } // end andLastEditorNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotBetween(String value1, String value2) {
            addCriterion("sysUserA.USER_NAME not between", value1, value2,
                "lastEditorName");

            return this;
        } // end andLastEditorNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsNull() {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY is null");

            return this;
        } // end andStartFormKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsNotNull() {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY is not null");

            return this;
        } // end andStartFormKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_DEFINE.START_FORM_KEY is not null AND BPM_PROCESS_DEFINE.START_FORM_KEY <> ''");

            return this;
        } // end andStartFormKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_DEFINE.START_FORM_KEY is null OR BPM_PROCESS_DEFINE.START_FORM_KEY = '')");

            return this;
        } // end andStartFormKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY =", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.START_FORM_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY <>", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY is null OR BPM_PROCESS_DEFINE.START_FORM_KEY <>",
                value, "startFormKey");

            return this;
        } // end andStartFormKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.START_FORM_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY >", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.START_FORM_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY >=", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.START_FORM_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThan(String value) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY <", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.START_FORM_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY <=", value,
                "startFormKey");

            return this;
        } // end andStartFormKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_DEFINE.START_FORM_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartFormKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY like",
                buffer.toString(), "startFormKey");

            return this;
        } // end andStartFormKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY not like",
                buffer.toString(), "startFormKey");

            return this;
        } // end andStartFormKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIn(List values) {
            if (values.size() == 1) {
                return andStartFormKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY in", values,
                    "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotIn(List values) {
            if (values.size() == 1) {
                return andStartFormKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY not in",
                    values, "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyIn(Object[] values) {
            if (values.length == 1) {
                return andStartFormKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY in",
                    Arrays.asList(values), "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andStartFormKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY not in",
                    Arrays.asList(values), "startFormKey");

                return this;
            } // end else
        } // end andStartFormKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY between", value1,
                value2, "startFormKey");

            return this;
        } // end andStartFormKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartFormKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_DEFINE.START_FORM_KEY not between",
                value1, value2, "startFormKey");

            return this;
        } // end andStartFormKeyNotBetween()
    } // end Criteria
} // end BpmProcessDefineDAOQueryBean
