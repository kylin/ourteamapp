/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ITeamCalendarDefine Data Access Object
*  GenDate 2011-09-22 10:18:09  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseTeamCalendarDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "CALENDAR_DEFINE";

    /** Attribute */
    static final String Id = "CALENDAR_DEFINE.ID";

    /** Attribute */
    static final String CalendarName = "CALENDAR_DEFINE.CALENDAR_NAME";

    /** Attribute */
    static final String CalendarType = "CALENDAR_DEFINE.CALENDAR_TYPE";

    /** Attribute */
    static final String OwnerId = "CALENDAR_DEFINE.OWNER_ID";

    /** Attribute */
    static final String Remarks = "CALENDAR_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "CALENDAR_DEFINE.STATUS";

    /** Attribute */
    static final String TeamName = "teamDefineA.TEAM_NAME";

    /** Attribute */
    static final String TeamRemarks = "teamDefineA.REMARKS";

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
        static final String CalendarName = "calendarName";

        /** Attribute */
        static final String CalendarType = "calendarType";

        /** Attribute */
        static final String OwnerId = "ownerId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TeamName = "teamName";

        /** Attribute */
        static final String TeamRemarks = "teamRemarks";
    } // end DataProperty

    /**
     * Check Unique TeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(TeamCalendarDefine aTeamCalendarDefine)
        throws Exception;

    /**
     * insert TeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertTeamCalendarDefine(TeamCalendarDefine aTeamCalendarDefine)
        throws Exception;

    /**
     * Batch Insert TeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertTeamCalendarDefine(TeamCalendarDefine[] aTeamCalendarDefine)
        throws Exception;

    /**
     * Delete TeamCalendarDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamCalendarDefine(final long aId) throws Exception;

    /**
     * Delete TeamCalendarDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamCalendarDefine(TeamCalendarDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify TeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamCalendarDefine(TeamCalendarDefine aTeamCalendarDefine)
        throws Exception;

    /**
     * Batch Modify TeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateTeamCalendarDefine(TeamCalendarDefine[] aTeamCalendarDefine)
        throws Exception;

    /**
     * Modify TeamCalendarDefine  By Query Conditions
     *
     * @param aTeamCalendarDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamCalendarDefine(TeamCalendarDefine aTeamCalendarDefine,
        TeamCalendarDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query TeamCalendarDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    TeamCalendarDefine findTeamCalendarDefineById(final long aId)
        throws Exception;

    /**
     * Query TeamCalendarDefine
     *
     * @param aQueryBean
     *
     * @return ITeamCalendarDefine[]
     *
     * @throws Exception
     *
     * @model type="ITeamCalendarDefine" containment="true"
     */
    TeamCalendarDefine[] queryTeamCalendarDefine(
        TeamCalendarDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query TeamCalendarDefine
     *
     * @param aBaseQueryBean
     *
     * @return ITeamCalendarDefine[]
     *
     * @throws Exception
     *
     * @model type="ITeamCalendarDefine" containment="true"
     */

    //Map queryTeamCalendarDefineForMap(TeamCalendarDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count TeamCalendarDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryTeamCalendarDefineCount(
        TeamCalendarDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query TeamCalendarDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryTeamCalendarDefineSelective(
        TeamCalendarDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize TeamCalendarDefine
     *
     * @param aTeamCalendarDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamCalendarDefine(
        TeamCalendarDefine[] aTeamCalendarDefines,
        TeamCalendarDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize TeamCalendarDefine
     *
     * @param aTeamCalendarDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamCalendarDefine(
        TeamCalendarDefine[] aTeamCalendarDefines,
        TeamCalendarDefineDAOQueryBean aQueryBean,
        TeamCalendarDefineSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface TeamCalendarDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddTeamCalendarDefineArray DOCUMENT ME!
         * @param willUpdateTeamCalendarDefineArray DOCUMENT ME!
         * @param willDeleteTeamCalendarDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            TeamCalendarDefine[] willAddTeamCalendarDefineArray,
            TeamCalendarDefine[] willUpdateTeamCalendarDefineArray,
            TeamCalendarDefine[] willDeleteTeamCalendarDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(TeamCalendarDefine[] aTeamCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(TeamCalendarDefine[] aTeamCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(TeamCalendarDefine[] aTeamCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(TeamCalendarDefine[] aTeamCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(TeamCalendarDefine[] aTeamCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(TeamCalendarDefine[] aTeamCalendarDefines)
            throws Exception;
    } // end TeamCalendarDefineSynchronizeCallback
} // end IBaseTeamCalendarDefineDAO
