/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IObjectRelationAttr Data Access Object
*  GenDate 2011-09-22 10:16:44  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseObjectRelationAttrDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "OBJECT_RELATION_ATTR";

    /** Attribute */
    static final String ObjectRelationAttrId = "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID";

    /** Attribute */
    static final String ObjectRelationId = "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID";

    /** Attribute */
    static final String PropertyId = "OBJECT_RELATION_ATTR.PROPERTY_ID";

    /** Attribute */
    static final String RelatedPropertyId = "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID";

    /** Attribute */
    static final String ObjectRelationDescription = "objectRelation.DESCRIPTION";

    /** Attribute */
    static final String PropertyDataSize = "property.DATA_SIZE";

    /** Attribute */
    static final String PropertyDataType = "property.DATA_TYPE";

    /** Attribute */
    static final String PropertyDescription = "property.DESCRIPTION";

    /** Attribute */
    static final String PropertyIsEnum = "property.IS_ENUM";

    /** Attribute */
    static final String PropertyIsGenerate = "property.IS_GENERATE";

    /** Attribute */
    static final String PropertyIsPrimaryProperty = "property.IS_PRIMARY_PROPERTY";

    /** Attribute */
    static final String PropertyName = "property.NAME";

    /** Attribute */
    static final String PropertyObjectId = "property.OBJECT_ID";

    /** Attribute */
    static final String PropertyOrderIndex = "property.ORDER_INDEX";

    /** Attribute */
    static final String PropertyKind = "property.PROPERTY_KIND";

    /** Attribute */
    static final String PropertyState = "property.STATE";

    /** Attribute */
    static final String PropertyType = "property.TYPE";

    /** Attribute */
    static final String PropertyValue = "property.VALUE";

    /** Attribute */
    static final String RelatedPropertyDataSize = "relatedProperty.DATA_SIZE";

    /** Attribute */
    static final String RelatedPropertyDataType = "relatedProperty.DATA_TYPE";

    /** Attribute */
    static final String RelatedPropertyDescription = "relatedProperty.DESCRIPTION";

    /** Attribute */
    static final String RelatedPropertyIsEnum = "relatedProperty.IS_ENUM";

    /** Attribute */
    static final String RelatedPropertyIsGenerate = "relatedProperty.IS_GENERATE";

    /** Attribute */
    static final String RelatedPropertyIsPrimaryProperty = "relatedProperty.IS_PRIMARY_PROPERTY";

    /** Attribute */
    static final String RelatedPropertyName = "relatedProperty.NAME";

    /** Attribute */
    static final String RelatedPropertyObjectId = "relatedProperty.OBJECT_ID";

    /** Attribute */
    static final String RelatedPropertyOrderIndex = "relatedProperty.ORDER_INDEX";

    /** Attribute */
    static final String RelatedPropertyKind = "relatedProperty.PROPERTY_KIND";

    /** Attribute */
    static final String RelatedPropertyState = "relatedProperty.STATE";

    /** Attribute */
    static final String RelatedPropertyType = "relatedProperty.TYPE";

    /** Attribute */
    static final String RelatedPropertyValue = "relatedProperty.VALUE";

    /** Attribute */
    static final String RelateAttrType = "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE";

    /** Attribute */
    static final String PropertyIsUnique = "property.IS_UNIQUE";

    /** Attribute */
    static final String RelatedPropertyIsUnique = "relatedProperty.IS_UNIQUE";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ObjectRelationAttrId = "objectRelationAttrId";

        /** Attribute */
        static final String ObjectRelationId = "objectRelationId";

        /** Attribute */
        static final String PropertyId = "propertyId";

        /** Attribute */
        static final String RelatedPropertyId = "relatedPropertyId";

        /** Attribute */
        static final String ObjectRelationDescription = "objectRelationDescription";

        /** Attribute */
        static final String PropertyDataSize = "propertyDataSize";

        /** Attribute */
        static final String PropertyDataType = "propertyDataType";

        /** Attribute */
        static final String PropertyDescription = "propertyDescription";

        /** Attribute */
        static final String PropertyIsEnum = "propertyIsEnum";

        /** Attribute */
        static final String PropertyIsGenerate = "propertyIsGenerate";

        /** Attribute */
        static final String PropertyIsPrimaryProperty = "propertyIsPrimaryProperty";

        /** Attribute */
        static final String PropertyName = "propertyName";

        /** Attribute */
        static final String PropertyObjectId = "propertyObjectId";

        /** Attribute */
        static final String PropertyOrderIndex = "propertyOrderIndex";

        /** Attribute */
        static final String PropertyKind = "propertyKind";

        /** Attribute */
        static final String PropertyState = "propertyState";

        /** Attribute */
        static final String PropertyType = "propertyType";

        /** Attribute */
        static final String PropertyValue = "propertyValue";

        /** Attribute */
        static final String RelatedPropertyDataSize = "relatedPropertyDataSize";

        /** Attribute */
        static final String RelatedPropertyDataType = "relatedPropertyDataType";

        /** Attribute */
        static final String RelatedPropertyDescription = "relatedPropertyDescription";

        /** Attribute */
        static final String RelatedPropertyIsEnum = "relatedPropertyIsEnum";

        /** Attribute */
        static final String RelatedPropertyIsGenerate = "relatedPropertyIsGenerate";

        /** Attribute */
        static final String RelatedPropertyIsPrimaryProperty = "relatedPropertyIsPrimaryProperty";

        /** Attribute */
        static final String RelatedPropertyName = "relatedPropertyName";

        /** Attribute */
        static final String RelatedPropertyObjectId = "relatedPropertyObjectId";

        /** Attribute */
        static final String RelatedPropertyOrderIndex = "relatedPropertyOrderIndex";

        /** Attribute */
        static final String RelatedPropertyKind = "relatedPropertyKind";

        /** Attribute */
        static final String RelatedPropertyState = "relatedPropertyState";

        /** Attribute */
        static final String RelatedPropertyType = "relatedPropertyType";

        /** Attribute */
        static final String RelatedPropertyValue = "relatedPropertyValue";

        /** Attribute */
        static final String RelateAttrType = "relateAttrType";

        /** Attribute */
        static final String PropertyIsUnique = "propertyIsUnique";

        /** Attribute */
        static final String RelatedPropertyIsUnique = "relatedPropertyIsUnique";
    } // end DataProperty

    /**
     * Check Unique ObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ObjectRelationAttr aObjectRelationAttr)
        throws Exception;

    /**
     * insert ObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     *
     * @model
     */
    void insertObjectRelationAttr(ObjectRelationAttr aObjectRelationAttr)
        throws Exception;

    /**
     * Batch Insert ObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertObjectRelationAttr(ObjectRelationAttr[] aObjectRelationAttr)
        throws Exception;

    /**
     * Delete ObjectRelationAttr
     *
     * @param aObjectRelationAttrId long aObjectRelationAttrId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectRelationAttr(final long aObjectRelationAttrId)
        throws Exception;

    /**
     * Delete ObjectRelationAttr By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectRelationAttr(ObjectRelationAttrDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectRelationAttr(ObjectRelationAttr aObjectRelationAttr)
        throws Exception;

    /**
     * Batch Modify ObjectRelationAttr
     *
     * @param aObjectRelationAttr
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateObjectRelationAttr(ObjectRelationAttr[] aObjectRelationAttr)
        throws Exception;

    /**
     * Modify ObjectRelationAttr  By Query Conditions
     *
     * @param aObjectRelationAttr Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectRelationAttr(ObjectRelationAttr aObjectRelationAttr,
        ObjectRelationAttrDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ObjectRelationAttr
     *
     * @param aObjectRelationAttrId long aObjectRelationAttrId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ObjectRelationAttr findObjectRelationAttrById(
        final long aObjectRelationAttrId) throws Exception;

    /**
     * Query ObjectRelationAttr
     *
     * @param aQueryBean
     *
     * @return IObjectRelationAttr[]
     *
     * @throws Exception
     *
     * @model type="IObjectRelationAttr" containment="true"
     */
    ObjectRelationAttr[] queryObjectRelationAttr(
        ObjectRelationAttrDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ObjectRelationAttr
     *
     * @param aBaseQueryBean
     *
     * @return IObjectRelationAttr[]
     *
     * @throws Exception
     *
     * @model type="IObjectRelationAttr" containment="true"
     */

    //Map queryObjectRelationAttrForMap(ObjectRelationAttrDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ObjectRelationAttr
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryObjectRelationAttrCount(
        ObjectRelationAttrDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ObjectRelationAttr Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryObjectRelationAttrSelective(
        ObjectRelationAttrDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ObjectRelationAttr
     *
     * @param aObjectRelationAttrs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectRelationAttr(
        ObjectRelationAttr[] aObjectRelationAttrs,
        ObjectRelationAttrDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ObjectRelationAttr
     *
     * @param aObjectRelationAttrs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectRelationAttr(
        ObjectRelationAttr[] aObjectRelationAttrs,
        ObjectRelationAttrDAOQueryBean aQueryBean,
        ObjectRelationAttrSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ObjectRelationAttrSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddObjectRelationAttrArray DOCUMENT ME!
         * @param willUpdateObjectRelationAttrArray DOCUMENT ME!
         * @param willDeleteObjectRelationAttrArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ObjectRelationAttr[] willAddObjectRelationAttrArray,
            ObjectRelationAttr[] willUpdateObjectRelationAttrArray,
            ObjectRelationAttr[] willDeleteObjectRelationAttrArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelationAttrs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ObjectRelationAttr[] aObjectRelationAttrs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelationAttrs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ObjectRelationAttr[] aObjectRelationAttrs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelationAttrs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ObjectRelationAttr[] aObjectRelationAttrs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelationAttrs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ObjectRelationAttr[] aObjectRelationAttrs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelationAttrs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ObjectRelationAttr[] aObjectRelationAttrs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelationAttrs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ObjectRelationAttr[] aObjectRelationAttrs)
            throws Exception;
    } // end ObjectRelationAttrSynchronizeCallback
} // end IBaseObjectRelationAttrDAO
