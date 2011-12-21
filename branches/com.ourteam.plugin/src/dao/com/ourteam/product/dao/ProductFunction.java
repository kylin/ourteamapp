/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

/**
 * Generate Date 2011-10-10 16:06:17
 *
 * @author Auto Gen
 */
public class ProductFunction implements java.io.Serializable {
    /**
     * Creates a new ProductFunction object.
     */
    public ProductFunction() {
        super();
    } // end ProductFunction()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String functionCode;

    /** Attribute  Be Seted Falg */
    private boolean functionCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean functionCodeNull = false;

    /** Attribute */
    private String functionName;

    /** Attribute  Be Seted Falg */
    private boolean functionNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean functionNameNull = false;

    /** Attribute */
    private long parentFunctionId;

    /** Attribute  Be Seted Falg */
    private boolean parentFunctionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentFunctionIdNull = false;

    /** Attribute */
    private long productDefineId;

    /** Attribute  Be Seted Falg */
    private boolean productDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productDefineIdNull = false;

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
    private int canTest;

    /** Attribute  Be Seted Falg */
    private boolean canTestSetted = false;

    /** Attribute  is Null Falg */
    private boolean canTestNull = false;

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
     * Get FunctionCode
     *
     * @return functionCode
     */
    final public String getFunctionCode() {
        return functionCode;
    } // end getFunctionCode()

    /**
     * Set FunctionCode
     *
     * @param aFunctionCode
     */
    final public void setFunctionCode(String aFunctionCode) {
        this.functionCode = aFunctionCode;

        this.functionCodeSetted = true;

        this.setFunctionCodeNull(this.functionCode == null);
    } // end setFunctionCode()

    /**
     * Get FunctionCode Has Been Setted
     *
     * @return functionCode
     */
    final public boolean isFunctionCodeSetted() {
        return this.functionCodeSetted;
    } // end isFunctionCodeSetted()

    /**
     * Set FunctionCode Null
     */
    final public void setFunctionCodeNull() {
        this.functionCodeNull = true;
    } // end setFunctionCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFunctionCodeNull(boolean aNullFlag) {
        this.functionCodeNull = aNullFlag;
    } // end setFunctionCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFunctionCodeNull() {
        return this.functionCodeNull;
    } // end isFunctionCodeNull()

    /**
     * Get FunctionName
     *
     * @return functionName
     */
    final public String getFunctionName() {
        return functionName;
    } // end getFunctionName()

    /**
     * Set FunctionName
     *
     * @param aFunctionName
     */
    final public void setFunctionName(String aFunctionName) {
        this.functionName = aFunctionName;

        this.functionNameSetted = true;

        this.setFunctionNameNull(this.functionName == null);
    } // end setFunctionName()

    /**
     * Get FunctionName Has Been Setted
     *
     * @return functionName
     */
    final public boolean isFunctionNameSetted() {
        return this.functionNameSetted;
    } // end isFunctionNameSetted()

    /**
     * Set FunctionName Null
     */
    final public void setFunctionNameNull() {
        this.functionNameNull = true;
    } // end setFunctionNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFunctionNameNull(boolean aNullFlag) {
        this.functionNameNull = aNullFlag;
    } // end setFunctionNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFunctionNameNull() {
        return this.functionNameNull;
    } // end isFunctionNameNull()

    /**
     * Get ParentFunctionId
     *
     * @return parentFunctionId
     */
    final public long getParentFunctionId() {
        return parentFunctionId;
    } // end getParentFunctionId()

    /**
     * Set ParentFunctionId
     *
     * @param aParentFunctionId
     */
    final public void setParentFunctionId(long aParentFunctionId) {
        this.parentFunctionId = aParentFunctionId;

        this.parentFunctionIdSetted = true;

        this.setParentFunctionIdNull(false);
    } // end setParentFunctionId()

    /**
     * Get ParentFunctionId Has Been Setted
     *
     * @return parentFunctionId
     */
    final public boolean isParentFunctionIdSetted() {
        return this.parentFunctionIdSetted;
    } // end isParentFunctionIdSetted()

    /**
     * Set ParentFunctionId Null
     */
    final public void setParentFunctionIdNull() {
        this.parentFunctionIdNull = true;
    } // end setParentFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentFunctionIdNull(boolean aNullFlag) {
        this.parentFunctionIdNull = aNullFlag;
    } // end setParentFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentFunctionIdNull() {
        return this.parentFunctionIdNull;
    } // end isParentFunctionIdNull()

    /**
     * Get ProductDefineId
     *
     * @return productDefineId
     */
    final public long getProductDefineId() {
        return productDefineId;
    } // end getProductDefineId()

    /**
     * Set ProductDefineId
     *
     * @param aProductDefineId
     */
    final public void setProductDefineId(long aProductDefineId) {
        this.productDefineId = aProductDefineId;

        this.productDefineIdSetted = true;

        this.setProductDefineIdNull(false);
    } // end setProductDefineId()

    /**
     * Get ProductDefineId Has Been Setted
     *
     * @return productDefineId
     */
    final public boolean isProductDefineIdSetted() {
        return this.productDefineIdSetted;
    } // end isProductDefineIdSetted()

    /**
     * Set ProductDefineId Null
     */
    final public void setProductDefineIdNull() {
        this.productDefineIdNull = true;
    } // end setProductDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductDefineIdNull(boolean aNullFlag) {
        this.productDefineIdNull = aNullFlag;
    } // end setProductDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductDefineIdNull() {
        return this.productDefineIdNull;
    } // end isProductDefineIdNull()

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
     * Get CanTest
     *
     * @return canTest
     */
    final public int getCanTest() {
        return canTest;
    } // end getCanTest()

    /**
     * Set CanTest
     *
     * @param aCanTest
     */
    final public void setCanTest(int aCanTest) {
        this.canTest = aCanTest;

        this.canTestSetted = true;

        this.setCanTestNull(false);
    } // end setCanTest()

    /**
     * Get CanTest Has Been Setted
     *
     * @return canTest
     */
    final public boolean isCanTestSetted() {
        return this.canTestSetted;
    } // end isCanTestSetted()

    /**
     * Set CanTest Null
     */
    final public void setCanTestNull() {
        this.canTestNull = true;
    } // end setCanTestNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCanTestNull(boolean aNullFlag) {
        this.canTestNull = aNullFlag;
    } // end setCanTestNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCanTestNull() {
        return this.canTestNull;
    } // end isCanTestNull()

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

        if ((obj instanceof ProductFunction) == false) {
            return false;
        } // end if

        ProductFunction other = (ProductFunction) obj;

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

        buffer.append("functionCode=");
        buffer.append(this.functionCode);
        buffer.append("\r\n");

        buffer.append("functionName=");
        buffer.append(this.functionName);
        buffer.append("\r\n");

        buffer.append("parentFunctionId=");
        buffer.append(this.parentFunctionId);
        buffer.append("\r\n");

        buffer.append("productDefineId=");
        buffer.append(this.productDefineId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("canTest=");
        buffer.append(this.canTest);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ProductFunction
