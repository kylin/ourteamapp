/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMeetingContent Data Access Object
*  GenDate 2011-09-22 10:18:39  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMeetingContentDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MEETING_CONTENT";

    /** Attribute */
    static final String Id = "MEETING_CONTENT.ID";

    /** Attribute */
    static final String Content = "MEETING_CONTENT.CONTENT";

    /** Attribute */
    static final String MeetingId = "MEETING_CONTENT.MEETING_ID";

    /** Attribute */
    static final String Remarks = "MEETING_CONTENT.REMARKS";

    /** Attribute */
    static final String Status = "MEETING_CONTENT.STATUS";

    /** Attribute */
    static final String MeetingTopic = "meetingA.TOPIC";

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
        static final String Content = "content";

        /** Attribute */
        static final String MeetingId = "meetingId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String MeetingTopic = "meetingTopic";
    } // end DataProperty

    /**
     * Check Unique MeetingContent
     *
     * @param aMeetingContent
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MeetingContent aMeetingContent)
        throws Exception;

    /**
     * insert MeetingContent
     *
     * @param aMeetingContent
     *
     * @throws Exception
     *
     * @model
     */
    void insertMeetingContent(MeetingContent aMeetingContent)
        throws Exception;

    /**
     * Batch Insert MeetingContent
     *
     * @param aMeetingContent
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMeetingContent(MeetingContent[] aMeetingContent)
        throws Exception;

    /**
     * Delete MeetingContent
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeetingContent(final long aId) throws Exception;

    /**
     * Delete MeetingContent By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeetingContent(MeetingContentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MeetingContent
     *
     * @param aMeetingContent
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeetingContent(MeetingContent aMeetingContent)
        throws Exception;

    /**
     * Batch Modify MeetingContent
     *
     * @param aMeetingContent
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMeetingContent(MeetingContent[] aMeetingContent)
        throws Exception;

    /**
     * Modify MeetingContent  By Query Conditions
     *
     * @param aMeetingContent Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeetingContent(MeetingContent aMeetingContent,
        MeetingContentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MeetingContent
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MeetingContent findMeetingContentById(final long aId)
        throws Exception;

    /**
     * Query MeetingContent
     *
     * @param aQueryBean
     *
     * @return IMeetingContent[]
     *
     * @throws Exception
     *
     * @model type="IMeetingContent" containment="true"
     */
    MeetingContent[] queryMeetingContent(MeetingContentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MeetingContent
     *
     * @param aBaseQueryBean
     *
     * @return IMeetingContent[]
     *
     * @throws Exception
     *
     * @model type="IMeetingContent" containment="true"
     */

    //Map queryMeetingContentForMap(MeetingContentDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MeetingContent
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMeetingContentCount(MeetingContentDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MeetingContent Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMeetingContentSelective(
        MeetingContentDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize MeetingContent
     *
     * @param aMeetingContents
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeetingContent(MeetingContent[] aMeetingContents,
        MeetingContentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MeetingContent
     *
     * @param aMeetingContents
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeetingContent(MeetingContent[] aMeetingContents,
        MeetingContentDAOQueryBean aQueryBean,
        MeetingContentSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MeetingContentSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMeetingContentArray DOCUMENT ME!
         * @param willUpdateMeetingContentArray DOCUMENT ME!
         * @param willDeleteMeetingContentArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MeetingContent[] willAddMeetingContentArray,
            MeetingContent[] willUpdateMeetingContentArray,
            MeetingContent[] willDeleteMeetingContentArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingContents DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MeetingContent[] aMeetingContents)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingContents DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MeetingContent[] aMeetingContents)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingContents DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MeetingContent[] aMeetingContents)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingContents DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MeetingContent[] aMeetingContents)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingContents DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MeetingContent[] aMeetingContents)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingContents DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MeetingContent[] aMeetingContents)
            throws Exception;
    } // end MeetingContentSynchronizeCallback
} // end IBaseMeetingContentDAO
