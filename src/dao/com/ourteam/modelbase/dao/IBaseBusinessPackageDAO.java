/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessPackage Data Access Object
*  GenDate 2011-09-22 10:16:38  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessPackageDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BUSINESS_PACKAGE";

    /** Attribute */
    static final String BusinessPackageId = "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID";

    /** Attribute */
    static final String BusinessDomainId = "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID";

    /** Attribute */
    static final String Description = "BUSINESS_PACKAGE.DESCRIPTION";

    /** Attribute */
    static final String Name = "BUSINESS_PACKAGE.NAME";

    /** Attribute */
    static final String ParentPackageId = "BUSINESS_PACKAGE.PARENT_PACKAGE_ID";

    /** Attribute */
    static final String State = "BUSINESS_PACKAGE.STATE";

    /** Attribute */
    static final String Type = "BUSINESS_PACKAGE.TYPE";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String BusinessPackageId = "businessPackageId";

        /** Attribute */
        static final String BusinessDomainId = "businessDomainId";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String ParentPackageId = "parentPackageId";

        /** Attribute */
        static final String State = "state";

        /** Attribute */
        static final String Type = "type";
    } // end DataProperty

    /**
     * Check Unique BusinessPackage
     *
     * @param aBusinessPackage
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BusinessPackage aBusinessPackage)
        throws Exception;

    /**
     * insert BusinessPackage
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessPackage(BusinessPackage aBusinessPackage)
        throws Exception;

    /**
     * Batch Insert BusinessPackage
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessPackage(BusinessPackage[] aBusinessPackage)
        throws Exception;

    /**
     * Delete BusinessPackage
     *
     * @param aBusinessPackageId long aBusinessPackageId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessPackage(final long aBusinessPackageId)
        throws Exception;

    /**
     * Delete BusinessPackage By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessPackage(BusinessPackageDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessPackage
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessPackage(BusinessPackage aBusinessPackage)
        throws Exception;

    /**
     * Batch Modify BusinessPackage
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessPackage(BusinessPackage[] aBusinessPackage)
        throws Exception;

    /**
     * Modify BusinessPackage  By Query Conditions
     *
     * @param aBusinessPackage Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessPackage(BusinessPackage aBusinessPackage,
        BusinessPackageDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessPackage
     *
     * @param aBusinessPackageId long aBusinessPackageId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessPackage findBusinessPackageById(final long aBusinessPackageId)
        throws Exception;

    /**
     * Query BusinessPackage
     *
     * @param aQueryBean
     *
     * @return IBusinessPackage[]
     *
     * @throws Exception
     *
     * @model type="IBusinessPackage" containment="true"
     */
    BusinessPackage[] queryBusinessPackage(
        BusinessPackageDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessPackage
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessPackage[]
     *
     * @throws Exception
     *
     * @model type="IBusinessPackage" containment="true"
     */

    //Map queryBusinessPackageForMap(BusinessPackageDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessPackage
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessPackageCount(BusinessPackageDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessPackage Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessPackageSelective(
        BusinessPackageDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BusinessPackage
     *
     * @param aBusinessPackages
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessPackage(BusinessPackage[] aBusinessPackages,
        BusinessPackageDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BusinessPackage
     *
     * @param aBusinessPackages
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessPackage(BusinessPackage[] aBusinessPackages,
        BusinessPackageDAOQueryBean aQueryBean,
        BusinessPackageSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessPackageSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessPackageArray DOCUMENT ME!
         * @param willUpdateBusinessPackageArray DOCUMENT ME!
         * @param willDeleteBusinessPackageArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessPackage[] willAddBusinessPackageArray,
            BusinessPackage[] willUpdateBusinessPackageArray,
            BusinessPackage[] willDeleteBusinessPackageArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessPackages DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BusinessPackage[] aBusinessPackages)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessPackages DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BusinessPackage[] aBusinessPackages)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessPackages DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BusinessPackage[] aBusinessPackages)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessPackages DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BusinessPackage[] aBusinessPackages)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessPackages DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BusinessPackage[] aBusinessPackages)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessPackages DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BusinessPackage[] aBusinessPackages)
            throws Exception;
    } // end BusinessPackageSynchronizeCallback
} // end IBaseBusinessPackageDAO
