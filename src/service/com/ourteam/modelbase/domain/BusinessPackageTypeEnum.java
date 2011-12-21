/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 模型包类型 Generate date 2011-09-22 10:22:33
 *
 * @author kylin
 *
 * @model
 */
public class BusinessPackageTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new BusinessPackageTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected BusinessPackageTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end BusinessPackageTypeEnum()

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
    public static BusinessPackageTypeEnum getEnum(String arg0) {
        return (BusinessPackageTypeEnum) enumValueMap.get(arg0);
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
     * 数据持久层包
     *
     * @model name="PERSISTENT_PACKAGE"
     */
    public static final BusinessPackageTypeEnum PERSISTENT_PACKAGE = new BusinessPackageTypeEnum("PERSISTENT_PACKAGE",
            "数据持久层包");

    /**
     * 业务对象包
     *
     * @model name="BUSINESS_PACKAGE"
     */
    public static final BusinessPackageTypeEnum BUSINESS_PACKAGE = new BusinessPackageTypeEnum("BUSINESS_PACKAGE",
            "业务对象包");

    /**
     * 服务对象包
     *
     * @model name="SERVICE_PACKAGE"
     */
    public static final BusinessPackageTypeEnum SERVICE_PACKAGE = new BusinessPackageTypeEnum("SERVICE_PACKAGE",
            "服务对象包");
} // end BusinessPackageTypeEnum
