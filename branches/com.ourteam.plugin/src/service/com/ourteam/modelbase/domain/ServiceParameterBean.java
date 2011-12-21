/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 服务参数对象 Generate date 2011-09-22 10:22:35
 *
 * @model auto gen
 */
public class ServiceParameterBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.ServiceParameter objServiceParameter;

    static {
        mappedDaoFields.put("serviceParameterId",
            com.ourteam.modelbase.dao.IServiceParameterDAO.ServiceParameterId);

        mappedDaoFields.put("dataType",
            com.ourteam.modelbase.dao.IServiceParameterDAO.DataType);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IServiceParameterDAO.Description);

        mappedDaoFields.put("isArray",
            com.ourteam.modelbase.dao.IServiceParameterDAO.IsArray);

        mappedDaoFields.put("name",
            com.ourteam.modelbase.dao.IServiceParameterDAO.Name);

        mappedDaoFields.put("preProcess",
            com.ourteam.modelbase.dao.IServiceParameterDAO.PreProcess);

        mappedDaoFields.put("sort",
            com.ourteam.modelbase.dao.IServiceParameterDAO.Sort);

        mappedDaoFields.put("type",
            com.ourteam.modelbase.dao.IServiceParameterDAO.Type);

        mappedDaoFields.put("validateInfo",
            com.ourteam.modelbase.dao.IServiceParameterDAO.ValidateInfo);

        mappedDaoFields.put("serviceFunctionId",
            com.ourteam.modelbase.dao.IServiceParameterDAO.ServiceFunctionId);

        mappedDaoFields.put("referenceObjectId",
            com.ourteam.modelbase.dao.IServiceParameterDAO.ReferenceObjectId);
    } 

    /**
     * Creates a new ServiceParameterBean object.
     */
    public ServiceParameterBean() {
        super();

        objServiceParameter = new com.ourteam.modelbase.dao.ServiceParameter();
    } // end ServiceParameterBean()

    /**
     * Creates a new ServiceParameterBean object.
     *
     * @param aServiceParameter DOCUMENT ME!
     */
    public ServiceParameterBean(
        com.ourteam.modelbase.dao.ServiceParameter aServiceParameter) {
        super();

        objServiceParameter = aServiceParameter;
    } // end ServiceParameterBean()

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
    public com.ourteam.modelbase.dao.ServiceParameter convertToServiceParameter() {
        return objServiceParameter;
    } // end convertToServiceParameter()

    /**
     * Get ServiceParameterId
     *
     * @return serviceParameterId
     */
    public long getServiceParameterId() {
        return objServiceParameter.getServiceParameterId();
    } // end getServiceParameterId()

    /**
     * Set ServiceParameterId
     *
     * @param aServiceParameterId
     */
    public void setServiceParameterId(long aServiceParameterId) {
        this.objServiceParameter.setServiceParameterId(aServiceParameterId);
    } // end setServiceParameterId()

    /**
     * Get DataType
     *
     * @return dataType
     */
    public String getDataType() {
        return objServiceParameter.getDataType();
    } // end getDataType()

    /**
     * Set DataType
     *
     * @param aDataType
     */
    public void setDataType(String aDataType) {
        this.objServiceParameter.setDataType(aDataType);
    } // end setDataType()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objServiceParameter.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objServiceParameter.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get IsArray
     *
     * @return isArray
     */
    public String getIsArray() {
        return objServiceParameter.getIsArray();
    } // end getIsArray()

    /**
     * Set IsArray
     *
     * @param aIsArray
     */
    public void setIsArray(String aIsArray) {
        this.objServiceParameter.setIsArray(aIsArray);
    } // end setIsArray()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objServiceParameter.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objServiceParameter.setName(aName);
    } // end setName()

    /**
     * Get PreProcess
     *
     * @return preProcess
     */
    public String getPreProcess() {
        return objServiceParameter.getPreProcess();
    } // end getPreProcess()

    /**
     * Set PreProcess
     *
     * @param aPreProcess
     */
    public void setPreProcess(String aPreProcess) {
        this.objServiceParameter.setPreProcess(aPreProcess);
    } // end setPreProcess()

    /**
     * Get Sort
     *
     * @return sort
     */
    public Integer getSort() {
        return objServiceParameter.getSort();
    } // end getSort()

    /**
     * Set Sort
     *
     * @param aSort
     */
    public void setSort(Integer aSort) {
        this.objServiceParameter.setSort(aSort);
    } // end setSort()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objServiceParameter.getType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objServiceParameter.setType(aType);
    } // end setType()

    /**
     * Get ValidateInfo
     *
     * @return validateInfo
     */
    public String getValidateInfo() {
        return objServiceParameter.getValidateInfo();
    } // end getValidateInfo()

    /**
     * Set ValidateInfo
     *
     * @param aValidateInfo
     */
    public void setValidateInfo(String aValidateInfo) {
        this.objServiceParameter.setValidateInfo(aValidateInfo);
    } // end setValidateInfo()

    /**
     * Get ServiceFunctionId
     *
     * @return serviceFunctionId
     */
    public long getServiceFunctionId() {
        return objServiceParameter.getServiceFunctionId();
    } // end getServiceFunctionId()

    /**
     * Set ServiceFunctionId
     *
     * @param aServiceFunctionId
     */
    public void setServiceFunctionId(long aServiceFunctionId) {
        this.objServiceParameter.setServiceFunctionId(aServiceFunctionId);
    } // end setServiceFunctionId()

    /**
     * Get ReferenceObjectId
     *
     * @return referenceObjectId
     */
    public Long getReferenceObjectId() {
        return objServiceParameter.getReferenceObjectId();
    } // end getReferenceObjectId()

    /**
     * Set ReferenceObjectId
     *
     * @param aReferenceObjectId
     */
    public void setReferenceObjectId(Long aReferenceObjectId) {
        this.objServiceParameter.setReferenceObjectId(aReferenceObjectId);
    } // end setReferenceObjectId()

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

        if ((obj instanceof ServiceParameterBean) == false) {
            return false;
        } // end if

        ServiceParameterBean other = (ServiceParameterBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.ServiceParameter tempServiceParameter = other.convertToServiceParameter();

        if ((tempServiceParameter == null) ||
                (this.objServiceParameter == null)) {
            isEqual = false;
        } // end if
        else if ((tempServiceParameter == this.objServiceParameter) ||
                tempServiceParameter.equals(this.objServiceParameter)) {
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
     * @param aServiceParameters DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ServiceParameterBean[] toArray(
        com.ourteam.modelbase.dao.ServiceParameter[] aServiceParameters) {
        return toArray(aServiceParameters, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceParameters DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ServiceParameterBean[] toArray(
        com.ourteam.modelbase.dao.ServiceParameter[] aServiceParameters,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aServiceParameters)) {
            return new ServiceParameterBean[0];
        } // end if

        int length = aServiceParameters.length;

        ServiceParameterBean[] beans = new ServiceParameterBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ServiceParameterBean(aServiceParameters[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ServiceParameterBean(aServiceParameters[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aServiceParameters[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ServiceParameterBean
