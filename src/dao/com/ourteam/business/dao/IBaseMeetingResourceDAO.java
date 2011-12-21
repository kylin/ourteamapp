/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMeetingResource Data Access Object
*  GenDate 2011-09-22 10:18:40  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMeetingResourceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MEETING_RESOURCE";

    /** Attribute */
    static final String Id = "MEETING_RESOURCE.ID";

    /** Attribute */
    static final String MeetingId = "MEETING_RESOURCE.MEETING_ID";

    /** Attribute */
    static final String Remarks = "MEETING_RESOURCE.REMARKS";

    /** Attribute */
    static final String ResourceId = "MEETING_RESOURCE.RESOURCE_ID";

    /** Attribute */
    static final String Status = "MEETING_RESOURCE.STATUS";

    /** Attribute */
    static final String ResourceCode = "resourceA.CODE";

    /** Attribute */
    static final String ResourceName = "resourceA.NAME";

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
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ResourceId = "resourceId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ResourceCode = "resourceCode";

        /** Attribute */
        static final String ResourceName = "resourceName";
    } // end DataProperty

    /**
     * Check Unique MeetingResource
     *
     * @param aMeetingResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MeetingResource aMeetingResource)
        throws Exception;

    /**
     * insert MeetingResource
     *
     * @param aMeetingResource
     *
     * @throws Exception
     *
     * @model
     */
    void insertMeetingResource(MeetingResource aMeetingResource)
        throws Exception;

    /**
     * Batch Insert MeetingResource
     *
     * @param aMeetingResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMeetingResource(MeetingResource[] aMeetingResource)
        throws Exception;

    /**
     * Delete MeetingResource
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeetingResource(final long aId) throws Exception;

    /**
     * Delete MeetingResource By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMeetingResource(MeetingResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MeetingResource
     *
     * @param aMeetingResource
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeetingResource(MeetingResource aMeetingResource)
        throws Exception;

    /**
     * Batch Modify MeetingResource
     *
     * @param aMeetingResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMeetingResource(MeetingResource[] aMeetingResource)
        throws Exception;

    /**
     * Modify MeetingResource  By Query Conditions
     *
     * @param aMeetingResource Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMeetingResource(MeetingResource aMeetingResource,
        MeetingResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MeetingResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MeetingResource findMeetingResourceById(final long aId)
        throws Exception;

    /**
     * Query MeetingResource
     *
     * @param aQueryBean
     *
     * @return IMeetingResource[]
     *
     * @throws Exception
     *
     * @model type="IMeetingResource" containment="true"
     */
    MeetingResource[] queryMeetingResource(
        MeetingResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MeetingResource
     *
     * @param aBaseQueryBean
     *
     * @return IMeetingResource[]
     *
     * @throws Exception
     *
     * @model type="IMeetingResource" containment="true"
     */

    //Map queryMeetingResourceForMap(MeetingResourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MeetingResource
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMeetingResourceCount(MeetingResourceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MeetingResource Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMeetingResourceSelective(
        MeetingResourceDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize MeetingResource
     *
     * @param aMeetingResources
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeetingResource(MeetingResource[] aMeetingResources,
        MeetingResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MeetingResource
     *
     * @param aMeetingResources
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMeetingResource(MeetingResource[] aMeetingResources,
        MeetingResourceDAOQueryBean aQueryBean,
        MeetingResourceSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MeetingResourceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMeetingResourceArray DOCUMENT ME!
         * @param willUpdateMeetingResourceArray DOCUMENT ME!
         * @param willDeleteMeetingResourceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MeetingResource[] willAddMeetingResourceArray,
            MeetingResource[] willUpdateMeetingResourceArray,
            MeetingResource[] willDeleteMeetingResourceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MeetingResource[] aMeetingResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MeetingResource[] aMeetingResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MeetingResource[] aMeetingResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MeetingResource[] aMeetingResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MeetingResource[] aMeetingResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMeetingResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MeetingResource[] aMeetingResources)
            throws Exception;
    } // end MeetingResourceSynchronizeCallback
} // end IBaseMeetingResourceDAO
