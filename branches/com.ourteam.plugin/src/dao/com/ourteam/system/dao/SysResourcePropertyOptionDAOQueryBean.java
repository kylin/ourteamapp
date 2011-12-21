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
 * SysResourcePropertyOption query bean 2011-09-22 10:11:17
 *
 * @author Auto Gen
 */
public class SysResourcePropertyOptionDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysResourcePropertyOptionDAOQueryBean object.
     */
    public SysResourcePropertyOptionDAOQueryBean() {
        super();
    } // end SysResourcePropertyOptionDAOQueryBean()

    /**
     * Creates a new SysResourcePropertyOptionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysResourcePropertyOptionDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysResourcePropertyOptionDAOQueryBean()

    /**
     * Creates a new SysResourcePropertyOptionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysResourcePropertyOptionDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysResourcePropertyOptionDAOQueryBean()

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
            addSelectProperty(ISysResourcePropertyOptionDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyOptionDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(ISysResourcePropertyOptionDAO.OrderIndex, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyOptionDAO.OrderIndex,
                "orderIndex");
        } // end else
    } // end addOrderIndexSelectProperty()

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
            addSelectProperty(ISysResourcePropertyOptionDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyOptionDAO.Remarks, "remarks");
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
            addSelectProperty(ISysResourcePropertyOptionDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyOptionDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysResourcePropertyIdSelectProperty() {
        addSysResourcePropertyIdSelectProperty("sysResourcePropertyId");
    } // end addSysResourcePropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysResourcePropertyIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyOptionDAO.SysResourcePropertyId,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyOptionDAO.SysResourcePropertyId,
                "sysResourcePropertyId");
        } // end else
    } // end addSysResourcePropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addValueCodeSelectProperty() {
        addValueCodeSelectProperty("valueCode");
    } // end addValueCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addValueCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyOptionDAO.ValueCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyOptionDAO.ValueCode,
                "valueCode");
        } // end else
    } // end addValueCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addValueLableSelectProperty() {
        addValueLableSelectProperty("valueLable");
    } // end addValueLableSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addValueLableSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyOptionDAO.ValueLable, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyOptionDAO.ValueLable,
                "valueLable");
        } // end else
    } // end addValueLableSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addOrderIndexSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addSysResourcePropertyIdSelectProperty();

        addValueCodeSelectProperty();

        addValueLableSelectProperty();
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.ID is not null AND SYS_RESOURCE_PROPERTY_OPTION.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY_OPTION.ID is null OR SYS_RESOURCE_PROPERTY_OPTION.ID = '')");

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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID =", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID <>", value, "id");

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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID is null OR SYS_RESOURCE_PROPERTY_OPTION.ID <>",
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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID >", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID <", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.ID");
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID not in", values,
                    "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID not in", values,
                    "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID in",
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID not in",
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID between", value1,
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID between", value1,
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID not between", value1,
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX is null");

            return this;
        } // end andOrderIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX is not null");

            return this;
        } // end andOrderIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX is not null AND SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX <> ''");

            return this;
        } // end andOrderIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX is null OR SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX = '')");

            return this;
        } // end andOrderIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexEqualTo(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX =", value,
                "orderIndex");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX");
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
        public Criteria andOrderIndexNotEqualTo(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX <>", value,
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
        public Criteria andOrderIndexNotEqualToOrIsNull(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX is null OR SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX <>",
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
                    "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX");
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
        public Criteria andOrderIndexGreaterThan(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX >", value,
                "orderIndex");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX");
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
        public Criteria andOrderIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX >=", value,
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
                    "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX");
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
        public Criteria andOrderIndexLessThan(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX <", value,
                "orderIndex");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX");
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
        public Criteria andOrderIndexLessThanOrEqualTo(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX <=", value,
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
                    "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX");
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
        public Criteria andOrderIndexIn(List values) {
            if (values.size() == 1) {
                return andOrderIndexEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX in",
                    values, "orderIndex");

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
                return andOrderIndexNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX not in",
                    values, "orderIndex");

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
                return andOrderIndexEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX in",
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
                return andOrderIndexNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX not in",
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
        public Criteria andOrderIndexBetween(Integer value1, Integer value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX between",
                value1, value2, "orderIndex");

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
        public Criteria andOrderIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX not between",
                value1, value2, "orderIndex");

            return this;
        } // end andOrderIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.REMARKS is not null AND SYS_RESOURCE_PROPERTY_OPTION.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY_OPTION.REMARKS is null OR SYS_RESOURCE_PROPERTY_OPTION.REMARKS = '')");

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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS =", value,
                "remarks");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS <>", value,
                "remarks");

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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS is null OR SYS_RESOURCE_PROPERTY_OPTION.REMARKS <>",
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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS >", value,
                "remarks");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS >=", value,
                "remarks");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS <", value,
                "remarks");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS <=", value,
                "remarks");

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
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS like",
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS not like",
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS in", values,
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS not in",
                    values, "remarks");

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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS in",
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS not in",
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS between",
                value1, value2, "remarks");

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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.STATUS is not null AND SYS_RESOURCE_PROPERTY_OPTION.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY_OPTION.STATUS is null OR SYS_RESOURCE_PROPERTY_OPTION.STATUS = '')");

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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS =", value,
                "status");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS <>", value,
                "status");

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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS is null OR SYS_RESOURCE_PROPERTY_OPTION.STATUS <>",
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
                    "SYS_RESOURCE_PROPERTY_OPTION.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS >", value,
                "status");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS >=", value,
                "status");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS <", value,
                "status");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS <=", value,
                "status");

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
                    "SYS_RESOURCE_PROPERTY_OPTION.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS like",
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS not like",
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS in", values,
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS not in",
                    values, "status");

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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS in",
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
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS not in",
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS between", value1,
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
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdIsNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID is null");

            return this;
        } // end andSysResourcePropertyIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdIsNotNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID is not null");

            return this;
        } // end andSysResourcePropertyIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID is not null AND SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID <> ''");

            return this;
        } // end andSysResourcePropertyIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID is null OR SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID = '')");

            return this;
        } // end andSysResourcePropertyIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID =",
                value, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourcePropertyIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdNotEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID <>",
                value, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdNotEqualToOrIsNull(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID is null OR SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID <>",
                value, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourcePropertyIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdGreaterThan(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID >",
                value, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourcePropertyIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID >=",
                value, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourcePropertyIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdLessThan(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID <",
                value, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourcePropertyIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID <=",
                value, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourcePropertyIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdIn(List values) {
            if (values.size() == 1) {
                return andSysResourcePropertyIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID in",
                    values, "sysResourcePropertyId");

                return this;
            } // end else
        } // end andSysResourcePropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysResourcePropertyIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID not in",
                    values, "sysResourcePropertyId");

                return this;
            } // end else
        } // end andSysResourcePropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourcePropertyIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID in",
                    Arrays.asList(values), "sysResourcePropertyId");

                return this;
            } // end else
        } // end andSysResourcePropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourcePropertyIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID not in",
                    Arrays.asList(values), "sysResourcePropertyId");

                return this;
            } // end else
        } // end andSysResourcePropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdBetween(Long value1, Long value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID between",
                value1, value2, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourcePropertyIdNotBetween(Long value1,
            Long value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID not between",
                value1, value2, "sysResourcePropertyId");

            return this;
        } // end andSysResourcePropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE is null");

            return this;
        } // end andValueCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE is not null");

            return this;
        } // end andValueCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE is not null AND SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE <> ''");

            return this;
        } // end andValueCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE is null OR SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE = '')");

            return this;
        } // end andValueCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE =", value,
                "valueCode");

            return this;
        } // end andValueCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE <>", value,
                "valueCode");

            return this;
        } // end andValueCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE is null OR SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE <>",
                value, "valueCode");

            return this;
        } // end andValueCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE >", value,
                "valueCode");

            return this;
        } // end andValueCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE >=", value,
                "valueCode");

            return this;
        } // end andValueCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeLessThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE <", value,
                "valueCode");

            return this;
        } // end andValueCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE <=", value,
                "valueCode");

            return this;
        } // end andValueCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE like",
                buffer.toString(), "valueCode");

            return this;
        } // end andValueCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE not like",
                buffer.toString(), "valueCode");

            return this;
        } // end andValueCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeIn(List values) {
            if (values.size() == 1) {
                return andValueCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE in",
                    values, "valueCode");

                return this;
            } // end else
        } // end andValueCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeNotIn(List values) {
            if (values.size() == 1) {
                return andValueCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE not in",
                    values, "valueCode");

                return this;
            } // end else
        } // end andValueCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeIn(Object[] values) {
            if (values.length == 1) {
                return andValueCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE in",
                    Arrays.asList(values), "valueCode");

                return this;
            } // end else
        } // end andValueCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andValueCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE not in",
                    Arrays.asList(values), "valueCode");

                return this;
            } // end else
        } // end andValueCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE between",
                value1, value2, "valueCode");

            return this;
        } // end andValueCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE not between",
                value1, value2, "valueCode");

            return this;
        } // end andValueCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE is null");

            return this;
        } // end andValueLableIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE is not null");

            return this;
        } // end andValueLableIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE is not null AND SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE <> ''");

            return this;
        } // end andValueLableIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE is null OR SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE = '')");

            return this;
        } // end andValueLableIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE =", value,
                "valueLable");

            return this;
        } // end andValueLableEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLableEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE <>", value,
                "valueLable");

            return this;
        } // end andValueLableNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE is null OR SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE <>",
                value, "valueLable");

            return this;
        } // end andValueLableNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLableNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE >", value,
                "valueLable");

            return this;
        } // end andValueLableGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLableGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE >=", value,
                "valueLable");

            return this;
        } // end andValueLableGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLableGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableLessThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE <", value,
                "valueLable");

            return this;
        } // end andValueLableLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLableLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE <=", value,
                "valueLable");

            return this;
        } // end andValueLableLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLableLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE like",
                buffer.toString(), "valueLable");

            return this;
        } // end andValueLableLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE not like",
                buffer.toString(), "valueLable");

            return this;
        } // end andValueLableNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableIn(List values) {
            if (values.size() == 1) {
                return andValueLableEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE in",
                    values, "valueLable");

                return this;
            } // end else
        } // end andValueLableIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableNotIn(List values) {
            if (values.size() == 1) {
                return andValueLableNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE not in",
                    values, "valueLable");

                return this;
            } // end else
        } // end andValueLableNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableIn(Object[] values) {
            if (values.length == 1) {
                return andValueLableEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE in",
                    Arrays.asList(values), "valueLable");

                return this;
            } // end else
        } // end andValueLableIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableNotIn(Object[] values) {
            if (values.length == 1) {
                return andValueLableNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE not in",
                    Arrays.asList(values), "valueLable");

                return this;
            } // end else
        } // end andValueLableNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE between",
                value1, value2, "valueLable");

            return this;
        } // end andValueLableBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLableNotBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE not between",
                value1, value2, "valueLable");

            return this;
        } // end andValueLableNotBetween()
    } // end Criteria
} // end SysResourcePropertyOptionDAOQueryBean
