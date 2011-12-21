/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmDomainSysModuleRelate Data Access Object
*  GenDate 2011-11-04 10:00:53  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmDomainSysModuleRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_DOMAIN_SYS_MODULE_RELATE";

    /** Attribute */
    static final String Id = "BPM_DOMAIN_SYS_MODULE_RELATE.ID";

    /** Attribute */
    static final String BpmDomainId = "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID";

    /** Attribute */
    static final String Remarks = "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS";

    /** Attribute */
    static final String SysModuleId = "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID";

    /** Attribute */
    static final String ModuleName = "sysModuleF.MODULE_NAME";

    /** Attribute */
    static final String ModuleCode = "sysModuleF.MODULE_CODE";

    /** Attribute */
    static final String ModuleIcon = "sysModuleF.MODULE_ICON";

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
        static final String BpmDomainId = "bpmDomainId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SysModuleId = "sysModuleId";

        /** Attribute */
        static final String ModuleName = "moduleName";

        /** Attribute */
        static final String ModuleCode = "moduleCode";

        /** Attribute */
        static final String ModuleIcon = "moduleIcon";
    } // end DataProperty

    /**
     * Check Unique BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmDomainSysModuleRelate aBpmDomainSysModuleRelate)
        throws Exception;

    /**
     * insert BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate)
        throws Exception;

    /**
     * Batch Insert BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelate)
        throws Exception;

    /**
     * Delete BpmDomainSysModuleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmDomainSysModuleRelate(final long aId)
        throws Exception;

    /**
     * Delete BpmDomainSysModuleRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate)
        throws Exception;

    /**
     * Batch Modify BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelate)
        throws Exception;

    /**
     * Modify BpmDomainSysModuleRelate  By Query Conditions
     *
     * @param aBpmDomainSysModuleRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate,
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmDomainSysModuleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmDomainSysModuleRelate findBpmDomainSysModuleRelateById(final long aId)
        throws Exception;

    /**
     * Query BpmDomainSysModuleRelate
     *
     * @param aQueryBean
     *
     * @return IBpmDomainSysModuleRelate[]
     *
     * @throws Exception
     *
     * @model type="IBpmDomainSysModuleRelate" containment="true"
     */
    BpmDomainSysModuleRelate[] queryBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmDomainSysModuleRelate
     *
     * @param aBaseQueryBean
     *
     * @return IBpmDomainSysModuleRelate[]
     *
     * @throws Exception
     *
     * @model type="IBpmDomainSysModuleRelate" containment="true"
     */

    //Map queryBpmDomainSysModuleRelateForMap(BpmDomainSysModuleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmDomainSysModuleRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmDomainSysModuleRelateCount(
        BpmDomainSysModuleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmDomainSysModuleRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmDomainSysModuleRelateSelective(
        BpmDomainSysModuleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates,
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates,
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean,
        BpmDomainSysModuleRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmDomainSysModuleRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmDomainSysModuleRelateArray DOCUMENT ME!
         * @param willUpdateBpmDomainSysModuleRelateArray DOCUMENT ME!
         * @param willDeleteBpmDomainSysModuleRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmDomainSysModuleRelate[] willAddBpmDomainSysModuleRelateArray,
            BpmDomainSysModuleRelate[] willUpdateBpmDomainSysModuleRelateArray,
            BpmDomainSysModuleRelate[] willDeleteBpmDomainSysModuleRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomainSysModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomainSysModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomainSysModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomainSysModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomainSysModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmDomainSysModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates)
            throws Exception;
    } // end BpmDomainSysModuleRelateSynchronizeCallback
} // end IBaseBpmDomainSysModuleRelateDAO
