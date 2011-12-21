/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 业务对象类型枚举 Generate date 2011-09-22 10:22:33
 *
 * @author kylin
 *
 * @model
 */
public class BusinessObjectTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new BusinessObjectTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected BusinessObjectTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end BusinessObjectTypeEnum()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getDesc() {
        return desc;
    } // end getDesc()

    /**
     * DOCUMENT ME!
     */
    private static Map enumValueMap = new HashMap();

    /**
     * DOCUMENT ME!
     *
     * @param arg0 DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessObjectTypeEnum getEnum(String arg0) {
        return (BusinessObjectTypeEnum) enumValueMap.get(arg0);
    } // end getEnum()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static Collection getEnumList() {
        return enumValueMap.values();
    } // end getEnumList()

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="DAO"
     */
    public static final BusinessObjectTypeEnum DAO = new BusinessObjectTypeEnum("DAO",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="PERSISTENT"
     */
    public static final BusinessObjectTypeEnum PERSISTENT = new BusinessObjectTypeEnum("PERSISTENT",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="SERVICE"
     */
    public static final BusinessObjectTypeEnum SERVICE = new BusinessObjectTypeEnum("SERVICE",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="ENUM"
     */
    public static final BusinessObjectTypeEnum ENUM = new BusinessObjectTypeEnum("ENUM",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="JAVA_CLASS"
     */
    public static final BusinessObjectTypeEnum JAVA_CLASS = new BusinessObjectTypeEnum("JAVA_CLASS",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="CUSTOM_DATA_TYPE"
     */
    public static final BusinessObjectTypeEnum CUSTOM_DATA_TYPE = new BusinessObjectTypeEnum("CUSTOM_DATA_TYPE",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="DAO_QUERY_BEAN"
     */
    public static final BusinessObjectTypeEnum DAO_QUERY_BEAN = new BusinessObjectTypeEnum("DAO_QUERY_BEAN",
            "");
} // end BusinessObjectTypeEnum
