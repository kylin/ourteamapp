/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IWorkspace Data Access Object
*  GenDate 2011-09-22 10:17:22  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseWorkspaceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "WORKSPACE";

    /** Attribute */
    static final String Id = "WORKSPACE.ID";

    /** Attribute */
    static final String CreateDate = "WORKSPACE.CREATE_DATE";

    /** Attribute */
    static final String Name = "WORKSPACE.NAME";

    /** Attribute */
    static final String Status = "WORKSPACE.STATUS";

    /** Attribute */
    static final String WorkspacePath = "WORKSPACE.WORKSPACE_PATH";

    /** Attribute */
    static final String WorkspaceType = "WORKSPACE.WORKSPACE_TYPE";

    /** Attribute */
    static final String Description = "WORKSPACE.DESCRIPTION";

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
        static final String CreateDate = "createDate";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String WorkspacePath = "workspacePath";

        /** Attribute */
        static final String WorkspaceType = "workspaceType";

        /** Attribute */
        static final String Description = "description";
    } // end DataProperty

    /**
     * Check Unique Workspace
     *
     * @param aWorkspace
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(Workspace aWorkspace) throws Exception;

    /**
     * insert Workspace
     *
     * @param aWorkspace
     *
     * @throws Exception
     *
     * @model
     */
    void insertWorkspace(Workspace aWorkspace) throws Exception;

    /**
     * Batch Insert Workspace
     *
     * @param aWorkspace
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertWorkspace(Workspace[] aWorkspace) throws Exception;

    /**
     * Delete Workspace
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspace(final long aId) throws Exception;

    /**
     * Delete Workspace By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspace(WorkspaceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify Workspace
     *
     * @param aWorkspace
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspace(Workspace aWorkspace) throws Exception;

    /**
     * Batch Modify Workspace
     *
     * @param aWorkspace
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateWorkspace(Workspace[] aWorkspace) throws Exception;

    /**
     * Modify Workspace  By Query Conditions
     *
     * @param aWorkspace Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspace(Workspace aWorkspace, WorkspaceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Workspace
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    Workspace findWorkspaceById(final long aId) throws Exception;

    /**
     * Query Workspace
     *
     * @param aQueryBean
     *
     * @return IWorkspace[]
     *
     * @throws Exception
     *
     * @model type="IWorkspace" containment="true"
     */
    Workspace[] queryWorkspace(WorkspaceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Workspace
     *
     * @param aBaseQueryBean
     *
     * @return IWorkspace[]
     *
     * @throws Exception
     *
     * @model type="IWorkspace" containment="true"
     */

    //Map queryWorkspaceForMap(WorkspaceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count Workspace
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryWorkspaceCount(WorkspaceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query Workspace Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryWorkspaceSelective(WorkspaceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize Workspace
     *
     * @param aWorkspaces
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspace(Workspace[] aWorkspaces,
        WorkspaceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize Workspace
     *
     * @param aWorkspaces
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspace(Workspace[] aWorkspaces,
        WorkspaceDAOQueryBean aQueryBean, WorkspaceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface WorkspaceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddWorkspaceArray DOCUMENT ME!
         * @param willUpdateWorkspaceArray DOCUMENT ME!
         * @param willDeleteWorkspaceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(Workspace[] willAddWorkspaceArray,
            Workspace[] willUpdateWorkspaceArray,
            Workspace[] willDeleteWorkspaceArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaces DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(Workspace[] aWorkspaces) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaces DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(Workspace[] aWorkspaces) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaces DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(Workspace[] aWorkspaces) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaces DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(Workspace[] aWorkspaces) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaces DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(Workspace[] aWorkspaces) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaces DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(Workspace[] aWorkspaces) throws Exception;
    } // end WorkspaceSynchronizeCallback
} // end IBaseWorkspaceDAO
