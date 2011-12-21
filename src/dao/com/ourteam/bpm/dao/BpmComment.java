/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-12-02 13:52:01
 *
 * @author Auto Gen
 */
public class BpmComment implements java.io.Serializable {
    /**
     * Creates a new BpmComment object.
     */
    public BpmComment() {
        super();
    } // end BpmComment()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date authorDate;

    /** Attribute  Be Seted Falg */
    private boolean authorDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean authorDateNull = false;

    /** Attribute */
    private long authorId;

    /** Attribute  Be Seted Falg */
    private boolean authorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean authorIdNull = false;

    /** Attribute */
    private String comment;

    /** Attribute  Be Seted Falg */
    private boolean commentSetted = false;

    /** Attribute  is Null Falg */
    private boolean commentNull = false;

    /** Attribute */
    private long processInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean processInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processInstanceIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String authorName;

    /** Attribute  Be Seted Falg */
    private boolean authorNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean authorNameNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get AuthorDate
     *
     * @return authorDate
     */
    final public java.util.Date getAuthorDate() {
        return authorDate;
    } // end getAuthorDate()

    /**
     * Set AuthorDate
     *
     * @param aAuthorDate
     */
    final public void setAuthorDate(java.util.Date aAuthorDate) {
        this.authorDate = aAuthorDate;

        this.authorDateSetted = true;

        this.setAuthorDateNull(this.authorDate == null);
    } // end setAuthorDate()

    /**
     * Get AuthorDate Has Been Setted
     *
     * @return authorDate
     */
    final public boolean isAuthorDateSetted() {
        return this.authorDateSetted;
    } // end isAuthorDateSetted()

    /**
     * Set AuthorDate Null
     */
    final public void setAuthorDateNull() {
        this.authorDateNull = true;
    } // end setAuthorDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAuthorDateNull(boolean aNullFlag) {
        this.authorDateNull = aNullFlag;
    } // end setAuthorDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAuthorDateNull() {
        return this.authorDateNull;
    } // end isAuthorDateNull()

    /**
     * Get AuthorId
     *
     * @return authorId
     */
    final public long getAuthorId() {
        return authorId;
    } // end getAuthorId()

    /**
     * Set AuthorId
     *
     * @param aAuthorId
     */
    final public void setAuthorId(long aAuthorId) {
        this.authorId = aAuthorId;

        this.authorIdSetted = true;

        this.setAuthorIdNull(false);
    } // end setAuthorId()

    /**
     * Get AuthorId Has Been Setted
     *
     * @return authorId
     */
    final public boolean isAuthorIdSetted() {
        return this.authorIdSetted;
    } // end isAuthorIdSetted()

    /**
     * Set AuthorId Null
     */
    final public void setAuthorIdNull() {
        this.authorIdNull = true;
    } // end setAuthorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAuthorIdNull(boolean aNullFlag) {
        this.authorIdNull = aNullFlag;
    } // end setAuthorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAuthorIdNull() {
        return this.authorIdNull;
    } // end isAuthorIdNull()

    /**
     * Get Comment
     *
     * @return comment
     */
    final public String getComment() {
        if (isCommentNull()) {
            return null;
        } // end if
        else {
            return comment;
        } // end else
    } // end getComment()

    /**
     * Set Comment
     *
     * @param aComment
     */
    final public void setComment(String aComment) {
        this.comment = aComment;

        this.commentSetted = true;

        this.setCommentNull(this.comment == null);
    } // end setComment()

    /**
     * Get Comment Has Been Setted
     *
     * @return comment
     */
    final public boolean isCommentSetted() {
        return this.commentSetted;
    } // end isCommentSetted()

    /**
     * Set Comment Null
     */
    final public void setCommentNull() {
        this.commentNull = true;
    } // end setCommentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCommentNull(boolean aNullFlag) {
        this.commentNull = aNullFlag;
    } // end setCommentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCommentNull() {
        return this.commentNull;
    } // end isCommentNull()

    /**
     * Get ProcessInstanceId
     *
     * @return processInstanceId
     */
    final public long getProcessInstanceId() {
        return processInstanceId;
    } // end getProcessInstanceId()

    /**
     * Set ProcessInstanceId
     *
     * @param aProcessInstanceId
     */
    final public void setProcessInstanceId(long aProcessInstanceId) {
        this.processInstanceId = aProcessInstanceId;

        this.processInstanceIdSetted = true;

        this.setProcessInstanceIdNull(false);
    } // end setProcessInstanceId()

    /**
     * Get ProcessInstanceId Has Been Setted
     *
     * @return processInstanceId
     */
    final public boolean isProcessInstanceIdSetted() {
        return this.processInstanceIdSetted;
    } // end isProcessInstanceIdSetted()

    /**
     * Set ProcessInstanceId Null
     */
    final public void setProcessInstanceIdNull() {
        this.processInstanceIdNull = true;
    } // end setProcessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessInstanceIdNull(boolean aNullFlag) {
        this.processInstanceIdNull = aNullFlag;
    } // end setProcessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessInstanceIdNull() {
        return this.processInstanceIdNull;
    } // end isProcessInstanceIdNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * Get AuthorName
     *
     * @return authorName
     */
    final public String getAuthorName() {
        return authorName;
    } // end getAuthorName()

    /**
     * Set AuthorName
     *
     * @param aAuthorName
     */
    final public void setAuthorName(String aAuthorName) {
        this.authorName = aAuthorName;

        this.authorNameSetted = true;

        this.setAuthorNameNull(this.authorName == null);
    } // end setAuthorName()

    /**
     * Get AuthorName Has Been Setted
     *
     * @return authorName
     */
    final public boolean isAuthorNameSetted() {
        return this.authorNameSetted;
    } // end isAuthorNameSetted()

    /**
     * Set AuthorName Null
     */
    final public void setAuthorNameNull() {
        this.authorNameNull = true;
    } // end setAuthorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setAuthorNameNull(boolean aNullFlag) {
        this.authorNameNull = aNullFlag;
    } // end setAuthorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isAuthorNameNull() {
        return this.authorNameNull;
    } // end isAuthorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

        return result;
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

        if ((obj instanceof BpmComment) == false) {
            return false;
        } // end if

        BpmComment other = (BpmComment) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("authorDate=");
        buffer.append(this.authorDate);
        buffer.append("\r\n");

        buffer.append("authorId=");
        buffer.append(this.authorId);
        buffer.append("\r\n");

        buffer.append("comment=");
        buffer.append(this.comment);
        buffer.append("\r\n");

        buffer.append("processInstanceId=");
        buffer.append(this.processInstanceId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("authorName=");
        buffer.append(this.authorName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmComment
