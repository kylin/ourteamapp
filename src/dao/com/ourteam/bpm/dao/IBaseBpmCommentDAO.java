/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmComment Data Access Object
*  GenDate 2011-12-02 13:52:02  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmCommentDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_COMMENT";

    /** Attribute */
    static final String Id = "BPM_COMMENT.ID";

    /** Attribute */
    static final String AuthorDate = "BPM_COMMENT.AUTHOR_DATE";

    /** Attribute */
    static final String AuthorId = "BPM_COMMENT.AUTHOR_ID";

    /** Attribute */
    static final String Comment = "BPM_COMMENT.COMMENT";

    /** Attribute */
    static final String ProcessInstanceId = "BPM_COMMENT.PROCESS_INSTANCE_ID";

    /** Attribute */
    static final String Status = "BPM_COMMENT.STATUS";

    /** Attribute */
    static final String AuthorName = "authorA.NAME";

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
        static final String AuthorDate = "authorDate";

        /** Attribute */
        static final String AuthorId = "authorId";

        /** Attribute */
        static final String Comment = "comment";

        /** Attribute */
        static final String ProcessInstanceId = "processInstanceId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String AuthorName = "authorName";
    } // end DataProperty

    /**
     * Check Unique BpmComment
     *
     * @param aBpmComment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmComment aBpmComment) throws Exception;

    /**
     * insert BpmComment
     *
     * @param aBpmComment
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmComment(BpmComment aBpmComment) throws Exception;

    /**
     * Batch Insert BpmComment
     *
     * @param aBpmComment
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmComment(BpmComment[] aBpmComment)
        throws Exception;

    /**
     * Delete BpmComment
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmComment(final long aId) throws Exception;

    /**
     * Delete BpmComment By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmComment(BpmCommentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmComment
     *
     * @param aBpmComment
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmComment(BpmComment aBpmComment) throws Exception;

    /**
     * Batch Modify BpmComment
     *
     * @param aBpmComment
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmComment(BpmComment[] aBpmComment)
        throws Exception;

    /**
     * Modify BpmComment  By Query Conditions
     *
     * @param aBpmComment Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmComment(BpmComment aBpmComment,
        BpmCommentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmComment
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmComment findBpmCommentById(final long aId) throws Exception;

    /**
     * Query BpmComment
     *
     * @param aQueryBean
     *
     * @return IBpmComment[]
     *
     * @throws Exception
     *
     * @model type="IBpmComment" containment="true"
     */
    BpmComment[] queryBpmComment(BpmCommentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmComment
     *
     * @param aBaseQueryBean
     *
     * @return IBpmComment[]
     *
     * @throws Exception
     *
     * @model type="IBpmComment" containment="true"
     */

    //Map queryBpmCommentForMap(BpmCommentDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmComment
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmCommentCount(BpmCommentDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmComment Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmCommentSelective(BpmCommentDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmComment
     *
     * @param aBpmComments
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmComment(BpmComment[] aBpmComments,
        BpmCommentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmComment
     *
     * @param aBpmComments
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmComment(BpmComment[] aBpmComments,
        BpmCommentDAOQueryBean aQueryBean,
        BpmCommentSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmCommentSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmCommentArray DOCUMENT ME!
         * @param willUpdateBpmCommentArray DOCUMENT ME!
         * @param willDeleteBpmCommentArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(BpmComment[] willAddBpmCommentArray,
            BpmComment[] willUpdateBpmCommentArray,
            BpmComment[] willDeleteBpmCommentArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmComments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmComment[] aBpmComments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmComments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmComment[] aBpmComments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmComments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmComment[] aBpmComments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmComments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmComment[] aBpmComments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmComments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmComment[] aBpmComments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmComments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmComment[] aBpmComments) throws Exception;
    } // end BpmCommentSynchronizeCallback
} // end IBaseBpmCommentDAO
