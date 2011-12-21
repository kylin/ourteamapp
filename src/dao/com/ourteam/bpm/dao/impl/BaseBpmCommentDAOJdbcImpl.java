/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmComment;
import com.ourteam.bpm.dao.BpmCommentDAOQueryBean;
import com.ourteam.bpm.dao.IBpmCommentDAO;

import net.dao.AbstractJdbcDAO;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.ArrayUtils;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * DAO JDBC Impl Generate Date : 2011-12-02 13:55:34
 *
 * @author kylin
 */
abstract public class BaseBpmCommentDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmCommentDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, AuthorDate, AuthorId, Comment, ProcessInstanceId, Status,
            AuthorName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.AuthorDate, DataProperty.AuthorId,
            DataProperty.Comment, DataProperty.ProcessInstanceId,
            DataProperty.Status, DataProperty.AuthorName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { Id };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] { Id };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] {  };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseBpmCommentDAOJdbcImpl object.
     */
    public BaseBpmCommentDAOJdbcImpl() {
        super();
    } // end BaseBpmCommentDAOJdbcImpl()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getEntityName() {
        return EntityName;
    } // end getEntityName()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityFields() {
        return ENTITY_FIELDS;
    } // end getEntityFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityProperties() {
        return ENTITY_PROPERTIES;
    } // end getEntityProperties()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityPKFields() {
        return ENTITY_PK_FIELDS;
    } // end getEntityPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityAutoGenPKFields() {
        return ENTITY_AUTO_GEN_PK_FIELDS;
    } // end getEntityAutoGenPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityUniqueFields() {
        return ENTITY_UNIQUE_FIELDS;
    } // end getEntityUniqueFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getBaiscQueryFilter() {
        if (basicFilterSQL == null) {
            StringBuffer basicFilterSQLbuffer = new StringBuffer();

            basicFilterSQL = basicFilterSQLbuffer.toString();
        } // end if

        return basicFilterSQL;
    } // end getBaiscQueryFilter()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getRelatedJoinSQL() {
        if (relatedJoinSQL == null) {
            StringBuffer relatedJoinSQLBuffer = new StringBuffer();

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE authorA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(" authorA.ID = BPM_COMMENT.AUTHOR_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmComment
     *
     * @param aBpmComment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmComment aBpmComment)
        throws Exception {
        if (aBpmComment == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmComment, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmComment
     *
     * @param aBpmComment
     *
     * @throws Exception
     */
    public void insertBpmComment(BpmComment aBpmComment)
        throws Exception {
        insert(aBpmComment);
    } // end insertBpmComment()

    /**
     * Batch Insert IBpmComment
     *
     * @param aBpmComment
     *
     * @throws Exception
     */
    public void batchInsertBpmComment(BpmComment[] aBpmComment)
        throws Exception {
        batchInsert(aBpmComment);
    } // end batchInsertBpmComment()

    /**
     * Delete IBpmComment
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmComment(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmComment()

    /**
     * Delete IBpmComment
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmComment(BpmCommentDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmComment()

    /**
     * Update IBpmComment Selective
     *
     * @param aBpmComment
     *
     * @throws Exception
     */
    public void updateBpmComment(BpmComment aBpmComment)
        throws Exception {
        if (aBpmComment.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmComment);

        BpmComment tempObj = findBpmCommentById(aBpmComment.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmComment, tempObj);
        } // end if
    } // end updateBpmComment()

    /**
     * Batch Update IBpmComment
     *
     * @param aBpmComment
     *
     * @throws Exception
     */
    public void batchUpdateBpmComment(BpmComment[] aBpmComment)
        throws Exception {
        batchUpdate(aBpmComment);
    } // end batchUpdateBpmComment()

    /**
     * Update IBpmComment
     *
     * @param aBpmComment
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmComment(BpmComment aBpmComment,
        BpmCommentDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmComment, aQueryBean);
    } // end updateBpmComment()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmComment DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmComment aBpmComment)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmComments DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmComment(BpmComment[] aBpmComments,
        BpmCommentDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmComment(aBpmComments, aQueryBean, null);
    } // end synchronizeBpmComment()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmComments DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmComment(BpmComment[] aBpmComments,
        BpmCommentDAOQueryBean aQueryBean,
        BpmCommentSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmComments) == false) {
            inputList.addAll(Arrays.asList(aBpmComments));
        } // end if

        BpmComment[] existentBpmComments = this.queryBpmComment(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmComments) == false) {
            existentList.addAll(Arrays.asList(existentBpmComments));
        } // end if

        List willAddBpmComments = ListUtils.subtract(inputList, existentList);

        List willDeleteBpmComments = ListUtils.subtract(existentList, inputList);

        List willUpdateBpmComments = ListUtils.intersection(existentList,
                inputList);

        BpmComment[] willUpdateBpmCommentArray = (BpmComment[]) willUpdateBpmComments.toArray(new BpmComment[willUpdateBpmComments.size()]);
        BpmComment[] willAddBpmCommentArray = (BpmComment[]) willAddBpmComments.toArray(new BpmComment[willAddBpmComments.size()]);
        BpmComment[] willDeleteBpmCommentArray = (BpmComment[]) willDeleteBpmComments.toArray(new BpmComment[willDeleteBpmComments.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmCommentArray,
                willUpdateBpmCommentArray, willDeleteBpmCommentArray);
        } // end if

        if (willUpdateBpmComments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmCommentArray);
            } // end if

            this.batchUpdateBpmComment(willUpdateBpmCommentArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmCommentArray);
            } // end if
        } // end if

        if (willAddBpmComments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmCommentArray);
            } // end if

            this.batchInsertBpmComment(willAddBpmCommentArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmCommentArray);
            } // end if
        } // end if

        if (willDeleteBpmComments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmCommentArray);
            } // end if

            for (int i = 0; i < willDeleteBpmCommentArray.length; i++) {
                BpmComment object = willDeleteBpmCommentArray[i];
                this.deleteBpmComment(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmCommentArray);
            } // end if
        } // end if
    } // end synchronizeBpmComment()

    /**
     * Query IBpmComment
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmComment findBpmCommentById(final long aId)
        throws Exception {
        BpmCommentDAOQueryBean queryBean = new BpmCommentDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmComment[] BpmComments = queryBpmComment(queryBean);

        if (BpmComments.length == 0) {
            return null;
        } // end if
        else {
            return BpmComments[0];
        } // end else
    } // end findBpmCommentById()

    /**
     * Query IBpmComment
     *
     * @param queryBean
     *
     * @return IBpmComment[]
     *
     * @throws Exception
     */
    public BpmComment[] queryBpmComment(BpmCommentDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcBpmCommentRowMapper());

        return (BpmComment[]) result.toArray(new BpmComment[result.size()]);
    } // end queryBpmComment()

    /**
     * Query BpmComment Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmCommentSelective(BpmCommentDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmCommentSelective()

    /**
     * Query IBpmComment Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmCommentCount(BpmCommentDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmCommentCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmCommentRowMapper
        implements ParameterizedRowMapper {
        /**
         * DOCUMENT ME!
         *
         * @param resultSet DOCUMENT ME!
         * @param arg1 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         *
         * @throws SQLException DOCUMENT ME!
         */
        public Object mapRow(ResultSet resultSet, int arg1)
            throws SQLException {
            BpmComment object = new BpmComment();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object AuthorDate = resultSet.getObject(columnIndex++);

                object.setAuthorDateNull(resultSet.getBoolean(columnIndex++));

                if (AuthorDate != null) {
                    BeanUtils.setProperty(object, DataProperty.AuthorDate,
                        AuthorDate);
                } // end if

                Object AuthorId = resultSet.getObject(columnIndex++);

                object.setAuthorIdNull(resultSet.getBoolean(columnIndex++));

                if (AuthorId != null) {
                    BeanUtils.setProperty(object, DataProperty.AuthorId,
                        AuthorId);
                } // end if

                Object Comment = resultSet.getObject(columnIndex++);

                object.setCommentNull(resultSet.getBoolean(columnIndex++));

                if (Comment != null) {
                    BeanUtils.setProperty(object, DataProperty.Comment, Comment);
                } // end if

                Object ProcessInstanceId = resultSet.getObject(columnIndex++);

                object.setProcessInstanceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProcessInstanceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProcessInstanceId, ProcessInstanceId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object AuthorName = resultSet.getObject(columnIndex++);

                object.setAuthorNameNull(resultSet.getBoolean(columnIndex++));

                if (AuthorName != null) {
                    BeanUtils.setProperty(object, DataProperty.AuthorName,
                        AuthorName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmCommentRowMapper
} // end BaseBpmCommentDAOJdbcImpl
