/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMeeting Data Access Object
*  GenDate 2011-09-22 10:18:39  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMeetingDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MEETING";

    /** Attribute */
    static final String Id = "MEETING.ID";

    /** Attribute */
    static final String EndDate = "MEETING.END_DATE";

    /** Attribute */
    static final String OwnerId = "MEETING.OWNER_ID";

    /** Attribute */
    static final String Remarks = "MEETING.REMARKS";

    /** Attribute */
    static final String StartDate = "MEETING.START_DATE";

    /** Attribute */
    static final String Status = "MEETING.STATUS";

    /** Attribute */
    static final String Tags = "MEETING.TAGS";

    /** Attribute */
    static final String Topic = "MEETING.TOPIC";

    /** Attribute */
    static final String Type = "MEETING.TYPE";

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
        static final String EndDate = "endDate";

        /** Attribute */
        static final String OwnerId = "ownerId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String StartDate = "startDate";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String Tags = "tags";

        /** Attribute */
        static final String Topic = "topic";

        /** Attribute */
        static final String Type = "type";
    } // end DataProperty

    /**
     * Check Unique Meeting
     *
     * @param aMeeting
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(Meeting aMeeting) throws Exception;

    /**
     * insert Meeting
     *
     * @param aMeeting
     *
     * @throws Exception
     *
     * @model
     */
    void insertMeeting(Meeting aMeeting) throws Exception;

    /**
     * Batch Insert Meeting
     *
     * @param aMeeting
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMeeting(Meeting[] aMeeting) throws Exception;

    /**
     * Delete Meeting
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeeting(final long aId) throws Exception;

    /**
     * Delete Meeting By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeeting(MeetingDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify Meeting
     *
     * @param aMeeting
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeeting(Meeting aMeeting) throws Exception;

    /**
     * Batch Modify Meeting
     *
     * @param aMeeting
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMeeting(Meeting[] aMeeting) throws Exception;

    /**
     * Modify Meeting  By Query Conditions
     *
     * @param aMeeting Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeeting(Meeting aMeeting, MeetingDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Meeting
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    Meeting findMeetingById(final long aId) throws Exception;

    /**
     * Query Meeting
     *
     * @param aQueryBean
     *
     * @return IMeeting[]
     *
     * @throws Exception
     *
     * @model type="IMeeting" containment="true"
     */
    Meeting[] queryMeeting(MeetingDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Meeting
     *
     * @param aBaseQueryBean
     *
     * @return IMeeting[]
     *
     * @throws Exception
     *
     * @model type="IMeeting" containment="true"
     */

    //Map queryMeetingForMap(MeetingDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count Meeting
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMeetingCount(MeetingDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query Meeting Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMeetingSelective(MeetingDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize Meeting
     *
     * @param aMeetings
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeeting(Meeting[] aMeetings, MeetingDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize Meeting
     *
     * @param aMeetings
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeeting(Meeting[] aMeetings,
        MeetingDAOQueryBean aQueryBean, MeetingSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MeetingSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMeetingArray DOCUMENT ME!
         * @param willUpdateMeetingArray DOCUMENT ME!
         * @param willDeleteMeetingArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(Meeting[] willAddMeetingArray,
            Meeting[] willUpdateMeetingArray, Meeting[] willDeleteMeetingArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(Meeting[] aMeetings) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(Meeting[] aMeetings) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(Meeting[] aMeetings) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(Meeting[] aMeetings) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(Meeting[] aMeetings) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(Meeting[] aMeetings) throws Exception;
    } // end MeetingSynchronizeCallback
} // end IBaseMeetingDAO
