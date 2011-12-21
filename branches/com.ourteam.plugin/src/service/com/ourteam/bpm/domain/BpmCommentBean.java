/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 流程任务注释 Generate date 2011-12-02 13:59:38
 *
 * @model auto gen
 */
public class BpmCommentBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmComment objBpmComment;

    static {
        mappedDaoFields.put("processInstanceId",
            com.ourteam.bpm.dao.IBpmCommentDAO.ProcessInstanceId);

        mappedDaoFields.put("employeeId",
            com.ourteam.bpm.dao.IBpmCommentDAO.AuthorId);

        mappedDaoFields.put("time",
            com.ourteam.bpm.dao.IBpmCommentDAO.AuthorDate);

        mappedDaoFields.put("comment",
            com.ourteam.bpm.dao.IBpmCommentDAO.Comment);

        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmCommentDAO.Id);

        mappedDaoFields.put("status", com.ourteam.bpm.dao.IBpmCommentDAO.Status);

        mappedDaoFields.put("employeeName",
            com.ourteam.bpm.dao.IBpmCommentDAO.AuthorName);
    } 

    /**
     * Creates a new BpmCommentBean object.
     */
    public BpmCommentBean() {
        super();

        objBpmComment = new com.ourteam.bpm.dao.BpmComment();
    } // end BpmCommentBean()

    /**
     * Creates a new BpmCommentBean object.
     *
     * @param aBpmComment DOCUMENT ME!
     */
    public BpmCommentBean(com.ourteam.bpm.dao.BpmComment aBpmComment) {
        super();

        objBpmComment = aBpmComment;
    } // end BpmCommentBean()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.BpmComment convertToBpmComment() {
        return objBpmComment;
    } // end convertToBpmComment()

    /**
     * Get ProcessInstanceId
     *
     * @return processInstanceId
     */
    public long getProcessInstanceId() {
        return objBpmComment.getProcessInstanceId();
    } // end getProcessInstanceId()

    /**
     * Set ProcessInstanceId
     *
     * @param aProcessInstanceId
     */
    public void setProcessInstanceId(long aProcessInstanceId) {
        this.objBpmComment.setProcessInstanceId(aProcessInstanceId);
    } // end setProcessInstanceId()

    /**
     * Get EmployeeId
     *
     * @return employeeId
     */
    public long getEmployeeId() {
        return objBpmComment.getAuthorId();
    } // end getEmployeeId()

    /**
     * Set EmployeeId
     *
     * @param aEmployeeId
     */
    public void setEmployeeId(long aEmployeeId) {
        this.objBpmComment.setAuthorId(aEmployeeId);
    } // end setEmployeeId()

    /**
     * Get Time
     *
     * @return time
     */
    public java.util.Date getTime() {
        return objBpmComment.getAuthorDate();
    } // end getTime()

    /**
     * Set Time
     *
     * @param aTime
     */
    public void setTime(java.util.Date aTime) {
        this.objBpmComment.setAuthorDate(aTime);
    } // end setTime()

    /**
     * Get Comment
     *
     * @return comment
     */
    public String getComment() {
        return objBpmComment.getComment();
    } // end getComment()

    /**
     * Set Comment
     *
     * @param aComment
     */
    public void setComment(String aComment) {
        this.objBpmComment.setComment(aComment);
    } // end setComment()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmComment.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmComment.setId(aId);
    } // end setId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmComment.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmComment.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get EmployeeName
     *
     * @return employeeName
     */
    public String getEmployeeName() {
        return objBpmComment.getAuthorName();
    } // end getEmployeeName()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
    } // end hashCode()

    /**
     * DOCUMENT ME!
     *
     * @param obj DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } // end if

        if ((obj instanceof BpmCommentBean) == false) {
            return false;
        } // end if

        BpmCommentBean other = (BpmCommentBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmComment tempBpmComment = other.convertToBpmComment();

        if ((tempBpmComment == null) || (this.objBpmComment == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmComment == this.objBpmComment) ||
                tempBpmComment.equals(this.objBpmComment)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmComments DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmCommentBean[] toArray(
        com.ourteam.bpm.dao.BpmComment[] aBpmComments) {
        return toArray(aBpmComments, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmComments DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmCommentBean[] toArray(
        com.ourteam.bpm.dao.BpmComment[] aBpmComments,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmComments)) {
            return new BpmCommentBean[0];
        } // end if

        int length = aBpmComments.length;

        BpmCommentBean[] beans = new BpmCommentBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmCommentBean(aBpmComments[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmCommentBean(aBpmComments[i]);

                aCallBack.populate(beans[i], new Object[] { aBpmComments[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmCommentBean
