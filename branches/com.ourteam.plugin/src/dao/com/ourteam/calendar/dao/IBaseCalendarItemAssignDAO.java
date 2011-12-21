/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ICalendarItemAssign Data Access Object
*  GenDate 2011-09-22 10:18:08  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseCalendarItemAssignDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "CALENDAR_ITEM_ASSIGN";

    /** Attribute */
    static final String Id = "CALENDAR_ITEM_ASSIGN.ID";

    /** Attribute */
    static final String AssignPercent = "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT";

    /** Attribute */
    static final String CalendarItemId = "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID";

    /** Attribute */
    static final String Remarks = "CALENDAR_ITEM_ASSIGN.REMARKS";

    /** Attribute */
    static final String SysUserId = "CALENDAR_ITEM_ASSIGN.SYS_USER_ID";

    /** Attribute */
    static final String Status = "CALENDAR_ITEM_ASSIGN.STATUS";

    /** Attribute */
    static final String IsLeader = "CALENDAR_ITEM_ASSIGN.IS_LEADER";

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
        static final String AssignPercent = "assignPercent";

        /** Attribute */
        static final String CalendarItemId = "calendarItemId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SysUserId = "sysUserId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String IsLeader = "isLeader";
    } // end DataProperty

    /**
     * Check Unique CalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(CalendarItemAssign aCalendarItemAssign)
        throws Exception;

    /**
     * insert CalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     *
     * @model
     */
    void insertCalendarItemAssign(CalendarItemAssign aCalendarItemAssign)
        throws Exception;

    /**
     * Batch Insert CalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertCalendarItemAssign(CalendarItemAssign[] aCalendarItemAssign)
        throws Exception;

    /**
     * Delete CalendarItemAssign
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarItemAssign(final long aId) throws Exception;

    /**
     * Delete CalendarItemAssign By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarItemAssign(CalendarItemAssignDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify CalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarItemAssign(CalendarItemAssign aCalendarItemAssign)
        throws Exception;

    /**
     * Batch Modify CalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateCalendarItemAssign(CalendarItemAssign[] aCalendarItemAssign)
        throws Exception;

    /**
     * Modify CalendarItemAssign  By Query Conditions
     *
     * @param aCalendarItemAssign Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarItemAssign(CalendarItemAssign aCalendarItemAssign,
        CalendarItemAssignDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query CalendarItemAssign
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    CalendarItemAssign findCalendarItemAssignById(final long aId)
        throws Exception;

    /**
     * Query CalendarItemAssign
     *
     * @param aQueryBean
     *
     * @return ICalendarItemAssign[]
     *
     * @throws Exception
     *
     * @model type="ICalendarItemAssign" containment="true"
     */
    CalendarItemAssign[] queryCalendarItemAssign(
        CalendarItemAssignDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query CalendarItemAssign
     *
     * @param aBaseQueryBean
     *
     * @return ICalendarItemAssign[]
     *
     * @throws Exception
     *
     * @model type="ICalendarItemAssign" containment="true"
     */

    //Map queryCalendarItemAssignForMap(CalendarItemAssignDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count CalendarItemAssign
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryCalendarItemAssignCount(
        CalendarItemAssignDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query CalendarItemAssign Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryCalendarItemAssignSelective(
        CalendarItemAssignDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize CalendarItemAssign
     *
     * @param aCalendarItemAssigns
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarItemAssign(
        CalendarItemAssign[] aCalendarItemAssigns,
        CalendarItemAssignDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize CalendarItemAssign
     *
     * @param aCalendarItemAssigns
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarItemAssign(
        CalendarItemAssign[] aCalendarItemAssigns,
        CalendarItemAssignDAOQueryBean aQueryBean,
        CalendarItemAssignSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface CalendarItemAssignSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddCalendarItemAssignArray DOCUMENT ME!
         * @param willUpdateCalendarItemAssignArray DOCUMENT ME!
         * @param willDeleteCalendarItemAssignArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            CalendarItemAssign[] willAddCalendarItemAssignArray,
            CalendarItemAssign[] willUpdateCalendarItemAssignArray,
            CalendarItemAssign[] willDeleteCalendarItemAssignArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItemAssigns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(CalendarItemAssign[] aCalendarItemAssigns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItemAssigns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(CalendarItemAssign[] aCalendarItemAssigns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItemAssigns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(CalendarItemAssign[] aCalendarItemAssigns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItemAssigns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(CalendarItemAssign[] aCalendarItemAssigns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItemAssigns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(CalendarItemAssign[] aCalendarItemAssigns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItemAssigns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(CalendarItemAssign[] aCalendarItemAssigns)
            throws Exception;
    } // end CalendarItemAssignSynchronizeCallback
} // end IBaseCalendarItemAssignDAO
