/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductVersion Data Access Object
*  GenDate 2011-10-12 15:01:22  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductVersionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_VERSION";

    /** Attribute */
    static final String Id = "PRODUCT_VERSION.ID";

    /** Attribute */
    static final String ProductDefineId = "PRODUCT_VERSION.PRODUCT_DEFINE_ID";

    /** Attribute */
    static final String ProductVersion = "PRODUCT_VERSION.PRODUCT_VERSION";

    /** Attribute */
    static final String Remarks = "PRODUCT_VERSION.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_VERSION.STATUS";

    /** Attribute */
    static final String ProductVersionType = "PRODUCT_VERSION.PRODUCT_VERSION_TYPE";

    /** Attribute */
    static final String ParentVersionId = "PRODUCT_VERSION.PARENT_VERSION_ID";

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
        static final String ProductDefineId = "productDefineId";

        /** Attribute */
        static final String ProductVersion = "productVersion";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ProductVersionType = "productVersionType";

        /** Attribute */
        static final String ParentVersionId = "parentVersionId";
    } // end DataProperty

    /**
     * Check Unique ProductVersion
     *
     * @param aProductVersion
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProductVersion aProductVersion)
        throws Exception;

    /**
     * insert ProductVersion
     *
     * @param aProductVersion
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductVersion(ProductVersion aProductVersion)
        throws Exception;

    /**
     * Batch Insert ProductVersion
     *
     * @param aProductVersion
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductVersion(ProductVersion[] aProductVersion)
        throws Exception;

    /**
     * Delete ProductVersion
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductVersion(final long aId) throws Exception;

    /**
     * Delete ProductVersion By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductVersion(ProductVersionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductVersion
     *
     * @param aProductVersion
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductVersion(ProductVersion aProductVersion)
        throws Exception;

    /**
     * Batch Modify ProductVersion
     *
     * @param aProductVersion
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductVersion(ProductVersion[] aProductVersion)
        throws Exception;

    /**
     * Modify ProductVersion  By Query Conditions
     *
     * @param aProductVersion Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductVersion(ProductVersion aProductVersion,
        ProductVersionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductVersion
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductVersion findProductVersionById(final long aId)
        throws Exception;

    /**
     * Query ProductVersion
     *
     * @param aQueryBean
     *
     * @return IProductVersion[]
     *
     * @throws Exception
     *
     * @model type="IProductVersion" containment="true"
     */
    ProductVersion[] queryProductVersion(ProductVersionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProductVersion
     *
     * @param aBaseQueryBean
     *
     * @return IProductVersion[]
     *
     * @throws Exception
     *
     * @model type="IProductVersion" containment="true"
     */

    //Map queryProductVersionForMap(ProductVersionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductVersion
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductVersionCount(ProductVersionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProductVersion Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductVersionSelective(
        ProductVersionDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ProductVersion
     *
     * @param aProductVersions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductVersion(ProductVersion[] aProductVersions,
        ProductVersionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ProductVersion
     *
     * @param aProductVersions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductVersion(ProductVersion[] aProductVersions,
        ProductVersionDAOQueryBean aQueryBean,
        ProductVersionSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductVersionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductVersionArray DOCUMENT ME!
         * @param willUpdateProductVersionArray DOCUMENT ME!
         * @param willDeleteProductVersionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductVersion[] willAddProductVersionArray,
            ProductVersion[] willUpdateProductVersionArray,
            ProductVersion[] willDeleteProductVersionArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductVersions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProductVersion[] aProductVersions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductVersions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProductVersion[] aProductVersions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductVersions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProductVersion[] aProductVersions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductVersions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProductVersion[] aProductVersions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductVersions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProductVersion[] aProductVersions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductVersions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProductVersion[] aProductVersions)
            throws Exception;
    } // end ProductVersionSynchronizeCallback
} // end IBaseProductVersionDAO
