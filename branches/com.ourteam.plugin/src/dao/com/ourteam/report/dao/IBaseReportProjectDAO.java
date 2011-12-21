/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportProject Data Access Object
*  GenDate 2011-09-27 11:37:57  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportProjectDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_PROJECT";

    /** Attribute */
    static final String Id = "REPORT_PROJECT.ID";

    /** Attribute */
    static final String Code = "REPORT_PROJECT.CODE";

    /** Attribute */
    static final String Name = "REPORT_PROJECT.NAME";

    /** Attribute */
    static final String Remarks = "REPORT_PROJECT.REMARKS";

    /** Attribute */
    static final String Status = "REPORT_PROJECT.STATUS";

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
        static final String Code = "code";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique ReportProject
     *
     * @param aReportProject
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportProject aReportProject)
        throws Exception;

    /**
     * insert ReportProject
     *
     * @param aReportProject
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportProject(ReportProject aReportProject)
        throws Exception;

    /**
     * Batch Insert ReportProject
     *
     * @param aReportProject
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportProject(ReportProject[] aReportProject)
        throws Exception;

    /**
     * Delete ReportProject
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportProject(final long aId) throws Exception;

    /**
     * Delete ReportProject By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportProject(ReportProjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportProject
     *
     * @param aReportProject
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportProject(ReportProject aReportProject)
        throws Exception;

    /**
     * Batch Modify ReportProject
     *
     * @param aReportProject
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportProject(ReportProject[] aReportProject)
        throws Exception;

    /**
     * Modify ReportProject  By Query Conditions
     *
     * @param aReportProject Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportProject(ReportProject aReportProject,
        ReportProjectDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportProject
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportProject findReportProjectById(final long aId)
        throws Exception;

    /**
     * Query ReportProject
     *
     * @param aQueryBean
     *
     * @return IReportProject[]
     *
     * @throws Exception
     *
     * @model type="IReportProject" containment="true"
     */
    ReportProject[] queryReportProject(ReportProjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ReportProject
     *
     * @param aBaseQueryBean
     *
     * @return IReportProject[]
     *
     * @throws Exception
     *
     * @model type="IReportProject" containment="true"
     */

    //Map queryReportProjectForMap(ReportProjectDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportProject
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportProjectCount(ReportProjectDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportProject Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportProjectSelective(ReportProjectDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ReportProject
     *
     * @param aReportProjects
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportProject(ReportProject[] aReportProjects,
        ReportProjectDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportProject
     *
     * @param aReportProjects
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportProject(ReportProject[] aReportProjects,
        ReportProjectDAOQueryBean aQueryBean,
        ReportProjectSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportProjectSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportProjectArray DOCUMENT ME!
         * @param willUpdateReportProjectArray DOCUMENT ME!
         * @param willDeleteReportProjectArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportProject[] willAddReportProjectArray,
            ReportProject[] willUpdateReportProjectArray,
            ReportProject[] willDeleteReportProjectArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportProject[] aReportProjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportProject[] aReportProjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportProject[] aReportProjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportProject[] aReportProjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportProject[] aReportProjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportProjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportProject[] aReportProjects)
            throws Exception;
    } // end ReportProjectSynchronizeCallback
} // end IBaseReportProjectDAO
