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
 * MiddleWareTool query bean 2011-12-17 17:30:54
 *
 * @author Auto Gen
 */
public class MiddleWareToolDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new MiddleWareToolDAOQueryBean object.
     */
    public MiddleWareToolDAOQueryBean() {
        super();
    } // end MiddleWareToolDAOQueryBean()

    /**
     * Creates a new MiddleWareToolDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public MiddleWareToolDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end MiddleWareToolDAOQueryBean()

    /**
     * Creates a new MiddleWareToolDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public MiddleWareToolDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end MiddleWareToolDAOQueryBean()

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
            addSelectProperty(IMiddleWareToolDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCompleteKeyWorkSelectProperty() {
        addCompleteKeyWorkSelectProperty("completeKeyWork");
    } // end addCompleteKeyWorkSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCompleteKeyWorkSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.CompleteKeyWork, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.CompleteKeyWork,
                "completeKeyWork");
        } // end else
    } // end addCompleteKeyWorkSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addInputFormSelectProperty() {
        addInputFormSelectProperty("inputForm");
    } // end addInputFormSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addInputFormSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.InputForm, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.InputForm, "inputForm");
        } // end else
    } // end addInputFormSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addOutputFileSelectProperty() {
        addOutputFileSelectProperty("outputFile");
    } // end addOutputFileSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addOutputFileSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.OutputFile, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.OutputFile, "outputFile");
        } // end else
    } // end addOutputFileSelectProperty()

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
            addSelectProperty(IMiddleWareToolDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.Remarks, "remarks");
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
            addSelectProperty(IMiddleWareToolDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSucceedKeyWorkSelectProperty() {
        addSucceedKeyWorkSelectProperty("succeedKeyWork");
    } // end addSucceedKeyWorkSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSucceedKeyWorkSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.SucceedKeyWork, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.SucceedKeyWork,
                "succeedKeyWork");
        } // end else
    } // end addSucceedKeyWorkSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTimeOutSelectProperty() {
        addTimeOutSelectProperty("timeOut");
    } // end addTimeOutSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTimeOutSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.TimeOut, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.TimeOut, "timeOut");
        } // end else
    } // end addTimeOutSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolGroupIdSelectProperty() {
        addToolGroupIdSelectProperty("toolGroupId");
    } // end addToolGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolGroupIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.ToolGroupId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.ToolGroupId, "toolGroupId");
        } // end else
    } // end addToolGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolScriptSelectProperty() {
        addToolScriptSelectProperty("toolScript");
    } // end addToolScriptSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolScriptSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.ToolScript, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.ToolScript, "toolScript");
        } // end else
    } // end addToolScriptSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolScriptTypeSelectProperty() {
        addToolScriptTypeSelectProperty("toolScriptType");
    } // end addToolScriptTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolScriptTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.ToolScriptType, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.ToolScriptType,
                "toolScriptType");
        } // end else
    } // end addToolScriptTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLastEditorIdSelectProperty() {
        addLastEditorIdSelectProperty("lastEditorId");
    } // end addLastEditorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLastEditorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.LastEditorId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.LastEditorId, "lastEditorId");
        } // end else
    } // end addLastEditorIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLastEditTimeSelectProperty() {
        addLastEditTimeSelectProperty("lastEditTime");
    } // end addLastEditTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLastEditTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.LastEditTime, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.LastEditTime, "lastEditTime");
        } // end else
    } // end addLastEditTimeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLastEditorNameSelectProperty() {
        addLastEditorNameSelectProperty("lastEditorName");
    } // end addLastEditorNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLastEditorNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.LastEditorName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.LastEditorName,
                "lastEditorName");
        } // end else
    } // end addLastEditorNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolNameSelectProperty() {
        addToolNameSelectProperty("toolName");
    } // end addToolNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.ToolName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.ToolName, "toolName");
        } // end else
    } // end addToolNameSelectProperty()

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
            addSelectProperty(IMiddleWareToolDAO.ProviderId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.ProviderId, "providerId");
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
            addSelectProperty(IMiddleWareToolDAO.ProviderName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.ProviderName, "providerName");
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
            addSelectProperty(IMiddleWareToolDAO.MiddleWareName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.MiddleWareName,
                "middleWareName");
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
            addSelectProperty(IMiddleWareToolDAO.MiddleWareVersion, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.MiddleWareVersion,
                "middleWareVersion");
        } // end else
    } // end addMiddleWareVersionSelectProperty()

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
            addSelectProperty(IMiddleWareToolDAO.MiddleWareType, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.MiddleWareType,
                "middleWareType");
        } // end else
    } // end addMiddleWareTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolProgramSelectProperty() {
        addToolProgramSelectProperty("toolProgram");
    } // end addToolProgramSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolProgramSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolDAO.ToolProgram, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolDAO.ToolProgram, "toolProgram");
        } // end else
    } // end addToolProgramSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCompleteKeyWorkSelectProperty();

        addInputFormSelectProperty();

        addOutputFileSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addSucceedKeyWorkSelectProperty();

        addTimeOutSelectProperty();

        addToolGroupIdSelectProperty();

        addToolScriptSelectProperty();

        addToolScriptTypeSelectProperty();

        addLastEditorIdSelectProperty();

        addLastEditTimeSelectProperty();

        addLastEditorNameSelectProperty();

        addToolNameSelectProperty();

        addProviderIdSelectProperty();

        addProviderNameSelectProperty();

        addMiddleWareNameSelectProperty();

        addMiddleWareVersionSelectProperty();

        addMiddleWareTypeSelectProperty();

        addToolProgramSelectProperty();
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
            addCriterion("MIDDLE_WARE_TOOL.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.ID is not null AND MIDDLE_WARE_TOOL.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.ID is null OR MIDDLE_WARE_TOOL.ID = '')");

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
            addCriterion("MIDDLE_WARE_TOOL.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.ID");
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
            addCriterion("MIDDLE_WARE_TOOL.ID <>", value, "id");

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
            addCriterion("MIDDLE_WARE_TOOL.ID is null OR MIDDLE_WARE_TOOL.ID <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.ID");
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
            addCriterion("MIDDLE_WARE_TOOL.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.ID");
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
            addCriterion("MIDDLE_WARE_TOOL.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.ID");
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
            addCriterion("MIDDLE_WARE_TOOL.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.ID");
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
            addCriterion("MIDDLE_WARE_TOOL.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.ID");
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
                addCriterion("MIDDLE_WARE_TOOL.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL.ID in", Arrays.asList(values),
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
                addCriterion("MIDDLE_WARE_TOOL.ID not in",
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
            addCriterion("MIDDLE_WARE_TOOL.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE_TOOL.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE_TOOL.ID not between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE_TOOL.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK is null");

            return this;
        } // end andCompleteKeyWorkIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK is not null");

            return this;
        } // end andCompleteKeyWorkIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK is not null AND MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK <> ''");

            return this;
        } // end andCompleteKeyWorkIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK is null OR MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK = '')");

            return this;
        } // end andCompleteKeyWorkIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK =", value,
                "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteKeyWorkEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK <>", value,
                "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK is null OR MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK <>",
                value, "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteKeyWorkNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK >", value,
                "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteKeyWorkGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK >=", value,
                "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteKeyWorkGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK <", value,
                "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteKeyWorkLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK <=", value,
                "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCompleteKeyWorkLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK like",
                buffer.toString(), "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK not like",
                buffer.toString(), "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkIn(List values) {
            if (values.size() == 1) {
                return andCompleteKeyWorkEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK in", values,
                    "completeKeyWork");

                return this;
            } // end else
        } // end andCompleteKeyWorkIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkNotIn(List values) {
            if (values.size() == 1) {
                return andCompleteKeyWorkNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK not in",
                    values, "completeKeyWork");

                return this;
            } // end else
        } // end andCompleteKeyWorkNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkIn(Object[] values) {
            if (values.length == 1) {
                return andCompleteKeyWorkEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK in",
                    Arrays.asList(values), "completeKeyWork");

                return this;
            } // end else
        } // end andCompleteKeyWorkIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkNotIn(Object[] values) {
            if (values.length == 1) {
                return andCompleteKeyWorkNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK not in",
                    Arrays.asList(values), "completeKeyWork");

                return this;
            } // end else
        } // end andCompleteKeyWorkNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK between", value1,
                value2, "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCompleteKeyWorkNotBetween(String value1,
            String value2) {
            addCriterion("MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK not between",
                value1, value2, "completeKeyWork");

            return this;
        } // end andCompleteKeyWorkNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM is null");

            return this;
        } // end andInputFormIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM is not null");

            return this;
        } // end andInputFormIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.INPUT_FORM is not null AND MIDDLE_WARE_TOOL.INPUT_FORM <> ''");

            return this;
        } // end andInputFormIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.INPUT_FORM is null OR MIDDLE_WARE_TOOL.INPUT_FORM = '')");

            return this;
        } // end andInputFormIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM =", value, "inputForm");

            return this;
        } // end andInputFormEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.INPUT_FORM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInputFormEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM <>", value, "inputForm");

            return this;
        } // end andInputFormNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM is null OR MIDDLE_WARE_TOOL.INPUT_FORM <>",
                value, "inputForm");

            return this;
        } // end andInputFormNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.INPUT_FORM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInputFormNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM >", value, "inputForm");

            return this;
        } // end andInputFormGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.INPUT_FORM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInputFormGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM >=", value, "inputForm");

            return this;
        } // end andInputFormGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.INPUT_FORM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInputFormGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM <", value, "inputForm");

            return this;
        } // end andInputFormLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.INPUT_FORM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInputFormLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM <=", value, "inputForm");

            return this;
        } // end andInputFormLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.INPUT_FORM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andInputFormLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM like", buffer.toString(),
                "inputForm");

            return this;
        } // end andInputFormLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM not like",
                buffer.toString(), "inputForm");

            return this;
        } // end andInputFormNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormIn(List values) {
            if (values.size() == 1) {
                return andInputFormEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM in", values,
                    "inputForm");

                return this;
            } // end else
        } // end andInputFormIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormNotIn(List values) {
            if (values.size() == 1) {
                return andInputFormNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM not in", values,
                    "inputForm");

                return this;
            } // end else
        } // end andInputFormNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormIn(Object[] values) {
            if (values.length == 1) {
                return andInputFormEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM in",
                    Arrays.asList(values), "inputForm");

                return this;
            } // end else
        } // end andInputFormIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormNotIn(Object[] values) {
            if (values.length == 1) {
                return andInputFormNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM not in",
                    Arrays.asList(values), "inputForm");

                return this;
            } // end else
        } // end andInputFormNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM between", value1, value2,
                "inputForm");

            return this;
        } // end andInputFormBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andInputFormNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.INPUT_FORM not between", value1,
                value2, "inputForm");

            return this;
        } // end andInputFormNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE is null");

            return this;
        } // end andOutputFileIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE is not null");

            return this;
        } // end andOutputFileIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.OUTPUT_FILE is not null AND MIDDLE_WARE_TOOL.OUTPUT_FILE <> ''");

            return this;
        } // end andOutputFileIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.OUTPUT_FILE is null OR MIDDLE_WARE_TOOL.OUTPUT_FILE = '')");

            return this;
        } // end andOutputFileIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE =", value, "outputFile");

            return this;
        } // end andOutputFileEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.OUTPUT_FILE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOutputFileEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE <>", value, "outputFile");

            return this;
        } // end andOutputFileNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE is null OR MIDDLE_WARE_TOOL.OUTPUT_FILE <>",
                value, "outputFile");

            return this;
        } // end andOutputFileNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.OUTPUT_FILE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOutputFileNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE >", value, "outputFile");

            return this;
        } // end andOutputFileGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.OUTPUT_FILE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOutputFileGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE >=", value, "outputFile");

            return this;
        } // end andOutputFileGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.OUTPUT_FILE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOutputFileGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE <", value, "outputFile");

            return this;
        } // end andOutputFileLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.OUTPUT_FILE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOutputFileLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE <=", value, "outputFile");

            return this;
        } // end andOutputFileLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.OUTPUT_FILE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOutputFileLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE like",
                buffer.toString(), "outputFile");

            return this;
        } // end andOutputFileLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE not like",
                buffer.toString(), "outputFile");

            return this;
        } // end andOutputFileNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileIn(List values) {
            if (values.size() == 1) {
                return andOutputFileEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE in", values,
                    "outputFile");

                return this;
            } // end else
        } // end andOutputFileIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileNotIn(List values) {
            if (values.size() == 1) {
                return andOutputFileNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE not in", values,
                    "outputFile");

                return this;
            } // end else
        } // end andOutputFileNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileIn(Object[] values) {
            if (values.length == 1) {
                return andOutputFileEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE in",
                    Arrays.asList(values), "outputFile");

                return this;
            } // end else
        } // end andOutputFileIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileNotIn(Object[] values) {
            if (values.length == 1) {
                return andOutputFileNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE not in",
                    Arrays.asList(values), "outputFile");

                return this;
            } // end else
        } // end andOutputFileNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE between", value1,
                value2, "outputFile");

            return this;
        } // end andOutputFileBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOutputFileNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.OUTPUT_FILE not between", value1,
                value2, "outputFile");

            return this;
        } // end andOutputFileNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.REMARKS is not null AND MIDDLE_WARE_TOOL.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.REMARKS is null OR MIDDLE_WARE_TOOL.REMARKS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS <>", value, "remarks");

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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS is null OR MIDDLE_WARE_TOOL.REMARKS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS like", buffer.toString(),
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS not like",
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
                addCriterion("MIDDLE_WARE_TOOL.REMARKS in", values, "remarks");

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
                addCriterion("MIDDLE_WARE_TOOL.REMARKS not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL.REMARKS in",
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
                addCriterion("MIDDLE_WARE_TOOL.REMARKS not in",
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.STATUS is not null AND MIDDLE_WARE_TOOL.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.STATUS is null OR MIDDLE_WARE_TOOL.STATUS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS <>", value, "status");

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
            addCriterion("MIDDLE_WARE_TOOL.STATUS is null OR MIDDLE_WARE_TOOL.STATUS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS like", buffer.toString(),
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS not like", buffer.toString(),
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
                addCriterion("MIDDLE_WARE_TOOL.STATUS in", values, "status");

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
                addCriterion("MIDDLE_WARE_TOOL.STATUS not in", values, "status");

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
                addCriterion("MIDDLE_WARE_TOOL.STATUS in",
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
                addCriterion("MIDDLE_WARE_TOOL.STATUS not in",
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK is null");

            return this;
        } // end andSucceedKeyWorkIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK is not null");

            return this;
        } // end andSucceedKeyWorkIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK is not null AND MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK <> ''");

            return this;
        } // end andSucceedKeyWorkIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK is null OR MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK = '')");

            return this;
        } // end andSucceedKeyWorkIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK =", value,
                "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSucceedKeyWorkEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK <>", value,
                "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK is null OR MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK <>",
                value, "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSucceedKeyWorkNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK >", value,
                "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSucceedKeyWorkGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK >=", value,
                "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSucceedKeyWorkGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK <", value,
                "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSucceedKeyWorkLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK <=", value,
                "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSucceedKeyWorkLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK like",
                buffer.toString(), "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK not like",
                buffer.toString(), "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkIn(List values) {
            if (values.size() == 1) {
                return andSucceedKeyWorkEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK in", values,
                    "succeedKeyWork");

                return this;
            } // end else
        } // end andSucceedKeyWorkIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkNotIn(List values) {
            if (values.size() == 1) {
                return andSucceedKeyWorkNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK not in",
                    values, "succeedKeyWork");

                return this;
            } // end else
        } // end andSucceedKeyWorkNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkIn(Object[] values) {
            if (values.length == 1) {
                return andSucceedKeyWorkEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK in",
                    Arrays.asList(values), "succeedKeyWork");

                return this;
            } // end else
        } // end andSucceedKeyWorkIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkNotIn(Object[] values) {
            if (values.length == 1) {
                return andSucceedKeyWorkNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK not in",
                    Arrays.asList(values), "succeedKeyWork");

                return this;
            } // end else
        } // end andSucceedKeyWorkNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK between", value1,
                value2, "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSucceedKeyWorkNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK not between",
                value1, value2, "succeedKeyWork");

            return this;
        } // end andSucceedKeyWorkNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT is null");

            return this;
        } // end andTimeOutIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT is not null");

            return this;
        } // end andTimeOutIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.TIME_OUT is not null AND MIDDLE_WARE_TOOL.TIME_OUT <> ''");

            return this;
        } // end andTimeOutIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.TIME_OUT is null OR MIDDLE_WARE_TOOL.TIME_OUT = '')");

            return this;
        } // end andTimeOutIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutEqualTo(int value) {
            return andTimeOutEqualTo(Integer.valueOf(value));
        } // end andTimeOutEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutEqualTo(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT =", value, "timeOut");

            return this;
        } // end andTimeOutEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TIME_OUT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTimeOutEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotEqualTo(int value) {
            return andTimeOutNotEqualTo(Integer.valueOf(value));
        } // end andTimeOutNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotEqualTo(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT <>", value, "timeOut");

            return this;
        } // end andTimeOutNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotEqualToOrIsNull(int value) {
            return andTimeOutNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andTimeOutNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT is null OR MIDDLE_WARE_TOOL.TIME_OUT <>",
                value, "timeOut");

            return this;
        } // end andTimeOutNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TIME_OUT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTimeOutNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutGreaterThan(int value) {
            return andTimeOutGreaterThan(Integer.valueOf(value));
        } // end andTimeOutGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutGreaterThan(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT >", value, "timeOut");

            return this;
        } // end andTimeOutGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TIME_OUT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTimeOutGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutGreaterThanOrEqualTo(int value) {
            return andTimeOutGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andTimeOutGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT >=", value, "timeOut");

            return this;
        } // end andTimeOutGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TIME_OUT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTimeOutGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutLessThan(int value) {
            return andTimeOutLessThan(Integer.valueOf(value));
        } // end andTimeOutLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutLessThan(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT <", value, "timeOut");

            return this;
        } // end andTimeOutLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TIME_OUT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTimeOutLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutLessThanOrEqualTo(int value) {
            return andTimeOutLessThanOrEqualTo(Integer.valueOf(value));
        } // end andTimeOutLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT <=", value, "timeOut");

            return this;
        } // end andTimeOutLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TIME_OUT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTimeOutLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutIn(int[] values) {
            if (values.length == 1) {
                return andTimeOutEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TIME_OUT in", values, "timeOut");

                return this;
            } // end else
        } // end andTimeOutIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotIn(int[] values) {
            if (values.length == 1) {
                return andTimeOutNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TIME_OUT not in", values,
                    "timeOut");

                return this;
            } // end else
        } // end andTimeOutNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutIn(List values) {
            if (values.size() == 1) {
                return andTimeOutEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TIME_OUT in", values, "timeOut");

                return this;
            } // end else
        } // end andTimeOutIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotIn(List values) {
            if (values.size() == 1) {
                return andTimeOutNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TIME_OUT not in", values,
                    "timeOut");

                return this;
            } // end else
        } // end andTimeOutNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutIn(Object[] values) {
            if (values.length == 1) {
                return andTimeOutEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TIME_OUT in",
                    Arrays.asList(values), "timeOut");

                return this;
            } // end else
        } // end andTimeOutIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotIn(Object[] values) {
            if (values.length == 1) {
                return andTimeOutNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TIME_OUT not in",
                    Arrays.asList(values), "timeOut");

                return this;
            } // end else
        } // end andTimeOutNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutBetween(int value1, int value2) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT between", value1, value2,
                "timeOut");

            return this;
        } // end andTimeOutBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT between", value1, value2,
                "timeOut");

            return this;
        } // end andTimeOutBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotBetween(int value1, int value2) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT not between", value1,
                value2, "timeOut");

            return this;
        } // end andTimeOutNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTimeOutNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("MIDDLE_WARE_TOOL.TIME_OUT not between", value1,
                value2, "timeOut");

            return this;
        } // end andTimeOutNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID is null");

            return this;
        } // end andToolGroupIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID is not null");

            return this;
        } // end andToolGroupIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.TOOL_GROUP_ID is not null AND MIDDLE_WARE_TOOL.TOOL_GROUP_ID <> ''");

            return this;
        } // end andToolGroupIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.TOOL_GROUP_ID is null OR MIDDLE_WARE_TOOL.TOOL_GROUP_ID = '')");

            return this;
        } // end andToolGroupIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdEqualTo(long value) {
            return andToolGroupIdEqualTo(Long.valueOf(value));
        } // end andToolGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID =", value,
                "toolGroupId");

            return this;
        } // end andToolGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_GROUP_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolGroupIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotEqualTo(long value) {
            return andToolGroupIdNotEqualTo(Long.valueOf(value));
        } // end andToolGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID <>", value,
                "toolGroupId");

            return this;
        } // end andToolGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotEqualToOrIsNull(long value) {
            return andToolGroupIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andToolGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID is null OR MIDDLE_WARE_TOOL.TOOL_GROUP_ID <>",
                value, "toolGroupId");

            return this;
        } // end andToolGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_GROUP_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolGroupIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdGreaterThan(long value) {
            return andToolGroupIdGreaterThan(Long.valueOf(value));
        } // end andToolGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID >", value,
                "toolGroupId");

            return this;
        } // end andToolGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_GROUP_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolGroupIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdGreaterThanOrEqualTo(long value) {
            return andToolGroupIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andToolGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID >=", value,
                "toolGroupId");

            return this;
        } // end andToolGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_GROUP_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolGroupIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdLessThan(long value) {
            return andToolGroupIdLessThan(Long.valueOf(value));
        } // end andToolGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID <", value,
                "toolGroupId");

            return this;
        } // end andToolGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_GROUP_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolGroupIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdLessThanOrEqualTo(long value) {
            return andToolGroupIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andToolGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID <=", value,
                "toolGroupId");

            return this;
        } // end andToolGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_GROUP_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolGroupIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdIn(long[] values) {
            if (values.length == 1) {
                return andToolGroupIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID in", values,
                    "toolGroupId");

                return this;
            } // end else
        } // end andToolGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotIn(long[] values) {
            if (values.length == 1) {
                return andToolGroupIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID not in", values,
                    "toolGroupId");

                return this;
            } // end else
        } // end andToolGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdIn(List values) {
            if (values.size() == 1) {
                return andToolGroupIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID in", values,
                    "toolGroupId");

                return this;
            } // end else
        } // end andToolGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotIn(List values) {
            if (values.size() == 1) {
                return andToolGroupIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID not in", values,
                    "toolGroupId");

                return this;
            } // end else
        } // end andToolGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdIn(Object[] values) {
            if (values.length == 1) {
                return andToolGroupIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID in",
                    Arrays.asList(values), "toolGroupId");

                return this;
            } // end else
        } // end andToolGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolGroupIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID not in",
                    Arrays.asList(values), "toolGroupId");

                return this;
            } // end else
        } // end andToolGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID between", value1,
                value2, "toolGroupId");

            return this;
        } // end andToolGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID between", value1,
                value2, "toolGroupId");

            return this;
        } // end andToolGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID not between", value1,
                value2, "toolGroupId");

            return this;
        } // end andToolGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolGroupIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_GROUP_ID not between", value1,
                value2, "toolGroupId");

            return this;
        } // end andToolGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT is null");

            return this;
        } // end andToolScriptIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT is not null");

            return this;
        } // end andToolScriptIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.TOOL_SCRIPT is not null AND MIDDLE_WARE_TOOL.TOOL_SCRIPT <> ''");

            return this;
        } // end andToolScriptIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.TOOL_SCRIPT is null OR MIDDLE_WARE_TOOL.TOOL_SCRIPT = '')");

            return this;
        } // end andToolScriptIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT =", value, "toolScript");

            return this;
        } // end andToolScriptEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_SCRIPT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT <>", value, "toolScript");

            return this;
        } // end andToolScriptNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT is null OR MIDDLE_WARE_TOOL.TOOL_SCRIPT <>",
                value, "toolScript");

            return this;
        } // end andToolScriptNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_SCRIPT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT >", value, "toolScript");

            return this;
        } // end andToolScriptGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_SCRIPT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT >=", value, "toolScript");

            return this;
        } // end andToolScriptGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_SCRIPT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT <", value, "toolScript");

            return this;
        } // end andToolScriptLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_SCRIPT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT <=", value, "toolScript");

            return this;
        } // end andToolScriptLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_SCRIPT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT like",
                buffer.toString(), "toolScript");

            return this;
        } // end andToolScriptLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT not like",
                buffer.toString(), "toolScript");

            return this;
        } // end andToolScriptNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptIn(List values) {
            if (values.size() == 1) {
                return andToolScriptEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT in", values,
                    "toolScript");

                return this;
            } // end else
        } // end andToolScriptIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptNotIn(List values) {
            if (values.size() == 1) {
                return andToolScriptNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT not in", values,
                    "toolScript");

                return this;
            } // end else
        } // end andToolScriptNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptIn(Object[] values) {
            if (values.length == 1) {
                return andToolScriptEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT in",
                    Arrays.asList(values), "toolScript");

                return this;
            } // end else
        } // end andToolScriptIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolScriptNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT not in",
                    Arrays.asList(values), "toolScript");

                return this;
            } // end else
        } // end andToolScriptNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT between", value1,
                value2, "toolScript");

            return this;
        } // end andToolScriptBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT not between", value1,
                value2, "toolScript");

            return this;
        } // end andToolScriptNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE is null");

            return this;
        } // end andToolScriptTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE is not null");

            return this;
        } // end andToolScriptTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE is not null AND MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE <> ''");

            return this;
        } // end andToolScriptTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE is null OR MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE = '')");

            return this;
        } // end andToolScriptTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE =", value,
                "toolScriptType");

            return this;
        } // end andToolScriptTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE <>", value,
                "toolScriptType");

            return this;
        } // end andToolScriptTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE is null OR MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE <>",
                value, "toolScriptType");

            return this;
        } // end andToolScriptTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE >", value,
                "toolScriptType");

            return this;
        } // end andToolScriptTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE >=", value,
                "toolScriptType");

            return this;
        } // end andToolScriptTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE <", value,
                "toolScriptType");

            return this;
        } // end andToolScriptTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE <=", value,
                "toolScriptType");

            return this;
        } // end andToolScriptTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolScriptTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE like",
                buffer.toString(), "toolScriptType");

            return this;
        } // end andToolScriptTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE not like",
                buffer.toString(), "toolScriptType");

            return this;
        } // end andToolScriptTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeIn(List values) {
            if (values.size() == 1) {
                return andToolScriptTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE in", values,
                    "toolScriptType");

                return this;
            } // end else
        } // end andToolScriptTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeNotIn(List values) {
            if (values.size() == 1) {
                return andToolScriptTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE not in",
                    values, "toolScriptType");

                return this;
            } // end else
        } // end andToolScriptTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeIn(Object[] values) {
            if (values.length == 1) {
                return andToolScriptTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE in",
                    Arrays.asList(values), "toolScriptType");

                return this;
            } // end else
        } // end andToolScriptTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolScriptTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE not in",
                    Arrays.asList(values), "toolScriptType");

                return this;
            } // end else
        } // end andToolScriptTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE between", value1,
                value2, "toolScriptType");

            return this;
        } // end andToolScriptTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolScriptTypeNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE not between",
                value1, value2, "toolScriptType");

            return this;
        } // end andToolScriptTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID is null");

            return this;
        } // end andLastEditorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID is not null");

            return this;
        } // end andLastEditorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.LAST_EDITOR_ID is not null AND MIDDLE_WARE_TOOL.LAST_EDITOR_ID <> ''");

            return this;
        } // end andLastEditorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.LAST_EDITOR_ID is null OR MIDDLE_WARE_TOOL.LAST_EDITOR_ID = '')");

            return this;
        } // end andLastEditorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdEqualTo(long value) {
            return andLastEditorIdEqualTo(Long.valueOf(value));
        } // end andLastEditorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID =", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDITOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualTo(long value) {
            return andLastEditorIdNotEqualTo(Long.valueOf(value));
        } // end andLastEditorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID <>", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualToOrIsNull(long value) {
            return andLastEditorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andLastEditorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID is null OR MIDDLE_WARE_TOOL.LAST_EDITOR_ID <>",
                value, "lastEditorId");

            return this;
        } // end andLastEditorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDITOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThan(long value) {
            return andLastEditorIdGreaterThan(Long.valueOf(value));
        } // end andLastEditorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID >", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDITOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanOrEqualTo(long value) {
            return andLastEditorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andLastEditorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID >=", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDITOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThan(long value) {
            return andLastEditorIdLessThan(Long.valueOf(value));
        } // end andLastEditorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID <", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDITOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanOrEqualTo(long value) {
            return andLastEditorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andLastEditorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID <=", value,
                "lastEditorId");

            return this;
        } // end andLastEditorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDITOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIn(long[] values) {
            if (values.length == 1) {
                return andLastEditorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID in", values,
                    "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andLastEditorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID not in", values,
                    "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIn(List values) {
            if (values.size() == 1) {
                return andLastEditorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID in", values,
                    "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotIn(List values) {
            if (values.size() == 1) {
                return andLastEditorIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID not in", values,
                    "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID in",
                    Arrays.asList(values), "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID not in",
                    Arrays.asList(values), "lastEditorId");

                return this;
            } // end else
        } // end andLastEditorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID between", value1,
                value2, "lastEditorId");

            return this;
        } // end andLastEditorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID between", value1,
                value2, "lastEditorId");

            return this;
        } // end andLastEditorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID not between", value1,
                value2, "lastEditorId");

            return this;
        } // end andLastEditorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDITOR_ID not between", value1,
                value2, "lastEditorId");

            return this;
        } // end andLastEditorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDIT_TIME is null");

            return this;
        } // end andLastEditTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.LAST_EDIT_TIME is not null");

            return this;
        } // end andLastEditTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.LAST_EDIT_TIME is not null AND MIDDLE_WARE_TOOL.LAST_EDIT_TIME <> ''");

            return this;
        } // end andLastEditTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.LAST_EDIT_TIME is null OR MIDDLE_WARE_TOOL.LAST_EDIT_TIME = '')");

            return this;
        } // end andLastEditTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME =", value,
                "lastEditTime");

            return this;
        } // end andLastEditTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDIT_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME <>",
                value, "lastEditTime");

            return this;
        } // end andLastEditTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME is null OR MIDDLE_WARE_TOOL.LAST_EDIT_TIME <>",
                value, "lastEditTime");

            return this;
        } // end andLastEditTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDIT_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME >", value,
                "lastEditTime");

            return this;
        } // end andLastEditTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDIT_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME >=",
                value, "lastEditTime");

            return this;
        } // end andLastEditTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDIT_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME <", value,
                "lastEditTime");

            return this;
        } // end andLastEditTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDIT_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME <=",
                value, "lastEditTime");

            return this;
        } // end andLastEditTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL.LAST_EDIT_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeIn(List values) {
            if (values.size() == 1) {
                return andLastEditTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME in",
                    values, "lastEditTime");

                return this;
            } // end else
        } // end andLastEditTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeNotIn(List values) {
            if (values.size() == 1) {
                return andLastEditTimeNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME not in",
                    values, "lastEditTime");

                return this;
            } // end else
        } // end andLastEditTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME in",
                    Arrays.asList(values), "lastEditTime");

                return this;
            } // end else
        } // end andLastEditTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME not in",
                    Arrays.asList(values), "lastEditTime");

                return this;
            } // end else
        } // end andLastEditTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME between",
                value1, value2, "lastEditTime");

            return this;
        } // end andLastEditTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL.LAST_EDIT_TIME not between",
                value1, value2, "lastEditTime");

            return this;
        } // end andLastEditTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNull() {
            addCriterion("employeeA.NAME is null");

            return this;
        } // end andLastEditorNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNotNull() {
            addCriterion("employeeA.NAME is not null");

            return this;
        } // end andLastEditorNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsNotEmpty() {
            addCriterion("employeeA.NAME is not null AND employeeA.NAME <> ''");

            return this;
        } // end andLastEditorNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIsEmpty() {
            addCriterion("(employeeA.NAME is null OR employeeA.NAME = '')");

            return this;
        } // end andLastEditorNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameEqualTo(String value) {
            addCriterion("employeeA.NAME =", value, "lastEditorName");

            return this;
        } // end andLastEditorNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotEqualTo(String value) {
            addCriterion("employeeA.NAME <>", value, "lastEditorName");

            return this;
        } // end andLastEditorNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotEqualToOrIsNull(String value) {
            addCriterion("employeeA.NAME is null OR employeeA.NAME <>", value,
                "lastEditorName");

            return this;
        } // end andLastEditorNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThan(String value) {
            addCriterion("employeeA.NAME >", value, "lastEditorName");

            return this;
        } // end andLastEditorNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeA.NAME >=", value, "lastEditorName");

            return this;
        } // end andLastEditorNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThan(String value) {
            addCriterion("employeeA.NAME <", value, "lastEditorName");

            return this;
        } // end andLastEditorNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThanOrEqualTo(String value) {
            addCriterion("employeeA.NAME <=", value, "lastEditorName");

            return this;
        } // end andLastEditorNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLastEditorNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.NAME like", buffer.toString(),
                "lastEditorName");

            return this;
        } // end andLastEditorNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.NAME not like", buffer.toString(),
                "lastEditorName");

            return this;
        } // end andLastEditorNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIn(List values) {
            if (values.size() == 1) {
                return andLastEditorNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.NAME in", values, "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotIn(List values) {
            if (values.size() == 1) {
                return andLastEditorNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.NAME not in", values, "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.NAME in", Arrays.asList(values),
                    "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andLastEditorNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.NAME not in", Arrays.asList(values),
                    "lastEditorName");

                return this;
            } // end else
        } // end andLastEditorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameBetween(String value1, String value2) {
            addCriterion("employeeA.NAME between", value1, value2,
                "lastEditorName");

            return this;
        } // end andLastEditorNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLastEditorNameNotBetween(String value1, String value2) {
            addCriterion("employeeA.NAME not between", value1, value2,
                "lastEditorName");

            return this;
        } // end andLastEditorNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME is null");

            return this;
        } // end andToolNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME is not null");

            return this;
        } // end andToolNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.TOOL_NAME is not null AND MIDDLE_WARE_TOOL.TOOL_NAME <> ''");

            return this;
        } // end andToolNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.TOOL_NAME is null OR MIDDLE_WARE_TOOL.TOOL_NAME = '')");

            return this;
        } // end andToolNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME =", value, "toolName");

            return this;
        } // end andToolNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME <>", value, "toolName");

            return this;
        } // end andToolNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME is null OR MIDDLE_WARE_TOOL.TOOL_NAME <>",
                value, "toolName");

            return this;
        } // end andToolNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME >", value, "toolName");

            return this;
        } // end andToolNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME >=", value, "toolName");

            return this;
        } // end andToolNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME <", value, "toolName");

            return this;
        } // end andToolNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME <=", value, "toolName");

            return this;
        } // end andToolNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME like", buffer.toString(),
                "toolName");

            return this;
        } // end andToolNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME not like",
                buffer.toString(), "toolName");

            return this;
        } // end andToolNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameIn(List values) {
            if (values.size() == 1) {
                return andToolNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME in", values, "toolName");

                return this;
            } // end else
        } // end andToolNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameNotIn(List values) {
            if (values.size() == 1) {
                return andToolNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME not in", values,
                    "toolName");

                return this;
            } // end else
        } // end andToolNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameIn(Object[] values) {
            if (values.length == 1) {
                return andToolNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME in",
                    Arrays.asList(values), "toolName");

                return this;
            } // end else
        } // end andToolNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME not in",
                    Arrays.asList(values), "toolName");

                return this;
            } // end else
        } // end andToolNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME between", value1, value2,
                "toolName");

            return this;
        } // end andToolNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolNameNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_NAME not between", value1,
                value2, "toolName");

            return this;
        } // end andToolNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID is null");

            return this;
        } // end andProviderIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID is not null");

            return this;
        } // end andProviderIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.PROVIDER_ID is not null AND MIDDLE_WARE_TOOL.PROVIDER_ID <> ''");

            return this;
        } // end andProviderIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.PROVIDER_ID is null OR MIDDLE_WARE_TOOL.PROVIDER_ID = '')");

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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID =", value, "providerId");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.PROVIDER_ID");
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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID <>", value, "providerId");

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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID is null OR MIDDLE_WARE_TOOL.PROVIDER_ID <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.PROVIDER_ID");
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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID >", value, "providerId");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.PROVIDER_ID");
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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID >=", value, "providerId");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.PROVIDER_ID");
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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID <", value, "providerId");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.PROVIDER_ID");
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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID <=", value, "providerId");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.PROVIDER_ID");
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
                addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID in", values,
                    "providerId");

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
                addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID in", values,
                    "providerId");

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
                addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID in",
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
                addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID not in",
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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID between", value1,
                value2, "providerId");

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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID between", value1,
                value2, "providerId");

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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID not between", value1,
                value2, "providerId");

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
            addCriterion("MIDDLE_WARE_TOOL.PROVIDER_ID not between", value1,
                value2, "providerId");

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

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsNull() {
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE is null");

            return this;
        } // end andMiddleWareTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsNotNull() {
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE is not null");

            return this;
        } // end andMiddleWareTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsNotEmpty() {
            addCriterion(
                "middleWareProviderA.MIDDLE_WARE_TYPE is not null AND middleWareProviderA.MIDDLE_WARE_TYPE <> ''");

            return this;
        } // end andMiddleWareTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareTypeIsEmpty() {
            addCriterion(
                "(middleWareProviderA.MIDDLE_WARE_TYPE is null OR middleWareProviderA.MIDDLE_WARE_TYPE = '')");

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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE =", value,
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
                    "middleWareProviderA.MIDDLE_WARE_TYPE");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE <>", value,
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE is null OR middleWareProviderA.MIDDLE_WARE_TYPE <>",
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
                    "middleWareProviderA.MIDDLE_WARE_TYPE");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE >", value,
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
                    "middleWareProviderA.MIDDLE_WARE_TYPE");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE >=", value,
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
                    "middleWareProviderA.MIDDLE_WARE_TYPE");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE <", value,
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
                    "middleWareProviderA.MIDDLE_WARE_TYPE");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE <=", value,
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
                    "middleWareProviderA.MIDDLE_WARE_TYPE");
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE like",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE not like",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE in", values,
                    "middleWareType");

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
                addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE not in",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE in",
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
                addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE not in",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE between",
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
            addCriterion("middleWareProviderA.MIDDLE_WARE_TYPE not between",
                value1, value2, "middleWareType");

            return this;
        } // end andMiddleWareTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramIsNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM is null");

            return this;
        } // end andToolProgramIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM is not null");

            return this;
        } // end andToolProgramIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL.TOOL_PROGRAM is not null AND MIDDLE_WARE_TOOL.TOOL_PROGRAM <> ''");

            return this;
        } // end andToolProgramIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL.TOOL_PROGRAM is null OR MIDDLE_WARE_TOOL.TOOL_PROGRAM = '')");

            return this;
        } // end andToolProgramIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM =", value, "toolProgram");

            return this;
        } // end andToolProgramEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_PROGRAM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolProgramEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM <>", value,
                "toolProgram");

            return this;
        } // end andToolProgramNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM is null OR MIDDLE_WARE_TOOL.TOOL_PROGRAM <>",
                value, "toolProgram");

            return this;
        } // end andToolProgramNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_PROGRAM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolProgramNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM >", value, "toolProgram");

            return this;
        } // end andToolProgramGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_PROGRAM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolProgramGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM >=", value,
                "toolProgram");

            return this;
        } // end andToolProgramGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_PROGRAM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolProgramGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM <", value, "toolProgram");

            return this;
        } // end andToolProgramLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_PROGRAM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolProgramLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM <=", value,
                "toolProgram");

            return this;
        } // end andToolProgramLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL.TOOL_PROGRAM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolProgramLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM like",
                buffer.toString(), "toolProgram");

            return this;
        } // end andToolProgramLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM not like",
                buffer.toString(), "toolProgram");

            return this;
        } // end andToolProgramNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramIn(List values) {
            if (values.size() == 1) {
                return andToolProgramEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM in", values,
                    "toolProgram");

                return this;
            } // end else
        } // end andToolProgramIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramNotIn(List values) {
            if (values.size() == 1) {
                return andToolProgramNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM not in", values,
                    "toolProgram");

                return this;
            } // end else
        } // end andToolProgramNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramIn(Object[] values) {
            if (values.length == 1) {
                return andToolProgramEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM in",
                    Arrays.asList(values), "toolProgram");

                return this;
            } // end else
        } // end andToolProgramIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolProgramNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM not in",
                    Arrays.asList(values), "toolProgram");

                return this;
            } // end else
        } // end andToolProgramNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM between", value1,
                value2, "toolProgram");

            return this;
        } // end andToolProgramBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolProgramNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL.TOOL_PROGRAM not between", value1,
                value2, "toolProgram");

            return this;
        } // end andToolProgramNotBetween()
    } // end Criteria
} // end MiddleWareToolDAOQueryBean
