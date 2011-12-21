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
 * MiddleWareToolLog query bean 2011-12-09 11:52:52
 *
 * @author Auto Gen
 */
public class MiddleWareToolLogDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new MiddleWareToolLogDAOQueryBean object.
     */
    public MiddleWareToolLogDAOQueryBean() {
        super();
    } // end MiddleWareToolLogDAOQueryBean()

    /**
     * Creates a new MiddleWareToolLogDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public MiddleWareToolLogDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end MiddleWareToolLogDAOQueryBean()

    /**
     * Creates a new MiddleWareToolLogDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public MiddleWareToolLogDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end MiddleWareToolLogDAOQueryBean()

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
            addSelectProperty(IMiddleWareToolLogDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addExecuteFinishTimeSelectProperty() {
        addExecuteFinishTimeSelectProperty("executeFinishTime");
    } // end addExecuteFinishTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addExecuteFinishTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteFinishTime, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteFinishTime,
                "executeFinishTime");
        } // end else
    } // end addExecuteFinishTimeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addExecuteLogSelectProperty() {
        addExecuteLogSelectProperty("executeLog");
    } // end addExecuteLogSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addExecuteLogSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteLog, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteLog, "executeLog");
        } // end else
    } // end addExecuteLogSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addExecuteResultSelectProperty() {
        addExecuteResultSelectProperty("executeResult");
    } // end addExecuteResultSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addExecuteResultSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteResult, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteResult,
                "executeResult");
        } // end else
    } // end addExecuteResultSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addExecuteStartTimeSelectProperty() {
        addExecuteStartTimeSelectProperty("executeStartTime");
    } // end addExecuteStartTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addExecuteStartTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteStartTime, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteStartTime,
                "executeStartTime");
        } // end else
    } // end addExecuteStartTimeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addExecutorIdSelectProperty() {
        addExecutorIdSelectProperty("executorId");
    } // end addExecutorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addExecutorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ExecutorId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ExecutorId, "executorId");
        } // end else
    } // end addExecutorIdSelectProperty()

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
            addSelectProperty(IMiddleWareToolLogDAO.MiddleWareId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.MiddleWareId, "middleWareId");
        } // end else
    } // end addMiddleWareIdSelectProperty()

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
            addSelectProperty(IMiddleWareToolLogDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.Remarks, "remarks");
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
            addSelectProperty(IMiddleWareToolLogDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addToolIdSelectProperty() {
        addToolIdSelectProperty("toolId");
    } // end addToolIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addToolIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ToolId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ToolId, "toolId");
        } // end else
    } // end addToolIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addExecutorNameSelectProperty() {
        addExecutorNameSelectProperty("executorName");
    } // end addExecutorNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addExecutorNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ExecutorName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ExecutorName, "executorName");
        } // end else
    } // end addExecutorNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addExecuteScriptSelectProperty() {
        addExecuteScriptSelectProperty("executeScript");
    } // end addExecuteScriptSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addExecuteScriptSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteScript, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolLogDAO.ExecuteScript,
                "executeScript");
        } // end else
    } // end addExecuteScriptSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addExecuteFinishTimeSelectProperty();

        addExecuteLogSelectProperty();

        addExecuteResultSelectProperty();

        addExecuteStartTimeSelectProperty();

        addExecutorIdSelectProperty();

        addMiddleWareIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addToolIdSelectProperty();

        addExecutorNameSelectProperty();

        addExecuteScriptSelectProperty();
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.ID is not null AND MIDDLE_WARE_TOOL_LOG.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.ID is null OR MIDDLE_WARE_TOOL_LOG.ID = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID <>", value, "id");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID is null OR MIDDLE_WARE_TOOL_LOG.ID <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.ID");
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_LOG.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_LOG.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_LOG.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_LOG.ID in",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.ID not in",
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID between", value1, value2, "id");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID not between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME is null");

            return this;
        } // end andExecuteFinishTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME is not null");

            return this;
        } // end andExecuteFinishTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME is not null AND MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME <> ''");

            return this;
        } // end andExecuteFinishTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME = '')");

            return this;
        } // end andExecuteFinishTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME =",
                value, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteFinishTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME <>",
                value, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeNotEqualToOrIsNull(
            java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME <>",
                value, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteFinishTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME >",
                value, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteFinishTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME >=",
                value, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteFinishTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME <",
                value, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteFinishTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeLessThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME <=",
                value, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteFinishTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeIn(List values) {
            if (values.size() == 1) {
                return andExecuteFinishTimeEqualTo((java.util.Date) values.get(
                        0));
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME in",
                    values, "executeFinishTime");

                return this;
            } // end else
        } // end andExecuteFinishTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeNotIn(List values) {
            if (values.size() == 1) {
                return andExecuteFinishTimeNotEqualTo((java.util.Date) values.get(
                        0));
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME not in",
                    values, "executeFinishTime");

                return this;
            } // end else
        } // end andExecuteFinishTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteFinishTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME in",
                    Arrays.asList(values), "executeFinishTime");

                return this;
            } // end else
        } // end andExecuteFinishTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteFinishTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME not in",
                    Arrays.asList(values), "executeFinishTime");

                return this;
            } // end else
        } // end andExecuteFinishTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME between",
                value1, value2, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteFinishTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME not between",
                value1, value2, "executeFinishTime");

            return this;
        } // end andExecuteFinishTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG is null");

            return this;
        } // end andExecuteLogIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG is not null");

            return this;
        } // end andExecuteLogIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG is not null AND MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG <> ''");

            return this;
        } // end andExecuteLogIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG = '')");

            return this;
        } // end andExecuteLogIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG =", value,
                "executeLog");

            return this;
        } // end andExecuteLogEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteLogEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG <>", value,
                "executeLog");

            return this;
        } // end andExecuteLogNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG <>",
                value, "executeLog");

            return this;
        } // end andExecuteLogNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteLogNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG >", value,
                "executeLog");

            return this;
        } // end andExecuteLogGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteLogGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG >=", value,
                "executeLog");

            return this;
        } // end andExecuteLogGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteLogGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG <", value,
                "executeLog");

            return this;
        } // end andExecuteLogLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteLogLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG <=", value,
                "executeLog");

            return this;
        } // end andExecuteLogLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteLogLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG like",
                buffer.toString(), "executeLog");

            return this;
        } // end andExecuteLogLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG not like",
                buffer.toString(), "executeLog");

            return this;
        } // end andExecuteLogNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogIn(List values) {
            if (values.size() == 1) {
                return andExecuteLogEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG in", values,
                    "executeLog");

                return this;
            } // end else
        } // end andExecuteLogIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogNotIn(List values) {
            if (values.size() == 1) {
                return andExecuteLogNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG not in", values,
                    "executeLog");

                return this;
            } // end else
        } // end andExecuteLogNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteLogEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG in",
                    Arrays.asList(values), "executeLog");

                return this;
            } // end else
        } // end andExecuteLogIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogNotIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteLogNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG not in",
                    Arrays.asList(values), "executeLog");

                return this;
            } // end else
        } // end andExecuteLogNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG between", value1,
                value2, "executeLog");

            return this;
        } // end andExecuteLogBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteLogNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG not between",
                value1, value2, "executeLog");

            return this;
        } // end andExecuteLogNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT is null");

            return this;
        } // end andExecuteResultIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT is not null");

            return this;
        } // end andExecuteResultIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT is not null AND MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT <> ''");

            return this;
        } // end andExecuteResultIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT = '')");

            return this;
        } // end andExecuteResultIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT =", value,
                "executeResult");

            return this;
        } // end andExecuteResultEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteResultEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT <>", value,
                "executeResult");

            return this;
        } // end andExecuteResultNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT <>",
                value, "executeResult");

            return this;
        } // end andExecuteResultNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteResultNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT >", value,
                "executeResult");

            return this;
        } // end andExecuteResultGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteResultGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT >=", value,
                "executeResult");

            return this;
        } // end andExecuteResultGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteResultGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT <", value,
                "executeResult");

            return this;
        } // end andExecuteResultLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteResultLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT <=", value,
                "executeResult");

            return this;
        } // end andExecuteResultLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteResultLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT like",
                buffer.toString(), "executeResult");

            return this;
        } // end andExecuteResultLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT not like",
                buffer.toString(), "executeResult");

            return this;
        } // end andExecuteResultNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultIn(List values) {
            if (values.size() == 1) {
                return andExecuteResultEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT in", values,
                    "executeResult");

                return this;
            } // end else
        } // end andExecuteResultIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultNotIn(List values) {
            if (values.size() == 1) {
                return andExecuteResultNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT not in",
                    values, "executeResult");

                return this;
            } // end else
        } // end andExecuteResultNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteResultEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT in",
                    Arrays.asList(values), "executeResult");

                return this;
            } // end else
        } // end andExecuteResultIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultNotIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteResultNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT not in",
                    Arrays.asList(values), "executeResult");

                return this;
            } // end else
        } // end andExecuteResultNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT between", value1,
                value2, "executeResult");

            return this;
        } // end andExecuteResultBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteResultNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT not between",
                value1, value2, "executeResult");

            return this;
        } // end andExecuteResultNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME is null");

            return this;
        } // end andExecuteStartTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME is not null");

            return this;
        } // end andExecuteStartTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME is not null AND MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME <> ''");

            return this;
        } // end andExecuteStartTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME = '')");

            return this;
        } // end andExecuteStartTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME =",
                value, "executeStartTime");

            return this;
        } // end andExecuteStartTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteStartTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME <>",
                value, "executeStartTime");

            return this;
        } // end andExecuteStartTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeNotEqualToOrIsNull(
            java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME <>",
                value, "executeStartTime");

            return this;
        } // end andExecuteStartTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteStartTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME >",
                value, "executeStartTime");

            return this;
        } // end andExecuteStartTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteStartTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME >=",
                value, "executeStartTime");

            return this;
        } // end andExecuteStartTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteStartTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME <",
                value, "executeStartTime");

            return this;
        } // end andExecuteStartTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteStartTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeLessThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME <=",
                value, "executeStartTime");

            return this;
        } // end andExecuteStartTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteStartTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeIn(List values) {
            if (values.size() == 1) {
                return andExecuteStartTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME in",
                    values, "executeStartTime");

                return this;
            } // end else
        } // end andExecuteStartTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeNotIn(List values) {
            if (values.size() == 1) {
                return andExecuteStartTimeNotEqualTo((java.util.Date) values.get(
                        0));
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME not in",
                    values, "executeStartTime");

                return this;
            } // end else
        } // end andExecuteStartTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteStartTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME in",
                    Arrays.asList(values), "executeStartTime");

                return this;
            } // end else
        } // end andExecuteStartTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteStartTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME not in",
                    Arrays.asList(values), "executeStartTime");

                return this;
            } // end else
        } // end andExecuteStartTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME between",
                value1, value2, "executeStartTime");

            return this;
        } // end andExecuteStartTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteStartTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME not between",
                value1, value2, "executeStartTime");

            return this;
        } // end andExecuteStartTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID is null");

            return this;
        } // end andExecutorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID is not null");

            return this;
        } // end andExecutorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID is not null AND MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID <> ''");

            return this;
        } // end andExecutorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID is null OR MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID = '')");

            return this;
        } // end andExecutorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdEqualTo(long value) {
            return andExecutorIdEqualTo(Long.valueOf(value));
        } // end andExecutorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID =", value,
                "executorId");

            return this;
        } // end andExecutorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotEqualTo(long value) {
            return andExecutorIdNotEqualTo(Long.valueOf(value));
        } // end andExecutorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID <>", value,
                "executorId");

            return this;
        } // end andExecutorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotEqualToOrIsNull(long value) {
            return andExecutorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andExecutorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID is null OR MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID <>",
                value, "executorId");

            return this;
        } // end andExecutorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdGreaterThan(long value) {
            return andExecutorIdGreaterThan(Long.valueOf(value));
        } // end andExecutorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID >", value,
                "executorId");

            return this;
        } // end andExecutorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdGreaterThanOrEqualTo(long value) {
            return andExecutorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andExecutorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID >=", value,
                "executorId");

            return this;
        } // end andExecutorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdLessThan(long value) {
            return andExecutorIdLessThan(Long.valueOf(value));
        } // end andExecutorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID <", value,
                "executorId");

            return this;
        } // end andExecutorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdLessThanOrEqualTo(long value) {
            return andExecutorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andExecutorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID <=", value,
                "executorId");

            return this;
        } // end andExecutorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdIn(long[] values) {
            if (values.length == 1) {
                return andExecutorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID in", values,
                    "executorId");

                return this;
            } // end else
        } // end andExecutorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andExecutorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID not in", values,
                    "executorId");

                return this;
            } // end else
        } // end andExecutorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdIn(List values) {
            if (values.size() == 1) {
                return andExecutorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID in", values,
                    "executorId");

                return this;
            } // end else
        } // end andExecutorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotIn(List values) {
            if (values.size() == 1) {
                return andExecutorIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID not in", values,
                    "executorId");

                return this;
            } // end else
        } // end andExecutorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdIn(Object[] values) {
            if (values.length == 1) {
                return andExecutorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID in",
                    Arrays.asList(values), "executorId");

                return this;
            } // end else
        } // end andExecutorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andExecutorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID not in",
                    Arrays.asList(values), "executorId");

                return this;
            } // end else
        } // end andExecutorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID between", value1,
                value2, "executorId");

            return this;
        } // end andExecutorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID between", value1,
                value2, "executorId");

            return this;
        } // end andExecutorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID not between",
                value1, value2, "executorId");

            return this;
        } // end andExecutorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID not between",
                value1, value2, "executorId");

            return this;
        } // end andExecutorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID is null");

            return this;
        } // end andMiddleWareIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID is not null");

            return this;
        } // end andMiddleWareIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID is not null AND MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID <> ''");

            return this;
        } // end andMiddleWareIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMiddleWareIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID is null OR MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID =", value,
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
                    "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID <>", value,
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID is null OR MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID <>",
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
                    "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID >", value,
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
                    "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID >=", value,
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
                    "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID <", value,
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
                    "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID <=", value,
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
                    "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID");
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID not in",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID not in",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID in",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID not in",
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID between", value1,
                value2, "middleWareId");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID between", value1,
                value2, "middleWareId");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID not between",
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID not between",
                value1, value2, "middleWareId");

            return this;
        } // end andMiddleWareIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.REMARKS is not null AND MIDDLE_WARE_TOOL_LOG.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.REMARKS is null OR MIDDLE_WARE_TOOL_LOG.REMARKS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS <>", value, "remarks");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS is null OR MIDDLE_WARE_TOOL_LOG.REMARKS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS like",
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS in",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.STATUS is not null AND MIDDLE_WARE_TOOL_LOG.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.STATUS is null OR MIDDLE_WARE_TOOL_LOG.STATUS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS <>", value, "status");

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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS is null OR MIDDLE_WARE_TOOL_LOG.STATUS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS like", buffer.toString(),
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS in", values, "status");

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
                addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS in",
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
                addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL_LOG.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID is null");

            return this;
        } // end andToolIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID is not null");

            return this;
        } // end andToolIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.TOOL_ID is not null AND MIDDLE_WARE_TOOL_LOG.TOOL_ID <> ''");

            return this;
        } // end andToolIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.TOOL_ID is null OR MIDDLE_WARE_TOOL_LOG.TOOL_ID = '')");

            return this;
        } // end andToolIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdEqualTo(long value) {
            return andToolIdEqualTo(Long.valueOf(value));
        } // end andToolIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID =", value, "toolId");

            return this;
        } // end andToolIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.TOOL_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualTo(long value) {
            return andToolIdNotEqualTo(Long.valueOf(value));
        } // end andToolIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID <>", value, "toolId");

            return this;
        } // end andToolIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualToOrIsNull(long value) {
            return andToolIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andToolIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID is null OR MIDDLE_WARE_TOOL_LOG.TOOL_ID <>",
                value, "toolId");

            return this;
        } // end andToolIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.TOOL_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThan(long value) {
            return andToolIdGreaterThan(Long.valueOf(value));
        } // end andToolIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID >", value, "toolId");

            return this;
        } // end andToolIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.TOOL_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanOrEqualTo(long value) {
            return andToolIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andToolIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID >=", value, "toolId");

            return this;
        } // end andToolIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.TOOL_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThan(long value) {
            return andToolIdLessThan(Long.valueOf(value));
        } // end andToolIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID <", value, "toolId");

            return this;
        } // end andToolIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.TOOL_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanOrEqualTo(long value) {
            return andToolIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andToolIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID <=", value, "toolId");

            return this;
        } // end andToolIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_LOG.TOOL_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andToolIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIn(long[] values) {
            if (values.length == 1) {
                return andToolIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID in", values, "toolId");

                return this;
            } // end else
        } // end andToolIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotIn(long[] values) {
            if (values.length == 1) {
                return andToolIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID not in", values,
                    "toolId");

                return this;
            } // end else
        } // end andToolIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIn(List values) {
            if (values.size() == 1) {
                return andToolIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID in", values, "toolId");

                return this;
            } // end else
        } // end andToolIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotIn(List values) {
            if (values.size() == 1) {
                return andToolIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID not in", values,
                    "toolId");

                return this;
            } // end else
        } // end andToolIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdIn(Object[] values) {
            if (values.length == 1) {
                return andToolIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID in",
                    Arrays.asList(values), "toolId");

                return this;
            } // end else
        } // end andToolIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andToolIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID not in",
                    Arrays.asList(values), "toolId");

                return this;
            } // end else
        } // end andToolIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID not between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andToolIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.TOOL_ID not between", value1,
                value2, "toolId");

            return this;
        } // end andToolIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameIsNull() {
            addCriterion("employeeC.NAME is null");

            return this;
        } // end andExecutorNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameIsNotNull() {
            addCriterion("employeeC.NAME is not null");

            return this;
        } // end andExecutorNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameIsNotEmpty() {
            addCriterion("employeeC.NAME is not null AND employeeC.NAME <> ''");

            return this;
        } // end andExecutorNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameIsEmpty() {
            addCriterion("(employeeC.NAME is null OR employeeC.NAME = '')");

            return this;
        } // end andExecutorNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameEqualTo(String value) {
            addCriterion("employeeC.NAME =", value, "executorName");

            return this;
        } // end andExecutorNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameNotEqualTo(String value) {
            addCriterion("employeeC.NAME <>", value, "executorName");

            return this;
        } // end andExecutorNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameNotEqualToOrIsNull(String value) {
            addCriterion("employeeC.NAME is null OR employeeC.NAME <>", value,
                "executorName");

            return this;
        } // end andExecutorNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameGreaterThan(String value) {
            addCriterion("employeeC.NAME >", value, "executorName");

            return this;
        } // end andExecutorNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeC.NAME >=", value, "executorName");

            return this;
        } // end andExecutorNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameLessThan(String value) {
            addCriterion("employeeC.NAME <", value, "executorName");

            return this;
        } // end andExecutorNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameLessThanOrEqualTo(String value) {
            addCriterion("employeeC.NAME <=", value, "executorName");

            return this;
        } // end andExecutorNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeC.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecutorNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeC.NAME like", buffer.toString(),
                "executorName");

            return this;
        } // end andExecutorNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeC.NAME not like", buffer.toString(),
                "executorName");

            return this;
        } // end andExecutorNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameIn(List values) {
            if (values.size() == 1) {
                return andExecutorNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeC.NAME in", values, "executorName");

                return this;
            } // end else
        } // end andExecutorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameNotIn(List values) {
            if (values.size() == 1) {
                return andExecutorNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeC.NAME not in", values, "executorName");

                return this;
            } // end else
        } // end andExecutorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameIn(Object[] values) {
            if (values.length == 1) {
                return andExecutorNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeC.NAME in", Arrays.asList(values),
                    "executorName");

                return this;
            } // end else
        } // end andExecutorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andExecutorNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeC.NAME not in", Arrays.asList(values),
                    "executorName");

                return this;
            } // end else
        } // end andExecutorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameBetween(String value1, String value2) {
            addCriterion("employeeC.NAME between", value1, value2,
                "executorName");

            return this;
        } // end andExecutorNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecutorNameNotBetween(String value1, String value2) {
            addCriterion("employeeC.NAME not between", value1, value2,
                "executorName");

            return this;
        } // end andExecutorNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT is null");

            return this;
        } // end andExecuteScriptIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT is not null");

            return this;
        } // end andExecuteScriptIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT is not null AND MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT <> ''");

            return this;
        } // end andExecuteScriptIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT = '')");

            return this;
        } // end andExecuteScriptIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT =", value,
                "executeScript");

            return this;
        } // end andExecuteScriptEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteScriptEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT <>", value,
                "executeScript");

            return this;
        } // end andExecuteScriptNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT is null OR MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT <>",
                value, "executeScript");

            return this;
        } // end andExecuteScriptNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteScriptNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT >", value,
                "executeScript");

            return this;
        } // end andExecuteScriptGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteScriptGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT >=", value,
                "executeScript");

            return this;
        } // end andExecuteScriptGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteScriptGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT <", value,
                "executeScript");

            return this;
        } // end andExecuteScriptLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteScriptLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT <=", value,
                "executeScript");

            return this;
        } // end andExecuteScriptLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andExecuteScriptLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT like",
                buffer.toString(), "executeScript");

            return this;
        } // end andExecuteScriptLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT not like",
                buffer.toString(), "executeScript");

            return this;
        } // end andExecuteScriptNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptIn(List values) {
            if (values.size() == 1) {
                return andExecuteScriptEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT in", values,
                    "executeScript");

                return this;
            } // end else
        } // end andExecuteScriptIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptNotIn(List values) {
            if (values.size() == 1) {
                return andExecuteScriptNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT not in",
                    values, "executeScript");

                return this;
            } // end else
        } // end andExecuteScriptNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteScriptEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT in",
                    Arrays.asList(values), "executeScript");

                return this;
            } // end else
        } // end andExecuteScriptIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptNotIn(Object[] values) {
            if (values.length == 1) {
                return andExecuteScriptNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT not in",
                    Arrays.asList(values), "executeScript");

                return this;
            } // end else
        } // end andExecuteScriptNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT between", value1,
                value2, "executeScript");

            return this;
        } // end andExecuteScriptBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andExecuteScriptNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT not between",
                value1, value2, "executeScript");

            return this;
        } // end andExecuteScriptNotBetween()
    } // end Criteria
} // end MiddleWareToolLogDAOQueryBean
