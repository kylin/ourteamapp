/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * DocumentInfo query bean 2011-09-22 10:16:23
 *
 * @author Auto Gen
 */
public class DocumentInfoDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new DocumentInfoDAOQueryBean object.
     */
    public DocumentInfoDAOQueryBean() {
        super();
    } // end DocumentInfoDAOQueryBean()

    /**
     * Creates a new DocumentInfoDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public DocumentInfoDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end DocumentInfoDAOQueryBean()

    /**
     * Creates a new DocumentInfoDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public DocumentInfoDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end DocumentInfoDAOQueryBean()

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
            addSelectProperty(IDocumentInfoDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentLanguageSelectProperty() {
        addDocumentLanguageSelectProperty("documentLanguage");
    } // end addDocumentLanguageSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentLanguageSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentLanguage, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentLanguage,
                "documentLanguage");
        } // end else
    } // end addDocumentLanguageSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentLastModifierSelectProperty() {
        addDocumentLastModifierSelectProperty("documentLastModifier");
    } // end addDocumentLastModifierSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentLastModifierSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentLastModifier, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentLastModifier,
                "documentLastModifier");
        } // end else
    } // end addDocumentLastModifierSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentLastModifyDateSelectProperty() {
        addDocumentLastModifyDateSelectProperty("documentLastModifyDate");
    } // end addDocumentLastModifyDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentLastModifyDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentLastModifyDate, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentLastModifyDate,
                "documentLastModifyDate");
        } // end else
    } // end addDocumentLastModifyDateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentNameSelectProperty() {
        addDocumentNameSelectProperty("documentName");
    } // end addDocumentNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentName, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentName, "documentName");
        } // end else
    } // end addDocumentNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentTypeSelectProperty() {
        addDocumentTypeSelectProperty("documentType");
    } // end addDocumentTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentType, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentType, "documentType");
        } // end else
    } // end addDocumentTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentVersionSelectProperty() {
        addDocumentVersionSelectProperty("documentVersion");
    } // end addDocumentVersionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentVersionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentVersion, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentVersion,
                "documentVersion");
        } // end else
    } // end addDocumentVersionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFolderIdSelectProperty() {
        addFolderIdSelectProperty("folderId");
    } // end addFolderIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFolderIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.FolderId, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.FolderId, "folderId");
        } // end else
    } // end addFolderIdSelectProperty()

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
            addSelectProperty(IDocumentInfoDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.Remarks, "remarks");
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
            addSelectProperty(IDocumentInfoDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentPathSelectProperty() {
        addDocumentPathSelectProperty("documentPath");
    } // end addDocumentPathSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentPathSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentPath, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentPath, "documentPath");
        } // end else
    } // end addDocumentPathSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentSizeSelectProperty() {
        addDocumentSizeSelectProperty("documentSize");
    } // end addDocumentSizeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentSizeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentSize, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentSize, "documentSize");
        } // end else
    } // end addDocumentSizeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDocumentLastModifierIdSelectProperty() {
        addDocumentLastModifierIdSelectProperty("documentLastModifierId");
    } // end addDocumentLastModifierIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDocumentLastModifierIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.DocumentLastModifierId, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.DocumentLastModifierId,
                "documentLastModifierId");
        } // end else
    } // end addDocumentLastModifierIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLockTokenSelectProperty() {
        addLockTokenSelectProperty("lockToken");
    } // end addLockTokenSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLockTokenSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentInfoDAO.LockToken, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentInfoDAO.LockToken, "lockToken");
        } // end else
    } // end addLockTokenSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDocumentLanguageSelectProperty();

        addDocumentLastModifierSelectProperty();

        addDocumentLastModifyDateSelectProperty();

        addDocumentNameSelectProperty();

        addDocumentTypeSelectProperty();

        addDocumentVersionSelectProperty();

        addFolderIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addDocumentPathSelectProperty();

        addDocumentSizeSelectProperty();

        addDocumentLastModifierIdSelectProperty();

        addLockTokenSelectProperty();
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
            addCriterion("DOCUMENT_INFO.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("DOCUMENT_INFO.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.ID is not null AND DOCUMENT_INFO.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(DOCUMENT_INFO.ID is null OR DOCUMENT_INFO.ID = '')");

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
            addCriterion("DOCUMENT_INFO.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.ID");
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
            addCriterion("DOCUMENT_INFO.ID <>", value, "id");

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
            addCriterion("DOCUMENT_INFO.ID is null OR DOCUMENT_INFO.ID <>",
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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.ID");
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
            addCriterion("DOCUMENT_INFO.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.ID");
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
            addCriterion("DOCUMENT_INFO.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.ID");
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
            addCriterion("DOCUMENT_INFO.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.ID");
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
            addCriterion("DOCUMENT_INFO.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.ID");
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
                addCriterion("DOCUMENT_INFO.ID in", values, "id");

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
                addCriterion("DOCUMENT_INFO.ID not in", values, "id");

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
                addCriterion("DOCUMENT_INFO.ID in", values, "id");

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
                addCriterion("DOCUMENT_INFO.ID not in", values, "id");

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
                addCriterion("DOCUMENT_INFO.ID in", Arrays.asList(values), "id");

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
                addCriterion("DOCUMENT_INFO.ID not in", Arrays.asList(values),
                    "id");

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
            addCriterion("DOCUMENT_INFO.ID between", value1, value2, "id");

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
            addCriterion("DOCUMENT_INFO.ID between", value1, value2, "id");

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
            addCriterion("DOCUMENT_INFO.ID not between", value1, value2, "id");

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
            addCriterion("DOCUMENT_INFO.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE is null");

            return this;
        } // end andDocumentLanguageIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE is not null");

            return this;
        } // end andDocumentLanguageIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_LANGUAGE is not null AND DOCUMENT_INFO.DOCUMENT_LANGUAGE <> ''");

            return this;
        } // end andDocumentLanguageIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_LANGUAGE is null OR DOCUMENT_INFO.DOCUMENT_LANGUAGE = '')");

            return this;
        } // end andDocumentLanguageIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE =", value,
                "documentLanguage");

            return this;
        } // end andDocumentLanguageEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LANGUAGE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLanguageEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageNotEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE <>", value,
                "documentLanguage");

            return this;
        } // end andDocumentLanguageNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE is null OR DOCUMENT_INFO.DOCUMENT_LANGUAGE <>",
                value, "documentLanguage");

            return this;
        } // end andDocumentLanguageNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LANGUAGE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLanguageNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageGreaterThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE >", value,
                "documentLanguage");

            return this;
        } // end andDocumentLanguageGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LANGUAGE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLanguageGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE >=", value,
                "documentLanguage");

            return this;
        } // end andDocumentLanguageGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LANGUAGE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLanguageGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageLessThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE <", value,
                "documentLanguage");

            return this;
        } // end andDocumentLanguageLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LANGUAGE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLanguageLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE <=", value,
                "documentLanguage");

            return this;
        } // end andDocumentLanguageLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LANGUAGE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLanguageLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE like",
                buffer.toString(), "documentLanguage");

            return this;
        } // end andDocumentLanguageLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE not like",
                buffer.toString(), "documentLanguage");

            return this;
        } // end andDocumentLanguageNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageIn(List values) {
            if (values.size() == 1) {
                return andDocumentLanguageEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE in", values,
                    "documentLanguage");

                return this;
            } // end else
        } // end andDocumentLanguageIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentLanguageNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE not in", values,
                    "documentLanguage");

                return this;
            } // end else
        } // end andDocumentLanguageNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLanguageEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE in",
                    Arrays.asList(values), "documentLanguage");

                return this;
            } // end else
        } // end andDocumentLanguageIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLanguageNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE not in",
                    Arrays.asList(values), "documentLanguage");

                return this;
            } // end else
        } // end andDocumentLanguageNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE between", value1,
                value2, "documentLanguage");

            return this;
        } // end andDocumentLanguageBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLanguageNotBetween(String value1,
            String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LANGUAGE not between", value1,
                value2, "documentLanguage");

            return this;
        } // end andDocumentLanguageNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER is null");

            return this;
        } // end andDocumentLastModifierIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER is not null");

            return this;
        } // end andDocumentLastModifierIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER is not null AND DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER <> ''");

            return this;
        } // end andDocumentLastModifierIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER is null OR DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER = '')");

            return this;
        } // end andDocumentLastModifierIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER =", value,
                "documentLastModifier");

            return this;
        } // end andDocumentLastModifierEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierNotEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER <>", value,
                "documentLastModifier");

            return this;
        } // end andDocumentLastModifierNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER is null OR DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER <>",
                value, "documentLastModifier");

            return this;
        } // end andDocumentLastModifierNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierGreaterThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER >", value,
                "documentLastModifier");

            return this;
        } // end andDocumentLastModifierGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierGreaterThanOrEqualTo(
            String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER >=", value,
                "documentLastModifier");

            return this;
        } // end andDocumentLastModifierGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierLessThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER <", value,
                "documentLastModifier");

            return this;
        } // end andDocumentLastModifierLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER <=", value,
                "documentLastModifier");

            return this;
        } // end andDocumentLastModifierLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER like",
                buffer.toString(), "documentLastModifier");

            return this;
        } // end andDocumentLastModifierLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER not like",
                buffer.toString(), "documentLastModifier");

            return this;
        } // end andDocumentLastModifierNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIn(List values) {
            if (values.size() == 1) {
                return andDocumentLastModifierEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER in", values,
                    "documentLastModifier");

                return this;
            } // end else
        } // end andDocumentLastModifierIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentLastModifierNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER not in",
                    values, "documentLastModifier");

                return this;
            } // end else
        } // end andDocumentLastModifierNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLastModifierEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER in",
                    Arrays.asList(values), "documentLastModifier");

                return this;
            } // end else
        } // end andDocumentLastModifierIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLastModifierNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER not in",
                    Arrays.asList(values), "documentLastModifier");

                return this;
            } // end else
        } // end andDocumentLastModifierNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierBetween(String value1,
            String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER between",
                value1, value2, "documentLastModifier");

            return this;
        } // end andDocumentLastModifierBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierNotBetween(String value1,
            String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER not between",
                value1, value2, "documentLastModifier");

            return this;
        } // end andDocumentLastModifierNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE is null");

            return this;
        } // end andDocumentLastModifyDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE is not null");

            return this;
        } // end andDocumentLastModifyDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE is not null AND DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE <> ''");

            return this;
        } // end andDocumentLastModifyDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE is null OR DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE = '')");

            return this;
        } // end andDocumentLastModifyDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE =",
                value, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifyDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateNotEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE <>",
                value, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateNotEqualToOrIsNull(
            java.util.Date value) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE is null OR DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE <>",
                value, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifyDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateGreaterThan(
            java.util.Date value) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE >",
                value, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifyDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE >=",
                value, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifyDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE <",
                value, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifyDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateLessThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE <=",
                value, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifyDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateIn(List values) {
            if (values.size() == 1) {
                return andDocumentLastModifyDateEqualTo((java.util.Date) values.get(
                        0));
            } // end if
            else {
                addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE in",
                    values, "documentLastModifyDate");

                return this;
            } // end else
        } // end andDocumentLastModifyDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentLastModifyDateNotEqualTo((java.util.Date) values.get(
                        0));
            } // end if
            else {
                addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE not in",
                    values, "documentLastModifyDate");

                return this;
            } // end else
        } // end andDocumentLastModifyDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLastModifyDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE in",
                    Arrays.asList(values), "documentLastModifyDate");

                return this;
            } // end else
        } // end andDocumentLastModifyDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLastModifyDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE not in",
                    Arrays.asList(values), "documentLastModifyDate");

                return this;
            } // end else
        } // end andDocumentLastModifyDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateBetween(
            java.util.Date value1, java.util.Date value2) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE between",
                value1, value2, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifyDateNotBetween(
            java.util.Date value1, java.util.Date value2) {
            addCriterionForJDBCDate("DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE not between",
                value1, value2, "documentLastModifyDate");

            return this;
        } // end andDocumentLastModifyDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME is null");

            return this;
        } // end andDocumentNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME is not null");

            return this;
        } // end andDocumentNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_NAME is not null AND DOCUMENT_INFO.DOCUMENT_NAME <> ''");

            return this;
        } // end andDocumentNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_NAME is null OR DOCUMENT_INFO.DOCUMENT_NAME = '')");

            return this;
        } // end andDocumentNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME =", value, "documentName");

            return this;
        } // end andDocumentNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameNotEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME <>", value, "documentName");

            return this;
        } // end andDocumentNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME is null OR DOCUMENT_INFO.DOCUMENT_NAME <>",
                value, "documentName");

            return this;
        } // end andDocumentNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameGreaterThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME >", value, "documentName");

            return this;
        } // end andDocumentNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME >=", value, "documentName");

            return this;
        } // end andDocumentNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameLessThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME <", value, "documentName");

            return this;
        } // end andDocumentNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME <=", value, "documentName");

            return this;
        } // end andDocumentNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME like", buffer.toString(),
                "documentName");

            return this;
        } // end andDocumentNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME not like",
                buffer.toString(), "documentName");

            return this;
        } // end andDocumentNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameIn(List values) {
            if (values.size() == 1) {
                return andDocumentNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_NAME in", values,
                    "documentName");

                return this;
            } // end else
        } // end andDocumentNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_NAME not in", values,
                    "documentName");

                return this;
            } // end else
        } // end andDocumentNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_NAME in",
                    Arrays.asList(values), "documentName");

                return this;
            } // end else
        } // end andDocumentNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_NAME not in",
                    Arrays.asList(values), "documentName");

                return this;
            } // end else
        } // end andDocumentNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME between", value1, value2,
                "documentName");

            return this;
        } // end andDocumentNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentNameNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_NAME not between", value1,
                value2, "documentName");

            return this;
        } // end andDocumentNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE is null");

            return this;
        } // end andDocumentTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE is not null");

            return this;
        } // end andDocumentTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_TYPE is not null AND DOCUMENT_INFO.DOCUMENT_TYPE <> ''");

            return this;
        } // end andDocumentTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_TYPE is null OR DOCUMENT_INFO.DOCUMENT_TYPE = '')");

            return this;
        } // end andDocumentTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE =", value, "documentType");

            return this;
        } // end andDocumentTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeNotEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE <>", value, "documentType");

            return this;
        } // end andDocumentTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE is null OR DOCUMENT_INFO.DOCUMENT_TYPE <>",
                value, "documentType");

            return this;
        } // end andDocumentTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeGreaterThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE >", value, "documentType");

            return this;
        } // end andDocumentTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE >=", value, "documentType");

            return this;
        } // end andDocumentTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeLessThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE <", value, "documentType");

            return this;
        } // end andDocumentTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE <=", value, "documentType");

            return this;
        } // end andDocumentTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE like", buffer.toString(),
                "documentType");

            return this;
        } // end andDocumentTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE not like",
                buffer.toString(), "documentType");

            return this;
        } // end andDocumentTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeIn(List values) {
            if (values.size() == 1) {
                return andDocumentTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE in", values,
                    "documentType");

                return this;
            } // end else
        } // end andDocumentTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE not in", values,
                    "documentType");

                return this;
            } // end else
        } // end andDocumentTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE in",
                    Arrays.asList(values), "documentType");

                return this;
            } // end else
        } // end andDocumentTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE not in",
                    Arrays.asList(values), "documentType");

                return this;
            } // end else
        } // end andDocumentTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE between", value1, value2,
                "documentType");

            return this;
        } // end andDocumentTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentTypeNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_TYPE not between", value1,
                value2, "documentType");

            return this;
        } // end andDocumentTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION is null");

            return this;
        } // end andDocumentVersionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION is not null");

            return this;
        } // end andDocumentVersionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_VERSION is not null AND DOCUMENT_INFO.DOCUMENT_VERSION <> ''");

            return this;
        } // end andDocumentVersionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_VERSION is null OR DOCUMENT_INFO.DOCUMENT_VERSION = '')");

            return this;
        } // end andDocumentVersionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION =", value,
                "documentVersion");

            return this;
        } // end andDocumentVersionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_VERSION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentVersionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionNotEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION <>", value,
                "documentVersion");

            return this;
        } // end andDocumentVersionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION is null OR DOCUMENT_INFO.DOCUMENT_VERSION <>",
                value, "documentVersion");

            return this;
        } // end andDocumentVersionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_VERSION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentVersionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionGreaterThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION >", value,
                "documentVersion");

            return this;
        } // end andDocumentVersionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_VERSION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentVersionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION >=", value,
                "documentVersion");

            return this;
        } // end andDocumentVersionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_VERSION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentVersionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionLessThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION <", value,
                "documentVersion");

            return this;
        } // end andDocumentVersionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_VERSION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentVersionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION <=", value,
                "documentVersion");

            return this;
        } // end andDocumentVersionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_VERSION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentVersionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION like",
                buffer.toString(), "documentVersion");

            return this;
        } // end andDocumentVersionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION not like",
                buffer.toString(), "documentVersion");

            return this;
        } // end andDocumentVersionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionIn(List values) {
            if (values.size() == 1) {
                return andDocumentVersionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION in", values,
                    "documentVersion");

                return this;
            } // end else
        } // end andDocumentVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentVersionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION not in", values,
                    "documentVersion");

                return this;
            } // end else
        } // end andDocumentVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentVersionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION in",
                    Arrays.asList(values), "documentVersion");

                return this;
            } // end else
        } // end andDocumentVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentVersionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION not in",
                    Arrays.asList(values), "documentVersion");

                return this;
            } // end else
        } // end andDocumentVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION between", value1,
                value2, "documentVersion");

            return this;
        } // end andDocumentVersionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentVersionNotBetween(String value1,
            String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_VERSION not between", value1,
                value2, "documentVersion");

            return this;
        } // end andDocumentVersionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdIsNull() {
            addCriterion("DOCUMENT_INFO.FOLDER_ID is null");

            return this;
        } // end andFolderIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdIsNotNull() {
            addCriterion("DOCUMENT_INFO.FOLDER_ID is not null");

            return this;
        } // end andFolderIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.FOLDER_ID is not null AND DOCUMENT_INFO.FOLDER_ID <> ''");

            return this;
        } // end andFolderIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.FOLDER_ID is null OR DOCUMENT_INFO.FOLDER_ID = '')");

            return this;
        } // end andFolderIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdEqualTo(long value) {
            return andFolderIdEqualTo(Long.valueOf(value));
        } // end andFolderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID =", value, "folderId");

            return this;
        } // end andFolderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.FOLDER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotEqualTo(long value) {
            return andFolderIdNotEqualTo(Long.valueOf(value));
        } // end andFolderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID <>", value, "folderId");

            return this;
        } // end andFolderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotEqualToOrIsNull(long value) {
            return andFolderIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andFolderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID is null OR DOCUMENT_INFO.FOLDER_ID <>",
                value, "folderId");

            return this;
        } // end andFolderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.FOLDER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdGreaterThan(long value) {
            return andFolderIdGreaterThan(Long.valueOf(value));
        } // end andFolderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdGreaterThan(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID >", value, "folderId");

            return this;
        } // end andFolderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.FOLDER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdGreaterThanOrEqualTo(long value) {
            return andFolderIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andFolderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID >=", value, "folderId");

            return this;
        } // end andFolderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.FOLDER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdLessThan(long value) {
            return andFolderIdLessThan(Long.valueOf(value));
        } // end andFolderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdLessThan(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID <", value, "folderId");

            return this;
        } // end andFolderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.FOLDER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdLessThanOrEqualTo(long value) {
            return andFolderIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andFolderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID <=", value, "folderId");

            return this;
        } // end andFolderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.FOLDER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdIn(long[] values) {
            if (values.length == 1) {
                return andFolderIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.FOLDER_ID in", values, "folderId");

                return this;
            } // end else
        } // end andFolderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotIn(long[] values) {
            if (values.length == 1) {
                return andFolderIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.FOLDER_ID not in", values,
                    "folderId");

                return this;
            } // end else
        } // end andFolderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdIn(List values) {
            if (values.size() == 1) {
                return andFolderIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.FOLDER_ID in", values, "folderId");

                return this;
            } // end else
        } // end andFolderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotIn(List values) {
            if (values.size() == 1) {
                return andFolderIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.FOLDER_ID not in", values,
                    "folderId");

                return this;
            } // end else
        } // end andFolderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdIn(Object[] values) {
            if (values.length == 1) {
                return andFolderIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.FOLDER_ID in",
                    Arrays.asList(values), "folderId");

                return this;
            } // end else
        } // end andFolderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andFolderIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.FOLDER_ID not in",
                    Arrays.asList(values), "folderId");

                return this;
            } // end else
        } // end andFolderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdBetween(long value1, long value2) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID between", value1, value2,
                "folderId");

            return this;
        } // end andFolderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID between", value1, value2,
                "folderId");

            return this;
        } // end andFolderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotBetween(long value1, long value2) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID not between", value1, value2,
                "folderId");

            return this;
        } // end andFolderIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("DOCUMENT_INFO.FOLDER_ID not between", value1, value2,
                "folderId");

            return this;
        } // end andFolderIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("DOCUMENT_INFO.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("DOCUMENT_INFO.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.REMARKS is not null AND DOCUMENT_INFO.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.REMARKS is null OR DOCUMENT_INFO.REMARKS = '')");

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
            addCriterion("DOCUMENT_INFO.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.REMARKS");
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
            addCriterion("DOCUMENT_INFO.REMARKS <>", value, "remarks");

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
            addCriterion("DOCUMENT_INFO.REMARKS is null OR DOCUMENT_INFO.REMARKS <>",
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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.REMARKS");
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
            addCriterion("DOCUMENT_INFO.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.REMARKS");
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
            addCriterion("DOCUMENT_INFO.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.REMARKS");
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
            addCriterion("DOCUMENT_INFO.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.REMARKS");
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
            addCriterion("DOCUMENT_INFO.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.REMARKS");
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
            addCriterion("DOCUMENT_INFO.REMARKS like", buffer.toString(),
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
            addCriterion("DOCUMENT_INFO.REMARKS not like", buffer.toString(),
                "remarks");

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
                addCriterion("DOCUMENT_INFO.REMARKS in", values, "remarks");

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
                addCriterion("DOCUMENT_INFO.REMARKS not in", values, "remarks");

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
                addCriterion("DOCUMENT_INFO.REMARKS in", Arrays.asList(values),
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
        public Criteria andRemarksNotIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.REMARKS not in",
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
            addCriterion("DOCUMENT_INFO.REMARKS between", value1, value2,
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
            addCriterion("DOCUMENT_INFO.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("DOCUMENT_INFO.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("DOCUMENT_INFO.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.STATUS is not null AND DOCUMENT_INFO.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.STATUS is null OR DOCUMENT_INFO.STATUS = '')");

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
            addCriterion("DOCUMENT_INFO.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.STATUS");
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
            addCriterion("DOCUMENT_INFO.STATUS <>", value, "status");

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
            addCriterion("DOCUMENT_INFO.STATUS is null OR DOCUMENT_INFO.STATUS <>",
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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.STATUS");
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
            addCriterion("DOCUMENT_INFO.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.STATUS");
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
            addCriterion("DOCUMENT_INFO.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.STATUS");
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
            addCriterion("DOCUMENT_INFO.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.STATUS");
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
            addCriterion("DOCUMENT_INFO.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.STATUS");
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
            addCriterion("DOCUMENT_INFO.STATUS like", buffer.toString(),
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
            addCriterion("DOCUMENT_INFO.STATUS not like", buffer.toString(),
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
                addCriterion("DOCUMENT_INFO.STATUS in", values, "status");

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
                addCriterion("DOCUMENT_INFO.STATUS not in", values, "status");

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
                addCriterion("DOCUMENT_INFO.STATUS in", Arrays.asList(values),
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
        public Criteria andStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.STATUS not in",
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
            addCriterion("DOCUMENT_INFO.STATUS between", value1, value2,
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
            addCriterion("DOCUMENT_INFO.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH is null");

            return this;
        } // end andDocumentPathIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH is not null");

            return this;
        } // end andDocumentPathIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_PATH is not null AND DOCUMENT_INFO.DOCUMENT_PATH <> ''");

            return this;
        } // end andDocumentPathIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_PATH is null OR DOCUMENT_INFO.DOCUMENT_PATH = '')");

            return this;
        } // end andDocumentPathIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH =", value, "documentPath");

            return this;
        } // end andDocumentPathEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_PATH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentPathEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathNotEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH <>", value, "documentPath");

            return this;
        } // end andDocumentPathNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH is null OR DOCUMENT_INFO.DOCUMENT_PATH <>",
                value, "documentPath");

            return this;
        } // end andDocumentPathNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_PATH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentPathNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathGreaterThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH >", value, "documentPath");

            return this;
        } // end andDocumentPathGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_PATH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentPathGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH >=", value, "documentPath");

            return this;
        } // end andDocumentPathGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_PATH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentPathGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathLessThan(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH <", value, "documentPath");

            return this;
        } // end andDocumentPathLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_PATH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentPathLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH <=", value, "documentPath");

            return this;
        } // end andDocumentPathLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_PATH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentPathLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH like", buffer.toString(),
                "documentPath");

            return this;
        } // end andDocumentPathLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH not like",
                buffer.toString(), "documentPath");

            return this;
        } // end andDocumentPathNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathIn(List values) {
            if (values.size() == 1) {
                return andDocumentPathEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_PATH in", values,
                    "documentPath");

                return this;
            } // end else
        } // end andDocumentPathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentPathNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_PATH not in", values,
                    "documentPath");

                return this;
            } // end else
        } // end andDocumentPathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentPathEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_PATH in",
                    Arrays.asList(values), "documentPath");

                return this;
            } // end else
        } // end andDocumentPathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentPathNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_PATH not in",
                    Arrays.asList(values), "documentPath");

                return this;
            } // end else
        } // end andDocumentPathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH between", value1, value2,
                "documentPath");

            return this;
        } // end andDocumentPathBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentPathNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_PATH not between", value1,
                value2, "documentPath");

            return this;
        } // end andDocumentPathNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE is null");

            return this;
        } // end andDocumentSizeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE is not null");

            return this;
        } // end andDocumentSizeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_SIZE is not null AND DOCUMENT_INFO.DOCUMENT_SIZE <> ''");

            return this;
        } // end andDocumentSizeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_SIZE is null OR DOCUMENT_INFO.DOCUMENT_SIZE = '')");

            return this;
        } // end andDocumentSizeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeEqualTo(long value) {
            return andDocumentSizeEqualTo(Long.valueOf(value));
        } // end andDocumentSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE =", value, "documentSize");

            return this;
        } // end andDocumentSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_SIZE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentSizeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotEqualTo(long value) {
            return andDocumentSizeNotEqualTo(Long.valueOf(value));
        } // end andDocumentSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE <>", value, "documentSize");

            return this;
        } // end andDocumentSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotEqualToOrIsNull(long value) {
            return andDocumentSizeNotEqualToOrIsNull(Long.valueOf(value));
        } // end andDocumentSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE is null OR DOCUMENT_INFO.DOCUMENT_SIZE <>",
                value, "documentSize");

            return this;
        } // end andDocumentSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_SIZE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentSizeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeGreaterThan(long value) {
            return andDocumentSizeGreaterThan(Long.valueOf(value));
        } // end andDocumentSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeGreaterThan(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE >", value, "documentSize");

            return this;
        } // end andDocumentSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_SIZE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentSizeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeGreaterThanOrEqualTo(long value) {
            return andDocumentSizeGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andDocumentSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE >=", value, "documentSize");

            return this;
        } // end andDocumentSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_SIZE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentSizeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeLessThan(long value) {
            return andDocumentSizeLessThan(Long.valueOf(value));
        } // end andDocumentSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeLessThan(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE <", value, "documentSize");

            return this;
        } // end andDocumentSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_SIZE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentSizeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeLessThanOrEqualTo(long value) {
            return andDocumentSizeLessThanOrEqualTo(Long.valueOf(value));
        } // end andDocumentSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE <=", value, "documentSize");

            return this;
        } // end andDocumentSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.DOCUMENT_SIZE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentSizeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeIn(long[] values) {
            if (values.length == 1) {
                return andDocumentSizeEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE in", values,
                    "documentSize");

                return this;
            } // end else
        } // end andDocumentSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotIn(long[] values) {
            if (values.length == 1) {
                return andDocumentSizeNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE not in", values,
                    "documentSize");

                return this;
            } // end else
        } // end andDocumentSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeIn(List values) {
            if (values.size() == 1) {
                return andDocumentSizeEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE in", values,
                    "documentSize");

                return this;
            } // end else
        } // end andDocumentSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentSizeNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE not in", values,
                    "documentSize");

                return this;
            } // end else
        } // end andDocumentSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentSizeEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE in",
                    Arrays.asList(values), "documentSize");

                return this;
            } // end else
        } // end andDocumentSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentSizeNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE not in",
                    Arrays.asList(values), "documentSize");

                return this;
            } // end else
        } // end andDocumentSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeBetween(long value1, long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE between", value1, value2,
                "documentSize");

            return this;
        } // end andDocumentSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE between", value1, value2,
                "documentSize");

            return this;
        } // end andDocumentSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotBetween(long value1, long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE not between", value1,
                value2, "documentSize");

            return this;
        } // end andDocumentSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentSizeNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_SIZE not between", value1,
                value2, "documentSize");

            return this;
        } // end andDocumentSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdIsNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID is null");

            return this;
        } // end andDocumentLastModifierIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdIsNotNull() {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID is not null");

            return this;
        } // end andDocumentLastModifierIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID is not null AND DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID <> ''");

            return this;
        } // end andDocumentLastModifierIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID is null OR DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID = '')");

            return this;
        } // end andDocumentLastModifierIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdEqualTo(long value) {
            return andDocumentLastModifierIdEqualTo(Long.valueOf(value));
        } // end andDocumentLastModifierIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID =", value,
                "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotEqualTo(long value) {
            return andDocumentLastModifierIdNotEqualTo(Long.valueOf(value));
        } // end andDocumentLastModifierIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotEqualTo(
            java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID <>", value,
                "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotEqualToOrIsNull(long value) {
            return andDocumentLastModifierIdNotEqualToOrIsNull(Long.valueOf(
                    value));
        } // end andDocumentLastModifierIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID is null OR DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID <>",
                value, "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdGreaterThan(long value) {
            return andDocumentLastModifierIdGreaterThan(Long.valueOf(value));
        } // end andDocumentLastModifierIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdGreaterThan(
            java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID >", value,
                "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdGreaterThanOrEqualTo(
            long value) {
            return andDocumentLastModifierIdGreaterThanOrEqualTo(Long.valueOf(
                    value));
        } // end andDocumentLastModifierIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID >=", value,
                "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdLessThan(long value) {
            return andDocumentLastModifierIdLessThan(Long.valueOf(value));
        } // end andDocumentLastModifierIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdLessThan(java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID <", value,
                "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdLessThanOrEqualTo(long value) {
            return andDocumentLastModifierIdLessThanOrEqualTo(Long.valueOf(
                    value));
        } // end andDocumentLastModifierIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID <=", value,
                "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDocumentLastModifierIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdIn(long[] values) {
            if (values.length == 1) {
                return andDocumentLastModifierIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID in",
                    values, "documentLastModifierId");

                return this;
            } // end else
        } // end andDocumentLastModifierIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotIn(long[] values) {
            if (values.length == 1) {
                return andDocumentLastModifierIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID not in",
                    values, "documentLastModifierId");

                return this;
            } // end else
        } // end andDocumentLastModifierIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdIn(List values) {
            if (values.size() == 1) {
                return andDocumentLastModifierIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID in",
                    values, "documentLastModifierId");

                return this;
            } // end else
        } // end andDocumentLastModifierIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotIn(List values) {
            if (values.size() == 1) {
                return andDocumentLastModifierIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID not in",
                    values, "documentLastModifierId");

                return this;
            } // end else
        } // end andDocumentLastModifierIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLastModifierIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID in",
                    Arrays.asList(values), "documentLastModifierId");

                return this;
            } // end else
        } // end andDocumentLastModifierIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andDocumentLastModifierIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID not in",
                    Arrays.asList(values), "documentLastModifierId");

                return this;
            } // end else
        } // end andDocumentLastModifierIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdBetween(long value1,
            long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID between",
                value1, value2, "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID between",
                value1, value2, "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotBetween(long value1,
            long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID not between",
                value1, value2, "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDocumentLastModifierIdNotBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID not between",
                value1, value2, "documentLastModifierId");

            return this;
        } // end andDocumentLastModifierIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsNull() {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN is null");

            return this;
        } // end andLockTokenIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsNotNull() {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN is not null");

            return this;
        } // end andLockTokenIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsNotEmpty() {
            addCriterion(
                "DOCUMENT_INFO.LOCK_TOKEN is not null AND DOCUMENT_INFO.LOCK_TOKEN <> ''");

            return this;
        } // end andLockTokenIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsEmpty() {
            addCriterion(
                "(DOCUMENT_INFO.LOCK_TOKEN is null OR DOCUMENT_INFO.LOCK_TOKEN = '')");

            return this;
        } // end andLockTokenIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN =", value, "lockToken");

            return this;
        } // end andLockTokenEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.LOCK_TOKEN");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLockTokenEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenNotEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN <>", value, "lockToken");

            return this;
        } // end andLockTokenNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN is null OR DOCUMENT_INFO.LOCK_TOKEN <>",
                value, "lockToken");

            return this;
        } // end andLockTokenNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.LOCK_TOKEN");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLockTokenNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenGreaterThan(String value) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN >", value, "lockToken");

            return this;
        } // end andLockTokenGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.LOCK_TOKEN");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLockTokenGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN >=", value, "lockToken");

            return this;
        } // end andLockTokenGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.LOCK_TOKEN");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLockTokenGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenLessThan(String value) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN <", value, "lockToken");

            return this;
        } // end andLockTokenLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.LOCK_TOKEN");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLockTokenLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN <=", value, "lockToken");

            return this;
        } // end andLockTokenLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_INFO.LOCK_TOKEN");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLockTokenLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN like", buffer.toString(),
                "lockToken");

            return this;
        } // end andLockTokenLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN not like",
                buffer.toString(), "lockToken");

            return this;
        } // end andLockTokenNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIn(List values) {
            if (values.size() == 1) {
                return andLockTokenEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.LOCK_TOKEN in", values, "lockToken");

                return this;
            } // end else
        } // end andLockTokenIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenNotIn(List values) {
            if (values.size() == 1) {
                return andLockTokenNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.LOCK_TOKEN not in", values,
                    "lockToken");

                return this;
            } // end else
        } // end andLockTokenNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIn(Object[] values) {
            if (values.length == 1) {
                return andLockTokenEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.LOCK_TOKEN in",
                    Arrays.asList(values), "lockToken");

                return this;
            } // end else
        } // end andLockTokenIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenNotIn(Object[] values) {
            if (values.length == 1) {
                return andLockTokenNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_INFO.LOCK_TOKEN not in",
                    Arrays.asList(values), "lockToken");

                return this;
            } // end else
        } // end andLockTokenNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN between", value1, value2,
                "lockToken");

            return this;
        } // end andLockTokenBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_INFO.LOCK_TOKEN not between", value1,
                value2, "lockToken");

            return this;
        } // end andLockTokenNotBetween()
    } // end Criteria
} // end DocumentInfoDAOQueryBean
