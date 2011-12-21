/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 服务参数类型枚举 Generate date 2011-09-22 10:22:36
 *
 * @author kylin
 *
 * @model
 */
public class ServiceParameterTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new ServiceParameterTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected ServiceParameterTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end ServiceParameterTypeEnum()

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
    public static ServiceParameterTypeEnum getEnum(String arg0) {
        return (ServiceParameterTypeEnum) enumValueMap.get(arg0);
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
     * 输出
     *
     * @model name="OUT"
     */
    public static final ServiceParameterTypeEnum OUT = new ServiceParameterTypeEnum("OUT",
            "输出");

    /**
     * 输入
     *
     * @model name="IN"
     */
    public static final ServiceParameterTypeEnum IN = new ServiceParameterTypeEnum("IN",
            "输入");
} // end ServiceParameterTypeEnum
