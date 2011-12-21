/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProjectWorkspaceRelate Data Access Object
*  GenDate 2011-09-22 10:17:22  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProjectWorkspaceRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PROJECT_WORKSPACE_RELATE";

    /** Attribute */
    static final String Id = "PROJECT_WORKSPACE_RELATE.ID";

    /** Attribute */
    static final String ProjectId = "PROJECT_WORKSPACE_RELATE.PROJECT_ID";

    /** Attribute */
    static final String WorkspaceId = "PROJECT_WORKSPACE_RELATE.WORKSPACE_ID";

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
        static final String ProjectId = "projectId";

        /** Attribute */
        static final String WorkspaceId = "workspaceId";
    } // end DataProperty

    /**
     * Check Unique ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProjectWorkspaceRelate aProjectWorkspaceRelate)
        throws Exception;

    /**
     * insert ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertProjectWorkspaceRelate(
        ProjectWorkspaceRelate aProjectWorkspaceRelate)
        throws Exception;

    /**
     * Batch Insert ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelate)
        throws Exception;

    /**
     * Delete ProjectWorkspaceRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProjectWorkspaceRelate(final long aId) throws Exception;

    /**
     * Delete ProjectWorkspaceRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProjectWorkspaceRelate(
        ProjectWorkspaceRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateProjectWorkspaceRelate(
        ProjectWorkspaceRelate aProjectWorkspaceRelate)
        throws Exception;

    /**
     * Batch Modify ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelate)
        throws Exception;

    /**
     * Modify ProjectWorkspaceRelate  By Query Conditions
     *
     * @param aProjectWorkspaceRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProjectWorkspaceRelate(
        ProjectWorkspaceRelate aProjectWorkspaceRelate,
        ProjectWorkspaceRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProjectWorkspaceRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProjectWorkspaceRelate findProjectWorkspaceRelateById(final long aId)
        throws Exception;

    /**
     * Query ProjectWorkspaceRelate
     *
     * @param aQueryBean
     *
     * @return IProjectWorkspaceRelate[]
     *
     * @throws Exception
     *
     * @model type="IProjectWorkspaceRelate" containment="true"
     */
    ProjectWorkspaceRelate[] queryProjectWorkspaceRelate(
        ProjectWorkspaceRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProjectWorkspaceRelate
     *
     * @param aBaseQueryBean
     *
     * @return IProjectWorkspaceRelate[]
     *
     * @throws Exception
     *
     * @model type="IProjectWorkspaceRelate" containment="true"
     */

    //Map queryProjectWorkspaceRelateForMap(ProjectWorkspaceRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProjectWorkspaceRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProjectWorkspaceRelateCount(
        ProjectWorkspaceRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProjectWorkspaceRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProjectWorkspaceRelateSelective(
        ProjectWorkspaceRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelates,
        ProjectWorkspaceRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize ProjectWorkspaceRelate
     *
     * @param aProjectWorkspaceRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProjectWorkspaceRelate(
        ProjectWorkspaceRelate[] aProjectWorkspaceRelates,
        ProjectWorkspaceRelateDAOQueryBean aQueryBean,
        ProjectWorkspaceRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProjectWorkspaceRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProjectWorkspaceRelateArray DOCUMENT ME!
         * @param willUpdateProjectWorkspaceRelateArray DOCUMENT ME!
         * @param willDeleteProjectWorkspaceRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProjectWorkspaceRelate[] willAddProjectWorkspaceRelateArray,
            ProjectWorkspaceRelate[] willUpdateProjectWorkspaceRelateArray,
            ProjectWorkspaceRelate[] willDeleteProjectWorkspaceRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectWorkspaceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProjectWorkspaceRelate[] aProjectWorkspaceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectWorkspaceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProjectWorkspaceRelate[] aProjectWorkspaceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectWorkspaceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProjectWorkspaceRelate[] aProjectWorkspaceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectWorkspaceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProjectWorkspaceRelate[] aProjectWorkspaceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectWorkspaceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProjectWorkspaceRelate[] aProjectWorkspaceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectWorkspaceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProjectWorkspaceRelate[] aProjectWorkspaceRelates)
            throws Exception;
    } // end ProjectWorkspaceRelateSynchronizeCallback
} // end IBaseProjectWorkspaceRelateDAO
