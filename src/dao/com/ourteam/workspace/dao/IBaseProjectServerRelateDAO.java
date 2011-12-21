/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProjectServerRelate Data Access Object
*  GenDate 2011-09-22 10:17:22  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProjectServerRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PROJECT_SERVER_RELATE";

    /** Attribute */
    static final String Id = "PROJECT_SERVER_RELATE.ID";

    /** Attribute */
    static final String MiddleWareId = "PROJECT_SERVER_RELATE.MIDDLE_WARE_ID";

    /** Attribute */
    static final String ProjectId = "PROJECT_SERVER_RELATE.PROJECT_ID";

    /** Attribute */
    static final String Status = "PROJECT_SERVER_RELATE.STATUS";

    /** Attribute */
    static final String ServerType = "middleWareA.TYPE";

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
        static final String MiddleWareId = "middleWareId";

        /** Attribute */
        static final String ProjectId = "projectId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ServerType = "serverType";
    } // end DataProperty

    /**
     * Check Unique ProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProjectServerRelate aProjectServerRelate)
        throws Exception;

    /**
     * insert ProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertProjectServerRelate(ProjectServerRelate aProjectServerRelate)
        throws Exception;

    /**
     * Batch Insert ProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelate) throws Exception;

    /**
     * Delete ProjectServerRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProjectServerRelate(final long aId) throws Exception;

    /**
     * Delete ProjectServerRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProjectServerRelate(ProjectServerRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateProjectServerRelate(ProjectServerRelate aProjectServerRelate)
        throws Exception;

    /**
     * Batch Modify ProjectServerRelate
     *
     * @param aProjectServerRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelate) throws Exception;

    /**
     * Modify ProjectServerRelate  By Query Conditions
     *
     * @param aProjectServerRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProjectServerRelate(ProjectServerRelate aProjectServerRelate,
        ProjectServerRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProjectServerRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProjectServerRelate findProjectServerRelateById(final long aId)
        throws Exception;

    /**
     * Query ProjectServerRelate
     *
     * @param aQueryBean
     *
     * @return IProjectServerRelate[]
     *
     * @throws Exception
     *
     * @model type="IProjectServerRelate" containment="true"
     */
    ProjectServerRelate[] queryProjectServerRelate(
        ProjectServerRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProjectServerRelate
     *
     * @param aBaseQueryBean
     *
     * @return IProjectServerRelate[]
     *
     * @throws Exception
     *
     * @model type="IProjectServerRelate" containment="true"
     */

    //Map queryProjectServerRelateForMap(ProjectServerRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProjectServerRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProjectServerRelateCount(
        ProjectServerRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProjectServerRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProjectServerRelateSelective(
        ProjectServerRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ProjectServerRelate
     *
     * @param aProjectServerRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelates,
        ProjectServerRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ProjectServerRelate
     *
     * @param aProjectServerRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProjectServerRelate(
        ProjectServerRelate[] aProjectServerRelates,
        ProjectServerRelateDAOQueryBean aQueryBean,
        ProjectServerRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProjectServerRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProjectServerRelateArray DOCUMENT ME!
         * @param willUpdateProjectServerRelateArray DOCUMENT ME!
         * @param willDeleteProjectServerRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProjectServerRelate[] willAddProjectServerRelateArray,
            ProjectServerRelate[] willUpdateProjectServerRelateArray,
            ProjectServerRelate[] willDeleteProjectServerRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectServerRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProjectServerRelate[] aProjectServerRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectServerRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProjectServerRelate[] aProjectServerRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectServerRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProjectServerRelate[] aProjectServerRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectServerRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProjectServerRelate[] aProjectServerRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectServerRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProjectServerRelate[] aProjectServerRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProjectServerRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProjectServerRelate[] aProjectServerRelates)
            throws Exception;
    } // end ProjectServerRelateSynchronizeCallback
} // end IBaseProjectServerRelateDAO
