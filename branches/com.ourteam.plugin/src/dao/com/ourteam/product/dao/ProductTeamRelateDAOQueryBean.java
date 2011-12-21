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
 * ProductTeamRelate query bean 2011-10-10 16:06:21
 *
 * @author Auto Gen
 */
public class ProductTeamRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ProductTeamRelateDAOQueryBean object.
     */
    public ProductTeamRelateDAOQueryBean() {
        super();
    } // end ProductTeamRelateDAOQueryBean()

    /**
     * Creates a new ProductTeamRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ProductTeamRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ProductTeamRelateDAOQueryBean()

    /**
     * Creates a new ProductTeamRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ProductTeamRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ProductTeamRelateDAOQueryBean()

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
            addSelectProperty(IProductTeamRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductIdSelectProperty() {
        addProductIdSelectProperty("productId");
    } // end addProductIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.ProductId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.ProductId, "productId");
        } // end else
    } // end addProductIdSelectProperty()

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
            addSelectProperty(IProductTeamRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.Remarks, "remarks");
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
            addSelectProperty(IProductTeamRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamIdSelectProperty() {
        addTeamIdSelectProperty("teamId");
    } // end addTeamIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.TeamId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.TeamId, "teamId");
        } // end else
    } // end addTeamIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamNameSelectProperty() {
        addTeamNameSelectProperty("teamName");
    } // end addTeamNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.TeamName, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.TeamName, "teamName");
        } // end else
    } // end addTeamNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamCodeSelectProperty() {
        addTeamCodeSelectProperty("teamCode");
    } // end addTeamCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.TeamCode, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.TeamCode, "teamCode");
        } // end else
    } // end addTeamCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamMailSelectProperty() {
        addTeamMailSelectProperty("teamMail");
    } // end addTeamMailSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamMailSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.TeamMail, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.TeamMail, "teamMail");
        } // end else
    } // end addTeamMailSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamStatusSelectProperty() {
        addTeamStatusSelectProperty("teamStatus");
    } // end addTeamStatusSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamStatusSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.TeamStatus, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.TeamStatus, "teamStatus");
        } // end else
    } // end addTeamStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductCodeSelectProperty() {
        addProductCodeSelectProperty("productCode");
    } // end addProductCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.ProductCode, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.ProductCode, "productCode");
        } // end else
    } // end addProductCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductNameSelectProperty() {
        addProductNameSelectProperty("productName");
    } // end addProductNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductTeamRelateDAO.ProductName, aAlias);
        } // end if
        else {
            addSelectProperty(IProductTeamRelateDAO.ProductName, "productName");
        } // end else
    } // end addProductNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addProductIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addTeamIdSelectProperty();

        addTeamNameSelectProperty();

        addTeamCodeSelectProperty();

        addTeamMailSelectProperty();

        addTeamStatusSelectProperty();

        addProductCodeSelectProperty();

        addProductNameSelectProperty();
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
            addCriterion("PRODUCT_TEAM_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("PRODUCT_TEAM_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_TEAM_RELATE.ID is not null AND PRODUCT_TEAM_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(PRODUCT_TEAM_RELATE.ID is null OR PRODUCT_TEAM_RELATE.ID = '')");

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
            addCriterion("PRODUCT_TEAM_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.ID");
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
            addCriterion("PRODUCT_TEAM_RELATE.ID <>", value, "id");

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
            addCriterion("PRODUCT_TEAM_RELATE.ID is null OR PRODUCT_TEAM_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.ID");
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
            addCriterion("PRODUCT_TEAM_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.ID");
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
            addCriterion("PRODUCT_TEAM_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.ID");
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
            addCriterion("PRODUCT_TEAM_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.ID");
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
            addCriterion("PRODUCT_TEAM_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.ID");
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
                addCriterion("PRODUCT_TEAM_RELATE.ID in", values, "id");

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
                addCriterion("PRODUCT_TEAM_RELATE.ID not in", values, "id");

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
                addCriterion("PRODUCT_TEAM_RELATE.ID in", values, "id");

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
                addCriterion("PRODUCT_TEAM_RELATE.ID not in", values, "id");

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
                addCriterion("PRODUCT_TEAM_RELATE.ID in",
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
                addCriterion("PRODUCT_TEAM_RELATE.ID not in",
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
            addCriterion("PRODUCT_TEAM_RELATE.ID between", value1, value2, "id");

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
            addCriterion("PRODUCT_TEAM_RELATE.ID between", value1, value2, "id");

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
            addCriterion("PRODUCT_TEAM_RELATE.ID not between", value1, value2,
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
            addCriterion("PRODUCT_TEAM_RELATE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID is null");

            return this;
        } // end andProductIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID is not null");

            return this;
        } // end andProductIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_TEAM_RELATE.PRODUCT_ID is not null AND PRODUCT_TEAM_RELATE.PRODUCT_ID <> ''");

            return this;
        } // end andProductIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsEmpty() {
            addCriterion(
                "(PRODUCT_TEAM_RELATE.PRODUCT_ID is null OR PRODUCT_TEAM_RELATE.PRODUCT_ID = '')");

            return this;
        } // end andProductIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdEqualTo(long value) {
            return andProductIdEqualTo(Long.valueOf(value));
        } // end andProductIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID =", value, "productId");

            return this;
        } // end andProductIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_TEAM_RELATE.PRODUCT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualTo(long value) {
            return andProductIdNotEqualTo(Long.valueOf(value));
        } // end andProductIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID <>", value, "productId");

            return this;
        } // end andProductIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualToOrIsNull(long value) {
            return andProductIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProductIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID is null OR PRODUCT_TEAM_RELATE.PRODUCT_ID <>",
                value, "productId");

            return this;
        } // end andProductIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_TEAM_RELATE.PRODUCT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThan(long value) {
            return andProductIdGreaterThan(Long.valueOf(value));
        } // end andProductIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID >", value, "productId");

            return this;
        } // end andProductIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_TEAM_RELATE.PRODUCT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanOrEqualTo(long value) {
            return andProductIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProductIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID >=", value, "productId");

            return this;
        } // end andProductIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_TEAM_RELATE.PRODUCT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThan(long value) {
            return andProductIdLessThan(Long.valueOf(value));
        } // end andProductIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID <", value, "productId");

            return this;
        } // end andProductIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_TEAM_RELATE.PRODUCT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanOrEqualTo(long value) {
            return andProductIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProductIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID <=", value, "productId");

            return this;
        } // end andProductIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_TEAM_RELATE.PRODUCT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIn(long[] values) {
            if (values.length == 1) {
                return andProductIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID in", values,
                    "productId");

                return this;
            } // end else
        } // end andProductIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProductIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID not in", values,
                    "productId");

                return this;
            } // end else
        } // end andProductIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIn(List values) {
            if (values.size() == 1) {
                return andProductIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID in", values,
                    "productId");

                return this;
            } // end else
        } // end andProductIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotIn(List values) {
            if (values.size() == 1) {
                return andProductIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID not in", values,
                    "productId");

                return this;
            } // end else
        } // end andProductIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIn(Object[] values) {
            if (values.length == 1) {
                return andProductIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID in",
                    Arrays.asList(values), "productId");

                return this;
            } // end else
        } // end andProductIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID not in",
                    Arrays.asList(values), "productId");

                return this;
            } // end else
        } // end andProductIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID between", value1,
                value2, "productId");

            return this;
        } // end andProductIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID between", value1,
                value2, "productId");

            return this;
        } // end andProductIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID not between", value1,
                value2, "productId");

            return this;
        } // end andProductIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.PRODUCT_ID not between", value1,
                value2, "productId");

            return this;
        } // end andProductIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "PRODUCT_TEAM_RELATE.REMARKS is not null AND PRODUCT_TEAM_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(PRODUCT_TEAM_RELATE.REMARKS is null OR PRODUCT_TEAM_RELATE.REMARKS = '')");

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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.REMARKS");
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS <>", value, "remarks");

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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS is null OR PRODUCT_TEAM_RELATE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.REMARKS");
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.REMARKS");
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.REMARKS");
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.REMARKS");
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.REMARKS");
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS like", buffer.toString(),
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS not like",
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
                addCriterion("PRODUCT_TEAM_RELATE.REMARKS in", values, "remarks");

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
                addCriterion("PRODUCT_TEAM_RELATE.REMARKS not in", values,
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
                addCriterion("PRODUCT_TEAM_RELATE.REMARKS in",
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
                addCriterion("PRODUCT_TEAM_RELATE.REMARKS not in",
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS between", value1, value2,
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
            addCriterion("PRODUCT_TEAM_RELATE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("PRODUCT_TEAM_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("PRODUCT_TEAM_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "PRODUCT_TEAM_RELATE.STATUS is not null AND PRODUCT_TEAM_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(PRODUCT_TEAM_RELATE.STATUS is null OR PRODUCT_TEAM_RELATE.STATUS = '')");

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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.STATUS");
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS <>", value, "status");

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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS is null OR PRODUCT_TEAM_RELATE.STATUS <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.STATUS");
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.STATUS");
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.STATUS");
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.STATUS");
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.STATUS");
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS like", buffer.toString(),
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS not like",
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
                addCriterion("PRODUCT_TEAM_RELATE.STATUS in", values, "status");

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
                addCriterion("PRODUCT_TEAM_RELATE.STATUS not in", values,
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
                addCriterion("PRODUCT_TEAM_RELATE.STATUS in",
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
                addCriterion("PRODUCT_TEAM_RELATE.STATUS not in",
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS between", value1, value2,
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
            addCriterion("PRODUCT_TEAM_RELATE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNull() {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID is null");

            return this;
        } // end andTeamIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotNull() {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID is not null");

            return this;
        } // end andTeamIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_TEAM_RELATE.TEAM_ID is not null AND PRODUCT_TEAM_RELATE.TEAM_ID <> ''");

            return this;
        } // end andTeamIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsEmpty() {
            addCriterion(
                "(PRODUCT_TEAM_RELATE.TEAM_ID is null OR PRODUCT_TEAM_RELATE.TEAM_ID = '')");

            return this;
        } // end andTeamIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualTo(long value) {
            return andTeamIdEqualTo(Long.valueOf(value));
        } // end andTeamIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID =", value, "teamId");

            return this;
        } // end andTeamIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.TEAM_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualTo(long value) {
            return andTeamIdNotEqualTo(Long.valueOf(value));
        } // end andTeamIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID <>", value, "teamId");

            return this;
        } // end andTeamIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToOrIsNull(long value) {
            return andTeamIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTeamIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID is null OR PRODUCT_TEAM_RELATE.TEAM_ID <>",
                value, "teamId");

            return this;
        } // end andTeamIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.TEAM_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThan(long value) {
            return andTeamIdGreaterThan(Long.valueOf(value));
        } // end andTeamIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID >", value, "teamId");

            return this;
        } // end andTeamIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.TEAM_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualTo(long value) {
            return andTeamIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTeamIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID >=", value, "teamId");

            return this;
        } // end andTeamIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.TEAM_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThan(long value) {
            return andTeamIdLessThan(Long.valueOf(value));
        } // end andTeamIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID <", value, "teamId");

            return this;
        } // end andTeamIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.TEAM_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualTo(long value) {
            return andTeamIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTeamIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID <=", value, "teamId");

            return this;
        } // end andTeamIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_TEAM_RELATE.TEAM_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(long[] values) {
            if (values.length == 1) {
                return andTeamIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID in", values, "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTeamIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID not in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(List values) {
            if (values.size() == 1) {
                return andTeamIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID in", values, "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(List values) {
            if (values.size() == 1) {
                return andTeamIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID not in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(Object[] values) {
            if (values.length == 1) {
                return andTeamIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID in",
                    Arrays.asList(values), "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID not in",
                    Arrays.asList(values), "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID between", value1, value2,
                "teamId");

            return this;
        } // end andTeamIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID between", value1, value2,
                "teamId");

            return this;
        } // end andTeamIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID not between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_TEAM_RELATE.TEAM_ID not between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNull() {
            addCriterion("teamA.TEAM_NAME is null");

            return this;
        } // end andTeamNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotNull() {
            addCriterion("teamA.TEAM_NAME is not null");

            return this;
        } // end andTeamNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotEmpty() {
            addCriterion(
                "teamA.TEAM_NAME is not null AND teamA.TEAM_NAME <> ''");

            return this;
        } // end andTeamNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsEmpty() {
            addCriterion("(teamA.TEAM_NAME is null OR teamA.TEAM_NAME = '')");

            return this;
        } // end andTeamNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("teamA.TEAM_NAME =", value, "teamName");

            return this;
        } // end andTeamNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("teamA.TEAM_NAME <>", value, "teamName");

            return this;
        } // end andTeamNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotEqualToOrIsNull(String value) {
            addCriterion("teamA.TEAM_NAME is null OR teamA.TEAM_NAME <>",
                value, "teamName");

            return this;
        } // end andTeamNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("teamA.TEAM_NAME >", value, "teamName");

            return this;
        } // end andTeamNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_NAME >=", value, "teamName");

            return this;
        } // end andTeamNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThan(String value) {
            addCriterion("teamA.TEAM_NAME <", value, "teamName");

            return this;
        } // end andTeamNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_NAME <=", value, "teamName");

            return this;
        } // end andTeamNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_NAME like", buffer.toString(), "teamName");

            return this;
        } // end andTeamNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_NAME not like", buffer.toString(),
                "teamName");

            return this;
        } // end andTeamNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIn(List values) {
            if (values.size() == 1) {
                return andTeamNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_NAME in", values, "teamName");

                return this;
            } // end else
        } // end andTeamNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotIn(List values) {
            if (values.size() == 1) {
                return andTeamNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_NAME not in", values, "teamName");

                return this;
            } // end else
        } // end andTeamNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIn(Object[] values) {
            if (values.length == 1) {
                return andTeamNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_NAME in", Arrays.asList(values),
                    "teamName");

                return this;
            } // end else
        } // end andTeamNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_NAME not in", Arrays.asList(values),
                    "teamName");

                return this;
            } // end else
        } // end andTeamNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_NAME between", value1, value2, "teamName");

            return this;
        } // end andTeamNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_NAME not between", value1, value2,
                "teamName");

            return this;
        } // end andTeamNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsNull() {
            addCriterion("teamA.TEAM_CODE is null");

            return this;
        } // end andTeamCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsNotNull() {
            addCriterion("teamA.TEAM_CODE is not null");

            return this;
        } // end andTeamCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsNotEmpty() {
            addCriterion(
                "teamA.TEAM_CODE is not null AND teamA.TEAM_CODE <> ''");

            return this;
        } // end andTeamCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsEmpty() {
            addCriterion("(teamA.TEAM_CODE is null OR teamA.TEAM_CODE = '')");

            return this;
        } // end andTeamCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE =", value, "teamCode");

            return this;
        } // end andTeamCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE <>", value, "teamCode");

            return this;
        } // end andTeamCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotEqualToOrIsNull(String value) {
            addCriterion("teamA.TEAM_CODE is null OR teamA.TEAM_CODE <>",
                value, "teamCode");

            return this;
        } // end andTeamCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThan(String value) {
            addCriterion("teamA.TEAM_CODE >", value, "teamCode");

            return this;
        } // end andTeamCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE >=", value, "teamCode");

            return this;
        } // end andTeamCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThan(String value) {
            addCriterion("teamA.TEAM_CODE <", value, "teamCode");

            return this;
        } // end andTeamCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE <=", value, "teamCode");

            return this;
        } // end andTeamCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_CODE like", buffer.toString(), "teamCode");

            return this;
        } // end andTeamCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_CODE not like", buffer.toString(),
                "teamCode");

            return this;
        } // end andTeamCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIn(List values) {
            if (values.size() == 1) {
                return andTeamCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE in", values, "teamCode");

                return this;
            } // end else
        } // end andTeamCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotIn(List values) {
            if (values.size() == 1) {
                return andTeamCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE not in", values, "teamCode");

                return this;
            } // end else
        } // end andTeamCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIn(Object[] values) {
            if (values.length == 1) {
                return andTeamCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE in", Arrays.asList(values),
                    "teamCode");

                return this;
            } // end else
        } // end andTeamCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE not in", Arrays.asList(values),
                    "teamCode");

                return this;
            } // end else
        } // end andTeamCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_CODE between", value1, value2, "teamCode");

            return this;
        } // end andTeamCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_CODE not between", value1, value2,
                "teamCode");

            return this;
        } // end andTeamCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailIsNull() {
            addCriterion("teamA.TEAM_MAIL is null");

            return this;
        } // end andTeamMailIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailIsNotNull() {
            addCriterion("teamA.TEAM_MAIL is not null");

            return this;
        } // end andTeamMailIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailIsNotEmpty() {
            addCriterion(
                "teamA.TEAM_MAIL is not null AND teamA.TEAM_MAIL <> ''");

            return this;
        } // end andTeamMailIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailIsEmpty() {
            addCriterion("(teamA.TEAM_MAIL is null OR teamA.TEAM_MAIL = '')");

            return this;
        } // end andTeamMailIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailEqualTo(String value) {
            addCriterion("teamA.TEAM_MAIL =", value, "teamMail");

            return this;
        } // end andTeamMailEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_MAIL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamMailEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailNotEqualTo(String value) {
            addCriterion("teamA.TEAM_MAIL <>", value, "teamMail");

            return this;
        } // end andTeamMailNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailNotEqualToOrIsNull(String value) {
            addCriterion("teamA.TEAM_MAIL is null OR teamA.TEAM_MAIL <>",
                value, "teamMail");

            return this;
        } // end andTeamMailNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_MAIL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamMailNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailGreaterThan(String value) {
            addCriterion("teamA.TEAM_MAIL >", value, "teamMail");

            return this;
        } // end andTeamMailGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_MAIL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamMailGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailGreaterThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_MAIL >=", value, "teamMail");

            return this;
        } // end andTeamMailGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_MAIL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamMailGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailLessThan(String value) {
            addCriterion("teamA.TEAM_MAIL <", value, "teamMail");

            return this;
        } // end andTeamMailLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_MAIL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamMailLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailLessThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_MAIL <=", value, "teamMail");

            return this;
        } // end andTeamMailLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_MAIL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamMailLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_MAIL like", buffer.toString(), "teamMail");

            return this;
        } // end andTeamMailLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_MAIL not like", buffer.toString(),
                "teamMail");

            return this;
        } // end andTeamMailNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailIn(List values) {
            if (values.size() == 1) {
                return andTeamMailEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_MAIL in", values, "teamMail");

                return this;
            } // end else
        } // end andTeamMailIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailNotIn(List values) {
            if (values.size() == 1) {
                return andTeamMailNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_MAIL not in", values, "teamMail");

                return this;
            } // end else
        } // end andTeamMailNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailIn(Object[] values) {
            if (values.length == 1) {
                return andTeamMailEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_MAIL in", Arrays.asList(values),
                    "teamMail");

                return this;
            } // end else
        } // end andTeamMailIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamMailNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_MAIL not in", Arrays.asList(values),
                    "teamMail");

                return this;
            } // end else
        } // end andTeamMailNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_MAIL between", value1, value2, "teamMail");

            return this;
        } // end andTeamMailBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamMailNotBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_MAIL not between", value1, value2,
                "teamMail");

            return this;
        } // end andTeamMailNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusIsNull() {
            addCriterion("teamA.STATUS is null");

            return this;
        } // end andTeamStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusIsNotNull() {
            addCriterion("teamA.STATUS is not null");

            return this;
        } // end andTeamStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusIsNotEmpty() {
            addCriterion("teamA.STATUS is not null AND teamA.STATUS <> ''");

            return this;
        } // end andTeamStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusIsEmpty() {
            addCriterion("(teamA.STATUS is null OR teamA.STATUS = '')");

            return this;
        } // end andTeamStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusEqualTo(String value) {
            addCriterion("teamA.STATUS =", value, "teamStatus");

            return this;
        } // end andTeamStatusEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.STATUS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamStatusEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusNotEqualTo(String value) {
            addCriterion("teamA.STATUS <>", value, "teamStatus");

            return this;
        } // end andTeamStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusNotEqualToOrIsNull(String value) {
            addCriterion("teamA.STATUS is null OR teamA.STATUS <>", value,
                "teamStatus");

            return this;
        } // end andTeamStatusNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.STATUS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamStatusNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusGreaterThan(String value) {
            addCriterion("teamA.STATUS >", value, "teamStatus");

            return this;
        } // end andTeamStatusGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.STATUS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamStatusGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusGreaterThanOrEqualTo(String value) {
            addCriterion("teamA.STATUS >=", value, "teamStatus");

            return this;
        } // end andTeamStatusGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.STATUS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamStatusGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusLessThan(String value) {
            addCriterion("teamA.STATUS <", value, "teamStatus");

            return this;
        } // end andTeamStatusLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.STATUS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamStatusLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusLessThanOrEqualTo(String value) {
            addCriterion("teamA.STATUS <=", value, "teamStatus");

            return this;
        } // end andTeamStatusLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.STATUS like", buffer.toString(), "teamStatus");

            return this;
        } // end andTeamStatusLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.STATUS not like", buffer.toString(),
                "teamStatus");

            return this;
        } // end andTeamStatusNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusIn(List values) {
            if (values.size() == 1) {
                return andTeamStatusEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.STATUS in", values, "teamStatus");

                return this;
            } // end else
        } // end andTeamStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusNotIn(List values) {
            if (values.size() == 1) {
                return andTeamStatusNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.STATUS not in", values, "teamStatus");

                return this;
            } // end else
        } // end andTeamStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusIn(Object[] values) {
            if (values.length == 1) {
                return andTeamStatusEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.STATUS in", Arrays.asList(values),
                    "teamStatus");

                return this;
            } // end else
        } // end andTeamStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.STATUS not in", Arrays.asList(values),
                    "teamStatus");

                return this;
            } // end else
        } // end andTeamStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusBetween(String value1, String value2) {
            addCriterion("teamA.STATUS between", value1, value2, "teamStatus");

            return this;
        } // end andTeamStatusBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamStatusNotBetween(String value1, String value2) {
            addCriterion("teamA.STATUS not between", value1, value2,
                "teamStatus");

            return this;
        } // end andTeamStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeIsNull() {
            addCriterion("productA.PRODUCT_CODE is null");

            return this;
        } // end andProductCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeIsNotNull() {
            addCriterion("productA.PRODUCT_CODE is not null");

            return this;
        } // end andProductCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeIsNotEmpty() {
            addCriterion(
                "productA.PRODUCT_CODE is not null AND productA.PRODUCT_CODE <> ''");

            return this;
        } // end andProductCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeIsEmpty() {
            addCriterion(
                "(productA.PRODUCT_CODE is null OR productA.PRODUCT_CODE = '')");

            return this;
        } // end andProductCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("productA.PRODUCT_CODE =", value, "productCode");

            return this;
        } // end andProductCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("productA.PRODUCT_CODE <>", value, "productCode");

            return this;
        } // end andProductCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeNotEqualToOrIsNull(String value) {
            addCriterion("productA.PRODUCT_CODE is null OR productA.PRODUCT_CODE <>",
                value, "productCode");

            return this;
        } // end andProductCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("productA.PRODUCT_CODE >", value, "productCode");

            return this;
        } // end andProductCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("productA.PRODUCT_CODE >=", value, "productCode");

            return this;
        } // end andProductCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeLessThan(String value) {
            addCriterion("productA.PRODUCT_CODE <", value, "productCode");

            return this;
        } // end andProductCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("productA.PRODUCT_CODE <=", value, "productCode");

            return this;
        } // end andProductCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("productA.PRODUCT_CODE like", buffer.toString(),
                "productCode");

            return this;
        } // end andProductCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("productA.PRODUCT_CODE not like", buffer.toString(),
                "productCode");

            return this;
        } // end andProductCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeIn(List values) {
            if (values.size() == 1) {
                return andProductCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("productA.PRODUCT_CODE in", values, "productCode");

                return this;
            } // end else
        } // end andProductCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeNotIn(List values) {
            if (values.size() == 1) {
                return andProductCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("productA.PRODUCT_CODE not in", values,
                    "productCode");

                return this;
            } // end else
        } // end andProductCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeIn(Object[] values) {
            if (values.length == 1) {
                return andProductCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("productA.PRODUCT_CODE in", Arrays.asList(values),
                    "productCode");

                return this;
            } // end else
        } // end andProductCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("productA.PRODUCT_CODE not in",
                    Arrays.asList(values), "productCode");

                return this;
            } // end else
        } // end andProductCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("productA.PRODUCT_CODE between", value1, value2,
                "productCode");

            return this;
        } // end andProductCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("productA.PRODUCT_CODE not between", value1, value2,
                "productCode");

            return this;
        } // end andProductCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameIsNull() {
            addCriterion("productA.PRODUCT_NAME is null");

            return this;
        } // end andProductNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameIsNotNull() {
            addCriterion("productA.PRODUCT_NAME is not null");

            return this;
        } // end andProductNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameIsNotEmpty() {
            addCriterion(
                "productA.PRODUCT_NAME is not null AND productA.PRODUCT_NAME <> ''");

            return this;
        } // end andProductNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameIsEmpty() {
            addCriterion(
                "(productA.PRODUCT_NAME is null OR productA.PRODUCT_NAME = '')");

            return this;
        } // end andProductNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameEqualTo(String value) {
            addCriterion("productA.PRODUCT_NAME =", value, "productName");

            return this;
        } // end andProductNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("productA.PRODUCT_NAME <>", value, "productName");

            return this;
        } // end andProductNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameNotEqualToOrIsNull(String value) {
            addCriterion("productA.PRODUCT_NAME is null OR productA.PRODUCT_NAME <>",
                value, "productName");

            return this;
        } // end andProductNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("productA.PRODUCT_NAME >", value, "productName");

            return this;
        } // end andProductNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("productA.PRODUCT_NAME >=", value, "productName");

            return this;
        } // end andProductNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameLessThan(String value) {
            addCriterion("productA.PRODUCT_NAME <", value, "productName");

            return this;
        } // end andProductNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("productA.PRODUCT_NAME <=", value, "productName");

            return this;
        } // end andProductNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("productA.PRODUCT_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("productA.PRODUCT_NAME like", buffer.toString(),
                "productName");

            return this;
        } // end andProductNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("productA.PRODUCT_NAME not like", buffer.toString(),
                "productName");

            return this;
        } // end andProductNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameIn(List values) {
            if (values.size() == 1) {
                return andProductNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("productA.PRODUCT_NAME in", values, "productName");

                return this;
            } // end else
        } // end andProductNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameNotIn(List values) {
            if (values.size() == 1) {
                return andProductNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("productA.PRODUCT_NAME not in", values,
                    "productName");

                return this;
            } // end else
        } // end andProductNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameIn(Object[] values) {
            if (values.length == 1) {
                return andProductNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("productA.PRODUCT_NAME in", Arrays.asList(values),
                    "productName");

                return this;
            } // end else
        } // end andProductNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("productA.PRODUCT_NAME not in",
                    Arrays.asList(values), "productName");

                return this;
            } // end else
        } // end andProductNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("productA.PRODUCT_NAME between", value1, value2,
                "productName");

            return this;
        } // end andProductNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("productA.PRODUCT_NAME not between", value1, value2,
                "productName");

            return this;
        } // end andProductNameNotBetween()
    } // end Criteria
} // end ProductTeamRelateDAOQueryBean
