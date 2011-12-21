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
 * ObjectRelation query bean 2011-09-22 10:16:43
 *
 * @author Auto Gen
 */
public class ObjectRelationDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ObjectRelationDAOQueryBean object.
     */
    public ObjectRelationDAOQueryBean() {
        super();
    } // end ObjectRelationDAOQueryBean()

    /**
     * Creates a new ObjectRelationDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ObjectRelationDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ObjectRelationDAOQueryBean()

    /**
     * Creates a new ObjectRelationDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ObjectRelationDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ObjectRelationDAOQueryBean()

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
    public void addObjectRelationIdSelectProperty() {
        addObjectRelationIdSelectProperty("objectRelationId");
    } // end addObjectRelationIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectRelationIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.ObjectRelationId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.ObjectRelationId,
                "objectRelationId");
        } // end else
    } // end addObjectRelationIdSelectProperty()

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
            addSelectProperty(IObjectRelationDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

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
            addSelectProperty(IObjectRelationDAO.ObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.ObjectId, "objectId");
        } // end else
    } // end addObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedObjectIdSelectProperty() {
        addRelatedObjectIdSelectProperty("relatedObjectId");
    } // end addRelatedObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.RelatedObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.RelatedObjectId,
                "relatedObjectId");
        } // end else
    } // end addRelatedObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelateConfigSelectProperty() {
        addRelateConfigSelectProperty("relateConfig");
    } // end addRelateConfigSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelateConfigSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.RelateConfig, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.RelateConfig, "relateConfig");
        } // end else
    } // end addRelateConfigSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelateTypeSelectProperty() {
        addRelateTypeSelectProperty("relateType");
    } // end addRelateTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelateTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.RelateType, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.RelateType, "relateType");
        } // end else
    } // end addRelateTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedBusinessObjectNameSelectProperty() {
        addRelatedBusinessObjectNameSelectProperty("relatedBusinessObjectName");
    } // end addRelatedBusinessObjectNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedBusinessObjectNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessObjectName,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessObjectName,
                "relatedBusinessObjectName");
        } // end else
    } // end addRelatedBusinessObjectNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedBusinessObjectTypeSelectProperty() {
        addRelatedBusinessObjectTypeSelectProperty("relatedBusinessObjectType");
    } // end addRelatedBusinessObjectTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedBusinessObjectTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessObjectType,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessObjectType,
                "relatedBusinessObjectType");
        } // end else
    } // end addRelatedBusinessObjectTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedBusinessPackageNameSelectProperty() {
        addRelatedBusinessPackageNameSelectProperty(
            "relatedBusinessPackageName");
    } // end addRelatedBusinessPackageNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedBusinessPackageNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessPackageName,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessPackageName,
                "relatedBusinessPackageName");
        } // end else
    } // end addRelatedBusinessPackageNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedBusinessPackageIdSelectProperty() {
        addRelatedBusinessPackageIdSelectProperty("relatedBusinessPackageId");
    } // end addRelatedBusinessPackageIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedBusinessPackageIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessPackageId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationDAO.RelatedBusinessPackageId,
                "relatedBusinessPackageId");
        } // end else
    } // end addRelatedBusinessPackageIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addObjectRelationIdSelectProperty();

        addDescriptionSelectProperty();

        addObjectIdSelectProperty();

        addRelatedObjectIdSelectProperty();

        addRelateConfigSelectProperty();

        addRelateTypeSelectProperty();

        addRelatedBusinessObjectNameSelectProperty();

        addRelatedBusinessObjectTypeSelectProperty();

        addRelatedBusinessPackageNameSelectProperty();

        addRelatedBusinessPackageIdSelectProperty();
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
        public Criteria andObjectRelationIdIsNull() {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID is null");

            return this;
        } // end andObjectRelationIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIsNotNull() {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID is not null");

            return this;
        } // end andObjectRelationIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION.OBJECT_RELATION_ID is not null AND OBJECT_RELATION.OBJECT_RELATION_ID <> ''");

            return this;
        } // end andObjectRelationIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION.OBJECT_RELATION_ID is null OR OBJECT_RELATION.OBJECT_RELATION_ID = '')");

            return this;
        } // end andObjectRelationIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdEqualTo(long value) {
            return andObjectRelationIdEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID =", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.OBJECT_RELATION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualTo(long value) {
            return andObjectRelationIdNotEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID <>", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualToOrIsNull(long value) {
            return andObjectRelationIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectRelationIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID is null OR OBJECT_RELATION.OBJECT_RELATION_ID <>",
                value, "objectRelationId");

            return this;
        } // end andObjectRelationIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.OBJECT_RELATION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThan(long value) {
            return andObjectRelationIdGreaterThan(Long.valueOf(value));
        } // end andObjectRelationIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID >", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.OBJECT_RELATION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanOrEqualTo(long value) {
            return andObjectRelationIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID >=", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.OBJECT_RELATION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThan(long value) {
            return andObjectRelationIdLessThan(Long.valueOf(value));
        } // end andObjectRelationIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID <", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.OBJECT_RELATION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanOrEqualTo(long value) {
            return andObjectRelationIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID <=", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.OBJECT_RELATION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectRelationIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID in", values,
                    "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectRelationIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID not in",
                    values, "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID in", values,
                    "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID not in",
                    values, "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID in",
                    Arrays.asList(values), "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID not in",
                    Arrays.asList(values), "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID between", value1,
                value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID between", value1,
                value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID not between",
                value1, value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION.OBJECT_RELATION_ID not between",
                value1, value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("OBJECT_RELATION.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("OBJECT_RELATION.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION.DESCRIPTION is not null AND OBJECT_RELATION.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION.DESCRIPTION is null OR OBJECT_RELATION.DESCRIPTION = '')");

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
            addCriterion("OBJECT_RELATION.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.DESCRIPTION");
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
            addCriterion("OBJECT_RELATION.DESCRIPTION <>", value, "description");

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
            addCriterion("OBJECT_RELATION.DESCRIPTION is null OR OBJECT_RELATION.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.DESCRIPTION");
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
            addCriterion("OBJECT_RELATION.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.DESCRIPTION");
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
            addCriterion("OBJECT_RELATION.DESCRIPTION >=", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.DESCRIPTION");
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
            addCriterion("OBJECT_RELATION.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.DESCRIPTION");
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
            addCriterion("OBJECT_RELATION.DESCRIPTION <=", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.DESCRIPTION");
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
            addCriterion("OBJECT_RELATION.DESCRIPTION like", buffer.toString(),
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
            addCriterion("OBJECT_RELATION.DESCRIPTION not like",
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
                addCriterion("OBJECT_RELATION.DESCRIPTION in", values,
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
                addCriterion("OBJECT_RELATION.DESCRIPTION not in", values,
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
                addCriterion("OBJECT_RELATION.DESCRIPTION in",
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
                addCriterion("OBJECT_RELATION.DESCRIPTION not in",
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
            addCriterion("OBJECT_RELATION.DESCRIPTION between", value1, value2,
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
            addCriterion("OBJECT_RELATION.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_RELATION.OBJECT_ID is null");

            return this;
        } // end andObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_RELATION.OBJECT_ID is not null");

            return this;
        } // end andObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION.OBJECT_ID is not null AND OBJECT_RELATION.OBJECT_ID <> ''");

            return this;
        } // end andObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION.OBJECT_ID is null OR OBJECT_RELATION.OBJECT_ID = '')");

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
            addCriterion("OBJECT_RELATION.OBJECT_ID =", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.OBJECT_ID");
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
            addCriterion("OBJECT_RELATION.OBJECT_ID <>", value, "objectId");

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
            addCriterion("OBJECT_RELATION.OBJECT_ID is null OR OBJECT_RELATION.OBJECT_ID <>",
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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.OBJECT_ID");
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
            addCriterion("OBJECT_RELATION.OBJECT_ID >", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.OBJECT_ID");
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
            addCriterion("OBJECT_RELATION.OBJECT_ID >=", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.OBJECT_ID");
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
            addCriterion("OBJECT_RELATION.OBJECT_ID <", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.OBJECT_ID");
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
            addCriterion("OBJECT_RELATION.OBJECT_ID <=", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_RELATION.OBJECT_ID");
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
                addCriterion("OBJECT_RELATION.OBJECT_ID in", values, "objectId");

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
                addCriterion("OBJECT_RELATION.OBJECT_ID not in", values,
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
                addCriterion("OBJECT_RELATION.OBJECT_ID in", values, "objectId");

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
                addCriterion("OBJECT_RELATION.OBJECT_ID not in", values,
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
                addCriterion("OBJECT_RELATION.OBJECT_ID in",
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
                addCriterion("OBJECT_RELATION.OBJECT_ID not in",
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
            addCriterion("OBJECT_RELATION.OBJECT_ID between", value1, value2,
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
            addCriterion("OBJECT_RELATION.OBJECT_ID between", value1, value2,
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
            addCriterion("OBJECT_RELATION.OBJECT_ID not between", value1,
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
            addCriterion("OBJECT_RELATION.OBJECT_ID not between", value1,
                value2, "objectId");

            return this;
        } // end andObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdIsNull() {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID is null");

            return this;
        } // end andRelatedObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdIsNotNull() {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID is not null");

            return this;
        } // end andRelatedObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION.RELATED_OBJECT_ID is not null AND OBJECT_RELATION.RELATED_OBJECT_ID <> ''");

            return this;
        } // end andRelatedObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION.RELATED_OBJECT_ID is null OR OBJECT_RELATION.RELATED_OBJECT_ID = '')");

            return this;
        } // end andRelatedObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdEqualTo(long value) {
            return andRelatedObjectIdEqualTo(Long.valueOf(value));
        } // end andRelatedObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID =", value,
                "relatedObjectId");

            return this;
        } // end andRelatedObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.RELATED_OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotEqualTo(long value) {
            return andRelatedObjectIdNotEqualTo(Long.valueOf(value));
        } // end andRelatedObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID <>", value,
                "relatedObjectId");

            return this;
        } // end andRelatedObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotEqualToOrIsNull(long value) {
            return andRelatedObjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andRelatedObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID is null OR OBJECT_RELATION.RELATED_OBJECT_ID <>",
                value, "relatedObjectId");

            return this;
        } // end andRelatedObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.RELATED_OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdGreaterThan(long value) {
            return andRelatedObjectIdGreaterThan(Long.valueOf(value));
        } // end andRelatedObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID >", value,
                "relatedObjectId");

            return this;
        } // end andRelatedObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.RELATED_OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdGreaterThanOrEqualTo(long value) {
            return andRelatedObjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andRelatedObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID >=", value,
                "relatedObjectId");

            return this;
        } // end andRelatedObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.RELATED_OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdLessThan(long value) {
            return andRelatedObjectIdLessThan(Long.valueOf(value));
        } // end andRelatedObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID <", value,
                "relatedObjectId");

            return this;
        } // end andRelatedObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.RELATED_OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdLessThanOrEqualTo(long value) {
            return andRelatedObjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andRelatedObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID <=", value,
                "relatedObjectId");

            return this;
        } // end andRelatedObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION.RELATED_OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andRelatedObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID in", values,
                    "relatedObjectId");

                return this;
            } // end else
        } // end andRelatedObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRelatedObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID not in",
                    values, "relatedObjectId");

                return this;
            } // end else
        } // end andRelatedObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdIn(List values) {
            if (values.size() == 1) {
                return andRelatedObjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID in", values,
                    "relatedObjectId");

                return this;
            } // end else
        } // end andRelatedObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedObjectIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID not in",
                    values, "relatedObjectId");

                return this;
            } // end else
        } // end andRelatedObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID in",
                    Arrays.asList(values), "relatedObjectId");

                return this;
            } // end else
        } // end andRelatedObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID not in",
                    Arrays.asList(values), "relatedObjectId");

                return this;
            } // end else
        } // end andRelatedObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID between", value1,
                value2, "relatedObjectId");

            return this;
        } // end andRelatedObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID between", value1,
                value2, "relatedObjectId");

            return this;
        } // end andRelatedObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID not between",
                value1, value2, "relatedObjectId");

            return this;
        } // end andRelatedObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedObjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION.RELATED_OBJECT_ID not between",
                value1, value2, "relatedObjectId");

            return this;
        } // end andRelatedObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigIsNull() {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG is null");

            return this;
        } // end andRelateConfigIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigIsNotNull() {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG is not null");

            return this;
        } // end andRelateConfigIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION.RELATE_CONFIG is not null AND OBJECT_RELATION.RELATE_CONFIG <> ''");

            return this;
        } // end andRelateConfigIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION.RELATE_CONFIG is null OR OBJECT_RELATION.RELATE_CONFIG = '')");

            return this;
        } // end andRelateConfigIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG =", value,
                "relateConfig");

            return this;
        } // end andRelateConfigEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_CONFIG");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateConfigEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigNotEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG <>", value,
                "relateConfig");

            return this;
        } // end andRelateConfigNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG is null OR OBJECT_RELATION.RELATE_CONFIG <>",
                value, "relateConfig");

            return this;
        } // end andRelateConfigNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_CONFIG");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateConfigNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigGreaterThan(String value) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG >", value,
                "relateConfig");

            return this;
        } // end andRelateConfigGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_CONFIG");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateConfigGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG >=", value,
                "relateConfig");

            return this;
        } // end andRelateConfigGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_CONFIG");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateConfigGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigLessThan(String value) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG <", value,
                "relateConfig");

            return this;
        } // end andRelateConfigLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_CONFIG");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateConfigLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG <=", value,
                "relateConfig");

            return this;
        } // end andRelateConfigLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_CONFIG");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateConfigLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_RELATION.RELATE_CONFIG like",
                buffer.toString(), "relateConfig");

            return this;
        } // end andRelateConfigLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_RELATION.RELATE_CONFIG not like",
                buffer.toString(), "relateConfig");

            return this;
        } // end andRelateConfigNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigIn(List values) {
            if (values.size() == 1) {
                return andRelateConfigEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_CONFIG in", values,
                    "relateConfig");

                return this;
            } // end else
        } // end andRelateConfigIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigNotIn(List values) {
            if (values.size() == 1) {
                return andRelateConfigNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_CONFIG not in", values,
                    "relateConfig");

                return this;
            } // end else
        } // end andRelateConfigNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigIn(Object[] values) {
            if (values.length == 1) {
                return andRelateConfigEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_CONFIG in",
                    Arrays.asList(values), "relateConfig");

                return this;
            } // end else
        } // end andRelateConfigIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelateConfigNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_CONFIG not in",
                    Arrays.asList(values), "relateConfig");

                return this;
            } // end else
        } // end andRelateConfigNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigBetween(String value1, String value2) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG between", value1,
                value2, "relateConfig");

            return this;
        } // end andRelateConfigBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateConfigNotBetween(String value1, String value2) {
            addCriterion("OBJECT_RELATION.RELATE_CONFIG not between", value1,
                value2, "relateConfig");

            return this;
        } // end andRelateConfigNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeIsNull() {
            addCriterion("OBJECT_RELATION.RELATE_TYPE is null");

            return this;
        } // end andRelateTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeIsNotNull() {
            addCriterion("OBJECT_RELATION.RELATE_TYPE is not null");

            return this;
        } // end andRelateTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION.RELATE_TYPE is not null AND OBJECT_RELATION.RELATE_TYPE <> ''");

            return this;
        } // end andRelateTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION.RELATE_TYPE is null OR OBJECT_RELATION.RELATE_TYPE = '')");

            return this;
        } // end andRelateTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE =", value, "relateType");

            return this;
        } // end andRelateTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeNotEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE <>", value, "relateType");

            return this;
        } // end andRelateTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE is null OR OBJECT_RELATION.RELATE_TYPE <>",
                value, "relateType");

            return this;
        } // end andRelateTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeGreaterThan(String value) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE >", value, "relateType");

            return this;
        } // end andRelateTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE >=", value, "relateType");

            return this;
        } // end andRelateTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeLessThan(String value) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE <", value, "relateType");

            return this;
        } // end andRelateTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE <=", value, "relateType");

            return this;
        } // end andRelateTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_RELATION.RELATE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_RELATION.RELATE_TYPE like", buffer.toString(),
                "relateType");

            return this;
        } // end andRelateTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_RELATION.RELATE_TYPE not like",
                buffer.toString(), "relateType");

            return this;
        } // end andRelateTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeIn(List values) {
            if (values.size() == 1) {
                return andRelateTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_TYPE in", values,
                    "relateType");

                return this;
            } // end else
        } // end andRelateTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeNotIn(List values) {
            if (values.size() == 1) {
                return andRelateTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_TYPE not in", values,
                    "relateType");

                return this;
            } // end else
        } // end andRelateTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeIn(Object[] values) {
            if (values.length == 1) {
                return andRelateTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_TYPE in",
                    Arrays.asList(values), "relateType");

                return this;
            } // end else
        } // end andRelateTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelateTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION.RELATE_TYPE not in",
                    Arrays.asList(values), "relateType");

                return this;
            } // end else
        } // end andRelateTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeBetween(String value1, String value2) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE between", value1, value2,
                "relateType");

            return this;
        } // end andRelateTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateTypeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_RELATION.RELATE_TYPE not between", value1,
                value2, "relateType");

            return this;
        } // end andRelateTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameIsNull() {
            addCriterion("relatedBusinessObject.NAME is null");

            return this;
        } // end andRelatedBusinessObjectNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameIsNotNull() {
            addCriterion("relatedBusinessObject.NAME is not null");

            return this;
        } // end andRelatedBusinessObjectNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameIsNotEmpty() {
            addCriterion(
                "relatedBusinessObject.NAME is not null AND relatedBusinessObject.NAME <> ''");

            return this;
        } // end andRelatedBusinessObjectNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameIsEmpty() {
            addCriterion(
                "(relatedBusinessObject.NAME is null OR relatedBusinessObject.NAME = '')");

            return this;
        } // end andRelatedBusinessObjectNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameEqualTo(String value) {
            addCriterion("relatedBusinessObject.NAME =", value,
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameNotEqualTo(String value) {
            addCriterion("relatedBusinessObject.NAME <>", value,
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedBusinessObject.NAME is null OR relatedBusinessObject.NAME <>",
                value, "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameGreaterThan(String value) {
            addCriterion("relatedBusinessObject.NAME >", value,
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedBusinessObject.NAME >=", value,
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameLessThan(String value) {
            addCriterion("relatedBusinessObject.NAME <", value,
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameLessThanOrEqualTo(
            String value) {
            addCriterion("relatedBusinessObject.NAME <=", value,
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedBusinessObject.NAME like", buffer.toString(),
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedBusinessObject.NAME not like",
                buffer.toString(), "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessObjectNameEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessObject.NAME in", values,
                    "relatedBusinessObjectName");

                return this;
            } // end else
        } // end andRelatedBusinessObjectNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessObjectNameNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessObject.NAME not in", values,
                    "relatedBusinessObjectName");

                return this;
            } // end else
        } // end andRelatedBusinessObjectNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessObjectNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.NAME in",
                    Arrays.asList(values), "relatedBusinessObjectName");

                return this;
            } // end else
        } // end andRelatedBusinessObjectNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessObjectNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.NAME not in",
                    Arrays.asList(values), "relatedBusinessObjectName");

                return this;
            } // end else
        } // end andRelatedBusinessObjectNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameBetween(String value1,
            String value2) {
            addCriterion("relatedBusinessObject.NAME between", value1, value2,
                "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectNameNotBetween(String value1,
            String value2) {
            addCriterion("relatedBusinessObject.NAME not between", value1,
                value2, "relatedBusinessObjectName");

            return this;
        } // end andRelatedBusinessObjectNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeIsNull() {
            addCriterion("relatedBusinessObject.TYPE is null");

            return this;
        } // end andRelatedBusinessObjectTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeIsNotNull() {
            addCriterion("relatedBusinessObject.TYPE is not null");

            return this;
        } // end andRelatedBusinessObjectTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeIsNotEmpty() {
            addCriterion(
                "relatedBusinessObject.TYPE is not null AND relatedBusinessObject.TYPE <> ''");

            return this;
        } // end andRelatedBusinessObjectTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeIsEmpty() {
            addCriterion(
                "(relatedBusinessObject.TYPE is null OR relatedBusinessObject.TYPE = '')");

            return this;
        } // end andRelatedBusinessObjectTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeEqualTo(String value) {
            addCriterion("relatedBusinessObject.TYPE =", value,
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeNotEqualTo(String value) {
            addCriterion("relatedBusinessObject.TYPE <>", value,
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedBusinessObject.TYPE is null OR relatedBusinessObject.TYPE <>",
                value, "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeGreaterThan(String value) {
            addCriterion("relatedBusinessObject.TYPE >", value,
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedBusinessObject.TYPE >=", value,
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeLessThan(String value) {
            addCriterion("relatedBusinessObject.TYPE <", value,
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeLessThanOrEqualTo(
            String value) {
            addCriterion("relatedBusinessObject.TYPE <=", value,
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessObject.TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessObjectTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedBusinessObject.TYPE like", buffer.toString(),
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedBusinessObject.TYPE not like",
                buffer.toString(), "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessObjectTypeEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessObject.TYPE in", values,
                    "relatedBusinessObjectType");

                return this;
            } // end else
        } // end andRelatedBusinessObjectTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessObjectTypeNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessObject.TYPE not in", values,
                    "relatedBusinessObjectType");

                return this;
            } // end else
        } // end andRelatedBusinessObjectTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessObjectTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.TYPE in",
                    Arrays.asList(values), "relatedBusinessObjectType");

                return this;
            } // end else
        } // end andRelatedBusinessObjectTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessObjectTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.TYPE not in",
                    Arrays.asList(values), "relatedBusinessObjectType");

                return this;
            } // end else
        } // end andRelatedBusinessObjectTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeBetween(String value1,
            String value2) {
            addCriterion("relatedBusinessObject.TYPE between", value1, value2,
                "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessObjectTypeNotBetween(String value1,
            String value2) {
            addCriterion("relatedBusinessObject.TYPE not between", value1,
                value2, "relatedBusinessObjectType");

            return this;
        } // end andRelatedBusinessObjectTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameIsNull() {
            addCriterion("relatedBusinessPackage.NAME is null");

            return this;
        } // end andRelatedBusinessPackageNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameIsNotNull() {
            addCriterion("relatedBusinessPackage.NAME is not null");

            return this;
        } // end andRelatedBusinessPackageNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameIsNotEmpty() {
            addCriterion(
                "relatedBusinessPackage.NAME is not null AND relatedBusinessPackage.NAME <> ''");

            return this;
        } // end andRelatedBusinessPackageNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameIsEmpty() {
            addCriterion(
                "(relatedBusinessPackage.NAME is null OR relatedBusinessPackage.NAME = '')");

            return this;
        } // end andRelatedBusinessPackageNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameEqualTo(String value) {
            addCriterion("relatedBusinessPackage.NAME =", value,
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessPackage.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameNotEqualTo(String value) {
            addCriterion("relatedBusinessPackage.NAME <>", value,
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedBusinessPackage.NAME is null OR relatedBusinessPackage.NAME <>",
                value, "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessPackage.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameGreaterThan(String value) {
            addCriterion("relatedBusinessPackage.NAME >", value,
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessPackage.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedBusinessPackage.NAME >=", value,
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessPackage.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameLessThan(String value) {
            addCriterion("relatedBusinessPackage.NAME <", value,
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessPackage.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameLessThanOrEqualTo(
            String value) {
            addCriterion("relatedBusinessPackage.NAME <=", value,
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedBusinessPackage.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedBusinessPackage.NAME like", buffer.toString(),
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedBusinessPackage.NAME not like",
                buffer.toString(), "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessPackageNameEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessPackage.NAME in", values,
                    "relatedBusinessPackageName");

                return this;
            } // end else
        } // end andRelatedBusinessPackageNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessPackageNameNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessPackage.NAME not in", values,
                    "relatedBusinessPackageName");

                return this;
            } // end else
        } // end andRelatedBusinessPackageNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessPackageNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessPackage.NAME in",
                    Arrays.asList(values), "relatedBusinessPackageName");

                return this;
            } // end else
        } // end andRelatedBusinessPackageNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessPackageNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessPackage.NAME not in",
                    Arrays.asList(values), "relatedBusinessPackageName");

                return this;
            } // end else
        } // end andRelatedBusinessPackageNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameBetween(String value1,
            String value2) {
            addCriterion("relatedBusinessPackage.NAME between", value1, value2,
                "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageNameNotBetween(String value1,
            String value2) {
            addCriterion("relatedBusinessPackage.NAME not between", value1,
                value2, "relatedBusinessPackageName");

            return this;
        } // end andRelatedBusinessPackageNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdIsNull() {
            addCriterion("relatedBusinessObject.PACKAGE_ID is null");

            return this;
        } // end andRelatedBusinessPackageIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdIsNotNull() {
            addCriterion("relatedBusinessObject.PACKAGE_ID is not null");

            return this;
        } // end andRelatedBusinessPackageIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdIsNotEmpty() {
            addCriterion(
                "relatedBusinessObject.PACKAGE_ID is not null AND relatedBusinessObject.PACKAGE_ID <> ''");

            return this;
        } // end andRelatedBusinessPackageIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdIsEmpty() {
            addCriterion(
                "(relatedBusinessObject.PACKAGE_ID is null OR relatedBusinessObject.PACKAGE_ID = '')");

            return this;
        } // end andRelatedBusinessPackageIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdEqualTo(long value) {
            return andRelatedBusinessPackageIdEqualTo(Long.valueOf(value));
        } // end andRelatedBusinessPackageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdEqualTo(java.lang.Long value) {
            addCriterion("relatedBusinessObject.PACKAGE_ID =", value,
                "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedBusinessObject.PACKAGE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotEqualTo(long value) {
            return andRelatedBusinessPackageIdNotEqualTo(Long.valueOf(value));
        } // end andRelatedBusinessPackageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotEqualTo(
            java.lang.Long value) {
            addCriterion("relatedBusinessObject.PACKAGE_ID <>", value,
                "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotEqualToOrIsNull(
            long value) {
            return andRelatedBusinessPackageIdNotEqualToOrIsNull(Long.valueOf(
                    value));
        } // end andRelatedBusinessPackageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("relatedBusinessObject.PACKAGE_ID is null OR relatedBusinessObject.PACKAGE_ID <>",
                value, "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedBusinessObject.PACKAGE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdGreaterThan(long value) {
            return andRelatedBusinessPackageIdGreaterThan(Long.valueOf(value));
        } // end andRelatedBusinessPackageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdGreaterThan(
            java.lang.Long value) {
            addCriterion("relatedBusinessObject.PACKAGE_ID >", value,
                "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedBusinessObject.PACKAGE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdGreaterThanOrEqualTo(
            long value) {
            return andRelatedBusinessPackageIdGreaterThanOrEqualTo(Long.valueOf(
                    value));
        } // end andRelatedBusinessPackageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("relatedBusinessObject.PACKAGE_ID >=", value,
                "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedBusinessObject.PACKAGE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdLessThan(long value) {
            return andRelatedBusinessPackageIdLessThan(Long.valueOf(value));
        } // end andRelatedBusinessPackageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdLessThan(
            java.lang.Long value) {
            addCriterion("relatedBusinessObject.PACKAGE_ID <", value,
                "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedBusinessObject.PACKAGE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdLessThanOrEqualTo(long value) {
            return andRelatedBusinessPackageIdLessThanOrEqualTo(Long.valueOf(
                    value));
        } // end andRelatedBusinessPackageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("relatedBusinessObject.PACKAGE_ID <=", value,
                "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedBusinessObject.PACKAGE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedBusinessPackageIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdIn(long[] values) {
            if (values.length == 1) {
                return andRelatedBusinessPackageIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.PACKAGE_ID in", values,
                    "relatedBusinessPackageId");

                return this;
            } // end else
        } // end andRelatedBusinessPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRelatedBusinessPackageIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.PACKAGE_ID not in", values,
                    "relatedBusinessPackageId");

                return this;
            } // end else
        } // end andRelatedBusinessPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessPackageIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessObject.PACKAGE_ID in", values,
                    "relatedBusinessPackageId");

                return this;
            } // end else
        } // end andRelatedBusinessPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedBusinessPackageIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedBusinessObject.PACKAGE_ID not in", values,
                    "relatedBusinessPackageId");

                return this;
            } // end else
        } // end andRelatedBusinessPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessPackageIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.PACKAGE_ID in",
                    Arrays.asList(values), "relatedBusinessPackageId");

                return this;
            } // end else
        } // end andRelatedBusinessPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedBusinessPackageIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("relatedBusinessObject.PACKAGE_ID not in",
                    Arrays.asList(values), "relatedBusinessPackageId");

                return this;
            } // end else
        } // end andRelatedBusinessPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdBetween(long value1,
            long value2) {
            addCriterion("relatedBusinessObject.PACKAGE_ID between", value1,
                value2, "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("relatedBusinessObject.PACKAGE_ID between", value1,
                value2, "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotBetween(long value1,
            long value2) {
            addCriterion("relatedBusinessObject.PACKAGE_ID not between",
                value1, value2, "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedBusinessPackageIdNotBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("relatedBusinessObject.PACKAGE_ID not between",
                value1, value2, "relatedBusinessPackageId");

            return this;
        } // end andRelatedBusinessPackageIdNotBetween()
    } // end Criteria
} // end ObjectRelationDAOQueryBean
