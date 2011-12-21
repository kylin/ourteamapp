/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.project.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProject Data Access Object
*  GenDate 2011-09-22 10:17:45  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProjectDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PROJECT";

    /** Attribute */
    static final String Id = "PROJECT.ID";

    /** Attribute */
    static final String Description = "PROJECT.DESCRIPTION";

    /** Attribute */
    static final String Name = "PROJECT.NAME";

    /** Attribute */
    static final String Status = "PROJECT.STATUS";

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
        static final String Name = "name";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique Project
     *
     * @param aProject
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(Project aProject) throws Exception;

    /**
     * insert Project
     *
     * @param aProject
     *
     * @throws Exception
     *
     * @model
     */
    void insertProject(Project aProject) throws Exception;

    /**
     * Batch Insert Project
     *
     * @param aProject
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProject(Project[] aProject) throws Exception;

    /**
     * Delete Project
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProject(final long aId) throws Exception;

    /**
     * Delete Project By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProject(ProjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify Project
     *
     * @param aProject
     *
     * @throws Exception
     *
     * @model
     */
    void updateProject(Project aProject) throws Exception;

    /**
     * Batch Modify Project
     *
     * @param aProject
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProject(Project[] aProject) throws Exception;

    /**
     * Modify Project  By Query Conditions
     *
     * @param aProject Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProject(Project aProject, ProjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Project
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    Project findProjectById(final long aId) throws Exception;

    /**
     * Query Project
     *
     * @param aQueryBean
     *
     * @return IProject[]
     *
     * @throws Exception
     *
     * @model type="IProject" containment="true"
     */
    Project[] queryProject(ProjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Project
     *
     * @param aBaseQueryBean
     *
     * @return IProject[]
     *
     * @throws Exception
     *
     * @model type="IProject" containment="true"
     */

    //Map queryProjectForMap(ProjectDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count Project
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProjectCount(ProjectDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query Project Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProjectSelective(ProjectDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize Project
     *
     * @param aProjects
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProject(Project[] aProjects, ProjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize Project
     *
     * @param aProjects
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProject(Project[] aProjects,
        ProjectDAOQueryBean aQueryBean, ProjectSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProjectSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProjectArray DOCUMENT ME!
         * @param willUpdateProjectArray DOCUMENT ME!
         * @param willDeleteProjectArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(Project[] willAddProjectArray,
            Project[] willUpdateProjectArray, Project[] willDeleteProjectArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(Project[] aProjects) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(Project[] aProjects) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(Project[] aProjects) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(Project[] aProjects) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(Project[] aProjects) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(Project[] aProjects) throws Exception;
    } // end ProjectSynchronizeCallback
} // end IBaseProjectDAO
