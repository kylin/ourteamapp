/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 流程定义发布信息 Generate date 2011-09-22 10:22:23
 *
 * @model auto gen
 */
public class BPMDeploymentInfo implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * Creates a new BPMDeploymentInfo object.
     */
    public BPMDeploymentInfo() {
        super();
    } // end BPMDeploymentInfo()

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
     */
    private byte[] resource = new byte[] {  };

    /**
     * DOCUMENT ME!
     */
    private java.lang.String deploymentId;

    /**
     * DOCUMENT ME!
     */
    private java.lang.String name;

    /**
     * DOCUMENT ME!
     */
    private long deployerId;

    /**
     * DOCUMENT ME!
     */
    private java.util.Date deployDateTime;

    /**
     * DOCUMENT ME!
     */
    private String description;

    /**
     * DOCUMENT ME!
     */
    private java.lang.String status;

    /**
     * Get Resource
     *
     * @return resource
     */
    public byte[] getResource() {
        return resource;
    } // end getResource()

    /**
     * Set Resource
     *
     * @param aResource
     */
    public void setResource(byte[] aResource) {
        this.resource = aResource;
    } // end setResource()

    /**
     * Get DeploymentId
     *
     * @return deploymentId
     */
    public java.lang.String getDeploymentId() {
        return deploymentId;
    } // end getDeploymentId()

    /**
     * Set DeploymentId
     *
     * @param aDeploymentId
     */
    public void setDeploymentId(java.lang.String aDeploymentId) {
        this.deploymentId = aDeploymentId;
    } // end setDeploymentId()

    /**
     * Get Name
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(java.lang.String aName) {
        this.name = aName;
    } // end setName()

    /**
     * Get DeployerId
     *
     * @return deployerId
     */
    public long getDeployerId() {
        return deployerId;
    } // end getDeployerId()

    /**
     * Set DeployerId
     *
     * @param aDeployerId
     */
    public void setDeployerId(long aDeployerId) {
        this.deployerId = aDeployerId;
    } // end setDeployerId()

    /**
     * Get DeployDateTime
     *
     * @return deployDateTime
     */
    public java.util.Date getDeployDateTime() {
        return deployDateTime;
    } // end getDeployDateTime()

    /**
     * Set DeployDateTime
     *
     * @param aDeployDateTime
     */
    public void setDeployDateTime(java.util.Date aDeployDateTime) {
        this.deployDateTime = aDeployDateTime;
    } // end setDeployDateTime()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.description = aDescription;
    } // end setDescription()

    /**
     * Get Status
     *
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(java.lang.String aStatus) {
        this.status = aStatus;
    } // end setStatus()
} // end BPMDeploymentInfo
