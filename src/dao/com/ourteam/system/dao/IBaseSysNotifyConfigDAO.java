/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysNotifyConfig Data Access Object
*  GenDate 2011-11-24 15:00:28  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysNotifyConfigDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_NOTIFY_CONFIG";

    /** Attribute */
    static final String CheckInterval = "SYS_NOTIFY_CONFIG.CHECK_INTERVAL";

    /** Attribute */
    static final String Id = "SYS_NOTIFY_CONFIG.ID";

    /** Attribute */
    static final String NotifyIcon = "SYS_NOTIFY_CONFIG.NOTIFY_ICON";

    /** Attribute */
    static final String NotifyListener = "SYS_NOTIFY_CONFIG.NOTIFY_LISTENER";

    /** Attribute */
    static final String NotifyMessage = "SYS_NOTIFY_CONFIG.NOTIFY_MESSAGE";

    /** Attribute */
    static final String NotifyName = "SYS_NOTIFY_CONFIG.NOTIFY_NAME";

    /** Attribute */
    static final String Status = "SYS_NOTIFY_CONFIG.STATUS";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String CheckInterval = "checkInterval";

        /** Attribute */
        static final String Id = "id";

        /** Attribute */
        static final String NotifyIcon = "notifyIcon";

        /** Attribute */
        static final String NotifyListener = "notifyListener";

        /** Attribute */
        static final String NotifyMessage = "notifyMessage";

        /** Attribute */
        static final String NotifyName = "notifyName";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique SysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysNotifyConfig aSysNotifyConfig)
        throws Exception;

    /**
     * insert SysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysNotifyConfig(SysNotifyConfig aSysNotifyConfig)
        throws Exception;

    /**
     * Batch Insert SysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysNotifyConfig(SysNotifyConfig[] aSysNotifyConfig)
        throws Exception;

    /**
     * Delete SysNotifyConfig
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysNotifyConfig(final long aId) throws Exception;

    /**
     * Delete SysNotifyConfig By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysNotifyConfig(SysNotifyConfigDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysNotifyConfig(SysNotifyConfig aSysNotifyConfig)
        throws Exception;

    /**
     * Batch Modify SysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysNotifyConfig(SysNotifyConfig[] aSysNotifyConfig)
        throws Exception;

    /**
     * Modify SysNotifyConfig  By Query Conditions
     *
     * @param aSysNotifyConfig Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysNotifyConfig(SysNotifyConfig aSysNotifyConfig,
        SysNotifyConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysNotifyConfig
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysNotifyConfig findSysNotifyConfigById(final long aId)
        throws Exception;

    /**
     * Query SysNotifyConfig
     *
     * @param aQueryBean
     *
     * @return ISysNotifyConfig[]
     *
     * @throws Exception
     *
     * @model type="ISysNotifyConfig" containment="true"
     */
    SysNotifyConfig[] querySysNotifyConfig(
        SysNotifyConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysNotifyConfig
     *
     * @param aBaseQueryBean
     *
     * @return ISysNotifyConfig[]
     *
     * @throws Exception
     *
     * @model type="ISysNotifyConfig" containment="true"
     */

    //Map querySysNotifyConfigForMap(SysNotifyConfigDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysNotifyConfig
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysNotifyConfigCount(SysNotifyConfigDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysNotifyConfig Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysNotifyConfigSelective(
        SysNotifyConfigDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize SysNotifyConfig
     *
     * @param aSysNotifyConfigs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysNotifyConfig(SysNotifyConfig[] aSysNotifyConfigs,
        SysNotifyConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysNotifyConfig
     *
     * @param aSysNotifyConfigs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysNotifyConfig(SysNotifyConfig[] aSysNotifyConfigs,
        SysNotifyConfigDAOQueryBean aQueryBean,
        SysNotifyConfigSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysNotifyConfigSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysNotifyConfigArray DOCUMENT ME!
         * @param willUpdateSysNotifyConfigArray DOCUMENT ME!
         * @param willDeleteSysNotifyConfigArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysNotifyConfig[] willAddSysNotifyConfigArray,
            SysNotifyConfig[] willUpdateSysNotifyConfigArray,
            SysNotifyConfig[] willDeleteSysNotifyConfigArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysNotifyConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysNotifyConfig[] aSysNotifyConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysNotifyConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysNotifyConfig[] aSysNotifyConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysNotifyConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysNotifyConfig[] aSysNotifyConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysNotifyConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysNotifyConfig[] aSysNotifyConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysNotifyConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysNotifyConfig[] aSysNotifyConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysNotifyConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysNotifyConfig[] aSysNotifyConfigs)
            throws Exception;
    } // end SysNotifyConfigSynchronizeCallback
} // end IBaseSysNotifyConfigDAO
