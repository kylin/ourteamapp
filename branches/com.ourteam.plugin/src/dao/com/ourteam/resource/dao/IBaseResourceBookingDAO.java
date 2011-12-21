/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IResourceBooking Data Access Object
*  GenDate 2011-09-22 10:18:25  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseResourceBookingDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "RESOURCE_BOOKING";

    /** Attribute */
    static final String Id = "RESOURCE_BOOKING.ID";

    /** Attribute */
    static final String EndTime = "RESOURCE_BOOKING.END_TIME";

    /** Attribute */
    static final String Remarks = "RESOURCE_BOOKING.REMARKS";

    /** Attribute */
    static final String ResourceInstanceId = "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID";

    /** Attribute */
    static final String ResourceTypeId = "RESOURCE_BOOKING.RESOURCE_TYPE_ID";

    /** Attribute */
    static final String StartTime = "RESOURCE_BOOKING.START_TIME";

    /** Attribute */
    static final String Status = "RESOURCE_BOOKING.STATUS";

    /** Attribute */
    static final String ResourceInstanceCode = "ResourceInstanceE.CODE";

    /** Attribute */
    static final String ResourceInstanceName = "ResourceInstanceE.NAME";

    /** Attribute */
    static final String ResourceInstanceStatus = "ResourceInstanceE.STATUS";

    /** Attribute */
    static final String ResourceTypeCode = "ResourceTypeE.CODE";

    /** Attribute */
    static final String ResourceTypeName = "ResourceTypeE.NAME";

    /** Attribute */
    static final String UserId = "RESOURCE_BOOKING.USER_ID";

    /** Attribute */
    static final String UserName = "sysUserE.USER_NAME";

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
        static final String EndTime = "endTime";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ResourceInstanceId = "resourceInstanceId";

        /** Attribute */
        static final String ResourceTypeId = "resourceTypeId";

        /** Attribute */
        static final String StartTime = "startTime";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ResourceInstanceCode = "resourceInstanceCode";

        /** Attribute */
        static final String ResourceInstanceName = "resourceInstanceName";

        /** Attribute */
        static final String ResourceInstanceStatus = "resourceInstanceStatus";

        /** Attribute */
        static final String ResourceTypeCode = "resourceTypeCode";

        /** Attribute */
        static final String ResourceTypeName = "resourceTypeName";

        /** Attribute */
        static final String UserId = "userId";

        /** Attribute */
        static final String UserName = "userName";
    } // end DataProperty

    /**
     * Check Unique ResourceBooking
     *
     * @param aResourceBooking
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ResourceBooking aResourceBooking)
        throws Exception;

    /**
     * insert ResourceBooking
     *
     * @param aResourceBooking
     *
     * @throws Exception
     *
     * @model
     */
    void insertResourceBooking(ResourceBooking aResourceBooking)
        throws Exception;

    /**
     * Batch Insert ResourceBooking
     *
     * @param aResourceBooking
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertResourceBooking(ResourceBooking[] aResourceBooking)
        throws Exception;

    /**
     * Delete ResourceBooking
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceBooking(final long aId) throws Exception;

    /**
     * Delete ResourceBooking By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceBooking(ResourceBookingDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ResourceBooking
     *
     * @param aResourceBooking
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceBooking(ResourceBooking aResourceBooking)
        throws Exception;

    /**
     * Batch Modify ResourceBooking
     *
     * @param aResourceBooking
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateResourceBooking(ResourceBooking[] aResourceBooking)
        throws Exception;

    /**
     * Modify ResourceBooking  By Query Conditions
     *
     * @param aResourceBooking Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceBooking(ResourceBooking aResourceBooking,
        ResourceBookingDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ResourceBooking
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ResourceBooking findResourceBookingById(final long aId)
        throws Exception;

    /**
     * Query ResourceBooking
     *
     * @param aQueryBean
     *
     * @return IResourceBooking[]
     *
     * @throws Exception
     *
     * @model type="IResourceBooking" containment="true"
     */
    ResourceBooking[] queryResourceBooking(
        ResourceBookingDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ResourceBooking
     *
     * @param aBaseQueryBean
     *
     * @return IResourceBooking[]
     *
     * @throws Exception
     *
     * @model type="IResourceBooking" containment="true"
     */

    //Map queryResourceBookingForMap(ResourceBookingDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ResourceBooking
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryResourceBookingCount(ResourceBookingDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ResourceBooking Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryResourceBookingSelective(
        ResourceBookingDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ResourceBooking
     *
     * @param aResourceBookings
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceBooking(ResourceBooking[] aResourceBookings,
        ResourceBookingDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ResourceBooking
     *
     * @param aResourceBookings
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceBooking(ResourceBooking[] aResourceBookings,
        ResourceBookingDAOQueryBean aQueryBean,
        ResourceBookingSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ResourceBookingSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddResourceBookingArray DOCUMENT ME!
         * @param willUpdateResourceBookingArray DOCUMENT ME!
         * @param willDeleteResourceBookingArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ResourceBooking[] willAddResourceBookingArray,
            ResourceBooking[] willUpdateResourceBookingArray,
            ResourceBooking[] willDeleteResourceBookingArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceBookings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ResourceBooking[] aResourceBookings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceBookings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ResourceBooking[] aResourceBookings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceBookings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ResourceBooking[] aResourceBookings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceBookings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ResourceBooking[] aResourceBookings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceBookings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ResourceBooking[] aResourceBookings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceBookings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ResourceBooking[] aResourceBookings)
            throws Exception;
    } // end ResourceBookingSynchronizeCallback
} // end IBaseResourceBookingDAO
