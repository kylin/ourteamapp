/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

/**
 * Generate Date 2011-10-12 16:26:30
 *
 * @author Auto Gen
 */
public class ProductGlossary implements java.io.Serializable {
    /**
     * Creates a new ProductGlossary object.
     */
    public ProductGlossary() {
        super();
    } // end ProductGlossary()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String code;

    /** Attribute  Be Seted Falg */
    private boolean codeSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeNull = false;

    /** Attribute */
    private String content;

    /** Attribute  Be Seted Falg */
    private boolean contentSetted = false;

    /** Attribute  is Null Falg */
    private boolean contentNull = false;

    /** Attribute */
    private java.util.Date createDate;

    /** Attribute  Be Seted Falg */
    private boolean createDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean createDateNull = false;

    /** Attribute */
    private long creatorId;

    /** Attribute  Be Seted Falg */
    private boolean creatorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean creatorIdNull = false;

    /** Attribute */
    private long lastEditorId;

    /** Attribute  Be Seted Falg */
    private boolean lastEditorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditorIdNull = false;

    /** Attribute */
    private java.util.Date lastEditDate;

    /** Attribute  Be Seted Falg */
    private boolean lastEditDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditDateNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private long productId;

    /** Attribute  Be Seted Falg */
    private boolean productIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String lastEditorName;

    /** Attribute  Be Seted Falg */
    private boolean lastEditorNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditorNameNull = false;

    /** Attribute */
    private long sinceVersionId;

    /** Attribute  Be Seted Falg */
    private boolean sinceVersionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sinceVersionIdNull = false;

    /** Attribute */
    private String sinceVersion;

    /** Attribute  Be Seted Falg */
    private boolean sinceVersionSetted = false;

    /** Attribute  is Null Falg */
    private boolean sinceVersionNull = false;

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
     * Get Code
     *
     * @return code
     */
    final public String getCode() {
        return code;
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    final public void setCode(String aCode) {
        this.code = aCode;

        this.codeSetted = true;

        this.setCodeNull(this.code == null);
    } // end setCode()

    /**
     * Get Code Has Been Setted
     *
     * @return code
     */
    final public boolean isCodeSetted() {
        return this.codeSetted;
    } // end isCodeSetted()

    /**
     * Set Code Null
     */
    final public void setCodeNull() {
        this.codeNull = true;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCodeNull(boolean aNullFlag) {
        this.codeNull = aNullFlag;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCodeNull() {
        return this.codeNull;
    } // end isCodeNull()

    /**
     * Get Content
     *
     * @return content
     */
    final public String getContent() {
        if (isContentNull()) {
            return null;
        } // end if
        else {
            return content;
        } // end else
    } // end getContent()

    /**
     * Set Content
     *
     * @param aContent
     */
    final public void setContent(String aContent) {
        this.content = aContent;

        this.contentSetted = true;

        this.setContentNull(this.content == null);
    } // end setContent()

    /**
     * Get Content Has Been Setted
     *
     * @return content
     */
    final public boolean isContentSetted() {
        return this.contentSetted;
    } // end isContentSetted()

    /**
     * Set Content Null
     */
    final public void setContentNull() {
        this.contentNull = true;
    } // end setContentNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setContentNull(boolean aNullFlag) {
        this.contentNull = aNullFlag;
    } // end setContentNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isContentNull() {
        return this.contentNull;
    } // end isContentNull()

    /**
     * Get CreateDate
     *
     * @return createDate
     */
    final public java.util.Date getCreateDate() {
        return createDate;
    } // end getCreateDate()

    /**
     * Set CreateDate
     *
     * @param aCreateDate
     */
    final public void setCreateDate(java.util.Date aCreateDate) {
        this.createDate = aCreateDate;

        this.createDateSetted = true;

        this.setCreateDateNull(this.createDate == null);
    } // end setCreateDate()

    /**
     * Get CreateDate Has Been Setted
     *
     * @return createDate
     */
    final public boolean isCreateDateSetted() {
        return this.createDateSetted;
    } // end isCreateDateSetted()

    /**
     * Set CreateDate Null
     */
    final public void setCreateDateNull() {
        this.createDateNull = true;
    } // end setCreateDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCreateDateNull(boolean aNullFlag) {
        this.createDateNull = aNullFlag;
    } // end setCreateDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCreateDateNull() {
        return this.createDateNull;
    } // end isCreateDateNull()

    /**
     * Get CreatorId
     *
     * @return creatorId
     */
    final public long getCreatorId() {
        return creatorId;
    } // end getCreatorId()

    /**
     * Set CreatorId
     *
     * @param aCreatorId
     */
    final public void setCreatorId(long aCreatorId) {
        this.creatorId = aCreatorId;

        this.creatorIdSetted = true;

        this.setCreatorIdNull(false);
    } // end setCreatorId()

    /**
     * Get CreatorId Has Been Setted
     *
     * @return creatorId
     */
    final public boolean isCreatorIdSetted() {
        return this.creatorIdSetted;
    } // end isCreatorIdSetted()

    /**
     * Set CreatorId Null
     */
    final public void setCreatorIdNull() {
        this.creatorIdNull = true;
    } // end setCreatorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCreatorIdNull(boolean aNullFlag) {
        this.creatorIdNull = aNullFlag;
    } // end setCreatorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCreatorIdNull() {
        return this.creatorIdNull;
    } // end isCreatorIdNull()

    /**
     * Get LastEditorId
     *
     * @return lastEditorId
     */
    final public long getLastEditorId() {
        return lastEditorId;
    } // end getLastEditorId()

    /**
     * Set LastEditorId
     *
     * @param aLastEditorId
     */
    final public void setLastEditorId(long aLastEditorId) {
        this.lastEditorId = aLastEditorId;

        this.lastEditorIdSetted = true;

        this.setLastEditorIdNull(false);
    } // end setLastEditorId()

    /**
     * Get LastEditorId Has Been Setted
     *
     * @return lastEditorId
     */
    final public boolean isLastEditorIdSetted() {
        return this.lastEditorIdSetted;
    } // end isLastEditorIdSetted()

    /**
     * Set LastEditorId Null
     */
    final public void setLastEditorIdNull() {
        this.lastEditorIdNull = true;
    } // end setLastEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditorIdNull(boolean aNullFlag) {
        this.lastEditorIdNull = aNullFlag;
    } // end setLastEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditorIdNull() {
        return this.lastEditorIdNull;
    } // end isLastEditorIdNull()

    /**
     * Get LastEditDate
     *
     * @return lastEditDate
     */
    final public java.util.Date getLastEditDate() {
        return lastEditDate;
    } // end getLastEditDate()

    /**
     * Set LastEditDate
     *
     * @param aLastEditDate
     */
    final public void setLastEditDate(java.util.Date aLastEditDate) {
        this.lastEditDate = aLastEditDate;

        this.lastEditDateSetted = true;

        this.setLastEditDateNull(this.lastEditDate == null);
    } // end setLastEditDate()

    /**
     * Get LastEditDate Has Been Setted
     *
     * @return lastEditDate
     */
    final public boolean isLastEditDateSetted() {
        return this.lastEditDateSetted;
    } // end isLastEditDateSetted()

    /**
     * Set LastEditDate Null
     */
    final public void setLastEditDateNull() {
        this.lastEditDateNull = true;
    } // end setLastEditDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditDateNull(boolean aNullFlag) {
        this.lastEditDateNull = aNullFlag;
    } // end setLastEditDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditDateNull() {
        return this.lastEditDateNull;
    } // end isLastEditDateNull()

    /**
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

    /**
     * Get ProductId
     *
     * @return productId
     */
    final public long getProductId() {
        return productId;
    } // end getProductId()

    /**
     * Set ProductId
     *
     * @param aProductId
     */
    final public void setProductId(long aProductId) {
        this.productId = aProductId;

        this.productIdSetted = true;

        this.setProductIdNull(false);
    } // end setProductId()

    /**
     * Get ProductId Has Been Setted
     *
     * @return productId
     */
    final public boolean isProductIdSetted() {
        return this.productIdSetted;
    } // end isProductIdSetted()

    /**
     * Set ProductId Null
     */
    final public void setProductIdNull() {
        this.productIdNull = true;
    } // end setProductIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductIdNull(boolean aNullFlag) {
        this.productIdNull = aNullFlag;
    } // end setProductIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductIdNull() {
        return this.productIdNull;
    } // end isProductIdNull()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    final public String getRemarks() {
        if (isRemarksNull()) {
            return null;
        } // end if
        else {
            return remarks;
        } // end else
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    final public void setRemarks(String aRemarks) {
        this.remarks = aRemarks;

        this.remarksSetted = true;

        this.setRemarksNull(this.remarks == null);
    } // end setRemarks()

    /**
     * Get Remarks Has Been Setted
     *
     * @return remarks
     */
    final public boolean isRemarksSetted() {
        return this.remarksSetted;
    } // end isRemarksSetted()

    /**
     * Set Remarks Null
     */
    final public void setRemarksNull() {
        this.remarksNull = true;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRemarksNull(boolean aNullFlag) {
        this.remarksNull = aNullFlag;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRemarksNull() {
        return this.remarksNull;
    } // end isRemarksNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * Get LastEditorName
     *
     * @return lastEditorName
     */
    final public String getLastEditorName() {
        return lastEditorName;
    } // end getLastEditorName()

    /**
     * Set LastEditorName
     *
     * @param aLastEditorName
     */
    final public void setLastEditorName(String aLastEditorName) {
        this.lastEditorName = aLastEditorName;

        this.lastEditorNameSetted = true;

        this.setLastEditorNameNull(this.lastEditorName == null);
    } // end setLastEditorName()

    /**
     * Get LastEditorName Has Been Setted
     *
     * @return lastEditorName
     */
    final public boolean isLastEditorNameSetted() {
        return this.lastEditorNameSetted;
    } // end isLastEditorNameSetted()

    /**
     * Set LastEditorName Null
     */
    final public void setLastEditorNameNull() {
        this.lastEditorNameNull = true;
    } // end setLastEditorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditorNameNull(boolean aNullFlag) {
        this.lastEditorNameNull = aNullFlag;
    } // end setLastEditorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditorNameNull() {
        return this.lastEditorNameNull;
    } // end isLastEditorNameNull()

    /**
     * Get SinceVersionId
     *
     * @return sinceVersionId
     */
    final public long getSinceVersionId() {
        return sinceVersionId;
    } // end getSinceVersionId()

    /**
     * Set SinceVersionId
     *
     * @param aSinceVersionId
     */
    final public void setSinceVersionId(long aSinceVersionId) {
        this.sinceVersionId = aSinceVersionId;

        this.sinceVersionIdSetted = true;

        this.setSinceVersionIdNull(false);
    } // end setSinceVersionId()

    /**
     * Get SinceVersionId Has Been Setted
     *
     * @return sinceVersionId
     */
    final public boolean isSinceVersionIdSetted() {
        return this.sinceVersionIdSetted;
    } // end isSinceVersionIdSetted()

    /**
     * Set SinceVersionId Null
     */
    final public void setSinceVersionIdNull() {
        this.sinceVersionIdNull = true;
    } // end setSinceVersionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSinceVersionIdNull(boolean aNullFlag) {
        this.sinceVersionIdNull = aNullFlag;
    } // end setSinceVersionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSinceVersionIdNull() {
        return this.sinceVersionIdNull;
    } // end isSinceVersionIdNull()

    /**
     * Get SinceVersion
     *
     * @return sinceVersion
     */
    final public String getSinceVersion() {
        return sinceVersion;
    } // end getSinceVersion()

    /**
     * Set SinceVersion
     *
     * @param aSinceVersion
     */
    final public void setSinceVersion(String aSinceVersion) {
        this.sinceVersion = aSinceVersion;

        this.sinceVersionSetted = true;

        this.setSinceVersionNull(this.sinceVersion == null);
    } // end setSinceVersion()

    /**
     * Get SinceVersion Has Been Setted
     *
     * @return sinceVersion
     */
    final public boolean isSinceVersionSetted() {
        return this.sinceVersionSetted;
    } // end isSinceVersionSetted()

    /**
     * Set SinceVersion Null
     */
    final public void setSinceVersionNull() {
        this.sinceVersionNull = true;
    } // end setSinceVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSinceVersionNull(boolean aNullFlag) {
        this.sinceVersionNull = aNullFlag;
    } // end setSinceVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSinceVersionNull() {
        return this.sinceVersionNull;
    } // end isSinceVersionNull()

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

        if ((obj instanceof ProductGlossary) == false) {
            return false;
        } // end if

        ProductGlossary other = (ProductGlossary) obj;

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

        buffer.append("code=");
        buffer.append(this.code);
        buffer.append("\r\n");

        buffer.append("content=");
        buffer.append(this.content);
        buffer.append("\r\n");

        buffer.append("createDate=");
        buffer.append(this.createDate);
        buffer.append("\r\n");

        buffer.append("creatorId=");
        buffer.append(this.creatorId);
        buffer.append("\r\n");

        buffer.append("lastEditorId=");
        buffer.append(this.lastEditorId);
        buffer.append("\r\n");

        buffer.append("lastEditDate=");
        buffer.append(this.lastEditDate);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("productId=");
        buffer.append(this.productId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("lastEditorName=");
        buffer.append(this.lastEditorName);
        buffer.append("\r\n");

        buffer.append("sinceVersionId=");
        buffer.append(this.sinceVersionId);
        buffer.append("\r\n");

        buffer.append("sinceVersion=");
        buffer.append(this.sinceVersion);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ProductGlossary
