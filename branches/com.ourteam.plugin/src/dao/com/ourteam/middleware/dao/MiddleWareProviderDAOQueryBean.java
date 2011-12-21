/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * MiddleWareProvider query bean 2011-12-06 11:42:56
 *
 * @author Auto Gen
 */
public class MiddleWareProviderDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new MiddleWareProviderDAOQueryBean object.
     */
    public MiddleWareProviderDAOQueryBean() {
        super();
    } // end MiddleWareProviderDAOQueryBean()

    /**
     * Creates a new MiddleWareProviderDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public MiddleWareProviderDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end MiddleWareProviderDAOQueryBean()

    /**
     * Creates a new MiddleWareProviderDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public MiddleWareProviderDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end MiddleWareProviderDAOQueryBean()

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
            addSelectProperty(IMiddleWareProviderDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDriverTypeSelectProperty() {
        addDriverTypeSelectProperty("driverType");
    } // end addDriverTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDriverTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareProviderDAO.DriverType, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.DriverType, "driverType");
        } // end else
    } // end addDriverTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMiddleWareNameSelectProperty() {
        addMiddleWareNameSelectProperty("middleWareName");
    } // end addMiddleWareNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMiddleWareNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareProviderDAO.MiddleWareName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.MiddleWareName,
                "middleWareName");
        } // end else
    } // end addMiddleWareNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMiddleWareTypeSelectProperty() {
        addMiddleWareTypeSelectProperty("middleWareType");
    } // end addMiddleWareTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMiddleWareTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareProviderDAO.MiddleWareType, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.MiddleWareType,
                "middleWareType");
        } // end else
    } // end addMiddleWareTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMiddleWareVersionSelectProperty() {
        addMiddleWareVersionSelectProperty("middleWareVersion");
    } // end addMiddleWareVersionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMiddleWareVersionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareProviderDAO.MiddleWareVersion, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.MiddleWareVersion,
                "middleWareVersion");
        } // end else
    } // end addMiddleWareVersionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProviderNameSelectProperty() {
        addProviderNameSelectProperty("providerName");
    } // end addProviderNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProviderNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareProviderDAO.ProviderName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.ProviderName,
                "providerName");
        } // end else
    } // end addProviderNameSelectProperty()

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
            addSelectProperty(IMiddleWareProviderDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.Remarks, "remarks");
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
            addSelectProperty(IMiddleWareProviderDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareProviderDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDriverTypeSelectProperty();

        addMiddleWareNameSelectProperty();

        addMiddleWareTypeSelectProperty();

        addMiddleWareVersionSelectProperty();

        addProviderNameSelectProperty();

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
            addCriterion("MIDDLE_WARE_PROVIDER.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.ID is not null AND MIDDLE_WARE_PROVIDER.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.ID is null OR MIDDLE_WARE_PROVIDER.ID = '')");

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
            addCriterion("MIDDLE_WARE_PROVIDER.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.ID");
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
            addCriterion("MIDDLE_WARE_PROVIDER.ID <>", value, "id");

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
            addCriterion("MIDDLE_WARE_PROVIDER.ID is null OR MIDDLE_WARE_PROVIDER.ID <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.ID");
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
            addCriterion("MIDDLE_WARE_PROVIDER.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.ID");
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
            addCriterion("MIDDLE_WARE_PROVIDER.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.ID");
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
            addCriterion("MIDDLE_WARE_PROVIDER.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.ID");
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
            addCriterion("MIDDLE_WARE_PROVIDER.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.ID");
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
                addCriterion("MIDDLE_WARE_PROVIDER.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_PROVIDER.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_PROVIDER.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_PROVIDER.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_PROVIDER.ID in",
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
                addCriterion("MIDDLE_WARE_PROVIDER.ID not in",
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
            addCriterion("MIDDLE_WARE_PROVIDER.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE_PROVIDER.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE_PROVIDER.ID not between", value1, value2,
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
            addCriterion("MIDDLE_WARE_PROVIDER.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeIsNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE is null");

            return this;
        } // end andDriverTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE is not null");

            return this;
        } // end andDriverTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.DRIVER_TYPE is not null AND MIDDLE_WARE_PROVIDER.DRIVER_TYPE <> ''");

            return this;
        } // end andDriverTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.DRIVER_TYPE is null OR MIDDLE_WARE_PROVIDER.DRIVER_TYPE = '')");

            return this;
        } // end andDriverTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE =", value,
                "driverType");

            return this;
        } // end andDriverTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.DRIVER_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriverTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE <>", value,
                "driverType");

            return this;
        } // end andDriverTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE is null OR MIDDLE_WARE_PROVIDER.DRIVER_TYPE <>",
                value, "driverType");

            return this;
        } // end andDriverTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.DRIVER_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriverTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE >", value,
                "driverType");

            return this;
        } // end andDriverTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.DRIVER_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriverTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE >=", value,
                "driverType");

            return this;
        } // end andDriverTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.DRIVER_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriverTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeLessThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE <", value,
                "driverType");

            return this;
        } // end andDriverTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.DRIVER_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriverTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE <=", value,
                "driverType");

            return this;
        } // end andDriverTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.DRIVER_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriverTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE like",
                buffer.toString(), "driverType");

            return this;
        } // end andDriverTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE not like",
                buffer.toString(), "driverType");

            return this;
        } // end andDriverTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeIn(List values) {
            if (values.size() == 1) {
                return andDriverTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE in", values,
                    "driverType");

                return this;
            } // end else
        } // end andDriverTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeNotIn(List values) {
            if (values.size() == 1) {
                return andDriverTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE not in", values,
                    "driverType");

                return this;
            } // end else
        } // end andDriverTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeIn(Object[] values) {
            if (values.length == 1) {
                return andDriverTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE in",
                    Arrays.asList(values), "driverType");

                return this;
            } // end else
        } // end andDriverTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDriverTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE not in",
                    Arrays.asList(values), "driverType");

                return this;
            } // end else
        } // end andDriverTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE between", value1,
                value2, "driverType");

            return this;
        } // end andDriverTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriverTypeNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.DRIVER_TYPE not between",
                value1, value2, "driverType");

            return this;
        } // end andDriverTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME is null");

            return this;
        } // end andMiddleWareNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME is not null");

            return this;
        } // end andMiddleWareNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME is not null AND MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME <> ''");

            return this;
        } // end andMiddleWareNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME is null OR MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME = '')");

            return this;
        } // end andMiddleWareNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME =", value,
                "middleWareName");

            return this;
        } // end andMiddleWareNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME <>", value,
                "middleWareName");

            return this;
        } // end andMiddleWareNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME is null OR MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME <>",
                value, "middleWareName");

            return this;
        } // end andMiddleWareNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME >", value,
                "middleWareName");

            return this;
        } // end andMiddleWareNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME >=", value,
                "middleWareName");

            return this;
        } // end andMiddleWareNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameLessThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME <", value,
                "middleWareName");

            return this;
        } // end andMiddleWareNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME <=", value,
                "middleWareName");

            return this;
        } // end andMiddleWareNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME like",
                buffer.toString(), "middleWareName");

            return this;
        } // end andMiddleWareNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME not like",
                buffer.toString(), "middleWareName");

            return this;
        } // end andMiddleWareNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME in",
                    values, "middleWareName");

                return this;
            } // end else
        } // end andMiddleWareNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameNotIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME not in",
                    values, "middleWareName");

                return this;
            } // end else
        } // end andMiddleWareNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME in",
                    Arrays.asList(values), "middleWareName");

                return this;
            } // end else
        } // end andMiddleWareNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME not in",
                    Arrays.asList(values), "middleWareName");

                return this;
            } // end else
        } // end andMiddleWareNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME between",
                value1, value2, "middleWareName");

            return this;
        } // end andMiddleWareNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME not between",
                value1, value2, "middleWareName");

            return this;
        } // end andMiddleWareNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE is null");

            return this;
        } // end andMiddleWareTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE is not null");

            return this;
        } // end andMiddleWareTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE is not null AND MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE <> ''");

            return this;
        } // end andMiddleWareTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE is null OR MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE = '')");

            return this;
        } // end andMiddleWareTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE =", value,
                "middleWareType");

            return this;
        } // end andMiddleWareTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE <>", value,
                "middleWareType");

            return this;
        } // end andMiddleWareTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE is null OR MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE <>",
                value, "middleWareType");

            return this;
        } // end andMiddleWareTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE >", value,
                "middleWareType");

            return this;
        } // end andMiddleWareTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE >=", value,
                "middleWareType");

            return this;
        } // end andMiddleWareTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeLessThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE <", value,
                "middleWareType");

            return this;
        } // end andMiddleWareTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE <=", value,
                "middleWareType");

            return this;
        } // end andMiddleWareTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE like",
                buffer.toString(), "middleWareType");

            return this;
        } // end andMiddleWareTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE not like",
                buffer.toString(), "middleWareType");

            return this;
        } // end andMiddleWareTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE in",
                    values, "middleWareType");

                return this;
            } // end else
        } // end andMiddleWareTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeNotIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE not in",
                    values, "middleWareType");

                return this;
            } // end else
        } // end andMiddleWareTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE in",
                    Arrays.asList(values), "middleWareType");

                return this;
            } // end else
        } // end andMiddleWareTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE not in",
                    Arrays.asList(values), "middleWareType");

                return this;
            } // end else
        } // end andMiddleWareTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE between",
                value1, value2, "middleWareType");

            return this;
        } // end andMiddleWareTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE not between",
                value1, value2, "middleWareType");

            return this;
        } // end andMiddleWareTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION is null");

            return this;
        } // end andMiddleWareVersionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION is not null");

            return this;
        } // end andMiddleWareVersionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION is not null AND MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION <> ''");

            return this;
        } // end andMiddleWareVersionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION is null OR MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION = '')");

            return this;
        } // end andMiddleWareVersionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION =", value,
                "middleWareVersion");

            return this;
        } // end andMiddleWareVersionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareVersionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION <>", value,
                "middleWareVersion");

            return this;
        } // end andMiddleWareVersionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION is null OR MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION <>",
                value, "middleWareVersion");

            return this;
        } // end andMiddleWareVersionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareVersionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION >", value,
                "middleWareVersion");

            return this;
        } // end andMiddleWareVersionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareVersionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION >=", value,
                "middleWareVersion");

            return this;
        } // end andMiddleWareVersionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareVersionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionLessThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION <", value,
                "middleWareVersion");

            return this;
        } // end andMiddleWareVersionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareVersionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION <=", value,
                "middleWareVersion");

            return this;
        } // end andMiddleWareVersionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMiddleWareVersionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION like",
                buffer.toString(), "middleWareVersion");

            return this;
        } // end andMiddleWareVersionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION not like",
                buffer.toString(), "middleWareVersion");

            return this;
        } // end andMiddleWareVersionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareVersionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION in",
                    values, "middleWareVersion");

                return this;
            } // end else
        } // end andMiddleWareVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionNotIn(List values) {
            if (values.size() == 1) {
                return andMiddleWareVersionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION not in",
                    values, "middleWareVersion");

                return this;
            } // end else
        } // end andMiddleWareVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareVersionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION in",
                    Arrays.asList(values), "middleWareVersion");

                return this;
            } // end else
        } // end andMiddleWareVersionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionNotIn(Object[] values) {
            if (values.length == 1) {
                return andMiddleWareVersionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION not in",
                    Arrays.asList(values), "middleWareVersion");

                return this;
            } // end else
        } // end andMiddleWareVersionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION between",
                value1, value2, "middleWareVersion");

            return this;
        } // end andMiddleWareVersionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionNotBetween(String value1,
            String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION not between",
                value1, value2, "middleWareVersion");

            return this;
        } // end andMiddleWareVersionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME is null");

            return this;
        } // end andProviderNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME is not null");

            return this;
        } // end andProviderNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.PROVIDER_NAME is not null AND MIDDLE_WARE_PROVIDER.PROVIDER_NAME <> ''");

            return this;
        } // end andProviderNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.PROVIDER_NAME is null OR MIDDLE_WARE_PROVIDER.PROVIDER_NAME = '')");

            return this;
        } // end andProviderNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME =", value,
                "providerName");

            return this;
        } // end andProviderNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.PROVIDER_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME <>", value,
                "providerName");

            return this;
        } // end andProviderNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME is null OR MIDDLE_WARE_PROVIDER.PROVIDER_NAME <>",
                value, "providerName");

            return this;
        } // end andProviderNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.PROVIDER_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME >", value,
                "providerName");

            return this;
        } // end andProviderNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.PROVIDER_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME >=", value,
                "providerName");

            return this;
        } // end andProviderNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.PROVIDER_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThan(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME <", value,
                "providerName");

            return this;
        } // end andProviderNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.PROVIDER_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME <=", value,
                "providerName");

            return this;
        } // end andProviderNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_PROVIDER.PROVIDER_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME like",
                buffer.toString(), "providerName");

            return this;
        } // end andProviderNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME not like",
                buffer.toString(), "providerName");

            return this;
        } // end andProviderNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIn(List values) {
            if (values.size() == 1) {
                return andProviderNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME in", values,
                    "providerName");

                return this;
            } // end else
        } // end andProviderNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotIn(List values) {
            if (values.size() == 1) {
                return andProviderNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME not in",
                    values, "providerName");

                return this;
            } // end else
        } // end andProviderNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIn(Object[] values) {
            if (values.length == 1) {
                return andProviderNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME in",
                    Arrays.asList(values), "providerName");

                return this;
            } // end else
        } // end andProviderNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andProviderNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME not in",
                    Arrays.asList(values), "providerName");

                return this;
            } // end else
        } // end andProviderNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME between", value1,
                value2, "providerName");

            return this;
        } // end andProviderNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_PROVIDER.PROVIDER_NAME not between",
                value1, value2, "providerName");

            return this;
        } // end andProviderNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.REMARKS is not null AND MIDDLE_WARE_PROVIDER.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.REMARKS is null OR MIDDLE_WARE_PROVIDER.REMARKS = '')");

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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.REMARKS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS <>", value, "remarks");

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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS is null OR MIDDLE_WARE_PROVIDER.REMARKS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.REMARKS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.REMARKS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.REMARKS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.REMARKS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.REMARKS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS like",
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS not like",
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
                addCriterion("MIDDLE_WARE_PROVIDER.REMARKS in", values,
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
                addCriterion("MIDDLE_WARE_PROVIDER.REMARKS not in", values,
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
                addCriterion("MIDDLE_WARE_PROVIDER.REMARKS in",
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
                addCriterion("MIDDLE_WARE_PROVIDER.REMARKS not in",
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS between", value1,
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
            addCriterion("MIDDLE_WARE_PROVIDER.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_PROVIDER.STATUS is not null AND MIDDLE_WARE_PROVIDER.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_PROVIDER.STATUS is null OR MIDDLE_WARE_PROVIDER.STATUS = '')");

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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.STATUS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS <>", value, "status");

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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS is null OR MIDDLE_WARE_PROVIDER.STATUS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.STATUS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.STATUS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.STATUS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.STATUS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_PROVIDER.STATUS");
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS like", buffer.toString(),
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS not like",
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
                addCriterion("MIDDLE_WARE_PROVIDER.STATUS in", values, "status");

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
                addCriterion("MIDDLE_WARE_PROVIDER.STATUS not in", values,
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
                addCriterion("MIDDLE_WARE_PROVIDER.STATUS in",
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
                addCriterion("MIDDLE_WARE_PROVIDER.STATUS not in",
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS between", value1, value2,
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
            addCriterion("MIDDLE_WARE_PROVIDER.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()
    } // end Criteria
} // end MiddleWareProviderDAOQueryBean
