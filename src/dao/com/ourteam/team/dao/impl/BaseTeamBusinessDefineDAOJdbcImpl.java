/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao.impl;

import com.ourteam.team.dao.ITeamBusinessDefineDAO;
import com.ourteam.team.dao.TeamBusinessDefine;
import com.ourteam.team.dao.TeamBusinessDefineDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-10 11:03:03
 *
 * @author Kylin
 */
abstract public class BaseTeamBusinessDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements ITeamBusinessDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ItemIcon, ItemTitle, ItemType, LinkPath, Remarks, Status, TeamId,
            ItemCode, TeamName, ActionGroupId, SubNodeBuilder, SortIndex
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ItemIcon, DataProperty.ItemTitle,
            DataProperty.ItemType, DataProperty.LinkPath, DataProperty.Remarks,
            DataProperty.Status, DataProperty.TeamId, DataProperty.ItemCode,
            DataProperty.TeamName, DataProperty.ActionGroupId,
            DataProperty.SubNodeBuilder, DataProperty.SortIndex
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
     * Creates a new BaseTeamBusinessDefineDAOJdbcImpl object.
     */
    public BaseTeamBusinessDefineDAOJdbcImpl() {
        super();
    } // end BaseTeamBusinessDefineDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN TEAM_DEFINE teamDefineD ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " teamDefineD.ID = TEAM_BUSINESS_DEFINE.TEAM_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique TeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(TeamBusinessDefine aTeamBusinessDefine)
        throws Exception {
        if (aTeamBusinessDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aTeamBusinessDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ITeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     */
    public void insertTeamBusinessDefine(TeamBusinessDefine aTeamBusinessDefine)
        throws Exception {
        insert(aTeamBusinessDefine);
    } // end insertTeamBusinessDefine()

    /**
     * Batch Insert ITeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     */
    public void batchInsertTeamBusinessDefine(
        TeamBusinessDefine[] aTeamBusinessDefine) throws Exception {
        batchInsert(aTeamBusinessDefine);
    } // end batchInsertTeamBusinessDefine()

    /**
     * Delete ITeamBusinessDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteTeamBusinessDefine(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteTeamBusinessDefine()

    /**
     * Delete ITeamBusinessDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteTeamBusinessDefine(
        TeamBusinessDefineDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteTeamBusinessDefine()

    /**
     * Update ITeamBusinessDefine Selective
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     */
    public void updateTeamBusinessDefine(TeamBusinessDefine aTeamBusinessDefine)
        throws Exception {
        if (aTeamBusinessDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aTeamBusinessDefine);

        TeamBusinessDefine tempObj = findTeamBusinessDefineById(aTeamBusinessDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aTeamBusinessDefine, tempObj);
        } // end if
    } // end updateTeamBusinessDefine()

    /**
     * Batch Update ITeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     */
    public void batchUpdateTeamBusinessDefine(
        TeamBusinessDefine[] aTeamBusinessDefine) throws Exception {
        batchUpdate(aTeamBusinessDefine);
    } // end batchUpdateTeamBusinessDefine()

    /**
     * Update ITeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateTeamBusinessDefine(
        TeamBusinessDefine aTeamBusinessDefine,
        TeamBusinessDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aTeamBusinessDefine, aQueryBean);
    } // end updateTeamBusinessDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamBusinessDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(TeamBusinessDefine aTeamBusinessDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamBusinessDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamBusinessDefine(
        TeamBusinessDefine[] aTeamBusinessDefines,
        TeamBusinessDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeTeamBusinessDefine(aTeamBusinessDefines, aQueryBean, null);
    } // end synchronizeTeamBusinessDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamBusinessDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeTeamBusinessDefine(
        TeamBusinessDefine[] aTeamBusinessDefines,
        TeamBusinessDefineDAOQueryBean aQueryBean,
        TeamBusinessDefineSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aTeamBusinessDefines) == false) {
            inputList.addAll(Arrays.asList(aTeamBusinessDefines));
        } // end if

        TeamBusinessDefine[] existentTeamBusinessDefines = this.queryTeamBusinessDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentTeamBusinessDefines) == false) {
            existentList.addAll(Arrays.asList(existentTeamBusinessDefines));
        } // end if

        List willAddTeamBusinessDefines = ListUtils.subtract(inputList,
                existentList);

        List willDeleteTeamBusinessDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateTeamBusinessDefines = ListUtils.intersection(existentList,
                inputList);

        TeamBusinessDefine[] willUpdateTeamBusinessDefineArray = (TeamBusinessDefine[]) willUpdateTeamBusinessDefines.toArray(new TeamBusinessDefine[willUpdateTeamBusinessDefines.size()]);
        TeamBusinessDefine[] willAddTeamBusinessDefineArray = (TeamBusinessDefine[]) willAddTeamBusinessDefines.toArray(new TeamBusinessDefine[willAddTeamBusinessDefines.size()]);
        TeamBusinessDefine[] willDeleteTeamBusinessDefineArray = (TeamBusinessDefine[]) willDeleteTeamBusinessDefines.toArray(new TeamBusinessDefine[willDeleteTeamBusinessDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddTeamBusinessDefineArray,
                willUpdateTeamBusinessDefineArray,
                willDeleteTeamBusinessDefineArray);
        } // end if

        if (willUpdateTeamBusinessDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateTeamBusinessDefineArray);
            } // end if

            this.batchUpdateTeamBusinessDefine(willUpdateTeamBusinessDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateTeamBusinessDefineArray);
            } // end if
        } // end if

        if (willAddTeamBusinessDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddTeamBusinessDefineArray);
            } // end if

            this.batchInsertTeamBusinessDefine(willAddTeamBusinessDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddTeamBusinessDefineArray);
            } // end if
        } // end if

        if (willDeleteTeamBusinessDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteTeamBusinessDefineArray);
            } // end if

            for (int i = 0; i < willDeleteTeamBusinessDefineArray.length;
                    i++) {
                TeamBusinessDefine object = willDeleteTeamBusinessDefineArray[i];
                this.deleteTeamBusinessDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteTeamBusinessDefineArray);
            } // end if
        } // end if
    } // end synchronizeTeamBusinessDefine()

    /**
     * Query ITeamBusinessDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public TeamBusinessDefine findTeamBusinessDefineById(final long aId)
        throws Exception {
        TeamBusinessDefineDAOQueryBean queryBean = new TeamBusinessDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        TeamBusinessDefine[] TeamBusinessDefines = queryTeamBusinessDefine(queryBean);

        if (TeamBusinessDefines.length == 0) {
            return null;
        } // end if
        else {
            return TeamBusinessDefines[0];
        } // end else
    } // end findTeamBusinessDefineById()

    /**
     * Query ITeamBusinessDefine
     *
     * @param queryBean
     *
     * @return ITeamBusinessDefine[]
     *
     * @throws Exception
     */
    public TeamBusinessDefine[] queryTeamBusinessDefine(
        TeamBusinessDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcTeamBusinessDefineRowMapper());

        return (TeamBusinessDefine[]) result.toArray(new TeamBusinessDefine[result.size()]);
    } // end queryTeamBusinessDefine()

    /**
     * Query TeamBusinessDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryTeamBusinessDefineSelective(
        TeamBusinessDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryTeamBusinessDefineSelective()

    /**
     * Query ITeamBusinessDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryTeamBusinessDefineCount(
        TeamBusinessDefineDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryTeamBusinessDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcTeamBusinessDefineRowMapper
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
            TeamBusinessDefine object = new TeamBusinessDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ItemIcon = resultSet.getObject(columnIndex++);

                object.setItemIconNull(resultSet.getBoolean(columnIndex++));

                if (ItemIcon != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemIcon,
                        ItemIcon);
                } // end if

                Object ItemTitle = resultSet.getObject(columnIndex++);

                object.setItemTitleNull(resultSet.getBoolean(columnIndex++));

                if (ItemTitle != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemTitle,
                        ItemTitle);
                } // end if

                Object ItemType = resultSet.getObject(columnIndex++);

                object.setItemTypeNull(resultSet.getBoolean(columnIndex++));

                if (ItemType != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemType,
                        ItemType);
                } // end if

                Object LinkPath = resultSet.getObject(columnIndex++);

                object.setLinkPathNull(resultSet.getBoolean(columnIndex++));

                if (LinkPath != null) {
                    BeanUtils.setProperty(object, DataProperty.LinkPath,
                        LinkPath);
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

                Object TeamId = resultSet.getObject(columnIndex++);

                object.setTeamIdNull(resultSet.getBoolean(columnIndex++));

                if (TeamId != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamId, TeamId);
                } // end if

                Object ItemCode = resultSet.getObject(columnIndex++);

                object.setItemCodeNull(resultSet.getBoolean(columnIndex++));

                if (ItemCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemCode,
                        ItemCode);
                } // end if

                Object TeamName = resultSet.getObject(columnIndex++);

                object.setTeamNameNull(resultSet.getBoolean(columnIndex++));

                if (TeamName != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamName,
                        TeamName);
                } // end if

                Object ActionGroupId = resultSet.getObject(columnIndex++);

                object.setActionGroupIdNull(resultSet.getBoolean(columnIndex++));

                if (ActionGroupId != null) {
                    BeanUtils.setProperty(object, DataProperty.ActionGroupId,
                        ActionGroupId);
                } // end if

                Object SubNodeBuilder = resultSet.getObject(columnIndex++);

                object.setSubNodeBuilderNull(resultSet.getBoolean(columnIndex++));

                if (SubNodeBuilder != null) {
                    BeanUtils.setProperty(object, DataProperty.SubNodeBuilder,
                        SubNodeBuilder);
                } // end if

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcTeamBusinessDefineRowMapper
} // end BaseTeamBusinessDefineDAOJdbcImpl
