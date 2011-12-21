/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductFunctionVersionRelate Data Access Object
*  GenDate 2011-10-10 16:06:18  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductFunctionVersionRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_FUNCTION_VERSION_RELATE";

    /** Attribute */
    static final String Id = "PRODUCT_FUNCTION_VERSION_RELATE.ID";

    /** Attribute */
    static final String ProductFunctionId = "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID";

    /** Attribute */
    static final String ProductVersionId = "PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_VERSION_ID";

    /** Attribute */
    static final String Remarks = "PRODUCT_FUNCTION_VERSION_RELATE.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_FUNCTION_VERSION_RELATE.STATUS";

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
        static final String ProductFunctionId = "productFunctionId";

        /** Attribute */
        static final String ProductVersionId = "productVersionId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(
        ProductFunctionVersionRelate aProductFunctionVersionRelate)
        throws Exception;

    /**
     * insert ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductFunctionVersionRelate(
        ProductFunctionVersionRelate aProductFunctionVersionRelate)
        throws Exception;

    /**
     * Batch Insert ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelate)
        throws Exception;

    /**
     * Delete ProductFunctionVersionRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductFunctionVersionRelate(final long aId)
        throws Exception;

    /**
     * Delete ProductFunctionVersionRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductFunctionVersionRelate(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductFunctionVersionRelate(
        ProductFunctionVersionRelate aProductFunctionVersionRelate)
        throws Exception;

    /**
     * Batch Modify ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelate)
        throws Exception;

    /**
     * Modify ProductFunctionVersionRelate  By Query Conditions
     *
     * @param aProductFunctionVersionRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductFunctionVersionRelate(
        ProductFunctionVersionRelate aProductFunctionVersionRelate,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProductFunctionVersionRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductFunctionVersionRelate findProductFunctionVersionRelateById(
        final long aId) throws Exception;

    /**
     * Query ProductFunctionVersionRelate
     *
     * @param aQueryBean
     *
     * @return IProductFunctionVersionRelate[]
     *
     * @throws Exception
     *
     * @model type="IProductFunctionVersionRelate" containment="true"
     */
    ProductFunctionVersionRelate[] queryProductFunctionVersionRelate(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProductFunctionVersionRelate
     *
     * @param aBaseQueryBean
     *
     * @return IProductFunctionVersionRelate[]
     *
     * @throws Exception
     *
     * @model type="IProductFunctionVersionRelate" containment="true"
     */

    //Map queryProductFunctionVersionRelateForMap(ProductFunctionVersionRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductFunctionVersionRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductFunctionVersionRelateCount(
        ProductFunctionVersionRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProductFunctionVersionRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductFunctionVersionRelateSelective(
        ProductFunctionVersionRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelates,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelates,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean,
        ProductFunctionVersionRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductFunctionVersionRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductFunctionVersionRelateArray DOCUMENT ME!
         * @param willUpdateProductFunctionVersionRelateArray DOCUMENT ME!
         * @param willDeleteProductFunctionVersionRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductFunctionVersionRelate[] willAddProductFunctionVersionRelateArray,
            ProductFunctionVersionRelate[] willUpdateProductFunctionVersionRelateArray,
            ProductFunctionVersionRelate[] willDeleteProductFunctionVersionRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctionVersionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(
            ProductFunctionVersionRelate[] aProductFunctionVersionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctionVersionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(
            ProductFunctionVersionRelate[] aProductFunctionVersionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctionVersionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(
            ProductFunctionVersionRelate[] aProductFunctionVersionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctionVersionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(
            ProductFunctionVersionRelate[] aProductFunctionVersionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctionVersionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(
            ProductFunctionVersionRelate[] aProductFunctionVersionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctionVersionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(
            ProductFunctionVersionRelate[] aProductFunctionVersionRelates)
            throws Exception;
    } // end ProductFunctionVersionRelateSynchronizeCallback

    /**
     * Query Related IProductFunction
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IProductFunction" containment="true"
     */
    com.ourteam.product.dao.ProductFunction[] queryProductFunctions(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Related IProductFunction to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IProductFunction" containment="true"
     */

    //Map queryProductFunctionsForMap(ProductFunctionVersionRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IProductFunction Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryProductFunctionsSelective(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related IProductFunction
     *
     * @param aProductFunction {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductFunction(
        com.ourteam.product.dao.ProductFunction aProductFunction,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Delete Related IProductFunction
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductFunction(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

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
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

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

    //Map queryProductVersionsForMap(ProductFunctionVersionRelateDAOQueryBean aQueryBean) throws Exception;
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
    Map[] queryProductVersionsSelective(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
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
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Delete Related IProductVersion
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductVersion(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseProductFunctionVersionRelateDAO
