/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IWorkspaceResource Data Access Object
*  GenDate 2011-09-22 10:17:24  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseWorkspaceResourceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "WORKSPACE_RESOURCE";

    /** Attribute */
    static final String Id = "WORKSPACE_RESOURCE.ID";

    /** Attribute */
    static final String Description = "WORKSPACE_RESOURCE.DESCRIPTION";

    /** Attribute */
    static final String OrderIndex = "WORKSPACE_RESOURCE.ORDER_INDEX";

    /** Attribute */
    static final String ResourcePath = "WORKSPACE_RESOURCE.RESOURCE_PATH";

    /** Attribute */
    static final String ResourceType = "WORKSPACE_RESOURCE.RESOURCE_TYPE";

    /** Attribute */
    static final String Status = "WORKSPACE_RESOURCE.STATUS";

    /** Attribute */
    static final String WorkspaceId = "WORKSPACE_RESOURCE.WORKSPACE_ID";

    /** Attribute */
    static final String Name = "WORKSPACE_RESOURCE.NAME";

    /** Attribute */
    static final String WorkspacePath = "workspaceA.WORKSPACE_PATH";

    /** Attribute */
    static final String WorkspaceName = "workspaceA.NAME";

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
        static final String Description = "description";

        /** Attribute */
        static final String OrderIndex = "orderIndex";

        /** Attribute */
        static final String ResourcePath = "resourcePath";

        /** Attribute */
        static final String ResourceType = "resourceType";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String WorkspaceId = "workspaceId";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String WorkspacePath = "workspacePath";

        /** Attribute */
        static final String WorkspaceName = "workspaceName";
    } // end DataProperty

    /**
     * Check Unique WorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(WorkspaceResource aWorkspaceResource)
        throws Exception;

    /**
     * insert WorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     *
     * @model
     */
    void insertWorkspaceResource(WorkspaceResource aWorkspaceResource)
        throws Exception;

    /**
     * Batch Insert WorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertWorkspaceResource(WorkspaceResource[] aWorkspaceResource)
        throws Exception;

    /**
     * Delete WorkspaceResource
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceResource(final long aId) throws Exception;

    /**
     * Delete WorkspaceResource By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceResource(WorkspaceResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify WorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceResource(WorkspaceResource aWorkspaceResource)
        throws Exception;

    /**
     * Batch Modify WorkspaceResource
     *
     * @param aWorkspaceResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateWorkspaceResource(WorkspaceResource[] aWorkspaceResource)
        throws Exception;

    /**
     * Modify WorkspaceResource  By Query Conditions
     *
     * @param aWorkspaceResource Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceResource(WorkspaceResource aWorkspaceResource,
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query WorkspaceResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    WorkspaceResource findWorkspaceResourceById(final long aId)
        throws Exception;

    /**
     * Query WorkspaceResource
     *
     * @param aQueryBean
     *
     * @return IWorkspaceResource[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceResource" containment="true"
     */
    WorkspaceResource[] queryWorkspaceResource(
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query WorkspaceResource
     *
     * @param aBaseQueryBean
     *
     * @return IWorkspaceResource[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceResource" containment="true"
     */

    //Map queryWorkspaceResourceForMap(WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count WorkspaceResource
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryWorkspaceResourceCount(
        WorkspaceResourceDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Query WorkspaceResource Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryWorkspaceResourceSelective(
        WorkspaceResourceDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize WorkspaceResource
     *
     * @param aWorkspaceResources
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceResource(WorkspaceResource[] aWorkspaceResources,
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize WorkspaceResource
     *
     * @param aWorkspaceResources
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceResource(WorkspaceResource[] aWorkspaceResources,
        WorkspaceResourceDAOQueryBean aQueryBean,
        WorkspaceResourceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface WorkspaceResourceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddWorkspaceResourceArray DOCUMENT ME!
         * @param willUpdateWorkspaceResourceArray DOCUMENT ME!
         * @param willDeleteWorkspaceResourceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            WorkspaceResource[] willAddWorkspaceResourceArray,
            WorkspaceResource[] willUpdateWorkspaceResourceArray,
            WorkspaceResource[] willDeleteWorkspaceResourceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(WorkspaceResource[] aWorkspaceResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(WorkspaceResource[] aWorkspaceResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(WorkspaceResource[] aWorkspaceResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(WorkspaceResource[] aWorkspaceResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(WorkspaceResource[] aWorkspaceResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(WorkspaceResource[] aWorkspaceResources)
            throws Exception;
    } // end WorkspaceResourceSynchronizeCallback

    /**
     * Query Related IWorkspaceResourceBusinessPackageRelate
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IWorkspaceResourceBusinessPackageRelate" containment="true"
     */
    com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate[] queryWorkspaceResourceBusinessPackageRelates(
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IWorkspaceResourceBusinessPackageRelate to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IWorkspaceResourceBusinessPackageRelate" containment="true"
     */

    //Map queryWorkspaceResourceBusinessPackageRelatesForMap(WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IWorkspaceResourceBusinessPackageRelate Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryWorkspaceResourceBusinessPackageRelatesSelective(
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related IWorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *        {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceResourceBusinessPackageRelate(
        com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate,
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IWorkspaceResourceBusinessPackageRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceDAOQueryBean aQueryBean) throws Exception;
} // end IBaseWorkspaceResourceDAO
