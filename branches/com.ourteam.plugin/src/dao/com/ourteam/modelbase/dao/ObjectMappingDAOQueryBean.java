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
 * ObjectMapping query bean 2011-09-22 10:16:40
 *
 * @author Auto Gen
 */
public class ObjectMappingDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ObjectMappingDAOQueryBean object.
     */
    public ObjectMappingDAOQueryBean() {
        super();
    } // end ObjectMappingDAOQueryBean()

    /**
     * Creates a new ObjectMappingDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ObjectMappingDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ObjectMappingDAOQueryBean()

    /**
     * Creates a new ObjectMappingDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ObjectMappingDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ObjectMappingDAOQueryBean()

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
    public void addObjectMappingIdSelectProperty() {
        addObjectMappingIdSelectProperty("objectMappingId");
    } // end addObjectMappingIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectMappingIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectMappingDAO.ObjectMappingId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectMappingDAO.ObjectMappingId,
                "objectMappingId");
        } // end else
    } // end addObjectMappingIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessObjectIdSelectProperty() {
        addBusinessObjectIdSelectProperty("businessObjectId");
    } // end addBusinessObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectMappingDAO.BusinessObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectMappingDAO.BusinessObjectId,
                "businessObjectId");
        } // end else
    } // end addBusinessObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPersistentObjectIdSelectProperty() {
        addPersistentObjectIdSelectProperty("persistentObjectId");
    } // end addPersistentObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPersistentObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectMappingDAO.PersistentObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectMappingDAO.PersistentObjectId,
                "persistentObjectId");
        } // end else
    } // end addPersistentObjectIdSelectProperty()

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
            addSelectProperty(IObjectMappingDAO.State, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectMappingDAO.State, "state");
        } // end else
    } // end addStateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addObjectMappingIdSelectProperty();

        addBusinessObjectIdSelectProperty();

        addPersistentObjectIdSelectProperty();

        addStateSelectProperty();
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
        public Criteria andObjectMappingIdIsNull() {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID is null");

            return this;
        } // end andObjectMappingIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdIsNotNull() {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID is not null");

            return this;
        } // end andObjectMappingIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdIsNotEmpty() {
            addCriterion(
                "OBJECT_MAPPING.OBJECT_MAPPING_ID is not null AND OBJECT_MAPPING.OBJECT_MAPPING_ID <> ''");

            return this;
        } // end andObjectMappingIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdIsEmpty() {
            addCriterion(
                "(OBJECT_MAPPING.OBJECT_MAPPING_ID is null OR OBJECT_MAPPING.OBJECT_MAPPING_ID = '')");

            return this;
        } // end andObjectMappingIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdEqualTo(long value) {
            return andObjectMappingIdEqualTo(Long.valueOf(value));
        } // end andObjectMappingIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID =", value,
                "objectMappingId");

            return this;
        } // end andObjectMappingIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.OBJECT_MAPPING_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectMappingIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotEqualTo(long value) {
            return andObjectMappingIdNotEqualTo(Long.valueOf(value));
        } // end andObjectMappingIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID <>", value,
                "objectMappingId");

            return this;
        } // end andObjectMappingIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotEqualToOrIsNull(long value) {
            return andObjectMappingIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectMappingIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID is null OR OBJECT_MAPPING.OBJECT_MAPPING_ID <>",
                value, "objectMappingId");

            return this;
        } // end andObjectMappingIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.OBJECT_MAPPING_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectMappingIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdGreaterThan(long value) {
            return andObjectMappingIdGreaterThan(Long.valueOf(value));
        } // end andObjectMappingIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID >", value,
                "objectMappingId");

            return this;
        } // end andObjectMappingIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.OBJECT_MAPPING_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectMappingIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdGreaterThanOrEqualTo(long value) {
            return andObjectMappingIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectMappingIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID >=", value,
                "objectMappingId");

            return this;
        } // end andObjectMappingIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.OBJECT_MAPPING_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectMappingIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdLessThan(long value) {
            return andObjectMappingIdLessThan(Long.valueOf(value));
        } // end andObjectMappingIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID <", value,
                "objectMappingId");

            return this;
        } // end andObjectMappingIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.OBJECT_MAPPING_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectMappingIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdLessThanOrEqualTo(long value) {
            return andObjectMappingIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectMappingIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID <=", value,
                "objectMappingId");

            return this;
        } // end andObjectMappingIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.OBJECT_MAPPING_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectMappingIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectMappingIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID in", values,
                    "objectMappingId");

                return this;
            } // end else
        } // end andObjectMappingIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectMappingIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID not in", values,
                    "objectMappingId");

                return this;
            } // end else
        } // end andObjectMappingIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdIn(List values) {
            if (values.size() == 1) {
                return andObjectMappingIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID in", values,
                    "objectMappingId");

                return this;
            } // end else
        } // end andObjectMappingIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectMappingIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID not in", values,
                    "objectMappingId");

                return this;
            } // end else
        } // end andObjectMappingIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectMappingIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID in",
                    Arrays.asList(values), "objectMappingId");

                return this;
            } // end else
        } // end andObjectMappingIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectMappingIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID not in",
                    Arrays.asList(values), "objectMappingId");

                return this;
            } // end else
        } // end andObjectMappingIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdBetween(long value1, long value2) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID between", value1,
                value2, "objectMappingId");

            return this;
        } // end andObjectMappingIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID between", value1,
                value2, "objectMappingId");

            return this;
        } // end andObjectMappingIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID not between",
                value1, value2, "objectMappingId");

            return this;
        } // end andObjectMappingIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectMappingIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_MAPPING.OBJECT_MAPPING_ID not between",
                value1, value2, "objectMappingId");

            return this;
        } // end andObjectMappingIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIsNull() {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID is null");

            return this;
        } // end andBusinessObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIsNotNull() {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID is not null");

            return this;
        } // end andBusinessObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_MAPPING.BUSINESS_OBJECT_ID is not null AND OBJECT_MAPPING.BUSINESS_OBJECT_ID <> ''");

            return this;
        } // end andBusinessObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_MAPPING.BUSINESS_OBJECT_ID is null OR OBJECT_MAPPING.BUSINESS_OBJECT_ID = '')");

            return this;
        } // end andBusinessObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdEqualTo(long value) {
            return andBusinessObjectIdEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID =", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.BUSINESS_OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualTo(long value) {
            return andBusinessObjectIdNotEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID <>", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualToOrIsNull(long value) {
            return andBusinessObjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBusinessObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID is null OR OBJECT_MAPPING.BUSINESS_OBJECT_ID <>",
                value, "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.BUSINESS_OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThan(long value) {
            return andBusinessObjectIdGreaterThan(Long.valueOf(value));
        } // end andBusinessObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID >", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.BUSINESS_OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanOrEqualTo(long value) {
            return andBusinessObjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID >=", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.BUSINESS_OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThan(long value) {
            return andBusinessObjectIdLessThan(Long.valueOf(value));
        } // end andBusinessObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID <", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.BUSINESS_OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanOrEqualTo(long value) {
            return andBusinessObjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID <=", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.BUSINESS_OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID in", values,
                    "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID not in",
                    values, "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIn(List values) {
            if (values.size() == 1) {
                return andBusinessObjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID in", values,
                    "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessObjectIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID not in",
                    values, "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID in",
                    Arrays.asList(values), "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID not in",
                    Arrays.asList(values), "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdBetween(long value1, long value2) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID between", value1,
                value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID between", value1,
                value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID not between",
                value1, value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_MAPPING.BUSINESS_OBJECT_ID not between",
                value1, value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdIsNull() {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID is null");

            return this;
        } // end andPersistentObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdIsNotNull() {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID is not null");

            return this;
        } // end andPersistentObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_MAPPING.PERSISTENT_OBJECT_ID is not null AND OBJECT_MAPPING.PERSISTENT_OBJECT_ID <> ''");

            return this;
        } // end andPersistentObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_MAPPING.PERSISTENT_OBJECT_ID is null OR OBJECT_MAPPING.PERSISTENT_OBJECT_ID = '')");

            return this;
        } // end andPersistentObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdEqualTo(long value) {
            return andPersistentObjectIdEqualTo(Long.valueOf(value));
        } // end andPersistentObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID =", value,
                "persistentObjectId");

            return this;
        } // end andPersistentObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.PERSISTENT_OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPersistentObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotEqualTo(long value) {
            return andPersistentObjectIdNotEqualTo(Long.valueOf(value));
        } // end andPersistentObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID <>", value,
                "persistentObjectId");

            return this;
        } // end andPersistentObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotEqualToOrIsNull(long value) {
            return andPersistentObjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andPersistentObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID is null OR OBJECT_MAPPING.PERSISTENT_OBJECT_ID <>",
                value, "persistentObjectId");

            return this;
        } // end andPersistentObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.PERSISTENT_OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPersistentObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdGreaterThan(long value) {
            return andPersistentObjectIdGreaterThan(Long.valueOf(value));
        } // end andPersistentObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID >", value,
                "persistentObjectId");

            return this;
        } // end andPersistentObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.PERSISTENT_OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPersistentObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdGreaterThanOrEqualTo(long value) {
            return andPersistentObjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andPersistentObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID >=", value,
                "persistentObjectId");

            return this;
        } // end andPersistentObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.PERSISTENT_OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPersistentObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdLessThan(long value) {
            return andPersistentObjectIdLessThan(Long.valueOf(value));
        } // end andPersistentObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID <", value,
                "persistentObjectId");

            return this;
        } // end andPersistentObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.PERSISTENT_OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPersistentObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdLessThanOrEqualTo(long value) {
            return andPersistentObjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andPersistentObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID <=", value,
                "persistentObjectId");

            return this;
        } // end andPersistentObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_MAPPING.PERSISTENT_OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPersistentObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andPersistentObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID in", values,
                    "persistentObjectId");

                return this;
            } // end else
        } // end andPersistentObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andPersistentObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID not in",
                    values, "persistentObjectId");

                return this;
            } // end else
        } // end andPersistentObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdIn(List values) {
            if (values.size() == 1) {
                return andPersistentObjectIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID in", values,
                    "persistentObjectId");

                return this;
            } // end else
        } // end andPersistentObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andPersistentObjectIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID not in",
                    values, "persistentObjectId");

                return this;
            } // end else
        } // end andPersistentObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andPersistentObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID in",
                    Arrays.asList(values), "persistentObjectId");

                return this;
            } // end else
        } // end andPersistentObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andPersistentObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID not in",
                    Arrays.asList(values), "persistentObjectId");

                return this;
            } // end else
        } // end andPersistentObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdBetween(long value1, long value2) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID between", value1,
                value2, "persistentObjectId");

            return this;
        } // end andPersistentObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID between", value1,
                value2, "persistentObjectId");

            return this;
        } // end andPersistentObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID not between",
                value1, value2, "persistentObjectId");

            return this;
        } // end andPersistentObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPersistentObjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_MAPPING.PERSISTENT_OBJECT_ID not between",
                value1, value2, "persistentObjectId");

            return this;
        } // end andPersistentObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNull() {
            addCriterion("OBJECT_MAPPING.STATE is null");

            return this;
        } // end andStateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotNull() {
            addCriterion("OBJECT_MAPPING.STATE is not null");

            return this;
        } // end andStateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotEmpty() {
            addCriterion(
                "OBJECT_MAPPING.STATE is not null AND OBJECT_MAPPING.STATE <> ''");

            return this;
        } // end andStateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsEmpty() {
            addCriterion(
                "(OBJECT_MAPPING.STATE is null OR OBJECT_MAPPING.STATE = '')");

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
            addCriterion("OBJECT_MAPPING.STATE =", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_MAPPING.STATE");
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
            addCriterion("OBJECT_MAPPING.STATE <>", value, "state");

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
            addCriterion("OBJECT_MAPPING.STATE is null OR OBJECT_MAPPING.STATE <>",
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
            StringBuffer str = new StringBuffer("OBJECT_MAPPING.STATE");
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
            addCriterion("OBJECT_MAPPING.STATE >", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_MAPPING.STATE");
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
            addCriterion("OBJECT_MAPPING.STATE >=", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_MAPPING.STATE");
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
            addCriterion("OBJECT_MAPPING.STATE <", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_MAPPING.STATE");
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
            addCriterion("OBJECT_MAPPING.STATE <=", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_MAPPING.STATE");
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
            addCriterion("OBJECT_MAPPING.STATE like", buffer.toString(), "state");

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
            addCriterion("OBJECT_MAPPING.STATE not like", buffer.toString(),
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
                addCriterion("OBJECT_MAPPING.STATE in", values, "state");

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
                addCriterion("OBJECT_MAPPING.STATE not in", values, "state");

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
                addCriterion("OBJECT_MAPPING.STATE in", Arrays.asList(values),
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
                addCriterion("OBJECT_MAPPING.STATE not in",
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
            addCriterion("OBJECT_MAPPING.STATE between", value1, value2, "state");

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
            addCriterion("OBJECT_MAPPING.STATE not between", value1, value2,
                "state");

            return this;
        } // end andStateNotBetween()
    } // end Criteria
} // end ObjectMappingDAOQueryBean
