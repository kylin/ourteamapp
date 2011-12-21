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
 * DocumentFolder query bean 2011-09-22 10:16:22
 *
 * @author Auto Gen
 */
public class DocumentFolderDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new DocumentFolderDAOQueryBean object.
     */
    public DocumentFolderDAOQueryBean() {
        super();
    } // end DocumentFolderDAOQueryBean()

    /**
     * Creates a new DocumentFolderDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public DocumentFolderDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end DocumentFolderDAOQueryBean()

    /**
     * Creates a new DocumentFolderDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public DocumentFolderDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end DocumentFolderDAOQueryBean()

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
            addSelectProperty(IDocumentFolderDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFolderNameSelectProperty() {
        addFolderNameSelectProperty("folderName");
    } // end addFolderNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFolderNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentFolderDAO.FolderName, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.FolderName, "folderName");
        } // end else
    } // end addFolderNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentFolderIdSelectProperty() {
        addParentFolderIdSelectProperty("parentFolderId");
    } // end addParentFolderIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentFolderIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentFolderDAO.ParentFolderId, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.ParentFolderId,
                "parentFolderId");
        } // end else
    } // end addParentFolderIdSelectProperty()

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
            addSelectProperty(IDocumentFolderDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSortIndexSelectProperty() {
        addSortIndexSelectProperty("sortIndex");
    } // end addSortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSortIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentFolderDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.SortIndex, "sortIndex");
        } // end else
    } // end addSortIndexSelectProperty()

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
            addSelectProperty(IDocumentFolderDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFolderPathSelectProperty() {
        addFolderPathSelectProperty("folderPath");
    } // end addFolderPathSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFolderPathSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IDocumentFolderDAO.FolderPath, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.FolderPath, "folderPath");
        } // end else
    } // end addFolderPathSelectProperty()

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
            addSelectProperty(IDocumentFolderDAO.LockToken, aAlias);
        } // end if
        else {
            addSelectProperty(IDocumentFolderDAO.LockToken, "lockToken");
        } // end else
    } // end addLockTokenSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addFolderNameSelectProperty();

        addParentFolderIdSelectProperty();

        addRemarksSelectProperty();

        addSortIndexSelectProperty();

        addStatusSelectProperty();

        addFolderPathSelectProperty();

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
            addCriterion("DOCUMENT_FOLDER.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.ID is not null AND DOCUMENT_FOLDER.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.ID is null OR DOCUMENT_FOLDER.ID = '')");

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
            addCriterion("DOCUMENT_FOLDER.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.ID");
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
            addCriterion("DOCUMENT_FOLDER.ID <>", value, "id");

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
            addCriterion("DOCUMENT_FOLDER.ID is null OR DOCUMENT_FOLDER.ID <>",
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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.ID");
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
            addCriterion("DOCUMENT_FOLDER.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.ID");
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
            addCriterion("DOCUMENT_FOLDER.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.ID");
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
            addCriterion("DOCUMENT_FOLDER.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.ID");
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
            addCriterion("DOCUMENT_FOLDER.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.ID");
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
                addCriterion("DOCUMENT_FOLDER.ID in", values, "id");

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
                addCriterion("DOCUMENT_FOLDER.ID not in", values, "id");

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
                addCriterion("DOCUMENT_FOLDER.ID in", values, "id");

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
                addCriterion("DOCUMENT_FOLDER.ID not in", values, "id");

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
                addCriterion("DOCUMENT_FOLDER.ID in", Arrays.asList(values),
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
                addCriterion("DOCUMENT_FOLDER.ID not in",
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
            addCriterion("DOCUMENT_FOLDER.ID between", value1, value2, "id");

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
            addCriterion("DOCUMENT_FOLDER.ID between", value1, value2, "id");

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
            addCriterion("DOCUMENT_FOLDER.ID not between", value1, value2, "id");

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
            addCriterion("DOCUMENT_FOLDER.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameIsNull() {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME is null");

            return this;
        } // end andFolderNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME is not null");

            return this;
        } // end andFolderNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.FOLDER_NAME is not null AND DOCUMENT_FOLDER.FOLDER_NAME <> ''");

            return this;
        } // end andFolderNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.FOLDER_NAME is null OR DOCUMENT_FOLDER.FOLDER_NAME = '')");

            return this;
        } // end andFolderNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME =", value, "folderName");

            return this;
        } // end andFolderNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameNotEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME <>", value, "folderName");

            return this;
        } // end andFolderNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME is null OR DOCUMENT_FOLDER.FOLDER_NAME <>",
                value, "folderName");

            return this;
        } // end andFolderNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameGreaterThan(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME >", value, "folderName");

            return this;
        } // end andFolderNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME >=", value, "folderName");

            return this;
        } // end andFolderNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameLessThan(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME <", value, "folderName");

            return this;
        } // end andFolderNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME <=", value, "folderName");

            return this;
        } // end andFolderNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME like", buffer.toString(),
                "folderName");

            return this;
        } // end andFolderNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME not like",
                buffer.toString(), "folderName");

            return this;
        } // end andFolderNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameIn(List values) {
            if (values.size() == 1) {
                return andFolderNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_NAME in", values,
                    "folderName");

                return this;
            } // end else
        } // end andFolderNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameNotIn(List values) {
            if (values.size() == 1) {
                return andFolderNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_NAME not in", values,
                    "folderName");

                return this;
            } // end else
        } // end andFolderNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameIn(Object[] values) {
            if (values.length == 1) {
                return andFolderNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_NAME in",
                    Arrays.asList(values), "folderName");

                return this;
            } // end else
        } // end andFolderNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andFolderNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_NAME not in",
                    Arrays.asList(values), "folderName");

                return this;
            } // end else
        } // end andFolderNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameBetween(String value1, String value2) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME between", value1, value2,
                "folderName");

            return this;
        } // end andFolderNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderNameNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_NAME not between", value1,
                value2, "folderName");

            return this;
        } // end andFolderNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdIsNull() {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID is null");

            return this;
        } // end andParentFolderIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID is not null");

            return this;
        } // end andParentFolderIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.PARENT_FOLDER_ID is not null AND DOCUMENT_FOLDER.PARENT_FOLDER_ID <> ''");

            return this;
        } // end andParentFolderIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.PARENT_FOLDER_ID is null OR DOCUMENT_FOLDER.PARENT_FOLDER_ID = '')");

            return this;
        } // end andParentFolderIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdEqualTo(long value) {
            return andParentFolderIdEqualTo(Long.valueOf(value));
        } // end andParentFolderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID =", value,
                "parentFolderId");

            return this;
        } // end andParentFolderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_FOLDER.PARENT_FOLDER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFolderIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotEqualTo(long value) {
            return andParentFolderIdNotEqualTo(Long.valueOf(value));
        } // end andParentFolderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID <>", value,
                "parentFolderId");

            return this;
        } // end andParentFolderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotEqualToOrIsNull(long value) {
            return andParentFolderIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andParentFolderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID is null OR DOCUMENT_FOLDER.PARENT_FOLDER_ID <>",
                value, "parentFolderId");

            return this;
        } // end andParentFolderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_FOLDER.PARENT_FOLDER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFolderIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdGreaterThan(long value) {
            return andParentFolderIdGreaterThan(Long.valueOf(value));
        } // end andParentFolderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdGreaterThan(java.lang.Long value) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID >", value,
                "parentFolderId");

            return this;
        } // end andParentFolderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_FOLDER.PARENT_FOLDER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFolderIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdGreaterThanOrEqualTo(long value) {
            return andParentFolderIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andParentFolderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID >=", value,
                "parentFolderId");

            return this;
        } // end andParentFolderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_FOLDER.PARENT_FOLDER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFolderIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdLessThan(long value) {
            return andParentFolderIdLessThan(Long.valueOf(value));
        } // end andParentFolderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdLessThan(java.lang.Long value) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID <", value,
                "parentFolderId");

            return this;
        } // end andParentFolderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_FOLDER.PARENT_FOLDER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFolderIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdLessThanOrEqualTo(long value) {
            return andParentFolderIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andParentFolderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID <=", value,
                "parentFolderId");

            return this;
        } // end andParentFolderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "DOCUMENT_FOLDER.PARENT_FOLDER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentFolderIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdIn(long[] values) {
            if (values.length == 1) {
                return andParentFolderIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID in", values,
                    "parentFolderId");

                return this;
            } // end else
        } // end andParentFolderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotIn(long[] values) {
            if (values.length == 1) {
                return andParentFolderIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID not in", values,
                    "parentFolderId");

                return this;
            } // end else
        } // end andParentFolderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdIn(List values) {
            if (values.size() == 1) {
                return andParentFolderIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID in", values,
                    "parentFolderId");

                return this;
            } // end else
        } // end andParentFolderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentFolderIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID not in", values,
                    "parentFolderId");

                return this;
            } // end else
        } // end andParentFolderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentFolderIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID in",
                    Arrays.asList(values), "parentFolderId");

                return this;
            } // end else
        } // end andParentFolderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentFolderIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID not in",
                    Arrays.asList(values), "parentFolderId");

                return this;
            } // end else
        } // end andParentFolderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdBetween(long value1, long value2) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID between", value1,
                value2, "parentFolderId");

            return this;
        } // end andParentFolderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID between", value1,
                value2, "parentFolderId");

            return this;
        } // end andParentFolderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotBetween(long value1, long value2) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID not between",
                value1, value2, "parentFolderId");

            return this;
        } // end andParentFolderIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentFolderIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("DOCUMENT_FOLDER.PARENT_FOLDER_ID not between",
                value1, value2, "parentFolderId");

            return this;
        } // end andParentFolderIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("DOCUMENT_FOLDER.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.REMARKS is not null AND DOCUMENT_FOLDER.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.REMARKS is null OR DOCUMENT_FOLDER.REMARKS = '')");

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
            addCriterion("DOCUMENT_FOLDER.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.REMARKS");
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
            addCriterion("DOCUMENT_FOLDER.REMARKS <>", value, "remarks");

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
            addCriterion("DOCUMENT_FOLDER.REMARKS is null OR DOCUMENT_FOLDER.REMARKS <>",
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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.REMARKS");
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
            addCriterion("DOCUMENT_FOLDER.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.REMARKS");
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
            addCriterion("DOCUMENT_FOLDER.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.REMARKS");
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
            addCriterion("DOCUMENT_FOLDER.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.REMARKS");
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
            addCriterion("DOCUMENT_FOLDER.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.REMARKS");
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
            addCriterion("DOCUMENT_FOLDER.REMARKS like", buffer.toString(),
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
            addCriterion("DOCUMENT_FOLDER.REMARKS not like", buffer.toString(),
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
                addCriterion("DOCUMENT_FOLDER.REMARKS in", values, "remarks");

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
                addCriterion("DOCUMENT_FOLDER.REMARKS not in", values, "remarks");

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
                addCriterion("DOCUMENT_FOLDER.REMARKS in",
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
                addCriterion("DOCUMENT_FOLDER.REMARKS not in",
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
            addCriterion("DOCUMENT_FOLDER.REMARKS between", value1, value2,
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
            addCriterion("DOCUMENT_FOLDER.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.SORT_INDEX is not null AND DOCUMENT_FOLDER.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.SORT_INDEX is null OR DOCUMENT_FOLDER.SORT_INDEX = '')");

            return this;
        } // end andSortIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(Integer value) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX =", value, "sortIndex");

            return this;
        } // end andSortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.SORT_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualTo(Integer value) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX <>", value, "sortIndex");

            return this;
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(Integer value) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX is null OR DOCUMENT_FOLDER.SORT_INDEX <>",
                value, "sortIndex");

            return this;
        } // end andSortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.SORT_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThan(Integer value) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX >", value, "sortIndex");

            return this;
        } // end andSortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.SORT_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX >=", value, "sortIndex");

            return this;
        } // end andSortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.SORT_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThan(Integer value) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX <", value, "sortIndex");

            return this;
        } // end andSortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.SORT_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX <=", value, "sortIndex");

            return this;
        } // end andSortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.SORT_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(List values) {
            if (values.size() == 1) {
                return andSortIndexEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.SORT_INDEX in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(List values) {
            if (values.size() == 1) {
                return andSortIndexNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.SORT_INDEX not in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.SORT_INDEX in",
                    Arrays.asList(values), "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.SORT_INDEX not in",
                    Arrays.asList(values), "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX between", value1, value2,
                "sortIndex");

            return this;
        } // end andSortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_FOLDER.SORT_INDEX not between", value1,
                value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("DOCUMENT_FOLDER.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.STATUS is not null AND DOCUMENT_FOLDER.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.STATUS is null OR DOCUMENT_FOLDER.STATUS = '')");

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
            addCriterion("DOCUMENT_FOLDER.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.STATUS");
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
            addCriterion("DOCUMENT_FOLDER.STATUS <>", value, "status");

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
            addCriterion("DOCUMENT_FOLDER.STATUS is null OR DOCUMENT_FOLDER.STATUS <>",
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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.STATUS");
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
            addCriterion("DOCUMENT_FOLDER.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.STATUS");
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
            addCriterion("DOCUMENT_FOLDER.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.STATUS");
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
            addCriterion("DOCUMENT_FOLDER.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.STATUS");
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
            addCriterion("DOCUMENT_FOLDER.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.STATUS");
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
            addCriterion("DOCUMENT_FOLDER.STATUS like", buffer.toString(),
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
            addCriterion("DOCUMENT_FOLDER.STATUS not like", buffer.toString(),
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
                addCriterion("DOCUMENT_FOLDER.STATUS in", values, "status");

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
                addCriterion("DOCUMENT_FOLDER.STATUS not in", values, "status");

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
                addCriterion("DOCUMENT_FOLDER.STATUS in",
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
                addCriterion("DOCUMENT_FOLDER.STATUS not in",
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
            addCriterion("DOCUMENT_FOLDER.STATUS between", value1, value2,
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
            addCriterion("DOCUMENT_FOLDER.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathIsNull() {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH is null");

            return this;
        } // end andFolderPathIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH is not null");

            return this;
        } // end andFolderPathIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.FOLDER_PATH is not null AND DOCUMENT_FOLDER.FOLDER_PATH <> ''");

            return this;
        } // end andFolderPathIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.FOLDER_PATH is null OR DOCUMENT_FOLDER.FOLDER_PATH = '')");

            return this;
        } // end andFolderPathIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH =", value, "folderPath");

            return this;
        } // end andFolderPathEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_PATH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderPathEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathNotEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH <>", value, "folderPath");

            return this;
        } // end andFolderPathNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathNotEqualToOrIsNull(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH is null OR DOCUMENT_FOLDER.FOLDER_PATH <>",
                value, "folderPath");

            return this;
        } // end andFolderPathNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_PATH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderPathNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathGreaterThan(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH >", value, "folderPath");

            return this;
        } // end andFolderPathGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_PATH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderPathGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH >=", value, "folderPath");

            return this;
        } // end andFolderPathGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_PATH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderPathGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathLessThan(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH <", value, "folderPath");

            return this;
        } // end andFolderPathLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_PATH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderPathLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH <=", value, "folderPath");

            return this;
        } // end andFolderPathLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.FOLDER_PATH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFolderPathLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH like", buffer.toString(),
                "folderPath");

            return this;
        } // end andFolderPathLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH not like",
                buffer.toString(), "folderPath");

            return this;
        } // end andFolderPathNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathIn(List values) {
            if (values.size() == 1) {
                return andFolderPathEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_PATH in", values,
                    "folderPath");

                return this;
            } // end else
        } // end andFolderPathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathNotIn(List values) {
            if (values.size() == 1) {
                return andFolderPathNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_PATH not in", values,
                    "folderPath");

                return this;
            } // end else
        } // end andFolderPathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathIn(Object[] values) {
            if (values.length == 1) {
                return andFolderPathEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_PATH in",
                    Arrays.asList(values), "folderPath");

                return this;
            } // end else
        } // end andFolderPathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathNotIn(Object[] values) {
            if (values.length == 1) {
                return andFolderPathNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("DOCUMENT_FOLDER.FOLDER_PATH not in",
                    Arrays.asList(values), "folderPath");

                return this;
            } // end else
        } // end andFolderPathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathBetween(String value1, String value2) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH between", value1, value2,
                "folderPath");

            return this;
        } // end andFolderPathBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFolderPathNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_FOLDER.FOLDER_PATH not between", value1,
                value2, "folderPath");

            return this;
        } // end andFolderPathNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsNull() {
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN is null");

            return this;
        } // end andLockTokenIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsNotNull() {
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN is not null");

            return this;
        } // end andLockTokenIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsNotEmpty() {
            addCriterion(
                "DOCUMENT_FOLDER.LOCK_TOKEN is not null AND DOCUMENT_FOLDER.LOCK_TOKEN <> ''");

            return this;
        } // end andLockTokenIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLockTokenIsEmpty() {
            addCriterion(
                "(DOCUMENT_FOLDER.LOCK_TOKEN is null OR DOCUMENT_FOLDER.LOCK_TOKEN = '')");

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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN =", value, "lockToken");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.LOCK_TOKEN");
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN <>", value, "lockToken");

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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN is null OR DOCUMENT_FOLDER.LOCK_TOKEN <>",
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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.LOCK_TOKEN");
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN >", value, "lockToken");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.LOCK_TOKEN");
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN >=", value, "lockToken");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.LOCK_TOKEN");
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN <", value, "lockToken");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.LOCK_TOKEN");
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN <=", value, "lockToken");

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
            StringBuffer str = new StringBuffer("DOCUMENT_FOLDER.LOCK_TOKEN");
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN like", buffer.toString(),
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN not like",
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
                addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN in", values,
                    "lockToken");

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
                addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN not in", values,
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
                addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN in",
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
                addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN not in",
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN between", value1, value2,
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
            addCriterion("DOCUMENT_FOLDER.LOCK_TOKEN not between", value1,
                value2, "lockToken");

            return this;
        } // end andLockTokenNotBetween()
    } // end Criteria
} // end DocumentFolderDAOQueryBean
