/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysSerialCode Data Access Object
*  GenDate 2011-10-28 13:34:26  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysSerialCodeDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_SERIAL_CODE";

    /** Attribute */
    static final String Id = "SYS_SERIAL_CODE.ID";

    /** Attribute */
    static final String CodeTemplate = "SYS_SERIAL_CODE.CODE_TEMPLATE";

    /** Attribute */
    static final String CodeType = "SYS_SERIAL_CODE.CODE_TYPE";

    /** Attribute */
    static final String Remarks = "SYS_SERIAL_CODE.REMARKS";

    /** Attribute */
    static final String SerialNumber = "SYS_SERIAL_CODE.SERIAL_NUMBER";

    /** Attribute */
    static final String SerialNumberIncrement = "SYS_SERIAL_CODE.SERIAL_NUMBER_INCREMENT";

    /** Attribute */
    static final String Status = "SYS_SERIAL_CODE.STATUS";

    /** Attribute */
    static final String SerialNumberFormat = "SYS_SERIAL_CODE.SERIAL_NUMBER_FORMAT";

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
        static final String CodeTemplate = "codeTemplate";

        /** Attribute */
        static final String CodeType = "codeType";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SerialNumber = "serialNumber";

        /** Attribute */
        static final String SerialNumberIncrement = "serialNumberIncrement";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SerialNumberFormat = "serialNumberFormat";
    } // end DataProperty

    /**
     * Check Unique SysSerialCode
     *
     * @param aSysSerialCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysSerialCode aSysSerialCode)
        throws Exception;

    /**
     * insert SysSerialCode
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysSerialCode(SysSerialCode aSysSerialCode)
        throws Exception;

    /**
     * Batch Insert SysSerialCode
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysSerialCode(SysSerialCode[] aSysSerialCode)
        throws Exception;

    /**
     * Delete SysSerialCode
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysSerialCode(final long aId) throws Exception;

    /**
     * Delete SysSerialCode By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysSerialCode(SysSerialCodeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysSerialCode
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysSerialCode(SysSerialCode aSysSerialCode)
        throws Exception;

    /**
     * Batch Modify SysSerialCode
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysSerialCode(SysSerialCode[] aSysSerialCode)
        throws Exception;

    /**
     * Modify SysSerialCode  By Query Conditions
     *
     * @param aSysSerialCode Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysSerialCode(SysSerialCode aSysSerialCode,
        SysSerialCodeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysSerialCode
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysSerialCode findSysSerialCodeById(final long aId)
        throws Exception;

    /**
     * Query SysSerialCode
     *
     * @param aQueryBean
     *
     * @return ISysSerialCode[]
     *
     * @throws Exception
     *
     * @model type="ISysSerialCode" containment="true"
     */
    SysSerialCode[] querySysSerialCode(SysSerialCodeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysSerialCode
     *
     * @param aBaseQueryBean
     *
     * @return ISysSerialCode[]
     *
     * @throws Exception
     *
     * @model type="ISysSerialCode" containment="true"
     */

    //Map querySysSerialCodeForMap(SysSerialCodeDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysSerialCode
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysSerialCodeCount(SysSerialCodeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysSerialCode Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysSerialCodeSelective(SysSerialCodeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysSerialCode
     *
     * @param aSysSerialCodes
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysSerialCode(SysSerialCode[] aSysSerialCodes,
        SysSerialCodeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysSerialCode
     *
     * @param aSysSerialCodes
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysSerialCode(SysSerialCode[] aSysSerialCodes,
        SysSerialCodeDAOQueryBean aQueryBean,
        SysSerialCodeSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysSerialCodeSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysSerialCodeArray DOCUMENT ME!
         * @param willUpdateSysSerialCodeArray DOCUMENT ME!
         * @param willDeleteSysSerialCodeArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysSerialCode[] willAddSysSerialCodeArray,
            SysSerialCode[] willUpdateSysSerialCodeArray,
            SysSerialCode[] willDeleteSysSerialCodeArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysSerialCodes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysSerialCode[] aSysSerialCodes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysSerialCodes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysSerialCode[] aSysSerialCodes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysSerialCodes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysSerialCode[] aSysSerialCodes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysSerialCodes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysSerialCode[] aSysSerialCodes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysSerialCodes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysSerialCode[] aSysSerialCodes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysSerialCodes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysSerialCode[] aSysSerialCodes)
            throws Exception;
    } // end SysSerialCodeSynchronizeCallback
} // end IBaseSysSerialCodeDAO
