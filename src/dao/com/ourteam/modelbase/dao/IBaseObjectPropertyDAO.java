/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IObjectProperty Data Access Object
*  GenDate 2011-09-22 10:16:41  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseObjectPropertyDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "OBJECT_PROPERTY";

    /** Attribute */
    static final String ObjectPropertyId = "OBJECT_PROPERTY.OBJECT_PROPERTY";

    /** Attribute */
    static final String DataSize = "OBJECT_PROPERTY.DATA_SIZE";

    /** Attribute */
    static final String DataType = "OBJECT_PROPERTY.DATA_TYPE";

    /** Attribute */
    static final String Description = "OBJECT_PROPERTY.DESCRIPTION";

    /** Attribute */
    static final String IsEnum = "OBJECT_PROPERTY.IS_ENUM";

    /** Attribute */
    static final String IsGenerate = "OBJECT_PROPERTY.IS_GENERATE";

    /** Attribute */
    static final String IsPrimaryProperty = "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY";

    /** Attribute */
    static final String Name = "OBJECT_PROPERTY.NAME";

    /** Attribute */
    static final String ObjectId = "OBJECT_PROPERTY.OBJECT_ID";

    /** Attribute */
    static final String OrderIndex = "OBJECT_PROPERTY.ORDER_INDEX";

    /** Attribute */
    static final String PropertyKind = "OBJECT_PROPERTY.PROPERTY_KIND";

    /** Attribute */
    static final String State = "OBJECT_PROPERTY.STATE";

    /** Attribute */
    static final String Type = "OBJECT_PROPERTY.TYPE";

    /** Attribute */
    static final String Value = "OBJECT_PROPERTY.VALUE";

    /** Attribute */
    static final String IsUnique = "OBJECT_PROPERTY.IS_UNIQUE";

    /** Attribute */
    static final String ObjectName = "businessObject.NAME";

    /** Attribute */
    static final String IsAllowNull = "OBJECT_PROPERTY.IS_ALLOW_NULL";

    /** Attribute */
    static final String PrecisionSize = "OBJECT_PROPERTY.PRECISION_SIZE";

    /** Attribute */
    static final String IsReadable = "OBJECT_PROPERTY.IS_READ_ABLE";

    /** Attribute */
    static final String IsWritable = "OBJECT_PROPERTY.IS_WRIT_ABLE";

    /** Attribute */
    static final String IsArray = "OBJECT_PROPERTY.IS_ARRAY";

    /** Attribute */
    static final String ReferenceObjectId = "OBJECT_PROPERTY.REFERENCE_OBJECT_ID";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ObjectPropertyId = "objectPropertyId";

        /** Attribute */
        static final String DataSize = "dataSize";

        /** Attribute */
        static final String DataType = "dataType";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String IsEnum = "isEnum";

        /** Attribute */
        static final String IsGenerate = "isGenerate";

        /** Attribute */
        static final String IsPrimaryProperty = "isPrimaryProperty";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String ObjectId = "objectId";

        /** Attribute */
        static final String OrderIndex = "orderIndex";

        /** Attribute */
        static final String PropertyKind = "propertyKind";

        /** Attribute */
        static final String State = "state";

        /** Attribute */
        static final String Type = "type";

        /** Attribute */
        static final String Value = "value";

        /** Attribute */
        static final String IsUnique = "isUnique";

        /** Attribute */
        static final String ObjectName = "objectName";

        /** Attribute */
        static final String IsAllowNull = "isAllowNull";

        /** Attribute */
        static final String PrecisionSize = "precisionSize";

        /** Attribute */
        static final String IsReadable = "isReadable";

        /** Attribute */
        static final String IsWritable = "isWritable";

        /** Attribute */
        static final String IsArray = "isArray";

        /** Attribute */
        static final String ReferenceObjectId = "referenceObjectId";
    } // end DataProperty

    /**
     * Check Unique ObjectProperty
     *
     * @param aObjectProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ObjectProperty aObjectProperty)
        throws Exception;

    /**
     * insert ObjectProperty
     *
     * @param aObjectProperty
     *
     * @throws Exception
     *
     * @model
     */
    void insertObjectProperty(ObjectProperty aObjectProperty)
        throws Exception;

    /**
     * Batch Insert ObjectProperty
     *
     * @param aObjectProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertObjectProperty(ObjectProperty[] aObjectProperty)
        throws Exception;

    /**
     * Delete ObjectProperty
     *
     * @param aObjectPropertyId long aObjectPropertyId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectProperty(final long aObjectPropertyId)
        throws Exception;

    /**
     * Delete ObjectProperty By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectProperty(ObjectPropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ObjectProperty
     *
     * @param aObjectProperty
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectProperty(ObjectProperty aObjectProperty)
        throws Exception;

    /**
     * Batch Modify ObjectProperty
     *
     * @param aObjectProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateObjectProperty(ObjectProperty[] aObjectProperty)
        throws Exception;

    /**
     * Modify ObjectProperty  By Query Conditions
     *
     * @param aObjectProperty Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectProperty(ObjectProperty aObjectProperty,
        ObjectPropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ObjectProperty
     *
     * @param aObjectPropertyId long aObjectPropertyId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ObjectProperty findObjectPropertyById(final long aObjectPropertyId)
        throws Exception;

    /**
     * Query ObjectProperty
     *
     * @param aQueryBean
     *
     * @return IObjectProperty[]
     *
     * @throws Exception
     *
     * @model type="IObjectProperty" containment="true"
     */
    ObjectProperty[] queryObjectProperty(ObjectPropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ObjectProperty
     *
     * @param aBaseQueryBean
     *
     * @return IObjectProperty[]
     *
     * @throws Exception
     *
     * @model type="IObjectProperty" containment="true"
     */

    //Map queryObjectPropertyForMap(ObjectPropertyDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ObjectProperty
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryObjectPropertyCount(ObjectPropertyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ObjectProperty Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryObjectPropertySelective(
        ObjectPropertyDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ObjectProperty
     *
     * @param aObjectPropertys
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectProperty(ObjectProperty[] aObjectPropertys,
        ObjectPropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ObjectProperty
     *
     * @param aObjectPropertys
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectProperty(ObjectProperty[] aObjectPropertys,
        ObjectPropertyDAOQueryBean aQueryBean,
        ObjectPropertySynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ObjectPropertySynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddObjectPropertyArray DOCUMENT ME!
         * @param willUpdateObjectPropertyArray DOCUMENT ME!
         * @param willDeleteObjectPropertyArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ObjectProperty[] willAddObjectPropertyArray,
            ObjectProperty[] willUpdateObjectPropertyArray,
            ObjectProperty[] willDeleteObjectPropertyArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ObjectProperty[] aObjectPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ObjectProperty[] aObjectPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ObjectProperty[] aObjectPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ObjectProperty[] aObjectPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ObjectProperty[] aObjectPropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectPropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ObjectProperty[] aObjectPropertys)
            throws Exception;
    } // end ObjectPropertySynchronizeCallback
} // end IBaseObjectPropertyDAO
