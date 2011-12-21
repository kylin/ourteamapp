/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:35
 *
 * @model auto gen
 */
public class PersistentPropertyConstValueBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.PersistentPropertyConstValue objPersistentPropertyConstValue;

    static {
        mappedDaoFields.put("columnName",
            com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO.ColumnName);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO.Description);

        mappedDaoFields.put("fieldOrder",
            com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO.FieldOrder);

        mappedDaoFields.put("rowId",
            com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO.RowId);

        mappedDaoFields.put("tableName",
            com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO.TableName);

        mappedDaoFields.put("value",
            com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO.Value);
    } 

    /**
     * Creates a new PersistentPropertyConstValueBean object.
     */
    public PersistentPropertyConstValueBean() {
        super();

        objPersistentPropertyConstValue = new com.ourteam.modelbase.dao.PersistentPropertyConstValue();
    } // end PersistentPropertyConstValueBean()

    /**
     * Creates a new PersistentPropertyConstValueBean object.
     *
     * @param aPersistentPropertyConstValue DOCUMENT ME!
     */
    public PersistentPropertyConstValueBean(
        com.ourteam.modelbase.dao.PersistentPropertyConstValue aPersistentPropertyConstValue) {
        super();

        objPersistentPropertyConstValue = aPersistentPropertyConstValue;
    } // end PersistentPropertyConstValueBean()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.PersistentPropertyConstValue convertToPersistentPropertyConstValue() {
        return objPersistentPropertyConstValue;
    } // end convertToPersistentPropertyConstValue()

    /**
     * Get ColumnName
     *
     * @return columnName
     */
    public String getColumnName() {
        return objPersistentPropertyConstValue.getColumnName();
    } // end getColumnName()

    /**
     * Set ColumnName
     *
     * @param aColumnName
     */
    public void setColumnName(String aColumnName) {
        this.objPersistentPropertyConstValue.setColumnName(aColumnName);
    } // end setColumnName()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objPersistentPropertyConstValue.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objPersistentPropertyConstValue.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get FieldOrder
     *
     * @return fieldOrder
     */
    public int getFieldOrder() {
        return objPersistentPropertyConstValue.getFieldOrder();
    } // end getFieldOrder()

    /**
     * Set FieldOrder
     *
     * @param aFieldOrder
     */
    public void setFieldOrder(int aFieldOrder) {
        this.objPersistentPropertyConstValue.setFieldOrder(aFieldOrder);
    } // end setFieldOrder()

    /**
     * Get RowId
     *
     * @return rowId
     */
    public long getRowId() {
        return objPersistentPropertyConstValue.getRowId();
    } // end getRowId()

    /**
     * Set RowId
     *
     * @param aRowId
     */
    public void setRowId(long aRowId) {
        this.objPersistentPropertyConstValue.setRowId(aRowId);
    } // end setRowId()

    /**
     * Get TableName
     *
     * @return tableName
     */
    public String getTableName() {
        return objPersistentPropertyConstValue.getTableName();
    } // end getTableName()

    /**
     * Set TableName
     *
     * @param aTableName
     */
    public void setTableName(String aTableName) {
        this.objPersistentPropertyConstValue.setTableName(aTableName);
    } // end setTableName()

    /**
     * Get Value
     *
     * @return value
     */
    public String getValue() {
        return objPersistentPropertyConstValue.getValue();
    } // end getValue()

    /**
     * Set Value
     *
     * @param aValue
     */
    public void setValue(String aValue) {
        this.objPersistentPropertyConstValue.setValue(aValue);
    } // end setValue()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
    } // end hashCode()

    /**
     * DOCUMENT ME!
     *
     * @param obj DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } // end if

        if ((obj instanceof PersistentPropertyConstValueBean) == false) {
            return false;
        } // end if

        PersistentPropertyConstValueBean other = (PersistentPropertyConstValueBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.PersistentPropertyConstValue tempPersistentPropertyConstValue =
            other.convertToPersistentPropertyConstValue();

        if ((tempPersistentPropertyConstValue == null) ||
                (this.objPersistentPropertyConstValue == null)) {
            isEqual = false;
        } // end if
        else if ((tempPersistentPropertyConstValue == this.objPersistentPropertyConstValue) ||
                tempPersistentPropertyConstValue.equals(
                    this.objPersistentPropertyConstValue)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aPersistentPropertyConstValues DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static PersistentPropertyConstValueBean[] toArray(
        com.ourteam.modelbase.dao.PersistentPropertyConstValue[] aPersistentPropertyConstValues) {
        return toArray(aPersistentPropertyConstValues, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aPersistentPropertyConstValues DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static PersistentPropertyConstValueBean[] toArray(
        com.ourteam.modelbase.dao.PersistentPropertyConstValue[] aPersistentPropertyConstValues,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aPersistentPropertyConstValues)) {
            return new PersistentPropertyConstValueBean[0];
        } // end if

        int length = aPersistentPropertyConstValues.length;

        PersistentPropertyConstValueBean[] beans = new PersistentPropertyConstValueBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new PersistentPropertyConstValueBean(aPersistentPropertyConstValues[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new PersistentPropertyConstValueBean(aPersistentPropertyConstValues[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aPersistentPropertyConstValues[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end PersistentPropertyConstValueBean
