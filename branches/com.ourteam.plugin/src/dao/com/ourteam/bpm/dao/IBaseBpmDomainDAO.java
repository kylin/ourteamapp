/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmDomain Data Access Object
*  GenDate 2011-11-01 13:19:49  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmDomainDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_DOMAIN";

    /** Attribute */
    static final String Id = "BPM_DOMAIN.ID";

    /** Attribute */
    static final String Code = "BPM_DOMAIN.CODE";

    /** Attribute */
    static final String Name = "BPM_DOMAIN.NAME";

    /** Attribute */
    static final String Remarks = "BPM_DOMAIN.REMARKS";

    /** Attribute */
    static final String Status = "BPM_DOMAIN.STATUS";

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
        static final String Code = "code";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique BpmDomain
     *
     * @param aBpmDomain
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmDomain aBpmDomain) throws Exception;

    /**
     * insert BpmDomain
     *
     * @param aBpmDomain
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmDomain(BpmDomain aBpmDomain) throws Exception;

    /**
     * Batch Insert BpmDomain
     *
     * @param aBpmDomain
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmDomain(BpmDomain[] aBpmDomain) throws Exception;

    /**
     * Delete BpmDomain
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmDomain(final long aId) throws Exception;

    /**
     * Delete BpmDomain By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmDomain(BpmDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmDomain
     *
     * @param aBpmDomain
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmDomain(BpmDomain aBpmDomain) throws Exception;

    /**
     * Batch Modify BpmDomain
     *
     * @param aBpmDomain
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmDomain(BpmDomain[] aBpmDomain) throws Exception;

    /**
     * Modify BpmDomain  By Query Conditions
     *
     * @param aBpmDomain Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmDomain(BpmDomain aBpmDomain, BpmDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmDomain
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmDomain findBpmDomainById(final long aId) throws Exception;

    /**
     * Query BpmDomain
     *
     * @param aQueryBean
     *
     * @return IBpmDomain[]
     *
     * @throws Exception
     *
     * @model type="IBpmDomain" containment="true"
     */
    BpmDomain[] queryBpmDomain(BpmDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmDomain
     *
     * @param aBaseQueryBean
     *
     * @return IBpmDomain[]
     *
     * @throws Exception
     *
     * @model type="IBpmDomain" containment="true"
     */

    //Map queryBpmDomainForMap(BpmDomainDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmDomain
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmDomainCount(BpmDomainDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmDomain Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmDomainSelective(BpmDomainDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmDomain
     *
     * @param aBpmDomains
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmDomain(BpmDomain[] aBpmDomains,
        BpmDomainDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmDomain
     *
     * @param aBpmDomains
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmDomain(BpmDomain[] aBpmDomains,
        BpmDomainDAOQueryBean aQueryBean, BpmDomainSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmDomainSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmDomainArray DOCUMENT ME!
         * @param willUpdateBpmDomainArray DOCUMENT ME!
         * @param willDeleteBpmDomainArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(BpmDomain[] willAddBpmDomainArray,
            BpmDomain[] willUpdateBpmDomainArray,
            BpmDomain[] willDeleteBpmDomainArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmDomain[] aBpmDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmDomain[] aBpmDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmDomain[] aBpmDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmDomain[] aBpmDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmDomain[] aBpmDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmDomain[] aBpmDomains) throws Exception;
    } // end BpmDomainSynchronizeCallback
} // end IBaseBpmDomainDAO
