/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * BpmAttachment query bean 2011-12-02 14:46:13
 *
 * @author Auto Gen
 */
public class BpmAttachmentDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmAttachmentDAOQueryBean object.
     */
    public BpmAttachmentDAOQueryBean() {
        super();
    } // end BpmAttachmentDAOQueryBean()

    /**
     * Creates a new BpmAttachmentDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmAttachmentDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmAttachmentDAOQueryBean()

    /**
     * Creates a new BpmAttachmentDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmAttachmentDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmAttachmentDAOQueryBean()

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
            addSelectProperty(IBpmAttachmentDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCreateDateSelectProperty() {
        addCreateDateSelectProperty("createDate");
    } // end addCreateDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCreateDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.CreateDate, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.CreateDate, "createDate");
        } // end else
    } // end addCreateDateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCreatorIdSelectProperty() {
        addCreatorIdSelectProperty("creatorId");
    } // end addCreatorIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCreatorIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.CreatorId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.CreatorId, "creatorId");
        } // end else
    } // end addCreatorIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileNameSelectProperty() {
        addFileNameSelectProperty("fileName");
    } // end addFileNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.FileName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.FileName, "fileName");
        } // end else
    } // end addFileNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileSizeSelectProperty() {
        addFileSizeSelectProperty("fileSize");
    } // end addFileSizeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileSizeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.FileSize, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.FileSize, "fileSize");
        } // end else
    } // end addFileSizeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileTypeSelectProperty() {
        addFileTypeSelectProperty("fileType");
    } // end addFileTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.FileType, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.FileType, "fileType");
        } // end else
    } // end addFileTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessInstanceIdSelectProperty() {
        addProcessInstanceIdSelectProperty("processInstanceId");
    } // end addProcessInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.ProcessInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.ProcessInstanceId,
                "processInstanceId");
        } // end else
    } // end addProcessInstanceIdSelectProperty()

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
            addSelectProperty(IBpmAttachmentDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.Remarks, "remarks");
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
            addSelectProperty(IBpmAttachmentDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTaskIdSelectProperty() {
        addTaskIdSelectProperty("taskId");
    } // end addTaskIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTaskIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.TaskId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.TaskId, "taskId");
        } // end else
    } // end addTaskIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAttachementUrlSelectProperty() {
        addAttachementUrlSelectProperty("attachementUrl");
    } // end addAttachementUrlSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAttachementUrlSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.AttachementUrl, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.AttachementUrl, "attachementUrl");
        } // end else
    } // end addAttachementUrlSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAttachementTypeSelectProperty() {
        addAttachementTypeSelectProperty("attachementType");
    } // end addAttachementTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAttachementTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.AttachementType, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.AttachementType,
                "attachementType");
        } // end else
    } // end addAttachementTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAttachmentKeySelectProperty() {
        addAttachmentKeySelectProperty("attachmentKey");
    } // end addAttachmentKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAttachmentKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.AttachmentKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.AttachmentKey, "attachmentKey");
        } // end else
    } // end addAttachmentKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileDisplaySizeSelectProperty() {
        addFileDisplaySizeSelectProperty("fileDisplaySize");
    } // end addFileDisplaySizeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileDisplaySizeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.FileDisplaySize, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.FileDisplaySize,
                "fileDisplaySize");
        } // end else
    } // end addFileDisplaySizeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCreratorNameSelectProperty() {
        addCreratorNameSelectProperty("creratorName");
    } // end addCreratorNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCreratorNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmAttachmentDAO.CreratorName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmAttachmentDAO.CreratorName, "creratorName");
        } // end else
    } // end addCreratorNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCreateDateSelectProperty();

        addCreatorIdSelectProperty();

        addFileNameSelectProperty();

        addFileSizeSelectProperty();

        addFileTypeSelectProperty();

        addProcessInstanceIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addTaskIdSelectProperty();

        addAttachementUrlSelectProperty();

        addAttachementTypeSelectProperty();

        addAttachmentKeySelectProperty();

        addFileDisplaySizeSelectProperty();

        addCreratorNameSelectProperty();
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
            addCriterion("BPM_ATTACHMENT.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_ATTACHMENT.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.ID is not null AND BPM_ATTACHMENT.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.ID is null OR BPM_ATTACHMENT.ID = '')");

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
            addCriterion("BPM_ATTACHMENT.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ID");
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
            addCriterion("BPM_ATTACHMENT.ID <>", value, "id");

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
            addCriterion("BPM_ATTACHMENT.ID is null OR BPM_ATTACHMENT.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ID");
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
            addCriterion("BPM_ATTACHMENT.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ID");
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
            addCriterion("BPM_ATTACHMENT.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ID");
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
            addCriterion("BPM_ATTACHMENT.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ID");
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
            addCriterion("BPM_ATTACHMENT.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ID");
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
                addCriterion("BPM_ATTACHMENT.ID in", values, "id");

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
                addCriterion("BPM_ATTACHMENT.ID not in", values, "id");

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
                addCriterion("BPM_ATTACHMENT.ID in", values, "id");

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
                addCriterion("BPM_ATTACHMENT.ID not in", values, "id");

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
                addCriterion("BPM_ATTACHMENT.ID in", Arrays.asList(values), "id");

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
                addCriterion("BPM_ATTACHMENT.ID not in", Arrays.asList(values),
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
            addCriterion("BPM_ATTACHMENT.ID between", value1, value2, "id");

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
            addCriterion("BPM_ATTACHMENT.ID between", value1, value2, "id");

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
            addCriterion("BPM_ATTACHMENT.ID not between", value1, value2, "id");

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
            addCriterion("BPM_ATTACHMENT.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNull() {
            addCriterion("BPM_ATTACHMENT.CREATE_DATE is null");

            return this;
        } // end andCreateDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNotNull() {
            addCriterion("BPM_ATTACHMENT.CREATE_DATE is not null");

            return this;
        } // end andCreateDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.CREATE_DATE is not null AND BPM_ATTACHMENT.CREATE_DATE <> ''");

            return this;
        } // end andCreateDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.CREATE_DATE is null OR BPM_ATTACHMENT.CREATE_DATE = '')");

            return this;
        } // end andCreateDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE =", value,
                "createDate");

            return this;
        } // end andCreateDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATE_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE <>", value,
                "createDate");

            return this;
        } // end andCreateDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE is null OR BPM_ATTACHMENT.CREATE_DATE <>",
                value, "createDate");

            return this;
        } // end andCreateDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATE_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE >", value,
                "createDate");

            return this;
        } // end andCreateDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATE_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE >=", value,
                "createDate");

            return this;
        } // end andCreateDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATE_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE <", value,
                "createDate");

            return this;
        } // end andCreateDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATE_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE <=", value,
                "createDate");

            return this;
        } // end andCreateDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATE_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreateDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIn(List values) {
            if (values.size() == 1) {
                return andCreateDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE in",
                    values, "createDate");

                return this;
            } // end else
        } // end andCreateDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotIn(List values) {
            if (values.size() == 1) {
                return andCreateDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE not in",
                    values, "createDate");

                return this;
            } // end else
        } // end andCreateDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateIn(Object[] values) {
            if (values.length == 1) {
                return andCreateDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE in",
                    Arrays.asList(values), "createDate");

                return this;
            } // end else
        } // end andCreateDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andCreateDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE not in",
                    Arrays.asList(values), "createDate");

                return this;
            } // end else
        } // end andCreateDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE between",
                value1, value2, "createDate");

            return this;
        } // end andCreateDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreateDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("BPM_ATTACHMENT.CREATE_DATE not between",
                value1, value2, "createDate");

            return this;
        } // end andCreateDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsNull() {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID is null");

            return this;
        } // end andCreatorIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsNotNull() {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID is not null");

            return this;
        } // end andCreatorIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.CREATOR_ID is not null AND BPM_ATTACHMENT.CREATOR_ID <> ''");

            return this;
        } // end andCreatorIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.CREATOR_ID is null OR BPM_ATTACHMENT.CREATOR_ID = '')");

            return this;
        } // end andCreatorIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdEqualTo(long value) {
            return andCreatorIdEqualTo(Long.valueOf(value));
        } // end andCreatorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID =", value, "creatorId");

            return this;
        } // end andCreatorIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATOR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualTo(long value) {
            return andCreatorIdNotEqualTo(Long.valueOf(value));
        } // end andCreatorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID <>", value, "creatorId");

            return this;
        } // end andCreatorIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualToOrIsNull(long value) {
            return andCreatorIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andCreatorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID is null OR BPM_ATTACHMENT.CREATOR_ID <>",
                value, "creatorId");

            return this;
        } // end andCreatorIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATOR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThan(long value) {
            return andCreatorIdGreaterThan(Long.valueOf(value));
        } // end andCreatorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID >", value, "creatorId");

            return this;
        } // end andCreatorIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATOR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanOrEqualTo(long value) {
            return andCreatorIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andCreatorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID >=", value, "creatorId");

            return this;
        } // end andCreatorIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATOR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThan(long value) {
            return andCreatorIdLessThan(Long.valueOf(value));
        } // end andCreatorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID <", value, "creatorId");

            return this;
        } // end andCreatorIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATOR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanOrEqualTo(long value) {
            return andCreatorIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andCreatorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID <=", value, "creatorId");

            return this;
        } // end andCreatorIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.CREATOR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreatorIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIn(long[] values) {
            if (values.length == 1) {
                return andCreatorIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.CREATOR_ID in", values, "creatorId");

                return this;
            } // end else
        } // end andCreatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotIn(long[] values) {
            if (values.length == 1) {
                return andCreatorIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.CREATOR_ID not in", values,
                    "creatorId");

                return this;
            } // end else
        } // end andCreatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIn(List values) {
            if (values.size() == 1) {
                return andCreatorIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.CREATOR_ID in", values, "creatorId");

                return this;
            } // end else
        } // end andCreatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotIn(List values) {
            if (values.size() == 1) {
                return andCreatorIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.CREATOR_ID not in", values,
                    "creatorId");

                return this;
            } // end else
        } // end andCreatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdIn(Object[] values) {
            if (values.length == 1) {
                return andCreatorIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.CREATOR_ID in",
                    Arrays.asList(values), "creatorId");

                return this;
            } // end else
        } // end andCreatorIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andCreatorIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.CREATOR_ID not in",
                    Arrays.asList(values), "creatorId");

                return this;
            } // end else
        } // end andCreatorIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID between", value1, value2,
                "creatorId");

            return this;
        } // end andCreatorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID between", value1, value2,
                "creatorId");

            return this;
        } // end andCreatorIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID not between", value1,
                value2, "creatorId");

            return this;
        } // end andCreatorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreatorIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.CREATOR_ID not between", value1,
                value2, "creatorId");

            return this;
        } // end andCreatorIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsNull() {
            addCriterion("BPM_ATTACHMENT.FILE_NAME is null");

            return this;
        } // end andFileNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsNotNull() {
            addCriterion("BPM_ATTACHMENT.FILE_NAME is not null");

            return this;
        } // end andFileNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.FILE_NAME is not null AND BPM_ATTACHMENT.FILE_NAME <> ''");

            return this;
        } // end andFileNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.FILE_NAME is null OR BPM_ATTACHMENT.FILE_NAME = '')");

            return this;
        } // end andFileNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME =", value, "fileName");

            return this;
        } // end andFileNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME <>", value, "fileName");

            return this;
        } // end andFileNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotEqualToOrIsNull(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME is null OR BPM_ATTACHMENT.FILE_NAME <>",
                value, "fileName");

            return this;
        } // end andFileNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME >", value, "fileName");

            return this;
        } // end andFileNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME >=", value, "fileName");

            return this;
        } // end andFileNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThan(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME <", value, "fileName");

            return this;
        } // end andFileNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME <=", value, "fileName");

            return this;
        } // end andFileNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.FILE_NAME like", buffer.toString(),
                "fileName");

            return this;
        } // end andFileNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.FILE_NAME not like",
                buffer.toString(), "fileName");

            return this;
        } // end andFileNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIn(List values) {
            if (values.size() == 1) {
                return andFileNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_NAME in", values, "fileName");

                return this;
            } // end else
        } // end andFileNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotIn(List values) {
            if (values.size() == 1) {
                return andFileNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_NAME not in", values,
                    "fileName");

                return this;
            } // end else
        } // end andFileNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIn(Object[] values) {
            if (values.length == 1) {
                return andFileNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_NAME in",
                    Arrays.asList(values), "fileName");

                return this;
            } // end else
        } // end andFileNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_NAME not in",
                    Arrays.asList(values), "fileName");

                return this;
            } // end else
        } // end andFileNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME between", value1, value2,
                "fileName");

            return this;
        } // end andFileNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.FILE_NAME not between", value1,
                value2, "fileName");

            return this;
        } // end andFileNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeIsNull() {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE is null");

            return this;
        } // end andFileSizeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeIsNotNull() {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE is not null");

            return this;
        } // end andFileSizeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.FILE_SIZE is not null AND BPM_ATTACHMENT.FILE_SIZE <> ''");

            return this;
        } // end andFileSizeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.FILE_SIZE is null OR BPM_ATTACHMENT.FILE_SIZE = '')");

            return this;
        } // end andFileSizeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeEqualTo(long value) {
            return andFileSizeEqualTo(Long.valueOf(value));
        } // end andFileSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE =", value, "fileSize");

            return this;
        } // end andFileSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_SIZE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileSizeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotEqualTo(long value) {
            return andFileSizeNotEqualTo(Long.valueOf(value));
        } // end andFileSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE <>", value, "fileSize");

            return this;
        } // end andFileSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotEqualToOrIsNull(long value) {
            return andFileSizeNotEqualToOrIsNull(Long.valueOf(value));
        } // end andFileSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE is null OR BPM_ATTACHMENT.FILE_SIZE <>",
                value, "fileSize");

            return this;
        } // end andFileSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_SIZE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileSizeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeGreaterThan(long value) {
            return andFileSizeGreaterThan(Long.valueOf(value));
        } // end andFileSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeGreaterThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE >", value, "fileSize");

            return this;
        } // end andFileSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_SIZE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileSizeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeGreaterThanOrEqualTo(long value) {
            return andFileSizeGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andFileSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE >=", value, "fileSize");

            return this;
        } // end andFileSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_SIZE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileSizeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeLessThan(long value) {
            return andFileSizeLessThan(Long.valueOf(value));
        } // end andFileSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeLessThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE <", value, "fileSize");

            return this;
        } // end andFileSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_SIZE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileSizeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeLessThanOrEqualTo(long value) {
            return andFileSizeLessThanOrEqualTo(Long.valueOf(value));
        } // end andFileSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE <=", value, "fileSize");

            return this;
        } // end andFileSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_SIZE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileSizeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeIn(long[] values) {
            if (values.length == 1) {
                return andFileSizeEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_SIZE in", values, "fileSize");

                return this;
            } // end else
        } // end andFileSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotIn(long[] values) {
            if (values.length == 1) {
                return andFileSizeNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_SIZE not in", values,
                    "fileSize");

                return this;
            } // end else
        } // end andFileSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeIn(List values) {
            if (values.size() == 1) {
                return andFileSizeEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_SIZE in", values, "fileSize");

                return this;
            } // end else
        } // end andFileSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotIn(List values) {
            if (values.size() == 1) {
                return andFileSizeNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_SIZE not in", values,
                    "fileSize");

                return this;
            } // end else
        } // end andFileSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeIn(Object[] values) {
            if (values.length == 1) {
                return andFileSizeEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_SIZE in",
                    Arrays.asList(values), "fileSize");

                return this;
            } // end else
        } // end andFileSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileSizeNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_SIZE not in",
                    Arrays.asList(values), "fileSize");

                return this;
            } // end else
        } // end andFileSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE between", value1, value2,
                "fileSize");

            return this;
        } // end andFileSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE between", value1, value2,
                "fileSize");

            return this;
        } // end andFileSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE not between", value1,
                value2, "fileSize");

            return this;
        } // end andFileSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileSizeNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.FILE_SIZE not between", value1,
                value2, "fileSize");

            return this;
        } // end andFileSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsNull() {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE is null");

            return this;
        } // end andFileTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsNotNull() {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE is not null");

            return this;
        } // end andFileTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.FILE_TYPE is not null AND BPM_ATTACHMENT.FILE_TYPE <> ''");

            return this;
        } // end andFileTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.FILE_TYPE is null OR BPM_ATTACHMENT.FILE_TYPE = '')");

            return this;
        } // end andFileTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE =", value, "fileType");

            return this;
        } // end andFileTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE <>", value, "fileType");

            return this;
        } // end andFileTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotEqualToOrIsNull(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE is null OR BPM_ATTACHMENT.FILE_TYPE <>",
                value, "fileType");

            return this;
        } // end andFileTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE >", value, "fileType");

            return this;
        } // end andFileTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE >=", value, "fileType");

            return this;
        } // end andFileTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThan(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE <", value, "fileType");

            return this;
        } // end andFileTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE <=", value, "fileType");

            return this;
        } // end andFileTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.FILE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.FILE_TYPE like", buffer.toString(),
                "fileType");

            return this;
        } // end andFileTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.FILE_TYPE not like",
                buffer.toString(), "fileType");

            return this;
        } // end andFileTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIn(List values) {
            if (values.size() == 1) {
                return andFileTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_TYPE in", values, "fileType");

                return this;
            } // end else
        } // end andFileTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotIn(List values) {
            if (values.size() == 1) {
                return andFileTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_TYPE not in", values,
                    "fileType");

                return this;
            } // end else
        } // end andFileTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIn(Object[] values) {
            if (values.length == 1) {
                return andFileTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_TYPE in",
                    Arrays.asList(values), "fileType");

                return this;
            } // end else
        } // end andFileTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_TYPE not in",
                    Arrays.asList(values), "fileType");

                return this;
            } // end else
        } // end andFileTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE between", value1, value2,
                "fileType");

            return this;
        } // end andFileTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.FILE_TYPE not between", value1,
                value2, "fileType");

            return this;
        } // end andFileTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID is null");

            return this;
        } // end andProcessInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID is not null");

            return this;
        } // end andProcessInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.PROCESS_INSTANCE_ID is not null AND BPM_ATTACHMENT.PROCESS_INSTANCE_ID <> ''");

            return this;
        } // end andProcessInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.PROCESS_INSTANCE_ID is null OR BPM_ATTACHMENT.PROCESS_INSTANCE_ID = '')");

            return this;
        } // end andProcessInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualTo(long value) {
            return andProcessInstanceIdEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID =", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.PROCESS_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualTo(long value) {
            return andProcessInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID <>", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToOrIsNull(long value) {
            return andProcessInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProcessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID is null OR BPM_ATTACHMENT.PROCESS_INSTANCE_ID <>",
                value, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.PROCESS_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThan(long value) {
            return andProcessInstanceIdGreaterThan(Long.valueOf(value));
        } // end andProcessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID >", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.PROCESS_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(long value) {
            return andProcessInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID >=", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.PROCESS_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThan(long value) {
            return andProcessInstanceIdLessThan(Long.valueOf(value));
        } // end andProcessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID <", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.PROCESS_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualTo(long value) {
            return andProcessInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProcessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID <=", value,
                "processInstanceId");

            return this;
        } // end andProcessInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.PROCESS_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID not in",
                    values, "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andProcessInstanceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID in", values,
                    "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andProcessInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID not in",
                    values, "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID in",
                    Arrays.asList(values), "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID not in",
                    Arrays.asList(values), "processInstanceId");

                return this;
            } // end else
        } // end andProcessInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID between", value1,
                value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID not between",
                value1, value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.PROCESS_INSTANCE_ID not between",
                value1, value2, "processInstanceId");

            return this;
        } // end andProcessInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_ATTACHMENT.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_ATTACHMENT.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.REMARKS is not null AND BPM_ATTACHMENT.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.REMARKS is null OR BPM_ATTACHMENT.REMARKS = '')");

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
            addCriterion("BPM_ATTACHMENT.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.REMARKS");
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
            addCriterion("BPM_ATTACHMENT.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_ATTACHMENT.REMARKS is null OR BPM_ATTACHMENT.REMARKS <>",
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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.REMARKS");
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
            addCriterion("BPM_ATTACHMENT.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.REMARKS");
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
            addCriterion("BPM_ATTACHMENT.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.REMARKS");
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
            addCriterion("BPM_ATTACHMENT.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.REMARKS");
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
            addCriterion("BPM_ATTACHMENT.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.REMARKS");
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
            addCriterion("BPM_ATTACHMENT.REMARKS like", buffer.toString(),
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
            addCriterion("BPM_ATTACHMENT.REMARKS not like", buffer.toString(),
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
                addCriterion("BPM_ATTACHMENT.REMARKS in", values, "remarks");

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
                addCriterion("BPM_ATTACHMENT.REMARKS not in", values, "remarks");

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
                addCriterion("BPM_ATTACHMENT.REMARKS in",
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
                addCriterion("BPM_ATTACHMENT.REMARKS not in",
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
            addCriterion("BPM_ATTACHMENT.REMARKS between", value1, value2,
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
            addCriterion("BPM_ATTACHMENT.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_ATTACHMENT.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_ATTACHMENT.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.STATUS is not null AND BPM_ATTACHMENT.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.STATUS is null OR BPM_ATTACHMENT.STATUS = '')");

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
            addCriterion("BPM_ATTACHMENT.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.STATUS");
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
            addCriterion("BPM_ATTACHMENT.STATUS <>", value, "status");

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
            addCriterion("BPM_ATTACHMENT.STATUS is null OR BPM_ATTACHMENT.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.STATUS");
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
            addCriterion("BPM_ATTACHMENT.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.STATUS");
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
            addCriterion("BPM_ATTACHMENT.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.STATUS");
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
            addCriterion("BPM_ATTACHMENT.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.STATUS");
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
            addCriterion("BPM_ATTACHMENT.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.STATUS");
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
            addCriterion("BPM_ATTACHMENT.STATUS like", buffer.toString(),
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
            addCriterion("BPM_ATTACHMENT.STATUS not like", buffer.toString(),
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
                addCriterion("BPM_ATTACHMENT.STATUS in", values, "status");

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
                addCriterion("BPM_ATTACHMENT.STATUS not in", values, "status");

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
                addCriterion("BPM_ATTACHMENT.STATUS in", Arrays.asList(values),
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
                addCriterion("BPM_ATTACHMENT.STATUS not in",
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
            addCriterion("BPM_ATTACHMENT.STATUS between", value1, value2,
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
            addCriterion("BPM_ATTACHMENT.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNull() {
            addCriterion("BPM_ATTACHMENT.TASK_ID is null");

            return this;
        } // end andTaskIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNotNull() {
            addCriterion("BPM_ATTACHMENT.TASK_ID is not null");

            return this;
        } // end andTaskIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.TASK_ID is not null AND BPM_ATTACHMENT.TASK_ID <> ''");

            return this;
        } // end andTaskIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.TASK_ID is null OR BPM_ATTACHMENT.TASK_ID = '')");

            return this;
        } // end andTaskIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdEqualTo(long value) {
            return andTaskIdEqualTo(Long.valueOf(value));
        } // end andTaskIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.TASK_ID =", value, "taskId");

            return this;
        } // end andTaskIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.TASK_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualTo(long value) {
            return andTaskIdNotEqualTo(Long.valueOf(value));
        } // end andTaskIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.TASK_ID <>", value, "taskId");

            return this;
        } // end andTaskIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualToOrIsNull(long value) {
            return andTaskIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTaskIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.TASK_ID is null OR BPM_ATTACHMENT.TASK_ID <>",
                value, "taskId");

            return this;
        } // end andTaskIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.TASK_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThan(long value) {
            return andTaskIdGreaterThan(Long.valueOf(value));
        } // end andTaskIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.TASK_ID >", value, "taskId");

            return this;
        } // end andTaskIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.TASK_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanOrEqualTo(long value) {
            return andTaskIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTaskIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.TASK_ID >=", value, "taskId");

            return this;
        } // end andTaskIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.TASK_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThan(long value) {
            return andTaskIdLessThan(Long.valueOf(value));
        } // end andTaskIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThan(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.TASK_ID <", value, "taskId");

            return this;
        } // end andTaskIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.TASK_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanOrEqualTo(long value) {
            return andTaskIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTaskIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ATTACHMENT.TASK_ID <=", value, "taskId");

            return this;
        } // end andTaskIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.TASK_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTaskIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIn(long[] values) {
            if (values.length == 1) {
                return andTaskIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.TASK_ID in", values, "taskId");

                return this;
            } // end else
        } // end andTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTaskIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.TASK_ID not in", values, "taskId");

                return this;
            } // end else
        } // end andTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIn(List values) {
            if (values.size() == 1) {
                return andTaskIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.TASK_ID in", values, "taskId");

                return this;
            } // end else
        } // end andTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotIn(List values) {
            if (values.size() == 1) {
                return andTaskIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.TASK_ID not in", values, "taskId");

                return this;
            } // end else
        } // end andTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdIn(Object[] values) {
            if (values.length == 1) {
                return andTaskIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.TASK_ID in",
                    Arrays.asList(values), "taskId");

                return this;
            } // end else
        } // end andTaskIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTaskIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.TASK_ID not in",
                    Arrays.asList(values), "taskId");

                return this;
            } // end else
        } // end andTaskIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.TASK_ID between", value1, value2,
                "taskId");

            return this;
        } // end andTaskIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.TASK_ID between", value1, value2,
                "taskId");

            return this;
        } // end andTaskIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotBetween(long value1, long value2) {
            addCriterion("BPM_ATTACHMENT.TASK_ID not between", value1, value2,
                "taskId");

            return this;
        } // end andTaskIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTaskIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ATTACHMENT.TASK_ID not between", value1, value2,
                "taskId");

            return this;
        } // end andTaskIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlIsNull() {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL is null");

            return this;
        } // end andAttachementUrlIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlIsNotNull() {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL is not null");

            return this;
        } // end andAttachementUrlIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.ATTACHEMENT_URL is not null AND BPM_ATTACHMENT.ATTACHEMENT_URL <> ''");

            return this;
        } // end andAttachementUrlIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.ATTACHEMENT_URL is null OR BPM_ATTACHMENT.ATTACHEMENT_URL = '')");

            return this;
        } // end andAttachementUrlIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL =", value,
                "attachementUrl");

            return this;
        } // end andAttachementUrlEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_URL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementUrlEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlNotEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL <>", value,
                "attachementUrl");

            return this;
        } // end andAttachementUrlNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlNotEqualToOrIsNull(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL is null OR BPM_ATTACHMENT.ATTACHEMENT_URL <>",
                value, "attachementUrl");

            return this;
        } // end andAttachementUrlNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_URL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementUrlNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlGreaterThan(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL >", value,
                "attachementUrl");

            return this;
        } // end andAttachementUrlGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_URL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementUrlGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL >=", value,
                "attachementUrl");

            return this;
        } // end andAttachementUrlGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_URL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementUrlGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlLessThan(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL <", value,
                "attachementUrl");

            return this;
        } // end andAttachementUrlLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_URL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementUrlLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlLessThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL <=", value,
                "attachementUrl");

            return this;
        } // end andAttachementUrlLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_URL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementUrlLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL like",
                buffer.toString(), "attachementUrl");

            return this;
        } // end andAttachementUrlLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL not like",
                buffer.toString(), "attachementUrl");

            return this;
        } // end andAttachementUrlNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlIn(List values) {
            if (values.size() == 1) {
                return andAttachementUrlEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL in", values,
                    "attachementUrl");

                return this;
            } // end else
        } // end andAttachementUrlIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlNotIn(List values) {
            if (values.size() == 1) {
                return andAttachementUrlNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL not in", values,
                    "attachementUrl");

                return this;
            } // end else
        } // end andAttachementUrlNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlIn(Object[] values) {
            if (values.length == 1) {
                return andAttachementUrlEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL in",
                    Arrays.asList(values), "attachementUrl");

                return this;
            } // end else
        } // end andAttachementUrlIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlNotIn(Object[] values) {
            if (values.length == 1) {
                return andAttachementUrlNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL not in",
                    Arrays.asList(values), "attachementUrl");

                return this;
            } // end else
        } // end andAttachementUrlNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL between", value1,
                value2, "attachementUrl");

            return this;
        } // end andAttachementUrlBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementUrlNotBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_URL not between", value1,
                value2, "attachementUrl");

            return this;
        } // end andAttachementUrlNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeIsNull() {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE is null");

            return this;
        } // end andAttachementTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeIsNotNull() {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE is not null");

            return this;
        } // end andAttachementTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.ATTACHEMENT_TYPE is not null AND BPM_ATTACHMENT.ATTACHEMENT_TYPE <> ''");

            return this;
        } // end andAttachementTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.ATTACHEMENT_TYPE is null OR BPM_ATTACHMENT.ATTACHEMENT_TYPE = '')");

            return this;
        } // end andAttachementTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE =", value,
                "attachementType");

            return this;
        } // end andAttachementTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeNotEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE <>", value,
                "attachementType");

            return this;
        } // end andAttachementTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeNotEqualToOrIsNull(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE is null OR BPM_ATTACHMENT.ATTACHEMENT_TYPE <>",
                value, "attachementType");

            return this;
        } // end andAttachementTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeGreaterThan(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE >", value,
                "attachementType");

            return this;
        } // end andAttachementTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE >=", value,
                "attachementType");

            return this;
        } // end andAttachementTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeLessThan(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE <", value,
                "attachementType");

            return this;
        } // end andAttachementTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeLessThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE <=", value,
                "attachementType");

            return this;
        } // end andAttachementTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.ATTACHEMENT_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachementTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE like",
                buffer.toString(), "attachementType");

            return this;
        } // end andAttachementTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE not like",
                buffer.toString(), "attachementType");

            return this;
        } // end andAttachementTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeIn(List values) {
            if (values.size() == 1) {
                return andAttachementTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE in", values,
                    "attachementType");

                return this;
            } // end else
        } // end andAttachementTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeNotIn(List values) {
            if (values.size() == 1) {
                return andAttachementTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE not in", values,
                    "attachementType");

                return this;
            } // end else
        } // end andAttachementTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeIn(Object[] values) {
            if (values.length == 1) {
                return andAttachementTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE in",
                    Arrays.asList(values), "attachementType");

                return this;
            } // end else
        } // end andAttachementTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andAttachementTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE not in",
                    Arrays.asList(values), "attachementType");

                return this;
            } // end else
        } // end andAttachementTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE between", value1,
                value2, "attachementType");

            return this;
        } // end andAttachementTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachementTypeNotBetween(String value1,
            String value2) {
            addCriterion("BPM_ATTACHMENT.ATTACHEMENT_TYPE not between", value1,
                value2, "attachementType");

            return this;
        } // end andAttachementTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyIsNull() {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY is null");

            return this;
        } // end andAttachmentKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyIsNotNull() {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY is not null");

            return this;
        } // end andAttachmentKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.ATTACHMENT_KEY is not null AND BPM_ATTACHMENT.ATTACHMENT_KEY <> ''");

            return this;
        } // end andAttachmentKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.ATTACHMENT_KEY is null OR BPM_ATTACHMENT.ATTACHMENT_KEY = '')");

            return this;
        } // end andAttachmentKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY =", value,
                "attachmentKey");

            return this;
        } // end andAttachmentKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ATTACHMENT_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyNotEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY <>", value,
                "attachmentKey");

            return this;
        } // end andAttachmentKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY is null OR BPM_ATTACHMENT.ATTACHMENT_KEY <>",
                value, "attachmentKey");

            return this;
        } // end andAttachmentKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ATTACHMENT_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyGreaterThan(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY >", value,
                "attachmentKey");

            return this;
        } // end andAttachmentKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ATTACHMENT_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY >=", value,
                "attachmentKey");

            return this;
        } // end andAttachmentKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ATTACHMENT_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyLessThan(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY <", value,
                "attachmentKey");

            return this;
        } // end andAttachmentKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ATTACHMENT_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY <=", value,
                "attachmentKey");

            return this;
        } // end andAttachmentKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ATTACHMENT.ATTACHMENT_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAttachmentKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY like",
                buffer.toString(), "attachmentKey");

            return this;
        } // end andAttachmentKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY not like",
                buffer.toString(), "attachmentKey");

            return this;
        } // end andAttachmentKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyIn(List values) {
            if (values.size() == 1) {
                return andAttachmentKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY in", values,
                    "attachmentKey");

                return this;
            } // end else
        } // end andAttachmentKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyNotIn(List values) {
            if (values.size() == 1) {
                return andAttachmentKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY not in", values,
                    "attachmentKey");

                return this;
            } // end else
        } // end andAttachmentKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyIn(Object[] values) {
            if (values.length == 1) {
                return andAttachmentKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY in",
                    Arrays.asList(values), "attachmentKey");

                return this;
            } // end else
        } // end andAttachmentKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andAttachmentKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY not in",
                    Arrays.asList(values), "attachmentKey");

                return this;
            } // end else
        } // end andAttachmentKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY between", value1,
                value2, "attachmentKey");

            return this;
        } // end andAttachmentKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAttachmentKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.ATTACHMENT_KEY not between", value1,
                value2, "attachmentKey");

            return this;
        } // end andAttachmentKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeIsNull() {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE is null");

            return this;
        } // end andFileDisplaySizeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeIsNotNull() {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE is not null");

            return this;
        } // end andFileDisplaySizeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeIsNotEmpty() {
            addCriterion(
                "BPM_ATTACHMENT.FILE_DISPLAY_SIZE is not null AND BPM_ATTACHMENT.FILE_DISPLAY_SIZE <> ''");

            return this;
        } // end andFileDisplaySizeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeIsEmpty() {
            addCriterion(
                "(BPM_ATTACHMENT.FILE_DISPLAY_SIZE is null OR BPM_ATTACHMENT.FILE_DISPLAY_SIZE = '')");

            return this;
        } // end andFileDisplaySizeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE =", value,
                "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.FILE_DISPLAY_SIZE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileDisplaySizeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeNotEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE <>", value,
                "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeNotEqualToOrIsNull(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE is null OR BPM_ATTACHMENT.FILE_DISPLAY_SIZE <>",
                value, "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.FILE_DISPLAY_SIZE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileDisplaySizeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeGreaterThan(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE >", value,
                "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.FILE_DISPLAY_SIZE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileDisplaySizeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE >=", value,
                "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.FILE_DISPLAY_SIZE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileDisplaySizeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeLessThan(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE <", value,
                "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.FILE_DISPLAY_SIZE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileDisplaySizeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeLessThanOrEqualTo(String value) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE <=", value,
                "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_ATTACHMENT.FILE_DISPLAY_SIZE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileDisplaySizeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE like",
                buffer.toString(), "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE not like",
                buffer.toString(), "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeIn(List values) {
            if (values.size() == 1) {
                return andFileDisplaySizeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE in", values,
                    "fileDisplaySize");

                return this;
            } // end else
        } // end andFileDisplaySizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeNotIn(List values) {
            if (values.size() == 1) {
                return andFileDisplaySizeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE not in", values,
                    "fileDisplaySize");

                return this;
            } // end else
        } // end andFileDisplaySizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeIn(Object[] values) {
            if (values.length == 1) {
                return andFileDisplaySizeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE in",
                    Arrays.asList(values), "fileDisplaySize");

                return this;
            } // end else
        } // end andFileDisplaySizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileDisplaySizeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE not in",
                    Arrays.asList(values), "fileDisplaySize");

                return this;
            } // end else
        } // end andFileDisplaySizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeBetween(String value1, String value2) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE between", value1,
                value2, "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileDisplaySizeNotBetween(String value1,
            String value2) {
            addCriterion("BPM_ATTACHMENT.FILE_DISPLAY_SIZE not between",
                value1, value2, "fileDisplaySize");

            return this;
        } // end andFileDisplaySizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameIsNull() {
            addCriterion("creatorA.NAME is null");

            return this;
        } // end andCreratorNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameIsNotNull() {
            addCriterion("creatorA.NAME is not null");

            return this;
        } // end andCreratorNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameIsNotEmpty() {
            addCriterion("creatorA.NAME is not null AND creatorA.NAME <> ''");

            return this;
        } // end andCreratorNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameIsEmpty() {
            addCriterion("(creatorA.NAME is null OR creatorA.NAME = '')");

            return this;
        } // end andCreratorNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameEqualTo(String value) {
            addCriterion("creatorA.NAME =", value, "creratorName");

            return this;
        } // end andCreratorNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("creatorA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreratorNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameNotEqualTo(String value) {
            addCriterion("creatorA.NAME <>", value, "creratorName");

            return this;
        } // end andCreratorNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameNotEqualToOrIsNull(String value) {
            addCriterion("creatorA.NAME is null OR creatorA.NAME <>", value,
                "creratorName");

            return this;
        } // end andCreratorNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("creatorA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreratorNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameGreaterThan(String value) {
            addCriterion("creatorA.NAME >", value, "creratorName");

            return this;
        } // end andCreratorNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("creatorA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreratorNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creatorA.NAME >=", value, "creratorName");

            return this;
        } // end andCreratorNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("creatorA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreratorNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameLessThan(String value) {
            addCriterion("creatorA.NAME <", value, "creratorName");

            return this;
        } // end andCreratorNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("creatorA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreratorNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameLessThanOrEqualTo(String value) {
            addCriterion("creatorA.NAME <=", value, "creratorName");

            return this;
        } // end andCreratorNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("creatorA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCreratorNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("creatorA.NAME like", buffer.toString(), "creratorName");

            return this;
        } // end andCreratorNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("creatorA.NAME not like", buffer.toString(),
                "creratorName");

            return this;
        } // end andCreratorNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameIn(List values) {
            if (values.size() == 1) {
                return andCreratorNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("creatorA.NAME in", values, "creratorName");

                return this;
            } // end else
        } // end andCreratorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameNotIn(List values) {
            if (values.size() == 1) {
                return andCreratorNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("creatorA.NAME not in", values, "creratorName");

                return this;
            } // end else
        } // end andCreratorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameIn(Object[] values) {
            if (values.length == 1) {
                return andCreratorNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("creatorA.NAME in", Arrays.asList(values),
                    "creratorName");

                return this;
            } // end else
        } // end andCreratorNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andCreratorNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("creatorA.NAME not in", Arrays.asList(values),
                    "creratorName");

                return this;
            } // end else
        } // end andCreratorNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameBetween(String value1, String value2) {
            addCriterion("creatorA.NAME between", value1, value2, "creratorName");

            return this;
        } // end andCreratorNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCreratorNameNotBetween(String value1, String value2) {
            addCriterion("creatorA.NAME not between", value1, value2,
                "creratorName");

            return this;
        } // end andCreratorNameNotBetween()
    } // end Criteria
} // end BpmAttachmentDAOQueryBean
