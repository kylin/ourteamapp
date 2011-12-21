/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao.impl;

import com.ourteam.team.dao.ITeamDefineDAO;
import com.ourteam.team.dao.TeamDefine;
import com.ourteam.team.dao.TeamDefineDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-08 14:32:59
 *
 * @author kylin
 */
abstract public class BaseTeamDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements ITeamDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, Status, TeamCode, TeamMaill, TeamName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.Status,
            DataProperty.TeamCode, DataProperty.TeamMaill, DataProperty.TeamName
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
     * Creates a new BaseTeamDefineDAOJdbcImpl object.
     */
    public BaseTeamDefineDAOJdbcImpl() {
        super();
    } // end BaseTeamDefineDAOJdbcImpl()

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

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique TeamDefine
     *
     * @param aTeamDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(TeamDefine aTeamDefine)
        throws Exception {
        if (aTeamDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aTeamDefine, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ITeamDefine
     *
     * @param aTeamDefine
     *
     * @throws Exception
     */
    public void insertTeamDefine(TeamDefine aTeamDefine)
        throws Exception {
        insert(aTeamDefine);
    } // end insertTeamDefine()

    /**
     * Batch Insert ITeamDefine
     *
     * @param aTeamDefine
     *
     * @throws Exception
     */
    public void batchInsertTeamDefine(TeamDefine[] aTeamDefine)
        throws Exception {
        batchInsert(aTeamDefine);
    } // end batchInsertTeamDefine()

    /**
     * Delete ITeamDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteTeamDefine(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteTeamDefine()

    /**
     * Delete ITeamDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteTeamDefine(TeamDefineDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteTeamDefine()

    /**
     * Update ITeamDefine Selective
     *
     * @param aTeamDefine
     *
     * @throws Exception
     */
    public void updateTeamDefine(TeamDefine aTeamDefine)
        throws Exception {
        if (aTeamDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aTeamDefine);

        TeamDefine tempObj = findTeamDefineById(aTeamDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aTeamDefine, tempObj);
        } // end if
    } // end updateTeamDefine()

    /**
     * Batch Update ITeamDefine
     *
     * @param aTeamDefine
     *
     * @throws Exception
     */
    public void batchUpdateTeamDefine(TeamDefine[] aTeamDefine)
        throws Exception {
        batchUpdate(aTeamDefine);
    } // end batchUpdateTeamDefine()

    /**
     * Update ITeamDefine
     *
     * @param aTeamDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateTeamDefine(TeamDefine aTeamDefine,
        TeamDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aTeamDefine, aQueryBean);
    } // end updateTeamDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(TeamDefine aTeamDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamDefine(TeamDefine[] aTeamDefines,
        TeamDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeTeamDefine(aTeamDefines, aQueryBean, null);
    } // end synchronizeTeamDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamDefine(TeamDefine[] aTeamDefines,
        TeamDefineDAOQueryBean aQueryBean,
        TeamDefineSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aTeamDefines) == false) {
            inputList.addAll(Arrays.asList(aTeamDefines));
        } // end if

        TeamDefine[] existentTeamDefines = this.queryTeamDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentTeamDefines) == false) {
            existentList.addAll(Arrays.asList(existentTeamDefines));
        } // end if

        List willAddTeamDefines = ListUtils.subtract(inputList, existentList);

        List willDeleteTeamDefines = ListUtils.subtract(existentList, inputList);

        List willUpdateTeamDefines = ListUtils.intersection(existentList,
                inputList);

        TeamDefine[] willUpdateTeamDefineArray = (TeamDefine[]) willUpdateTeamDefines.toArray(new TeamDefine[willUpdateTeamDefines.size()]);
        TeamDefine[] willAddTeamDefineArray = (TeamDefine[]) willAddTeamDefines.toArray(new TeamDefine[willAddTeamDefines.size()]);
        TeamDefine[] willDeleteTeamDefineArray = (TeamDefine[]) willDeleteTeamDefines.toArray(new TeamDefine[willDeleteTeamDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddTeamDefineArray,
                willUpdateTeamDefineArray, willDeleteTeamDefineArray);
        } // end if

        if (willUpdateTeamDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateTeamDefineArray);
            } // end if

            this.batchUpdateTeamDefine(willUpdateTeamDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateTeamDefineArray);
            } // end if
        } // end if

        if (willAddTeamDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddTeamDefineArray);
            } // end if

            this.batchInsertTeamDefine(willAddTeamDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddTeamDefineArray);
            } // end if
        } // end if

        if (willDeleteTeamDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteTeamDefineArray);
            } // end if

            for (int i = 0; i < willDeleteTeamDefineArray.length; i++) {
                TeamDefine object = willDeleteTeamDefineArray[i];
                this.deleteTeamDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteTeamDefineArray);
            } // end if
        } // end if
    } // end synchronizeTeamDefine()

    /**
     * Query ITeamDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public TeamDefine findTeamDefineById(final long aId)
        throws Exception {
        TeamDefineDAOQueryBean queryBean = new TeamDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        TeamDefine[] TeamDefines = queryTeamDefine(queryBean);

        if (TeamDefines.length == 0) {
            return null;
        } // end if
        else {
            return TeamDefines[0];
        } // end else
    } // end findTeamDefineById()

    /**
     * Query ITeamDefine
     *
     * @param queryBean
     *
     * @return ITeamDefine[]
     *
     * @throws Exception
     */
    public TeamDefine[] queryTeamDefine(TeamDefineDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcTeamDefineRowMapper());

        return (TeamDefine[]) result.toArray(new TeamDefine[result.size()]);
    } // end queryTeamDefine()

    /**
     * Query TeamDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryTeamDefineSelective(TeamDefineDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryTeamDefineSelective()

    /**
     * Query ITeamDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryTeamDefineCount(TeamDefineDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryTeamDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcTeamDefineRowMapper
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
            TeamDefine object = new TeamDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object TeamCode = resultSet.getObject(columnIndex++);

                object.setTeamCodeNull(resultSet.getBoolean(columnIndex++));

                if (TeamCode != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamCode,
                        TeamCode);
                } // end if

                Object TeamMaill = resultSet.getObject(columnIndex++);

                object.setTeamMaillNull(resultSet.getBoolean(columnIndex++));

                if (TeamMaill != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamMaill,
                        TeamMaill);
                } // end if

                Object TeamName = resultSet.getObject(columnIndex++);

                object.setTeamNameNull(resultSet.getBoolean(columnIndex++));

                if (TeamName != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamName,
                        TeamName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcTeamDefineRowMapper
} // end BaseTeamDefineDAOJdbcImpl
