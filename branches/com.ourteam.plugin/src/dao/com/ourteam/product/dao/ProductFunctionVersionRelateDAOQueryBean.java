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
 * ProductFunctionVersionRelate query bean 2011-10-10 16:06:18
 *
 * @author Auto Gen
 */
public class ProductFunctionVersionRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ProductFunctionVersionRelateDAOQueryBean object.
     */
    public ProductFunctionVersionRelateDAOQueryBean() {
        super();
    } // end ProductFunctionVersionRelateDAOQueryBean()

    /**
     * Creates a new ProductFunctionVersionRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ProductFunctionVersionRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ProductFunctionVersionRelateDAOQueryBean()

    /**
     * Creates a new ProductFunctionVersionRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ProductFunctionVersionRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ProductFunctionVersionRelateDAOQueryBean()

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
            addSelectProperty(IProductFunctionVersionRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionVersionRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductFunctionIdSelectProperty() {
        addProductFunctionIdSelectProperty("productFunctionId");
    } // end addProductFunctionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductFunctionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductFunctionVersionRelateDAO.ProductFunctionId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionVersionRelateDAO.ProductFunctionId,
                "productFunctionId");
        } // end else
    } // end addProductFunctionIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductVersionIdSelectProperty() {
        addProductVersionIdSelectProperty("productVersionId");
    } // end addProductVersionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductVersionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductFunctionVersionRelateDAO.ProductVersionId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionVersionRelateDAO.ProductVersionId,
                "productVersionId");
        } // end else
    } // end addProductVersionIdSelectProperty()

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
            addSelectProperty(IProductFunctionVersionRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionVersionRelateDAO.Remarks,
                "remarks");
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
            addSelectProperty(IProductFunctionVersionRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IProductFunctionVersionRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addProductFunctionIdSelectProperty();

        addProductVersionIdSelectProperty();

        addRemarksSelectProperty();

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
        public Criteria andIdIsNull() {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.ID is not null AND PRODUCT_FUNCTION_VERSION_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION_VERSION_RELATE.ID is null OR PRODUCT_FUNCTION_VERSION_RELATE.ID = '')");

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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID =", value, "id");

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
                    "PRODUCT_FUNCTION_VERSION_RELATE.ID");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID <>", value, "id");

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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID is null OR PRODUCT_FUNCTION_VERSION_RELATE.ID <>",
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.ID");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID >", value, "id");

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
                    "PRODUCT_FUNCTION_VERSION_RELATE.ID");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID >=", value, "id");

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
                    "PRODUCT_FUNCTION_VERSION_RELATE.ID");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID <", value, "id");

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
                    "PRODUCT_FUNCTION_VERSION_RELATE.ID");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID <=", value, "id");

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
                    "PRODUCT_FUNCTION_VERSION_RELATE.ID");
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID in", values,
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
        public Criteria andIdNotIn(long[] values) {
            if (values.length == 1) {
                return andIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID not in",
                    values, "id");

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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID in", values,
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
        public Criteria andIdNotIn(List values) {
            if (values.size() == 1) {
                return andIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID not in",
                    values, "id");

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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID in",
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID not in",
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID between", value1,
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID between", value1,
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID not between",
                value1, value2, "id");

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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.ID not between",
                value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdIsNull() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID is null");

            return this;
        } // end andProductFunctionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdIsNotNull() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID is not null");

            return this;
        } // end andProductFunctionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID is not null AND PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID <> ''");

            return this;
        } // end andProductFunctionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID is null OR PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID = '')");

            return this;
        } // end andProductFunctionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdEqualTo(long value) {
            return andProductFunctionIdEqualTo(Long.valueOf(value));
        } // end andProductFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID =",
                value, "productFunctionId");

            return this;
        } // end andProductFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductFunctionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotEqualTo(long value) {
            return andProductFunctionIdNotEqualTo(Long.valueOf(value));
        } // end andProductFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID <>",
                value, "productFunctionId");

            return this;
        } // end andProductFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotEqualToOrIsNull(long value) {
            return andProductFunctionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProductFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID is null OR PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID <>",
                value, "productFunctionId");

            return this;
        } // end andProductFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductFunctionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdGreaterThan(long value) {
            return andProductFunctionIdGreaterThan(Long.valueOf(value));
        } // end andProductFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID >",
                value, "productFunctionId");

            return this;
        } // end andProductFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductFunctionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdGreaterThanOrEqualTo(long value) {
            return andProductFunctionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProductFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID >=",
                value, "productFunctionId");

            return this;
        } // end andProductFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductFunctionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdLessThan(long value) {
            return andProductFunctionIdLessThan(Long.valueOf(value));
        } // end andProductFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID <",
                value, "productFunctionId");

            return this;
        } // end andProductFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductFunctionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdLessThanOrEqualTo(long value) {
            return andProductFunctionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProductFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID <=",
                value, "productFunctionId");

            return this;
        } // end andProductFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductFunctionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdIn(long[] values) {
            if (values.length == 1) {
                return andProductFunctionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID in",
                    values, "productFunctionId");

                return this;
            } // end else
        } // end andProductFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProductFunctionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID not in",
                    values, "productFunctionId");

                return this;
            } // end else
        } // end andProductFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdIn(List values) {
            if (values.size() == 1) {
                return andProductFunctionIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID in",
                    values, "productFunctionId");

                return this;
            } // end else
        } // end andProductFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotIn(List values) {
            if (values.size() == 1) {
                return andProductFunctionIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID not in",
                    values, "productFunctionId");

                return this;
            } // end else
        } // end andProductFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdIn(Object[] values) {
            if (values.length == 1) {
                return andProductFunctionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID in",
                    Arrays.asList(values), "productFunctionId");

                return this;
            } // end else
        } // end andProductFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductFunctionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID not in",
                    Arrays.asList(values), "productFunctionId");

                return this;
            } // end else
        } // end andProductFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID between",
                value1, value2, "productFunctionId");

            return this;
        } // end andProductFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID between",
                value1, value2, "productFunctionId");

            return this;
        } // end andProductFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID not between",
                value1, value2, "productFunctionId");

            return this;
        } // end andProductFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductFunctionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID not between",
                value1, value2, "productFunctionId");

            return this;
        } // end andProductFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdIsNull() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID is null");

            return this;
        } // end andProductVersionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdIsNotNull() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID is not null");

            return this;
        } // end andProductVersionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID is not null AND PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID <> ''");

            return this;
        } // end andProductVersionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID is null OR PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID = '')");

            return this;
        } // end andProductVersionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdEqualTo(long value) {
            return andProductVersionIdEqualTo(Long.valueOf(value));
        } // end andProductVersionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID =",
                value, "productVersionId");

            return this;
        } // end andProductVersionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductVersionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotEqualTo(long value) {
            return andProductVersionIdNotEqualTo(Long.valueOf(value));
        } // end andProductVersionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID <>",
                value, "productVersionId");

            return this;
        } // end andProductVersionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotEqualToOrIsNull(long value) {
            return andProductVersionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProductVersionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID is null OR PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID <>",
                value, "productVersionId");

            return this;
        } // end andProductVersionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductVersionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdGreaterThan(long value) {
            return andProductVersionIdGreaterThan(Long.valueOf(value));
        } // end andProductVersionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID >",
                value, "productVersionId");

            return this;
        } // end andProductVersionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductVersionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdGreaterThanOrEqualTo(long value) {
            return andProductVersionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProductVersionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID >=",
                value, "productVersionId");

            return this;
        } // end andProductVersionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductVersionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdLessThan(long value) {
            return andProductVersionIdLessThan(Long.valueOf(value));
        } // end andProductVersionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID <",
                value, "productVersionId");

            return this;
        } // end andProductVersionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductVersionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdLessThanOrEqualTo(long value) {
            return andProductVersionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProductVersionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID <=",
                value, "productVersionId");

            return this;
        } // end andProductVersionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductVersionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdIn(long[] values) {
            if (values.length == 1) {
                return andProductVersionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID in",
                    values, "productVersionId");

                return this;
            } // end else
        } // end andProductVersionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProductVersionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID not in",
                    values, "productVersionId");

                return this;
            } // end else
        } // end andProductVersionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdIn(List values) {
            if (values.size() == 1) {
                return andProductVersionIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID in",
                    values, "productVersionId");

                return this;
            } // end else
        } // end andProductVersionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotIn(List values) {
            if (values.size() == 1) {
                return andProductVersionIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID not in",
                    values, "productVersionId");

                return this;
            } // end else
        } // end andProductVersionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdIn(Object[] values) {
            if (values.length == 1) {
                return andProductVersionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID in",
                    Arrays.asList(values), "productVersionId");

                return this;
            } // end else
        } // end andProductVersionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductVersionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID not in",
                    Arrays.asList(values), "productVersionId");

                return this;
            } // end else
        } // end andProductVersionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID between",
                value1, value2, "productVersionId");

            return this;
        } // end andProductVersionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID between",
                value1, value2, "productVersionId");

            return this;
        } // end andProductVersionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID not between",
                value1, value2, "productVersionId");

            return this;
        } // end andProductVersionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductVersionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID not between",
                value1, value2, "productVersionId");

            return this;
        } // end andProductVersionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS is not null AND PRODUCT_FUNCTION_VERSION_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION_VERSION_RELATE.REMARKS is null OR PRODUCT_FUNCTION_VERSION_RELATE.REMARKS = '')");

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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS =", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS <>", value,
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS is null OR PRODUCT_FUNCTION_VERSION_RELATE.REMARKS <>",
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS >", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS >=", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS <", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS <=", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS like",
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS not like",
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS in",
                    values, "remarks");

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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS not in",
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS in",
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS not in",
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS between",
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "PRODUCT_FUNCTION_VERSION_RELATE.STATUS is not null AND PRODUCT_FUNCTION_VERSION_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(PRODUCT_FUNCTION_VERSION_RELATE.STATUS is null OR PRODUCT_FUNCTION_VERSION_RELATE.STATUS = '')");

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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS =", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.STATUS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS <>", value,
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS is null OR PRODUCT_FUNCTION_VERSION_RELATE.STATUS <>",
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.STATUS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS >", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.STATUS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS >=", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.STATUS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS <", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.STATUS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS <=", value,
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
                    "PRODUCT_FUNCTION_VERSION_RELATE.STATUS");
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS like",
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS not like",
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS in",
                    values, "status");

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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS not in",
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS in",
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
                addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS not in",
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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS between",
                value1, value2, "status");

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
            addCriterion("PRODUCT_FUNCTION_VERSION_RELATE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()
    } // end Criteria
} // end ProductFunctionVersionRelateDAOQueryBean
