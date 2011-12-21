/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * ProductFunction query bean 2011-10-10 16:06:17
 *
 * @author Auto Gen
 */
public class ProductFunctionDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ProductFunctionDAOQueryBean object.
     */
    public ProductFunctionDAOQueryBean() {
        super();
    } // end ProductFunctionDAOQueryBean()

    /**
     * Creates a new ProductFunctionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ProductFunctionDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ProductFunctionDAOQueryBean()

    /**
     * Creates a new ProductFunctionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ProductFunctionDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ProductFunctionDAOQueryBean()

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
            addSelectProperty(IProductFunctionDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFunctionCodeSelectProperty() {
        addFunctionCodeSelectProperty("functionCode");
    } // end addFunctionCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFunctionCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductFunctionDAO.FunctionCode, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.FunctionCode, "functionCode");
        } // end else
    } // end addFunctionCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFunctionNameSelectProperty() {
        addFunctionNameSelectProperty("functionName");
    } // end addFunctionNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFunctionNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductFunctionDAO.FunctionName, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.FunctionName, "functionName");
        } // end else
    } // end addFunctionNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentFunctionIdSelectProperty() {
        addParentFunctionIdSelectProperty("parentFunctionId");
    } // end addParentFunctionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentFunctionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductFunctionDAO.ParentFunctionId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.ParentFunctionId,
                "parentFunctionId");
        } // end else
    } // end addParentFunctionIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductDefineIdSelectProperty() {
        addProductDefineIdSelectProperty("productDefineId");
    } // end addProductDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductDefineIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductFunctionDAO.ProductDefineId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.ProductDefineId,
                "productDefineId");
        } // end else
    } // end addProductDefineIdSelectProperty()

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
            addSelectProperty(IProductFunctionDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.Remarks, "remarks");
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
            addSelectProperty(IProductFunctionDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCanTestSelectProperty() {
        addCanTestSelectProperty("canTest");
    } // end addCanTestSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCanTestSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductFunctionDAO.CanTest, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionDAO.CanTest, "canTest");
        } // end else
    } // end addCanTestSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addFunctionCodeSelectProperty();

        addFunctionNameSelectProperty();

        addParentFunctionIdSelectProperty();

        addProductDefineIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addCanTestSelectProperty();
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
            addCriterion("PRODUCT_FUNCTION.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.ID is not null AND PRODUCT_FUNCTION.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.ID is null OR PRODUCT_FUNCTION.ID = '')");

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
            addCriterion("PRODUCT_FUNCTION.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.ID");
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
            addCriterion("PRODUCT_FUNCTION.ID <>", value, "id");

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
            addCriterion("PRODUCT_FUNCTION.ID is null OR PRODUCT_FUNCTION.ID <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.ID");
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
            addCriterion("PRODUCT_FUNCTION.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.ID");
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
            addCriterion("PRODUCT_FUNCTION.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.ID");
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
            addCriterion("PRODUCT_FUNCTION.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.ID");
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
            addCriterion("PRODUCT_FUNCTION.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.ID");
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
                addCriterion("PRODUCT_FUNCTION.ID in", values, "id");

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
                addCriterion("PRODUCT_FUNCTION.ID not in", values, "id");

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
                addCriterion("PRODUCT_FUNCTION.ID in", values, "id");

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
                addCriterion("PRODUCT_FUNCTION.ID not in", values, "id");

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
                addCriterion("PRODUCT_FUNCTION.ID in", Arrays.asList(values),
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
                addCriterion("PRODUCT_FUNCTION.ID not in",
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
            addCriterion("PRODUCT_FUNCTION.ID between", value1, value2, "id");

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
            addCriterion("PRODUCT_FUNCTION.ID between", value1, value2, "id");

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
            addCriterion("PRODUCT_FUNCTION.ID not between", value1, value2, "id");

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
            addCriterion("PRODUCT_FUNCTION.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeIsNull() {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE is null");

            return this;
        } // end andFunctionCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE is not null");

            return this;
        } // end andFunctionCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.FUNCTION_CODE is not null AND PRODUCT_FUNCTION.FUNCTION_CODE <> ''");

            return this;
        } // end andFunctionCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.FUNCTION_CODE is null OR PRODUCT_FUNCTION.FUNCTION_CODE = '')");

            return this;
        } // end andFunctionCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE =", value,
                "functionCode");

            return this;
        } // end andFunctionCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE <>", value,
                "functionCode");

            return this;
        } // end andFunctionCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeNotEqualToOrIsNull(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE is null OR PRODUCT_FUNCTION.FUNCTION_CODE <>",
                value, "functionCode");

            return this;
        } // end andFunctionCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE >", value,
                "functionCode");

            return this;
        } // end andFunctionCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE >=", value,
                "functionCode");

            return this;
        } // end andFunctionCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE <", value,
                "functionCode");

            return this;
        } // end andFunctionCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE <=", value,
                "functionCode");

            return this;
        } // end andFunctionCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE like",
                buffer.toString(), "functionCode");

            return this;
        } // end andFunctionCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE not like",
                buffer.toString(), "functionCode");

            return this;
        } // end andFunctionCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeIn(List values) {
            if (values.size() == 1) {
                return andFunctionCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE in", values,
                    "functionCode");

                return this;
            } // end else
        } // end andFunctionCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeNotIn(List values) {
            if (values.size() == 1) {
                return andFunctionCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE not in", values,
                    "functionCode");

                return this;
            } // end else
        } // end andFunctionCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeIn(Object[] values) {
            if (values.length == 1) {
                return andFunctionCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE in",
                    Arrays.asList(values), "functionCode");

                return this;
            } // end else
        } // end andFunctionCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andFunctionCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE not in",
                    Arrays.asList(values), "functionCode");

                return this;
            } // end else
        } // end andFunctionCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE between", value1,
                value2, "functionCode");

            return this;
        } // end andFunctionCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_CODE not between", value1,
                value2, "functionCode");

            return this;
        } // end andFunctionCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameIsNull() {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME is null");

            return this;
        } // end andFunctionNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME is not null");

            return this;
        } // end andFunctionNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.FUNCTION_NAME is not null AND PRODUCT_FUNCTION.FUNCTION_NAME <> ''");

            return this;
        } // end andFunctionNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.FUNCTION_NAME is null OR PRODUCT_FUNCTION.FUNCTION_NAME = '')");

            return this;
        } // end andFunctionNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME =", value,
                "functionName");

            return this;
        } // end andFunctionNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME <>", value,
                "functionName");

            return this;
        } // end andFunctionNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameNotEqualToOrIsNull(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME is null OR PRODUCT_FUNCTION.FUNCTION_NAME <>",
                value, "functionName");

            return this;
        } // end andFunctionNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME >", value,
                "functionName");

            return this;
        } // end andFunctionNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME >=", value,
                "functionName");

            return this;
        } // end andFunctionNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME <", value,
                "functionName");

            return this;
        } // end andFunctionNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME <=", value,
                "functionName");

            return this;
        } // end andFunctionNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.FUNCTION_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFunctionNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME like",
                buffer.toString(), "functionName");

            return this;
        } // end andFunctionNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME not like",
                buffer.toString(), "functionName");

            return this;
        } // end andFunctionNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameIn(List values) {
            if (values.size() == 1) {
                return andFunctionNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME in", values,
                    "functionName");

                return this;
            } // end else
        } // end andFunctionNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameNotIn(List values) {
            if (values.size() == 1) {
                return andFunctionNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME not in", values,
                    "functionName");

                return this;
            } // end else
        } // end andFunctionNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameIn(Object[] values) {
            if (values.length == 1) {
                return andFunctionNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME in",
                    Arrays.asList(values), "functionName");

                return this;
            } // end else
        } // end andFunctionNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andFunctionNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME not in",
                    Arrays.asList(values), "functionName");

                return this;
            } // end else
        } // end andFunctionNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME between", value1,
                value2, "functionName");

            return this;
        } // end andFunctionNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_FUNCTION.FUNCTION_NAME not between", value1,
                value2, "functionName");

            return this;
        } // end andFunctionNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdIsNull() {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID is null");

            return this;
        } // end andParentFunctionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID is not null");

            return this;
        } // end andParentFunctionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.PARENT_FUNCTION_ID is not null AND PRODUCT_FUNCTION.PARENT_FUNCTION_ID <> ''");

            return this;
        } // end andParentFunctionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.PARENT_FUNCTION_ID is null OR PRODUCT_FUNCTION.PARENT_FUNCTION_ID = '')");

            return this;
        } // end andParentFunctionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdEqualTo(long value) {
            return andParentFunctionIdEqualTo(Long.valueOf(value));
        } // end andParentFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID =", value,
                "parentFunctionId");

            return this;
        } // end andParentFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PARENT_FUNCTION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFunctionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotEqualTo(long value) {
            return andParentFunctionIdNotEqualTo(Long.valueOf(value));
        } // end andParentFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID <>", value,
                "parentFunctionId");

            return this;
        } // end andParentFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotEqualToOrIsNull(long value) {
            return andParentFunctionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andParentFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID is null OR PRODUCT_FUNCTION.PARENT_FUNCTION_ID <>",
                value, "parentFunctionId");

            return this;
        } // end andParentFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PARENT_FUNCTION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFunctionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdGreaterThan(long value) {
            return andParentFunctionIdGreaterThan(Long.valueOf(value));
        } // end andParentFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID >", value,
                "parentFunctionId");

            return this;
        } // end andParentFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PARENT_FUNCTION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFunctionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdGreaterThanOrEqualTo(long value) {
            return andParentFunctionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andParentFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID >=", value,
                "parentFunctionId");

            return this;
        } // end andParentFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PARENT_FUNCTION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFunctionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdLessThan(long value) {
            return andParentFunctionIdLessThan(Long.valueOf(value));
        } // end andParentFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID <", value,
                "parentFunctionId");

            return this;
        } // end andParentFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PARENT_FUNCTION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFunctionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdLessThanOrEqualTo(long value) {
            return andParentFunctionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andParentFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID <=", value,
                "parentFunctionId");

            return this;
        } // end andParentFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PARENT_FUNCTION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFunctionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdIn(long[] values) {
            if (values.length == 1) {
                return andParentFunctionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID in", values,
                    "parentFunctionId");

                return this;
            } // end else
        } // end andParentFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andParentFunctionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID not in",
                    values, "parentFunctionId");

                return this;
            } // end else
        } // end andParentFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdIn(List values) {
            if (values.size() == 1) {
                return andParentFunctionIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID in", values,
                    "parentFunctionId");

                return this;
            } // end else
        } // end andParentFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentFunctionIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID not in",
                    values, "parentFunctionId");

                return this;
            } // end else
        } // end andParentFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentFunctionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID in",
                    Arrays.asList(values), "parentFunctionId");

                return this;
            } // end else
        } // end andParentFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentFunctionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID not in",
                    Arrays.asList(values), "parentFunctionId");

                return this;
            } // end else
        } // end andParentFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID between", value1,
                value2, "parentFunctionId");

            return this;
        } // end andParentFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID between", value1,
                value2, "parentFunctionId");

            return this;
        } // end andParentFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID not between",
                value1, value2, "parentFunctionId");

            return this;
        } // end andParentFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFunctionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION.PARENT_FUNCTION_ID not between",
                value1, value2, "parentFunctionId");

            return this;
        } // end andParentFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdIsNull() {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID is null");

            return this;
        } // end andProductDefineIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID is not null");

            return this;
        } // end andProductDefineIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID is not null AND PRODUCT_FUNCTION.PRODUCT_DEFINE_ID <> ''");

            return this;
        } // end andProductDefineIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.PRODUCT_DEFINE_ID is null OR PRODUCT_FUNCTION.PRODUCT_DEFINE_ID = '')");

            return this;
        } // end andProductDefineIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdEqualTo(long value) {
            return andProductDefineIdEqualTo(Long.valueOf(value));
        } // end andProductDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID =", value,
                "productDefineId");

            return this;
        } // end andProductDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductDefineIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotEqualTo(long value) {
            return andProductDefineIdNotEqualTo(Long.valueOf(value));
        } // end andProductDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID <>", value,
                "productDefineId");

            return this;
        } // end andProductDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotEqualToOrIsNull(long value) {
            return andProductDefineIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProductDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID is null OR PRODUCT_FUNCTION.PRODUCT_DEFINE_ID <>",
                value, "productDefineId");

            return this;
        } // end andProductDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductDefineIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdGreaterThan(long value) {
            return andProductDefineIdGreaterThan(Long.valueOf(value));
        } // end andProductDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID >", value,
                "productDefineId");

            return this;
        } // end andProductDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductDefineIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdGreaterThanOrEqualTo(long value) {
            return andProductDefineIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProductDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID >=", value,
                "productDefineId");

            return this;
        } // end andProductDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductDefineIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdLessThan(long value) {
            return andProductDefineIdLessThan(Long.valueOf(value));
        } // end andProductDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID <", value,
                "productDefineId");

            return this;
        } // end andProductDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductDefineIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdLessThanOrEqualTo(long value) {
            return andProductDefineIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProductDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID <=", value,
                "productDefineId");

            return this;
        } // end andProductDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductDefineIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdIn(long[] values) {
            if (values.length == 1) {
                return andProductDefineIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID in", values,
                    "productDefineId");

                return this;
            } // end else
        } // end andProductDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProductDefineIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID not in",
                    values, "productDefineId");

                return this;
            } // end else
        } // end andProductDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdIn(List values) {
            if (values.size() == 1) {
                return andProductDefineIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID in", values,
                    "productDefineId");

                return this;
            } // end else
        } // end andProductDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotIn(List values) {
            if (values.size() == 1) {
                return andProductDefineIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID not in",
                    values, "productDefineId");

                return this;
            } // end else
        } // end andProductDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdIn(Object[] values) {
            if (values.length == 1) {
                return andProductDefineIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID in",
                    Arrays.asList(values), "productDefineId");

                return this;
            } // end else
        } // end andProductDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductDefineIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID not in",
                    Arrays.asList(values), "productDefineId");

                return this;
            } // end else
        } // end andProductDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID between", value1,
                value2, "productDefineId");

            return this;
        } // end andProductDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID between", value1,
                value2, "productDefineId");

            return this;
        } // end andProductDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID not between",
                value1, value2, "productDefineId");

            return this;
        } // end andProductDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductDefineIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION.PRODUCT_DEFINE_ID not between",
                value1, value2, "productDefineId");

            return this;
        } // end andProductDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("PRODUCT_FUNCTION.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.REMARKS is not null AND PRODUCT_FUNCTION.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.REMARKS is null OR PRODUCT_FUNCTION.REMARKS = '')");

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
            addCriterion("PRODUCT_FUNCTION.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION.REMARKS <>", value, "remarks");

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
            addCriterion("PRODUCT_FUNCTION.REMARKS is null OR PRODUCT_FUNCTION.REMARKS <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION.REMARKS like", buffer.toString(),
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
            addCriterion("PRODUCT_FUNCTION.REMARKS not like",
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
                addCriterion("PRODUCT_FUNCTION.REMARKS in", values, "remarks");

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
                addCriterion("PRODUCT_FUNCTION.REMARKS not in", values,
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
                addCriterion("PRODUCT_FUNCTION.REMARKS in",
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
                addCriterion("PRODUCT_FUNCTION.REMARKS not in",
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
            addCriterion("PRODUCT_FUNCTION.REMARKS between", value1, value2,
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
            addCriterion("PRODUCT_FUNCTION.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("PRODUCT_FUNCTION.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.STATUS is not null AND PRODUCT_FUNCTION.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.STATUS is null OR PRODUCT_FUNCTION.STATUS = '')");

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
            addCriterion("PRODUCT_FUNCTION.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.STATUS");
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
            addCriterion("PRODUCT_FUNCTION.STATUS <>", value, "status");

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
            addCriterion("PRODUCT_FUNCTION.STATUS is null OR PRODUCT_FUNCTION.STATUS <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.STATUS");
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
            addCriterion("PRODUCT_FUNCTION.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.STATUS");
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
            addCriterion("PRODUCT_FUNCTION.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.STATUS");
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
            addCriterion("PRODUCT_FUNCTION.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.STATUS");
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
            addCriterion("PRODUCT_FUNCTION.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.STATUS");
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
            addCriterion("PRODUCT_FUNCTION.STATUS like", buffer.toString(),
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
            addCriterion("PRODUCT_FUNCTION.STATUS not like", buffer.toString(),
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
                addCriterion("PRODUCT_FUNCTION.STATUS in", values, "status");

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
                addCriterion("PRODUCT_FUNCTION.STATUS not in", values, "status");

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
                addCriterion("PRODUCT_FUNCTION.STATUS in",
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
                addCriterion("PRODUCT_FUNCTION.STATUS not in",
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
            addCriterion("PRODUCT_FUNCTION.STATUS between", value1, value2,
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
            addCriterion("PRODUCT_FUNCTION.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestIsNull() {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST is null");

            return this;
        } // end andCanTestIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestIsNotNull() {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST is not null");

            return this;
        } // end andCanTestIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION.CAN_TEST is not null AND PRODUCT_FUNCTION.CAN_TEST <> ''");

            return this;
        } // end andCanTestIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION.CAN_TEST is null OR PRODUCT_FUNCTION.CAN_TEST = '')");

            return this;
        } // end andCanTestIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestEqualTo(int value) {
            return andCanTestEqualTo(Integer.valueOf(value));
        } // end andCanTestEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestEqualTo(java.lang.Integer value) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST =", value, "canTest");

            return this;
        } // end andCanTestEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.CAN_TEST");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanTestEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotEqualTo(int value) {
            return andCanTestNotEqualTo(Integer.valueOf(value));
        } // end andCanTestNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotEqualTo(java.lang.Integer value) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST <>", value, "canTest");

            return this;
        } // end andCanTestNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotEqualToOrIsNull(int value) {
            return andCanTestNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andCanTestNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST is null OR PRODUCT_FUNCTION.CAN_TEST <>",
                value, "canTest");

            return this;
        } // end andCanTestNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.CAN_TEST");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanTestNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestGreaterThan(int value) {
            return andCanTestGreaterThan(Integer.valueOf(value));
        } // end andCanTestGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestGreaterThan(java.lang.Integer value) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST >", value, "canTest");

            return this;
        } // end andCanTestGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.CAN_TEST");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanTestGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestGreaterThanOrEqualTo(int value) {
            return andCanTestGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andCanTestGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST >=", value, "canTest");

            return this;
        } // end andCanTestGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.CAN_TEST");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanTestGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestLessThan(int value) {
            return andCanTestLessThan(Integer.valueOf(value));
        } // end andCanTestLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestLessThan(java.lang.Integer value) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST <", value, "canTest");

            return this;
        } // end andCanTestLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.CAN_TEST");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanTestLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestLessThanOrEqualTo(int value) {
            return andCanTestLessThanOrEqualTo(Integer.valueOf(value));
        } // end andCanTestLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST <=", value, "canTest");

            return this;
        } // end andCanTestLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_FUNCTION.CAN_TEST");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanTestLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestIn(int[] values) {
            if (values.length == 1) {
                return andCanTestEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.CAN_TEST in", values, "canTest");

                return this;
            } // end else
        } // end andCanTestIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotIn(int[] values) {
            if (values.length == 1) {
                return andCanTestNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.CAN_TEST not in", values,
                    "canTest");

                return this;
            } // end else
        } // end andCanTestNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestIn(List values) {
            if (values.size() == 1) {
                return andCanTestEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.CAN_TEST in", values, "canTest");

                return this;
            } // end else
        } // end andCanTestIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotIn(List values) {
            if (values.size() == 1) {
                return andCanTestNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.CAN_TEST not in", values,
                    "canTest");

                return this;
            } // end else
        } // end andCanTestNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestIn(Object[] values) {
            if (values.length == 1) {
                return andCanTestEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.CAN_TEST in",
                    Arrays.asList(values), "canTest");

                return this;
            } // end else
        } // end andCanTestIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotIn(Object[] values) {
            if (values.length == 1) {
                return andCanTestNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION.CAN_TEST not in",
                    Arrays.asList(values), "canTest");

                return this;
            } // end else
        } // end andCanTestNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestBetween(int value1, int value2) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST between", value1, value2,
                "canTest");

            return this;
        } // end andCanTestBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST between", value1, value2,
                "canTest");

            return this;
        } // end andCanTestBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotBetween(int value1, int value2) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST not between", value1,
                value2, "canTest");

            return this;
        } // end andCanTestNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanTestNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("PRODUCT_FUNCTION.CAN_TEST not between", value1,
                value2, "canTest");

            return this;
        } // end andCanTestNotBetween()
    } // end Criteria
} // end ProductFunctionDAOQueryBean
