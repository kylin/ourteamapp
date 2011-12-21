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
 * ServiceParameter query bean 2011-09-22 10:16:51
 *
 * @author Auto Gen
 */
public class ServiceParameterDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ServiceParameterDAOQueryBean object.
     */
    public ServiceParameterDAOQueryBean() {
        super();
    } // end ServiceParameterDAOQueryBean()

    /**
     * Creates a new ServiceParameterDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ServiceParameterDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ServiceParameterDAOQueryBean()

    /**
     * Creates a new ServiceParameterDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ServiceParameterDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ServiceParameterDAOQueryBean()

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
    public void addServiceParameterIdSelectProperty() {
        addServiceParameterIdSelectProperty("serviceParameterId");
    } // end addServiceParameterIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addServiceParameterIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.ServiceParameterId, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.ServiceParameterId,
                "serviceParameterId");
        } // end else
    } // end addServiceParameterIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDataTypeSelectProperty() {
        addDataTypeSelectProperty("dataType");
    } // end addDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.DataType, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.DataType, "dataType");
        } // end else
    } // end addDataTypeSelectProperty()

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
            addSelectProperty(IServiceParameterDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsArraySelectProperty() {
        addIsArraySelectProperty("isArray");
    } // end addIsArraySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsArraySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.IsArray, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.IsArray, "isArray");
        } // end else
    } // end addIsArraySelectProperty()

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
            addSelectProperty(IServiceParameterDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPreProcessSelectProperty() {
        addPreProcessSelectProperty("preProcess");
    } // end addPreProcessSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPreProcessSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.PreProcess, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.PreProcess, "preProcess");
        } // end else
    } // end addPreProcessSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSortSelectProperty() {
        addSortSelectProperty("sort");
    } // end addSortSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSortSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.Sort, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.Sort, "sort");
        } // end else
    } // end addSortSelectProperty()

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
            addSelectProperty(IServiceParameterDAO.Type, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.Type, "type");
        } // end else
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addValidateInfoSelectProperty() {
        addValidateInfoSelectProperty("validateInfo");
    } // end addValidateInfoSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addValidateInfoSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.ValidateInfo, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.ValidateInfo, "validateInfo");
        } // end else
    } // end addValidateInfoSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addServiceFunctionIdSelectProperty() {
        addServiceFunctionIdSelectProperty("serviceFunctionId");
    } // end addServiceFunctionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addServiceFunctionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.ServiceFunctionId, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.ServiceFunctionId,
                "serviceFunctionId");
        } // end else
    } // end addServiceFunctionIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReferenceObjectIdSelectProperty() {
        addReferenceObjectIdSelectProperty("referenceObjectId");
    } // end addReferenceObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReferenceObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IServiceParameterDAO.ReferenceObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IServiceParameterDAO.ReferenceObjectId,
                "referenceObjectId");
        } // end else
    } // end addReferenceObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addServiceParameterIdSelectProperty();

        addDataTypeSelectProperty();

        addDescriptionSelectProperty();

        addIsArraySelectProperty();

        addNameSelectProperty();

        addPreProcessSelectProperty();

        addSortSelectProperty();

        addTypeSelectProperty();

        addValidateInfoSelectProperty();

        addServiceFunctionIdSelectProperty();

        addReferenceObjectIdSelectProperty();
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
        public Criteria andServiceParameterIdIsNull() {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID is null");

            return this;
        } // end andServiceParameterIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdIsNotNull() {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID is not null");

            return this;
        } // end andServiceParameterIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.SERVICE_PARAMETER_ID is not null AND SERVICE_PARAMETER.SERVICE_PARAMETER_ID <> ''");

            return this;
        } // end andServiceParameterIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.SERVICE_PARAMETER_ID is null OR SERVICE_PARAMETER.SERVICE_PARAMETER_ID = '')");

            return this;
        } // end andServiceParameterIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdEqualTo(long value) {
            return andServiceParameterIdEqualTo(Long.valueOf(value));
        } // end andServiceParameterIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdEqualTo(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID =", value,
                "serviceParameterId");

            return this;
        } // end andServiceParameterIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_PARAMETER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceParameterIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotEqualTo(long value) {
            return andServiceParameterIdNotEqualTo(Long.valueOf(value));
        } // end andServiceParameterIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotEqualTo(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID <>", value,
                "serviceParameterId");

            return this;
        } // end andServiceParameterIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotEqualToOrIsNull(long value) {
            return andServiceParameterIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andServiceParameterIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID is null OR SERVICE_PARAMETER.SERVICE_PARAMETER_ID <>",
                value, "serviceParameterId");

            return this;
        } // end andServiceParameterIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_PARAMETER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceParameterIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdGreaterThan(long value) {
            return andServiceParameterIdGreaterThan(Long.valueOf(value));
        } // end andServiceParameterIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdGreaterThan(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID >", value,
                "serviceParameterId");

            return this;
        } // end andServiceParameterIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_PARAMETER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceParameterIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdGreaterThanOrEqualTo(long value) {
            return andServiceParameterIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andServiceParameterIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID >=", value,
                "serviceParameterId");

            return this;
        } // end andServiceParameterIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_PARAMETER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceParameterIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdLessThan(long value) {
            return andServiceParameterIdLessThan(Long.valueOf(value));
        } // end andServiceParameterIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdLessThan(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID <", value,
                "serviceParameterId");

            return this;
        } // end andServiceParameterIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_PARAMETER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceParameterIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdLessThanOrEqualTo(long value) {
            return andServiceParameterIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andServiceParameterIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID <=", value,
                "serviceParameterId");

            return this;
        } // end andServiceParameterIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_PARAMETER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceParameterIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdIn(long[] values) {
            if (values.length == 1) {
                return andServiceParameterIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID in",
                    values, "serviceParameterId");

                return this;
            } // end else
        } // end andServiceParameterIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotIn(long[] values) {
            if (values.length == 1) {
                return andServiceParameterIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID not in",
                    values, "serviceParameterId");

                return this;
            } // end else
        } // end andServiceParameterIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdIn(List values) {
            if (values.size() == 1) {
                return andServiceParameterIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID in",
                    values, "serviceParameterId");

                return this;
            } // end else
        } // end andServiceParameterIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotIn(List values) {
            if (values.size() == 1) {
                return andServiceParameterIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID not in",
                    values, "serviceParameterId");

                return this;
            } // end else
        } // end andServiceParameterIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdIn(Object[] values) {
            if (values.length == 1) {
                return andServiceParameterIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID in",
                    Arrays.asList(values), "serviceParameterId");

                return this;
            } // end else
        } // end andServiceParameterIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andServiceParameterIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID not in",
                    Arrays.asList(values), "serviceParameterId");

                return this;
            } // end else
        } // end andServiceParameterIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdBetween(long value1, long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID between",
                value1, value2, "serviceParameterId");

            return this;
        } // end andServiceParameterIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID between",
                value1, value2, "serviceParameterId");

            return this;
        } // end andServiceParameterIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotBetween(long value1, long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID not between",
                value1, value2, "serviceParameterId");

            return this;
        } // end andServiceParameterIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceParameterIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_PARAMETER_ID not between",
                value1, value2, "serviceParameterId");

            return this;
        } // end andServiceParameterIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNull() {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE is null");

            return this;
        } // end andDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNotNull() {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE is not null");

            return this;
        } // end andDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.DATA_TYPE is not null AND SERVICE_PARAMETER.DATA_TYPE <> ''");

            return this;
        } // end andDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.DATA_TYPE is null OR SERVICE_PARAMETER.DATA_TYPE = '')");

            return this;
        } // end andDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE =", value, "dataType");

            return this;
        } // end andDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE <>", value, "dataType");

            return this;
        } // end andDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualToOrIsNull(String value) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE is null OR SERVICE_PARAMETER.DATA_TYPE <>",
                value, "dataType");

            return this;
        } // end andDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE >", value, "dataType");

            return this;
        } // end andDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE >=", value, "dataType");

            return this;
        } // end andDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThan(String value) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE <", value, "dataType");

            return this;
        } // end andDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE <=", value, "dataType");

            return this;
        } // end andDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.DATA_TYPE like", buffer.toString(),
                "dataType");

            return this;
        } // end andDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.DATA_TYPE not like",
                buffer.toString(), "dataType");

            return this;
        } // end andDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIn(List values) {
            if (values.size() == 1) {
                return andDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.DATA_TYPE in", values,
                    "dataType");

                return this;
            } // end else
        } // end andDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andDataTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.DATA_TYPE not in", values,
                    "dataType");

                return this;
            } // end else
        } // end andDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.DATA_TYPE in",
                    Arrays.asList(values), "dataType");

                return this;
            } // end else
        } // end andDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.DATA_TYPE not in",
                    Arrays.asList(values), "dataType");

                return this;
            } // end else
        } // end andDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE between", value1, value2,
                "dataType");

            return this;
        } // end andDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.DATA_TYPE not between", value1,
                value2, "dataType");

            return this;
        } // end andDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("SERVICE_PARAMETER.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("SERVICE_PARAMETER.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.DESCRIPTION is not null AND SERVICE_PARAMETER.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.DESCRIPTION is null OR SERVICE_PARAMETER.DESCRIPTION = '')");

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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DESCRIPTION");
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION <>", value,
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION is null OR SERVICE_PARAMETER.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DESCRIPTION");
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DESCRIPTION");
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION >=", value,
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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DESCRIPTION");
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DESCRIPTION");
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION <=", value,
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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.DESCRIPTION");
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION like",
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION not like",
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
                addCriterion("SERVICE_PARAMETER.DESCRIPTION in", values,
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
                addCriterion("SERVICE_PARAMETER.DESCRIPTION not in", values,
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
                addCriterion("SERVICE_PARAMETER.DESCRIPTION in",
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
                addCriterion("SERVICE_PARAMETER.DESCRIPTION not in",
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION between", value1,
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
            addCriterion("SERVICE_PARAMETER.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsNull() {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY is null");

            return this;
        } // end andIsArrayIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsNotNull() {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY is not null");

            return this;
        } // end andIsArrayIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.IS_ARRAY is not null AND SERVICE_PARAMETER.IS_ARRAY <> ''");

            return this;
        } // end andIsArrayIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.IS_ARRAY is null OR SERVICE_PARAMETER.IS_ARRAY = '')");

            return this;
        } // end andIsArrayIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY =", value, "isArray");

            return this;
        } // end andIsArrayEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.IS_ARRAY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY <>", value, "isArray");

            return this;
        } // end andIsArrayNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotEqualToOrIsNull(String value) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY is null OR SERVICE_PARAMETER.IS_ARRAY <>",
                value, "isArray");

            return this;
        } // end andIsArrayNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.IS_ARRAY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThan(String value) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY >", value, "isArray");

            return this;
        } // end andIsArrayGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.IS_ARRAY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY >=", value, "isArray");

            return this;
        } // end andIsArrayGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.IS_ARRAY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThan(String value) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY <", value, "isArray");

            return this;
        } // end andIsArrayLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.IS_ARRAY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY <=", value, "isArray");

            return this;
        } // end andIsArrayLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.IS_ARRAY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.IS_ARRAY like", buffer.toString(),
                "isArray");

            return this;
        } // end andIsArrayLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.IS_ARRAY not like",
                buffer.toString(), "isArray");

            return this;
        } // end andIsArrayNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIn(List values) {
            if (values.size() == 1) {
                return andIsArrayEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.IS_ARRAY in", values, "isArray");

                return this;
            } // end else
        } // end andIsArrayIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotIn(List values) {
            if (values.size() == 1) {
                return andIsArrayNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.IS_ARRAY not in", values,
                    "isArray");

                return this;
            } // end else
        } // end andIsArrayNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIn(Object[] values) {
            if (values.length == 1) {
                return andIsArrayEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.IS_ARRAY in",
                    Arrays.asList(values), "isArray");

                return this;
            } // end else
        } // end andIsArrayIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsArrayNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.IS_ARRAY not in",
                    Arrays.asList(values), "isArray");

                return this;
            } // end else
        } // end andIsArrayNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY between", value1, value2,
                "isArray");

            return this;
        } // end andIsArrayBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.IS_ARRAY not between", value1,
                value2, "isArray");

            return this;
        } // end andIsArrayNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("SERVICE_PARAMETER.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("SERVICE_PARAMETER.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.NAME is not null AND SERVICE_PARAMETER.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.NAME is null OR SERVICE_PARAMETER.NAME = '')");

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
            addCriterion("SERVICE_PARAMETER.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.NAME");
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
            addCriterion("SERVICE_PARAMETER.NAME <>", value, "name");

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
            addCriterion("SERVICE_PARAMETER.NAME is null OR SERVICE_PARAMETER.NAME <>",
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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.NAME");
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
            addCriterion("SERVICE_PARAMETER.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.NAME");
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
            addCriterion("SERVICE_PARAMETER.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.NAME");
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
            addCriterion("SERVICE_PARAMETER.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.NAME");
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
            addCriterion("SERVICE_PARAMETER.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.NAME");
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
            addCriterion("SERVICE_PARAMETER.NAME like", buffer.toString(),
                "name");

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
            addCriterion("SERVICE_PARAMETER.NAME not like", buffer.toString(),
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
                addCriterion("SERVICE_PARAMETER.NAME in", values, "name");

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
                addCriterion("SERVICE_PARAMETER.NAME not in", values, "name");

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
                addCriterion("SERVICE_PARAMETER.NAME in",
                    Arrays.asList(values), "name");

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
                addCriterion("SERVICE_PARAMETER.NAME not in",
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
            addCriterion("SERVICE_PARAMETER.NAME between", value1, value2,
                "name");

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
            addCriterion("SERVICE_PARAMETER.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessIsNull() {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS is null");

            return this;
        } // end andPreProcessIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessIsNotNull() {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS is not null");

            return this;
        } // end andPreProcessIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.PRE_PROCESS is not null AND SERVICE_PARAMETER.PRE_PROCESS <> ''");

            return this;
        } // end andPreProcessIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.PRE_PROCESS is null OR SERVICE_PARAMETER.PRE_PROCESS = '')");

            return this;
        } // end andPreProcessIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS =", value, "preProcess");

            return this;
        } // end andPreProcessEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.PRE_PROCESS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreProcessEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessNotEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS <>", value, "preProcess");

            return this;
        } // end andPreProcessNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessNotEqualToOrIsNull(String value) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS is null OR SERVICE_PARAMETER.PRE_PROCESS <>",
                value, "preProcess");

            return this;
        } // end andPreProcessNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.PRE_PROCESS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreProcessNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessGreaterThan(String value) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS >", value, "preProcess");

            return this;
        } // end andPreProcessGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.PRE_PROCESS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreProcessGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS >=", value, "preProcess");

            return this;
        } // end andPreProcessGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.PRE_PROCESS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreProcessGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessLessThan(String value) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS <", value, "preProcess");

            return this;
        } // end andPreProcessLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.PRE_PROCESS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreProcessLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS <=", value, "preProcess");

            return this;
        } // end andPreProcessLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.PRE_PROCESS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPreProcessLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS like",
                buffer.toString(), "preProcess");

            return this;
        } // end andPreProcessLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS not like",
                buffer.toString(), "preProcess");

            return this;
        } // end andPreProcessNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessIn(List values) {
            if (values.size() == 1) {
                return andPreProcessEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.PRE_PROCESS in", values,
                    "preProcess");

                return this;
            } // end else
        } // end andPreProcessIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessNotIn(List values) {
            if (values.size() == 1) {
                return andPreProcessNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.PRE_PROCESS not in", values,
                    "preProcess");

                return this;
            } // end else
        } // end andPreProcessNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessIn(Object[] values) {
            if (values.length == 1) {
                return andPreProcessEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.PRE_PROCESS in",
                    Arrays.asList(values), "preProcess");

                return this;
            } // end else
        } // end andPreProcessIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessNotIn(Object[] values) {
            if (values.length == 1) {
                return andPreProcessNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.PRE_PROCESS not in",
                    Arrays.asList(values), "preProcess");

                return this;
            } // end else
        } // end andPreProcessNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS between", value1,
                value2, "preProcess");

            return this;
        } // end andPreProcessBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPreProcessNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.PRE_PROCESS not between", value1,
                value2, "preProcess");

            return this;
        } // end andPreProcessNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNull() {
            addCriterion("SERVICE_PARAMETER.SORT is null");

            return this;
        } // end andSortIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNotNull() {
            addCriterion("SERVICE_PARAMETER.SORT is not null");

            return this;
        } // end andSortIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.SORT is not null AND SERVICE_PARAMETER.SORT <> ''");

            return this;
        } // end andSortIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.SORT is null OR SERVICE_PARAMETER.SORT = '')");

            return this;
        } // end andSortIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortEqualTo(Integer value) {
            addCriterion("SERVICE_PARAMETER.SORT =", value, "sort");

            return this;
        } // end andSortEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.SORT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("SERVICE_PARAMETER.SORT <>", value, "sort");

            return this;
        } // end andSortNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualToOrIsNull(Integer value) {
            addCriterion("SERVICE_PARAMETER.SORT is null OR SERVICE_PARAMETER.SORT <>",
                value, "sort");

            return this;
        } // end andSortNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.SORT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("SERVICE_PARAMETER.SORT >", value, "sort");

            return this;
        } // end andSortGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.SORT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_PARAMETER.SORT >=", value, "sort");

            return this;
        } // end andSortGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.SORT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThan(Integer value) {
            addCriterion("SERVICE_PARAMETER.SORT <", value, "sort");

            return this;
        } // end andSortLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.SORT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_PARAMETER.SORT <=", value, "sort");

            return this;
        } // end andSortLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.SORT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIn(List values) {
            if (values.size() == 1) {
                return andSortEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SORT in", values, "sort");

                return this;
            } // end else
        } // end andSortIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotIn(List values) {
            if (values.size() == 1) {
                return andSortNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SORT not in", values, "sort");

                return this;
            } // end else
        } // end andSortNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIn(Object[] values) {
            if (values.length == 1) {
                return andSortEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SORT in",
                    Arrays.asList(values), "sort");

                return this;
            } // end else
        } // end andSortIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotIn(Object[] values) {
            if (values.length == 1) {
                return andSortNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SORT not in",
                    Arrays.asList(values), "sort");

                return this;
            } // end else
        } // end andSortNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_PARAMETER.SORT between", value1, value2,
                "sort");

            return this;
        } // end andSortBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_PARAMETER.SORT not between", value1, value2,
                "sort");

            return this;
        } // end andSortNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNull() {
            addCriterion("SERVICE_PARAMETER.TYPE is null");

            return this;
        } // end andTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotNull() {
            addCriterion("SERVICE_PARAMETER.TYPE is not null");

            return this;
        } // end andTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.TYPE is not null AND SERVICE_PARAMETER.TYPE <> ''");

            return this;
        } // end andTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.TYPE is null OR SERVICE_PARAMETER.TYPE = '')");

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
            addCriterion("SERVICE_PARAMETER.TYPE =", value, "type");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.TYPE");
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
            addCriterion("SERVICE_PARAMETER.TYPE <>", value, "type");

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
            addCriterion("SERVICE_PARAMETER.TYPE is null OR SERVICE_PARAMETER.TYPE <>",
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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.TYPE");
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
            addCriterion("SERVICE_PARAMETER.TYPE >", value, "type");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.TYPE");
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
            addCriterion("SERVICE_PARAMETER.TYPE >=", value, "type");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.TYPE");
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
            addCriterion("SERVICE_PARAMETER.TYPE <", value, "type");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.TYPE");
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
            addCriterion("SERVICE_PARAMETER.TYPE <=", value, "type");

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
            StringBuffer str = new StringBuffer("SERVICE_PARAMETER.TYPE");
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
            addCriterion("SERVICE_PARAMETER.TYPE like", buffer.toString(),
                "type");

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
            addCriterion("SERVICE_PARAMETER.TYPE not like", buffer.toString(),
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
                addCriterion("SERVICE_PARAMETER.TYPE in", values, "type");

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
                addCriterion("SERVICE_PARAMETER.TYPE not in", values, "type");

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
                addCriterion("SERVICE_PARAMETER.TYPE in",
                    Arrays.asList(values), "type");

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
                addCriterion("SERVICE_PARAMETER.TYPE not in",
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
            addCriterion("SERVICE_PARAMETER.TYPE between", value1, value2,
                "type");

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
            addCriterion("SERVICE_PARAMETER.TYPE not between", value1, value2,
                "type");

            return this;
        } // end andTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoIsNull() {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO is null");

            return this;
        } // end andValidateInfoIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoIsNotNull() {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO is not null");

            return this;
        } // end andValidateInfoIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.VALIDATE_INFO is not null AND SERVICE_PARAMETER.VALIDATE_INFO <> ''");

            return this;
        } // end andValidateInfoIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.VALIDATE_INFO is null OR SERVICE_PARAMETER.VALIDATE_INFO = '')");

            return this;
        } // end andValidateInfoIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO =", value,
                "validateInfo");

            return this;
        } // end andValidateInfoEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.VALIDATE_INFO");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValidateInfoEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoNotEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO <>", value,
                "validateInfo");

            return this;
        } // end andValidateInfoNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoNotEqualToOrIsNull(String value) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO is null OR SERVICE_PARAMETER.VALIDATE_INFO <>",
                value, "validateInfo");

            return this;
        } // end andValidateInfoNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.VALIDATE_INFO");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValidateInfoNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoGreaterThan(String value) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO >", value,
                "validateInfo");

            return this;
        } // end andValidateInfoGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.VALIDATE_INFO");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValidateInfoGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO >=", value,
                "validateInfo");

            return this;
        } // end andValidateInfoGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.VALIDATE_INFO");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValidateInfoGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoLessThan(String value) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO <", value,
                "validateInfo");

            return this;
        } // end andValidateInfoLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.VALIDATE_INFO");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValidateInfoLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO <=", value,
                "validateInfo");

            return this;
        } // end andValidateInfoLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.VALIDATE_INFO");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValidateInfoLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO like",
                buffer.toString(), "validateInfo");

            return this;
        } // end andValidateInfoLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO not like",
                buffer.toString(), "validateInfo");

            return this;
        } // end andValidateInfoNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoIn(List values) {
            if (values.size() == 1) {
                return andValidateInfoEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.VALIDATE_INFO in", values,
                    "validateInfo");

                return this;
            } // end else
        } // end andValidateInfoIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoNotIn(List values) {
            if (values.size() == 1) {
                return andValidateInfoNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.VALIDATE_INFO not in", values,
                    "validateInfo");

                return this;
            } // end else
        } // end andValidateInfoNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoIn(Object[] values) {
            if (values.length == 1) {
                return andValidateInfoEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.VALIDATE_INFO in",
                    Arrays.asList(values), "validateInfo");

                return this;
            } // end else
        } // end andValidateInfoIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoNotIn(Object[] values) {
            if (values.length == 1) {
                return andValidateInfoNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.VALIDATE_INFO not in",
                    Arrays.asList(values), "validateInfo");

                return this;
            } // end else
        } // end andValidateInfoNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO between", value1,
                value2, "validateInfo");

            return this;
        } // end andValidateInfoBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValidateInfoNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PARAMETER.VALIDATE_INFO not between", value1,
                value2, "validateInfo");

            return this;
        } // end andValidateInfoNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdIsNull() {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID is null");

            return this;
        } // end andServiceFunctionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdIsNotNull() {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID is not null");

            return this;
        } // end andServiceFunctionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.SERVICE_FUNCTION_ID is not null AND SERVICE_PARAMETER.SERVICE_FUNCTION_ID <> ''");

            return this;
        } // end andServiceFunctionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.SERVICE_FUNCTION_ID is null OR SERVICE_PARAMETER.SERVICE_FUNCTION_ID = '')");

            return this;
        } // end andServiceFunctionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdEqualTo(long value) {
            return andServiceFunctionIdEqualTo(Long.valueOf(value));
        } // end andServiceFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdEqualTo(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID =", value,
                "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_FUNCTION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceFunctionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotEqualTo(long value) {
            return andServiceFunctionIdNotEqualTo(Long.valueOf(value));
        } // end andServiceFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotEqualTo(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID <>", value,
                "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotEqualToOrIsNull(long value) {
            return andServiceFunctionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andServiceFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID is null OR SERVICE_PARAMETER.SERVICE_FUNCTION_ID <>",
                value, "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_FUNCTION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceFunctionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdGreaterThan(long value) {
            return andServiceFunctionIdGreaterThan(Long.valueOf(value));
        } // end andServiceFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdGreaterThan(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID >", value,
                "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_FUNCTION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceFunctionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdGreaterThanOrEqualTo(long value) {
            return andServiceFunctionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andServiceFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID >=", value,
                "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_FUNCTION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceFunctionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdLessThan(long value) {
            return andServiceFunctionIdLessThan(Long.valueOf(value));
        } // end andServiceFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdLessThan(java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID <", value,
                "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_FUNCTION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceFunctionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdLessThanOrEqualTo(long value) {
            return andServiceFunctionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andServiceFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID <=", value,
                "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.SERVICE_FUNCTION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andServiceFunctionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdIn(long[] values) {
            if (values.length == 1) {
                return andServiceFunctionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID in",
                    values, "serviceFunctionId");

                return this;
            } // end else
        } // end andServiceFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andServiceFunctionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID not in",
                    values, "serviceFunctionId");

                return this;
            } // end else
        } // end andServiceFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdIn(List values) {
            if (values.size() == 1) {
                return andServiceFunctionIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID in",
                    values, "serviceFunctionId");

                return this;
            } // end else
        } // end andServiceFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotIn(List values) {
            if (values.size() == 1) {
                return andServiceFunctionIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID not in",
                    values, "serviceFunctionId");

                return this;
            } // end else
        } // end andServiceFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdIn(Object[] values) {
            if (values.length == 1) {
                return andServiceFunctionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID in",
                    Arrays.asList(values), "serviceFunctionId");

                return this;
            } // end else
        } // end andServiceFunctionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andServiceFunctionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID not in",
                    Arrays.asList(values), "serviceFunctionId");

                return this;
            } // end else
        } // end andServiceFunctionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdBetween(long value1, long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID between",
                value1, value2, "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID between",
                value1, value2, "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotBetween(long value1, long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID not between",
                value1, value2, "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andServiceFunctionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SERVICE_PARAMETER.SERVICE_FUNCTION_ID not between",
                value1, value2, "serviceFunctionId");

            return this;
        } // end andServiceFunctionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsNull() {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID is null");

            return this;
        } // end andReferenceObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsNotNull() {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID is not null");

            return this;
        } // end andReferenceObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsNotEmpty() {
            addCriterion(
                "SERVICE_PARAMETER.REFERENCE_OBJECT_ID is not null AND SERVICE_PARAMETER.REFERENCE_OBJECT_ID <> ''");

            return this;
        } // end andReferenceObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsEmpty() {
            addCriterion(
                "(SERVICE_PARAMETER.REFERENCE_OBJECT_ID is null OR SERVICE_PARAMETER.REFERENCE_OBJECT_ID = '')");

            return this;
        } // end andReferenceObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdEqualTo(Long value) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID =", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.REFERENCE_OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotEqualTo(Long value) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID <>", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotEqualToOrIsNull(Long value) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID is null OR SERVICE_PARAMETER.REFERENCE_OBJECT_ID <>",
                value, "referenceObjectId");

            return this;
        } // end andReferenceObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.REFERENCE_OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThan(Long value) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID >", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.REFERENCE_OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID >=", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.REFERENCE_OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThan(Long value) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID <", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.REFERENCE_OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID <=", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SERVICE_PARAMETER.REFERENCE_OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIn(List values) {
            if (values.size() == 1) {
                return andReferenceObjectIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID in",
                    values, "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andReferenceObjectIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID not in",
                    values, "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andReferenceObjectIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID in",
                    Arrays.asList(values), "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andReferenceObjectIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID not in",
                    Arrays.asList(values), "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdBetween(Long value1, Long value2) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID between",
                value1, value2, "referenceObjectId");

            return this;
        } // end andReferenceObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("SERVICE_PARAMETER.REFERENCE_OBJECT_ID not between",
                value1, value2, "referenceObjectId");

            return this;
        } // end andReferenceObjectIdNotBetween()
    } // end Criteria
} // end ServiceParameterDAOQueryBean
