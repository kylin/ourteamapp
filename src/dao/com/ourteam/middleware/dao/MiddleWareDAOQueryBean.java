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
 * MiddleWare query bean 2011-12-06 16:03:01
 *
 * @author Auto Gen
 */
public class MiddleWareDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new MiddleWareDAOQueryBean object.
     */
    public MiddleWareDAOQueryBean() {
        super();
    } // end MiddleWareDAOQueryBean()

    /**
     * Creates a new MiddleWareDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public MiddleWareDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end MiddleWareDAOQueryBean()

    /**
     * Creates a new MiddleWareDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public MiddleWareDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end MiddleWareDAOQueryBean()

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
            addSelectProperty(IMiddleWareDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDriveTypeSelectProperty() {
        addDriveTypeSelectProperty("driveType");
    } // end addDriveTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDriveTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.DriveType, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.DriveType, "driveType");
        } // end else
    } // end addDriveTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addHostNameSelectProperty() {
        addHostNameSelectProperty("hostName");
    } // end addHostNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addHostNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.HostName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.HostName, "hostName");
        } // end else
    } // end addHostNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addHostPortSelectProperty() {
        addHostPortSelectProperty("hostPort");
    } // end addHostPortSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addHostPortSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.HostPort, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.HostPort, "hostPort");
        } // end else
    } // end addHostPortSelectProperty()

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
            addSelectProperty(IMiddleWareDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNeedSSLSelectProperty() {
        addNeedSSLSelectProperty("needSSL");
    } // end addNeedSSLSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNeedSSLSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.NeedSSL, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.NeedSSL, "needSSL");
        } // end else
    } // end addNeedSSLSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPasswordSelectProperty() {
        addPasswordSelectProperty("password");
    } // end addPasswordSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPasswordSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.Password, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.Password, "password");
        } // end else
    } // end addPasswordSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addServiceNameSelectProperty() {
        addServiceNameSelectProperty("serviceName");
    } // end addServiceNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addServiceNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.ServiceName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.ServiceName, "serviceName");
        } // end else
    } // end addServiceNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addServiceStatusSelectProperty() {
        addServiceStatusSelectProperty("serviceStatus");
    } // end addServiceStatusSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addServiceStatusSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.ServiceStatus, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.ServiceStatus, "serviceStatus");
        } // end else
    } // end addServiceStatusSelectProperty()

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
            addSelectProperty(IMiddleWareDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(IMiddleWareDAO.Type, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.Type, "type");
        } // end else
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUserSelectProperty() {
        addUserSelectProperty("user");
    } // end addUserSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUserSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.User, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.User, "user");
        } // end else
    } // end addUserSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProviderSelectProperty() {
        addProviderSelectProperty("provider");
    } // end addProviderSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProviderSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.Provider, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.Provider, "provider");
        } // end else
    } // end addProviderSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDescSelectProperty() {
        addDescSelectProperty("desc");
    } // end addDescSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDescSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.Desc, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.Desc, "desc");
        } // end else
    } // end addDescSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addGroupIdSelectProperty() {
        addGroupIdSelectProperty("groupId");
    } // end addGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addGroupIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.GroupId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.GroupId, "groupId");
        } // end else
    } // end addGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProviderIdSelectProperty() {
        addProviderIdSelectProperty("providerId");
    } // end addProviderIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProviderIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareDAO.ProviderId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.ProviderId, "providerId");
        } // end else
    } // end addProviderIdSelectProperty()

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
            addSelectProperty(IMiddleWareDAO.ProviderName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.ProviderName, "providerName");
        } // end else
    } // end addProviderNameSelectProperty()

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
            addSelectProperty(IMiddleWareDAO.MiddleWareName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.MiddleWareName, "middleWareName");
        } // end else
    } // end addMiddleWareNameSelectProperty()

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
            addSelectProperty(IMiddleWareDAO.MiddleWareVersion, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareDAO.MiddleWareVersion,
                "middleWareVersion");
        } // end else
    } // end addMiddleWareVersionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDriveTypeSelectProperty();

        addHostNameSelectProperty();

        addHostPortSelectProperty();

        addNameSelectProperty();

        addNeedSSLSelectProperty();

        addPasswordSelectProperty();

        addServiceNameSelectProperty();

        addServiceStatusSelectProperty();

        addStatusSelectProperty();

        addTypeSelectProperty();

        addUserSelectProperty();

        addProviderSelectProperty();

        addDescSelectProperty();

        addGroupIdSelectProperty();

        addProviderIdSelectProperty();

        addProviderNameSelectProperty();

        addMiddleWareNameSelectProperty();

        addMiddleWareVersionSelectProperty();
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
            addCriterion("MIDDLE_WARE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("MIDDLE_WARE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("MIDDLE_WARE.ID is not null AND MIDDLE_WARE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(MIDDLE_WARE.ID is null OR MIDDLE_WARE.ID = '')");

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
            addCriterion("MIDDLE_WARE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.ID");
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
            addCriterion("MIDDLE_WARE.ID <>", value, "id");

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
            addCriterion("MIDDLE_WARE.ID is null OR MIDDLE_WARE.ID <>", value,
                "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.ID");
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
            addCriterion("MIDDLE_WARE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.ID");
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
            addCriterion("MIDDLE_WARE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.ID");
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
            addCriterion("MIDDLE_WARE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.ID");
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
            addCriterion("MIDDLE_WARE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.ID");
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
                addCriterion("MIDDLE_WARE.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE.ID in", Arrays.asList(values), "id");

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
                addCriterion("MIDDLE_WARE.ID not in", Arrays.asList(values),
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
            addCriterion("MIDDLE_WARE.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE.ID not between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeIsNull() {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE is null");

            return this;
        } // end andDriveTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeIsNotNull() {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE is not null");

            return this;
        } // end andDriveTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.DRIVE_TYPE is not null AND MIDDLE_WARE.DRIVE_TYPE <> ''");

            return this;
        } // end andDriveTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.DRIVE_TYPE is null OR MIDDLE_WARE.DRIVE_TYPE = '')");

            return this;
        } // end andDriveTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE =", value, "driveType");

            return this;
        } // end andDriveTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DRIVE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriveTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE <>", value, "driveType");

            return this;
        } // end andDriveTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE is null OR MIDDLE_WARE.DRIVE_TYPE <>",
                value, "driveType");

            return this;
        } // end andDriveTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DRIVE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriveTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE >", value, "driveType");

            return this;
        } // end andDriveTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DRIVE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriveTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE >=", value, "driveType");

            return this;
        } // end andDriveTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DRIVE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriveTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeLessThan(String value) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE <", value, "driveType");

            return this;
        } // end andDriveTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DRIVE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriveTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE <=", value, "driveType");

            return this;
        } // end andDriveTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DRIVE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDriveTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.DRIVE_TYPE like", buffer.toString(),
                "driveType");

            return this;
        } // end andDriveTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.DRIVE_TYPE not like", buffer.toString(),
                "driveType");

            return this;
        } // end andDriveTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeIn(List values) {
            if (values.size() == 1) {
                return andDriveTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DRIVE_TYPE in", values, "driveType");

                return this;
            } // end else
        } // end andDriveTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeNotIn(List values) {
            if (values.size() == 1) {
                return andDriveTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DRIVE_TYPE not in", values,
                    "driveType");

                return this;
            } // end else
        } // end andDriveTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeIn(Object[] values) {
            if (values.length == 1) {
                return andDriveTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DRIVE_TYPE in",
                    Arrays.asList(values), "driveType");

                return this;
            } // end else
        } // end andDriveTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDriveTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DRIVE_TYPE not in",
                    Arrays.asList(values), "driveType");

                return this;
            } // end else
        } // end andDriveTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE between", value1, value2,
                "driveType");

            return this;
        } // end andDriveTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDriveTypeNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.DRIVE_TYPE not between", value1, value2,
                "driveType");

            return this;
        } // end andDriveTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameIsNull() {
            addCriterion("MIDDLE_WARE.HOST_NAME is null");

            return this;
        } // end andHostNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameIsNotNull() {
            addCriterion("MIDDLE_WARE.HOST_NAME is not null");

            return this;
        } // end andHostNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.HOST_NAME is not null AND MIDDLE_WARE.HOST_NAME <> ''");

            return this;
        } // end andHostNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.HOST_NAME is null OR MIDDLE_WARE.HOST_NAME = '')");

            return this;
        } // end andHostNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_NAME =", value, "hostName");

            return this;
        } // end andHostNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_NAME <>", value, "hostName");

            return this;
        } // end andHostNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.HOST_NAME is null OR MIDDLE_WARE.HOST_NAME <>",
                value, "hostName");

            return this;
        } // end andHostNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.HOST_NAME >", value, "hostName");

            return this;
        } // end andHostNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_NAME >=", value, "hostName");

            return this;
        } // end andHostNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameLessThan(String value) {
            addCriterion("MIDDLE_WARE.HOST_NAME <", value, "hostName");

            return this;
        } // end andHostNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_NAME <=", value, "hostName");

            return this;
        } // end andHostNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.HOST_NAME like", buffer.toString(),
                "hostName");

            return this;
        } // end andHostNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.HOST_NAME not like", buffer.toString(),
                "hostName");

            return this;
        } // end andHostNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameIn(List values) {
            if (values.size() == 1) {
                return andHostNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_NAME in", values, "hostName");

                return this;
            } // end else
        } // end andHostNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameNotIn(List values) {
            if (values.size() == 1) {
                return andHostNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_NAME not in", values, "hostName");

                return this;
            } // end else
        } // end andHostNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameIn(Object[] values) {
            if (values.length == 1) {
                return andHostNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_NAME in", Arrays.asList(values),
                    "hostName");

                return this;
            } // end else
        } // end andHostNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andHostNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_NAME not in",
                    Arrays.asList(values), "hostName");

                return this;
            } // end else
        } // end andHostNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.HOST_NAME between", value1, value2,
                "hostName");

            return this;
        } // end andHostNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.HOST_NAME not between", value1, value2,
                "hostName");

            return this;
        } // end andHostNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortIsNull() {
            addCriterion("MIDDLE_WARE.HOST_PORT is null");

            return this;
        } // end andHostPortIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortIsNotNull() {
            addCriterion("MIDDLE_WARE.HOST_PORT is not null");

            return this;
        } // end andHostPortIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.HOST_PORT is not null AND MIDDLE_WARE.HOST_PORT <> ''");

            return this;
        } // end andHostPortIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.HOST_PORT is null OR MIDDLE_WARE.HOST_PORT = '')");

            return this;
        } // end andHostPortIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_PORT =", value, "hostPort");

            return this;
        } // end andHostPortEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_PORT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostPortEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_PORT <>", value, "hostPort");

            return this;
        } // end andHostPortNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.HOST_PORT is null OR MIDDLE_WARE.HOST_PORT <>",
                value, "hostPort");

            return this;
        } // end andHostPortNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_PORT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostPortNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.HOST_PORT >", value, "hostPort");

            return this;
        } // end andHostPortGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_PORT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostPortGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_PORT >=", value, "hostPort");

            return this;
        } // end andHostPortGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_PORT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostPortGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortLessThan(String value) {
            addCriterion("MIDDLE_WARE.HOST_PORT <", value, "hostPort");

            return this;
        } // end andHostPortLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_PORT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostPortLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.HOST_PORT <=", value, "hostPort");

            return this;
        } // end andHostPortLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.HOST_PORT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHostPortLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.HOST_PORT like", buffer.toString(),
                "hostPort");

            return this;
        } // end andHostPortLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.HOST_PORT not like", buffer.toString(),
                "hostPort");

            return this;
        } // end andHostPortNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortIn(List values) {
            if (values.size() == 1) {
                return andHostPortEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_PORT in", values, "hostPort");

                return this;
            } // end else
        } // end andHostPortIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortNotIn(List values) {
            if (values.size() == 1) {
                return andHostPortNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_PORT not in", values, "hostPort");

                return this;
            } // end else
        } // end andHostPortNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortIn(Object[] values) {
            if (values.length == 1) {
                return andHostPortEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_PORT in", Arrays.asList(values),
                    "hostPort");

                return this;
            } // end else
        } // end andHostPortIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortNotIn(Object[] values) {
            if (values.length == 1) {
                return andHostPortNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.HOST_PORT not in",
                    Arrays.asList(values), "hostPort");

                return this;
            } // end else
        } // end andHostPortNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.HOST_PORT between", value1, value2,
                "hostPort");

            return this;
        } // end andHostPortBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHostPortNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.HOST_PORT not between", value1, value2,
                "hostPort");

            return this;
        } // end andHostPortNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("MIDDLE_WARE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("MIDDLE_WARE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.NAME is not null AND MIDDLE_WARE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion("(MIDDLE_WARE.NAME is null OR MIDDLE_WARE.NAME = '')");

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
            addCriterion("MIDDLE_WARE.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NAME");
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
            addCriterion("MIDDLE_WARE.NAME <>", value, "name");

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
            addCriterion("MIDDLE_WARE.NAME is null OR MIDDLE_WARE.NAME <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NAME");
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
            addCriterion("MIDDLE_WARE.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NAME");
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
            addCriterion("MIDDLE_WARE.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NAME");
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
            addCriterion("MIDDLE_WARE.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NAME");
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
            addCriterion("MIDDLE_WARE.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NAME");
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
            addCriterion("MIDDLE_WARE.NAME like", buffer.toString(), "name");

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
            addCriterion("MIDDLE_WARE.NAME not like", buffer.toString(), "name");

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
                addCriterion("MIDDLE_WARE.NAME in", values, "name");

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
                addCriterion("MIDDLE_WARE.NAME not in", values, "name");

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
                addCriterion("MIDDLE_WARE.NAME in", Arrays.asList(values),
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
                addCriterion("MIDDLE_WARE.NAME not in", Arrays.asList(values),
                    "name");

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
            addCriterion("MIDDLE_WARE.NAME between", value1, value2, "name");

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
            addCriterion("MIDDLE_WARE.NAME not between", value1, value2, "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLIsNull() {
            addCriterion("MIDDLE_WARE.NEED_SSL is null");

            return this;
        } // end andNeedSSLIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLIsNotNull() {
            addCriterion("MIDDLE_WARE.NEED_SSL is not null");

            return this;
        } // end andNeedSSLIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.NEED_SSL is not null AND MIDDLE_WARE.NEED_SSL <> ''");

            return this;
        } // end andNeedSSLIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.NEED_SSL is null OR MIDDLE_WARE.NEED_SSL = '')");

            return this;
        } // end andNeedSSLIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLEqualTo(String value) {
            addCriterion("MIDDLE_WARE.NEED_SSL =", value, "needSSL");

            return this;
        } // end andNeedSSLEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NEED_SSL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNeedSSLEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.NEED_SSL <>", value, "needSSL");

            return this;
        } // end andNeedSSLNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.NEED_SSL is null OR MIDDLE_WARE.NEED_SSL <>",
                value, "needSSL");

            return this;
        } // end andNeedSSLNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NEED_SSL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNeedSSLNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.NEED_SSL >", value, "needSSL");

            return this;
        } // end andNeedSSLGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NEED_SSL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNeedSSLGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.NEED_SSL >=", value, "needSSL");

            return this;
        } // end andNeedSSLGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NEED_SSL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNeedSSLGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLLessThan(String value) {
            addCriterion("MIDDLE_WARE.NEED_SSL <", value, "needSSL");

            return this;
        } // end andNeedSSLLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NEED_SSL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNeedSSLLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.NEED_SSL <=", value, "needSSL");

            return this;
        } // end andNeedSSLLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.NEED_SSL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNeedSSLLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.NEED_SSL like", buffer.toString(),
                "needSSL");

            return this;
        } // end andNeedSSLLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.NEED_SSL not like", buffer.toString(),
                "needSSL");

            return this;
        } // end andNeedSSLNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLIn(List values) {
            if (values.size() == 1) {
                return andNeedSSLEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.NEED_SSL in", values, "needSSL");

                return this;
            } // end else
        } // end andNeedSSLIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLNotIn(List values) {
            if (values.size() == 1) {
                return andNeedSSLNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.NEED_SSL not in", values, "needSSL");

                return this;
            } // end else
        } // end andNeedSSLNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLIn(Object[] values) {
            if (values.length == 1) {
                return andNeedSSLEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.NEED_SSL in", Arrays.asList(values),
                    "needSSL");

                return this;
            } // end else
        } // end andNeedSSLIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLNotIn(Object[] values) {
            if (values.length == 1) {
                return andNeedSSLNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.NEED_SSL not in",
                    Arrays.asList(values), "needSSL");

                return this;
            } // end else
        } // end andNeedSSLNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.NEED_SSL between", value1, value2,
                "needSSL");

            return this;
        } // end andNeedSSLBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNeedSSLNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.NEED_SSL not between", value1, value2,
                "needSSL");

            return this;
        } // end andNeedSSLNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNull() {
            addCriterion("MIDDLE_WARE.PASSWORD is null");

            return this;
        } // end andPasswordIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNotNull() {
            addCriterion("MIDDLE_WARE.PASSWORD is not null");

            return this;
        } // end andPasswordIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.PASSWORD is not null AND MIDDLE_WARE.PASSWORD <> ''");

            return this;
        } // end andPasswordIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.PASSWORD is null OR MIDDLE_WARE.PASSWORD = '')");

            return this;
        } // end andPasswordIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PASSWORD =", value, "password");

            return this;
        } // end andPasswordEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PASSWORD");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PASSWORD <>", value, "password");

            return this;
        } // end andPasswordNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.PASSWORD is null OR MIDDLE_WARE.PASSWORD <>",
                value, "password");

            return this;
        } // end andPasswordNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PASSWORD");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.PASSWORD >", value, "password");

            return this;
        } // end andPasswordGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PASSWORD");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PASSWORD >=", value, "password");

            return this;
        } // end andPasswordGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PASSWORD");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThan(String value) {
            addCriterion("MIDDLE_WARE.PASSWORD <", value, "password");

            return this;
        } // end andPasswordLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PASSWORD");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PASSWORD <=", value, "password");

            return this;
        } // end andPasswordLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PASSWORD");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.PASSWORD like", buffer.toString(),
                "password");

            return this;
        } // end andPasswordLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.PASSWORD not like", buffer.toString(),
                "password");

            return this;
        } // end andPasswordNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIn(List values) {
            if (values.size() == 1) {
                return andPasswordEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PASSWORD in", values, "password");

                return this;
            } // end else
        } // end andPasswordIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotIn(List values) {
            if (values.size() == 1) {
                return andPasswordNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PASSWORD not in", values, "password");

                return this;
            } // end else
        } // end andPasswordNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIn(Object[] values) {
            if (values.length == 1) {
                return andPasswordEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PASSWORD in", Arrays.asList(values),
                    "password");

                return this;
            } // end else
        } // end andPasswordIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotIn(Object[] values) {
            if (values.length == 1) {
                return andPasswordNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PASSWORD not in",
                    Arrays.asList(values), "password");

                return this;
            } // end else
        } // end andPasswordNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.PASSWORD between", value1, value2,
                "password");

            return this;
        } // end andPasswordBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.PASSWORD not between", value1, value2,
                "password");

            return this;
        } // end andPasswordNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameIsNull() {
            addCriterion("MIDDLE_WARE.SERVICE_NAME is null");

            return this;
        } // end andServiceNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameIsNotNull() {
            addCriterion("MIDDLE_WARE.SERVICE_NAME is not null");

            return this;
        } // end andServiceNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.SERVICE_NAME is not null AND MIDDLE_WARE.SERVICE_NAME <> ''");

            return this;
        } // end andServiceNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.SERVICE_NAME is null OR MIDDLE_WARE.SERVICE_NAME = '')");

            return this;
        } // end andServiceNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME =", value, "serviceName");

            return this;
        } // end andServiceNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME <>", value, "serviceName");

            return this;
        } // end andServiceNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME is null OR MIDDLE_WARE.SERVICE_NAME <>",
                value, "serviceName");

            return this;
        } // end andServiceNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME >", value, "serviceName");

            return this;
        } // end andServiceNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME >=", value, "serviceName");

            return this;
        } // end andServiceNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameLessThan(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME <", value, "serviceName");

            return this;
        } // end andServiceNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME <=", value, "serviceName");

            return this;
        } // end andServiceNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.SERVICE_NAME like", buffer.toString(),
                "serviceName");

            return this;
        } // end andServiceNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.SERVICE_NAME not like",
                buffer.toString(), "serviceName");

            return this;
        } // end andServiceNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameIn(List values) {
            if (values.size() == 1) {
                return andServiceNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_NAME in", values,
                    "serviceName");

                return this;
            } // end else
        } // end andServiceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameNotIn(List values) {
            if (values.size() == 1) {
                return andServiceNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_NAME not in", values,
                    "serviceName");

                return this;
            } // end else
        } // end andServiceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameIn(Object[] values) {
            if (values.length == 1) {
                return andServiceNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_NAME in",
                    Arrays.asList(values), "serviceName");

                return this;
            } // end else
        } // end andServiceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andServiceNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_NAME not in",
                    Arrays.asList(values), "serviceName");

                return this;
            } // end else
        } // end andServiceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME between", value1, value2,
                "serviceName");

            return this;
        } // end andServiceNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.SERVICE_NAME not between", value1,
                value2, "serviceName");

            return this;
        } // end andServiceNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusIsNull() {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS is null");

            return this;
        } // end andServiceStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusIsNotNull() {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS is not null");

            return this;
        } // end andServiceStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.SERVICE_STATUS is not null AND MIDDLE_WARE.SERVICE_STATUS <> ''");

            return this;
        } // end andServiceStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.SERVICE_STATUS is null OR MIDDLE_WARE.SERVICE_STATUS = '')");

            return this;
        } // end andServiceStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS =", value, "serviceStatus");

            return this;
        } // end andServiceStatusEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_STATUS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceStatusEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS <>", value, "serviceStatus");

            return this;
        } // end andServiceStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS is null OR MIDDLE_WARE.SERVICE_STATUS <>",
                value, "serviceStatus");

            return this;
        } // end andServiceStatusNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_STATUS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceStatusNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS >", value, "serviceStatus");

            return this;
        } // end andServiceStatusGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_STATUS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceStatusGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS >=", value, "serviceStatus");

            return this;
        } // end andServiceStatusGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_STATUS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceStatusGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusLessThan(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS <", value, "serviceStatus");

            return this;
        } // end andServiceStatusLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_STATUS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceStatusLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS <=", value, "serviceStatus");

            return this;
        } // end andServiceStatusLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.SERVICE_STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.SERVICE_STATUS like", buffer.toString(),
                "serviceStatus");

            return this;
        } // end andServiceStatusLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.SERVICE_STATUS not like",
                buffer.toString(), "serviceStatus");

            return this;
        } // end andServiceStatusNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusIn(List values) {
            if (values.size() == 1) {
                return andServiceStatusEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_STATUS in", values,
                    "serviceStatus");

                return this;
            } // end else
        } // end andServiceStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusNotIn(List values) {
            if (values.size() == 1) {
                return andServiceStatusNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_STATUS not in", values,
                    "serviceStatus");

                return this;
            } // end else
        } // end andServiceStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusIn(Object[] values) {
            if (values.length == 1) {
                return andServiceStatusEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_STATUS in",
                    Arrays.asList(values), "serviceStatus");

                return this;
            } // end else
        } // end andServiceStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andServiceStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.SERVICE_STATUS not in",
                    Arrays.asList(values), "serviceStatus");

                return this;
            } // end else
        } // end andServiceStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS between", value1, value2,
                "serviceStatus");

            return this;
        } // end andServiceStatusBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceStatusNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.SERVICE_STATUS not between", value1,
                value2, "serviceStatus");

            return this;
        } // end andServiceStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("MIDDLE_WARE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("MIDDLE_WARE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.STATUS is not null AND MIDDLE_WARE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.STATUS is null OR MIDDLE_WARE.STATUS = '')");

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
            addCriterion("MIDDLE_WARE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.STATUS");
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
            addCriterion("MIDDLE_WARE.STATUS <>", value, "status");

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
            addCriterion("MIDDLE_WARE.STATUS is null OR MIDDLE_WARE.STATUS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.STATUS");
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
            addCriterion("MIDDLE_WARE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.STATUS");
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
            addCriterion("MIDDLE_WARE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.STATUS");
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
            addCriterion("MIDDLE_WARE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.STATUS");
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
            addCriterion("MIDDLE_WARE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.STATUS");
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
            addCriterion("MIDDLE_WARE.STATUS like", buffer.toString(), "status");

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
            addCriterion("MIDDLE_WARE.STATUS not like", buffer.toString(),
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
                addCriterion("MIDDLE_WARE.STATUS in", values, "status");

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
                addCriterion("MIDDLE_WARE.STATUS not in", values, "status");

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
                addCriterion("MIDDLE_WARE.STATUS in", Arrays.asList(values),
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
                addCriterion("MIDDLE_WARE.STATUS not in",
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
            addCriterion("MIDDLE_WARE.STATUS between", value1, value2, "status");

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
            addCriterion("MIDDLE_WARE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNull() {
            addCriterion("MIDDLE_WARE.TYPE is null");

            return this;
        } // end andTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotNull() {
            addCriterion("MIDDLE_WARE.TYPE is not null");

            return this;
        } // end andTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.TYPE is not null AND MIDDLE_WARE.TYPE <> ''");

            return this;
        } // end andTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsEmpty() {
            addCriterion("(MIDDLE_WARE.TYPE is null OR MIDDLE_WARE.TYPE = '')");

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
            addCriterion("MIDDLE_WARE.TYPE =", value, "type");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.TYPE");
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
            addCriterion("MIDDLE_WARE.TYPE <>", value, "type");

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
            addCriterion("MIDDLE_WARE.TYPE is null OR MIDDLE_WARE.TYPE <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.TYPE");
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
            addCriterion("MIDDLE_WARE.TYPE >", value, "type");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.TYPE");
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
            addCriterion("MIDDLE_WARE.TYPE >=", value, "type");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.TYPE");
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
            addCriterion("MIDDLE_WARE.TYPE <", value, "type");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.TYPE");
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
            addCriterion("MIDDLE_WARE.TYPE <=", value, "type");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE.TYPE");
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
            addCriterion("MIDDLE_WARE.TYPE like", buffer.toString(), "type");

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
            addCriterion("MIDDLE_WARE.TYPE not like", buffer.toString(), "type");

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
                addCriterion("MIDDLE_WARE.TYPE in", values, "type");

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
                addCriterion("MIDDLE_WARE.TYPE not in", values, "type");

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
                addCriterion("MIDDLE_WARE.TYPE in", Arrays.asList(values),
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
                addCriterion("MIDDLE_WARE.TYPE not in", Arrays.asList(values),
                    "type");

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
            addCriterion("MIDDLE_WARE.TYPE between", value1, value2, "type");

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
            addCriterion("MIDDLE_WARE.TYPE not between", value1, value2, "type");

            return this;
        } // end andTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIsNull() {
            addCriterion("MIDDLE_WARE.USER is null");

            return this;
        } // end andUserIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIsNotNull() {
            addCriterion("MIDDLE_WARE.USER is not null");

            return this;
        } // end andUserIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.USER is not null AND MIDDLE_WARE.USER <> ''");

            return this;
        } // end andUserIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIsEmpty() {
            addCriterion("(MIDDLE_WARE.USER is null OR MIDDLE_WARE.USER = '')");

            return this;
        } // end andUserIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserEqualTo(String value) {
            addCriterion("MIDDLE_WARE.USER =", value, "user");

            return this;
        } // end andUserEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.USER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.USER <>", value, "user");

            return this;
        } // end andUserNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.USER is null OR MIDDLE_WARE.USER <>",
                value, "user");

            return this;
        } // end andUserNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.USER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.USER >", value, "user");

            return this;
        } // end andUserGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.USER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.USER >=", value, "user");

            return this;
        } // end andUserGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.USER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserLessThan(String value) {
            addCriterion("MIDDLE_WARE.USER <", value, "user");

            return this;
        } // end andUserLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.USER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.USER <=", value, "user");

            return this;
        } // end andUserLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.USER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.USER like", buffer.toString(), "user");

            return this;
        } // end andUserLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.USER not like", buffer.toString(), "user");

            return this;
        } // end andUserNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIn(List values) {
            if (values.size() == 1) {
                return andUserEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.USER in", values, "user");

                return this;
            } // end else
        } // end andUserIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNotIn(List values) {
            if (values.size() == 1) {
                return andUserNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.USER not in", values, "user");

                return this;
            } // end else
        } // end andUserNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIn(Object[] values) {
            if (values.length == 1) {
                return andUserEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.USER in", Arrays.asList(values),
                    "user");

                return this;
            } // end else
        } // end andUserIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNotIn(Object[] values) {
            if (values.length == 1) {
                return andUserNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.USER not in", Arrays.asList(values),
                    "user");

                return this;
            } // end else
        } // end andUserNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.USER between", value1, value2, "user");

            return this;
        } // end andUserBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.USER not between", value1, value2, "user");

            return this;
        } // end andUserNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIsNull() {
            addCriterion("MIDDLE_WARE.PROVIDER is null");

            return this;
        } // end andProviderIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIsNotNull() {
            addCriterion("MIDDLE_WARE.PROVIDER is not null");

            return this;
        } // end andProviderIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.PROVIDER is not null AND MIDDLE_WARE.PROVIDER <> ''");

            return this;
        } // end andProviderIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.PROVIDER is null OR MIDDLE_WARE.PROVIDER = '')");

            return this;
        } // end andProviderIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PROVIDER =", value, "provider");

            return this;
        } // end andProviderEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PROVIDER <>", value, "provider");

            return this;
        } // end andProviderNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.PROVIDER is null OR MIDDLE_WARE.PROVIDER <>",
                value, "provider");

            return this;
        } // end andProviderNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.PROVIDER >", value, "provider");

            return this;
        } // end andProviderGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PROVIDER >=", value, "provider");

            return this;
        } // end andProviderGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderLessThan(String value) {
            addCriterion("MIDDLE_WARE.PROVIDER <", value, "provider");

            return this;
        } // end andProviderLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.PROVIDER <=", value, "provider");

            return this;
        } // end andProviderLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.PROVIDER like", buffer.toString(),
                "provider");

            return this;
        } // end andProviderLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.PROVIDER not like", buffer.toString(),
                "provider");

            return this;
        } // end andProviderNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIn(List values) {
            if (values.size() == 1) {
                return andProviderEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER in", values, "provider");

                return this;
            } // end else
        } // end andProviderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNotIn(List values) {
            if (values.size() == 1) {
                return andProviderNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER not in", values, "provider");

                return this;
            } // end else
        } // end andProviderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIn(Object[] values) {
            if (values.length == 1) {
                return andProviderEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER in", Arrays.asList(values),
                    "provider");

                return this;
            } // end else
        } // end andProviderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNotIn(Object[] values) {
            if (values.length == 1) {
                return andProviderNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER not in",
                    Arrays.asList(values), "provider");

                return this;
            } // end else
        } // end andProviderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.PROVIDER between", value1, value2,
                "provider");

            return this;
        } // end andProviderBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.PROVIDER not between", value1, value2,
                "provider");

            return this;
        } // end andProviderNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescIsNull() {
            addCriterion("MIDDLE_WARE.DESC is null");

            return this;
        } // end andDescIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescIsNotNull() {
            addCriterion("MIDDLE_WARE.DESC is not null");

            return this;
        } // end andDescIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.DESC is not null AND MIDDLE_WARE.DESC <> ''");

            return this;
        } // end andDescIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescIsEmpty() {
            addCriterion("(MIDDLE_WARE.DESC is null OR MIDDLE_WARE.DESC = '')");

            return this;
        } // end andDescIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DESC =", value, "desc");

            return this;
        } // end andDescEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DESC");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DESC <>", value, "desc");

            return this;
        } // end andDescNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE.DESC is null OR MIDDLE_WARE.DESC <>",
                value, "desc");

            return this;
        } // end andDescNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DESC");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescGreaterThan(String value) {
            addCriterion("MIDDLE_WARE.DESC >", value, "desc");

            return this;
        } // end andDescGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DESC");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DESC >=", value, "desc");

            return this;
        } // end andDescGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DESC");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescLessThan(String value) {
            addCriterion("MIDDLE_WARE.DESC <", value, "desc");

            return this;
        } // end andDescLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DESC");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE.DESC <=", value, "desc");

            return this;
        } // end andDescLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.DESC");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.DESC like", buffer.toString(), "desc");

            return this;
        } // end andDescLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE.DESC not like", buffer.toString(), "desc");

            return this;
        } // end andDescNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescIn(List values) {
            if (values.size() == 1) {
                return andDescEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DESC in", values, "desc");

                return this;
            } // end else
        } // end andDescIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescNotIn(List values) {
            if (values.size() == 1) {
                return andDescNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DESC not in", values, "desc");

                return this;
            } // end else
        } // end andDescNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescIn(Object[] values) {
            if (values.length == 1) {
                return andDescEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DESC in", Arrays.asList(values),
                    "desc");

                return this;
            } // end else
        } // end andDescIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescNotIn(Object[] values) {
            if (values.length == 1) {
                return andDescNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.DESC not in", Arrays.asList(values),
                    "desc");

                return this;
            } // end else
        } // end andDescNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.DESC between", value1, value2, "desc");

            return this;
        } // end andDescBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE.DESC not between", value1, value2, "desc");

            return this;
        } // end andDescNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdIsNull() {
            addCriterion("MIDDLE_WARE.GROUP_ID is null");

            return this;
        } // end andGroupIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdIsNotNull() {
            addCriterion("MIDDLE_WARE.GROUP_ID is not null");

            return this;
        } // end andGroupIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.GROUP_ID is not null AND MIDDLE_WARE.GROUP_ID <> ''");

            return this;
        } // end andGroupIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.GROUP_ID is null OR MIDDLE_WARE.GROUP_ID = '')");

            return this;
        } // end andGroupIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdEqualTo(long value) {
            return andGroupIdEqualTo(Long.valueOf(value));
        } // end andGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.GROUP_ID =", value, "groupId");

            return this;
        } // end andGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.GROUP_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotEqualTo(long value) {
            return andGroupIdNotEqualTo(Long.valueOf(value));
        } // end andGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.GROUP_ID <>", value, "groupId");

            return this;
        } // end andGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotEqualToOrIsNull(long value) {
            return andGroupIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.GROUP_ID is null OR MIDDLE_WARE.GROUP_ID <>",
                value, "groupId");

            return this;
        } // end andGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.GROUP_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdGreaterThan(long value) {
            return andGroupIdGreaterThan(Long.valueOf(value));
        } // end andGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.GROUP_ID >", value, "groupId");

            return this;
        } // end andGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.GROUP_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdGreaterThanOrEqualTo(long value) {
            return andGroupIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.GROUP_ID >=", value, "groupId");

            return this;
        } // end andGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.GROUP_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdLessThan(long value) {
            return andGroupIdLessThan(Long.valueOf(value));
        } // end andGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.GROUP_ID <", value, "groupId");

            return this;
        } // end andGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.GROUP_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdLessThanOrEqualTo(long value) {
            return andGroupIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.GROUP_ID <=", value, "groupId");

            return this;
        } // end andGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.GROUP_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdIn(long[] values) {
            if (values.length == 1) {
                return andGroupIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.GROUP_ID in", values, "groupId");

                return this;
            } // end else
        } // end andGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotIn(long[] values) {
            if (values.length == 1) {
                return andGroupIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.GROUP_ID not in", values, "groupId");

                return this;
            } // end else
        } // end andGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdIn(List values) {
            if (values.size() == 1) {
                return andGroupIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.GROUP_ID in", values, "groupId");

                return this;
            } // end else
        } // end andGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotIn(List values) {
            if (values.size() == 1) {
                return andGroupIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.GROUP_ID not in", values, "groupId");

                return this;
            } // end else
        } // end andGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdIn(Object[] values) {
            if (values.length == 1) {
                return andGroupIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.GROUP_ID in", Arrays.asList(values),
                    "groupId");

                return this;
            } // end else
        } // end andGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andGroupIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.GROUP_ID not in",
                    Arrays.asList(values), "groupId");

                return this;
            } // end else
        } // end andGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE.GROUP_ID between", value1, value2,
                "groupId");

            return this;
        } // end andGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE.GROUP_ID between", value1, value2,
                "groupId");

            return this;
        } // end andGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE.GROUP_ID not between", value1, value2,
                "groupId");

            return this;
        } // end andGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE.GROUP_ID not between", value1, value2,
                "groupId");

            return this;
        } // end andGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNull() {
            addCriterion("MIDDLE_WARE.PROVIDER_ID is null");

            return this;
        } // end andProviderIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNotNull() {
            addCriterion("MIDDLE_WARE.PROVIDER_ID is not null");

            return this;
        } // end andProviderIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE.PROVIDER_ID is not null AND MIDDLE_WARE.PROVIDER_ID <> ''");

            return this;
        } // end andProviderIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE.PROVIDER_ID is null OR MIDDLE_WARE.PROVIDER_ID = '')");

            return this;
        } // end andProviderIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdEqualTo(long value) {
            return andProviderIdEqualTo(Long.valueOf(value));
        } // end andProviderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID =", value, "providerId");

            return this;
        } // end andProviderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualTo(long value) {
            return andProviderIdNotEqualTo(Long.valueOf(value));
        } // end andProviderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID <>", value, "providerId");

            return this;
        } // end andProviderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualToOrIsNull(long value) {
            return andProviderIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProviderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID is null OR MIDDLE_WARE.PROVIDER_ID <>",
                value, "providerId");

            return this;
        } // end andProviderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThan(long value) {
            return andProviderIdGreaterThan(Long.valueOf(value));
        } // end andProviderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID >", value, "providerId");

            return this;
        } // end andProviderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanOrEqualTo(long value) {
            return andProviderIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProviderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID >=", value, "providerId");

            return this;
        } // end andProviderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThan(long value) {
            return andProviderIdLessThan(Long.valueOf(value));
        } // end andProviderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID <", value, "providerId");

            return this;
        } // end andProviderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanOrEqualTo(long value) {
            return andProviderIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProviderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID <=", value, "providerId");

            return this;
        } // end andProviderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE.PROVIDER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIn(long[] values) {
            if (values.length == 1) {
                return andProviderIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER_ID in", values, "providerId");

                return this;
            } // end else
        } // end andProviderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProviderIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER_ID not in", values,
                    "providerId");

                return this;
            } // end else
        } // end andProviderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIn(List values) {
            if (values.size() == 1) {
                return andProviderIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER_ID in", values, "providerId");

                return this;
            } // end else
        } // end andProviderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotIn(List values) {
            if (values.size() == 1) {
                return andProviderIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER_ID not in", values,
                    "providerId");

                return this;
            } // end else
        } // end andProviderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIn(Object[] values) {
            if (values.length == 1) {
                return andProviderIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER_ID in",
                    Arrays.asList(values), "providerId");

                return this;
            } // end else
        } // end andProviderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProviderIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE.PROVIDER_ID not in",
                    Arrays.asList(values), "providerId");

                return this;
            } // end else
        } // end andProviderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID between", value1, value2,
                "providerId");

            return this;
        } // end andProviderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID between", value1, value2,
                "providerId");

            return this;
        } // end andProviderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID not between", value1, value2,
                "providerId");

            return this;
        } // end andProviderIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE.PROVIDER_ID not between", value1, value2,
                "providerId");

            return this;
        } // end andProviderIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNull() {
            addCriterion("middleWareProviderA.PROVIDER_NAME is null");

            return this;
        } // end andProviderNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNotNull() {
            addCriterion("middleWareProviderA.PROVIDER_NAME is not null");

            return this;
        } // end andProviderNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNotEmpty() {
            addCriterion(
                "middleWareProviderA.PROVIDER_NAME is not null AND middleWareProviderA.PROVIDER_NAME <> ''");

            return this;
        } // end andProviderNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsEmpty() {
            addCriterion(
                "(middleWareProviderA.PROVIDER_NAME is null OR middleWareProviderA.PROVIDER_NAME = '')");

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
            addCriterion("middleWareProviderA.PROVIDER_NAME =", value,
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
                    "middleWareProviderA.PROVIDER_NAME");
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
            addCriterion("middleWareProviderA.PROVIDER_NAME <>", value,
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
            addCriterion("middleWareProviderA.PROVIDER_NAME is null OR middleWareProviderA.PROVIDER_NAME <>",
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
                    "middleWareProviderA.PROVIDER_NAME");
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
            addCriterion("middleWareProviderA.PROVIDER_NAME >", value,
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
                    "middleWareProviderA.PROVIDER_NAME");
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
            addCriterion("middleWareProviderA.PROVIDER_NAME >=", value,
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
                    "middleWareProviderA.PROVIDER_NAME");
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
            addCriterion("middleWareProviderA.PROVIDER_NAME <", value,
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
                    "middleWareProviderA.PROVIDER_NAME");
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
            addCriterion("middleWareProviderA.PROVIDER_NAME <=", value,
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
                    "middleWareProviderA.PROVIDER_NAME");
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
            addCriterion("middleWareProviderA.PROVIDER_NAME like",
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
            addCriterion("middleWareProviderA.PROVIDER_NAME not like",
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
                addCriterion("middleWareProviderA.PROVIDER_NAME in", values,
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
                addCriterion("middleWareProviderA.PROVIDER_NAME not in",
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
                addCriterion("middleWareProviderA.PROVIDER_NAME in",
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
                addCriterion("middleWareProviderA.PROVIDER_NAME not in",
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
            addCriterion("middleWareProviderA.PROVIDER_NAME between", value1,
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
            addCriterion("middleWareProviderA.PROVIDER_NAME not between",
                value1, value2, "providerName");

            return this;
        } // end andProviderNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsNull() {
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME is null");

            return this;
        } // end andMiddleWareNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsNotNull() {
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME is not null");

            return this;
        } // end andMiddleWareNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsNotEmpty() {
            addCriterion(
                "middleWareProviderA.MIDDLE_WARE_NAME is not null AND middleWareProviderA.MIDDLE_WARE_NAME <> ''");

            return this;
        } // end andMiddleWareNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareNameIsEmpty() {
            addCriterion(
                "(middleWareProviderA.MIDDLE_WARE_NAME is null OR middleWareProviderA.MIDDLE_WARE_NAME = '')");

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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME =", value,
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
                    "middleWareProviderA.MIDDLE_WARE_NAME");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME <>", value,
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME is null OR middleWareProviderA.MIDDLE_WARE_NAME <>",
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
                    "middleWareProviderA.MIDDLE_WARE_NAME");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME >", value,
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
                    "middleWareProviderA.MIDDLE_WARE_NAME");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME >=", value,
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
                    "middleWareProviderA.MIDDLE_WARE_NAME");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME <", value,
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
                    "middleWareProviderA.MIDDLE_WARE_NAME");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME <=", value,
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
                    "middleWareProviderA.MIDDLE_WARE_NAME");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME like",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME not like",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_NAME in", values,
                    "middleWareName");

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
                addCriterion("middleWareProviderA.MIDDLE_WARE_NAME not in",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_NAME in",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_NAME not in",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME between",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_NAME not between",
                value1, value2, "middleWareName");

            return this;
        } // end andMiddleWareNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsNull() {
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION is null");

            return this;
        } // end andMiddleWareVersionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsNotNull() {
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION is not null");

            return this;
        } // end andMiddleWareVersionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsNotEmpty() {
            addCriterion(
                "middleWareProviderA.MIDDLE_WARE_VERSION is not null AND middleWareProviderA.MIDDLE_WARE_VERSION <> ''");

            return this;
        } // end andMiddleWareVersionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareVersionIsEmpty() {
            addCriterion(
                "(middleWareProviderA.MIDDLE_WARE_VERSION is null OR middleWareProviderA.MIDDLE_WARE_VERSION = '')");

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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION =", value,
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
                    "middleWareProviderA.MIDDLE_WARE_VERSION");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION <>", value,
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION is null OR middleWareProviderA.MIDDLE_WARE_VERSION <>",
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
                    "middleWareProviderA.MIDDLE_WARE_VERSION");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION >", value,
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
                    "middleWareProviderA.MIDDLE_WARE_VERSION");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION >=", value,
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
                    "middleWareProviderA.MIDDLE_WARE_VERSION");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION <", value,
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
                    "middleWareProviderA.MIDDLE_WARE_VERSION");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION <=", value,
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
                    "middleWareProviderA.MIDDLE_WARE_VERSION");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION like",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION not like",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION in",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION not in",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION in",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION not in",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION between",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_VERSION not between",
                value1, value2, "middleWareVersion");

            return this;
        } // end andMiddleWareVersionNotBetween()
    } // end Criteria
} // end MiddleWareDAOQueryBean
