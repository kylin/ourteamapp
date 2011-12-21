/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IObjectRelation Data Access Object
*  GenDate 2011-09-22 10:16:43  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseObjectRelationDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "OBJECT_RELATION";

    /** Attribute */
    static final String ObjectRelationId = "OBJECT_RELATION.OBJECT_RELATION_ID";

    /** Attribute */
    static final String Description = "OBJECT_RELATION.DESCRIPTION";

    /** Attribute */
    static final String ObjectId = "OBJECT_RELATION.OBJECT_ID";

    /** Attribute */
    static final String RelatedObjectId = "OBJECT_RELATION.RELATED_OBJECT_ID";

    /** Attribute */
    static final String RelateConfig = "OBJECT_RELATION.RELATE_CONFIG";

    /** Attribute */
    static final String RelateType = "OBJECT_RELATION.RELATE_TYPE";

    /** Attribute */
    static final String RelatedBusinessObjectName = "relatedBusinessObject.NAME";

    /** Attribute */
    static final String RelatedBusinessObjectType = "relatedBusinessObject.TYPE";

    /** Attribute */
    static final String RelatedBusinessPackageName = "relatedBusinessPackage.NAME";

    /** Attribute */
    static final String RelatedBusinessPackageId = "relatedBusinessObject.PACKAGE_ID";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ObjectRelationId = "objectRelationId";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String ObjectId = "objectId";

        /** Attribute */
        static final String RelatedObjectId = "relatedObjectId";

        /** Attribute */
        static final String RelateConfig = "relateConfig";

        /** Attribute */
        static final String RelateType = "relateType";

        /** Attribute */
        static final String RelatedBusinessObjectName = "relatedBusinessObjectName";

        /** Attribute */
        static final String RelatedBusinessObjectType = "relatedBusinessObjectType";

        /** Attribute */
        static final String RelatedBusinessPackageName = "relatedBusinessPackageName";

        /** Attribute */
        static final String RelatedBusinessPackageId = "relatedBusinessPackageId";
    } // end DataProperty

    /**
     * Check Unique ObjectRelation
     *
     * @param aObjectRelation
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ObjectRelation aObjectRelation)
        throws Exception;

    /**
     * insert ObjectRelation
     *
     * @param aObjectRelation
     *
     * @throws Exception
     *
     * @model
     */
    void insertObjectRelation(ObjectRelation aObjectRelation)
        throws Exception;

    /**
     * Batch Insert ObjectRelation
     *
     * @param aObjectRelation
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertObjectRelation(ObjectRelation[] aObjectRelation)
        throws Exception;

    /**
     * Delete ObjectRelation
     *
     * @param aObjectRelationId long aObjectRelationId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectRelation(final long aObjectRelationId)
        throws Exception;

    /**
     * Delete ObjectRelation By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectRelation(ObjectRelationDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ObjectRelation
     *
     * @param aObjectRelation
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectRelation(ObjectRelation aObjectRelation)
        throws Exception;

    /**
     * Batch Modify ObjectRelation
     *
     * @param aObjectRelation
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateObjectRelation(ObjectRelation[] aObjectRelation)
        throws Exception;

    /**
     * Modify ObjectRelation  By Query Conditions
     *
     * @param aObjectRelation Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectRelation(ObjectRelation aObjectRelation,
        ObjectRelationDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ObjectRelation
     *
     * @param aObjectRelationId long aObjectRelationId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ObjectRelation findObjectRelationById(final long aObjectRelationId)
        throws Exception;

    /**
     * Query ObjectRelation
     *
     * @param aQueryBean
     *
     * @return IObjectRelation[]
     *
     * @throws Exception
     *
     * @model type="IObjectRelation" containment="true"
     */
    ObjectRelation[] queryObjectRelation(ObjectRelationDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ObjectRelation
     *
     * @param aBaseQueryBean
     *
     * @return IObjectRelation[]
     *
     * @throws Exception
     *
     * @model type="IObjectRelation" containment="true"
     */

    //Map queryObjectRelationForMap(ObjectRelationDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ObjectRelation
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryObjectRelationCount(ObjectRelationDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ObjectRelation Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryObjectRelationSelective(
        ObjectRelationDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ObjectRelation
     *
     * @param aObjectRelations
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectRelation(ObjectRelation[] aObjectRelations,
        ObjectRelationDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ObjectRelation
     *
     * @param aObjectRelations
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeObjectRelation(ObjectRelation[] aObjectRelations,
        ObjectRelationDAOQueryBean aQueryBean,
        ObjectRelationSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ObjectRelationSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddObjectRelationArray DOCUMENT ME!
         * @param willUpdateObjectRelationArray DOCUMENT ME!
         * @param willDeleteObjectRelationArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ObjectRelation[] willAddObjectRelationArray,
            ObjectRelation[] willUpdateObjectRelationArray,
            ObjectRelation[] willDeleteObjectRelationArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelations DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ObjectRelation[] aObjectRelations)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelations DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ObjectRelation[] aObjectRelations)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelations DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ObjectRelation[] aObjectRelations)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelations DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ObjectRelation[] aObjectRelations)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelations DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ObjectRelation[] aObjectRelations)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aObjectRelations DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ObjectRelation[] aObjectRelations)
            throws Exception;
    } // end ObjectRelationSynchronizeCallback

    /**
     * Query Related IObjectRelationAttr
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IObjectRelationAttr" containment="true"
     */
    com.ourteam.modelbase.dao.ObjectRelationAttr[] queryObjectRelationAttrs(
        ObjectRelationDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IObjectRelationAttr to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IObjectRelationAttr" containment="true"
     */

    //Map queryObjectRelationAttrsForMap(ObjectRelationDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IObjectRelationAttr Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryObjectRelationAttrsSelective(
        ObjectRelationDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related IObjectRelationAttr
     *
     * @param aObjectRelationAttr {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectRelationAttr(
        com.ourteam.modelbase.dao.ObjectRelationAttr aObjectRelationAttr,
        ObjectRelationDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IObjectRelationAttr
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectRelationAttr(ObjectRelationDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseObjectRelationDAO
