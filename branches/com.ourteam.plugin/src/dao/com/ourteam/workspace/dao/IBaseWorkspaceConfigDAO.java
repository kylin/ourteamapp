/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IWorkspaceConfig Data Access Object
*  GenDate 2011-09-22 10:17:23  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseWorkspaceConfigDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "WORKSPACE_CONFIG";

    /** Attribute */
    static final String Id = "WORKSPACE_CONFIG.ID";

    /** Attribute */
    static final String ConfigItem = "WORKSPACE_CONFIG.CONFIG_ITEM";

    /** Attribute */
    static final String Description = "WORKSPACE_CONFIG.DESCRIPTION";

    /** Attribute */
    static final String ParentConfigId = "WORKSPACE_CONFIG.PARENT_CONFIG_ID";

    /** Attribute */
    static final String Status = "WORKSPACE_CONFIG.STATUS";

    /** Attribute */
    static final String ConfigName = "WORKSPACE_CONFIG.CONFIG_NAME";

    /** Attribute */
    static final String ConfigForm = "WORKSPACE_CONFIG.CONFIG_FORM";

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
        static final String ConfigItem = "configItem";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String ParentConfigId = "parentConfigId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ConfigName = "configName";

        /** Attribute */
        static final String ConfigForm = "configForm";
    } // end DataProperty

    /**
     * Check Unique WorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(WorkspaceConfig aWorkspaceConfig)
        throws Exception;

    /**
     * insert WorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     *
     * @model
     */
    void insertWorkspaceConfig(WorkspaceConfig aWorkspaceConfig)
        throws Exception;

    /**
     * Batch Insert WorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertWorkspaceConfig(WorkspaceConfig[] aWorkspaceConfig)
        throws Exception;

    /**
     * Delete WorkspaceConfig
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceConfig(final long aId) throws Exception;

    /**
     * Delete WorkspaceConfig By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceConfig(WorkspaceConfigDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify WorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceConfig(WorkspaceConfig aWorkspaceConfig)
        throws Exception;

    /**
     * Batch Modify WorkspaceConfig
     *
     * @param aWorkspaceConfig
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateWorkspaceConfig(WorkspaceConfig[] aWorkspaceConfig)
        throws Exception;

    /**
     * Modify WorkspaceConfig  By Query Conditions
     *
     * @param aWorkspaceConfig Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceConfig(WorkspaceConfig aWorkspaceConfig,
        WorkspaceConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query WorkspaceConfig
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    WorkspaceConfig findWorkspaceConfigById(final long aId)
        throws Exception;

    /**
     * Query WorkspaceConfig
     *
     * @param aQueryBean
     *
     * @return IWorkspaceConfig[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceConfig" containment="true"
     */
    WorkspaceConfig[] queryWorkspaceConfig(
        WorkspaceConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query WorkspaceConfig
     *
     * @param aBaseQueryBean
     *
     * @return IWorkspaceConfig[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceConfig" containment="true"
     */

    //Map queryWorkspaceConfigForMap(WorkspaceConfigDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count WorkspaceConfig
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryWorkspaceConfigCount(WorkspaceConfigDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query WorkspaceConfig Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryWorkspaceConfigSelective(
        WorkspaceConfigDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize WorkspaceConfig
     *
     * @param aWorkspaceConfigs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceConfig(WorkspaceConfig[] aWorkspaceConfigs,
        WorkspaceConfigDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize WorkspaceConfig
     *
     * @param aWorkspaceConfigs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceConfig(WorkspaceConfig[] aWorkspaceConfigs,
        WorkspaceConfigDAOQueryBean aQueryBean,
        WorkspaceConfigSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface WorkspaceConfigSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddWorkspaceConfigArray DOCUMENT ME!
         * @param willUpdateWorkspaceConfigArray DOCUMENT ME!
         * @param willDeleteWorkspaceConfigArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            WorkspaceConfig[] willAddWorkspaceConfigArray,
            WorkspaceConfig[] willUpdateWorkspaceConfigArray,
            WorkspaceConfig[] willDeleteWorkspaceConfigArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(WorkspaceConfig[] aWorkspaceConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(WorkspaceConfig[] aWorkspaceConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(WorkspaceConfig[] aWorkspaceConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(WorkspaceConfig[] aWorkspaceConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(WorkspaceConfig[] aWorkspaceConfigs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(WorkspaceConfig[] aWorkspaceConfigs)
            throws Exception;
    } // end WorkspaceConfigSynchronizeCallback
} // end IBaseWorkspaceConfigDAO
