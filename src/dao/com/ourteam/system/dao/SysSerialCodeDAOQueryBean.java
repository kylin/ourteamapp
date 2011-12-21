/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * SysSerialCode query bean 2011-10-28 13:34:26
 *
 * @author Auto Gen
 */
public class SysSerialCodeDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysSerialCodeDAOQueryBean object.
     */
    public SysSerialCodeDAOQueryBean() {
        super();
    } // end SysSerialCodeDAOQueryBean()

    /**
     * Creates a new SysSerialCodeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysSerialCodeDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysSerialCodeDAOQueryBean()

    /**
     * Creates a new SysSerialCodeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysSerialCodeDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysSerialCodeDAOQueryBean()

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
            addSelectProperty(ISysSerialCodeDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCodeTemplateSelectProperty() {
        addCodeTemplateSelectProperty("codeTemplate");
    } // end addCodeTemplateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCodeTemplateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysSerialCodeDAO.CodeTemplate, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.CodeTemplate, "codeTemplate");
        } // end else
    } // end addCodeTemplateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCodeTypeSelectProperty() {
        addCodeTypeSelectProperty("codeType");
    } // end addCodeTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCodeTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysSerialCodeDAO.CodeType, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.CodeType, "codeType");
        } // end else
    } // end addCodeTypeSelectProperty()

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
            addSelectProperty(ISysSerialCodeDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSerialNumberSelectProperty() {
        addSerialNumberSelectProperty("serialNumber");
    } // end addSerialNumberSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSerialNumberSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysSerialCodeDAO.SerialNumber, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.SerialNumber, "serialNumber");
        } // end else
    } // end addSerialNumberSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSerialNumberIncrementSelectProperty() {
        addSerialNumberIncrementSelectProperty("serialNumberIncrement");
    } // end addSerialNumberIncrementSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSerialNumberIncrementSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysSerialCodeDAO.SerialNumberIncrement, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.SerialNumberIncrement,
                "serialNumberIncrement");
        } // end else
    } // end addSerialNumberIncrementSelectProperty()

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
            addSelectProperty(ISysSerialCodeDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSerialNumberFormatSelectProperty() {
        addSerialNumberFormatSelectProperty("serialNumberFormat");
    } // end addSerialNumberFormatSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSerialNumberFormatSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysSerialCodeDAO.SerialNumberFormat, aAlias);
        } // end if
        else {
            addSelectProperty(ISysSerialCodeDAO.SerialNumberFormat,
                "serialNumberFormat");
        } // end else
    } // end addSerialNumberFormatSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCodeTemplateSelectProperty();

        addCodeTypeSelectProperty();

        addRemarksSelectProperty();

        addSerialNumberSelectProperty();

        addSerialNumberIncrementSelectProperty();

        addStatusSelectProperty();

        addSerialNumberFormatSelectProperty();
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
            addCriterion("SYS_SERIAL_CODE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.ID is not null AND SYS_SERIAL_CODE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.ID is null OR SYS_SERIAL_CODE.ID = '')");

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
            addCriterion("SYS_SERIAL_CODE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.ID");
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
            addCriterion("SYS_SERIAL_CODE.ID <>", value, "id");

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
            addCriterion("SYS_SERIAL_CODE.ID is null OR SYS_SERIAL_CODE.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.ID");
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
            addCriterion("SYS_SERIAL_CODE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.ID");
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
            addCriterion("SYS_SERIAL_CODE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.ID");
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
            addCriterion("SYS_SERIAL_CODE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.ID");
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
            addCriterion("SYS_SERIAL_CODE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.ID");
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
                addCriterion("SYS_SERIAL_CODE.ID in", values, "id");

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
                addCriterion("SYS_SERIAL_CODE.ID not in", values, "id");

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
                addCriterion("SYS_SERIAL_CODE.ID in", values, "id");

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
                addCriterion("SYS_SERIAL_CODE.ID not in", values, "id");

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
                addCriterion("SYS_SERIAL_CODE.ID in", Arrays.asList(values),
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
                addCriterion("SYS_SERIAL_CODE.ID not in",
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
            addCriterion("SYS_SERIAL_CODE.ID between", value1, value2, "id");

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
            addCriterion("SYS_SERIAL_CODE.ID between", value1, value2, "id");

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
            addCriterion("SYS_SERIAL_CODE.ID not between", value1, value2, "id");

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
            addCriterion("SYS_SERIAL_CODE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateIsNull() {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE is null");

            return this;
        } // end andCodeTemplateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE is not null");

            return this;
        } // end andCodeTemplateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.CODE_TEMPLATE is not null AND SYS_SERIAL_CODE.CODE_TEMPLATE <> ''");

            return this;
        } // end andCodeTemplateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.CODE_TEMPLATE is null OR SYS_SERIAL_CODE.CODE_TEMPLATE = '')");

            return this;
        } // end andCodeTemplateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE =", value,
                "codeTemplate");

            return this;
        } // end andCodeTemplateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TEMPLATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTemplateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateNotEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE <>", value,
                "codeTemplate");

            return this;
        } // end andCodeTemplateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateNotEqualToOrIsNull(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE is null OR SYS_SERIAL_CODE.CODE_TEMPLATE <>",
                value, "codeTemplate");

            return this;
        } // end andCodeTemplateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TEMPLATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTemplateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateGreaterThan(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE >", value,
                "codeTemplate");

            return this;
        } // end andCodeTemplateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TEMPLATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTemplateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE >=", value,
                "codeTemplate");

            return this;
        } // end andCodeTemplateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TEMPLATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTemplateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateLessThan(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE <", value,
                "codeTemplate");

            return this;
        } // end andCodeTemplateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TEMPLATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTemplateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateLessThanOrEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE <=", value,
                "codeTemplate");

            return this;
        } // end andCodeTemplateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TEMPLATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTemplateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE like",
                buffer.toString(), "codeTemplate");

            return this;
        } // end andCodeTemplateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE not like",
                buffer.toString(), "codeTemplate");

            return this;
        } // end andCodeTemplateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateIn(List values) {
            if (values.size() == 1) {
                return andCodeTemplateEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE in", values,
                    "codeTemplate");

                return this;
            } // end else
        } // end andCodeTemplateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateNotIn(List values) {
            if (values.size() == 1) {
                return andCodeTemplateNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE not in", values,
                    "codeTemplate");

                return this;
            } // end else
        } // end andCodeTemplateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateIn(Object[] values) {
            if (values.length == 1) {
                return andCodeTemplateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE in",
                    Arrays.asList(values), "codeTemplate");

                return this;
            } // end else
        } // end andCodeTemplateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateNotIn(Object[] values) {
            if (values.length == 1) {
                return andCodeTemplateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE not in",
                    Arrays.asList(values), "codeTemplate");

                return this;
            } // end else
        } // end andCodeTemplateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateBetween(String value1, String value2) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE between", value1,
                value2, "codeTemplate");

            return this;
        } // end andCodeTemplateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTemplateNotBetween(String value1, String value2) {
            addCriterion("SYS_SERIAL_CODE.CODE_TEMPLATE not between", value1,
                value2, "codeTemplate");

            return this;
        } // end andCodeTemplateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeIsNull() {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE is null");

            return this;
        } // end andCodeTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE is not null");

            return this;
        } // end andCodeTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.CODE_TYPE is not null AND SYS_SERIAL_CODE.CODE_TYPE <> ''");

            return this;
        } // end andCodeTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.CODE_TYPE is null OR SYS_SERIAL_CODE.CODE_TYPE = '')");

            return this;
        } // end andCodeTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE =", value, "codeType");

            return this;
        } // end andCodeTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeNotEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE <>", value, "codeType");

            return this;
        } // end andCodeTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE is null OR SYS_SERIAL_CODE.CODE_TYPE <>",
                value, "codeType");

            return this;
        } // end andCodeTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeGreaterThan(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE >", value, "codeType");

            return this;
        } // end andCodeTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE >=", value, "codeType");

            return this;
        } // end andCodeTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeLessThan(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE <", value, "codeType");

            return this;
        } // end andCodeTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE <=", value, "codeType");

            return this;
        } // end andCodeTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.CODE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE like", buffer.toString(),
                "codeType");

            return this;
        } // end andCodeTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE not like",
                buffer.toString(), "codeType");

            return this;
        } // end andCodeTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeIn(List values) {
            if (values.size() == 1) {
                return andCodeTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TYPE in", values, "codeType");

                return this;
            } // end else
        } // end andCodeTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeNotIn(List values) {
            if (values.size() == 1) {
                return andCodeTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TYPE not in", values,
                    "codeType");

                return this;
            } // end else
        } // end andCodeTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeIn(Object[] values) {
            if (values.length == 1) {
                return andCodeTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TYPE in",
                    Arrays.asList(values), "codeType");

                return this;
            } // end else
        } // end andCodeTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andCodeTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.CODE_TYPE not in",
                    Arrays.asList(values), "codeType");

                return this;
            } // end else
        } // end andCodeTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeBetween(String value1, String value2) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE between", value1, value2,
                "codeType");

            return this;
        } // end andCodeTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeTypeNotBetween(String value1, String value2) {
            addCriterion("SYS_SERIAL_CODE.CODE_TYPE not between", value1,
                value2, "codeType");

            return this;
        } // end andCodeTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_SERIAL_CODE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.REMARKS is not null AND SYS_SERIAL_CODE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.REMARKS is null OR SYS_SERIAL_CODE.REMARKS = '')");

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
            addCriterion("SYS_SERIAL_CODE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.REMARKS");
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
            addCriterion("SYS_SERIAL_CODE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_SERIAL_CODE.REMARKS is null OR SYS_SERIAL_CODE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.REMARKS");
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
            addCriterion("SYS_SERIAL_CODE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.REMARKS");
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
            addCriterion("SYS_SERIAL_CODE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.REMARKS");
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
            addCriterion("SYS_SERIAL_CODE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.REMARKS");
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
            addCriterion("SYS_SERIAL_CODE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.REMARKS");
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
            addCriterion("SYS_SERIAL_CODE.REMARKS like", buffer.toString(),
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
            addCriterion("SYS_SERIAL_CODE.REMARKS not like", buffer.toString(),
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
                addCriterion("SYS_SERIAL_CODE.REMARKS in", values, "remarks");

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
                addCriterion("SYS_SERIAL_CODE.REMARKS not in", values, "remarks");

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
                addCriterion("SYS_SERIAL_CODE.REMARKS in",
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
                addCriterion("SYS_SERIAL_CODE.REMARKS not in",
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
            addCriterion("SYS_SERIAL_CODE.REMARKS between", value1, value2,
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
            addCriterion("SYS_SERIAL_CODE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNull() {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER is null");

            return this;
        } // end andSerialNumberIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER is not null");

            return this;
        } // end andSerialNumberIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.SERIAL_NUMBER is not null AND SYS_SERIAL_CODE.SERIAL_NUMBER <> ''");

            return this;
        } // end andSerialNumberIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.SERIAL_NUMBER is null OR SYS_SERIAL_CODE.SERIAL_NUMBER = '')");

            return this;
        } // end andSerialNumberIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberEqualTo(long value) {
            return andSerialNumberEqualTo(Long.valueOf(value));
        } // end andSerialNumberEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberEqualTo(java.lang.Long value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER =", value,
                "serialNumber");

            return this;
        } // end andSerialNumberEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.SERIAL_NUMBER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualTo(long value) {
            return andSerialNumberNotEqualTo(Long.valueOf(value));
        } // end andSerialNumberNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER <>", value,
                "serialNumber");

            return this;
        } // end andSerialNumberNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualToOrIsNull(long value) {
            return andSerialNumberNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSerialNumberNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER is null OR SYS_SERIAL_CODE.SERIAL_NUMBER <>",
                value, "serialNumber");

            return this;
        } // end andSerialNumberNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.SERIAL_NUMBER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThan(long value) {
            return andSerialNumberGreaterThan(Long.valueOf(value));
        } // end andSerialNumberGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThan(java.lang.Long value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER >", value,
                "serialNumber");

            return this;
        } // end andSerialNumberGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.SERIAL_NUMBER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThanOrEqualTo(long value) {
            return andSerialNumberGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSerialNumberGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER >=", value,
                "serialNumber");

            return this;
        } // end andSerialNumberGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.SERIAL_NUMBER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThan(long value) {
            return andSerialNumberLessThan(Long.valueOf(value));
        } // end andSerialNumberLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThan(java.lang.Long value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER <", value,
                "serialNumber");

            return this;
        } // end andSerialNumberLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.SERIAL_NUMBER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThanOrEqualTo(long value) {
            return andSerialNumberLessThanOrEqualTo(Long.valueOf(value));
        } // end andSerialNumberLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER <=", value,
                "serialNumber");

            return this;
        } // end andSerialNumberLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.SERIAL_NUMBER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIn(long[] values) {
            if (values.length == 1) {
                return andSerialNumberEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER in", values,
                    "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotIn(long[] values) {
            if (values.length == 1) {
                return andSerialNumberNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER not in", values,
                    "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER in", values,
                    "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER not in", values,
                    "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER in",
                    Arrays.asList(values), "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER not in",
                    Arrays.asList(values), "serialNumber");

                return this;
            } // end else
        } // end andSerialNumberNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberBetween(long value1, long value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER between", value1,
                value2, "serialNumber");

            return this;
        } // end andSerialNumberBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER between", value1,
                value2, "serialNumber");

            return this;
        } // end andSerialNumberBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotBetween(long value1, long value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER not between", value1,
                value2, "serialNumber");

            return this;
        } // end andSerialNumberNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER not between", value1,
                value2, "serialNumber");

            return this;
        } // end andSerialNumberNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementIsNull() {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT is null");

            return this;
        } // end andSerialNumberIncrementIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT is not null");

            return this;
        } // end andSerialNumberIncrementIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT is not null AND SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT <> ''");

            return this;
        } // end andSerialNumberIncrementIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT is null OR SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT = '')");

            return this;
        } // end andSerialNumberIncrementIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementEqualTo(int value) {
            return andSerialNumberIncrementEqualTo(Integer.valueOf(value));
        } // end andSerialNumberIncrementEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementEqualTo(java.lang.Integer value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT =", value,
                "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberIncrementEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotEqualTo(int value) {
            return andSerialNumberIncrementNotEqualTo(Integer.valueOf(value));
        } // end andSerialNumberIncrementNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotEqualTo(
            java.lang.Integer value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT <>", value,
                "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotEqualToOrIsNull(int value) {
            return andSerialNumberIncrementNotEqualToOrIsNull(Integer.valueOf(
                    value));
        } // end andSerialNumberIncrementNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotEqualToOrIsNull(
            java.lang.Integer value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT is null OR SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT <>",
                value, "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberIncrementNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementGreaterThan(int value) {
            return andSerialNumberIncrementGreaterThan(Integer.valueOf(value));
        } // end andSerialNumberIncrementGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementGreaterThan(
            java.lang.Integer value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT >", value,
                "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberIncrementGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementGreaterThanOrEqualTo(int value) {
            return andSerialNumberIncrementGreaterThanOrEqualTo(Integer.valueOf(
                    value));
        } // end andSerialNumberIncrementGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT >=", value,
                "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberIncrementGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementLessThan(int value) {
            return andSerialNumberIncrementLessThan(Integer.valueOf(value));
        } // end andSerialNumberIncrementLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementLessThan(
            java.lang.Integer value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT <", value,
                "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberIncrementLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementLessThanOrEqualTo(int value) {
            return andSerialNumberIncrementLessThanOrEqualTo(Integer.valueOf(
                    value));
        } // end andSerialNumberIncrementLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementLessThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT <=", value,
                "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberIncrementLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementIn(int[] values) {
            if (values.length == 1) {
                return andSerialNumberIncrementEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT in",
                    values, "serialNumberIncrement");

                return this;
            } // end else
        } // end andSerialNumberIncrementIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotIn(int[] values) {
            if (values.length == 1) {
                return andSerialNumberIncrementNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT not in",
                    values, "serialNumberIncrement");

                return this;
            } // end else
        } // end andSerialNumberIncrementNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberIncrementEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT in",
                    values, "serialNumberIncrement");

                return this;
            } // end else
        } // end andSerialNumberIncrementIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberIncrementNotEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT not in",
                    values, "serialNumberIncrement");

                return this;
            } // end else
        } // end andSerialNumberIncrementNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberIncrementEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT in",
                    Arrays.asList(values), "serialNumberIncrement");

                return this;
            } // end else
        } // end andSerialNumberIncrementIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberIncrementNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT not in",
                    Arrays.asList(values), "serialNumberIncrement");

                return this;
            } // end else
        } // end andSerialNumberIncrementNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementBetween(int value1, int value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT between",
                value1, value2, "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementBetween(
            java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT between",
                value1, value2, "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotBetween(int value1,
            int value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT not between",
                value1, value2, "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberIncrementNotBetween(
            java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT not between",
                value1, value2, "serialNumberIncrement");

            return this;
        } // end andSerialNumberIncrementNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_SERIAL_CODE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.STATUS is not null AND SYS_SERIAL_CODE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.STATUS is null OR SYS_SERIAL_CODE.STATUS = '')");

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
            addCriterion("SYS_SERIAL_CODE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.STATUS");
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
            addCriterion("SYS_SERIAL_CODE.STATUS <>", value, "status");

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
            addCriterion("SYS_SERIAL_CODE.STATUS is null OR SYS_SERIAL_CODE.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.STATUS");
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
            addCriterion("SYS_SERIAL_CODE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.STATUS");
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
            addCriterion("SYS_SERIAL_CODE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.STATUS");
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
            addCriterion("SYS_SERIAL_CODE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.STATUS");
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
            addCriterion("SYS_SERIAL_CODE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_SERIAL_CODE.STATUS");
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
            addCriterion("SYS_SERIAL_CODE.STATUS like", buffer.toString(),
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
            addCriterion("SYS_SERIAL_CODE.STATUS not like", buffer.toString(),
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
                addCriterion("SYS_SERIAL_CODE.STATUS in", values, "status");

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
                addCriterion("SYS_SERIAL_CODE.STATUS not in", values, "status");

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
                addCriterion("SYS_SERIAL_CODE.STATUS in",
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
                addCriterion("SYS_SERIAL_CODE.STATUS not in",
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
            addCriterion("SYS_SERIAL_CODE.STATUS between", value1, value2,
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
            addCriterion("SYS_SERIAL_CODE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatIsNull() {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT is null");

            return this;
        } // end andSerialNumberFormatIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatIsNotNull() {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT is not null");

            return this;
        } // end andSerialNumberFormatIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatIsNotEmpty() {
            addCriterion(
                "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT is not null AND SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT <> ''");

            return this;
        } // end andSerialNumberFormatIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatIsEmpty() {
            addCriterion(
                "(SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT is null OR SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT = '')");

            return this;
        } // end andSerialNumberFormatIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT =", value,
                "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberFormatEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatNotEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT <>", value,
                "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatNotEqualToOrIsNull(String value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT is null OR SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT <>",
                value, "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberFormatNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatGreaterThan(String value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT >", value,
                "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberFormatGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT >=", value,
                "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberFormatGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatLessThan(String value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT <", value,
                "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberFormatLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatLessThanOrEqualTo(String value) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT <=", value,
                "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSerialNumberFormatLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT like",
                buffer.toString(), "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT not like",
                buffer.toString(), "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberFormatEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT in", values,
                    "serialNumberFormat");

                return this;
            } // end else
        } // end andSerialNumberFormatIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatNotIn(List values) {
            if (values.size() == 1) {
                return andSerialNumberFormatNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT not in",
                    values, "serialNumberFormat");

                return this;
            } // end else
        } // end andSerialNumberFormatNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberFormatEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT in",
                    Arrays.asList(values), "serialNumberFormat");

                return this;
            } // end else
        } // end andSerialNumberFormatIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatNotIn(Object[] values) {
            if (values.length == 1) {
                return andSerialNumberFormatNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT not in",
                    Arrays.asList(values), "serialNumberFormat");

                return this;
            } // end else
        } // end andSerialNumberFormatNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatBetween(String value1,
            String value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT between",
                value1, value2, "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSerialNumberFormatNotBetween(String value1,
            String value2) {
            addCriterion("SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT not between",
                value1, value2, "serialNumberFormat");

            return this;
        } // end andSerialNumberFormatNotBetween()
    } // end Criteria
} // end SysSerialCodeDAOQueryBean
