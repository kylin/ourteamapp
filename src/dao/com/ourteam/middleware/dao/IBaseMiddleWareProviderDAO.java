/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWareProvider Data Access Object
*  GenDate 2011-12-06 11:42:55  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareProviderDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE_PROVIDER";

    /** Attribute */
    static final String Id = "MIDDLE_WARE_PROVIDER.ID";

    /** Attribute */
    static final String DriverType = "MIDDLE_WARE_PROVIDER.DRIVER_TYPE";

    /** Attribute */
    static final String MiddleWareName = "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_NAME";

    /** Attribute */
    static final String MiddleWareType = "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_TYPE";

    /** Attribute */
    static final String MiddleWareVersion = "MIDDLE_WARE_PROVIDER.MIDDLE_WARE_VERSION";

    /** Attribute */
    static final String ProviderName = "MIDDLE_WARE_PROVIDER.PROVIDER_NAME";

    /** Attribute */
    static final String Remarks = "MIDDLE_WARE_PROVIDER.REMARKS";

    /** Attribute */
    static final String Status = "MIDDLE_WARE_PROVIDER.STATUS";

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
        static final String DriverType = "driverType";

        /** Attribute */
        static final String MiddleWareName = "middleWareName";

        /** Attribute */
        static final String MiddleWareType = "middleWareType";

        /** Attribute */
        static final String MiddleWareVersion = "middleWareVersion";

        /** Attribute */
        static final String ProviderName = "providerName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique MiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWareProvider aMiddleWareProvider)
        throws Exception;

    /**
     * insert MiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWareProvider(MiddleWareProvider aMiddleWareProvider)
        throws Exception;

    /**
     * Batch Insert MiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWareProvider(MiddleWareProvider[] aMiddleWareProvider)
        throws Exception;

    /**
     * Delete MiddleWareProvider
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareProvider(final long aId) throws Exception;

    /**
     * Delete MiddleWareProvider By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareProvider(MiddleWareProviderDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareProvider(MiddleWareProvider aMiddleWareProvider)
        throws Exception;

    /**
     * Batch Modify MiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWareProvider(MiddleWareProvider[] aMiddleWareProvider)
        throws Exception;

    /**
     * Modify MiddleWareProvider  By Query Conditions
     *
     * @param aMiddleWareProvider Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareProvider(MiddleWareProvider aMiddleWareProvider,
        MiddleWareProviderDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareProvider
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWareProvider findMiddleWareProviderById(final long aId)
        throws Exception;

    /**
     * Query MiddleWareProvider
     *
     * @param aQueryBean
     *
     * @return IMiddleWareProvider[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareProvider" containment="true"
     */
    MiddleWareProvider[] queryMiddleWareProvider(
        MiddleWareProviderDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareProvider
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWareProvider[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareProvider" containment="true"
     */

    //Map queryMiddleWareProviderForMap(MiddleWareProviderDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWareProvider
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareProviderCount(
        MiddleWareProviderDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MiddleWareProvider Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareProviderSelective(
        MiddleWareProviderDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWareProvider
     *
     * @param aMiddleWareProviders
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareProvider(
        MiddleWareProvider[] aMiddleWareProviders,
        MiddleWareProviderDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MiddleWareProvider
     *
     * @param aMiddleWareProviders
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareProvider(
        MiddleWareProvider[] aMiddleWareProviders,
        MiddleWareProviderDAOQueryBean aQueryBean,
        MiddleWareProviderSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareProviderSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareProviderArray DOCUMENT ME!
         * @param willUpdateMiddleWareProviderArray DOCUMENT ME!
         * @param willDeleteMiddleWareProviderArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MiddleWareProvider[] willAddMiddleWareProviderArray,
            MiddleWareProvider[] willUpdateMiddleWareProviderArray,
            MiddleWareProvider[] willDeleteMiddleWareProviderArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareProviders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MiddleWareProvider[] aMiddleWareProviders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareProviders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MiddleWareProvider[] aMiddleWareProviders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareProviders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MiddleWareProvider[] aMiddleWareProviders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareProviders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MiddleWareProvider[] aMiddleWareProviders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareProviders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MiddleWareProvider[] aMiddleWareProviders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareProviders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MiddleWareProvider[] aMiddleWareProviders)
            throws Exception;
    } // end MiddleWareProviderSynchronizeCallback
} // end IBaseMiddleWareProviderDAO
