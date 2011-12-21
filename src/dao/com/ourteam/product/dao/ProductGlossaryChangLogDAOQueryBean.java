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
 * ProductGlossaryChangLog query bean 2011-10-12 13:50:04
 *
 * @author Auto Gen
 */
public class ProductGlossaryChangLogDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ProductGlossaryChangLogDAOQueryBean object.
     */
    public ProductGlossaryChangLogDAOQueryBean() {
        super();
    } // end ProductGlossaryChangLogDAOQueryBean()

    /**
     * Creates a new ProductGlossaryChangLogDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ProductGlossaryChangLogDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ProductGlossaryChangLogDAOQueryBean()

    /**
     * Creates a new ProductGlossaryChangLogDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ProductGlossaryChangLogDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ProductGlossaryChangLogDAOQueryBean()

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
            addSelectProperty(IProductGlossaryChangLogDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAfterChangeContentSelectProperty() {
        addAfterChangeContentSelectProperty("afterChangeContent");
    } // end addAfterChangeContentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAfterChangeContentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryChangLogDAO.AfterChangeContent,
                aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.AfterChangeContent,
                "afterChangeContent");
        } // end else
    } // end addAfterChangeContentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addApproverIdSelectProperty() {
        addApproverIdSelectProperty("approverId");
    } // end addApproverIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addApproverIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryChangLogDAO.ApproverId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.ApproverId,
                "approverId");
        } // end else
    } // end addApproverIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBeforChangeContentSelectProperty() {
        addBeforChangeContentSelectProperty("beforChangeContent");
    } // end addBeforChangeContentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBeforChangeContentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryChangLogDAO.BeforChangeContent,
                aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.BeforChangeContent,
                "beforChangeContent");
        } // end else
    } // end addBeforChangeContentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addChangeReasonSelectProperty() {
        addChangeReasonSelectProperty("changeReason");
    } // end addChangeReasonSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addChangeReasonSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryChangLogDAO.ChangeReason, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.ChangeReason,
                "changeReason");
        } // end else
    } // end addChangeReasonSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEditorIdSelectProperty() {
        addEditorIdSelectProperty("editorId");
    } // end addEditorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEditorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryChangLogDAO.EditorId, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.EditorId, "editorId");
        } // end else
    } // end addEditorIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEditDateSelectProperty() {
        addEditDateSelectProperty("editDate");
    } // end addEditDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEditDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryChangLogDAO.EditDate, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.EditDate, "editDate");
        } // end else
    } // end addEditDateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProductGlossaryIdSelectProperty() {
        addProductGlossaryIdSelectProperty("productGlossaryId");
    } // end addProductGlossaryIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProductGlossaryIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProductGlossaryChangLogDAO.ProductGlossaryId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.ProductGlossaryId,
                "productGlossaryId");
        } // end else
    } // end addProductGlossaryIdSelectProperty()

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
            addSelectProperty(IProductGlossaryChangLogDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.Remarks, "remarks");
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
            addSelectProperty(IProductGlossaryChangLogDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IProductGlossaryChangLogDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addAfterChangeContentSelectProperty();

        addApproverIdSelectProperty();

        addBeforChangeContentSelectProperty();

        addChangeReasonSelectProperty();

        addEditorIdSelectProperty();

        addEditDateSelectProperty();

        addProductGlossaryIdSelectProperty();

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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.ID is not null AND PRODUCT_GLOSSARY_CHANG_LOG.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.ID = '')");

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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY_CHANG_LOG.ID");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID <>", value, "id");

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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.ID <>",
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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY_CHANG_LOG.ID");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY_CHANG_LOG.ID");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY_CHANG_LOG.ID");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY_CHANG_LOG.ID");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("PRODUCT_GLOSSARY_CHANG_LOG.ID");
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID in", values, "id");

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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID not in", values,
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID in", values, "id");

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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID not in", values,
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID in",
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID not in",
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID between", value1,
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID between", value1,
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID not between", value1,
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentIsNull() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT is null");

            return this;
        } // end andAfterChangeContentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentIsNotNull() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT is not null");

            return this;
        } // end andAfterChangeContentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT is not null AND PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT <> ''");

            return this;
        } // end andAfterChangeContentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT is null OR PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT = '')");

            return this;
        } // end andAfterChangeContentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT =",
                value, "afterChangeContent");

            return this;
        } // end andAfterChangeContentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAfterChangeContentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentNotEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT <>",
                value, "afterChangeContent");

            return this;
        } // end andAfterChangeContentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentNotEqualToOrIsNull(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT is null OR PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT <>",
                value, "afterChangeContent");

            return this;
        } // end andAfterChangeContentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAfterChangeContentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentGreaterThan(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT >",
                value, "afterChangeContent");

            return this;
        } // end andAfterChangeContentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAfterChangeContentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT >=",
                value, "afterChangeContent");

            return this;
        } // end andAfterChangeContentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAfterChangeContentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentLessThan(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT <",
                value, "afterChangeContent");

            return this;
        } // end andAfterChangeContentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAfterChangeContentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT <=",
                value, "afterChangeContent");

            return this;
        } // end andAfterChangeContentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAfterChangeContentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT like",
                buffer.toString(), "afterChangeContent");

            return this;
        } // end andAfterChangeContentLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT not like",
                buffer.toString(), "afterChangeContent");

            return this;
        } // end andAfterChangeContentNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentIn(List values) {
            if (values.size() == 1) {
                return andAfterChangeContentEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT in",
                    values, "afterChangeContent");

                return this;
            } // end else
        } // end andAfterChangeContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentNotIn(List values) {
            if (values.size() == 1) {
                return andAfterChangeContentNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT not in",
                    values, "afterChangeContent");

                return this;
            } // end else
        } // end andAfterChangeContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentIn(Object[] values) {
            if (values.length == 1) {
                return andAfterChangeContentEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT in",
                    Arrays.asList(values), "afterChangeContent");

                return this;
            } // end else
        } // end andAfterChangeContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentNotIn(Object[] values) {
            if (values.length == 1) {
                return andAfterChangeContentNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT not in",
                    Arrays.asList(values), "afterChangeContent");

                return this;
            } // end else
        } // end andAfterChangeContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentBetween(String value1,
            String value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT between",
                value1, value2, "afterChangeContent");

            return this;
        } // end andAfterChangeContentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAfterChangeContentNotBetween(String value1,
            String value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT not between",
                value1, value2, "afterChangeContent");

            return this;
        } // end andAfterChangeContentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdIsNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID is null");

            return this;
        } // end andApproverIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID is not null");

            return this;
        } // end andApproverIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID is not null AND PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID <> ''");

            return this;
        } // end andApproverIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID = '')");

            return this;
        } // end andApproverIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdEqualTo(long value) {
            return andApproverIdEqualTo(Long.valueOf(value));
        } // end andApproverIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID =", value,
                "approverId");

            return this;
        } // end andApproverIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andApproverIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotEqualTo(long value) {
            return andApproverIdNotEqualTo(Long.valueOf(value));
        } // end andApproverIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID <>", value,
                "approverId");

            return this;
        } // end andApproverIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotEqualToOrIsNull(long value) {
            return andApproverIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andApproverIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID <>",
                value, "approverId");

            return this;
        } // end andApproverIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andApproverIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdGreaterThan(long value) {
            return andApproverIdGreaterThan(Long.valueOf(value));
        } // end andApproverIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID >", value,
                "approverId");

            return this;
        } // end andApproverIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andApproverIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdGreaterThanOrEqualTo(long value) {
            return andApproverIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andApproverIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID >=", value,
                "approverId");

            return this;
        } // end andApproverIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andApproverIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdLessThan(long value) {
            return andApproverIdLessThan(Long.valueOf(value));
        } // end andApproverIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID <", value,
                "approverId");

            return this;
        } // end andApproverIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andApproverIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdLessThanOrEqualTo(long value) {
            return andApproverIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andApproverIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID <=", value,
                "approverId");

            return this;
        } // end andApproverIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andApproverIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdIn(long[] values) {
            if (values.length == 1) {
                return andApproverIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID in",
                    values, "approverId");

                return this;
            } // end else
        } // end andApproverIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotIn(long[] values) {
            if (values.length == 1) {
                return andApproverIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID not in",
                    values, "approverId");

                return this;
            } // end else
        } // end andApproverIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdIn(List values) {
            if (values.size() == 1) {
                return andApproverIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID in",
                    values, "approverId");

                return this;
            } // end else
        } // end andApproverIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotIn(List values) {
            if (values.size() == 1) {
                return andApproverIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID not in",
                    values, "approverId");

                return this;
            } // end else
        } // end andApproverIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdIn(Object[] values) {
            if (values.length == 1) {
                return andApproverIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID in",
                    Arrays.asList(values), "approverId");

                return this;
            } // end else
        } // end andApproverIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andApproverIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID not in",
                    Arrays.asList(values), "approverId");

                return this;
            } // end else
        } // end andApproverIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID between",
                value1, value2, "approverId");

            return this;
        } // end andApproverIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID between",
                value1, value2, "approverId");

            return this;
        } // end andApproverIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID not between",
                value1, value2, "approverId");

            return this;
        } // end andApproverIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andApproverIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID not between",
                value1, value2, "approverId");

            return this;
        } // end andApproverIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentIsNull() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT is null");

            return this;
        } // end andBeforChangeContentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentIsNotNull() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT is not null");

            return this;
        } // end andBeforChangeContentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT is not null AND PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT <> ''");

            return this;
        } // end andBeforChangeContentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT is null OR PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT = '')");

            return this;
        } // end andBeforChangeContentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT =",
                value, "beforChangeContent");

            return this;
        } // end andBeforChangeContentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBeforChangeContentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentNotEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT <>",
                value, "beforChangeContent");

            return this;
        } // end andBeforChangeContentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentNotEqualToOrIsNull(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT is null OR PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT <>",
                value, "beforChangeContent");

            return this;
        } // end andBeforChangeContentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBeforChangeContentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentGreaterThan(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT >",
                value, "beforChangeContent");

            return this;
        } // end andBeforChangeContentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBeforChangeContentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT >=",
                value, "beforChangeContent");

            return this;
        } // end andBeforChangeContentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBeforChangeContentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentLessThan(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT <",
                value, "beforChangeContent");

            return this;
        } // end andBeforChangeContentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBeforChangeContentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT <=",
                value, "beforChangeContent");

            return this;
        } // end andBeforChangeContentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBeforChangeContentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT like",
                buffer.toString(), "beforChangeContent");

            return this;
        } // end andBeforChangeContentLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT not like",
                buffer.toString(), "beforChangeContent");

            return this;
        } // end andBeforChangeContentNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentIn(List values) {
            if (values.size() == 1) {
                return andBeforChangeContentEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT in",
                    values, "beforChangeContent");

                return this;
            } // end else
        } // end andBeforChangeContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentNotIn(List values) {
            if (values.size() == 1) {
                return andBeforChangeContentNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT not in",
                    values, "beforChangeContent");

                return this;
            } // end else
        } // end andBeforChangeContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentIn(Object[] values) {
            if (values.length == 1) {
                return andBeforChangeContentEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT in",
                    Arrays.asList(values), "beforChangeContent");

                return this;
            } // end else
        } // end andBeforChangeContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentNotIn(Object[] values) {
            if (values.length == 1) {
                return andBeforChangeContentNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT not in",
                    Arrays.asList(values), "beforChangeContent");

                return this;
            } // end else
        } // end andBeforChangeContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentBetween(String value1,
            String value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT between",
                value1, value2, "beforChangeContent");

            return this;
        } // end andBeforChangeContentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBeforChangeContentNotBetween(String value1,
            String value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT not between",
                value1, value2, "beforChangeContent");

            return this;
        } // end andBeforChangeContentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonIsNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON is null");

            return this;
        } // end andChangeReasonIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON is not null");

            return this;
        } // end andChangeReasonIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON is not null AND PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON <> ''");

            return this;
        } // end andChangeReasonIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON is null OR PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON = '')");

            return this;
        } // end andChangeReasonIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON =", value,
                "changeReason");

            return this;
        } // end andChangeReasonEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andChangeReasonEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonNotEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON <>", value,
                "changeReason");

            return this;
        } // end andChangeReasonNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonNotEqualToOrIsNull(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON is null OR PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON <>",
                value, "changeReason");

            return this;
        } // end andChangeReasonNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andChangeReasonNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonGreaterThan(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON >", value,
                "changeReason");

            return this;
        } // end andChangeReasonGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andChangeReasonGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON >=", value,
                "changeReason");

            return this;
        } // end andChangeReasonGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andChangeReasonGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonLessThan(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON <", value,
                "changeReason");

            return this;
        } // end andChangeReasonLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andChangeReasonLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON <=", value,
                "changeReason");

            return this;
        } // end andChangeReasonLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andChangeReasonLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON like",
                buffer.toString(), "changeReason");

            return this;
        } // end andChangeReasonLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON not like",
                buffer.toString(), "changeReason");

            return this;
        } // end andChangeReasonNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonIn(List values) {
            if (values.size() == 1) {
                return andChangeReasonEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON in",
                    values, "changeReason");

                return this;
            } // end else
        } // end andChangeReasonIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonNotIn(List values) {
            if (values.size() == 1) {
                return andChangeReasonNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON not in",
                    values, "changeReason");

                return this;
            } // end else
        } // end andChangeReasonNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonIn(Object[] values) {
            if (values.length == 1) {
                return andChangeReasonEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON in",
                    Arrays.asList(values), "changeReason");

                return this;
            } // end else
        } // end andChangeReasonIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonNotIn(Object[] values) {
            if (values.length == 1) {
                return andChangeReasonNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON not in",
                    Arrays.asList(values), "changeReason");

                return this;
            } // end else
        } // end andChangeReasonNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonBetween(String value1, String value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON between",
                value1, value2, "changeReason");

            return this;
        } // end andChangeReasonBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andChangeReasonNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON not between",
                value1, value2, "changeReason");

            return this;
        } // end andChangeReasonNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdIsNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID is null");

            return this;
        } // end andEditorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID is not null");

            return this;
        } // end andEditorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID is not null AND PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID <> ''");

            return this;
        } // end andEditorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID = '')");

            return this;
        } // end andEditorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdEqualTo(long value) {
            return andEditorIdEqualTo(Long.valueOf(value));
        } // end andEditorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID =", value,
                "editorId");

            return this;
        } // end andEditorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotEqualTo(long value) {
            return andEditorIdNotEqualTo(Long.valueOf(value));
        } // end andEditorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID <>", value,
                "editorId");

            return this;
        } // end andEditorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotEqualToOrIsNull(long value) {
            return andEditorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andEditorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID <>",
                value, "editorId");

            return this;
        } // end andEditorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdGreaterThan(long value) {
            return andEditorIdGreaterThan(Long.valueOf(value));
        } // end andEditorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID >", value,
                "editorId");

            return this;
        } // end andEditorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdGreaterThanOrEqualTo(long value) {
            return andEditorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andEditorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID >=", value,
                "editorId");

            return this;
        } // end andEditorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdLessThan(long value) {
            return andEditorIdLessThan(Long.valueOf(value));
        } // end andEditorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID <", value,
                "editorId");

            return this;
        } // end andEditorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdLessThanOrEqualTo(long value) {
            return andEditorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andEditorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID <=", value,
                "editorId");

            return this;
        } // end andEditorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdIn(long[] values) {
            if (values.length == 1) {
                return andEditorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID in", values,
                    "editorId");

                return this;
            } // end else
        } // end andEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andEditorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID not in",
                    values, "editorId");

                return this;
            } // end else
        } // end andEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdIn(List values) {
            if (values.size() == 1) {
                return andEditorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID in", values,
                    "editorId");

                return this;
            } // end else
        } // end andEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotIn(List values) {
            if (values.size() == 1) {
                return andEditorIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID not in",
                    values, "editorId");

                return this;
            } // end else
        } // end andEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdIn(Object[] values) {
            if (values.length == 1) {
                return andEditorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID in",
                    Arrays.asList(values), "editorId");

                return this;
            } // end else
        } // end andEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andEditorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID not in",
                    Arrays.asList(values), "editorId");

                return this;
            } // end else
        } // end andEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID between",
                value1, value2, "editorId");

            return this;
        } // end andEditorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID between",
                value1, value2, "editorId");

            return this;
        } // end andEditorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID not between",
                value1, value2, "editorId");

            return this;
        } // end andEditorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID not between",
                value1, value2, "editorId");

            return this;
        } // end andEditorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateIsNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE is null");

            return this;
        } // end andEditDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE is not null");

            return this;
        } // end andEditDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE is not null AND PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE <> ''");

            return this;
        } // end andEditDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE is null OR PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE = '')");

            return this;
        } // end andEditDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE =",
                value, "editDate");

            return this;
        } // end andEditDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE <>",
                value, "editDate");

            return this;
        } // end andEditDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE is null OR PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE <>",
                value, "editDate");

            return this;
        } // end andEditDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE >",
                value, "editDate");

            return this;
        } // end andEditDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE >=",
                value, "editDate");

            return this;
        } // end andEditDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE <",
                value, "editDate");

            return this;
        } // end andEditDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE <=",
                value, "editDate");

            return this;
        } // end andEditDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEditDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateIn(List values) {
            if (values.size() == 1) {
                return andEditDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE in",
                    values, "editDate");

                return this;
            } // end else
        } // end andEditDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateNotIn(List values) {
            if (values.size() == 1) {
                return andEditDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE not in",
                    values, "editDate");

                return this;
            } // end else
        } // end andEditDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateIn(Object[] values) {
            if (values.length == 1) {
                return andEditDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE in",
                    Arrays.asList(values), "editDate");

                return this;
            } // end else
        } // end andEditDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andEditDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE not in",
                    Arrays.asList(values), "editDate");

                return this;
            } // end else
        } // end andEditDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE between",
                value1, value2, "editDate");

            return this;
        } // end andEditDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEditDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE not between",
                value1, value2, "editDate");

            return this;
        } // end andEditDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdIsNull() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID is null");

            return this;
        } // end andProductGlossaryIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdIsNotNull() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID is not null");

            return this;
        } // end andProductGlossaryIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID is not null AND PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID <> ''");

            return this;
        } // end andProductGlossaryIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID = '')");

            return this;
        } // end andProductGlossaryIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdEqualTo(long value) {
            return andProductGlossaryIdEqualTo(Long.valueOf(value));
        } // end andProductGlossaryIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID =",
                value, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductGlossaryIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotEqualTo(long value) {
            return andProductGlossaryIdNotEqualTo(Long.valueOf(value));
        } // end andProductGlossaryIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotEqualTo(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID <>",
                value, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotEqualToOrIsNull(long value) {
            return andProductGlossaryIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProductGlossaryIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID is null OR PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID <>",
                value, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductGlossaryIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdGreaterThan(long value) {
            return andProductGlossaryIdGreaterThan(Long.valueOf(value));
        } // end andProductGlossaryIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdGreaterThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID >",
                value, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductGlossaryIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdGreaterThanOrEqualTo(long value) {
            return andProductGlossaryIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProductGlossaryIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID >=",
                value, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductGlossaryIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdLessThan(long value) {
            return andProductGlossaryIdLessThan(Long.valueOf(value));
        } // end andProductGlossaryIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdLessThan(java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID <",
                value, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductGlossaryIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdLessThanOrEqualTo(long value) {
            return andProductGlossaryIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProductGlossaryIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID <=",
                value, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProductGlossaryIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdIn(long[] values) {
            if (values.length == 1) {
                return andProductGlossaryIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID in",
                    values, "productGlossaryId");

                return this;
            } // end else
        } // end andProductGlossaryIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProductGlossaryIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID not in",
                    values, "productGlossaryId");

                return this;
            } // end else
        } // end andProductGlossaryIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdIn(List values) {
            if (values.size() == 1) {
                return andProductGlossaryIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID in",
                    values, "productGlossaryId");

                return this;
            } // end else
        } // end andProductGlossaryIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotIn(List values) {
            if (values.size() == 1) {
                return andProductGlossaryIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID not in",
                    values, "productGlossaryId");

                return this;
            } // end else
        } // end andProductGlossaryIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdIn(Object[] values) {
            if (values.length == 1) {
                return andProductGlossaryIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID in",
                    Arrays.asList(values), "productGlossaryId");

                return this;
            } // end else
        } // end andProductGlossaryIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProductGlossaryIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID not in",
                    Arrays.asList(values), "productGlossaryId");

                return this;
            } // end else
        } // end andProductGlossaryIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID between",
                value1, value2, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID between",
                value1, value2, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotBetween(long value1, long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID not between",
                value1, value2, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProductGlossaryIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID not between",
                value1, value2, "productGlossaryId");

            return this;
        } // end andProductGlossaryIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS is not null AND PRODUCT_GLOSSARY_CHANG_LOG.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.REMARKS is null OR PRODUCT_GLOSSARY_CHANG_LOG.REMARKS = '')");

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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS =", value,
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
                    "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS <>", value,
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS is null OR PRODUCT_GLOSSARY_CHANG_LOG.REMARKS <>",
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
                    "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS >", value,
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
                    "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS >=", value,
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
                    "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS <", value,
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
                    "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS <=", value,
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
                    "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS like",
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS not like",
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS in", values,
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS not in",
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS in",
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS not in",
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS between", value1,
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "PRODUCT_GLOSSARY_CHANG_LOG.STATUS is not null AND PRODUCT_GLOSSARY_CHANG_LOG.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(PRODUCT_GLOSSARY_CHANG_LOG.STATUS is null OR PRODUCT_GLOSSARY_CHANG_LOG.STATUS = '')");

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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS =", value, "status");

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
                    "PRODUCT_GLOSSARY_CHANG_LOG.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS <>", value, "status");

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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS is null OR PRODUCT_GLOSSARY_CHANG_LOG.STATUS <>",
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
                    "PRODUCT_GLOSSARY_CHANG_LOG.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS >", value, "status");

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
                    "PRODUCT_GLOSSARY_CHANG_LOG.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS >=", value, "status");

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
                    "PRODUCT_GLOSSARY_CHANG_LOG.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS <", value, "status");

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
                    "PRODUCT_GLOSSARY_CHANG_LOG.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS <=", value, "status");

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
                    "PRODUCT_GLOSSARY_CHANG_LOG.STATUS");
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS like",
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS not like",
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS in", values,
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS not in",
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS in",
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
                addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS not in",
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS between", value1,
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
            addCriterion("PRODUCT_GLOSSARY_CHANG_LOG.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()
    } // end Criteria
} // end ProductGlossaryChangLogDAOQueryBean
