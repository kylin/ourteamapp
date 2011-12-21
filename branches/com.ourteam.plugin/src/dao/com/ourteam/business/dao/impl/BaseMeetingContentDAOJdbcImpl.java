/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao.impl;

import com.ourteam.business.dao.IMeetingContentDAO;
import com.ourteam.business.dao.MeetingContent;
import com.ourteam.business.dao.MeetingContentDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-02 11:25:12
 *
 * @author kylin
 */
abstract public class BaseMeetingContentDAOJdbcImpl extends AbstractJdbcDAO
    implements IMeetingContentDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Content, MeetingId, Remarks, Status, MeetingTopic
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Content, DataProperty.MeetingId,
            DataProperty.Remarks, DataProperty.Status, DataProperty.MeetingTopic
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
     * Creates a new BaseMeetingContentDAOJdbcImpl object.
     */
    public BaseMeetingContentDAOJdbcImpl() {
        super();
    } // end BaseMeetingContentDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN MEETING meetingA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " meetingA.ID = MEETING_CONTENT.MEETING_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique MeetingContent
     *
     * @param aMeetingContent
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MeetingContent aMeetingContent)
        throws Exception {
        if (aMeetingContent == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMeetingContent,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMeetingContent
     *
     * @param aMeetingContent
     *
     * @throws Exception
     */
    public void insertMeetingContent(MeetingContent aMeetingContent)
        throws Exception {
        insert(aMeetingContent);
    } // end insertMeetingContent()

    /**
     * Batch Insert IMeetingContent
     *
     * @param aMeetingContent
     *
     * @throws Exception
     */
    public void batchInsertMeetingContent(MeetingContent[] aMeetingContent)
        throws Exception {
        batchInsert(aMeetingContent);
    } // end batchInsertMeetingContent()

    /**
     * Delete IMeetingContent
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMeetingContent(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMeetingContent()

    /**
     * Delete IMeetingContent
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMeetingContent(MeetingContentDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMeetingContent()

    /**
     * Update IMeetingContent Selective
     *
     * @param aMeetingContent
     *
     * @throws Exception
     */
    public void updateMeetingContent(MeetingContent aMeetingContent)
        throws Exception {
        if (aMeetingContent.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMeetingContent);

        MeetingContent tempObj = findMeetingContentById(aMeetingContent.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMeetingContent, tempObj);
        } // end if
    } // end updateMeetingContent()

    /**
     * Batch Update IMeetingContent
     *
     * @param aMeetingContent
     *
     * @throws Exception
     */
    public void batchUpdateMeetingContent(MeetingContent[] aMeetingContent)
        throws Exception {
        batchUpdate(aMeetingContent);
    } // end batchUpdateMeetingContent()

    /**
     * Update IMeetingContent
     *
     * @param aMeetingContent
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMeetingContent(MeetingContent aMeetingContent,
        MeetingContentDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMeetingContent, aQueryBean);
    } // end updateMeetingContent()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingContent DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MeetingContent aMeetingContent)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingContents DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeetingContent(MeetingContent[] aMeetingContents,
        MeetingContentDAOQueryBean aQueryBean) throws Exception {
        synchronizeMeetingContent(aMeetingContents, aQueryBean, null);
    } // end synchronizeMeetingContent()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingContents DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeetingContent(MeetingContent[] aMeetingContents,
        MeetingContentDAOQueryBean aQueryBean,
        MeetingContentSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMeetingContents) == false) {
            inputList.addAll(Arrays.asList(aMeetingContents));
        } // end if

        MeetingContent[] existentMeetingContents = this.queryMeetingContent(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMeetingContents) == false) {
            existentList.addAll(Arrays.asList(existentMeetingContents));
        } // end if

        List willAddMeetingContents = ListUtils.subtract(inputList, existentList);

        List willDeleteMeetingContents = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMeetingContents = ListUtils.intersection(existentList,
                inputList);

        MeetingContent[] willUpdateMeetingContentArray = (MeetingContent[]) willUpdateMeetingContents.toArray(new MeetingContent[willUpdateMeetingContents.size()]);
        MeetingContent[] willAddMeetingContentArray = (MeetingContent[]) willAddMeetingContents.toArray(new MeetingContent[willAddMeetingContents.size()]);
        MeetingContent[] willDeleteMeetingContentArray = (MeetingContent[]) willDeleteMeetingContents.toArray(new MeetingContent[willDeleteMeetingContents.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMeetingContentArray,
                willUpdateMeetingContentArray, willDeleteMeetingContentArray);
        } // end if

        if (willUpdateMeetingContents.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMeetingContentArray);
            } // end if

            this.batchUpdateMeetingContent(willUpdateMeetingContentArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMeetingContentArray);
            } // end if
        } // end if

        if (willAddMeetingContents.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMeetingContentArray);
            } // end if

            this.batchInsertMeetingContent(willAddMeetingContentArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMeetingContentArray);
            } // end if
        } // end if

        if (willDeleteMeetingContents.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMeetingContentArray);
            } // end if

            for (int i = 0; i < willDeleteMeetingContentArray.length; i++) {
                MeetingContent object = willDeleteMeetingContentArray[i];
                this.deleteMeetingContent(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMeetingContentArray);
            } // end if
        } // end if
    } // end synchronizeMeetingContent()

    /**
     * Query IMeetingContent
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MeetingContent findMeetingContentById(final long aId)
        throws Exception {
        MeetingContentDAOQueryBean queryBean = new MeetingContentDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MeetingContent[] MeetingContents = queryMeetingContent(queryBean);

        if (MeetingContents.length == 0) {
            return null;
        } // end if
        else {
            return MeetingContents[0];
        } // end else
    } // end findMeetingContentById()

    /**
     * Query IMeetingContent
     *
     * @param queryBean
     *
     * @return IMeetingContent[]
     *
     * @throws Exception
     */
    public MeetingContent[] queryMeetingContent(
        MeetingContentDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcMeetingContentRowMapper());

        return (MeetingContent[]) result.toArray(new MeetingContent[result.size()]);
    } // end queryMeetingContent()

    /**
     * Query MeetingContent Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMeetingContentSelective(
        MeetingContentDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMeetingContentSelective()

    /**
     * Query IMeetingContent Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMeetingContentCount(MeetingContentDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryMeetingContentCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMeetingContentRowMapper
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
            MeetingContent object = new MeetingContent();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Content = resultSet.getObject(columnIndex++);

                object.setContentNull(resultSet.getBoolean(columnIndex++));

                if (Content != null) {
                    BeanUtils.setProperty(object, DataProperty.Content, Content);
                } // end if

                Object MeetingId = resultSet.getObject(columnIndex++);

                object.setMeetingIdNull(resultSet.getBoolean(columnIndex++));

                if (MeetingId != null) {
                    BeanUtils.setProperty(object, DataProperty.MeetingId,
                        MeetingId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object MeetingTopic = resultSet.getObject(columnIndex++);

                object.setMeetingTopicNull(resultSet.getBoolean(columnIndex++));

                if (MeetingTopic != null) {
                    BeanUtils.setProperty(object, DataProperty.MeetingTopic,
                        MeetingTopic);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMeetingContentRowMapper
} // end BaseMeetingContentDAOJdbcImpl
