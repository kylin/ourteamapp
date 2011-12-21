/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMeetingMember Data Access Object
*  GenDate 2011-09-22 10:18:40  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMeetingMemberDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MEETING_MEMBER";

    /** Attribute */
    static final String Id = "MEETING_MEMBER.ID";

    /** Attribute */
    static final String MeetingId = "MEETING_MEMBER.MEETING_ID";

    /** Attribute */
    static final String MeetingRole = "MEETING_MEMBER.MEETING_ROLE";

    /** Attribute */
    static final String MemberId = "MEETING_MEMBER.MEMBER_ID";

    /** Attribute */
    static final String Remarks = "MEETING_MEMBER.REMARKS";

    /** Attribute */
    static final String Status = "MEETING_MEMBER.STATUS";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String Id = "id";

        /** Attribute */
        static final String MeetingId = "meetingId";

        /** Attribute */
        static final String MeetingRole = "meetingRole";

        /** Attribute */
        static final String MemberId = "memberId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique MeetingMember
     *
     * @param aMeetingMember
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MeetingMember aMeetingMember)
        throws Exception;

    /**
     * insert MeetingMember
     *
     * @param aMeetingMember
     *
     * @throws Exception
     *
     * @model
     */
    void insertMeetingMember(MeetingMember aMeetingMember)
        throws Exception;

    /**
     * Batch Insert MeetingMember
     *
     * @param aMeetingMember
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMeetingMember(MeetingMember[] aMeetingMember)
        throws Exception;

    /**
     * Delete MeetingMember
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeetingMember(final long aId) throws Exception;

    /**
     * Delete MeetingMember By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeetingMember(MeetingMemberDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MeetingMember
     *
     * @param aMeetingMember
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeetingMember(MeetingMember aMeetingMember)
        throws Exception;

    /**
     * Batch Modify MeetingMember
     *
     * @param aMeetingMember
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMeetingMember(MeetingMember[] aMeetingMember)
        throws Exception;

    /**
     * Modify MeetingMember  By Query Conditions
     *
     * @param aMeetingMember Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeetingMember(MeetingMember aMeetingMember,
        MeetingMemberDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MeetingMember
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MeetingMember findMeetingMemberById(final long aId)
        throws Exception;

    /**
     * Query MeetingMember
     *
     * @param aQueryBean
     *
     * @return IMeetingMember[]
     *
     * @throws Exception
     *
     * @model type="IMeetingMember" containment="true"
     */
    MeetingMember[] queryMeetingMember(MeetingMemberDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MeetingMember
     *
     * @param aBaseQueryBean
     *
     * @return IMeetingMember[]
     *
     * @throws Exception
     *
     * @model type="IMeetingMember" containment="true"
     */

    //Map queryMeetingMemberForMap(MeetingMemberDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MeetingMember
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMeetingMemberCount(MeetingMemberDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MeetingMember Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMeetingMemberSelective(MeetingMemberDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize MeetingMember
     *
     * @param aMeetingMembers
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeetingMember(MeetingMember[] aMeetingMembers,
        MeetingMemberDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MeetingMember
     *
     * @param aMeetingMembers
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeetingMember(MeetingMember[] aMeetingMembers,
        MeetingMemberDAOQueryBean aQueryBean,
        MeetingMemberSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MeetingMemberSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMeetingMemberArray DOCUMENT ME!
         * @param willUpdateMeetingMemberArray DOCUMENT ME!
         * @param willDeleteMeetingMemberArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MeetingMember[] willAddMeetingMemberArray,
            MeetingMember[] willUpdateMeetingMemberArray,
            MeetingMember[] willDeleteMeetingMemberArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MeetingMember[] aMeetingMembers)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MeetingMember[] aMeetingMembers)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MeetingMember[] aMeetingMembers)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MeetingMember[] aMeetingMembers)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MeetingMember[] aMeetingMembers)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MeetingMember[] aMeetingMembers)
            throws Exception;
    } // end MeetingMemberSynchronizeCallback
} // end IBaseMeetingMemberDAO
