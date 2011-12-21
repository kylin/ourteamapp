/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

/**
 * Generate Date 2011-09-22 10:18:40
 *
 * @author Auto Gen
 */
public class MeetingMember implements java.io.Serializable {
    /**
     * Creates a new MeetingMember object.
     */
    public MeetingMember() {
        super();
    } // end MeetingMember()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long meetingId;

    /** Attribute  Be Seted Falg */
    private boolean meetingIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean meetingIdNull = false;

    /** Attribute */
    private String meetingRole;

    /** Attribute  Be Seted Falg */
    private boolean meetingRoleSetted = false;

    /** Attribute  is Null Falg */
    private boolean meetingRoleNull = false;

    /** Attribute */
    private long memberId;

    /** Attribute  Be Seted Falg */
    private boolean memberIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean memberIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

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
     * Get MeetingId
     *
     * @return meetingId
     */
    final public long getMeetingId() {
        return meetingId;
    } // end getMeetingId()

    /**
     * Set MeetingId
     *
     * @param aMeetingId
     */
    final public void setMeetingId(long aMeetingId) {
        this.meetingId = aMeetingId;

        this.meetingIdSetted = true;

        this.setMeetingIdNull(false);
    } // end setMeetingId()

    /**
     * Get MeetingId Has Been Setted
     *
     * @return meetingId
     */
    final public boolean isMeetingIdSetted() {
        return this.meetingIdSetted;
    } // end isMeetingIdSetted()

    /**
     * Set MeetingId Null
     */
    final public void setMeetingIdNull() {
        this.meetingIdNull = true;
    } // end setMeetingIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMeetingIdNull(boolean aNullFlag) {
        this.meetingIdNull = aNullFlag;
    } // end setMeetingIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMeetingIdNull() {
        return this.meetingIdNull;
    } // end isMeetingIdNull()

    /**
     * Get MeetingRole
     *
     * @return meetingRole
     */
    final public String getMeetingRole() {
        return meetingRole;
    } // end getMeetingRole()

    /**
     * Set MeetingRole
     *
     * @param aMeetingRole
     */
    final public void setMeetingRole(String aMeetingRole) {
        this.meetingRole = aMeetingRole;

        this.meetingRoleSetted = true;

        this.setMeetingRoleNull(this.meetingRole == null);
    } // end setMeetingRole()

    /**
     * Get MeetingRole Has Been Setted
     *
     * @return meetingRole
     */
    final public boolean isMeetingRoleSetted() {
        return this.meetingRoleSetted;
    } // end isMeetingRoleSetted()

    /**
     * Set MeetingRole Null
     */
    final public void setMeetingRoleNull() {
        this.meetingRoleNull = true;
    } // end setMeetingRoleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMeetingRoleNull(boolean aNullFlag) {
        this.meetingRoleNull = aNullFlag;
    } // end setMeetingRoleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMeetingRoleNull() {
        return this.meetingRoleNull;
    } // end isMeetingRoleNull()

    /**
     * Get MemberId
     *
     * @return memberId
     */
    final public long getMemberId() {
        return memberId;
    } // end getMemberId()

    /**
     * Set MemberId
     *
     * @param aMemberId
     */
    final public void setMemberId(long aMemberId) {
        this.memberId = aMemberId;

        this.memberIdSetted = true;

        this.setMemberIdNull(false);
    } // end setMemberId()

    /**
     * Get MemberId Has Been Setted
     *
     * @return memberId
     */
    final public boolean isMemberIdSetted() {
        return this.memberIdSetted;
    } // end isMemberIdSetted()

    /**
     * Set MemberId Null
     */
    final public void setMemberIdNull() {
        this.memberIdNull = true;
    } // end setMemberIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMemberIdNull(boolean aNullFlag) {
        this.memberIdNull = aNullFlag;
    } // end setMemberIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMemberIdNull() {
        return this.memberIdNull;
    } // end isMemberIdNull()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    final public String getRemarks() {
        if (isRemarksNull()) {
            return null;
        } // end if
        else {
            return remarks;
        } // end else
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    final public void setRemarks(String aRemarks) {
        this.remarks = aRemarks;

        this.remarksSetted = true;

        this.setRemarksNull(this.remarks == null);
    } // end setRemarks()

    /**
     * Get Remarks Has Been Setted
     *
     * @return remarks
     */
    final public boolean isRemarksSetted() {
        return this.remarksSetted;
    } // end isRemarksSetted()

    /**
     * Set Remarks Null
     */
    final public void setRemarksNull() {
        this.remarksNull = true;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRemarksNull(boolean aNullFlag) {
        this.remarksNull = aNullFlag;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRemarksNull() {
        return this.remarksNull;
    } // end isRemarksNull()

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

        if ((obj instanceof MeetingMember) == false) {
            return false;
        } // end if

        MeetingMember other = (MeetingMember) obj;

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

        buffer.append("meetingId=");
        buffer.append(this.meetingId);
        buffer.append("\r\n");

        buffer.append("meetingRole=");
        buffer.append(this.meetingRole);
        buffer.append("\r\n");

        buffer.append("memberId=");
        buffer.append(this.memberId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MeetingMember
