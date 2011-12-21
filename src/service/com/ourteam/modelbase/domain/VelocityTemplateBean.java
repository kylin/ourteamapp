/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:36
 *
 * @model auto gen
 */
public class VelocityTemplateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.VelocityTemplate objVelocityTemplate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.modelbase.dao.IVelocityTemplateDAO.Id);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IVelocityTemplateDAO.Description);

        mappedDaoFields.put("templateContent",
            com.ourteam.modelbase.dao.IVelocityTemplateDAO.TemplateContent);

        mappedDaoFields.put("templateName",
            com.ourteam.modelbase.dao.IVelocityTemplateDAO.TemplateName);

        mappedDaoFields.put("templateTimestamp",
            com.ourteam.modelbase.dao.IVelocityTemplateDAO.TemplateTimestamp);
    } 

    /**
     * Creates a new VelocityTemplateBean object.
     */
    public VelocityTemplateBean() {
        super();

        objVelocityTemplate = new com.ourteam.modelbase.dao.VelocityTemplate();
    } // end VelocityTemplateBean()

    /**
     * Creates a new VelocityTemplateBean object.
     *
     * @param aVelocityTemplate DOCUMENT ME!
     */
    public VelocityTemplateBean(
        com.ourteam.modelbase.dao.VelocityTemplate aVelocityTemplate) {
        super();

        objVelocityTemplate = aVelocityTemplate;
    } // end VelocityTemplateBean()

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
    public com.ourteam.modelbase.dao.VelocityTemplate convertToVelocityTemplate() {
        return objVelocityTemplate;
    } // end convertToVelocityTemplate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objVelocityTemplate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objVelocityTemplate.setId(aId);
    } // end setId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objVelocityTemplate.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objVelocityTemplate.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get TemplateContent
     *
     * @return templateContent
     */
    public String getTemplateContent() {
        return objVelocityTemplate.getTemplateContent();
    } // end getTemplateContent()

    /**
     * Set TemplateContent
     *
     * @param aTemplateContent
     */
    public void setTemplateContent(String aTemplateContent) {
        this.objVelocityTemplate.setTemplateContent(aTemplateContent);
    } // end setTemplateContent()

    /**
     * Get TemplateName
     *
     * @return templateName
     */
    public String getTemplateName() {
        return objVelocityTemplate.getTemplateName();
    } // end getTemplateName()

    /**
     * Set TemplateName
     *
     * @param aTemplateName
     */
    public void setTemplateName(String aTemplateName) {
        this.objVelocityTemplate.setTemplateName(aTemplateName);
    } // end setTemplateName()

    /**
     * Get TemplateTimestamp
     *
     * @return templateTimestamp
     */
    public java.util.Date getTemplateTimestamp() {
        return objVelocityTemplate.getTemplateTimestamp();
    } // end getTemplateTimestamp()

    /**
     * Set TemplateTimestamp
     *
     * @param aTemplateTimestamp
     */
    public void setTemplateTimestamp(java.util.Date aTemplateTimestamp) {
        this.objVelocityTemplate.setTemplateTimestamp(aTemplateTimestamp);
    } // end setTemplateTimestamp()

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

        if ((obj instanceof VelocityTemplateBean) == false) {
            return false;
        } // end if

        VelocityTemplateBean other = (VelocityTemplateBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.VelocityTemplate tempVelocityTemplate = other.convertToVelocityTemplate();

        if ((tempVelocityTemplate == null) ||
                (this.objVelocityTemplate == null)) {
            isEqual = false;
        } // end if
        else if ((tempVelocityTemplate == this.objVelocityTemplate) ||
                tempVelocityTemplate.equals(this.objVelocityTemplate)) {
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
     * @param aVelocityTemplates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static VelocityTemplateBean[] toArray(
        com.ourteam.modelbase.dao.VelocityTemplate[] aVelocityTemplates) {
        return toArray(aVelocityTemplates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aVelocityTemplates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static VelocityTemplateBean[] toArray(
        com.ourteam.modelbase.dao.VelocityTemplate[] aVelocityTemplates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aVelocityTemplates)) {
            return new VelocityTemplateBean[0];
        } // end if

        int length = aVelocityTemplates.length;

        VelocityTemplateBean[] beans = new VelocityTemplateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new VelocityTemplateBean(aVelocityTemplates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new VelocityTemplateBean(aVelocityTemplates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aVelocityTemplates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end VelocityTemplateBean
