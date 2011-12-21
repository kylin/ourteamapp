/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ICalendarDefine Data Access Object
*  GenDate 2011-09-22 10:18:06  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseCalendarDefineDAO extends IDataAccessObject {
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
    static final String CalendarStyle = "CALENDAR_DEFINE.CALENDAR_STYLE";

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
        static final String CalendarStyle = "calendarStyle";
    } // end DataProperty

    /**
     * Check Unique CalendarDefine
     *
     * @param aCalendarDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(CalendarDefine aCalendarDefine)
        throws Exception;

    /**
     * insert CalendarDefine
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertCalendarDefine(CalendarDefine aCalendarDefine)
        throws Exception;

    /**
     * Batch Insert CalendarDefine
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertCalendarDefine(CalendarDefine[] aCalendarDefine)
        throws Exception;

    /**
     * Delete CalendarDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarDefine(final long aId) throws Exception;

    /**
     * Delete CalendarDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarDefine(CalendarDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify CalendarDefine
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarDefine(CalendarDefine aCalendarDefine)
        throws Exception;

    /**
     * Batch Modify CalendarDefine
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateCalendarDefine(CalendarDefine[] aCalendarDefine)
        throws Exception;

    /**
     * Modify CalendarDefine  By Query Conditions
     *
     * @param aCalendarDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarDefine(CalendarDefine aCalendarDefine,
        CalendarDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query CalendarDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    CalendarDefine findCalendarDefineById(final long aId)
        throws Exception;

    /**
     * Query CalendarDefine
     *
     * @param aQueryBean
     *
     * @return ICalendarDefine[]
     *
     * @throws Exception
     *
     * @model type="ICalendarDefine" containment="true"
     */
    CalendarDefine[] queryCalendarDefine(CalendarDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query CalendarDefine
     *
     * @param aBaseQueryBean
     *
     * @return ICalendarDefine[]
     *
     * @throws Exception
     *
     * @model type="ICalendarDefine" containment="true"
     */

    //Map queryCalendarDefineForMap(CalendarDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count CalendarDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryCalendarDefineCount(CalendarDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query CalendarDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryCalendarDefineSelective(
        CalendarDefineDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize CalendarDefine
     *
     * @param aCalendarDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarDefine(CalendarDefine[] aCalendarDefines,
        CalendarDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize CalendarDefine
     *
     * @param aCalendarDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarDefine(CalendarDefine[] aCalendarDefines,
        CalendarDefineDAOQueryBean aQueryBean,
        CalendarDefineSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface CalendarDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddCalendarDefineArray DOCUMENT ME!
         * @param willUpdateCalendarDefineArray DOCUMENT ME!
         * @param willDeleteCalendarDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            CalendarDefine[] willAddCalendarDefineArray,
            CalendarDefine[] willUpdateCalendarDefineArray,
            CalendarDefine[] willDeleteCalendarDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(CalendarDefine[] aCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(CalendarDefine[] aCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(CalendarDefine[] aCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(CalendarDefine[] aCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(CalendarDefine[] aCalendarDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(CalendarDefine[] aCalendarDefines)
            throws Exception;
    } // end CalendarDefineSynchronizeCallback
} // end IBaseCalendarDefineDAO
