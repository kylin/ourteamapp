/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessDomain Data Access Object
*  GenDate 2011-09-22 10:16:34  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessDomainDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BUSINESS_DOMAIN";

    /** Attribute */
    static final String BusinessDomainId = "BUSINESS_DOMAIN.BUSINESS_DOMAIN_ID";

    /** Attribute */
    static final String Code = "BUSINESS_DOMAIN.CODE";

    /** Attribute */
    static final String Description = "BUSINESS_DOMAIN.DESCRIPTION";

    /** Attribute */
    static final String Name = "BUSINESS_DOMAIN.NAME";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String BusinessDomainId = "businessDomainId";

        /** Attribute */
        static final String Code = "code";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String Name = "name";
    } // end DataProperty

    /**
     * Check Unique BusinessDomain
     *
     * @param aBusinessDomain
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BusinessDomain aBusinessDomain)
        throws Exception;

    /**
     * insert BusinessDomain
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessDomain(BusinessDomain aBusinessDomain)
        throws Exception;

    /**
     * Batch Insert BusinessDomain
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessDomain(BusinessDomain[] aBusinessDomain)
        throws Exception;

    /**
     * Delete BusinessDomain
     *
     * @param aBusinessDomainId long aBusinessDomainId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomain(final long aBusinessDomainId)
        throws Exception;

    /**
     * Delete BusinessDomain By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomain(BusinessDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessDomain
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessDomain(BusinessDomain aBusinessDomain)
        throws Exception;

    /**
     * Batch Modify BusinessDomain
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessDomain(BusinessDomain[] aBusinessDomain)
        throws Exception;

    /**
     * Modify BusinessDomain  By Query Conditions
     *
     * @param aBusinessDomain Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessDomain(BusinessDomain aBusinessDomain,
        BusinessDomainDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessDomain
     *
     * @param aBusinessDomainId long aBusinessDomainId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessDomain findBusinessDomainById(final long aBusinessDomainId)
        throws Exception;

    /**
     * Query BusinessDomain
     *
     * @param aQueryBean
     *
     * @return IBusinessDomain[]
     *
     * @throws Exception
     *
     * @model type="IBusinessDomain" containment="true"
     */
    BusinessDomain[] queryBusinessDomain(BusinessDomainDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BusinessDomain
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessDomain[]
     *
     * @throws Exception
     *
     * @model type="IBusinessDomain" containment="true"
     */

    //Map queryBusinessDomainForMap(BusinessDomainDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessDomain
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessDomainCount(BusinessDomainDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessDomain Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessDomainSelective(
        BusinessDomainDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BusinessDomain
     *
     * @param aBusinessDomains
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessDomain(BusinessDomain[] aBusinessDomains,
        BusinessDomainDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BusinessDomain
     *
     * @param aBusinessDomains
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessDomain(BusinessDomain[] aBusinessDomains,
        BusinessDomainDAOQueryBean aQueryBean,
        BusinessDomainSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessDomainSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessDomainArray DOCUMENT ME!
         * @param willUpdateBusinessDomainArray DOCUMENT ME!
         * @param willDeleteBusinessDomainArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessDomain[] willAddBusinessDomainArray,
            BusinessDomain[] willUpdateBusinessDomainArray,
            BusinessDomain[] willDeleteBusinessDomainArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BusinessDomain[] aBusinessDomains)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BusinessDomain[] aBusinessDomains)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BusinessDomain[] aBusinessDomains)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BusinessDomain[] aBusinessDomains)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BusinessDomain[] aBusinessDomains)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomains DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BusinessDomain[] aBusinessDomains)
            throws Exception;
    } // end BusinessDomainSynchronizeCallback
} // end IBaseBusinessDomainDAO
