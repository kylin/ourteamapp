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
 * VelocityTemplate query bean 2011-09-22 10:16:52
 *
 * @author Auto Gen
 */
public class VelocityTemplateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new VelocityTemplateDAOQueryBean object.
     */
    public VelocityTemplateDAOQueryBean() {
        super();
    } // end VelocityTemplateDAOQueryBean()

    /**
     * Creates a new VelocityTemplateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public VelocityTemplateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end VelocityTemplateDAOQueryBean()

    /**
     * Creates a new VelocityTemplateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public VelocityTemplateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end VelocityTemplateDAOQueryBean()

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
            addSelectProperty(IVelocityTemplateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IVelocityTemplateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(IVelocityTemplateDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IVelocityTemplateDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTemplateContentSelectProperty() {
        addTemplateContentSelectProperty("templateContent");
    } // end addTemplateContentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTemplateContentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IVelocityTemplateDAO.TemplateContent, aAlias);
        } // end if
        else {
            addSelectProperty(IVelocityTemplateDAO.TemplateContent,
                "templateContent");
        } // end else
    } // end addTemplateContentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTemplateNameSelectProperty() {
        addTemplateNameSelectProperty("templateName");
    } // end addTemplateNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTemplateNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IVelocityTemplateDAO.TemplateName, aAlias);
        } // end if
        else {
            addSelectProperty(IVelocityTemplateDAO.TemplateName, "templateName");
        } // end else
    } // end addTemplateNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTemplateTimestampSelectProperty() {
        addTemplateTimestampSelectProperty("templateTimestamp");
    } // end addTemplateTimestampSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTemplateTimestampSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IVelocityTemplateDAO.TemplateTimestamp, aAlias);
        } // end if
        else {
            addSelectProperty(IVelocityTemplateDAO.TemplateTimestamp,
                "templateTimestamp");
        } // end else
    } // end addTemplateTimestampSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDescriptionSelectProperty();

        addTemplateContentSelectProperty();

        addTemplateNameSelectProperty();

        addTemplateTimestampSelectProperty();
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
            addCriterion("VELOCITY_TEMPLATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("VELOCITY_TEMPLATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "VELOCITY_TEMPLATE.ID is not null AND VELOCITY_TEMPLATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(VELOCITY_TEMPLATE.ID is null OR VELOCITY_TEMPLATE.ID = '')");

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
            addCriterion("VELOCITY_TEMPLATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.ID");
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
            addCriterion("VELOCITY_TEMPLATE.ID <>", value, "id");

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
            addCriterion("VELOCITY_TEMPLATE.ID is null OR VELOCITY_TEMPLATE.ID <>",
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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.ID");
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
            addCriterion("VELOCITY_TEMPLATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.ID");
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
            addCriterion("VELOCITY_TEMPLATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.ID");
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
            addCriterion("VELOCITY_TEMPLATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.ID");
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
            addCriterion("VELOCITY_TEMPLATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.ID");
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
                addCriterion("VELOCITY_TEMPLATE.ID in", values, "id");

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
                addCriterion("VELOCITY_TEMPLATE.ID not in", values, "id");

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
                addCriterion("VELOCITY_TEMPLATE.ID in", values, "id");

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
                addCriterion("VELOCITY_TEMPLATE.ID not in", values, "id");

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
                addCriterion("VELOCITY_TEMPLATE.ID in", Arrays.asList(values),
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
                addCriterion("VELOCITY_TEMPLATE.ID not in",
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
            addCriterion("VELOCITY_TEMPLATE.ID between", value1, value2, "id");

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
            addCriterion("VELOCITY_TEMPLATE.ID between", value1, value2, "id");

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
            addCriterion("VELOCITY_TEMPLATE.ID not between", value1, value2,
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
            addCriterion("VELOCITY_TEMPLATE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "VELOCITY_TEMPLATE.DESCRIPTION is not null AND VELOCITY_TEMPLATE.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(VELOCITY_TEMPLATE.DESCRIPTION is null OR VELOCITY_TEMPLATE.DESCRIPTION = '')");

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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.DESCRIPTION");
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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION <>", value,
                "description");

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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION is null OR VELOCITY_TEMPLATE.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.DESCRIPTION");
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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.DESCRIPTION");
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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION >=", value,
                "description");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.DESCRIPTION");
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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.DESCRIPTION");
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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION <=", value,
                "description");

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
            StringBuffer str = new StringBuffer("VELOCITY_TEMPLATE.DESCRIPTION");
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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION like",
                buffer.toString(), "description");

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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION not like",
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
                addCriterion("VELOCITY_TEMPLATE.DESCRIPTION in", values,
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
                addCriterion("VELOCITY_TEMPLATE.DESCRIPTION not in", values,
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
                addCriterion("VELOCITY_TEMPLATE.DESCRIPTION in",
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
                addCriterion("VELOCITY_TEMPLATE.DESCRIPTION not in",
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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION between", value1,
                value2, "description");

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
            addCriterion("VELOCITY_TEMPLATE.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentIsNull() {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT is null");

            return this;
        } // end andTemplateContentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentIsNotNull() {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT is not null");

            return this;
        } // end andTemplateContentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentIsNotEmpty() {
            addCriterion(
                "VELOCITY_TEMPLATE.TEMPLATE_CONTENT is not null AND VELOCITY_TEMPLATE.TEMPLATE_CONTENT <> ''");

            return this;
        } // end andTemplateContentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentIsEmpty() {
            addCriterion(
                "(VELOCITY_TEMPLATE.TEMPLATE_CONTENT is null OR VELOCITY_TEMPLATE.TEMPLATE_CONTENT = '')");

            return this;
        } // end andTemplateContentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT =", value,
                "templateContent");

            return this;
        } // end andTemplateContentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_CONTENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateContentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentNotEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT <>", value,
                "templateContent");

            return this;
        } // end andTemplateContentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentNotEqualToOrIsNull(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT is null OR VELOCITY_TEMPLATE.TEMPLATE_CONTENT <>",
                value, "templateContent");

            return this;
        } // end andTemplateContentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_CONTENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateContentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentGreaterThan(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT >", value,
                "templateContent");

            return this;
        } // end andTemplateContentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_CONTENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateContentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentGreaterThanOrEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT >=", value,
                "templateContent");

            return this;
        } // end andTemplateContentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_CONTENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateContentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentLessThan(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT <", value,
                "templateContent");

            return this;
        } // end andTemplateContentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_CONTENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateContentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentLessThanOrEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT <=", value,
                "templateContent");

            return this;
        } // end andTemplateContentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_CONTENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateContentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT like",
                buffer.toString(), "templateContent");

            return this;
        } // end andTemplateContentLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT not like",
                buffer.toString(), "templateContent");

            return this;
        } // end andTemplateContentNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentIn(List values) {
            if (values.size() == 1) {
                return andTemplateContentEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT in", values,
                    "templateContent");

                return this;
            } // end else
        } // end andTemplateContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentNotIn(List values) {
            if (values.size() == 1) {
                return andTemplateContentNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT not in",
                    values, "templateContent");

                return this;
            } // end else
        } // end andTemplateContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateContentEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT in",
                    Arrays.asList(values), "templateContent");

                return this;
            } // end else
        } // end andTemplateContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentNotIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateContentNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT not in",
                    Arrays.asList(values), "templateContent");

                return this;
            } // end else
        } // end andTemplateContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentBetween(String value1, String value2) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT between", value1,
                value2, "templateContent");

            return this;
        } // end andTemplateContentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateContentNotBetween(String value1,
            String value2) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_CONTENT not between",
                value1, value2, "templateContent");

            return this;
        } // end andTemplateContentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsNull() {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME is null");

            return this;
        } // end andTemplateNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsNotNull() {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME is not null");

            return this;
        } // end andTemplateNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsNotEmpty() {
            addCriterion(
                "VELOCITY_TEMPLATE.TEMPLATE_NAME is not null AND VELOCITY_TEMPLATE.TEMPLATE_NAME <> ''");

            return this;
        } // end andTemplateNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsEmpty() {
            addCriterion(
                "(VELOCITY_TEMPLATE.TEMPLATE_NAME is null OR VELOCITY_TEMPLATE.TEMPLATE_NAME = '')");

            return this;
        } // end andTemplateNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME =", value,
                "templateName");

            return this;
        } // end andTemplateNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME <>", value,
                "templateName");

            return this;
        } // end andTemplateNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotEqualToOrIsNull(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME is null OR VELOCITY_TEMPLATE.TEMPLATE_NAME <>",
                value, "templateName");

            return this;
        } // end andTemplateNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME >", value,
                "templateName");

            return this;
        } // end andTemplateNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME >=", value,
                "templateName");

            return this;
        } // end andTemplateNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME <", value,
                "templateName");

            return this;
        } // end andTemplateNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME <=", value,
                "templateName");

            return this;
        } // end andTemplateNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME like",
                buffer.toString(), "templateName");

            return this;
        } // end andTemplateNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME not like",
                buffer.toString(), "templateName");

            return this;
        } // end andTemplateNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIn(List values) {
            if (values.size() == 1) {
                return andTemplateNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME in", values,
                    "templateName");

                return this;
            } // end else
        } // end andTemplateNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotIn(List values) {
            if (values.size() == 1) {
                return andTemplateNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME not in", values,
                    "templateName");

                return this;
            } // end else
        } // end andTemplateNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME in",
                    Arrays.asList(values), "templateName");

                return this;
            } // end else
        } // end andTemplateNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME not in",
                    Arrays.asList(values), "templateName");

                return this;
            } // end else
        } // end andTemplateNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME between", value1,
                value2, "templateName");

            return this;
        } // end andTemplateNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_NAME not between", value1,
                value2, "templateName");

            return this;
        } // end andTemplateNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampIsNull() {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP is null");

            return this;
        } // end andTemplateTimestampIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampIsNotNull() {
            addCriterion("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP is not null");

            return this;
        } // end andTemplateTimestampIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampIsNotEmpty() {
            addCriterion(
                "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP is not null AND VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP <> ''");

            return this;
        } // end andTemplateTimestampIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampIsEmpty() {
            addCriterion(
                "(VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP is null OR VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP = '')");

            return this;
        } // end andTemplateTimestampIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP =",
                value, "templateTimestamp");

            return this;
        } // end andTemplateTimestampEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateTimestampEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP <>",
                value, "templateTimestamp");

            return this;
        } // end andTemplateTimestampNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampNotEqualToOrIsNull(
            java.util.Date value) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP is null OR VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP <>",
                value, "templateTimestamp");

            return this;
        } // end andTemplateTimestampNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateTimestampNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP >",
                value, "templateTimestamp");

            return this;
        } // end andTemplateTimestampGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateTimestampGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP >=",
                value, "templateTimestamp");

            return this;
        } // end andTemplateTimestampGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateTimestampGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampLessThan(java.util.Date value) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP <",
                value, "templateTimestamp");

            return this;
        } // end andTemplateTimestampLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateTimestampLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampLessThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP <=",
                value, "templateTimestamp");

            return this;
        } // end andTemplateTimestampLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateTimestampLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampIn(List values) {
            if (values.size() == 1) {
                return andTemplateTimestampEqualTo((java.util.Date) values.get(
                        0));
            } // end if
            else {
                addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP in",
                    values, "templateTimestamp");

                return this;
            } // end else
        } // end andTemplateTimestampIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampNotIn(List values) {
            if (values.size() == 1) {
                return andTemplateTimestampNotEqualTo((java.util.Date) values.get(
                        0));
            } // end if
            else {
                addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP not in",
                    values, "templateTimestamp");

                return this;
            } // end else
        } // end andTemplateTimestampNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateTimestampEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP in",
                    Arrays.asList(values), "templateTimestamp");

                return this;
            } // end else
        } // end andTemplateTimestampIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampNotIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateTimestampNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP not in",
                    Arrays.asList(values), "templateTimestamp");

                return this;
            } // end else
        } // end andTemplateTimestampNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP between",
                value1, value2, "templateTimestamp");

            return this;
        } // end andTemplateTimestampBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateTimestampNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP not between",
                value1, value2, "templateTimestamp");

            return this;
        } // end andTemplateTimestampNotBetween()
    } // end Criteria
} // end VelocityTemplateDAOQueryBean
