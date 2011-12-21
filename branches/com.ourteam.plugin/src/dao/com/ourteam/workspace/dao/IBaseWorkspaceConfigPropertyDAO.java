/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IWorkspaceConfigProperty Data Access Object
*  GenDate 2011-09-22 10:17:23  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseWorkspaceConfigPropertyDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "WORKSPACE_CONFIG_PROPERTY";

    /** Attribute */
    static final String Id = "WORKSPACE_CONFIG_PROPERTY.ID";

    /** Attribute */
    static final String ConfigProperty = "WORKSPACE_CONFIG_PROPERTY.CONFIG_PROPERTY";

    /** Attribute */
    static final String ConfigValue = "WORKSPACE_CONFIG_PROPERTY.CONFIG_VALUE";

    /** Attribute */
    static final String Description = "WORKSPACE_CONFIG_PROPERTY.DESCRIPTION";

    /** Attribute */
    static final String Status = "WORKSPACE_CONFIG_PROPERTY.STATUS";

    /** Attribute */
    static final String WorkspaceConfigId = "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_CONFIG_ID";

    /** Attribute */
    static final String WorkspaceId = "WORKSPACE_CONFIG_PROPERTY.WORKSPACE_ID";

    /** Attribute */
    static final String WorkspaceConfigItem = "workspaceConfig.CONFIG_ITEM";

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
        static final String ConfigProperty = "configProperty";

        /** Attribute */
        static final String ConfigValue = "configValue";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String WorkspaceConfigId = "workspaceConfigId";

        /** Attribute */
        static final String WorkspaceId = "workspaceId";

        /** Attribute */
        static final String WorkspaceConfigItem = "workspaceConfigItem";
    } // end DataProperty

    /**
     * Check Unique WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(WorkspaceConfigProperty aWorkspaceConfigProperty)
        throws Exception;

    /**
     * insert WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     *
     * @model
     */
    void insertWorkspaceConfigProperty(
        WorkspaceConfigProperty aWorkspaceConfigProperty)
        throws Exception;

    /**
     * Batch Insert WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigProperty)
        throws Exception;

    /**
     * Delete WorkspaceConfigProperty
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceConfigProperty(final long aId)
        throws Exception;

    /**
     * Delete WorkspaceConfigProperty By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceConfigProperty(
        WorkspaceConfigPropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceConfigProperty(
        WorkspaceConfigProperty aWorkspaceConfigProperty)
        throws Exception;

    /**
     * Batch Modify WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigProperty)
        throws Exception;

    /**
     * Modify WorkspaceConfigProperty  By Query Conditions
     *
     * @param aWorkspaceConfigProperty Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceConfigProperty(
        WorkspaceConfigProperty aWorkspaceConfigProperty,
        WorkspaceConfigPropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query WorkspaceConfigProperty
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    WorkspaceConfigProperty findWorkspaceConfigPropertyById(final long aId)
        throws Exception;

    /**
     * Query WorkspaceConfigProperty
     *
     * @param aQueryBean
     *
     * @return IWorkspaceConfigProperty[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceConfigProperty" containment="true"
     */
    WorkspaceConfigProperty[] queryWorkspaceConfigProperty(
        WorkspaceConfigPropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query WorkspaceConfigProperty
     *
     * @param aBaseQueryBean
     *
     * @return IWorkspaceConfigProperty[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceConfigProperty" containment="true"
     */

    //Map queryWorkspaceConfigPropertyForMap(WorkspaceConfigPropertyDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count WorkspaceConfigProperty
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryWorkspaceConfigPropertyCount(
        WorkspaceConfigPropertyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query WorkspaceConfigProperty Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryWorkspaceConfigPropertySelective(
        WorkspaceConfigPropertyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigPropertys
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigPropertys,
        WorkspaceConfigPropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize WorkspaceConfigProperty
     *
     * @param aWorkspaceConfigPropertys
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceConfigProperty(
        WorkspaceConfigProperty[] aWorkspaceConfigPropertys,
        WorkspaceConfigPropertyDAOQueryBean aQueryBean,
        WorkspaceConfigPropertySynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface WorkspaceConfigPropertySynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddWorkspaceConfigPropertyArray DOCUMENT ME!
         * @param willUpdateWorkspaceConfigPropertyArray DOCUMENT ME!
         * @param willDeleteWorkspaceConfigPropertyArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            WorkspaceConfigProperty[] willAddWorkspaceConfigPropertyArray,
            WorkspaceConfigProperty[] willUpdateWorkspaceConfigPropertyArray,
            WorkspaceConfigProperty[] willDeleteWorkspaceConfigPropertyArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(WorkspaceConfigProperty[] aWorkspaceConfigPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(WorkspaceConfigProperty[] aWorkspaceConfigPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(WorkspaceConfigProperty[] aWorkspaceConfigPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(WorkspaceConfigProperty[] aWorkspaceConfigPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(WorkspaceConfigProperty[] aWorkspaceConfigPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceConfigPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(WorkspaceConfigProperty[] aWorkspaceConfigPropertys)
            throws Exception;
    } // end WorkspaceConfigPropertySynchronizeCallback
} // end IBaseWorkspaceConfigPropertyDAO
