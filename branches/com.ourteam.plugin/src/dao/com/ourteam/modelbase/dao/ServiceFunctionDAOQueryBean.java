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
 * ServiceFunction query bean 2011-09-22 10:16:50
 *
 * @author Auto Gen
 */
public class ServiceFunctionDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ServiceFunctionDAOQueryBean object.
     */
    public ServiceFunctionDAOQueryBean() {
        super();
    } // end ServiceFunctionDAOQueryBean()

    /**
     * Creates a new ServiceFunctionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ServiceFunctionDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ServiceFunctionDAOQueryBean()

    /**
     * Creates a new ServiceFunctionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ServiceFunctionDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ServiceFunctionDAOQueryBean()

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
    public void addObjectFunctionIdSelectProperty() {
        addObjectFunctionIdSelectProperty("objectFunctionId");
    } // end addObjectFunctionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectFunctionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceFunctionDAO.ObjectFunctionId, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceFunctionDAO.ObjectFunctionId,
                "objectFunctionId");
        } // end else
    } // end addObjectFunctionIdSelectProperty()

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
            addSelectProperty(IServiceFunctionDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceFunctionDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsQuerySelectProperty() {
        addIsQuerySelectProperty("isQuery");
    } // end addIsQuerySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsQuerySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceFunctionDAO.IsQuery, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceFunctionDAO.IsQuery, "isQuery");
        } // end else
    } // end addIsQuerySelectProperty()

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
            addSelectProperty(IServiceFunctionDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceFunctionDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addObjectIdSelectProperty() {
        addObjectIdSelectProperty("objectId");
    } // end addObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceFunctionDAO.ObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceFunctionDAO.ObjectId, "objectId");
        } // end else
    } // end addObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStateSelectProperty() {
        addStateSelectProperty("state");
    } // end addStateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceFunctionDAO.State, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceFunctionDAO.State, "state");
        } // end else
    } // end addStateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTypeSelectProperty() {
        addTypeSelectProperty("type");
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceFunctionDAO.Type, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceFunctionDAO.Type, "type");
        } // end else
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addObjectFunctionIdSelectProperty();

        addDescriptionSelectProperty();

        addIsQuerySelectProperty();

        addNameSelectProperty();

        addObjectIdSelectProperty();

        addStateSelectProperty();

        addTypeSelectProperty();
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
        public Criteria andObjectFunctionIdIsNull() {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID is null");

            return this;
        } // end andObjectFunctionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdIsNotNull() {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID is not null");

            return this;
        } // end andObjectFunctionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdIsNotEmpty() {
            addCriterion(
                "OBJECT_FUNCTION.OBJECT_FUNCTION_ID is not null AND OBJECT_FUNCTION.OBJECT_FUNCTION_ID <> ''");

            return this;
        } // end andObjectFunctionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdIsEmpty() {
            addCriterion(
                "(OBJECT_FUNCTION.OBJECT_FUNCTION_ID is null OR OBJECT_FUNCTION.OBJECT_FUNCTION_ID = '')");

            return this;
        } // end andObjectFunctionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdEqualTo(long value) {
            return andObjectFunctionIdEqualTo(Long.valueOf(value));
        } // end andObjectFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID =", value,
                "objectFunctionId");

            return this;
        } // end andObjectFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_FUNCTION.OBJECT_FUNCTION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectFunctionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotEqualTo(long value) {
            return andObjectFunctionIdNotEqualTo(Long.valueOf(value));
        } // end andObjectFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID <>", value,
                "objectFunctionId");

            return this;
        } // end andObjectFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotEqualToOrIsNull(long value) {
            return andObjectFunctionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID is null OR OBJECT_FUNCTION.OBJECT_FUNCTION_ID <>",
                value, "objectFunctionId");

            return this;
        } // end andObjectFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_FUNCTION.OBJECT_FUNCTION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectFunctionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdGreaterThan(long value) {
            return andObjectFunctionIdGreaterThan(Long.valueOf(value));
        } // end andObjectFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID >", value,
                "objectFunctionId");

            return this;
        } // end andObjectFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_FUNCTION.OBJECT_FUNCTION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectFunctionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdGreaterThanOrEqualTo(long value) {
            return andObjectFunctionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID >=", value,
                "objectFunctionId");

            return this;
        } // end andObjectFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_FUNCTION.OBJECT_FUNCTION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectFunctionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdLessThan(long value) {
            return andObjectFunctionIdLessThan(Long.valueOf(value));
        } // end andObjectFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID <", value,
                "objectFunctionId");

            return this;
        } // end andObjectFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_FUNCTION.OBJECT_FUNCTION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectFunctionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdLessThanOrEqualTo(long value) {
            return andObjectFunctionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID <=", value,
                "objectFunctionId");

            return this;
        } // end andObjectFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_FUNCTION.OBJECT_FUNCTION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectFunctionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectFunctionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID in", values,
                    "objectFunctionId");

                return this;
            } // end else
        } // end andObjectFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectFunctionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID not in",
                    values, "objectFunctionId");

                return this;
            } // end else
        } // end andObjectFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdIn(List values) {
            if (values.size() == 1) {
                return andObjectFunctionIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID in", values,
                    "objectFunctionId");

                return this;
            } // end else
        } // end andObjectFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectFunctionIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID not in",
                    values, "objectFunctionId");

                return this;
            } // end else
        } // end andObjectFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectFunctionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID in",
                    Arrays.asList(values), "objectFunctionId");

                return this;
            } // end else
        } // end andObjectFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectFunctionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID not in",
                    Arrays.asList(values), "objectFunctionId");

                return this;
            } // end else
        } // end andObjectFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdBetween(long value1, long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID between", value1,
                value2, "objectFunctionId");

            return this;
        } // end andObjectFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID between", value1,
                value2, "objectFunctionId");

            return this;
        } // end andObjectFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID not between",
                value1, value2, "objectFunctionId");

            return this;
        } // end andObjectFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectFunctionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_FUNCTION_ID not between",
                value1, value2, "objectFunctionId");

            return this;
        } // end andObjectFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("OBJECT_FUNCTION.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("OBJECT_FUNCTION.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "OBJECT_FUNCTION.DESCRIPTION is not null AND OBJECT_FUNCTION.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(OBJECT_FUNCTION.DESCRIPTION is null OR OBJECT_FUNCTION.DESCRIPTION = '')");

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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.DESCRIPTION");
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION <>", value, "description");

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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION is null OR OBJECT_FUNCTION.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.DESCRIPTION");
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.DESCRIPTION");
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION >=", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.DESCRIPTION");
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.DESCRIPTION");
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION <=", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.DESCRIPTION");
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION like", buffer.toString(),
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION not like",
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
                addCriterion("OBJECT_FUNCTION.DESCRIPTION in", values,
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
                addCriterion("OBJECT_FUNCTION.DESCRIPTION not in", values,
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
                addCriterion("OBJECT_FUNCTION.DESCRIPTION in",
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
                addCriterion("OBJECT_FUNCTION.DESCRIPTION not in",
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION between", value1, value2,
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
            addCriterion("OBJECT_FUNCTION.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryIsNull() {
            addCriterion("OBJECT_FUNCTION.ISQUERY is null");

            return this;
        } // end andIsQueryIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryIsNotNull() {
            addCriterion("OBJECT_FUNCTION.ISQUERY is not null");

            return this;
        } // end andIsQueryIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryIsNotEmpty() {
            addCriterion(
                "OBJECT_FUNCTION.ISQUERY is not null AND OBJECT_FUNCTION.ISQUERY <> ''");

            return this;
        } // end andIsQueryIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryIsEmpty() {
            addCriterion(
                "(OBJECT_FUNCTION.ISQUERY is null OR OBJECT_FUNCTION.ISQUERY = '')");

            return this;
        } // end andIsQueryIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.ISQUERY =", value, "isQuery");

            return this;
        } // end andIsQueryEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.ISQUERY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsQueryEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryNotEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.ISQUERY <>", value, "isQuery");

            return this;
        } // end andIsQueryNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_FUNCTION.ISQUERY is null OR OBJECT_FUNCTION.ISQUERY <>",
                value, "isQuery");

            return this;
        } // end andIsQueryNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.ISQUERY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsQueryNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryGreaterThan(String value) {
            addCriterion("OBJECT_FUNCTION.ISQUERY >", value, "isQuery");

            return this;
        } // end andIsQueryGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.ISQUERY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsQueryGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.ISQUERY >=", value, "isQuery");

            return this;
        } // end andIsQueryGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.ISQUERY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsQueryGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryLessThan(String value) {
            addCriterion("OBJECT_FUNCTION.ISQUERY <", value, "isQuery");

            return this;
        } // end andIsQueryLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.ISQUERY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsQueryLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.ISQUERY <=", value, "isQuery");

            return this;
        } // end andIsQueryLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.ISQUERY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsQueryLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_FUNCTION.ISQUERY like", buffer.toString(),
                "isQuery");

            return this;
        } // end andIsQueryLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_FUNCTION.ISQUERY not like", buffer.toString(),
                "isQuery");

            return this;
        } // end andIsQueryNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryIn(List values) {
            if (values.size() == 1) {
                return andIsQueryEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.ISQUERY in", values, "isQuery");

                return this;
            } // end else
        } // end andIsQueryIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryNotIn(List values) {
            if (values.size() == 1) {
                return andIsQueryNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.ISQUERY not in", values, "isQuery");

                return this;
            } // end else
        } // end andIsQueryNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryIn(Object[] values) {
            if (values.length == 1) {
                return andIsQueryEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.ISQUERY in",
                    Arrays.asList(values), "isQuery");

                return this;
            } // end else
        } // end andIsQueryIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsQueryNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.ISQUERY not in",
                    Arrays.asList(values), "isQuery");

                return this;
            } // end else
        } // end andIsQueryNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryBetween(String value1, String value2) {
            addCriterion("OBJECT_FUNCTION.ISQUERY between", value1, value2,
                "isQuery");

            return this;
        } // end andIsQueryBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsQueryNotBetween(String value1, String value2) {
            addCriterion("OBJECT_FUNCTION.ISQUERY not between", value1, value2,
                "isQuery");

            return this;
        } // end andIsQueryNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("OBJECT_FUNCTION.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("OBJECT_FUNCTION.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "OBJECT_FUNCTION.NAME is not null AND OBJECT_FUNCTION.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(OBJECT_FUNCTION.NAME is null OR OBJECT_FUNCTION.NAME = '')");

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
            addCriterion("OBJECT_FUNCTION.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.NAME");
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
            addCriterion("OBJECT_FUNCTION.NAME <>", value, "name");

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
            addCriterion("OBJECT_FUNCTION.NAME is null OR OBJECT_FUNCTION.NAME <>",
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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.NAME");
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
            addCriterion("OBJECT_FUNCTION.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.NAME");
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
            addCriterion("OBJECT_FUNCTION.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.NAME");
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
            addCriterion("OBJECT_FUNCTION.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.NAME");
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
            addCriterion("OBJECT_FUNCTION.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.NAME");
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
            addCriterion("OBJECT_FUNCTION.NAME like", buffer.toString(), "name");

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
            addCriterion("OBJECT_FUNCTION.NAME not like", buffer.toString(),
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
                addCriterion("OBJECT_FUNCTION.NAME in", values, "name");

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
                addCriterion("OBJECT_FUNCTION.NAME not in", values, "name");

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
                addCriterion("OBJECT_FUNCTION.NAME in", Arrays.asList(values),
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
                addCriterion("OBJECT_FUNCTION.NAME not in",
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
            addCriterion("OBJECT_FUNCTION.NAME between", value1, value2, "name");

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
            addCriterion("OBJECT_FUNCTION.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID is null");

            return this;
        } // end andObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID is not null");

            return this;
        } // end andObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_FUNCTION.OBJECT_ID is not null AND OBJECT_FUNCTION.OBJECT_ID <> ''");

            return this;
        } // end andObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_FUNCTION.OBJECT_ID is null OR OBJECT_FUNCTION.OBJECT_ID = '')");

            return this;
        } // end andObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdEqualTo(long value) {
            return andObjectIdEqualTo(Long.valueOf(value));
        } // end andObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID =", value, "objectId");

            return this;
        } // end andObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualTo(long value) {
            return andObjectIdNotEqualTo(Long.valueOf(value));
        } // end andObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID <>", value, "objectId");

            return this;
        } // end andObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualToOrIsNull(long value) {
            return andObjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID is null OR OBJECT_FUNCTION.OBJECT_ID <>",
                value, "objectId");

            return this;
        } // end andObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThan(long value) {
            return andObjectIdGreaterThan(Long.valueOf(value));
        } // end andObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID >", value, "objectId");

            return this;
        } // end andObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanOrEqualTo(long value) {
            return andObjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID >=", value, "objectId");

            return this;
        } // end andObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThan(long value) {
            return andObjectIdLessThan(Long.valueOf(value));
        } // end andObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID <", value, "objectId");

            return this;
        } // end andObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanOrEqualTo(long value) {
            return andObjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID <=", value, "objectId");

            return this;
        } // end andObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_ID in", values, "objectId");

                return this;
            } // end else
        } // end andObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_ID not in", values,
                    "objectId");

                return this;
            } // end else
        } // end andObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIn(List values) {
            if (values.size() == 1) {
                return andObjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_ID in", values, "objectId");

                return this;
            } // end else
        } // end andObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_ID not in", values,
                    "objectId");

                return this;
            } // end else
        } // end andObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_ID in",
                    Arrays.asList(values), "objectId");

                return this;
            } // end else
        } // end andObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.OBJECT_ID not in",
                    Arrays.asList(values), "objectId");

                return this;
            } // end else
        } // end andObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdBetween(long value1, long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID between", value1, value2,
                "objectId");

            return this;
        } // end andObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID between", value1, value2,
                "objectId");

            return this;
        } // end andObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID not between", value1,
                value2, "objectId");

            return this;
        } // end andObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_FUNCTION.OBJECT_ID not between", value1,
                value2, "objectId");

            return this;
        } // end andObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNull() {
            addCriterion("OBJECT_FUNCTION.STATE is null");

            return this;
        } // end andStateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotNull() {
            addCriterion("OBJECT_FUNCTION.STATE is not null");

            return this;
        } // end andStateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotEmpty() {
            addCriterion(
                "OBJECT_FUNCTION.STATE is not null AND OBJECT_FUNCTION.STATE <> ''");

            return this;
        } // end andStateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsEmpty() {
            addCriterion(
                "(OBJECT_FUNCTION.STATE is null OR OBJECT_FUNCTION.STATE = '')");

            return this;
        } // end andStateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.STATE =", value, "state");

            return this;
        } // end andStateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.STATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.STATE <>", value, "state");

            return this;
        } // end andStateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_FUNCTION.STATE is null OR OBJECT_FUNCTION.STATE <>",
                value, "state");

            return this;
        } // end andStateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.STATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThan(String value) {
            addCriterion("OBJECT_FUNCTION.STATE >", value, "state");

            return this;
        } // end andStateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.STATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.STATE >=", value, "state");

            return this;
        } // end andStateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.STATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThan(String value) {
            addCriterion("OBJECT_FUNCTION.STATE <", value, "state");

            return this;
        } // end andStateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.STATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.STATE <=", value, "state");

            return this;
        } // end andStateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.STATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_FUNCTION.STATE like", buffer.toString(),
                "state");

            return this;
        } // end andStateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_FUNCTION.STATE not like", buffer.toString(),
                "state");

            return this;
        } // end andStateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIn(List values) {
            if (values.size() == 1) {
                return andStateEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.STATE in", values, "state");

                return this;
            } // end else
        } // end andStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotIn(List values) {
            if (values.size() == 1) {
                return andStateNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.STATE not in", values, "state");

                return this;
            } // end else
        } // end andStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIn(Object[] values) {
            if (values.length == 1) {
                return andStateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.STATE in", Arrays.asList(values),
                    "state");

                return this;
            } // end else
        } // end andStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotIn(Object[] values) {
            if (values.length == 1) {
                return andStateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.STATE not in",
                    Arrays.asList(values), "state");

                return this;
            } // end else
        } // end andStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("OBJECT_FUNCTION.STATE between", value1, value2,
                "state");

            return this;
        } // end andStateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("OBJECT_FUNCTION.STATE not between", value1, value2,
                "state");

            return this;
        } // end andStateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNull() {
            addCriterion("OBJECT_FUNCTION.TYPE is null");

            return this;
        } // end andTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotNull() {
            addCriterion("OBJECT_FUNCTION.TYPE is not null");

            return this;
        } // end andTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotEmpty() {
            addCriterion(
                "OBJECT_FUNCTION.TYPE is not null AND OBJECT_FUNCTION.TYPE <> ''");

            return this;
        } // end andTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsEmpty() {
            addCriterion(
                "(OBJECT_FUNCTION.TYPE is null OR OBJECT_FUNCTION.TYPE = '')");

            return this;
        } // end andTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.TYPE =", value, "type");

            return this;
        } // end andTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.TYPE <>", value, "type");

            return this;
        } // end andTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_FUNCTION.TYPE is null OR OBJECT_FUNCTION.TYPE <>",
                value, "type");

            return this;
        } // end andTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThan(String value) {
            addCriterion("OBJECT_FUNCTION.TYPE >", value, "type");

            return this;
        } // end andTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.TYPE >=", value, "type");

            return this;
        } // end andTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThan(String value) {
            addCriterion("OBJECT_FUNCTION.TYPE <", value, "type");

            return this;
        } // end andTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_FUNCTION.TYPE <=", value, "type");

            return this;
        } // end andTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_FUNCTION.TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_FUNCTION.TYPE like", buffer.toString(), "type");

            return this;
        } // end andTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_FUNCTION.TYPE not like", buffer.toString(),
                "type");

            return this;
        } // end andTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIn(List values) {
            if (values.size() == 1) {
                return andTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.TYPE in", values, "type");

                return this;
            } // end else
        } // end andTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotIn(List values) {
            if (values.size() == 1) {
                return andTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.TYPE not in", values, "type");

                return this;
            } // end else
        } // end andTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIn(Object[] values) {
            if (values.length == 1) {
                return andTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.TYPE in", Arrays.asList(values),
                    "type");

                return this;
            } // end else
        } // end andTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_FUNCTION.TYPE not in",
                    Arrays.asList(values), "type");

                return this;
            } // end else
        } // end andTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("OBJECT_FUNCTION.TYPE between", value1, value2, "type");

            return this;
        } // end andTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_FUNCTION.TYPE not between", value1, value2,
                "type");

            return this;
        } // end andTypeNotBetween()
    } // end Criteria
} // end ServiceFunctionDAOQueryBean
