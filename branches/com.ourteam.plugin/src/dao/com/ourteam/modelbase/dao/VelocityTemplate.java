/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * Generate Date 2011-09-22 10:16:52
 *
 * @author Auto Gen
 */
public class VelocityTemplate implements java.io.Serializable {
    /**
     * Creates a new VelocityTemplate object.
     */
    public VelocityTemplate() {
        super();
    } // end VelocityTemplate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private String templateContent;

    /** Attribute  Be Seted Falg */
    private boolean templateContentSetted = false;

    /** Attribute  is Null Falg */
    private boolean templateContentNull = false;

    /** Attribute */
    private String templateName;

    /** Attribute  Be Seted Falg */
    private boolean templateNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean templateNameNull = false;

    /** Attribute */
    private java.util.Date templateTimestamp;

    /** Attribute  Be Seted Falg */
    private boolean templateTimestampSetted = false;

    /** Attribute  is Null Falg */
    private boolean templateTimestampNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        if (isDescriptionNull()) {
            return null;
        } // end if
        else {
            return description;
        } // end else
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    final public void setDescription(String aDescription) {
        this.description = aDescription;

        this.descriptionSetted = true;

        this.setDescriptionNull(this.description == null);
    } // end setDescription()

    /**
     * Get Description Has Been Setted
     *
     * @return description
     */
    final public boolean isDescriptionSetted() {
        return this.descriptionSetted;
    } // end isDescriptionSetted()

    /**
     * Set Description Null
     */
    final public void setDescriptionNull() {
        this.descriptionNull = true;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDescriptionNull(boolean aNullFlag) {
        this.descriptionNull = aNullFlag;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDescriptionNull() {
        return this.descriptionNull;
    } // end isDescriptionNull()

    /**
     * Get TemplateContent
     *
     * @return templateContent
     */
    final public String getTemplateContent() {
        if (isTemplateContentNull()) {
            return null;
        } // end if
        else {
            return templateContent;
        } // end else
    } // end getTemplateContent()

    /**
     * Set TemplateContent
     *
     * @param aTemplateContent
     */
    final public void setTemplateContent(String aTemplateContent) {
        this.templateContent = aTemplateContent;

        this.templateContentSetted = true;

        this.setTemplateContentNull(this.templateContent == null);
    } // end setTemplateContent()

    /**
     * Get TemplateContent Has Been Setted
     *
     * @return templateContent
     */
    final public boolean isTemplateContentSetted() {
        return this.templateContentSetted;
    } // end isTemplateContentSetted()

    /**
     * Set TemplateContent Null
     */
    final public void setTemplateContentNull() {
        this.templateContentNull = true;
    } // end setTemplateContentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTemplateContentNull(boolean aNullFlag) {
        this.templateContentNull = aNullFlag;
    } // end setTemplateContentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTemplateContentNull() {
        return this.templateContentNull;
    } // end isTemplateContentNull()

    /**
     * Get TemplateName
     *
     * @return templateName
     */
    final public String getTemplateName() {
        return templateName;
    } // end getTemplateName()

    /**
     * Set TemplateName
     *
     * @param aTemplateName
     */
    final public void setTemplateName(String aTemplateName) {
        this.templateName = aTemplateName;

        this.templateNameSetted = true;

        this.setTemplateNameNull(this.templateName == null);
    } // end setTemplateName()

    /**
     * Get TemplateName Has Been Setted
     *
     * @return templateName
     */
    final public boolean isTemplateNameSetted() {
        return this.templateNameSetted;
    } // end isTemplateNameSetted()

    /**
     * Set TemplateName Null
     */
    final public void setTemplateNameNull() {
        this.templateNameNull = true;
    } // end setTemplateNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTemplateNameNull(boolean aNullFlag) {
        this.templateNameNull = aNullFlag;
    } // end setTemplateNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTemplateNameNull() {
        return this.templateNameNull;
    } // end isTemplateNameNull()

    /**
     * Get TemplateTimestamp
     *
     * @return templateTimestamp
     */
    final public java.util.Date getTemplateTimestamp() {
        return templateTimestamp;
    } // end getTemplateTimestamp()

    /**
     * Set TemplateTimestamp
     *
     * @param aTemplateTimestamp
     */
    final public void setTemplateTimestamp(java.util.Date aTemplateTimestamp) {
        this.templateTimestamp = aTemplateTimestamp;

        this.templateTimestampSetted = true;

        this.setTemplateTimestampNull(this.templateTimestamp == null);
    } // end setTemplateTimestamp()

    /**
     * Get TemplateTimestamp Has Been Setted
     *
     * @return templateTimestamp
     */
    final public boolean isTemplateTimestampSetted() {
        return this.templateTimestampSetted;
    } // end isTemplateTimestampSetted()

    /**
     * Set TemplateTimestamp Null
     */
    final public void setTemplateTimestampNull() {
        this.templateTimestampNull = true;
    } // end setTemplateTimestampNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTemplateTimestampNull(boolean aNullFlag) {
        this.templateTimestampNull = aNullFlag;
    } // end setTemplateTimestampNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTemplateTimestampNull() {
        return this.templateTimestampNull;
    } // end isTemplateTimestampNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

        return result;
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

        if ((obj instanceof VelocityTemplate) == false) {
            return false;
        } // end if

        VelocityTemplate other = (VelocityTemplate) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("templateContent=");
        buffer.append(this.templateContent);
        buffer.append("\r\n");

        buffer.append("templateName=");
        buffer.append(this.templateName);
        buffer.append("\r\n");

        buffer.append("templateTimestamp=");
        buffer.append(this.templateTimestamp);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end VelocityTemplate
