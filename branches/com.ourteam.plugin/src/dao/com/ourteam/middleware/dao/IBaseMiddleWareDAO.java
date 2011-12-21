/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWare Data Access Object
*  GenDate 2011-12-06 16:03:01  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE";

    /** Attribute */
    static final String Id = "MIDDLE_WARE.ID";

    /** Attribute */
    static final String DriveType = "MIDDLE_WARE.DRIVE_TYPE";

    /** Attribute */
    static final String HostName = "MIDDLE_WARE.HOST_NAME";

    /** Attribute */
    static final String HostPort = "MIDDLE_WARE.HOST_PORT";

    /** Attribute */
    static final String Name = "MIDDLE_WARE.NAME";

    /** Attribute */
    static final String NeedSSL = "MIDDLE_WARE.NEED_SSL";

    /** Attribute */
    static final String Password = "MIDDLE_WARE.PASSWORD";

    /** Attribute */
    static final String ServiceName = "MIDDLE_WARE.SERVICE_NAME";

    /** Attribute */
    static final String ServiceStatus = "MIDDLE_WARE.SERVICE_STATUS";

    /** Attribute */
    static final String Status = "MIDDLE_WARE.STATUS";

    /** Attribute */
    static final String Type = "MIDDLE_WARE.TYPE";

    /** Attribute */
    static final String User = "MIDDLE_WARE.USER";

    /** Attribute */
    static final String Provider = "MIDDLE_WARE.PROVIDER";

    /** Attribute */
    static final String Desc = "MIDDLE_WARE.DESC";

    /** Attribute */
    static final String GroupId = "MIDDLE_WARE.GROUP_ID";

    /** Attribute */
    static final String ProviderId = "MIDDLE_WARE.PROVIDER_ID";

    /** Attribute */
    static final String ProviderName = "middleWareProviderA.PROVIDER_NAME";

    /** Attribute */
    static final String MiddleWareName = "middleWareProviderA.MIDDLE_WARE_NAME";

    /** Attribute */
    static final String MiddleWareVersion = "middleWareProviderA.MIDDLE_WARE_VERSION";

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
        static final String DriveType = "driveType";

        /** Attribute */
        static final String HostName = "hostName";

        /** Attribute */
        static final String HostPort = "hostPort";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String NeedSSL = "needSSL";

        /** Attribute */
        static final String Password = "password";

        /** Attribute */
        static final String ServiceName = "serviceName";

        /** Attribute */
        static final String ServiceStatus = "serviceStatus";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String Type = "type";

        /** Attribute */
        static final String User = "user";

        /** Attribute */
        static final String Provider = "provider";

        /** Attribute */
        static final String Desc = "desc";

        /** Attribute */
        static final String GroupId = "groupId";

        /** Attribute */
        static final String ProviderId = "providerId";

        /** Attribute */
        static final String ProviderName = "providerName";

        /** Attribute */
        static final String MiddleWareName = "middleWareName";

        /** Attribute */
        static final String MiddleWareVersion = "middleWareVersion";
    } // end DataProperty

    /**
     * Check Unique MiddleWare
     *
     * @param aMiddleWare
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWare aMiddleWare) throws Exception;

    /**
     * insert MiddleWare
     *
     * @param aMiddleWare
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWare(MiddleWare aMiddleWare) throws Exception;

    /**
     * Batch Insert MiddleWare
     *
     * @param aMiddleWare
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWare(MiddleWare[] aMiddleWare)
        throws Exception;

    /**
     * Delete MiddleWare
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWare(final long aId) throws Exception;

    /**
     * Delete MiddleWare By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWare(MiddleWareDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWare
     *
     * @param aMiddleWare
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWare(MiddleWare aMiddleWare) throws Exception;

    /**
     * Batch Modify MiddleWare
     *
     * @param aMiddleWare
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWare(MiddleWare[] aMiddleWare)
        throws Exception;

    /**
     * Modify MiddleWare  By Query Conditions
     *
     * @param aMiddleWare Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWare(MiddleWare aMiddleWare,
        MiddleWareDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWare
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWare findMiddleWareById(final long aId) throws Exception;

    /**
     * Query MiddleWare
     *
     * @param aQueryBean
     *
     * @return IMiddleWare[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWare" containment="true"
     */
    MiddleWare[] queryMiddleWare(MiddleWareDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MiddleWare
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWare[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWare" containment="true"
     */

    //Map queryMiddleWareForMap(MiddleWareDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWare
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareCount(MiddleWareDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MiddleWare Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareSelective(MiddleWareDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWare
     *
     * @param aMiddleWares
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWare(MiddleWare[] aMiddleWares,
        MiddleWareDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MiddleWare
     *
     * @param aMiddleWares
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWare(MiddleWare[] aMiddleWares,
        MiddleWareDAOQueryBean aQueryBean,
        MiddleWareSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareArray DOCUMENT ME!
         * @param willUpdateMiddleWareArray DOCUMENT ME!
         * @param willDeleteMiddleWareArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(MiddleWare[] willAddMiddleWareArray,
            MiddleWare[] willUpdateMiddleWareArray,
            MiddleWare[] willDeleteMiddleWareArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWares DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MiddleWare[] aMiddleWares) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWares DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MiddleWare[] aMiddleWares) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWares DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MiddleWare[] aMiddleWares) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWares DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MiddleWare[] aMiddleWares) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWares DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MiddleWare[] aMiddleWares) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWares DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MiddleWare[] aMiddleWares) throws Exception;
    } // end MiddleWareSynchronizeCallback
} // end IBaseMiddleWareDAO
