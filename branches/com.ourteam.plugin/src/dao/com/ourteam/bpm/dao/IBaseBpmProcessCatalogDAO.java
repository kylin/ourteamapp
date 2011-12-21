/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmProcessCatalog Data Access Object
*  GenDate 2011-11-03 11:41:14  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmProcessCatalogDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_PROCESS_CATALOG";

    /** Attribute */
    static final String Id = "BPM_PROCESS_CATALOG.ID";

    /** Attribute */
    static final String Name = "BPM_PROCESS_CATALOG.NAME";

    /** Attribute */
    static final String ParentId = "BPM_PROCESS_CATALOG.PARENT_ID";

    /** Attribute */
    static final String Remarks = "BPM_PROCESS_CATALOG.REMARKS";

    /** Attribute */
    static final String Status = "BPM_PROCESS_CATALOG.STATUS";

    /** Attribute */
    static final String OrderIndex = "BPM_PROCESS_CATALOG.ORDER_INDEX";

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
        static final String Name = "name";

        /** Attribute */
        static final String ParentId = "parentId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String OrderIndex = "orderIndex";
    } // end DataProperty

    /**
     * Check Unique BpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmProcessCatalog aBpmProcessCatalog)
        throws Exception;

    /**
     * insert BpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmProcessCatalog(BpmProcessCatalog aBpmProcessCatalog)
        throws Exception;

    /**
     * Batch Insert BpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmProcessCatalog(BpmProcessCatalog[] aBpmProcessCatalog)
        throws Exception;

    /**
     * Delete BpmProcessCatalog
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessCatalog(final long aId) throws Exception;

    /**
     * Delete BpmProcessCatalog By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessCatalog(BpmProcessCatalogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessCatalog(BpmProcessCatalog aBpmProcessCatalog)
        throws Exception;

    /**
     * Batch Modify BpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmProcessCatalog(BpmProcessCatalog[] aBpmProcessCatalog)
        throws Exception;

    /**
     * Modify BpmProcessCatalog  By Query Conditions
     *
     * @param aBpmProcessCatalog Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessCatalog(BpmProcessCatalog aBpmProcessCatalog,
        BpmProcessCatalogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessCatalog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmProcessCatalog findBpmProcessCatalogById(final long aId)
        throws Exception;

    /**
     * Query BpmProcessCatalog
     *
     * @param aQueryBean
     *
     * @return IBpmProcessCatalog[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessCatalog" containment="true"
     */
    BpmProcessCatalog[] queryBpmProcessCatalog(
        BpmProcessCatalogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessCatalog
     *
     * @param aBaseQueryBean
     *
     * @return IBpmProcessCatalog[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessCatalog" containment="true"
     */

    //Map queryBpmProcessCatalogForMap(BpmProcessCatalogDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmProcessCatalog
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmProcessCatalogCount(
        BpmProcessCatalogDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Query BpmProcessCatalog Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmProcessCatalogSelective(
        BpmProcessCatalogDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BpmProcessCatalog
     *
     * @param aBpmProcessCatalogs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessCatalog(BpmProcessCatalog[] aBpmProcessCatalogs,
        BpmProcessCatalogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmProcessCatalog
     *
     * @param aBpmProcessCatalogs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessCatalog(BpmProcessCatalog[] aBpmProcessCatalogs,
        BpmProcessCatalogDAOQueryBean aQueryBean,
        BpmProcessCatalogSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmProcessCatalogSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmProcessCatalogArray DOCUMENT ME!
         * @param willUpdateBpmProcessCatalogArray DOCUMENT ME!
         * @param willDeleteBpmProcessCatalogArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmProcessCatalog[] willAddBpmProcessCatalogArray,
            BpmProcessCatalog[] willUpdateBpmProcessCatalogArray,
            BpmProcessCatalog[] willDeleteBpmProcessCatalogArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmProcessCatalog[] aBpmProcessCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmProcessCatalog[] aBpmProcessCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmProcessCatalog[] aBpmProcessCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmProcessCatalog[] aBpmProcessCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmProcessCatalog[] aBpmProcessCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmProcessCatalog[] aBpmProcessCatalogs)
            throws Exception;
    } // end BpmProcessCatalogSynchronizeCallback
} // end IBaseBpmProcessCatalogDAO
