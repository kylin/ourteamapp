/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysDomain Data Access Object
*  GenDate 2011-11-29 09:07:49  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysDomainDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_DOMAIN";

    /** Attribute */
    static final String Id = "SYS_DOMAIN.ID";

    /** Attribute */
    static final String DomainCode = "SYS_DOMAIN.DOMAIN_CODE";

    /** Attribute */
    static final String DomainIcon = "SYS_DOMAIN.DOMAIN_ICON";

    /** Attribute */
    static final String DomainName = "SYS_DOMAIN.DOMAIN_NAME";

    /** Attribute */
    static final String DomainTitelKey = "SYS_DOMAIN.DOMAIN_TITEL_KEY";

    /** Attribute */
    static final String Remarks = "SYS_DOMAIN.REMARKS";

    /** Attribute */
    static final String SortIndex = "SYS_DOMAIN.SORT_INDEX";

    /** Attribute */
    static final String Status = "SYS_DOMAIN.STATUS";

    /** Attribute */
    static final String DomainShortName = "SYS_DOMAIN.DOMAIN_SHORT_NAME";

    /** Attribute */
    static final String DomainSmallIcon = "SYS_DOMAIN.DOMAIN_SMALL_ICON";

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
        static final String DomainCode = "domainCode";

        /** Attribute */
        static final String DomainIcon = "domainIcon";

        /** Attribute */
        static final String DomainName = "domainName";

        /** Attribute */
        static final String DomainTitelKey = "domainTitelKey";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SortIndex = "sortIndex";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DomainShortName = "domainShortName";

        /** Attribute */
        static final String DomainSmallIcon = "domainSmallIcon";
    } // end DataProperty

    /**
     * Check Unique SysDomain
     *
     * @param aSysDomain
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysDomain aSysDomain) throws Exception;

    /**
     * insert SysDomain
     *
     * @param aSysDomain
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysDomain(SysDomain aSysDomain) throws Exception;

    /**
     * Batch Insert SysDomain
     *
     * @param aSysDomain
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysDomain(SysDomain[] aSysDomain) throws Exception;

    /**
     * Delete SysDomain
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysDomain(final long aId) throws Exception;

    /**
     * Delete SysDomain By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysDomain(SysDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysDomain
     *
     * @param aSysDomain
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysDomain(SysDomain aSysDomain) throws Exception;

    /**
     * Batch Modify SysDomain
     *
     * @param aSysDomain
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysDomain(SysDomain[] aSysDomain) throws Exception;

    /**
     * Modify SysDomain  By Query Conditions
     *
     * @param aSysDomain Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysDomain(SysDomain aSysDomain, SysDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysDomain
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysDomain findSysDomainById(final long aId) throws Exception;

    /**
     * Query SysDomain
     *
     * @param aQueryBean
     *
     * @return ISysDomain[]
     *
     * @throws Exception
     *
     * @model type="ISysDomain" containment="true"
     */
    SysDomain[] querySysDomain(SysDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysDomain
     *
     * @param aBaseQueryBean
     *
     * @return ISysDomain[]
     *
     * @throws Exception
     *
     * @model type="ISysDomain" containment="true"
     */

    //Map querySysDomainForMap(SysDomainDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysDomain
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysDomainCount(SysDomainDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysDomain Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysDomainSelective(SysDomainDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysDomain
     *
     * @param aSysDomains
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysDomain(SysDomain[] aSysDomains,
        SysDomainDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysDomain
     *
     * @param aSysDomains
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysDomain(SysDomain[] aSysDomains,
        SysDomainDAOQueryBean aQueryBean, SysDomainSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysDomainSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysDomainArray DOCUMENT ME!
         * @param willUpdateSysDomainArray DOCUMENT ME!
         * @param willDeleteSysDomainArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(SysDomain[] willAddSysDomainArray,
            SysDomain[] willUpdateSysDomainArray,
            SysDomain[] willDeleteSysDomainArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysDomain[] aSysDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysDomain[] aSysDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysDomain[] aSysDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysDomain[] aSysDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysDomain[] aSysDomains) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysDomain[] aSysDomains) throws Exception;
    } // end SysDomainSynchronizeCallback
} // end IBaseSysDomainDAO
