/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IWorkspaceResourceBusinessPackageRelate Data Access Object
*  GenDate 2011-09-22 10:17:25  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseWorkspaceResourceBusinessPackageRelateDAO
    extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE";

    /** Attribute */
    static final String Id = "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID";

    /** Attribute */
    static final String BusinessPcakageId = "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID";

    /** Attribute */
    static final String Description = "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION";

    /** Attribute */
    static final String Status = "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS";

    /** Attribute */
    static final String WorkspaceResourceId = "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID";

    /** Attribute */
    static final String BusinessPackageName = "businessPackage.NAME";

    /** Attribute */
    static final String BusinessDomainName = "businessDomain.NAME";

    /** Attribute */
    static final String BusinessDomainId = "businessPackage.BUSINESS_DOMAIN_ID";

    /** Attribute */
    static final String BusinessPackageType = "businessPackage.TYPE";

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
        static final String BusinessPcakageId = "businessPcakageId";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String WorkspaceResourceId = "workspaceResourceId";

        /** Attribute */
        static final String BusinessPackageName = "businessPackageName";

        /** Attribute */
        static final String BusinessDomainName = "businessDomainName";

        /** Attribute */
        static final String BusinessDomainId = "businessDomainId";

        /** Attribute */
        static final String BusinessPackageType = "businessPackageType";
    } // end DataProperty

    /**
     * Check Unique WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate)
        throws Exception;

    /**
     * insert WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate)
        throws Exception;

    /**
     * Batch Insert WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelate)
        throws Exception;

    /**
     * Delete WorkspaceResourceBusinessPackageRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceResourceBusinessPackageRelate(final long aId)
        throws Exception;

    /**
     * Delete WorkspaceResourceBusinessPackageRelate By Query
     * Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate)
        throws Exception;

    /**
     * Batch Modify WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelate)
        throws Exception;

    /**
     * Modify WorkspaceResourceBusinessPackageRelate  By Query
     * Conditions
     *
     * @param aWorkspaceResourceBusinessPackageRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate,
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query WorkspaceResourceBusinessPackageRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    WorkspaceResourceBusinessPackageRelate findWorkspaceResourceBusinessPackageRelateById(
        final long aId) throws Exception;

    /**
     * Query WorkspaceResourceBusinessPackageRelate
     *
     * @param aQueryBean
     *
     * @return IWorkspaceResourceBusinessPackageRelate[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceResourceBusinessPackageRelate" containment="true"
     */
    WorkspaceResourceBusinessPackageRelate[] queryWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query WorkspaceResourceBusinessPackageRelate
     *
     * @param aBaseQueryBean
     *
     * @return IWorkspaceResourceBusinessPackageRelate[]
     *
     * @throws Exception
     *
     * @model type="IWorkspaceResourceBusinessPackageRelate" containment="true"
     */

    //Map queryWorkspaceResourceBusinessPackageRelateForMap(WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count WorkspaceResourceBusinessPackageRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryWorkspaceResourceBusinessPackageRelateCount(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query WorkspaceResourceBusinessPackageRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryWorkspaceResourceBusinessPackageRelateSelective(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates,
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates,
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean,
        WorkspaceResourceBusinessPackageRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface WorkspaceResourceBusinessPackageRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddWorkspaceResourceBusinessPackageRelateArray DOCUMENT ME!
         * @param willUpdateWorkspaceResourceBusinessPackageRelateArray DOCUMENT ME!
         * @param willDeleteWorkspaceResourceBusinessPackageRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            WorkspaceResourceBusinessPackageRelate[] willAddWorkspaceResourceBusinessPackageRelateArray,
            WorkspaceResourceBusinessPackageRelate[] willUpdateWorkspaceResourceBusinessPackageRelateArray,
            WorkspaceResourceBusinessPackageRelate[] willDeleteWorkspaceResourceBusinessPackageRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(
            WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(
            WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(
            WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(
            WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(
            WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(
            WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates)
            throws Exception;
    } // end WorkspaceResourceBusinessPackageRelateSynchronizeCallback
} // end IBaseWorkspaceResourceBusinessPackageRelateDAO
