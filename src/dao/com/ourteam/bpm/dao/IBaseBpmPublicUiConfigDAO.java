/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmPublicUiConfig Data Access Object
*  GenDate 2011-11-11 16:20:00  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmPublicUiConfigDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_PUBLIC_UI_CONFIG";

    /** Attribute */
    static final String Id = "BPM_PUBLIC_UI_CONFIG.ID";

    /** Attribute */
    static final String ConfigXml = "BPM_PUBLIC_UI_CONFIG.CONFIG_XML";

    /** Attribute */
    static final String Remarks = "BPM_PUBLIC_UI_CONFIG.REMARKS";

    /** Attribute */
    static final String Status = "BPM_PUBLIC_UI_CONFIG.STATUS";

    /** Attribute */
    static final String UiConfigType = "BPM_PUBLIC_UI_CONFIG.UI_CONFIG_TYPE";

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
        static final String ConfigXml = "configXml";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String UiConfigType = "uiConfigType";
    } // end DataProperty

    /**
     * Check Unique BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmPublicUiConfig aBpmPublicUiConfig)
        throws Exception;

    /**
     * insert BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmPublicUiConfig(BpmPublicUiConfig aBpmPublicUiConfig)
        throws Exception;

    /**
     * Batch Insert BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmPublicUiConfig(BpmPublicUiConfig[] aBpmPublicUiConfig)
        throws Exception;

    /**
     * Delete BpmPublicUiConfig
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmPublicUiConfig(final long aId) throws Exception;

    /**
     * Delete BpmPublicUiConfig By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmPublicUiConfig(BpmPublicUiConfigDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmPublicUiConfig(BpmPublicUiConfig aBpmPublicUiConfig)
        throws Exception;

    /**
     * Batch Modify BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmPublicUiConfig(BpmPublicUiConfig[] aBpmPublicUiConfig)
        throws Exception;

    /**
     * Modify BpmPublicUiConfig  By Query Conditions
     *
     * @param aBpmPublicUiConfig Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmPublicUiConfig(BpmPublicUiConfig aBpmPublicUiConfig,
        BpmPublicUiConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmPublicUiConfig
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmPublicUiConfig findBpmPublicUiConfigById(final long aId)
        throws Exception;

    /**
     * Query BpmPublicUiConfig
     *
     * @param aQueryBean
     *
     * @return IBpmPublicUiConfig[]
     *
     * @throws Exception
     *
     * @model type="IBpmPublicUiConfig" containment="true"
     */
    BpmPublicUiConfig[] queryBpmPublicUiConfig(
        BpmPublicUiConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmPublicUiConfig
     *
     * @param aBaseQueryBean
     *
     * @return IBpmPublicUiConfig[]
     *
     * @throws Exception
     *
     * @model type="IBpmPublicUiConfig" containment="true"
     */

    //Map queryBpmPublicUiConfigForMap(BpmPublicUiConfigDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmPublicUiConfig
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmPublicUiConfigCount(
        BpmPublicUiConfigDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Query BpmPublicUiConfig Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmPublicUiConfigSelective(
        BpmPublicUiConfigDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfigs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmPublicUiConfig(BpmPublicUiConfig[] aBpmPublicUiConfigs,
        BpmPublicUiConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfigs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmPublicUiConfig(BpmPublicUiConfig[] aBpmPublicUiConfigs,
        BpmPublicUiConfigDAOQueryBean aQueryBean,
        BpmPublicUiConfigSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmPublicUiConfigSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmPublicUiConfigArray DOCUMENT ME!
         * @param willUpdateBpmPublicUiConfigArray DOCUMENT ME!
         * @param willDeleteBpmPublicUiConfigArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmPublicUiConfig[] willAddBpmPublicUiConfigArray,
            BpmPublicUiConfig[] willUpdateBpmPublicUiConfigArray,
            BpmPublicUiConfig[] willDeleteBpmPublicUiConfigArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmPublicUiConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmPublicUiConfig[] aBpmPublicUiConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmPublicUiConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmPublicUiConfig[] aBpmPublicUiConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmPublicUiConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmPublicUiConfig[] aBpmPublicUiConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmPublicUiConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmPublicUiConfig[] aBpmPublicUiConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmPublicUiConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmPublicUiConfig[] aBpmPublicUiConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmPublicUiConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmPublicUiConfig[] aBpmPublicUiConfigs)
            throws Exception;
    } // end BpmPublicUiConfigSynchronizeCallback
} // end IBaseBpmPublicUiConfigDAO
