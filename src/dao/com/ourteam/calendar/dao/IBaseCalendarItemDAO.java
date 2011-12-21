/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ICalendarItem Data Access Object
*  GenDate 2011-09-22 10:18:07  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseCalendarItemDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "CALENDAR_ITEM";

    /** Attribute */
    static final String Id = "CALENDAR_ITEM.ID";

    /** Attribute */
    static final String AlermConfig = "CALENDAR_ITEM.ALERM_CONFIG";

    /** Attribute */
    static final String CalendarId = "CALENDAR_ITEM.CALENDAR_ID";

    /** Attribute */
    static final String EndDateTime = "CALENDAR_ITEM.END_DATE_TIME";

    /** Attribute */
    static final String FullDateItem = "CALENDAR_ITEM.FULL_DATE_ITEM";

    /** Attribute */
    static final String ItemAttchment = "CALENDAR_ITEM.ITEM_ATTCHMENT";

    /** Attribute */
    static final String ItemContent = "CALENDAR_ITEM.ITEM_CONTENT";

    /** Attribute */
    static final String ItemLocaltion = "CALENDAR_ITEM.ITEM_LOCALTION";

    /** Attribute */
    static final String ItemTitle = "CALENDAR_ITEM.ITEM_TITLE";

    /** Attribute */
    static final String ProtectedType = "CALENDAR_ITEM.PROTECTED_TYPE";

    /** Attribute */
    static final String Remarks = "CALENDAR_ITEM.REMARKS";

    /** Attribute */
    static final String RepeateConfig = "CALENDAR_ITEM.REPEATE_CONFIG";

    /** Attribute */
    static final String StartDateTime = "CALENDAR_ITEM.START_DATE_TIME";

    /** Attribute */
    static final String Status = "CALENDAR_ITEM.STATUS";

    /** Attribute */
    static final String CalendarName = "calendarDefineB.CALENDAR_NAME";

    /** Attribute */
    static final String CalendarType = "calendarDefineB.CALENDAR_TYPE";

    /** Attribute */
    static final String CalendarStyle = "calendarDefineB.CALENDAR_STYLE";

    /** Attribute */
    static final String OwnerId = "calendarDefineB.OWNER_ID";

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
        static final String AlermConfig = "alermConfig";

        /** Attribute */
        static final String CalendarId = "calendarId";

        /** Attribute */
        static final String EndDateTime = "endDateTime";

        /** Attribute */
        static final String FullDateItem = "fullDateItem";

        /** Attribute */
        static final String ItemAttchment = "itemAttchment";

        /** Attribute */
        static final String ItemContent = "itemContent";

        /** Attribute */
        static final String ItemLocaltion = "itemLocaltion";

        /** Attribute */
        static final String ItemTitle = "itemTitle";

        /** Attribute */
        static final String ProtectedType = "protectedType";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String RepeateConfig = "repeateConfig";

        /** Attribute */
        static final String StartDateTime = "startDateTime";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String CalendarName = "calendarName";

        /** Attribute */
        static final String CalendarType = "calendarType";

        /** Attribute */
        static final String CalendarStyle = "calendarStyle";

        /** Attribute */
        static final String OwnerId = "ownerId";
    } // end DataProperty

    /**
     * Check Unique CalendarItem
     *
     * @param aCalendarItem
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(CalendarItem aCalendarItem) throws Exception;

    /**
     * insert CalendarItem
     *
     * @param aCalendarItem
     *
     * @throws Exception
     *
     * @model
     */
    void insertCalendarItem(CalendarItem aCalendarItem)
        throws Exception;

    /**
     * Batch Insert CalendarItem
     *
     * @param aCalendarItem
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertCalendarItem(CalendarItem[] aCalendarItem)
        throws Exception;

    /**
     * Delete CalendarItem
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarItem(final long aId) throws Exception;

    /**
     * Delete CalendarItem By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarItem(CalendarItemDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify CalendarItem
     *
     * @param aCalendarItem
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarItem(CalendarItem aCalendarItem)
        throws Exception;

    /**
     * Batch Modify CalendarItem
     *
     * @param aCalendarItem
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateCalendarItem(CalendarItem[] aCalendarItem)
        throws Exception;

    /**
     * Modify CalendarItem  By Query Conditions
     *
     * @param aCalendarItem Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarItem(CalendarItem aCalendarItem,
        CalendarItemDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query CalendarItem
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    CalendarItem findCalendarItemById(final long aId) throws Exception;

    /**
     * Query CalendarItem
     *
     * @param aQueryBean
     *
     * @return ICalendarItem[]
     *
     * @throws Exception
     *
     * @model type="ICalendarItem" containment="true"
     */
    CalendarItem[] queryCalendarItem(CalendarItemDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query CalendarItem
     *
     * @param aBaseQueryBean
     *
     * @return ICalendarItem[]
     *
     * @throws Exception
     *
     * @model type="ICalendarItem" containment="true"
     */

    //Map queryCalendarItemForMap(CalendarItemDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count CalendarItem
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryCalendarItemCount(CalendarItemDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query CalendarItem Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryCalendarItemSelective(CalendarItemDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize CalendarItem
     *
     * @param aCalendarItems
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarItem(CalendarItem[] aCalendarItems,
        CalendarItemDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize CalendarItem
     *
     * @param aCalendarItems
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeCalendarItem(CalendarItem[] aCalendarItems,
        CalendarItemDAOQueryBean aQueryBean,
        CalendarItemSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface CalendarItemSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddCalendarItemArray DOCUMENT ME!
         * @param willUpdateCalendarItemArray DOCUMENT ME!
         * @param willDeleteCalendarItemArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(CalendarItem[] willAddCalendarItemArray,
            CalendarItem[] willUpdateCalendarItemArray,
            CalendarItem[] willDeleteCalendarItemArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItems DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(CalendarItem[] aCalendarItems)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItems DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(CalendarItem[] aCalendarItems)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItems DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(CalendarItem[] aCalendarItems)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItems DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(CalendarItem[] aCalendarItems)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItems DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(CalendarItem[] aCalendarItems)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aCalendarItems DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(CalendarItem[] aCalendarItems)
            throws Exception;
    } // end CalendarItemSynchronizeCallback

    /**
     * Query Related ICalendarDate
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarDate" containment="true"
     */
    com.ourteam.calendar.dao.CalendarDate[] queryCalendarDates(
        CalendarItemDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ICalendarDate to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarDate" containment="true"
     */

    //Map queryCalendarDatesForMap(CalendarItemDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ICalendarDate Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryCalendarDatesSelective(CalendarItemDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ICalendarDate
     *
     * @param aCalendarDate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarDate(
        com.ourteam.calendar.dao.CalendarDate aCalendarDate,
        CalendarItemDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ICalendarDate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarDate(CalendarItemDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Related ICalendarItemAssign
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarItemAssign" containment="true"
     */
    com.ourteam.calendar.dao.CalendarItemAssign[] queryCalendarItemAssigns(
        CalendarItemDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ICalendarItemAssign to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarItemAssign" containment="true"
     */

    //Map queryCalendarItemAssignsForMap(CalendarItemDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ICalendarItemAssign Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryCalendarItemAssignsSelective(CalendarItemDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ICalendarItemAssign
     *
     * @param aCalendarItemAssign {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateCalendarItemAssign(
        com.ourteam.calendar.dao.CalendarItemAssign aCalendarItemAssign,
        CalendarItemDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ICalendarItemAssign
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteCalendarItemAssign(CalendarItemDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseCalendarItemDAO
