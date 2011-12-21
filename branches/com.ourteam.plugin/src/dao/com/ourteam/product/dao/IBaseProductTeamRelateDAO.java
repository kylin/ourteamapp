/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductTeamRelate Data Access Object
*  GenDate 2011-10-10 16:06:21  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductTeamRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_TEAM_RELATE";

    /** Attribute */
    static final String Id = "PRODUCT_TEAM_RELATE.ID";

    /** Attribute */
    static final String ProductId = "PRODUCT_TEAM_RELATE.PRODUCT_ID";

    /** Attribute */
    static final String Remarks = "PRODUCT_TEAM_RELATE.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_TEAM_RELATE.STATUS";

    /** Attribute */
    static final String TeamId = "PRODUCT_TEAM_RELATE.TEAM_ID";

    /** Attribute */
    static final String TeamName = "teamA.TEAM_NAME";

    /** Attribute */
    static final String TeamCode = "teamA.TEAM_CODE";

    /** Attribute */
    static final String TeamMail = "teamA.TEAM_MAIL";

    /** Attribute */
    static final String TeamStatus = "teamA.STATUS";

    /** Attribute */
    static final String ProductCode = "productA.PRODUCT_CODE";

    /** Attribute */
    static final String ProductName = "productA.PRODUCT_NAME";

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
        static final String ProductId = "productId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TeamId = "teamId";

        /** Attribute */
        static final String TeamName = "teamName";

        /** Attribute */
        static final String TeamCode = "teamCode";

        /** Attribute */
        static final String TeamMail = "teamMail";

        /** Attribute */
        static final String TeamStatus = "teamStatus";

        /** Attribute */
        static final String ProductCode = "productCode";

        /** Attribute */
        static final String ProductName = "productName";
    } // end DataProperty

    /**
     * Check Unique ProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProductTeamRelate aProductTeamRelate)
        throws Exception;

    /**
     * insert ProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductTeamRelate(ProductTeamRelate aProductTeamRelate)
        throws Exception;

    /**
     * Batch Insert ProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductTeamRelate(ProductTeamRelate[] aProductTeamRelate)
        throws Exception;

    /**
     * Delete ProductTeamRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductTeamRelate(final long aId) throws Exception;

    /**
     * Delete ProductTeamRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductTeamRelate(ProductTeamRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductTeamRelate(ProductTeamRelate aProductTeamRelate)
        throws Exception;

    /**
     * Batch Modify ProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductTeamRelate(ProductTeamRelate[] aProductTeamRelate)
        throws Exception;

    /**
     * Modify ProductTeamRelate  By Query Conditions
     *
     * @param aProductTeamRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductTeamRelate(ProductTeamRelate aProductTeamRelate,
        ProductTeamRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductTeamRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductTeamRelate findProductTeamRelateById(final long aId)
        throws Exception;

    /**
     * Query ProductTeamRelate
     *
     * @param aQueryBean
     *
     * @return IProductTeamRelate[]
     *
     * @throws Exception
     *
     * @model type="IProductTeamRelate" containment="true"
     */
    ProductTeamRelate[] queryProductTeamRelate(
        ProductTeamRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductTeamRelate
     *
     * @param aBaseQueryBean
     *
     * @return IProductTeamRelate[]
     *
     * @throws Exception
     *
     * @model type="IProductTeamRelate" containment="true"
     */

    //Map queryProductTeamRelateForMap(ProductTeamRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductTeamRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductTeamRelateCount(
        ProductTeamRelateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Query ProductTeamRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductTeamRelateSelective(
        ProductTeamRelateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ProductTeamRelate
     *
     * @param aProductTeamRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductTeamRelate(ProductTeamRelate[] aProductTeamRelates,
        ProductTeamRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ProductTeamRelate
     *
     * @param aProductTeamRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductTeamRelate(ProductTeamRelate[] aProductTeamRelates,
        ProductTeamRelateDAOQueryBean aQueryBean,
        ProductTeamRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductTeamRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductTeamRelateArray DOCUMENT ME!
         * @param willUpdateProductTeamRelateArray DOCUMENT ME!
         * @param willDeleteProductTeamRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductTeamRelate[] willAddProductTeamRelateArray,
            ProductTeamRelate[] willUpdateProductTeamRelateArray,
            ProductTeamRelate[] willDeleteProductTeamRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductTeamRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProductTeamRelate[] aProductTeamRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductTeamRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProductTeamRelate[] aProductTeamRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductTeamRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProductTeamRelate[] aProductTeamRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductTeamRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProductTeamRelate[] aProductTeamRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductTeamRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProductTeamRelate[] aProductTeamRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductTeamRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProductTeamRelate[] aProductTeamRelates)
            throws Exception;
    } // end ProductTeamRelateSynchronizeCallback
} // end IBaseProductTeamRelateDAO
