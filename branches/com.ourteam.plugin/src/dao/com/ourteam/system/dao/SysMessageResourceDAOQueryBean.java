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
 * SysMessageResource query bean 2011-09-22 10:11:11
 *
 * @author Auto Gen
 */
public class SysMessageResourceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysMessageResourceDAOQueryBean object.
     */
    public SysMessageResourceDAOQueryBean() {
        super();
    } // end SysMessageResourceDAOQueryBean()

    /**
     * Creates a new SysMessageResourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysMessageResourceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysMessageResourceDAOQueryBean()

    /**
     * Creates a new SysMessageResourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysMessageResourceDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysMessageResourceDAOQueryBean()

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
            addSelectProperty(ISysMessageResourceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMessageKeyIdSelectProperty() {
        addMessageKeyIdSelectProperty("messageKeyId");
    } // end addMessageKeyIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMessageKeyIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysMessageResourceDAO.MessageKeyId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.MessageKeyId,
                "messageKeyId");
        } // end else
    } // end addMessageKeyIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLocalCodeSelectProperty() {
        addLocalCodeSelectProperty("localCode");
    } // end addLocalCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLocalCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysMessageResourceDAO.LocalCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.LocalCode, "localCode");
        } // end else
    } // end addLocalCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMessageValueSelectProperty() {
        addMessageValueSelectProperty("messageValue");
    } // end addMessageValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMessageValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysMessageResourceDAO.MessageValue, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.MessageValue,
                "messageValue");
        } // end else
    } // end addMessageValueSelectProperty()

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
            addSelectProperty(ISysMessageResourceDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.Remarks, "remarks");
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
            addSelectProperty(ISysMessageResourceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMessageKeySelectProperty() {
        addMessageKeySelectProperty("messageKey");
    } // end addMessageKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMessageKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysMessageResourceDAO.MessageKey, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.MessageKey, "messageKey");
        } // end else
    } // end addMessageKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMessageCatalogSelectProperty() {
        addMessageCatalogSelectProperty("messageCatalog");
    } // end addMessageCatalogSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMessageCatalogSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysMessageResourceDAO.MessageCatalog, aAlias);
        } // end if
        else {
            addSelectProperty(ISysMessageResourceDAO.MessageCatalog,
                "messageCatalog");
        } // end else
    } // end addMessageCatalogSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addMessageKeyIdSelectProperty();

        addLocalCodeSelectProperty();

        addMessageValueSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addMessageKeySelectProperty();

        addMessageCatalogSelectProperty();
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_MESSAGE_RESOURCE.ID is not null AND SYS_MESSAGE_RESOURCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_MESSAGE_RESOURCE.ID is null OR SYS_MESSAGE_RESOURCE.ID = '')");

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
            addCriterion("SYS_MESSAGE_RESOURCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.ID");
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID <>", value, "id");

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
            addCriterion("SYS_MESSAGE_RESOURCE.ID is null OR SYS_MESSAGE_RESOURCE.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.ID");
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.ID");
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.ID");
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.ID");
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.ID");
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
                addCriterion("SYS_MESSAGE_RESOURCE.ID in", values, "id");

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
                addCriterion("SYS_MESSAGE_RESOURCE.ID not in", values, "id");

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
                addCriterion("SYS_MESSAGE_RESOURCE.ID in", values, "id");

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
                addCriterion("SYS_MESSAGE_RESOURCE.ID not in", values, "id");

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
                addCriterion("SYS_MESSAGE_RESOURCE.ID in",
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
                addCriterion("SYS_MESSAGE_RESOURCE.ID not in",
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID between", value1, value2, "id");

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
            addCriterion("SYS_MESSAGE_RESOURCE.ID between", value1, value2, "id");

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
            addCriterion("SYS_MESSAGE_RESOURCE.ID not between", value1, value2,
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
            addCriterion("SYS_MESSAGE_RESOURCE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdIsNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID is null");

            return this;
        } // end andMessageKeyIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdIsNotNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID is not null");

            return this;
        } // end andMessageKeyIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdIsNotEmpty() {
            addCriterion(
                "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID is not null AND SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID <> ''");

            return this;
        } // end andMessageKeyIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdIsEmpty() {
            addCriterion(
                "(SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID is null OR SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID = '')");

            return this;
        } // end andMessageKeyIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdEqualTo(long value) {
            return andMessageKeyIdEqualTo(Long.valueOf(value));
        } // end andMessageKeyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID =", value,
                "messageKeyId");

            return this;
        } // end andMessageKeyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotEqualTo(long value) {
            return andMessageKeyIdNotEqualTo(Long.valueOf(value));
        } // end andMessageKeyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID <>", value,
                "messageKeyId");

            return this;
        } // end andMessageKeyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotEqualToOrIsNull(long value) {
            return andMessageKeyIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andMessageKeyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID is null OR SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID <>",
                value, "messageKeyId");

            return this;
        } // end andMessageKeyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdGreaterThan(long value) {
            return andMessageKeyIdGreaterThan(Long.valueOf(value));
        } // end andMessageKeyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID >", value,
                "messageKeyId");

            return this;
        } // end andMessageKeyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdGreaterThanOrEqualTo(long value) {
            return andMessageKeyIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andMessageKeyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID >=", value,
                "messageKeyId");

            return this;
        } // end andMessageKeyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdLessThan(long value) {
            return andMessageKeyIdLessThan(Long.valueOf(value));
        } // end andMessageKeyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdLessThan(java.lang.Long value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID <", value,
                "messageKeyId");

            return this;
        } // end andMessageKeyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdLessThanOrEqualTo(long value) {
            return andMessageKeyIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andMessageKeyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID <=", value,
                "messageKeyId");

            return this;
        } // end andMessageKeyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdIn(long[] values) {
            if (values.length == 1) {
                return andMessageKeyIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID in", values,
                    "messageKeyId");

                return this;
            } // end else
        } // end andMessageKeyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotIn(long[] values) {
            if (values.length == 1) {
                return andMessageKeyIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID not in",
                    values, "messageKeyId");

                return this;
            } // end else
        } // end andMessageKeyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdIn(List values) {
            if (values.size() == 1) {
                return andMessageKeyIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID in", values,
                    "messageKeyId");

                return this;
            } // end else
        } // end andMessageKeyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotIn(List values) {
            if (values.size() == 1) {
                return andMessageKeyIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID not in",
                    values, "messageKeyId");

                return this;
            } // end else
        } // end andMessageKeyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdIn(Object[] values) {
            if (values.length == 1) {
                return andMessageKeyIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID in",
                    Arrays.asList(values), "messageKeyId");

                return this;
            } // end else
        } // end andMessageKeyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andMessageKeyIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID not in",
                    Arrays.asList(values), "messageKeyId");

                return this;
            } // end else
        } // end andMessageKeyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdBetween(long value1, long value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID between", value1,
                value2, "messageKeyId");

            return this;
        } // end andMessageKeyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID between", value1,
                value2, "messageKeyId");

            return this;
        } // end andMessageKeyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotBetween(long value1, long value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID not between",
                value1, value2, "messageKeyId");

            return this;
        } // end andMessageKeyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID not between",
                value1, value2, "messageKeyId");

            return this;
        } // end andMessageKeyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeIsNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE is null");

            return this;
        } // end andLocalCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeIsNotNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE is not null");

            return this;
        } // end andLocalCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeIsNotEmpty() {
            addCriterion(
                "SYS_MESSAGE_RESOURCE.LOCAL_CODE is not null AND SYS_MESSAGE_RESOURCE.LOCAL_CODE <> ''");

            return this;
        } // end andLocalCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeIsEmpty() {
            addCriterion(
                "(SYS_MESSAGE_RESOURCE.LOCAL_CODE is null OR SYS_MESSAGE_RESOURCE.LOCAL_CODE = '')");

            return this;
        } // end andLocalCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE =", value, "localCode");

            return this;
        } // end andLocalCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.LOCAL_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLocalCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeNotEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE <>", value,
                "localCode");

            return this;
        } // end andLocalCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE is null OR SYS_MESSAGE_RESOURCE.LOCAL_CODE <>",
                value, "localCode");

            return this;
        } // end andLocalCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.LOCAL_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLocalCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeGreaterThan(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE >", value, "localCode");

            return this;
        } // end andLocalCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.LOCAL_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLocalCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE >=", value,
                "localCode");

            return this;
        } // end andLocalCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.LOCAL_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLocalCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeLessThan(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE <", value, "localCode");

            return this;
        } // end andLocalCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.LOCAL_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLocalCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE <=", value,
                "localCode");

            return this;
        } // end andLocalCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.LOCAL_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLocalCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE like",
                buffer.toString(), "localCode");

            return this;
        } // end andLocalCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE not like",
                buffer.toString(), "localCode");

            return this;
        } // end andLocalCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeIn(List values) {
            if (values.size() == 1) {
                return andLocalCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE in", values,
                    "localCode");

                return this;
            } // end else
        } // end andLocalCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeNotIn(List values) {
            if (values.size() == 1) {
                return andLocalCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE not in", values,
                    "localCode");

                return this;
            } // end else
        } // end andLocalCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeIn(Object[] values) {
            if (values.length == 1) {
                return andLocalCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE in",
                    Arrays.asList(values), "localCode");

                return this;
            } // end else
        } // end andLocalCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andLocalCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE not in",
                    Arrays.asList(values), "localCode");

                return this;
            } // end else
        } // end andLocalCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeBetween(String value1, String value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE between", value1,
                value2, "localCode");

            return this;
        } // end andLocalCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLocalCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.LOCAL_CODE not between", value1,
                value2, "localCode");

            return this;
        } // end andLocalCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueIsNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE is null");

            return this;
        } // end andMessageValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueIsNotNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE is not null");

            return this;
        } // end andMessageValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueIsNotEmpty() {
            addCriterion(
                "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE is not null AND SYS_MESSAGE_RESOURCE.MESSAGE_VALUE <> ''");

            return this;
        } // end andMessageValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueIsEmpty() {
            addCriterion(
                "(SYS_MESSAGE_RESOURCE.MESSAGE_VALUE is null OR SYS_MESSAGE_RESOURCE.MESSAGE_VALUE = '')");

            return this;
        } // end andMessageValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE =", value,
                "messageValue");

            return this;
        } // end andMessageValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueNotEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE <>", value,
                "messageValue");

            return this;
        } // end andMessageValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueNotEqualToOrIsNull(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE is null OR SYS_MESSAGE_RESOURCE.MESSAGE_VALUE <>",
                value, "messageValue");

            return this;
        } // end andMessageValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueGreaterThan(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE >", value,
                "messageValue");

            return this;
        } // end andMessageValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE >=", value,
                "messageValue");

            return this;
        } // end andMessageValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueLessThan(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE <", value,
                "messageValue");

            return this;
        } // end andMessageValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueLessThanOrEqualTo(String value) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE <=", value,
                "messageValue");

            return this;
        } // end andMessageValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE like",
                buffer.toString(), "messageValue");

            return this;
        } // end andMessageValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE not like",
                buffer.toString(), "messageValue");

            return this;
        } // end andMessageValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueIn(List values) {
            if (values.size() == 1) {
                return andMessageValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE in", values,
                    "messageValue");

                return this;
            } // end else
        } // end andMessageValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueNotIn(List values) {
            if (values.size() == 1) {
                return andMessageValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE not in",
                    values, "messageValue");

                return this;
            } // end else
        } // end andMessageValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueIn(Object[] values) {
            if (values.length == 1) {
                return andMessageValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE in",
                    Arrays.asList(values), "messageValue");

                return this;
            } // end else
        } // end andMessageValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andMessageValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE not in",
                    Arrays.asList(values), "messageValue");

                return this;
            } // end else
        } // end andMessageValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueBetween(String value1, String value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE between", value1,
                value2, "messageValue");

            return this;
        } // end andMessageValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageValueNotBetween(String value1, String value2) {
            addCriterion("SYS_MESSAGE_RESOURCE.MESSAGE_VALUE not between",
                value1, value2, "messageValue");

            return this;
        } // end andMessageValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_MESSAGE_RESOURCE.REMARKS is not null AND SYS_MESSAGE_RESOURCE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_MESSAGE_RESOURCE.REMARKS is null OR SYS_MESSAGE_RESOURCE.REMARKS = '')");

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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.REMARKS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS is null OR SYS_MESSAGE_RESOURCE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.REMARKS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.REMARKS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.REMARKS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.REMARKS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.REMARKS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS like",
                buffer.toString(), "remarks");

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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS not like",
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
                addCriterion("SYS_MESSAGE_RESOURCE.REMARKS in", values,
                    "remarks");

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
                addCriterion("SYS_MESSAGE_RESOURCE.REMARKS not in", values,
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
                addCriterion("SYS_MESSAGE_RESOURCE.REMARKS in",
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
                addCriterion("SYS_MESSAGE_RESOURCE.REMARKS not in",
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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS between", value1,
                value2, "remarks");

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
            addCriterion("SYS_MESSAGE_RESOURCE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_MESSAGE_RESOURCE.STATUS is not null AND SYS_MESSAGE_RESOURCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_MESSAGE_RESOURCE.STATUS is null OR SYS_MESSAGE_RESOURCE.STATUS = '')");

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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.STATUS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS <>", value, "status");

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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS is null OR SYS_MESSAGE_RESOURCE.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.STATUS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.STATUS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.STATUS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.STATUS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_MESSAGE_RESOURCE.STATUS");
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS like", buffer.toString(),
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS not like",
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
                addCriterion("SYS_MESSAGE_RESOURCE.STATUS in", values, "status");

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
                addCriterion("SYS_MESSAGE_RESOURCE.STATUS not in", values,
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
                addCriterion("SYS_MESSAGE_RESOURCE.STATUS in",
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
                addCriterion("SYS_MESSAGE_RESOURCE.STATUS not in",
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS between", value1, value2,
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
            addCriterion("SYS_MESSAGE_RESOURCE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIsNull() {
            addCriterion("sysMessageKey.MESSAGE_KEY is null");

            return this;
        } // end andMessageKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIsNotNull() {
            addCriterion("sysMessageKey.MESSAGE_KEY is not null");

            return this;
        } // end andMessageKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIsNotEmpty() {
            addCriterion(
                "sysMessageKey.MESSAGE_KEY is not null AND sysMessageKey.MESSAGE_KEY <> ''");

            return this;
        } // end andMessageKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIsEmpty() {
            addCriterion(
                "(sysMessageKey.MESSAGE_KEY is null OR sysMessageKey.MESSAGE_KEY = '')");

            return this;
        } // end andMessageKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_KEY =", value, "messageKey");

            return this;
        } // end andMessageKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyNotEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_KEY <>", value, "messageKey");

            return this;
        } // end andMessageKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyNotEqualToOrIsNull(String value) {
            addCriterion("sysMessageKey.MESSAGE_KEY is null OR sysMessageKey.MESSAGE_KEY <>",
                value, "messageKey");

            return this;
        } // end andMessageKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyGreaterThan(String value) {
            addCriterion("sysMessageKey.MESSAGE_KEY >", value, "messageKey");

            return this;
        } // end andMessageKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyGreaterThanOrEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_KEY >=", value, "messageKey");

            return this;
        } // end andMessageKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyLessThan(String value) {
            addCriterion("sysMessageKey.MESSAGE_KEY <", value, "messageKey");

            return this;
        } // end andMessageKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyLessThanOrEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_KEY <=", value, "messageKey");

            return this;
        } // end andMessageKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysMessageKey.MESSAGE_KEY like", buffer.toString(),
                "messageKey");

            return this;
        } // end andMessageKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysMessageKey.MESSAGE_KEY not like",
                buffer.toString(), "messageKey");

            return this;
        } // end andMessageKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIn(List values) {
            if (values.size() == 1) {
                return andMessageKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_KEY in", values,
                    "messageKey");

                return this;
            } // end else
        } // end andMessageKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyNotIn(List values) {
            if (values.size() == 1) {
                return andMessageKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_KEY not in", values,
                    "messageKey");

                return this;
            } // end else
        } // end andMessageKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyIn(Object[] values) {
            if (values.length == 1) {
                return andMessageKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_KEY in",
                    Arrays.asList(values), "messageKey");

                return this;
            } // end else
        } // end andMessageKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andMessageKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_KEY not in",
                    Arrays.asList(values), "messageKey");

                return this;
            } // end else
        } // end andMessageKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyBetween(String value1, String value2) {
            addCriterion("sysMessageKey.MESSAGE_KEY between", value1, value2,
                "messageKey");

            return this;
        } // end andMessageKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageKeyNotBetween(String value1, String value2) {
            addCriterion("sysMessageKey.MESSAGE_KEY not between", value1,
                value2, "messageKey");

            return this;
        } // end andMessageKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogIsNull() {
            addCriterion("sysMessageKey.MESSAGE_CATALOG is null");

            return this;
        } // end andMessageCatalogIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogIsNotNull() {
            addCriterion("sysMessageKey.MESSAGE_CATALOG is not null");

            return this;
        } // end andMessageCatalogIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogIsNotEmpty() {
            addCriterion(
                "sysMessageKey.MESSAGE_CATALOG is not null AND sysMessageKey.MESSAGE_CATALOG <> ''");

            return this;
        } // end andMessageCatalogIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogIsEmpty() {
            addCriterion(
                "(sysMessageKey.MESSAGE_CATALOG is null OR sysMessageKey.MESSAGE_CATALOG = '')");

            return this;
        } // end andMessageCatalogIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG =", value,
                "messageCatalog");

            return this;
        } // end andMessageCatalogEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_CATALOG");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageCatalogEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogNotEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG <>", value,
                "messageCatalog");

            return this;
        } // end andMessageCatalogNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogNotEqualToOrIsNull(String value) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG is null OR sysMessageKey.MESSAGE_CATALOG <>",
                value, "messageCatalog");

            return this;
        } // end andMessageCatalogNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_CATALOG");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageCatalogNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogGreaterThan(String value) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG >", value,
                "messageCatalog");

            return this;
        } // end andMessageCatalogGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_CATALOG");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageCatalogGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG >=", value,
                "messageCatalog");

            return this;
        } // end andMessageCatalogGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_CATALOG");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageCatalogGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogLessThan(String value) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG <", value,
                "messageCatalog");

            return this;
        } // end andMessageCatalogLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_CATALOG");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageCatalogLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogLessThanOrEqualTo(String value) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG <=", value,
                "messageCatalog");

            return this;
        } // end andMessageCatalogLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysMessageKey.MESSAGE_CATALOG");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMessageCatalogLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysMessageKey.MESSAGE_CATALOG like",
                buffer.toString(), "messageCatalog");

            return this;
        } // end andMessageCatalogLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysMessageKey.MESSAGE_CATALOG not like",
                buffer.toString(), "messageCatalog");

            return this;
        } // end andMessageCatalogNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogIn(List values) {
            if (values.size() == 1) {
                return andMessageCatalogEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_CATALOG in", values,
                    "messageCatalog");

                return this;
            } // end else
        } // end andMessageCatalogIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogNotIn(List values) {
            if (values.size() == 1) {
                return andMessageCatalogNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_CATALOG not in", values,
                    "messageCatalog");

                return this;
            } // end else
        } // end andMessageCatalogNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogIn(Object[] values) {
            if (values.length == 1) {
                return andMessageCatalogEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_CATALOG in",
                    Arrays.asList(values), "messageCatalog");

                return this;
            } // end else
        } // end andMessageCatalogIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogNotIn(Object[] values) {
            if (values.length == 1) {
                return andMessageCatalogNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysMessageKey.MESSAGE_CATALOG not in",
                    Arrays.asList(values), "messageCatalog");

                return this;
            } // end else
        } // end andMessageCatalogNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogBetween(String value1, String value2) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG between", value1,
                value2, "messageCatalog");

            return this;
        } // end andMessageCatalogBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMessageCatalogNotBetween(String value1, String value2) {
            addCriterion("sysMessageKey.MESSAGE_CATALOG not between", value1,
                value2, "messageCatalog");

            return this;
        } // end andMessageCatalogNotBetween()
    } // end Criteria
} // end SysMessageResourceDAOQueryBean
