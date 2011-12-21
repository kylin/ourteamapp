/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ICalendarDate Data Access Object
*  GenDate 2011-09-22 10:18:06  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseCalendarDateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "CALENDAR_DATE";

    /** Attribute */
    static final String Id = "CALENDAR_DATE.ID";

    /** Attribute */
    static final String CalendarItemId = "CALENDAR_DATE.CALENDAR_ITEM_ID";

    /** Attribute */
    static final String ItemDate = "CALENDAR_DATE.ITEM_DATE";

    /** Attribute */
    static final String Status = "CALENDAR_DATE.STATUS";

    /** Attribute */
    static final String CalendarId = "CALENDAR_DATE.CALENDAR_ID";

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
        static final String CalendarItemId = "calendarItemId";

        /** Attribute */
        static final String ItemDate = "itemDate";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String CalendarId = "calendarId";
    } // end DataProperty

    /**
     * Check Unique CalendarDate
     *
     * @param aCalendarDate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(CalendarDate aCalendarDate) throws Exception;

    /**
     * insert CalendarDate
     *
     * @param aCalendarDate
     *
     * @throws Exception
     *
     * @model
     */
    void insertCalendarDate(CalendarDate aCalendarDate)
        throws Exception;

    /**
     * Batch Insert CalendarDate
     *
     * @param aCalendarDate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertCalendarDate(CalendarDate[] aCalendarDate)
        throws Exception;

    /**
     * Delete CalendarDate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarDate(final long aId) throws Exception;

    /**
     * Delete CalendarDate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarDate(CalendarDateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify CalendarDate
     *
     * @param aCalendarDate
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarDate(CalendarDate aCalendarDate)
        throws Exception;

    /**
     * Batch Modify CalendarDate
     *
     * @param aCalendarDate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateCalendarDate(CalendarDate[] aCalendarDate)
        throws Exception;

    /**
     * Modify CalendarDate  By Query Conditions
     *
     * @param aCalendarDate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarDate(CalendarDate aCalendarDate,
        CalendarDateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query CalendarDate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    CalendarDate findCalendarDateById(final long aId) throws Exception;

    /**
     * Query CalendarDate
     *
     * @param aQueryBean
     *
     * @return ICalendarDate[]
     *
     * @throws Exception
     *
     * @model type="ICalendarDate" containment="true"
     */
    CalendarDate[] queryCalendarDate(CalendarDateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query CalendarDate
     *
     * @param aBaseQueryBean
     *
     * @return ICalendarDate[]
     *
     * @throws Exception
     *
     * @model type="ICalendarDate" containment="true"
     */

    //Map queryCalendarDateForMap(CalendarDateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count CalendarDate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryCalendarDateCount(CalendarDateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query CalendarDate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryCalendarDateSelective(CalendarDateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize CalendarDate
     *
     * @param aCalendarDates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarDate(CalendarDate[] aCalendarDates,
        CalendarDateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize CalendarDate
     *
     * @param aCalendarDates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarDate(CalendarDate[] aCalendarDates,
        CalendarDateDAOQueryBean aQueryBean,
        CalendarDateSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface CalendarDateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddCalendarDateArray DOCUMENT ME!
         * @param willUpdateCalendarDateArray DOCUMENT ME!
         * @param willDeleteCalendarDateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(CalendarDate[] willAddCalendarDateArray,
            CalendarDate[] willUpdateCalendarDateArray,
            CalendarDate[] willDeleteCalendarDateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(CalendarDate[] aCalendarDates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(CalendarDate[] aCalendarDates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(CalendarDate[] aCalendarDates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(CalendarDate[] aCalendarDates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(CalendarDate[] aCalendarDates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarDates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(CalendarDate[] aCalendarDates)
            throws Exception;
    } // end CalendarDateSynchronizeCallback

    /**
     * Query Related ICalendarItem
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarItem" containment="true"
     */
    com.ourteam.calendar.dao.CalendarItem[] queryCalendarItems(
        CalendarDateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ICalendarItem to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarItem" containment="true"
     */

    //Map queryCalendarItemsForMap(CalendarDateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ICalendarItem Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryCalendarItemsSelective(CalendarDateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ICalendarItem
     *
     * @param aCalendarItem {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarItem(
        com.ourteam.calendar.dao.CalendarItem aCalendarItem,
        CalendarDateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ICalendarItem
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarItem(CalendarDateDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseCalendarDateDAO
