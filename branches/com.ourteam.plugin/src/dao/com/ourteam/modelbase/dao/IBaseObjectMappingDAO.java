/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IObjectMapping Data Access Object
*  GenDate 2011-09-22 10:16:40  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseObjectMappingDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "OBJECT_MAPPING";

    /** Attribute */
    static final String ObjectMappingId = "OBJECT_MAPPING.OBJECT_MAPPING_ID";

    /** Attribute */
    static final String BusinessObjectId = "OBJECT_MAPPING.BUSINESS_OBJECT_ID";

    /** Attribute */
    static final String PersistentObjectId = "OBJECT_MAPPING.PERSISTENT_OBJECT_ID";

    /** Attribute */
    static final String State = "OBJECT_MAPPING.STATE";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ObjectMappingId = "objectMappingId";

        /** Attribute */
        static final String BusinessObjectId = "businessObjectId";

        /** Attribute */
        static final String PersistentObjectId = "persistentObjectId";

        /** Attribute */
        static final String State = "state";
    } // end DataProperty

    /**
     * Check Unique ObjectMapping
     *
     * @param aObjectMapping
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ObjectMapping aObjectMapping)
        throws Exception;

    /**
     * insert ObjectMapping
     *
     * @param aObjectMapping
     *
     * @throws Exception
     *
     * @model
     */
    void insertObjectMapping(ObjectMapping aObjectMapping)
        throws Exception;

    /**
     * Batch Insert ObjectMapping
     *
     * @param aObjectMapping
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertObjectMapping(ObjectMapping[] aObjectMapping)
        throws Exception;

    /**
     * Delete ObjectMapping
     *
     * @param aObjectMappingId long aObjectMappingId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectMapping(final long aObjectMappingId)
        throws Exception;

    /**
     * Delete ObjectMapping By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectMapping(ObjectMappingDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ObjectMapping
     *
     * @param aObjectMapping
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectMapping(ObjectMapping aObjectMapping)
        throws Exception;

    /**
     * Batch Modify ObjectMapping
     *
     * @param aObjectMapping
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateObjectMapping(ObjectMapping[] aObjectMapping)
        throws Exception;

    /**
     * Modify ObjectMapping  By Query Conditions
     *
     * @param aObjectMapping Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectMapping(ObjectMapping aObjectMapping,
        ObjectMappingDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ObjectMapping
     *
     * @param aObjectMappingId long aObjectMappingId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ObjectMapping findObjectMappingById(final long aObjectMappingId)
        throws Exception;

    /**
     * Query ObjectMapping
     *
     * @param aQueryBean
     *
     * @return IObjectMapping[]
     *
     * @throws Exception
     *
     * @model type="IObjectMapping" containment="true"
     */
    ObjectMapping[] queryObjectMapping(ObjectMappingDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ObjectMapping
     *
     * @param aBaseQueryBean
     *
     * @return IObjectMapping[]
     *
     * @throws Exception
     *
     * @model type="IObjectMapping" containment="true"
     */

    //Map queryObjectMappingForMap(ObjectMappingDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ObjectMapping
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryObjectMappingCount(ObjectMappingDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ObjectMapping Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryObjectMappingSelective(ObjectMappingDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ObjectMapping
     *
     * @param aObjectMappings
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectMapping(ObjectMapping[] aObjectMappings,
        ObjectMappingDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ObjectMapping
     *
     * @param aObjectMappings
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectMapping(ObjectMapping[] aObjectMappings,
        ObjectMappingDAOQueryBean aQueryBean,
        ObjectMappingSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ObjectMappingSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddObjectMappingArray DOCUMENT ME!
         * @param willUpdateObjectMappingArray DOCUMENT ME!
         * @param willDeleteObjectMappingArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ObjectMapping[] willAddObjectMappingArray,
            ObjectMapping[] willUpdateObjectMappingArray,
            ObjectMapping[] willDeleteObjectMappingArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectMappings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ObjectMapping[] aObjectMappings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectMappings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ObjectMapping[] aObjectMappings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectMappings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ObjectMapping[] aObjectMappings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectMappings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ObjectMapping[] aObjectMappings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectMappings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ObjectMapping[] aObjectMappings)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectMappings DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ObjectMapping[] aObjectMappings)
            throws Exception;
    } // end ObjectMappingSynchronizeCallback
} // end IBaseObjectMappingDAO
