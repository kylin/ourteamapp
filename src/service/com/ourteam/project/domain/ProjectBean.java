/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.project.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:53
 *
 * @model auto gen
 */
public class ProjectBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.project.dao.Project objProject;

    static {
        mappedDaoFields.put("id", com.ourteam.project.dao.IProjectDAO.Id);

        mappedDaoFields.put("description",
            com.ourteam.project.dao.IProjectDAO.Description);

        mappedDaoFields.put("name", com.ourteam.project.dao.IProjectDAO.Name);

        mappedDaoFields.put("status", com.ourteam.project.dao.IProjectDAO.Status);
    } 

    /**
     * Creates a new ProjectBean object.
     */
    public ProjectBean() {
        super();

        objProject = new com.ourteam.project.dao.Project();
    } // end ProjectBean()

    /**
     * Creates a new ProjectBean object.
     *
     * @param aProject DOCUMENT ME!
     */
    public ProjectBean(com.ourteam.project.dao.Project aProject) {
        super();

        objProject = aProject;
    } // end ProjectBean()

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
    public com.ourteam.project.dao.Project convertToProject() {
        return objProject;
    } // end convertToProject()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objProject.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objProject.setId(aId);
    } // end setId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objProject.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objProject.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objProject.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objProject.setName(aName);
    } // end setName()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objProject.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objProject.setStatus(aStatus);
    } // end setStatus()

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

        if ((obj instanceof ProjectBean) == false) {
            return false;
        } // end if

        ProjectBean other = (ProjectBean) obj;

        boolean isEqual = false;

        com.ourteam.project.dao.Project tempProject = other.convertToProject();

        if ((tempProject == null) || (this.objProject == null)) {
            isEqual = false;
        } // end if
        else if ((tempProject == this.objProject) ||
                tempProject.equals(this.objProject)) {
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
     * @param aProjects DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProjectBean[] toArray(
        com.ourteam.project.dao.Project[] aProjects) {
        return toArray(aProjects, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aProjects DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ProjectBean[] toArray(
        com.ourteam.project.dao.Project[] aProjects,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aProjects)) {
            return new ProjectBean[0];
        } // end if

        int length = aProjects.length;

        ProjectBean[] beans = new ProjectBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProjectBean(aProjects[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ProjectBean(aProjects[i]);

                aCallBack.populate(beans[i], new Object[] { aProjects[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ProjectBean
