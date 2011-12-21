/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * PersistentPropertyConstValue query bean 2011-09-22 10:16:50
 *
 * @author Auto Gen
 */
public class PersistentPropertyConstValueDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new PersistentPropertyConstValueDAOQueryBean object.
     */
    public PersistentPropertyConstValueDAOQueryBean() {
        super();
    } // end PersistentPropertyConstValueDAOQueryBean()

    /**
     * Creates a new PersistentPropertyConstValueDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public PersistentPropertyConstValueDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end PersistentPropertyConstValueDAOQueryBean()

    /**
     * Creates a new PersistentPropertyConstValueDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public PersistentPropertyConstValueDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end PersistentPropertyConstValueDAOQueryBean()

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
    public void addColumnIdSelectProperty() {
        addColumnIdSelectProperty("columnId");
    } // end addColumnIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addColumnIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.ColumnId, aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.ColumnId,
                "columnId");
        } // end else
    } // end addColumnIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addColumnNameSelectProperty() {
        addColumnNameSelectProperty("columnName");
    } // end addColumnNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addColumnNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.ColumnName,
                aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.ColumnName,
                "columnName");
        } // end else
    } // end addColumnNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDelFlagSelectProperty() {
        addDelFlagSelectProperty("delFlag");
    } // end addDelFlagSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDelFlagSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.DelFlag, aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.DelFlag,
                "delFlag");
        } // end else
    } // end addDelFlagSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDescriptionSelectProperty() {
        addDescriptionSelectProperty("description");
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.Description,
                aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.Description,
                "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFieldOrderSelectProperty() {
        addFieldOrderSelectProperty("fieldOrder");
    } // end addFieldOrderSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFieldOrderSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.FieldOrder,
                aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.FieldOrder,
                "fieldOrder");
        } // end else
    } // end addFieldOrderSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRowIdSelectProperty() {
        addRowIdSelectProperty("rowId");
    } // end addRowIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRowIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.RowId, aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.RowId, "rowId");
        } // end else
    } // end addRowIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTableNameSelectProperty() {
        addTableNameSelectProperty("tableName");
    } // end addTableNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTableNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.TableName, aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.TableName,
                "tableName");
        } // end else
    } // end addTableNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addValueSelectProperty() {
        addValueSelectProperty("value");
    } // end addValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IPersistentPropertyConstValueDAO.Value, aAlias);
        } // end if
        else {
            addSelectProperty(IPersistentPropertyConstValueDAO.Value, "value");
        } // end else
    } // end addValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addColumnIdSelectProperty();

        addColumnNameSelectProperty();

        addDelFlagSelectProperty();

        addDescriptionSelectProperty();

        addFieldOrderSelectProperty();

        addRowIdSelectProperty();

        addTableNameSelectProperty();

        addValueSelectProperty();
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
        public Criteria andColumnIdIsNull() {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID is null");

            return this;
        } // end andColumnIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdIsNotNull() {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID is not null");

            return this;
        } // end andColumnIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.COLUMN_ID is not null AND SYS_FIELD_DESC.COLUMN_ID <> ''");

            return this;
        } // end andColumnIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.COLUMN_ID is null OR SYS_FIELD_DESC.COLUMN_ID = '')");

            return this;
        } // end andColumnIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdEqualTo(Long value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID =", value, "columnId");

            return this;
        } // end andColumnIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdNotEqualTo(Long value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID <>", value, "columnId");

            return this;
        } // end andColumnIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdNotEqualToOrIsNull(Long value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID is null OR SYS_FIELD_DESC.COLUMN_ID <>",
                value, "columnId");

            return this;
        } // end andColumnIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdGreaterThan(Long value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID >", value, "columnId");

            return this;
        } // end andColumnIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID >=", value, "columnId");

            return this;
        } // end andColumnIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdLessThan(Long value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID <", value, "columnId");

            return this;
        } // end andColumnIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID <=", value, "columnId");

            return this;
        } // end andColumnIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdIn(List values) {
            if (values.size() == 1) {
                return andColumnIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_ID in", values, "columnId");

                return this;
            } // end else
        } // end andColumnIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdNotIn(List values) {
            if (values.size() == 1) {
                return andColumnIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_ID not in", values,
                    "columnId");

                return this;
            } // end else
        } // end andColumnIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdIn(Object[] values) {
            if (values.length == 1) {
                return andColumnIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_ID in",
                    Arrays.asList(values), "columnId");

                return this;
            } // end else
        } // end andColumnIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andColumnIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_ID not in",
                    Arrays.asList(values), "columnId");

                return this;
            } // end else
        } // end andColumnIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdBetween(Long value1, Long value2) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID between", value1, value2,
                "columnId");

            return this;
        } // end andColumnIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnIdNotBetween(Long value1, Long value2) {
            addCriterion("SYS_FIELD_DESC.COLUMN_ID not between", value1,
                value2, "columnId");

            return this;
        } // end andColumnIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameIsNull() {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME is null");

            return this;
        } // end andColumnNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameIsNotNull() {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME is not null");

            return this;
        } // end andColumnNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.COLUMN_NAME is not null AND SYS_FIELD_DESC.COLUMN_NAME <> ''");

            return this;
        } // end andColumnNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.COLUMN_NAME is null OR SYS_FIELD_DESC.COLUMN_NAME = '')");

            return this;
        } // end andColumnNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME =", value, "columnName");

            return this;
        } // end andColumnNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME <>", value, "columnName");

            return this;
        } // end andColumnNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME is null OR SYS_FIELD_DESC.COLUMN_NAME <>",
                value, "columnName");

            return this;
        } // end andColumnNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME >", value, "columnName");

            return this;
        } // end andColumnNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME >=", value, "columnName");

            return this;
        } // end andColumnNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameLessThan(String value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME <", value, "columnName");

            return this;
        } // end andColumnNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME <=", value, "columnName");

            return this;
        } // end andColumnNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.COLUMN_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andColumnNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME like", buffer.toString(),
                "columnName");

            return this;
        } // end andColumnNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME not like",
                buffer.toString(), "columnName");

            return this;
        } // end andColumnNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameIn(List values) {
            if (values.size() == 1) {
                return andColumnNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_NAME in", values,
                    "columnName");

                return this;
            } // end else
        } // end andColumnNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameNotIn(List values) {
            if (values.size() == 1) {
                return andColumnNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_NAME not in", values,
                    "columnName");

                return this;
            } // end else
        } // end andColumnNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameIn(Object[] values) {
            if (values.length == 1) {
                return andColumnNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_NAME in",
                    Arrays.asList(values), "columnName");

                return this;
            } // end else
        } // end andColumnNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andColumnNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.COLUMN_NAME not in",
                    Arrays.asList(values), "columnName");

                return this;
            } // end else
        } // end andColumnNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME between", value1, value2,
                "columnName");

            return this;
        } // end andColumnNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.COLUMN_NAME not between", value1,
                value2, "columnName");

            return this;
        } // end andColumnNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagIsNull() {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG is null");

            return this;
        } // end andDelFlagIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagIsNotNull() {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG is not null");

            return this;
        } // end andDelFlagIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.DEL_FLAG is not null AND SYS_FIELD_DESC.DEL_FLAG <> ''");

            return this;
        } // end andDelFlagIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.DEL_FLAG is null OR SYS_FIELD_DESC.DEL_FLAG = '')");

            return this;
        } // end andDelFlagIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagEqualTo(int value) {
            return andDelFlagEqualTo(Integer.valueOf(value));
        } // end andDelFlagEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagEqualTo(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG =", value, "delFlag");

            return this;
        } // end andDelFlagEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DEL_FLAG");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDelFlagEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotEqualTo(int value) {
            return andDelFlagNotEqualTo(Integer.valueOf(value));
        } // end andDelFlagNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotEqualTo(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG <>", value, "delFlag");

            return this;
        } // end andDelFlagNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotEqualToOrIsNull(int value) {
            return andDelFlagNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andDelFlagNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG is null OR SYS_FIELD_DESC.DEL_FLAG <>",
                value, "delFlag");

            return this;
        } // end andDelFlagNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DEL_FLAG");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDelFlagNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagGreaterThan(int value) {
            return andDelFlagGreaterThan(Integer.valueOf(value));
        } // end andDelFlagGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagGreaterThan(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG >", value, "delFlag");

            return this;
        } // end andDelFlagGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DEL_FLAG");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDelFlagGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagGreaterThanOrEqualTo(int value) {
            return andDelFlagGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andDelFlagGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG >=", value, "delFlag");

            return this;
        } // end andDelFlagGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DEL_FLAG");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDelFlagGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagLessThan(int value) {
            return andDelFlagLessThan(Integer.valueOf(value));
        } // end andDelFlagLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagLessThan(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG <", value, "delFlag");

            return this;
        } // end andDelFlagLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DEL_FLAG");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDelFlagLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagLessThanOrEqualTo(int value) {
            return andDelFlagLessThanOrEqualTo(Integer.valueOf(value));
        } // end andDelFlagLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG <=", value, "delFlag");

            return this;
        } // end andDelFlagLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DEL_FLAG");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDelFlagLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagIn(int[] values) {
            if (values.length == 1) {
                return andDelFlagEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DEL_FLAG in", values, "delFlag");

                return this;
            } // end else
        } // end andDelFlagIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotIn(int[] values) {
            if (values.length == 1) {
                return andDelFlagNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DEL_FLAG not in", values, "delFlag");

                return this;
            } // end else
        } // end andDelFlagNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagIn(List values) {
            if (values.size() == 1) {
                return andDelFlagEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DEL_FLAG in", values, "delFlag");

                return this;
            } // end else
        } // end andDelFlagIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotIn(List values) {
            if (values.size() == 1) {
                return andDelFlagNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DEL_FLAG not in", values, "delFlag");

                return this;
            } // end else
        } // end andDelFlagNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagIn(Object[] values) {
            if (values.length == 1) {
                return andDelFlagEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DEL_FLAG in",
                    Arrays.asList(values), "delFlag");

                return this;
            } // end else
        } // end andDelFlagIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotIn(Object[] values) {
            if (values.length == 1) {
                return andDelFlagNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DEL_FLAG not in",
                    Arrays.asList(values), "delFlag");

                return this;
            } // end else
        } // end andDelFlagNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagBetween(int value1, int value2) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG between", value1, value2,
                "delFlag");

            return this;
        } // end andDelFlagBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG between", value1, value2,
                "delFlag");

            return this;
        } // end andDelFlagBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotBetween(int value1, int value2) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG not between", value1, value2,
                "delFlag");

            return this;
        } // end andDelFlagNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDelFlagNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_FIELD_DESC.DEL_FLAG not between", value1, value2,
                "delFlag");

            return this;
        } // end andDelFlagNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.DESCRIPTION is not null AND SYS_FIELD_DESC.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.DESCRIPTION is null OR SYS_FIELD_DESC.DESCRIPTION = '')");

            return this;
        } // end andDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION =", value, "description");

            return this;
        } // end andDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION <>", value, "description");

            return this;
        } // end andDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToOrIsNull(String value) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION is null OR SYS_FIELD_DESC.DESCRIPTION <>",
                value, "description");

            return this;
        } // end andDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION >", value, "description");

            return this;
        } // end andDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION >=", value, "description");

            return this;
        } // end andDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThan(String value) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION <", value, "description");

            return this;
        } // end andDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION <=", value, "description");

            return this;
        } // end andDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.DESCRIPTION like", buffer.toString(),
                "description");

            return this;
        } // end andDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.DESCRIPTION not like",
                buffer.toString(), "description");

            return this;
        } // end andDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(List values) {
            if (values.size() == 1) {
                return andDescriptionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DESCRIPTION in", values,
                    "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andDescriptionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DESCRIPTION not in", values,
                    "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DESCRIPTION in",
                    Arrays.asList(values), "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.DESCRIPTION not in",
                    Arrays.asList(values), "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION between", value1, value2,
                "description");

            return this;
        } // end andDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderIsNull() {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER is null");

            return this;
        } // end andFieldOrderIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderIsNotNull() {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER is not null");

            return this;
        } // end andFieldOrderIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.FIELD_ORDER is not null AND SYS_FIELD_DESC.FIELD_ORDER <> ''");

            return this;
        } // end andFieldOrderIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.FIELD_ORDER is null OR SYS_FIELD_DESC.FIELD_ORDER = '')");

            return this;
        } // end andFieldOrderIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderEqualTo(int value) {
            return andFieldOrderEqualTo(Integer.valueOf(value));
        } // end andFieldOrderEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderEqualTo(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER =", value, "fieldOrder");

            return this;
        } // end andFieldOrderEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.FIELD_ORDER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldOrderEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotEqualTo(int value) {
            return andFieldOrderNotEqualTo(Integer.valueOf(value));
        } // end andFieldOrderNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotEqualTo(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER <>", value, "fieldOrder");

            return this;
        } // end andFieldOrderNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotEqualToOrIsNull(int value) {
            return andFieldOrderNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andFieldOrderNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER is null OR SYS_FIELD_DESC.FIELD_ORDER <>",
                value, "fieldOrder");

            return this;
        } // end andFieldOrderNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.FIELD_ORDER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldOrderNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderGreaterThan(int value) {
            return andFieldOrderGreaterThan(Integer.valueOf(value));
        } // end andFieldOrderGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderGreaterThan(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER >", value, "fieldOrder");

            return this;
        } // end andFieldOrderGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.FIELD_ORDER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldOrderGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderGreaterThanOrEqualTo(int value) {
            return andFieldOrderGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andFieldOrderGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER >=", value, "fieldOrder");

            return this;
        } // end andFieldOrderGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.FIELD_ORDER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldOrderGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderLessThan(int value) {
            return andFieldOrderLessThan(Integer.valueOf(value));
        } // end andFieldOrderLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderLessThan(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER <", value, "fieldOrder");

            return this;
        } // end andFieldOrderLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.FIELD_ORDER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldOrderLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderLessThanOrEqualTo(int value) {
            return andFieldOrderLessThanOrEqualTo(Integer.valueOf(value));
        } // end andFieldOrderLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER <=", value, "fieldOrder");

            return this;
        } // end andFieldOrderLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.FIELD_ORDER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFieldOrderLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderIn(int[] values) {
            if (values.length == 1) {
                return andFieldOrderEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.FIELD_ORDER in", values,
                    "fieldOrder");

                return this;
            } // end else
        } // end andFieldOrderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotIn(int[] values) {
            if (values.length == 1) {
                return andFieldOrderNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.FIELD_ORDER not in", values,
                    "fieldOrder");

                return this;
            } // end else
        } // end andFieldOrderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderIn(List values) {
            if (values.size() == 1) {
                return andFieldOrderEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.FIELD_ORDER in", values,
                    "fieldOrder");

                return this;
            } // end else
        } // end andFieldOrderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotIn(List values) {
            if (values.size() == 1) {
                return andFieldOrderNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.FIELD_ORDER not in", values,
                    "fieldOrder");

                return this;
            } // end else
        } // end andFieldOrderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderIn(Object[] values) {
            if (values.length == 1) {
                return andFieldOrderEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.FIELD_ORDER in",
                    Arrays.asList(values), "fieldOrder");

                return this;
            } // end else
        } // end andFieldOrderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotIn(Object[] values) {
            if (values.length == 1) {
                return andFieldOrderNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.FIELD_ORDER not in",
                    Arrays.asList(values), "fieldOrder");

                return this;
            } // end else
        } // end andFieldOrderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderBetween(int value1, int value2) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER between", value1, value2,
                "fieldOrder");

            return this;
        } // end andFieldOrderBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER between", value1, value2,
                "fieldOrder");

            return this;
        } // end andFieldOrderBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotBetween(int value1, int value2) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER not between", value1,
                value2, "fieldOrder");

            return this;
        } // end andFieldOrderNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFieldOrderNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_FIELD_DESC.FIELD_ORDER not between", value1,
                value2, "fieldOrder");

            return this;
        } // end andFieldOrderNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdIsNull() {
            addCriterion("SYS_FIELD_DESC.ROW_ID is null");

            return this;
        } // end andRowIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdIsNotNull() {
            addCriterion("SYS_FIELD_DESC.ROW_ID is not null");

            return this;
        } // end andRowIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.ROW_ID is not null AND SYS_FIELD_DESC.ROW_ID <> ''");

            return this;
        } // end andRowIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.ROW_ID is null OR SYS_FIELD_DESC.ROW_ID = '')");

            return this;
        } // end andRowIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdEqualTo(long value) {
            return andRowIdEqualTo(Long.valueOf(value));
        } // end andRowIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_FIELD_DESC.ROW_ID =", value, "rowId");

            return this;
        } // end andRowIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.ROW_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRowIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotEqualTo(long value) {
            return andRowIdNotEqualTo(Long.valueOf(value));
        } // end andRowIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_FIELD_DESC.ROW_ID <>", value, "rowId");

            return this;
        } // end andRowIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotEqualToOrIsNull(long value) {
            return andRowIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andRowIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_FIELD_DESC.ROW_ID is null OR SYS_FIELD_DESC.ROW_ID <>",
                value, "rowId");

            return this;
        } // end andRowIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.ROW_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRowIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdGreaterThan(long value) {
            return andRowIdGreaterThan(Long.valueOf(value));
        } // end andRowIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_FIELD_DESC.ROW_ID >", value, "rowId");

            return this;
        } // end andRowIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.ROW_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRowIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdGreaterThanOrEqualTo(long value) {
            return andRowIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andRowIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_FIELD_DESC.ROW_ID >=", value, "rowId");

            return this;
        } // end andRowIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.ROW_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRowIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdLessThan(long value) {
            return andRowIdLessThan(Long.valueOf(value));
        } // end andRowIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdLessThan(java.lang.Long value) {
            addCriterion("SYS_FIELD_DESC.ROW_ID <", value, "rowId");

            return this;
        } // end andRowIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.ROW_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRowIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdLessThanOrEqualTo(long value) {
            return andRowIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andRowIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_FIELD_DESC.ROW_ID <=", value, "rowId");

            return this;
        } // end andRowIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.ROW_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRowIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdIn(long[] values) {
            if (values.length == 1) {
                return andRowIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.ROW_ID in", values, "rowId");

                return this;
            } // end else
        } // end andRowIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRowIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.ROW_ID not in", values, "rowId");

                return this;
            } // end else
        } // end andRowIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdIn(List values) {
            if (values.size() == 1) {
                return andRowIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.ROW_ID in", values, "rowId");

                return this;
            } // end else
        } // end andRowIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotIn(List values) {
            if (values.size() == 1) {
                return andRowIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.ROW_ID not in", values, "rowId");

                return this;
            } // end else
        } // end andRowIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdIn(Object[] values) {
            if (values.length == 1) {
                return andRowIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.ROW_ID in", Arrays.asList(values),
                    "rowId");

                return this;
            } // end else
        } // end andRowIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRowIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.ROW_ID not in",
                    Arrays.asList(values), "rowId");

                return this;
            } // end else
        } // end andRowIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdBetween(long value1, long value2) {
            addCriterion("SYS_FIELD_DESC.ROW_ID between", value1, value2,
                "rowId");

            return this;
        } // end andRowIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_FIELD_DESC.ROW_ID between", value1, value2,
                "rowId");

            return this;
        } // end andRowIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotBetween(long value1, long value2) {
            addCriterion("SYS_FIELD_DESC.ROW_ID not between", value1, value2,
                "rowId");

            return this;
        } // end andRowIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRowIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_FIELD_DESC.ROW_ID not between", value1, value2,
                "rowId");

            return this;
        } // end andRowIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNull() {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME is null");

            return this;
        } // end andTableNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNotNull() {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME is not null");

            return this;
        } // end andTableNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.TABLE_NAME is not null AND SYS_FIELD_DESC.TABLE_NAME <> ''");

            return this;
        } // end andTableNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.TABLE_NAME is null OR SYS_FIELD_DESC.TABLE_NAME = '')");

            return this;
        } // end andTableNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME =", value, "tableName");

            return this;
        } // end andTableNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.TABLE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME <>", value, "tableName");

            return this;
        } // end andTableNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME is null OR SYS_FIELD_DESC.TABLE_NAME <>",
                value, "tableName");

            return this;
        } // end andTableNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.TABLE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME >", value, "tableName");

            return this;
        } // end andTableNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.TABLE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME >=", value, "tableName");

            return this;
        } // end andTableNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.TABLE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThan(String value) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME <", value, "tableName");

            return this;
        } // end andTableNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.TABLE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME <=", value, "tableName");

            return this;
        } // end andTableNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.TABLE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTableNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.TABLE_NAME like", buffer.toString(),
                "tableName");

            return this;
        } // end andTableNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.TABLE_NAME not like",
                buffer.toString(), "tableName");

            return this;
        } // end andTableNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIn(List values) {
            if (values.size() == 1) {
                return andTableNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.TABLE_NAME in", values, "tableName");

                return this;
            } // end else
        } // end andTableNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotIn(List values) {
            if (values.size() == 1) {
                return andTableNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.TABLE_NAME not in", values,
                    "tableName");

                return this;
            } // end else
        } // end andTableNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameIn(Object[] values) {
            if (values.length == 1) {
                return andTableNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.TABLE_NAME in",
                    Arrays.asList(values), "tableName");

                return this;
            } // end else
        } // end andTableNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTableNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.TABLE_NAME not in",
                    Arrays.asList(values), "tableName");

                return this;
            } // end else
        } // end andTableNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME between", value1, value2,
                "tableName");

            return this;
        } // end andTableNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.TABLE_NAME not between", value1,
                value2, "tableName");

            return this;
        } // end andTableNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNull() {
            addCriterion("SYS_FIELD_DESC.VALUE is null");

            return this;
        } // end andValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotNull() {
            addCriterion("SYS_FIELD_DESC.VALUE is not null");

            return this;
        } // end andValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotEmpty() {
            addCriterion(
                "SYS_FIELD_DESC.VALUE is not null AND SYS_FIELD_DESC.VALUE <> ''");

            return this;
        } // end andValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsEmpty() {
            addCriterion(
                "(SYS_FIELD_DESC.VALUE is null OR SYS_FIELD_DESC.VALUE = '')");

            return this;
        } // end andValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.VALUE =", value, "value");

            return this;
        } // end andValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.VALUE <>", value, "value");

            return this;
        } // end andValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToOrIsNull(String value) {
            addCriterion("SYS_FIELD_DESC.VALUE is null OR SYS_FIELD_DESC.VALUE <>",
                value, "value");

            return this;
        } // end andValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThan(String value) {
            addCriterion("SYS_FIELD_DESC.VALUE >", value, "value");

            return this;
        } // end andValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.VALUE >=", value, "value");

            return this;
        } // end andValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThan(String value) {
            addCriterion("SYS_FIELD_DESC.VALUE <", value, "value");

            return this;
        } // end andValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("SYS_FIELD_DESC.VALUE <=", value, "value");

            return this;
        } // end andValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_FIELD_DESC.VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.VALUE like", buffer.toString(), "value");

            return this;
        } // end andValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_FIELD_DESC.VALUE not like", buffer.toString(),
                "value");

            return this;
        } // end andValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(List values) {
            if (values.size() == 1) {
                return andValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.VALUE in", values, "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(List values) {
            if (values.size() == 1) {
                return andValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.VALUE not in", values, "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(Object[] values) {
            if (values.length == 1) {
                return andValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.VALUE in", Arrays.asList(values),
                    "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_FIELD_DESC.VALUE not in",
                    Arrays.asList(values), "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.VALUE between", value1, value2, "value");

            return this;
        } // end andValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("SYS_FIELD_DESC.VALUE not between", value1, value2,
                "value");

            return this;
        } // end andValueNotBetween()
    } // end Criteria
} // end PersistentPropertyConstValueDAOQueryBean
