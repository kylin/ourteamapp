/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 服务功能对象 Generate date 2011-09-22 10:22:35
 *
 * @model auto gen
 */
public class ServiceFunctionBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.ServiceFunction objServiceFunction;

    static {
        mappedDaoFields.put("objectFunctionId",
            com.ourteam.modelbase.dao.IServiceFunctionDAO.ObjectFunctionId);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IServiceFunctionDAO.Description);

        mappedDaoFields.put("isQuery",
            com.ourteam.modelbase.dao.IServiceFunctionDAO.IsQuery);

        mappedDaoFields.put("name",
            com.ourteam.modelbase.dao.IServiceFunctionDAO.Name);

        mappedDaoFields.put("objectId",
            com.ourteam.modelbase.dao.IServiceFunctionDAO.ObjectId);

        mappedDaoFields.put("state",
            com.ourteam.modelbase.dao.IServiceFunctionDAO.State);

        mappedDaoFields.put("type",
            com.ourteam.modelbase.dao.IServiceFunctionDAO.Type);
    } 

    /**
     * Creates a new ServiceFunctionBean object.
     */
    public ServiceFunctionBean() {
        super();

        objServiceFunction = new com.ourteam.modelbase.dao.ServiceFunction();
    } // end ServiceFunctionBean()

    /**
     * Creates a new ServiceFunctionBean object.
     *
     * @param aServiceFunction DOCUMENT ME!
     */
    public ServiceFunctionBean(
        com.ourteam.modelbase.dao.ServiceFunction aServiceFunction) {
        super();

        objServiceFunction = aServiceFunction;
    } // end ServiceFunctionBean()

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
    public com.ourteam.modelbase.dao.ServiceFunction convertToServiceFunction() {
        return objServiceFunction;
    } // end convertToServiceFunction()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.domain.ServiceParameterBean[] inputParameters = new com.ourteam.modelbase.domain.ServiceParameterBean[] {
            
        };

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.domain.ServiceParameterBean outPutParameter;

    /**
     * Get ObjectFunctionId
     *
     * @return objectFunctionId
     */
    public long getObjectFunctionId() {
        return objServiceFunction.getObjectFunctionId();
    } // end getObjectFunctionId()

    /**
     * Set ObjectFunctionId
     *
     * @param aObjectFunctionId
     */
    public void setObjectFunctionId(long aObjectFunctionId) {
        this.objServiceFunction.setObjectFunctionId(aObjectFunctionId);
    } // end setObjectFunctionId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objServiceFunction.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objServiceFunction.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get IsQuery
     *
     * @return isQuery
     */
    public String getIsQuery() {
        return objServiceFunction.getIsQuery();
    } // end getIsQuery()

    /**
     * Set IsQuery
     *
     * @param aIsQuery
     */
    public void setIsQuery(String aIsQuery) {
        this.objServiceFunction.setIsQuery(aIsQuery);
    } // end setIsQuery()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objServiceFunction.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objServiceFunction.setName(aName);
    } // end setName()

    /**
     * Get ObjectId
     *
     * @return objectId
     */
    public long getObjectId() {
        return objServiceFunction.getObjectId();
    } // end getObjectId()

    /**
     * Set ObjectId
     *
     * @param aObjectId
     */
    public void setObjectId(long aObjectId) {
        this.objServiceFunction.setObjectId(aObjectId);
    } // end setObjectId()

    /**
     * Get State
     *
     * @return state
     */
    public String getState() {
        return objServiceFunction.getState();
    } // end getState()

    /**
     * Set State
     *
     * @param aState
     */
    public void setState(String aState) {
        this.objServiceFunction.setState(aState);
    } // end setState()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objServiceFunction.getType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objServiceFunction.setType(aType);
    } // end setType()

    /**
     * Get InputParameters
     *
     * @return inputParameters
     */
    public com.ourteam.modelbase.domain.ServiceParameterBean[] getInputParameters() {
        return inputParameters;
    } // end getInputParameters()

    /**
     * Set InputParameters
     *
     * @param aInputParameters
     */
    public void setInputParameters(
        com.ourteam.modelbase.domain.ServiceParameterBean[] aInputParameters) {
        this.inputParameters = aInputParameters;
    } // end setInputParameters()

    /**
     * Get OutPutParameter
     *
     * @return outPutParameter
     */
    public com.ourteam.modelbase.domain.ServiceParameterBean getOutPutParameter() {
        return outPutParameter;
    } // end getOutPutParameter()

    /**
     * Set OutPutParameter
     *
     * @param aOutPutParameter
     */
    public void setOutPutParameter(
        com.ourteam.modelbase.domain.ServiceParameterBean aOutPutParameter) {
        this.outPutParameter = aOutPutParameter;
    } // end setOutPutParameter()

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

        if ((obj instanceof ServiceFunctionBean) == false) {
            return false;
        } // end if

        ServiceFunctionBean other = (ServiceFunctionBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.ServiceFunction tempServiceFunction = other.convertToServiceFunction();

        if ((tempServiceFunction == null) || (this.objServiceFunction == null)) {
            isEqual = false;
        } // end if
        else if ((tempServiceFunction == this.objServiceFunction) ||
                tempServiceFunction.equals(this.objServiceFunction)) {
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
     * @param aServiceFunctions DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ServiceFunctionBean[] toArray(
        com.ourteam.modelbase.dao.ServiceFunction[] aServiceFunctions) {
        return toArray(aServiceFunctions, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aServiceFunctions DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ServiceFunctionBean[] toArray(
        com.ourteam.modelbase.dao.ServiceFunction[] aServiceFunctions,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aServiceFunctions)) {
            return new ServiceFunctionBean[0];
        } // end if

        int length = aServiceFunctions.length;

        ServiceFunctionBean[] beans = new ServiceFunctionBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ServiceFunctionBean(aServiceFunctions[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ServiceFunctionBean(aServiceFunctions[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aServiceFunctions[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ServiceFunctionBean
