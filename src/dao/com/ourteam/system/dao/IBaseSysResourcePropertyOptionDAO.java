/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysResourcePropertyOption Data Access Object
*  GenDate 2011-09-22 10:11:17  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysResourcePropertyOptionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_RESOURCE_PROPERTY_OPTION";

    /** Attribute */
    static final String Id = "SYS_RESOURCE_PROPERTY_OPTION.ID";

    /** Attribute */
    static final String OrderIndex = "SYS_RESOURCE_PROPERTY_OPTION.ORDER_INDEX";

    /** Attribute */
    static final String Remarks = "SYS_RESOURCE_PROPERTY_OPTION.REMARKS";

    /** Attribute */
    static final String Status = "SYS_RESOURCE_PROPERTY_OPTION.STATUS";

    /** Attribute */
    static final String SysResourcePropertyId = "SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID";

    /** Attribute */
    static final String ValueCode = "SYS_RESOURCE_PROPERTY_OPTION.VALUE_CODE";

    /** Attribute */
    static final String ValueLable = "SYS_RESOURCE_PROPERTY_OPTION.VALUE_LABLE";

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
        static final String OrderIndex = "orderIndex";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SysResourcePropertyId = "sysResourcePropertyId";

        /** Attribute */
        static final String ValueCode = "valueCode";

        /** Attribute */
        static final String ValueLable = "valueLable";
    } // end DataProperty

    /**
     * Check Unique SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysResourcePropertyOption aSysResourcePropertyOption)
        throws Exception;

    /**
     * insert SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysResourcePropertyOption(
        SysResourcePropertyOption aSysResourcePropertyOption)
        throws Exception;

    /**
     * Batch Insert SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOption)
        throws Exception;

    /**
     * Delete SysResourcePropertyOption
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourcePropertyOption(final long aId)
        throws Exception;

    /**
     * Delete SysResourcePropertyOption By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourcePropertyOption(
        SysResourcePropertyOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourcePropertyOption(
        SysResourcePropertyOption aSysResourcePropertyOption)
        throws Exception;

    /**
     * Batch Modify SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOption)
        throws Exception;

    /**
     * Modify SysResourcePropertyOption  By Query Conditions
     *
     * @param aSysResourcePropertyOption Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourcePropertyOption(
        SysResourcePropertyOption aSysResourcePropertyOption,
        SysResourcePropertyOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysResourcePropertyOption
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysResourcePropertyOption findSysResourcePropertyOptionById(final long aId)
        throws Exception;

    /**
     * Query SysResourcePropertyOption
     *
     * @param aQueryBean
     *
     * @return ISysResourcePropertyOption[]
     *
     * @throws Exception
     *
     * @model type="ISysResourcePropertyOption" containment="true"
     */
    SysResourcePropertyOption[] querySysResourcePropertyOption(
        SysResourcePropertyOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysResourcePropertyOption
     *
     * @param aBaseQueryBean
     *
     * @return ISysResourcePropertyOption[]
     *
     * @throws Exception
     *
     * @model type="ISysResourcePropertyOption" containment="true"
     */

    //Map querySysResourcePropertyOptionForMap(SysResourcePropertyOptionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysResourcePropertyOption
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysResourcePropertyOptionCount(
        SysResourcePropertyOptionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysResourcePropertyOption Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysResourcePropertyOptionSelective(
        SysResourcePropertyOptionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOptions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOptions,
        SysResourcePropertyOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOptions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOptions,
        SysResourcePropertyOptionDAOQueryBean aQueryBean,
        SysResourcePropertyOptionSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysResourcePropertyOptionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysResourcePropertyOptionArray DOCUMENT ME!
         * @param willUpdateSysResourcePropertyOptionArray DOCUMENT ME!
         * @param willDeleteSysResourcePropertyOptionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysResourcePropertyOption[] willAddSysResourcePropertyOptionArray,
            SysResourcePropertyOption[] willUpdateSysResourcePropertyOptionArray,
            SysResourcePropertyOption[] willDeleteSysResourcePropertyOptionArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertyOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(
            SysResourcePropertyOption[] aSysResourcePropertyOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertyOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(
            SysResourcePropertyOption[] aSysResourcePropertyOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertyOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(
            SysResourcePropertyOption[] aSysResourcePropertyOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertyOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(
            SysResourcePropertyOption[] aSysResourcePropertyOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertyOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(
            SysResourcePropertyOption[] aSysResourcePropertyOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertyOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(
            SysResourcePropertyOption[] aSysResourcePropertyOptions)
            throws Exception;
    } // end SysResourcePropertyOptionSynchronizeCallback
} // end IBaseSysResourcePropertyOptionDAO
