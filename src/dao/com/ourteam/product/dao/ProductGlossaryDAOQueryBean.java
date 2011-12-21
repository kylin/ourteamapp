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
 * ProductGlossary query bean 2011-10-12 16:26:31
 *
 * @author Auto Gen
 */
public class ProductGlossaryDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ProductGlossaryDAOQueryBean object.
     */
    public ProductGlossaryDAOQueryBean() {
        super();
    } // end ProductGlossaryDAOQueryBean()

    /**
     * Creates a new ProductGlossaryDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ProductGlossaryDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ProductGlossaryDAOQueryBean()

    /**
     * Creates a new ProductGlossaryDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ProductGlossaryDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ProductGlossaryDAOQueryBean()

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
            addSelectProperty(IProductGlossaryDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCodeSelectProperty() {
        addCodeSelectProperty("code");
    } // end addCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryDAO.Code, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.Code, "code");
        } // end else
    } // end addCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addContentSelectProperty() {
        addContentSelectProperty("content");
    } // end addContentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addContentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryDAO.Content, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.Content, "content");
        } // end else
    } // end addContentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCreateDateSelectProperty() {
        addCreateDateSelectProperty("createDate");
    } // end addCreateDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCreateDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryDAO.CreateDate, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.CreateDate, "createDate");
        } // end else
    } // end addCreateDateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCreatorIdSelectProperty() {
        addCreatorIdSelectProperty("creatorId");
    } // end addCreatorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCreatorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryDAO.CreatorId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.CreatorId, "creatorId");
        } // end else
    } // end addCreatorIdSelectProperty()

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
            addSelectProperty(IProductGlossaryDAO.LastEditorId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.LastEditorId, "lastEditorId");
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
            addSelectProperty(IProductGlossaryDAO.LastEditDate, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.LastEditDate, "lastEditDate");
        } // end else
    } // end addLastEditDateSelectProperty()

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
            addSelectProperty(IProductGlossaryDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

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
            addSelectProperty(IProductGlossaryDAO.ProductId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.ProductId, "productId");
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
            addSelectProperty(IProductGlossaryDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.Remarks, "remarks");
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
            addSelectProperty(IProductGlossaryDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(IProductGlossaryDAO.LastEditorName, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.LastEditorName,
                "lastEditorName");
        } // end else
    } // end addLastEditorNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSinceVersionIdSelectProperty() {
        addSinceVersionIdSelectProperty("sinceVersionId");
    } // end addSinceVersionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSinceVersionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryDAO.SinceVersionId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.SinceVersionId,
                "sinceVersionId");
        } // end else
    } // end addSinceVersionIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSinceVersionSelectProperty() {
        addSinceVersionSelectProperty("sinceVersion");
    } // end addSinceVersionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSinceVersionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryDAO.SinceVersion, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryDAO.SinceVersion, "sinceVersion");
        } // end else
    } // end addSinceVersionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCodeSelectProperty();

        addContentSelectProperty();

        addCreateDateSelectProperty();

        addCreatorIdSelectProperty();

        addLastEditorIdSelectProperty();

        addLastEditDateSelectProperty();

        addNameSelectProperty();

        addProductIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addLastEditorNameSelectProperty();

        addSinceVersionIdSelectProperty();

        addSinceVersionSelectProperty();
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
            addCriterion("PRODUCT_GLOSSARY.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.ID is not null AND PRODUCT_GLOSSARY.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.ID is null OR PRODUCT_GLOSSARY.ID = '')");

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
            addCriterion("PRODUCT_GLOSSARY.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.ID");
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
            addCriterion("PRODUCT_GLOSSARY.ID <>", value, "id");

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
            addCriterion("PRODUCT_GLOSSARY.ID is null OR PRODUCT_GLOSSARY.ID <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.ID");
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
            addCriterion("PRODUCT_GLOSSARY.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.ID");
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
            addCriterion("PRODUCT_GLOSSARY.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.ID");
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
            addCriterion("PRODUCT_GLOSSARY.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.ID");
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
            addCriterion("PRODUCT_GLOSSARY.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.ID");
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
                addCriterion("PRODUCT_GLOSSARY.ID in", values, "id");

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
                addCriterion("PRODUCT_GLOSSARY.ID not in", values, "id");

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
                addCriterion("PRODUCT_GLOSSARY.ID in", values, "id");

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
                addCriterion("PRODUCT_GLOSSARY.ID not in", values, "id");

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
                addCriterion("PRODUCT_GLOSSARY.ID in", Arrays.asList(values),
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
                addCriterion("PRODUCT_GLOSSARY.ID not in",
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
            addCriterion("PRODUCT_GLOSSARY.ID between", value1, value2, "id");

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
            addCriterion("PRODUCT_GLOSSARY.ID between", value1, value2, "id");

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
            addCriterion("PRODUCT_GLOSSARY.ID not between", value1, value2, "id");

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
            addCriterion("PRODUCT_GLOSSARY.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNull() {
            addCriterion("PRODUCT_GLOSSARY.CODE is null");

            return this;
        } // end andCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.CODE is not null");

            return this;
        } // end andCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.CODE is not null AND PRODUCT_GLOSSARY.CODE <> ''");

            return this;
        } // end andCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.CODE is null OR PRODUCT_GLOSSARY.CODE = '')");

            return this;
        } // end andCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CODE =", value, "code");

            return this;
        } // end andCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CODE <>", value, "code");

            return this;
        } // end andCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualToOrIsNull(String value) {
            addCriterion("PRODUCT_GLOSSARY.CODE is null OR PRODUCT_GLOSSARY.CODE <>",
                value, "code");

            return this;
        } // end andCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThan(String value) {
            addCriterion("PRODUCT_GLOSSARY.CODE >", value, "code");

            return this;
        } // end andCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CODE >=", value, "code");

            return this;
        } // end andCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThan(String value) {
            addCriterion("PRODUCT_GLOSSARY.CODE <", value, "code");

            return this;
        } // end andCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CODE <=", value, "code");

            return this;
        } // end andCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY.CODE like", buffer.toString(), "code");

            return this;
        } // end andCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY.CODE not like", buffer.toString(),
                "code");

            return this;
        } // end andCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIn(List values) {
            if (values.size() == 1) {
                return andCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CODE in", values, "code");

                return this;
            } // end else
        } // end andCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotIn(List values) {
            if (values.size() == 1) {
                return andCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CODE not in", values, "code");

                return this;
            } // end else
        } // end andCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIn(Object[] values) {
            if (values.length == 1) {
                return andCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CODE in", Arrays.asList(values),
                    "code");

                return this;
            } // end else
        } // end andCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CODE not in",
                    Arrays.asList(values), "code");

                return this;
            } // end else
        } // end andCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_GLOSSARY.CODE between", value1, value2, "code");

            return this;
        } // end andCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_GLOSSARY.CODE not between", value1, value2,
                "code");

            return this;
        } // end andCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentIsNull() {
            addCriterion("PRODUCT_GLOSSARY.CONTENT is null");

            return this;
        } // end andContentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.CONTENT is not null");

            return this;
        } // end andContentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.CONTENT is not null AND PRODUCT_GLOSSARY.CONTENT <> ''");

            return this;
        } // end andContentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.CONTENT is null OR PRODUCT_GLOSSARY.CONTENT = '')");

            return this;
        } // end andContentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT =", value, "content");

            return this;
        } // end andContentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CONTENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andContentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentNotEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT <>", value, "content");

            return this;
        } // end andContentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentNotEqualToOrIsNull(String value) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT is null OR PRODUCT_GLOSSARY.CONTENT <>",
                value, "content");

            return this;
        } // end andContentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CONTENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andContentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentGreaterThan(String value) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT >", value, "content");

            return this;
        } // end andContentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CONTENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andContentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT >=", value, "content");

            return this;
        } // end andContentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CONTENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andContentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentLessThan(String value) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT <", value, "content");

            return this;
        } // end andContentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CONTENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andContentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT <=", value, "content");

            return this;
        } // end andContentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CONTENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andContentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY.CONTENT like", buffer.toString(),
                "content");

            return this;
        } // end andContentLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY.CONTENT not like",
                buffer.toString(), "content");

            return this;
        } // end andContentNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentIn(List values) {
            if (values.size() == 1) {
                return andContentEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CONTENT in", values, "content");

                return this;
            } // end else
        } // end andContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentNotIn(List values) {
            if (values.size() == 1) {
                return andContentNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CONTENT not in", values,
                    "content");

                return this;
            } // end else
        } // end andContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentIn(Object[] values) {
            if (values.length == 1) {
                return andContentEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CONTENT in",
                    Arrays.asList(values), "content");

                return this;
            } // end else
        } // end andContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentNotIn(Object[] values) {
            if (values.length == 1) {
                return andContentNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CONTENT not in",
                    Arrays.asList(values), "content");

                return this;
            } // end else
        } // end andContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT between", value1, value2,
                "content");

            return this;
        } // end andContentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_GLOSSARY.CONTENT not between", value1,
                value2, "content");

            return this;
        } // end andContentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNull() {
            addCriterion("PRODUCT_GLOSSARY.CREATE_DATE is null");

            return this;
        } // end andCreateDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.CREATE_DATE is not null");

            return this;
        } // end andCreateDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.CREATE_DATE is not null AND PRODUCT_GLOSSARY.CREATE_DATE <> ''");

            return this;
        } // end andCreateDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.CREATE_DATE is null OR PRODUCT_GLOSSARY.CREATE_DATE = '')");

            return this;
        } // end andCreateDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE =", value,
                "createDate");

            return this;
        } // end andCreateDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATE_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE <>", value,
                "createDate");

            return this;
        } // end andCreateDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE is null OR PRODUCT_GLOSSARY.CREATE_DATE <>",
                value, "createDate");

            return this;
        } // end andCreateDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATE_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE >", value,
                "createDate");

            return this;
        } // end andCreateDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATE_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE >=", value,
                "createDate");

            return this;
        } // end andCreateDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATE_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE <", value,
                "createDate");

            return this;
        } // end andCreateDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATE_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE <=", value,
                "createDate");

            return this;
        } // end andCreateDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATE_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIn(List values) {
            if (values.size() == 1) {
                return andCreateDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE in",
                    values, "createDate");

                return this;
            } // end else
        } // end andCreateDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotIn(List values) {
            if (values.size() == 1) {
                return andCreateDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE not in",
                    values, "createDate");

                return this;
            } // end else
        } // end andCreateDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIn(Object[] values) {
            if (values.length == 1) {
                return andCreateDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE in",
                    Arrays.asList(values), "createDate");

                return this;
            } // end else
        } // end andCreateDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andCreateDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE not in",
                    Arrays.asList(values), "createDate");

                return this;
            } // end else
        } // end andCreateDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE between",
                value1, value2, "createDate");

            return this;
        } // end andCreateDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.CREATE_DATE not between",
                value1, value2, "createDate");

            return this;
        } // end andCreateDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsNull() {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID is null");

            return this;
        } // end andCreatorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID is not null");

            return this;
        } // end andCreatorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.CREATOR_ID is not null AND PRODUCT_GLOSSARY.CREATOR_ID <> ''");

            return this;
        } // end andCreatorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.CREATOR_ID is null OR PRODUCT_GLOSSARY.CREATOR_ID = '')");

            return this;
        } // end andCreatorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdEqualTo(long value) {
            return andCreatorIdEqualTo(Long.valueOf(value));
        } // end andCreatorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID =", value, "creatorId");

            return this;
        } // end andCreatorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualTo(long value) {
            return andCreatorIdNotEqualTo(Long.valueOf(value));
        } // end andCreatorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID <>", value, "creatorId");

            return this;
        } // end andCreatorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualToOrIsNull(long value) {
            return andCreatorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andCreatorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID is null OR PRODUCT_GLOSSARY.CREATOR_ID <>",
                value, "creatorId");

            return this;
        } // end andCreatorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThan(long value) {
            return andCreatorIdGreaterThan(Long.valueOf(value));
        } // end andCreatorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID >", value, "creatorId");

            return this;
        } // end andCreatorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanOrEqualTo(long value) {
            return andCreatorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andCreatorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID >=", value, "creatorId");

            return this;
        } // end andCreatorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThan(long value) {
            return andCreatorIdLessThan(Long.valueOf(value));
        } // end andCreatorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID <", value, "creatorId");

            return this;
        } // end andCreatorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanOrEqualTo(long value) {
            return andCreatorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andCreatorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID <=", value, "creatorId");

            return this;
        } // end andCreatorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.CREATOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIn(long[] values) {
            if (values.length == 1) {
                return andCreatorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CREATOR_ID in", values,
                    "creatorId");

                return this;
            } // end else
        } // end andCreatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andCreatorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CREATOR_ID not in", values,
                    "creatorId");

                return this;
            } // end else
        } // end andCreatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIn(List values) {
            if (values.size() == 1) {
                return andCreatorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CREATOR_ID in", values,
                    "creatorId");

                return this;
            } // end else
        } // end andCreatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotIn(List values) {
            if (values.size() == 1) {
                return andCreatorIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CREATOR_ID not in", values,
                    "creatorId");

                return this;
            } // end else
        } // end andCreatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIn(Object[] values) {
            if (values.length == 1) {
                return andCreatorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CREATOR_ID in",
                    Arrays.asList(values), "creatorId");

                return this;
            } // end else
        } // end andCreatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andCreatorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.CREATOR_ID not in",
                    Arrays.asList(values), "creatorId");

                return this;
            } // end else
        } // end andCreatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID between", value1, value2,
                "creatorId");

            return this;
        } // end andCreatorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID between", value1, value2,
                "creatorId");

            return this;
        } // end andCreatorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID not between", value1,
                value2, "creatorId");

            return this;
        } // end andCreatorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY.CREATOR_ID not between", value1,
                value2, "creatorId");

            return this;
        } // end andCreatorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNull() {
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID is null");

            return this;
        } // end andLastEditorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID is not null");

            return this;
        } // end andLastEditorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.LAST_EDITOR_ID is not null AND PRODUCT_GLOSSARY.LAST_EDITOR_ID <> ''");

            return this;
        } // end andLastEditorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.LAST_EDITOR_ID is null OR PRODUCT_GLOSSARY.LAST_EDITOR_ID = '')");

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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID =", value,
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
                    "PRODUCT_GLOSSARY.LAST_EDITOR_ID");
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID <>", value,
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID is null OR PRODUCT_GLOSSARY.LAST_EDITOR_ID <>",
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
                    "PRODUCT_GLOSSARY.LAST_EDITOR_ID");
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID >", value,
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
                    "PRODUCT_GLOSSARY.LAST_EDITOR_ID");
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID >=", value,
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
                    "PRODUCT_GLOSSARY.LAST_EDITOR_ID");
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID <", value,
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
                    "PRODUCT_GLOSSARY.LAST_EDITOR_ID");
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID <=", value,
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
                    "PRODUCT_GLOSSARY.LAST_EDITOR_ID");
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
                addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID in", values,
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
                addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID not in", values,
                    "lastEditorId");

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
                addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID in", values,
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
                addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID not in", values,
                    "lastEditorId");

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
                addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID in",
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
                addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID not in",
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID between", value1,
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID between", value1,
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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID not between", value1,
                value2, "lastEditorId");

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
            addCriterion("PRODUCT_GLOSSARY.LAST_EDITOR_ID not between", value1,
                value2, "lastEditorId");

            return this;
        } // end andLastEditorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsNull() {
            addCriterion("PRODUCT_GLOSSARY.LAST_EDIT_DATE is null");

            return this;
        } // end andLastEditDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.LAST_EDIT_DATE is not null");

            return this;
        } // end andLastEditDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.LAST_EDIT_DATE is not null AND PRODUCT_GLOSSARY.LAST_EDIT_DATE <> ''");

            return this;
        } // end andLastEditDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditDateIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.LAST_EDIT_DATE is null OR PRODUCT_GLOSSARY.LAST_EDIT_DATE = '')");

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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE =", value,
                "lastEditDate");

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
                    "PRODUCT_GLOSSARY.LAST_EDIT_DATE");
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE <>",
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE is null OR PRODUCT_GLOSSARY.LAST_EDIT_DATE <>",
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
                    "PRODUCT_GLOSSARY.LAST_EDIT_DATE");
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE >", value,
                "lastEditDate");

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
                    "PRODUCT_GLOSSARY.LAST_EDIT_DATE");
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE >=",
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
                    "PRODUCT_GLOSSARY.LAST_EDIT_DATE");
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE <", value,
                "lastEditDate");

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
                    "PRODUCT_GLOSSARY.LAST_EDIT_DATE");
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE <=",
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
                    "PRODUCT_GLOSSARY.LAST_EDIT_DATE");
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
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE in",
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
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE not in",
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
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE in",
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
                addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE not in",
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE between",
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
            addCriterionForJDBCDate("PRODUCT_GLOSSARY.LAST_EDIT_DATE not between",
                value1, value2, "lastEditDate");

            return this;
        } // end andLastEditDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("PRODUCT_GLOSSARY.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.NAME is not null AND PRODUCT_GLOSSARY.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.NAME is null OR PRODUCT_GLOSSARY.NAME = '')");

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
            addCriterion("PRODUCT_GLOSSARY.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.NAME");
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
            addCriterion("PRODUCT_GLOSSARY.NAME <>", value, "name");

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
            addCriterion("PRODUCT_GLOSSARY.NAME is null OR PRODUCT_GLOSSARY.NAME <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.NAME");
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
            addCriterion("PRODUCT_GLOSSARY.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.NAME");
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
            addCriterion("PRODUCT_GLOSSARY.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.NAME");
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
            addCriterion("PRODUCT_GLOSSARY.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.NAME");
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
            addCriterion("PRODUCT_GLOSSARY.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.NAME");
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
            addCriterion("PRODUCT_GLOSSARY.NAME like", buffer.toString(), "name");

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
            addCriterion("PRODUCT_GLOSSARY.NAME not like", buffer.toString(),
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
                addCriterion("PRODUCT_GLOSSARY.NAME in", values, "name");

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
                addCriterion("PRODUCT_GLOSSARY.NAME not in", values, "name");

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
                addCriterion("PRODUCT_GLOSSARY.NAME in", Arrays.asList(values),
                    "name");

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
                addCriterion("PRODUCT_GLOSSARY.NAME not in",
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
            addCriterion("PRODUCT_GLOSSARY.NAME between", value1, value2, "name");

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
            addCriterion("PRODUCT_GLOSSARY.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID is null");

            return this;
        } // end andProductIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID is not null");

            return this;
        } // end andProductIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.PRODUCT_ID is not null AND PRODUCT_GLOSSARY.PRODUCT_ID <> ''");

            return this;
        } // end andProductIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.PRODUCT_ID is null OR PRODUCT_GLOSSARY.PRODUCT_ID = '')");

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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID =", value, "productId");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.PRODUCT_ID");
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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID <>", value, "productId");

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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID is null OR PRODUCT_GLOSSARY.PRODUCT_ID <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.PRODUCT_ID");
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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID >", value, "productId");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.PRODUCT_ID");
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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID >=", value, "productId");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.PRODUCT_ID");
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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID <", value, "productId");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.PRODUCT_ID");
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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID <=", value, "productId");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.PRODUCT_ID");
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
                addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID in", values,
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
                addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID not in", values,
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
                addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID in", values,
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
                addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID not in", values,
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
                addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID in",
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
                addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID not in",
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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID between", value1, value2,
                "productId");

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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID between", value1, value2,
                "productId");

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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID not between", value1,
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
            addCriterion("PRODUCT_GLOSSARY.PRODUCT_ID not between", value1,
                value2, "productId");

            return this;
        } // end andProductIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("PRODUCT_GLOSSARY.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.REMARKS is not null AND PRODUCT_GLOSSARY.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.REMARKS is null OR PRODUCT_GLOSSARY.REMARKS = '')");

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
            addCriterion("PRODUCT_GLOSSARY.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS <>", value, "remarks");

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
            addCriterion("PRODUCT_GLOSSARY.REMARKS is null OR PRODUCT_GLOSSARY.REMARKS <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS like", buffer.toString(),
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS not like",
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
                addCriterion("PRODUCT_GLOSSARY.REMARKS in", values, "remarks");

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
                addCriterion("PRODUCT_GLOSSARY.REMARKS not in", values,
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
                addCriterion("PRODUCT_GLOSSARY.REMARKS in",
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
                addCriterion("PRODUCT_GLOSSARY.REMARKS not in",
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS between", value1, value2,
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
            addCriterion("PRODUCT_GLOSSARY.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("PRODUCT_GLOSSARY.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.STATUS is not null AND PRODUCT_GLOSSARY.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.STATUS is null OR PRODUCT_GLOSSARY.STATUS = '')");

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
            addCriterion("PRODUCT_GLOSSARY.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY.STATUS <>", value, "status");

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
            addCriterion("PRODUCT_GLOSSARY.STATUS is null OR PRODUCT_GLOSSARY.STATUS <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY.STATUS like", buffer.toString(),
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
            addCriterion("PRODUCT_GLOSSARY.STATUS not like", buffer.toString(),
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
                addCriterion("PRODUCT_GLOSSARY.STATUS in", values, "status");

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
                addCriterion("PRODUCT_GLOSSARY.STATUS not in", values, "status");

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
                addCriterion("PRODUCT_GLOSSARY.STATUS in",
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
                addCriterion("PRODUCT_GLOSSARY.STATUS not in",
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
            addCriterion("PRODUCT_GLOSSARY.STATUS between", value1, value2,
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
            addCriterion("PRODUCT_GLOSSARY.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNull() {
            addCriterion("lastEditorA.USER_NAME is null");

            return this;
        } // end andLastEditorNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNotNull() {
            addCriterion("lastEditorA.USER_NAME is not null");

            return this;
        } // end andLastEditorNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNotEmpty() {
            addCriterion(
                "lastEditorA.USER_NAME is not null AND lastEditorA.USER_NAME <> ''");

            return this;
        } // end andLastEditorNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsEmpty() {
            addCriterion(
                "(lastEditorA.USER_NAME is null OR lastEditorA.USER_NAME = '')");

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
            addCriterion("lastEditorA.USER_NAME =", value, "lastEditorName");

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
            StringBuffer str = new StringBuffer("lastEditorA.USER_NAME");
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
            addCriterion("lastEditorA.USER_NAME <>", value, "lastEditorName");

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
            addCriterion("lastEditorA.USER_NAME is null OR lastEditorA.USER_NAME <>",
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
            StringBuffer str = new StringBuffer("lastEditorA.USER_NAME");
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
            addCriterion("lastEditorA.USER_NAME >", value, "lastEditorName");

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
            StringBuffer str = new StringBuffer("lastEditorA.USER_NAME");
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
            addCriterion("lastEditorA.USER_NAME >=", value, "lastEditorName");

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
            StringBuffer str = new StringBuffer("lastEditorA.USER_NAME");
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
            addCriterion("lastEditorA.USER_NAME <", value, "lastEditorName");

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
            StringBuffer str = new StringBuffer("lastEditorA.USER_NAME");
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
            addCriterion("lastEditorA.USER_NAME <=", value, "lastEditorName");

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
            StringBuffer str = new StringBuffer("lastEditorA.USER_NAME");
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
            addCriterion("lastEditorA.USER_NAME like", buffer.toString(),
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
            addCriterion("lastEditorA.USER_NAME not like", buffer.toString(),
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
                addCriterion("lastEditorA.USER_NAME in", values,
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
        public Criteria andLastEditorNameNotIn(List values) {
            if (values.size() == 1) {
                return andLastEditorNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("lastEditorA.USER_NAME not in", values,
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
                addCriterion("lastEditorA.USER_NAME in", Arrays.asList(values),
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
                addCriterion("lastEditorA.USER_NAME not in",
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
            addCriterion("lastEditorA.USER_NAME between", value1, value2,
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
            addCriterion("lastEditorA.USER_NAME not between", value1, value2,
                "lastEditorName");

            return this;
        } // end andLastEditorNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdIsNull() {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID is null");

            return this;
        } // end andSinceVersionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID is not null");

            return this;
        } // end andSinceVersionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY.SINCE_VERSION_ID is not null AND PRODUCT_GLOSSARY.SINCE_VERSION_ID <> ''");

            return this;
        } // end andSinceVersionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY.SINCE_VERSION_ID is null OR PRODUCT_GLOSSARY.SINCE_VERSION_ID = '')");

            return this;
        } // end andSinceVersionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdEqualTo(long value) {
            return andSinceVersionIdEqualTo(Long.valueOf(value));
        } // end andSinceVersionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID =", value,
                "sinceVersionId");

            return this;
        } // end andSinceVersionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY.SINCE_VERSION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotEqualTo(long value) {
            return andSinceVersionIdNotEqualTo(Long.valueOf(value));
        } // end andSinceVersionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID <>", value,
                "sinceVersionId");

            return this;
        } // end andSinceVersionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotEqualToOrIsNull(long value) {
            return andSinceVersionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSinceVersionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID is null OR PRODUCT_GLOSSARY.SINCE_VERSION_ID <>",
                value, "sinceVersionId");

            return this;
        } // end andSinceVersionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY.SINCE_VERSION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdGreaterThan(long value) {
            return andSinceVersionIdGreaterThan(Long.valueOf(value));
        } // end andSinceVersionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID >", value,
                "sinceVersionId");

            return this;
        } // end andSinceVersionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY.SINCE_VERSION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdGreaterThanOrEqualTo(long value) {
            return andSinceVersionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSinceVersionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID >=", value,
                "sinceVersionId");

            return this;
        } // end andSinceVersionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY.SINCE_VERSION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdLessThan(long value) {
            return andSinceVersionIdLessThan(Long.valueOf(value));
        } // end andSinceVersionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID <", value,
                "sinceVersionId");

            return this;
        } // end andSinceVersionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY.SINCE_VERSION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdLessThanOrEqualTo(long value) {
            return andSinceVersionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSinceVersionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID <=", value,
                "sinceVersionId");

            return this;
        } // end andSinceVersionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY.SINCE_VERSION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdIn(long[] values) {
            if (values.length == 1) {
                return andSinceVersionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID in", values,
                    "sinceVersionId");

                return this;
            } // end else
        } // end andSinceVersionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSinceVersionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID not in",
                    values, "sinceVersionId");

                return this;
            } // end else
        } // end andSinceVersionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdIn(List values) {
            if (values.size() == 1) {
                return andSinceVersionIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID in", values,
                    "sinceVersionId");

                return this;
            } // end else
        } // end andSinceVersionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotIn(List values) {
            if (values.size() == 1) {
                return andSinceVersionIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID not in",
                    values, "sinceVersionId");

                return this;
            } // end else
        } // end andSinceVersionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdIn(Object[] values) {
            if (values.length == 1) {
                return andSinceVersionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID in",
                    Arrays.asList(values), "sinceVersionId");

                return this;
            } // end else
        } // end andSinceVersionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSinceVersionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID not in",
                    Arrays.asList(values), "sinceVersionId");

                return this;
            } // end else
        } // end andSinceVersionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID between", value1,
                value2, "sinceVersionId");

            return this;
        } // end andSinceVersionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID between", value1,
                value2, "sinceVersionId");

            return this;
        } // end andSinceVersionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID not between",
                value1, value2, "sinceVersionId");

            return this;
        } // end andSinceVersionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY.SINCE_VERSION_ID not between",
                value1, value2, "sinceVersionId");

            return this;
        } // end andSinceVersionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIsNull() {
            addCriterion("productVersionA.PRODUCT_VERSION is null");

            return this;
        } // end andSinceVersionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIsNotNull() {
            addCriterion("productVersionA.PRODUCT_VERSION is not null");

            return this;
        } // end andSinceVersionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIsNotEmpty() {
            addCriterion(
                "productVersionA.PRODUCT_VERSION is not null AND productVersionA.PRODUCT_VERSION <> ''");

            return this;
        } // end andSinceVersionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIsEmpty() {
            addCriterion(
                "(productVersionA.PRODUCT_VERSION is null OR productVersionA.PRODUCT_VERSION = '')");

            return this;
        } // end andSinceVersionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionEqualTo(String value) {
            addCriterion("productVersionA.PRODUCT_VERSION =", value,
                "sinceVersion");

            return this;
        } // end andSinceVersionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "productVersionA.PRODUCT_VERSION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionNotEqualTo(String value) {
            addCriterion("productVersionA.PRODUCT_VERSION <>", value,
                "sinceVersion");

            return this;
        } // end andSinceVersionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionNotEqualToOrIsNull(String value) {
            addCriterion("productVersionA.PRODUCT_VERSION is null OR productVersionA.PRODUCT_VERSION <>",
                value, "sinceVersion");

            return this;
        } // end andSinceVersionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "productVersionA.PRODUCT_VERSION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionGreaterThan(String value) {
            addCriterion("productVersionA.PRODUCT_VERSION >", value,
                "sinceVersion");

            return this;
        } // end andSinceVersionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "productVersionA.PRODUCT_VERSION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("productVersionA.PRODUCT_VERSION >=", value,
                "sinceVersion");

            return this;
        } // end andSinceVersionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "productVersionA.PRODUCT_VERSION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionLessThan(String value) {
            addCriterion("productVersionA.PRODUCT_VERSION <", value,
                "sinceVersion");

            return this;
        } // end andSinceVersionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "productVersionA.PRODUCT_VERSION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionLessThanOrEqualTo(String value) {
            addCriterion("productVersionA.PRODUCT_VERSION <=", value,
                "sinceVersion");

            return this;
        } // end andSinceVersionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "productVersionA.PRODUCT_VERSION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSinceVersionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("productVersionA.PRODUCT_VERSION like",
                buffer.toString(), "sinceVersion");

            return this;
        } // end andSinceVersionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("productVersionA.PRODUCT_VERSION not like",
                buffer.toString(), "sinceVersion");

            return this;
        } // end andSinceVersionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIn(List values) {
            if (values.size() == 1) {
                return andSinceVersionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("productVersionA.PRODUCT_VERSION in", values,
                    "sinceVersion");

                return this;
            } // end else
        } // end andSinceVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionNotIn(List values) {
            if (values.size() == 1) {
                return andSinceVersionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("productVersionA.PRODUCT_VERSION not in", values,
                    "sinceVersion");

                return this;
            } // end else
        } // end andSinceVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionIn(Object[] values) {
            if (values.length == 1) {
                return andSinceVersionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("productVersionA.PRODUCT_VERSION in",
                    Arrays.asList(values), "sinceVersion");

                return this;
            } // end else
        } // end andSinceVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionNotIn(Object[] values) {
            if (values.length == 1) {
                return andSinceVersionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("productVersionA.PRODUCT_VERSION not in",
                    Arrays.asList(values), "sinceVersion");

                return this;
            } // end else
        } // end andSinceVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionBetween(String value1, String value2) {
            addCriterion("productVersionA.PRODUCT_VERSION between", value1,
                value2, "sinceVersion");

            return this;
        } // end andSinceVersionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSinceVersionNotBetween(String value1, String value2) {
            addCriterion("productVersionA.PRODUCT_VERSION not between", value1,
                value2, "sinceVersion");

            return this;
        } // end andSinceVersionNotBetween()
    } // end Criteria
} // end ProductGlossaryDAOQueryBean
