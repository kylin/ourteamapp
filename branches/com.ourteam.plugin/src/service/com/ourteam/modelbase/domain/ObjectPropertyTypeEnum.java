/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 对象属性类型枚举 Generate date 2011-09-22 10:22:34
 *
 * @author kylin
 *
 * @model
 */
public class ObjectPropertyTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new ObjectPropertyTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected ObjectPropertyTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end ObjectPropertyTypeEnum()

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
    public static ObjectPropertyTypeEnum getEnum(String arg0) {
        return (ObjectPropertyTypeEnum) enumValueMap.get(arg0);
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
     * 数据持久对象属性
     *
     * @model name="PERSISTENT_PROPERTY"
     */
    public static final ObjectPropertyTypeEnum PERSISTENT_PROPERTY = new ObjectPropertyTypeEnum("PERSISTENT_PROPERTY",
            "数据持久对象属性");

    /**
     * 业务对象属性
     *
     * @model name="BUSINESS_PROPERTY"
     */
    public static final ObjectPropertyTypeEnum BUSINESS_PROPERTY = new ObjectPropertyTypeEnum("BUSINESS_PROPERTY",
            "业务对象属性");

    /**
     * 枚举对象属性
     *
     * @model name="ENUM_PROPERTY"
     */
    public static final ObjectPropertyTypeEnum ENUM_PROPERTY = new ObjectPropertyTypeEnum("ENUM_PROPERTY",
            "枚举对象属性");

    /**
     * JAVA对象属性
     *
     * @model name="BEAN_PROPERTY"
     */
    public static final ObjectPropertyTypeEnum BEAN_PROPERTY = new ObjectPropertyTypeEnum("BEAN_PROPERTY",
            "JAVA对象属性");
} // end ObjectPropertyTypeEnum
