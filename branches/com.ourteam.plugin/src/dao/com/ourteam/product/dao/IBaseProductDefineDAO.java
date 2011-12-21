/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductDefine Data Access Object
*  GenDate 2011-10-10 16:06:17  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_DEFINE";

    /** Attribute */
    static final String Id = "PRODUCT_DEFINE.ID";

    /** Attribute */
    static final String CatalogId = "PRODUCT_DEFINE.CATALOG_ID";

    /** Attribute */
    static final String ProductCode = "PRODUCT_DEFINE.PRODUCT_CODE";

    /** Attribute */
    static final String ProductName = "PRODUCT_DEFINE.PRODUCT_NAME";

    /** Attribute */
    static final String Remarks = "PRODUCT_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_DEFINE.STATUS";

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
        static final String CatalogId = "catalogId";

        /** Attribute */
        static final String ProductCode = "productCode";

        /** Attribute */
        static final String ProductName = "productName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique ProductDefine
     *
     * @param aProductDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProductDefine aProductDefine)
        throws Exception;

    /**
     * insert ProductDefine
     *
     * @param aProductDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductDefine(ProductDefine aProductDefine)
        throws Exception;

    /**
     * Batch Insert ProductDefine
     *
     * @param aProductDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductDefine(ProductDefine[] aProductDefine)
        throws Exception;

    /**
     * Delete ProductDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductDefine(final long aId) throws Exception;

    /**
     * Delete ProductDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductDefine(ProductDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductDefine
     *
     * @param aProductDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductDefine(ProductDefine aProductDefine)
        throws Exception;

    /**
     * Batch Modify ProductDefine
     *
     * @param aProductDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductDefine(ProductDefine[] aProductDefine)
        throws Exception;

    /**
     * Modify ProductDefine  By Query Conditions
     *
     * @param aProductDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductDefine(ProductDefine aProductDefine,
        ProductDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductDefine findProductDefineById(final long aId)
        throws Exception;

    /**
     * Query ProductDefine
     *
     * @param aQueryBean
     *
     * @return IProductDefine[]
     *
     * @throws Exception
     *
     * @model type="IProductDefine" containment="true"
     */
    ProductDefine[] queryProductDefine(ProductDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProductDefine
     *
     * @param aBaseQueryBean
     *
     * @return IProductDefine[]
     *
     * @throws Exception
     *
     * @model type="IProductDefine" containment="true"
     */

    //Map queryProductDefineForMap(ProductDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductDefineCount(ProductDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProductDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductDefineSelective(ProductDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ProductDefine
     *
     * @param aProductDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductDefine(ProductDefine[] aProductDefines,
        ProductDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ProductDefine
     *
     * @param aProductDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductDefine(ProductDefine[] aProductDefines,
        ProductDefineDAOQueryBean aQueryBean,
        ProductDefineSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductDefineArray DOCUMENT ME!
         * @param willUpdateProductDefineArray DOCUMENT ME!
         * @param willDeleteProductDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductDefine[] willAddProductDefineArray,
            ProductDefine[] willUpdateProductDefineArray,
            ProductDefine[] willDeleteProductDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProductDefine[] aProductDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProductDefine[] aProductDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProductDefine[] aProductDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProductDefine[] aProductDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProductDefine[] aProductDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProductDefine[] aProductDefines)
            throws Exception;
    } // end ProductDefineSynchronizeCallback

    /**
     * Query Related IProductVersion
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IProductVersion" containment="true"
     */
    com.ourteam.product.dao.ProductVersion[] queryProductVersions(
        ProductDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IProductVersion to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IProductVersion" containment="true"
     */

    //Map queryProductVersionsForMap(ProductDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IProductVersion Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryProductVersionsSelective(ProductDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related IProductVersion
     *
     * @param aProductVersion {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductVersion(
        com.ourteam.product.dao.ProductVersion aProductVersion,
        ProductDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IProductVersion
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductVersion(ProductDefineDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseProductDefineDAO
