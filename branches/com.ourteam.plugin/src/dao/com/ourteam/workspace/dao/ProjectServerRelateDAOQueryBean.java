/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * ProjectServerRelate query bean 2011-09-22 10:17:22
 *
 * @author Auto Gen
 */
public class ProjectServerRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ProjectServerRelateDAOQueryBean object.
     */
    public ProjectServerRelateDAOQueryBean() {
        super();
    } // end ProjectServerRelateDAOQueryBean()

    /**
     * Creates a new ProjectServerRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ProjectServerRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ProjectServerRelateDAOQueryBean()

    /**
     * Creates a new ProjectServerRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ProjectServerRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ProjectServerRelateDAOQueryBean()

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
            addSelectProperty(IProjectServerRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectServerRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMiddleWareIdSelectProperty() {
        addMiddleWareIdSelectProperty("middleWareId");
    } // end addMiddleWareIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMiddleWareIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProjectServerRelateDAO.MiddleWareId, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectServerRelateDAO.MiddleWareId,
                "middleWareId");
        } // end else
    } // end addMiddleWareIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProjectIdSelectProperty() {
        addProjectIdSelectProperty("projectId");
    } // end addProjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProjectServerRelateDAO.ProjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectServerRelateDAO.ProjectId, "projectId");
        } // end else
    } // end addProjectIdSelectProperty()

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
            addSelectProperty(IProjectServerRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectServerRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addServerTypeSelectProperty() {
        addServerTypeSelectProperty("serverType");
    } // end addServerTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addServerTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IProjectServerRelateDAO.ServerType, aAlias);
        } // end if
        else {
            addSelectProperty(IProjectServerRelateDAO.ServerType, "serverType");
        } // end else
    } // end addServerTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addMiddleWareIdSelectProperty();

        addProjectIdSelectProperty();

        addStatusSelectProperty();

        addServerTypeSelectProperty();
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
            addCriterion("PROJECT_SERVER_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("PROJECT_SERVER_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "PROJECT_SERVER_RELATE.ID is not null AND PROJECT_SERVER_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(PROJECT_SERVER_RELATE.ID is null OR PROJECT_SERVER_RELATE.ID = '')");

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
            addCriterion("PROJECT_SERVER_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.ID");
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
            addCriterion("PROJECT_SERVER_RELATE.ID <>", value, "id");

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
            addCriterion("PROJECT_SERVER_RELATE.ID is null OR PROJECT_SERVER_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.ID");
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
            addCriterion("PROJECT_SERVER_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.ID");
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
            addCriterion("PROJECT_SERVER_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.ID");
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
            addCriterion("PROJECT_SERVER_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.ID");
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
            addCriterion("PROJECT_SERVER_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.ID");
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
                addCriterion("PROJECT_SERVER_RELATE.ID in", values, "id");

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
                addCriterion("PROJECT_SERVER_RELATE.ID not in", values, "id");

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
                addCriterion("PROJECT_SERVER_RELATE.ID in", values, "id");

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
                addCriterion("PROJECT_SERVER_RELATE.ID not in", values, "id");

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
                addCriterion("PROJECT_SERVER_RELATE.ID in",
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
                addCriterion("PROJECT_SERVER_RELATE.ID not in",
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
            addCriterion("PROJECT_SERVER_RELATE.ID between", value1, value2,
                "id");

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
            addCriterion("PROJECT_SERVER_RELATE.ID between", value1, value2,
                "id");

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
            addCriterion("PROJECT_SERVER_RELATE.ID not between", value1,
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
            addCriterion("PROJECT_SERVER_RELATE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsNull() {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID is null");

            return this;
        } // end andMiddleWareIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsNotNull() {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID is not null");

            return this;
        } // end andMiddleWareIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsNotEmpty() {
            addCriterion(
                "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID is not null AND PROJECT_SERVER_RELATE.MIDDLE_WARE_ID <> ''");

            return this;
        } // end andMiddleWareIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsEmpty() {
            addCriterion(
                "(PROJECT_SERVER_RELATE.MIDDLE_WARE_ID is null OR PROJECT_SERVER_RELATE.MIDDLE_WARE_ID = '')");

            return this;
        } // end andMiddleWareIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdEqualTo(long value) {
            return andMiddleWareIdEqualTo(Long.valueOf(value));
        } // end andMiddleWareIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID =", value,
                "middleWareId");

            return this;
        } // end andMiddleWareIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotEqualTo(long value) {
            return andMiddleWareIdNotEqualTo(Long.valueOf(value));
        } // end andMiddleWareIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID <>", value,
                "middleWareId");

            return this;
        } // end andMiddleWareIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotEqualToOrIsNull(long value) {
            return andMiddleWareIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andMiddleWareIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID is null OR PROJECT_SERVER_RELATE.MIDDLE_WARE_ID <>",
                value, "middleWareId");

            return this;
        } // end andMiddleWareIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdGreaterThan(long value) {
            return andMiddleWareIdGreaterThan(Long.valueOf(value));
        } // end andMiddleWareIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdGreaterThan(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID >", value,
                "middleWareId");

            return this;
        } // end andMiddleWareIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdGreaterThanOrEqualTo(long value) {
            return andMiddleWareIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andMiddleWareIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID >=", value,
                "middleWareId");

            return this;
        } // end andMiddleWareIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdLessThan(long value) {
            return andMiddleWareIdLessThan(Long.valueOf(value));
        } // end andMiddleWareIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdLessThan(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID <", value,
                "middleWareId");

            return this;
        } // end andMiddleWareIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdLessThanOrEqualTo(long value) {
            return andMiddleWareIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andMiddleWareIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID <=", value,
                "middleWareId");

            return this;
        } // end andMiddleWareIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIn(long[] values) {
            if (values.length == 1) {
                return andMiddleWareIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID in", values,
                    "middleWareId");

                return this;
            } // end else
        } // end andMiddleWareIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotIn(long[] values) {
            if (values.length == 1) {
                return andMiddleWareIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID not in",
                    values, "middleWareId");

                return this;
            } // end else
        } // end andMiddleWareIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID in", values,
                    "middleWareId");

                return this;
            } // end else
        } // end andMiddleWareIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID not in",
                    values, "middleWareId");

                return this;
            } // end else
        } // end andMiddleWareIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID in",
                    Arrays.asList(values), "middleWareId");

                return this;
            } // end else
        } // end andMiddleWareIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID not in",
                    Arrays.asList(values), "middleWareId");

                return this;
            } // end else
        } // end andMiddleWareIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdBetween(long value1, long value2) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID between",
                value1, value2, "middleWareId");

            return this;
        } // end andMiddleWareIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID between",
                value1, value2, "middleWareId");

            return this;
        } // end andMiddleWareIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotBetween(long value1, long value2) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID not between",
                value1, value2, "middleWareId");

            return this;
        } // end andMiddleWareIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_SERVER_RELATE.MIDDLE_WARE_ID not between",
                value1, value2, "middleWareId");

            return this;
        } // end andMiddleWareIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID is null");

            return this;
        } // end andProjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID is not null");

            return this;
        } // end andProjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsNotEmpty() {
            addCriterion(
                "PROJECT_SERVER_RELATE.PROJECT_ID is not null AND PROJECT_SERVER_RELATE.PROJECT_ID <> ''");

            return this;
        } // end andProjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIsEmpty() {
            addCriterion(
                "(PROJECT_SERVER_RELATE.PROJECT_ID is null OR PROJECT_SERVER_RELATE.PROJECT_ID = '')");

            return this;
        } // end andProjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualTo(long value) {
            return andProjectIdEqualTo(Long.valueOf(value));
        } // end andProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID =", value,
                "projectId");

            return this;
        } // end andProjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.PROJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualTo(long value) {
            return andProjectIdNotEqualTo(Long.valueOf(value));
        } // end andProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID <>", value,
                "projectId");

            return this;
        } // end andProjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToOrIsNull(long value) {
            return andProjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID is null OR PROJECT_SERVER_RELATE.PROJECT_ID <>",
                value, "projectId");

            return this;
        } // end andProjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.PROJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThan(long value) {
            return andProjectIdGreaterThan(Long.valueOf(value));
        } // end andProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThan(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID >", value,
                "projectId");

            return this;
        } // end andProjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.PROJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualTo(long value) {
            return andProjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID >=", value,
                "projectId");

            return this;
        } // end andProjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.PROJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThan(long value) {
            return andProjectIdLessThan(Long.valueOf(value));
        } // end andProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThan(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID <", value,
                "projectId");

            return this;
        } // end andProjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.PROJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualTo(long value) {
            return andProjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID <=", value,
                "projectId");

            return this;
        } // end andProjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "PROJECT_SERVER_RELATE.PROJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(long[] values) {
            if (values.length == 1) {
                return andProjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID not in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(List values) {
            if (values.size() == 1) {
                return andProjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andProjectIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID not in", values,
                    "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andProjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID in",
                    Arrays.asList(values), "projectId");

                return this;
            } // end else
        } // end andProjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID not in",
                    Arrays.asList(values), "projectId");

                return this;
            } // end else
        } // end andProjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdBetween(long value1, long value2) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID between", value1,
                value2, "projectId");

            return this;
        } // end andProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID between", value1,
                value2, "projectId");

            return this;
        } // end andProjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotBetween(long value1, long value2) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID not between",
                value1, value2, "projectId");

            return this;
        } // end andProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("PROJECT_SERVER_RELATE.PROJECT_ID not between",
                value1, value2, "projectId");

            return this;
        } // end andProjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("PROJECT_SERVER_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("PROJECT_SERVER_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "PROJECT_SERVER_RELATE.STATUS is not null AND PROJECT_SERVER_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(PROJECT_SERVER_RELATE.STATUS is null OR PROJECT_SERVER_RELATE.STATUS = '')");

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
            addCriterion("PROJECT_SERVER_RELATE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.STATUS");
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS <>", value, "status");

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
            addCriterion("PROJECT_SERVER_RELATE.STATUS is null OR PROJECT_SERVER_RELATE.STATUS <>",
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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.STATUS");
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.STATUS");
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.STATUS");
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.STATUS");
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("PROJECT_SERVER_RELATE.STATUS");
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS like",
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS not like",
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
                addCriterion("PROJECT_SERVER_RELATE.STATUS in", values, "status");

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
                addCriterion("PROJECT_SERVER_RELATE.STATUS not in", values,
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
                addCriterion("PROJECT_SERVER_RELATE.STATUS in",
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
                addCriterion("PROJECT_SERVER_RELATE.STATUS not in",
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS between", value1,
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
            addCriterion("PROJECT_SERVER_RELATE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeIsNull() {
            addCriterion("middleWareA.TYPE is null");

            return this;
        } // end andServerTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeIsNotNull() {
            addCriterion("middleWareA.TYPE is not null");

            return this;
        } // end andServerTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeIsNotEmpty() {
            addCriterion(
                "middleWareA.TYPE is not null AND middleWareA.TYPE <> ''");

            return this;
        } // end andServerTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeIsEmpty() {
            addCriterion("(middleWareA.TYPE is null OR middleWareA.TYPE = '')");

            return this;
        } // end andServerTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeEqualTo(String value) {
            addCriterion("middleWareA.TYPE =", value, "serverType");

            return this;
        } // end andServerTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("middleWareA.TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServerTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeNotEqualTo(String value) {
            addCriterion("middleWareA.TYPE <>", value, "serverType");

            return this;
        } // end andServerTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeNotEqualToOrIsNull(String value) {
            addCriterion("middleWareA.TYPE is null OR middleWareA.TYPE <>",
                value, "serverType");

            return this;
        } // end andServerTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("middleWareA.TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServerTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeGreaterThan(String value) {
            addCriterion("middleWareA.TYPE >", value, "serverType");

            return this;
        } // end andServerTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("middleWareA.TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServerTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("middleWareA.TYPE >=", value, "serverType");

            return this;
        } // end andServerTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("middleWareA.TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServerTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeLessThan(String value) {
            addCriterion("middleWareA.TYPE <", value, "serverType");

            return this;
        } // end andServerTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("middleWareA.TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServerTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeLessThanOrEqualTo(String value) {
            addCriterion("middleWareA.TYPE <=", value, "serverType");

            return this;
        } // end andServerTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("middleWareA.TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServerTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("middleWareA.TYPE like", buffer.toString(),
                "serverType");

            return this;
        } // end andServerTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("middleWareA.TYPE not like", buffer.toString(),
                "serverType");

            return this;
        } // end andServerTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeIn(List values) {
            if (values.size() == 1) {
                return andServerTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("middleWareA.TYPE in", values, "serverType");

                return this;
            } // end else
        } // end andServerTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeNotIn(List values) {
            if (values.size() == 1) {
                return andServerTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("middleWareA.TYPE not in", values, "serverType");

                return this;
            } // end else
        } // end andServerTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeIn(Object[] values) {
            if (values.length == 1) {
                return andServerTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("middleWareA.TYPE in", Arrays.asList(values),
                    "serverType");

                return this;
            } // end else
        } // end andServerTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andServerTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("middleWareA.TYPE not in", Arrays.asList(values),
                    "serverType");

                return this;
            } // end else
        } // end andServerTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeBetween(String value1, String value2) {
            addCriterion("middleWareA.TYPE between", value1, value2,
                "serverType");

            return this;
        } // end andServerTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServerTypeNotBetween(String value1, String value2) {
            addCriterion("middleWareA.TYPE not between", value1, value2,
                "serverType");

            return this;
        } // end andServerTypeNotBetween()
    } // end Criteria
} // end ProjectServerRelateDAOQueryBean
