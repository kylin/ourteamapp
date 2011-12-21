/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao.impl;

import com.ourteam.calendar.dao.ITeamCalendarDefineDAO;
import com.ourteam.calendar.dao.TeamCalendarDefine;
import com.ourteam.calendar.dao.TeamCalendarDefineDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-06-10 22:46:45
 *
 * @author Kylin
 */
abstract public class BaseTeamCalendarDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements ITeamCalendarDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CalendarName, CalendarType, OwnerId, Remarks, Status, TeamName,
            TeamRemarks
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CalendarName,
            DataProperty.CalendarType, DataProperty.OwnerId,
            DataProperty.Remarks, DataProperty.Status, DataProperty.TeamName,
            DataProperty.TeamRemarks
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
     * Creates a new BaseTeamCalendarDefineDAOJdbcImpl object.
     */
    public BaseTeamCalendarDefineDAOJdbcImpl() {
        super();
    } // end BaseTeamCalendarDefineDAOJdbcImpl()

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

            basicFilterSQLbuffer.append(
                " CALENDAR_DEFINE.CALENDAR_TYPE ='TEAM' ");

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

            relatedJoinSQLBuffer.append(" LEFT JOIN TEAM_DEFINE teamDefineA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " teamDefineA.ID = CALENDAR_DEFINE.OWNER_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique TeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(TeamCalendarDefine aTeamCalendarDefine)
        throws Exception {
        if (aTeamCalendarDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aTeamCalendarDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ITeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     */
    public void insertTeamCalendarDefine(TeamCalendarDefine aTeamCalendarDefine)
        throws Exception {
        insert(aTeamCalendarDefine);
    } // end insertTeamCalendarDefine()

    /**
     * Batch Insert ITeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     */
    public void batchInsertTeamCalendarDefine(
        TeamCalendarDefine[] aTeamCalendarDefine) throws Exception {
        batchInsert(aTeamCalendarDefine);
    } // end batchInsertTeamCalendarDefine()

    /**
     * Delete ITeamCalendarDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteTeamCalendarDefine(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteTeamCalendarDefine()

    /**
     * Delete ITeamCalendarDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteTeamCalendarDefine(
        TeamCalendarDefineDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteTeamCalendarDefine()

    /**
     * Update ITeamCalendarDefine Selective
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     */
    public void updateTeamCalendarDefine(TeamCalendarDefine aTeamCalendarDefine)
        throws Exception {
        if (aTeamCalendarDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aTeamCalendarDefine);

        TeamCalendarDefine tempObj = findTeamCalendarDefineById(aTeamCalendarDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aTeamCalendarDefine, tempObj);
        } // end if
    } // end updateTeamCalendarDefine()

    /**
     * Batch Update ITeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     *
     * @throws Exception
     */
    public void batchUpdateTeamCalendarDefine(
        TeamCalendarDefine[] aTeamCalendarDefine) throws Exception {
        batchUpdate(aTeamCalendarDefine);
    } // end batchUpdateTeamCalendarDefine()

    /**
     * Update ITeamCalendarDefine
     *
     * @param aTeamCalendarDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateTeamCalendarDefine(
        TeamCalendarDefine aTeamCalendarDefine,
        TeamCalendarDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aTeamCalendarDefine, aQueryBean);
    } // end updateTeamCalendarDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamCalendarDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(TeamCalendarDefine aTeamCalendarDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamCalendarDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamCalendarDefine(
        TeamCalendarDefine[] aTeamCalendarDefines,
        TeamCalendarDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeTeamCalendarDefine(aTeamCalendarDefines, aQueryBean, null);
    } // end synchronizeTeamCalendarDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamCalendarDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamCalendarDefine(
        TeamCalendarDefine[] aTeamCalendarDefines,
        TeamCalendarDefineDAOQueryBean aQueryBean,
        TeamCalendarDefineSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aTeamCalendarDefines) == false) {
            inputList.addAll(Arrays.asList(aTeamCalendarDefines));
        } // end if

        TeamCalendarDefine[] existentTeamCalendarDefines = this.queryTeamCalendarDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentTeamCalendarDefines) == false) {
            existentList.addAll(Arrays.asList(existentTeamCalendarDefines));
        } // end if

        List willAddTeamCalendarDefines = ListUtils.subtract(inputList,
                existentList);

        List willDeleteTeamCalendarDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateTeamCalendarDefines = ListUtils.intersection(existentList,
                inputList);

        TeamCalendarDefine[] willUpdateTeamCalendarDefineArray = (TeamCalendarDefine[]) willUpdateTeamCalendarDefines.toArray(new TeamCalendarDefine[willUpdateTeamCalendarDefines.size()]);
        TeamCalendarDefine[] willAddTeamCalendarDefineArray = (TeamCalendarDefine[]) willAddTeamCalendarDefines.toArray(new TeamCalendarDefine[willAddTeamCalendarDefines.size()]);
        TeamCalendarDefine[] willDeleteTeamCalendarDefineArray = (TeamCalendarDefine[]) willDeleteTeamCalendarDefines.toArray(new TeamCalendarDefine[willDeleteTeamCalendarDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddTeamCalendarDefineArray,
                willUpdateTeamCalendarDefineArray,
                willDeleteTeamCalendarDefineArray);
        } // end if

        if (willUpdateTeamCalendarDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateTeamCalendarDefineArray);
            } // end if

            this.batchUpdateTeamCalendarDefine(willUpdateTeamCalendarDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateTeamCalendarDefineArray);
            } // end if
        } // end if

        if (willAddTeamCalendarDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddTeamCalendarDefineArray);
            } // end if

            this.batchInsertTeamCalendarDefine(willAddTeamCalendarDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddTeamCalendarDefineArray);
            } // end if
        } // end if

        if (willDeleteTeamCalendarDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteTeamCalendarDefineArray);
            } // end if

            for (int i = 0; i < willDeleteTeamCalendarDefineArray.length;
                    i++) {
                TeamCalendarDefine object = willDeleteTeamCalendarDefineArray[i];
                this.deleteTeamCalendarDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteTeamCalendarDefineArray);
            } // end if
        } // end if
    } // end synchronizeTeamCalendarDefine()

    /**
     * Query ITeamCalendarDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public TeamCalendarDefine findTeamCalendarDefineById(final long aId)
        throws Exception {
        TeamCalendarDefineDAOQueryBean queryBean = new TeamCalendarDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        TeamCalendarDefine[] TeamCalendarDefines = queryTeamCalendarDefine(queryBean);

        if (TeamCalendarDefines.length == 0) {
            return null;
        } // end if
        else {
            return TeamCalendarDefines[0];
        } // end else
    } // end findTeamCalendarDefineById()

    /**
     * Query ITeamCalendarDefine
     *
     * @param queryBean
     *
     * @return ITeamCalendarDefine[]
     *
     * @throws Exception
     */
    public TeamCalendarDefine[] queryTeamCalendarDefine(
        TeamCalendarDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcTeamCalendarDefineRowMapper());

        return (TeamCalendarDefine[]) result.toArray(new TeamCalendarDefine[result.size()]);
    } // end queryTeamCalendarDefine()

    /**
     * Query TeamCalendarDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryTeamCalendarDefineSelective(
        TeamCalendarDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryTeamCalendarDefineSelective()

    /**
     * Query ITeamCalendarDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryTeamCalendarDefineCount(
        TeamCalendarDefineDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryTeamCalendarDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcTeamCalendarDefineRowMapper
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
            TeamCalendarDefine object = new TeamCalendarDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CalendarName = resultSet.getObject(columnIndex++);

                object.setCalendarNameNull(resultSet.getBoolean(columnIndex++));

                if (CalendarName != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarName,
                        CalendarName);
                } // end if

                Object CalendarType = resultSet.getObject(columnIndex++);

                object.setCalendarTypeNull(resultSet.getBoolean(columnIndex++));

                if (CalendarType != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarType,
                        CalendarType);
                } // end if

                Object OwnerId = resultSet.getObject(columnIndex++);

                object.setOwnerIdNull(resultSet.getBoolean(columnIndex++));

                if (OwnerId != null) {
                    BeanUtils.setProperty(object, DataProperty.OwnerId, OwnerId);
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

                Object TeamName = resultSet.getObject(columnIndex++);

                object.setTeamNameNull(resultSet.getBoolean(columnIndex++));

                if (TeamName != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamName,
                        TeamName);
                } // end if

                Object TeamRemarks = resultSet.getObject(columnIndex++);

                object.setTeamRemarksNull(resultSet.getBoolean(columnIndex++));

                if (TeamRemarks != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamRemarks,
                        TeamRemarks);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcTeamCalendarDefineRowMapper
} // end BaseTeamCalendarDefineDAOJdbcImpl
