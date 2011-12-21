/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 产品功能定义 Generate date 2011-09-22 10:22:04
 *
 * @model auto gen
 */
public class ProductFunctionBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.ProductFunction objProductFunction;

    static {
        mappedDaoFields.put("id", com.ourteam.product.dao.IProductFunctionDAO.Id);

        mappedDaoFields.put("functionCode",
            com.ourteam.product.dao.IProductFunctionDAO.FunctionCode);

        mappedDaoFields.put("functionName",
            com.ourteam.product.dao.IProductFunctionDAO.FunctionName);

        mappedDaoFields.put("parentFunctionId",
            com.ourteam.product.dao.IProductFunctionDAO.ParentFunctionId);

        mappedDaoFields.put("productDefineId",
            com.ourteam.product.dao.IProductFunctionDAO.ProductDefineId);

        mappedDaoFields.put("remarks",
            com.ourteam.product.dao.IProductFunctionDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.product.dao.IProductFunctionDAO.Status);

        mappedDaoFields.put("canTest",
            com.ourteam.product.dao.IProductFunctionDAO.CanTest);
    } 

    /**
     * Creates a new ProductFunctionBean object.
     */
    public ProductFunctionBean() {
        super();

        objProductFunction = new com.ourteam.product.dao.ProductFunction();
    } // end ProductFunctionBean()

    /**
     * Creates a new ProductFunctionBean object.
     *
     * @param aProductFunction DOCUMENT ME!
     */
    public ProductFunctionBean(
        com.ourteam.product.dao.ProductFunction aProductFunction) {
        super();

        objProductFunction = aProductFunction;
    } // end ProductFunctionBean()

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
    public com.ourteam.product.dao.ProductFunction convertToProductFunction() {
        return objProductFunction;
    } // end convertToProductFunction()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProductFunction.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProductFunction.setId(aId);
    } // end setId()

    /**
     * Get FunctionCode
     *
     * @return functionCode
     */
    public String getFunctionCode() {
        return objProductFunction.getFunctionCode();
    } // end getFunctionCode()

    /**
     * Set FunctionCode
     *
     * @param aFunctionCode
     */
    public void setFunctionCode(String aFunctionCode) {
        this.objProductFunction.setFunctionCode(aFunctionCode);
    } // end setFunctionCode()

    /**
     * Get FunctionName
     *
     * @return functionName
     */
    public String getFunctionName() {
        return objProductFunction.getFunctionName();
    } // end getFunctionName()

    /**
     * Set FunctionName
     *
     * @param aFunctionName
     */
    public void setFunctionName(String aFunctionName) {
        this.objProductFunction.setFunctionName(aFunctionName);
    } // end setFunctionName()

    /**
     * Get ParentFunctionId
     *
     * @return parentFunctionId
     */
    public long getParentFunctionId() {
        return objProductFunction.getParentFunctionId();
    } // end getParentFunctionId()

    /**
     * Set ParentFunctionId
     *
     * @param aParentFunctionId
     */
    public void setParentFunctionId(long aParentFunctionId) {
        this.objProductFunction.setParentFunctionId(aParentFunctionId);
    } // end setParentFunctionId()

    /**
     * Get ProductDefineId
     *
     * @return productDefineId
     */
    public long getProductDefineId() {
        return objProductFunction.getProductDefineId();
    } // end getProductDefineId()

    /**
     * Set ProductDefineId
     *
     * @param aProductDefineId
     */
    public void setProductDefineId(long aProductDefineId) {
        this.objProductFunction.setProductDefineId(aProductDefineId);
    } // end setProductDefineId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objProductFunction.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objProductFunction.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProductFunction.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProductFunction.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get CanTest 是否可测试
     *
     * @return canTest
     */
    public int getCanTest() {
        return objProductFunction.getCanTest();
    } // end getCanTest()

    /**
     * Set CanTest 是否可测试
     *
     * @param aCanTest
     */
    public void setCanTest(int aCanTest) {
        this.objProductFunction.setCanTest(aCanTest);
    } // end setCanTest()

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

        if ((obj instanceof ProductFunctionBean) == false) {
            return false;
        } // end if

        ProductFunctionBean other = (ProductFunctionBean) obj;

        boolean isEqual = false;

        com.ourteam.product.dao.ProductFunction tempProductFunction = other.convertToProductFunction();

        if ((tempProductFunction == null) || (this.objProductFunction == null)) {
            isEqual = false;
        } // end if
        else if ((tempProductFunction == this.objProductFunction) ||
                tempProductFunction.equals(this.objProductFunction)) {
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
     * @param aProductFunctions DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductFunctionBean[] toArray(
        com.ourteam.product.dao.ProductFunction[] aProductFunctions) {
        return toArray(aProductFunctions, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProductFunctions DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProductFunctionBean[] toArray(
        com.ourteam.product.dao.ProductFunction[] aProductFunctions,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aProductFunctions)) {
            return new ProductFunctionBean[0];
        } // end if

        int length = aProductFunctions.length;

        ProductFunctionBean[] beans = new ProductFunctionBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductFunctionBean(aProductFunctions[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProductFunctionBean(aProductFunctions[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aProductFunctions[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProductFunctionBean
