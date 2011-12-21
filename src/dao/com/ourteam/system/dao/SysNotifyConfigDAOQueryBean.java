/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * SysNotifyConfig query bean 2011-11-24 15:00:28
 *
 * @author Auto Gen
 */
public class SysNotifyConfigDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysNotifyConfigDAOQueryBean object.
     */
    public SysNotifyConfigDAOQueryBean() {
        super();
    } // end SysNotifyConfigDAOQueryBean()

    /**
     * Creates a new SysNotifyConfigDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysNotifyConfigDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysNotifyConfigDAOQueryBean()

    /**
     * Creates a new SysNotifyConfigDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysNotifyConfigDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysNotifyConfigDAOQueryBean()

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
    public void addCheckIntervalSelectProperty() {
        addCheckIntervalSelectProperty("checkInterval");
    } // end addCheckIntervalSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCheckIntervalSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysNotifyConfigDAO.CheckInterval, aAlias);
        } // end if
        else {
            addSelectProperty(ISysNotifyConfigDAO.CheckInterval, "checkInterval");
        } // end else
    } // end addCheckIntervalSelectProperty()

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
            addSelectProperty(ISysNotifyConfigDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysNotifyConfigDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNotifyIconSelectProperty() {
        addNotifyIconSelectProperty("notifyIcon");
    } // end addNotifyIconSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNotifyIconSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysNotifyConfigDAO.NotifyIcon, aAlias);
        } // end if
        else {
            addSelectProperty(ISysNotifyConfigDAO.NotifyIcon, "notifyIcon");
        } // end else
    } // end addNotifyIconSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNotifyListenerSelectProperty() {
        addNotifyListenerSelectProperty("notifyListener");
    } // end addNotifyListenerSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNotifyListenerSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysNotifyConfigDAO.NotifyListener, aAlias);
        } // end if
        else {
            addSelectProperty(ISysNotifyConfigDAO.NotifyListener,
                "notifyListener");
        } // end else
    } // end addNotifyListenerSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNotifyMessageSelectProperty() {
        addNotifyMessageSelectProperty("notifyMessage");
    } // end addNotifyMessageSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNotifyMessageSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysNotifyConfigDAO.NotifyMessage, aAlias);
        } // end if
        else {
            addSelectProperty(ISysNotifyConfigDAO.NotifyMessage, "notifyMessage");
        } // end else
    } // end addNotifyMessageSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNotifyNameSelectProperty() {
        addNotifyNameSelectProperty("notifyName");
    } // end addNotifyNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNotifyNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysNotifyConfigDAO.NotifyName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysNotifyConfigDAO.NotifyName, "notifyName");
        } // end else
    } // end addNotifyNameSelectProperty()

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
            addSelectProperty(ISysNotifyConfigDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysNotifyConfigDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addCheckIntervalSelectProperty();

        addIdSelectProperty();

        addNotifyIconSelectProperty();

        addNotifyListenerSelectProperty();

        addNotifyMessageSelectProperty();

        addNotifyNameSelectProperty();

        addStatusSelectProperty();
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
        public Criteria andCheckIntervalIsNull() {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL is null");

            return this;
        } // end andCheckIntervalIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalIsNotNull() {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL is not null");

            return this;
        } // end andCheckIntervalIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalIsNotEmpty() {
            addCriterion(
                "SYS_NOTIFY_CONFIG.CHECK_INTERVAL is not null AND SYS_NOTIFY_CONFIG.CHECK_INTERVAL <> ''");

            return this;
        } // end andCheckIntervalIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalIsEmpty() {
            addCriterion(
                "(SYS_NOTIFY_CONFIG.CHECK_INTERVAL is null OR SYS_NOTIFY_CONFIG.CHECK_INTERVAL = '')");

            return this;
        } // end andCheckIntervalIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalEqualTo(int value) {
            return andCheckIntervalEqualTo(Integer.valueOf(value));
        } // end andCheckIntervalEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalEqualTo(java.lang.Integer value) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL =", value,
                "checkInterval");

            return this;
        } // end andCheckIntervalEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.CHECK_INTERVAL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCheckIntervalEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotEqualTo(int value) {
            return andCheckIntervalNotEqualTo(Integer.valueOf(value));
        } // end andCheckIntervalNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotEqualTo(java.lang.Integer value) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL <>", value,
                "checkInterval");

            return this;
        } // end andCheckIntervalNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotEqualToOrIsNull(int value) {
            return andCheckIntervalNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andCheckIntervalNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotEqualToOrIsNull(
            java.lang.Integer value) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL is null OR SYS_NOTIFY_CONFIG.CHECK_INTERVAL <>",
                value, "checkInterval");

            return this;
        } // end andCheckIntervalNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.CHECK_INTERVAL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCheckIntervalNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalGreaterThan(int value) {
            return andCheckIntervalGreaterThan(Integer.valueOf(value));
        } // end andCheckIntervalGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalGreaterThan(java.lang.Integer value) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL >", value,
                "checkInterval");

            return this;
        } // end andCheckIntervalGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.CHECK_INTERVAL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCheckIntervalGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalGreaterThanOrEqualTo(int value) {
            return andCheckIntervalGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andCheckIntervalGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL >=", value,
                "checkInterval");

            return this;
        } // end andCheckIntervalGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.CHECK_INTERVAL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCheckIntervalGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalLessThan(int value) {
            return andCheckIntervalLessThan(Integer.valueOf(value));
        } // end andCheckIntervalLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalLessThan(java.lang.Integer value) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL <", value,
                "checkInterval");

            return this;
        } // end andCheckIntervalLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.CHECK_INTERVAL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCheckIntervalLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalLessThanOrEqualTo(int value) {
            return andCheckIntervalLessThanOrEqualTo(Integer.valueOf(value));
        } // end andCheckIntervalLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalLessThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL <=", value,
                "checkInterval");

            return this;
        } // end andCheckIntervalLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.CHECK_INTERVAL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCheckIntervalLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalIn(int[] values) {
            if (values.length == 1) {
                return andCheckIntervalEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL in", values,
                    "checkInterval");

                return this;
            } // end else
        } // end andCheckIntervalIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotIn(int[] values) {
            if (values.length == 1) {
                return andCheckIntervalNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL not in", values,
                    "checkInterval");

                return this;
            } // end else
        } // end andCheckIntervalNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalIn(List values) {
            if (values.size() == 1) {
                return andCheckIntervalEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL in", values,
                    "checkInterval");

                return this;
            } // end else
        } // end andCheckIntervalIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotIn(List values) {
            if (values.size() == 1) {
                return andCheckIntervalNotEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL not in", values,
                    "checkInterval");

                return this;
            } // end else
        } // end andCheckIntervalNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalIn(Object[] values) {
            if (values.length == 1) {
                return andCheckIntervalEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL in",
                    Arrays.asList(values), "checkInterval");

                return this;
            } // end else
        } // end andCheckIntervalIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotIn(Object[] values) {
            if (values.length == 1) {
                return andCheckIntervalNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL not in",
                    Arrays.asList(values), "checkInterval");

                return this;
            } // end else
        } // end andCheckIntervalNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalBetween(int value1, int value2) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL between", value1,
                value2, "checkInterval");

            return this;
        } // end andCheckIntervalBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL between", value1,
                value2, "checkInterval");

            return this;
        } // end andCheckIntervalBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotBetween(int value1, int value2) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL not between",
                value1, value2, "checkInterval");

            return this;
        } // end andCheckIntervalNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCheckIntervalNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_NOTIFY_CONFIG.CHECK_INTERVAL not between",
                value1, value2, "checkInterval");

            return this;
        } // end andCheckIntervalNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNull() {
            addCriterion("SYS_NOTIFY_CONFIG.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_NOTIFY_CONFIG.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_NOTIFY_CONFIG.ID is not null AND SYS_NOTIFY_CONFIG.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_NOTIFY_CONFIG.ID is null OR SYS_NOTIFY_CONFIG.ID = '')");

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
            addCriterion("SYS_NOTIFY_CONFIG.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.ID");
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
            addCriterion("SYS_NOTIFY_CONFIG.ID <>", value, "id");

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
            addCriterion("SYS_NOTIFY_CONFIG.ID is null OR SYS_NOTIFY_CONFIG.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.ID");
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
            addCriterion("SYS_NOTIFY_CONFIG.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.ID");
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
            addCriterion("SYS_NOTIFY_CONFIG.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.ID");
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
            addCriterion("SYS_NOTIFY_CONFIG.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.ID");
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
            addCriterion("SYS_NOTIFY_CONFIG.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.ID");
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
                addCriterion("SYS_NOTIFY_CONFIG.ID in", values, "id");

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
                addCriterion("SYS_NOTIFY_CONFIG.ID not in", values, "id");

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
                addCriterion("SYS_NOTIFY_CONFIG.ID in", values, "id");

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
                addCriterion("SYS_NOTIFY_CONFIG.ID not in", values, "id");

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
                addCriterion("SYS_NOTIFY_CONFIG.ID in", Arrays.asList(values),
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
                addCriterion("SYS_NOTIFY_CONFIG.ID not in",
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
            addCriterion("SYS_NOTIFY_CONFIG.ID between", value1, value2, "id");

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
            addCriterion("SYS_NOTIFY_CONFIG.ID between", value1, value2, "id");

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
            addCriterion("SYS_NOTIFY_CONFIG.ID not between", value1, value2,
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
            addCriterion("SYS_NOTIFY_CONFIG.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconIsNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON is null");

            return this;
        } // end andNotifyIconIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconIsNotNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON is not null");

            return this;
        } // end andNotifyIconIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconIsNotEmpty() {
            addCriterion(
                "SYS_NOTIFY_CONFIG.NOTIFY_ICON is not null AND SYS_NOTIFY_CONFIG.NOTIFY_ICON <> ''");

            return this;
        } // end andNotifyIconIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconIsEmpty() {
            addCriterion(
                "(SYS_NOTIFY_CONFIG.NOTIFY_ICON is null OR SYS_NOTIFY_CONFIG.NOTIFY_ICON = '')");

            return this;
        } // end andNotifyIconIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON =", value, "notifyIcon");

            return this;
        } // end andNotifyIconEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_ICON");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyIconEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconNotEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON <>", value, "notifyIcon");

            return this;
        } // end andNotifyIconNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconNotEqualToOrIsNull(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON is null OR SYS_NOTIFY_CONFIG.NOTIFY_ICON <>",
                value, "notifyIcon");

            return this;
        } // end andNotifyIconNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_ICON");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyIconNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconGreaterThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON >", value, "notifyIcon");

            return this;
        } // end andNotifyIconGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_ICON");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyIconGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON >=", value, "notifyIcon");

            return this;
        } // end andNotifyIconGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_ICON");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyIconGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconLessThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON <", value, "notifyIcon");

            return this;
        } // end andNotifyIconLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_ICON");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyIconLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconLessThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON <=", value, "notifyIcon");

            return this;
        } // end andNotifyIconLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_ICON");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyIconLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON like",
                buffer.toString(), "notifyIcon");

            return this;
        } // end andNotifyIconLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON not like",
                buffer.toString(), "notifyIcon");

            return this;
        } // end andNotifyIconNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconIn(List values) {
            if (values.size() == 1) {
                return andNotifyIconEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON in", values,
                    "notifyIcon");

                return this;
            } // end else
        } // end andNotifyIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconNotIn(List values) {
            if (values.size() == 1) {
                return andNotifyIconNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON not in", values,
                    "notifyIcon");

                return this;
            } // end else
        } // end andNotifyIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyIconEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON in",
                    Arrays.asList(values), "notifyIcon");

                return this;
            } // end else
        } // end andNotifyIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconNotIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyIconNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON not in",
                    Arrays.asList(values), "notifyIcon");

                return this;
            } // end else
        } // end andNotifyIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON between", value1,
                value2, "notifyIcon");

            return this;
        } // end andNotifyIconBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyIconNotBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_ICON not between", value1,
                value2, "notifyIcon");

            return this;
        } // end andNotifyIconNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerIsNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER is null");

            return this;
        } // end andNotifyListenerIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerIsNotNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER is not null");

            return this;
        } // end andNotifyListenerIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerIsNotEmpty() {
            addCriterion(
                "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER is not null AND SYS_NOTIFY_CONFIG.NOTIFY_LISTENER <> ''");

            return this;
        } // end andNotifyListenerIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerIsEmpty() {
            addCriterion(
                "(SYS_NOTIFY_CONFIG.NOTIFY_LISTENER is null OR SYS_NOTIFY_CONFIG.NOTIFY_LISTENER = '')");

            return this;
        } // end andNotifyListenerIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER =", value,
                "notifyListener");

            return this;
        } // end andNotifyListenerEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyListenerEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerNotEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER <>", value,
                "notifyListener");

            return this;
        } // end andNotifyListenerNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerNotEqualToOrIsNull(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER is null OR SYS_NOTIFY_CONFIG.NOTIFY_LISTENER <>",
                value, "notifyListener");

            return this;
        } // end andNotifyListenerNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyListenerNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerGreaterThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER >", value,
                "notifyListener");

            return this;
        } // end andNotifyListenerGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyListenerGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER >=", value,
                "notifyListener");

            return this;
        } // end andNotifyListenerGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyListenerGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerLessThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER <", value,
                "notifyListener");

            return this;
        } // end andNotifyListenerLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyListenerLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerLessThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER <=", value,
                "notifyListener");

            return this;
        } // end andNotifyListenerLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyListenerLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER like",
                buffer.toString(), "notifyListener");

            return this;
        } // end andNotifyListenerLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER not like",
                buffer.toString(), "notifyListener");

            return this;
        } // end andNotifyListenerNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerIn(List values) {
            if (values.size() == 1) {
                return andNotifyListenerEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER in", values,
                    "notifyListener");

                return this;
            } // end else
        } // end andNotifyListenerIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerNotIn(List values) {
            if (values.size() == 1) {
                return andNotifyListenerNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER not in",
                    values, "notifyListener");

                return this;
            } // end else
        } // end andNotifyListenerNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyListenerEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER in",
                    Arrays.asList(values), "notifyListener");

                return this;
            } // end else
        } // end andNotifyListenerIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerNotIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyListenerNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER not in",
                    Arrays.asList(values), "notifyListener");

                return this;
            } // end else
        } // end andNotifyListenerNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER between", value1,
                value2, "notifyListener");

            return this;
        } // end andNotifyListenerBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyListenerNotBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_LISTENER not between",
                value1, value2, "notifyListener");

            return this;
        } // end andNotifyListenerNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageIsNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE is null");

            return this;
        } // end andNotifyMessageIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageIsNotNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE is not null");

            return this;
        } // end andNotifyMessageIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageIsNotEmpty() {
            addCriterion(
                "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE is not null AND SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE <> ''");

            return this;
        } // end andNotifyMessageIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageIsEmpty() {
            addCriterion(
                "(SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE is null OR SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE = '')");

            return this;
        } // end andNotifyMessageIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE =", value,
                "notifyMessage");

            return this;
        } // end andNotifyMessageEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyMessageEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageNotEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE <>", value,
                "notifyMessage");

            return this;
        } // end andNotifyMessageNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageNotEqualToOrIsNull(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE is null OR SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE <>",
                value, "notifyMessage");

            return this;
        } // end andNotifyMessageNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyMessageNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageGreaterThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE >", value,
                "notifyMessage");

            return this;
        } // end andNotifyMessageGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyMessageGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE >=", value,
                "notifyMessage");

            return this;
        } // end andNotifyMessageGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyMessageGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageLessThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE <", value,
                "notifyMessage");

            return this;
        } // end andNotifyMessageLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyMessageLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageLessThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE <=", value,
                "notifyMessage");

            return this;
        } // end andNotifyMessageLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyMessageLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE like",
                buffer.toString(), "notifyMessage");

            return this;
        } // end andNotifyMessageLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE not like",
                buffer.toString(), "notifyMessage");

            return this;
        } // end andNotifyMessageNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageIn(List values) {
            if (values.size() == 1) {
                return andNotifyMessageEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE in", values,
                    "notifyMessage");

                return this;
            } // end else
        } // end andNotifyMessageIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageNotIn(List values) {
            if (values.size() == 1) {
                return andNotifyMessageNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE not in", values,
                    "notifyMessage");

                return this;
            } // end else
        } // end andNotifyMessageNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyMessageEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE in",
                    Arrays.asList(values), "notifyMessage");

                return this;
            } // end else
        } // end andNotifyMessageIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageNotIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyMessageNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE not in",
                    Arrays.asList(values), "notifyMessage");

                return this;
            } // end else
        } // end andNotifyMessageNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE between", value1,
                value2, "notifyMessage");

            return this;
        } // end andNotifyMessageBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyMessageNotBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE not between",
                value1, value2, "notifyMessage");

            return this;
        } // end andNotifyMessageNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameIsNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME is null");

            return this;
        } // end andNotifyNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameIsNotNull() {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME is not null");

            return this;
        } // end andNotifyNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameIsNotEmpty() {
            addCriterion(
                "SYS_NOTIFY_CONFIG.NOTIFY_NAME is not null AND SYS_NOTIFY_CONFIG.NOTIFY_NAME <> ''");

            return this;
        } // end andNotifyNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameIsEmpty() {
            addCriterion(
                "(SYS_NOTIFY_CONFIG.NOTIFY_NAME is null OR SYS_NOTIFY_CONFIG.NOTIFY_NAME = '')");

            return this;
        } // end andNotifyNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME =", value, "notifyName");

            return this;
        } // end andNotifyNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameNotEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME <>", value, "notifyName");

            return this;
        } // end andNotifyNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME is null OR SYS_NOTIFY_CONFIG.NOTIFY_NAME <>",
                value, "notifyName");

            return this;
        } // end andNotifyNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameGreaterThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME >", value, "notifyName");

            return this;
        } // end andNotifyNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME >=", value, "notifyName");

            return this;
        } // end andNotifyNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameLessThan(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME <", value, "notifyName");

            return this;
        } // end andNotifyNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME <=", value, "notifyName");

            return this;
        } // end andNotifyNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.NOTIFY_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNotifyNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME like",
                buffer.toString(), "notifyName");

            return this;
        } // end andNotifyNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME not like",
                buffer.toString(), "notifyName");

            return this;
        } // end andNotifyNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameIn(List values) {
            if (values.size() == 1) {
                return andNotifyNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME in", values,
                    "notifyName");

                return this;
            } // end else
        } // end andNotifyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameNotIn(List values) {
            if (values.size() == 1) {
                return andNotifyNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME not in", values,
                    "notifyName");

                return this;
            } // end else
        } // end andNotifyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME in",
                    Arrays.asList(values), "notifyName");

                return this;
            } // end else
        } // end andNotifyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andNotifyNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME not in",
                    Arrays.asList(values), "notifyName");

                return this;
            } // end else
        } // end andNotifyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME between", value1,
                value2, "notifyName");

            return this;
        } // end andNotifyNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNotifyNameNotBetween(String value1, String value2) {
            addCriterion("SYS_NOTIFY_CONFIG.NOTIFY_NAME not between", value1,
                value2, "notifyName");

            return this;
        } // end andNotifyNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_NOTIFY_CONFIG.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_NOTIFY_CONFIG.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_NOTIFY_CONFIG.STATUS is not null AND SYS_NOTIFY_CONFIG.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_NOTIFY_CONFIG.STATUS is null OR SYS_NOTIFY_CONFIG.STATUS = '')");

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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.STATUS");
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS <>", value, "status");

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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS is null OR SYS_NOTIFY_CONFIG.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.STATUS");
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.STATUS");
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.STATUS");
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.STATUS");
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_NOTIFY_CONFIG.STATUS");
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS like", buffer.toString(),
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS not like",
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
                addCriterion("SYS_NOTIFY_CONFIG.STATUS in", values, "status");

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
                addCriterion("SYS_NOTIFY_CONFIG.STATUS not in", values, "status");

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
                addCriterion("SYS_NOTIFY_CONFIG.STATUS in",
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
                addCriterion("SYS_NOTIFY_CONFIG.STATUS not in",
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS between", value1, value2,
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
            addCriterion("SYS_NOTIFY_CONFIG.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()
    } // end Criteria
} // end SysNotifyConfigDAOQueryBean
